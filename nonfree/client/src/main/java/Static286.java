import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_170 = new Class214(28, -1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method3730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class1_Sub11 local17 = new Class1_Sub11(arg2);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local17.method4457();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(104) Class141 local104;
				do {
					@Pc(70) int local70;
					@Pc(74) int local74;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method4469();
										if (local39 == 0) {
											continue label68;
										}
										local17.method4463();
									}
									local39 = local17.method4469();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(54) int local54 = local31 & 0x3F;
									@Pc(60) int local60 = local31 >> 6 & 0x3F;
									local66 = local17.method4463() >> 2;
									local70 = local60 + arg1;
									local74 = local54 + arg4;
								} while (local70 <= 0);
							} while (local74 <= 0);
						} while (local70 >= arg0 - 1);
					} while (arg3 - 1 <= local74);
					local104 = Static259.aClass95_3.method1821(local19);
				} while (local66 == 22 && !Static336.aClass106_Sub1_1.aBoolean465 && local104.anInt3379 == 0 && local104.anInt3428 != 1 && !local104.aBoolean272);
				local33 = true;
				if (!local104.method2821()) {
					local12 = false;
					Static74.anInt1415++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)Z")
	public static boolean method3731() {
		@Pc(8) Class1_Sub45 local8 = (Class1_Sub45) Static50.aClass254_8.aClass1_249.aClass1_261;
		if (local8 == null || Static50.aClass254_8.aClass1_249 == local8) {
			return false;
		} else {
			if (local8.anInt7398 >= 2000) {
				local8.anInt7398 -= 2000;
			}
			return local8.anInt7398 == 1007;
		}
	}
}
