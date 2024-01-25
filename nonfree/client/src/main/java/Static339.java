import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
	public static int anInt5722;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "Lclient!ph;")
	public static Class187 aClass187_102;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!mf;")
	public static Class163 aClass163_38;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
	public static int anInt5724 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!ph;I)Lclient!et;")
	public static Class10_Sub15 method4546(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1) {
		@Pc(8) byte[] local8 = arg1.method4303(arg0);
		return local8 == null ? null : new Class10_Sub15(local8);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static232.anInt4730 = arg1;
		Static80.anInt1680 = arg5;
		Static217.anInt4137 = arg0;
		Static337.anInt5680 = arg3;
		Static382.anInt7086 = arg4;
		Static397.anInt6732 = arg2;
	}
}
