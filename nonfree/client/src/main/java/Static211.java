import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public static int anInt3929;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_41 = new Class215(50, -1);

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!ib;")
	public static final Class102 aClass102_18 = new Class102(512);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Lclient!ae;")
	public static Class4_Sub1_Sub1 method3200(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub1 local10 = (Class4_Sub1_Sub1) Static48.aClass142_1.method3483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static197.aClass76_45.method2104(0, arg0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static226.method3441(local25);
			Static48.aClass142_1.method3480((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3201(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method3203() {
		Static448.anInt7307 = Static146.aClass4_Sub12_Sub1_3.method2490();
		@Pc(20) int local20 = Static146.aClass4_Sub12_Sub1_3.method2515();
		@Pc(29) boolean local29 = Static146.aClass4_Sub12_Sub1_3.method2489() == 1;
		@Pc(35) int local35 = Static146.aClass4_Sub12_Sub1_3.method2548();
		@Pc(39) int local39 = Static146.aClass4_Sub12_Sub1_3.method2489();
		Static263.method3809(local39);
		Static146.aClass4_Sub12_Sub1_3.method1136();
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(62) int local62;
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			for (local51 = 0; local51 < Static326.anInt5666 >> 3; local51++) {
				for (local55 = 0; local55 < Static283.anInt5187 >> 3; local55++) {
					local62 = Static146.aClass4_Sub12_Sub1_3.method1143(1);
					if (local62 == 1) {
						Static313.anIntArrayArrayArray12[local47][local51][local55] = Static146.aClass4_Sub12_Sub1_3.method1143(26);
					} else {
						Static313.anIntArrayArrayArray12[local47][local51][local55] = -1;
					}
				}
			}
		}
		Static146.aClass4_Sub12_Sub1_3.method1135();
		local51 = (Static454.anInt4075 - Static146.aClass4_Sub12_Sub1_3.anInt2997) / 16;
		Static376.anIntArrayArray50 = new int[local51][4];
		for (local55 = 0; local55 < local51; local55++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static376.anIntArrayArray50[local55][local62] = Static146.aClass4_Sub12_Sub1_3.method2529();
			}
		}
		Static175.anIntArray222 = null;
		Static308.anIntArray372 = new int[local51];
		Static386.aByteArrayArray15 = new byte[local51][];
		Static34.aByteArrayArray1 = null;
		Static225.anIntArray291 = new int[local51];
		Static95.anIntArray155 = new int[local51];
		Static247.aByteArrayArray16 = new byte[local51][];
		Static189.anIntArray236 = new int[local51];
		Static435.aByteArrayArray30 = new byte[local51][];
		Static193.aByteArrayArray13 = new byte[local51][];
		Static346.anIntArray418 = new int[local51];
		local51 = 0;
		for (local62 = 0; local62 < 4; local62++) {
			for (@Pc(185) int local185 = 0; local185 < Static326.anInt5666 >> 3; local185++) {
				for (@Pc(189) int local189 = 0; local189 < Static283.anInt5187 >> 3; local189++) {
					@Pc(199) int local199 = Static313.anIntArrayArrayArray12[local62][local185][local189];
					if (local199 != -1) {
						@Pc(209) int local209 = local199 >> 14 & 0x3FF;
						@Pc(215) int local215 = local199 >> 3 & 0x7FF;
						@Pc(225) int local225 = local215 / 8 + (local209 / 8 << 8);
						for (@Pc(227) int local227 = 0; local227 < local51; local227++) {
							if (Static308.anIntArray372[local227] == local225) {
								local225 = -1;
								break;
							}
						}
						if (local225 != -1) {
							Static308.anIntArray372[local51] = local225;
							@Pc(256) int local256 = local225 >> 8 & 0xFF;
							@Pc(260) int local260 = local225 & 0xFF;
							Static225.anIntArray291[local51] = Static49.aClass76_27.method2099("m" + local256 + "_" + local260);
							Static346.anIntArray418[local51] = Static49.aClass76_27.method2099("l" + local256 + "_" + local260);
							Static95.anIntArray155[local51] = Static49.aClass76_27.method2099("um" + local256 + "_" + local260);
							Static189.anIntArray236[local51] = Static49.aClass76_27.method2099("ul" + local256 + "_" + local260);
							local51++;
						}
					}
				}
			}
		}
		Static311.method4167(false, local20, local35, local29);
	}
}
