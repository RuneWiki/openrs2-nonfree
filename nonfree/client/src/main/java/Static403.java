import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_38 = new Class94(5);

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Z")
	public static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method6327() {
		Static443.aClass5_12.method6154(Static95.aFloat69, Static461.aFloat161, Static173.aFloat75);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!fl;ILjava/lang/Object;)V")
	public static void method6329(@OriginalArg(0) Class104 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static344.method5698(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!bi;I)V")
	public static void method6330(@OriginalArg(0) Class6_Sub8_Sub1 arg0) {
		arg0.method1511();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static6.anInt462; local12++) {
			local18 = Static551.anIntArray503[local12];
			if ((Static290.aByteArray39[local18] & 0x1) == 0) {
				if (local10 > 0) {
					local10--;
					Static290.aByteArray39[local18] = (byte) (Static290.aByteArray39[local18] | 0x2);
				} else {
					local46 = arg0.method1512(1);
					if (local46 == 0) {
						local10 = Static422.method6591(arg0);
						Static290.aByteArray39[local18] = (byte) (Static290.aByteArray39[local18] | 0x2);
					} else {
						Static337.method5603(local18, arg0);
					}
				}
			}
		}
		arg0.method1509();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method1511();
		@Pc(122) int local122;
		for (local18 = 0; local18 < Static6.anInt462; local18++) {
			local46 = Static551.anIntArray503[local18];
			if ((Static290.aByteArray39[local46] & 0x1) != 0) {
				if (local10 > 0) {
					Static290.aByteArray39[local46] = (byte) (Static290.aByteArray39[local46] | 0x2);
					local10--;
				} else {
					local122 = arg0.method1512(1);
					if (local122 == 0) {
						local10 = Static422.method6591(arg0);
						Static290.aByteArray39[local46] = (byte) (Static290.aByteArray39[local46] | 0x2);
					} else {
						Static337.method5603(local46, arg0);
					}
				}
			}
		}
		arg0.method1509();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method1511();
		@Pc(198) int local198;
		for (local46 = 0; local46 < Static82.anInt2604; local46++) {
			local122 = Static450.anIntArray425[local46];
			if ((Static290.aByteArray39[local122] & 0x1) != 0) {
				if (local10 > 0) {
					Static290.aByteArray39[local122] = (byte) (Static290.aByteArray39[local122] | 0x2);
					local10--;
				} else {
					local198 = arg0.method1512(1);
					if (local198 == 0) {
						local10 = Static422.method6591(arg0);
						Static290.aByteArray39[local122] = (byte) (Static290.aByteArray39[local122] | 0x2);
					} else if (Static602.method8315(local122, arg0)) {
						Static290.aByteArray39[local122] = (byte) (Static290.aByteArray39[local122] | 0x2);
					}
				}
			}
		}
		arg0.method1509();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method1511();
		for (local122 = 0; local122 < Static82.anInt2604; local122++) {
			local198 = Static450.anIntArray425[local122];
			if ((Static290.aByteArray39[local198] & 0x1) == 0) {
				if (local10 > 0) {
					Static290.aByteArray39[local198] = (byte) (Static290.aByteArray39[local198] | 0x2);
					local10--;
				} else {
					@Pc(292) int local292 = arg0.method1512(1);
					if (local292 == 0) {
						local10 = Static422.method6591(arg0);
						Static290.aByteArray39[local198] = (byte) (Static290.aByteArray39[local198] | 0x2);
					} else if (Static602.method8315(local198, arg0)) {
						Static290.aByteArray39[local198] = (byte) (Static290.aByteArray39[local198] | 0x2);
					}
				}
			}
		}
		arg0.method1509();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static82.anInt2604 = 0;
		Static6.anInt462 = 0;
		for (local198 = 1; local198 < 2048; local198++) {
			Static290.aByteArray39[local198] = (byte) (Static290.aByteArray39[local198] >> 1);
			@Pc(371) Class9_Sub4_Sub2_Sub1_Sub2 local371 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local198];
			if (local371 == null) {
				Static450.anIntArray425[Static82.anInt2604++] = local198;
			} else {
				Static551.anIntArray503[Static6.anInt462++] = local198;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLjava/lang/String;I)I")
	public static int method6331(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = arg1.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(50) char local50 = arg1.charAt(local44);
			if (local44 == 0) {
				if (local50 == '-') {
					local26 = true;
					continue;
				}
				if (local50 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local50 >= '0' && local50 <= '9') {
				local75 = local50 - '0';
			} else if (local50 >= 'A' && local50 <= 'Z') {
				local75 = local50 - '7';
			} else if (local50 >= 'a' && local50 <= 'z') {
				local75 = local50 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local75) {
				throw new NumberFormatException();
			}
			if (local26) {
				local75 = -local75;
			}
			@Pc(122) int local122 = local39 * arg0 + local75;
			if (local122 / arg0 != local39) {
				throw new NumberFormatException();
			}
			local39 = local122;
			local37 = true;
		}
		if (!local37) {
			throw new NumberFormatException();
		}
		return local39;
	}
}
