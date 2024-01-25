import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!kga", name = "i", descriptor = "Lclient!hw;")
	public static Class169 aClass169_7;

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "Lclient!jr;")
	public static Class200 aClass200_4;

	@OriginalMember(owner = "client!kga", name = "v", descriptor = "Lclient!dja;")
	public static final Class78 aClass78_8 = new Class78("", 12);

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class3_Sub57 local14 = null;
		for (@Pc(19) Class3_Sub57 local19 = (Class3_Sub57) Static629.aClass342_76.method7644(); local19 != null; local19 = (Class3_Sub57) Static629.aClass342_76.method7650()) {
			if (local19.anInt10802 == arg3 && arg1 == local19.anInt10797 && local19.anInt10805 == arg5 && arg6 == local19.anInt10800) {
				local14 = local19;
				break;
			}
		}
		if (local14 == null) {
			local14 = new Class3_Sub57();
			local14.anInt10797 = arg1;
			local14.anInt10805 = arg5;
			local14.anInt10800 = arg6;
			local14.anInt10802 = arg3;
			if (arg1 >= 0 && arg5 >= 0 && Static497.anInt7926 > arg1 && Static646.anInt9979 > arg5) {
				Static602.method7735(local14);
			}
			Static629.aClass342_76.method7654(local14);
		}
		local14.anInt10801 = arg4;
		local14.anInt10803 = arg0;
		local14.aBoolean734 = false;
		local14.aBoolean733 = true;
		local14.anInt10804 = arg2;
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(III)V")
	public static void method4873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static316.anInt5077 = arg1;
		Static637.anInt8890 = arg0;
		if (Static488.anInt7680 == 0) {
			Static438.anInt6734 = Static436.anInt6642 * 2 + Static637.anInt8890;
			Static182.anInt3160 = Static245.anInt3871 * 2 + Static316.anInt5077;
		} else if (Static488.anInt7680 == 1) {
			Static268.anInt4147 = Static637.anInt8890 / Static91.anInt2080 + Static604.anInt9164 + 2;
			Static250.anInt3897 = Static316.anInt5077 / Static703.anInt10979 + Static414.anInt6387 + 2;
			Static182.anInt3160 = Static703.anInt10979 * Static250.anInt3897;
			Static438.anInt6734 = Static91.anInt2080 * Static268.anInt4147;
			Static245.anInt3871 = Static182.anInt3160 - Static316.anInt5077 >> 1;
			Static436.anInt6642 = Static438.anInt6734 - Static637.anInt8890 >> 1;
		} else if (Static488.anInt7680 == 2) {
			Static182.anInt3160 = Static316.anInt5077;
			Static438.anInt6734 = Static637.anInt8890;
		}
	}
}
