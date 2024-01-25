import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!uu", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!uu", name = "x", descriptor = "[B")
	public static final byte[] aByteArray92 = new byte[520];

	@OriginalMember(owner = "client!uu", name = "E", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[5];

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!ts;II)V")
	public static void method6083(@OriginalArg(1) Class239 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray14 != null) {
			@Pc(21) Class6_Sub42 local21 = new Class6_Sub42();
			local21.anObjectArray36 = arg0.anObjectArray14;
			local21.aClass239_13 = arg0;
			Static166.method2744(local21);
		}
		Static405.anInt7261 = arg2;
		Static190.anInt653 = arg0.anInt6907;
		Static76.anInt7824 = arg0.anInt6903;
		Static363.anInt6463 = arg0.anInt6908;
		Static174.aBoolean224 = true;
		Static67.anInt1750 = arg0.anInt6949;
		Static327.anInt5630 = arg0.anInt6956;
		Static327.anInt5631 = arg1;
		Static437.method6328(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
	public static boolean method6085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
