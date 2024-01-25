import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class90_Sub4 extends Class90 {

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
	private final int anInt7702;

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
	private final int anInt7701;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	private final int anInt7691;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
	private final int anInt7697;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	private final int anInt7700;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	private final int anInt7699;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	private final int anInt7695;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
	private final int anInt7698;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class90_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt7702 = arg7;
		this.anInt7701 = arg3;
		this.anInt7691 = arg6;
		this.anInt7697 = arg2;
		this.anInt7700 = arg5;
		this.anInt7699 = arg4;
		this.anInt7695 = arg0;
		this.anInt7698 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt7695 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt7698 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt7697 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt7701 >> 12;
		@Pc(38) int local38 = this.anInt7699 * arg1 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt7700 >> 12;
		@Pc(60) int local60 = this.anInt7691 * arg1 >> 12;
		@Pc(67) int local67 = this.anInt7702 * arg0 >> 12;
		Static149.method2367(super.anInt7684, local24, local38, local67, local31, local10, local17, local53, local60);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
	@Override
	public void method5868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
