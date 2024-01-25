import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
	public final int anInt7630;

	@OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
	public final int anInt7633;

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
	public final int anInt7629;

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
	public final int anInt7628;

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
	public final int anInt7627;

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
	public final int anInt7631;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!rn;Lclient!hv;IIIIIIIIIII)V")
	public Class10_Sub3(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt7630 = arg11;
		this.anInt7633 = arg7;
		this.anInt7629 = arg8;
		this.anInt7628 = arg10;
		this.anInt7627 = arg9;
		this.anInt7631 = arg12;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static188.aClass165_7;
	}
}
