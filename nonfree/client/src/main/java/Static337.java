import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "Lclient!iv;")
	public static Class120 aClass120_2;

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
	public static int anInt1766 = 0;

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
	public static int anInt1768 = -60;

	@OriginalMember(owner = "client!qt", name = "B", descriptor = "Lclient!go;")
	public static final Class97 aClass97_2 = new Class97(0, 2, 2, 1);

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[B)Lclient!mo;")
	public static Class1_Sub3_Sub12 method1433(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub3_Sub12 local9 = new Class1_Sub3_Sub12();
		@Pc(14) Class1_Sub11 local14 = new Class1_Sub11(arg0);
		local14.anInt5766 = local14.aByteArray64.length - 2;
		@Pc(25) int local25 = local14.method4485();
		@Pc(35) int local35 = local14.aByteArray64.length - local25 - 12 - 2;
		local14.anInt5766 = local35;
		@Pc(49) int local49 = local14.method4487();
		local9.anInt4085 = local14.method4485();
		local9.anInt4088 = local14.method4485();
		local9.anInt4086 = local14.method4485();
		local9.anInt4089 = local14.method4485();
		@Pc(73) int local73 = local14.method4463();
		@Pc(84) int local84;
		@Pc(90) int local90;
		if (local73 > 0) {
			local9.aClass257Array1 = new Class257[local73];
			for (local84 = 0; local84 < local73; local84++) {
				local90 = local14.method4485();
				@Pc(97) Class257 local97 = new Class257(Static88.method1286(local90));
				local9.aClass257Array1[local84] = local97;
				while (local90-- > 0) {
					@Pc(108) int local108 = local14.method4487();
					@Pc(112) int local112 = local14.method4487();
					local97.method5504(new Class1_Sub6(local112), (long) local108);
				}
			}
		}
		local14.anInt5766 = 0;
		local9.aString41 = local14.method4490();
		local9.anIntArray217 = new int[local49];
		local9.aStringArray30 = new String[local49];
		local9.anIntArray216 = new int[local49];
		local84 = 0;
		while (local35 > local14.anInt5766) {
			local90 = local14.method4485();
			if (local90 == 3) {
				local9.aStringArray30[local84] = local14.method4484().intern();
			} else if (local90 >= 100 || local90 == 21 || local90 == 38 || local90 == 39) {
				local9.anIntArray216[local84] = local14.method4463();
			} else {
				local9.anIntArray216[local84] = local14.method4487();
			}
			local9.anIntArray217[local84++] = local90;
		}
		return local9;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)I")
	public static int method1436(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
