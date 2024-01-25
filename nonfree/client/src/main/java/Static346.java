import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
	public static int anInt4654;

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_79 = new Class337(12, -1);

	@OriginalMember(owner = "client!mj", name = "G", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_80 = new Class337(103, 4);

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "Z")
	public static final boolean aBoolean332 = false;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "(I)V")
	public static void method4219() {
		if (Static567.anInt9577 <= 0) {
			Static440.aString83 = "";
			return;
		}
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static590.aStringArray77.length; local15++) {
			if (Static590.aStringArray77[local15].indexOf("--> ") != -1) {
				local13++;
				if (local13 == Static567.anInt9577) {
					Static440.aString83 = Static590.aStringArray77[local15].substring(Static590.aStringArray77[local15].indexOf(">") + 2);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ha;Lclient!re;Lclient!iba;I)V")
	public static void method4220(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class5_Sub26 arg2) {
		@Pc(10) Class28 local10 = arg1.method7065(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method4032();
		if (local16 < local10.method4037()) {
			local16 = local10.method4037();
		}
		@Pc(32) int local32 = arg2.anInt4150;
		@Pc(35) int local35 = arg2.anInt4152;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(57) int local57;
		@Pc(80) int local80;
		if (arg1.aString93 != null) {
			local37 = Static1.aClass272_18.method6571(null, null, arg1.aString93, Static183.aStringArray24);
			for (local57 = 0; local57 < local37; local57++) {
				@Pc(63) String local63 = Static183.aStringArray24[local57];
				if (local37 - 1 > local57) {
					local63 = local63.substring(0, local63.length() - 4);
				}
				local80 = Static125.aClass57_2.method1238(local63);
				if (local80 > local39) {
					local39 = local80;
				}
			}
			local41 = Static125.aClass57_2.method1239() * local37 + Static125.aClass57_2.method1242() / 2;
		}
		local57 = arg2.anInt4150 + local16 / 2;
		@Pc(115) int local115 = arg2.anInt4152;
		if (local32 < Static620.anInt8211 + local16) {
			local57 = local39 / 2 + local16 / 2 + Static620.anInt8211 + 10 + 5;
			local32 = Static620.anInt8211;
		} else if (Static620.anInt8203 - local16 < local32) {
			local32 = Static620.anInt8203 - local16;
			local57 = Static620.anInt8203 - local39 / 2 - local16 / 2 - 5 - 10;
		}
		if (local35 < local16 + Static620.anInt8202) {
			local35 = Static620.anInt8202;
			local115 = Static620.anInt8202 + local16 / 2 + 10;
		} else if (Static620.anInt8200 - local16 < local35) {
			local115 = Static620.anInt8200 - local41 - local16 / 2 - 10;
			local35 = Static620.anInt8200 - local16;
		}
		local80 = (int) (Math.atan2((double) (local32 - arg2.anInt4150), (double) (local35 - arg2.anInt4152)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method4033((float) local16 / 2.0F + (float) local32, (float) local35 + (float) local16 / 2.0F, 4096, local80);
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		if (arg1.aString93 != null) {
			local253 = local57 - local39 / 2 - 5;
			local255 = local115;
			local259 = local115 + local37 * Static125.aClass57_2.method1239() + 3;
			local257 = local253 + local39 + 10;
			if (arg1.anInt8130 != 0) {
				arg0.method7251(local257 - local253, local259 + -local115, arg1.anInt8130, local115, local253);
			}
			if (arg1.anInt8119 != 0) {
				arg0.method7243(local253, arg1.anInt8119, local259 - local115, local115, local257 - local253);
			}
			for (@Pc(329) int local329 = 0; local329 < local37; local329++) {
				@Pc(335) String local335 = Static183.aStringArray24[local329];
				if (local37 - 1 > local329) {
					local335 = local335.substring(0, local335.length() - 4);
				}
				Static125.aClass57_2.method1237(arg0, local335, local57, local115, arg1.anInt8141);
				local115 += Static125.aClass57_2.method1239();
			}
		}
		if (arg1.anInt8134 == -1 && arg1.aString93 == null) {
			return;
		}
		@Pc(386) Class5_Sub8 local386 = new Class5_Sub8(arg2);
		local16 >>= 0x1;
		local386.anInt1133 = local257;
		local386.anInt1134 = local35 - local16;
		local386.anInt1131 = local253;
		local386.anInt1128 = local32 + local16;
		local386.anInt1127 = local255;
		local386.anInt1129 = local259;
		local386.anInt1130 = local16 + local35;
		local386.anInt1132 = local32 - local16;
		Static608.aClass330_62.method7917(local386);
	}
}
