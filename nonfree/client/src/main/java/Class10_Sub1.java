import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
	private final int anInt381;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	private final int anInt386;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	private final int anInt389;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	private final int anInt383;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIII)V")
	public Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt381 = arg1;
		this.anInt386 = arg2;
		this.anInt389 = arg3;
		this.anInt383 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt383 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt386 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt381 >> 12;
		@Pc(36) int local36 = this.anInt389 * arg0 >> 12;
		Static423.method6197(local10, local24, local36, local17, super.anInt7906);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
	@Override
	public void method6568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
	@Override
	public void method6570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
