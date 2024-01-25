import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_204 = new Class359(116, 3);

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!kka;")
	public static final Class198 aClass198_3 = new Class198();

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_205 = new Class359(48, 10);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!uaa;Lclient!aa;IIILclient!ha;III)V")
	public static void method7468(@OriginalArg(0) Class345 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class65 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class103 local15 = Static49.aClass93_1.method2280(arg6);
		if (local15 == null || !local15.aBoolean236 || !local15.method2499(Static161.aClass237_3)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray105 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray105.length];
			@Pc(49) int local49;
			@Pc(60) int local60;
			@Pc(64) int local64;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static660.anInt10605 == 4) {
					local49 = (int) Static157.aFloat83 & 0x3FFF;
				} else {
					local49 = Static213.anInt9568 + (int) Static157.aFloat83 & 0x3FFF;
				}
				local60 = Class200.anIntArray337[local49];
				local64 = Class200.anIntArray338[local49];
				if (Static660.anInt10605 != 4) {
					local60 = local60 * 256 / (Static569.anInt9215 + 256);
					local64 = local64 * 256 / (Static569.anInt9215 + 256);
				}
				local33[local35 * 2] = ((arg2 + local15.anIntArray105[local35 * 2] * 4) * local64 + local60 * (local15.anIntArray105[local35 * 2 + 1] * 4 + arg3) >> 14) + (arg7 + (arg0.anInt9649 / 2));
				local33[local35 * 2 + 1] = arg0.anInt9606 / 2 + arg4 - ((local15.anIntArray105[local35 * 2 + 1] * 4 + arg3) * local64 - (local15.anIntArray105[local35 * 2] * 4 + arg2) * local60 >> 14);
			}
			Static647.method8677(arg5, local33, local15.anInt2819, arg0.anIntArray528, arg0.anIntArray530);
			if (local15.anInt2812 > 0) {
				@Pc(217) int local217;
				@Pc(225) int local225;
				@Pc(230) int local230;
				@Pc(232) int local232;
				for (local49 = 0; local49 < local33.length / 2 - 1; local49++) {
					local60 = local33[local49 * 2];
					local64 = local33[local49 * 2 + 1];
					local217 = local33[local49 * 2 + 2];
					local225 = local33[local49 * 2 + 3];
					if (local217 < local60) {
						local230 = local60;
						local232 = local64;
						local60 = local217;
						local217 = local230;
						local64 = local225;
						local225 = local232;
					} else if (local60 == local217 && local225 < local64) {
						local230 = local64;
						local64 = local225;
						local225 = local230;
					}
					arg5.method6935(local60, local64, local217, local225, local15.anIntArray104[local15.aByteArray19[local49] & 0xFF], arg1, arg7, arg4, local15.anInt2812, local15.anInt2792, local15.anInt2783);
				}
				local60 = local33[local33.length - 2];
				local64 = local33[local33.length - 1];
				local217 = local33[0];
				local225 = local33[1];
				if (local217 < local60) {
					local230 = local60;
					local232 = local64;
					local60 = local217;
					local217 = local230;
					local64 = local225;
					local225 = local232;
				} else if (local60 == local217 && local64 > local225) {
					local230 = local64;
					local64 = local225;
					local225 = local230;
				}
				arg5.method6935(local60, local64, local217, local225, local15.anIntArray104[local15.aByteArray19[local15.aByteArray19.length - 1] & 0xFF], arg1, arg7, arg4, local15.anInt2812, local15.anInt2792, local15.anInt2783);
			} else {
				for (local49 = 0; local49 < local33.length / 2 - 1; local49++) {
					arg5.method6960(local33[local49 * 2], local33[local49 * 2 + 1], local33[(local49 + 1) * 2], local33[local49 * 2 + 1 + 2], local15.anIntArray104[local15.aByteArray19[local49] & 0xFF], arg1, arg7, arg4);
				}
				arg5.method6960(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anIntArray104[local15.aByteArray19[local15.aByteArray19.length - 1] & 0xFF], arg1, arg7, arg4);
			}
		}
		@Pc(477) Class50 local477 = null;
		if (local15.anInt2810 != -1) {
			local477 = local15.method2498(false, arg5);
			if (local477 != null) {
				Static78.method1014(arg1, arg0, local477, arg7, arg2, arg3, arg4);
			}
		}
		if (local15.aString17 == null) {
			return;
		}
		local35 = 0;
		if (local477 != null) {
			local35 = local477.method5992();
		}
		@Pc(511) Class73 local511 = Static431.aClass73_10;
		@Pc(513) Class247 local513 = Static258.aClass247_9;
		if (local15.anInt2808 == 1) {
			local511 = Static604.aClass73_15;
			local513 = Static247.aClass247_16;
		}
		if (local15.anInt2808 == 2) {
			local511 = Static231.aClass73_8;
			local513 = Static299.aClass247_11;
		}
		Static163.method2891(arg2, local15.anInt2797, arg3, local511, arg0, arg1, arg7, arg4, local35, local15.aString17, local513);
		return;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)Z")
	public static boolean method7471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method7473() {
		Static192.method3179();
		Static66.aBoolean570 = false;
	}
}
