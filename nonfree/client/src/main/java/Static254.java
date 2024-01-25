import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ms", name = "O", descriptor = "Lclient!se;")
	public static Class215 aClass215_7;

	@OriginalMember(owner = "client!ms", name = "V", descriptor = "I")
	public static int anInt4614;

	@OriginalMember(owner = "client!ms", name = "W", descriptor = "Lclient!pu;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!ms", name = "Q", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_151 = new Class186(101, 7);

	@OriginalMember(owner = "client!ms", name = "U", descriptor = "[I")
	public static int[] anIntArray385 = new int[2];

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method3491(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(57) char local57;
			if (local17 == '\u0000') {
				local57 = arg1.charAt(local13++);
			} else {
				local57 = local17;
			}
			@Pc(73) char local73;
			if (local19 == '\u0000') {
				local73 = arg2.charAt(local15++);
			} else {
				local73 = local19;
			}
			local17 = Static67.method1267(local57);
			local19 = Static67.method1267(local73);
			local57 = Static3.method107(arg0, local57);
			local73 = Static3.method107(arg0, local73);
			if (local73 != local57 && Character.toUpperCase(local57) != Character.toUpperCase(local73)) {
				local57 = Character.toLowerCase(local57);
				local73 = Character.toLowerCase(local73);
				if (local73 != local57) {
					return Static12.method315(arg0, local57) - Static12.method315(arg0, local73);
				}
			}
		}
		@Pc(135) int local135 = Math.min(local8, local11);
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			if (arg0 == 2) {
				local13 = local8 - local137 - 1;
				local15 = local11 - local137 - 1;
			} else {
				local15 = local137;
				local13 = local137;
			}
			@Pc(166) char local166 = arg1.charAt(local13);
			@Pc(170) char local170 = arg2.charAt(local15);
			if (local166 != local170 && Character.toUpperCase(local166) != Character.toUpperCase(local170)) {
				local166 = Character.toLowerCase(local166);
				local170 = Character.toLowerCase(local170);
				if (local166 != local170) {
					return Static12.method315(arg0, local166) - Static12.method315(arg0, local170);
				}
			}
		}
		@Pc(214) int local214 = local8 - local11;
		if (local214 != 0) {
			return local214;
		}
		for (@Pc(238) int local238 = 0; local238 < local135; local238++) {
			@Pc(244) char local244 = arg1.charAt(local238);
			@Pc(248) char local248 = arg2.charAt(local238);
			if (local248 != local244) {
				return Static12.method315(arg0, local244) - Static12.method315(arg0, local248);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/lang/String;ZZIJIIILjava/lang/String;ZB)V")
	public static void method3493(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(9) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class4_Sub30 local30 = new Class4_Sub30(128);
		local30.method4871(10);
		local30.method4846((arg1 ? 2 : 0) | (arg2 ? 1 : 0) | (arg9 ? 4 : 0));
		local30.method4860(arg4);
		local30.method4861(local8[0]);
		local30.method4849(arg8);
		local30.method4861(local8[1]);
		local30.method4846(Static121.anInt2512);
		local30.method4871(arg3);
		local30.method4871(arg7);
		local30.method4861(local8[2]);
		local30.method4846(arg5);
		local30.method4846(arg6);
		local30.method4861(local8[3]);
		local30.method4850(Static183.aBigInteger1, Static362.aBigInteger2);
		@Pc(116) Class4_Sub30 local116 = new Class4_Sub30(350);
		local116.method4849(arg0);
		@Pc(129) int local129 = 8 - Static226.method592(arg0) % 8;
		for (@Pc(131) int local131 = 0; local131 < local129; local131++) {
			local116.method4871((int) (Math.random() * 255.0D));
		}
		local116.method4873(local8);
		Static116.aClass4_Sub30_Sub1_1.anInt6244 = 0;
		Static116.aClass4_Sub30_Sub1_1.method4871(Static58.aClass223_18.anInt6527);
		Static116.aClass4_Sub30_Sub1_1.method4846(local30.anInt6244 + local116.anInt6244 + 2);
		Static116.aClass4_Sub30_Sub1_1.method4846(587);
		Static116.aClass4_Sub30_Sub1_1.method4843(local30.aByteArray79, local30.anInt6244);
		Static116.aClass4_Sub30_Sub1_1.method4843(local116.aByteArray79, local116.anInt6244);
		Static239.anInt4385 = 0;
		Static198.anInt3783 = -3;
		Static93.anInt1997 = 0;
		Static272.anInt4809 = 1;
	}
}
