import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!aw", name = "B", descriptor = "Lclient!ae;")
	public static Class8 aClass8_102;

	@OriginalMember(owner = "client!aw", name = "A", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_99 = new Class289(85, 3);

	@OriginalMember(owner = "client!aw", name = "C", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_255 = new Class179(22, -1);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!ns;I)V")
	public static void method5712(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anIntArray295 == null && arg0.anIntArray297 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray295.length; local16++) {
			@Pc(22) int local22 = -1;
			if (arg0.anIntArray295 != null) {
				local22 = arg0.anIntArray295[local16];
			}
			if (local22 != -1) {
				local14 = false;
				@Pc(80) int local80;
				@Pc(93) int local93;
				@Pc(60) int local60;
				if ((local22 & 0xC0000000) == -1073741824) {
					local60 = local22 & 0xFFFFFFF;
					@Pc(64) int local64 = local60 >> 14;
					@Pc(68) int local68 = local60 & 0x3FFF;
					local80 = arg0.anInt10006 - (local64 - Static534.anInt8753) * 512 - 256;
					local93 = arg0.anInt10001 - (local68 - Static234.anInt4239) * 512 - 256;
				} else if ((local22 & 0x8000) == 0) {
					@Pc(109) Class6_Sub44 local109 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local22);
					if (local109 == null) {
						arg0.method4332(-1, local16);
						continue;
					}
					@Pc(114) Class2_Sub1_Sub1_Sub3_Sub2 local114 = local109.aClass2_Sub1_Sub1_Sub3_Sub2_2;
					local93 = arg0.anInt10001 - local114.anInt10001;
					local80 = arg0.anInt10006 - local114.anInt10006;
				} else {
					local60 = local22 & 0x7FFF;
					@Pc(146) Class2_Sub1_Sub1_Sub3_Sub1 local146 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local60];
					if (local146 == null) {
						arg0.method4332(-1, local16);
						continue;
					}
					local93 = arg0.anInt10001 - local146.anInt10001;
					local80 = arg0.anInt10006 - local146.anInt10006;
				}
				if (local80 != 0 || local93 != 0) {
					arg0.method4332((int) (Math.atan2((double) local80, (double) local93) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method4332(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray297 = null;
			arg0.anIntArray295 = null;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
	public static boolean method5713(@OriginalArg(3) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(71) int local71;
			if (local46 >= '0' && local46 <= '9') {
				local71 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local71 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local71 = local46 - 'W';
			} else {
				return false;
			}
			if (local71 >= 10) {
				return false;
			}
			if (local26) {
				local71 = -local71;
			}
			@Pc(115) int local115 = local71 + local35 * 10;
			if (local115 / 10 != local35) {
				return false;
			}
			local28 = true;
			local35 = local115;
		}
		return local28;
	}
}
