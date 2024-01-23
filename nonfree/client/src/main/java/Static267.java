import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "[Lclient!me;")
	public static Class43[] aClass43Array5;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "Lclient!bi;")
	public static Class8_Sub1_Sub2 aClass8_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString190;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!b;")
	public static Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method4013() {
		if (Static293.anInt5678 == 0) {
			return;
		}
		try {
			if (++Static169.anInt3385 > 1500) {
				if (Static95.aClass92_4 != null) {
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
				}
				if (Static260.anInt5233 >= 1) {
					Static130.anInt2600 = -5;
					Static293.anInt5678 = 0;
					return;
				}
				Static293.anInt5678 = 1;
				if (Static37.anInt3863 == Static33.anInt764) {
					Static33.anInt764 = Static209.anInt4334;
				} else {
					Static33.anInt764 = Static37.anInt3863;
				}
				Static260.anInt5233++;
				Static169.anInt3385 = 0;
			}
			if (Static293.anInt5678 == 1) {
				Static39.aClass163_4 = Static199.aClass17_3.method445(aString190, Static33.anInt764);
				Static293.anInt5678 = 2;
			}
			@Pc(131) int local131;
			if (Static293.anInt5678 == 2) {
				if (Static39.aClass163_4.anInt5259 == 2) {
					throw new IOException();
				}
				if (Static39.aClass163_4.anInt5259 != 1) {
					return;
				}
				Static95.aClass92_4 = new Class92((Socket) Static39.aClass163_4.anObject7, Static199.aClass17_3);
				Static39.aClass163_4 = null;
				Static95.aClass92_4.method2178(Static66.aClass8_Sub2_Sub1_4.aByteArray24, Static66.aClass8_Sub2_Sub1_4.anInt2955);
				if (Static153.aClass111_2 != null) {
					Static153.aClass111_2.method4153();
				}
				if (Static79.aClass111_1 != null) {
					Static79.aClass111_1.method4153();
				}
				local131 = Static95.aClass92_4.method2177();
				if (Static153.aClass111_2 != null) {
					Static153.aClass111_2.method4153();
				}
				if (Static79.aClass111_1 != null) {
					Static79.aClass111_1.method4153();
				}
				if (local131 != 101) {
					Static293.anInt5678 = 0;
					Static130.anInt2600 = local131;
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
					return;
				}
				Static293.anInt5678 = 3;
			}
			if (Static293.anInt5678 == 3) {
				if (Static95.aClass92_4.method2175() < 2) {
					return;
				}
				local131 = Static95.aClass92_4.method2177() << 8 | Static95.aClass92_4.method2177();
				Static234.method3561(local131);
				if (Static11.anInt2977 == -1) {
					Static293.anInt5678 = 0;
					Static130.anInt2600 = 6;
					Static95.aClass92_4.method2176();
					Static95.aClass92_4 = null;
					return;
				}
				Static293.anInt5678 = 0;
				Static95.aClass92_4.method2176();
				Static95.aClass92_4 = null;
				Static254.method3799();
				return;
			}
		} catch (@Pc(214) IOException local214) {
			if (Static95.aClass92_4 != null) {
				Static95.aClass92_4.method2176();
				Static95.aClass92_4 = null;
			}
			if (Static260.anInt5233 < 1) {
				Static169.anInt3385 = 0;
				Static260.anInt5233++;
				if (Static33.anInt764 == Static37.anInt3863) {
					Static33.anInt764 = Static209.anInt4334;
				} else {
					Static33.anInt764 = Static37.anInt3863;
				}
				Static293.anInt5678 = 1;
			} else {
				Static293.anInt5678 = 0;
				Static130.anInt2600 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	public static void method4016() {
		if (Static68.aBoolean120) {
			return;
		}
		Static93.aBoolean139 = true;
		Static68.aBoolean120 = true;
		if (Static109.aBoolean177) {
			Static82.aFloat20 = (int) Static82.aFloat20 + 191 & 0xFFFFFF80;
		} else {
			Static60.aFloat13 += (24.0F - Static60.aFloat13) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[B)Z")
	public static boolean method4017(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class8_Sub2 local8 = new Class8_Sub2(arg0);
		@Pc(17) int local17 = local8.method2334();
		if (local17 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local8.method2334() == 1;
		if (local34) {
			Static200.method3090(local8);
		}
		Static91.method1473(local8);
		return true;
	}
}
