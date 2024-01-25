import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class125_Sub3 extends Class125 {

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
	private final int anInt10129;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
	private final int anInt10133;

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
	private final int anInt10132;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
	private final int anInt10134;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIIII)V")
	public Class125_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt10129 = arg0;
		this.anInt10133 = arg1;
		this.anInt10132 = arg2;
		this.anInt10134 = arg3;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
	@Override
	public void method9264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * this.anInt10129 >> 12;
		@Pc(24) int local24 = this.anInt10132 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt10133 * arg0 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt10134 >> 12;
		Static347.method5240(super.anInt10752, local31, local17, local38, super.anInt10754, local24, super.anInt10751);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method9263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt10129 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt10132 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt10133 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt10134 >> 12;
		Static281.method4146(local22, local36, local29, local15, super.anInt10754);
	}
}
