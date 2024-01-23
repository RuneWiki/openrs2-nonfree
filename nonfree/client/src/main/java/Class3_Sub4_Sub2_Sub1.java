import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class3_Sub4_Sub2_Sub1 extends Class3_Sub4_Sub2 {

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
	private int anInt1998;

	@OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
	private int anInt1999;

	@OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
	private int anInt1996 = -1;

	@OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
	private int anInt1997 = 0;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class3_Sub4_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.method1761(arg5);
		this.method1762();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([[B)V")
	private void method1761(@OriginalArg(0) byte[][] arg0) {
		if (this.anInt1996 != -1) {
			return;
		}
		this.anInt1998 = 0;
		@Pc(9) int local9;
		for (local9 = 0; local9 < 256; local9++) {
			if (this.anIntArray489[local9] > this.anInt1998) {
				this.anInt1998 = this.anIntArray489[local9];
			}
			if (this.anIntArray485[local9] > this.anInt1998) {
				this.anInt1998 = this.anIntArray485[local9];
			}
		}
		this.anInt1998 *= 16;
		this.anInt1998 = Static165.method2731(this.anInt1998);
		local9 = this.anInt1998 / 16;
		@Pc(66) byte[] local66 = new byte[this.anInt1998 * this.anInt1998 * 2];
		for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
			@Pc(77) int local77 = local68 % 16 * local9;
			@Pc(83) int local83 = local68 / 16 * local9;
			@Pc(92) int local92 = (local83 * this.anInt1998 + local77) * 2;
			@Pc(94) int local94 = 0;
			@Pc(99) int local99 = this.anIntArray489[local68];
			@Pc(104) int local104 = this.anIntArray485[local68];
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
				local92 += (this.anInt1998 - local104) * 2;
			}
		}
		@Pc(153) ByteBuffer local153 = ByteBuffer.wrap(local66);
		@Pc(155) GL local155 = Static283.aGL1;
		if (this.anInt1996 == -1) {
			@Pc(162) int[] local162 = new int[1];
			local155.glGenTextures(1, local162, 0);
			this.anInt1996 = local162[0];
			this.anInt1999 = Static189.anInt3719;
		}
		Static283.method4636(this.anInt1996);
		local155.glTexImage2D(3553, 0, 6410, this.anInt1998, this.anInt1998, 0, 6410, 5121, local153);
		Static189.anInt3720 += local153.limit() - this.anInt1997;
		this.anInt1997 = local153.limit();
		local155.glTexParameteri(3553, 10241, 9728);
		local155.glTexParameteri(3553, 10240, 9728);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method3683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) GL local4;
		if (Static234.aClass3_Sub4_Sub12_Sub1_1 == null) {
			Static283.method4663();
			local4 = Static283.aGL1;
			Static283.method4636(this.anInt1996);
			local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
			local4.glTranslatef((float) arg1, (float) (Static283.anInt5688 - arg2), 0.0F);
			local4.glCallList(this.anIntArray209[arg0]);
			local4.glLoadIdentity();
			return;
		}
		Static283.method4663();
		local4 = Static283.aGL1;
		local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
		local4.glTranslatef((float) arg1, (float) (Static283.anInt5688 - arg2), 0.0F);
		@Pc(32) float local32 = (float) (arg0 % 16) / 16.0F;
		@Pc(39) float local39 = (float) (arg0 / 16) / 16.0F;
		@Pc(51) float local51 = local32 + (float) this.anIntArray485[arg0] / (float) this.anInt1998;
		@Pc(63) float local63 = local39 + (float) this.anIntArray489[arg0] / (float) this.anInt1998;
		Static283.method4636(this.anInt1996);
		@Pc(68) Class3_Sub4_Sub12_Sub1 local68 = Static234.aClass3_Sub4_Sub12_Sub1_1;
		local4.glActiveTexture(33985);
		local4.glEnable(3553);
		local4.glBindTexture(3553, local68.anInt2550);
		local4.glTexEnvi(8960, 34161, 7681);
		local4.glTexEnvi(8960, 34176, 34168);
		@Pc(98) float local98 = (float) (arg1 - Static234.anInt4685) / (float) local68.anInt2554;
		@Pc(107) float local107 = (float) (arg2 - Static234.anInt4687) / (float) local68.anInt2549;
		@Pc(118) float local118 = (float) (arg1 + arg3 - Static234.anInt4685) / (float) local68.anInt2554;
		@Pc(129) float local129 = (float) (arg2 + arg4 - Static234.anInt4687) / (float) local68.anInt2549;
		local4.glBegin(6);
		local4.glMultiTexCoord2f(33985, local118, local107);
		local4.glTexCoord2f(local51, local39);
		local4.glVertex2f((float) this.anIntArray485[arg0], 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local107);
		local4.glTexCoord2f(local32, local39);
		local4.glVertex2f(0.0F, 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local129);
		local4.glTexCoord2f(local32, local63);
		local4.glVertex2f(0.0F, (float) -this.anIntArray489[arg0]);
		local4.glMultiTexCoord2f(33985, local118, local129);
		local4.glTexCoord2f(local51, local63);
		local4.glVertex2f((float) this.anIntArray485[arg0], (float) -this.anIntArray489[arg0]);
		local4.glEnd();
		local4.glTexEnvi(8960, 34161, 8448);
		local4.glTexEnvi(8960, 34176, 5890);
		local4.glDisable(3553);
		local4.glActiveTexture(33984);
		local4.glLoadIdentity();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()V")
	private void method1762() {
		if (this.anIntArray209 != null) {
			return;
		}
		this.anIntArray209 = new int[256];
		@Pc(9) GL local9 = Static283.aGL1;
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(21) float local21 = (float) (local11 % 16) / 16.0F;
			@Pc(28) float local28 = (float) (local11 / 16) / 16.0F;
			@Pc(40) float local40 = local21 + (float) this.anIntArray485[local11] / (float) this.anInt1998;
			@Pc(52) float local52 = local28 + (float) this.anIntArray489[local11] / (float) this.anInt1998;
			this.anIntArray209[local11] = local9.glGenLists(1);
			local9.glNewList(this.anIntArray209[local11], 4864);
			local9.glBegin(6);
			local9.glTexCoord2f(local40, local28);
			local9.glVertex2f((float) this.anIntArray485[local11], 0.0F);
			local9.glTexCoord2f(local21, local28);
			local9.glVertex2f(0.0F, 0.0F);
			local9.glTexCoord2f(local21, local52);
			local9.glVertex2f(0.0F, (float) -this.anIntArray489[local11]);
			local9.glTexCoord2f(local40, local52);
			local9.glVertex2f((float) this.anIntArray485[local11], (float) -this.anIntArray489[local11]);
			local9.glEnd();
			local9.glEndList();
		}
		this.anInt1999 = Static189.anInt3719;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Static283.method4663();
		@Pc(2) GL local2 = Static283.aGL1;
		Static283.method4636(this.anInt1996);
		local2.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
		local2.glTranslatef((float) arg1, (float) (Static283.anInt5688 - arg2), 0.0F);
		local2.glCallList(this.anIntArray209[arg0]);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1996 != -1) {
			Static189.method3154(this.anInt1996, this.anInt1997, this.anInt1999);
			this.anInt1996 = -1;
			this.anInt1997 = 0;
		}
		if (this.anIntArray209 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray209.length; local21++) {
				Static189.method3153(this.anIntArray209[local21], this.anInt1999);
			}
			this.anIntArray209 = null;
		}
		super.finalize();
	}
}
