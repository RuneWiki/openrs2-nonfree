import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class4_Sub2_Sub15 extends Class4_Sub2 {

	@OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "I")
	private int anInt3777;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "I")
	private int anInt3774 = -1;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	private int anInt3775 = 0;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	private int anInt3773 = -1;

	@OriginalMember(owner = "client!od", name = "A", descriptor = "I")
	private int anInt3778 = 0;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub15() {
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIII)V")
	public Class4_Sub2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray316 = new int[6];
		this.anIntArray316[0] = arg0;
		this.anIntArray316[1] = arg1;
		this.anIntArray316[2] = arg2;
		this.anIntArray316[3] = arg3;
		this.anIntArray316[4] = arg4;
		this.anIntArray316[5] = arg5;
	}

	@OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3774 != -1) {
			Static163.method2523(this.anInt3774, this.anInt3778, this.anInt3777);
			this.anInt3774 = -1;
			this.anInt3778 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()Z")
	private boolean method3003() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static204.anInterface2_1.method1977(this.anIntArray316[local1])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	private void method3004() {
		if (this.anInt3774 >= 0 && this.anInt3777 == Static163.anInt3218) {
			return;
		}
		@Pc(8) GL local8 = Static178.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt3774 = local11[0];
		local8.glBindTexture(34067, this.anInt3774);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt3777 = Static163.anInt3218;
		this.anInt3775 = 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!od;Lclient!od;F)Lclient!od;")
	public Class4_Sub2_Sub15 method3005(@OriginalArg(0) Class4_Sub2_Sub15 arg0, @OriginalArg(1) Class4_Sub2_Sub15 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static178.aGL1;
		@Pc(10) Class4_Sub2_Sub15 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static178.aBoolean221) {
			return local10;
		}
		this.method3004();
		@Pc(31) int local31;
		if (Static188.anIntArray315 == null || Static188.anInt3776 != Static163.anInt3218) {
			Static188.anIntArray315 = new int[2];
			local1.glGenTextures(2, Static188.anIntArray315, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static178.method2763(Static188.anIntArray315[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static188.anInt3776 = Static163.anInt3218;
		}
		local31 = arg0.anInt3773 > arg1.anInt3773 ? arg0.anInt3773 : arg1.anInt3773;
		if (this.anInt3773 != local31) {
			this.anInt3773 = local31;
			local1.glBindTexture(34067, this.anInt3774);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt3773, this.anInt3773, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method3009();
		arg1.method3009();
		Static186.method2961(Static188.anIntArray317);
		Static186.method2957();
		Static29.method451(Static178.method2755());
		local1.glPushAttrib(2048);
		Static178.method2772(false);
		Static178.method2776(false);
		Static178.method2751(false);
		Static178.method2754(1);
		Static178.method2769(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt3773, 0.0D, (double) this.anInt3773, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt3773, this.anInt3773);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static188.anIntArray315[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static188.aFloatArray22[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static188.aFloatArray22, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static188.method3008(local1, arg0.anInt3774, local212, arg0.anInt3773, Static188.anIntArray315[0])) {
				local203 = false;
				break;
			}
			if (!Static188.method3008(local1, arg1.anInt3774, local212, arg1.anInt3773, Static188.anIntArray315[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt3774, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static178.method2763(Static188.anIntArray315[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt3773, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt3773, this.anInt3773);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt3773);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static178.method2751(true);
		Static178.method2776(true);
		Static178.method2772(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static29.method450();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static186.method2956(Static188.anIntArray317);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()V")
	public void method3009() {
		@Pc(1) GL local1 = Static178.aGL1;
		this.method3004();
		local1.glBindTexture(34067, this.anInt3774);
		if (this.anIntArray316 == null || this.anInt3775 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method3003()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray316[local22];
				this.anInt3773 = Static204.anInterface2_1.method1974(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt3773;
				} else if (this.anInt3773 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static204.anInterface2_1.method1975(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static163.anInt3221 += local22 - this.anInt3778;
			this.anInt3778 = local22;
			this.anInt3775 = 2;
		} else if (this.anInt3775 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static204.anIntArray354, Static204.anInterface2_1.method1979(this.anIntArray316[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static163.anInt3221 += 3 - this.anInt3778;
				this.anInt3778 = 3;
			}
			this.anInt3775 = 1;
		}
	}
}
