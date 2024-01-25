import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public static int anInt8914 = 0;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_55 = new Class207(260);

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Lclient!hm;")
	public static final Class139 aClass139_6 = new Class139("RC", 1);

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "[F")
	public static final float[] aFloatArray79 = new float[4];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BI)Lclient!ir;")
	public static Class1_Sub8_Sub6 method7223(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class1_Sub8_Sub6 local14 = new Class1_Sub8_Sub6();
		@Pc(19) Class1_Sub3 local19 = new Class1_Sub3(arg0);
		local19.anInt9802 = local19.aByteArray104.length - 2;
		@Pc(30) int local30 = local19.method7945();
		@Pc(40) int local40 = local19.aByteArray104.length - local30 - 12 - 2;
		local19.anInt9802 = local40;
		@Pc(47) int local47 = local19.method7940();
		local14.anInt4276 = local19.method7945();
		local14.anInt4279 = local19.method7945();
		local14.anInt4275 = local19.method7945();
		local14.anInt4277 = local19.method7945();
		@Pc(75) int local75 = local19.method7974();
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (local75 > 0) {
			local14.aClass91Array1 = new Class91[local75];
			for (local86 = 0; local86 < local75; local86++) {
				local92 = local19.method7945();
				@Pc(99) Class91 local99 = new Class91(Static122.method2187(local92));
				local14.aClass91Array1[local86] = local99;
				while (local92-- > 0) {
					@Pc(110) int local110 = local19.method7940();
					@Pc(114) int local114 = local19.method7940();
					local99.method2269((long) local110, new Class1_Sub27(local114));
				}
			}
		}
		local19.anInt9802 = 0;
		local14.aString49 = local19.method7961();
		local14.anIntArray215 = new int[local47];
		local14.anIntArray214 = new int[local47];
		local14.aStringArray10 = new String[local47];
		local86 = 0;
		while (local40 > local19.anInt9802) {
			local92 = local19.method7945();
			if (local92 == 3) {
				local14.aStringArray10[local86] = local19.method7951().intern();
			} else if (local92 >= 100 || local92 == 21 || local92 == 38 || local92 == 39) {
				local14.anIntArray214[local86] = local19.method7974();
			} else {
				local14.anIntArray214[local86] = local19.method7940();
			}
			local14.anIntArray215[local86++] = local92;
		}
		return local14;
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(B)V")
	public static void method7225() {
		Static339.anInt6245 = 0;
		@Pc(11) int local11 = Static158.aClass1_Sub3_Sub1_2.method7967();
		@Pc(15) int local15 = Static158.aClass1_Sub3_Sub1_2.method7931();
		@Pc(26) boolean local26 = Static158.aClass1_Sub3_Sub1_2.method7938() == 1;
		@Pc(32) int local32 = Static158.aClass1_Sub3_Sub1_2.method7916();
		Static206.method3170();
		Static131.method2303(local15);
		@Pc(47) int local47 = (Static464.anInt8696 - Static158.aClass1_Sub3_Sub1_2.anInt9802) / 16;
		Static526.anIntArrayArray53 = new int[local47][4];
		@Pc(57) int local57;
		for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static526.anIntArrayArray53[local53][local57] = Static158.aClass1_Sub3_Sub1_2.method7940();
			}
		}
		Static342.anIntArray376 = new int[local47];
		Static145.aByteArrayArray5 = new byte[local47][];
		Static506.anIntArray529 = new int[local47];
		Static393.aByteArrayArray21 = new byte[local47][];
		Static505.anIntArray528 = new int[local47];
		Static408.anIntArray434 = new int[local47];
		Static380.aByteArrayArray18 = null;
		Static91.anIntArray519 = new int[local47];
		Static344.aByteArrayArray17 = new byte[local47][];
		Static578.aByteArrayArray27 = new byte[local47][];
		Static526.anIntArray550 = null;
		local47 = 0;
		for (local57 = (local32 - (Static458.anInt9736 >> 4)) / 8; local57 <= ((Static458.anInt9736 >> 4) + local32) / 8; local57++) {
			for (@Pc(134) int local134 = (local11 - (Static378.anInt6747 >> 4)) / 8; local134 <= ((Static378.anInt6747 >> 4) + local11) / 8; local134++) {
				Static91.anIntArray519[local47] = (local57 << 8) + local134;
				Static506.anIntArray529[local47] = Static141.aClass308_56.method6558("m" + local57 + "_" + local134);
				Static505.anIntArray528[local47] = Static141.aClass308_56.method6558("l" + local57 + "_" + local134);
				Static342.anIntArray376[local47] = Static141.aClass308_56.method6558("um" + local57 + "_" + local134);
				Static408.anIntArray434[local47] = Static141.aClass308_56.method6558("ul" + local57 + "_" + local134);
				local47++;
			}
		}
		Static549.method7484(local11, local32, local26, 11);
	}
}
