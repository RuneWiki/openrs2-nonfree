import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "Lclient!mo;")
	public static Class143 aClass143_57;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Lclient!bp;")
	public static Class26 aClass26_7;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "[I")
	public static final int[] anIntArray224 = new int[32];

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
	public static int anInt2547 = 0;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
	public static int anInt2550 = 0;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "[I")
	public static final int[] anIntArray225 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString95 = "Loaded title screen";

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2440(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)[Lclient!wa;")
	public static Class210[] method2441() {
		if (Static164.aClass210Array1 == null) {
			@Pc(16) Class210[] local16 = Static305.method5315(Static105.aClass15_2);
			@Pc(20) Class210[] local20 = new Class210[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(68) int local68;
			@Pc(74) Class210 local74;
			label63: for (@Pc(24) int local24 = 0; local24 < local16.length; local24++) {
				@Pc(30) Class210 local30 = local16[local24];
				if ((local30.anInt6536 <= 0 || local30.anInt6536 >= 24) && local30.anInt6532 >= 800 && local30.anInt6535 >= 600 && (Static127.anInt2786 >= 96 || Static67.anInt1615 != 0 || local30.anInt6532 <= 1024 && local30.anInt6535 <= 768)) {
					for (local68 = 0; local68 < local22; local68++) {
						local74 = local20[local68];
						if (local30.anInt6532 == local74.anInt6532 && local30.anInt6535 == local74.anInt6535) {
							if (local74.anInt6536 < local30.anInt6536) {
								local20[local68] = local30;
							}
							continue label63;
						}
					}
					local20[local22] = local30;
					local22++;
				}
			}
			Static164.aClass210Array1 = new Class210[local22];
			Static358.method767(local20, 0, Static164.aClass210Array1, 0, local22);
			@Pc(122) int[] local122 = new int[Static164.aClass210Array1.length];
			for (local68 = 0; local68 < Static164.aClass210Array1.length; local68++) {
				local74 = Static164.aClass210Array1[local68];
				local122[local68] = local74.anInt6535 * local74.anInt6532;
			}
			Static218.method3938(Static164.aClass210Array1, local122);
		}
		return Static164.aClass210Array1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public static void method2442(@OriginalArg(0) int arg0) {
		@Pc(14) Class14_Sub2_Sub13 local14 = Static1.method5711(12, arg0);
		local14.method3539();
	}
}
