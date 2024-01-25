import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "Z")
	public static boolean aBoolean7;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "Lclient!ni;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!afa;")
	public static final Class12 aClass12_1 = new Class12("RC", 1);

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!il;")
	public static final Class144 aClass144_1 = new Class144();

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "[I")
	public static final int[] anIntArray1 = new int[5];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)I")
	public static int method50(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static96.anIntArray90[arg0 & 0x3] : Static578.anIntArray523[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(IBI)Z")
	public static boolean method52(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static495.aByteArrayArrayArray17[1].length > arg1 && arg0 < Static495.aByteArrayArrayArray17[1][arg1].length) {
			return (Static495.aByteArrayArrayArray17[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!ni;)V")
	public static void method55(@OriginalArg(1) Class223 arg0) {
		Static1.anInt7049 = arg0.method5959("hitmarks");
		Static272.anInt5805 = arg0.method5959("hitbar_default");
		Static125.anInt3109 = arg0.method5959("timerbar_default");
		Static461.anInt8259 = arg0.method5959("headicons_pk");
		Static441.anInt7979 = arg0.method5959("headicons_prayer");
		Static551.anInt9474 = arg0.method5959("hint_headicons");
		Static168.anInt3760 = arg0.method5959("hint_mapmarkers");
		Static402.anInt7481 = arg0.method5959("mapflag");
		Static77.anInt6024 = arg0.method5959("cross");
		Static97.anInt2777 = arg0.method5959("mapdots");
		Static430.anInt7862 = arg0.method5959("scrollbar");
		Static621.anInt10458 = arg0.method5959("name_icons");
		Static140.anInt3331 = arg0.method5959("floorshadows");
		Static222.anInt5008 = arg0.method5959("compass");
		Static466.anInt8306 = arg0.method5959("otherlevel");
		Static144.anInt10674 = arg0.method5959("hint_mapedge");
	}
}
