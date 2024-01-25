import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "Z")
	public static boolean aBoolean751 = false;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Lclient!nt;")
	public static Class238 aClass238_64 = new Class238();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!dm;Lclient!ha;)V")
	public static void method8489(@OriginalArg(1) Class78 arg0, @OriginalArg(2) Class87 arg1) {
		@Pc(39) boolean local39 = Static570.aClass267_2.method6602(arg0.anInt2006, arg0.anInt1953, arg0.anInt1944, arg1, arg0.anInt1970 | 0xFF000000, arg0.anInt1943, arg0.aBoolean166 ? Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1 : null) == null;
		if (local39) {
			Static68.aClass238_8.method5837(new Class2_Sub20(arg0.anInt2006, arg0.anInt1944, arg0.anInt1953, arg0.anInt1970 | 0xFF000000, arg0.anInt1943, arg0.aBoolean166));
			Static397.method6022(arg0);
		}
	}
}
