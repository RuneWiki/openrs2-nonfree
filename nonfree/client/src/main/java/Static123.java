import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
	public static int[] anIntArray308;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!le;")
	public static Class50 aClass50_2 = new Class50();

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1605 = Static122.method531("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
	public static int anInt2855 = 0;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!f;II)Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3 method2099(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) int arg2) {
		return Static133.method2204(arg0, arg2, arg1) ? Static175.method2702() : null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method2100() {
		aClass50_2 = null;
		aClass73_1605 = null;
		anIntArray308 = null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method2101() {
		if (Static172.aBooleanArray17[98]) {
			Static2.anInt12 += (12 - Static2.anInt12) / 2;
		} else if (Static172.aBooleanArray17[99]) {
			Static2.anInt12 += (-Static2.anInt12 - 12) / 2;
		} else {
			Static2.anInt12 /= 2;
		}
		Static84.anInt1889 += Static2.anInt12 / 2;
		if (Static172.aBooleanArray17[96]) {
			Static9.anInt268 += (-Static9.anInt268 - 24) / 2;
		} else if (Static172.aBooleanArray17[97]) {
			Static9.anInt268 += (24 - Static9.anInt268) / 2;
		} else {
			Static9.anInt268 /= 2;
		}
		@Pc(82) int local82 = Static150.anInt3587 + Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169;
		Static25.anInt716 = Static25.anInt716 + Static9.anInt268 / 2 & 0x7FF;
		if (Static84.anInt1889 < 128) {
			Static84.anInt1889 = 128;
		}
		@Pc(103) int local103 = anInt2855 + Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159;
		if (Static43.anInt1006 - local82 < -500 || Static43.anInt1006 - local82 > 500 || Static28.anInt748 - local103 < -500 || Static28.anInt748 - local103 > 500) {
			Static28.anInt748 = local103;
			Static43.anInt1006 = local82;
		}
		if (Static84.anInt1889 > 383) {
			Static84.anInt1889 = 383;
		}
		@Pc(139) int local139 = 0;
		if (local82 != Static43.anInt1006) {
			Static43.anInt1006 += (local82 - Static43.anInt1006) / 16;
		}
		@Pc(159) int local159 = Static43.anInt1006 >> 7;
		if (Static28.anInt748 != local103) {
			Static28.anInt748 += (local103 - Static28.anInt748) / 16;
		}
		@Pc(179) int local179 = Static28.anInt748 >> 7;
		@Pc(185) int local185 = Static107.method1922(Static43.anInt1006, Static28.anInt748, Static147.anInt3309);
		@Pc(207) int local207;
		if (local159 > 3 && local179 > 3 && local159 < 100 && local179 < 100) {
			for (local207 = local159 - 4; local207 <= local159 + 4; local207++) {
				for (@Pc(213) int local213 = local179 - 4; local213 <= local179 + 4; local213++) {
					@Pc(217) int local217 = Static147.anInt3309;
					if (local217 < 3 && (Static110.aByteArrayArrayArray5[1][local207][local213] & 0x2) == 2) {
						local217++;
					}
					@Pc(244) int local244 = local185 - Static65.anIntArrayArrayArray5[local217][local207][local213];
					if (local244 > local139) {
						local139 = local244;
					}
				}
			}
		}
		local207 = local139 * 192;
		if (local207 > 98048) {
			local207 = 98048;
		}
		if (local207 < 32768) {
			local207 = 32768;
		}
		if (Static48.anInt1129 < local207) {
			Static48.anInt1129 += (local207 - Static48.anInt1129) / 24;
		} else if (local207 < Static48.anInt1129) {
			Static48.anInt1129 += (local207 - Static48.anInt1129) / 80;
		}
	}
}
