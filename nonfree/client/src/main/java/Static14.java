import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	public static int anInt366;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!pd;")
	public static Class20 aClass20_9;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "Lclient!pd;")
	public static Class20 aClass20_10;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 aClass4_Sub2_Sub3_Sub4_1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!ja;")
	public static Class39 aClass39_247 = Static28.method504("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_248 = Static28.method504(":chalreq:");

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	public static int anInt364 = 0;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!ja;")
	private static Class39 aClass39_250 = Static28.method504("Enter your username (V password)3");

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_249 = aClass39_250;

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
	public static int anInt368 = 0;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "[J")
	public static long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
	public static int anInt371 = 0;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "Lclient!ja;")
	public static Class39 aClass39_251 = Static28.method504("sl_stars");

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Lclient!ja;")
	public static Class39 aClass39_252 = Static28.method504("<img=1>");

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "Lclient!ja;")
	public static Class39 aClass39_253 = Static28.method504("Hierhin gehen");

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "[Lclient!pe;")
	public static Class62[] aClass62Array1 = new Class62[50];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method238() {
		aClass20_9 = null;
		aLongArray2 = null;
		aClass39_252 = null;
		aClass39_250 = null;
		aClass20_10 = null;
		aClass39_249 = null;
		aClass62Array1 = null;
		aClass39_253 = null;
		aClass39_248 = null;
		aClass39_247 = null;
		aBigInteger1 = null;
		aClass39_251 = null;
		aFrame1 = null;
		aClass4_Sub2_Sub3_Sub4_1 = null;
		aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!pd;ZLclient!pd;I)Lclient!da;")
	public static Class4_Sub2_Sub4 method239(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(14) int[] local14 = arg1.method479(arg0);
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(31) byte[] local31 = arg1.method481(arg0, local14[local21]);
			if (local31 == null) {
				local7 = false;
			} else {
				@Pc(51) int local51 = local31[1] & 0xFF | (local31[0] & 0xFF) << 8;
				@Pc(59) byte[] local59 = arg2.method481(local51, 0);
				if (local59 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class4_Sub2_Sub4(arg1, arg2, arg0, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBI)I")
	public static int method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZ)V")
	public static void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static116.anInt2896 != 0 && arg1 != -1) {
			Static72.method528(Static116.anInt2896, Static47.aClass20_Sub1_8, 0, arg1);
			Static50.aBoolean69 = true;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
	public static byte[] method244(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static87.method1642(local18) : local18;
		} else if (arg0 instanceof Class58) {
			@Pc(32) Class58 local32 = (Class58) arg0;
			return local32.method1648();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
