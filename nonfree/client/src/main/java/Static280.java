import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "[[Lclient!hg;")
	public static Class102[][] aClass102ArrayArray1;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!qd", name = "y", descriptor = "Lclient!us;")
	public static final Class234 aClass234_97 = new Class234(59, 12);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z[B)Lclient!hd;")
	public static Class3_Sub7_Sub7 method4389(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class3_Sub7_Sub7 local9 = new Class3_Sub7_Sub7();
		@Pc(14) Class3_Sub5 local14 = new Class3_Sub5(arg0);
		local14.anInt3121 = local14.aByteArray42.length - 2;
		@Pc(25) int local25 = local14.method2767();
		@Pc(36) int local36 = local14.aByteArray42.length - local25 - 2 - 12;
		local14.anInt3121 = local36;
		@Pc(48) int local48 = local14.method2726();
		local9.anInt2453 = local14.method2767();
		local9.anInt2449 = local14.method2767();
		local9.anInt2454 = local14.method2767();
		local9.anInt2448 = local14.method2767();
		@Pc(72) int local72 = local14.method2739();
		@Pc(80) int local80;
		@Pc(86) int local86;
		if (local72 > 0) {
			local9.aClass44Array1 = new Class44[local72];
			for (local80 = 0; local80 < local72; local80++) {
				local86 = local14.method2767();
				@Pc(93) Class44 local93 = new Class44(Static304.method2746(local86));
				local9.aClass44Array1[local80] = local93;
				while (local86-- > 0) {
					@Pc(104) int local104 = local14.method2726();
					@Pc(108) int local108 = local14.method2726();
					local93.method948((long) local104, new Class3_Sub28(local108));
				}
			}
		}
		local14.anInt3121 = 0;
		local9.aString24 = local14.method2780();
		local9.anIntArray251 = new int[local48];
		local9.anIntArray250 = new int[local48];
		local9.aStringArray20 = new String[local48];
		local80 = 0;
		while (local36 > local14.anInt3121) {
			local86 = local14.method2767();
			if (local86 == 3) {
				local9.aStringArray20[local80] = local14.method2788().intern();
			} else if (local86 >= 100 || local86 == 21 || local86 == 38 || local86 == 39) {
				local9.anIntArray251[local80] = local14.method2739();
			} else {
				local9.anIntArray251[local80] = local14.method2726();
			}
			local9.anIntArray250[local80++] = local86;
		}
		return local9;
	}
}
