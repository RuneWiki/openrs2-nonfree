import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	private int anInt1045;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	private int anInt1047 = -1;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	private int anInt1048 = 0;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	private int anInt1046 = 0;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
	private int anInt1049 = -1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub7() {
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIII)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray92 = new int[6];
		this.anIntArray92[0] = arg0;
		this.anIntArray92[1] = arg1;
		this.anIntArray92[2] = arg2;
		this.anIntArray92[3] = arg3;
		this.anIntArray92[4] = arg4;
		this.anIntArray92[5] = arg5;
	}

	@OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1047 != -1) {
			Static94.method1748(this.anInt1047, this.anInt1048, this.anInt1045);
			this.anInt1047 = -1;
			this.anInt1048 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()Z")
	private boolean method862() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static110.anInterface2_1.method2262(this.anIntArray92[local1])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!dc;Lclient!dc;F)Lclient!dc;")
	public Class1_Sub2_Sub7 method864(@OriginalArg(0) Class1_Sub2_Sub7 arg0, @OriginalArg(1) Class1_Sub2_Sub7 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static277.aGL1;
		@Pc(10) Class1_Sub2_Sub7 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static277.aBoolean408) {
			return local10;
		}
		this.method866();
		@Pc(31) int local31;
		if (Static42.anIntArray94 == null || Static42.anInt1050 != Static94.anInt2207) {
			Static42.anIntArray94 = new int[2];
			local1.glGenTextures(2, Static42.anIntArray94, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static277.method4212(Static42.anIntArray94[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static42.anInt1050 = Static94.anInt2207;
		}
		local31 = arg0.anInt1049 > arg1.anInt1049 ? arg0.anInt1049 : arg1.anInt1049;
		if (this.anInt1049 != local31) {
			this.anInt1049 = local31;
			local1.glBindTexture(34067, this.anInt1047);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt1049, this.anInt1049, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method865();
		arg1.method865();
		Static41.method841(Static42.anIntArray93);
		Static41.method842();
		Static206.method3301(Static277.method4219());
		local1.glPushAttrib(2048);
		Static277.method4209(false);
		Static277.method4193(false);
		Static277.method4192(false);
		Static277.method4222(1);
		Static277.method4190(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt1049, 0.0D, (double) this.anInt1049, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt1049, this.anInt1049);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static42.anIntArray94[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static42.aFloatArray6[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static42.aFloatArray6, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static42.method860(local1, arg0.anInt1047, local212, arg0.anInt1049, Static42.anIntArray94[0])) {
				local203 = false;
				break;
			}
			if (!Static42.method860(local1, arg1.anInt1047, local212, arg1.anInt1049, Static42.anIntArray94[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt1047, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static277.method4212(Static42.anIntArray94[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt1049, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt1049, this.anInt1049);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt1049);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static277.method4192(true);
		Static277.method4193(true);
		Static277.method4209(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static206.method3299();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static41.method834(Static42.anIntArray93);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "()V")
	public void method865() {
		@Pc(1) GL local1 = Static277.aGL1;
		this.method866();
		local1.glBindTexture(34067, this.anInt1047);
		if (this.anIntArray92 == null || this.anInt1046 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method862()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray92[local22];
				this.anInt1049 = Static110.anInterface2_1.method2268(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt1049;
				} else if (this.anInt1049 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static110.anInterface2_1.method2267(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static94.anInt2206 += local22 - this.anInt1048;
			this.anInt1048 = local22;
			this.anInt1046 = 2;
		} else if (this.anInt1046 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static110.anIntArray224, Static110.anInterface2_1.method2266(this.anIntArray92[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static94.anInt2206 += 3 - this.anInt1048;
				this.anInt1048 = 3;
			}
			this.anInt1046 = 1;
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "()V")
	private void method866() {
		if (this.anInt1047 >= 0 && this.anInt1045 == Static94.anInt2207) {
			return;
		}
		@Pc(8) GL local8 = Static277.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt1047 = local11[0];
		local8.glBindTexture(34067, this.anInt1047);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt1045 = Static94.anInt2207;
		this.anInt1046 = 0;
	}
}
