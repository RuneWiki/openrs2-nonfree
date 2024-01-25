import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "F")
	public float aFloat121;

	@OriginalMember(owner = "client!eda", name = "u", descriptor = "F")
	public float aFloat122;

	@OriginalMember(owner = "client!eda", name = "v", descriptor = "F")
	public float aFloat123;

	@OriginalMember(owner = "client!eda", name = "w", descriptor = "F")
	public float aFloat124;

	@OriginalMember(owner = "client!eda", name = "G", descriptor = "F")
	public float aFloat125;

	@OriginalMember(owner = "client!eda", name = "M", descriptor = "F")
	public float aFloat126;

	@OriginalMember(owner = "client!eda", name = "N", descriptor = "F")
	public float aFloat127;

	@OriginalMember(owner = "client!eda", name = "P", descriptor = "F")
	public float aFloat128;

	@OriginalMember(owner = "client!eda", name = "Q", descriptor = "F")
	public float aFloat129;

	@OriginalMember(owner = "client!eda", name = "V", descriptor = "F")
	public float aFloat130;

	@OriginalMember(owner = "client!eda", name = "cb", descriptor = "F")
	public float aFloat131;

	@OriginalMember(owner = "client!eda", name = "db", descriptor = "F")
	public float aFloat132;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	public Class78_Sub1() {
		this.ha();
	}

	@OriginalMember(owner = "client!eda", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.aFloat125 = 1.0F;
		this.aFloat130 = this.aFloat124 = Class15_Sub2_Sub6.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat131 = Class15_Sub2_Sub6.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat127 = -this.aFloat131;
		this.aFloat132 = this.aFloat122 = this.aFloat126 = this.aFloat128 = this.aFloat121 = this.aFloat129 = this.aFloat123 = 0.0F;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([FFZFF)V")
	public void method2178(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		arg0[2] = (float) (this.aFloat124 * arg1 + this.aFloat129 * arg2 + arg3 * this.aFloat127);
		arg0[1] = (float) (arg2 * this.aFloat125 + this.aFloat126 * arg3 + this.aFloat128 * arg1);
		arg0[0] = (float) (this.aFloat132 * arg2 + this.aFloat130 * arg3 + arg1 * this.aFloat131);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I[F)[F")
	public float[] method2179(@OriginalArg(1) float[] arg0) {
		arg0[1] = this.aFloat132;
		arg0[9] = this.aFloat129;
		arg0[7] = this.aFloat121;
		arg0[8] = this.aFloat127;
		arg0[0] = this.aFloat130;
		arg0[2] = this.aFloat131;
		arg0[3] = this.aFloat122;
		arg0[15] = 1.0F;
		arg0[14] = 0.0F;
		arg0[5] = this.aFloat125;
		arg0[11] = this.aFloat123;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat124;
		arg0[4] = this.aFloat126;
		arg0[13] = 0.0F;
		arg0[6] = this.aFloat128;
		return arg0;
	}

	@OriginalMember(owner = "client!eda", name = "EA", descriptor = "(Lclient!m;)V")
	@Override
	public void EA(@OriginalArg(0) Class78 arg0) {
		@Pc(6) Class78_Sub1 local6 = (Class78_Sub1) arg0;
		this.aFloat125 = local6.aFloat125;
		this.aFloat121 = local6.aFloat121;
		this.aFloat132 = local6.aFloat132;
		this.aFloat131 = local6.aFloat131;
		this.aFloat129 = local6.aFloat129;
		this.aFloat127 = local6.aFloat127;
		this.aFloat123 = local6.aFloat123;
		this.aFloat126 = local6.aFloat126;
		this.aFloat128 = local6.aFloat128;
		this.aFloat124 = local6.aFloat124;
		this.aFloat130 = local6.aFloat130;
		this.aFloat122 = local6.aFloat122;
	}

	@OriginalMember(owner = "client!eda", name = "ha", descriptor = "()V")
	@Override
	public void ha() {
		this.aFloat126 = this.aFloat127 = this.aFloat132 = this.aFloat129 = this.aFloat131 = this.aFloat128 = this.aFloat122 = this.aFloat121 = this.aFloat123 = 0.0F;
		this.aFloat130 = this.aFloat125 = this.aFloat124 = 1.0F;
	}

	@OriginalMember(owner = "client!eda", name = "TA", descriptor = "(III)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat123 += arg2;
		this.aFloat122 += arg0;
		this.aFloat121 += arg1;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(FFIF)F")
	public float method2180(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat121 + arg0 * this.aFloat128 + this.aFloat126 * arg1 + this.aFloat125 * arg2;
	}

	@OriginalMember(owner = "client!eda", name = "KA", descriptor = "(I)V")
	@Override
	public void KA(@OriginalArg(0) int arg0) {
		this.aFloat130 = 1.0F;
		this.aFloat125 = this.aFloat124 = Class15_Sub2_Sub6.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat129 = Class15_Sub2_Sub6.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat132 = this.aFloat131 = this.aFloat122 = this.aFloat126 = this.aFloat121 = this.aFloat127 = this.aFloat123 = 0.0F;
		this.aFloat128 = -this.aFloat129;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "([FI)[F")
	public float[] method2181(@OriginalArg(0) float[] arg0) {
		arg0[1] = this.aFloat126;
		arg0[6] = this.aFloat129;
		arg0[8] = this.aFloat131;
		arg0[9] = this.aFloat128;
		arg0[10] = this.aFloat124;
		arg0[14] = this.aFloat123;
		arg0[3] = 0.0F;
		arg0[5] = this.aFloat125;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat132;
		arg0[13] = this.aFloat121;
		arg0[7] = 0.0F;
		arg0[15] = 1;
		arg0[0] = this.aFloat130;
		arg0[2] = this.aFloat127;
		arg0[12] = this.aFloat122;
		return arg0;
	}

	@OriginalMember(owner = "client!eda", name = "va", descriptor = "([I)V")
	@Override
	public void va(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat122;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat121;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat123;
		arg0[2] = (int) (local28 * this.aFloat124 + this.aFloat128 * local19 + local11 * this.aFloat131);
		arg0[0] = (int) (this.aFloat127 * local28 + local11 * this.aFloat130 + this.aFloat126 * local19);
		arg0[1] = (int) (local11 * this.aFloat132 + this.aFloat125 * local19 + this.aFloat129 * local28);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B[F)[F")
	public float[] method2183(@OriginalArg(1) float[] arg0) {
		arg0[14] = 0.0F;
		arg0[9] = this.aFloat121;
		arg0[13] = 0.0F;
		arg0[11] = 0.0F;
		arg0[4] = this.aFloat132;
		arg0[2] = 0.0F;
		arg0[6] = 0.0F;
		arg0[8] = this.aFloat122;
		arg0[15] = 1.0F;
		arg0[7] = 0.0F;
		arg0[5] = this.aFloat125;
		arg0[12] = 0.0F;
		arg0[10] = this.aFloat123;
		arg0[1] = this.aFloat126;
		arg0[0] = this.aFloat130;
		arg0[3] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(FFIF)F")
	public float method2184(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * this.aFloat130 + this.aFloat132 * arg1 + this.aFloat131 * arg2 + this.aFloat122;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(FFIFFFFFFF)V")
	public void method2185(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat127 = arg8;
		this.aFloat128 = arg4;
		this.aFloat126 = arg3;
		this.aFloat132 = arg1;
		this.aFloat131 = arg0;
		this.aFloat121 = 0.0F;
		this.aFloat124 = arg2;
		this.aFloat130 = arg5;
		this.aFloat122 = 0;
		this.aFloat129 = arg7;
		this.aFloat125 = arg6;
		this.aFloat123 = 0.0F;
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V")
	public void method2186() {
		this.aFloat123 = -this.aFloat123;
		this.aFloat121 = -this.aFloat121;
		this.aFloat126 = -this.aFloat126;
		this.aFloat129 = -this.aFloat129;
		this.aFloat127 = -this.aFloat127;
		this.aFloat124 = -this.aFloat124;
		this.aFloat128 = -this.aFloat128;
		this.aFloat125 = -this.aFloat125;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IFFF)V")
	public void method2188(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat126 *= arg1;
		this.aFloat124 *= arg2;
		this.aFloat129 *= arg2;
		this.aFloat122 *= arg0;
		this.aFloat130 *= arg0;
		this.aFloat132 *= arg0;
		this.aFloat121 *= arg1;
		this.aFloat131 *= arg0;
		this.aFloat123 *= arg2;
		this.aFloat128 *= arg1;
		this.aFloat127 *= arg2;
		this.aFloat125 *= arg1;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(FFBF)V")
	public void method2189(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat127 = 0.0F;
		this.aFloat131 = 0.0F;
		this.aFloat122 = 0.0F;
		this.aFloat125 = arg1;
		this.aFloat126 = 0.0F;
		this.aFloat123 = 0.0F;
		this.aFloat132 = 0.0F;
		this.aFloat130 = arg0;
		this.aFloat129 = 0.0F;
		this.aFloat121 = 0.0F;
		this.aFloat128 = 0.0F;
		this.aFloat124 = arg2;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class78 method5707() {
		@Pc(7) Class78_Sub1 local7 = new Class78_Sub1();
		local7.aFloat123 = this.aFloat123;
		local7.aFloat124 = this.aFloat124;
		local7.aFloat121 = this.aFloat121;
		local7.aFloat122 = this.aFloat122;
		local7.aFloat126 = this.aFloat126;
		local7.aFloat128 = this.aFloat128;
		local7.aFloat131 = this.aFloat131;
		local7.aFloat127 = this.aFloat127;
		local7.aFloat125 = this.aFloat125;
		local7.aFloat129 = this.aFloat129;
		local7.aFloat132 = this.aFloat132;
		local7.aFloat130 = this.aFloat130;
		return local7;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!m;)V")
	public void method2190(@OriginalArg(1) Class78 arg0) {
		@Pc(6) Class78_Sub1 local6 = (Class78_Sub1) arg0;
		this.aFloat130 = local6.aFloat130;
		this.aFloat131 = local6.aFloat127;
		this.aFloat132 = local6.aFloat126;
		this.aFloat127 = local6.aFloat131;
		this.aFloat125 = local6.aFloat125;
		this.aFloat126 = local6.aFloat132;
		this.aFloat128 = local6.aFloat129;
		this.aFloat122 = -(this.aFloat132 * local6.aFloat121 + this.aFloat130 * local6.aFloat122 + this.aFloat131 * local6.aFloat123);
		this.aFloat129 = local6.aFloat128;
		this.aFloat124 = local6.aFloat124;
		this.aFloat121 = -(this.aFloat126 * local6.aFloat122 + local6.aFloat121 * this.aFloat125 + local6.aFloat123 * this.aFloat128);
		this.aFloat123 = -(this.aFloat124 * local6.aFloat123 + local6.aFloat121 * this.aFloat129 + local6.aFloat122 * this.aFloat127);
	}

	@OriginalMember(owner = "client!eda", name = "B", descriptor = "(IIIIII)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class15_Sub2_Sub6.aFloatArray69[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class15_Sub2_Sub6.aFloatArray68[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class15_Sub2_Sub6.aFloatArray69[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class15_Sub2_Sub6.aFloatArray68[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class15_Sub2_Sub6.aFloatArray69[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class15_Sub2_Sub6.aFloatArray68[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat130 = local33 * local21 + local47 * local27;
		this.aFloat125 = local9 * local33;
		this.aFloat132 = local9 * local39;
		this.aFloat129 = -local15;
		this.aFloat126 = -local21 * local39 + local43 * local27;
		this.aFloat131 = local33 * -local27 + local47 * local21;
		this.aFloat124 = local21 * local9;
		this.aFloat127 = local9 * local27;
		this.aFloat128 = local43 * local21 + local39 * local27;
		this.aFloat123 = -((float) arg2 * this.aFloat124) - (float) arg1 * this.aFloat129 + this.aFloat127 * (float) -arg0;
		this.aFloat122 = this.aFloat130 * (float) -arg0 - this.aFloat132 * (float) arg1 - this.aFloat131 * (float) arg2;
		this.aFloat121 = -(this.aFloat128 * (float) arg2) + this.aFloat126 * (float) -arg0 - (float) arg1 * this.aFloat125;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!m;Z)V")
	public void method2191(@OriginalArg(0) Class78 arg0) {
		@Pc(6) Class78_Sub1 local6 = (Class78_Sub1) arg0;
		this.aFloat127 = local6.aFloat127;
		this.aFloat122 = 0.0F;
		this.aFloat121 = 0.0F;
		this.aFloat132 = local6.aFloat132;
		this.aFloat126 = local6.aFloat126;
		this.aFloat128 = local6.aFloat128;
		this.aFloat123 = 0.0F;
		this.aFloat124 = local6.aFloat124;
		this.aFloat130 = local6.aFloat130;
		this.aFloat129 = local6.aFloat129;
		this.aFloat131 = local6.aFloat131;
		this.aFloat125 = local6.aFloat125;
	}

	@OriginalMember(owner = "client!eda", name = "I", descriptor = "(III[I)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = (int) ((float) arg0 * this.aFloat130 + this.aFloat132 * (float) arg1 + this.aFloat131 * (float) arg2);
		arg3[2] = (int) ((float) arg0 * this.aFloat127 + (float) arg1 * this.aFloat129 + this.aFloat124 * (float) arg2);
		arg3[1] = (int) (this.aFloat128 * (float) arg2 + (float) arg0 * this.aFloat126 + (float) arg1 * this.aFloat125);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(FIFF)V")
	public void method2192(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat123 += arg2;
		this.aFloat121 += arg1;
		this.aFloat122 += arg0;
	}

	@OriginalMember(owner = "client!eda", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat122 = arg0;
		this.aFloat121 = arg1;
		this.aFloat130 = this.aFloat125 = this.aFloat124 = 1.0F;
		this.aFloat123 = arg2;
		this.aFloat126 = this.aFloat127 = this.aFloat132 = this.aFloat129 = this.aFloat131 = this.aFloat128 = 0.0F;
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(I[F)[F")
	public float[] method2194(@OriginalArg(1) float[] arg0) {
		arg0[7] = this.aFloat121;
		arg0[3] = this.aFloat122;
		arg0[5] = this.aFloat125;
		arg0[1] = this.aFloat132;
		arg0[2] = this.aFloat131;
		arg0[4] = this.aFloat126;
		arg0[0] = this.aFloat130;
		arg0[6] = this.aFloat128;
		return arg0;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!m;B)V")
	public void method2195(@OriginalArg(0) Class78 arg0) {
		@Pc(6) Class78_Sub1 local6 = (Class78_Sub1) arg0;
		@Pc(9) float local9 = this.aFloat130;
		@Pc(12) float local12 = this.aFloat126;
		@Pc(15) float local15 = this.aFloat132;
		@Pc(18) float local18 = this.aFloat125;
		@Pc(21) float local21 = this.aFloat131;
		@Pc(24) float local24 = this.aFloat128;
		@Pc(27) float local27 = this.aFloat122;
		this.aFloat126 = local6.aFloat126 * local9 + local6.aFloat125 * local12 + this.aFloat127 * local6.aFloat128;
		@Pc(47) float local47 = this.aFloat121;
		this.aFloat130 = local6.aFloat130 * local9 + local12 * local6.aFloat132 + local6.aFloat131 * this.aFloat127;
		this.aFloat132 = local18 * local6.aFloat132 + local6.aFloat130 * local15 + this.aFloat129 * local6.aFloat131;
		this.aFloat127 = local6.aFloat127 * local9 + local12 * local6.aFloat129 + this.aFloat127 * local6.aFloat124;
		this.aFloat125 = local6.aFloat126 * local15 + local18 * local6.aFloat125 + this.aFloat129 * local6.aFloat128;
		this.aFloat129 = this.aFloat129 * local6.aFloat124 + local6.aFloat127 * local15 + local6.aFloat129 * local18;
		this.aFloat131 = local24 * local6.aFloat132 + local6.aFloat130 * local21 + local6.aFloat131 * this.aFloat124;
		this.aFloat128 = local24 * local6.aFloat125 + local6.aFloat126 * local21 + this.aFloat124 * local6.aFloat128;
		this.aFloat122 = local6.aFloat131 * this.aFloat123 + local6.aFloat130 * local27 + local6.aFloat132 * local47 + local6.aFloat122;
		this.aFloat121 = local6.aFloat121 + this.aFloat123 * local6.aFloat128 + local47 * local6.aFloat125 + local6.aFloat126 * local27;
		this.aFloat124 = local24 * local6.aFloat129 + local21 * local6.aFloat127 + local6.aFloat124 * this.aFloat124;
		this.aFloat123 = local47 * local6.aFloat129 + local6.aFloat127 * local27 + local6.aFloat124 * this.aFloat123 + local6.aFloat123;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat123 + (float) arg2 * this.aFloat124 + this.aFloat129 * (float) arg1 + (float) arg0 * this.aFloat127);
		arg3[1] = (int) (this.aFloat121 + this.aFloat126 * (float) arg0 + (float) arg1 * this.aFloat125 + this.aFloat128 * (float) arg2);
		arg3[0] = (int) ((float) arg2 * this.aFloat131 + (float) arg1 * this.aFloat132 + this.aFloat130 * (float) arg0 + this.aFloat122);
	}

	@OriginalMember(owner = "client!eda", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class15_Sub2_Sub6.aFloatArray69[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class15_Sub2_Sub6.aFloatArray68[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat130;
		@Pc(21) float local21 = this.aFloat132;
		@Pc(24) float local24 = this.aFloat131;
		@Pc(27) float local27 = this.aFloat122;
		this.aFloat130 = this.aFloat127 * local15 + local9 * local18;
		this.aFloat127 = local9 * this.aFloat127 - local18 * local15;
		this.aFloat132 = local9 * local21 + local15 * this.aFloat129;
		this.aFloat129 = this.aFloat129 * local9 - local21 * local15;
		this.aFloat131 = this.aFloat124 * local15 + local9 * local24;
		this.aFloat122 = local27 * local9 + local15 * this.aFloat123;
		this.aFloat124 = this.aFloat124 * local9 - local15 * local24;
		this.aFloat123 = this.aFloat123 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!eda", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class15_Sub2_Sub6.aFloatArray69[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class15_Sub2_Sub6.aFloatArray68[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat126;
		@Pc(21) float local21 = this.aFloat125;
		@Pc(24) float local24 = this.aFloat128;
		@Pc(27) float local27 = this.aFloat121;
		this.aFloat126 = local9 * local18 - local15 * this.aFloat127;
		this.aFloat125 = local9 * local21 - local15 * this.aFloat129;
		this.aFloat127 = local15 * local18 + this.aFloat127 * local9;
		this.aFloat129 = local15 * local21 + this.aFloat129 * local9;
		this.aFloat128 = local24 * local9 - this.aFloat124 * local15;
		this.aFloat121 = local9 * local27 - this.aFloat123 * local15;
		this.aFloat124 = this.aFloat124 * local9 + local24 * local15;
		this.aFloat123 = local27 * local15 + local9 * this.aFloat123;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IFFIIIF)V")
	public void method2196(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat130 = arg4 * 2;
			this.aFloat125 = arg2 * 2;
			this.aFloat124 = 1.0F;
			this.aFloat126 = this.aFloat127 = this.aFloat132 = this.aFloat129 = this.aFloat131 = this.aFloat128 = 0.0F;
		} else {
			@Pc(10) float local10 = Class15_Sub2_Sub6.aFloatArray69[arg3 & 0x3FFF];
			@Pc(16) float local16 = Class15_Sub2_Sub6.aFloatArray68[arg3 & 0x3FFF];
			this.aFloat127 = this.aFloat129 = this.aFloat131 = this.aFloat128 = 0.0F;
			this.aFloat130 = local10 * 2.0F * (float) arg4;
			this.aFloat132 = local16 * -2.0F * (float) arg2;
			this.aFloat125 = (float) arg2 * local10 * 2.0F;
			this.aFloat126 = (float) arg4 * local16 * 2.0F;
			this.aFloat124 = 1.0F;
		}
		this.aFloat121 = (float) -arg2 + arg5;
		this.aFloat123 = arg1;
		this.aFloat122 = (float) -arg4 + arg0;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Lclient!m;Lclient!m;)V")
	public void method2197(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1) {
		@Pc(6) Class78_Sub1 local6 = (Class78_Sub1) arg0;
		@Pc(9) Class78_Sub1 local9 = (Class78_Sub1) arg1;
		this.aFloat130 = local9.aFloat127 * local6.aFloat131 + local9.aFloat130 * local6.aFloat130 + local9.aFloat126 * local6.aFloat132;
		this.aFloat126 = local9.aFloat126 * local6.aFloat125 + local9.aFloat130 * local6.aFloat126 + local9.aFloat127 * local6.aFloat128;
		this.aFloat132 = local6.aFloat131 * local9.aFloat129 + local6.aFloat132 * local9.aFloat125 + local6.aFloat130 * local9.aFloat132;
		this.aFloat127 = local9.aFloat126 * local6.aFloat129 + local6.aFloat127 * local9.aFloat130 + local6.aFloat124 * local9.aFloat127;
		this.aFloat125 = local6.aFloat128 * local9.aFloat129 + local6.aFloat126 * local9.aFloat132 + local6.aFloat125 * local9.aFloat125;
		this.aFloat129 = local6.aFloat124 * local9.aFloat129 + local6.aFloat129 * local9.aFloat125 + local9.aFloat132 * local6.aFloat127;
		this.aFloat131 = local9.aFloat124 * local6.aFloat131 + local9.aFloat131 * local6.aFloat130 + local9.aFloat128 * local6.aFloat132;
		this.aFloat128 = local6.aFloat125 * local9.aFloat128 + local6.aFloat126 * local9.aFloat131 + local9.aFloat124 * local6.aFloat128;
		this.aFloat122 = local9.aFloat123 * local6.aFloat131 + local9.aFloat122 * local6.aFloat130 + local6.aFloat132 * local9.aFloat121 + local6.aFloat122;
		this.aFloat124 = local6.aFloat124 * local9.aFloat124 + local6.aFloat129 * local9.aFloat128 + local9.aFloat131 * local6.aFloat127;
		this.aFloat121 = local6.aFloat121 + local9.aFloat123 * local6.aFloat128 + local9.aFloat121 * local6.aFloat125 + local6.aFloat126 * local9.aFloat122;
		this.aFloat123 = local9.aFloat122 * local6.aFloat127 + local9.aFloat121 * local6.aFloat129 + local9.aFloat123 * local6.aFloat124 + local6.aFloat123;
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(FFIF)V")
	public void method2198(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat126 = this.aFloat127 = this.aFloat132 = this.aFloat129 = this.aFloat131 = this.aFloat128 = 0.0F;
		this.aFloat122 = arg2;
		this.aFloat130 = this.aFloat125 = this.aFloat124 = 1.0F;
		this.aFloat123 = arg0;
		this.aFloat121 = arg1;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(FBFF[FF)V")
	public void method2199(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) float arg4) {
		@Pc(2) float local2 = -arg0;
		@Pc(10) float local10 = local2 * arg4;
		@Pc(14) float local14 = arg1 * local2;
		@Pc(18) float local18 = local2 * arg2;
		@Pc(41) float local41 = this.aFloat132 * local14 + this.aFloat130 * local10 + local18 * this.aFloat131 + this.aFloat122;
		@Pc(59) float local59 = local14 * this.aFloat125 + this.aFloat126 * local10 + this.aFloat128 * local18 + this.aFloat121;
		arg3[0] = arg2 * this.aFloat131 + arg4 * this.aFloat130 + this.aFloat132 * arg1;
		arg3[1] = arg2 * this.aFloat128 + arg4 * this.aFloat126 + arg1 * this.aFloat125;
		arg3[2] = arg2 * this.aFloat124 + arg1 * this.aFloat129 + arg4 * this.aFloat127;
		@Pc(128) float local128 = this.aFloat123 + local18 * this.aFloat124 + this.aFloat129 * local14 + this.aFloat127 * local10;
		arg3[3] = -(local128 * arg3[2] + local59 * arg3[1] + local41 * arg3[0]);
	}

	@OriginalMember(owner = "client!eda", name = "ta", descriptor = "(I)V")
	@Override
	public void ta(@OriginalArg(0) int arg0) {
		this.aFloat124 = 1.0F;
		this.aFloat130 = this.aFloat125 = Class15_Sub2_Sub6.aFloatArray69[arg0 & 0x3FFF];
		this.aFloat126 = Class15_Sub2_Sub6.aFloatArray68[arg0 & 0x3FFF];
		this.aFloat132 = -this.aFloat126;
		this.aFloat131 = this.aFloat122 = this.aFloat128 = this.aFloat121 = this.aFloat127 = this.aFloat129 = this.aFloat123 = 0.0F;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(FFFB)F")
	public float method2200(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat124 * arg1 + this.aFloat127 * arg0 + this.aFloat129 * arg2 + this.aFloat123;
	}
}
