import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)I")
	public static int method4916(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(26) char local26 = 0;
		@Pc(28) char local28 = 0;
		while (local13 - local26 < local8 || local11 > local15 - local28) {
			if (local13 - local26 >= local8) {
				return -1;
			}
			if (local15 - local28 >= local11) {
				return 1;
			}
			@Pc(71) char local71;
			if (local26 == '\u0000') {
				local71 = arg1.charAt(local13++);
			} else {
				local71 = local26;
			}
			@Pc(81) char local81;
			if (local28 == '\u0000') {
				local81 = arg2.charAt(local15++);
			} else {
				local81 = local28;
			}
			local26 = Static53.method742(local71);
			local28 = Static53.method742(local81);
			local71 = Static108.method1678(arg0, local71);
			local81 = Static108.method1678(arg0, local81);
			if (local81 != local71 && Character.toUpperCase(local71) != Character.toUpperCase(local81)) {
				local71 = Character.toLowerCase(local71);
				local81 = Character.toLowerCase(local81);
				if (local81 != local71) {
					return Static60.method883(local71, arg0) - Static60.method883(local81, arg0);
				}
			}
		}
		@Pc(149) int local149 = Math.min(local8, local11);
		for (@Pc(151) int local151 = 0; local151 < local149; local151++) {
			if (arg0 == 2) {
				local13 = local8 - local151 - 1;
				local15 = local11 - local151 - 1;
			} else {
				local15 = local151;
				local13 = local151;
			}
			@Pc(180) char local180 = arg1.charAt(local13);
			@Pc(184) char local184 = arg2.charAt(local15);
			if (local184 != local180 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local184 != local180) {
					return Static60.method883(local180, arg0) - Static60.method883(local184, arg0);
				}
			}
		}
		@Pc(233) int local233 = local8 - local11;
		if (local233 != 0) {
			return local233;
		}
		for (@Pc(239) int local239 = 0; local239 < local149; local239++) {
			@Pc(245) char local245 = arg1.charAt(local239);
			@Pc(249) char local249 = arg2.charAt(local239);
			if (local249 != local245) {
				return Static60.method883(local245, arg0) - Static60.method883(local249, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Lclient!ja;")
	public static Class21_Sub4 method4919() {
		@Pc(13) Class21_Sub4 local13 = (Class21_Sub4) Static444.aClass93_7.method2076();
		if (local13 == null) {
			return new Class21_Sub4();
		} else {
			Static234.anInt3750--;
			return local13;
		}
	}
}
