import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "[Lclient!kq;")
	public static Class199[] aClass199Array2;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lclient!kq;")
	public static Class199 aClass199_13 = null;

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
	public static final int anInt8012 = -1;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "([BIIIBI)Z")
	public static boolean method6975(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) boolean local18 = true;
		@Pc(23) Class4_Sub11 local23 = new Class4_Sub11(arg0);
		@Pc(25) int local25 = -1;
		label68: while (true) {
			@Pc(29) int local29 = local23.method8886();
			if (local29 == 0) {
				return local18;
			}
			local25 += local29;
			@Pc(37) int local37 = 0;
			@Pc(39) boolean local39 = false;
			while (true) {
				@Pc(69) int local69;
				@Pc(104) Class342 local104;
				do {
					@Pc(74) int local74;
					@Pc(78) int local78;
					do {
						do {
							do {
								do {
									@Pc(45) int local45;
									while (local39) {
										local45 = local23.method8823();
										if (local45 == 0) {
											continue label68;
										}
										local23.method8865();
									}
									local45 = local23.method8823();
									if (local45 == 0) {
										continue label68;
									}
									local37 += local45 - 1;
									@Pc(57) int local57 = local37 & 0x3F;
									@Pc(63) int local63 = local37 >> 6 & 0x3F;
									local69 = local23.method8865() >> 2;
									local74 = local63 + arg1;
									local78 = arg2 + local57;
								} while (local74 <= 0);
							} while (local78 <= 0);
						} while (local74 >= arg4 - 1);
					} while (arg3 - 1 <= local78);
					local104 = Static441.aClass74_169.method2075(local25);
				} while (local69 == 22 && Static124.aClass4_Sub20_4.aClass8_Sub24_1.method7743() == 0 && local104.anInt8742 == 0 && local104.anInt8707 != 1 && !local104.aBoolean691);
				local39 = true;
				if (!local104.method7506()) {
					Static225.anInt3564++;
					local18 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method6977(@OriginalArg(0) Class33 arg0) {
		Static302.aClass56_9 = Static531.method7138(true, Static625.anInt9801, arg0);
		Static321.aClass31_5 = Static17.method323(Static625.anInt9801, arg0);
		Static189.aClass56_5 = Static531.method7138(true, Static371.anInt5580, arg0);
		Static636.aClass31_14 = Static17.method323(Static371.anInt5580, arg0);
		Static344.aClass56_10 = Static531.method7138(true, Static138.anInt2559, arg0);
		Static641.aClass31_10 = Static17.method323(Static138.anInt2559, arg0);
	}
}
