import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!sb;")
	public static Class25 aClass25_22;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
	public static final int anInt346 = 3353893;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!ad;")
	public static Class4 aClass4_187 = Static75.method1216("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!bb;")
	public static Class8 aClass8_6 = new Class8(64);

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_188 = Static75.method1216(":  ");

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!ad;")
	private static Class4 aClass4_189 = Static75.method1216("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
	public static int anInt350 = 0;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_190 = aClass4_189;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_191 = Static75.method1216(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "[I")
	public static int[] anIntArray15 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method216(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static68.anInt1660 > 0) {
			local16 = Static113.aByteArrayArray10[--Static68.anInt1660];
			Static113.aByteArrayArray10[Static68.anInt1660] = null;
			return local16;
		} else if (arg0 == 5000 && Static29.anInt908 > 0) {
			local16 = Static56.aByteArrayArray5[--Static29.anInt908];
			Static56.aByteArrayArray5[Static29.anInt908] = null;
			return local16;
		} else if (arg0 == 30000 && Static74.anInt1768 > 0) {
			local16 = Static104.aByteArrayArray8[--Static74.anInt1768];
			Static104.aByteArrayArray8[Static74.anInt1768] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 method217() {
		@Pc(9) Class3_Sub1_Sub4_Sub2 local9 = new Class3_Sub1_Sub4_Sub2();
		local9.anInt2576 = Static77.anInt1836;
		local9.anInt2574 = Static5.anInt256;
		local9.anInt2577 = Static55.anIntArray188[0];
		local9.anInt2575 = Static34.anIntArray96[0];
		local9.anInt2573 = Static15.anIntArray31[0];
		local9.anInt2578 = Static39.anIntArray112[0];
		@Pc(41) int local41 = local9.anInt2573 * local9.anInt2578;
		@Pc(45) byte[] local45 = Static16.aByteArrayArray2[0];
		local9.anIntArray325 = new int[local41];
		for (@Pc(51) int local51 = 0; local51 < local41; local51++) {
			local9.anIntArray325[local51] = Static42.anIntArray156[local45[local51] & 0xFF];
		}
		Static21.method297();
		return local9;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method218(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static100.aClass60_1);
		arg0.removeMouseMotionListener(Static100.aClass60_1);
		arg0.removeFocusListener(Static100.aClass60_1);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIZLclient!tb;B)V")
	public static void method219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class64_Sub1 arg4, @OriginalArg(6) byte arg5) {
		@Pc(10) long local10 = (long) (arg1 + (arg2 << 16));
		@Pc(18) Class3_Sub1_Sub16 local18 = (Class3_Sub1_Sub16) Static55.aClass34_5.method797(local10);
		if (local18 != null) {
			return;
		}
		local18 = (Class3_Sub1_Sub16) Static39.aClass34_4.method797(local10);
		if (local18 != null) {
			return;
		}
		local18 = (Class3_Sub1_Sub16) Static92.aClass34_6.method797(local10);
		if (local18 == null) {
			if (!arg3) {
				local18 = (Class3_Sub1_Sub16) Static28.aClass34_3.method797(local10);
				if (local18 != null) {
					return;
				}
			}
			local18 = new Class3_Sub1_Sub16();
			local18.aClass64_Sub1_19 = arg4;
			local18.aByte2 = arg5;
			local18.anInt2232 = arg0;
			if (arg3) {
				Static55.aClass34_5.method792(local10, local18);
				Static106.anInt2654++;
			} else {
				Static51.aClass56_2.method1193(local18);
				Static92.aClass34_6.method792(local10, local18);
				Static9.anInt317++;
			}
		} else if (arg3) {
			local18.method1909();
			Static55.aClass34_5.method792(local10, local18);
			Static9.anInt317--;
			Static106.anInt2654++;
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method220() {
		aLongArray6 = null;
		aClass4_188 = null;
		aClass8_6 = null;
		aClass4_190 = null;
		aClass4_191 = null;
		anIntArray15 = null;
		aClass4_189 = null;
		aClass25_22 = null;
		aClass4_187 = null;
	}
}
