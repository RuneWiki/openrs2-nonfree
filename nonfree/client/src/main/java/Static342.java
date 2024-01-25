import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_225 = new Class106("M", "M", "M", "M");

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
	public static int anInt6501 = -1;

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "[[I")
	public static final int[][] anIntArrayArray71 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
	public static int anInt6506 = 0;

	@OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
	public static int anInt6507 = 1;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Lclient!ik;")
	public static Class11_Sub5 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub5_2;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLclient!ia;)V")
	public static void method5728(@OriginalArg(1) Class1_Sub22 arg0) {
		if (!Static217.aBoolean322) {
			arg0.method6045();
			Static224.anInt4512--;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)Z")
	public static boolean method5732(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static112.anInt2495; local1 < Static263.anInt5201; local1++) {
			@Pc(6) Class155[][] local6 = Static105.aClass155ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static87.anInt1923; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static79.anInt1760 + local9;
				@Pc(18) int local18 = Static79.anInt1760 - local9;
				if (local14 >= Static144.anInt3085 || local18 < Static330.anInt6234) {
					for (@Pc(27) int local27 = -Static87.anInt1923; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static42.anInt1018 + local27;
						@Pc(36) int local36 = Static42.anInt1018 - local27;
						@Pc(48) Class155 local48;
						if (local14 >= Static144.anInt3085) {
							if (local32 >= Static192.anInt3871) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean339) {
									Static90.aBoolean145 = arg0;
									Static286.aClass118_4.method5662(local48);
									Static286.aClass118_4.method5665();
								}
							}
							if (local36 < Static21.anInt519) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean339) {
									Static90.aBoolean145 = arg0;
									Static286.aClass118_4.method5662(local48);
									Static286.aClass118_4.method5665();
								}
							}
						}
						if (local18 < Static330.anInt6234) {
							if (local32 >= Static192.anInt3871) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean339) {
									Static90.aBoolean145 = arg0;
									Static286.aClass118_4.method5662(local48);
									Static286.aClass118_4.method5665();
								}
							}
							if (local36 < Static21.anInt519) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean339) {
									Static90.aBoolean145 = arg0;
									Static286.aClass118_4.method5662(local48);
									Static286.aClass118_4.method5665();
								}
							}
						}
						if (Static91.anInt7043 == 0) {
							if (Static314.aBoolean451) {
								Static286.aClass118_4.method5668(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(Z)V")
	public static void method5734() {
		@Pc(1) Class21 local1 = Static288.aClass21_147;
		synchronized (Static288.aClass21_147) {
			Static288.aClass21_147.method851();
		}
		local1 = Static19.aClass21_18;
		synchronized (Static19.aClass21_18) {
			Static19.aClass21_18.method851();
		}
	}
}
