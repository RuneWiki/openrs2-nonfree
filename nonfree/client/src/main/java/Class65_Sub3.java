import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
	public final int anInt4931;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
	public final int anInt4933;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
	public final int anInt4932;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	public final int anInt4926;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	public final int anInt4928;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	public final int anInt4925;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!fw;Lclient!dg;IIIIIIIIIII)V")
	public Class65_Sub3(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt4931 = arg10;
		this.anInt4933 = arg9;
		this.anInt4932 = arg8;
		this.anInt4926 = arg11;
		this.anInt4928 = arg7;
		this.anInt4925 = arg12;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static303.aClass136_84;
	}
}
