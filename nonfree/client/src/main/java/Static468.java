import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "Lclient!ss;")
	public static Class337 aClass337_1;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public static final int anInt7445 = 1337;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!kq;I)V")
	public static void method6477(@OriginalArg(0) Class199 arg0) {
		@Pc(12) Class199 local12 = Static518.method8704(arg0);
		@Pc(18) int local18;
		@Pc(16) int local16;
		if (local12 == null) {
			local16 = Static357.anInt5421;
			local18 = Static632.anInt9867;
		} else {
			local16 = local12.anInt4994;
			local18 = local12.anInt5035;
		}
		Static622.method8368(local18, arg0, local16, false);
		Static449.method6177(local18, arg0, local16);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[B)Lclient!bo;")
	public static Class4_Sub5_Sub4 method6480(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub5_Sub4 local9 = new Class4_Sub5_Sub4();
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg0);
		local14.anInt10466 = local14.aByteArray107.length - 2;
		@Pc(25) int local25 = local14.method8859();
		@Pc(36) int local36 = local14.aByteArray107.length - local25 - 2 - 16;
		local14.anInt10466 = local36;
		@Pc(43) int local43 = local14.method8850();
		local9.anInt1084 = local14.method8859();
		local9.anInt1085 = local14.method8859();
		local9.anInt1083 = local14.method8859();
		local9.anInt1086 = local14.method8859();
		local9.anInt1088 = local14.method8859();
		local9.anInt1087 = local14.method8859();
		@Pc(77) int local77 = local14.method8865();
		@Pc(93) int local93;
		@Pc(99) int local99;
		if (local77 > 0) {
			local9.aClass66Array1 = new Class66[local77];
			for (local93 = 0; local93 < local77; local93++) {
				local99 = local14.method8859();
				@Pc(106) Class66 local106 = new Class66(Static162.method2593(local99));
				local9.aClass66Array1[local93] = local106;
				while (local99-- > 0) {
					@Pc(117) int local117 = local14.method8850();
					@Pc(121) int local121 = local14.method8850();
					local106.method1985(new Class4_Sub24(local121), (long) local117);
				}
			}
		}
		local14.anInt10466 = 0;
		local9.aString10 = local14.method8852();
		local9.anIntArray74 = new int[local43];
		local93 = 0;
		while (local36 > local14.anInt10466) {
			local99 = local14.method8859();
			if (local99 == 3) {
				if (local9.aStringArray5 == null) {
					local9.aStringArray5 = new String[local43];
				}
				local9.aStringArray5[local93] = local14.method8853().intern();
			} else if (local99 == 54) {
				if (local9.aLongArray1 == null) {
					local9.aLongArray1 = new long[local43];
				}
				local9.aLongArray1[local93] = local14.method8830();
			} else {
				if (local9.anIntArray75 == null) {
					local9.anIntArray75 = new int[local43];
				}
				if (local99 >= 150 || local99 == 21 || local99 == 38 || local99 == 39) {
					local9.anIntArray75[local93] = local14.method8865();
				} else {
					local9.anIntArray75[local93] = local14.method8850();
				}
			}
			local9.anIntArray74[local93++] = local99;
		}
		return local9;
	}
}
