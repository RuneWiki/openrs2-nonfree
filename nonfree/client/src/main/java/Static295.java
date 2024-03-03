import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!cf;)Ljava/lang/String;", line = 6)
	public static String method5422(@OriginalArg(1) Class2_Sub5 arg0) {
		return arg0.aString11 == null || arg0.aString11.length() <= 0 ? arg0.aString10 : arg0.aString10 + Class2_Sub20.aClass79_67.method2269(Class197.anInt5569) + arg0.aString11;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 82)
	public static void method5426() {
		@Pc(12) Class204 local12 = null;
		try {
			@Pc(16) Class32 local16 = Static305.aClass152_5.method3757();
			while (local16.anInt992 == 0) {
				Static214.method4024(1L);
			}
			if (local16.anInt992 == 1) {
				local12 = (Class204) local16.anObject2;
				@Pc(40) byte[] local40 = new byte[(int) local12.method5197()];
				@Pc(55) int local55;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local55) {
					local55 = local12.method5195(local40.length - local42, local42, local40);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static168.method3369(new Class2_Sub4(local40));
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local12 != null) {
				local12.method5194();
			}
		} catch (@Pc(89) Exception local89) {
		}
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)V", line = 181)
	public static void method5429(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub2_Sub7 local13 = Static293.method5414(9, arg0);
		local13.method2314();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!wm;)V", line = 200)
	public static void method5430(@OriginalArg(1) Class19 arg0) {
		if (Class99.aClass135_21.method3544() == 0) {
			return;
		}
		@Pc(50) Class2_Sub17 local50;
		if (Class2_Sub10.anInt1760 == 0) {
			for (local50 = (Class2_Sub17) Class99.aClass135_21.method3552(); local50 != null; local50 = (Class2_Sub17) Class99.aClass135_21.method3553()) {
				Static290.aClass107_2.method2771(local50.anInt2538, Static187.aClass130_3, local50.anInt2536, arg0, false, local50.anInt2532, false, local50.aBoolean183 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null, local50.anInt2534, arg0, local50.anInt2535);
				local50.method6469();
			}
			Static91.method2109();
			return;
		}
		if (Static167.aClass19_5 == null) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(36, 32);
			Static167.aClass19_5 = Static361.method2824(0, Static305.aClass152_5, Static120.anInterface2_4, local18, 0);
			Static72.aClass130_2 = Static167.aClass19_5.method2859(Static94.method2167(Static171.anInt80, Static235.aClass197_64), Static372.method1690(Static29.aClass197_5, Static171.anInt80));
		}
		for (local50 = (Class2_Sub17) Class99.aClass135_21.method3552(); local50 != null; local50 = (Class2_Sub17) Class99.aClass135_21.method3553()) {
			Static290.aClass107_2.method2771(local50.anInt2538, Static72.aClass130_2, local50.anInt2536, arg0, false, local50.anInt2532, false, local50.aBoolean183 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null, local50.anInt2534, Static167.aClass19_5, local50.anInt2535);
			local50.method6469();
		}
	}
}
