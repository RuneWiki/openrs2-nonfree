import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!ph;")
	public static Class138 aClass138_69;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public static int anInt4923 = -1;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public static int anInt4927 = 0;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public static int anInt4928 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZILclient!ph;I)V")
	public static void method3840(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class138 arg2) {
		Static59.anInt1191 = arg1;
		Static75.aClass138_21 = arg2;
		Static86.aBoolean123 = false;
		Static97.anInt1804 = 0;
		Static78.anInt1449 = 1;
		Static185.anInt3720 = arg0;
		Static177.anInt2083 = 10000;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method3841(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static137.aClass1_Sub14_Sub1_6.method2661(214);
		Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(arg1) + 1);
		Static137.aClass1_Sub14_Sub1_6.method2619(arg1);
		Static137.aClass1_Sub14_Sub1_6.method2610(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)[Lclient!in;")
	public static Class1_Sub1_Sub3[] method3842() {
		@Pc(4) Class1_Sub1_Sub3[] local4 = new Class1_Sub1_Sub3[Static194.anInt3940];
		for (@Pc(6) int local6 = 0; local6 < Static194.anInt3940; local6++) {
			@Pc(17) int local17 = Static255.anIntArray450[local6] * Static134.anIntArray220[local6];
			@Pc(21) byte[] local21 = Static255.aByteArrayArray15[local6];
			if (Static189.aBooleanArray41[local6]) {
				@Pc(102) byte[] local102 = Static283.aByteArrayArray16[local6];
				@Pc(105) int[] local105 = new int[local17];
				for (@Pc(107) int local107 = 0; local107 < local17; local107++) {
					local105[local107] = Static40.anIntArray59[local21[local107] & 0xFF] | (local102[local107] & 0xFF) << 24;
				}
				if (Static291.aBoolean404) {
					local4[local6] = new Class1_Sub1_Sub3_Sub1_Sub1(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local6], Static148.anIntArray242[local6], Static134.anIntArray220[local6], Static255.anIntArray450[local6], local105);
				} else {
					local4[local6] = new Class1_Sub1_Sub3_Sub2_Sub1(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local6], Static148.anIntArray242[local6], Static134.anIntArray220[local6], Static255.anIntArray450[local6], local105);
				}
			} else {
				@Pc(28) int[] local28 = new int[local17];
				for (@Pc(30) int local30 = 0; local30 < local17; local30++) {
					local28[local30] = Static40.anIntArray59[local21[local30] & 0xFF];
				}
				if (Static291.aBoolean404) {
					local4[local6] = new Class1_Sub1_Sub3_Sub1(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local6], Static148.anIntArray242[local6], Static134.anIntArray220[local6], Static255.anIntArray450[local6], local28);
				} else {
					local4[local6] = new Class1_Sub1_Sub3_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local6], Static148.anIntArray242[local6], Static134.anIntArray220[local6], Static255.anIntArray450[local6], local28);
				}
			}
		}
		Static295.method4395();
		return local4;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lclient!wm;")
	public static Class195 method3843(@OriginalArg(1) int arg0) {
		@Pc(10) Class195 local10 = (Class195) Static130.aClass169_72.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static84.aClass138_25.method3346(31, arg0);
		local10 = new Class195();
		if (local32 != null) {
			local10.method4655(arg0, new Class1_Sub14(local32));
		}
		Static130.aClass169_72.method4016(local10, (long) arg0);
		return local10;
	}
}
