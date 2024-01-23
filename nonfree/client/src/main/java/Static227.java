import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!lc;")
	public static Class98 aClass98_123;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_5;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!lc;")
	public static Class98 aClass98_124;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString127 = "white:";

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!dh;")
	public static Class33 aClass33_30 = new Class33(64);

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static int anInt3978 = 0;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public static int anInt3980 = 0;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!lb;")
	public static Class97 aClass97_16 = new Class97(8);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method3210() {
		aClass98_123 = null;
		anIntArray349 = null;
		aClass97_16 = null;
		aClass98_124 = null;
		aClass4_Sub2_Sub1_Sub1_5 = null;
		aClass33_30 = null;
		aString127 = null;
		aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
	public static boolean method3211() {
		if (Static287.aBoolean169) {
			try {
				Static301.method121(Static87.aClass164_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(24) Throwable local24) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method3212() {
		Static222.aClass33_33.method839();
		Static46.aClass33_8.method839();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method3214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass43_1 != null && local7.aClass43_1.aLong44 == arg3) {
			return true;
		} else if (local7.aClass104_1 != null && local7.aClass104_1.aLong112 == arg3) {
			return true;
		} else if (local7.aClass135_1 != null && local7.aClass135_1.aLong147 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1054; local46++) {
				if (local7.aClass173Array1[local46].aLong183 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)I")
	public static int method3216(@OriginalArg(1) int arg0) {
		@Pc(7) Class73 local7 = Static112.method1925(arg0);
		@Pc(10) int local10 = local7.anInt2594;
		@Pc(13) int local13 = local7.anInt2586;
		@Pc(24) int local24 = local7.anInt2590;
		@Pc(30) int local30 = Class154.anIntArray428[local24 - local13];
		return Static221.anIntArray393[local10] >> local13 & local30;
	}
}
