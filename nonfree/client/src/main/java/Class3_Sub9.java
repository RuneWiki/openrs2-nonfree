import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!du", name = "s", descriptor = "I")
	private final int anInt1588;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public final int anInt1585;

	@OriginalMember(owner = "client!du", name = "w", descriptor = "I")
	public final int anInt1591;

	@OriginalMember(owner = "client!du", name = "A", descriptor = "I")
	private final int anInt1595;

	@OriginalMember(owner = "client!du", name = "v", descriptor = "I")
	private final int anInt1590;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "I")
	private final int anInt1586;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	public final int anInt1582;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	private final int anInt1589;

	@OriginalMember(owner = "client!du", name = "C", descriptor = "I")
	public final int anInt1596;

	static {
		new Class57(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt1588 = arg2;
		this.anInt1585 = arg7;
		this.anInt1591 = arg6;
		this.anInt1595 = arg3;
		this.anInt1590 = arg1;
		this.anInt1586 = arg0;
		this.anInt1582 = arg5;
		this.anInt1589 = arg4;
		this.anInt1596 = arg8;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IBI)Z")
	public boolean method1298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt1582 <= arg0 && arg0 <= this.anInt1585 && this.anInt1591 <= arg1 && arg1 <= this.anInt1596;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BIII)Z")
	public boolean method1299(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt1586 == arg2 && this.anInt1590 <= arg0 && arg0 <= this.anInt1595 && this.anInt1588 <= arg1 && arg1 <= this.anInt1589;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II[II)V")
	public void method1300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[1] = arg0 + this.anInt1582 - this.anInt1590;
		arg2[2] = arg1 + this.anInt1591 - this.anInt1588;
		arg2[0] = 0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)Z")
	public boolean method1302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt1590 && this.anInt1595 >= arg1 && arg0 >= this.anInt1588 && this.anInt1589 >= arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B[III)V")
	public void method1303(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = this.anInt1586;
		arg0[2] = arg1 + this.anInt1588 - this.anInt1591;
		arg0[1] = this.anInt1590 + arg2 - this.anInt1582;
	}
}
