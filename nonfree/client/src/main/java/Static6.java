import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Z")
	public static boolean aBoolean2;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Lclient!c;")
	public static Class10 aClass10_5;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!rd;")
	public static Class4_Sub3_Sub6_Sub3 aClass4_Sub3_Sub6_Sub3_1;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public static int anInt72 = 0;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!od;")
	private static Class60 aClass60_38 = Static41.method597("Login server offline)3");

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_39 = Static41.method597("sl_back");

	@OriginalMember(owner = "client!af", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_40 = Static41.method597("leuchten1:");

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!od;")
	public static Class60 aClass60_41 = Static41.method597("Hierhin gehen");

	@OriginalMember(owner = "client!af", name = "r", descriptor = "Lclient!od;")
	private static Class60 aClass60_49 = Static41.method597("glow3:");

	@OriginalMember(owner = "client!af", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_42 = aClass60_49;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	public static int anInt73 = 0;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "Lclient!od;")
	public static Class60 aClass60_43 = aClass60_49;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_44 = Static41.method597("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!od;")
	private static Class60 aClass60_45 = Static41.method597("flash3:");

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_46 = aClass60_45;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_47 = aClass60_38;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_48 = aClass60_45;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBZLclient!c;I)V")
	public static void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class10 arg2, @OriginalArg(5) int arg3) {
		Static82.aClass10_22 = arg2;
		Static44.anInt2165 = arg1;
		Static130.anInt2874 = arg0;
		Static72.anInt1827 = 10000;
		Static9.anInt112 = 1;
		Static118.anInt2733 = arg3;
		Static133.aBoolean128 = false;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method58() {
		aClass60_48 = null;
		aClass60_41 = null;
		aClass60_38 = null;
		aClass60_39 = null;
		aClass60_49 = null;
		aClass60_47 = null;
		aClass60_40 = null;
		aClass60_44 = null;
		aClass60_43 = null;
		aClass60_42 = null;
		aClass60_46 = null;
		aClass60_45 = null;
		aClass10_5 = null;
		aClass4_Sub3_Sub6_Sub3_1 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method59(@OriginalArg(1) int arg0) {
		if (Static97.aClass4_Sub4Array1 != null && arg0 >= 0 && arg0 < Static97.aClass4_Sub4Array1.length && Static97.aClass4_Sub4Array1[arg0] != null) {
			Static14.aClass4_Sub9_Sub1_1.method826(224);
			Static14.aClass4_Sub9_Sub1_1.method805(Static97.aClass4_Sub4Array1[arg0].aLong100);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB[B)Lclient!od;")
	public static Class60 method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) Class60 local15 = new Class60();
		local15.anInt1991 = 0;
		local15.aByteArray21 = new byte[arg1];
		for (@Pc(24) int local24 = arg0; local24 < arg0 + arg1; local24++) {
			if (arg2[local24] != 0) {
				local15.aByteArray21[local15.anInt1991++] = arg2[local24];
			}
		}
		return local15;
	}
}
