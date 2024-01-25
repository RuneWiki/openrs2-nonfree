import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "[I")
	public static final int[] anIntArray229 = new int[1024];

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "[I")
	public static final int[] anIntArray230 = new int[2];

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V")
	public static void method3582() {
		@Pc(7) Class150 local7 = null;
		try {
			local7 = Static372.method5930("2");
			@Pc(20) Class3_Sub15 local20 = new Class3_Sub15(Static223.anInt5090 * 6 + 3);
			local20.method8448(1);
			local20.method8464(Static223.anInt5090);
			for (@Pc(30) int local30 = 0; local30 < Static477.anIntArray533.length; local30++) {
				if (Static158.aBooleanArray10[local30]) {
					local20.method8464(local30);
					local20.method8419(Static477.anIntArray533[local30]);
				}
			}
			local7.method4656(local20.aByteArray106, 0, local20.anInt10282);
		} catch (@Pc(65) Exception local65) {
		}
		try {
			if (local7 != null) {
				local7.method4653();
			}
		} catch (@Pc(72) Exception local72) {
		}
		Static424.aLong254 = Static444.method6719();
		Static555.aBoolean799 = false;
	}
}
