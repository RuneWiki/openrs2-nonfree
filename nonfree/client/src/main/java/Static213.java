import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "Lclient!mfa;")
	public static Class239 aClass239_9;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gl", name = "t", descriptor = "Ljava/lang/Class;")
	public static Class aClass20;

	@OriginalMember(owner = "client!gl", name = "mb", descriptor = "Lclient!os;")
	public static final Class281 aClass281_9 = new Class281(2, 8);

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_61 = new Class225(111, 6);

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "F")
	public static float aFloat46 = 0.0F;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIZ)V")
	public static void method2982(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Static706.method9435(arg0, arg1, Static289.aClass191_12.method4067(Static414.anInt9485));
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[BIIII)Z")
	public static boolean method2984(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(21) Class2_Sub20 local21 = new Class2_Sub20(arg1);
		@Pc(23) int local23 = -1;
		label68: while (true) {
			@Pc(27) int local27 = local21.method8528();
			if (local27 == 0) {
				return local7;
			}
			local23 += local27;
			@Pc(35) int local35 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(74) int local74;
				@Pc(104) Class81 local104;
				do {
					@Pc(78) int local78;
					@Pc(82) int local82;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local21.method8592(255);
										if (local45 == 0) {
											continue label68;
										}
										local21.method8581(-17416);
									}
									local45 = local21.method8592(255);
									if (local45 == 0) {
										continue label68;
									}
									local35 += local45 - 1;
									@Pc(62) int local62 = local35 & 0x3F;
									@Pc(68) int local68 = local35 >> 6 & 0x3F;
									local74 = local21.method8581(-17416) >> 2;
									local78 = arg0 + local68;
									local82 = arg2 + local62;
								} while (local78 <= 0);
							} while (local82 <= 0);
						} while (local78 >= arg4 - 1);
					} while (local82 >= arg3 - 1);
					local104 = Static148.aClass153_3.method3342(local23);
				} while (local74 == 22 && Static650.aClass2_Sub30_29.aClass11_Sub25_1.method7993() == 0 && local104.anInt1873 == 0 && local104.anInt1893 != 1 && !local104.aBoolean222);
				local39 = true;
				if (!local104.method1630()) {
					local7 = false;
					Static512.anInt8137++;
				}
			}
		}
	}
}
