import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
	public static int[] anIntArray421;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Lclient!dd;")
	public static Class16 aClass16_37;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1200 = Static8.method128(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1201 = Static8.method128("Select");

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[S")
	public static short[] aShortArray33 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1202 = Static8.method128("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1203 = aClass18_1201;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1204 = Static8.method128("swe");

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public static int anInt4624 = -1;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array24 = new Class18[1000];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public static void method3126() {
		aClass18_1204 = null;
		aClass18_1203 = null;
		anIntArray421 = null;
		aClass16_37 = null;
		aClass18_1201 = null;
		aClass18_1200 = null;
		aClass18Array24 = null;
		aClass18_1202 = null;
		aByteArrayArrayArray8 = null;
		aShortArray33 = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZZ)V")
	public static void method3127(@OriginalArg(1) boolean arg0) {
		if (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3579 >> 7 == Static161.anInt4393 && Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anInt3558 >> 7 == Static166.anInt4506) {
			Static161.anInt4393 = 0;
		}
		@Pc(25) int local25 = Static45.anInt1553;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(39) Class1_Sub1_Sub5_Sub1_Sub2 local39;
			@Pc(37) int local37;
			if (arg0) {
				local37 = 33538048;
				local39 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1;
			} else {
				local39 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[Static58.anIntArray140[local31]];
				local37 = Static58.anIntArray140[local31] << 14;
			}
			if (local39 != null && local39.method2479()) {
				@Pc(64) int local64 = local39.anInt3579 >> 7;
				local39.aBoolean156 = false;
				@Pc(72) int local72 = local39.anInt3558 >> 7;
				if ((Static27.aBoolean26 && Static45.anInt1553 > 50 || Static45.anInt1553 > 200) && !arg0 && local39.anInt3562 == local39.anInt3607) {
					local39.aBoolean156 = true;
				}
				if (local64 >= 0 && local64 < 104 && local72 >= 0 && local72 < 104) {
					if (local39.aClass1_Sub1_Sub5_Sub4_1 == null || Static41.anInt1322 < local39.anInt3624 || Static41.anInt1322 >= local39.anInt3612) {
						if ((local39.anInt3579 & 0x7F) == 64 && (local39.anInt3558 & 0x7F) == 64) {
							if (Static152.anInt4188 == Static157.anIntArrayArray123[local64][local72]) {
								continue;
							}
							Static157.anIntArrayArray123[local64][local72] = Static152.anInt4188;
						}
						local39.anInt3631 = Static34.method728(Static9.anInt295, local39.anInt3558, local39.anInt3579);
						Static87.aClass68_1.method2656(Static9.anInt295, local39.anInt3579, local39.anInt3558, local39.anInt3631, 60, local39, local39.anInt3576, local37, local39.aBoolean155);
					} else {
						local39.aBoolean156 = false;
						local39.anInt3631 = Static34.method728(Static9.anInt295, local39.anInt3558, local39.anInt3579);
						Static87.aClass68_1.method2635(Static9.anInt295, local39.anInt3579, local39.anInt3558, local39.anInt3631, local39, local39.anInt3576, local37, local39.anInt3609, local39.anInt3623, local39.anInt3629, local39.anInt3618);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lclient!jc;")
	public static Class1_Sub1_Sub10 method3128(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub10 local10 = (Class1_Sub1_Sub10) Static123.aClass66_15.method2599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static174.aClass16_39.method2254(arg0, 8);
		local10 = new Class1_Sub1_Sub10();
		if (local28 != null) {
			local10.method1526(new Class1_Sub6(local28));
		}
		Static123.aClass66_15.method2597((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!dd;I)V")
	public static void method3129(@OriginalArg(0) Class16 arg0) {
		Static95.aClass16_12 = arg0;
	}
}
