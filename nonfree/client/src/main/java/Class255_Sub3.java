import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class255_Sub3 extends Class255 {

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class255_Sub3() {
		this.Y();
	}

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "()V")
	@Override
	public void Y() {
		this.aFloat200 = this.aFloat193 = this.aFloat196 = this.aFloat191 = this.aFloat199 = this.aFloat201 = this.aFloat195 = this.aFloat197 = this.aFloat194 = 0.0F;
		this.aFloat198 = this.aFloat190 = this.aFloat192 = 1.0F;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!q;Lclient!q;)V")
	public void method8022(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class255 arg1) {
		@Pc(6) Class255_Sub3 local6 = (Class255_Sub3) arg0;
		@Pc(9) Class255_Sub3 local9 = (Class255_Sub3) arg1;
		this.aFloat198 = local6.aFloat196 * local9.aFloat200 + local9.aFloat198 * local6.aFloat198 + local6.aFloat199 * local9.aFloat193;
		this.aFloat200 = local9.aFloat198 * local6.aFloat200 + local6.aFloat190 * local9.aFloat200 + local9.aFloat193 * local6.aFloat201;
		this.aFloat196 = local9.aFloat196 * local6.aFloat198 + local6.aFloat196 * local9.aFloat190 + local9.aFloat191 * local6.aFloat199;
		this.aFloat193 = local9.aFloat198 * local6.aFloat193 + local9.aFloat200 * local6.aFloat191 + local6.aFloat192 * local9.aFloat193;
		this.aFloat190 = local9.aFloat196 * local6.aFloat200 + local6.aFloat190 * local9.aFloat190 + local9.aFloat191 * local6.aFloat201;
		this.aFloat199 = local6.aFloat199 * local9.aFloat192 + local9.aFloat201 * local6.aFloat196 + local6.aFloat198 * local9.aFloat199;
		this.aFloat191 = local9.aFloat191 * local6.aFloat192 + local6.aFloat191 * local9.aFloat190 + local9.aFloat196 * local6.aFloat193;
		this.aFloat201 = local6.aFloat201 * local9.aFloat192 + local6.aFloat190 * local9.aFloat201 + local9.aFloat199 * local6.aFloat200;
		this.aFloat195 = local6.aFloat195 + local9.aFloat197 * local6.aFloat196 + local6.aFloat198 * local9.aFloat195 + local6.aFloat199 * local9.aFloat194;
		this.aFloat192 = local9.aFloat201 * local6.aFloat191 + local6.aFloat193 * local9.aFloat199 + local6.aFloat192 * local9.aFloat192;
		this.aFloat197 = local6.aFloat197 + local6.aFloat200 * local9.aFloat195 + local6.aFloat190 * local9.aFloat197 + local9.aFloat194 * local6.aFloat201;
		this.aFloat194 = local6.aFloat194 + local9.aFloat197 * local6.aFloat191 + local9.aFloat195 * local6.aFloat193 + local6.aFloat192 * local9.aFloat194;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!q;I)V")
	public void method8023(@OriginalArg(0) Class255 arg0) {
		@Pc(6) Class255_Sub3 local6 = (Class255_Sub3) arg0;
		this.aFloat192 = local6.aFloat192;
		this.aFloat201 = local6.aFloat201;
		this.aFloat196 = local6.aFloat196;
		this.aFloat193 = local6.aFloat193;
		this.aFloat199 = local6.aFloat199;
		this.aFloat195 = 0;
		this.aFloat194 = 0.0F;
		this.aFloat190 = local6.aFloat190;
		this.aFloat197 = 0.0F;
		this.aFloat198 = local6.aFloat198;
		this.aFloat191 = local6.aFloat191;
		this.aFloat200 = local6.aFloat200;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(F[FFFZ)V")
	public void method8024(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		arg1[2] = this.aFloat193 * arg3 + this.aFloat191 * arg0 + arg2 * this.aFloat192;
		arg1[1] = arg3 * this.aFloat200 + arg0 * this.aFloat190 + this.aFloat201 * arg2;
		arg1[0] = this.aFloat198 * arg3 + this.aFloat196 * arg0 + arg2 * this.aFloat199;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFIIIFF)V")
	public void method8025(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5) {
		if (arg3 == 0) {
			this.aFloat198 = arg2 * 2;
			this.aFloat200 = this.aFloat193 = this.aFloat196 = this.aFloat191 = this.aFloat199 = this.aFloat201 = 0.0F;
			this.aFloat190 = arg1 * 2;
			this.aFloat195 = (float) -arg2 + arg0;
			this.aFloat197 = arg4 - (float) arg1;
			this.aFloat194 = arg5;
			this.aFloat192 = 1.0F;
			return;
		}
		@Pc(58) float local58 = Class55_Sub2_Sub1.aFloatArray8[arg3 & 0x3FFF];
		@Pc(64) float local64 = Class55_Sub2_Sub1.aFloatArray7[arg3 & 0x3FFF];
		this.aFloat200 = (float) arg2 * local64 * 2.0F;
		this.aFloat193 = this.aFloat191 = this.aFloat199 = this.aFloat201 = 0.0F;
		this.aFloat192 = 1.0F;
		this.aFloat195 = (float) (arg2 * 2) * (local64 * 0.5F - local58 * 0.5F) + arg0;
		this.aFloat194 = arg5;
		this.aFloat196 = -2.0F * local64 * (float) arg1;
		this.aFloat197 = (local64 * -0.5F - local58 * 0.5F) * (float) (arg1 * 2) + arg4;
		this.aFloat198 = (float) arg2 * 2.0F * local58;
		this.aFloat190 = (float) arg1 * local58 * 2.0F;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([FI)[F")
	public float[] method8026(@OriginalArg(0) float[] arg0) {
		arg0[9] = this.aFloat197;
		arg0[2] = 0.0F;
		arg0[15] = 1.0F;
		arg0[6] = 0.0F;
		arg0[5] = this.aFloat190;
		arg0[14] = 0.0F;
		arg0[13] = 0.0F;
		arg0[3] = 0.0F;
		arg0[8] = this.aFloat195;
		arg0[12] = 0.0F;
		arg0[7] = 0.0F;
		arg0[0] = this.aFloat198;
		arg0[10] = this.aFloat194;
		arg0[1] = this.aFloat200;
		arg0[4] = this.aFloat196;
		arg0[11] = 0.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		this.aFloat190 = 1.0F;
		this.aFloat198 = this.aFloat192 = Class55_Sub2_Sub1.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat199 = Class55_Sub2_Sub1.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat193 = -this.aFloat199;
		this.aFloat196 = this.aFloat195 = this.aFloat200 = this.aFloat201 = this.aFloat197 = this.aFloat191 = this.aFloat194 = 0.0F;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFIFFFF)V")
	public void method8027(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float arg8) {
		this.aFloat191 = arg5;
		this.aFloat197 = 0.0F;
		this.aFloat199 = arg2;
		this.aFloat201 = arg3;
		this.aFloat192 = arg0;
		this.aFloat198 = arg4;
		this.aFloat195 = 0.0F;
		this.aFloat193 = arg1;
		this.aFloat194 = 0.0F;
		this.aFloat200 = arg6;
		this.aFloat196 = arg7;
		this.aFloat190 = arg8;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class255 method8170() {
		@Pc(7) Class255_Sub3 local7 = new Class255_Sub3();
		local7.aFloat199 = this.aFloat199;
		local7.aFloat191 = this.aFloat191;
		local7.aFloat201 = this.aFloat201;
		local7.aFloat198 = this.aFloat198;
		local7.aFloat194 = this.aFloat194;
		local7.aFloat193 = this.aFloat193;
		local7.aFloat195 = this.aFloat195;
		local7.aFloat190 = this.aFloat190;
		local7.aFloat196 = this.aFloat196;
		local7.aFloat197 = this.aFloat197;
		local7.aFloat200 = this.aFloat200;
		local7.aFloat192 = this.aFloat192;
		return local7;
	}

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "(I)V")
	@Override
	public void S(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class55_Sub2_Sub1.aFloatArray8[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class55_Sub2_Sub1.aFloatArray7[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat200;
		@Pc(21) float local21 = this.aFloat190;
		@Pc(24) float local24 = this.aFloat201;
		this.aFloat200 = local9 * local18 - local15 * this.aFloat193;
		@Pc(38) float local38 = this.aFloat197;
		this.aFloat190 = local9 * local21 - this.aFloat191 * local15;
		this.aFloat193 = local9 * this.aFloat193 + local15 * local18;
		this.aFloat191 = local9 * this.aFloat191 + local15 * local21;
		this.aFloat201 = local24 * local9 - this.aFloat192 * local15;
		this.aFloat192 = local15 * local24 + local9 * this.aFloat192;
		this.aFloat197 = local38 * local9 - this.aFloat194 * local15;
		this.aFloat194 = local15 * local38 + local9 * this.aFloat194;
	}

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "(I)V")
	@Override
	public void P(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class55_Sub2_Sub1.aFloatArray8[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class55_Sub2_Sub1.aFloatArray7[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat198;
		@Pc(21) float local21 = this.aFloat196;
		@Pc(24) float local24 = this.aFloat199;
		this.aFloat198 = local9 * local18 + this.aFloat193 * local15;
		@Pc(37) float local37 = this.aFloat195;
		this.aFloat193 = local9 * this.aFloat193 - local18 * local15;
		this.aFloat196 = local9 * local21 + local15 * this.aFloat191;
		this.aFloat199 = local15 * this.aFloat192 + local24 * local9;
		this.aFloat191 = local9 * this.aFloat191 - local21 * local15;
		this.aFloat192 = this.aFloat192 * local9 - local15 * local24;
		this.aFloat195 = local9 * local37 + this.aFloat194 * local15;
		this.aFloat194 = this.aFloat194 * local9 - local37 * local15;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFF[FFF)V")
	public void method8028(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4) {
		@Pc(2) float local2 = -arg1;
		@Pc(10) float local10 = arg3 * local2;
		@Pc(14) float local14 = arg4 * local2;
		@Pc(18) float local18 = local2 * arg0;
		@Pc(36) float local36 = this.aFloat196 * local14 + local10 * this.aFloat198 + local18 * this.aFloat199 + this.aFloat195;
		@Pc(54) float local54 = local14 * this.aFloat190 + this.aFloat200 * local10 + this.aFloat201 * local18 + this.aFloat197;
		arg2[0] = arg0 * this.aFloat199 + arg4 * this.aFloat196 + arg3 * this.aFloat198;
		arg2[1] = arg0 * this.aFloat201 + this.aFloat200 * arg3 + this.aFloat190 * arg4;
		@Pc(106) float local106 = this.aFloat194 + this.aFloat193 * local10 + this.aFloat191 * local14 + local18 * this.aFloat192;
		arg2[2] = this.aFloat192 * arg0 + arg4 * this.aFloat191 + arg3 * this.aFloat193;
		arg2[3] = -(local36 * arg2[0] + local54 * arg2[1] + arg2[2] * local106);
	}

	@OriginalMember(owner = "client!vc", name = "pa", descriptor = "(IIIIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class55_Sub2_Sub1.aFloatArray8[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class55_Sub2_Sub1.aFloatArray7[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class55_Sub2_Sub1.aFloatArray8[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class55_Sub2_Sub1.aFloatArray7[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class55_Sub2_Sub1.aFloatArray8[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class55_Sub2_Sub1.aFloatArray7[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local15 * local39;
		this.aFloat193 = local27 * local9;
		this.aFloat198 = local47 * local27 + local33 * local21;
		this.aFloat199 = local21 * local47 + local33 * -local27;
		this.aFloat201 = local39 * local27 + local43 * local21;
		this.aFloat200 = -local21 * local39 + local43 * local27;
		this.aFloat191 = -local15;
		this.aFloat196 = local39 * local9;
		this.aFloat192 = local21 * local9;
		this.aFloat190 = local33 * local9;
		this.aFloat195 = -((float) arg2 * this.aFloat199) - (float) arg1 * this.aFloat196 + this.aFloat198 * (float) -arg0;
		this.aFloat197 = -(this.aFloat201 * (float) arg2) + this.aFloat200 * (float) -arg0 - this.aFloat190 * (float) arg1;
		this.aFloat194 = -(this.aFloat191 * (float) arg1) + this.aFloat193 * (float) -arg0 - (float) arg2 * this.aFloat192;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFI)V")
	public void method8029(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat194 += arg1;
		this.aFloat195 += arg2;
		this.aFloat197 += arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFIF)F")
	public float method8030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return this.aFloat194 + this.aFloat193 * arg1 + this.aFloat191 * arg2 + this.aFloat192 * arg0;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "([FI)[F")
	public float[] method8031(@OriginalArg(0) float[] arg0) {
		arg0[12] = 0.0F;
		arg0[1] = this.aFloat196;
		arg0[3] = this.aFloat195;
		arg0[15] = 1.0F;
		arg0[5] = this.aFloat190;
		arg0[9] = this.aFloat191;
		arg0[13] = 0.0F;
		arg0[8] = this.aFloat193;
		arg0[7] = this.aFloat197;
		arg0[6] = this.aFloat201;
		arg0[0] = this.aFloat198;
		arg0[14] = 0.0F;
		arg0[11] = this.aFloat194;
		arg0[10] = this.aFloat192;
		arg0[2] = this.aFloat199;
		arg0[4] = this.aFloat200;
		return arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!q;Z)V")
	public void method8032(@OriginalArg(0) Class255 arg0) {
		@Pc(6) Class255_Sub3 local6 = (Class255_Sub3) arg0;
		@Pc(9) float local9 = this.aFloat198;
		@Pc(12) float local12 = this.aFloat200;
		@Pc(15) float local15 = this.aFloat196;
		@Pc(26) float local26 = this.aFloat190;
		@Pc(29) float local29 = this.aFloat199;
		@Pc(32) float local32 = this.aFloat201;
		@Pc(35) float local35 = this.aFloat195;
		@Pc(38) float local38 = this.aFloat197;
		this.aFloat200 = this.aFloat193 * local6.aFloat201 + local9 * local6.aFloat200 + local6.aFloat190 * local12;
		this.aFloat198 = local6.aFloat199 * this.aFloat193 + local12 * local6.aFloat196 + local9 * local6.aFloat198;
		this.aFloat190 = local6.aFloat201 * this.aFloat191 + local15 * local6.aFloat200 + local26 * local6.aFloat190;
		this.aFloat196 = local6.aFloat199 * this.aFloat191 + local26 * local6.aFloat196 + local15 * local6.aFloat198;
		this.aFloat193 = local12 * local6.aFloat191 + local9 * local6.aFloat193 + this.aFloat193 * local6.aFloat192;
		this.aFloat191 = local15 * local6.aFloat193 + local26 * local6.aFloat191 + local6.aFloat192 * this.aFloat191;
		this.aFloat199 = local32 * local6.aFloat196 + local29 * local6.aFloat198 + local6.aFloat199 * this.aFloat192;
		this.aFloat201 = local6.aFloat201 * this.aFloat192 + local29 * local6.aFloat200 + local6.aFloat190 * local32;
		this.aFloat192 = this.aFloat192 * local6.aFloat192 + local32 * local6.aFloat191 + local29 * local6.aFloat193;
		this.aFloat195 = this.aFloat194 * local6.aFloat199 + local6.aFloat196 * local38 + local6.aFloat198 * local35 + local6.aFloat195;
		this.aFloat197 = local6.aFloat201 * this.aFloat194 + local38 * local6.aFloat190 + local6.aFloat200 * local35 + local6.aFloat197;
		this.aFloat194 = this.aFloat194 * local6.aFloat192 + local35 * local6.aFloat193 + local6.aFloat191 * local38 + local6.aFloat194;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z[F)[F")
	public float[] method8033(@OriginalArg(1) float[] arg0) {
		arg0[8] = this.aFloat199;
		arg0[2] = this.aFloat193;
		arg0[3] = 0.0F;
		arg0[10] = this.aFloat192;
		arg0[0] = this.aFloat198;
		arg0[13] = this.aFloat197;
		arg0[1] = this.aFloat200;
		arg0[6] = this.aFloat191;
		arg0[4] = this.aFloat196;
		arg0[7] = 0.0F;
		arg0[11] = 0.0F;
		arg0[5] = this.aFloat190;
		arg0[12] = this.aFloat195;
		arg0[14] = this.aFloat194;
		arg0[9] = this.aFloat201;
		arg0[15] = 1.0F;
		return arg0;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lclient!q;I)V")
	public void method8034(@OriginalArg(0) Class255 arg0) {
		@Pc(13) Class255_Sub3 local13 = (Class255_Sub3) arg0;
		this.aFloat199 = local13.aFloat193;
		this.aFloat196 = local13.aFloat200;
		this.aFloat198 = local13.aFloat198;
		this.aFloat200 = local13.aFloat196;
		this.aFloat193 = local13.aFloat199;
		this.aFloat190 = local13.aFloat190;
		this.aFloat201 = local13.aFloat191;
		this.aFloat192 = local13.aFloat192;
		this.aFloat191 = local13.aFloat201;
		this.aFloat195 = -(this.aFloat198 * local13.aFloat195 + local13.aFloat197 * this.aFloat196 + local13.aFloat194 * this.aFloat199);
		this.aFloat197 = -(this.aFloat190 * local13.aFloat197 + this.aFloat200 * local13.aFloat195 + this.aFloat201 * local13.aFloat194);
		this.aFloat194 = -(local13.aFloat194 * this.aFloat192 + local13.aFloat195 * this.aFloat193 + local13.aFloat197 * this.aFloat191);
	}

	@OriginalMember(owner = "client!vc", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.aFloat192 = 1.0F;
		this.aFloat198 = this.aFloat190 = Class55_Sub2_Sub1.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat200 = Class55_Sub2_Sub1.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat199 = this.aFloat195 = this.aFloat201 = this.aFloat197 = this.aFloat193 = this.aFloat191 = this.aFloat194 = 0.0F;
		this.aFloat196 = -this.aFloat200;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(FFFI)V")
	public void method8035(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.aFloat195 = arg1;
		this.aFloat198 = this.aFloat190 = this.aFloat192 = 1.0F;
		this.aFloat200 = this.aFloat193 = this.aFloat196 = this.aFloat191 = this.aFloat199 = this.aFloat201 = 0.0F;
		this.aFloat194 = arg0;
		this.aFloat197 = arg2;
	}

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "([I)V")
	@Override
	public void O(@OriginalArg(0) int[] arg0) {
		@Pc(11) float local11 = (float) arg0[0] - this.aFloat195;
		@Pc(19) float local19 = (float) arg0[1] - this.aFloat197;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat194;
		arg0[2] = (int) (this.aFloat201 * local19 + local11 * this.aFloat199 + this.aFloat192 * local28);
		arg0[1] = (int) (this.aFloat191 * local28 + local11 * this.aFloat196 + local19 * this.aFloat190);
		arg0[0] = (int) (this.aFloat198 * local11 + local19 * this.aFloat200 + this.aFloat193 * local28);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZFFF)F")
	public float method8036(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * this.aFloat199 + this.aFloat198 * arg0 + this.aFloat196 * arg1 + this.aFloat195;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(FFFI)F")
	public float method8037(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return this.aFloat197 + arg0 * this.aFloat201 + arg1 * this.aFloat190 + arg2 * this.aFloat200;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[I)V")
	@Override
	public void method8168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg1 * this.aFloat190 + this.aFloat200 * (float) arg0 + (float) arg2 * this.aFloat201 + this.aFloat197);
		arg3[0] = (int) ((float) arg1 * this.aFloat196 + this.aFloat198 * (float) arg0 + (float) arg2 * this.aFloat199 + this.aFloat195);
		arg3[2] = (int) (this.aFloat194 + this.aFloat192 * (float) arg2 + this.aFloat191 * (float) arg1 + (float) arg0 * this.aFloat193);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFBF)V")
	public void method8038(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat193 *= arg1;
		this.aFloat199 *= arg0;
		this.aFloat197 *= arg2;
		this.aFloat196 *= arg0;
		this.aFloat200 *= arg2;
		this.aFloat201 *= arg2;
		this.aFloat192 *= arg1;
		this.aFloat195 *= arg0;
		this.aFloat191 *= arg1;
		this.aFloat198 *= arg0;
		this.aFloat190 *= arg2;
		this.aFloat194 *= arg1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B[F)[F")
	public float[] method8039(@OriginalArg(1) float[] arg0) {
		arg0[3] = this.aFloat195;
		arg0[1] = this.aFloat196;
		arg0[6] = this.aFloat201;
		arg0[2] = this.aFloat199;
		arg0[7] = this.aFloat197;
		arg0[4] = this.aFloat200;
		arg0[0] = this.aFloat198;
		arg0[5] = this.aFloat190;
		return arg0;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	public void method8040() {
		this.aFloat191 = -this.aFloat191;
		this.aFloat193 = -this.aFloat193;
		this.aFloat190 = -this.aFloat190;
		this.aFloat201 = -this.aFloat201;
		this.aFloat197 = -this.aFloat197;
		this.aFloat192 = -this.aFloat192;
		this.aFloat194 = -this.aFloat194;
		this.aFloat200 = -this.aFloat200;
	}

	@OriginalMember(owner = "client!vc", name = "GA", descriptor = "(III)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat194 = arg2;
		this.aFloat200 = this.aFloat193 = this.aFloat196 = this.aFloat191 = this.aFloat199 = this.aFloat201 = 0.0F;
		this.aFloat195 = arg0;
		this.aFloat197 = arg1;
		this.aFloat198 = this.aFloat190 = this.aFloat192 = 1.0F;
	}

	@OriginalMember(owner = "client!vc", name = "XA", descriptor = "(I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0) {
		this.aFloat198 = 1.0F;
		this.aFloat190 = this.aFloat192 = Class55_Sub2_Sub1.aFloatArray8[arg0 & 0x3FFF];
		this.aFloat191 = Class55_Sub2_Sub1.aFloatArray7[arg0 & 0x3FFF];
		this.aFloat201 = -this.aFloat191;
		this.aFloat196 = this.aFloat199 = this.aFloat195 = this.aFloat200 = this.aFloat197 = this.aFloat193 = this.aFloat194 = 0.0F;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(FFIF)V")
	public void method8042(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		this.aFloat191 = 0.0F;
		this.aFloat195 = 0.0F;
		this.aFloat193 = 0.0F;
		this.aFloat200 = 0.0F;
		this.aFloat190 = arg1;
		this.aFloat198 = arg2;
		this.aFloat192 = arg0;
		this.aFloat199 = 0.0F;
		this.aFloat201 = 0.0F;
		this.aFloat196 = 0.0F;
		this.aFloat197 = 0;
		this.aFloat194 = 0.0F;
	}

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "(III)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat195 += arg0;
		this.aFloat194 += arg2;
		this.aFloat197 += arg1;
	}

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "(III[I)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[2] = (int) (this.aFloat192 * (float) arg2 + (float) arg1 * this.aFloat191 + this.aFloat193 * (float) arg0);
		arg3[1] = (int) ((float) arg0 * this.aFloat200 + (float) arg1 * this.aFloat190 + (float) arg2 * this.aFloat201);
		arg3[0] = (int) (this.aFloat199 * (float) arg2 + this.aFloat196 * (float) arg1 + (float) arg0 * this.aFloat198);
	}

	@OriginalMember(owner = "client!vc", name = "la", descriptor = "(Lclient!q;)V")
	@Override
	public void la(@OriginalArg(0) Class255 arg0) {
		@Pc(6) Class255_Sub3 local6 = (Class255_Sub3) arg0;
		this.aFloat199 = local6.aFloat199;
		this.aFloat195 = local6.aFloat195;
		this.aFloat201 = local6.aFloat201;
		this.aFloat191 = local6.aFloat191;
		this.aFloat193 = local6.aFloat193;
		this.aFloat198 = local6.aFloat198;
		this.aFloat196 = local6.aFloat196;
		this.aFloat197 = local6.aFloat197;
		this.aFloat194 = local6.aFloat194;
		this.aFloat190 = local6.aFloat190;
		this.aFloat200 = local6.aFloat200;
		this.aFloat192 = local6.aFloat192;
	}
}
