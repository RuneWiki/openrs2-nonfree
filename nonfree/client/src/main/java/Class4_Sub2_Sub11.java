import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class4_Sub2_Sub11 extends Class4_Sub2 {

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
	private int anInt2568;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
	private int anInt2566 = -1;

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
	private int anInt2565 = -1;

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
	private int anInt2567 = 0;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
	private int anInt2570 = 0;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub11() {
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIIII)V")
	public Class4_Sub2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray216 = new int[6];
		this.anIntArray216[0] = arg0;
		this.anIntArray216[1] = arg1;
		this.anIntArray216[2] = arg2;
		this.anIntArray216[3] = arg3;
		this.anIntArray216[4] = arg4;
		this.anIntArray216[5] = arg5;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
	public void method2088() {
		@Pc(1) GL local1 = Static251.aGL1;
		this.method2093();
		local1.glBindTexture(34067, this.anInt2566);
		if (this.anIntArray216 == null || this.anInt2570 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method2091()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray216[local22];
				this.anInt2565 = Static283.anInterface1_1.method2435(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt2565;
				} else if (this.anInt2565 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static283.anInterface1_1.method2434(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static239.anInt4728 += local22 - this.anInt2567;
			this.anInt2567 = local22;
			this.anInt2570 = 2;
		} else if (this.anInt2570 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static283.anIntArray441, Static283.anInterface1_1.method2431(this.anIntArray216[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static239.anInt4728 += 3 - this.anInt2567;
				this.anInt2567 = 3;
			}
			this.anInt2570 = 1;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "()Z")
	private boolean method2091() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static283.anInterface1_1.method2429(this.anIntArray216[local1])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!jg;Lclient!jg;F)Lclient!jg;")
	public Class4_Sub2_Sub11 method2092(@OriginalArg(0) Class4_Sub2_Sub11 arg0, @OriginalArg(1) Class4_Sub2_Sub11 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static251.aGL1;
		@Pc(10) Class4_Sub2_Sub11 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static251.aBoolean324) {
			return local10;
		}
		this.method2093();
		@Pc(31) int local31;
		if (Static128.anIntArray217 == null || Static128.anInt2569 != Static239.anInt4726) {
			Static128.anIntArray217 = new int[2];
			local1.glGenTextures(2, Static128.anIntArray217, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static251.method3892(Static128.anIntArray217[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static128.anInt2569 = Static239.anInt4726;
		}
		local31 = arg0.anInt2565 > arg1.anInt2565 ? arg0.anInt2565 : arg1.anInt2565;
		if (this.anInt2565 != local31) {
			this.anInt2565 = local31;
			local1.glBindTexture(34067, this.anInt2566);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt2565, this.anInt2565, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method2088();
		arg1.method2088();
		Static87.method1453(Static128.anIntArray218);
		Static87.method1462();
		Static196.method3194(Static251.method3869());
		local1.glPushAttrib(2048);
		Static251.method3894(false);
		Static251.method3854(false);
		Static251.method3868(false);
		Static251.method3870(1);
		Static251.method3851(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt2565, 0.0D, (double) this.anInt2565, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt2565, this.anInt2565);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static128.anIntArray217[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static128.aFloatArray16[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static128.aFloatArray16, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static128.method2089(local1, arg0.anInt2566, local212, arg0.anInt2565, Static128.anIntArray217[0])) {
				local203 = false;
				break;
			}
			if (!Static128.method2089(local1, arg1.anInt2566, local212, arg1.anInt2565, Static128.anIntArray217[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt2566, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static251.method3892(Static128.anIntArray217[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt2565, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt2565, this.anInt2565);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt2565);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static251.method3868(true);
		Static251.method3854(true);
		Static251.method3894(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static196.method3189();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static87.method1460(Static128.anIntArray218);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2566 != -1) {
			Static239.method3679(this.anInt2566, this.anInt2567, this.anInt2568);
			this.anInt2566 = -1;
			this.anInt2567 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "()V")
	private void method2093() {
		if (this.anInt2566 >= 0 && this.anInt2568 == Static239.anInt4726) {
			return;
		}
		@Pc(8) GL local8 = Static251.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt2566 = local11[0];
		local8.glBindTexture(34067, this.anInt2566);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt2568 = Static239.anInt4726;
		this.anInt2570 = 0;
	}
}
