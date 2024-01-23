import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!va", name = "D", descriptor = "[I")
	private int[] anIntArray593;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "I")
	private int anInt5941;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "I")
	private int anInt5938 = -1;

	@OriginalMember(owner = "client!va", name = "E", descriptor = "I")
	private int anInt5940 = -1;

	@OriginalMember(owner = "client!va", name = "B", descriptor = "I")
	private int anInt5939 = 0;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "I")
	private int anInt5943 = 0;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub21() {
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(IIIIII)V")
	public Class1_Sub2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray593 = new int[6];
		this.anIntArray593[0] = arg0;
		this.anIntArray593[1] = arg1;
		this.anIntArray593[2] = arg2;
		this.anIntArray593[3] = arg3;
		this.anIntArray593[4] = arg4;
		this.anIntArray593[5] = arg5;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "()Z")
	private boolean method4601() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static151.anInterface2_1.method4413(this.anIntArray593[local1])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "()V")
	private void method4602() {
		if (this.anInt5940 >= 0 && this.anInt5941 == Static237.anInt5216) {
			return;
		}
		@Pc(8) GL local8 = Static296.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt5940 = local11[0];
		local8.glBindTexture(34067, this.anInt5940);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt5941 = Static237.anInt5216;
		this.anInt5939 = 0;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "()V")
	public void method4603() {
		@Pc(1) GL local1 = Static296.aGL1;
		this.method4602();
		local1.glBindTexture(34067, this.anInt5940);
		if (this.anIntArray593 == null || this.anInt5939 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method4601()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray593[local22];
				this.anInt5938 = Static151.anInterface2_1.method4423(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt5938;
				} else if (this.anInt5938 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static151.anInterface2_1.method4411(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static237.anInt5215 += local22 - this.anInt5943;
			this.anInt5943 = local22;
			this.anInt5939 = 2;
		} else if (this.anInt5939 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static151.anIntArray324, Static151.anInterface2_1.method4416(this.anIntArray593[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static237.anInt5215 += 3 - this.anInt5943;
				this.anInt5943 = 3;
			}
			this.anInt5939 = 1;
		}
	}

	@OriginalMember(owner = "client!va", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5940 != -1) {
			Static237.method4089(this.anInt5940, this.anInt5943, this.anInt5941);
			this.anInt5940 = -1;
			this.anInt5943 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!va;Lclient!va;F)Lclient!va;")
	public Class1_Sub2_Sub21 method4605(@OriginalArg(0) Class1_Sub2_Sub21 arg0, @OriginalArg(1) Class1_Sub2_Sub21 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static296.aGL1;
		@Pc(10) Class1_Sub2_Sub21 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static296.aBoolean340) {
			return local10;
		}
		this.method4602();
		@Pc(31) int local31;
		if (Static276.anIntArray595 == null || Static276.anInt5942 != Static237.anInt5216) {
			Static276.anIntArray595 = new int[2];
			local1.glGenTextures(2, Static276.anIntArray595, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static296.method4812(Static276.anIntArray595[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static276.anInt5942 = Static237.anInt5216;
		}
		local31 = arg0.anInt5938 > arg1.anInt5938 ? arg0.anInt5938 : arg1.anInt5938;
		if (this.anInt5938 != local31) {
			this.anInt5938 = local31;
			local1.glBindTexture(34067, this.anInt5940);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt5938, this.anInt5938, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method4603();
		arg1.method4603();
		Static288.method4707(Static276.anIntArray594);
		Static288.method4710();
		Static17.method373(Static296.method4841());
		local1.glPushAttrib(2048);
		Static296.method4814(false);
		Static296.method4840(false);
		Static296.method4798(false);
		Static296.method4805(1);
		Static296.method4823(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt5938, 0.0D, (double) this.anInt5938, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt5938, this.anInt5938);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static276.anIntArray595[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static276.aFloatArray31[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static276.aFloatArray31, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static276.method4607(local1, arg0.anInt5940, local212, arg0.anInt5938, Static276.anIntArray595[0])) {
				local203 = false;
				break;
			}
			if (!Static276.method4607(local1, arg1.anInt5940, local212, arg1.anInt5938, Static276.anIntArray595[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt5940, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static296.method4812(Static276.anIntArray595[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt5938, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt5938, this.anInt5938);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt5938);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static296.method4798(true);
		Static296.method4840(true);
		Static296.method4814(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static17.method368();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static288.method4708(Static276.anIntArray594);
		return local203 ? this : local10;
	}
}
