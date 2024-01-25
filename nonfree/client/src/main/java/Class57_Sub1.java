import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	private final int anInt1533;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
	private final int anInt1535;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
	private final int anInt1537;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
	private final int anInt1542;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1533 = arg0;
		this.anInt1535 = arg3;
		this.anInt1537 = arg1;
		this.anInt1542 = arg2;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
	@Override
	public void method5862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1533 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1542 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt1537 >> 12;
		@Pc(36) int local36 = this.anInt1535 * arg0 >> 12;
		Static100.method1555(super.anInt7558, super.anInt7559, local17, local10, super.anInt7560, local36, local29);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1533 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1542 >> 12;
		@Pc(33) int local33 = this.anInt1537 * arg0 >> 12;
		@Pc(40) int local40 = this.anInt1535 * arg0 >> 12;
		Static236.method4584(super.anInt7558, local10, local33, local17, local40, super.anInt7560);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
	@Override
	public void method5863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1533 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1542 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1537 >> 12;
		@Pc(48) int local48 = arg1 * this.anInt1535 >> 12;
		Static203.method3075(super.anInt7559, local10, local48, local17, local24);
	}
}
