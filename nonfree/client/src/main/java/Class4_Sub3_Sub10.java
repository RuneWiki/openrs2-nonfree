import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class4_Sub3_Sub10 extends Class4_Sub3 {

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int anInt2325;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int anInt2320 = -1;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	private int anInt2323 = 0;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	private int anInt2321 = 0;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	private int anInt2324 = -1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub10() {
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIII)V")
	public Class4_Sub3_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray193 = new int[6];
		this.anIntArray193[0] = arg0;
		this.anIntArray193[1] = arg1;
		this.anIntArray193[2] = arg2;
		this.anIntArray193[3] = arg3;
		this.anIntArray193[4] = arg4;
		this.anIntArray193[5] = arg5;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
	private void method1833() {
		if (this.anInt2320 >= 0 && this.anInt2325 == Static173.anInt3332) {
			return;
		}
		@Pc(8) GL local8 = Static94.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt2320 = local11[0];
		local8.glBindTexture(34067, this.anInt2320);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt2325 = Static173.anInt3332;
		this.anInt2323 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2320 != -1) {
			Static173.method2733(this.anInt2320, this.anInt2321, this.anInt2325);
			this.anInt2320 = -1;
			this.anInt2321 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
	public void method1835() {
		@Pc(1) GL local1 = Static94.aGL1;
		this.method1833();
		local1.glBindTexture(34067, this.anInt2320);
		if (this.anIntArray193 == null || this.anInt2323 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method1837()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray193[local22];
				this.anInt2324 = Static158.anInterface5_1.method453(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt2324;
				} else if (this.anInt2324 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static158.anInterface5_1.method449(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static173.anInt3330 += local22 - this.anInt2321;
			this.anInt2321 = local22;
			this.anInt2323 = 2;
		} else if (this.anInt2323 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static158.anIntArray295, Static158.anInterface5_1.method446(this.anIntArray193[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static173.anInt3330 += 3 - this.anInt2321;
				this.anInt2321 = 3;
			}
			this.anInt2323 = 1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ib;Lclient!ib;F)Lclient!ib;")
	public Class4_Sub3_Sub10 method1836(@OriginalArg(0) Class4_Sub3_Sub10 arg0, @OriginalArg(1) Class4_Sub3_Sub10 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static94.aGL1;
		@Pc(10) Class4_Sub3_Sub10 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static94.aBoolean134) {
			return local10;
		}
		this.method1833();
		@Pc(31) int local31;
		if (Static116.anIntArray194 == null || Static116.anInt2322 != Static173.anInt3332) {
			Static116.anIntArray194 = new int[2];
			local1.glGenTextures(2, Static116.anIntArray194, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static94.method1600(Static116.anIntArray194[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static116.anInt2322 = Static173.anInt3332;
		}
		local31 = arg0.anInt2324 > arg1.anInt2324 ? arg0.anInt2324 : arg1.anInt2324;
		if (this.anInt2324 != local31) {
			this.anInt2324 = local31;
			local1.glBindTexture(34067, this.anInt2320);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt2324, this.anInt2324, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method1835();
		arg1.method1835();
		Static104.method1687(Static116.anIntArray195);
		Static104.method1699();
		Static14.method216(Static94.method1614());
		local1.glPushAttrib(2048);
		Static94.method1593(false);
		Static94.method1610(false);
		Static94.method1588(false);
		Static94.method1597(1);
		Static94.method1607(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt2324, 0.0D, (double) this.anInt2324, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt2324, this.anInt2324);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static116.anIntArray194[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static116.aFloatArray23[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static116.aFloatArray23, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static116.method1838(local1, arg0.anInt2320, local212, arg0.anInt2324, Static116.anIntArray194[0])) {
				local203 = false;
				break;
			}
			if (!Static116.method1838(local1, arg1.anInt2320, local212, arg1.anInt2324, Static116.anIntArray194[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt2320, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static94.method1600(Static116.anIntArray194[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt2324, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt2324, this.anInt2324);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt2324);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static94.method1588(true);
		Static94.method1610(true);
		Static94.method1593(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static14.method215();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static104.method1696(Static116.anIntArray195);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()Z")
	private boolean method1837() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static158.anInterface5_1.method448(this.anIntArray193[local1])) {
				return false;
			}
		}
		return true;
	}
}
