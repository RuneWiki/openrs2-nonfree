import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "Lclient!hn;")
	public static Class108 aClass108_2;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "Lclient!ad;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "Ljava/lang/Object;")
	public static Object anObject10;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
	public static int anInt4190;

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!jt", name = "C", descriptor = "Lclient!ec;")
	public static Class68 aClass68_8 = null;

	@OriginalMember(owner = "client!jt", name = "D", descriptor = "Z")
	public static boolean aBoolean261 = true;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)I")
	public static int method3239(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!ia;ILclient!nv;I)V")
	public static void method3240(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(2) Class183 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub13 local7 = new Class1_Sub13();
		local7.anInt2345 = arg0.method1171();
		local7.anInt2343 = arg0.method1188();
		local7.aClass157Array1 = new Class157[local7.anInt2345];
		local7.anIntArray261 = new int[local7.anInt2345];
		local7.aClass157Array2 = new Class157[local7.anInt2345];
		local7.aByteArrayArrayArray13 = new byte[local7.anInt2345][][];
		local7.anIntArray260 = new int[local7.anInt2345];
		local7.anIntArray262 = new int[local7.anInt2345];
		for (@Pc(51) int local51 = 0; local51 < local7.anInt2345; local51++) {
			try {
				@Pc(56) int local56 = arg0.method1171();
				@Pc(75) String local75;
				@Pc(79) String local79;
				@Pc(81) int local81;
				if (local56 == 0 || local56 == 1 || local56 == 2) {
					local75 = arg0.method1201();
					local79 = arg0.method1201();
					local81 = 0;
					if (local56 == 1) {
						local81 = arg0.method1188();
					}
					local7.anIntArray261[local51] = local56;
					local7.anIntArray260[local51] = local81;
					local7.aClass157Array2[local51] = arg1.method4147(Static460.method4436(local75), local79);
				} else if (local56 == 3 || local56 == 4) {
					local75 = arg0.method1201();
					local79 = arg0.method1201();
					local81 = arg0.method1171();
					@Pc(135) String[] local135 = new String[local81];
					for (@Pc(137) int local137 = 0; local137 < local81; local137++) {
						local135[local137] = arg0.method1201();
					}
					@Pc(155) byte[][] local155 = new byte[local81][];
					@Pc(165) int local165;
					if (local56 == 3) {
						for (@Pc(160) int local160 = 0; local160 < local81; local160++) {
							local165 = arg0.method1188();
							local155[local160] = new byte[local165];
							arg0.method1173(local155[local160], local165);
						}
					}
					local7.anIntArray261[local51] = local56;
					@Pc(196) Class[] local196 = new Class[local81];
					for (local165 = 0; local165 < local81; local165++) {
						local196[local165] = Static460.method4436(local135[local165]);
					}
					local7.aClass157Array1[local51] = arg1.method4143(local196, local79, Static460.method4436(local75));
					local7.aByteArrayArrayArray13[local51] = local155;
				}
			} catch (@Pc(230) ClassNotFoundException local230) {
				local7.anIntArray262[local51] = -1;
			} catch (@Pc(237) SecurityException local237) {
				local7.anIntArray262[local51] = -2;
			} catch (@Pc(244) NullPointerException local244) {
				local7.anIntArray262[local51] = -3;
			} catch (@Pc(251) Exception local251) {
				local7.anIntArray262[local51] = -4;
			} catch (@Pc(258) Throwable local258) {
				local7.anIntArray262[local51] = -5;
			}
		}
		Static277.aClass203_41.method4551(local7);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)Z")
	public static boolean method3241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
	public static void method3242() {
		@Pc(9) Class91 local9 = Static429.aClass91_97;
		synchronized (Static429.aClass91_97) {
			Static429.aClass91_97.method1993();
		}
	}
}
