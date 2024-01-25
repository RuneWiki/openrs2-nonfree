import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "Lclient!c;")
	public static Class31 aClass31_3;

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
	public static int anInt4928;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "Lclient!vn;")
	public static Class255 aClass255_2;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_103 = new Class83("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_27 = new Class68(4);

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_218 = new Class22(84, 2);

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_59 = new Class215(75, 16);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method3775() {
		for (@Pc(10) Class4_Sub8 local10 = (Class4_Sub8) Static281.aClass183_34.method4140(); local10 != null; local10 = (Class4_Sub8) Static281.aClass183_34.method4144()) {
			if (local10.aBoolean66) {
				local10.method638();
			}
		}
		for (@Pc(30) Class4_Sub8 local30 = (Class4_Sub8) Static143.aClass183_20.method4140(); local30 != null; local30 = (Class4_Sub8) Static143.aClass183_20.method4144()) {
			if (local30.aBoolean66) {
				local30.method638();
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLclient!iv;)Ljava/lang/String;")
	public static String method3776(@OriginalArg(1) Class4_Sub12 arg0) {
		return Static356.method4831(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([BFFIIIFFIIIFLclient!ge;)V")
	public static void method3782(@OriginalArg(0) byte[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) Class79 arg7) {
		for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
			Static353.method4771(arg2, arg7, arg1, arg5, arg0, local10, arg6, arg3, arg4);
			arg3 += 16384;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ya;Lclient!fi;III)V")
	public static void method3787(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class164 local12;
		if (arg3 < Static422.anInt6945) {
			local12 = Static202.aClass164ArrayArrayArray5[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass16_Sub4_2 != null && local12.aClass16_Sub4_2.method5338()) {
				arg1.method5337(0, Static4.anInt5935, local12.aClass16_Sub4_2, true, arg0, 0);
			}
		}
		if (arg4 < Static422.anInt6945) {
			local12 = Static202.aClass164ArrayArrayArray5[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass16_Sub4_2 != null && local12.aClass16_Sub4_2.method5338()) {
				arg1.method5337(Static4.anInt5935, 0, local12.aClass16_Sub4_2, true, arg0, 0);
			}
		}
		if (arg3 < Static422.anInt6945 && arg4 < Static171.anInt3361) {
			local12 = Static202.aClass164ArrayArrayArray5[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass16_Sub4_2 != null && local12.aClass16_Sub4_2.method5338()) {
				arg1.method5337(Static4.anInt5935, Static4.anInt5935, local12.aClass16_Sub4_2, true, arg0, 0);
			}
		}
		if (arg3 < Static422.anInt6945 && arg4 > 0) {
			local12 = Static202.aClass164ArrayArrayArray5[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass16_Sub4_2 != null && local12.aClass16_Sub4_2.method5338()) {
				arg1.method5337(-Static4.anInt5935, Static4.anInt5935, local12.aClass16_Sub4_2, true, arg0, 0);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)V")
	public static void method3788() {
		Static308.aBoolean485 = true;
	}
}
