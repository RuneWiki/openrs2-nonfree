import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!ria", name = "F", descriptor = "I")
	public final int anInt838;

	@OriginalMember(owner = "client!ria", name = "w", descriptor = "I")
	public final int anInt829;

	@OriginalMember(owner = "client!ria", name = "E", descriptor = "I")
	public final int anInt837;

	@OriginalMember(owner = "client!ria", name = "B", descriptor = "I")
	public final int anInt834;

	@OriginalMember(owner = "client!ria", name = "u", descriptor = "I")
	public final int anInt827;

	@OriginalMember(owner = "client!ria", name = "D", descriptor = "I")
	public final int anInt836;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!rg;Lclient!al;IIIIIIIIIIIII)V")
	public Class35_Sub1(@OriginalArg(0) Class293 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt838 = arg9;
		this.anInt829 = arg13;
		this.anInt837 = arg10;
		this.anInt834 = arg12;
		this.anInt827 = arg14;
		this.anInt836 = arg11;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static89.aClass384_50;
	}
}
