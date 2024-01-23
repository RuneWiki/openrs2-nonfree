import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Lclient!lj;")
	public static Class106 aClass106_2 = new Class106(64);

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method1812(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(16) int local16 = arg0 ? 32768 : 0;
		@Pc(19) short[] local19 = new short[16];
		@Pc(27) int local27 = (arg0 ? Static162.anInt3613 : Static155.anInt3474) + local16;
		@Pc(37) int local37;
		for (local37 = local16; local37 < local27; local37++) {
			@Pc(48) Class2_Sub8_Sub8 local48 = Static231.method3762(local37);
			if (local48.aBoolean164 && local48.method1868().toLowerCase().indexOf(local8) != -1) {
				if (local10 >= 50) {
					Static258.aShortArray69 = null;
					Static87.anInt2020 = -1;
					return;
				}
				if (local19.length <= local10) {
					@Pc(81) short[] local81 = new short[local19.length * 2];
					for (@Pc(83) int local83 = 0; local83 < local10; local83++) {
						local81[local83] = local19[local83];
					}
					local19 = local81;
				}
				local19[local10++] = (short) local37;
			}
		}
		Static138.anInt3079 = 0;
		Static258.aShortArray69 = local19;
		Static87.anInt2020 = local10;
		@Pc(115) String[] local115 = new String[Static87.anInt2020];
		for (local37 = 0; local37 < Static87.anInt2020; local37++) {
			local115[local37] = Static231.method3762(local19[local37]).method1868();
		}
		Static27.method4366(Static258.aShortArray69, local115);
	}
}
