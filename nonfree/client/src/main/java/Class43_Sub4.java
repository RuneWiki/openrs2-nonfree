import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	private final int anInt5698;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
	private final int anInt5709;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	private final int anInt5706;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	private final int anInt5702;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5698 = arg1;
		this.anInt5709 = arg3;
		this.anInt5706 = arg2;
		this.anInt5702 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt5702 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt5706 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt5698 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt5709 * arg1 >> 12;
		Static7.method150(local32, local39, super.anInt5697, local25, local18, super.anInt5692, super.anInt5696);
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V")
	@Override
	public void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5702 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5706 >> 12;
		@Pc(24) int local24 = this.anInt5698 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5709 >> 12;
		Static16.method286(local24, local17, local31, local10, super.anInt5692);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V")
	@Override
	public void method5170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5702 >> 12;
		@Pc(17) int local17 = this.anInt5706 * arg1 >> 12;
		@Pc(27) int local27 = this.anInt5698 * arg0 >> 12;
		@Pc(34) int local34 = this.anInt5709 * arg0 >> 12;
		Static352.method5767(local10, local34, super.anInt5696, super.anInt5697, local17, local27);
	}
}
