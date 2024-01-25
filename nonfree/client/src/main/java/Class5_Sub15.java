import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class5_Sub15 extends Class5 {

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public final int anInt1732;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	private final int anInt1734;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	private final int anInt1733;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	private final int anInt1744;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	public final int anInt1739;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
	private final int anInt1738;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	public final int anInt1745;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	private final int anInt1742;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	public final int anInt1746;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1732 = arg8;
		this.anInt1734 = arg0;
		this.anInt1733 = arg4;
		this.anInt1744 = arg3;
		this.anInt1739 = arg5;
		this.anInt1738 = arg2;
		this.anInt1745 = arg7;
		this.anInt1742 = arg1;
		this.anInt1746 = arg6;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)Z")
	public boolean method1412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1734 == arg0 && arg1 >= this.anInt1742 && arg1 <= this.anInt1744 && arg2 >= this.anInt1738 && arg2 <= this.anInt1733;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIB)Z")
	public boolean method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1739 && this.anInt1745 >= arg0 && this.anInt1746 <= arg1 && this.anInt1732 >= arg1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z")
	public boolean method1415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1742 <= arg0 && arg0 <= this.anInt1744 && arg1 >= this.anInt1738 && arg1 <= this.anInt1733;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II[IB)V")
	public void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[1] = arg1 + this.anInt1739 - this.anInt1742;
		arg2[0] = 0;
		arg2[2] = arg0 + this.anInt1746 - this.anInt1738;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII[I)V")
	public void method1418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[2] = this.anInt1738 + arg1 - this.anInt1746;
		arg2[0] = this.anInt1734;
		arg2[1] = arg0 + this.anInt1742 - this.anInt1739;
	}
}
