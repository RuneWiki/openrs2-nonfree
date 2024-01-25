import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ica", name = "R", descriptor = "Lclient!ha;")
	public static Class5 aClass5_8;

	@OriginalMember(owner = "client!ica", name = "H", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_3 = new Class222("runescape", 0);

	@OriginalMember(owner = "client!ica", name = "Q", descriptor = "Lclient!fw;")
	public static final Class120 aClass120_3 = new Class120();

	@OriginalMember(owner = "client!ica", name = "S", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_58 = new Class200(107, 3);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BC)I")
	public static int method3888(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class10_Sub2.anIntArray478.length ? Class10_Sub2.anIntArray478[arg0] : -1;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIB)V")
	public static void method3890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class3_Sub4_Sub12 local10 = Static556.method8018(7, arg0);
		local10.method3608();
		local10.anInt4062 = arg1;
	}
}
