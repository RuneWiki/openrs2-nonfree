import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
	public static int anInt6611;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_63 = new Class257(8, 7);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)Z")
	public static boolean method5420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBII)V")
	public static void method5422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class8_Sub5_Sub8 local17 = Static509.method7344(4, arg1);
		local17.method3509();
		local17.anInt4324 = arg3;
		local17.anInt4321 = arg2;
		local17.anInt4329 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V")
	public static void method5423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class8_Sub31 local17 = Static51.method1418(Static566.aClass257_107, Static608.aClass336_1);
		local17.aClass8_Sub8_Sub2_1.method8572(arg1);
		local17.aClass8_Sub8_Sub2_1.method8523(arg0);
		Static262.method4604(local17);
	}
}
