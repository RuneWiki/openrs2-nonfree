import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!tg;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "[Lclient!eb;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "[Lclient!sj;")
	public static final Class190[] aClass190Array1 = new Class190[29];

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt4758 = -1;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
	public static final int anInt4760 = 12;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V")
	public static void method4263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class12 local8 = Static209.method3975(arg5, arg4);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray1 != null) {
			@Pc(18) Class1_Sub16 local18 = new Class1_Sub16();
			local18.aClass12_5 = local8;
			local18.anObjectArray34 = local8.anObjectArray1;
			Static196.method3777(local18);
		}
		Static257.anInt5340 = arg0;
		Static152.anInt4540 = arg1;
		Static175.anInt3793 = arg3;
		Static96.anInt6250 = local8.anInt406;
		Static91.aBoolean214 = true;
		Static245.anInt4996 = arg2;
		Static97.anInt5544 = arg5;
		Static349.anInt6682 = arg4;
		Static6.method247(local8);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public static void method4264() {
		@Pc(5) Class87 local5 = Static22.aClass87_44;
		synchronized (Static22.aClass87_44) {
			Static22.aClass87_44.method2477();
		}
		local5 = Static337.aClass87_61;
		synchronized (Static337.aClass87_61) {
			Static337.aClass87_61.method2477();
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public static void method4265() {
		if (Static197.aFrame2 != null) {
			return;
		}
		@Pc(13) int local13 = Static98.anInt2364;
		@Pc(15) int local15 = Static195.anInt4173;
		@Pc(23) int local23 = Static170.anInt3645 - local13 - Static194.anInt4145;
		@Pc(31) int local31 = Static357.anInt4330 - local15 - Static271.anInt5530;
		if (local13 <= 0 && local23 <= 0 && local15 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(46) Container local46;
			if (Static84.aFrame1 == null) {
				local46 = Static15.aClass143_1.anApplet1;
			} else {
				local46 = Static84.aFrame1;
			}
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			if (local46 == Static84.aFrame1) {
				@Pc(61) Insets local61 = Static84.aFrame1.getInsets();
				local55 = local61.top;
				local53 = local61.left;
			}
			@Pc(70) Graphics local70 = local46.getGraphics();
			local70.setColor(Color.black);
			if (local13 > 0) {
				local70.fillRect(local53, local55, local13, Static357.anInt4330);
			}
			if (local15 > 0) {
				local70.fillRect(local53, local55, Static170.anInt3645, local15);
			}
			if (local23 > 0) {
				local70.fillRect(Static170.anInt3645 + local53 - local23, local55, local23, Static357.anInt4330);
			}
			if (local31 > 0) {
				local70.fillRect(local53, local55 + Static357.anInt4330 - local31, Static170.anInt3645, local31);
				return;
			}
		} catch (@Pc(123) Exception local123) {
			return;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public static void method4266() {
		if (Static129.aClass7_2 != null) {
			Static129.aClass7_2.method5548();
		}
		if (Static88.aClass7_1 != null) {
			Static88.aClass7_1.method5548();
		}
		Static12.method359(Static259.aBoolean281);
		Static129.aClass7_2 = Static244.method4381(Static349.aCanvas5, 22050, Static15.aClass143_1, 0);
		Static129.aClass7_2.method5555(Static328.aClass1_Sub1_Sub1_3);
		Static88.aClass7_1 = Static244.method4381(Static349.aCanvas5, 2048, Static15.aClass143_1, 1);
		Static88.aClass7_1.method5555(Static145.aClass1_Sub1_Sub4_1);
	}
}
