import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class1_Sub2_Sub12_Sub2 extends Class1_Sub2_Sub12 {

	@OriginalMember(owner = "client!w", name = "db", descriptor = "I")
	private int anInt5701;

	@OriginalMember(owner = "client!w", name = "fb", descriptor = "[I")
	private int[] anIntArray676;

	@OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
	private int anInt5703;

	@OriginalMember(owner = "client!w", name = "cb", descriptor = "I")
	private int anInt5700 = -1;

	@OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
	private int anInt5702 = 0;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class1_Sub2_Sub12_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.method4401(arg5);
		this.method4402();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Static240.method3796();
		@Pc(2) GL local2 = Static240.aGL1;
		Static240.method3789(this.anInt5700);
		local2.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
		local2.glTranslatef((float) arg1, (float) (Static240.anInt4961 - arg2), 0.0F);
		local2.glCallList(this.anIntArray676[arg0]);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([[B)V")
	private void method4401(@OriginalArg(0) byte[][] arg0) {
		if (this.anInt5700 != -1) {
			return;
		}
		this.anInt5701 = 0;
		@Pc(9) int local9;
		for (local9 = 0; local9 < 256; local9++) {
			if (this.anIntArray672[local9] > this.anInt5701) {
				this.anInt5701 = this.anIntArray672[local9];
			}
			if (this.anIntArray673[local9] > this.anInt5701) {
				this.anInt5701 = this.anIntArray673[local9];
			}
		}
		this.anInt5701 *= 16;
		this.anInt5701 = Static182.method2762(this.anInt5701);
		local9 = this.anInt5701 / 16;
		@Pc(66) byte[] local66 = new byte[this.anInt5701 * this.anInt5701 * 2];
		for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
			@Pc(77) int local77 = local68 % 16 * local9;
			@Pc(83) int local83 = local68 / 16 * local9;
			@Pc(92) int local92 = (local83 * this.anInt5701 + local77) * 2;
			@Pc(94) int local94 = 0;
			@Pc(99) int local99 = this.anIntArray672[local68];
			@Pc(104) int local104 = this.anIntArray673[local68];
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
				local92 += (this.anInt5701 - local104) * 2;
			}
		}
		@Pc(153) ByteBuffer local153 = ByteBuffer.wrap(local66);
		@Pc(155) GL local155 = Static240.aGL1;
		if (this.anInt5700 == -1) {
			@Pc(162) int[] local162 = new int[1];
			local155.glGenTextures(1, local162, 0);
			this.anInt5700 = local162[0];
			this.anInt5703 = Static154.anInt2852;
		}
		Static240.method3789(this.anInt5700);
		local155.glTexImage2D(3553, 0, 6410, this.anInt5701, this.anInt5701, 0, 6410, 5121, local153);
		Static154.anInt2854 += local153.limit() - this.anInt5702;
		this.anInt5702 = local153.limit();
		local155.glTexParameteri(3553, 10241, 9728);
		local155.glTexParameteri(3553, 10240, 9728);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	private void method4402() {
		if (this.anIntArray676 != null) {
			return;
		}
		this.anIntArray676 = new int[256];
		@Pc(9) GL local9 = Static240.aGL1;
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(21) float local21 = (float) (local11 % 16) / 16.0F;
			@Pc(28) float local28 = (float) (local11 / 16) / 16.0F;
			@Pc(40) float local40 = local21 + (float) this.anIntArray673[local11] / (float) this.anInt5701;
			@Pc(52) float local52 = local28 + (float) this.anIntArray672[local11] / (float) this.anInt5701;
			this.anIntArray676[local11] = local9.glGenLists(1);
			local9.glNewList(this.anIntArray676[local11], 4864);
			local9.glBegin(6);
			local9.glTexCoord2f(local40, local28);
			local9.glVertex2f((float) this.anIntArray673[local11], 0.0F);
			local9.glTexCoord2f(local21, local28);
			local9.glVertex2f(0.0F, 0.0F);
			local9.glTexCoord2f(local21, local52);
			local9.glVertex2f(0.0F, (float) -this.anIntArray672[local11]);
			local9.glTexCoord2f(local40, local52);
			local9.glVertex2f((float) this.anIntArray673[local11], (float) -this.anIntArray672[local11]);
			local9.glEnd();
			local9.glEndList();
		}
		this.anInt5703 = Static154.anInt2852;
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt5700 != -1) {
			Static154.method2370(this.anInt5700, this.anInt5702, this.anInt5703);
			this.anInt5700 = -1;
			this.anInt5702 = 0;
		}
		if (this.anIntArray676 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray676.length; local21++) {
				Static154.method2378(this.anIntArray676[local21], this.anInt5703);
			}
			this.anIntArray676 = null;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method4374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) GL local4;
		if (Static50.aClass1_Sub2_Sub2_Sub2_1 == null) {
			Static240.method3796();
			local4 = Static240.aGL1;
			Static240.method3789(this.anInt5700);
			local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
			local4.glTranslatef((float) arg1, (float) (Static240.anInt4961 - arg2), 0.0F);
			local4.glCallList(this.anIntArray676[arg0]);
			local4.glLoadIdentity();
			return;
		}
		Static240.method3796();
		local4 = Static240.aGL1;
		local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
		local4.glTranslatef((float) arg1, (float) (Static240.anInt4961 - arg2), 0.0F);
		@Pc(32) float local32 = (float) (arg0 % 16) / 16.0F;
		@Pc(39) float local39 = (float) (arg0 / 16) / 16.0F;
		@Pc(51) float local51 = local32 + (float) this.anIntArray673[arg0] / (float) this.anInt5701;
		@Pc(63) float local63 = local39 + (float) this.anIntArray672[arg0] / (float) this.anInt5701;
		Static240.method3789(this.anInt5700);
		@Pc(68) Class1_Sub2_Sub2_Sub2 local68 = Static50.aClass1_Sub2_Sub2_Sub2_1;
		local4.glActiveTexture(33985);
		local4.glEnable(3553);
		local4.glBindTexture(3553, local68.anInt4062);
		local4.glTexEnvi(8960, 34161, 7681);
		local4.glTexEnvi(8960, 34176, 34168);
		@Pc(98) float local98 = (float) (arg1 - Static50.anInt1067) / (float) local68.anInt4064;
		@Pc(107) float local107 = (float) (arg2 - Static50.anInt1065) / (float) local68.anInt4061;
		@Pc(118) float local118 = (float) (arg1 + arg3 - Static50.anInt1067) / (float) local68.anInt4064;
		@Pc(129) float local129 = (float) (arg2 + arg4 - Static50.anInt1065) / (float) local68.anInt4061;
		local4.glBegin(6);
		local4.glMultiTexCoord2f(33985, local118, local107);
		local4.glTexCoord2f(local51, local39);
		local4.glVertex2f((float) this.anIntArray673[arg0], 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local107);
		local4.glTexCoord2f(local32, local39);
		local4.glVertex2f(0.0F, 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local129);
		local4.glTexCoord2f(local32, local63);
		local4.glVertex2f(0.0F, (float) -this.anIntArray672[arg0]);
		local4.glMultiTexCoord2f(33985, local118, local129);
		local4.glTexCoord2f(local51, local63);
		local4.glVertex2f((float) this.anIntArray673[arg0], (float) -this.anIntArray672[arg0]);
		local4.glEnd();
		local4.glTexEnvi(8960, 34161, 8448);
		local4.glTexEnvi(8960, 34176, 5890);
		local4.glDisable(3553);
		local4.glActiveTexture(33984);
		local4.glLoadIdentity();
	}
}
