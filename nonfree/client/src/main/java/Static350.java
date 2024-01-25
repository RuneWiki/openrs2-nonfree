import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
	public static int anInt5615;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_124 = new Class253(19, -1);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public static void method4522() {
		if (Static130.aClass153_Sub1_1.method4229(Static377.anInt6113) || Static179.anInt7446 == Static268.anInt4539) {
			Static234.method3209(Static269.aClass51_9);
			if (Static268.anInt4539 != Static182.anInt3281) {
				Static456.method5792();
			}
		} else {
			Static114.method1939(10, Static323.anInt5346, Static213.anInt3813, false);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ya;B)V")
	public static void method4523(@OriginalArg(0) Class51 arg0) {
		if (Static1.aClass85_2.method2013() == 0) {
			return;
		}
		@Pc(54) Class7_Sub28 local54;
		if (Static377.anInt6113 == 0) {
			for (local54 = (Class7_Sub28) Static1.aClass85_2.method2010(); local54 != null; local54 = (Class7_Sub28) Static1.aClass85_2.method2000()) {
				Static259.aClass206_2.method4326(Static359.aClass63_11, local54.anInt3807, local54.anInt3808, false, false, local54.anInt3806, local54.anInt3803, local54.anInt3804, local54.aBoolean228 ? Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1 : null, arg0, arg0);
				local54.method5802();
			}
			Static193.method2788();
			return;
		}
		if (Static43.aClass51_1 == null) {
			@Pc(24) Canvas local24 = new Canvas();
			local24.setSize(36, 32);
			Static43.aClass51_1 = Static459.method5294(0, Static351.anInterface4_5, local24, Static230.aClass61_4, 0);
			Static421.aClass63_14 = Static43.aClass51_1.method5281(Static254.method3389(Static249.aClass178_74, Static272.anInt4601), Static469.method5146(Static25.aClass178_9, Static272.anInt4601));
		}
		for (local54 = (Class7_Sub28) Static1.aClass85_2.method2010(); local54 != null; local54 = (Class7_Sub28) Static1.aClass85_2.method2000()) {
			Static259.aClass206_2.method4326(Static421.aClass63_14, local54.anInt3807, local54.anInt3808, false, false, local54.anInt3806, local54.anInt3803, local54.anInt3804, local54.aBoolean228 ? Static104.aClass26_Sub2_Sub4_Sub2_2.aClass75_1 : null, arg0, Static43.aClass51_1);
			local54.method5802();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIZIII)V")
	public static void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static131.anInt2511 = arg3;
		Static448.anInt7378 = arg1;
		Static316.anInt5194 = arg2;
		Static453.anInt7459 = arg4;
		Static263.anInt4464 = arg0;
		if (Static131.anInt2511 >= 100) {
			@Pc(22) int local22 = Static448.anInt7378 * 128 + 64;
			@Pc(28) int local28 = Static453.anInt7459 * 128 + 64;
			@Pc(37) int local37 = Static333.method2748(Static268.anInt4539, local28, local22) - Static263.anInt4464;
			@Pc(41) int local41 = local22 - Static46.anInt737;
			@Pc(45) int local45 = local37 - Static212.anInt3801;
			@Pc(49) int local49 = local28 - Static181.anInt3254;
			@Pc(60) int local60 = (int) Math.sqrt((double) (local49 * local49 + local41 * local41));
			Static9.anInt55 = (int) (Math.atan2((double) local45, (double) local60) * 2607.5945876176133D) & 0x3FFF;
			Static92.anInt1897 = (int) (-2607.5945876176133D * Math.atan2((double) local41, (double) local49)) & 0x3FFF;
			if (Static9.anInt55 < 1024) {
				Static9.anInt55 = 1024;
			}
			Static408.anInt6454 = 0;
			if (Static9.anInt55 > 3072) {
				Static9.anInt55 = 3072;
			}
		}
		Static9.anInt60 = 2;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(JIIBZ)Ljava/lang/String;")
	public static String method4525(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) char local12 = ',';
		@Pc(14) char local14 = '.';
		if (arg2 == 0) {
			local12 = '.';
			local14 = ',';
		}
		if (arg2 == 2) {
			local14 = ' ';
		}
		@Pc(29) boolean local29 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local29 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg1 > 0) {
			for (local47 = 0; local47 < arg1; local47++) {
				local52 = (int) arg0;
				arg0 /= 10L;
				local43.append((char) (local52 + 48 - (int) arg0 * 10));
			}
			local43.append(local12);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg0;
			arg0 /= 10L;
			local43.append((char) (local52 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local29) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg3) {
				local47++;
				if (local47 % 3 == 0) {
					local43.append(local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)[Lclient!fp;")
	public static Class83[] method4526() {
		return new Class83[] { Static282.aClass83_9, Static320.aClass83_12, Static408.aClass83_13, Static425.aClass83_15, Static12.aClass83_1, Static253.aClass83_8, Static242.aClass83_7, Static186.aClass83_6, Static27.aClass83_2, Static62.aClass83_3, Static150.aClass83_4, Static320.aClass83_11, Static178.aClass83_5, Static287.aClass83_14 };
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIIZI)I")
	public static int method4528(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class7_Sub27 local10 = Static288.method3810(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray323.length; local23++) {
			if (local10.anIntArray323[local23] >= 0 && Static259.aClass206_2.anInt5386 > local10.anIntArray323[local23]) {
				@Pc(49) Class45 local49 = Static259.aClass206_2.method4320(local10.anIntArray323[local23]);
				@Pc(61) int local61 = local49.method769(arg2, Static443.aClass193_4.method4068(arg2).anInt6961);
				if (arg0) {
					local16 += local10.anIntArray324[local23] * local61;
				} else {
					local16 += local61;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4529(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static184.anInt3296; local16++) {
			if (arg0.equalsIgnoreCase(Static193.aStringArray30[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
