import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!rba", name = "W", descriptor = "Lclient!h;")
	public static final Class114 aClass114_139 = new Class114("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!rba", name = "X", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_54 = new Class38();

	@OriginalMember(owner = "client!rba", name = "Y", descriptor = "I")
	public static final int anInt7143 = 1401;

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "(B)Ljava/lang/String;")
	public static String method6106() {
		return Static25.aBoolean94 || Static158.aClass1_Sub50_1 == null ? "" : Static158.aClass1_Sub50_1.aString83;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IZ)V")
	public static void method6108(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static451.aFloat85 = 3.0F;
		} else if (arg0 == 50) {
			Static451.aFloat85 = 4.0F;
		} else if (arg0 == 75) {
			Static451.aFloat85 = 6.0F;
		} else if (arg0 == 100) {
			Static451.aFloat85 = 8.0F;
		} else if (arg0 == 200) {
			Static451.aFloat85 = 16.0F;
		}
		Static128.anInt3069 = -1;
		Static128.anInt3069 = -1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!qa;J)V")
	public static void method6109(@OriginalArg(1) Class9 arg0, @OriginalArg(2) long arg1) {
		Static497.anInt8451 = 0;
		Static277.anInt5501 = Static406.anInt7096;
		Static406.anInt7096 = 0;
		@Pc(22) long local22 = Static93.method2172();
		for (@Pc(27) Class2_Sub3 local27 = (Class2_Sub3) Static14.aClass145_2.method3919(); local27 != null; local27 = (Class2_Sub3) Static14.aClass145_2.method3926()) {
			if (local27.method2066(arg0, arg1)) {
				Static497.anInt8451++;
			}
		}
		if (Static92.aBoolean166 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static14.aClass145_2.method3924() + ", running: " + Static497.anInt8451 + ". Particles: " + Static406.anInt7096 + ". Time taken: " + (Static93.method2172() - local22) + "ms");
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIII)V")
	public static void method6111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static367.anInt6543 = arg1;
		Static337.anInt6309 = arg0;
		Static15.anInt834 = arg2;
		Static434.anInt7455 = arg3;
	}
}
