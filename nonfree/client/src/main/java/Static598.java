import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!uga", name = "N", descriptor = "I")
	public static int anInt9819;

	@OriginalMember(owner = "client!uga", name = "H", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_227 = new Class359(41, -2);

	@OriginalMember(owner = "client!uga", name = "Q", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_61 = new Class340(50);

	@OriginalMember(owner = "client!uga", name = "R", descriptor = "[B")
	public static final byte[] aByteArray100 = new byte[2048];

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIZILclient!ha;I)V")
	public static void method8188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class65 arg3, @OriginalArg(5) int arg4) {
		arg3.KA(arg1, arg2, arg1 + arg0, arg2 - -arg4);
		arg3.method6900(arg1, arg2, arg0, -16777216, arg4);
		if (Static500.anInt8324 < 100) {
			return;
		}
		@Pc(48) float local48 = (float) Static330.anInt756 / (float) Static330.anInt763;
		@Pc(50) int local50 = arg0;
		@Pc(52) int local52 = arg4;
		if (local48 < 1.0F) {
			local52 = (int) ((float) arg0 * local48);
		} else {
			local50 = (int) ((float) arg4 / local48);
		}
		@Pc(78) int local78 = arg2 + (arg4 - local52) / 2;
		@Pc(87) int local87 = arg1 + (arg0 - local50) / 2;
		if (Static161.aClass50_25 == null || Static161.aClass50_25.method6002() != arg0 || arg4 != Static161.aClass50_25.method5992()) {
			Static330.method691(Static330.anInt764, Static330.anInt759 + Static330.anInt756, Static330.anInt764 - -Static330.anInt763, Static330.anInt759, local87, local78, local50 + local87, local52 + local78);
			Static330.method693(arg3);
			Static161.aClass50_25 = arg3.method6936(local87, local78, local50, local52, false);
		}
		Static161.aClass50_25.method5996(local87, local78);
		@Pc(139) int local139 = local50 * Static61.anInt944 / Static330.anInt763;
		@Pc(145) int local145 = Static509.anInt8531 * local52 / Static330.anInt756;
		@Pc(154) int local154 = local87 + local50 * Static391.anInt6944 / Static330.anInt763;
		@Pc(168) int local168 = local52 + local78 - local52 * Static377.anInt6755 / Static330.anInt756 - local145;
		@Pc(170) int local170 = -1996554240;
		if (Static218.aClass98_2 == Static409.aClass98_3) {
			local170 = -1996488705;
		}
		arg3.aa(local154, local168, local139, local145, local170, 1);
		arg3.method6895(local154, local168, local139, local145, local170, 0);
		if (Static416.anInt7349 <= 0) {
			return;
		}
		@Pc(202) int local202;
		if (Static150.anInt3080 <= 50) {
			local202 = Static150.anInt3080 * 5;
		} else {
			local202 = 500 - Static150.anInt3080 * 5;
		}
		for (@Pc(216) Class5_Sub36 local216 = (Class5_Sub36) Static330.aClass114_6.method2805(); local216 != null; local216 = (Class5_Sub36) Static330.aClass114_6.method2814()) {
			@Pc(224) Class103 local224 = Static330.aClass93_3.method2280(local216.anInt5984);
			if (Static342.method5200(local224)) {
				@Pc(249) int local249;
				@Pc(262) int local262;
				if (local216.anInt5984 == Static16.anInt256) {
					local249 = local216.anInt5981 * local50 / Static330.anInt763 + local87;
					local262 = local78 + local52 * (Static330.anInt756 - local216.anInt5983) / Static330.anInt756;
					arg3.method6900(local249 - 2, local262 - 2, 4, local202 << 24 | 0xFFFF00, 4);
				} else if (Static426.anInt7486 != -1 && Static426.anInt7486 == local224.anInt2801) {
					local249 = local216.anInt5981 * local50 / Static330.anInt763 + local87;
					local262 = local78 + (Static330.anInt756 - local216.anInt5983) * local52 / Static330.anInt756;
					arg3.method6900(local249 - 2, local262 - 2, 4, local202 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "(I)V")
	public static void method8189() {
		Static583.aClass300_44.method7189();
	}
}
