import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!b", name = "v", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIII)V")
	public Class13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt345 = arg3;
		this.anInt340 = arg2;
		this.anInt338 = arg0;
		this.anInt344 = arg1;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(III)V")
	@Override
	public void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg0 * this.anInt338 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt344 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt340 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt345 >> 12;
		Static100.method1728(local24, local38, this.anInt5542, local17, local31);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(III)V")
	@Override
	public void method4390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
	@Override
	public void method4389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt338 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt340 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt344 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt345 >> 12;
		Static160.method4111(local35, this.anInt5542, this.anInt5540, local10, this.anInt5544, local17, local28);
	}
}
