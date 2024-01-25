import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
	private final int anInt414;

	@OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
	private final int anInt416;

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
	private final int anInt417;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	private final int anInt409;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
	private final int anInt413;

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
	private final int anInt410;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	private final int anInt412;

	@OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
	private final int anInt424;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt414 = arg7;
		this.anInt416 = arg1;
		this.anInt417 = arg5;
		this.anInt409 = arg6;
		this.anInt413 = arg2;
		this.anInt410 = arg4;
		this.anInt412 = arg0;
		this.anInt424 = arg3;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt412 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt416 >> 12;
		@Pc(24) int local24 = this.anInt413 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt424 >> 12;
		@Pc(45) int local45 = this.anInt410 * arg1 >> 12;
		@Pc(52) int local52 = this.anInt417 * arg0 >> 12;
		@Pc(59) int local59 = this.anInt409 * arg1 >> 12;
		@Pc(66) int local66 = this.anInt414 * arg0 >> 12;
		Static305.method1618(local66, local45, local59, local17, local52, local24, local31, super.anInt8861, local10);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)V")
	@Override
	public void method7064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
