import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mo", name = "Y", descriptor = "Lclient!jk;")
	public static Class124 aClass124_7;

	@OriginalMember(owner = "client!mo", name = "gb", descriptor = "I")
	public static int anInt4611;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
	public static int anInt4601 = 0;

	@OriginalMember(owner = "client!mo", name = "T", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(Z)V")
	public static void method3630() {
		for (@Pc(7) int local7 = 0; local7 < Static383.anInt6392; local7++) {
			@Pc(13) int local13 = Static377.anIntArray423[local7];
			@Pc(17) Class25_Sub5_Sub1_Sub1 local17 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local13];
			@Pc(21) int local21 = Static336.aClass1_Sub28_Sub1_2.method5337();
			if ((local21 & 0x4) != 0) {
				local21 += Static336.aClass1_Sub28_Sub1_2.method5337() << 8;
			}
			if ((local21 & 0x2000) != 0) {
				local17.aByte63 = Static336.aClass1_Sub28_Sub1_2.method5377();
				local17.aByte62 = Static336.aClass1_Sub28_Sub1_2.method5367();
				local17.aByte60 = Static336.aClass1_Sub28_Sub1_2.method5391();
				local17.aByte61 = (byte) Static336.aClass1_Sub28_Sub1_2.method5337();
				local17.anInt4251 = Static236.anInt4213 + Static336.aClass1_Sub28_Sub1_2.method5375();
				local17.anInt4305 = Static236.anInt4213 + Static336.aClass1_Sub28_Sub1_2.method5375();
			}
			@Pc(87) int local87;
			@Pc(98) int local98;
			if ((local21 & 0x1) != 0) {
				local87 = Static336.aClass1_Sub28_Sub1_2.method5335();
				if (local87 == 65535) {
					local87 = -1;
				}
				local98 = Static336.aClass1_Sub28_Sub1_2.method5337();
				Static322.method4325(local87, local17, local98);
			}
			if ((local21 & 0x800) != 0) {
				local87 = Static336.aClass1_Sub28_Sub1_2.method5341();
				local17.anInt4236 = Static336.aClass1_Sub28_Sub1_2.method5390();
				local17.anInt4254 = Static336.aClass1_Sub28_Sub1_2.method5390();
				local17.aBoolean482 = (local87 & 0x8000) != 0;
				local17.anInt4245 = local87 & 0x7FFF;
				local17.anInt4307 = Static236.anInt4213 + local17.anInt4245 + local17.anInt4236;
			}
			@Pc(168) int local168;
			if ((local21 & 0x200) != 0) {
				local87 = Static336.aClass1_Sub28_Sub1_2.method5341();
				if (local87 == 65535) {
					local87 = -1;
				}
				local98 = Static336.aClass1_Sub28_Sub1_2.method5361();
				local168 = Static336.aClass1_Sub28_Sub1_2.method5363();
				local17.method3418(local98, local87, local168, true);
			}
			if ((local21 & 0x2) != 0) {
				local87 = Static336.aClass1_Sub28_Sub1_2.method5392();
				local98 = Static336.aClass1_Sub28_Sub1_2.method5337();
				local17.method3420(local87, Static236.anInt4213, local98);
				local17.anInt4312 = Static236.anInt4213 + 300;
				local17.anInt4263 = Static336.aClass1_Sub28_Sub1_2.method5396();
			}
			if ((local21 & 0x80) != 0) {
				local87 = Static336.aClass1_Sub28_Sub1_2.method5336();
				local98 = Static336.aClass1_Sub28_Sub1_2.method5358();
				if (local87 == 65535) {
					local87 = -1;
				}
				local168 = Static336.aClass1_Sub28_Sub1_2.method5390();
				local17.method3418(local98, local87, local168, false);
			}
			if ((local21 & 0x8) != 0) {
				local87 = Static336.aClass1_Sub28_Sub1_2.method5392();
				local98 = Static336.aClass1_Sub28_Sub1_2.method5396();
				local17.method3420(local87, Static236.anInt4213, local98);
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt4238 = Static336.aClass1_Sub28_Sub1_2.method5336();
				if (local17.anInt4238 == 65535) {
					local17.anInt4238 = -1;
				}
			}
			if ((local21 & 0x1000) != 0) {
				local17.anInt3127 = Static336.aClass1_Sub28_Sub1_2.method5336();
				local17.anInt3109 = Static336.aClass1_Sub28_Sub1_2.method5335();
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt4286 = Static336.aClass1_Sub28_Sub1_2.method5367();
				local17.anInt4282 = Static336.aClass1_Sub28_Sub1_2.method5353();
				local17.anInt4289 = Static336.aClass1_Sub28_Sub1_2.method5353();
				local17.anInt4292 = Static336.aClass1_Sub28_Sub1_2.method5353();
				local17.anInt4285 = Static336.aClass1_Sub28_Sub1_2.method5336() + Static236.anInt4213;
				local17.anInt4244 = Static336.aClass1_Sub28_Sub1_2.method5375() + Static236.anInt4213;
				local17.anInt4273 = Static336.aClass1_Sub28_Sub1_2.method5363();
				local17.anInt4316 = 0;
				local17.anInt4314 = 1;
				local17.anInt4292 += local17.anIntArray284[0];
				local17.anInt4282 += local17.anIntArray284[0];
				local17.anInt4286 += local17.anIntArray283[0];
				local17.anInt4289 += local17.anIntArray283[0];
			}
			if ((local21 & 0x100) != 0) {
				local87 = Static336.aClass1_Sub28_Sub1_2.method5390();
				@Pc(383) int[] local383 = new int[local87];
				@Pc(386) int[] local386 = new int[local87];
				@Pc(389) int[] local389 = new int[local87];
				for (@Pc(391) int local391 = 0; local391 < local87; local391++) {
					@Pc(397) int local397 = Static336.aClass1_Sub28_Sub1_2.method5341();
					if (local397 == 65535) {
						local397 = -1;
					}
					local383[local391] = local397;
					local386[local391] = Static336.aClass1_Sub28_Sub1_2.method5337();
					local389[local391] = Static336.aClass1_Sub28_Sub1_2.method5335();
				}
				Static299.method5822(local17, local389, local386, local383);
			}
			if ((local21 & 0x40) != 0) {
				local17.aString50 = Static336.aClass1_Sub28_Sub1_2.method5381();
				local17.anInt4291 = 100;
			}
			if ((local21 & 0x10) != 0) {
				if (local17.aClass54_1.method1155()) {
					Static329.method4419(local17);
				}
				local17.method2590(Static161.aClass231_2.method5022(Static336.aClass1_Sub28_Sub1_2.method5375()));
				local17.method3431(local17.aClass54_1.anInt1348);
				local17.anInt4274 = local17.aClass54_1.anInt1325 << 3;
				if (local17.aClass54_1.method1155()) {
					Static81.method1356(local17.aByte94, 0, local17.anIntArray284[0], null, local17, local17.anIntArray283[0], null);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(Z)V")
	public static void method3631(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static359.aClass169ArrayArrayArray5 = Static145.aClass169ArrayArrayArray4;
			Static94.aClass157Array1 = Static343.aClass157Array3;
		} else {
			Static359.aClass169ArrayArrayArray5 = Static7.aClass169ArrayArrayArray1;
			Static94.aClass157Array1 = Static330.aClass157Array2;
		}
		Static105.anInt1943 = Static359.aClass169ArrayArrayArray5.length;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method3632(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local10++;
			} else if (local23 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}
}
