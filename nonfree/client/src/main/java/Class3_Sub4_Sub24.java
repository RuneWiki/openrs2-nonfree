import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class3_Sub4_Sub24 extends Class3_Sub4 {

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "[I")
	private int[] anIntArray632;

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
	private int anInt6149;

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "I")
	private int anInt6146 = 0;

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
	private int anInt6147 = -1;

	@OriginalMember(owner = "client!wm", name = "F", descriptor = "I")
	private int anInt6148 = 0;

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
	private int anInt6150 = -1;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub24() {
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIIIII)V")
	public Class3_Sub4_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray632 = new int[6];
		this.anIntArray632[0] = arg0;
		this.anIntArray632[1] = arg1;
		this.anIntArray632[2] = arg2;
		this.anIntArray632[3] = arg3;
		this.anIntArray632[4] = arg4;
		this.anIntArray632[5] = arg5;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!wm;Lclient!wm;F)Lclient!wm;")
	public Class3_Sub4_Sub24 method5025(@OriginalArg(0) Class3_Sub4_Sub24 arg0, @OriginalArg(1) Class3_Sub4_Sub24 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static283.aGL1;
		@Pc(10) Class3_Sub4_Sub24 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static283.aBoolean391) {
			return local10;
		}
		this.method5030();
		@Pc(31) int local31;
		if (Static316.anIntArray633 == null || Static316.anInt6151 != Static189.anInt3719) {
			Static316.anIntArray633 = new int[2];
			local1.glGenTextures(2, Static316.anIntArray633, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static283.method4636(Static316.anIntArray633[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static316.anInt6151 = Static189.anInt3719;
		}
		local31 = arg0.anInt6147 > arg1.anInt6147 ? arg0.anInt6147 : arg1.anInt6147;
		if (this.anInt6147 != local31) {
			this.anInt6147 = local31;
			local1.glBindTexture(34067, this.anInt6150);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt6147, this.anInt6147, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method5026();
		arg1.method5026();
		Static234.method3966(Static316.anIntArray634);
		Static234.method3976();
		Static121.method2020(Static283.method4649());
		local1.glPushAttrib(2048);
		Static283.method4665(false);
		Static283.method4651(false);
		Static283.method4657(false);
		Static283.method4664(1);
		Static283.method4656(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt6147, 0.0D, (double) this.anInt6147, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt6147, this.anInt6147);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static316.anIntArray633[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static316.aFloatArray30[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static316.aFloatArray30, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static316.method5029(local1, arg0.anInt6150, local212, arg0.anInt6147, Static316.anIntArray633[0])) {
				local203 = false;
				break;
			}
			if (!Static316.method5029(local1, arg1.anInt6150, local212, arg1.anInt6147, Static316.anIntArray633[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt6150, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static283.method4636(Static316.anIntArray633[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt6147, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt6147, this.anInt6147);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt6147);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static283.method4657(true);
		Static283.method4651(true);
		Static283.method4665(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static121.method2016();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static234.method3963(Static316.anIntArray634);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()V")
	public void method5026() {
		@Pc(1) GL local1 = Static283.aGL1;
		this.method5030();
		local1.glBindTexture(34067, this.anInt6150);
		if (this.anIntArray632 == null || this.anInt6146 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method5028()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray632[local22];
				this.anInt6147 = Static16.anInterface4_1.method2897(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt6147;
				} else if (this.anInt6147 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static16.anInterface4_1.method2907(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static189.anInt3721 += local22 - this.anInt6148;
			this.anInt6148 = local22;
			this.anInt6146 = 2;
		} else if (this.anInt6146 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static16.anIntArray25, Static16.anInterface4_1.method2906(this.anIntArray632[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static189.anInt3721 += 3 - this.anInt6148;
				this.anInt6148 = 3;
			}
			this.anInt6146 = 1;
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "()Z")
	private boolean method5028() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static16.anInterface4_1.method2899(this.anIntArray632[local1])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt6150 != -1) {
			Static189.method3151(this.anInt6150, this.anInt6148, this.anInt6149);
			this.anInt6150 = -1;
			this.anInt6148 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "()V")
	private void method5030() {
		if (this.anInt6150 >= 0 && this.anInt6149 == Static189.anInt3719) {
			return;
		}
		@Pc(8) GL local8 = Static283.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt6150 = local11[0];
		local8.glBindTexture(34067, this.anInt6150);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt6149 = Static189.anInt3719;
		this.anInt6146 = 0;
	}
}
