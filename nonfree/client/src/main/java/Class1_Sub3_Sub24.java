import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
	private int anInt6071;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "[I")
	private int[] anIntArray541;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
	private int anInt6073 = -1;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	private int anInt6072 = -1;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
	private int anInt6074 = 0;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
	private int anInt6075 = 0;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIII)V")
	public Class1_Sub3_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray541 = new int[6];
		this.anIntArray541[0] = arg0;
		this.anIntArray541[1] = arg1;
		this.anIntArray541[2] = arg2;
		this.anIntArray541[3] = arg3;
		this.anIntArray541[4] = arg4;
		this.anIntArray541[5] = arg5;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!wc;Lclient!wc;F)Lclient!wc;")
	public Class1_Sub3_Sub24 method4655(@OriginalArg(0) Class1_Sub3_Sub24 arg0, @OriginalArg(1) Class1_Sub3_Sub24 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static294.aGL1;
		@Pc(10) Class1_Sub3_Sub24 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static294.aBoolean366) {
			return local10;
		}
		this.method4659();
		@Pc(31) int local31;
		if (Static306.anIntArray543 == null || Static306.anInt6076 != Static113.anInt2464) {
			Static306.anIntArray543 = new int[2];
			local1.glGenTextures(2, Static306.anIntArray543, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static294.method4486(Static306.anIntArray543[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static306.anInt6076 = Static113.anInt2464;
		}
		local31 = arg0.anInt6073 > arg1.anInt6073 ? arg0.anInt6073 : arg1.anInt6073;
		if (this.anInt6073 != local31) {
			this.anInt6073 = local31;
			local1.glBindTexture(34067, this.anInt6072);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt6073, this.anInt6073, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method4657();
		arg1.method4657();
		Static156.method2543(Static306.anIntArray542);
		Static156.method2538();
		Static164.method2593(Static294.method4484());
		local1.glPushAttrib(2048);
		Static294.method4499(false);
		Static294.method4496(false);
		Static294.method4491(false);
		Static294.method4488(1);
		Static294.method4490(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt6073, 0.0D, (double) this.anInt6073, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt6073, this.anInt6073);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static306.anIntArray543[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static306.aFloatArray33[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static306.aFloatArray33, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static306.method4661(local1, arg0.anInt6072, local212, arg0.anInt6073, Static306.anIntArray543[0])) {
				local203 = false;
				break;
			}
			if (!Static306.method4661(local1, arg1.anInt6072, local212, arg1.anInt6073, Static306.anIntArray543[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt6072, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static294.method4486(Static306.anIntArray543[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt6073, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt6073, this.anInt6073);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt6073);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static294.method4491(true);
		Static294.method4496(true);
		Static294.method4499(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static164.method2585();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static156.method2536(Static306.anIntArray542);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	public void method4657() {
		@Pc(1) GL local1 = Static294.aGL1;
		this.method4659();
		local1.glBindTexture(34067, this.anInt6072);
		if (this.anIntArray541 == null || this.anInt6075 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method4660()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray541[local22];
				this.anInt6073 = Static237.anInterface1_1.method4604(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt6073;
				} else if (this.anInt6073 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static237.anInterface1_1.method4591(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static113.anInt2465 += local22 - this.anInt6074;
			this.anInt6074 = local22;
			this.anInt6075 = 2;
		} else if (this.anInt6075 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static237.anIntArray462, Static237.anInterface1_1.method4597(this.anIntArray541[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static113.anInt2465 += 3 - this.anInt6074;
				this.anInt6074 = 3;
			}
			this.anInt6075 = 1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
	private void method4659() {
		if (this.anInt6072 >= 0 && this.anInt6071 == Static113.anInt2464) {
			return;
		}
		@Pc(8) GL local8 = Static294.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt6072 = local11[0];
		local8.glBindTexture(34067, this.anInt6072);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt6071 = Static113.anInt2464;
		this.anInt6075 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt6072 != -1) {
			Static113.method1837(this.anInt6072, this.anInt6074, this.anInt6071);
			this.anInt6072 = -1;
			this.anInt6074 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "()Z")
	private boolean method4660() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static237.anInterface1_1.method4594(this.anIntArray541[local1])) {
				return false;
			}
		}
		return true;
	}
}
