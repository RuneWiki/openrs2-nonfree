import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	private final int anInt587;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	private final int anInt581;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
	private final int anInt588;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	private final int anInt585;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(IIIIIII)V")
	public Class24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt587 = arg1;
		this.anInt581 = arg0;
		this.anInt588 = arg2;
		this.anInt585 = arg3;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt581 >> 12;
		@Pc(25) int local25 = this.anInt588 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt587 >> 12;
		@Pc(39) int local39 = this.anInt585 * arg1 >> 12;
		Static274.method4047(local18, local39, local25, super.anInt9953, super.anInt9951, local32);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt581 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt588 >> 12;
		@Pc(24) int local24 = this.anInt587 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt585 * arg1 >> 12;
		Static183.method2639(super.anInt9952, local24, local10, local17, local37);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BII)V")
	@Override
	public void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt581 * arg1 >> 12;
		@Pc(23) int local23 = this.anInt588 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt587 >> 12;
		@Pc(37) int local37 = this.anInt585 * arg0 >> 12;
		Static561.method7894(local23, local30, super.anInt9951, super.anInt9952, local16, super.anInt9953, local37);
	}
}
