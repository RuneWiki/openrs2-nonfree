import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!qda", name = "W", descriptor = "Lclient!sha;")
	public static Class321 aClass321_37;

	@OriginalMember(owner = "client!qda", name = "M", descriptor = "I")
	public static int anInt8141 = 7000;

	@OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
	public static int anInt8136 = anInt8141;

	@OriginalMember(owner = "client!qda", name = "K", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_45 = new Class209(16);

	@OriginalMember(owner = "client!qda", name = "L", descriptor = "[I")
	public static final int[] anIntArray533 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "(B)V")
	public static void method6956() {
		@Pc(7) Class114 local7 = null;
		try {
			local7 = Static647.method8809("2");
			@Pc(20) Class6_Sub23 local20 = new Class6_Sub23(Static667.anInt10662 * 6 + 3);
			local20.method8366(1);
			local20.method8347(Static667.anInt10662);
			for (@Pc(32) int local32 = 0; local32 < Static466.anIntArray529.length; local32++) {
				if (Static620.aBooleanArray33[local32]) {
					local20.method8347(local32);
					local20.method8364(Static466.anIntArray529[local32]);
				}
			}
			local7.method2457(0, local20.anInt9901, local20.aByteArray101);
		} catch (@Pc(74) Exception local74) {
		}
		try {
			if (local7 != null) {
				local7.method2462();
			}
		} catch (@Pc(81) Exception local81) {
		}
		Static84.aLong50 = Static566.method7936();
		Static192.aBoolean195 = false;
	}
}
