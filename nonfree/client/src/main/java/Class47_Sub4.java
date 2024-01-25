import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class47_Sub4 extends Class47 {

	@OriginalMember(owner = "client!via", name = "m", descriptor = "I")
	private final int anInt10099;

	@OriginalMember(owner = "client!via", name = "s", descriptor = "I")
	private final int anInt10105;

	@OriginalMember(owner = "client!via", name = "l", descriptor = "I")
	private final int anInt10098;

	@OriginalMember(owner = "client!via", name = "p", descriptor = "I")
	private final int anInt10102;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(IIIIII)V")
	public Class47_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt10099 = arg3;
		this.anInt10105 = arg0;
		this.anInt10098 = arg2;
		this.anInt10102 = arg1;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(III)V")
	@Override
	public void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(III)V")
	@Override
	public void method8414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt10105 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt10098 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt10102 >> 12;
		@Pc(36) int local36 = this.anInt10099 * arg1 >> 12;
		Static322.method5018(local15, local22, local36, local29, super.anInt10096);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(BII)V")
	@Override
	public void method8416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
