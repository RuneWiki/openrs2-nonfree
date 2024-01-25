import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
	public final int anInt1704;

	@OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
	private final int anInt1721;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
	private final int anInt1713;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
	private final int anInt1706;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public final int anInt1710;

	@OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
	private final int anInt1722;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
	public final int anInt1719;

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
	public final int anInt1720;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
	private final int anInt1711;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1704 = arg5;
		this.anInt1721 = arg2;
		this.anInt1713 = arg3;
		this.anInt1706 = arg1;
		this.anInt1710 = arg7;
		this.anInt1722 = arg0;
		this.anInt1719 = arg8;
		this.anInt1720 = arg6;
		this.anInt1711 = arg4;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIBI)Z")
	public boolean method1442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1722 == arg2 && this.anInt1706 <= arg1 && arg1 <= this.anInt1713 && arg0 >= this.anInt1721 && arg0 <= this.anInt1711;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z")
	public boolean method1443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt1704 && this.anInt1710 >= arg0 && arg1 >= this.anInt1720 && this.anInt1719 >= arg1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BII)Z")
	public boolean method1444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1706 <= arg1 && arg1 <= this.anInt1713 && this.anInt1721 <= arg0 && arg0 <= this.anInt1711;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([IBII)V")
	public void method1445(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt1704 + arg2 - this.anInt1706;
		arg0[2] = this.anInt1720 + arg1 - this.anInt1721;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[III)V")
	public void method1447(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg0 + this.anInt1706 - this.anInt1704;
		arg1[2] = this.anInt1721 + arg2 - this.anInt1720;
		arg1[0] = this.anInt1722;
	}
}
