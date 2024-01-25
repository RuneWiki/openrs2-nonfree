import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Lclient!ma;")
	public static Class213 aClass213_2;

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "[I")
	public static int[] anIntArray535;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "I")
	public static int anInt9982;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Z")
	public static boolean aBoolean704 = true;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_228 = new Class362(29, -1);

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!cr;B)I")
	public static int method8145(@OriginalArg(0) Class54 arg0) {
		if (Static538.aClass54_7 == arg0) {
			return 9216;
		} else if (Static266.aClass54_5 == arg0) {
			return 34065;
		} else if (Static87.aClass54_2 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIILclient!hu;)Lclient!ht;")
	public static Class4_Sub5_Sub7 method8147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class147 arg2) {
		@Pc(10) int local10 = arg2.anInt3824 | arg0 << 10;
		@Pc(21) Class4_Sub5_Sub7 local21 = (Class4_Sub5_Sub7) Static223.aClass245_2.method5976((long) local10 << 16);
		if (local21 != null) {
			return local21;
		}
		@Pc(35) byte[] local35 = Static536.aClass176_128.method4005(Static536.aClass176_128.method3978(local10));
		if (local35 == null) {
			local10 = arg1 + 65536 << 10 | arg2.anInt3824;
			local21 = (Class4_Sub5_Sub7) Static223.aClass245_2.method5976((long) local10 << 16);
			if (local21 != null) {
				return local21;
			}
			local35 = Static536.aClass176_128.method4005(Static536.aClass176_128.method3978(local10));
			if (local35 == null) {
				local10 = arg2.anInt3824 | 0x3FFFC00;
				local21 = (Class4_Sub5_Sub7) Static223.aClass245_2.method5976((long) local10 << 16);
				if (local21 != null) {
					return local21;
				}
				local35 = Static536.aClass176_128.method4005(Static536.aClass176_128.method3978(local10));
				if (local35 == null) {
					return null;
				} else if (local35.length <= 1) {
					return null;
				} else {
					try {
						local21 = Static520.method7608(local35);
					} catch (@Pc(203) Exception local203) {
						throw new RuntimeException(local203.getMessage() + " S: " + local10);
					}
					local21.aClass147_7 = arg2;
					Static223.aClass245_2.method5975(local21, (long) local10 << 16);
					return local21;
				}
			} else if (local35.length <= 1) {
				return null;
			} else {
				try {
					local21 = Static520.method7608(local35);
				} catch (@Pc(131) Exception local131) {
					throw new RuntimeException(local131.getMessage() + " S: " + local10);
				}
				local21.aClass147_7 = arg2;
				Static223.aClass245_2.method5975(local21, (long) local10 << 16);
				return local21;
			}
		} else if (local35.length <= 1) {
			return null;
		} else {
			try {
				local21 = Static520.method7608(local35);
			} catch (@Pc(49) Exception local49) {
				throw new RuntimeException(local49.getMessage() + " S: " + local10);
			}
			local21.aClass147_7 = arg2;
			Static223.aClass245_2.method5975(local21, (long) local10 << 16);
			return local21;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLjava/lang/String;IZ)I")
	public static int method8148(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) char local39 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local39 == '-') {
					local24 = true;
					continue;
				}
				if (local39 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local39 >= '0' && local39 <= '9') {
				local75 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local75 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local75 = local39 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local75 >= arg1) {
				throw new NumberFormatException();
			}
			if (local24) {
				local75 = -local75;
			}
			@Pc(111) int local111 = local75 + arg1 * local28;
			if (local28 != local111 / arg1) {
				throw new NumberFormatException();
			}
			local28 = local111;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
