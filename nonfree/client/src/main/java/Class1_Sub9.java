import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
	private int anInt1701;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	public int anInt1698;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	private int anInt1691;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
	private int anInt1689;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
	private int anInt1705;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
	public int anInt1702;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	private int anInt1694;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
	public int anInt1693;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	private int anInt1690;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
	public int anInt1695;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1701 = arg2;
		this.anInt1698 = arg8;
		this.anInt1691 = arg4;
		this.anInt1689 = arg5;
		this.anInt1705 = arg0;
		this.anInt1702 = arg7;
		this.anInt1694 = arg3;
		this.anInt1693 = arg9;
		this.anInt1690 = arg1;
		this.anInt1695 = arg6;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Z")
	public boolean method1265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1695 <= arg0 && this.anInt1698 >= arg0 && arg1 >= this.anInt1702 && arg1 <= this.anInt1693;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)Z")
	public boolean method1266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt1701 <= arg0 && this.anInt1691 >= arg0 && this.anInt1694 <= arg1 && this.anInt1689 >= arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI[II)V")
	public void method1268(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg2 + this.anInt1695 - this.anInt1701;
		arg1[0] = this.anInt1690;
		arg1[2] = arg0 + this.anInt1702 - this.anInt1694;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)Z")
	public boolean method1269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1705 == arg0 && this.anInt1701 <= arg2 && arg2 <= this.anInt1691 && arg1 >= this.anInt1694 && arg1 <= this.anInt1689;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI[II)V")
	public void method1270(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg2 + this.anInt1694 - this.anInt1702;
		arg1[0] = this.anInt1705;
		arg1[1] = this.anInt1701 + arg0 - this.anInt1695;
	}
}
