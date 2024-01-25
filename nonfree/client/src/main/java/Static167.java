import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fv", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(III)V")
	public static void method2407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class6_Sub4_Sub18 local11 = Static565.method7924((long) arg1, 12);
		local11.method7976();
		local11.anInt9466 = arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBIILclient!iaa;)V")
	public static void method2408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub26 arg3) {
		arg3.aClass6_Sub23_Sub1_2.method8364(arg2);
		arg3.aClass6_Sub23_Sub1_2.method8338(arg1);
		arg3.aClass6_Sub23_Sub1_2.method8405(arg0);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!sda;Lclient!ha;ILclient!hv;)V")
	public static void method2409(@OriginalArg(0) Class318 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) Class6_Sub24 arg2) {
		@Pc(10) Class9 local10 = arg0.method7387(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method8938();
		if (local10.method8918() > local16) {
			local16 = local10.method8918();
		}
		@Pc(28) int local28 = arg2.anInt3904;
		@Pc(31) int local31 = arg2.anInt3907;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg0.aString120 != null) {
			local33 = Static393.aClass151_10.method3325((Class9[]) null, Static674.aStringArray62, arg0.aString120, (int[]) null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static674.aStringArray62[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static560.aClass81_3.method1910(local57);
				if (local74 > local35) {
					local35 = local74;
				}
			}
			local37 = local33 * Static560.aClass81_3.method1908() + Static560.aClass81_3.method1911() / 2;
		}
		local51 = local16 / 2 + arg2.anInt3904;
		@Pc(112) int local112 = arg2.anInt3907;
		if (local28 < local16 + Static528.anInt5365) {
			local28 = Static528.anInt5365;
			local51 = local35 / 2 + Static528.anInt5365 + local16 / 2 + 10 + 5;
		} else if (local28 > Static528.anInt5368 - local16) {
			local51 = Static528.anInt5368 - local35 / 2 - local16 / 2 - 15;
			local28 = Static528.anInt5368 - local16;
		}
		if (local31 < Static528.anInt5360 + local16) {
			local112 = Static528.anInt5360 + local16 / 2 + 10;
			local31 = Static528.anInt5360;
		} else if (local31 > Static528.anInt5363 - local16) {
			local31 = Static528.anInt5363 - local16;
			local112 = Static528.anInt5363 - local37 - local16 / 2 - 10;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg2.anInt3904), (double) (local31 - arg2.anInt3907)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method8917((float) local16 / 2.0F + (float) local28, (float) local16 / 2.0F + (float) local31, 4096, local74);
		@Pc(243) int local243 = -2;
		@Pc(245) int local245 = -2;
		@Pc(247) int local247 = -2;
		@Pc(249) int local249 = -2;
		if (arg0.aString120 != null) {
			local245 = local112;
			local243 = local51 - local35 / 2 - 5;
			local247 = local243 + local35 + 10;
			local249 = local112 + local33 * Static560.aClass81_3.method1908() + 3;
			if (arg0.anInt8721 != 0) {
				arg1.method7512(local249 - local112, local247 - local243, local243, local112, arg0.anInt8721);
			}
			if (arg0.anInt8699 != 0) {
				arg1.method7462(arg0.anInt8699, local247 - local243, local243, local112, local249 - local112);
			}
			for (@Pc(312) int local312 = 0; local312 < local33; local312++) {
				@Pc(318) String local318 = Static674.aStringArray62[local312];
				if (local312 < local33 - 1) {
					local318 = local318.substring(0, local318.length() - 4);
				}
				Static560.aClass81_3.method1906(arg1, local318, local51, local112, arg0.anInt8704);
				local112 += Static560.aClass81_3.method1908();
			}
		}
		if (arg0.anInt8722 == -1 && arg0.aString120 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(365) Class6_Sub13 local365 = new Class6_Sub13(arg2);
		local365.anInt1869 = local31 - local16;
		local365.anInt1864 = local249;
		local365.anInt1868 = local245;
		local365.anInt1867 = local28 - local16;
		local365.anInt1862 = local247;
		local365.anInt1873 = local28 + local16;
		local365.anInt1865 = local243;
		local365.anInt1861 = local16 + local31;
		Static473.aClass362_54.method8536(local365);
	}
}
