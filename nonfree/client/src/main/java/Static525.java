import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[Lclient!uh;")
	public static Class347[] aClass347Array5;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Z")
	public static boolean aBoolean720 = false;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method8036(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg4 + 7) / 8);
		@Pc(41) int local41 = -((arg2 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local32; local49 < 0; local49++) {
			for (@Pc(55) int local55 = local41; local55 < 0; local55++) {
				if (arg1[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local19;
			if (arg1[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg0;
		}
		return false;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!df;[Lclient!uf;)V")
	public static void method8041(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) Class5_Sub43[] arg1) {
		@Pc(6) int local6;
		if (Static238.aBoolean310) {
			local6 = arg0.method8902(arg1, true);
			Static205.aClass57_5.method7716(local6, arg1);
		}
		if (Static134.aClass22Array1 == Static242.aClass22Array3) {
			@Pc(28) int local28;
			if (arg0 instanceof Class8_Sub1_Sub3) {
				local6 = ((Class8_Sub1_Sub3) arg0).aShort109;
				local28 = ((Class8_Sub1_Sub3) arg0).aShort108;
			} else {
				local6 = arg0.anInt10355 >> Static611.anInt10115;
				local28 = arg0.anInt10363 >> Static611.anInt10115;
			}
			Static205.aClass57_5.EA(Static220.aClass22Array2[0].method8032(arg0.anInt10355, arg0.anInt10363), Static291.method4315(local6, local28), Static104.method1524(local6, local28), Static186.method2704(local6, local28));
		}
		@Pc(64) Class8_Sub10 local64 = arg0.method8909((byte) -104, Static205.aClass57_5);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean769) {
			@Pc(74) Class8_Sub7[] local74 = local64.aClass8_Sub7Array1;
			for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
				@Pc(81) Class8_Sub7 local81 = local74[local76];
				if (local81.aBoolean519) {
					Static82.method9318(local81.anInt6702 + local81.anInt6700, local81.anInt6698 - local81.anInt6700, local81.anInt6701 + local81.anInt6700, local81.anInt6699 - local81.anInt6700);
				}
			}
		}
		if (local64.aBoolean731) {
			local64.aClass8_Sub1_21 = arg0;
			if (Static218.aBoolean283) {
				@Pc(127) Class339 local127 = Static51.aClass339_1;
				synchronized (Static51.aClass339_1) {
					Static51.aClass339_1.method8423(local64);
					return;
				}
			}
			Static51.aClass339_1.method8423(local64);
			return;
		}
		Static383.method5604(local64);
	}
}
