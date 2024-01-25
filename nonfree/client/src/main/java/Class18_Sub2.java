import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	public int anInt5435;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	public int anInt5436;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	public int anInt5437;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	public int anInt5438;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public int anInt5439;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	public int anInt5440;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	public int anInt5441;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
	public int anInt5442;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	public int anInt5443;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	public int anInt5444;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	public int anInt5445;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	public int anInt5446;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class18_Sub2() {
		this.HA();
	}

	@OriginalMember(owner = "client!pj", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.anInt5442 = 32768;
		this.anInt5441 = this.anInt5438 = Class4.anIntArray6[arg0 & 0x3FFF];
		this.anInt5439 = Class4.anIntArray7[arg0 & 0x3FFF];
		this.anInt5436 = -this.anInt5439;
		this.anInt5444 = this.anInt5446 = this.anInt5435 = this.anInt5445 = this.anInt5437 = this.anInt5440 = this.anInt5443 = 0;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class4.anIntArray6[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class4.anIntArray7[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt5442;
		@Pc(17) int local17 = this.anInt5444;
		@Pc(20) int local20 = this.anInt5446;
		@Pc(23) int local23 = this.anInt5435;
		this.anInt5442 = local14 * local5 + this.anInt5440 * local11 >> 15;
		this.anInt5440 = this.anInt5440 * local5 - local14 * local11 >> 15;
		this.anInt5444 = local17 * local5 + this.anInt5439 * local11 >> 15;
		this.anInt5439 = this.anInt5439 * local5 - local17 * local11 >> 15;
		this.anInt5446 = local20 * local5 + this.anInt5438 * local11 >> 15;
		this.anInt5438 = this.anInt5438 * local5 - local20 * local11 >> 15;
		this.anInt5435 = local23 * local5 + this.anInt5443 * local11 >> 15;
		this.anInt5443 = this.anInt5443 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!pj", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt5438 = 32768;
		this.anInt5442 = this.anInt5441 = Class4.anIntArray6[arg0 & 0x3FFF];
		this.anInt5445 = Class4.anIntArray7[arg0 & 0x3FFF];
		this.anInt5444 = -this.anInt5445;
		this.anInt5446 = this.anInt5435 = this.anInt5436 = this.anInt5437 = this.anInt5440 = this.anInt5439 = this.anInt5443 = 0;
	}

	@OriginalMember(owner = "client!pj", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class4.anIntArray6[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class4.anIntArray7[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class4.anIntArray6[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class4.anIntArray7[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class4.anIntArray6[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class4.anIntArray7[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt5442 = local17 * local29 + local23 * local47 >> 15;
		this.anInt5445 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt5440 = local23 * local5 >> 15;
		this.anInt5444 = local5 * local35 >> 15;
		this.anInt5441 = local5 * local29 >> 15;
		this.anInt5439 = -local11;
		this.anInt5446 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt5436 = local23 * local35 + local17 * local41 >> 15;
		this.anInt5438 = local17 * local5 >> 15;
		this.anInt5435 = -arg0 * this.anInt5442 - arg1 * this.anInt5444 - arg2 * this.anInt5446 >> 15;
		this.anInt5437 = -arg0 * this.anInt5445 - arg1 * this.anInt5441 - arg2 * this.anInt5436 >> 15;
		this.anInt5443 = -arg0 * this.anInt5440 - arg1 * this.anInt5439 - arg2 * this.anInt5438 >> 15;
	}

	@OriginalMember(owner = "client!pj", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class4.anIntArray6[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class4.anIntArray7[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt5445;
		@Pc(17) int local17 = this.anInt5441;
		@Pc(20) int local20 = this.anInt5436;
		@Pc(23) int local23 = this.anInt5437;
		this.anInt5445 = local14 * local5 - this.anInt5440 * local11 >> 15;
		this.anInt5440 = local14 * local11 + this.anInt5440 * local5 >> 15;
		this.anInt5441 = local17 * local5 - this.anInt5439 * local11 >> 15;
		this.anInt5439 = local17 * local11 + this.anInt5439 * local5 >> 15;
		this.anInt5436 = local20 * local5 - this.anInt5438 * local11 >> 15;
		this.anInt5438 = local20 * local11 + this.anInt5438 * local5 >> 15;
		this.anInt5437 = local23 * local5 - this.anInt5443 * local11 >> 15;
		this.anInt5443 = local23 * local11 + this.anInt5443 * local5 >> 15;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt5435 + (this.anInt5442 * arg0 + this.anInt5444 * arg1 + this.anInt5446 * arg2 >> 15);
		arg3[1] = this.anInt5437 + (this.anInt5445 * arg0 + this.anInt5441 * arg1 + this.anInt5436 * arg2 >> 15);
		arg3[2] = this.anInt5443 + (this.anInt5440 * arg0 + this.anInt5439 * arg1 + this.anInt5438 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!pj", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt5435;
		@Pc(13) int local13 = arg0[1] - this.anInt5437;
		@Pc(20) int local20 = arg0[2] - this.anInt5443;
		arg0[0] = this.anInt5442 * local6 + this.anInt5445 * local13 + this.anInt5440 * local20 >> 15;
		arg0[1] = this.anInt5444 * local6 + this.anInt5441 * local13 + this.anInt5439 * local20 >> 15;
		arg0[2] = this.anInt5446 * local6 + this.anInt5436 * local13 + this.anInt5438 * local20 >> 15;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "()Lclient!ia;")
	@Override
	public Class18 method4939() {
		@Pc(3) Class18_Sub2 local3 = new Class18_Sub2();
		local3.anInt5442 = this.anInt5442;
		local3.anInt5444 = this.anInt5444;
		local3.anInt5446 = this.anInt5446;
		local3.anInt5435 = this.anInt5435;
		local3.anInt5445 = this.anInt5445;
		local3.anInt5441 = this.anInt5441;
		local3.anInt5436 = this.anInt5436;
		local3.anInt5437 = this.anInt5437;
		local3.anInt5440 = this.anInt5440;
		local3.anInt5439 = this.anInt5439;
		local3.anInt5438 = this.anInt5438;
		local3.anInt5443 = this.anInt5443;
		return local3;
	}

	@OriginalMember(owner = "client!pj", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt5442 * arg0 + this.anInt5444 * arg1 + this.anInt5446 * arg2 >> 15;
		arg3[1] = this.anInt5445 * arg0 + this.anInt5441 * arg1 + this.anInt5436 * arg2 >> 15;
		arg3[2] = this.anInt5440 * arg0 + this.anInt5439 * arg1 + this.anInt5438 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!pj", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.anInt5445 = this.anInt5440 = this.anInt5444 = this.anInt5439 = this.anInt5446 = this.anInt5436 = this.anInt5435 = this.anInt5437 = this.anInt5443 = 0;
		this.anInt5442 = this.anInt5441 = this.anInt5438 = 32768;
	}

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5445 = this.anInt5440 = this.anInt5444 = this.anInt5439 = this.anInt5446 = this.anInt5436 = 0;
		this.anInt5442 = this.anInt5441 = this.anInt5438 = 32768;
		this.anInt5435 = arg0;
		this.anInt5437 = arg1;
		this.anInt5443 = arg2;
	}

	@OriginalMember(owner = "client!pj", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5435 += arg0;
		this.anInt5437 += arg1;
		this.anInt5443 += arg2;
	}

	@OriginalMember(owner = "client!pj", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class18 arg0) {
		@Pc(2) Class18_Sub2 local2 = (Class18_Sub2) arg0;
		this.anInt5442 = local2.anInt5442;
		this.anInt5444 = local2.anInt5444;
		this.anInt5446 = local2.anInt5446;
		this.anInt5435 = local2.anInt5435;
		this.anInt5445 = local2.anInt5445;
		this.anInt5441 = local2.anInt5441;
		this.anInt5436 = local2.anInt5436;
		this.anInt5437 = local2.anInt5437;
		this.anInt5440 = local2.anInt5440;
		this.anInt5439 = local2.anInt5439;
		this.anInt5438 = local2.anInt5438;
		this.anInt5443 = local2.anInt5443;
	}

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt5441 = 32768;
		this.anInt5442 = this.anInt5438 = Class4.anIntArray6[arg0 & 0x3FFF];
		this.anInt5446 = Class4.anIntArray7[arg0 & 0x3FFF];
		this.anInt5440 = -this.anInt5446;
		this.anInt5444 = this.anInt5435 = this.anInt5445 = this.anInt5436 = this.anInt5437 = this.anInt5439 = this.anInt5443 = 0;
	}
}
