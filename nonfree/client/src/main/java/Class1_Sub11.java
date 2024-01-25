import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	private final int anInt1519;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	private final int anInt1525;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public final int anInt1529;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	public final int anInt1517;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
	public final int anInt1523;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	private final int anInt1530;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	private final int anInt1524;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public final int anInt1528;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	private final int anInt1527;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1519 = arg2;
		this.anInt1525 = arg1;
		this.anInt1529 = arg6;
		this.anInt1517 = arg7;
		this.anInt1523 = arg5;
		this.anInt1530 = arg3;
		this.anInt1524 = arg4;
		this.anInt1528 = arg8;
		this.anInt1527 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZI[I)V")
	public void method1442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt1527;
		arg2[1] = this.anInt1525 + arg0 - this.anInt1523;
		arg2[2] = this.anInt1519 + arg1 - this.anInt1529;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB)Z")
	public boolean method1444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt1523 && this.anInt1517 >= arg1 && this.anInt1529 <= arg0 && this.anInt1528 >= arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIB)Z")
	public boolean method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg2 == this.anInt1527 && this.anInt1525 <= arg1 && arg1 <= this.anInt1530 && arg0 >= this.anInt1519 && arg0 <= this.anInt1524;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[II)V")
	public void method1446(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = this.anInt1529 + arg2 - this.anInt1519;
		arg1[0] = 0;
		arg1[1] = arg0 + this.anInt1523 - this.anInt1525;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)Z")
	public boolean method1447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt1525 && this.anInt1530 >= arg0 && this.anInt1519 <= arg1 && this.anInt1524 >= arg1;
	}
}
