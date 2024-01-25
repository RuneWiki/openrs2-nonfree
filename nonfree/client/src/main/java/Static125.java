import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[200];

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!pj;IIIZIB)V")
	public static void method1931(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static426.anInt7575 = arg1;
		Static95.aBoolean114 = false;
		Static226.aClass248_33 = arg0;
		Static554.anInt9644 = 0;
		Static540.anInt8992 = arg2;
		Static321.anInt6142 = 2;
		Static131.anInt2504 = 1;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!ql;)I")
	public static int method1932(@OriginalArg(1) Class6_Sub12_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method6061(2);
		@Pc(35) int local35;
		if (local15 == 0) {
			local35 = 0;
		} else if (local15 == 1) {
			local35 = arg0.method6061(5);
		} else if (local15 == 2) {
			local35 = arg0.method6061(8);
		} else {
			local35 = arg0.method6061(11);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
	public static void method1933() {
		@Pc(8) int local8 = Static369.aByteArrayArray19.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static369.aByteArrayArray19[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static405.anInt7318; local20++) {
					if (Static468.anIntArray577[local10] == Static238.anIntArray362[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static238.anIntArray362[Static405.anInt7318] = Static468.anIntArray577[local10];
					local18 = Static405.anInt7318++;
				}
				@Pc(68) Class6_Sub12 local68 = new Class6_Sub12(Static369.aByteArrayArray19[local10]);
				@Pc(70) int local70 = 0;
				while (Static369.aByteArrayArray19[local10].length > local68.anInt7556 && local70 < 511 && Static429.anInt7650 < 1023) {
					@Pc(89) int local89 = local70++ << 6 | local18;
					@Pc(93) int local93 = local68.method6044();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(120) int local120 = local103 + (Static468.anIntArray577[local10] >> 8) * 64 - Static150.anInt2792;
					@Pc(133) int local133 = local107 + (Static468.anIntArray577[local10] & 0xFF) * 64 - Static154.anInt2878;
					@Pc(140) Class88 local140 = Static119.aClass226_4.method5369(local68.method6044());
					@Pc(149) Class6_Sub49 local149 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local89);
					if (local149 == null && (local140.lb & 0x1) > 0 && Static558.anInt9704 == local97 && local120 >= 0 && local140.anInt2171 + local120 < Static18.anInt5706 && local133 >= 0 && local140.anInt2171 + local133 < Static80.anInt1367) {
						@Pc(193) Class15_Sub2_Sub4_Sub1 local193 = new Class15_Sub2_Sub4_Sub1();
						local193.anInt8924 = local89;
						@Pc(201) Class6_Sub49 local201 = new Class6_Sub49(local193);
						Static251.aClass234_29.method5466((long) local89, local201);
						Static324.aClass6_Sub49Array1[Static192.anInt3744++] = local201;
						Static46.anIntArray36[Static429.anInt7650++] = local89;
						local193.anInt8966 = Static363.anInt6671;
						local193.method4297(local140);
						local193.method7134(local193.aClass88_1.anInt2171);
						local193.anInt8930 = local193.aClass88_1.anInt2144 << 3;
						local193.method7143(local193.aClass88_1.aByte18 + 4 << 11 & 0x3997, true);
						local193.method4294(local193.method7135(), local97, local120, true, local133);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIII)I")
	public static int method1935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		@Pc(31) int local31 = 255 - arg2;
		return (((arg0 & 0xFF00FF) * local31 & 0xFF00FF00 | local31 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local26;
	}
}
