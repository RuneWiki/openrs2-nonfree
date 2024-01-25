import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "Z")
	public static boolean aBoolean196 = true;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "[I")
	public static final int[] anIntArray242 = new int[1000];

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V")
	public static void method2672() {
		@Pc(20) byte[] local20;
		if (Static415.anObject17 == null) {
			@Pc(13) Class53_Sub1_Sub2 local13 = new Class53_Sub1_Sub2();
			local20 = local13.method7342();
			Static415.anObject17 = Static65.method1201(local20);
		}
		if (Static465.anObject18 == null) {
			@Pc(31) Class53_Sub2_Sub2 local31 = new Class53_Sub2_Sub2();
			local20 = local31.method6633();
			Static465.anObject18 = Static65.method1201(local20);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIII)V")
	public static void method2673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static152.method2792(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(27) int local27 = -arg2;
		@Pc(33) int local33 = local15;
		@Pc(36) int local36 = -local15;
		@Pc(38) int local38 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(86) int local86;
		if (Static4.anInt6709 <= arg3 && Static492.anInt8451 >= arg3) {
			@Pc(52) int[] local52 = Static352.anIntArrayArray51[arg3];
			local61 = Static418.method6023(Static398.anInt7144, arg5 - arg2, Static71.anInt4958);
			local69 = Static418.method6023(Static398.anInt7144, arg5 + arg2, Static71.anInt4958);
			local78 = Static418.method6023(Static398.anInt7144, arg5 - local15, Static71.anInt4958);
			local86 = Static418.method6023(Static398.anInt7144, arg5 + local15, Static71.anInt4958);
			Static321.method5153(arg0, local61, local52, local78);
			Static321.method5153(arg1, local78, local52, local86);
			Static321.method5153(arg0, local86, local52, local69);
		}
		@Pc(106) int local106 = -1;
		while (local24 > local10) {
			local38 += 2;
			local106 += 2;
			local27 += local38;
			local36 += local106;
			if (local36 >= 0 && local33 >= 1) {
				local33--;
				local36 -= local33 << 1;
				Static442.anIntArray584[local33] = local10;
			}
			local10++;
			@Pc(256) int local256;
			@Pc(265) int local265;
			@Pc(276) int[] local276;
			@Pc(154) int local154;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local154 = arg3 - local24;
				local61 = local24 + arg3;
				if (Static4.anInt6709 <= local61 && local154 <= Static492.anInt8451) {
					if (local15 <= local24) {
						local69 = Static418.method6023(Static398.anInt7144, arg5 + local10, Static71.anInt4958);
						local78 = Static418.method6023(Static398.anInt7144, arg5 - local10, Static71.anInt4958);
						if (Static492.anInt8451 >= local61) {
							Static321.method5153(arg0, local78, Static352.anIntArrayArray51[local61], local69);
						}
						if (Static4.anInt6709 <= local154) {
							Static321.method5153(arg0, local78, Static352.anIntArrayArray51[local154], local69);
						}
					} else {
						local69 = Static442.anIntArray584[local24];
						local78 = Static418.method6023(Static398.anInt7144, local10 + arg5, Static71.anInt4958);
						local86 = Static418.method6023(Static398.anInt7144, arg5 - local10, Static71.anInt4958);
						local256 = Static418.method6023(Static398.anInt7144, arg5 + local69, Static71.anInt4958);
						local265 = Static418.method6023(Static398.anInt7144, arg5 - local69, Static71.anInt4958);
						if (Static492.anInt8451 >= local61) {
							local276 = Static352.anIntArrayArray51[local61];
							Static321.method5153(arg0, local86, local276, local265);
							Static321.method5153(arg1, local265, local276, local256);
							Static321.method5153(arg0, local256, local276, local78);
						}
						if (Static4.anInt6709 <= local154) {
							local276 = Static352.anIntArrayArray51[local154];
							Static321.method5153(arg0, local86, local276, local265);
							Static321.method5153(arg1, local265, local276, local256);
							Static321.method5153(arg0, local256, local276, local78);
						}
					}
				}
			}
			local154 = arg3 - local10;
			local61 = arg3 + local10;
			if (local61 >= Static4.anInt6709 && local154 <= Static492.anInt8451) {
				local69 = local24 + arg5;
				local78 = arg5 - local24;
				if (Static398.anInt7144 <= local69 && local78 <= Static71.anInt4958) {
					local69 = Static418.method6023(Static398.anInt7144, local69, Static71.anInt4958);
					local78 = Static418.method6023(Static398.anInt7144, local78, Static71.anInt4958);
					if (local15 <= local10) {
						if (local61 <= Static492.anInt8451) {
							Static321.method5153(arg0, local78, Static352.anIntArrayArray51[local61], local69);
						}
						if (local154 >= Static4.anInt6709) {
							Static321.method5153(arg0, local78, Static352.anIntArrayArray51[local154], local69);
						}
					} else {
						local86 = local33 < local10 ? Static442.anIntArray584[local10] : local33;
						local256 = Static418.method6023(Static398.anInt7144, arg5 + local86, Static71.anInt4958);
						local265 = Static418.method6023(Static398.anInt7144, arg5 - local86, Static71.anInt4958);
						if (local61 <= Static492.anInt8451) {
							local276 = Static352.anIntArrayArray51[local61];
							Static321.method5153(arg0, local78, local276, local265);
							Static321.method5153(arg1, local265, local276, local256);
							Static321.method5153(arg0, local256, local276, local69);
						}
						if (local154 >= Static4.anInt6709) {
							local276 = Static352.anIntArrayArray51[local154];
							Static321.method5153(arg0, local78, local276, local265);
							Static321.method5153(arg1, local265, local276, local256);
							Static321.method5153(arg0, local256, local276, local69);
						}
					}
				}
			}
		}
	}
}
