import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class52_Sub4 extends Class52 {

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
	private final int anInt6848;

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
	private final int anInt6856;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
	private final int anInt6844;

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
	private final int anInt6855;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(IIIIIII)V")
	public Class52_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6848 = arg3;
		this.anInt6856 = arg2;
		this.anInt6844 = arg0;
		this.anInt6855 = arg1;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6844 >> 12;
		@Pc(17) int local17 = this.anInt6856 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt6855 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt6848 * arg1 >> 12;
		Static458.method6387(super.anInt6838, super.anInt6842, local10, local17, local38, super.anInt6843, local24);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6844 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6856 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt6855 >> 12;
		@Pc(37) int local37 = this.anInt6848 * arg1 >> 12;
		Static281.method4577(local10, local30, local17, local37, super.anInt6838);
	}
}
