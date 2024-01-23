import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class4_Sub2_Sub12_Sub2 extends Class4_Sub2_Sub12 {

	@OriginalMember(owner = "client!vg", name = "H", descriptor = "[I")
	private int[] anIntArray471;

	@OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
	private int anInt5282;

	@OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
	private int anInt5283;

	@OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
	private int anInt5284 = 0;

	@OriginalMember(owner = "client!vg", name = "S", descriptor = "I")
	private int anInt5285 = -1;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class4_Sub2_Sub12_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.method4201(arg5);
		this.method4200();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method4175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Static178.method2758();
		@Pc(2) GL local2 = Static178.aGL1;
		Static178.method2763(this.anInt5285);
		local2.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
		local2.glTranslatef((float) arg1, (float) (Static178.anInt3505 - arg2), 0.0F);
		local2.glCallList(this.anIntArray471[arg0]);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "()V")
	private void method4200() {
		if (this.anIntArray471 != null) {
			return;
		}
		this.anIntArray471 = new int[256];
		@Pc(9) GL local9 = Static178.aGL1;
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(21) float local21 = (float) (local11 % 16) / 16.0F;
			@Pc(28) float local28 = (float) (local11 / 16) / 16.0F;
			@Pc(40) float local40 = local21 + (float) this.anIntArray467[local11] / (float) this.anInt5282;
			@Pc(52) float local52 = local28 + (float) this.anIntArray465[local11] / (float) this.anInt5282;
			this.anIntArray471[local11] = local9.glGenLists(1);
			local9.glNewList(this.anIntArray471[local11], 4864);
			local9.glBegin(6);
			local9.glTexCoord2f(local40, local28);
			local9.glVertex2f((float) this.anIntArray467[local11], 0.0F);
			local9.glTexCoord2f(local21, local28);
			local9.glVertex2f(0.0F, 0.0F);
			local9.glTexCoord2f(local21, local52);
			local9.glVertex2f(0.0F, (float) -this.anIntArray465[local11]);
			local9.glTexCoord2f(local40, local52);
			local9.glVertex2f((float) this.anIntArray467[local11], (float) -this.anIntArray465[local11]);
			local9.glEnd();
			local9.glEndList();
		}
		this.anInt5283 = Static163.anInt3218;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method4183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) GL local4;
		if (Static186.aClass4_Sub2_Sub1_Sub2_1 == null) {
			Static178.method2758();
			local4 = Static178.aGL1;
			Static178.method2763(this.anInt5285);
			local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
			local4.glTranslatef((float) arg1, (float) (Static178.anInt3505 - arg2), 0.0F);
			local4.glCallList(this.anIntArray471[arg0]);
			local4.glLoadIdentity();
			return;
		}
		Static178.method2758();
		local4 = Static178.aGL1;
		local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
		local4.glTranslatef((float) arg1, (float) (Static178.anInt3505 - arg2), 0.0F);
		@Pc(32) float local32 = (float) (arg0 % 16) / 16.0F;
		@Pc(39) float local39 = (float) (arg0 / 16) / 16.0F;
		@Pc(51) float local51 = local32 + (float) this.anIntArray467[arg0] / (float) this.anInt5282;
		@Pc(63) float local63 = local39 + (float) this.anIntArray465[arg0] / (float) this.anInt5282;
		Static178.method2763(this.anInt5285);
		@Pc(68) Class4_Sub2_Sub1_Sub2 local68 = Static186.aClass4_Sub2_Sub1_Sub2_1;
		local4.glActiveTexture(33985);
		local4.glEnable(3553);
		local4.glBindTexture(3553, local68.anInt3277);
		local4.glTexEnvi(8960, 34161, 7681);
		local4.glTexEnvi(8960, 34176, 34168);
		@Pc(98) float local98 = (float) (arg1 - Static186.anInt3728) / (float) local68.anInt3276;
		@Pc(107) float local107 = (float) (arg2 - Static186.anInt3729) / (float) local68.anInt3278;
		@Pc(118) float local118 = (float) (arg1 + arg3 - Static186.anInt3728) / (float) local68.anInt3276;
		@Pc(129) float local129 = (float) (arg2 + arg4 - Static186.anInt3729) / (float) local68.anInt3278;
		local4.glBegin(6);
		local4.glMultiTexCoord2f(33985, local118, local107);
		local4.glTexCoord2f(local51, local39);
		local4.glVertex2f((float) this.anIntArray467[arg0], 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local107);
		local4.glTexCoord2f(local32, local39);
		local4.glVertex2f(0.0F, 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local129);
		local4.glTexCoord2f(local32, local63);
		local4.glVertex2f(0.0F, (float) -this.anIntArray465[arg0]);
		local4.glMultiTexCoord2f(33985, local118, local129);
		local4.glTexCoord2f(local51, local63);
		local4.glVertex2f((float) this.anIntArray467[arg0], (float) -this.anIntArray465[arg0]);
		local4.glEnd();
		local4.glTexEnvi(8960, 34161, 8448);
		local4.glTexEnvi(8960, 34176, 5890);
		local4.glDisable(3553);
		local4.glActiveTexture(33984);
		local4.glLoadIdentity();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "([[B)V")
	private void method4201(@OriginalArg(0) byte[][] arg0) {
		if (this.anInt5285 != -1) {
			return;
		}
		this.anInt5282 = 0;
		@Pc(9) int local9;
		for (local9 = 0; local9 < 256; local9++) {
			if (this.anIntArray465[local9] > this.anInt5282) {
				this.anInt5282 = this.anIntArray465[local9];
			}
			if (this.anIntArray467[local9] > this.anInt5282) {
				this.anInt5282 = this.anIntArray467[local9];
			}
		}
		this.anInt5282 *= 16;
		this.anInt5282 = Static74.method1127(this.anInt5282);
		local9 = this.anInt5282 / 16;
		@Pc(66) byte[] local66 = new byte[this.anInt5282 * this.anInt5282 * 2];
		for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
			@Pc(77) int local77 = local68 % 16 * local9;
			@Pc(83) int local83 = local68 / 16 * local9;
			@Pc(92) int local92 = (local83 * this.anInt5282 + local77) * 2;
			@Pc(94) int local94 = 0;
			@Pc(99) int local99 = this.anIntArray465[local68];
			@Pc(104) int local104 = this.anIntArray467[local68];
			@Pc(108) byte[] local108 = arg0[local68];
			for (@Pc(110) int local110 = 0; local110 < local99; local110++) {
				for (@Pc(115) int local115 = 0; local115 < local104; local115++) {
					if (local108[local94++] == 0) {
						local92 += 2;
					} else {
						local66[local92++] = -1;
						local66[local92++] = -1;
					}
				}
				local92 += (this.anInt5282 - local104) * 2;
			}
		}
		@Pc(153) ByteBuffer local153 = ByteBuffer.wrap(local66);
		@Pc(155) GL local155 = Static178.aGL1;
		if (this.anInt5285 == -1) {
			@Pc(162) int[] local162 = new int[1];
			local155.glGenTextures(1, local162, 0);
			this.anInt5285 = local162[0];
			this.anInt5283 = Static163.anInt3218;
		}
		Static178.method2763(this.anInt5285);
		local155.glTexImage2D(3553, 0, 6410, this.anInt5282, this.anInt5282, 0, 6410, 5121, local153);
		Static163.anInt3220 += local153.limit() - this.anInt5284;
		this.anInt5284 = local153.limit();
		local155.glTexParameteri(3553, 10241, 9728);
		local155.glTexParameteri(3553, 10240, 9728);
	}

	@OriginalMember(owner = "client!vg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5285 != -1) {
			Static163.method2531(this.anInt5285, this.anInt5284, this.anInt5283);
			this.anInt5285 = -1;
			this.anInt5284 = 0;
		}
		if (this.anIntArray471 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray471.length; local21++) {
				Static163.method2528(this.anIntArray471[local21], this.anInt5283);
			}
			this.anIntArray471 = null;
		}
		super.finalize();
	}
}
