import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!du", name = "q", descriptor = "I")
	private final int anInt2394;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	private final int anInt2385;

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	private final int anInt2395;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	private final int anInt2392;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "I")
	private final int anInt2390;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "I")
	private final int anInt2387;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	private final int anInt2389;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	private final int anInt2396;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class77_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2394 = arg5;
		this.anInt2385 = arg3;
		this.anInt2395 = arg2;
		this.anInt2392 = arg0;
		this.anInt2390 = arg7;
		this.anInt2387 = arg1;
		this.anInt2389 = arg6;
		this.anInt2396 = arg4;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2392 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2387 >> 12;
		@Pc(24) int local24 = this.anInt2395 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt2385 * arg1 >> 12;
		@Pc(43) int local43 = this.anInt2396 * arg0 >> 12;
		@Pc(50) int local50 = this.anInt2394 * arg1 >> 12;
		@Pc(57) int local57 = arg0 * this.anInt2389 >> 12;
		@Pc(64) int local64 = this.anInt2390 * arg1 >> 12;
		Static51.method1220(local10, local64, local17, local24, local57, local50, local31, local43, super.anInt6157);
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(IBI)V")
	@Override
	public void method5256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
