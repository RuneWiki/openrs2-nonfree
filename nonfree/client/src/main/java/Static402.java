import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public static int anInt7002;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array23;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "[I")
	public static final int[] anIntArray496 = new int[32];

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)Z")
	public static boolean method5435() {
		return Static169.anInt3551 > 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZ)V")
	public static void method5436(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class3_Sub30 local8 = Static9.method237(arg1, arg0);
		if (local8 != null) {
			for (@Pc(13) int local13 = 0; local13 < local8.anIntArray360.length; local13++) {
				local8.anIntArray360[local13] = -1;
				local8.anIntArray362[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[BII)[B")
	public static byte[] method5437(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static464.method5797(arg0, arg1, local6, 0, 32768);
		return local6;
	}
}
