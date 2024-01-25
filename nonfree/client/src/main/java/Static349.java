import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!pr;")
	public static Class69 aClass69_2;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZBI)V")
	public static void method5477(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static243.aClass42_4 = Static391.method5858(Static208.aClass12_Sub10_Sub1_1.anInt2226 * 2, Static301.aCanvas11, 0, Static7.aClass16_118, Static450.anInterface11_12);
		} else {
			if (arg0) {
				Static243.aClass42_4 = Static391.method5858(0, Static301.aCanvas11, 0, Static7.aClass16_118, Static450.anInterface11_12);
				Static243.aClass42_4.Z(0);
				@Pc(22) Class244 local22 = Static173.method3438(Static206.anInt9617, Static466.aClass16_109);
				@Pc(31) Class80 local31 = Static243.aClass42_4.method5850(local22, Static550.method895(Static440.aClass16_103, Static206.anInt9617));
				Static178.method3537(Static53.aClass88_34.method2391(Static345.anInt6495), true, local31);
				Static357.method5572();
				Static243.aClass42_4.method5807();
			}
			try {
				Static243.aClass42_4 = Static391.method5858(Static208.aClass12_Sub10_Sub1_1.anInt2226 * 2, Static301.aCanvas11, arg1, Static7.aClass16_118, Static450.anInterface11_12);
				if (Static243.aClass42_4.method5823()) {
					@Pc(60) boolean local60 = true;
					try {
						local60 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(72) Throwable local72) {
					}
					@Pc(78) Class12_Sub36 local78;
					if (local60) {
						local78 = Static243.aClass42_4.method5859(146800640);
					} else {
						local78 = Static243.aClass42_4.method5859(104857600);
					}
					Static243.aClass42_4.method5814(local78);
				}
			} catch (@Pc(89) Throwable local89) {
				arg1 = 0;
				Static243.aClass42_4 = Static391.method5858(0, Static301.aCanvas11, 0, Static7.aClass16_118, Static450.anInterface11_12);
			}
		}
		Static148.anInt6867 = arg1;
		Static29.method560();
		if (!Static243.aClass42_4.method5808()) {
			Static67.anInt1607 = 1;
		}
		Static243.aClass42_4.method5797(Static67.anInt1607);
		Static243.aClass42_4.method5804(0);
		Static243.aClass42_4.L(8);
		Static180.aClass91_5 = Static243.aClass42_4.method5829();
		Static110.aClass91_4 = Static243.aClass42_4.method5829();
		Static473.method7141();
		Static243.aClass42_4.method5863(!Static208.aClass12_Sub10_Sub1_1.aBoolean187);
		if (Static243.aClass42_4.method5830()) {
			Static218.method4005(Static208.aClass12_Sub10_Sub1_1.aBoolean177);
		}
		Static352.method5519(Static243.aClass42_4, Static329.anInt6247 >> 3, Static37.anInt7512 >> 3);
		Static299.method4822();
		Static14.aBoolean9 = false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZBILclient!dba;I)V")
	public static void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class64 arg4, @OriginalArg(6) int arg5) {
		if (Static39.anInt790 >= 50 || (arg4 == null || arg4.anIntArrayArray21 == null || arg4.anIntArrayArray21.length <= arg3 || arg4.anIntArrayArray21[arg3] == null)) {
			return;
		}
		@Pc(44) int local44 = arg4.anIntArrayArray21[arg3][0];
		@Pc(48) int local48 = local44 >> 8;
		@Pc(54) int local54 = local44 >> 5 & 0x7;
		@Pc(71) int local71;
		if (arg4.anIntArrayArray21[arg3].length > 1) {
			local71 = (int) (Math.random() * (double) arg4.anIntArrayArray21[arg3].length);
			if (local71 > 0) {
				local48 = arg4.anIntArrayArray21[arg3][local71];
			}
		}
		@Pc(87) int local87 = local44 & 0x1F;
		if (local87 == 0) {
			if (arg2) {
				Static401.method6305(local54, 0, local48, 255);
			}
		} else if (Static208.aClass12_Sub10_Sub1_1.anInt2222 != 0) {
			local71 = arg5 - 64 >> 7;
			@Pc(117) int local117 = arg0 - 64 >> 7;
			Static308.aClass195Array1[Static39.anInt790++] = new Class195((byte) 1, local48, local54, 0, 255, local87 + (local117 << 8) + (arg1 << 24) + (local71 << 16));
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!qa;Lclient!mc;)V")
	public static void method5480(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class198 arg1) {
		@Pc(35) boolean local35 = Static150.aClass254_2.method6342(arg1.anInt5738 | 0xFF000000, arg1.anInt5766, arg1.aBoolean437 ? Static440.aClass30_Sub1_Sub1_Sub1_2.aClass58_1 : null, arg1.anInt5768, arg0, arg1.anInt5724, arg1.anInt5726) == null;
		if (local35) {
			Static283.aClass73_76.method2012(new Class12_Sub30(arg1.anInt5726, arg1.anInt5768, arg1.anInt5724, arg1.anInt5738 | 0xFF000000, arg1.anInt5766, arg1.aBoolean437));
			Static331.method5282(arg1);
		}
	}
}
