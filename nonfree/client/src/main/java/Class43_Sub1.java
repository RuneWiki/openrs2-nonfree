import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private final int anInt998;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	private final int anInt993;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	private final int anInt1000;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	private final int anInt1001;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt998 = arg0;
		this.anInt993 = arg1;
		this.anInt1000 = arg3;
		this.anInt1001 = arg2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	@Override
	public void method5170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(III)V")
	@Override
	public void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt998 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt1001 >> 12;
		@Pc(29) int local29 = this.anInt993 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt1000 * arg1 >> 12;
		Static119.method2414(local15, local29, super.anInt5692, local22, local36);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = this.anInt998 * arg0 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt1001 >> 12;
		@Pc(32) int local32 = this.anInt993 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt1000 >> 12;
		Static323.method5379(local18, local25, super.anInt5697, super.anInt5696, local32, local39, super.anInt5692);
	}
}
