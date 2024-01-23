import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
	private int anInt2897;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	private int anInt2901;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
	private int anInt2898;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
	private int anInt2900;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIII)V")
	public Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2897 = arg1;
		this.anInt2901 = arg0;
		this.anInt2898 = arg3;
		this.anInt2900 = arg2;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)V")
	@Override
	public void method2334(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	public void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt2901 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt2900 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt2898 >> 12;
		@Pc(39) int local39 = this.anInt2897 * arg1 >> 12;
		Static57.method1074(local32, this.anInt2885, local25, local18, local39);
	}
}
