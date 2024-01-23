import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub5_Sub18 extends Class1_Sub5 {

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	private int anInt4261;

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
	private int anInt4263 = -1;

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
	private int anInt4264 = 0;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
	private int anInt4262 = 0;

	@OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
	private int anInt4260 = -1;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub18() {
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIII)V")
	public Class1_Sub5_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray477 = new int[6];
		this.anIntArray477[0] = arg0;
		this.anIntArray477[1] = arg1;
		this.anIntArray477[2] = arg2;
		this.anIntArray477[3] = arg3;
		this.anIntArray477[4] = arg4;
		this.anIntArray477[5] = arg5;
	}

	@OriginalMember(owner = "client!qh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4263 != -1) {
			Static162.method2800(this.anInt4263, this.anInt4264, this.anInt4261);
			this.anInt4263 = -1;
			this.anInt4264 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
	public void method3648() {
		@Pc(1) GL local1 = Static71.aGL1;
		this.method3651();
		local1.glBindTexture(34067, this.anInt4263);
		if (this.anIntArray477 == null || this.anInt4262 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method3652()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray477[local22];
				this.anInt4260 = Static119.anInterface5_1.method1475(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt4260;
				} else if (this.anInt4260 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static119.anInterface5_1.method1481(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static162.anInt3246 += local22 - this.anInt4264;
			this.anInt4264 = local22;
			this.anInt4262 = 2;
		} else if (this.anInt4262 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static119.anIntArray174, Static119.anInterface5_1.method1486(this.anIntArray477[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static162.anInt3246 += 3 - this.anInt4264;
				this.anInt4264 = 3;
			}
			this.anInt4262 = 1;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!qh;Lclient!qh;F)Lclient!qh;")
	public Class1_Sub5_Sub18 method3650(@OriginalArg(0) Class1_Sub5_Sub18 arg0, @OriginalArg(1) Class1_Sub5_Sub18 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static71.aGL1;
		@Pc(10) Class1_Sub5_Sub18 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static71.aBoolean166) {
			return local10;
		}
		this.method3651();
		@Pc(31) int local31;
		if (Static227.anIntArray479 == null || Static227.anInt4265 != Static162.anInt3245) {
			Static227.anIntArray479 = new int[2];
			local1.glGenTextures(2, Static227.anIntArray479, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static71.method1400(Static227.anIntArray479[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static227.anInt4265 = Static162.anInt3245;
		}
		local31 = arg0.anInt4260 > arg1.anInt4260 ? arg0.anInt4260 : arg1.anInt4260;
		if (this.anInt4260 != local31) {
			this.anInt4260 = local31;
			local1.glBindTexture(34067, this.anInt4263);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt4260, this.anInt4260, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method3648();
		arg1.method3648();
		Static93.method1769(Static227.anIntArray478);
		Static93.method1776();
		Static127.method2242(Static71.method1399());
		local1.glPushAttrib(2048);
		Static71.method1414(false);
		Static71.method1411(false);
		Static71.method1413(false);
		Static71.method1392(1);
		Static71.method1380(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt4260, 0.0D, (double) this.anInt4260, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt4260, this.anInt4260);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static227.anIntArray479[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static227.aFloatArray29[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static227.aFloatArray29, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static227.method3649(local1, arg0.anInt4263, local212, arg0.anInt4260, Static227.anIntArray479[0])) {
				local203 = false;
				break;
			}
			if (!Static227.method3649(local1, arg1.anInt4263, local212, arg1.anInt4260, Static227.anIntArray479[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt4263, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static71.method1400(Static227.anIntArray479[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt4260, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt4260, this.anInt4260);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt4260);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static71.method1413(true);
		Static71.method1411(true);
		Static71.method1414(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static127.method2237();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static93.method1764(Static227.anIntArray478);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()V")
	private void method3651() {
		if (this.anInt4263 >= 0 && this.anInt4261 == Static162.anInt3245) {
			return;
		}
		@Pc(8) GL local8 = Static71.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt4263 = local11[0];
		local8.glBindTexture(34067, this.anInt4263);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt4261 = Static162.anInt3245;
		this.anInt4262 = 0;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "()Z")
	private boolean method3652() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static119.anInterface5_1.method1478(this.anIntArray477[local1])) {
				return false;
			}
		}
		return true;
	}
}
