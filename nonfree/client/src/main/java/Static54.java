import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
	public static int anInt826 = 0;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lclient!dh;IIILclient!ha;Lclient!pda;)Z")
	public static boolean method855(@OriginalArg(0) Class72 arg0, @OriginalArg(4) Class126 arg1, @OriginalArg(5) Class5_Sub39 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray130 != null) {
			local9 = Static203.anInt133 + (Static203.anInt135 - Static203.anInt133) * (arg0.anInt1535 + arg2.anInt7224 - Static203.anInt131) / (Static203.anInt132 - Static203.anInt131);
			local11 = Static203.anInt129 - (arg2.anInt7220 + arg0.anInt1504 - Static203.anInt127) * (-Static203.anInt138 + Static203.anInt129) / (Static203.anInt128 - Static203.anInt127);
			local7 = Static203.anInt133 + (arg2.anInt7224 + arg0.anInt1528 - Static203.anInt131) * (Static203.anInt135 - Static203.anInt133) / (Static203.anInt132 - Static203.anInt131);
			local13 = Static203.anInt129 - (arg2.anInt7220 + arg0.anInt1529 - Static203.anInt127) * (Static203.anInt129 - Static203.anInt138) / (Static203.anInt128 - Static203.anInt127);
		}
		@Pc(106) Class44 local106 = null;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (arg0.anInt1509 != -1) {
			if (arg2.aBoolean602 && arg0.anInt1518 != -1) {
				local106 = arg0.method1448(true, arg1);
			} else {
				local106 = arg0.method1448(false, arg1);
			}
			if (local106 != null) {
				local108 = arg2.anInt7219 - (local106.method5313() + 1 >> 1);
				local110 = arg2.anInt7219 + (local106.method5313() + 1 >> 1);
				if (local7 > local108) {
					local7 = local108;
				}
				local112 = arg2.anInt7222 - (local106.method5325() + 1 >> 1);
				if (local9 < local110) {
					local9 = local110;
				}
				local114 = arg2.anInt7222 + (local106.method5325() + 1 >> 1);
				if (local112 < local11) {
					local11 = local112;
				}
				if (local114 > local13) {
					local13 = local114;
				}
			}
		}
		@Pc(216) Class262 local216 = null;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(312) int local312;
		if (arg0.aString22 != null) {
			local216 = Static540.method7703(arg0.anInt1523);
			if (local216 != null) {
				local218 = Static363.aClass298_7.method6970(arg0.aString22, (int[]) null, Static157.aStringArray11, (Class44[]) null);
				local222 = arg2.anInt7222 - (Static203.anInt129 - Static203.anInt138) * arg0.anInt1532 / (Static203.anInt128 - Static203.anInt127);
				local220 = arg2.anInt7219 + (Static203.anInt135 - Static203.anInt133) * arg0.anInt1515 / (Static203.anInt132 - Static203.anInt131);
				if (local106 == null) {
					local222 -= local218 * local216.method6265() / 2;
				} else {
					local222 -= (local106.method5325() >> 1) + (local216.method6266() * local218);
				}
				for (local312 = 0; local312 < local218; local312++) {
					@Pc(318) String local318 = Static157.aStringArray11[local312];
					if (local218 - 1 > local312) {
						local318 = local318.substring(0, local318.length() - 4);
					}
					@Pc(335) int local335 = local216.method6267(local318);
					if (local335 > local224) {
						local224 = local335;
					}
				}
				local226 = local220 - local224 / 2;
				if (local7 > local226) {
					local7 = local226;
				}
				local228 = local224 / 2 + local220;
				if (local9 < local228) {
					local9 = local228;
				}
				local230 = local222;
				local232 = local218 * local216.method6266() + local222;
				if (local11 > local230) {
					local11 = local230;
				}
				if (local13 < local232) {
					local13 = local232;
				}
			}
		}
		if (Static203.anInt133 > local9 || Static203.anInt135 < local7 || Static203.anInt138 > local13 || local11 > Static203.anInt129) {
			return true;
		}
		Static203.method152(arg1, arg2, arg0);
		if (local106 != null) {
			if (Static340.anInt5872 > 0 && (Static299.anInt4748 != -1 && arg2.anInt7217 == Static299.anInt4748 || Static95.anInt1501 != -1 && Static95.anInt1501 == arg0.anInt1513)) {
				if (Static10.anInt161 <= 50) {
					local312 = Static10.anInt161 * 2;
				} else {
					local312 = 200 - Static10.anInt161 * 2;
				}
				@Pc(484) int local484 = local312 << 24 | 0xFFFF00;
				arg1.method7020(local484, arg2.anInt7222, local106.method5319() / 2 + 7, arg2.anInt7219);
				arg1.method7020(local484, arg2.anInt7222, local106.method5319() / 2 + 5, arg2.anInt7219);
				arg1.method7020(local484, arg2.anInt7222, local106.method5319() / 2 + 3, arg2.anInt7219);
				arg1.method7020(local484, arg2.anInt7222, local106.method5319() / 2 + 1, arg2.anInt7219);
				arg1.method7020(local484, arg2.anInt7222, local106.method5319() / 2, arg2.anInt7219);
			}
			local106.method5312(arg2.anInt7219 - (local106.method5313() >> 1), arg2.anInt7222 + -(local106.method5325() >> 1));
		}
		if (arg0.aString22 != null && local216 != null) {
			Static162.method2432(local224, arg0, arg1, local220, arg2, local222, local218, local216);
		}
		if (arg0.anInt1509 != -1 || arg0.aString22 != null) {
			@Pc(596) Class5_Sub26 local596 = new Class5_Sub26(arg2);
			local596.anInt4727 = local114;
			local596.anInt4730 = local232;
			local596.anInt4722 = local112;
			local596.anInt4723 = local230;
			local596.anInt4729 = local226;
			local596.anInt4721 = local108;
			local596.anInt4725 = local110;
			local596.anInt4728 = local228;
			Static173.aClass306_13.method7303(local596);
		}
		return false;
	}

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)Lclient!rs;")
	public static Class166_Sub1 method859() {
		return Static535.anInt8894 < Static106.aClass166_Sub1Array1.length ? Static106.aClass166_Sub1Array1[Static535.anInt8894++] : null;
	}
}
