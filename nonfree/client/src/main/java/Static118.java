import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public static int anInt2519 = 0;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1162 = Static187.method3089("Username: ");

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1161 = aClass92_1162;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	public static int anInt2521 = 0;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1163 = Static187.method3089("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1164 = Static187.method3089("huffman");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)V")
	public static void method1732(@OriginalArg(0) boolean arg0) {
		if (Static15.aClass8_Sub3_Sub1_1.anInt3600 >> 7 == Static120.anInt2555 && Static189.anInt4125 == Static15.aClass8_Sub3_Sub1_1.anInt3606 >> 7) {
			Static120.anInt2555 = 0;
		}
		@Pc(25) int local25 = Static35.anInt992;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(48) Class8_Sub3_Sub1 local48;
			@Pc(42) long local42;
			if (arg0) {
				local42 = 8791798054912L;
				local48 = Static15.aClass8_Sub3_Sub1_1;
			} else {
				local42 = (long) Static111.anIntArray181[local31] << 32;
				local48 = Static47.aClass8_Sub3_Sub1Array1[Static111.anIntArray181[local31]];
			}
			if (local48 != null && local48.method2681()) {
				local48.aBoolean62 = false;
				if ((Static111.aBoolean141 && Static35.anInt992 > 50 || Static35.anInt992 > 200) && !arg0 && local48.anInt3574 == local48.anInt3616) {
					local48.aBoolean62 = true;
				}
				@Pc(94) int local94 = local48.anInt3600 >> 7;
				@Pc(99) int local99 = local48.anInt3606 >> 7;
				if (local94 >= 0 && local94 < 104 && local99 >= 0 && local99 < 104) {
					if (local48.aClass8_Sub5_1 == null || Static155.anInt2981 < local48.anInt979 || local48.anInt974 <= Static155.anInt2981) {
						if ((local48.anInt3600 & 0x7F) == 64 && (local48.anInt3606 & 0x7F) == 64) {
							if (Static202.anInt4411 == Static201.anIntArrayArray32[local94][local99]) {
								continue;
							}
							Static201.anIntArrayArray32[local94][local99] = Static202.anInt4411;
						}
						local48.anInt3563 = Static64.method1027(local48.anInt3606, local48.anInt3600, Static192.anInt4180);
						Static5.method99(Static192.anInt4180, local48.anInt3600, local48.anInt3606, local48.anInt3563, 60, local48, local48.anInt3611, local42, local48.aBoolean200);
					} else {
						local48.aBoolean62 = false;
						local48.anInt3563 = Static64.method1027(local48.anInt3606, local48.anInt3600, Static192.anInt4180);
						Static23.method446(Static192.anInt4180, local48.anInt3600, local48.anInt3606, local48.anInt3563, local48, local48.anInt3611, local42, local48.anInt981, local48.anInt983, local48.anInt971, local48.anInt984);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method1734() {
		@Pc(8) int[] local8 = new int[Static153.anInt3182];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static153.anInt3182; local17++) {
			@Pc(23) Class1_Sub3_Sub22 local23 = Static102.method1549(local17);
			if (local23.anInt3869 >= 0 || local23.anInt3894 >= 0) {
				local8[local10++] = local17;
			}
		}
		Static107.anIntArray175 = new int[local10];
		for (@Pc(47) int local47 = 0; local47 < local10; local47++) {
			Static107.anIntArray175[local47] = local8[local47];
		}
	}
}
