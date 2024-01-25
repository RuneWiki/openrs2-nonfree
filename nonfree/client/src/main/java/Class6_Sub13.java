import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public final class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
	private final int anInt1678;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
	private final int anInt1683;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
	private final int anInt1688;

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
	public final int anInt1687;

	@OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
	public final int anInt1691;

	@OriginalMember(owner = "client!dba", name = "w", descriptor = "I")
	private final int anInt1692;

	@OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
	public final int anInt1681;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
	private final int anInt1686;

	@OriginalMember(owner = "client!dba", name = "u", descriptor = "I")
	public final int anInt1690;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class6_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1678 = arg3;
		this.anInt1683 = arg2;
		this.anInt1688 = arg0;
		this.anInt1687 = arg7;
		this.anInt1691 = arg5;
		this.anInt1692 = arg4;
		this.anInt1681 = arg6;
		this.anInt1686 = arg1;
		this.anInt1690 = arg8;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Z")
	public boolean method1621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1691 <= arg1 && this.anInt1687 >= arg1 && arg0 >= this.anInt1681 && arg0 <= this.anInt1690;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II[IB)V")
	public void method1622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[2] = this.anInt1683 + arg0 - this.anInt1681;
		arg2[0] = this.anInt1688;
		arg2[1] = arg1 + this.anInt1686 - this.anInt1691;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II[II)V")
	public void method1623(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt1681 + arg0 - this.anInt1683;
		arg1[1] = arg2 + this.anInt1691 - this.anInt1686;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(III)Z")
	public boolean method1624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt1686 <= arg1 && this.anInt1678 >= arg1 && this.anInt1683 <= arg0 && arg0 <= this.anInt1692;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IBII)Z")
	public boolean method1625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1688 == arg0 && arg1 >= this.anInt1686 && arg1 <= this.anInt1678 && this.anInt1683 <= arg2 && arg2 <= this.anInt1692;
	}
}
