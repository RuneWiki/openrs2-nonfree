import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!mq;")
	public static Class212 aClass212_8;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "Lclient!fl;")
	public static Class106 aClass106_24;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "[I")
	public static final int[] anIntArray341 = new int[16];

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "Z")
	public static final boolean aBoolean428 = false;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Z")
	public static boolean method4924(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public static void method4925() {
		@Pc(7) int local7 = 0;
		if (Static348.aClass3_Sub51_Sub1_5 != null) {
			local7 = Static348.aClass3_Sub51_Sub1_5.method7834(Static37.anInt1122);
		}
		@Pc(41) int local41;
		@Pc(55) int local55;
		if (local7 == 2) {
			local41 = Static483.anInt8361 <= 800 ? Static483.anInt8361 : 800;
			Static34.anInt3201 = local41;
			local55 = Static429.anInt7984 > 600 ? 600 : Static429.anInt7984;
			Static537.anInt9359 = (Static483.anInt8361 - local41) / 2;
			Static490.anInt8427 = 0;
			Static492.anInt8445 = local55;
		} else if (local7 == 1) {
			local41 = Static483.anInt8361 <= 1024 ? Static483.anInt8361 : 1024;
			Static537.anInt9359 = (Static483.anInt8361 - local41) / 2;
			local55 = Static429.anInt7984 > 768 ? 768 : Static429.anInt7984;
			Static34.anInt3201 = local41;
			Static490.anInt8427 = 0;
			Static492.anInt8445 = local55;
		} else {
			Static492.anInt8445 = Static429.anInt7984;
			Static34.anInt3201 = Static483.anInt8361;
			Static490.anInt8427 = 0;
			Static537.anInt9359 = 0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V")
	public static void method4927() {
		for (@Pc(10) Class3_Sub29 local10 = (Class3_Sub29) Static391.aClass244_52.method5572(); local10 != null; local10 = (Class3_Sub29) Static391.aClass244_52.method5576()) {
			if (local10.anInt5015 > 0) {
				local10.anInt5015--;
			}
			if (local10.anInt5015 != 0) {
				if (local10.anInt5011 > 0) {
					local10.anInt5011--;
				}
				if (local10.anInt5011 == 0 && local10.anInt5007 >= 1 && local10.anInt5012 >= 1 && Static345.anInt6228 - 2 >= local10.anInt5007 && Static535.anInt9341 - 2 >= local10.anInt5012 && (local10.anInt5014 < 0 || Static126.method2374(local10.anInt5010, local10.anInt5014))) {
					Static314.method4679(local10.anInt5010, local10.anInt5007, local10.anInt5013, -1, local10.anInt5004, local10.anInt5003, local10.anInt5014, local10.anInt5012);
					local10.anInt5011 = -1;
					if (local10.anInt5005 == local10.anInt5014 && local10.anInt5005 == -1) {
						local10.method8128();
					} else if (local10.anInt5014 == local10.anInt5005 && local10.anInt5008 == local10.anInt5013 && local10.anInt5010 == local10.anInt5006) {
						local10.method8128();
					}
				}
			} else if (local10.anInt5005 < 0 || Static126.method2374(local10.anInt5006, local10.anInt5005)) {
				Static314.method4679(local10.anInt5006, local10.anInt5007, local10.anInt5008, -1, local10.anInt5004, local10.anInt5003, local10.anInt5005, local10.anInt5012);
				local10.method8128();
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(JZIIB)Ljava/lang/String;")
	public static String method4929(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg0 < 0L) {
			local25 = true;
			arg0 = -arg0;
		}
		@Pc(39) StringBuffer local39 = new StringBuffer(26);
		@Pc(46) int local46;
		@Pc(51) int local51;
		if (arg3 > 0) {
			for (local46 = 0; local46 < arg3; local46++) {
				local51 = (int) arg0;
				arg0 /= 10L;
				local39.append((char) (local51 + 48 - (int) arg0 * 10));
			}
			local39.append(local7);
		}
		local46 = 0;
		while (true) {
			local51 = (int) arg0;
			arg0 /= 10L;
			local39.append((char) (local51 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local25) {
					local39.append('-');
				}
				return local39.reverse().toString();
			}
			if (arg1) {
				local46++;
				if (local46 % 3 == 0) {
					local39.append(local9);
				}
			}
		}
	}
}
