import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!nf", name = "Bb", descriptor = "Lclient!ia;")
	private static Class51 aClass51_926 = Static64.method1101("flash3:");

	@OriginalMember(owner = "client!nf", name = "Ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_925 = aClass51_926;

	@OriginalMember(owner = "client!nf", name = "Cb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_927 = Static64.method1101("");

	@OriginalMember(owner = "client!nf", name = "Eb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_928 = aClass51_926;

	@OriginalMember(owner = "client!nf", name = "Gb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_929 = Static64.method1101(":");

	@OriginalMember(owner = "client!nf", name = "Jb", descriptor = "I")
	public static volatile int anInt2614 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	public static void method2044() {
		Static20.anIntArrayArrayArray2 = Static190.anIntArrayArrayArray9;
		Static22.aClass1_Sub7ArrayArrayArray1 = Static114.aClass1_Sub7ArrayArrayArray2;
		Static174.anInt3861 = Static22.aClass1_Sub7ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BILclient!ad;IIII)V")
	public static void method2045(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static191.method3195(arg0, arg1.anInt3624, arg3, arg1.anInt3598, arg2);
	}

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
	public static void method2046() {
		Static118.aClass53_19.method1498();
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)[Lclient!te;")
	public static Class1_Sub2_Sub1[] method2048() {
		@Pc(13) Class1_Sub2_Sub1[] local13 = new Class1_Sub2_Sub1[Static43.anInt1027];
		for (@Pc(15) int local15 = 0; local15 < Static43.anInt1027; local15++) {
			@Pc(21) byte[] local21 = Static73.aByteArrayArray4[local15];
			@Pc(29) int local29 = Static89.anIntArray85[local15] * Static51.anIntArray72[local15];
			if (Static112.aBooleanArray15[local15]) {
				@Pc(84) int[] local84 = new int[local29];
				@Pc(88) byte[] local88 = Static191.aByteArrayArray12[local15];
				for (@Pc(90) int local90 = 0; local90 < local29; local90++) {
					local84[local90] = (local88[local90] & 0xFF) << 24 | Static52.anIntArray74[local21[local90] & 0xFF];
				}
				local13[local15] = new Class1_Sub2_Sub1_Sub1_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[local15], Static152.anIntArray225[local15], Static51.anIntArray72[local15], Static89.anIntArray85[local15], local84);
			} else {
				@Pc(36) int[] local36 = new int[local29];
				for (@Pc(38) int local38 = 0; local38 < local29; local38++) {
					local36[local38] = Static52.anIntArray74[local21[local38] & 0xFF];
				}
				local13[local15] = new Class1_Sub2_Sub1_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[local15], Static152.anIntArray225[local15], Static51.anIntArray72[local15], Static89.anIntArray85[local15], local36);
			}
		}
		Static134.method2401();
		return local13;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZI)I")
	public static int method2049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}
}
