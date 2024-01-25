import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!daa", name = "p", descriptor = "I")
	public final int anInt1484;

	@OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
	public final int anInt1486;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!fw;Lclient!dg;IIIIIIII)V")
	public Class65_Sub1(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt1484 = arg9;
		this.anInt1486 = arg8;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static572.aClass136_145;
	}
}
