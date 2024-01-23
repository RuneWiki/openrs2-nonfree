import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
	public static int anInt1257;

	@OriginalMember(owner = "client!eb", name = "T", descriptor = "Lclient!jh;")
	public static Class2_Sub4_Sub2 aClass2_Sub4_Sub2_1;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	public static int anInt1255 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lclient!fl;")
	public static Class57 method1050(@OriginalArg(0) int arg0) {
		@Pc(10) Class57 local10 = (Class57) Static226.aClass89_36.method2268((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static269.aClass168_181.method4058(Static297.method4544(arg0), Static157.method2550(arg0));
		local10 = new Class57();
		local10.anInt1776 = arg0;
		if (local28 != null) {
			local10.method1323(new Class1_Sub14(local28));
		}
		local10.method1337();
		if (local10.anInt1777 != -1) {
			local10.method1330(method1050(local10.anInt1777), method1050(local10.anInt1808));
		}
		if (local10.anInt1768 != -1) {
			local10.method1339(method1050(local10.anInt1821), method1050(local10.anInt1768));
		}
		if (!Static253.aBoolean318 && local10.aBoolean124) {
			local10.anInt1781 = 0;
			local10.aString102 = Static116.aString152;
			local10.aStringArray16 = Static120.aStringArray51;
			local10.aStringArray17 = Static46.aStringArray10;
			local10.aBoolean123 = false;
		}
		Static226.aClass89_36.method2272((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method1051(@OriginalArg(1) int arg0) {
		return Static190.aStringArray34[arg0].length() > 0 ? Static112.aStringArray24[arg0] + Static264.aString378 + Static190.aStringArray34[arg0] : Static112.aStringArray24[arg0];
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)[Lclient!si;")
	public static Class1_Sub3_Sub13_Sub2[] method1053() {
		@Pc(16) Class1_Sub3_Sub13_Sub2[] local16 = new Class1_Sub3_Sub13_Sub2[Static165.anInt3668];
		for (@Pc(18) int local18 = 0; local18 < Static165.anInt3668; local18++) {
			@Pc(29) int local29 = Static95.anIntArray212[local18] * Static50.anIntArray22[local18];
			@Pc(32) int[] local32 = new int[local29];
			@Pc(36) byte[] local36 = Static34.aByteArrayArray5[local18];
			for (@Pc(38) int local38 = 0; local38 < local29; local38++) {
				local32[local38] = Static234.anIntArray454[local36[local38] & 0xFF];
			}
			local16[local18] = new Class1_Sub3_Sub13_Sub2(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[local18], Static137.anIntArray227[local18], Static95.anIntArray212[local18], Static50.anIntArray22[local18], local32);
		}
		Static20.method432();
		return local16;
	}
}
