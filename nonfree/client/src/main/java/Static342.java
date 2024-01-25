import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!jt;")
	public static final Class165 aClass165_7 = new Class165("", 11);

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[128][128];

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lclient!kda;")
	public static final Class173 aClass173_8 = new Class173();

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Z")
	public static boolean aBoolean462 = false;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5461(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static554.anInt9637; local11++) {
			if (arg0.equalsIgnoreCase(Static512.aStringArray31[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static574.aStringArray35[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5462(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if ((long) 0 == arg0 % 37L) {
			return null;
		} else {
			@Pc(26) int local26 = 0;
			@Pc(28) long local28 = arg0;
			while (local28 != 0L) {
				local28 /= 37L;
				local26++;
			}
			@Pc(44) StringBuffer local44 = new StringBuffer(local26);
			while (arg0 != 0L) {
				@Pc(48) long local48 = arg0;
				arg0 /= 37L;
				@Pc(62) char local62 = Static372.aCharArray6[(int) (local48 - arg0 * 37L)];
				if (local62 == '_') {
					@Pc(72) int local72 = local44.length() - 1;
					local62 = ' ';
					local44.setCharAt(local72, Character.toUpperCase(local44.charAt(local72)));
				}
				local44.append(local62);
			}
			local44.reverse();
			local44.setCharAt(0, Character.toUpperCase(local44.charAt(0)));
			return local44.toString();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)J")
	public static synchronized long method5463() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static259.aLong142) {
			Static97.aLong58 += Static259.aLong142 - local5;
		}
		Static259.aLong142 = local5;
		return local5 + Static97.aLong58;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Ljava/lang/String;BI[S)V")
	public static void method5464(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) String local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) short local38 = arg3[local18];
		arg3[local18] = arg3[arg0];
		arg3[arg0] = local38;
		for (@Pc(50) int local50 = arg2; local50 < arg0; local50++) {
			if (local24 == null || arg1[local50] != null && (local50 & 0x1) > arg1[local50].compareTo(local24)) {
				@Pc(71) String local71 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20] = local71;
				@Pc(85) short local85 = arg3[local50];
				arg3[local50] = arg3[local20];
				arg3[local20++] = local85;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg3[arg0] = arg3[local20];
		arg3[local20] = local38;
		method5464(local20 - 1, arg1, arg2, arg3);
		method5464(arg0, arg1, local20 + 1, arg3);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZII)Lclient!lba;")
	public static Class15_Sub7 method5465(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class123[] local12 = Class20_Sub2.aClass123Array1;
		synchronized (Class20_Sub2.aClass123Array1) {
			@Pc(35) Class15_Sub7 local35;
			if (arg1 >= Class20_Sub2.aClass123Array1.length || Class20_Sub2.aClass123Array1[arg1].method3536()) {
				local35 = new Class15_Sub7();
				local35.aClass15_Sub6Array1 = new Class15_Sub6[arg1];
				for (@Pc(57) int local57 = 0; local57 < arg1; local57++) {
					local35.aClass15_Sub6Array1[local57] = new Class15_Sub6();
				}
			} else {
				local35 = (Class15_Sub7) Class20_Sub2.aClass123Array1[arg1].method3535();
				local35.method8314();
				@Pc(42) int local42 = Static237.anIntArray314[arg1]--;
			}
			local35.aBoolean429 = arg0;
			return local35;
		}
	}
}
