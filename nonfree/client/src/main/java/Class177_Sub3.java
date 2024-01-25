import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class177_Sub3 extends Class177 {

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "F")
	public float aFloat201;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "F")
	public float aFloat206;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class177_Sub3() {
		this.method7876();
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(III[I)V")
	@Override
	public void method7867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) (this.aFloat198 * (float) arg0 + (float) arg1 * this.aFloat205 + (float) arg2 * this.aFloat196);
		arg3[2] = (int) ((float) arg2 * this.aFloat201 + this.aFloat203 * (float) arg0 + this.aFloat204 * (float) arg1);
		arg3[0] = (int) ((float) arg1 * this.aFloat195 + (float) arg0 * this.aFloat197 + this.aFloat199 * (float) arg2);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V")
	@Override
	public void method7872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat200 += arg0;
		this.aFloat206 += arg1;
		this.aFloat202 += arg2;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
	@Override
	public void method7880(@OriginalArg(0) int arg0) {
		this.aFloat197 = 1.0F;
		this.aFloat205 = this.aFloat201 = Class2_Sub6_Sub21.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat204 = Class2_Sub6_Sub21.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat196 = -this.aFloat204;
		this.aFloat195 = this.aFloat199 = this.aFloat200 = this.aFloat198 = this.aFloat206 = this.aFloat203 = this.aFloat202 = 0.0F;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public void method7879(@OriginalArg(0) Class177 arg0) {
		@Pc(6) Class177_Sub3 local6 = (Class177_Sub3) arg0;
		this.aFloat197 = local6.aFloat197;
		this.aFloat195 = local6.aFloat195;
		this.aFloat198 = local6.aFloat198;
		this.aFloat200 = local6.aFloat200;
		this.aFloat196 = local6.aFloat196;
		this.aFloat204 = local6.aFloat204;
		this.aFloat206 = local6.aFloat206;
		this.aFloat201 = local6.aFloat201;
		this.aFloat202 = local6.aFloat202;
		this.aFloat203 = local6.aFloat203;
		this.aFloat199 = local6.aFloat199;
		this.aFloat205 = local6.aFloat205;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(FFIFIII)V")
	public void method7885(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg2 == 0) {
			this.aFloat198 = this.aFloat203 = this.aFloat195 = this.aFloat204 = this.aFloat199 = this.aFloat196 = 0.0F;
			this.aFloat197 = arg4;
			this.aFloat205 = arg5;
			this.aFloat201 = 1.0F;
		} else {
			@Pc(50) float local50 = Class2_Sub6_Sub21.aFloatArray32[arg2 & 0x3FFF];
			@Pc(56) float local56 = Class2_Sub6_Sub21.aFloatArray31[arg2 & 0x3FFF];
			this.aFloat197 = (float) arg4 * local50;
			this.aFloat201 = 1.0F;
			this.aFloat195 = (float) arg5 * -local56;
			this.aFloat203 = this.aFloat204 = this.aFloat199 = this.aFloat196 = 0.0F;
			this.aFloat198 = (float) arg4 * local56;
			this.aFloat205 = (float) arg5 * local50;
		}
		this.aFloat202 = arg0;
		this.aFloat206 = arg1;
		this.aFloat200 = arg3;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(FFFIF[F)V")
	public void method7886(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4) {
		arg4[2] = this.aFloat203 * arg2 + this.aFloat204 * arg1 + this.aFloat201 * arg0;
		arg4[1] = arg0 * this.aFloat196 + this.aFloat198 * arg2 + arg1 * this.aFloat205;
		@Pc(76) float local76;
		@Pc(84) float local84;
		@Pc(68) float local68;
		@Pc(60) float local60;
		if (arg2 > 0.00390625F || arg2 < -0.00390625F) {
			local60 = -arg3 / arg2;
			local76 = this.aFloat200 + local60 * this.aFloat197;
			local84 = this.aFloat198 * local60 + this.aFloat206;
			local68 = this.aFloat202 + this.aFloat203 * local60;
		} else if (arg1 > 0.00390625F || arg1 < -0.00390625F) {
			local60 = -arg3 / arg1;
			local68 = this.aFloat202 + this.aFloat204 * local60;
			local76 = local60 * this.aFloat195 + this.aFloat200;
			local84 = this.aFloat206 + this.aFloat205 * local60;
		} else {
			local60 = -arg3 / arg0;
			local68 = this.aFloat202 + local60 * this.aFloat201;
			local84 = local60 * this.aFloat196 + this.aFloat206;
			local76 = this.aFloat200 + local60 * this.aFloat199;
		}
		arg4[0] = this.aFloat199 * arg0 + arg1 * this.aFloat195 + this.aFloat197 * arg2;
		arg4[3] = -(local68 * arg4[2] + arg4[1] * local84 + local76 * arg4[0]);
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	@Override
	public void method7874(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub6_Sub21.aFloatArray32[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub6_Sub21.aFloatArray31[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat197;
		@Pc(21) float local21 = this.aFloat195;
		@Pc(24) float local24 = this.aFloat199;
		@Pc(27) float local27 = this.aFloat200;
		this.aFloat197 = local9 * local18 + this.aFloat203 * local15;
		this.aFloat195 = this.aFloat204 * local15 + local21 * local9;
		this.aFloat203 = this.aFloat203 * local9 - local15 * local18;
		this.aFloat199 = this.aFloat201 * local15 + local9 * local24;
		this.aFloat204 = local9 * this.aFloat204 - local21 * local15;
		this.aFloat201 = this.aFloat201 * local9 - local15 * local24;
		this.aFloat200 = local27 * local9 + local15 * this.aFloat202;
		this.aFloat202 = this.aFloat202 * local9 - local27 * local15;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(III[I)V")
	@Override
	public void method7882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(6) int local6 = (int) ((float) arg2 - this.aFloat202);
		@Pc(17) int local17 = (int) ((float) arg0 - this.aFloat200);
		@Pc(24) int local24 = (int) ((float) arg1 - this.aFloat206);
		arg3[2] = (int) (this.aFloat201 * (float) local6 + this.aFloat199 * (float) local17 + (float) local24 * this.aFloat196);
		arg3[0] = (int) ((float) local6 * this.aFloat203 + (float) local24 * this.aFloat198 + this.aFloat197 * (float) local17);
		arg3[1] = (int) (this.aFloat205 * (float) local24 + (float) local17 * this.aFloat195 + this.aFloat204 * (float) local6);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	@Override
	public void method7870(@OriginalArg(0) int arg0) {
		this.aFloat201 = 1.0F;
		this.aFloat197 = this.aFloat205 = Class2_Sub6_Sub21.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat198 = Class2_Sub6_Sub21.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat195 = -this.aFloat198;
		this.aFloat199 = this.aFloat200 = this.aFloat196 = this.aFloat206 = this.aFloat203 = this.aFloat204 = this.aFloat202 = 0.0F;
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
	@Override
	public void method7883(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub6_Sub21.aFloatArray32[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub6_Sub21.aFloatArray31[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat198;
		@Pc(21) float local21 = this.aFloat205;
		@Pc(24) float local24 = this.aFloat196;
		this.aFloat198 = local9 * local18 - this.aFloat203 * local15;
		@Pc(38) float local38 = this.aFloat206;
		this.aFloat205 = local9 * local21 - local15 * this.aFloat204;
		this.aFloat203 = this.aFloat203 * local9 + local18 * local15;
		this.aFloat204 = local15 * local21 + this.aFloat204 * local9;
		this.aFloat196 = local24 * local9 - this.aFloat201 * local15;
		this.aFloat206 = local38 * local9 - local15 * this.aFloat202;
		this.aFloat201 = local24 * local15 + this.aFloat201 * local9;
		this.aFloat202 = local15 * local38 + local9 * this.aFloat202;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()V")
	@Override
	public void method7876() {
		this.aFloat197 = this.aFloat205 = this.aFloat201 = 1.0F;
		this.aFloat198 = this.aFloat203 = this.aFloat195 = this.aFloat204 = this.aFloat199 = this.aFloat196 = this.aFloat200 = this.aFloat206 = this.aFloat202 = 0.0F;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()Lclient!uha;")
	@Override
	public Class177 method7868() {
		@Pc(7) Class177_Sub3 local7 = new Class177_Sub3();
		local7.aFloat197 = this.aFloat197;
		local7.aFloat202 = this.aFloat202;
		local7.aFloat206 = this.aFloat206;
		local7.aFloat199 = this.aFloat199;
		local7.aFloat204 = this.aFloat204;
		local7.aFloat196 = this.aFloat196;
		local7.aFloat205 = this.aFloat205;
		local7.aFloat203 = this.aFloat203;
		local7.aFloat200 = this.aFloat200;
		local7.aFloat198 = this.aFloat198;
		local7.aFloat195 = this.aFloat195;
		local7.aFloat201 = this.aFloat201;
		return local7;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
	@Override
	public void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat206 = arg1;
		this.aFloat198 = this.aFloat203 = this.aFloat195 = this.aFloat204 = this.aFloat199 = this.aFloat196 = 0.0F;
		this.aFloat202 = arg2;
		this.aFloat197 = this.aFloat205 = this.aFloat201 = 1.0F;
		this.aFloat200 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
	public void method7887() {
		this.aFloat202 = -this.aFloat202;
		this.aFloat201 = -this.aFloat201;
		this.aFloat196 = -this.aFloat196;
		this.aFloat206 = -this.aFloat206;
		this.aFloat204 = -this.aFloat204;
		this.aFloat198 = -this.aFloat198;
		this.aFloat203 = -this.aFloat203;
		this.aFloat205 = -this.aFloat205;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([I)V")
	@Override
	public void method7878(@OriginalArg(0) int[] arg0) {
		@Pc(12) float local12 = (float) arg0[0] - this.aFloat200;
		@Pc(20) float local20 = (float) arg0[1] - this.aFloat206;
		@Pc(28) float local28 = (float) arg0[2] - this.aFloat202;
		arg0[0] = (int) (this.aFloat203 * local28 + local20 * this.aFloat198 + this.aFloat197 * local12);
		arg0[2] = (int) (local28 * this.aFloat201 + local12 * this.aFloat199 + this.aFloat196 * local20);
		arg0[1] = (int) (local28 * this.aFloat204 + this.aFloat205 * local20 + this.aFloat195 * local12);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
	@Override
	public void method7873(@OriginalArg(0) int arg0) {
		@Pc(9) float local9 = Class2_Sub6_Sub21.aFloatArray32[arg0 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub6_Sub21.aFloatArray31[arg0 & 0x3FFF];
		@Pc(18) float local18 = this.aFloat197;
		@Pc(21) float local21 = this.aFloat195;
		@Pc(24) float local24 = this.aFloat199;
		@Pc(27) float local27 = this.aFloat200;
		this.aFloat197 = local18 * local9 - local15 * this.aFloat198;
		this.aFloat198 = local15 * local18 + local9 * this.aFloat198;
		this.aFloat195 = local9 * local21 - local15 * this.aFloat205;
		this.aFloat205 = local21 * local15 + this.aFloat205 * local9;
		this.aFloat199 = local9 * local24 - local15 * this.aFloat196;
		this.aFloat196 = local9 * this.aFloat196 + local15 * local24;
		this.aFloat200 = local9 * local27 - local15 * this.aFloat206;
		this.aFloat206 = local9 * this.aFloat206 + local27 * local15;
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
	@Override
	public void method7877(@OriginalArg(0) int arg0) {
		this.aFloat205 = 1.0F;
		this.aFloat197 = this.aFloat201 = Class2_Sub6_Sub21.aFloatArray32[arg0 & 0x3FFF];
		this.aFloat199 = Class2_Sub6_Sub21.aFloatArray31[arg0 & 0x3FFF];
		this.aFloat203 = -this.aFloat199;
		this.aFloat195 = this.aFloat200 = this.aFloat198 = this.aFloat196 = this.aFloat206 = this.aFloat204 = this.aFloat202 = 0.0F;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)[F")
	public float[] method7888() {
		Static108.aFloatArray5[9] = this.aFloat196;
		Static108.aFloatArray5[6] = this.aFloat204;
		Static108.aFloatArray5[2] = this.aFloat203;
		Static108.aFloatArray5[4] = this.aFloat195;
		Static108.aFloatArray5[13] = 0.0F;
		Static108.aFloatArray5[1] = this.aFloat198;
		Static108.aFloatArray5[10] = this.aFloat201;
		Static108.aFloatArray5[0] = this.aFloat197;
		Static108.aFloatArray5[12] = 0.0F;
		Static108.aFloatArray5[5] = this.aFloat205;
		Static108.aFloatArray5[14] = 0.0F;
		Static108.aFloatArray5[8] = this.aFloat199;
		return Static108.aFloatArray5;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) float local9 = Class2_Sub6_Sub21.aFloatArray32[arg3 & 0x3FFF];
		@Pc(15) float local15 = Class2_Sub6_Sub21.aFloatArray31[arg3 & 0x3FFF];
		@Pc(21) float local21 = Class2_Sub6_Sub21.aFloatArray32[arg4 & 0x3FFF];
		@Pc(27) float local27 = Class2_Sub6_Sub21.aFloatArray31[arg4 & 0x3FFF];
		@Pc(33) float local33 = Class2_Sub6_Sub21.aFloatArray32[arg5 & 0x3FFF];
		@Pc(39) float local39 = Class2_Sub6_Sub21.aFloatArray31[arg5 & 0x3FFF];
		@Pc(43) float local43 = local33 * local15;
		@Pc(47) float local47 = local39 * local15;
		this.aFloat197 = local33 * local21 + local27 * local47;
		this.aFloat205 = local33 * local9;
		this.aFloat199 = local33 * -local27 + local47 * local21;
		this.aFloat204 = -local15;
		this.aFloat201 = local9 * local21;
		this.aFloat203 = local9 * local27;
		this.aFloat195 = local9 * local39;
		this.aFloat196 = local21 * local43 + local39 * local27;
		this.aFloat198 = local39 * -local21 + local27 * local43;
		this.aFloat200 = -((float) arg1 * this.aFloat195) + this.aFloat197 * (float) -arg0 - this.aFloat199 * (float) arg2;
		this.aFloat202 = -(this.aFloat204 * (float) arg1) + this.aFloat203 * (float) -arg0 - (float) arg2 * this.aFloat201;
		this.aFloat206 = -(this.aFloat196 * (float) arg2) - (float) arg1 * this.aFloat205 + (float) -arg0 * this.aFloat198;
	}

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)[F")
	public float[] method7889() {
		Static108.aFloatArray5[10] = this.aFloat201;
		Static108.aFloatArray5[4] = this.aFloat195;
		Static108.aFloatArray5[5] = this.aFloat205;
		Static108.aFloatArray5[1] = this.aFloat198;
		Static108.aFloatArray5[6] = this.aFloat204;
		Static108.aFloatArray5[8] = this.aFloat199;
		Static108.aFloatArray5[13] = this.aFloat206;
		Static108.aFloatArray5[9] = this.aFloat196;
		Static108.aFloatArray5[0] = this.aFloat197;
		Static108.aFloatArray5[12] = this.aFloat200;
		Static108.aFloatArray5[2] = this.aFloat203;
		Static108.aFloatArray5[14] = this.aFloat202;
		return Static108.aFloatArray5;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!uha;Z)V")
	public void method7890(@OriginalArg(0) Class177 arg0) {
		@Pc(6) Class177_Sub3 local6 = (Class177_Sub3) arg0;
		this.aFloat199 = local6.aFloat203;
		this.aFloat197 = local6.aFloat197;
		this.aFloat195 = local6.aFloat198;
		this.aFloat198 = local6.aFloat195;
		this.aFloat203 = local6.aFloat199;
		this.aFloat196 = local6.aFloat204;
		this.aFloat205 = local6.aFloat205;
		this.aFloat200 = -(this.aFloat199 * local6.aFloat202 + this.aFloat195 * local6.aFloat206 + local6.aFloat200 * this.aFloat197);
		this.aFloat201 = local6.aFloat201;
		this.aFloat204 = local6.aFloat196;
		this.aFloat206 = -(local6.aFloat200 * this.aFloat198 + local6.aFloat206 * this.aFloat205 + local6.aFloat202 * this.aFloat196);
		this.aFloat202 = -(this.aFloat201 * local6.aFloat202 + this.aFloat203 * local6.aFloat200 + this.aFloat204 * local6.aFloat206);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[1] = (int) ((float) arg2 * this.aFloat196 + this.aFloat205 * (float) arg1 + (float) arg0 * this.aFloat198 + this.aFloat206);
		arg3[2] = (int) (this.aFloat202 + (float) arg2 * this.aFloat201 + (float) arg0 * this.aFloat203 + (float) arg1 * this.aFloat204);
		arg3[0] = (int) (this.aFloat200 + this.aFloat197 * (float) arg0 + (float) arg1 * this.aFloat195 + this.aFloat199 * (float) arg2);
	}
}
