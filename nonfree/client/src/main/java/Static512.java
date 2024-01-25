import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
	public static int anInt8589;

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "Lclient!gha;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "I")
	public static int anInt8591;

	@OriginalMember(owner = "client!sea", name = "q", descriptor = "I")
	public static int anInt8594;

	@OriginalMember(owner = "client!sea", name = "l", descriptor = "[I")
	public static int[] anIntArray588 = new int[4];

	@OriginalMember(owner = "client!sea", name = "p", descriptor = "I")
	public static int anInt8593 = 0;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
	public static void method7215() {
		@Pc(8) int local8 = Static237.aByteArrayArray12.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			if (Static237.aByteArrayArray12[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static420.anInt7644; local24++) {
					if (Static407.anIntArray502[local24] == Static349.anIntArray395[local14]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static407.anIntArray502[Static420.anInt7644] = Static349.anIntArray395[local14];
					local22 = Static420.anInt7644++;
				}
				@Pc(71) Class2_Sub34 local71 = new Class2_Sub34(Static237.aByteArrayArray12[local14]);
				@Pc(73) int local73 = 0;
				while (Static237.aByteArrayArray12[local14].length > local71.anInt8188 && local73 < 511 && Static228.anInt4647 < 1023) {
					@Pc(92) int local92 = local73++ << 6 | local22;
					@Pc(96) int local96 = local71.method6884();
					@Pc(100) int local100 = local96 >> 14;
					@Pc(106) int local106 = local96 >> 7 & 0x3F;
					@Pc(110) int local110 = local96 & 0x3F;
					@Pc(123) int local123 = local106 + (Static349.anIntArray395[local14] >> 8) * 64 - Static451.anInt7933;
					@Pc(136) int local136 = local110 + (Static349.anIntArray395[local14] & 0xFF) * 64 - Static470.anInt8063;
					@Pc(143) Class236 local143 = Static341.aClass76_1.method1676(local71.method6884());
					@Pc(150) Class2_Sub51 local150 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local92);
					if (local150 == null && (local143.aByte98 & 0x1) > 0 && Static576.anInt9519 == local100 && local123 >= 0 && local123 + local143.anInt6892 < Static3.anInt46 && local136 >= 0 && Static270.anInt5194 > local143.anInt6892 + local136) {
						@Pc(191) Class11_Sub1_Sub1_Sub2_Sub2 local191 = new Class11_Sub1_Sub1_Sub2_Sub2();
						local191.anInt3246 = local92;
						@Pc(199) Class2_Sub51 local199 = new Class2_Sub51(local191);
						Static357.aClass222_23.method5476(local199, (long) local92);
						Static86.aClass2_Sub51Array1[Static225.anInt4616++] = local199;
						Static160.anIntArray256[Static228.anInt4647++] = local92;
						local191.anInt3248 = Static325.anInt5888;
						local191.method2785(local143);
						local191.method2767(local191.aClass236_1.anInt6892);
						local191.anInt3206 = local191.aClass236_1.anInt6901 << 3;
						local191.method2759(local191.aClass236_1.aByte103 + 4 << 11 & 0x3DA7, true);
						local191.method2781(local100, local123, local191.method2778(), true, local136);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method7216(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(12) String local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			local12 = local16.aString73 + " | ";
			arg0 = local16.aThrowable1;
		} else {
			local12 = "";
		}
		@Pc(33) StringWriter local33 = new StringWriter();
		@Pc(38) PrintWriter local38 = new PrintWriter(local33);
		arg0.printStackTrace(local38);
		local38.close();
		@Pc(46) String local46 = local33.toString();
		@Pc(54) BufferedReader local54 = new BufferedReader(new StringReader(local46));
		@Pc(57) String local57 = local54.readLine();
		while (true) {
			@Pc(60) String local60 = local54.readLine();
			if (local60 == null) {
				return local12 + "| " + local57;
			}
			@Pc(66) int local66 = local60.indexOf(40);
			@Pc(73) int local73 = local60.indexOf(41, local66 + 1);
			@Pc(82) String local82;
			if (local66 == -1) {
				local82 = local60;
			} else {
				local82 = local60.substring(0, local66);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local12 = local12 + local82;
			if (local66 != -1 && local73 != -1) {
				@Pc(124) int local124 = local60.indexOf(".java:", local66);
				if (local124 >= 0) {
					local12 = local12 + local60.substring(local124 + 5, local73);
				}
			}
			local12 = local12 + ' ';
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(Z)I")
	public static int method7217() {
		if ((double) Static292.aFloat212 == 3.0D) {
			return 37;
		} else if ((double) Static292.aFloat212 == 4.0D) {
			return 50;
		} else if ((double) Static292.aFloat212 == 6.0D) {
			return 75;
		} else if ((double) Static292.aFloat212 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
