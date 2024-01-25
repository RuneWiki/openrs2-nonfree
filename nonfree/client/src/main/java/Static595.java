import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!uea", name = "u", descriptor = "I")
	public static int anInt9703 = -1;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!cb;JIZIIII)V")
	public static void method8074(@OriginalArg(0) Class50 arg0, @OriginalArg(1) long arg1, @OriginalArg(4) int arg2, @OriginalArg(7) int arg3) {
		Static332.anInt6016 = arg2;
		Static464.aClass5_Sub14_Sub4_25 = null;
		Static30.anInt411 = 0;
		Static516.aClass50_76 = arg0;
		Static133.anInt2251 = 10000;
		Static175.anInt2881 = 1;
		Static643.anInt10179 = arg3;
		Static94.anInt1559 = 0;
		Static342.aBoolean452 = false;
		Static70.aLong50 = arg1;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILclient!ha;ILclient!wq;)V")
	public static void method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(4) Class394 arg3) {
		for (@Pc(9) int local9 = 63; local9 >= 0; local9--) {
			Static168.method2468(false, true);
			@Pc(30) int local30 = (local9 & 0x3F) << 10 | 0x380 | 0x3F;
			@Pc(34) int local34 = Static6.anIntArray6[local30];
			Static501.method7248(false, true);
			arg2.aa(arg0, arg1 + ((63 - local9) * arg3.anInt10532 >> 6), arg3.anInt10536, (arg3.anInt10532 >> 6) + 1, local34, 0);
		}
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)V")
	public static void method8077(@OriginalArg(0) int arg0) {
		@Pc(18) Class5_Sub27 local18 = (Class5_Sub27) Static298.aClass335_23.method7766((long) arg0);
		if (local18 != null) {
			local18.aBoolean263 = !local18.aBoolean263;
			local18.aClass104_Sub1_1.method2099(local18.aBoolean263);
		}
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(III)I")
	public static int method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static50.anInt772 == -1) {
			return 1;
		}
		if (arg0 != Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836()) {
			Static348.method6679(true, Static49.aClass42_13.method730(Static259.anInt4113), arg0);
			if (arg0 != Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836()) {
				return -1;
			}
		}
		try {
			@Pc(34) Dimension local34 = Static105.aCanvas2.getSize();
			Static193.method2763(Static364.aClass198_8, Static5.aClass72_1, Static563.aClass143_13, true, Static49.aClass42_13.method730(Static259.anInt4113));
			@Pc(58) Class156 local58 = Static437.method6555(Static392.aClass50_114, Static50.anInt772);
			@Pc(61) long local61 = Static124.method1947();
			Static563.aClass143_13.la();
			Static108.aClass56_4.method8395(0, Static143.anInt2383, 0);
			Static563.aClass143_13.method6222(Static108.aClass56_4);
			Static563.aClass143_13.DA(local34.width / 2, local34.height / 2, 512, 512);
			Static563.aClass143_13.xa(1.0F);
			Static563.aClass143_13.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(102) Class114 local102 = Static563.aClass143_13.method6203(local58, 2048, 64, 64, 768);
			@Pc(104) int local104 = 0;
			label41: for (@Pc(106) int local106 = 0; local106 < 500; local106++) {
				Static563.aClass143_13.GA(0);
				Static563.aClass143_13.ya();
				for (@Pc(114) int local114 = 15; local114 >= 0; local114--) {
					for (@Pc(117) int local117 = 0; local117 <= local114; local117++) {
						Static269.aClass56_5.method8395((int) ((-((float) local114 / 2.0F) + (float) local117) * (float) Static108.anInt1949), 0, Static108.anInt1949 * (local114 + 1));
						local102.method8801(Static269.aClass56_5, (Class41_Sub9) null, 0);
						local104++;
						if (Static124.method1947() - local61 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static563.aClass143_13.method6185();
			@Pc(185) long local185 = (long) (local104 * 1000) / (Static124.method1947() - local61);
			Static563.aClass143_13.GA(0);
			Static563.aClass143_13.ya();
			return (int) local185;
		} catch (@Pc(194) Throwable local194) {
			local194.printStackTrace();
			return -1;
		}
	}
}
