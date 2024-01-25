import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
	public static int anInt9353;

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
	public static int anInt9351 = 2;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	public static int anInt9352 = -1;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "([BI)Lclient!ru;")
	public static Class6_Sub2_Sub18 method7951(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class6_Sub2_Sub18 local9 = new Class6_Sub2_Sub18();
		@Pc(14) Class6_Sub40 local14 = new Class6_Sub40(arg0);
		local14.anInt10169 = local14.aByteArray113.length - 2;
		@Pc(25) int local25 = local14.method8571();
		@Pc(43) int local43 = local14.aByteArray113.length - local25 - 2 - 12;
		local14.anInt10169 = local43;
		@Pc(50) int local50 = local14.method8579();
		local9.anInt8692 = local14.method8571();
		local9.anInt8695 = local14.method8571();
		local9.anInt8693 = local14.method8571();
		local9.anInt8696 = local14.method8571();
		@Pc(74) int local74 = local14.method8604();
		@Pc(82) int local82;
		@Pc(88) int local88;
		if (local74 > 0) {
			local9.aClass128Array1 = new Class128[local74];
			for (local82 = 0; local82 < local74; local82++) {
				local88 = local14.method8571();
				@Pc(97) Class128 local97 = new Class128(Static567.method8129(local88));
				local9.aClass128Array1[local82] = local97;
				while (local88-- > 0) {
					@Pc(108) int local108 = local14.method8579();
					@Pc(114) int local114 = local14.method8579();
					local97.method3551((long) local108, new Class6_Sub48(local114));
				}
			}
		}
		local14.anInt10169 = 0;
		local9.aString99 = local14.method8578();
		local9.anIntArray537 = new int[local50];
		local9.aStringArray62 = new String[local50];
		local9.anIntArray538 = new int[local50];
		local82 = 0;
		while (local14.anInt10169 < local43) {
			local88 = local14.method8571();
			if (local88 == 3) {
				local9.aStringArray62[local82] = local14.method8611().intern();
			} else if (local88 >= 100 || local88 == 21 || local88 == 38 || local88 == 39) {
				local9.anIntArray538[local82] = local14.method8604();
			} else {
				local9.anIntArray538[local82] = local14.method8579();
			}
			local9.anIntArray537[local82++] = local88;
		}
		return local9;
	}
}
