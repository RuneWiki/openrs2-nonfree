import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mp", name = "R", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!mp", name = "S", descriptor = "[I")
	public static int[] anIntArray442;

	@OriginalMember(owner = "client!mp", name = "T", descriptor = "I")
	public static int anInt6903;

	@OriginalMember(owner = "client!mp", name = "Q", descriptor = "Lclient!bc;")
	public static final Class25 aClass25_25 = new Class25(64);

	@OriginalMember(owner = "client!mp", name = "U", descriptor = "[I")
	public static int[] anIntArray443 = new int[2];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!oa;II)Lclient!sga;")
	public static Class297 method5746(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class27 local14 = Static471.method7247(true, arg0, arg1);
		return local14 == null ? null : local14.aClass297_5;
	}

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "(B)V")
	public static void method5747() {
		for (@Pc(10) int local10 = 0; local10 < Static452.anInt3253; local10++) {
			@Pc(15) int local15 = Static139.anIntArray206[local10];
			@Pc(25) Class2_Sub2_Sub1_Sub2 local25 = ((Class3_Sub46) aClass25_25.method946((long) local15)).aClass2_Sub2_Sub1_Sub2_2;
			@Pc(29) int local29 = Static89.aClass3_Sub7_Sub1_2.method6538();
			if ((local29 & 0x20) != 0) {
				local29 += Static89.aClass3_Sub7_Sub1_2.method6538() << 8;
			}
			if ((local29 & 0x200) != 0) {
				local25.aByte79 = Static89.aClass3_Sub7_Sub1_2.method6523();
				local25.aByte78 = Static89.aClass3_Sub7_Sub1_2.method6526();
				local25.aByte80 = Static89.aClass3_Sub7_Sub1_2.method6526();
				local25.aByte81 = (byte) Static89.aClass3_Sub7_Sub1_2.method6505();
				local25.anInt7593 = Static129.anInt10429 + Static89.aClass3_Sub7_Sub1_2.method6521();
				local25.anInt7624 = Static129.anInt10429 + Static89.aClass3_Sub7_Sub1_2.method6521();
			}
			@Pc(104) int local104;
			@Pc(108) int local108;
			@Pc(117) int local117;
			if ((local29 & 0x1) != 0) {
				local104 = Static89.aClass3_Sub7_Sub1_2.method6532();
				local108 = Static89.aClass3_Sub7_Sub1_2.method6544();
				if (local104 == 65535) {
					local104 = -1;
				}
				local117 = Static89.aClass3_Sub7_Sub1_2.method6555();
				local25.method6313(false, local104, local117, local108);
			}
			if ((local29 & 0x1000) != 0) {
				local104 = Static89.aClass3_Sub7_Sub1_2.method6538();
				@Pc(135) int[] local135 = new int[local104];
				@Pc(138) int[] local138 = new int[local104];
				@Pc(141) int[] local141 = new int[local104];
				for (@Pc(143) int local143 = 0; local143 < local104; local143++) {
					@Pc(148) int local148 = Static89.aClass3_Sub7_Sub1_2.method6521();
					if (local148 == 65535) {
						local148 = -1;
					}
					local135[local143] = local148;
					local138[local143] = Static89.aClass3_Sub7_Sub1_2.method6555();
					local141[local143] = Static89.aClass3_Sub7_Sub1_2.method6541();
				}
				Static532.method7859(local141, local138, local135, local25);
			}
			if ((local29 & 0x10) != 0) {
				local25.anInt7680 = Static89.aClass3_Sub7_Sub1_2.method6535();
				local25.anInt7661 = Static89.aClass3_Sub7_Sub1_2.method6535();
			}
			if ((local29 & 0x800) != 0) {
				local25.anInt7654 = Static89.aClass3_Sub7_Sub1_2.method6517();
				local25.anInt7607 = Static89.aClass3_Sub7_Sub1_2.method6523();
				local25.anInt7644 = Static89.aClass3_Sub7_Sub1_2.method6526();
				local25.anInt7602 = Static89.aClass3_Sub7_Sub1_2.method6523();
				local25.anInt7616 = Static89.aClass3_Sub7_Sub1_2.method6535() + Static129.anInt10429;
				local25.anInt7633 = Static89.aClass3_Sub7_Sub1_2.method6535() + Static129.anInt10429;
				local25.anInt7597 = Static89.aClass3_Sub7_Sub1_2.method6505();
				local25.anInt7607 += local25.anIntArray488[0];
				local25.anInt7644 += local25.anIntArray487[0];
				local25.anInt7660 = 1;
				local25.anInt7654 += local25.anIntArray487[0];
				local25.anInt7602 += local25.anIntArray488[0];
				local25.anInt7659 = 0;
			}
			if ((local29 & 0x40) != 0) {
				local25.anInt7634 = Static89.aClass3_Sub7_Sub1_2.method6541();
				if (local25.anInt7634 == 65535) {
					local25.anInt7634 = -1;
				}
			}
			if ((local29 & 0x8) != 0) {
				@Pc(317) int[] local317 = new int[4];
				for (local108 = 0; local108 < 4; local108++) {
					local317[local108] = Static89.aClass3_Sub7_Sub1_2.method6521();
					if (local317[local108] == 65535) {
						local317[local108] = -1;
					}
				}
				local117 = Static89.aClass3_Sub7_Sub1_2.method6505();
				Static517.method7683(local317, local25, local117);
			}
			if ((local29 & 0x2000) != 0) {
				local104 = Static89.aClass3_Sub7_Sub1_2.method6542();
				local108 = Static89.aClass3_Sub7_Sub1_2.method6538();
				local25.method6305(local108, Static129.anInt10429, local104);
			}
			if ((local29 & 0x2) != 0) {
				if (local25.aClass169_1.method4176()) {
					Static432.method4773(local25);
				}
				local25.method6322(Static121.aClass118_2.method3029(Static89.aClass3_Sub7_Sub1_2.method6535()));
				local25.method6315(local25.aClass169_1.anInt4979);
				local25.anInt7591 = local25.aClass169_1.anInt4970 << 3;
				if (local25.aClass169_1.method4176()) {
					Static93.method2098(local25.anIntArray487[0], null, local25, 0, null, local25.aByte103, local25.anIntArray488[0]);
				}
			}
			if ((local29 & 0x4) != 0) {
				local25.aString92 = Static89.aClass3_Sub7_Sub1_2.method6536();
				local25.anInt7632 = 100;
			}
			if ((local29 & 0x100) != 0) {
				local104 = Static89.aClass3_Sub7_Sub1_2.method6532();
				local108 = Static89.aClass3_Sub7_Sub1_2.method6497();
				if (local104 == 65535) {
					local104 = -1;
				}
				local117 = Static89.aClass3_Sub7_Sub1_2.method6555();
				local25.method6313(true, local104, local117, local108);
			}
			if ((local29 & 0x80) != 0) {
				local104 = Static89.aClass3_Sub7_Sub1_2.method6542();
				local108 = Static89.aClass3_Sub7_Sub1_2.method6538();
				local25.method6305(local108, Static129.anInt10429, local104);
				local25.anInt7647 = Static129.anInt10429 + 300;
				local25.anInt7630 = Static89.aClass3_Sub7_Sub1_2.method6505();
			}
			if ((local29 & 0x400) != 0) {
				local104 = Static89.aClass3_Sub7_Sub1_2.method6541();
				local25.anInt7635 = Static89.aClass3_Sub7_Sub1_2.method6547();
				local25.anInt7595 = Static89.aClass3_Sub7_Sub1_2.method6547();
				local25.aBoolean646 = (local104 & 0x8000) != 0;
				local25.anInt7637 = local104 & 0x7FFF;
				local25.anInt7643 = Static129.anInt10429 + local25.anInt7637 + local25.anInt7635;
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z")
	public static boolean method5749() {
		if (Static116.aBoolean210) {
			try {
				if ((Boolean) Static603.method4977("showingVideoAd", Static253.anApplet3)) {
					return false;
				}
				return true;
			} catch (@Pc(24) Throwable local24) {
			}
		}
		return true;
	}
}
