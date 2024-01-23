import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class2_Sub8_Sub14 extends Class2_Sub8 {

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "[I")
	private int[] anIntArray394;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	private int anInt3983;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	private int anInt3981 = 0;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
	private int anInt3984 = -1;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
	private int anInt3982 = -1;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	private int anInt3986 = 0;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class2_Sub8_Sub14() {
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIII)V")
	public Class2_Sub8_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray394 = new int[6];
		this.anIntArray394[0] = arg0;
		this.anIntArray394[1] = arg1;
		this.anIntArray394[2] = arg2;
		this.anIntArray394[3] = arg3;
		this.anIntArray394[4] = arg4;
		this.anIntArray394[5] = arg5;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ne;Lclient!ne;F)Lclient!ne;")
	public Class2_Sub8_Sub14 method3275(@OriginalArg(0) Class2_Sub8_Sub14 arg0, @OriginalArg(1) Class2_Sub8_Sub14 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(10) Class2_Sub8_Sub14 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static116.aBoolean191) {
			return local10;
		}
		this.method3278();
		@Pc(31) int local31;
		if (Static186.anIntArray395 == null || Static186.anInt3985 != Static124.anInt2871) {
			Static186.anIntArray395 = new int[2];
			local1.glGenTextures(2, Static186.anIntArray395, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static116.method1945(Static186.anIntArray395[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static186.anInt3985 = Static124.anInt2871;
		}
		local31 = arg0.anInt3984 > arg1.anInt3984 ? arg0.anInt3984 : arg1.anInt3984;
		if (this.anInt3984 != local31) {
			this.anInt3984 = local31;
			local1.glBindTexture(34067, this.anInt3982);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt3984, this.anInt3984, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method3277();
		arg1.method3277();
		Static111.method1889(Static186.anIntArray396);
		Static111.method1884();
		Static240.method3841(Static116.method1939());
		local1.glPushAttrib(2048);
		Static116.method1954(false);
		Static116.method1974(false);
		Static116.method1963(false);
		Static116.method1977(1);
		Static116.method1976(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt3984, 0.0D, (double) this.anInt3984, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt3984, this.anInt3984);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static186.anIntArray395[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static186.aFloatArray10[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static186.aFloatArray10, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static186.method3279(local1, arg0.anInt3982, local212, arg0.anInt3984, Static186.anIntArray395[0])) {
				local203 = false;
				break;
			}
			if (!Static186.method3279(local1, arg1.anInt3982, local212, arg1.anInt3984, Static186.anIntArray395[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt3982, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static116.method1945(Static186.anIntArray395[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt3984, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt3984, this.anInt3984);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt3984);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static116.method1963(true);
		Static116.method1974(true);
		Static116.method1954(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static240.method3838();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static111.method1885(Static186.anIntArray396);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
	public void method3277() {
		@Pc(1) GL local1 = Static116.aGL1;
		this.method3278();
		local1.glBindTexture(34067, this.anInt3982);
		if (this.anIntArray394 == null || this.anInt3986 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method3280()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray394[local22];
				this.anInt3984 = Static1.anInterface3_1.method4144(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt3984;
				} else if (this.anInt3984 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static1.anInterface3_1.method4138(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static124.anInt2872 += local22 - this.anInt3981;
			this.anInt3981 = local22;
			this.anInt3986 = 2;
		} else if (this.anInt3986 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static1.anIntArray2, Static1.anInterface3_1.method4132(this.anIntArray394[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static124.anInt2872 += 3 - this.anInt3981;
				this.anInt3981 = 3;
			}
			this.anInt3986 = 1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()V")
	private void method3278() {
		if (this.anInt3982 >= 0 && this.anInt3983 == Static124.anInt2871) {
			return;
		}
		@Pc(8) GL local8 = Static116.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt3982 = local11[0];
		local8.glBindTexture(34067, this.anInt3982);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt3983 = Static124.anInt2871;
		this.anInt3986 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3982 != -1) {
			Static124.method2212(this.anInt3982, this.anInt3981, this.anInt3983);
			this.anInt3982 = -1;
			this.anInt3981 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "()Z")
	private boolean method3280() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static1.anInterface3_1.method4143(this.anIntArray394[local1])) {
				return false;
			}
		}
		return true;
	}
}
