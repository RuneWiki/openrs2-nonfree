import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	public static final int anInt2744 = 1337;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)V")
	public static void method2558(@OriginalArg(0) int arg0) {
		Static272.anInt4913 = -1;
		if (arg0 == 37) {
			Static491.aFloat24 = 3.0F;
		} else if (arg0 == 50) {
			Static491.aFloat24 = 4.0F;
		} else if (arg0 == 75) {
			Static491.aFloat24 = 6.0F;
		} else if (arg0 == 100) {
			Static491.aFloat24 = 8.0F;
		} else if (arg0 == 200) {
			Static491.aFloat24 = 16.0F;
		}
		Static272.anInt4913 = -1;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2561(@OriginalArg(0) String arg0) {
		if (!Static556.aClass349_4.aBoolean601) {
			return -1;
		} else if (Static96.aHashtable19.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(22) String local22 = Static11.method156(arg0);
			if (local22 == null) {
				return -1;
			}
			@Pc(46) String local46 = Static151.aString21 + local22;
			if (!Static111.aClass126_62.method3072("", local46)) {
				return -1;
			} else if (Static111.aClass126_62.method3074(local46)) {
				@Pc(72) byte[] local72 = Static111.aClass126_62.method3073("", local46);
				@Pc(78) File local78;
				try {
					local78 = Static10.method149(local22);
				} catch (@Pc(80) RuntimeException local80) {
					return -1;
				}
				if (local72 == null || local78 == null) {
					return -1;
				}
				@Pc(90) boolean local90 = true;
				@Pc(94) byte[] local94 = Static165.method3007(local78);
				if (local94 != null && local94.length == local72.length) {
					for (@Pc(105) int local105 = 0; local105 < local94.length; local105++) {
						if (local94[local105] != local72[local105]) {
							local90 = false;
							break;
						}
					}
				} else {
					local90 = false;
				}
				try {
					if (!local90) {
						Static556.aClass349_4.method7732(local78, local72);
					}
				} catch (@Pc(147) Throwable local147) {
					return -1;
				}
				Static461.method6498(local78, arg0);
				return 100;
			} else {
				return Static111.aClass126_62.method3087(local46);
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z")
	public static boolean method2562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static490.aBoolean536) {
			return false;
		}
		@Pc(14) int local14 = arg1 >> 16;
		@Pc(18) int local18 = arg1 & 0xFFFF;
		if (Static397.aClass238ArrayArray2[local14] == null || Static397.aClass238ArrayArray2[local14][local18] == null) {
			return false;
		}
		@Pc(47) Class238 local47 = Static397.aClass238ArrayArray2[local14][local18];
		@Pc(60) Class5_Sub1_Sub13 local60;
		if (arg0 == -1 && local47.anInt5976 == 0) {
			for (local60 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local60 != null; local60 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
				if (local60.anInt6068 == 9 || local60.anInt6068 == 1007 || local60.anInt6068 == 53 || local60.anInt6068 == 22 || local60.anInt6068 == 48) {
					for (@Pc(179) Class238 local179 = Static305.method4761(local60.anInt6069); local179 != null; local179 = Static300.method4694(local179)) {
						if (local47.anInt5971 == local179.anInt5971) {
							return true;
						}
					}
				}
			}
		} else {
			for (local60 = (Class5_Sub1_Sub13) Static399.aClass20_33.method378(); local60 != null; local60 = (Class5_Sub1_Sub13) Static399.aClass20_33.method366()) {
				if (local60.anInt6066 == arg0 && local47.anInt5971 == local60.anInt6069 && (local60.anInt6068 == 9 || local60.anInt6068 == 1007 || local60.anInt6068 == 53 || local60.anInt6068 == 22 || local60.anInt6068 == 48)) {
					return true;
				}
			}
		}
		return false;
	}
}
