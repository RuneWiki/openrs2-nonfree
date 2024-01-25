import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class116_Sub4 extends Class116 {

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
	private final int anInt7713;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
	private final int anInt7718;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	private final int anInt7717;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
	private final int anInt7719;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class116_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7713 = arg1;
		this.anInt7718 = arg0;
		this.anInt7717 = arg2;
		this.anInt7719 = arg3;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IBI)V")
	@Override
	public void method6467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7718 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt7717 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt7713 >> 12;
		@Pc(31) int local31 = this.anInt7719 * arg1 >> 12;
		Static459.method6985(local24, local31, super.anInt7709, local10, local17);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7718 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt7717 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt7713 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt7719 * arg1 >> 12;
		Static265.method5935(local28, super.anInt7706, super.anInt7710, local10, local17, local35);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI)V")
	@Override
	public void method6465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt7718 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt7717 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt7713 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt7719 >> 12;
		Static131.method2411(local10, local17, super.anInt7709, super.anInt7710, local32, local39, super.anInt7706);
	}
}
