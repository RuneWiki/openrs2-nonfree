import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!fo", name = "r", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BIBIII)Z")
	public static boolean method2463(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class2_Sub15 local12 = new Class2_Sub15(arg0);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(26) int local26 = local12.method4340();
			if (local26 == 0) {
				return local7;
			}
			local14 += local26;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(97) Class32 local97;
				do {
					@Pc(74) int local74;
					@Pc(78) int local78;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local12.method4328();
										if (local42 == 0) {
											continue label68;
										}
										local12.method4325();
									}
									local42 = local12.method4328();
									if (local42 == 0) {
										continue label68;
									}
									local34 += local42 - 1;
									@Pc(57) int local57 = local34 & 0x3F;
									@Pc(63) int local63 = local34 >> 6 & 0x3F;
									local69 = local12.method4325() >> 2;
									local74 = local63 + arg1;
									local78 = local57 + arg3;
								} while (local74 <= 0);
							} while (local78 <= 0);
						} while (local74 >= arg2 - 1);
					} while (local78 >= arg4 - 1);
					local97 = Static541.aClass97_4.method1794(local14);
				} while (local69 == 22 && !Static72.aClass2_Sub12_Sub1_1.aBoolean167 && local97.anInt807 == 0 && local97.anInt803 != 1 && !local97.aBoolean44);
				local36 = true;
				if (!local97.method557()) {
					Static414.anInt9338++;
					local7 = false;
				}
			}
		}
	}
}
