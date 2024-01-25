import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "Z")
	public static boolean aBoolean624 = false;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "[Lclient!mb;")
	public static final Class5_Sub2_Sub16[] aClass5_Sub2_Sub16Array5 = new Class5_Sub2_Sub16[14];

	@OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
	public static int anInt8608 = 0;

	@OriginalMember(owner = "client!waa", name = "j", descriptor = "[I")
	public static final int[] anIntArray669 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BIII)Lclient!hn;")
	public static Class15_Sub2_Sub1 method6946(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class37 local11 = Static152.aClass37ArrayArrayArray1[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class15_Sub2_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class108 local27 = local11.aClass108_1; local27 != null; local27 = local27.aClass108_3) {
			@Pc(31) Class15_Sub2 local31 = local27.aClass15_Sub2_1;
			if (local31 instanceof Class15_Sub2_Sub1) {
				@Pc(37) Class15_Sub2_Sub1 local37 = (Class15_Sub2_Sub1) local31;
				@Pc(45) int local45 = local37.method4035() * 64 - 4;
				@Pc(53) int local53 = local37.anInt8492 - local45 >> 7;
				@Pc(61) int local61 = local37.anInt8493 - local45 >> 7;
				@Pc(68) int local68 = local45 + local37.anInt8492 >> 7;
				@Pc(75) int local75 = local45 + local37.anInt8493 >> 7;
				if (local53 <= arg0 && local61 <= arg2 && local68 >= arg0 && local75 >= arg2) {
					@Pc(108) int local108 = (local75 + 1 - arg2) * (local68 - (arg0 + -1));
					if (local19 < local108) {
						local19 = local108;
						local17 = local37;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZILclient!tv;)Lclient!gaa;")
	public static Class108 method6948(@OriginalArg(1) int arg0, @OriginalArg(2) Class15_Sub2 arg1) {
		@Pc(9) Class108 local9;
		if (Static86.aClass108_2 == null) {
			local9 = new Class108();
		} else {
			local9 = Static86.aClass108_2;
			Static86.aClass108_2 = Static86.aClass108_2.aClass108_3;
			Static516.anInt8761--;
			local9.aClass108_3 = null;
		}
		local9.anInt3129 = arg0;
		local9.aClass15_Sub2_1 = arg1;
		return local9;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIB)Z")
	public static boolean method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
