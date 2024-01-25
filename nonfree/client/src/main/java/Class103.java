import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public final class Class103 implements Interface9 {

	@OriginalMember(owner = "client!eja", name = "j", descriptor = "I")
	public final int anInt2607;

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "I")
	public final int anInt2602;

	@OriginalMember(owner = "client!eja", name = "m", descriptor = "I")
	public final int anInt2609;

	@OriginalMember(owner = "client!eja", name = "i", descriptor = "Lclient!eaa;")
	public final Class92 aClass92_3;

	@OriginalMember(owner = "client!eja", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "I")
	public final int anInt2601;

	@OriginalMember(owner = "client!eja", name = "k", descriptor = "I")
	public final int anInt2608;

	@OriginalMember(owner = "client!eja", name = "g", descriptor = "I")
	public final int anInt2605;

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "I")
	public final int anInt2600;

	@OriginalMember(owner = "client!eja", name = "d", descriptor = "I")
	public final int anInt2603;

	@OriginalMember(owner = "client!eja", name = "h", descriptor = "I")
	public final int anInt2606;

	@OriginalMember(owner = "client!eja", name = "n", descriptor = "I")
	public final int anInt2610;

	@OriginalMember(owner = "client!eja", name = "l", descriptor = "Lclient!cq;")
	public final Class65 aClass65_6;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!eaa;Lclient!cq;IIIIIIIIII)V")
	public Class103(@OriginalArg(0) String arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt2607 = arg9;
		this.anInt2602 = arg10;
		this.anInt2609 = arg12;
		this.aClass92_3 = arg1;
		this.aString28 = arg0;
		this.anInt2601 = arg8;
		this.anInt2608 = arg11;
		this.anInt2605 = arg5;
		this.anInt2600 = arg7;
		this.anInt2603 = arg4;
		this.anInt2606 = arg3;
		this.anInt2610 = arg6;
		this.aClass65_6 = arg2;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static199.aClass6_39;
	}
}
