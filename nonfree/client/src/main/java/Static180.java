import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
	public static int anInt4075;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!m;")
	public static Class91 aClass91_5;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_22 = new Class202(7, 7);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
	public static void method3559() {
		@Pc(7) Class308 local7 = null;
		try {
			@Pc(13) Class55 local13 = Static375.aClass71_3.method1980("2", true);
			while (local13.anInt1481 == 0) {
				Static17.method388(1L);
			}
			if (local13.anInt1481 == 1) {
				local7 = (Class308) local13.anObject5;
				@Pc(41) Class12_Sub8 local41 = new Class12_Sub8(Static6.anInt84 * 6 + 3);
				local41.method5214(1);
				local41.method5190(Static6.anInt84);
				for (@Pc(51) int local51 = 0; local51 < Static479.anIntArray646.length; local51++) {
					if (Static425.aBooleanArray44[local51]) {
						local41.method5190(local51);
						local41.method5223(Static479.anIntArray646[local51]);
					}
				}
				local7.method7736(local41.anInt6217, local41.aByteArray82, 0);
			}
		} catch (@Pc(86) Exception local86) {
		}
		try {
			if (local7 != null) {
				local7.method7739();
			}
		} catch (@Pc(93) Exception local93) {
		}
		Static68.aLong28 = Static76.method1679();
		Static345.aBoolean479 = false;
	}
}
