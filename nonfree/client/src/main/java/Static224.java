import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	public static int anInt4980;

	@OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
	public static int anInt4986;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
	public static int anInt4981 = 0;

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_38 = new Class99(4);

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_46 = new Class94(49, 6);

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	public static int anInt4987 = -1;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_47 = new Class94(23, 8);

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "Lclient!ec;")
	public static final Class86 aClass86_5 = new Class86();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)V")
	public static void method4291(@OriginalArg(0) int arg0) {
		Static248.anInt5350 = -1;
		if (arg0 == 37) {
			Static303.aFloat6 = 3.0F;
		} else if (arg0 == 50) {
			Static303.aFloat6 = 4.0F;
		} else if (arg0 == 75) {
			Static303.aFloat6 = 6.0F;
		} else if (arg0 == 100) {
			Static303.aFloat6 = 8.0F;
		} else if (arg0 == 200) {
			Static303.aFloat6 = 16.0F;
		}
		Static248.anInt5350 = -1;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4292(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static248.aCharArray2[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BI)V")
	public static void method4293(@OriginalArg(1) int arg0) {
		Static232.anInt5106 = arg0;
		Static302.anInt6299 = 3;
		Static422.anInt7962 = 100;
		Static604.anInt10636 = -1;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4294(@OriginalArg(1) String arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static540.aStringArray45.length; local5++) {
			if (Static540.aStringArray45[local5].equalsIgnoreCase(arg0)) {
				return local5;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method4296(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static89.anInt2628 >= 100) {
			Static271.method9045(Static588.aClass351_41.method8691(Static476.anInt8915));
			return;
		}
		@Pc(25) String local25 = Static31.method765(arg0);
		if (local25 == null) {
			return;
		}
		@Pc(69) String local69;
		for (@Pc(30) int local30 = 0; local30 < Static89.anInt2628; local30++) {
			@Pc(38) String local38 = Static31.method765(Static251.aStringArray20[local30]);
			if (local38 != null && local38.equals(local25)) {
				Static271.method9045(arg0 + Static588.aClass351_42.method8691(Static476.anInt8915));
				return;
			}
			if (Static496.aStringArray38[local30] != null) {
				local69 = Static31.method765(Static496.aStringArray38[local30]);
				if (local69 != null && local69.equals(local25)) {
					Static271.method9045(arg0 + Static588.aClass351_42.method8691(Static476.anInt8915));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < Static604.anInt10620; local104++) {
			local69 = Static31.method765(Static314.aStringArray29[local104]);
			if (local69 != null && local69.equals(local25)) {
				Static271.method9045(Static588.aClass351_47.method8691(Static476.anInt8915) + arg0 + Static588.aClass351_48.method8691(Static476.anInt8915));
				return;
			}
			if (Static101.aStringArray15[local104] != null) {
				@Pc(148) String local148 = Static31.method765(Static101.aStringArray15[local104]);
				if (local148 != null && local148.equals(local25)) {
					Static271.method9045(Static588.aClass351_47.method8691(Static476.anInt8915) + arg0 + Static588.aClass351_48.method8691(Static476.anInt8915));
					return;
				}
			}
		}
		if (Static31.method765(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aString64).equals(local25)) {
			Static271.method9045(Static588.aClass351_44.method8691(Static476.anInt8915));
			return;
		}
		@Pc(202) Class2_Sub52 local202 = Static130.method3019(Static266.aClass94_56, Static361.aClass183_1);
		local202.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(arg0) + 1);
		local202.aClass2_Sub11_Sub2_7.method8329(arg0);
		local202.aClass2_Sub11_Sub2_7.method8374(arg1 ? 1 : 0);
		Static96.method2563(local202);
	}
}
