import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!ok;")
	public static Class178 aClass178_108;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!tp;")
	public static Class239 aClass239_7;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[8];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBIII)V")
	public static void method4572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class7_Sub4_Sub14 local12 = Static54.method750(arg2, 10);
		local12.method4716();
		local12.anInt5867 = arg0;
		local12.anInt5870 = arg1;
		local12.anInt5868 = arg3;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method4577(@OriginalArg(0) int arg0) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 10);
		local8.method4710();
	}
}
