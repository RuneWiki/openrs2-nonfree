import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public static int anInt8919;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
	public static int anInt8920;

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray16;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_82 = new Class187(60, 6);

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_83 = new Class187(77, 0);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public static void method7520() {
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub19_2, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub19_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub21_2, 2);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub21_1, 2);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub3_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub4_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub26_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub20_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub15_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub10_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub5_1, 2);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub16_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub8_1, 2);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub24_1, 1);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub28_2, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub28_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub17_1, 2);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub11_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub13_1, 0);
		Static238.method3423();
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub14_1, 0);
		Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub27_1, 4);
		Static523.method8754();
		Static3.method39();
		Static446.aBoolean570 = true;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!cb;I)V")
	public static void method7521(@OriginalArg(0) Class50 arg0) {
		Static628.anInt10042 = arg0.method900("hitmarks");
		Static326.anInt5967 = arg0.method900("hitbar_default");
		Static353.anInt6238 = arg0.method900("timerbar_default");
		Static151.anInt8737 = arg0.method900("headicons_pk");
		Static16.anInt9839 = arg0.method900("headicons_prayer");
		Static427.anInt10574 = arg0.method900("hint_headicons");
		Static187.anInt3086 = arg0.method900("hint_mapmarkers");
		Static494.anInt8445 = arg0.method900("mapflag");
		Static494.anInt8451 = arg0.method900("cross");
		Static675.anInt10615 = arg0.method900("mapdots");
		Static311.anInt5530 = arg0.method900("scrollbar");
		Static560.anInt9142 = arg0.method900("name_icons");
		Static82.anInt1411 = arg0.method900("floorshadows");
		Static35.anInt492 = arg0.method900("compass");
		Static476.anInt8259 = arg0.method900("otherlevel");
		Static307.anInt5470 = arg0.method900("hint_mapedge");
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
	public static void method7522(@OriginalArg(1) int arg0) {
		if (Static515.anInt3720 == arg0) {
			return;
		}
		Static124.anInt2150 = Static64.anInt1015 = Static297.anIntArray50[arg0];
		Static304.method4152();
		Static54.anIntArrayArray68 = new int[Static124.anInt2150][Static64.anInt1015];
		Static244.anIntArrayArray36 = new int[Static124.anInt2150][Static64.anInt1015];
		Static301.anIntArrayArrayArray5 = new int[4][Static124.anInt2150 >> 3][Static64.anInt1015 >> 3];
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			Static137.aClass234Array1[local38] = Static255.method3586(Static124.anInt2150, Static64.anInt1015);
		}
		Static664.aByteArrayArrayArray18 = new byte[4][Static124.anInt2150][Static64.anInt1015];
		Static376.method5532(Static124.anInt2150, Static64.anInt1015);
		Static167.method2460(Static124.anInt2150 >> 3, Static64.anInt1015 >> 3, Static563.aClass143_13);
		Static515.anInt3720 = arg0;
	}
}
