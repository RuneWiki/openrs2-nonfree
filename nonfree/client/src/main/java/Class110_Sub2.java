import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class110_Sub2 extends Class110 {

	@OriginalMember(owner = "client!je", name = "u", descriptor = "I")
	public final int anInt4269;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "I")
	public final int anInt4266;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!fda;Lclient!aba;IIIIIIIIII)V")
	public Class110_Sub2(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4269 = arg11;
		this.anInt4266 = arg10;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static363.aClass370_5;
	}
}
