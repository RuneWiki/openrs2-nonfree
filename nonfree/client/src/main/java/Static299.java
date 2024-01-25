import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[[Lclient!sba;")
	public static Class302[][] aClass302ArrayArray2;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "I")
	public static int anInt6110;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_104 = new Class73(85, -1);

	@OriginalMember(owner = "client!km", name = "f", descriptor = "[B")
	public static final byte[] aByteArray42 = new byte[520];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIBLclient!ha;)V")
	public static void method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		Static443.aClass5_12 = arg2;
		Static144.aClass40ArrayArray12 = new Class40[arg0][arg1];
		if (Static103.anIntArray97 != null) {
			Static344.aClass31_4 = Static24.method699(Static103.anIntArray97[3], Static103.anIntArray97[5], Static103.anIntArray97[4], Static103.anIntArray97[2], Static103.anIntArray97[0], Static103.anIntArray97[1]);
		}
		Static164.aClass40_2 = new Class40();
		Static628.method8568();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lclient!sba;")
	public static Class302 method5103(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (aClass302ArrayArray2[local7] == null || aClass302ArrayArray2[local7][local16] == null) {
			@Pc(30) boolean local30 = Static156.method3070(local7);
			if (!local30) {
				return null;
			}
		}
		return aClass302ArrayArray2[local7][local16];
	}
}
