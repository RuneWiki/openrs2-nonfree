import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public static int anInt2236;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	public static int anInt2232 = -1;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!lc;")
	public static Class31 aClass31_777 = Static56.method1206("Loaded update list");

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_778 = Static56.method1206("mapback");

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!lc;")
	public static Class31 aClass31_779 = Static56.method1206("Loaded fonts");

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_780 = Static56.method1206("mapmarker");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!lc;ZILclient!lc;)V")
	public static void method1397(@OriginalArg(0) Class31 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class31 arg2) {
		if (arg1 == 0 && Static37.anInt1409 != -1) {
			Static49.anInt2693 = 0;
			Static5.aClass31_72 = arg0;
		}
		if (Static47.anInt1736 == -1) {
			Static27.aBoolean65 = true;
		}
		for (@Pc(27) int local27 = 99; local27 > 0; local27--) {
			Static59.anIntArray286[local27] = Static59.anIntArray286[local27 - 1];
			Static8.aClass31Array5[local27] = Static8.aClass31Array5[local27 - 1];
			Static28.aClass31Array6[local27] = Static28.aClass31Array6[local27 - 1];
		}
		Static59.anIntArray286[0] = arg1;
		Static8.aClass31Array5[0] = arg2;
		Static28.aClass31Array6[0] = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method1399() {
		aClass31_780 = null;
		aClass31_777 = null;
		aClass31_779 = null;
		aBigInteger2 = null;
		aClass31_778 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
	public static void method1401(@OriginalArg(1) long arg0) {
		if ((long) 0 == arg0) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < Static88.anInt2367; local13++) {
			if (arg0 == Static16.aLongArray2[local13]) {
				Static88.anInt2367--;
				Static92.aBoolean81 = true;
				for (@Pc(37) int local37 = local13; local37 < Static88.anInt2367; local37++) {
					Static16.aLongArray2[local37] = Static16.aLongArray2[local37 + 1];
				}
				Static20.aClass2_Sub6_Sub1_11.method684(168);
				Static20.aClass2_Sub6_Sub1_11.method626(arg0);
				return;
			}
		}
	}
}
