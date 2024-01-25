import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "[Lclient!wm;")
	public static final Class1_Sub19[] aClass1_Sub19Array1 = new Class1_Sub19[2048];

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
	public static int anInt5682 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[[BLclient!nd;)V")
	public static void method4578(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class104_Sub1 arg1) {
		@Pc(13) int local13 = Static172.aByteArrayArray56.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			@Pc(21) byte[] local21 = arg0[local15];
			if (local21 != null) {
				@Pc(33) int local33 = (Static334.anIntArray397[local15] >> 8) * 64 - Static315.anInt5207;
				@Pc(43) int local43 = (Static334.anIntArray397[local15] & 0xFF) * 64 - Static47.anInt676;
				Static459.method5910();
				arg1.method3727(local43, local21, Static385.aClass158Array1, Static186.aClass117_3, local33);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method4581(@OriginalArg(0) int arg0) {
		Static173.anInt2855 = arg0;
		Static112.anInt1711 = -1;
		Static112.anInt1711 = -1;
		Static160.method2120();
	}
}
