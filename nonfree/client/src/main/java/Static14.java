import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(Z)V")
	public static void method241() {
		Static219.aClass282_2.method6851();
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!dc;)Lclient!nia;")
	public static Class238 method242(@OriginalArg(1) Class3_Sub9 arg0) {
		@Pc(7) Class238 local7 = new Class238();
		local7.anInt6830 = arg0.method5610();
		local7.aClass3_Sub7_Sub14_1 = Static54.aClass257_1.method6447(local7.anInt6830);
		return local7;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
	public static void method243(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static67.anInt1336 == 2) {
				Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[0]);
				Static70.aClass301Array1[1].method7375(Static197.aClass250Array1[1]);
			} else if (Static67.anInt1336 == 3) {
				Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[0]);
				Static70.aClass301Array1[1].method7375(Static197.aClass250Array1[1]);
				Static70.aClass301Array1[2].method7375(Static197.aClass250Array1[2]);
			} else {
				Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[0]);
				Static70.aClass301Array1[1].method7375(Static197.aClass250Array1[1]);
				Static70.aClass301Array1[2].method7375(Static197.aClass250Array1[2]);
				Static70.aClass301Array1[3].method7375(Static197.aClass250Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static67.anInt1336 == 2) {
				Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[2]);
			} else if (Static67.anInt1336 == 3) {
				Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[3]);
				Static70.aClass301Array1[1].method7375(Static197.aClass250Array1[4]);
			} else {
				Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[4]);
				Static70.aClass301Array1[1].method7375(Static197.aClass250Array1[5]);
				Static70.aClass301Array1[2].method7375(Static197.aClass250Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static67.anInt1336 == 2) {
				Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[3]);
				return;
			}
			if (Static67.anInt1336 == 3) {
				Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[5]);
				return;
			}
			Static70.aClass301Array1[0].method7375(Static197.aClass250Array1[7]);
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!wq;I)I")
	public static int method244(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) Class309 local8 = arg0.aClass309_1;
		if (local8.anIntArray553 != null) {
			local8 = local8.method7594(Static183.aClass285_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt8856;
		@Pc(27) Class176 local27 = arg0.method8633();
		if (arg0.anInt10211 == -1 || arg0.aBoolean773) {
			local23 = local8.anInt8822;
		} else if (arg0.anInt10211 == local27.anInt5222 || local27.anInt5188 == arg0.anInt10211 || arg0.anInt10211 == local27.anInt5204 || arg0.anInt10211 == local27.anInt5217) {
			local23 = local8.anInt8831;
		} else if (arg0.anInt10211 == local27.anInt5210 || arg0.anInt10211 == local27.anInt5218 || arg0.anInt10211 == local27.anInt5221 || arg0.anInt10211 == local27.anInt5223) {
			local23 = local8.anInt8819;
		}
		return local23;
	}
}
