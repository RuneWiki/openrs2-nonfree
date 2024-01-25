import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	public static int anInt2105 = 16777215;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_27 = new Class243(50, 16);

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_27 = new Class231(10);

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_8 = new Class91(8, -1);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!lba;II)Lclient!mg;")
	public static Class187 method2070(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class187 local7;
		if (Static387.aClass187_2 == null) {
			local7 = new Class187();
		} else {
			local7 = Static387.aClass187_2;
			Static387.aClass187_2 = Static387.aClass187_2.aClass187_1;
			local7.aClass187_1 = null;
			Static132.anInt2533--;
		}
		local7.aClass1_Sub1_1 = arg0;
		local7.anInt5462 = arg1;
		return local7;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
	public static void method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass1_Sub4_1 != null) {
			local7.aClass1_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
	public static void method2072() {
		@Pc(10) Class231 local10 = Static291.aClass231_45;
		synchronized (Static291.aClass231_45) {
			Static291.aClass231_45.method6240();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!jda;)V")
	public static void method2073(@OriginalArg(0) int arg0, @OriginalArg(2) Class142 arg1) {
		if (Static491.aBoolean575) {
			arg0 = 0;
			Static491.aBoolean575 = false;
		}
		if (Static509.aClass142_2 != null && Static509.aClass142_2.method3487(arg1)) {
			return;
		}
		Static509.aClass142_2 = arg1;
		Static42.aLong19 = Static143.method2502();
		Static311.anInt5649 = arg0;
		Static99.anInt1977 = arg0;
		if (Static99.anInt1977 != 0) {
			Static304.anInt5564 = Static437.anInt7977;
			Static149.anInt2729 = Static169.anInt3087;
			Static203.anInt3665 = Static81.anInt1667;
			Static147.aFloat48 = Static145.aFloat47;
			Static81.aFloat27 = Static174.aFloat61;
			Static12.aClass58_1 = Static16.aClass58_2;
			Static395.aFloat204 = Static396.aFloat205;
			Class1_Sub1_Sub4.lb = Static312.aFloat106;
			Static534.aFloat222 = Static244.aFloat77;
			Static474.aFloat218 = Static337.aFloat128;
			return;
		}
		Static494.method7274();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[B)Lclient!ln;")
	public static Class2_Sub13_Sub11 method2074(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub13_Sub11 local9 = new Class2_Sub13_Sub11();
		@Pc(14) Class2_Sub29 local14 = new Class2_Sub29(arg0);
		local14.anInt6132 = local14.aByteArray96.length - 2;
		@Pc(25) int local25 = local14.method5229();
		@Pc(35) int local35 = local14.aByteArray96.length - local25 - 12 - 2;
		local14.anInt6132 = local35;
		@Pc(42) int local42 = local14.method5198();
		local9.anInt5175 = local14.method5229();
		local9.anInt5172 = local14.method5229();
		local9.anInt5174 = local14.method5229();
		local9.anInt5176 = local14.method5229();
		@Pc(68) int local68 = local14.method5170();
		@Pc(79) int local79;
		@Pc(85) int local85;
		if (local68 > 0) {
			local9.aClass127Array1 = new Class127[local68];
			for (local79 = 0; local79 < local68; local79++) {
				local85 = local14.method5229();
				@Pc(92) Class127 local92 = new Class127(Static131.method2413(local85));
				local9.aClass127Array1[local79] = local92;
				while (local85-- > 0) {
					@Pc(103) int local103 = local14.method5198();
					@Pc(107) int local107 = local14.method5198();
					local92.method3213(new Class2_Sub32(local107), (long) local103);
				}
			}
		}
		local14.anInt6132 = 0;
		local9.aString112 = local14.method5205();
		local9.anIntArray455 = new int[local42];
		local9.aStringArray28 = new String[local42];
		local9.anIntArray456 = new int[local42];
		local79 = 0;
		while (local14.anInt6132 < local35) {
			local85 = local14.method5229();
			if (local85 == 3) {
				local9.aStringArray28[local79] = local14.method5194().intern();
			} else if (local85 >= 100 || local85 == 21 || local85 == 38 || local85 == 39) {
				local9.anIntArray455[local79] = local14.method5170();
			} else {
				local9.anIntArray455[local79] = local14.method5198();
			}
			local9.anIntArray456[local79++] = local85;
		}
		return local9;
	}
}
