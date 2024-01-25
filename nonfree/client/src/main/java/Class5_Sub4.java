import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!or", name = "v", descriptor = "I")
	private final int anInt7739;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "I")
	private final int anInt7740;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "I")
	private final int anInt7735;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	private final int anInt7733;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7739 = arg3;
		this.anInt7740 = arg1;
		this.anInt7735 = arg0;
		this.anInt7733 = arg2;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V")
	@Override
	public void method6416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 * this.anInt7735 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt7733 >> 12;
		@Pc(31) int local31 = this.anInt7740 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt7739 * arg0 >> 12;
		Static203.method3761(local17, local24, super.anInt7731, local38, super.anInt7726, local31, super.anInt7728);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt7735 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt7733 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt7740 >> 12;
		@Pc(37) int local37 = this.anInt7739 * arg0 >> 12;
		Static496.method7234(local17, local10, super.anInt7731, local37, super.anInt7728, local30);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7735 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt7733 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt7740 >> 12;
		@Pc(39) int local39 = this.anInt7739 * arg1 >> 12;
		Static140.method2961(local39, super.anInt7726, local10, local32, local25);
	}
}
