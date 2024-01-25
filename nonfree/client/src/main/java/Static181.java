import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public static int anInt3989;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "Lclient!hh;")
	public static Class132 aClass132_1;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!iia;")
	public static final Class142 aClass142_5 = new Class142();

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public static int anInt3980 = -1;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "Z")
	public static boolean aBoolean323 = true;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!tm;BLclient!tm;)V")
	public static void method3392(@OriginalArg(0) Class6_Sub5 arg0, @OriginalArg(2) Class6_Sub5 arg1) {
		if (arg1.aClass6_Sub5_67 != null) {
			arg1.method7748();
		}
		arg1.aClass6_Sub5_66 = arg0.aClass6_Sub5_66;
		arg1.aClass6_Sub5_67 = arg0;
		arg1.aClass6_Sub5_67.aClass6_Sub5_66 = arg1;
		arg1.aClass6_Sub5_66.aClass6_Sub5_67 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method3394(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static381.method6035(local6.height, local6.width);
		if (Static552.anInt9486 == 1) {
			Static293.aClass5_6.method6104(arg0, Static226.anInt5043, Static84.anInt2618);
		} else {
			Static293.aClass5_6.method6104(arg0, Static528.anInt9203, Static287.anInt5975);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)Lclient!wo;")
	public static Class9_Sub4_Sub1 method3396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub4_Sub1_2;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZZ)V")
	public static void method3397(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static224.anInt5037++;
			Static233.method4262();
		}
		if (arg1) {
			Static141.anInt3351++;
			Static243.method3832();
		}
	}
}
