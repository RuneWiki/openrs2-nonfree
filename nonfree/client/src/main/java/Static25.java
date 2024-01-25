import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public static int anInt580;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "Lclient!on;")
	public static Class254 aClass254_1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Lclient!wj;")
	public static final Class375 aClass375_2 = new Class375("stellardawn", 1);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method451(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static60.method906(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static352.anInt5497; local29++) {
			@Pc(35) String local35 = Static213.aStringArray13[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static60.method906(local35);
			if (local35 != null && local35.equals(local20)) {
				Static352.anInt5497--;
				for (@Pc(59) int local59 = local29; local59 < Static352.anInt5497; local59++) {
					Static213.aStringArray13[local59] = Static213.aStringArray13[local59 + 1];
					Static565.aStringArray44[local59] = Static565.aStringArray44[local59 + 1];
					Static320.anIntArray351[local59] = Static320.anIntArray351[local59 + 1];
					Static564.aStringArray43[local59] = Static564.aStringArray43[local59 + 1];
					Static167.anIntArray196[local59] = Static167.anIntArray196[local59 + 1];
					Static146.aBooleanArray42[local59] = Static146.aBooleanArray42[local59 + 1];
				}
				Static111.anInt2031 = Static542.anInt8903;
				@Pc(128) Class2_Sub40 local128 = Static464.method6285(Static251.aClass131_1, Static82.aClass179_19);
				local128.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(arg0));
				local128.aClass2_Sub22_Sub2_2.method8540(arg0);
				Static528.method7295(local128);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Lclient!fw;")
	public static Class13_Sub1_Sub4 method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass13_Sub1_Sub4_2;
	}
}
