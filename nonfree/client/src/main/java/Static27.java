import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!au", name = "o", descriptor = "I")
	public static int anInt7651 = 2;

	@OriginalMember(owner = "client!au", name = "G", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_274 = new Class179(8, -2);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZILclient!ha;B)Lclient!qm;")
	public static Class290 method6634(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132 arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static169.anIntArray157 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static169.anIntArray157.length; local15++) {
				if (arg1 == Static169.anIntArray157[local15]) {
					return Static614.aClass290Array1[local15];
				}
			}
		}
		@Pc(48) Class290 local48 = (Class290) Static334.aClass10_34.method373((long) arg1);
		if (local48 != null) {
			if (arg0 && local48.aClass151_13 == null) {
				@Pc(60) Class151 local60 = Static581.method8055(Static320.aClass8_89, arg1);
				if (local60 == null) {
					return null;
				}
				local48.aClass151_13 = local60;
			}
			return local48;
		}
		@Pc(73) Class112[] local73 = Static681.method2329(Static360.aClass8_135, arg1);
		if (local73 == null) {
			return null;
		}
		@Pc(82) Class151 local82 = Static581.method8055(Static320.aClass8_89, arg1);
		if (local82 == null) {
			return null;
		}
		if (arg0) {
			local48 = new Class290(arg2.method7518(local82, local73), local82);
		} else {
			local48 = new Class290(arg2.method7518(local82, local73));
		}
		Static334.aClass10_34.method366(local48, (long) arg1);
		return local48;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(JJ)J")
	public static long method6635(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
	public static void method6637() {
		Static83.aClass132_3.xa(((float) Static96.aClass6_Sub22_7.aClass29_Sub7_1.method1675() * 0.1F + 0.7F) * 1.1523438F);
		Static83.aClass132_3.ZA(Static601.anInt9807, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static83.aClass132_3.L(Static268.anInt4671, -1, 0);
		Static83.aClass132_3.method7452(Static459.aClass25_2);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IBI)I")
	public static int method6638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static114.anInt2059 == -1) {
			return 1;
		}
		if (arg1 != Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742()) {
			Static653.method8882(arg1, Static52.aClass41_13.method1007(Static616.anInt10077), true);
			if (arg1 != Static96.aClass6_Sub22_7.aClass29_Sub16_2.method5742()) {
				return -1;
			}
		}
		try {
			@Pc(44) Dimension local44 = Static140.aCanvas1.getSize();
			Static500.method7180(Static462.aClass151_12, Static546.aClass132_13, true, Static423.aClass19_9, Static52.aClass41_13.method1007(Static616.anInt10077));
			@Pc(62) Class22 local62 = Static308.method4413(Static114.anInt2059, Static286.aClass8_76);
			@Pc(65) long local65 = Static566.method7936();
			Static546.aClass132_13.la();
			Static185.aClass207_13.method8212(0, Static625.anInt10177, 0);
			Static546.aClass132_13.method7517(Static185.aClass207_13);
			Static546.aClass132_13.DA(local44.width / 2, local44.height / 2, 512, 512);
			Static546.aClass132_13.xa(1.0F);
			Static546.aClass132_13.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(106) Class184 local106 = Static546.aClass132_13.method7475(local62, 2048, 64, 64, 768);
			@Pc(108) int local108 = 0;
			label41: for (@Pc(110) int local110 = 0; local110 < 500; local110++) {
				Static546.aClass132_13.GA(0);
				Static546.aClass132_13.ya();
				for (@Pc(119) int local119 = 15; local119 >= 0; local119--) {
					for (@Pc(123) int local123 = 0; local123 <= local119; local123++) {
						Static347.aClass207_39.method8212((int) (((float) local123 - (float) local119 / 2.0F) * (float) Static655.anInt10510), 0, (local119 + 1) * Static655.anInt10510);
						local108++;
						local106.method8662(Static347.aClass207_39, (Class2_Sub5) null, 0);
						if ((long) arg0 <= Static566.method7936() - local65) {
							break label41;
						}
					}
				}
			}
			Static546.aClass132_13.method7493();
			@Pc(194) long local194 = (long) (local108 * 1000) / (Static566.method7936() - local65);
			Static546.aClass132_13.GA(0);
			Static546.aClass132_13.ya();
			return (int) local194;
		} catch (@Pc(208) Throwable local208) {
			local208.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lclient!ld;")
	public static Class203 method6640(@OriginalArg(1) int arg0) {
		@Pc(8) Class203[] local8 = Static667.method9047();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class203 local16 = local8[local10];
			if (arg0 == local16.anInt5698) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)Lclient!kj;")
	public static Class86 method6641() {
		try {
			return (Class86) Class.forName("Class86_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(IIIII)I")
	public static int method6642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xF;
		@Pc(23) int local23 = local7 >= 8 ? arg3 : arg1;
		@Pc(40) int local40 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg1 : arg0;
		return ((local7 & 0x2) == 0 ? local40 : -local40) + ((local7 & 0x1) == 0 ? local23 : -local23);
	}
}
