import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "[I")
	public static final int[] anIntArray440 = new int[25];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)Z")
	public static boolean method4518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V")
	public static void method4519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = Static59.aClass88_1.method2502(Static601.aClass346_26.method8440(Static609.anInt9834));
		@Pc(68) int local68;
		@Pc(40) int local40;
		if (Static439.aBoolean510) {
			for (@Pc(24) Class3_Sub11_Sub8 local24 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1842(); local24 != null; local24 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1844()) {
				if (local24.anInt3796 == 1) {
					local40 = Static574.method8106((Class3_Sub11_Sub14) local24.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67);
				} else {
					local40 = Static553.method7891(local24);
				}
				if (local40 > local17) {
					local17 = local40;
				}
			}
			local68 = Static71.anInt1334 * 16 + 21;
			local17 += 8;
			Static627.anInt10020 = (Static609.aBoolean752 ? 26 : 22) + Static71.anInt1334 * 16;
		} else {
			for (@Pc(86) Class3_Sub11_Sub14 local86 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local86 != null; local86 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
				local40 = Static574.method8106(local86);
				if (local40 > local17) {
					local17 = local40;
				}
			}
			local17 += 8;
			Static627.anInt10020 = Static450.anInt7444 * 16 + (Static609.aBoolean752 ? 26 : 22);
			local68 = Static450.anInt7444 * 16 + 21;
		}
		@Pc(131) int local131 = arg1 - local17 / 2;
		if (Static312.anInt5191 < local17 + local131) {
			local131 = Static312.anInt5191 - local17;
		}
		if (local131 < 0) {
			local131 = 0;
		}
		local40 = arg0;
		if (Static222.anInt4196 < local68 + arg0) {
			local40 = Static222.anInt4196 - local68;
		}
		if (local40 < 0) {
			local40 = 0;
		}
		Static600.anInt9624 = local131;
		Static436.anInt6913 = local40;
		Static368.anInt5940 = local17;
		Static43.aBoolean74 = true;
	}
}
