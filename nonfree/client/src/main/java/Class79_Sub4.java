import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class79_Sub4 extends Class79 {

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
	private final int anInt5798;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	private final int anInt5801;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
	private final int anInt5802;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
	private final int anInt5799;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIII)V")
	public Class79_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5798 = arg1;
		this.anInt5801 = arg3;
		this.anInt5802 = arg0;
		this.anInt5799 = arg2;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt5802 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt5799 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt5798 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt5801 >> 12;
		Static197.method3546(local22, super.anInt5793, local36, local29, local15);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
	@Override
	public void method5119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	@Override
	public void method5114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
