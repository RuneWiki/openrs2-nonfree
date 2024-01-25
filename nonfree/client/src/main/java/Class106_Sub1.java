import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public int anInt6452;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public int anInt6453;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "I")
	public int anInt6454;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "I")
	public int anInt6455;

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	public int anInt6456;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public int anInt6457;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public int anInt6458;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public int anInt6459;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public int anInt6460;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "I")
	public int anInt6461;

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	public int anInt6462;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	public int anInt6463;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class106_Sub1() {
		this.HA();
	}

	@OriginalMember(owner = "client!se", name = "ma", descriptor = "(I)V")
	@Override
	public void ma(@OriginalArg(0) int arg0) {
		this.anInt6463 = 32768;
		this.anInt6453 = this.anInt6454 = Applet_Sub1.anIntArray87[arg0 & 0x3FFF];
		this.anInt6457 = Applet_Sub1.anIntArray85[arg0 & 0x3FFF];
		this.anInt6462 = -this.anInt6457;
		this.anInt6456 = this.anInt6459 = this.anInt6460 = this.anInt6452 = this.anInt6461 = this.anInt6458 = this.anInt6455 = 0;
	}

	@OriginalMember(owner = "client!se", name = "ba", descriptor = "(Lclient!ia;)V")
	@Override
	public void ba(@OriginalArg(0) Class106 arg0) {
		@Pc(2) Class106_Sub1 local2 = (Class106_Sub1) arg0;
		this.anInt6453 = local2.anInt6453;
		this.anInt6462 = local2.anInt6462;
		this.anInt6456 = local2.anInt6456;
		this.anInt6459 = local2.anInt6459;
		this.anInt6457 = local2.anInt6457;
		this.anInt6454 = local2.anInt6454;
		this.anInt6460 = local2.anInt6460;
		this.anInt6452 = local2.anInt6452;
		this.anInt6461 = local2.anInt6461;
		this.anInt6458 = local2.anInt6458;
		this.anInt6463 = local2.anInt6463;
		this.anInt6455 = local2.anInt6455;
	}

	@OriginalMember(owner = "client!se", name = "O", descriptor = "(I)V")
	@Override
	public void O(@OriginalArg(0) int arg0) {
		this.anInt6454 = 32768;
		this.anInt6453 = this.anInt6463 = Applet_Sub1.anIntArray87[arg0 & 0x3FFF];
		this.anInt6456 = Applet_Sub1.anIntArray85[arg0 & 0x3FFF];
		this.anInt6461 = -this.anInt6456;
		this.anInt6462 = this.anInt6459 = this.anInt6457 = this.anInt6460 = this.anInt6452 = this.anInt6458 = this.anInt6455 = 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()Lclient!ia;")
	@Override
	public Class106 method5103() {
		@Pc(3) Class106_Sub1 local3 = new Class106_Sub1();
		local3.anInt6453 = this.anInt6453;
		local3.anInt6462 = this.anInt6462;
		local3.anInt6456 = this.anInt6456;
		local3.anInt6459 = this.anInt6459;
		local3.anInt6457 = this.anInt6457;
		local3.anInt6454 = this.anInt6454;
		local3.anInt6460 = this.anInt6460;
		local3.anInt6452 = this.anInt6452;
		local3.anInt6461 = this.anInt6461;
		local3.anInt6458 = this.anInt6458;
		local3.anInt6463 = this.anInt6463;
		local3.anInt6455 = this.anInt6455;
		return local3;
	}

	@OriginalMember(owner = "client!se", name = "E", descriptor = "(III[I)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt6453 * arg0 + this.anInt6462 * arg1 + this.anInt6456 * arg2 >> 15;
		arg3[1] = this.anInt6457 * arg0 + this.anInt6454 * arg1 + this.anInt6460 * arg2 >> 15;
		arg3[2] = this.anInt6461 * arg0 + this.anInt6458 * arg1 + this.anInt6463 * arg2 >> 15;
	}

	@OriginalMember(owner = "client!se", name = "YA", descriptor = "(I)V")
	@Override
	public void YA(@OriginalArg(0) int arg0) {
		this.anInt6453 = 32768;
		this.anInt6454 = this.anInt6463 = Applet_Sub1.anIntArray87[arg0 & 0x3FFF];
		this.anInt6458 = Applet_Sub1.anIntArray85[arg0 & 0x3FFF];
		this.anInt6460 = -this.anInt6458;
		this.anInt6462 = this.anInt6456 = this.anInt6459 = this.anInt6457 = this.anInt6452 = this.anInt6461 = this.anInt6455 = 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt6459 + (this.anInt6453 * arg0 + this.anInt6462 * arg1 + this.anInt6456 * arg2 >> 15);
		arg3[1] = this.anInt6452 + (this.anInt6457 * arg0 + this.anInt6454 * arg1 + this.anInt6460 * arg2 >> 15);
		arg3[2] = this.anInt6455 + (this.anInt6461 * arg0 + this.anInt6458 * arg1 + this.anInt6463 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!se", name = "HA", descriptor = "()V")
	@Override
	public void HA() {
		this.anInt6457 = this.anInt6461 = this.anInt6462 = this.anInt6458 = this.anInt6456 = this.anInt6460 = this.anInt6459 = this.anInt6452 = this.anInt6455 = 0;
		this.anInt6453 = this.anInt6454 = this.anInt6463 = 32768;
	}

	@OriginalMember(owner = "client!se", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Applet_Sub1.anIntArray87[arg0 & 0x3FFF];
		@Pc(11) int local11 = Applet_Sub1.anIntArray85[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6457;
		@Pc(17) int local17 = this.anInt6454;
		@Pc(20) int local20 = this.anInt6460;
		@Pc(23) int local23 = this.anInt6452;
		this.anInt6457 = local14 * local5 - this.anInt6461 * local11 >> 15;
		this.anInt6461 = local14 * local11 + this.anInt6461 * local5 >> 15;
		this.anInt6454 = local17 * local5 - this.anInt6458 * local11 >> 15;
		this.anInt6458 = local17 * local11 + this.anInt6458 * local5 >> 15;
		this.anInt6460 = local20 * local5 - this.anInt6463 * local11 >> 15;
		this.anInt6463 = local20 * local11 + this.anInt6463 * local5 >> 15;
		this.anInt6452 = local23 * local5 - this.anInt6455 * local11 >> 15;
		this.anInt6455 = local23 * local11 + this.anInt6455 * local5 >> 15;
	}

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "(IIIIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Applet_Sub1.anIntArray87[arg3 & 0x3FFF];
		@Pc(11) int local11 = Applet_Sub1.anIntArray85[arg3 & 0x3FFF];
		@Pc(17) int local17 = Applet_Sub1.anIntArray87[arg4 & 0x3FFF];
		@Pc(23) int local23 = Applet_Sub1.anIntArray85[arg4 & 0x3FFF];
		@Pc(29) int local29 = Applet_Sub1.anIntArray87[arg5 & 0x3FFF];
		@Pc(35) int local35 = Applet_Sub1.anIntArray85[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt6453 = local17 * local29 + local23 * local47 >> 15;
		this.anInt6457 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt6461 = local23 * local5 >> 15;
		this.anInt6462 = local5 * local35 >> 15;
		this.anInt6454 = local5 * local29 >> 15;
		this.anInt6458 = -local11;
		this.anInt6456 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt6460 = local23 * local35 + local17 * local41 >> 15;
		this.anInt6463 = local17 * local5 >> 15;
		this.anInt6459 = -arg0 * this.anInt6453 - arg1 * this.anInt6462 - arg2 * this.anInt6456 >> 15;
		this.anInt6452 = -arg0 * this.anInt6457 - arg1 * this.anInt6454 - arg2 * this.anInt6460 >> 15;
		this.anInt6455 = -arg0 * this.anInt6461 - arg1 * this.anInt6458 - arg2 * this.anInt6463 >> 15;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	@Override
	public void c(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Applet_Sub1.anIntArray87[arg0 & 0x3FFF];
		@Pc(11) int local11 = Applet_Sub1.anIntArray85[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt6453;
		@Pc(17) int local17 = this.anInt6462;
		@Pc(20) int local20 = this.anInt6456;
		@Pc(23) int local23 = this.anInt6459;
		this.anInt6453 = local14 * local5 + this.anInt6461 * local11 >> 15;
		this.anInt6461 = this.anInt6461 * local5 - local14 * local11 >> 15;
		this.anInt6462 = local17 * local5 + this.anInt6458 * local11 >> 15;
		this.anInt6458 = this.anInt6458 * local5 - local17 * local11 >> 15;
		this.anInt6456 = local20 * local5 + this.anInt6463 * local11 >> 15;
		this.anInt6463 = this.anInt6463 * local5 - local20 * local11 >> 15;
		this.anInt6459 = local23 * local5 + this.anInt6455 * local11 >> 15;
		this.anInt6455 = this.anInt6455 * local5 - local23 * local11 >> 15;
	}

	@OriginalMember(owner = "client!se", name = "ZA", descriptor = "(III)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6459 += arg0;
		this.anInt6452 += arg1;
		this.anInt6455 += arg2;
	}

	@OriginalMember(owner = "client!se", name = "X", descriptor = "([I)V")
	@Override
	public void X(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt6459;
		@Pc(13) int local13 = arg0[1] - this.anInt6452;
		@Pc(20) int local20 = arg0[2] - this.anInt6455;
		arg0[0] = this.anInt6453 * local6 + this.anInt6457 * local13 + this.anInt6461 * local20 >> 15;
		arg0[1] = this.anInt6462 * local6 + this.anInt6454 * local13 + this.anInt6458 * local20 >> 15;
		arg0[2] = this.anInt6456 * local6 + this.anInt6460 * local13 + this.anInt6463 * local20 >> 15;
	}

	@OriginalMember(owner = "client!se", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6457 = this.anInt6461 = this.anInt6462 = this.anInt6458 = this.anInt6456 = this.anInt6460 = 0;
		this.anInt6453 = this.anInt6454 = this.anInt6463 = 32768;
		this.anInt6459 = arg0;
		this.anInt6452 = arg1;
		this.anInt6455 = arg2;
	}
}
