import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
	public static int anInt2842;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_36 = new Class183(76, -1);

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_74 = new Class208(39, 5);

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
	public static int anInt2840 = -1;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	public static int anInt2841 = 0;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "[I")
	public static final int[] anIntArray216 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!so;BLclient!oj;Lclient!fg;)V")
	public static void method2271(@OriginalArg(0) Class212 arg0, @OriginalArg(2) Class48 arg1, @OriginalArg(3) Class2_Sub10 arg2) {
		@Pc(10) Class27 local10 = arg0.method5246(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5320();
		if (local16 < local10.method5327()) {
			local16 = local10.method5327();
		}
		@Pc(28) int local28 = arg2.anInt2185;
		@Pc(31) int local31 = arg2.anInt2182;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg0.aString58 != null) {
			local33 = Static35.aClass24_1.method330(null, Static376.aStringArray43, arg0.aString58, null);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static376.aStringArray43[local51];
				if (local51 < local33 - 1) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static297.aClass73_11.method1634(local57);
				if (local35 < local74) {
					local35 = local74;
				}
			}
			local37 = Static297.aClass73_11.method1635() * local33 + Static297.aClass73_11.method1633() / 2;
		}
		local51 = arg2.anInt2185 + local16 / 2;
		@Pc(105) int local105 = arg2.anInt2182;
		if (local28 < local16 + Static20.anInt4604) {
			local28 = Static20.anInt4604;
			local51 = local35 / 2 + local16 / 2 + Static20.anInt4604 + 5 + 10;
		} else if (Static20.anInt4602 - local16 < local28) {
			local51 = Static20.anInt4602 - local16 / 2 - local35 / 2 - 15;
			local28 = Static20.anInt4602 - local16;
		}
		if (local31 < Static20.anInt4609 + local16) {
			local31 = Static20.anInt4609;
			local105 = local16 / 2 + Static20.anInt4609 + 10;
		} else if (Static20.anInt4607 - local16 < local31) {
			local105 = Static20.anInt4607 - local16 / 2 - local37 - 10;
			local31 = Static20.anInt4607 - local16;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg2.anInt2185), (double) (local31 - arg2.anInt2182)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5329((float) local28 + (float) local16 / 2.0F, (float) local31 + (float) local16 / 2.0F, 4096, local74);
		@Pc(245) int local245 = -2;
		@Pc(247) int local247 = -2;
		@Pc(249) int local249 = -2;
		@Pc(251) int local251 = -2;
		if (arg0.aString58 != null) {
			local247 = local105;
			local245 = local51 - local35 / 2 - 5;
			local251 = local33 * Static297.aClass73_11.method1635() + local105 + 3;
			local249 = local245 + local35 + 10;
			if (arg0.anInt5978 != 0) {
				arg1.method2509(local251 - local105, -local245 + local249, local105, arg0.anInt5978, local245);
			}
			if (arg0.anInt6003 != 0) {
				arg1.method2484(local251 - local105, local245, local249 - local245, arg0.anInt6003, local105);
			}
			for (@Pc(321) int local321 = 0; local321 < local33; local321++) {
				@Pc(327) String local327 = Static376.aStringArray43[local321];
				if (local321 < local33 - 1) {
					local327 = local327.substring(0, local327.length() - 4);
				}
				Static297.aClass73_11.method1636(arg1, local327, local51, local105, arg0.anInt5972);
				local105 += Static297.aClass73_11.method1635();
			}
		}
		if (arg0.anInt5994 == -1 && arg0.aString58 == null) {
			return;
		}
		@Pc(374) Class2_Sub6 local374 = new Class2_Sub6(arg2);
		local16 >>= 0x1;
		local374.anInt581 = local16 + local31;
		local374.anInt578 = local28 - local16;
		local374.anInt587 = local245;
		local374.anInt577 = local247;
		local374.anInt579 = local28 + local16;
		local374.anInt589 = local31 - local16;
		local374.anInt585 = local251;
		local374.anInt586 = local249;
		Static340.aClass238_39.method5796(local374);
	}
}
