import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public class Class2_Sub8_Sub1_Sub2 extends Class2_Sub8_Sub1 {

	@OriginalMember(owner = "client!of", name = "M", descriptor = "I")
	private int anInt5527;

	@OriginalMember(owner = "client!of", name = "O", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!of", name = "P", descriptor = "I")
	public int anInt5530;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "I")
	public int anInt5526 = -1;

	@OriginalMember(owner = "client!of", name = "J", descriptor = "I")
	private int anInt5524 = 0;

	@OriginalMember(owner = "client!of", name = "K", descriptor = "I")
	private int anInt5525 = -1;

	@OriginalMember(owner = "client!of", name = "N", descriptor = "I")
	protected int anInt5528 = 0;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIII[I)V")
	public Class2_Sub8_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.anInt5520 = arg0;
		this.anInt5516 = arg1;
		this.anInt5522 = arg2;
		this.anInt5519 = arg3;
		this.anInt5514 = arg4;
		this.anInt5517 = arg5;
		this.method4379(arg6);
		this.method4376();
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!sc;)V")
	public Class2_Sub8_Sub1_Sub2(@OriginalArg(0) Class2_Sub8_Sub1_Sub1 arg0) {
		this.anInt5520 = arg0.anInt5520;
		this.anInt5516 = arg0.anInt5516;
		this.anInt5522 = arg0.anInt5522;
		this.anInt5519 = arg0.anInt5519;
		this.anInt5514 = arg0.anInt5514;
		this.anInt5517 = arg0.anInt5517;
		this.method4379(arg0.anIntArray340);
		this.method4376();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
	private void method4376() {
		@Pc(7) float local7 = (float) this.anInt5514 / (float) this.anInt5529;
		@Pc(15) float local15 = (float) this.anInt5517 / (float) this.anInt5530;
		@Pc(17) GL local17 = Static116.aGL1;
		if (this.anInt5525 == -1) {
			this.anInt5525 = local17.glGenLists(1);
			this.anInt5527 = Static124.anInt2871;
		}
		local17.glNewList(this.anInt5525, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5514, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5517);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5514, (float) -this.anInt5517);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)V")
	@Override
	public final void method4368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static116.method1941();
		@Pc(5) int local5 = arg0 + this.anInt5522;
		@Pc(10) int local10 = arg1 + this.anInt5519;
		@Pc(12) GL local12 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		local12.glTranslatef((float) local5, (float) (Static116.anInt2590 - local10), 0.0F);
		local12.glCallList(this.anInt5525);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt5526 != -1) {
			Static124.method2209(this.anInt5526, this.anInt5528, this.anInt5527);
			this.anInt5526 = -1;
			this.anInt5528 = 0;
		}
		if (this.anInt5525 != -1) {
			Static124.method2214(this.anInt5525, this.anInt5527);
			this.anInt5525 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IIII)V")
	public final void method4377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static116.method1941();
		@Pc(2) GL local2 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		@Pc(16) float local16 = (float) this.anInt5514 / (float) this.anInt5529;
		@Pc(24) float local24 = (float) this.anInt5517 / (float) this.anInt5530;
		@Pc(29) float local29 = local16 * (float) arg2;
		@Pc(34) float local34 = local24 * (float) arg3;
		@Pc(39) int local39 = arg0 + this.anInt5522;
		@Pc(46) int local46 = local39 + this.anInt5514 * arg2;
		@Pc(53) int local53 = Static116.anInt2590 - arg1 - this.anInt5519;
		@Pc(60) int local60 = local53 - this.anInt5517 * arg3;
		local2.glBegin(6);
		local2.glTexCoord2f(local29, 0.0F);
		local2.glVertex2f((float) local46, (float) local53);
		local2.glTexCoord2f(0.0F, 0.0F);
		local2.glVertex2f((float) local39, (float) local53);
		local2.glTexCoord2f(0.0F, local34);
		local2.glVertex2f((float) local39, (float) local60);
		local2.glTexCoord2f(local29, local34);
		local2.glVertex2f((float) local46, (float) local60);
		local2.glEnd();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		Static116.method1941();
		@Pc(8) int local8 = this.anInt5514;
		@Pc(11) int local11 = this.anInt5517;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt5520;
		@Pc(21) int local21 = this.anInt5516;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		@Pc(47) int local47;
		if (this.anInt5522 > 0) {
			local47 = ((this.anInt5522 << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.anInt5522 << 16);
		}
		if (this.anInt5519 > 0) {
			local47 = ((this.anInt5519 << 16) + local33 - 1) / local33;
			arg1 += local47;
			local15 = local47 * local33 - (this.anInt5519 << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL local123 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(2);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (Static116.anInt2590 - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.anInt5514 / (float) this.anInt5529;
		@Pc(163) float local163 = (float) this.anInt5517 / (float) this.anInt5530;
		local123.glBegin(6);
		local123.glTexCoord2f(local155, 0.0F);
		local123.glVertex2f(local137, local142);
		local123.glTexCoord2f(0.0F, 0.0F);
		local123.glVertex2f(local132, local142);
		local123.glTexCoord2f(0.0F, local163);
		local123.glVertex2f(local132, local147);
		local123.glTexCoord2f(local155, local163);
		local123.glVertex2f(local137, local147);
		local123.glEnd();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIILclient!of;)V")
	public final void method4378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub8_Sub1_Sub2 arg8) {
		if (arg8 == null) {
			return;
		}
		Static116.method1941();
		Static116.method1945(arg8.anInt5526);
		arg8.method4382(1);
		@Pc(11) GL local11 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg8.anInt5526);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(43) int local43 = -arg2 / 2;
		@Pc(48) int local48 = -arg3 / 2;
		@Pc(51) int local51 = -local43;
		@Pc(54) int local54 = -local48;
		@Pc(63) int local63 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
		@Pc(72) int local72 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
		@Pc(78) int local78 = local63 * arg7 >> 8;
		@Pc(84) int local84 = local72 * arg7 >> 8;
		@Pc(96) int local96 = (arg4 << 16) + local48 * local78 + local43 * local84;
		@Pc(108) int local108 = (arg5 << 16) + (local48 * local84 - local43 * local78);
		@Pc(120) int local120 = (arg4 << 16) + local48 * local78 + local51 * local84;
		@Pc(132) int local132 = (arg5 << 16) + (local48 * local84 - local51 * local78);
		@Pc(144) int local144 = (arg4 << 16) + local54 * local78 + local43 * local84;
		@Pc(156) int local156 = (arg5 << 16) + (local54 * local84 - local43 * local78);
		@Pc(168) int local168 = (arg4 << 16) + local54 * local78 + local51 * local84;
		@Pc(180) int local180 = (arg5 << 16) + (local54 * local84 - local51 * local78);
		@Pc(188) float local188 = (float) arg8.anInt5514 / (float) arg8.anInt5529;
		@Pc(196) float local196 = (float) arg8.anInt5517 / (float) arg8.anInt5530;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(211) float local211 = (float) this.anInt5529 * 65536.0F;
		@Pc(217) float local217 = (float) (this.anInt5530 * 65536);
		local11.glMultiTexCoord2f(33985, local188, 0.0F);
		local11.glTexCoord2f((float) local120 / local211, (float) local132 / local217);
		local11.glVertex2f((float) (arg0 + arg2), (float) (Static116.anInt2590 - arg1));
		local11.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		local11.glTexCoord2f((float) local96 / local211, (float) local108 / local217);
		local11.glVertex2f((float) arg0, (float) (Static116.anInt2590 - arg1));
		local11.glMultiTexCoord2f(33985, 0.0F, local196);
		local11.glTexCoord2f((float) local144 / local211, (float) local156 / local217);
		local11.glVertex2f((float) arg0, (float) (Static116.anInt2590 - arg1 - arg3));
		local11.glMultiTexCoord2f(33985, local188, local196);
		local11.glTexCoord2f((float) local168 / local211, (float) local180 / local217);
		local11.glVertex2f((float) (arg0 + arg2), (float) (Static116.anInt2590 - arg1 - arg3));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(II)V")
	@Override
	public final void method4371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static116.method1941();
		@Pc(5) int local5 = arg0 + this.anInt5522;
		@Pc(10) int local10 = arg1 + this.anInt5519;
		@Pc(12) GL local12 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		local12.glTranslatef((float) local5, (float) (Static116.anInt2590 - local10), 0.0F);
		@Pc(35) float local35 = (float) this.anInt5514 / (float) this.anInt5529;
		@Pc(43) float local43 = (float) this.anInt5517 / (float) this.anInt5530;
		local12.glBegin(6);
		local12.glTexCoord2f(0.0F, 0.0F);
		local12.glVertex2f((float) this.anInt5514, 0.0F);
		local12.glTexCoord2f(local35, 0.0F);
		local12.glVertex2f(0.0F, 0.0F);
		local12.glTexCoord2f(local35, local43);
		local12.glVertex2f(0.0F, (float) -this.anInt5517);
		local12.glTexCoord2f(0.0F, local43);
		local12.glVertex2f((float) this.anInt5514, (float) -this.anInt5517);
		local12.glEnd();
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([I)V")
	protected void method4379(@OriginalArg(0) int[] arg0) {
		this.anInt5529 = Static305.method4628(this.anInt5514);
		this.anInt5530 = Static305.method4628(this.anInt5517);
		@Pc(20) byte[] local20 = new byte[this.anInt5529 * this.anInt5530 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.anInt5529 - this.anInt5514) * 4;
		for (@Pc(34) int local34 = 0; local34 < this.anInt5517; local34++) {
			for (@Pc(40) int local40 = 0; local40 < this.anInt5514; local40++) {
				@Pc(49) int local49 = arg0[local24++];
				if (local49 == 0) {
					local22 += 4;
				} else {
					local20[local22++] = (byte) (local49 >> 16);
					local20[local22++] = (byte) (local49 >> 8);
					local20[local22++] = (byte) local49;
					local20[local22++] = -1;
				}
			}
			local22 += local32;
		}
		@Pc(91) ByteBuffer local91 = ByteBuffer.wrap(local20);
		@Pc(93) GL local93 = Static116.aGL1;
		if (this.anInt5526 == -1) {
			@Pc(100) int[] local100 = new int[1];
			local93.glGenTextures(1, local100, 0);
			this.anInt5526 = local100[0];
			this.anInt5527 = Static124.anInt2871;
		}
		Static116.method1945(this.anInt5526);
		local93.glTexImage2D(3553, 0, 6408, this.anInt5529, this.anInt5530, 0, 6408, 5121, local91);
		Static124.anInt2873 += local91.limit() - this.anInt5528;
		this.anInt5528 = local91.limit();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method4367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static116.method1941();
		@Pc(2) GL local2 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		@Pc(15) int local15 = arg0 - (this.anInt5522 << 4);
		@Pc(22) int local22 = arg1 - (this.anInt5519 << 4);
		local2.glTranslatef((float) arg2 / 16.0F, (float) Static116.anInt2590 - (float) arg3 / 16.0F, 0.0F);
		local2.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (arg5 != 4096) {
			local2.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
		}
		local2.glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		local2.glCallList(this.anInt5525);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
	@Override
	public final void method4364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static116.method1941();
		@Pc(5) int local5 = arg0 + this.anInt5522;
		@Pc(10) int local10 = arg1 + this.anInt5519;
		@Pc(12) GL local12 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		local12.glTranslatef((float) local5, (float) (Static116.anInt2590 - local10), 0.0F);
		local12.glCallList(this.anInt5525);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIIII)V")
	public final void method4380(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static116.method1941();
		@Pc(2) GL local2 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(2);
		@Pc(15) int local15 = 240 - (this.anInt5522 << 4);
		@Pc(22) int local22 = 240 - (this.anInt5519 << 4);
		local2.glTranslatef((float) arg0 / 16.0F, (float) Static116.anInt2590 - (float) arg1 / 16.0F, 0.0F);
		local2.glRotatef((float) -arg2 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		local2.glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		local2.glCallList(this.anInt5525);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(IIIII)V")
	public final void method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1959();
		@Pc(2) GL local2 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		@Pc(16) float local16 = (float) this.anInt5514 / (float) this.anInt5529;
		@Pc(24) float local24 = (float) this.anInt5517 / (float) this.anInt5530;
		@Pc(29) float local29 = local16 * (float) arg3;
		@Pc(34) float local34 = local24 * (float) arg4;
		@Pc(39) int local39 = arg0 + this.anInt5522;
		@Pc(46) int local46 = local39 + this.anInt5514 * arg3;
		@Pc(53) int local53 = Static116.anInt2590 - arg1 - this.anInt5519;
		@Pc(60) int local60 = local53 - this.anInt5517 * arg4;
		@Pc(65) float local65 = (float) arg2 / 256.0F;
		local2.glBegin(6);
		local2.glColor4f(1.0F, 1.0F, 1.0F, local65);
		local2.glTexCoord2f(local29, 0.0F);
		local2.glVertex2f((float) local46, (float) local53);
		local2.glTexCoord2f(0.0F, 0.0F);
		local2.glVertex2f((float) local39, (float) local53);
		local2.glTexCoord2f(0.0F, local34);
		local2.glVertex2f((float) local39, (float) local60);
		local2.glTexCoord2f(local29, local34);
		local2.glVertex2f((float) local46, (float) local60);
		local2.glEnd();
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V")
	public final void method4382(@OriginalArg(0) int arg0) {
		if (this.anInt5524 == arg0) {
			return;
		}
		this.anInt5524 = arg0;
		@Pc(9) GL local9 = Static116.aGL1;
		if (arg0 == 2) {
			local9.glTexParameteri(3553, 10241, 9729);
			local9.glTexParameteri(3553, 10240, 9729);
		} else {
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	@Override
	public final void method4361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static116.method1959();
		@Pc(5) int local5 = arg0 + this.anInt5522;
		@Pc(10) int local10 = arg1 + this.anInt5519;
		@Pc(12) GL local12 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static116.anInt2590 - local10), 0.0F);
		local12.glCallList(this.anInt5525);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IIIII)V")
	@Override
	public final void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		Static116.method1959();
		@Pc(8) int local8 = this.anInt5514;
		@Pc(11) int local11 = this.anInt5517;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt5520;
		@Pc(21) int local21 = this.anInt5516;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		@Pc(47) int local47;
		if (this.anInt5522 > 0) {
			local47 = ((this.anInt5522 << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.anInt5522 << 16);
		}
		if (this.anInt5519 > 0) {
			local47 = ((this.anInt5519 << 16) + local33 - 1) / local33;
			arg1 += local47;
			local15 = local47 * local33 - (this.anInt5519 << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL local123 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (Static116.anInt2590 - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.anInt5514 / (float) this.anInt5529;
		@Pc(163) float local163 = (float) this.anInt5517 / (float) this.anInt5530;
		@Pc(168) float local168 = (float) arg4 / 256.0F;
		local123.glBegin(6);
		local123.glColor4f(1.0F, 1.0F, 1.0F, local168);
		local123.glTexCoord2f(local155, 0.0F);
		local123.glVertex2f(local137, local142);
		local123.glTexCoord2f(0.0F, 0.0F);
		local123.glVertex2f(local132, local142);
		local123.glTexCoord2f(0.0F, local163);
		local123.glVertex2f(local132, local147);
		local123.glTexCoord2f(local155, local163);
		local123.glVertex2f(local137, local147);
		local123.glEnd();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!of;)V")
	public final void method4383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub8_Sub1_Sub2 arg2) {
		if (arg2 == null) {
			return;
		}
		Static116.method1941();
		Static116.method1945(arg2.anInt5526);
		arg2.method4382(1);
		@Pc(11) GL local11 = Static116.aGL1;
		Static116.method1945(this.anInt5526);
		this.method4382(1);
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg2.anInt5526);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(47) float local47 = (float) (arg0 - Static111.anInt2522) / (float) arg2.anInt5529;
		@Pc(56) float local56 = (float) (arg1 - Static111.anInt2524) / (float) arg2.anInt5530;
		@Pc(68) float local68 = (float) (arg0 + this.anInt5514 - Static111.anInt2522) / (float) arg2.anInt5529;
		@Pc(80) float local80 = (float) (arg1 + this.anInt5517 - Static111.anInt2524) / (float) arg2.anInt5530;
		@Pc(85) int local85 = arg0 + this.anInt5522;
		@Pc(90) int local90 = arg1 + this.anInt5519;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt5514 / (float) this.anInt5529;
		@Pc(115) float local115 = (float) this.anInt5517 / (float) this.anInt5530;
		local11.glMultiTexCoord2f(33985, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.anInt5514), (float) (Static116.anInt2590 - local90));
		local11.glMultiTexCoord2f(33985, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (Static116.anInt2590 - local90));
		local11.glMultiTexCoord2f(33985, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (Static116.anInt2590 - local90 - this.anInt5517));
		local11.glMultiTexCoord2f(33985, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.anInt5514), (float) (Static116.anInt2590 - local90 - this.anInt5517));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}
}
