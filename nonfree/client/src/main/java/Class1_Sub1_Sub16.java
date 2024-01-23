import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!of", name = "y", descriptor = "I")
	private int anInt3983;

	@OriginalMember(owner = "client!of", name = "E", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!of", name = "x", descriptor = "I")
	private int anInt3982 = -1;

	@OriginalMember(owner = "client!of", name = "F", descriptor = "I")
	private int anInt3986 = 0;

	@OriginalMember(owner = "client!of", name = "D", descriptor = "I")
	private int anInt3985 = -1;

	@OriginalMember(owner = "client!of", name = "G", descriptor = "I")
	private int anInt3987 = 0;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIII)V")
	public Class1_Sub1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anIntArray323 = new int[6];
		this.anIntArray323[0] = arg0;
		this.anIntArray323[1] = arg1;
		this.anIntArray323[2] = arg2;
		this.anIntArray323[3] = arg3;
		this.anIntArray323[4] = arg4;
		this.anIntArray323[5] = arg5;
	}

	@OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt3985 != -1) {
			Static74.method1189(this.anInt3985, this.anInt3986, this.anInt3983);
			this.anInt3985 = -1;
			this.anInt3986 = 0;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
	public void method3197() {
		@Pc(1) GL local1 = Static291.aGL1;
		this.method3201();
		local1.glBindTexture(34067, this.anInt3985);
		if (this.anIntArray323 == null || this.anInt3987 == 2) {
			return;
		}
		@Pc(20) int local20;
		if (this.method3202()) {
			local20 = -1;
			@Pc(22) int local22;
			for (local22 = 0; local22 < 6; local22++) {
				@Pc(30) int local30 = this.anIntArray323[local22];
				this.anInt3982 = Static18.anInterface1_1.method1638(local30) ? 64 : 128;
				if (local22 <= 0) {
					local20 = this.anInt3982;
				} else if (this.anInt3982 != local20) {
					throw new RuntimeException("");
				}
				@Pc(60) IntBuffer local60 = IntBuffer.wrap(Static18.anInterface1_1.method1627(local30));
				local1.glTexImage2D(local22 + 34069, 0, 6407, local20, local20, 0, 32993, 5121, local60);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
			local22 = local20 * local20 * 6 * 3;
			Static74.anInt1418 += local22 - this.anInt3986;
			this.anInt3986 = local22;
			this.anInt3987 = 2;
		} else if (this.anInt3987 != 1) {
			for (local20 = 0; local20 < 6; local20++) {
				@Pc(127) IntBuffer local127 = IntBuffer.wrap(Static18.anIntArray26, Static18.anInterface1_1.method1625(this.anIntArray323[local20]), 1);
				local1.glTexImage2D(local20 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, local127);
				Static74.anInt1418 += 3 - this.anInt3986;
				this.anInt3986 = 3;
			}
			this.anInt3987 = 1;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!of;Lclient!of;F)Lclient!of;")
	public Class1_Sub1_Sub16 method3200(@OriginalArg(0) Class1_Sub1_Sub16 arg0, @OriginalArg(1) Class1_Sub1_Sub16 arg1, @OriginalArg(2) float arg2) {
		@Pc(1) GL local1 = Static291.aGL1;
		@Pc(10) Class1_Sub1_Sub16 local10 = (double) arg2 < 0.5D ? arg0 : arg1;
		if (!Static291.aBoolean397) {
			return local10;
		}
		this.method3201();
		@Pc(31) int local31;
		if (Static196.anIntArray321 == null || Static196.anInt3984 != Static74.anInt1419) {
			Static196.anIntArray321 = new int[2];
			local1.glGenTextures(2, Static196.anIntArray321, 0);
			for (local31 = 0; local31 < 2; local31++) {
				Static291.method4310(Static196.anIntArray321[local31]);
				local1.glTexParameteri(3553, 10241, 9728);
				local1.glTexParameteri(3553, 10240, 9728);
			}
			Static196.anInt3984 = Static74.anInt1419;
		}
		local31 = arg0.anInt3982 > arg1.anInt3982 ? arg0.anInt3982 : arg1.anInt3982;
		if (this.anInt3982 != local31) {
			this.anInt3982 = local31;
			local1.glBindTexture(34067, this.anInt3985);
			for (@Pc(77) int local77 = 0; local77 < 6; local77++) {
				local1.glTexImage2D(local77 + 34069, 0, 6407, this.anInt3982, this.anInt3982, 0, 6407, 5121, null);
			}
			local1.glTexParameteri(34067, 10241, 9729);
			local1.glTexParameteri(34067, 10240, 9729);
		}
		arg0.method3197();
		arg1.method3197();
		Static133.method2169(Static196.anIntArray322);
		Static133.method2166();
		Static180.method2958(Static291.method4313());
		local1.glPushAttrib(2048);
		Static291.method4321(false);
		Static291.method4331(false);
		Static291.method4292(false);
		Static291.method4296(1);
		Static291.method4323(1);
		local1.glDisable(3042);
		local1.glDisable(3008);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho(0.0D, (double) this.anInt3982, 0.0D, (double) this.anInt3982, -1.0D, 1.0D);
		local1.glViewport(0, 0, this.anInt3982, this.anInt3982);
		local1.glActiveTexture(33985);
		local1.glBindTexture(3553, Static196.anIntArray321[1]);
		local1.glTexEnvi(8960, 34161, 34165);
		local1.glTexEnvi(8960, 34162, 34165);
		Static196.aFloatArray26[3] = arg2;
		local1.glTexEnvfv(8960, 8705, Static196.aFloatArray26, 0);
		local1.glEnable(3553);
		local1.glActiveTexture(33984);
		@Pc(203) boolean local203 = true;
		for (@Pc(205) int local205 = 0; local205 < 6; local205++) {
			@Pc(212) int local212 = local205 + 34069;
			if (!Static196.method3203(local1, arg0.anInt3985, local212, arg0.anInt3982, Static196.anIntArray321[0])) {
				local203 = false;
				break;
			}
			if (!Static196.method3203(local1, arg1.anInt3985, local212, arg1.anInt3982, Static196.anIntArray321[1])) {
				local203 = false;
				break;
			}
			local1.glFramebufferTexture2DEXT(36160, 36064, local212, this.anInt3985, 0);
			local1.glDrawBuffer(36064);
			@Pc(255) int local255 = local1.glCheckFramebufferStatusEXT(36160);
			if (local255 != 36053) {
				local203 = false;
				break;
			}
			Static291.method4310(Static196.anIntArray321[0]);
			local1.glBegin(7);
			local1.glTexCoord2i(0, 0);
			local1.glMultiTexCoord2i(33985, 0, 0);
			local1.glVertex2i(0, 0);
			local1.glTexCoord2i(1, 0);
			local1.glMultiTexCoord2i(33985, 1, 0);
			local1.glVertex2i(this.anInt3982, 0);
			local1.glTexCoord2i(1, 1);
			local1.glMultiTexCoord2i(33985, 1, 1);
			local1.glVertex2i(this.anInt3982, this.anInt3982);
			local1.glTexCoord2i(0, 1);
			local1.glMultiTexCoord2i(33985, 0, 1);
			local1.glVertex2i(0, this.anInt3982);
			local1.glEnd();
		}
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		Static291.method4292(true);
		Static291.method4331(true);
		Static291.method4321(true);
		local1.glEnable(3008);
		local1.glEnable(3042);
		local1.glPopAttrib();
		Static180.method2964();
		local1.glActiveTexture(33985);
		local1.glTexEnvi(8960, 34161, 8448);
		local1.glTexEnvi(8960, 34162, 8448);
		local1.glDisable(3553);
		local1.glActiveTexture(33984);
		Static133.method2167(Static196.anIntArray322);
		return local203 ? this : local10;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "()V")
	private void method3201() {
		if (this.anInt3985 >= 0 && this.anInt3983 == Static74.anInt1419) {
			return;
		}
		@Pc(8) GL local8 = Static291.aGL1;
		@Pc(11) int[] local11 = new int[1];
		local8.glGenTextures(1, local11, 0);
		this.anInt3985 = local11[0];
		local8.glBindTexture(34067, this.anInt3985);
		local8.glTexParameteri(34067, 32882, 33071);
		local8.glTexParameteri(34067, 10242, 33071);
		local8.glTexParameteri(34067, 10243, 33071);
		this.anInt3983 = Static74.anInt1419;
		this.anInt3987 = 0;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()Z")
	private boolean method3202() {
		for (@Pc(1) int local1 = 0; local1 < 6; local1++) {
			if (!Static18.anInterface1_1.method1637(this.anIntArray323[local1])) {
				return false;
			}
		}
		return true;
	}
}
