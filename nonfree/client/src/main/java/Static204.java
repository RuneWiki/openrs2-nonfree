import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!caa;")
	public static Class3_Sub7_Sub1 aClass3_Sub7_Sub1_1;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "[I")
	public static final int[] anIntArray208 = new int[4];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/awt/Canvas;Lclient!d;I)Lclient!ha;")
	public static Class5 method3514(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2) {
		return new Class5_Sub2(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZJLclient!ha;)V")
	public static void method3515(@OriginalArg(1) long arg0, @OriginalArg(2) Class5 arg1) {
		Static398.anInt7399 = Static622.anInt10061;
		Static138.anInt2768 = 0;
		Static455.anInt8041 = 0;
		Static622.anInt10061 = 0;
		@Pc(20) long local20 = Static374.method6036();
		for (@Pc(25) Class4_Sub10 local25 = (Class4_Sub10) Static88.aClass120_1.method2966(); local25 != null; local25 = (Class4_Sub10) Static88.aClass120_1.method2962()) {
			if (local25.method7844(arg1, arg0)) {
				Static455.anInt8041++;
			}
		}
		if (Static293.aBoolean341 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static88.aClass120_1.method2958() + ", running: " + Static455.anInt8041);
			System.out.println("Emitters: " + Static138.anInt2768 + " Particles: " + Static622.anInt10061 + ". Time taken: " + (Static374.method6036() - local20) + "ms");
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method3516() {
		Static541.method7917();
		Static447.aBoolean555 = false;
		Static423.method6625(Static625.anInt10194, Static354.anInt6787, Static452.anInt3209, Static276.anInt4979);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public static void method3517() {
		if (Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 0 && Static549.anInt9262 != Static35.anInt1167) {
			Static607.method8701(Static133.anInt2704, 11, Static482.anInt8390, false);
		} else {
			Static422.method6615(Static323.aClass5_9);
			if (Static549.anInt9262 != Static251.anInt4608) {
				Static429.method6678();
			}
		}
	}
}
