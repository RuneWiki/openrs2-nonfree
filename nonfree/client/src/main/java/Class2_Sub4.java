import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	private int anInt4984;

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	private int anInt4990;

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	private int anInt4985;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "I")
	private int anInt4987;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4984 = arg2;
		this.anInt4990 = arg3;
		this.anInt4985 = arg0;
		this.anInt4987 = arg1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	@Override
	public void method4157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt4985 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt4984 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4987 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt4990 >> 12;
		Static173.method2869(this.anInt4978, local32, local39, local18, local25, this.anInt4979);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IBI)V")
	@Override
	public void method4158(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4985 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4984 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4987 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4990 >> 12;
		Static221.method3629(local31, local24, this.anInt4979, local10, this.anInt4977, this.anInt4978, local17);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4985 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4987 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4990 >> 12;
		@Pc(31) int local31 = this.anInt4984 * arg0 >> 12;
		Static85.method1311(local17, local24, this.anInt4977, local10, local31);
	}
}
