import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
	public static final int[] anIntArray171 = new int[1024];

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!go;")
	public static final Class95 aClass95_1 = new Class95("stellardawn", 1);

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_76 = new Class186(35, 18);

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "S")
	public static short aShort47 = 1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method1909(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static329.aCharArray6[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(78) int local78 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local78, Character.toUpperCase(local52.charAt(local78)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method1910(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + (long) arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!bo;Lclient!ps;Lclient!qa;Z)V")
	public static void method1912(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class4_Sub32 arg1, @OriginalArg(2) Class30 arg2) {
		@Pc(10) Class3 local10 = arg0.method665(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.UA();
		if (local10.qa() > local16) {
			local16 = local10.qa();
		}
		@Pc(28) int local28 = arg1.anInt5603;
		@Pc(31) int local31 = arg1.anInt5607;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(78) int local78;
		if (arg0.aString8 != null) {
			local33 = Static26.aClass215_1.method4966(null, Static21.aStringArray3, arg0.aString8, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static21.aStringArray3[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local78 = Static394.aClass264_42.method5724(local57);
				if (local35 < local78) {
					local35 = local78;
				}
			}
			local37 = local33 * Static394.aClass264_42.method5725() + Static394.aClass264_42.method5726() / 2;
		}
		local51 = arg1.anInt5603 + local16 / 2;
		if (local28 < local16 + Static137.anInt5589) {
			local28 = Static137.anInt5589;
			local51 = local16 / 2 + Static137.anInt5589 + local35 / 2 + 5 + 10;
		} else if (local28 > Static137.anInt5582 - local16) {
			local28 = Static137.anInt5582 - local16;
			local51 = Static137.anInt5582 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		@Pc(166) int local166 = arg1.anInt5607;
		if (local31 < Static137.anInt5587 + local16) {
			local166 = Static137.anInt5587 + local16 / 2 + 10;
			local31 = Static137.anInt5587;
		} else if (Static137.anInt5586 - local16 < local31) {
			local31 = Static137.anInt5586 - local16;
			local166 = Static137.anInt5586 - local37 - local16 / 2 - 10;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg1.anInt5603), (double) (local31 - arg1.anInt5607)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5879((float) local16 / 2.0F + (float) local28, (float) local16 / 2.0F + (float) local31, 4096, local78);
		@Pc(250) int local250 = -2;
		@Pc(252) int local252 = -2;
		@Pc(254) int local254 = -2;
		@Pc(261) int local261 = -2;
		if (arg0.aString8 != null) {
			local252 = local166;
			local250 = local51 - local35 / 2 - 5;
			local261 = local166 + local33 * Static394.aClass264_42.method5725() + 3;
			local254 = local250 + local35 + 10;
			if (arg0.anInt868 != 0) {
				arg2.method4692(local254 - local250, -local166 + local261, local250, arg0.anInt868, local166);
			}
			if (arg0.anInt863 != 0) {
				arg2.method4702(local250, arg0.anInt863, local254 - local250, -local166 + local261, local166);
			}
			for (@Pc(331) int local331 = 0; local331 < local33; local331++) {
				@Pc(337) String local337 = Static21.aStringArray3[local331];
				if (local331 < local33 - 1) {
					local337 = local337.substring(0, local337.length() - 4);
				}
				Static394.aClass264_42.method5727(arg2, local337, local51, local166, arg0.anInt862);
				local166 += Static394.aClass264_42.method5725();
			}
		}
		if (arg0.anInt855 == -1 && arg0.aString8 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(393) Class4_Sub42 local393 = new Class4_Sub42(arg1);
		local393.anInt7118 = local250;
		local393.anInt7115 = local16 + local31;
		local393.anInt7116 = local31 - local16;
		local393.anInt7119 = local261;
		local393.anInt7117 = local254;
		local393.anInt7112 = local28 + local16;
		local393.anInt7114 = local28 - local16;
		local393.anInt7113 = local252;
		Static113.aClass258_17.method5526(local393);
	}
}
