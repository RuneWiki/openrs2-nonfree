import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "Lclient!td;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!gea", name = "o", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "Lclient!la;")
	public static Class196 aClass196_36;

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_53 = new Class130(55, -1);

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
	public static int anInt3434 = 1;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLclient!jf;)Lclient!gm;")
	public static Class128 method3081(@OriginalArg(1) Class4_Sub1_Sub2 arg0) {
		@Pc(9) Class128 local9;
		if (Static266.aClass128_3 == null) {
			local9 = new Class128();
		} else {
			local9 = Static266.aClass128_3;
			Static266.aClass128_3 = Static266.aClass128_3.aClass128_2;
			Static60.anInt1600--;
			local9.aClass128_2 = null;
		}
		local9.aClass4_Sub1_Sub2_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Lclient!he;")
	public static Class135 method3082(@OriginalArg(0) int arg0) {
		@Pc(13) Class135[] local13 = Static444.method7714();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class135 local21 = local13[local15];
			if (arg0 == local21.anInt4001) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)V")
	public static void method3086(@OriginalArg(0) int arg0) {
		Static165.anInt3234 = 100;
		Static619.anInt10018 = -1;
		Static238.anInt4463 = 3;
		Static109.anInt2368 = arg0;
	}
}
