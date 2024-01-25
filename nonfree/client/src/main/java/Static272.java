import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_26 = new Class322(121, 4);

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!uu;")
	public static final Class369 aClass369_4 = new Class369(6, 1);

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!cb;")
	public static final Class51 aClass51_2 = new Class51();

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
	public static int method973(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(24) int local24 = (local10 >>> 2 & 0xB3333333) + (local10 & 0x33333333);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public static void method975() {
		if (Static541.anInt9249 == 1 || Static541.anInt9249 == 3 || Static524.anInt8592 != Static541.anInt9249 && (Static541.anInt9249 == 0 || Static524.anInt8592 == 0)) {
			Static201.anInt4069 = 0;
			Static251.anInt4781 = 0;
			Static419.aClass74_45.method1398();
		}
		Static524.anInt8592 = Static541.anInt9249;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;C)Ljava/lang/String;")
	public static String method976(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = local8;
		@Pc(23) int local23 = local11 - 1;
		if (local23 != 0) {
			@Pc(30) int local30 = 0;
			while (true) {
				local30 = arg1.indexOf(13, local30);
				if (local30 < 0) {
					break;
				}
				local30++;
				local13 += local23;
			}
		}
		@Pc(52) StringBuffer local52 = new StringBuffer(local13);
		@Pc(54) int local54 = 0;
		while (true) {
			@Pc(59) int local59 = arg1.indexOf(13, local54);
			if (local59 < 0) {
				local52.append(arg1.substring(local54));
				return local52.toString();
			}
			local52.append(arg1.substring(local54, local59));
			local54 = local59 + 1;
			local52.append(arg0);
		}
	}
}
