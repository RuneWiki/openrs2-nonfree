import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	public static int anInt3096;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
	public static int anInt3099;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public static void method2478() {
		Static222.aClass169_122.method4018();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!o;IIIIII)V")
	public static void method2480(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) long local3 = 0L;
		if (arg2 == 0) {
			local3 = Static27.method481(arg3, arg4, arg1);
		} else if (arg2 == 1) {
			local3 = Static207.method3285(arg3, arg4, arg1);
		} else if (arg2 == 2) {
			local3 = Static278.method4120(arg3, arg4, arg1);
		} else if (arg2 == 3) {
			local3 = Static67.method1135(arg3, arg4, arg1);
		}
		@Pc(54) int local54 = (int) (local3 >>> 32) & Integer.MAX_VALUE;
		@Pc(65) int local65 = (int) local3 >> 14 & 0x1F;
		@Pc(72) int local72 = (int) local3 >> 20 & 0x3;
		@Pc(78) Class43 local78 = Static189.method3080(local54);
		if (local78.method1005()) {
			Static246.method3805(arg3, arg4, arg1, local78);
		}
		if (local3 == 0L) {
			return;
		}
		@Pc(94) Class22 local94 = null;
		@Pc(96) Class22 local96 = null;
		if (arg2 == 0) {
			@Pc(217) Class61 local217 = Static59.method1018(arg3, arg4, arg1);
			if (local217 != null) {
				local94 = local217.aClass22_2;
				local96 = local217.aClass22_3;
			}
			if (local78.anInt1181 != 0) {
				arg0.method3122(!local78.aBoolean96, local72, arg4, local65, local78.aBoolean85, arg1);
			}
		} else if (arg2 == 1) {
			@Pc(201) Class102 local201 = Static1.method31(arg3, arg4, arg1);
			if (local201 != null) {
				local96 = local201.aClass22_5;
				local94 = local201.aClass22_4;
			}
		} else if (arg2 == 2) {
			@Pc(111) Class60 local111 = Static268.method4664(arg3, arg4, arg1);
			if (local111 != null) {
				local94 = local111.aClass22_1;
			}
			if (local78.anInt1181 != 0 && local78.anInt1185 + arg4 < 104 && arg1 + local78.anInt1185 < 104 && arg4 + local78.anInt1153 < 104 && local78.anInt1153 + arg1 < 104) {
				arg0.method3126(local78.aBoolean85, local78.anInt1153, arg4, arg1, !local78.aBoolean96, local78.anInt1185, local72);
			}
		} else if (arg2 == 3) {
			@Pc(178) Class171 local178 = Static177.method1742(arg3, arg4, arg1);
			if (local178 != null) {
				local94 = local178.aClass22_10;
			}
			if (local78.anInt1181 == 1) {
				arg0.method3133(arg4, arg1);
			}
		}
		if (local78.anIntArray97 != null) {
			local78 = local78.method1009();
		}
		if (!Static291.aBoolean404 || local78 == null || !local78.aBoolean88) {
			return;
		}
		if (local65 == 2) {
			if (local94 instanceof Class22_Sub5) {
				((Class22_Sub5) local94).method1833();
			} else {
				Static6.method98(arg5, local78, local72 + 4, arg1, arg4, 0, 0, local65);
			}
			if (local96 instanceof Class22_Sub5) {
				((Class22_Sub5) local96).method1833();
			} else {
				Static6.method98(arg5, local78, local72 + 1 & 0x3, arg1, arg4, 0, 0, local65);
			}
		} else if (local65 == 5) {
			if (local94 instanceof Class22_Sub5) {
				((Class22_Sub5) local94).method1833();
			} else {
				Static6.method98(arg5, local78, local72, arg1, arg4, Static239.anIntArray435[local72] * 8, Static13.anIntArray20[local72] * 8, 4);
			}
		} else if (local65 == 6) {
			if (local94 instanceof Class22_Sub5) {
				((Class22_Sub5) local94).method1833();
			} else {
				Static6.method98(arg5, local78, local72 + 4, arg1, arg4, Static88.anIntArray128[local72] * 8, Static233.anIntArray429[local72] * 8, 4);
			}
		} else if (local65 == 7) {
			if (local94 instanceof Class22_Sub5) {
				((Class22_Sub5) local94).method1833();
			} else {
				Static6.method98(arg5, local78, (local72 + 2 & 0x3) + 4, arg1, arg4, 0, 0, 4);
			}
		} else if (local65 == 8) {
			if (local94 instanceof Class22_Sub5) {
				((Class22_Sub5) local94).method1833();
			} else {
				Static6.method98(arg5, local78, local72 + 4, arg1, arg4, Static88.anIntArray128[local72] * 8, Static233.anIntArray429[local72] * 8, 4);
			}
			if (local96 instanceof Class22_Sub5) {
				((Class22_Sub5) local96).method1833();
			} else {
				Static6.method98(arg5, local78, (local72 + 2 & 0x3) + 4, arg1, arg4, Static88.anIntArray128[local72] * 8, Static233.anIntArray429[local72] * 8, 4);
			}
		} else if (local65 == 11) {
			if (local94 instanceof Class22_Sub5) {
				((Class22_Sub5) local94).method1833();
			} else {
				Static6.method98(arg5, local78, local72 + 4, arg1, arg4, 0, 0, 10);
			}
		} else if (local94 instanceof Class22_Sub5) {
			((Class22_Sub5) local94).method1833();
		} else {
			Static6.method98(arg5, local78, local72, arg1, arg4, 0, 0, local65);
		}
	}
}
