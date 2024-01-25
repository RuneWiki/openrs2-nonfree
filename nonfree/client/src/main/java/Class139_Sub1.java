import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public final class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
	public final int anInt6052;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
	public final int anInt6047;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!mp;Lclient!fe;IIIIIIIIII)V")
	public Class139_Sub1(@OriginalArg(0) Class236 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6052 = arg11;
		this.anInt6047 = arg10;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return Static472.aClass148_17;
	}
}
