import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
	private int anInt4896;

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
	private int anInt4902;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
	private int anInt4897;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
	private int anInt4895;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIII)V")
	public Class74_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4896 = arg2;
		this.anInt4902 = arg1;
		this.anInt4897 = arg0;
		this.anInt4895 = arg3;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
	@Override
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4897 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4902 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt4896 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt4895 >> 12;
		Static145.method2558(local17, local30, local10, this.anInt6030, this.anInt6022, local37);
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)V")
	@Override
	public void method4820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt4897 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt4896 >> 12;
		@Pc(28) int local28 = this.anInt4902 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt4895 * arg0 >> 12;
		Static34.method1662(local14, this.anInt6029, this.anInt6030, local28, local35, this.anInt6022, local21);
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)V")
	@Override
	public void method4818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt4897 >> 12;
		@Pc(25) int local25 = this.anInt4895 * arg1 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4902 >> 12;
		@Pc(39) int local39 = this.anInt4896 * arg0 >> 12;
		Static215.method3631(local6, this.anInt6029, local25, local39, local32);
	}
}
