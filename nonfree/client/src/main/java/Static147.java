import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "Lclient!lg;")
	public static Class97 aClass97_13;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "Lclient!ej;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!kk", name = "G", descriptor = "Lclient!cg;")
	public static Class22 aClass22_49;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Lclient!nb;")
	public static Class111 aClass111_9 = new Class111(64);

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString99 = null;

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "[B")
	public static byte[] aByteArray33 = new byte[520];

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method2338(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(10) int local10 = 0;
		@Pc(13) short[] local13 = new short[16];
		for (@Pc(15) int local15 = 0; local15 < Static94.anInt1868; local15++) {
			@Pc(24) Class29 local24 = Static187.method3128(local15);
			if ((!arg0 || local24.aBoolean63) && local24.anInt994 == -1 && local24.anInt1009 == -1 && local24.anInt1001 == 0 && local24.aString35.toLowerCase().indexOf(local8) != -1) {
				if (local10 >= 250) {
					Static174.aShortArray68 = null;
					Static262.anInt5103 = -1;
					return;
				}
				if (local13.length <= local10) {
					@Pc(72) short[] local72 = new short[local13.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local10; local74++) {
						local72[local74] = local13[local74];
					}
					local13 = local72;
				}
				local13[local10++] = (short) local15;
			}
		}
		Static262.anInt5103 = local10;
		Static247.anInt4859 = 0;
		Static174.aShortArray68 = local13;
		@Pc(110) String[] local110 = new String[Static262.anInt5103];
		for (@Pc(112) int local112 = 0; local112 < Static262.anInt5103; local112++) {
			local110[local112] = Static187.method3128(local13[local112]).aString35;
		}
		Static41.method786(local110, Static174.aShortArray68);
	}
}
