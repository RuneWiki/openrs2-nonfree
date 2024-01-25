import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "I")
	public static int anInt681;

	@OriginalMember(owner = "client!bha", name = "j", descriptor = "Lclient!wm;")
	public static Class390 aClass390_6;

	@OriginalMember(owner = "client!bha", name = "o", descriptor = "[I")
	public static final int[] anIntArray34 = new int[5];

	@OriginalMember(owner = "client!bha", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method600(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class345 local8 = Static144.method2595(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray30 != null) {
			@Pc(18) Class5_Sub22 local18 = new Class5_Sub22();
			local18.anInt3432 = arg0;
			local18.aString22 = arg1;
			local18.anObjectArray1 = local8.anObjectArray30;
			local18.aClass345_1 = local8;
			Static652.method8743(local18);
		}
		if (Static173.anInt3397 != 10 || !Static84.method1822(local8).method453(arg0 - 1)) {
			return;
		}
		@Pc(64) Class5_Sub21 local64;
		if (arg0 == 1) {
			local64 = Static64.method905(Static263.aClass49_1, Static178.aClass305_29);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 2) {
			local64 = Static64.method905(Static263.aClass49_1, Static18.aClass305_76);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 3) {
			local64 = Static64.method905(Static263.aClass49_1, Static144.aClass305_25);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 4) {
			local64 = Static64.method905(Static263.aClass49_1, Static566.aClass305_89);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 5) {
			local64 = Static64.method905(Static263.aClass49_1, Static105.aClass305_19);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 6) {
			local64 = Static64.method905(Static263.aClass49_1, Static604.aClass305_97);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 7) {
			local64 = Static64.method905(Static263.aClass49_1, Static197.aClass305_32);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 8) {
			local64 = Static64.method905(Static263.aClass49_1, Static414.aClass305_63);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 9) {
			local64 = Static64.method905(Static263.aClass49_1, Static283.aClass305_42);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
		if (arg0 == 10) {
			local64 = Static64.method905(Static263.aClass49_1, Static542.aClass305_55);
			Static327.method5082(local64, local8.anInt9654, arg3, arg2);
			Static495.method7092(local64);
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method601(@OriginalArg(0) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(14) byte[] local14 = new byte[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			@Pc(21) char local21 = arg0.charAt(local16);
			if (local21 > '\u0000' && local21 < '\u0080' || !(local21 < ' ' || local21 > 'ÿ')) {
				local14[local16] = (byte) local21;
			} else if (local21 == '€') {
				local14[local16] = -128;
			} else if (local21 == '‚') {
				local14[local16] = -126;
			} else if (local21 == 'ƒ') {
				local14[local16] = -125;
			} else if (local21 == '„') {
				local14[local16] = -124;
			} else if (local21 == '…') {
				local14[local16] = -123;
			} else if (local21 == '†') {
				local14[local16] = -122;
			} else if (local21 == '‡') {
				local14[local16] = -121;
			} else if (local21 == 'ˆ') {
				local14[local16] = -120;
			} else if (local21 == '‰') {
				local14[local16] = -119;
			} else if (local21 == 'Š') {
				local14[local16] = -118;
			} else if (local21 == '‹') {
				local14[local16] = -117;
			} else if (local21 == 'Œ') {
				local14[local16] = -116;
			} else if (local21 == 'Ž') {
				local14[local16] = -114;
			} else if (local21 == '‘') {
				local14[local16] = -111;
			} else if (local21 == '’') {
				local14[local16] = -110;
			} else if (local21 == '“') {
				local14[local16] = -109;
			} else if (local21 == '”') {
				local14[local16] = -108;
			} else if (local21 == '•') {
				local14[local16] = -107;
			} else if (local21 == '–') {
				local14[local16] = -106;
			} else if (local21 == '—') {
				local14[local16] = -105;
			} else if (local21 == '˜') {
				local14[local16] = -104;
			} else if (local21 == '™') {
				local14[local16] = -103;
			} else if (local21 == 'š') {
				local14[local16] = -102;
			} else if (local21 == '›') {
				local14[local16] = -101;
			} else if (local21 == 'œ') {
				local14[local16] = -100;
			} else if (local21 == 'ž') {
				local14[local16] = -98;
			} else if (local21 == 'Ÿ') {
				local14[local16] = -97;
			} else {
				local14[local16] = 63;
			}
		}
		return local14;
	}
}
