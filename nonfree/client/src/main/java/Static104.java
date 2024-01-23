import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!mk;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!mn;")
	public static Class115 aClass115_9 = null;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!a;")
	public static Class1 aClass1_10 = new Class1();

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	public static int anInt2261 = 0;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	public static int anInt2262 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!jd;I)Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1 method1942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2) {
		return Static288.method4789(arg1, arg0, arg2) ? Static229.method4366() : null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!jd;Z)V")
	public static void method1943(@OriginalArg(0) Class84 arg0) {
		Static92.anInt2040 = arg0.method2121("p11_full");
		Static207.anInt4319 = arg0.method2121("p12_full");
		Static120.anInt2577 = arg0.method2121("b12_full");
		Static79.anInt1760 = arg0.method2121("mapfunction");
		Static200.anInt4154 = arg0.method2121("hitmarks");
		Static140.anInt3021 = arg0.method2121("hitbar_default");
		Static157.anInt3298 = arg0.method2121("headicons_pk");
		Static106.anInt2315 = arg0.method2121("headicons_prayer");
		Static44.anInt1073 = arg0.method2121("hint_headicons");
		Static243.anInt3778 = arg0.method2121("hint_mapmarkers");
		Static35.anInt849 = arg0.method2121("mapflag");
		Static274.anInt5699 = arg0.method2121("cross");
		Static16.anInt403 = arg0.method2121("mapdots");
		Static247.anInt4929 = arg0.method2121("scrollbar");
		Static15.anInt354 = arg0.method2121("name_icons");
		Static89.anInt1991 = arg0.method2121("floorshadows");
		Static182.anInt3885 = arg0.method2121("compass");
		Static70.anInt1539 = arg0.method2121("hint_mapedge");
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method1944(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(14) Class2_Sub3_Sub16 local14 = Static119.method2204(arg0, 2);
		local14.method2718();
		local14.aString162 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public static void method1946() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				if (Static284.method4718(local11, Static180.aClass2_Sub31ArrayArrayArray2, true, local13, local18)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}
}
