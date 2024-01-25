import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "Lclient!fba;")
	public static final Class91 aClass91_1 = new Class91();

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_12 = new Class244(5, -1);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4850(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static344.method5576(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static463.anInt8194; local30++) {
			@Pc(36) String local36 = Static530.aStringArray60[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static344.method5576(local36);
			if (local36 != null && local36.equals(local25)) {
				Static463.anInt8194--;
				for (@Pc(60) int local60 = local30; local60 < Static463.anInt8194; local60++) {
					Static530.aStringArray60[local60] = Static530.aStringArray60[local60 + 1];
					Static234.aStringArray36[local60] = Static234.aStringArray36[local60 + 1];
					Static622.aStringArray74[local60] = Static622.aStringArray74[local60 + 1];
					Static321.aStringArray47[local60] = Static321.aStringArray47[local60 + 1];
					Static124.aBooleanArray16[local60] = Static124.aBooleanArray16[local60 + 1];
				}
				Static533.anInt9234 = Static320.anInt6118;
				@Pc(119) Class6_Sub9 local119 = Static560.method8089(Static391.aClass126_1, Static414.aClass208_66);
				local119.aClass6_Sub40_Sub2_1.method8589(Static583.method8194(arg0));
				local119.aClass6_Sub40_Sub2_1.method8551(arg0);
				Static263.method4681(local119);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZILclient!sca;I)V")
	public static void method4852(@OriginalArg(1) int arg0, @OriginalArg(2) Class302 arg1, @OriginalArg(3) int arg2) {
		Static432.anInt7833 = arg2;
		Static393.aClass302_45 = arg1;
		Static422.anInt7718 = arg0;
	}
}
