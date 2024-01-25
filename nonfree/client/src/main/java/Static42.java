import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bha", name = "e", descriptor = "[S")
	private static final short[] aShortArray19 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!bha", name = "m", descriptor = "[S")
	private static final short[] aShortArray20 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!bha", name = "p", descriptor = "[S")
	public static final short[] aShortArray21 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!bha", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray19, aShortArray20, aShortArray21 };

	@OriginalMember(owner = "client!bha", name = "l", descriptor = "[I")
	public static final int[] anIntArray81 = new int[14];

	@OriginalMember(owner = "client!bha", name = "t", descriptor = "I")
	public static int anInt973 = 0;

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
	public static void method1060() {
		Static456.method8151(Static678.aClass260_21);
		Static621.anInt9954++;
		if (Static423.aBoolean482 && Static196.aBoolean288) {
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			if (Static82.aBoolean134) {
				local24 = Static31.method748();
				local26 = Static147.method2738();
			}
			@Pc(40) int local40 = Static22.aClass16_2.method5885() + local24;
			@Pc(46) int local46 = Static22.aClass16_2.method5887() + local26;
			local40 -= Static583.anInt9381;
			local46 -= Static196.anInt3897;
			if (local40 < Static468.anInt7689) {
				local40 = Static468.anInt7689;
			}
			if (local46 < Static35.anInt811) {
				local46 = Static35.anInt811;
			}
			if (Static678.aClass260_21.anInt6963 + local40 > Static416.aClass260_13.anInt6963 + Static468.anInt7689) {
				local40 = Static468.anInt7689 + Static416.aClass260_13.anInt6963 - Static678.aClass260_21.anInt6963;
			}
			if (Static416.aClass260_13.anInt6971 + Static35.anInt811 < Static678.aClass260_21.anInt6971 + local46) {
				local46 = Static35.anInt811 + Static416.aClass260_13.anInt6971 - Static678.aClass260_21.anInt6971;
			}
			@Pc(118) int local118 = Static416.aClass260_13.anInt7013 + local40 - Static468.anInt7689;
			@Pc(126) int local126 = Static416.aClass260_13.anInt6946 + local46 - Static35.anInt811;
			@Pc(181) Class3_Sub17 local181;
			if (Static22.aClass16_2.method5888()) {
				if (Static678.aClass260_21.anInt7017 < Static621.anInt9954) {
					@Pc(139) int local139 = local40 - Static567.anInt5923;
					@Pc(144) int local144 = local46 - Static446.anInt5842;
					if (Static678.aClass260_21.anInt6986 < local139 || local139 < -Static678.aClass260_21.anInt6986 || Static678.aClass260_21.anInt6986 < local144 || local144 < -Static678.aClass260_21.anInt6986) {
						Static285.aBoolean751 = true;
					}
				}
				if (Static678.aClass260_21.anObjectArray14 != null && Static285.aBoolean751) {
					local181 = new Class3_Sub17();
					local181.anInt1766 = local126;
					local181.anInt1764 = local118;
					local181.anObjectArray2 = Static678.aClass260_21.anObjectArray14;
					local181.aClass260_6 = Static678.aClass260_21;
					Static565.method8015(local181);
					return;
				}
			} else {
				if (Static285.aBoolean751) {
					Static632.method8816();
					if (Static678.aClass260_21.anObjectArray8 != null) {
						local181 = new Class3_Sub17();
						local181.aClass260_6 = Static678.aClass260_21;
						local181.aClass260_5 = Static240.aClass260_11;
						local181.anInt1764 = local118;
						local181.anInt1766 = local126;
						local181.anObjectArray2 = Static678.aClass260_21.anObjectArray8;
						Static565.method8015(local181);
					}
					if (Static240.aClass260_11 != null && Static79.method1525(Static678.aClass260_21) != null) {
						Static95.method1726(Static678.aClass260_21, Static240.aClass260_11);
					}
				} else if ((Static229.anInt4277 == 1 || Static645.method8970()) && Static450.anInt7444 > 2) {
					Static89.method1665(Static196.anInt3897 + Static446.anInt5842, Static583.anInt9381 + Static567.anInt5923);
				} else if (Static257.method4210()) {
					Static89.method1665(Static196.anInt3897 + Static446.anInt5842, Static567.anInt5923 + Static583.anInt9381);
				}
				Static678.aClass260_21 = null;
			}
		} else if (Static621.anInt9954 > 1) {
			Static678.aClass260_21 = null;
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)I")
	public static int method1066() {
		@Pc(7) Class13 local7 = Static674.aClass13_22;
		@Pc(9) boolean local9 = false;
		if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local9 = true;
			local7 = Static550.method7865(0, (Class15) null, (Interface4) null, 0, local21);
		}
		@Pc(38) long local38 = Static524.method7320();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method8510();
		}
		@Pc(73) int local73 = (int) (Static524.method7320() - local38);
		local7.method8452(100, 0, 100, 0, -16777216);
		if (local9) {
			local7.method8459();
		}
		return local73;
	}
}
