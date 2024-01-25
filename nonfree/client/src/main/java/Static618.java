import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static618 {

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "[I")
	public static int[] anIntArray800 = new int[1];

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!aba;IB)V")
	public static void method9598(@OriginalArg(0) Class3_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static393.anInt6120 = 0;
		Static271.aBoolean281 = false;
		Static428.method5692(arg0);
		Static416.method3200(arg0);
		if (Static271.aBoolean281) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt2178) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt2178 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BII)I")
	public static int method9599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
