import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!po", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "Lclient!se;")
	public static final Class328 aClass328_10 = new Class328();

	@OriginalMember(owner = "client!po", name = "g", descriptor = "I")
	public static int anInt7536 = 0;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_143 = new Class156(86, -1);

	@OriginalMember(owner = "client!po", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_144 = new Class156(62, -1);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;I)V")
	public static void method6554(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		Static422.method6178(arg1, arg5, arg3, arg2, -1, arg0, (String) null, arg4);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z")
	public static boolean method6555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([ILclient!gca;[IIII)Lclient!qo;")
	public static Class1_Sub2 method6556(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class100_Sub1 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg1.method7885(Static104.aClass86_8, Static624.aClass358_16)) {
			@Pc(76) int[] local76 = new int[arg4 * arg3];
			for (local23 = 0; local23 < arg3; local23++) {
				local33 = arg4 * local23 + arg2[local23];
				for (local35 = 0; local35 < arg0[local23]; local35++) {
					local76[local33++] = -16777216;
				}
			}
			return new Class1_Sub2(arg1, arg4, arg3, local76);
		}
		@Pc(21) byte[] local21 = new byte[arg3 * arg4];
		for (local23 = 0; local23 < arg3; local23++) {
			local33 = arg4 * local23 + arg2[local23];
			for (local35 = 0; local35 < arg0[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub2(arg1, arg4, arg3, local21);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public static void method6558() {
		Static206.method3383(Static577.aClass5_Sub19_25.aClass17_Sub2_1.method357() == 1);
		Static604.aClass45_2 = Static160.method7595(Static681.aClass349_6, 0, 22050, Static357.aCanvas8);
		Static129.method1925(Static369.method5507((Class5_Sub4_Sub2) null));
		Static599.aClass45_1 = Static160.method7595(Static681.aClass349_6, 1, 2048, Static357.aCanvas8);
		Static265.aClass5_Sub4_Sub1_2 = new Class5_Sub4_Sub1();
		Static599.aClass45_1.method7457(Static265.aClass5_Sub4_Sub1_2);
		Static354.aClass355_1 = new Class355(22050, Static417.anInt7038);
		Static348.method5140();
	}
}
