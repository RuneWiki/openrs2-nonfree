import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public static int anInt5454;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public static int anInt5456;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Lclient!ak;")
	public static Class7 aClass7_219;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString183 = "glow1:";

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "[I")
	public static int[] anIntArray632 = new int[14];

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt5458 = 0;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Z")
	public static boolean aBoolean417 = true;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
	public static void method4180(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && Static257.aBooleanArray23.length > arg0) {
			Static257.aBooleanArray23[arg0] = !Static257.aBooleanArray23[arg0];
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	public static void method4182() {
		Static270.aClass1_Sub18_Sub1_3.method3130(30);
		for (@Pc(23) Class1_Sub32 local23 = (Class1_Sub32) Static67.aClass22_7.method640(); local23 != null; local23 = (Class1_Sub32) Static67.aClass22_7.method637()) {
			if (local23.anInt5663 == 0) {
				Static22.method3920(local23, true);
			}
		}
		if (Static91.aClass127_4 != null) {
			Static155.method2392(Static91.aClass127_4);
			Static91.aClass127_4 = null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IC)B")
	public static byte method4184(@OriginalArg(1) char arg0) {
		@Pc(41) byte local41;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local41 = (byte) arg0;
		} else if (arg0 == '€') {
			local41 = -128;
		} else if (arg0 == '‚') {
			local41 = -126;
		} else if (arg0 == 'ƒ') {
			local41 = -125;
		} else if (arg0 == '„') {
			local41 = -124;
		} else if (arg0 == '…') {
			local41 = -123;
		} else if (arg0 == '†') {
			local41 = -122;
		} else if (arg0 == '‡') {
			local41 = -121;
		} else if (arg0 == 'ˆ') {
			local41 = -120;
		} else if (arg0 == '‰') {
			local41 = -119;
		} else if (arg0 == 'Š') {
			local41 = -118;
		} else if (arg0 == '‹') {
			local41 = -117;
		} else if (arg0 == 'Œ') {
			local41 = -116;
		} else if (arg0 == 'Ž') {
			local41 = -114;
		} else if (arg0 == '‘') {
			local41 = -111;
		} else if (arg0 == '’') {
			local41 = -110;
		} else if (arg0 == '“') {
			local41 = -109;
		} else if (arg0 == '”') {
			local41 = -108;
		} else if (arg0 == '•') {
			local41 = -107;
		} else if (arg0 == '–') {
			local41 = -106;
		} else if (arg0 == '—') {
			local41 = -105;
		} else if (arg0 == '˜') {
			local41 = -104;
		} else if (arg0 == '™') {
			local41 = -103;
		} else if (arg0 == 'š') {
			local41 = -102;
		} else if (arg0 == '›') {
			local41 = -101;
		} else if (arg0 == 'œ') {
			local41 = -100;
		} else if (arg0 == 'ž') {
			local41 = -98;
		} else if (arg0 == 'Ÿ') {
			local41 = -97;
		} else {
			local41 = 63;
		}
		return local41;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	public static void method4185() {
		Static264.aClass31_20.method855();
	}
}
