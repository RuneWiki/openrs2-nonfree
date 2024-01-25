import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!es", name = "u", descriptor = "I")
	private final int anInt2848;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "I")
	private final int anInt2841;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "I")
	private final int anInt2842;

	@OriginalMember(owner = "client!es", name = "m", descriptor = "I")
	private final int anInt2840;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(IIIIIII)V")
	public Class82_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2848 = arg3;
		this.anInt2841 = arg2;
		this.anInt2842 = arg0;
		this.anInt2840 = arg1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BII)V")
	@Override
	public void method5659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2842 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2841 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt2840 >> 12;
		@Pc(39) int local39 = this.anInt2848 * arg1 >> 12;
		Static74.method1952(local24, local17, local10, local39, super.anInt6513);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(III)V")
	@Override
	public void method5660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2842 >> 12;
		@Pc(17) int local17 = this.anInt2841 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2840 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt2848 >> 12;
		Static258.method4325(local17, local39, local10, super.anInt6513, local24, super.anInt6516, super.anInt6514);
	}
}
