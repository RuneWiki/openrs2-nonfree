import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "gb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!a", name = "mb", descriptor = "I")
	public static int anInt47;

	@OriginalMember(owner = "client!a", name = "hb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_54 = Static69.method1153("Chat panel redrawn");

	@OriginalMember(owner = "client!a", name = "ib", descriptor = "Lclient!rd;")
	public static Class64 aClass64_55 = Static69.method1153("headicons_pk");

	@OriginalMember(owner = "client!a", name = "jb", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!a", name = "kb", descriptor = "I")
	public static int anInt45 = 2;

	@OriginalMember(owner = "client!a", name = "lb", descriptor = "I")
	public static int anInt46 = 0;

	@OriginalMember(owner = "client!a", name = "nb", descriptor = "[I")
	public static int[] anIntArray9 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!a", name = "ob", descriptor = "Lclient!rd;")
	public static Class64 aClass64_56 = Static69.method1153("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
	public static boolean method35(@OriginalArg(1) int arg0) {
		if (Static62.aBooleanArray8[arg0]) {
			return true;
		} else if (Static25.aClass41_74.method1053(arg0)) {
			@Pc(23) int local23 = Static25.aClass41_74.method1068(arg0);
			if (local23 == 0) {
				Static62.aBooleanArray8[arg0] = true;
				return true;
			}
			if (Static65.aClass1_Sub1_Sub11ArrayArray1[arg0] == null) {
				Static65.aClass1_Sub1_Sub11ArrayArray1[arg0] = new Class1_Sub1_Sub11[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static65.aClass1_Sub1_Sub11ArrayArray1[arg0][local42] == null) {
					@Pc(56) byte[] local56 = Static25.aClass41_74.method1062(arg0, local42);
					if (local56 != null) {
						Static65.aClass1_Sub1_Sub11ArrayArray1[arg0][local42] = new Class1_Sub1_Sub11();
						Static65.aClass1_Sub1_Sub11ArrayArray1[arg0][local42].anInt1717 = (arg0 << 16) + local42;
						if (local56[0] == -1) {
							Static65.aClass1_Sub1_Sub11ArrayArray1[arg0][local42].method1228(new Class1_Sub6(local56));
						} else {
							Static65.aClass1_Sub1_Sub11ArrayArray1[arg0][local42].method1237(new Class1_Sub6(local56));
						}
					}
				}
			}
			Static62.aBooleanArray8[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lclient!rd;")
	public static Class64 method36(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static12.method1395(arg0);
		} else if (arg0 < 10000000) {
			return Static82.method1383(new Class64[] { Static12.method1395(arg0 / 1000), Static28.aClass64_1531 });
		} else {
			return Static82.method1383(new Class64[] { Static12.method1395(arg0 / 1000000), Static3.aClass64_106 });
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(II)Z")
	public static boolean method38(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	public static void method39() {
		aClass64_54 = null;
		aClass64_55 = null;
		anIntArray9 = null;
		aClass64_56 = null;
		Class1_Sub1_Sub1.anIntArray8 = null;
		aByteArrayArrayArray1 = null;
	}
}
