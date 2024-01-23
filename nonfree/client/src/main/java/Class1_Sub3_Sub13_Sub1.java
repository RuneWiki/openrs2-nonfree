import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public class Class1_Sub3_Sub13_Sub1 extends Class1_Sub3_Sub13 {

	@OriginalMember(owner = "client!we", name = "T", descriptor = "I")
	public int anInt3652;

	@OriginalMember(owner = "client!we", name = "V", descriptor = "I")
	private int anInt3654;

	@OriginalMember(owner = "client!we", name = "W", descriptor = "I")
	public int anInt3655;

	@OriginalMember(owner = "client!we", name = "U", descriptor = "I")
	protected int anInt3653 = 0;

	@OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
	public int anInt3658 = -1;

	@OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
	private int anInt3657 = -1;

	@OriginalMember(owner = "client!we", name = "X", descriptor = "I")
	private int anInt3656 = 0;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIII[I)V")
	public Class1_Sub3_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.anInt5572 = arg0;
		this.anInt5575 = arg1;
		this.anInt5577 = arg2;
		this.anInt5574 = arg3;
		this.anInt5571 = arg4;
		this.anInt5573 = arg5;
		this.method2672(arg6);
		this.method2671();
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class1_Sub3_Sub13_Sub1(@OriginalArg(0) Class1_Sub3_Sub13_Sub2 arg0) {
		this.anInt5572 = arg0.anInt5572;
		this.anInt5575 = arg0.anInt5575;
		this.anInt5577 = arg0.anInt5577;
		this.anInt5574 = arg0.anInt5574;
		this.anInt5571 = arg0.anInt5571;
		this.anInt5573 = arg0.anInt5573;
		this.method2672(arg0.anIntArray504);
		this.method2671();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		Static294.method4520();
		@Pc(8) int local8 = this.anInt5571;
		@Pc(11) int local11 = this.anInt5573;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt5572;
		@Pc(21) int local21 = this.anInt5575;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		@Pc(47) int local47;
		if (this.anInt5577 > 0) {
			local47 = ((this.anInt5577 << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.anInt5577 << 16);
		}
		if (this.anInt5574 > 0) {
			local47 = ((this.anInt5574 << 16) + local33 - 1) / local33;
			arg1 += local47;
			local15 = local47 * local33 - (this.anInt5574 << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL local123 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(2);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (Static294.anInt5874 - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.anInt5571 / (float) this.anInt3655;
		@Pc(163) float local163 = (float) this.anInt5573 / (float) this.anInt3652;
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

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
	@Override
	public final void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static294.method4520();
		@Pc(5) int local5 = arg0 + this.anInt5577;
		@Pc(10) int local10 = arg1 + this.anInt5574;
		@Pc(12) GL local12 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		local12.glTranslatef((float) local5, (float) (Static294.anInt5874 - local10), 0.0F);
		@Pc(35) float local35 = (float) this.anInt5571 / (float) this.anInt3655;
		@Pc(43) float local43 = (float) this.anInt5573 / (float) this.anInt3652;
		local12.glBegin(6);
		local12.glTexCoord2f(0.0F, 0.0F);
		local12.glVertex2f((float) this.anInt5571, 0.0F);
		local12.glTexCoord2f(local35, 0.0F);
		local12.glVertex2f(0.0F, 0.0F);
		local12.glTexCoord2f(local35, local43);
		local12.glVertex2f(0.0F, (float) -this.anInt5573);
		local12.glTexCoord2f(0.0F, local43);
		local12.glVertex2f((float) this.anInt5571, (float) -this.anInt5573);
		local12.glEnd();
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		if (this.anInt3658 != -1) {
			Static113.method1833(this.anInt3658, this.anInt3653, this.anInt3654);
			this.anInt3658 = -1;
			this.anInt3653 = 0;
		}
		if (this.anInt3657 != -1) {
			Static113.method1834(this.anInt3657, this.anInt3654);
			this.anInt3657 = -1;
		}
		super.finalize();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(III)V")
	@Override
	public final void method4207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static294.method4489();
		@Pc(5) int local5 = arg0 + this.anInt5577;
		@Pc(10) int local10 = arg1 + this.anInt5574;
		@Pc(12) GL local12 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		local12.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
		local12.glTranslatef((float) local5, (float) (Static294.anInt5874 - local10), 0.0F);
		local12.glCallList(this.anInt3657);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IIII)V")
	public final void method2665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static294.method4520();
		@Pc(2) GL local2 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		@Pc(16) float local16 = (float) this.anInt5571 / (float) this.anInt3655;
		@Pc(24) float local24 = (float) this.anInt5573 / (float) this.anInt3652;
		@Pc(29) float local29 = local16 * (float) arg2;
		@Pc(34) float local34 = local24 * (float) arg3;
		@Pc(39) int local39 = arg0 + this.anInt5577;
		@Pc(46) int local46 = local39 + this.anInt5571 * arg2;
		@Pc(53) int local53 = Static294.anInt5874 - arg1 - this.anInt5574;
		@Pc(60) int local60 = local53 - this.anInt5573 * arg3;
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

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)V")
	@Override
	public final void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static294.method4520();
		@Pc(5) int local5 = arg0 + this.anInt5577;
		@Pc(10) int local10 = arg1 + this.anInt5574;
		@Pc(12) GL local12 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		local12.glTranslatef((float) local5, (float) (Static294.anInt5874 - local10), 0.0F);
		local12.glCallList(this.anInt3657);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	@Override
	public final void method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static294.method4520();
		@Pc(5) int local5 = arg0 + this.anInt5577;
		@Pc(10) int local10 = arg1 + this.anInt5574;
		@Pc(12) GL local12 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		local12.glTranslatef((float) local5, (float) (Static294.anInt5874 - local10), 0.0F);
		local12.glCallList(this.anInt3657);
		local12.glLoadIdentity();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
	@Override
	protected final void method4211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static294.method4520();
		@Pc(2) GL local2 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		@Pc(15) int local15 = arg0 - (this.anInt5577 << 4);
		@Pc(22) int local22 = arg1 - (this.anInt5574 << 4);
		local2.glTranslatef((float) arg2 / 16.0F, (float) Static294.anInt5874 - (float) arg3 / 16.0F, 0.0F);
		local2.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (arg5 != 4096) {
			local2.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
		}
		local2.glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		local2.glCallList(this.anInt3657);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIII)V")
	public final void method2666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static294.method4489();
		@Pc(2) GL local2 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		@Pc(16) float local16 = (float) this.anInt5571 / (float) this.anInt3655;
		@Pc(24) float local24 = (float) this.anInt5573 / (float) this.anInt3652;
		@Pc(29) float local29 = local16 * (float) arg3;
		@Pc(34) float local34 = local24 * (float) arg4;
		@Pc(39) int local39 = arg0 + this.anInt5577;
		@Pc(46) int local46 = local39 + this.anInt5571 * arg3;
		@Pc(53) int local53 = Static294.anInt5874 - arg1 - this.anInt5574;
		@Pc(60) int local60 = local53 - this.anInt5573 * arg4;
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

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
	public final void method2667(@OriginalArg(0) int arg0) {
		if (this.anInt3656 == arg0) {
			return;
		}
		this.anInt3656 = arg0;
		@Pc(9) GL local9 = Static294.aGL1;
		if (arg0 == 2) {
			local9.glTexParameteri(3553, 10241, 9729);
			local9.glTexParameteri(3553, 10240, 9729);
		} else {
			local9.glTexParameteri(3553, 10241, 9728);
			local9.glTexParameteri(3553, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(IIIIII)V")
	public final void method2668(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static294.method4520();
		@Pc(2) GL local2 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(2);
		@Pc(15) int local15 = 240 - (this.anInt5577 << 4);
		@Pc(22) int local22 = 240 - (this.anInt5574 << 4);
		local2.glTranslatef((float) arg0 / 16.0F, (float) Static294.anInt5874 - (float) arg1 / 16.0F, 0.0F);
		local2.glRotatef((float) -arg2 * 0.005493164F, 0.0F, 0.0F, 1.0F);
		local2.glTranslatef((float) -local15 / 16.0F, (float) local22 / 16.0F, 0.0F);
		local2.glCallList(this.anInt3657);
		local2.glLoadIdentity();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIIILclient!we;)V")
	public final void method2669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub3_Sub13_Sub1 arg8) {
		if (arg8 == null) {
			return;
		}
		Static294.method4520();
		Static294.method4486(arg8.anInt3658);
		arg8.method2667(1);
		@Pc(11) GL local11 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg8.anInt3658);
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
		@Pc(188) float local188 = (float) arg8.anInt5571 / (float) arg8.anInt3655;
		@Pc(196) float local196 = (float) arg8.anInt5573 / (float) arg8.anInt3652;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(211) float local211 = (float) this.anInt3655 * 65536.0F;
		@Pc(217) float local217 = (float) (this.anInt3652 * 65536);
		local11.glMultiTexCoord2f(33985, local188, 0.0F);
		local11.glTexCoord2f((float) local120 / local211, (float) local132 / local217);
		local11.glVertex2f((float) (arg0 + arg2), (float) (Static294.anInt5874 - arg1));
		local11.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		local11.glTexCoord2f((float) local96 / local211, (float) local108 / local217);
		local11.glVertex2f((float) arg0, (float) (Static294.anInt5874 - arg1));
		local11.glMultiTexCoord2f(33985, 0.0F, local196);
		local11.glTexCoord2f((float) local144 / local211, (float) local156 / local217);
		local11.glVertex2f((float) arg0, (float) (Static294.anInt5874 - arg1 - arg3));
		local11.glMultiTexCoord2f(33985, local188, local196);
		local11.glTexCoord2f((float) local168 / local211, (float) local180 / local217);
		local11.glVertex2f((float) (arg0 + arg2), (float) (Static294.anInt5874 - arg1 - arg3));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!we;)V")
	public final void method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub13_Sub1 arg2) {
		if (arg2 == null) {
			return;
		}
		Static294.method4520();
		Static294.method4486(arg2.anInt3658);
		arg2.method2667(1);
		@Pc(11) GL local11 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		local11.glActiveTexture(33985);
		local11.glEnable(3553);
		local11.glBindTexture(3553, arg2.anInt3658);
		local11.glTexEnvi(8960, 34161, 7681);
		local11.glTexEnvi(8960, 34176, 34168);
		@Pc(47) float local47 = (float) (arg0 - Static156.anInt3504) / (float) arg2.anInt3655;
		@Pc(56) float local56 = (float) (arg1 - Static156.anInt3501) / (float) arg2.anInt3652;
		@Pc(68) float local68 = (float) (arg0 + this.anInt5571 - Static156.anInt3504) / (float) arg2.anInt3655;
		@Pc(80) float local80 = (float) (arg1 + this.anInt5573 - Static156.anInt3501) / (float) arg2.anInt3652;
		@Pc(85) int local85 = arg0 + this.anInt5577;
		@Pc(90) int local90 = arg1 + this.anInt5574;
		local11.glBegin(6);
		local11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		@Pc(107) float local107 = (float) this.anInt5571 / (float) this.anInt3655;
		@Pc(115) float local115 = (float) this.anInt5573 / (float) this.anInt3652;
		local11.glMultiTexCoord2f(33985, local68, local56);
		local11.glTexCoord2f(local107, 0.0F);
		local11.glVertex2f((float) (local85 + this.anInt5571), (float) (Static294.anInt5874 - local90));
		local11.glMultiTexCoord2f(33985, local47, local56);
		local11.glTexCoord2f(0.0F, 0.0F);
		local11.glVertex2f((float) local85, (float) (Static294.anInt5874 - local90));
		local11.glMultiTexCoord2f(33985, local47, local80);
		local11.glTexCoord2f(0.0F, local115);
		local11.glVertex2f((float) local85, (float) (Static294.anInt5874 - local90 - this.anInt5573));
		local11.glMultiTexCoord2f(33985, local68, local80);
		local11.glTexCoord2f(local107, local115);
		local11.glVertex2f((float) (local85 + this.anInt5571), (float) (Static294.anInt5874 - local90 - this.anInt5573));
		local11.glEnd();
		local11.glTexEnvi(8960, 34161, 8448);
		local11.glTexEnvi(8960, 34176, 5890);
		local11.glDisable(3553);
		local11.glActiveTexture(33984);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)V")
	@Override
	public final void method4209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		Static294.method4489();
		@Pc(8) int local8 = this.anInt5571;
		@Pc(11) int local11 = this.anInt5573;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(18) int local18 = this.anInt5572;
		@Pc(21) int local21 = this.anInt5575;
		@Pc(27) int local27 = (local18 << 16) / arg2;
		@Pc(33) int local33 = (local21 << 16) / arg3;
		@Pc(47) int local47;
		if (this.anInt5577 > 0) {
			local47 = ((this.anInt5577 << 16) + local27 - 1) / local27;
			arg0 += local47;
			local13 = local47 * local27 - (this.anInt5577 << 16);
		}
		if (this.anInt5574 > 0) {
			local47 = ((this.anInt5574 << 16) + local33 - 1) / local33;
			arg1 += local47;
			local15 = local47 * local33 - (this.anInt5574 << 16);
		}
		if (local8 < local18) {
			arg2 = ((local8 << 16) + local27 - local13 - 1) / local27;
		}
		if (local11 < local21) {
			arg3 = ((local11 << 16) + local33 - local15 - 1) / local33;
		}
		@Pc(123) GL local123 = Static294.aGL1;
		Static294.method4486(this.anInt3658);
		this.method2667(1);
		@Pc(132) float local132 = (float) arg0;
		@Pc(137) float local137 = local132 + (float) arg2;
		@Pc(142) float local142 = (float) (Static294.anInt5874 - arg1);
		@Pc(147) float local147 = local142 - (float) arg3;
		@Pc(155) float local155 = (float) this.anInt5571 / (float) this.anInt3655;
		@Pc(163) float local163 = (float) this.anInt5573 / (float) this.anInt3652;
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

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
	private void method2671() {
		@Pc(7) float local7 = (float) this.anInt5571 / (float) this.anInt3655;
		@Pc(15) float local15 = (float) this.anInt5573 / (float) this.anInt3652;
		@Pc(17) GL local17 = Static294.aGL1;
		if (this.anInt3657 == -1) {
			this.anInt3657 = local17.glGenLists(1);
			this.anInt3654 = Static113.anInt2464;
		}
		local17.glNewList(this.anInt3657, 4864);
		local17.glBegin(6);
		local17.glTexCoord2f(local7, 0.0F);
		local17.glVertex2f((float) this.anInt5571, 0.0F);
		local17.glTexCoord2f(0.0F, 0.0F);
		local17.glVertex2f(0.0F, 0.0F);
		local17.glTexCoord2f(0.0F, local15);
		local17.glVertex2f(0.0F, (float) -this.anInt5573);
		local17.glTexCoord2f(local7, local15);
		local17.glVertex2f((float) this.anInt5571, (float) -this.anInt5573);
		local17.glEnd();
		local17.glEndList();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([I)V")
	protected void method2672(@OriginalArg(0) int[] arg0) {
		this.anInt3655 = Static315.method4766(this.anInt5571);
		this.anInt3652 = Static315.method4766(this.anInt5573);
		@Pc(20) byte[] local20 = new byte[this.anInt3655 * this.anInt3652 * 4];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = (this.anInt3655 - this.anInt5571) * 4;
		for (@Pc(34) int local34 = 0; local34 < this.anInt5573; local34++) {
			for (@Pc(40) int local40 = 0; local40 < this.anInt5571; local40++) {
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
		@Pc(93) GL local93 = Static294.aGL1;
		if (this.anInt3658 == -1) {
			@Pc(100) int[] local100 = new int[1];
			local93.glGenTextures(1, local100, 0);
			this.anInt3658 = local100[0];
			this.anInt3654 = Static113.anInt2464;
		}
		Static294.method4486(this.anInt3658);
		local93.glTexImage2D(3553, 0, 6408, this.anInt3655, this.anInt3652, 0, 6408, 5121, local91);
		Static113.anInt2466 += local91.limit() - this.anInt3653;
		this.anInt3653 = local91.limit();
	}
}
