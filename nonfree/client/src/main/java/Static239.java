import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
	public static int anInt3796 = 0;

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
	public static int anInt3802 = 0;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!dga;I)Ljava/lang/String;")
	public static String method3430(@OriginalArg(0) Class3_Sub7_Sub5 arg0) {
		return arg0.aString40 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!ik;IBI)Lclient!pv;")
	public static Class3_Sub7_Sub18 method3433(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub2 local14 = new Class3_Sub2(arg0.method3985(arg1, arg2));
		@Pc(46) Class3_Sub7_Sub18 local46 = new Class3_Sub7_Sub18(arg1, local14.method2014(), local14.method2014(), local14.method2036(), local14.method2036(), local14.method2048(255) == 1, local14.method2048(255), local14.method2048(255));
		@Pc(52) int local52 = local14.method2048(255);
		for (@Pc(60) int local60 = 0; local60 < local52; local60++) {
			local46.aClass342_63.method7654(new Class3_Sub55(local14.method2048(255), local14.method2028(-14795), local14.method2028(-14795), local14.method2028(-14795), local14.method2028(-14795), local14.method2028(-14795), local14.method2028(-14795), local14.method2028(-14795), local14.method2028(-14795)));
		}
		local46.method6940();
		return local46;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3435(@OriginalArg(1) Class22 arg0) {
		if (Static557.aClass342_68.method7647() == 0) {
			return;
		}
		@Pc(62) Class3_Sub43 local62;
		if (Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 0) {
			for (local62 = (Class3_Sub43) Static557.aClass342_68.method7644(); local62 != null; local62 = (Class3_Sub43) Static557.aClass342_68.method7650()) {
				Static606.aClass62_2.method1883(local62.anInt7161, arg0, arg0, local62.aBoolean485 ? Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 : null, local62.anInt7167, false, Static607.aClass57_12, local62.anInt7162, local62.anInt7163, false, local62.anInt7165);
				local62.method9596();
			}
			Static402.method5423();
			return;
		}
		if (Static631.aClass22_13 == null) {
			@Pc(32) Canvas local32 = new Canvas();
			local32.setSize(36, 32);
			Static631.aClass22_13 = Static645.method8480(local32, Static240.anInterface4_11, 0, Static58.aClass182_12, 0);
			Static184.aClass57_3 = Static631.aClass22_13.method9353(Static613.method7850(Static109.anInt2309, Static652.aClass182_33), Static735.method8277(Static218.aClass182_59, Static109.anInt2309), true);
		}
		for (local62 = (Class3_Sub43) Static557.aClass342_68.method7644(); local62 != null; local62 = (Class3_Sub43) Static557.aClass342_68.method7650()) {
			Static606.aClass62_2.method1883(local62.anInt7161, Static631.aClass22_13, arg0, local62.aBoolean485 ? Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 : null, local62.anInt7167, false, Static184.aClass57_3, local62.anInt7162, local62.anInt7163, false, local62.anInt7165);
			local62.method9596();
		}
	}
}
