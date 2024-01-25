import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "[Lclient!hv;")
	public static Class148[] aClass148Array2;

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_105 = new Class286(8, 15);

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "(I)I")
	public static int method4999() {
		if (Static288.aClass196_3 == null) {
			if (!Static167.aBoolean291 && Static347.anInt6255 > 0) {
				if (Static561.aBoolean709 && Static529.aClass177_10.method4001(81) && Static347.anInt6255 > 2) {
					return ((Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285.aClass2_285).anInt899;
				}
				return ((Class2_Sub5) Static375.aClass8_38.aClass2_9.aClass2_285).anInt899;
			}
			@Pc(47) int local47 = Static326.aClass149_1.method5879();
			@Pc(51) int local51 = Static326.aClass149_1.method5875();
			@Pc(53) int local53 = Static344.anInt6231;
			@Pc(55) int local55 = Static202.anInt3966;
			@Pc(57) int local57 = Static23.anInt642;
			if (local47 > local53 && local47 < local57 + local53) {
				@Pc(67) int local67 = -1;
				@Pc(87) int local87;
				for (@Pc(69) int local69 = 0; local69 < Static347.anInt6255; local69++) {
					if (Static316.aBoolean475) {
						local87 = (Static347.anInt6255 - local69 - 1) * 16 + local55 + 33;
						if (local51 > local87 - 13 && local51 <= local87 + 3) {
							local67 = local69;
						}
					} else {
						local87 = local55 + (-local69 + -1 + Static347.anInt6255) * 16 + 31;
						if (local87 - 13 < local51 && local87 + 3 >= local51) {
							local67 = local69;
						}
					}
				}
				if (local67 != -1) {
					local87 = 0;
					@Pc(156) Class308 local156 = new Class308(Static375.aClass8_38);
					for (@Pc(161) Class2_Sub5 local161 = (Class2_Sub5) local156.method6870(); local161 != null; local161 = (Class2_Sub5) local156.method6869()) {
						if (local67 == local87++) {
							return local161.anInt899;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIZII)V")
	public static void method5000(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static168.method2918(arg2)) {
			Static478.method6776(arg3, arg0, Static2.aClass196ArrayArray1[arg2], -1, arg1);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!es;ZI)V")
	public static void method5004(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (Static83.aClass64_1 == null) {
			return;
		}
		try {
			Static83.aClass64_1.method1187(0L);
			Static83.aClass64_1.method1188(arg0.aByteArray62, arg1, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
