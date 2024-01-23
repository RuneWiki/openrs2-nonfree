import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!le;")
	public static Class8_Sub2_Sub1 aClass8_Sub2_Sub1_6 = new Class8_Sub2_Sub1(5000);

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	public static int anInt5409 = 255;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V")
	public static void method4080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static253.anInt4996 <= arg2 - arg0 && Static52.anInt1146 >= arg0 + arg2 && arg3 - arg0 >= Static228.anInt4643 && Static244.anInt4872 >= arg3 + arg0) {
			Static216.method3392(arg0, arg3, arg4, arg5, arg2, arg1);
		} else {
			Static253.method3793(arg2, arg1, arg4, arg3, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI[BIILjava/lang/String;)I")
	public static int method4082(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		@Pc(6) int local6 = arg2;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(17) char local17 = arg3.charAt(local8);
			if (local17 > '\u0000' && local17 < '\u0080' || !(local17 < ' ' || local17 > 'ÿ')) {
				arg1[arg0 + local8] = (byte) local17;
			} else if (local17 == '€') {
				arg1[local8 + arg0] = -128;
			} else if (local17 == '‚') {
				arg1[local8 + arg0] = -126;
			} else if (local17 == 'ƒ') {
				arg1[arg0 + local8] = -125;
			} else if (local17 == '„') {
				arg1[arg0 + local8] = -124;
			} else if (local17 == '…') {
				arg1[arg0 + local8] = -123;
			} else if (local17 == '†') {
				arg1[arg0 + local8] = -122;
			} else if (local17 == '‡') {
				arg1[arg0 + local8] = -121;
			} else if (local17 == 'ˆ') {
				arg1[local8 + arg0] = -120;
			} else if (local17 == '‰') {
				arg1[local8 + arg0] = -119;
			} else if (local17 == 'Š') {
				arg1[arg0 + local8] = -118;
			} else if (local17 == '‹') {
				arg1[arg0 + local8] = -117;
			} else if (local17 == 'Œ') {
				arg1[arg0 + local8] = -116;
			} else if (local17 == 'Ž') {
				arg1[arg0 + local8] = -114;
			} else if (local17 == '‘') {
				arg1[arg0 + local8] = -111;
			} else if (local17 == '’') {
				arg1[local8 + arg0] = -110;
			} else if (local17 == '“') {
				arg1[local8 + arg0] = -109;
			} else if (local17 == '”') {
				arg1[local8 + arg0] = -108;
			} else if (local17 == '•') {
				arg1[arg0 + local8] = -107;
			} else if (local17 == '–') {
				arg1[arg0 + local8] = -106;
			} else if (local17 == '—') {
				arg1[arg0 + local8] = -105;
			} else if (local17 == '˜') {
				arg1[local8 + arg0] = -104;
			} else if (local17 == '™') {
				arg1[arg0 + local8] = -103;
			} else if (local17 == 'š') {
				arg1[local8 + arg0] = -102;
			} else if (local17 == '›') {
				arg1[arg0 + local8] = -101;
			} else if (local17 == 'œ') {
				arg1[local8 + arg0] = -100;
			} else if (local17 == 'ž') {
				arg1[arg0 + local8] = -98;
			} else if (local17 == 'Ÿ') {
				arg1[local8 + arg0] = -97;
			} else {
				arg1[arg0 + local8] = 63;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!pk;B)V")
	public static void method4083(@OriginalArg(0) Class132 arg0) {
		Static211.aClass132_74 = arg0;
		Static211.anInt4341 = Static211.aClass132_74.method3189(4);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	public static void method4084(@OriginalArg(0) int arg0) {
		Static299.anInt5728 = arg0;
		Static88.method1439(3);
		Static88.method1439(4);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
	public static void method4085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class8_Sub1_Sub6 local15 = Static181.method2779(5, arg0);
		local15.method931();
		local15.anInt1284 = arg1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!pk;BI)[Lclient!wd;")
	public static Class8_Sub1_Sub7[] method4086(@OriginalArg(1) Class132 arg0, @OriginalArg(3) int arg1) {
		return Static247.method4168(arg0, 0, arg1) ? Static24.method426() : null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	public static void method4087() {
		if (Static192.aBoolean316) {
			return;
		}
		Static192.aBoolean316 = true;
		Static93.aBoolean139 = true;
		if (Static109.aBoolean177) {
			Static201.aFloat36 = (int) Static201.aFloat36 + 47 & 0xFFFFFFF0;
		} else {
			Static228.aFloat48 += (12.0F - Static228.aFloat48) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Component;IIB)Lclient!ui;")
	public static Class4 method4088(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(13) Class local13 = Class.forName("Class4_Sub2");
			@Pc(17) Class4 local17 = (Class4) local13.getDeclaredConstructor().newInstance();
			local17.method3759(arg0, arg1, arg2);
			return local17;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class4_Sub1 local30 = new Class4_Sub1();
			local30.method3759(arg0, arg1, arg2);
			return local30;
		}
	}
}
