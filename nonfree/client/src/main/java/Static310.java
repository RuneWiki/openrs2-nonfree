import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kja", name = "j", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!kja", name = "p", descriptor = "I")
	public static int anInt5242;

	@OriginalMember(owner = "client!kja", name = "r", descriptor = "I")
	public static int anInt5244;

	@OriginalMember(owner = "client!kja", name = "s", descriptor = "[I")
	public static int[] anIntArray310;

	@OriginalMember(owner = "client!kja", name = "k", descriptor = "I")
	public static int anInt5237 = -1;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(III)Z")
	public static boolean method4425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method4427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class6_Sub23 local12 = new Class6_Sub23(arg4);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(18) int local18 = local12.method8402();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(61) int local61;
				@Pc(96) Class308 local96;
				do {
					@Pc(65) int local65;
					@Pc(69) int local69;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local12.method8404();
										if (local37 == 0) {
											continue label68;
										}
										local12.method8374();
									}
									local37 = local12.method8404();
									if (local37 == 0) {
										continue label68;
									}
									local29 += local37 - 1;
									@Pc(49) int local49 = local29 & 0x3F;
									@Pc(55) int local55 = local29 >> 6 & 0x3F;
									local61 = local12.method8374() >> 2;
									local65 = local55 + arg0;
									local69 = arg2 + local49;
								} while (local65 <= 0);
							} while (local69 <= 0);
						} while (arg1 - 1 <= local65);
					} while (local69 >= arg3 - 1);
					local96 = Static411.aClass88_3.method2024(local14);
				} while (local61 == 22 && Static96.aClass6_Sub22_7.aClass29_Sub9_1.method2300() == 0 && local96.anInt8580 == 0 && local96.anInt8581 != 1 && !local96.aBoolean607);
				local31 = true;
				if (!local96.method7298()) {
					Static104.anInt1932++;
					local7 = false;
				}
			}
		}
	}
}
