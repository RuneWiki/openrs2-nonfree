import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jda", name = "K", descriptor = "[I")
	public static final int[] anIntArray293 = new int[5];

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "([I[IB)V")
	public static void method4576(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static26.anIntArray30 = null;
			Static498.aByteArrayArrayArray22 = null;
			Static469.anIntArray518 = null;
			return;
		}
		Static469.anIntArray518 = arg0;
		Static26.anIntArray30 = new int[arg0.length];
		Static498.aByteArrayArrayArray22 = new byte[arg0.length][][];
		for (@Pc(35) int local35 = 0; local35 < Static469.anIntArray518.length; local35++) {
			Static498.aByteArrayArrayArray22[local35] = new byte[arg1[local35]][];
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ZLclient!sca;)Ljava/lang/String;")
	public static String method4577(@OriginalArg(1) Class302 arg0) {
		if (Static78.method1364(arg0).method8147() == 0) {
			return null;
		} else if (arg0.aString101 == null || arg0.aString101.trim().length() == 0) {
			return Static321.aBoolean412 ? "Hidden-use" : null;
		} else {
			return arg0.aString101;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method4578(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static463.anInt8194 >= 100) {
			Static342.method5551(Static317.aClass192_39.method5299(Static307.anInt5931));
			return;
		}
		@Pc(30) String local30 = Static344.method5576(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(35) int local35 = 0; local35 < Static463.anInt8194; local35++) {
			@Pc(43) String local43 = Static344.method5576(Static530.aStringArray60[local35]);
			if (local43 != null && local43.equals(local30)) {
				Static342.method5551(arg0 + Static317.aClass192_40.method5299(Static307.anInt5931));
				return;
			}
			if (Static622.aStringArray74[local35] != null) {
				local74 = Static344.method5576(Static622.aStringArray74[local35]);
				if (local74 != null && local74.equals(local30)) {
					Static342.method5551(arg0 + Static317.aClass192_40.method5299(Static307.anInt5931));
					return;
				}
			}
		}
		for (@Pc(105) int local105 = 0; local105 < Static60.anInt1289; local105++) {
			local74 = Static344.method5576(Static123.aStringArray27[local105]);
			if (local74 != null && local74.equals(local30)) {
				Static342.method5551(Static317.aClass192_45.method5299(Static307.anInt5931) + arg0 + Static317.aClass192_46.method5299(Static307.anInt5931));
				return;
			}
			if (Static447.aStringArray56[local105] != null) {
				@Pc(149) String local149 = Static344.method5576(Static447.aStringArray56[local105]);
				if (local149 != null && local149.equals(local30)) {
					Static342.method5551(Static317.aClass192_45.method5299(Static307.anInt5931) + arg0 + Static317.aClass192_46.method5299(Static307.anInt5931));
					return;
				}
			}
		}
		if (Static344.method5576(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aString12).equals(local30)) {
			Static342.method5551(Static317.aClass192_42.method5299(Static307.anInt5931));
			return;
		}
		@Pc(203) Class6_Sub9 local203 = Static560.method8089(Static391.aClass126_1, Static239.aClass208_40);
		local203.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(arg0) + 1);
		local203.aClass6_Sub40_Sub2_1.method8551(arg0);
		local203.aClass6_Sub40_Sub2_1.method8589(arg1 ? 1 : 0);
		Static263.method4681(local203);
	}
}
