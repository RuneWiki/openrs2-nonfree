import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	private final int anInt5892;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	private final int anInt5891;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private final int anInt5885;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private final int anInt5884;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIII)V")
	public Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5892 = arg2;
		this.anInt5891 = arg1;
		this.anInt5885 = arg0;
		this.anInt5884 = arg3;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	@Override
	public void method7125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5885 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5892 >> 12;
		@Pc(29) int local29 = this.anInt5891 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt5884 * arg0 >> 12;
		Static70.method609(super.anInt8662, local10, local29, local36, local17);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
