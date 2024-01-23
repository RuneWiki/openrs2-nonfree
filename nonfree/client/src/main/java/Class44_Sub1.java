import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	private int anInt1726;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	private int anInt1724;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	private int anInt1718;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	private int anInt1725;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class44_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1726 = arg2;
		this.anInt1724 = arg3;
		this.anInt1718 = arg0;
		this.anInt1725 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BII)V")
	@Override
	public void method4277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1718 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt1726 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt1725 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt1724 * arg0 >> 12;
		Static41.method742(local29, local17, local36, this.anInt4980, local10);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(BII)V")
	@Override
	public void method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1718 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt1725 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt1726 >> 12;
		@Pc(31) int local31 = this.anInt1724 * arg1 >> 12;
		Static221.method3449(local17, local24, this.anInt4974, local10, this.anInt4980, this.anInt4984, local31);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
	@Override
	public void method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1718 >> 12;
		@Pc(21) int local21 = this.anInt1726 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt1724 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt1725 >> 12;
		Static300.method4554(this.anInt4984, local10, this.anInt4974, local28, local21, local35);
	}
}
