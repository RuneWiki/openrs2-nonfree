import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class61_Sub4 extends Class61 {

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	private final int anInt5310;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
	private final int anInt5309;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	private final int anInt5317;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
	private final int anInt5311;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	private final int anInt5316;

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	private final int anInt5318;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	private final int anInt5314;

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	private final int anInt5312;

	static {
		new Class198("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class61_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5310 = arg6;
		this.anInt5309 = arg0;
		this.anInt5317 = arg2;
		this.anInt5311 = arg7;
		this.anInt5316 = arg1;
		this.anInt5318 = arg5;
		this.anInt5314 = arg3;
		this.anInt5312 = arg4;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	@Override
	public void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(IBI)V")
	@Override
	public void method4110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5309 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt5316 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt5317 >> 12;
		@Pc(39) int local39 = this.anInt5314 * arg0 >> 12;
		@Pc(46) int local46 = this.anInt5312 * arg1 >> 12;
		@Pc(53) int local53 = this.anInt5318 * arg0 >> 12;
		@Pc(60) int local60 = this.anInt5310 * arg1 >> 12;
		@Pc(67) int local67 = this.anInt5311 * arg0 >> 12;
		Static223.method2948(local25, super.anInt5306, local10, local46, local53, local67, local39, local32, local60);
	}
}
