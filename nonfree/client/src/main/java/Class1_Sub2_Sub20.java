import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
	private int anInt4912;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
	private int anInt4910 = 0;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
	private int anInt4913 = 0;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	private int anInt4911 = -1;

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
	private int anInt4914 = -1;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub20() {
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIII)V")
	public Class1_Sub2_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray433 = new int[6];
		this.anIntArray433[0] = arg0;
		this.anIntArray433[1] = arg1;
		this.anIntArray433[2] = arg2;
		this.anIntArray433[3] = arg3;
		this.anIntArray433[4] = arg4;
		this.anIntArray433[5] = arg5;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ti;Lclient!ti;F)Lclient!ti;")
	public Class1_Sub2_Sub20 method4228(@OriginalArg(0) Class1_Sub2_Sub20 arg0, @OriginalArg(1) Class1_Sub2_Sub20 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static156.aGL1;
		@Pc(10) Class1_Sub2_Sub20 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static156.aBoolean194) {
			return local10;
		}
		this.method4230();
		@Pc(31) int local31;
		if (Static271.anIntArray435 == null || Static271.anInt4915 != Static10.anInt142) {
			Static271.anIntArray435 = new int[2];
			local1.glGenTextures(2, Static271.anIntArray435, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static156.method2699(Static271.anIntArray435[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static271.anInt4915 = Static10.anInt142;
		}
		local31 = arg0.anInt4911 > arg1.anInt4911 ? arg0.anInt4911 : arg1.anInt4911;
		if (this.anInt4911 != local31) {
			this.anInt4911 = local31;
			local1.glBindTexture(34067, this.anInt4914);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt4911, this.anInt4911, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method4233();
		arg1.method4233();
		Static119.method2140(Static271.anIntArray434);
		Static119.method2126();
		Static14.method190(Static156.method2680());
		local1.glPushAttrib(2048);
		Static156.method2674(false);
		Static156.method2675(false);
		Static156.method2668(false);
		Static156.method2695(1);
		Static156.method2681(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt4911, 0.0D, (double) this.anInt4911, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt4911, this.anInt4911);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static271.anIntArray435[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static271.aFloatArray23[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static271.aFloatArray23, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static271.method4232(local1, arg0.anInt4914, local212, arg0.anInt4911, Static271.anIntArray435[0])) {
				local203 = false;
				break;
			}
			if (!Static271.method4232(local1, arg1.anInt4914, local212, arg1.anInt4911, Static271.anIntArray435[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt4914, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static156.method2699(Static271.anIntArray435[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt4911, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt4911, this.anInt4911);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt4911);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static156.method2668(true);
		Static156.method2675(true);
		Static156.method2674(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static14.method193();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static119.method2141(Static271.anIntArray434);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "()V")
	private void method4230() {
		if (this.anInt4914 >= 0 && this.anInt4912 == Static10.anInt142) {
			return;
		}
		@Pc(8) GL local8 = Static156.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt4914 = local11[0];
		local8.glBindTexture(34067, this.anInt4914);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt4912 = Static10.anInt142;
		this.anInt4910 = 0;
	}

	@OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt4914 != -1) {
			Static10.method130(this.anInt4914, this.anInt4913, this.anInt4912);
			this.anInt4914 = -1;
			this.anInt4913 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "()V")
	public void method4233() {
		@Pc(1) GL local1 = Static156.aGL1;
		this.method4230();
		local1.glBindTexture(34067, this.anInt4914);
		if (this.anIntArray433 == null || this.anInt4910 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method4234()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray433[local22];
				this.anInt4911 = Static215.anInterface5_1.method783(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt4911;
				} else if (this.anInt4911 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static215.anInterface5_1.method780(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static10.anInt141 += local22 - this.anInt4913;
			this.anInt4913 = local22;
			this.anInt4910 = 2;
		} else if (this.anInt4910 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static215.anIntArray340, Static215.anInterface5_1.method777(this.anIntArray433[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static10.anInt141 += 3 - this.anInt4913;
				this.anInt4913 = 3;
			}
			this.anInt4910 = 1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "()Z")
	private boolean method4234() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static215.anInterface5_1.method787(this.anIntArray433[local1])) {
				return false;
			}
		}
		return true;
	}
}
