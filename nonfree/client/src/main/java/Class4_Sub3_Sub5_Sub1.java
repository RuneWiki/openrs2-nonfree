import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class4_Sub3_Sub5_Sub1 extends Class4_Sub3_Sub5 {

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
	private int anInt1021;

	@OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
	private int anInt1022 = 0;

	@OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
	private int anInt1024 = -1;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B[I[I[I[I[[B)V")
	public Class4_Sub3_Sub5_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.method868(arg5);
		this.method869();
	}

	@OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		if (this.anInt1024 != -1) {
			Static173.method2735(this.anInt1024, this.anInt1022, this.anInt1021);
			this.anInt1024 = -1;
			this.anInt1022 = 0;
		}
		if (this.anIntArray82 != null) {
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray82.length; local21++) {
				Static173.method2730(this.anIntArray82[local21], this.anInt1021);
			}
			this.anIntArray82 = null;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIZ)V")
	@Override
	protected void method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Static94.method1590();
		@Pc(2) GL local2 = Static94.aGL1;
		Static94.method1600(this.anInt1024);
		local2.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, arg6 > 255 ? -1 : (byte) arg6);
		local2.glTranslatef((float) arg1, (float) (Static94.anInt2083 - arg2), 0.0F);
		local2.glCallList(this.anIntArray82[arg0]);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIZ)V")
	@Override
	protected void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) GL local4;
		if (Static104.aClass4_Sub3_Sub14_Sub2_1 == null) {
			Static94.method1590();
			local4 = Static94.aGL1;
			Static94.method1600(this.anInt1024);
			local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
			local4.glTranslatef((float) arg1, (float) (Static94.anInt2083 - arg2), 0.0F);
			local4.glCallList(this.anIntArray82[arg0]);
			local4.glLoadIdentity();
			return;
		}
		Static94.method1590();
		local4 = Static94.aGL1;
		local4.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
		local4.glTranslatef((float) arg1, (float) (Static94.anInt2083 - arg2), 0.0F);
		@Pc(32) float local32 = (float) (arg0 % 16) / 16.0F;
		@Pc(39) float local39 = (float) (arg0 / 16) / 16.0F;
		@Pc(51) float local51 = local32 + (float) this.anIntArray251[arg0] / (float) this.anInt1023;
		@Pc(63) float local63 = local39 + (float) this.anIntArray246[arg0] / (float) this.anInt1023;
		Static94.method1600(this.anInt1024);
		@Pc(68) Class4_Sub3_Sub14_Sub2 local68 = Static104.aClass4_Sub3_Sub14_Sub2_1;
		local4.glActiveTexture(33985);
		local4.glEnable(3553);
		local4.glBindTexture(3553, local68.anInt5615);
		local4.glTexEnvi(8960, 34161, 7681);
		local4.glTexEnvi(8960, 34176, 34168);
		@Pc(98) float local98 = (float) (arg1 - Static104.anInt2150) / (float) local68.anInt5618;
		@Pc(107) float local107 = (float) (arg2 - Static104.anInt2152) / (float) local68.anInt5621;
		@Pc(118) float local118 = (float) (arg1 + arg3 - Static104.anInt2150) / (float) local68.anInt5618;
		@Pc(129) float local129 = (float) (arg2 + arg4 - Static104.anInt2152) / (float) local68.anInt5621;
		local4.glBegin(6);
		local4.glMultiTexCoord2f(33985, local118, local107);
		local4.glTexCoord2f(local51, local39);
		local4.glVertex2f((float) this.anIntArray251[arg0], 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local107);
		local4.glTexCoord2f(local32, local39);
		local4.glVertex2f(0.0F, 0.0F);
		local4.glMultiTexCoord2f(33985, local98, local129);
		local4.glTexCoord2f(local32, local63);
		local4.glVertex2f(0.0F, (float) -this.anIntArray246[arg0]);
		local4.glMultiTexCoord2f(33985, local118, local129);
		local4.glTexCoord2f(local51, local63);
		local4.glVertex2f((float) this.anIntArray251[arg0], (float) -this.anIntArray246[arg0]);
		local4.glEnd();
		local4.glTexEnvi(8960, 34161, 8448);
		local4.glTexEnvi(8960, 34176, 5890);
		local4.glDisable(3553);
		local4.glActiveTexture(33984);
		local4.glLoadIdentity();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([[B)V")
	private void method868(@OriginalArg(0) byte[][] arg0) {
		if (this.anInt1024 != -1) {
			return;
		}
		this.anInt1023 = 0;
		@Pc(9) int local9;
		for (local9 = 0; local9 < 256; local9++) {
			if (this.anIntArray246[local9] > this.anInt1023) {
				this.anInt1023 = this.anIntArray246[local9];
			}
			if (this.anIntArray251[local9] > this.anInt1023) {
				this.anInt1023 = this.anIntArray251[local9];
			}
		}
		this.anInt1023 *= 16;
		this.anInt1023 = Static161.method2608(this.anInt1023);
		local9 = this.anInt1023 / 16;
		@Pc(66) byte[] local66 = new byte[this.anInt1023 * this.anInt1023 * 2];
		for (@Pc(68) int local68 = 0; local68 < 256; local68++) {
			@Pc(77) int local77 = local68 % 16 * local9;
			@Pc(83) int local83 = local68 / 16 * local9;
			@Pc(92) int local92 = (local83 * this.anInt1023 + local77) * 2;
			@Pc(94) int local94 = 0;
			@Pc(99) int local99 = this.anIntArray246[local68];
			@Pc(104) int local104 = this.anIntArray251[local68];
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
				local92 += (this.anInt1023 - local104) * 2;
			}
		}
		@Pc(153) ByteBuffer local153 = ByteBuffer.wrap(local66);
		@Pc(155) GL local155 = Static94.aGL1;
		if (this.anInt1024 == -1) {
			@Pc(162) int[] local162 = new int[1];
			local155.glGenTextures(1, local162, 0);
			this.anInt1024 = local162[0];
			this.anInt1021 = Static173.anInt3332;
		}
		Static94.method1600(this.anInt1024);
		local155.glTexImage2D(3553, 0, 6410, this.anInt1023, this.anInt1023, 0, 6410, 5121, local153);
		Static173.anInt3333 += local153.limit() - this.anInt1022;
		this.anInt1022 = local153.limit();
		local155.glTexParameteri(3553, 10241, 9728);
		local155.glTexParameteri(3553, 10240, 9728);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()V")
	private void method869() {
		if (this.anIntArray82 != null) {
			return;
		}
		this.anIntArray82 = new int[256];
		@Pc(9) GL local9 = Static94.aGL1;
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(21) float local21 = (float) (local11 % 16) / 16.0F;
			@Pc(28) float local28 = (float) (local11 / 16) / 16.0F;
			@Pc(40) float local40 = local21 + (float) this.anIntArray251[local11] / (float) this.anInt1023;
			@Pc(52) float local52 = local28 + (float) this.anIntArray246[local11] / (float) this.anInt1023;
			this.anIntArray82[local11] = local9.glGenLists(1);
			local9.glNewList(this.anIntArray82[local11], 4864);
			local9.glBegin(6);
			local9.glTexCoord2f(local40, local28);
			local9.glVertex2f((float) this.anIntArray251[local11], 0.0F);
			local9.glTexCoord2f(local21, local28);
			local9.glVertex2f(0.0F, 0.0F);
			local9.glTexCoord2f(local21, local52);
			local9.glVertex2f(0.0F, (float) -this.anIntArray246[local11]);
			local9.glTexCoord2f(local40, local52);
			local9.glVertex2f((float) this.anIntArray251[local11], (float) -this.anIntArray246[local11]);
			local9.glEnd();
			local9.glEndList();
		}
		this.anInt1021 = Static173.anInt3332;
	}
}
