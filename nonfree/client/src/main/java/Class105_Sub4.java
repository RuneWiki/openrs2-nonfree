import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class105_Sub4 extends Class105 {

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	private final int anInt7379;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
	private final int anInt7381;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
	private final int anInt7378;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
	private final int anInt7376;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIII)V")
	public Class105_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7379 = arg0;
		this.anInt7381 = arg2;
		this.anInt7378 = arg3;
		this.anInt7376 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7379 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt7381 >> 12;
		@Pc(29) int local29 = this.anInt7376 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt7378 * arg0 >> 12;
		Static123.method1964(local10, super.anInt7368, local29, local36, local22);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5928(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(IIB)V")
	@Override
	public void method5927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt7379 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt7381 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt7376 >> 12;
		@Pc(35) int local35 = this.anInt7378 * arg1 >> 12;
		Static206.method2912(super.anInt7370, super.anInt7368, local21, local28, local14, local35, super.anInt7373);
	}
}
