import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	public static int anInt5829 = 0;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)I")
	public static int method4505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)Z")
	public static boolean method4506(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static219.anInt4078; local1 < Static338.anInt5952; local1++) {
			@Pc(6) Class53[][] local6 = Static40.aClass53ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static116.anInt2459; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static50.anInt1363 + local9;
				@Pc(18) int local18 = Static50.anInt1363 - local9;
				if (local14 >= Static127.anInt2572 || local18 < Static59.anInt1569) {
					for (@Pc(27) int local27 = -Static116.anInt2459; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static354.anInt6362 + local27;
						@Pc(36) int local36 = Static354.anInt6362 - local27;
						@Pc(48) Class53 local48;
						if (local14 >= Static127.anInt2572) {
							if (local32 >= Static180.anInt3345) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean129) {
									Static386.aBoolean447 = arg0;
									Static275.aClass16_1.method5251(local48);
									Static275.aClass16_1.method5252();
								}
							}
							if (local36 < Static65.anInt1629) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean129) {
									Static386.aBoolean447 = arg0;
									Static275.aClass16_1.method5251(local48);
									Static275.aClass16_1.method5252();
								}
							}
						}
						if (local18 < Static59.anInt1569) {
							if (local32 >= Static180.anInt3345) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean129) {
									Static386.aBoolean447 = arg0;
									Static275.aClass16_1.method5251(local48);
									Static275.aClass16_1.method5252();
								}
							}
							if (local36 < Static65.anInt1629) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean129) {
									Static386.aBoolean447 = arg0;
									Static275.aClass16_1.method5251(local48);
									Static275.aClass16_1.method5252();
								}
							}
						}
						if (Static68.anInt4582 == 0) {
							if (Static412.aBoolean474) {
								Static275.aClass16_1.method5250(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	public static void method4508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static126.aClass67_Sub1_1.anInt5852 != 0 && arg2 != 0 && Static425.anInt7124 < 50 && arg0 != -1) {
			Static246.aClass200Array1[Static425.anInt7124++] = new Class200((byte) 2, arg0, arg2, arg3, arg1, 0);
		}
	}
}
