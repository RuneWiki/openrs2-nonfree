import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class134_Sub1 extends Class134 {

	@OriginalMember(owner = "client!haa", name = "g", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!haa", name = "w", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!haa", name = "D", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!haa", name = "E", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!haa", name = "F", descriptor = "F")
	public float aFloat71;

	@OriginalMember(owner = "client!haa", name = "I", descriptor = "F")
	public float aFloat72;

	@OriginalMember(owner = "client!haa", name = "M", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!haa", name = "N", descriptor = "F")
	public float aFloat74;

	@OriginalMember(owner = "client!haa", name = "V", descriptor = "F")
	public float aFloat75;

	@OriginalMember(owner = "client!haa", name = "cb", descriptor = "F")
	public float aFloat76;

	@OriginalMember(owner = "client!haa", name = "db", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	public Class134_Sub1() {
		this.Y();
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!q;I)V")
	public void method3396(@OriginalArg(0) Class134 arg0) {
		@Pc(6) Class134_Sub1 local6 = (Class134_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat68;
		@Pc(12) float local12 = this.aFloat76;
		@Pc(15) float local15 = this.aFloat74;
		@Pc(18) float local18 = this.aFloat73;
		@Pc(21) float local21 = this.aFloat70;
		@Pc(24) float local24 = this.aFloat66;
		@Pc(27) float local27 = this.aFloat77;
		@Pc(30) float local30 = this.aFloat67;
		this.aFloat68 = this.aFloat72 * local6.aFloat70 + local6.aFloat68 * local9 + local12 * local6.aFloat74;
		this.aFloat76 = this.aFloat72 * local6.aFloat66 + local6.aFloat76 * local9 + local6.aFloat73 * local12;
		this.aFloat72 = local12 * local6.aFloat69 + local9 * local6.aFloat72 + local6.aFloat75 * this.aFloat72;
		this.aFloat73 = this.aFloat69 * local6.aFloat66 + local15 * local6.aFloat76 + local18 * local6.aFloat73;
		this.aFloat74 = this.aFloat69 * local6.aFloat70 + local15 * local6.aFloat68 + local6.aFloat74 * local18;
		this.aFloat66 = this.aFloat75 * local6.aFloat66 + local21 * local6.aFloat76 + local6.aFloat73 * local24;
		this.aFloat70 = this.aFloat75 * local6.aFloat70 + local6.aFloat74 * local24 + local6.aFloat68 * local21;
		this.aFloat69 = local6.aFloat69 * local18 + local15 * local6.aFloat72 + local6.aFloat75 * this.aFloat69;
		this.aFloat77 = local6.aFloat68 * local27 + local30 * local6.aFloat74 + this.aFloat71 * local6.aFloat70 + local6.aFloat77;
		this.aFloat67 = local6.aFloat67 + local6.aFloat76 * local27 + local6.aFloat73 * local30 + local6.aFloat66 * this.aFloat71;
		this.aFloat75 = local6.aFloat75 * this.aFloat75 + local24 * local6.aFloat69 + local6.aFloat72 * local21;
		this.aFloat71 = local6.aFloat71 + this.aFloat71 * local6.aFloat75 + local6.aFloat69 * local30 + local27 * local6.aFloat72;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I[F)[F")
	public float[] method3397(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat74;
		arg0[2] = this.aFloat70;
		arg0[7] = this.aFloat67;
		arg0[0] = this.aFloat68;
		arg0[4] = this.aFloat76;
		arg0[5] = this.aFloat73;
		arg0[6] = this.aFloat66;
		arg0[3] = this.aFloat77;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([FB)[F")
	public float[] method3398(@OriginalArg(0) float[] arg0) {
		arg0[3] = 0.0F;
		arg0[12] = this.aFloat77;
		arg0[0] = this.aFloat68;
		arg0[15] = 1.0F;
		arg0[10] = this.aFloat75;
		arg0[13] = this.aFloat67;
		arg0[7] = 0.0F;
		arg0[14] = this.aFloat71;
		arg0[9] = this.aFloat66;
		arg0[6] = this.aFloat69;
		arg0[11] = 0.0F;
		arg0[8] = this.aFloat70;
		arg0[4] = this.aFloat74;
		arg0[5] = this.aFloat73;
		arg0[1] = this.aFloat76;
		arg0[2] = this.aFloat72;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub41.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub41.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat76;
		@Pc(21) float local21 = this.aFloat73;
		@Pc(24) float local24 = this.aFloat66;
		@Pc(27) float local27 = this.aFloat67;
		this.aFloat76 = local18 * local9 - this.aFloat72 * local15;
		this.aFloat72 = local9 * this.aFloat72 + local15 * local18;
		this.aFloat73 = local21 * local9 - this.aFloat69 * local15;
		this.aFloat66 = local24 * local9 - this.aFloat75 * local15;
		this.aFloat69 = local9 * this.aFloat69 + local15 * local21;
		this.aFloat75 = local9 * this.aFloat75 + local15 * local24;
		this.aFloat67 = local27 * local9 - local15 * this.aFloat71;
		this.aFloat71 = this.aFloat71 * local9 + local15 * local27;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BFFF)V")
	public void method3399(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat68 *= arg1;
		this.aFloat66 *= arg2;
		this.aFloat74 *= arg1;
		this.aFloat75 *= arg0;
		this.aFloat70 *= arg1;
		this.aFloat73 *= arg2;
		this.aFloat76 *= arg2;
		this.aFloat72 *= arg0;
		this.aFloat67 *= arg2;
		this.aFloat71 *= arg0;
		this.aFloat69 *= arg0;
		this.aFloat77 *= arg1;
	}

	@OriginalMember(owner = "client!haa", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class4_Sub41.aFloatArray48[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub41.aFloatArray49[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class4_Sub41.aFloatArray48[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class4_Sub41.aFloatArray49[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class4_Sub41.aFloatArray48[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class4_Sub41.aFloatArray49[arg5 & 0x3FFF];
		@Pc(43) float local43 = local15 * local33;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat75 = local21 * local9;
		this.aFloat74 = local9 * local39;
		this.aFloat76 = local43 * local27 + -local21 * local39;
		this.aFloat69 = -local15;
		this.aFloat73 = local9 * local33;
		this.aFloat66 = local43 * local21 + local39 * local27;
		this.aFloat70 = -local27 * local33 + local47 * local21;
		this.aFloat68 = local47 * local27 + local21 * local33;
		this.aFloat72 = local9 * local27;
		this.aFloat71 = -(this.aFloat69 * (float) arg1) + (float) -arg0 * this.aFloat72 - this.aFloat75 * (float) arg2;
		this.aFloat67 = -(this.aFloat66 * (float) arg2) + (float) -arg0 * this.aFloat76 - (float) arg1 * this.aFloat73;
		this.aFloat77 = (float) -arg0 * this.aFloat68 - (float) arg1 * this.aFloat74 - this.aFloat70 * (float) arg2;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZLclient!q;)V")
	public void method3400(@OriginalArg(1) Class134 arg0) {
		@Pc(6) Class134_Sub1 local6 = (Class134_Sub1) arg0;
		this.aFloat77 = 0.0F;
		this.aFloat68 = local6.aFloat68;
		this.aFloat72 = local6.aFloat72;
		this.aFloat71 = 0.0F;
		this.aFloat67 = 0.0F;
		this.aFloat75 = local6.aFloat75;
		this.aFloat76 = local6.aFloat76;
		this.aFloat66 = local6.aFloat66;
		this.aFloat74 = local6.aFloat74;
		this.aFloat73 = local6.aFloat73;
		this.aFloat70 = local6.aFloat70;
		this.aFloat69 = local6.aFloat69;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FBFF)F")
	public float method3401(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat72 * arg1 + arg2 * this.aFloat69 + this.aFloat75 * arg0 + this.aFloat71;
	}

	@OriginalMember(owner = "client!haa", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class134 arg0) {
		@Pc(6) Class134_Sub1 local6 = (Class134_Sub1) arg0;
		this.aFloat75 = local6.aFloat75;
		this.aFloat69 = local6.aFloat69;
		this.aFloat72 = local6.aFloat72;
		this.aFloat76 = local6.aFloat76;
		this.aFloat67 = local6.aFloat67;
		this.aFloat73 = local6.aFloat73;
		this.aFloat71 = local6.aFloat71;
		this.aFloat68 = local6.aFloat68;
		this.aFloat77 = local6.aFloat77;
		this.aFloat66 = local6.aFloat66;
		this.aFloat74 = local6.aFloat74;
		this.aFloat70 = local6.aFloat70;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFBF[FF)V")
	public void method3402(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		@Pc(2) float local2 = -arg2;
		@Pc(10) float local10 = local2 * arg1;
		@Pc(14) float local14 = arg4 * local2;
		@Pc(18) float local18 = arg0 * local2;
		@Pc(36) float local36 = local18 * this.aFloat70 + local14 * this.aFloat74 + this.aFloat68 * local10 + this.aFloat77;
		@Pc(63) float local63 = local14 * this.aFloat73 + this.aFloat76 * local10 + this.aFloat66 * local18 + this.aFloat67;
		arg3[2] = arg4 * this.aFloat69 + arg1 * this.aFloat72 + this.aFloat75 * arg0;
		arg3[0] = this.aFloat68 * arg1 + arg4 * this.aFloat74 + arg0 * this.aFloat70;
		arg3[1] = arg4 * this.aFloat73 + this.aFloat76 * arg1 + this.aFloat66 * arg0;
		@Pc(132) float local132 = local14 * this.aFloat69 + this.aFloat72 * local10 + local18 * this.aFloat75 + this.aFloat71;
		arg3[3] = -(local132 * arg3[2] + local36 * arg3[0] + arg3[1] * local63);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)V")
	public void method3403() {
		this.aFloat75 = -this.aFloat75;
		this.aFloat76 = -this.aFloat76;
		this.aFloat66 = -this.aFloat66;
		this.aFloat73 = -this.aFloat73;
		this.aFloat67 = -this.aFloat67;
		this.aFloat69 = -this.aFloat69;
		this.aFloat72 = -this.aFloat72;
		this.aFloat71 = -this.aFloat71;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!q;Z)V")
	public void method3405(@OriginalArg(0) Class134 arg0) {
		@Pc(6) Class134_Sub1 local6 = (Class134_Sub1) arg0;
		this.aFloat68 = local6.aFloat68;
		this.aFloat74 = local6.aFloat76;
		this.aFloat70 = local6.aFloat72;
		this.aFloat76 = local6.aFloat74;
		this.aFloat66 = local6.aFloat69;
		this.aFloat72 = local6.aFloat70;
		this.aFloat73 = local6.aFloat73;
		this.aFloat75 = local6.aFloat75;
		this.aFloat77 = -(local6.aFloat67 * this.aFloat74 + local6.aFloat77 * this.aFloat68 + this.aFloat70 * local6.aFloat71);
		this.aFloat69 = local6.aFloat66;
		this.aFloat67 = -(local6.aFloat77 * this.aFloat76 + this.aFloat73 * local6.aFloat67 + this.aFloat66 * local6.aFloat71);
		this.aFloat71 = -(this.aFloat72 * local6.aFloat77 + local6.aFloat67 * this.aFloat69 + this.aFloat75 * local6.aFloat71);
	}

	@OriginalMember(owner = "client!haa", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat70 * (float) arg2 + this.aFloat68 * (float) arg0 + this.aFloat74 * (float) arg1);
		arg3[1] = (int) ((float) arg1 * this.aFloat73 + (float) arg0 * this.aFloat76 + (float) arg2 * this.aFloat66);
		arg3[2] = (int) (this.aFloat69 * (float) arg1 + this.aFloat72 * (float) arg0 + this.aFloat75 * (float) arg2);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([FI)[F")
	public float[] method3406(@OriginalArg(0) float[] arg0) {
		arg0[5] = this.aFloat73;
		arg0[11] = this.aFloat71;
		arg0[9] = this.aFloat69;
		arg0[13] = 0.0F;
		arg0[6] = this.aFloat66;
		arg0[3] = this.aFloat77;
		arg0[7] = this.aFloat67;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat75;
		arg0[4] = this.aFloat76;
		arg0[8] = this.aFloat72;
		arg0[2] = this.aFloat70;
		arg0[1] = this.aFloat74;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[0] = this.aFloat68;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFIF)V")
	public void method3408(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat71 += arg0;
		this.aFloat67 += arg2;
		this.aFloat77 += arg1;
	}

	@OriginalMember(owner = "client!haa", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat77;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat67;
		@Pc(29) float local29 = (float) arg0[2] - this.aFloat71;
		arg0[2] = (int) (local29 * this.aFloat75 + local12 * this.aFloat70 + local20 * this.aFloat66);
		arg0[0] = (int) (local29 * this.aFloat72 + this.aFloat68 * local12 + this.aFloat76 * local20);
		arg0[1] = (int) (local12 * this.aFloat74 + local20 * this.aFloat73 + local29 * this.aFloat69);
	}

	@OriginalMember(owner = "client!haa", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class4_Sub41.aFloatArray48[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class4_Sub41.aFloatArray49[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat68;
		@Pc(21) float local21 = this.aFloat74;
		@Pc(24) float local24 = this.aFloat70;
		this.aFloat68 = local18 * local9 + this.aFloat72 * local15;
		@Pc(37) float local37 = this.aFloat77;
		this.aFloat74 = local21 * local9 + local15 * this.aFloat69;
		this.aFloat72 = this.aFloat72 * local9 - local18 * local15;
		this.aFloat69 = local9 * this.aFloat69 - local15 * local21;
		this.aFloat70 = local24 * local9 + this.aFloat75 * local15;
		this.aFloat75 = local9 * this.aFloat75 - local15 * local24;
		this.aFloat77 = local9 * local37 + local15 * this.aFloat71;
		this.aFloat71 = local9 * this.aFloat71 - local37 * local15;
	}

	@OriginalMember(owner = "client!haa", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat77 += arg0;
		this.aFloat67 += arg1;
		this.aFloat71 += arg2;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat73 = 1.0F;
		this.aFloat68 = this.aFloat75 = Class4_Sub41.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat70 = Class4_Sub41.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat72 = -this.aFloat70;
		this.aFloat74 = this.aFloat77 = this.aFloat76 = this.aFloat66 = this.aFloat67 = this.aFloat69 = this.aFloat71 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat75 = 1.0F;
		this.aFloat68 = this.aFloat73 = Class4_Sub41.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat76 = Class4_Sub41.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat74 = -this.aFloat76;
		this.aFloat70 = this.aFloat77 = this.aFloat66 = this.aFloat67 = this.aFloat72 = this.aFloat69 = this.aFloat71 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(FBFF)V")
	public void method3410(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat71 = arg0;
		this.aFloat77 = arg2;
		this.aFloat68 = this.aFloat73 = this.aFloat75 = 1.0F;
		this.aFloat76 = this.aFloat72 = this.aFloat74 = this.aFloat69 = this.aFloat70 = this.aFloat66 = 0.0F;
		this.aFloat67 = arg1;
	}

	@OriginalMember(owner = "client!haa", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat68 = this.aFloat73 = this.aFloat75 = 1.0F;
		this.aFloat76 = this.aFloat72 = this.aFloat74 = this.aFloat69 = this.aFloat70 = this.aFloat66 = 0.0F;
		this.aFloat71 = arg2;
		this.aFloat77 = arg0;
		this.aFloat67 = arg1;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFZFFFFFFF)V")
	public void method3411(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat69 = arg2;
		this.aFloat67 = 0.0F;
		this.aFloat75 = arg6;
		this.aFloat77 = 0.0F;
		this.aFloat70 = arg5;
		this.aFloat74 = arg0;
		this.aFloat72 = arg1;
		this.aFloat73 = arg3;
		this.aFloat68 = arg8;
		this.aFloat71 = 0.0F;
		this.aFloat76 = arg7;
		this.aFloat66 = arg4;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method3412(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class134 arg1) {
		@Pc(6) Class134_Sub1 local6 = (Class134_Sub1) arg0;
		@Pc(9) Class134_Sub1 local9 = (Class134_Sub1) arg1;
		this.aFloat68 = local9.aFloat72 * local6.aFloat70 + local6.aFloat74 * local9.aFloat76 + local6.aFloat68 * local9.aFloat68;
		this.aFloat76 = local9.aFloat72 * local6.aFloat66 + local9.aFloat68 * local6.aFloat76 + local9.aFloat76 * local6.aFloat73;
		this.aFloat72 = local9.aFloat72 * local6.aFloat75 + local6.aFloat69 * local9.aFloat76 + local9.aFloat68 * local6.aFloat72;
		this.aFloat74 = local6.aFloat68 * local9.aFloat74 + local6.aFloat74 * local9.aFloat73 + local6.aFloat70 * local9.aFloat69;
		this.aFloat73 = local6.aFloat66 * local9.aFloat69 + local6.aFloat73 * local9.aFloat73 + local6.aFloat76 * local9.aFloat74;
		this.aFloat70 = local9.aFloat70 * local6.aFloat68 + local6.aFloat74 * local9.aFloat66 + local6.aFloat70 * local9.aFloat75;
		this.aFloat69 = local6.aFloat69 * local9.aFloat73 + local6.aFloat72 * local9.aFloat74 + local9.aFloat69 * local6.aFloat75;
		this.aFloat66 = local6.aFloat73 * local9.aFloat66 + local9.aFloat70 * local6.aFloat76 + local9.aFloat75 * local6.aFloat66;
		this.aFloat75 = local9.aFloat75 * local6.aFloat75 + local6.aFloat69 * local9.aFloat66 + local9.aFloat70 * local6.aFloat72;
		this.aFloat77 = local6.aFloat77 + local9.aFloat71 * local6.aFloat70 + local6.aFloat74 * local9.aFloat67 + local6.aFloat68 * local9.aFloat77;
		this.aFloat67 = local6.aFloat67 + local9.aFloat77 * local6.aFloat76 + local6.aFloat73 * local9.aFloat67 + local9.aFloat71 * local6.aFloat66;
		this.aFloat71 = local6.aFloat75 * local9.aFloat71 + local9.aFloat67 * local6.aFloat69 + local9.aFloat77 * local6.aFloat72 + local6.aFloat71;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) (this.aFloat70 * (float) arg2 + this.aFloat74 * (float) arg1 + (float) arg0 * this.aFloat68 + this.aFloat77);
		arg3[1] = (int) (this.aFloat73 * (float) arg1 + (float) arg0 * this.aFloat76 + this.aFloat66 * (float) arg2 + this.aFloat67);
		arg3[2] = (int) (this.aFloat71 + this.aFloat75 * (float) arg2 + this.aFloat72 * (float) arg0 + this.aFloat69 * (float) arg1);
	}

	@OriginalMember(owner = "client!haa", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat68 = this.aFloat73 = this.aFloat75 = 1.0F;
		this.aFloat76 = this.aFloat72 = this.aFloat74 = this.aFloat69 = this.aFloat70 = this.aFloat66 = this.aFloat77 = this.aFloat67 = this.aFloat71 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "([FBFFF)V")
	public void method3414(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[0] = this.aFloat74 * arg1 + this.aFloat68 * arg2 + this.aFloat70 * arg3;
		arg0[1] = this.aFloat66 * arg3 + this.aFloat76 * arg2 + arg1 * this.aFloat73;
		arg0[2] = this.aFloat72 * arg2 + this.aFloat69 * arg1 + this.aFloat75 * arg3;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "([FI)[F")
	public float[] method3415(@OriginalArg(0) float[] arg0) {
		arg0[10] = this.aFloat71;
		arg0[14] = 0.0F;
		arg0[5] = this.aFloat73;
		arg0[0] = this.aFloat68;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat74;
		arg0[15] = 1.0F;
		arg0[9] = this.aFloat67;
		arg0[13] = 0.0F;
		arg0[6] = 0.0F;
		arg0[3] = 0.0F;
		arg0[7] = 0.0F;
		arg0[2] = 0.0F;
		arg0[12] = 0.0F;
		arg0[1] = this.aFloat76;
		arg0[8] = this.aFloat77;
		return arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFFI)F")
	public float method3416(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat74 * arg2 + arg1 * this.aFloat68 + this.aFloat70 * arg0 + this.aFloat77;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(FFFB)V")
	public void method3417(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat77 = 0.0F;
		this.aFloat71 = 0.0F;
		this.aFloat67 = 0.0F;
		this.aFloat74 = 0.0F;
		this.aFloat70 = 0.0F;
		this.aFloat76 = 0.0F;
		this.aFloat73 = arg1;
		this.aFloat75 = arg0;
		this.aFloat68 = arg2;
		this.aFloat72 = 0.0F;
		this.aFloat66 = 0.0F;
		this.aFloat69 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat68 = 1.0F;
		this.aFloat73 = this.aFloat75 = Class4_Sub41.aFloatArray48[arg0 & 0x3FFF];
		this.aFloat69 = Class4_Sub41.aFloatArray49[arg0 & 0x3FFF];
		this.aFloat66 = -this.aFloat69;
		this.aFloat74 = this.aFloat70 = this.aFloat77 = this.aFloat76 = this.aFloat67 = this.aFloat72 = this.aFloat71 = 0.0F;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class134 method7825() {
		@Pc(7) Class134_Sub1 local7 = new Class134_Sub1();
		local7.aFloat69 = this.aFloat69;
		local7.aFloat71 = this.aFloat71;
		local7.aFloat77 = this.aFloat77;
		local7.aFloat68 = this.aFloat68;
		local7.aFloat75 = this.aFloat75;
		local7.aFloat66 = this.aFloat66;
		local7.aFloat67 = this.aFloat67;
		local7.aFloat74 = this.aFloat74;
		local7.aFloat70 = this.aFloat70;
		local7.aFloat73 = this.aFloat73;
		local7.aFloat72 = this.aFloat72;
		local7.aFloat76 = this.aFloat76;
		return local7;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(FFFI)F")
	public float method3418(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat73 * arg0 + arg2 * this.aFloat76 + this.aFloat66 * arg1 + this.aFloat67;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IFIFIFI)V")
	public void method3419(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5) {
		if (arg3 == 0) {
			this.aFloat68 = arg1 * 2;
			this.aFloat71 = arg4;
			this.aFloat75 = 1.0F;
			this.aFloat67 = arg2 - (float) arg5;
			this.aFloat73 = arg5 * 2;
			this.aFloat76 = this.aFloat72 = this.aFloat74 = this.aFloat69 = this.aFloat70 = this.aFloat66 = 0.0F;
			this.aFloat77 = (float) -arg1 + arg0;
			return;
		}
		@Pc(70) float local70 = Class4_Sub41.aFloatArray48[arg3 & 0x3FFF];
		@Pc(76) float local76 = Class4_Sub41.aFloatArray49[arg3 & 0x3FFF];
		this.aFloat68 = (float) arg1 * 2.0F * local70;
		this.aFloat76 = (float) arg1 * local76 * 2.0F;
		this.aFloat73 = (float) arg5 * local70 * 2.0F;
		this.aFloat75 = 1.0F;
		this.aFloat77 = arg0 + (float) (arg1 * 2) * (local76 * 0.5F - local70 * 0.5F);
		this.aFloat72 = this.aFloat69 = this.aFloat70 = this.aFloat66 = 0.0F;
		this.aFloat67 = (local76 * -0.5F - local70 * 0.5F) * (float) (arg5 * 2) + arg2;
		this.aFloat74 = local76 * -2.0F * (float) arg5;
		this.aFloat71 = arg4;
	}
}
