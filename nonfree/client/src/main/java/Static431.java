import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BZ)V")
	public static void method6594(@OriginalArg(1) boolean arg0) {
		Static365.method5697();
		if (!Static224.method6975(Static96.anInt2243)) {
			return;
		}
		Static471.anInt8639++;
		if (Static471.anInt8639 < 50 && !arg0) {
			return;
		}
		Static471.anInt8639 = 0;
		if (!Static491.aBoolean628 && Static491.aClass277_2 != null) {
			Static332.method5312(Static538.aClass77_95);
			try {
				Static491.aClass277_2.method7164(Static383.aClass12_Sub8_Sub2_1.aByteArray82, Static383.aClass12_Sub8_Sub2_1.anInt6217);
				Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
			} catch (@Pc(55) IOException local55) {
				Static491.aBoolean628 = true;
			}
		}
		Static365.method5697();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public static void method6596() {
		if (Static103.anIntArray206 != null && Static95.anIntArray196 != null) {
			return;
		}
		Static95.anIntArray196 = new int[256];
		Static103.anIntArray206 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static103.anIntArray206[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static95.anIntArray196[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
