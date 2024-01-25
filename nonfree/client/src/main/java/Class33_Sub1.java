import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
	public int anInt2573;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	public int anInt2574;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	public int anInt2575;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
	public int anInt2576;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	public int anInt2577;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	public int anInt2578;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	public int anInt2579;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
	public int anInt2580;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
	public int anInt2581;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public int anInt2582;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	public int anInt2583;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
	public int anInt2584;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class33_Sub1() {
		this.xa();
	}

	@OriginalMember(owner = "client!gj", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class183.anIntArray434[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class183.anIntArray433[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2577;
		@Pc(17) int local17 = this.anInt2582;
		@Pc(20) int local20 = this.anInt2576;
		@Pc(23) int local23 = this.anInt2581;
		this.anInt2577 = local14 * local5 + this.anInt2575 * local11 >> 15;
		this.anInt2575 = this.anInt2575 * local5 - local14 * local11 >> 15;
		this.anInt2582 = local17 * local5 + this.anInt2574 * local11 >> 15;
		this.anInt2574 = this.anInt2574 * local5 - local17 * local11 >> 15;
		this.anInt2576 = local20 * local5 + this.anInt2584 * local11 >> 15;
		this.anInt2584 = this.anInt2584 * local5 - local20 * local11 >> 15;
		this.anInt2581 = local23 * local5 + this.anInt2583 * local11 >> 15;
		this.anInt2583 = this.anInt2583 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "ka", descriptor = "(I)V")
	@Override
	public void ka(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class183.anIntArray434[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class183.anIntArray433[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt2580;
		@Pc(17) int local17 = this.anInt2573;
		@Pc(20) int local20 = this.anInt2579;
		@Pc(23) int local23 = this.anInt2578;
		this.anInt2580 = local14 * local5 - this.anInt2575 * local11 >> 15;
		this.anInt2575 = local14 * local11 + this.anInt2575 * local5 >> 15;
		this.anInt2573 = local17 * local5 - this.anInt2574 * local11 >> 15;
		this.anInt2574 = local17 * local11 + this.anInt2574 * local5 >> 15;
		this.anInt2579 = local20 * local5 - this.anInt2584 * local11 >> 15;
		this.anInt2584 = local20 * local11 + this.anInt2584 * local5 >> 15;
		this.anInt2578 = local23 * local5 - this.anInt2583 * local11 >> 15;
		this.anInt2583 = local23 * local11 + this.anInt2583 * local5 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "(III)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2580 = this.anInt2575 = this.anInt2582 = this.anInt2574 = this.anInt2576 = this.anInt2579 = 0;
		this.anInt2577 = this.anInt2573 = this.anInt2584 = 32768;
		this.anInt2581 = arg0;
		this.anInt2578 = arg1;
		this.anInt2583 = arg2;
	}

	@OriginalMember(owner = "client!gj", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.anInt2580 = this.anInt2575 = this.anInt2582 = this.anInt2574 = this.anInt2576 = this.anInt2579 = this.anInt2581 = this.anInt2578 = this.anInt2583 = 0;
		this.anInt2577 = this.anInt2573 = this.anInt2584 = 32768;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lclient!c;")
	@Override
	public Class33 method4612() {
		@Pc(3) Class33_Sub1 local3 = new Class33_Sub1();
		local3.anInt2577 = this.anInt2577;
		local3.anInt2582 = this.anInt2582;
		local3.anInt2576 = this.anInt2576;
		local3.anInt2581 = this.anInt2581;
		local3.anInt2580 = this.anInt2580;
		local3.anInt2573 = this.anInt2573;
		local3.anInt2579 = this.anInt2579;
		local3.anInt2578 = this.anInt2578;
		local3.anInt2575 = this.anInt2575;
		local3.anInt2574 = this.anInt2574;
		local3.anInt2584 = this.anInt2584;
		local3.anInt2583 = this.anInt2583;
		return local3;
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "([I)V")
	@Override
	public void m(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt2581;
		@Pc(13) int local13 = arg0[1] - this.anInt2578;
		@Pc(20) int local20 = arg0[2] - this.anInt2583;
		arg0[0] = this.anInt2577 * local6 + this.anInt2580 * local13 + this.anInt2575 * local20 >> 15;
		arg0[1] = this.anInt2582 * local6 + this.anInt2573 * local13 + this.anInt2574 * local20 >> 15;
		arg0[2] = this.anInt2576 * local6 + this.anInt2579 * local13 + this.anInt2584 * local20 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "ra", descriptor = "(I)V")
	@Override
	public void ra(@OriginalArg(0) int arg0) {
		this.anInt2573 = 32768;
		this.anInt2577 = this.anInt2584 = Class183.anIntArray434[arg0 & 0x3FFF];
		this.anInt2576 = Class183.anIntArray433[arg0 & 0x3FFF];
		this.anInt2575 = -this.anInt2576;
		this.anInt2582 = this.anInt2581 = this.anInt2580 = this.anInt2579 = this.anInt2578 = this.anInt2574 = this.anInt2583 = 0;
	}

	@OriginalMember(owner = "client!gj", name = "N", descriptor = "(I)V")
	@Override
	public void N(@OriginalArg(0) int arg0) {
		this.anInt2577 = 32768;
		this.anInt2573 = this.anInt2584 = Class183.anIntArray434[arg0 & 0x3FFF];
		this.anInt2574 = Class183.anIntArray433[arg0 & 0x3FFF];
		this.anInt2579 = -this.anInt2574;
		this.anInt2582 = this.anInt2576 = this.anInt2581 = this.anInt2580 = this.anInt2578 = this.anInt2575 = this.anInt2583 = 0;
	}

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "(III[I)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2577 * arg0 + this.anInt2582 * arg1 + this.anInt2576 * arg2 >> 15;
		arg3[1] = this.anInt2580 * arg0 + this.anInt2573 * arg1 + this.anInt2579 * arg2 >> 15;
		arg3[2] = this.anInt2575 * arg0 + this.anInt2574 * arg1 + this.anInt2584 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "(III)V")
	@Override
	public void o(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2581 += arg0;
		this.anInt2578 += arg1;
		this.anInt2583 += arg2;
	}

	@OriginalMember(owner = "client!gj", name = "za", descriptor = "(Lclient!c;)V")
	@Override
	public void za(@OriginalArg(0) Class33 arg0) {
		@Pc(2) Class33_Sub1 local2 = (Class33_Sub1) arg0;
		this.anInt2577 = local2.anInt2577;
		this.anInt2582 = local2.anInt2582;
		this.anInt2576 = local2.anInt2576;
		this.anInt2581 = local2.anInt2581;
		this.anInt2580 = local2.anInt2580;
		this.anInt2573 = local2.anInt2573;
		this.anInt2579 = local2.anInt2579;
		this.anInt2578 = local2.anInt2578;
		this.anInt2575 = local2.anInt2575;
		this.anInt2574 = local2.anInt2574;
		this.anInt2584 = local2.anInt2584;
		this.anInt2583 = local2.anInt2583;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt2581 + (this.anInt2577 * arg0 + this.anInt2582 * arg1 + this.anInt2576 * arg2 >> 15);
		arg3[1] = this.anInt2578 + (this.anInt2580 * arg0 + this.anInt2573 * arg1 + this.anInt2579 * arg2 >> 15);
		arg3[2] = this.anInt2583 + (this.anInt2575 * arg0 + this.anInt2574 * arg1 + this.anInt2584 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "(IIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class183.anIntArray434[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class183.anIntArray433[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class183.anIntArray434[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class183.anIntArray433[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class183.anIntArray434[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class183.anIntArray433[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt2577 = local17 * local29 + local23 * local47 >> 15;
		this.anInt2580 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt2575 = local23 * local5 >> 15;
		this.anInt2582 = local5 * local35 >> 15;
		this.anInt2573 = local5 * local29 >> 15;
		this.anInt2574 = -local11;
		this.anInt2576 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt2579 = local23 * local35 + local17 * local41 >> 15;
		this.anInt2584 = local17 * local5 >> 15;
		this.anInt2581 = -arg0 * this.anInt2577 - arg1 * this.anInt2582 - arg2 * this.anInt2576 >> 15;
		this.anInt2578 = -arg0 * this.anInt2580 - arg1 * this.anInt2573 - arg2 * this.anInt2579 >> 15;
		this.anInt2583 = -arg0 * this.anInt2575 - arg1 * this.anInt2574 - arg2 * this.anInt2584 >> 15;
	}

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt2584 = 32768;
		this.anInt2577 = this.anInt2573 = Class183.anIntArray434[arg0 & 0x3FFF];
		this.anInt2580 = Class183.anIntArray433[arg0 & 0x3FFF];
		this.anInt2582 = -this.anInt2580;
		this.anInt2576 = this.anInt2581 = this.anInt2579 = this.anInt2578 = this.anInt2575 = this.anInt2574 = this.anInt2583 = 0;
	}
}
