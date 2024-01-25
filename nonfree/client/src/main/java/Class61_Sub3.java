import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class61_Sub3 extends Class61 {

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
	private final int anInt4360;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	private final int anInt4359;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
	private final int anInt4355;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
	private final int anInt4363;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IIIIII)V")
	public Class61_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4360 = arg0;
		this.anInt4359 = arg2;
		this.anInt4355 = arg1;
		this.anInt4363 = arg3;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(IBI)V")
	@Override
	public void method4110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt4360 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt4359 >> 12;
		@Pc(28) int local28 = this.anInt4355 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt4363 >> 12;
		Static226.method2982(super.anInt5306, local35, local28, local14, local21);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
	@Override
	public void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
