import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "F")
	public static float aFloat281;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Z")
	public static boolean aBoolean870;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	public static final int anInt10388 = -1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BZZII)V")
	public static void method8533(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static387.aClass181_73.anInt5947 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg5 != -1) {
			@Pc(27) Class140 local27 = Static513.aClass49_2.method1857(arg5);
			if (local27 == null || arg2 != local27.method4349()) {
				return;
			}
			if (local27.method4349()) {
				local18 = local27.aString48;
			} else {
				local16 = local27.anInt5140;
			}
		}
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static367.aClass281_1.anInt8448; local55++) {
			@Pc(62) Class237 local62 = Static367.aClass281_1.method6975(local55);
			if ((!arg3 || local62.aBoolean629) && local62.anInt7311 == -1 && local62.anInt7309 == -1 && local62.anInt7272 == 0 && local62.aString84.toLowerCase().indexOf(local11) != -1) {
				if (arg5 != -1) {
					if (arg2) {
						if (!arg0.equals(local62.method6073(local18, arg5))) {
							continue;
						}
					} else if (arg4 != local62.method6074(arg5, local16)) {
						continue;
					}
				}
				if (local53 >= 250) {
					Static29.anInt562 = -1;
					Static179.aShortArray34 = null;
					return;
				}
				if (local14.length <= local53) {
					@Pc(143) short[] local143 = new short[local14.length * 2];
					for (@Pc(145) int local145 = 0; local145 < local53; local145++) {
						local143[local145] = local14[local145];
					}
					local14 = local143;
				}
				local14[local53++] = (short) local55;
			}
		}
		Static385.anInt10555 = 0;
		Static179.aShortArray34 = local14;
		Static29.anInt562 = local53;
		@Pc(188) String[] local188 = new String[Static29.anInt562];
		for (@Pc(190) int local190 = 0; local190 < Static29.anInt562; local190++) {
			local188[local190] = Static367.aClass281_1.method6975(local14[local190]).aString84;
		}
		Static87.method2249(local188, Static179.aShortArray34);
		Static387.aClass181_73.method5048();
		Static387.aClass181_73.anInt5947 = 2;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method8534(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(46) StringBuffer local46 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				@Pc(64) char local64 = Static335.aCharArray5[(int) (local50 - arg0 * 37L)];
				if (local64 == '_') {
					@Pc(74) int local74 = local46.length() - 1;
					local64 = ' ';
					local46.setCharAt(local74, Character.toUpperCase(local46.charAt(local74)));
				}
				local46.append(local64);
			}
			local46.reverse();
			local46.setCharAt(0, Character.toUpperCase(local46.charAt(0)));
			return local46.toString();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method8535() {
		Static631.aClass307_53.method7427();
		Static614.aClass30_13.method778();
		Static532.aClass30_11.method778();
	}
}
