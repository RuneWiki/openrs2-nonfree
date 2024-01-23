import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class8_Sub1_Sub3 extends Class8_Sub1 {

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	private int anInt720;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
	private int anInt723 = 0;

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
	private int anInt722 = -1;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
	private int anInt721 = -1;

	@OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
	private int anInt725 = 0;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	public Class8_Sub1_Sub3() {
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIII)V")
	public Class8_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray47 = new int[6];
		this.anIntArray47[0] = arg0;
		this.anIntArray47[1] = arg1;
		this.anIntArray47[2] = arg2;
		this.anIntArray47[3] = arg3;
		this.anIntArray47[4] = arg4;
		this.anIntArray47[5] = arg5;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
	public void method487() {
		@Pc(1) GL local1 = Static116.aGL1;
		this.method491();
		local1.glBindTexture(34067, this.anInt721);
		if (this.anIntArray47 == null || this.anInt723 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method493()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray47[local22];
				this.anInt722 = Static96.anInterface4_1.method1272(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt722;
				} else if (this.anInt722 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static96.anInterface4_1.method1264(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static166.anInt3351 += local22 - this.anInt725;
			this.anInt725 = local22;
			this.anInt723 = 2;
		} else if (this.anInt723 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static96.anIntArray135, Static96.anInterface4_1.method1259(this.anIntArray47[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static166.anInt3351 += 3 - this.anInt725;
				this.anInt725 = 3;
			}
			this.anInt723 = 1;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!bn;Lclient!bn;F)Lclient!bn;")
	public Class8_Sub1_Sub3 method489(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(10) Class8_Sub1_Sub3 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static116.aBoolean201) {
			return local10;
		}
		this.method491();
		@Pc(31) int local31;
		if (Static29.anIntArray48 == null || Static29.anInt724 != Static166.anInt3350) {
			Static29.anIntArray48 = new int[2];
			local1.glGenTextures(2, Static29.anIntArray48, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static116.method1897(Static29.anIntArray48[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static29.anInt724 = Static166.anInt3350;
		}
		local31 = arg0.anInt722 > arg1.anInt722 ? arg0.anInt722 : arg1.anInt722;
		if (this.anInt722 != local31) {
			this.anInt722 = local31;
			local1.glBindTexture(34067, this.anInt721);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt722, this.anInt722, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method487();
		arg1.method487();
		Static126.method2005(Static29.anIntArray49);
		Static126.method1999();
		Static251.method3769(Static116.method1891());
		local1.glPushAttrib(2048);
		Static116.method1885(false);
		Static116.method1883(false);
		Static116.method1871(false);
		Static116.method1884(1);
		Static116.method1889(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt722, 0.0D, (double) this.anInt722, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt722, this.anInt722);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static29.anIntArray48[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static29.aFloatArray1[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static29.aFloatArray1, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static29.method490(local1, arg0.anInt721, local212, arg0.anInt722, Static29.anIntArray48[0])) {
				local203 = false;
				break;
			}
			if (!Static29.method490(local1, arg1.anInt721, local212, arg1.anInt722, Static29.anIntArray48[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt721, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static116.method1897(Static29.anIntArray48[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt722, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt722, this.anInt722);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt722);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static116.method1871(true);
		Static116.method1883(true);
		Static116.method1885(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static251.method3770();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static126.method2003(Static29.anIntArray49);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "()V")
	private void method491() {
		if (this.anInt721 >= 0 && this.anInt720 == Static166.anInt3350) {
			return;
		}
		@Pc(8) GL local8 = Static116.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt721 = local11[0];
		local8.glBindTexture(34067, this.anInt721);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt720 = Static166.anInt3350;
		this.anInt723 = 0;
	}

	@OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt721 != -1) {
			Static166.method2639(this.anInt721, this.anInt725, this.anInt720);
			this.anInt721 = -1;
			this.anInt725 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "()Z")
	private boolean method493() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static96.anInterface4_1.method1263(this.anIntArray47[local1])) {
				return false;
			}
		}
		return true;
	}
}
