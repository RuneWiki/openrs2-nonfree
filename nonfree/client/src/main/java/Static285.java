import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "Lclient!ct;")
	public static Class30 aClass30_73;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!cb;")
	public static Class1_Sub12 aClass1_Sub12_2;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!hj;")
	public static Class81 aClass81_4 = null;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static int anInt4724 = -1;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!rs;")
	public static Interface8 anInterface8_2 = null;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
	public static void method4337() {
		for (@Pc(15) Class1_Sub4_Sub5 local15 = (Class1_Sub4_Sub5) Static356.aClass42_46.method1543(); local15 != null; local15 = (Class1_Sub4_Sub5) Static356.aClass42_46.method1551()) {
			@Pc(20) Class11_Sub2_Sub4 local20 = local15.aClass11_Sub2_Sub4_1;
			if (Static284.anInt6477 != local20.aByte79 || Static51.anInt1301 > local20.anInt4700) {
				local15.method6045();
				local20.method4318();
			} else if (Static51.anInt1301 >= local20.anInt4709) {
				if (local20.anInt4695 > 0) {
					@Pc(50) Class11_Sub2_Sub6_Sub2 local50 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local20.anInt4695 - 1];
					if (local50 != null && local50.anInt6729 >= 0 && Static311.anInt5653 * 128 > local50.anInt6729 && local50.anInt6726 >= 0 && Static189.anInt3820 * 128 > local50.anInt6726) {
						local20.method4319(Static51.anInt1301, local50.anInt6726, Static8.method288(local20.aByte79, local50.anInt6729, local50.anInt6726) - local20.anInt4691, local50.anInt6729);
					}
				}
				if (local20.anInt4695 < 0) {
					@Pc(105) int local105 = -local20.anInt4695 - 1;
					@Pc(114) Class11_Sub2_Sub6_Sub1 local114;
					if (local105 == Static352.anInt1802) {
						local114 = Static191.aClass11_Sub2_Sub6_Sub1_4;
					} else {
						local114 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local105];
					}
					if (local114 != null && local114.anInt6729 >= 0 && local114.anInt6729 < Static311.anInt5653 * 128 && local114.anInt6726 >= 0 && Static189.anInt3820 * 128 > local114.anInt6726) {
						local20.method4319(Static51.anInt1301, local114.anInt6726, Static8.method288(local20.aByte79, local114.anInt6729, local114.anInt6726) - local20.anInt4691, local114.anInt6729);
					}
				}
				local20.method4320(Static217.anInt4314);
				Static152.method2920(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ct;ZLclient!ct;)V")
	public static void method4341(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class30 arg1) {
		Static345.aClass30_101 = arg0;
		aClass30_73 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)I")
	public static int method4342() {
		if (Static243.aClass112_15 == null) {
			if (!Static217.aBoolean322 && Static224.anInt4512 > 0) {
				if (Static272.aBoolean405 && Static271.aClass60_2.method1863(81) && Static224.anInt4512 > 2) {
					return ((Class1_Sub22) Static317.aClass42_43.aClass1_73.aClass1_252.aClass1_252).anInt2826;
				}
				return ((Class1_Sub22) Static317.aClass42_43.aClass1_73.aClass1_252).anInt2826;
			}
			@Pc(27) int local27 = Static164.aClass142_1.method4911();
			@Pc(31) int local31 = Static164.aClass142_1.method4915();
			@Pc(33) int local33 = Static35.anInt920;
			@Pc(35) int local35 = Static361.anInt6937;
			@Pc(37) int local37 = Static182.anInt3706;
			if (local27 > local33 && local33 + local37 > local27) {
				@Pc(51) int local51 = -1;
				@Pc(70) int local70;
				for (@Pc(53) int local53 = 0; local53 < Static224.anInt4512; local53++) {
					if (Static171.aBoolean246) {
						local70 = (Static224.anInt4512 - local53 - 1) * 16 + local35 + 33;
						if (local31 > local70 - 13 && local31 <= local70 + 3) {
							local51 = local53;
						}
					} else {
						local70 = (Static224.anInt4512 - local53 - 1) * 16 + local35 + 31;
						if (local70 - 13 < local31 && local31 <= local70 + 3) {
							local51 = local53;
						}
					}
				}
				if (local51 != -1) {
					local70 = 0;
					@Pc(127) Class50 local127 = new Class50(Static317.aClass42_43);
					for (@Pc(132) Class1_Sub22 local132 = (Class1_Sub22) local127.method1690(); local132 != null; local132 = (Class1_Sub22) local127.method1691()) {
						if (local51 == local70++) {
							return local132.anInt2826;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!va;)I")
	public static int method4343(@OriginalArg(1) Class11_Sub2_Sub6 arg0) {
		if (arg0.anInt6786 == 0) {
			return 0;
		}
		@Pc(45) int local45;
		@Pc(52) int local52;
		if (arg0.anInt6736 != -1) {
			@Pc(14) Class11_Sub2_Sub6 local14 = null;
			if (arg0.anInt6736 < 32768) {
				local14 = Static231.aClass11_Sub2_Sub6_Sub2Array1[arg0.anInt6736];
			} else if (arg0.anInt6736 >= 32768) {
				local14 = Static275.aClass11_Sub2_Sub6_Sub1Array1[arg0.anInt6736 - 32768];
			}
			if (local14 != null) {
				local45 = arg0.anInt6729 - local14.anInt6729;
				local52 = arg0.anInt6726 - local14.anInt6726;
				if (local45 != 0 || local52 != 0) {
					arg0.method5890((int) (Math.atan2((double) local45, (double) local52) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub2_Sub6_Sub1) {
			@Pc(147) Class11_Sub2_Sub6_Sub1 local147 = (Class11_Sub2_Sub6_Sub1) arg0;
			if (local147.anInt6697 != -1 && (local147.anInt6798 == 0 || local147.anInt6797 > 0)) {
				local147.method5890(local147.anInt6697);
				local147.anInt6697 = -1;
			}
		} else if (arg0 instanceof Class11_Sub2_Sub6_Sub2) {
			@Pc(81) Class11_Sub2_Sub6_Sub2 local81 = (Class11_Sub2_Sub6_Sub2) arg0;
			if (local81.anInt6813 != -1 && (local81.anInt6798 == 0 || local81.anInt6797 > 0)) {
				local45 = local81.anInt6729 - (local81.anInt6813 - Static50.anInt1271 - Static50.anInt1271) * 64;
				local52 = local81.anInt6726 - (local81.anInt6812 - Static299.anInt4036 - Static299.anInt4036) * 64;
				if (local45 != 0 || local52 != 0) {
					local81.method5890((int) (Math.atan2((double) local45, (double) local52) * 2607.5945876176133D) & 0x3FFF);
				}
				local81.anInt6813 = -1;
			}
		}
		return arg0.method5884();
	}
}
