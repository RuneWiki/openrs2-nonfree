import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gs", name = "eb", descriptor = "Lclient!io;")
	public static final Class152 aClass152_5 = new Class152(9, 2);

	@OriginalMember(owner = "client!gs", name = "pb", descriptor = "I")
	public static int anInt3934 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method3444(@OriginalArg(1) Class100 arg0) {
		if (Static463.aClass8_55.method150() == 0) {
			return;
		}
		@Pc(59) Class6_Sub19 local59;
		if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 0) {
			for (local59 = (Class6_Sub19) Static463.aClass8_55.method149(); local59 != null; local59 = (Class6_Sub19) Static463.aClass8_55.method155()) {
				Static266.aClass138_1.method3737(local59.anInt3629, local59.aBoolean262 ? Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 : null, local59.anInt3632, Static631.aClass50_12, local59.anInt3626, false, arg0, arg0, local59.anInt3627, local59.anInt3631, false);
				local59.method9043();
			}
			Static643.method8977();
			return;
		}
		if (Static399.aClass100_13 == null) {
			@Pc(29) Canvas local29 = new Canvas();
			local29.setSize(36, 32);
			Static399.aClass100_13 = Static280.method4926(Static383.aClass353_64, local29, Static535.anInterface4_10, 0, 0);
			Static467.aClass50_10 = Static399.aClass100_13.method8808(Static247.method4287(Static483.aClass353_89, Static273.anInt5418), Static651.method2405(Static540.aClass353_110, Static273.anInt5418));
		}
		for (local59 = (Class6_Sub19) Static463.aClass8_55.method149(); local59 != null; local59 = (Class6_Sub19) Static463.aClass8_55.method155()) {
			Static266.aClass138_1.method3737(local59.anInt3629, local59.aBoolean262 ? Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aClass12_1 : null, local59.anInt3632, Static467.aClass50_10, local59.anInt3626, false, Static399.aClass100_13, arg0, local59.anInt3627, local59.anInt3631, false);
			local59.method9043();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!vt;)I")
	public static int method3445(@OriginalArg(1) Class6_Sub40_Sub2 arg0) {
		@Pc(16) int local16 = arg0.method8619(2);
		@Pc(20) int local20;
		if (local16 == 0) {
			local20 = 0;
		} else if (local16 == 1) {
			local20 = arg0.method8619(5);
		} else if (local16 == 2) {
			local20 = arg0.method8619(8);
		} else {
			local20 = arg0.method8619(11);
		}
		return local20;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!rg;)Lclient!kn;")
	public static Class175 method3446(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(15) int local15 = arg0.method8579();
		return new Class175(local15);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ha;IB)Lclient!hia;")
	public static Class133 method3449(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class52 local14 = Static270.method4795(arg1, true, arg0);
		return local14 == null ? null : local14.aClass133_13;
	}
}
