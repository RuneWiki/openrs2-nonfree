import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
	public static int anInt10315 = 0;

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "[I")
	public static final int[] anIntArray633 = new int[4];

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "[I")
	public static final int[] anIntArray634 = new int[2];

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIZLjava/lang/String;Ljava/lang/String;)V")
	public static void method8718(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		Static102.method1649(arg0, arg1, -1, arg2, arg3, true);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZI)I")
	public static int method8719(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Z")
	public static boolean method8720() {
		return Static554.anInt1821 >= 1;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8722(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(32) String local32;
		if (Static60.anInt1289 >= 200 && !Static447.aBoolean546 || Static60.anInt1289 >= 200) {
			Static342.method5551(Static317.aClass192_10.method5299(Static307.anInt5931));
			local32 = Static317.aClass192_11.method5299(Static307.anInt5931);
			if (local32 != null) {
				Static342.method5551(local32);
			}
			return;
		}
		local32 = Static344.method5576(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(87) String local87;
		for (@Pc(48) int local48 = 0; local48 < Static60.anInt1289; local48++) {
			@Pc(56) String local56 = Static344.method5576(Static123.aStringArray27[local48]);
			if (local56 != null && local56.equals(local32)) {
				Static342.method5551(arg0 + Static317.aClass192_38.method5299(Static307.anInt5931));
				return;
			}
			if (Static447.aStringArray56[local48] != null) {
				local87 = Static344.method5576(Static447.aStringArray56[local48]);
				if (local87 != null && local87.equals(local32)) {
					Static342.method5551(arg0 + Static317.aClass192_38.method5299(Static307.anInt5931));
					return;
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < Static463.anInt8194; local123++) {
			local87 = Static344.method5576(Static530.aStringArray60[local123]);
			if (local87 != null && local87.equals(local32)) {
				Static342.method5551(Static317.aClass192_43.method5299(Static307.anInt5931) + arg0 + Static317.aClass192_44.method5299(Static307.anInt5931));
				return;
			}
			if (Static622.aStringArray74[local123] != null) {
				@Pc(167) String local167 = Static344.method5576(Static622.aStringArray74[local123]);
				if (local167 != null && local167.equals(local32)) {
					Static342.method5551(Static317.aClass192_43.method5299(Static307.anInt5931) + arg0 + Static317.aClass192_44.method5299(Static307.anInt5931));
					return;
				}
			}
		}
		if (Static344.method5576(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12).equals(local32)) {
			Static342.method5551(Static317.aClass192_41.method5299(Static307.anInt5931));
		} else {
			@Pc(221) Class6_Sub9 local221 = Static560.method8089(Static391.aClass126_1, Static424.aClass208_68);
			local221.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(arg0));
			local221.aClass6_Sub40_Sub2_1.method8551(arg0);
			Static263.method4681(local221);
		}
	}
}
