import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_21;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1205 = method2452("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!r", name = "B", descriptor = "[B")
	public static final byte[] aByteArray51 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lclient!dc;")
	public static Class20 method2451(@OriginalArg(0) int arg0) {
		@Pc(3) Class20 local3 = new Class20();
		local3.anInt712 = 0;
		local3.aByteArray10 = new byte[arg0];
		return local3;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/lang/String;)Lclient!dc;")
	public static Class20 method2452(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(14) int local14 = local6.length;
		@Pc(16) int local16 = 0;
		@Pc(20) Class20 local20 = new Class20();
		local20.aByteArray10 = new byte[local14];
		while (local16 < local14) {
			@Pc(32) int local32 = local6[local16++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local14 <= local16) {
					break;
				}
				@Pc(48) int local48 = local6[local16++] & 0xFF;
				local20.aByteArray10[local20.anInt712++] = (byte) (local32 * 43 + local48 - 1720 - 48);
			} else if (local32 != 0) {
				local20.aByteArray10[local20.anInt712++] = (byte) local32;
			}
		}
		local20.method589();
		return local20.method586();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[Lclient!qi;I)V")
	public static void method2456(@OriginalArg(0) int arg0, @OriginalArg(2) Class85[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(16) int local16 = arg0 - 1;
		@Pc(22) int local22 = (arg2 + arg0) / 2;
		@Pc(26) int local26 = arg2 + 1;
		@Pc(30) Class85 local30 = arg1[local22];
		arg1[local22] = arg1[arg0];
		arg1[arg0] = local30;
		while (local26 > local16) {
			@Pc(44) boolean local44 = true;
			@Pc(47) int local47;
			@Pc(79) int local79;
			@Pc(86) int local86;
			do {
				local26--;
				for (local47 = 0; local47 < 4; local47++) {
					if (Static173.anIntArray366[local47] == 2) {
						local86 = local30.anInt3229;
						local79 = arg1[local26].anInt3229;
					} else if (Static173.anIntArray366[local47] == 1) {
						local79 = arg1[local26].anInt3228;
						local86 = local30.anInt3228;
						if (local79 == -1 && Static123.anIntArray289[local47] == 1) {
							local79 = 2001;
						}
						if (local86 == -1 && Static123.anIntArray289[local47] == 1) {
							local86 = 2001;
						}
					} else if (Static173.anIntArray366[local47] == 3) {
						local79 = arg1[local26].aBoolean142 ? 1 : 0;
						local86 = local30.aBoolean142 ? 1 : 0;
					} else {
						local79 = arg1[local26].anInt3230;
						local86 = local30.anInt3230;
					}
					if (local79 != local86) {
						if ((Static123.anIntArray289[local47] != 1 || local86 >= local79) && (Static123.anIntArray289[local47] != 0 || local86 <= local79)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			local44 = true;
			do {
				local16++;
				for (local47 = 0; local47 < 4; local47++) {
					if (Static173.anIntArray366[local47] == 2) {
						local79 = arg1[local16].anInt3229;
						local86 = local30.anInt3229;
					} else if (Static173.anIntArray366[local47] == 1) {
						local86 = local30.anInt3228;
						local79 = arg1[local16].anInt3228;
						if (local86 == -1 && Static123.anIntArray289[local47] == 1) {
							local86 = 2001;
						}
						if (local79 == -1 && Static123.anIntArray289[local47] == 1) {
							local79 = 2001;
						}
					} else if (Static173.anIntArray366[local47] == 3) {
						local86 = local30.aBoolean142 ? 1 : 0;
						local79 = arg1[local16].aBoolean142 ? 1 : 0;
					} else {
						local79 = arg1[local16].anInt3230;
						local86 = local30.anInt3230;
					}
					if (local79 != local86) {
						if ((Static123.anIntArray289[local47] != 1 || local86 <= local79) && (Static123.anIntArray289[local47] != 0 || local86 >= local79)) {
							local44 = false;
						}
						break;
					}
					if (local47 == 3) {
						local44 = false;
					}
				}
			} while (local44);
			if (local26 > local16) {
				@Pc(347) Class85 local347 = arg1[local16];
				arg1[local16] = arg1[local26];
				arg1[local26] = local347;
			}
		}
		method2456(arg0, arg1, local26);
		method2456(local26 + 1, arg1, arg2);
	}
}
