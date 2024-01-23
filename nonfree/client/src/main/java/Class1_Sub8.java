import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
	private int anInt1639;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
	public int anInt1632;

	@OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
	private int anInt1645;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
	private int anInt1641;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
	private int anInt1633;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
	public int anInt1636;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
	private int anInt1631;

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
	public int anInt1635;

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
	private int anInt1647;

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
	public int anInt1638;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class1_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1639 = arg1;
		this.anInt1632 = arg7;
		this.anInt1645 = arg5;
		this.anInt1641 = arg0;
		this.anInt1633 = arg4;
		this.anInt1636 = arg9;
		this.anInt1631 = arg3;
		this.anInt1635 = arg8;
		this.anInt1647 = arg2;
		this.anInt1638 = arg6;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
	public boolean method1137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1638 <= arg0 && this.anInt1635 >= arg0 && this.anInt1632 <= arg1 && this.anInt1636 >= arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBI)Z")
	public boolean method1139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1647 <= arg0 && arg0 <= this.anInt1633 && this.anInt1631 <= arg1 && arg1 <= this.anInt1645;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Z")
	public boolean method1142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1641 == arg1 && this.anInt1647 <= arg0 && arg0 <= this.anInt1633 && arg2 >= this.anInt1631 && arg2 <= this.anInt1645;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)[I")
	public int[] method1143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt1639, arg1 + this.anInt1638 - this.anInt1647, this.anInt1632 - this.anInt1631 + arg0 };
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)[I")
	public int[] method1144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new int[] { this.anInt1641, arg0 + this.anInt1647 - this.anInt1638, -this.anInt1632 - -this.anInt1631 + arg1 };
	}
}
