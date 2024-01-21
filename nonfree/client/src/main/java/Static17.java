import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
	public static int anInt558;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_129 = Static158.method3034("Starte 3D)2Softwarebibliothek");

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_130 = Static158.method3034("Ausw-=hlen");

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	public static int anInt549 = 0;

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_131 = Static158.method3034("p11_full");

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
	public static int anInt552 = 0;

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "[I")
	public static final int[] anIntArray48 = new int[128];

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "(I)V")
	public static void method428() {
		@Pc(5) int local5 = Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1789(Static11.aClass60_101);
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < Static169.anInt4148; local7++) {
			local15 = Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1789(Static47.method2317(local7));
			if (local5 < local15) {
				local5 = local15;
			}
		}
		Static103.aBoolean115 = true;
		local15 = Static169.anInt4148 * 15 + 21;
		Static73.anInt2175 = Static169.anInt4148 * 15 + 22;
		local5 += 8;
		@Pc(49) int local49 = Static174.anInt4254;
		Static180.anInt3303 = local5;
		@Pc(58) int local58 = Static74.anInt2294 - local5 / 2;
		if (local5 + local58 > 765) {
			local58 = 765 - local5;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		Static103.anInt2979 = local58;
		if (local15 + local49 > 503) {
			local49 = 503 - local15;
		}
		if (local49 < 0) {
			local49 = 0;
		}
		Static176.anInt4301 = local49;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)I")
	public static int method429(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
