import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	private int anInt1921;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
	private int anInt1919;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
	private int anInt1923;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
	private int anInt1927;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1921 = arg3;
		this.anInt1919 = arg1;
		this.anInt1923 = arg2;
		this.anInt1927 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	@Override
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(III)V")
	@Override
	public void method3667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1927 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1923 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt1921 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt1919 >> 12;
		Static113.method1844(local10, this.anInt4883, local30, local17, local37);
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(III)V")
	@Override
	public void method3668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 * this.anInt1927 >> 12;
		@Pc(24) int local24 = this.anInt1923 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt1921 >> 12;
		@Pc(38) int local38 = this.anInt1919 * arg1 >> 12;
		Static39.method613(local24, local31, this.anInt4886, this.anInt4887, this.anInt4883, local17, local38);
	}
}
