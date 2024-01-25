import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
	private final int anInt7291;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	private final int anInt7296;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
	private final int anInt7295;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
	private final int anInt7292;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt7291 = arg3;
		this.anInt7296 = arg0;
		this.anInt7295 = arg2;
		this.anInt7292 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)V")
	@Override
	public void method7276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt7296 >> 12;
		@Pc(24) int local24 = this.anInt7295 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt7292 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt7291 >> 12;
		Static393.method5402(local31, super.anInt8895, local10, super.anInt8894, local38, super.anInt8896, local24);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt7296 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt7295 >> 12;
		@Pc(29) int local29 = this.anInt7292 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt7291 >> 12;
		Static184.method2585(local15, super.anInt8894, local22, super.anInt8895, local29, local36);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7296 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt7295 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt7292 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt7291 >> 12;
		Static167.method2398(local10, local39, super.anInt8896, local17, local24);
	}
}
