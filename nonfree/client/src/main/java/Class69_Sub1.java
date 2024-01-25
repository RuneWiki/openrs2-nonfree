import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	private final int anInt2240;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	private final int anInt2237;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	private final int anInt2238;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	private final int anInt2234;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIII)V")
	public Class69_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2240 = arg1;
		this.anInt2237 = arg2;
		this.anInt2238 = arg0;
		this.anInt2234 = arg3;
	}

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(III)V")
	@Override
	public void method5707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2238 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2237 >> 12;
		@Pc(24) int local24 = this.anInt2240 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt2234 >> 12;
		Static169.method3110(local39, super.anInt6646, local10, local17, local24);
	}

	@OriginalMember(owner = "client!du", name = "e", descriptor = "(III)V")
	@Override
	public void method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V")
	@Override
	public void method5702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
