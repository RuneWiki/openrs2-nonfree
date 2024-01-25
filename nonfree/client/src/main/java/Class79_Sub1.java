import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
	private final int anInt2123;

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "I")
	private final int anInt2132;

	@OriginalMember(owner = "client!eea", name = "m", descriptor = "I")
	private final int anInt2128;

	@OriginalMember(owner = "client!eea", name = "n", descriptor = "I")
	private final int anInt2129;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(IIIIII)V")
	public Class79_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2123 = arg0;
		this.anInt2132 = arg1;
		this.anInt2128 = arg3;
		this.anInt2129 = arg2;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2123 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt2129 >> 12;
		@Pc(29) int local29 = this.anInt2132 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt2128 >> 12;
		Static308.method4871(local36, super.anInt9202, local10, local22, local29);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)V")
	@Override
	public void method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
