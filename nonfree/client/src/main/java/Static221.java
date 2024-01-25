import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "Lclient!bd;")
	public static Class21 aClass21_13;

	@OriginalMember(owner = "client!mt", name = "B", descriptor = "Lclient!g;")
	public static Class83 aClass83_129;

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
	public static int anInt6801;

	@OriginalMember(owner = "client!mt", name = "D", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array60;

	@OriginalMember(owner = "client!mt", name = "r", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_235 = new Class62("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_107 = new Class183(13, 8);

	@OriginalMember(owner = "client!mt", name = "z", descriptor = "Z")
	public static boolean aBoolean480 = true;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIII)V")
	public static void method5896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static55.method859(arg3, arg4, arg2, arg1);
		} else if (arg1 - arg4 >= Static179.anInt3768 && Static121.anInt6758 >= arg1 + arg4 && arg3 - arg0 >= Static317.anInt5793 && arg3 + arg0 <= Static69.anInt1551) {
			Static268.method4562(arg4, arg3, arg0, arg2, arg1);
		} else {
			Static32.method366(arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ILclient!vt;)Lclient!qj;")
	public static Class193 method5897(@OriginalArg(1) Class2_Sub24 arg0) {
		@Pc(12) Class193 local12 = new Class193();
		local12.anInt5276 = arg0.method5753();
		local12.aClass2_Sub7_Sub4_1 = Static116.method2078(local12.anInt5276);
		return local12;
	}

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "(I)V")
	public static void method5899() {
		Static19.aClass243_1.method5970();
	}
}
