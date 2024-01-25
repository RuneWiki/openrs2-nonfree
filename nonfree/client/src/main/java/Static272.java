import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_112 = new Class119("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	public static void method3801() {
		Static374.anInt6309 = 0;
		Static287.anInt5027 = 0;
		Static102.anInt1848 = 0;
		Static311.anInt5407 = 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V")
	public static void method3804(@OriginalArg(0) int arg0) {
		if (Static236.anIntArray278 == null || Static236.anIntArray278.length < arg0) {
			Static236.anIntArray278 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIBLclient!lr;)V")
	public static void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class25_Sub5_Sub1_Sub2 arg2) {
		if (arg1 == arg2.anInt4270 && arg1 != -1) {
			@Pc(12) Class177 local12 = Static174.aClass254_1.method5670(arg1);
			@Pc(15) int local15 = local12.anInt5037;
			if (local15 == 1) {
				arg2.anInt4277 = 0;
				arg2.anInt4301 = 0;
				arg2.anInt4235 = arg0;
				arg2.lb = 1;
				arg2.anInt4271 = 0;
				Static70.method1141(local12, arg2.aByte94, arg2.anInt5518, arg2.anInt5514, arg2 == Static447.aClass25_Sub5_Sub1_Sub2_4, arg2.anInt4301);
			}
			if (local15 == 2) {
				arg2.anInt4277 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt4270 == -1 || Static174.aClass254_1.method5670(arg1).anInt5039 >= Static174.aClass254_1.method5670(arg2.anInt4270).anInt5039) {
			arg2.anInt4270 = arg1;
			arg2.anInt4235 = arg0;
			arg2.lb = 1;
			arg2.anInt4316 = arg2.anInt4314;
			arg2.anInt4301 = 0;
			arg2.anInt4277 = 0;
			arg2.anInt4271 = 0;
			if (arg2.anInt4270 != -1) {
				Static70.method1141(Static174.aClass254_1.method5670(arg2.anInt4270), arg2.aByte94, arg2.anInt5518, arg2.anInt5514, arg2 == Static447.aClass25_Sub5_Sub1_Sub2_4, arg2.anInt4301);
			}
		}
	}
}
