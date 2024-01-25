import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "Lclient!ct;")
	public static Class30 aClass30_17;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_54 = new Class18(34, 6);

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_57 = new Class106("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
	public static final int anInt1629 = 1403;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_58 = new Class217(29, 8);

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
	public static void method1584() {
		@Pc(5) byte local5 = 0;
		if (Static69.aBoolean112) {
			local5 = 55;
		}
		Static288.method5081(local5);
		Static336.method5655(local5);
		Static243.aClass220_2.method5980(local5);
		Static51.method1231(local5);
		Static345.method5756(local5);
		Static344.method4473(local5);
		Static344.method4470(local5);
		Static363.method6014(local5);
		Static231.method4291(local5);
		if (Static13.anInt334 == 10) {
			Static44.method1064(28);
		} else if (Static13.anInt334 == 30) {
			Static44.method1064(25);
			return;
		}
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	public static void method1585() {
		@Pc(5) Class21 local5 = Static110.aClass21_71;
		synchronized (Static110.aClass21_71) {
			Static110.aClass21_71.method851();
		}
		local5 = Static161.aClass21_91;
		synchronized (Static161.aClass21_91) {
			Static161.aClass21_91.method851();
		}
		local5 = Static168.aClass21_97;
		synchronized (Static168.aClass21_97) {
			Static168.aClass21_97.method851();
		}
		local5 = Static300.aClass21_152;
		synchronized (Static300.aClass21_152) {
			Static300.aClass21_152.method851();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!uk;IIIII)V")
	public static void method1586(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5183 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub5_Sub1Array3[local4] != null) {
				arg0.anInt5183++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5183; local22++) {
			@Pc(31) long local31 = Static275.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class1_Sub5_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static13.aClass1_Sub5_Sub1Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass1_Sub5_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static275.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static13.aClass1_Sub5_Sub1Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass1_Sub5_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt5183 - 1; local91++) {
				arg0.aClass1_Sub5_Sub1Array3[local91] = arg0.aClass1_Sub5_Sub1Array3[local91 + 1];
			}
			arg0.anInt5183--;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!fp;)V")
	public static void method1587(@OriginalArg(1) Class63 arg0) {
		if (Static217.aBoolean322) {
			Static339.method5403(arg0);
		} else {
			Static333.method5600(arg0);
		}
	}
}
