import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub5_Sub9_Sub1 extends Class1_Sub5_Sub9 {

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
	private int anInt2739;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
	private int anInt2741;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	private int anInt2740 = -1;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	private int anInt2742 = 0;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub5_Sub9_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.method2463(arg5);
		this.method2462();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	private void method2462() {
		if (this.anIntArray236 != null) {
			return;
		}
		this.anIntArray236 = new int[256];
		@Pc(9) GL local9 = Static71.aGL1;
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(21) float local21 = (float) (local11 % 16) / 16.0F;
			@Pc(28) float local28 = (float) (local11 / 16) / 16.0F;
			@Pc(40) float local40 = local21 + (float) this.anIntArray306[local11] / (float) this.anInt2739;
			@Pc(52) float local52 = local28 + (float) this.anIntArray303[local11] / (float) this.anInt2739;
			this.anIntArray236[local11] = local9.glGenLists(1);
			local9.glNewList(this.anIntArray236[local11], 4864);
			local9.glBegin(6);
			local9.glTexCoord2f(local40, local28);
			local9.glVertex2f((float) this.anIntArray306[local11], 0.0F);
			local9.glTexCoord2f(local21, local28);
			local9.glVertex2f(0.0F, 0.0F);
			local9.glTexCoord2f(local21, local52);
			local9.glVertex2f(0.0F, (float) -this.anIntArray303[local11]);
			local9.glTexCoord2f(local40, local52);
			local9.glVertex2f((float) this.anIntArray306[local11], (float) -this.anIntArray303[local11]);
			local9.glEnd();
			local9.glEndList();
		}
		this.anInt2741 = Static162.anInt3245;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([[B)V")
	private void method2463(@OriginalArg(0) byte[][] arg0) {
		if (this.anInt2740 != -1) {
			return;
		}
		this.anInt2739 = 0;
		@Pc(9) int local9;
		for (local9 = 0; local9 < 256; local9++) {
			if (this.anIntArray303[local9] > this.anInt2739) {
				this.anInt2739 = this.anIntArray303[local9];
			}
			if (this.anIntArray306[local9] > this.anInt2739) {
				this.anInt2739 = this.anIntArray306[local9];
			}
		}
		this.anInt2739 *= 16;
		this.anInt2739 = Static138.method3842(this.anInt2739);
		local9 = this.anInt2739 / 16;
		@Pc(66) byte[] local66 = new byte[this.anInt2739 * this.anInt2739 * 2];
		for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
			@Pc(77) int local77 = local68 % 16 * local9;
			@Pc(83) int local83 = local68 / 16 * local9;
			@Pc(92) int local92 = (local83 * this.anInt2739 + local77) * 2;
			@Pc(94) int local94 = 0;
			@Pc(99) int local99 = this.anIntArray303[local68];
			@Pc(104) int local104 = this.anIntArray306[local68];
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
				local92 += (this.anInt2739 - local104) * 2;
			}
		}
		@Pc(153) ByteBuffer local153 = ByteBuffer.wrap(local66);
		@Pc(155) GL local155 = Static71.aGL1;
		if (this.anInt2740 == -1) {
			@Pc(162) int[] local162 = new int[1];
			local155.glGenTextures(1, local162, 0);
			this.anInt2740 = local162[0];
			this.anInt2741 = Static162.anInt3245;
		}
		Static71.method1400(this.anInt2740);
		local155.glTexImage2D(3553, 0, 6410, this.anInt2739, this.anInt2739, 0, 6410, 5121, local153);
		Static162.anInt3247 += local153.limit() - this.anInt2742;
		this.anInt2742 = local153.limit();
		local155.glTexParameteri(3553, 10241, 9728);
		local155.glTexParameteri(3553, 10240, 9728);
	}

	@OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt2740 != -1) {
			Static162.method2793(this.anInt2740, this.anInt2742, this.anInt2741);
			this.anInt2740 = -1;
			this.anInt2742 = 0;
		}
		if (this.anIntArray236 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray236.length; local21++) {
				Static162.method2797(this.anIntArray236[local21], this.anInt2741);
			}
			this.anIntArray236 = null;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method2869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) GL local4;
		if (Static93.aClass1_Sub5_Sub6_Sub2_1 == null) {
			Static71.method1390();
			local4 = Static71.aGL1;
			Static71.method1400(this.anInt2740);
			local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
			local4.glTranslatef((float) arg1, (float) (Static71.anInt1537 - arg2), 0.0F);
			local4.glCallList(this.anIntArray236[arg0]);
			local4.glLoadIdentity();
			return;
		}
		Static71.method1390();
		local4 = Static71.aGL1;
		local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
		local4.glTranslatef((float) arg1, (float) (Static71.anInt1537 - arg2), 0.0F);
		@Pc(32) float local32 = (float) (arg0 % 16) / 16.0F;
		@Pc(39) float local39 = (float) (arg0 / 16) / 16.0F;
		@Pc(51) float local51 = local32 + (float) this.anIntArray306[arg0] / (float) this.anInt2739;
		@Pc(63) float local63 = local39 + (float) this.anIntArray303[arg0] / (float) this.anInt2739;
		Static71.method1400(this.anInt2740);
		@Pc(68) Class1_Sub5_Sub6_Sub2 local68 = Static93.aClass1_Sub5_Sub6_Sub2_1;
		local4.glActiveTexture(33985);
		local4.glEnable(3553);
		local4.glBindTexture(3553, local68.anInt3630);
		local4.glTexEnvi(8960, 34161, 7681);
		local4.glTexEnvi(8960, 34176, 34168);
		@Pc(98) float local98 = (float) (arg1 - Static93.anInt1944) / (float) local68.anInt3628;
		@Pc(107) float local107 = (float) (arg2 - Static93.anInt1942) / (float) local68.anInt3632;
		@Pc(118) float local118 = (float) (arg1 + arg3 - Static93.anInt1944) / (float) local68.anInt3628;
		@Pc(129) float local129 = (float) (arg2 + arg4 - Static93.anInt1942) / (float) local68.anInt3632;
		local4.glBegin(6);
		local4.glMultiTexCoord2f(33985, local118, local107);
		local4.glTexCoord2f(local51, local39);
		local4.glVertex2f((float) this.anIntArray306[arg0], 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local107);
		local4.glTexCoord2f(local32, local39);
		local4.glVertex2f(0.0F, 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local129);
		local4.glTexCoord2f(local32, local63);
		local4.glVertex2f(0.0F, (float) -this.anIntArray303[arg0]);
		local4.glMultiTexCoord2f(33985, local118, local129);
		local4.glTexCoord2f(local51, local63);
		local4.glVertex2f((float) this.anIntArray306[arg0], (float) -this.anIntArray303[arg0]);
		local4.glEnd();
		local4.glTexEnvi(8960, 34161, 8448);
		local4.glTexEnvi(8960, 34176, 5890);
		local4.glDisable(3553);
		local4.glActiveTexture(33984);
		local4.glLoadIdentity();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method2876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Static71.method1390();
		@Pc(2) GL local2 = Static71.aGL1;
		Static71.method1400(this.anInt2740);
		local2.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
		local2.glTranslatef((float) arg1, (float) (Static71.anInt1537 - arg2), 0.0F);
		local2.glCallList(this.anIntArray236[arg0]);
		local2.glLoadIdentity();
	}
}
