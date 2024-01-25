import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static int anInt73;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public static int anInt76;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_1 = new Class34("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method62() {
		@Pc(1) Class87 local1 = Static77.aClass87_16;
		synchronized (Static77.aClass87_16) {
			Static77.aClass87_16.method2485();
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method63() {
		@Pc(8) int[] local8 = new int[Static345.anInt6609];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static345.anInt6609; local12++) {
			@Pc(26) Class111 local26 = Static20.method561(local12);
			if (local26.anInt3318 >= 0 || local26.anInt3285 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static36.anIntArray101 = new int[local10];
		for (@Pc(53) int local53 = 0; local53 < local10; local53++) {
			Static36.anIntArray101[local53] = local8[local53];
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
	public static void method64(@OriginalArg(0) boolean arg0) {
		Static63.method4863();
		if (Static295.anInt5811 != 30 && Static295.anInt5811 != 25) {
			return;
		}
		Static46.anInt1508++;
		if (Static46.anInt1508 < 50 && !arg0) {
			return;
		}
		Static46.anInt1508 = 0;
		if (!Static225.aBoolean459 && Static7.aClass148_1 != null) {
			Static342.aClass1_Sub8_Sub1_7.method3229(95);
			try {
				Static7.aClass148_1.method4122(Static342.aClass1_Sub8_Sub1_7.anInt5182, Static342.aClass1_Sub8_Sub1_7.aByteArray81);
				Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
			} catch (@Pc(51) IOException local51) {
				Static225.aBoolean459 = true;
			}
		}
		Static63.method4863();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Lclient!jn;")
	public static Class108 method65(@OriginalArg(0) int arg0) {
		@Pc(10) Class108 local10 = (Class108) Static28.aClass87_6.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static224.aClass216_75.method5648(4, arg0);
		local10 = new Class108();
		if (local25 != null) {
			local10.method2879(new Class1_Sub8(local25), arg0);
		}
		local10.method2884(arg0);
		Static28.aClass87_6.method2481(local10, (long) arg0);
		return local10;
	}
}
