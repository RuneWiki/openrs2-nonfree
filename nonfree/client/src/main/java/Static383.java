import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "Lclient!gga;")
	public static Class124 aClass124_79;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
	public static int anInt7254;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
	public static int anInt7255;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
	public static int anInt7249 = 0;

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
	public static int anInt7257 = 0;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	public static void method6463() {
		Static495.method7806();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I")
	public static int method6466(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local9 & 0x33333333) + (local9 >>> 2 & 0xB3333333);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local38 + (local38 >>> 16);
		return local49 & 0xFF;
	}
}
