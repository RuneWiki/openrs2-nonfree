import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
	private final int anInt1799;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	public final int anInt1800;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
	public final int anInt1796;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
	public final int anInt1801;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
	private final int anInt1813;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
	private final int anInt1812;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	public final int anInt1807;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
	private final int anInt1805;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	private final int anInt1804;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1799 = arg1;
		this.anInt1800 = arg6;
		this.anInt1796 = arg5;
		this.anInt1801 = arg7;
		this.anInt1813 = arg3;
		this.anInt1812 = arg2;
		this.anInt1807 = arg8;
		this.anInt1805 = arg0;
		this.anInt1804 = arg4;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[III)V")
	public void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt1800 + arg2 - this.anInt1812;
		arg1[0] = 0;
		arg1[1] = this.anInt1796 + arg0 - this.anInt1799;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)Z")
	public boolean method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt1805 && arg0 >= this.anInt1799 && this.anInt1813 >= arg0 && this.anInt1812 <= arg2 && this.anInt1804 >= arg2;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIII)V")
	public void method1833(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[1] = this.anInt1799 + arg2 - this.anInt1796;
		arg0[2] = arg1 + this.anInt1812 - this.anInt1800;
		arg0[0] = this.anInt1805;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ)Z")
	public boolean method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt1799 && this.anInt1813 >= arg0 && arg1 >= this.anInt1812 && this.anInt1804 >= arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BII)Z")
	public boolean method1835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1796 <= arg1 && this.anInt1801 >= arg1 && arg0 >= this.anInt1800 && arg0 <= this.anInt1807;
	}
}
