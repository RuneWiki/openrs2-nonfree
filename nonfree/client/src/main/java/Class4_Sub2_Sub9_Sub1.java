import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class4_Sub2_Sub9_Sub1 extends Class4_Sub2_Sub9 {

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
	private int anInt2079;

	@OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
	private int anInt2080;

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	private int anInt2078 = 0;

	@OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
	private int anInt2081 = -1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class4_Sub2_Sub9_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.method1776(arg5);
		this.method1777();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([[B)V")
	private void method1776(@OriginalArg(0) byte[][] arg0) {
		if (this.anInt2081 != -1) {
			return;
		}
		this.anInt2080 = 0;
		@Pc(9) int local9;
		for (local9 = 0; local9 < 256; local9++) {
			if (this.anIntArray406[local9] > this.anInt2080) {
				this.anInt2080 = this.anIntArray406[local9];
			}
			if (this.anIntArray403[local9] > this.anInt2080) {
				this.anInt2080 = this.anIntArray403[local9];
			}
		}
		this.anInt2080 *= 16;
		this.anInt2080 = Static308.method4715(this.anInt2080);
		local9 = this.anInt2080 / 16;
		@Pc(66) byte[] local66 = new byte[this.anInt2080 * this.anInt2080 * 2];
		for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
			@Pc(77) int local77 = local68 % 16 * local9;
			@Pc(83) int local83 = local68 / 16 * local9;
			@Pc(92) int local92 = (local83 * this.anInt2080 + local77) * 2;
			@Pc(94) int local94 = 0;
			@Pc(99) int local99 = this.anIntArray406[local68];
			@Pc(104) int local104 = this.anIntArray403[local68];
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
				local92 += (this.anInt2080 - local104) * 2;
			}
		}
		@Pc(153) ByteBuffer local153 = ByteBuffer.wrap(local66);
		@Pc(155) GL local155 = Static251.aGL1;
		if (this.anInt2081 == -1) {
			@Pc(162) int[] local162 = new int[1];
			local155.glGenTextures(1, local162, 0);
			this.anInt2081 = local162[0];
			this.anInt2079 = Static239.anInt4726;
		}
		Static251.method3892(this.anInt2081);
		local155.glTexImage2D(3553, 0, 6410, this.anInt2080, this.anInt2080, 0, 6410, 5121, local153);
		Static239.anInt4725 += local153.limit() - this.anInt2078;
		this.anInt2078 = local153.limit();
		local155.glTexParameteri(3553, 10241, 9728);
		local155.glTexParameteri(3553, 10240, 9728);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method4103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) GL local4;
		if (Static87.aClass4_Sub2_Sub4_Sub1_1 == null) {
			Static251.method3885();
			local4 = Static251.aGL1;
			Static251.method3892(this.anInt2081);
			local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
			local4.glTranslatef((float) arg1, (float) (Static251.anInt4925 - arg2), 0.0F);
			local4.glCallList(this.anIntArray182[arg0]);
			local4.glLoadIdentity();
			return;
		}
		Static251.method3885();
		local4 = Static251.aGL1;
		local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
		local4.glTranslatef((float) arg1, (float) (Static251.anInt4925 - arg2), 0.0F);
		@Pc(32) float local32 = (float) (arg0 % 16) / 16.0F;
		@Pc(39) float local39 = (float) (arg0 / 16) / 16.0F;
		@Pc(51) float local51 = local32 + (float) this.anIntArray403[arg0] / (float) this.anInt2080;
		@Pc(63) float local63 = local39 + (float) this.anIntArray406[arg0] / (float) this.anInt2080;
		Static251.method3892(this.anInt2081);
		@Pc(68) Class4_Sub2_Sub4_Sub1 local68 = Static87.aClass4_Sub2_Sub4_Sub1_1;
		local4.glActiveTexture(33985);
		local4.glEnable(3553);
		local4.glBindTexture(3553, local68.anInt3071);
		local4.glTexEnvi(8960, 34161, 7681);
		local4.glTexEnvi(8960, 34176, 34168);
		@Pc(98) float local98 = (float) (arg1 - Static87.anInt1759) / (float) local68.anInt3076;
		@Pc(107) float local107 = (float) (arg2 - Static87.anInt1760) / (float) local68.anInt3072;
		@Pc(118) float local118 = (float) (arg1 + arg3 - Static87.anInt1759) / (float) local68.anInt3076;
		@Pc(129) float local129 = (float) (arg2 + arg4 - Static87.anInt1760) / (float) local68.anInt3072;
		local4.glBegin(6);
		local4.glMultiTexCoord2f(33985, local118, local107);
		local4.glTexCoord2f(local51, local39);
		local4.glVertex2f((float) this.anIntArray403[arg0], 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local107);
		local4.glTexCoord2f(local32, local39);
		local4.glVertex2f(0.0F, 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local129);
		local4.glTexCoord2f(local32, local63);
		local4.glVertex2f(0.0F, (float) -this.anIntArray406[arg0]);
		local4.glMultiTexCoord2f(33985, local118, local129);
		local4.glTexCoord2f(local51, local63);
		local4.glVertex2f((float) this.anIntArray403[arg0], (float) -this.anIntArray406[arg0]);
		local4.glEnd();
		local4.glTexEnvi(8960, 34161, 8448);
		local4.glTexEnvi(8960, 34176, 5890);
		local4.glDisable(3553);
		local4.glActiveTexture(33984);
		local4.glLoadIdentity();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Static251.method3885();
		@Pc(2) GL local2 = Static251.aGL1;
		Static251.method3892(this.anInt2081);
		local2.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
		local2.glTranslatef((float) arg1, (float) (Static251.anInt4925 - arg2), 0.0F);
		local2.glCallList(this.anIntArray182[arg0]);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2081 != -1) {
			Static239.method3675(this.anInt2081, this.anInt2078, this.anInt2079);
			this.anInt2081 = -1;
			this.anInt2078 = 0;
		}
		if (this.anIntArray182 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray182.length; local21++) {
				Static239.method3681(this.anIntArray182[local21], this.anInt2079);
			}
			this.anIntArray182 = null;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()V")
	private void method1777() {
		if (this.anIntArray182 != null) {
			return;
		}
		this.anIntArray182 = new int[256];
		@Pc(9) GL local9 = Static251.aGL1;
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(21) float local21 = (float) (local11 % 16) / 16.0F;
			@Pc(28) float local28 = (float) (local11 / 16) / 16.0F;
			@Pc(40) float local40 = local21 + (float) this.anIntArray403[local11] / (float) this.anInt2080;
			@Pc(52) float local52 = local28 + (float) this.anIntArray406[local11] / (float) this.anInt2080;
			this.anIntArray182[local11] = local9.glGenLists(1);
			local9.glNewList(this.anIntArray182[local11], 4864);
			local9.glBegin(6);
			local9.glTexCoord2f(local40, local28);
			local9.glVertex2f((float) this.anIntArray403[local11], 0.0F);
			local9.glTexCoord2f(local21, local28);
			local9.glVertex2f(0.0F, 0.0F);
			local9.glTexCoord2f(local21, local52);
			local9.glVertex2f(0.0F, (float) -this.anIntArray406[local11]);
			local9.glTexCoord2f(local40, local52);
			local9.glVertex2f((float) this.anIntArray403[local11], (float) -this.anIntArray406[local11]);
			local9.glEnd();
			local9.glEndList();
		}
		this.anInt2079 = Static239.anInt4726;
	}
}
