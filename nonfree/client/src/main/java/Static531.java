import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!sq", name = "y", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_16 = new Class101(1, 7);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method7543(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class6_Sub17 local12 = Static330.method7824(Static131.aClass185_32, Static569.aClass134_2);
		local12.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(arg1) + 1);
		local12.aClass6_Sub8_Sub1_2.method8205(arg1);
		local12.aClass6_Sub8_Sub1_2.method8248(arg0);
		Static452.method6867(local12);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
	public static void method7544() {
		Static218.method3848(false);
		if (Static254.anInt5485 >= 0 && Static254.anInt5485 != 0) {
			Static237.method4302(Static254.anInt5485, false);
			Static254.anInt5485 = -1;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIB)Z")
	public static boolean method7545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
