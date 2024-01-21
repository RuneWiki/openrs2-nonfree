import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
	public static int anInt1535;

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_9;

	@OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lclient!gd;")
	public static Class27 aClass27_21;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "[I")
	public static int[] anIntArray188 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "Lclient!na;")
	public static Class53 aClass53_685 = Static109.method1737("Select a world");

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_686 = Static109.method1737("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "Lclient!na;")
	public static Class53 aClass53_687 = Static109.method1737("m");

	@OriginalMember(owner = "client!ka", name = "Y", descriptor = "Lclient!na;")
	public static Class53 aClass53_688 = Static109.method1737("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "Lclient!na;")
	public static Class53 aClass53_689 = Static109.method1737(":0");

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	public static void method1061() {
		aClass53_688 = null;
		aClass53_689 = null;
		aClass53_685 = null;
		aClass53_687 = null;
		aClass53_686 = null;
		aClass27_21 = null;
		anIntArray188 = null;
		aClass62_Sub1_9 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Lclient!o;")
	public static Class3_Sub1_Sub10 method1062(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub10 local10 = (Class3_Sub1_Sub10) Static25.aClass75_20.method1728((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static78.aClass62_15.method1512(14, arg0);
		local10 = new Class3_Sub1_Sub10();
		if (local25 != null) {
			local10.method1412(new Class3_Sub7(local25));
		}
		Static25.aClass75_20.method1730(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIIZLclient!q;Z)V")
	public static void method1063(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class62_Sub1 arg5) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg2);
		@Pc(16) Class3_Sub1_Sub12 local16 = (Class3_Sub1_Sub12) Static4.aClass77_1.method1805(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub12) Static42.aClass77_5.method1805(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub1_Sub12) Static56.aClass77_7.method1805(local10);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Class3_Sub1_Sub12) Static18.aClass77_2.method1805(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub1_Sub12();
			local16.aByte3 = arg0;
			local16.aClass62_Sub1_14 = arg5;
			local16.anInt2378 = arg3;
			if (arg4) {
				Static4.aClass77_1.method1810(local16, local10);
				Static2.anInt63++;
			} else {
				Static35.aClass41_1.method1072(local16);
				Static56.aClass77_7.method1810(local16, local10);
				Static51.anInt1331++;
			}
		} else if (arg4) {
			local16.method1956();
			Static4.aClass77_1.method1810(local16, local10);
			Static2.anInt63++;
			Static51.anInt1331--;
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
	public static void method1064() {
		if (Static15.anInt335 == 2) {
			Static19.method1698(Static38.anInt1139 * 2, (Static73.anInt1833 - Static4.anInt145 << 7) + Static23.anInt738, (-Static80.anInt2029 + Static119.anInt432 << 7) + Static18.anInt471);
			if (Static96.anInt1433 > -1 && Static27.anInt843 % 20 < 10) {
				Static45.aClass3_Sub1_Sub5_Sub4Array8[0].method1347(Static96.anInt1433 - 12, Static108.anInt2484 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)I")
	public static int method1065(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local10 += 2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return local10 + arg0;
	}
}
