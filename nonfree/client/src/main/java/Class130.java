import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class130 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public int anInt4012;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Lclient!gi;")
	public Class130 aClass130_1;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	public int anInt4014;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public int anInt4016;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
	public int anInt4018;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	public int anInt4019;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public int anInt4023;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public int anInt4024;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
	public int anInt4025;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
	public int anInt4028;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	private final int anInt4020;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "B")
	public final byte aByte73;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public final int anInt4011;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	public final int anInt4017;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
	public final int anInt4029;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIB)V")
	public Class130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4020 = arg0;
		this.aByte73 = arg4;
		this.anInt4011 = arg1;
		this.anInt4017 = arg2;
		this.anInt4029 = arg3;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)Lclient!gi;")
	public Class130 method3299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class130(this.anInt4020, arg2, arg0, arg1, this.aByte73);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)Lclient!fe;")
	public Class106 method3303() {
		return Static471.method6780(this.anInt4020);
	}
}
