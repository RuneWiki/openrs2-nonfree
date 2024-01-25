import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!lm", name = "eb", descriptor = "Z")
	public static boolean aBoolean293;

	@OriginalMember(owner = "client!lm", name = "Y", descriptor = "Lclient!io;")
	public static final Class7_Sub3_Sub2 aClass7_Sub3_Sub2_2 = new Class7_Sub3_Sub2(5000);

	@OriginalMember(owner = "client!lm", name = "db", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_34 = new Class103(64);

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
	public static void method3442() {
		Static343.aByteArrayArrayArray14 = null;
		Static343.anIntArray830 = null;
		Static210.anIntArray575 = null;
		Static353.aByteArrayArrayArray5 = null;
		Static349.anIntArray837 = null;
		Static144.anIntArray410 = null;
		Static220.aByteArrayArrayArray9 = null;
		Static227.aByteArrayArrayArray12 = null;
		Static79.anIntArray283 = null;
		Static23.anIntArrayArrayArray15 = null;
		Static314.anIntArray757 = null;
		Static343.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
	public static void method3445() {
		for (@Pc(1) int local1 = 0; local1 < Static2.anInt9; local1++) {
			@Pc(6) Class22_Sub2 local6 = Static282.aClass22_Sub2Array3[local1];
			Static179.method3305(local6);
			Static282.aClass22_Sub2Array3[local1] = null;
		}
		Static2.anInt9 = 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method3446(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(7) String local7 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		@Pc(22) int local22 = arg0 ? 32768 : 0;
		@Pc(30) int local30 = local22 + (arg0 ? Static132.anInt2880 : Static336.anInt4181);
		for (@Pc(32) int local32 = local22; local32 < local30; local32++) {
			@Pc(37) Class7_Sub1_Sub1 local37 = Static259.method4353(local32);
			if (local37.aBoolean3 && local37.method97().toLowerCase().indexOf(local7) != -1) {
				if (local16 >= 50) {
					Static197.aShortArray62 = null;
					Static66.anInt1665 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(73) short[] local73 = new short[local14.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local16; local75++) {
						local73[local75] = local14[local75];
					}
					local14 = local73;
				}
				local14[local16++] = (short) local32;
			}
		}
		Static66.anInt1665 = local16;
		Static197.aShortArray62 = local14;
		Static11.anInt3202 = 0;
		@Pc(111) String[] local111 = new String[Static66.anInt1665];
		for (@Pc(113) int local113 = 0; local113 < Static66.anInt1665; local113++) {
			local111[local113] = Static259.method4353(local14[local113]).method97();
		}
		Static349.method5611(local111, Static197.aShortArray62);
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V")
	public static void method3447() {
		Static34.aClass89_1.method5456(((float) Static289.anInt2339 * 0.1F + 0.7F) * Static320.aFloat75);
		Static34.aClass89_1.method5462(Static42.anInt1094, Static151.aFloat45, Static287.aFloat72, (float) Static5.anInt79, (float) Static192.anInt3829, (float) Static91.anInt5971);
		Static34.aClass89_1.method5396(Static114.aClass17_2);
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)V")
	public static void method3448() {
		for (@Pc(4) Class7_Sub17 local4 = (Class7_Sub17) Static247.aClass10_40.method157(); local4 != null; local4 = (Class7_Sub17) Static247.aClass10_40.method155()) {
			@Pc(8) int local8 = local4.anInt3252;
			if (Static264.method4436(local8)) {
				@Pc(14) boolean local14 = true;
				@Pc(18) Class26[] local18 = Static298.aClass26ArrayArray1[local8];
				for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
					if (local18[local20] != null) {
						local14 = local18[local20].aBoolean36;
						break;
					}
				}
				if (!local14) {
					@Pc(46) int local46 = (int) local4.aLong232;
					@Pc(52) Class26 local52 = Static245.method4231(local46);
					if (local52 != null) {
						Static245.method4226(local52);
					}
				}
			}
		}
	}
}
