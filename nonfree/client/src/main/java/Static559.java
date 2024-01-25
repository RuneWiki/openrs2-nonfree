import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
	public static int anInt9501;

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "[[Lclient!mea;")
	public static Class230[][] aClass230ArrayArray2;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	public static int anInt9499 = 0;

	@OriginalMember(owner = "client!sw", name = "t", descriptor = "J")
	public static long aLong253 = 0L;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V")
	public static void method7855() {
		@Pc(7) Class285 local7 = null;
		try {
			local7 = Static565.method8148("2");
			@Pc(20) Class14_Sub29 local20 = new Class14_Sub29(Static306.anInt5350 * 6 + 3);
			local20.method5854(1);
			local20.method5859(Static306.anInt5350);
			for (@Pc(32) int local32 = 0; local32 < Static259.anIntArray800.length; local32++) {
				if (Static330.aBooleanArray15[local32]) {
					local20.method5859(local32);
					local20.method5861(Static259.anIntArray800[local32]);
				}
			}
			local7.method7148(local20.anInt7264, 0, local20.aByteArray84);
		} catch (@Pc(63) Exception local63) {
		}
		try {
			if (local7 != null) {
				local7.method7142();
			}
		} catch (@Pc(70) Exception local70) {
		}
		Static38.aLong23 = Static521.method7499();
		Static354.aBoolean460 = false;
	}
}
