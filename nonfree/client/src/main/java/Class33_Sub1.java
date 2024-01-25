import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	private final int anInt932;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
	private final int anInt933;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	private final int anInt931;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	private final int anInt928;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIII)V")
	public Class33_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt932 = arg2;
		this.anInt933 = arg0;
		this.anInt931 = arg3;
		this.anInt928 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)V")
	@Override
	public void method6288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	@Override
	public void method6286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
	@Override
	public void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt933 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt932 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt928 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt931 * arg0 >> 12;
		Static400.method5532(local17, local10, local24, super.anInt7489, local37);
	}
}
