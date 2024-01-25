import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vr", name = "x", descriptor = "[Lclient!kq;")
	public static Class116[] aClass116Array3;

	@OriginalMember(owner = "client!vr", name = "u", descriptor = "[I")
	public static final int[] anIntArray452 = new int[100];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4906(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 == '<' || local24 == '>') {
				local10 += 3;
			}
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(local10 + local8);
		for (@Pc(46) int local46 = 0; local46 < local8; local46++) {
			@Pc(52) char local52 = arg0.charAt(local46);
			if (local52 == '<') {
				local44.append("<lt>");
			} else if (local52 == '>') {
				local44.append("<gt>");
			} else {
				local44.append(local52);
			}
		}
		return local44.toString();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILclient!lq;Lclient!lq;)V")
	public static void method4907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub1 arg3, @OriginalArg(4) Class5_Sub1 arg4) {
		if (Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static128.method2212(arg0, arg1, arg2);
		}
		Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2].aClass5_Sub1_1 = arg3;
		Static256.aClass45ArrayArrayArray2[arg0][arg1][arg2].aClass5_Sub1_2 = arg4;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!mk;I)V")
	public static void method4908(@OriginalArg(0) Class136 arg0) {
		Static323.aClass136_1 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BI)Lclient!lc;")
	public static Class119 method4911(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static249.aClass198_43;
		@Pc(14) Class119 local14;
		synchronized (Static249.aClass198_43) {
			local14 = (Class119) Static249.aClass198_43.method5242((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = Static312.aClass100_123.method2319(Static257.method4350(arg0), Static81.method1273(arg0));
		local14 = new Class119();
		local14.anInt3669 = arg0;
		if (local39 != null) {
			local14.method2885(new Class3_Sub4(local39));
		}
		local14.method2886();
		@Pc(60) Class198 local60 = Static249.aClass198_43;
		synchronized (Static249.aClass198_43) {
			Static249.aClass198_43.method5231((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(JB)V")
	public static void method4912(@OriginalArg(0) long arg0) {
		@Pc(13) int local13 = Static189.anInt3967;
		@Pc(15) int local15 = Static350.anInt6803;
		@Pc(23) int local23;
		@Pc(31) int local31;
		if (Static298.anInt5943 != local13) {
			local23 = local13 - Static298.anInt5943;
			local31 = (int) (arg0 * (long) local23 / 320L);
			if (local23 <= 0) {
				if (local31 == 0) {
					local31 = -1;
				} else if (local23 > local31) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = 1;
			} else if (local23 < local31) {
				local31 = local23;
			}
			Static298.anInt5943 += local31;
		}
		if (local15 != Static56.anInt1230) {
			local23 = local15 - Static56.anInt1230;
			local31 = (int) (arg0 * (long) local23 / 320L);
			if (local23 <= 0) {
				if (local31 == 0) {
					local31 = -1;
				} else if (local31 < local23) {
					local31 = local23;
				}
			} else if (local31 == 0) {
				local31 = 1;
			} else if (local31 > local23) {
				local31 = local23;
			}
			Static56.anInt1230 += local31;
		}
		if (!Static165.aBoolean173) {
			Static46.aFloat2 += Static352.aFloat78 * (float) arg0 / 40.0F * 8.0F;
			Static57.aFloat3 += (float) arg0 * Static128.aFloat21 / 40.0F * 8.0F;
		}
		Static240.method4147();
	}
}
