import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1047 = Static120.method2057("cross");

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1048 = Static120.method2057("null");

	@OriginalMember(owner = "client!qd", name = "V", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1049 = Static120.method2057("hel");

	@OriginalMember(owner = "client!qd", name = "eb", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array16 = new Class81[100];

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "I")
	public static int anInt2921 = 0;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)Lclient!bh;")
	public static Class1_Sub2_Sub3 method2281() {
		if (Static135.aClass1_Sub2_Sub3_2 == null) {
			Static135.aClass1_Sub2_Sub3_2 = new Class1_Sub2_Sub3();
		}
		return Static135.aClass1_Sub2_Sub3_2;
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	public static void method2282() {
		aClass81Array16 = null;
		aClass81_1047 = null;
		aClass81_1048 = null;
		aClass81_1049 = null;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IB)I")
	public static int method2283(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)V")
	public static void method2284(@OriginalArg(1) int arg0) {
		if (!Static144.method2427(arg0)) {
			return;
		}
		@Pc(14) Class77[] local14 = Static131.aClass77ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class77 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt3216 = 0;
				local22.anInt3246 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4 method2285() {
		@Pc(3) Class1_Sub2_Sub2_Sub4 local3 = new Class1_Sub2_Sub2_Sub4();
		local3.anInt3358 = Static73.anIntArray155[0];
		local3.anInt3362 = Static155.anIntArray369[0];
		local3.anInt3363 = Static25.anIntArray37[0];
		local3.anIntArray356 = Static73.anIntArray156;
		local3.anInt3360 = Static97.anInt2130;
		local3.aByteArray24 = Static178.aByteArrayArray10[0];
		local3.anInt3361 = Static161.anIntArray386[0];
		local3.anInt3359 = Static23.anInt582;
		Static176.method3057();
		return local3;
	}

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V")
	public static void method2286() {
		for (@Pc(12) Class1_Sub4 local12 = (Class1_Sub4) Static119.aClass5_8.method140(); local12 != null; local12 = (Class1_Sub4) Static119.aClass5_8.method132()) {
			@Pc(17) int local17 = local12.anInt155;
			if (Static144.method2427(local17)) {
				@Pc(23) boolean local23 = true;
				@Pc(27) Class77[] local27 = Static131.aClass77ArrayArray1[local17];
				for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
					if (local27[local29] != null) {
						local23 = local27[local29].aBoolean138;
						break;
					}
				}
				if (!local23) {
					@Pc(57) int local57 = (int) local12.aLong148;
					@Pc(61) Class77 local61 = Static41.method800(local57);
					if (local61 != null) {
						Static51.method913(local61);
					}
				}
			}
		}
	}
}
