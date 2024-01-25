import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "Lclient!dda;")
	public static Class53 aClass53_21;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "Lclient!ica;")
	public static final Class127 aClass127_13 = new Class127(64);

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "Lclient!mh;")
	public static final Class188 aClass188_2 = new Class188("", 16);

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "[I")
	public static final int[] anIntArray120 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZ)Lclient!ls;")
	public static Class178_Sub1 method1449(@OriginalArg(0) int arg0) {
		return Static427.aBoolean580 && arg0 >= Static75.anInt1566 && arg0 <= Static155.anInt2819 ? Static365.aClass178_Sub1Array1[arg0 - Static75.anInt1566] : null;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(CB)C")
	public static char method1450(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(IZ)S")
	public static short method1451(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 <= 64 ? local15 * local19 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(50) int local50 = local19 + local39;
		@Pc(61) int local61;
		if (local50 == 0) {
			local61 = local39 << 1;
		} else {
			local61 = (local39 << 8) / local50;
		}
		return (short) (local61 >> 4 << 7 | local9 << 10 | local50);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!ps;Z)Lclient!mk;")
	public static Class116_Sub2 method1452(@OriginalArg(0) Class2_Sub29 arg0) {
		return new Class116_Sub2(arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5210(), arg0.method5170());
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1453(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static111.method2163(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static12.anInt264; local30++) {
			@Pc(36) String local36 = Static145.aStringArray15[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static111.method2163(local36);
			if (local36 != null && local36.equals(local25)) {
				Static12.anInt264--;
				for (@Pc(60) int local60 = local30; local60 < Static12.anInt264; local60++) {
					Static145.aStringArray15[local60] = Static145.aStringArray15[local60 + 1];
					Static8.aStringArray1[local60] = Static8.aStringArray1[local60 + 1];
					Static399.anIntArray114[local60] = Static399.anIntArray114[local60 + 1];
					Static421.aStringArray35[local60] = Static421.aStringArray35[local60 + 1];
					Static393.anIntArray575[local60] = Static393.anIntArray575[local60 + 1];
					Static242.aBooleanArray23[local60] = Static242.aBooleanArray23[local60 + 1];
				}
				Static224.anInt4039 = Static507.anInt2745;
				Static93.method1721(Static107.aClass243_26);
				Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(arg0));
				Static381.aClass2_Sub29_Sub2_2.method5189(arg0);
				return;
			}
		}
	}
}
