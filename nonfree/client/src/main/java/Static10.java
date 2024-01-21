import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_8;

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_9;

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
	public static int anInt485;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "Lclient!id;")
	private static Class34 aClass34_241 = Static9.method266("purple:");

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_238 = aClass34_241;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_239 = Static9.method266(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
	public static int anInt470 = 0;

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "Lclient!qd;")
	public static Class63 aClass63_4 = new Class63(500);

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "Lclient!id;")
	public static Class34 aClass34_240 = Static9.method266("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!bd", name = "P", descriptor = "Lclient!id;")
	private static Class34 aClass34_244 = Static9.method266("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "Lclient!id;")
	public static Class34 aClass34_242 = aClass34_244;

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "Lclient!id;")
	private static Class34 aClass34_243 = Static9.method266("Error loading your profile)3");

	@OriginalMember(owner = "client!bd", name = "R", descriptor = "Lclient!id;")
	public static Class34 aClass34_245 = aClass34_243;

	@OriginalMember(owner = "client!bd", name = "U", descriptor = "Lclient!id;")
	public static Class34 aClass34_246 = aClass34_241;

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "Lclient!id;")
	public static Class34 aClass34_247 = Static9.method266("(U3");

	@OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
	public static int anInt486 = 0;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method274() {
		@Pc(9) int local9 = Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method838(Static22.aClass34_382);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static71.anInt1876; local11++) {
			local19 = Static90.aClass1_Sub1_Sub2_Sub3_Sub1_7.method838(Static15.method360(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		Static15.anInt605 = Static71.anInt1876 * 15 + 22;
		local19 = Static71.anInt1876 * 15 + 21;
		Static115.aBoolean158 = true;
		local9 += 8;
		Static2.anInt274 = local9;
		@Pc(56) int local56 = Static119.anInt2832 - local9 / 2;
		if (local56 + local9 > 765) {
			local56 = 765 - local9;
		}
		if (local56 < 0) {
			local56 = 0;
		}
		Static88.anInt2288 = local56;
		@Pc(79) int local79 = Static118.anInt2830;
		if (local79 + local19 > 503) {
			local79 = 503 - local19;
		}
		if (local79 < 0) {
			local79 = 0;
		}
		Static58.anInt1621 = local79;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	public static int method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class1_Sub7 local6 = (Class1_Sub7) Static14.aClass48_2.method1340((long) arg0);
		if (local6 == null) {
			return -1;
		} else if (arg1 >= 0 && local6.anIntArray79.length > arg1) {
			return local6.anIntArray79[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	public static void method276() {
		aClass34_243 = null;
		aClass34_238 = null;
		aClass34_247 = null;
		aClass34_245 = null;
		aClass34_240 = null;
		aClass34_241 = null;
		aClass34_244 = null;
		aClass35_Sub1_9 = null;
		aClass34_242 = null;
		aClass34_246 = null;
		aClass63_4 = null;
		aClass34_239 = null;
		aClass35_Sub1_8 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method277(@OriginalArg(1) Class1_Sub9 arg0) {
		if (arg0.anInt1051 == Static32.anInt1396) {
			Static12.aBooleanArray3[arg0.anInt1061] = true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZII)I")
	public static int method278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg1);
		return Static23.aClass1_Sub1_Sub9_1 != null && local11 == Static23.aClass1_Sub1_Sub9_1.aLong162 ? Static89.aClass1_Sub19_4.anInt3111 * 99 / (Static89.aClass1_Sub19_4.aByteArray42.length - Static23.aClass1_Sub1_Sub9_1.aByte8) + 1 : 0;
	}
}
