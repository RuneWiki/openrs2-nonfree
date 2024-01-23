import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kj", name = "E", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
	private int anInt2758 = -1;

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
	private int anInt2759 = 0;

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
	private int anInt2757 = 0;

	@OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
	private int anInt2761 = -1;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub12() {
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIII)V")
	public Class2_Sub3_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray205 = new int[6];
		this.anIntArray205[0] = arg0;
		this.anIntArray205[1] = arg1;
		this.anIntArray205[2] = arg2;
		this.anIntArray205[3] = arg3;
		this.anIntArray205[4] = arg4;
		this.anIntArray205[5] = arg5;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "()V")
	public void method2345() {
		@Pc(1) GL local1 = Static60.aGL1;
		this.method2350();
		local1.glBindTexture(34067, this.anInt2758);
		if (this.anIntArray205 == null || this.anInt2759 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method2347()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray205[local22];
				this.anInt2761 = Static93.anInterface5_1.method3518(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt2761;
				} else if (this.anInt2761 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static93.anInterface5_1.method3519(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static256.anInt5188 += local22 - this.anInt2757;
			this.anInt2757 = local22;
			this.anInt2759 = 2;
		} else if (this.anInt2759 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static93.anIntArray152, Static93.anInterface5_1.method3521(this.anIntArray205[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static256.anInt5188 += 3 - this.anInt2757;
				this.anInt2757 = 3;
			}
			this.anInt2759 = 1;
		}
	}

	@OriginalMember(owner = "client!kj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2758 != -1) {
			Static256.method4129(this.anInt2758, this.anInt2757, this.anInt2760);
			this.anInt2758 = -1;
			this.anInt2757 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!kj;Lclient!kj;F)Lclient!kj;")
	public Class2_Sub3_Sub12 method2346(@OriginalArg(0) Class2_Sub3_Sub12 arg0, @OriginalArg(1) Class2_Sub3_Sub12 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static60.aGL1;
		@Pc(10) Class2_Sub3_Sub12 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static60.aBoolean99) {
			return local10;
		}
		this.method2350();
		@Pc(31) int local31;
		if (Static135.anIntArray207 == null || Static135.anInt2762 != Static256.anInt5185) {
			Static135.anIntArray207 = new int[2];
			local1.glGenTextures(2, Static135.anIntArray207, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static60.method1157(Static135.anIntArray207[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static135.anInt2762 = Static256.anInt5185;
		}
		local31 = arg0.anInt2761 > arg1.anInt2761 ? arg0.anInt2761 : arg1.anInt2761;
		if (this.anInt2761 != local31) {
			this.anInt2761 = local31;
			local1.glBindTexture(34067, this.anInt2758);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt2761, this.anInt2761, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method2345();
		arg1.method2345();
		Static94.method1760(Static135.anIntArray206);
		Static94.method1750();
		Static147.method2593(Static60.method1155());
		local1.glPushAttrib(2048);
		Static60.method1151(false);
		Static60.method1164(false);
		Static60.method1178(false);
		Static60.method1139(1);
		Static60.method1168(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt2761, 0.0D, (double) this.anInt2761, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt2761, this.anInt2761);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static135.anIntArray207[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static135.aFloatArray19[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static135.aFloatArray19, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static135.method2349(local1, arg0.anInt2758, local212, arg0.anInt2761, Static135.anIntArray207[0])) {
				local203 = false;
				break;
			}
			if (!Static135.method2349(local1, arg1.anInt2758, local212, arg1.anInt2761, Static135.anIntArray207[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt2758, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static60.method1157(Static135.anIntArray207[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt2761, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt2761, this.anInt2761);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt2761);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static60.method1178(true);
		Static60.method1164(true);
		Static60.method1151(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static147.method2591();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static94.method1748(Static135.anIntArray206);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "()Z")
	private boolean method2347() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static93.anInterface5_1.method3517(this.anIntArray205[local1])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "()V")
	private void method2350() {
		if (this.anInt2758 >= 0 && this.anInt2760 == Static256.anInt5185) {
			return;
		}
		@Pc(8) GL local8 = Static60.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt2758 = local11[0];
		local8.glBindTexture(34067, this.anInt2758);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt2760 = Static256.anInt5185;
		this.anInt2759 = 0;
	}
}
