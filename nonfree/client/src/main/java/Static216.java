import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ifa", name = "u", descriptor = "I")
	public static int anInt4203;

	@OriginalMember(owner = "client!ifa", name = "r", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_75 = new Class319(80, -1);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[B)Lclient!bm;")
	public static Class1_Sub3_Sub5 method3590(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub3_Sub5 local9 = new Class1_Sub3_Sub5();
		@Pc(14) Class1_Sub20 local14 = new Class1_Sub20(arg0);
		local14.anInt5238 = local14.aByteArray52.length - 2;
		@Pc(30) int local30 = local14.method4426();
		@Pc(41) int local41 = local14.aByteArray52.length - local30 - 2 - 12;
		local14.anInt5238 = local41;
		@Pc(48) int local48 = local14.method4371();
		local9.anInt1135 = local14.method4426();
		local9.anInt1134 = local14.method4426();
		local9.anInt1136 = local14.method4426();
		local9.anInt1138 = local14.method4426();
		@Pc(76) int local76 = local14.method4393();
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (local76 > 0) {
			local9.aClass356Array1 = new Class356[local76];
			for (local84 = 0; local84 < local76; local84++) {
				local90 = local14.method4426();
				@Pc(97) Class356 local97 = new Class356(Static200.method3428(local90));
				local9.aClass356Array1[local84] = local97;
				while (local90-- > 0) {
					@Pc(108) int local108 = local14.method4371();
					@Pc(112) int local112 = local14.method4371();
					local97.method7800((long) local108, new Class1_Sub32(local112));
				}
			}
		}
		local14.anInt5238 = 0;
		local9.aString15 = local14.method4403();
		local9.anIntArray50 = new int[local48];
		local9.anIntArray49 = new int[local48];
		local9.aStringArray5 = new String[local48];
		local84 = 0;
		while (local14.anInt5238 < local41) {
			local90 = local14.method4426();
			if (local90 == 3) {
				local9.aStringArray5[local84] = local14.method4388().intern();
			} else if (local90 >= 100 || local90 == 21 || local90 == 38 || local90 == 39) {
				local9.anIntArray49[local84] = local14.method4393();
			} else {
				local9.anIntArray49[local84] = local14.method4371();
			}
			local9.anIntArray50[local84++] = local90;
		}
		return local9;
	}
}
