import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	private final int anInt4026;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
	private final int anInt4028;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private final int anInt4027;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	private final int anInt4025;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIII)V")
	public Class55_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4026 = arg1;
		this.anInt4028 = arg2;
		this.anInt4027 = arg0;
		this.anInt4025 = arg3;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
	@Override
	public void method6989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(BII)V")
	@Override
	public void method6994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BII)V")
	@Override
	public void method6991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4027 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt4028 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt4026 >> 12;
		@Pc(36) int local36 = this.anInt4025 * arg0 >> 12;
		Static174.method3152(local36, local22, local29, local10, super.anInt7977);
	}
}
