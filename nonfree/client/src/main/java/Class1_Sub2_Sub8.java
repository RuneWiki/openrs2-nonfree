import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
	private int anInt1843;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "[I")
	private int[] anIntArray246;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	private int anInt1842 = 0;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	private int anInt1841 = -1;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	private int anInt1840 = -1;

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
	private int anInt1845 = 0;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub8() {
	}

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIII)V")
	public Class1_Sub2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray246 = new int[6];
		this.anIntArray246[0] = arg0;
		this.anIntArray246[1] = arg1;
		this.anIntArray246[2] = arg2;
		this.anIntArray246[3] = arg3;
		this.anIntArray246[4] = arg4;
		this.anIntArray246[5] = arg5;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	private boolean method1580() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static208.anInterface4_1.method984(this.anIntArray246[local1])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1840 != -1) {
			Static154.method2373(this.anInt1840, this.anInt1845, this.anInt1843);
			this.anInt1840 = -1;
			this.anInt1845 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
	public void method1582() {
		@Pc(1) GL local1 = Static240.aGL1;
		this.method1583();
		local1.glBindTexture(34067, this.anInt1840);
		if (this.anIntArray246 == null || this.anInt1842 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method1580()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray246[local22];
				this.anInt1841 = Static208.anInterface4_1.method981(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt1841;
				} else if (this.anInt1841 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static208.anInterface4_1.method986(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static154.anInt2855 += local22 - this.anInt1845;
			this.anInt1845 = local22;
			this.anInt1842 = 2;
		} else if (this.anInt1842 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static208.anIntArray476, Static208.anInterface4_1.method991(this.anIntArray246[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static154.anInt2855 += 3 - this.anInt1845;
				this.anInt1845 = 3;
			}
			this.anInt1842 = 1;
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
	private void method1583() {
		if (this.anInt1840 >= 0 && this.anInt1843 == Static154.anInt2852) {
			return;
		}
		@Pc(8) GL local8 = Static240.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt1840 = local11[0];
		local8.glBindTexture(34067, this.anInt1840);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt1843 = Static154.anInt2852;
		this.anInt1842 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ha;Lclient!ha;F)Lclient!ha;")
	public Class1_Sub2_Sub8 method1584(@OriginalArg(0) Class1_Sub2_Sub8 arg0, @OriginalArg(1) Class1_Sub2_Sub8 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static240.aGL1;
		@Pc(10) Class1_Sub2_Sub8 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static240.aBoolean370) {
			return local10;
		}
		this.method1583();
		@Pc(31) int local31;
		if (Static96.anIntArray244 == null || Static96.anInt1844 != Static154.anInt2852) {
			Static96.anIntArray244 = new int[2];
			local1.glGenTextures(2, Static96.anIntArray244, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static240.method3789(Static96.anIntArray244[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static96.anInt1844 = Static154.anInt2852;
		}
		local31 = arg0.anInt1841 > arg1.anInt1841 ? arg0.anInt1841 : arg1.anInt1841;
		if (this.anInt1841 != local31) {
			this.anInt1841 = local31;
			local1.glBindTexture(34067, this.anInt1840);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt1841, this.anInt1841, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method1582();
		arg1.method1582();
		Static50.method874(Static96.anIntArray245);
		Static50.method869();
		Static157.method2445(Static240.method3812());
		local1.glPushAttrib(2048);
		Static240.method3774(false);
		Static240.method3787(false);
		Static240.method3801(false);
		Static240.method3804(1);
		Static240.method3791(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt1841, 0.0D, (double) this.anInt1841, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt1841, this.anInt1841);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static96.anIntArray244[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static96.aFloatArray17[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static96.aFloatArray17, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static96.method1578(local1, arg0.anInt1840, local212, arg0.anInt1841, Static96.anIntArray244[0])) {
				local203 = false;
				break;
			}
			if (!Static96.method1578(local1, arg1.anInt1840, local212, arg1.anInt1841, Static96.anIntArray244[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt1840, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static240.method3789(Static96.anIntArray244[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt1841, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt1841, this.anInt1841);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt1841);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static240.method3801(true);
		Static240.method3787(true);
		Static240.method3774(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static157.method2446();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static50.method872(Static96.anIntArray245);
		return local203 ? this : local10;
	}
}
