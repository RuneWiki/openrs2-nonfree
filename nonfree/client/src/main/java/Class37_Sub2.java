import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	private final int anInt1682;

	@OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
	private final int anInt1692;

	@OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
	private final int anInt1693;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
	private final int anInt1687;

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
	private final int anInt1691;

	@OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
	private final int anInt1685;

	@OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
	private final int anInt1689;

	@OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
	private final int anInt1690;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class37_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt1682 = arg1;
		this.anInt1692 = arg7;
		this.anInt1693 = arg4;
		this.anInt1687 = arg5;
		this.anInt1691 = arg0;
		this.anInt1685 = arg6;
		this.anInt1689 = arg2;
		this.anInt1690 = arg3;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V")
	@Override
	public void method7778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1691 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt1682 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1689 >> 12;
		@Pc(31) int local31 = this.anInt1690 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt1693 * arg1 >> 12;
		@Pc(48) int local48 = this.anInt1687 * arg0 >> 12;
		@Pc(55) int local55 = this.anInt1685 * arg1 >> 12;
		@Pc(62) int local62 = arg0 * this.anInt1692 >> 12;
		Static252.method3882(local17, local31, local48, local62, local10, super.anInt9376, local24, local55, local38);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII)V")
	@Override
	public void method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(III)V")
	@Override
	public void method7782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
