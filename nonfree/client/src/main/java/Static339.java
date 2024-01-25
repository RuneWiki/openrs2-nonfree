import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	public static int anInt6262 = 0;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	public static int anInt6265 = 0;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[8];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)I")
	public static int method5448() {
		if (Static358.aBoolean467) {
			return 0;
		} else if (Static40.method575()) {
			return Static314.aBoolean421 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)I")
	public static int method5449() {
		return 16;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIB)I")
	public static int method5452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILclient!va;)V")
	public static void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1 arg3) {
		@Pc(4) Class188 local4 = Static226.method4116(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub1_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
	public static void method5454() {
		@Pc(5) Class41 local5 = Static281.aClass41_61;
		synchronized (Static281.aClass41_61) {
			Static281.aClass41_61.method826(5);
		}
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(Z)V")
	public static void method5457() {
		Static128.method2229(Static268.aClass3_13);
		Static328.anInt6054++;
		if (Static305.aBoolean492 && Static302.aBoolean412) {
			@Pc(26) int local26 = Static136.aClass91_2.method5223();
			@Pc(30) int local30 = Static136.aClass91_2.method5224();
			local26 -= Static180.anInt3782;
			local30 -= Static334.anInt6175;
			if (local26 < Static181.anInt3816) {
				local26 = Static181.anInt3816;
			}
			if (Static181.anInt3816 + Static220.aClass3_10.anInt64 < Static268.aClass3_13.anInt64 + local26) {
				local26 = Static181.anInt3816 + Static220.aClass3_10.anInt64 - Static268.aClass3_13.anInt64;
			}
			if (local30 < Static385.anInt7008) {
				local30 = Static385.anInt7008;
			}
			if (Static220.aClass3_10.anInt116 + Static385.anInt7008 < Static268.aClass3_13.anInt116 + local30) {
				local30 = Static385.anInt7008 + Static220.aClass3_10.anInt116 - Static268.aClass3_13.anInt116;
			}
			@Pc(101) int local101 = Static220.aClass3_10.anInt81 + local26 - Static181.anInt3816;
			@Pc(113) int local113 = Static220.aClass3_10.anInt93 + local30 - Static385.anInt7008;
			@Pc(160) Class2_Sub5 local160;
			if (Static136.aClass91_2.method5226()) {
				if (Static328.anInt6054 > Static268.aClass3_13.anInt106) {
					@Pc(126) int local126 = local26 - Static59.anInt1275;
					@Pc(131) int local131 = local30 - Static40.anInt718;
					if (local126 > Static268.aClass3_13.anInt77 || local126 < -Static268.aClass3_13.anInt77 || Static268.aClass3_13.anInt77 < local131 || local131 < -Static268.aClass3_13.anInt77) {
						Static191.aBoolean362 = true;
					}
				}
				if (Static268.aClass3_13.anObjectArray2 != null && Static191.aBoolean362) {
					local160 = new Class2_Sub5();
					local160.aClass3_4 = Static268.aClass3_13;
					local160.anInt479 = local113;
					local160.anInt482 = local101;
					local160.anObjectArray33 = Static268.aClass3_13.anObjectArray2;
					Static351.method5589(local160);
					return;
				}
			} else {
				if (Static191.aBoolean362) {
					Static49.method729();
					if (Static268.aClass3_13.anObjectArray29 != null) {
						local160 = new Class2_Sub5();
						local160.anInt479 = local113;
						local160.anInt482 = local101;
						local160.aClass3_4 = Static268.aClass3_13;
						local160.aClass3_3 = Static360.aClass3_18;
						local160.anObjectArray33 = Static268.aClass3_13.anObjectArray29;
						Static351.method5589(local160);
					}
					if (Static360.aClass3_18 != null && Static51.method788(Static268.aClass3_13) != null) {
						Static335.method5403(Static360.aClass3_18, Static268.aClass3_13);
					}
				} else if ((Static251.anInt4857 == 1 || Static15.method175()) && Static233.anInt4642 > 2) {
					Static300.method4908(Static180.anInt3782 + Static59.anInt1275, Static40.anInt718 + Static334.anInt6175);
				} else if (Static1.method6022()) {
					Static300.method4908(Static59.anInt1275 + Static180.anInt3782, Static40.anInt718 + Static334.anInt6175);
				}
				Static268.aClass3_13 = null;
			}
		} else if (Static328.anInt6054 > 1) {
			Static268.aClass3_13 = null;
		}
	}
}
