import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	public static int anInt6727 = -1;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray148 = new boolean[100];

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_239 = new Class221("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
	public static final int[] anIntArray808 = new int[4096];

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[I")
	public static final int[] anIntArray809 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIB)I")
	public static int method5742(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub16 local10 = Static108.method2083(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(33) int local33 = 0; local33 < local10.anIntArray272.length; local33++) {
				if (arg1 == local10.anIntArray273[local33]) {
					local22 += local10.anIntArray272[local33];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ws;II)V")
	public static void method5743(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1) {
		if (Static195.aBoolean264) {
			Static195.aBoolean264 = false;
			arg1 = 0;
		}
		if (Static121.aClass251_1 != null && Static121.aClass251_1.method5741(arg0)) {
			return;
		}
		Static121.aClass251_1 = arg0;
		Static218.aLong136 = Static51.method979();
		Static258.anInt4004 = arg1;
		Static75.anInt1419 = arg1;
		if (Static75.anInt1419 == 0) {
			Static121.method2205();
			return;
		}
		Static279.anInt4936 = Static69.anInt1310;
		Static314.aFloat90 = Static159.aFloat33;
		Static219.anInt4061 = Static327.anInt5764;
		Static130.aFloat29 = Static93.aFloat20;
		Static155.aFloat32 = Static392.aFloat104;
		Static301.anInt5427 = Static251.anInt4516;
		Static358.aFloat95 = Static110.aFloat28;
		Static186.aFloat96 = Static282.aFloat50;
		Static301.aClass21_1 = Static343.aClass21_3;
		Static103.aFloat21 = Static366.aFloat97;
	}
}
