import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Lclient!raa;")
	public static Class253 aClass253_15;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_112 = new Class158(12, 11);

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Lclient!fj;")
	public static final Class91 aClass91_9 = new Class91("", 17);

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
	public static int anInt8336 = -1;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_137 = new Class67("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "[I")
	public static final int[] anIntArray712 = new int[1000];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!tq;I)[Lclient!ng;")
	public static Class204[] method6914(@OriginalArg(0) Class285 arg0) {
		if (!arg0.method7038()) {
			return new Class204[0];
		}
		@Pc(24) Class212 local24 = arg0.method7037();
		while (local24.anInt6547 == 0) {
			Static327.method5231(10L);
		}
		if (local24.anInt6547 == 2) {
			return new Class204[0];
		}
		@Pc(46) int[] local46 = (int[]) local24.anObject13;
		@Pc(52) Class204[] local52 = new Class204[local46.length >> 2];
		for (@Pc(54) int local54 = 0; local54 < local52.length; local54++) {
			@Pc(60) Class204 local60 = new Class204();
			local52[local54] = local60;
			local60.anInt6216 = local46[local54 << 2];
			local60.anInt6218 = local46[(local54 << 2) + 1];
			local60.anInt6219 = local46[(local54 << 2) + 2];
			local60.anInt6215 = local46[(local54 << 2) + 3];
		}
		return local52;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
	public static boolean method6916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIB)V")
	public static void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class3_Sub16 local6 = (Class3_Sub16) Static529.aClass71_66.method2089(); local6 != null; local6 = (Class3_Sub16) Static529.aClass71_66.method2086()) {
			Static76.method1555(arg2, arg0, arg3, arg1, local6);
		}
		for (@Pc(31) Class3_Sub16 local31 = (Class3_Sub16) Static239.aClass71_41.method2089(); local31 != null; local31 = (Class3_Sub16) Static239.aClass71_41.method2086()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class73 local40 = local31.aClass6_Sub1_Sub2_Sub2_2.method7088();
			if (local31.aClass6_Sub1_Sub2_Sub2_2.aBoolean630) {
				local35 = 0;
			} else if (local40.anInt2434 == local31.aClass6_Sub1_Sub2_Sub2_2.anInt8534 || local31.aClass6_Sub1_Sub2_Sub2_2.anInt8534 == local40.anInt2412 || local31.aClass6_Sub1_Sub2_Sub2_2.anInt8534 == local40.anInt2425 || local31.aClass6_Sub1_Sub2_Sub2_2.anInt8534 == local40.anInt2439) {
				local35 = 2;
			} else if (local40.anInt2417 == local31.aClass6_Sub1_Sub2_Sub2_2.anInt8534 || local31.aClass6_Sub1_Sub2_Sub2_2.anInt8534 == local40.anInt2407 || local40.anInt2403 == local31.aClass6_Sub1_Sub2_Sub2_2.anInt8534 || local40.anInt2419 == local31.aClass6_Sub1_Sub2_Sub2_2.anInt8534) {
				local35 = 3;
			}
			if (local35 != local31.anInt2628) {
				@Pc(127) int local127 = Static90.method1815(local31.aClass6_Sub1_Sub2_Sub2_2);
				@Pc(131) Class230 local131 = local31.aClass6_Sub1_Sub2_Sub2_2.aClass230_1;
				if (local131.anIntArray627 != null) {
					local131 = local131.method5898(Static127.aClass215_1);
				}
				if (local131 == null || local127 == -1) {
					local31.anInt2622 = -1;
					local31.aBoolean197 = false;
				} else if (local31.anInt2622 != local127 || local31.aBoolean197 != local131.aBoolean450) {
					if (local31.aClass3_Sub9_Sub2_2 != null) {
						Static530.aClass3_Sub9_Sub3_2.method5653(local31.aClass3_Sub9_Sub2_2);
						local31.aClass3_Sub9_Sub2_2 = null;
					}
					local31.aBoolean197 = local131.aBoolean450;
					local31.aClass3_Sub44_2 = null;
					local31.anInt2622 = local127;
					local31.aClass3_Sub42_Sub1_2 = null;
				}
				local31.anInt2628 = local35;
			}
			local31.anInt2636 = local31.aClass6_Sub1_Sub2_Sub2_2.anInt8811;
			local31.anInt2627 = local31.aClass6_Sub1_Sub2_Sub2_2.anInt8811 + (local31.aClass6_Sub1_Sub2_Sub2_2.method7083() << 8);
			local31.anInt2630 = local31.aClass6_Sub1_Sub2_Sub2_2.anInt8813;
			local31.anInt2637 = local31.aClass6_Sub1_Sub2_Sub2_2.anInt8813 + (local31.aClass6_Sub1_Sub2_Sub2_2.method7083() << 8);
			Static76.method1555(arg2, arg0, arg3, arg1, local31);
		}
		for (@Pc(246) Class3_Sub16 local246 = (Class3_Sub16) Static25.aClass267_1.method6643(); local246 != null; local246 = (Class3_Sub16) Static25.aClass267_1.method6650()) {
			@Pc(250) byte local250 = 1;
			@Pc(255) Class73 local255 = local246.aClass6_Sub1_Sub2_Sub1_2.method7088();
			if (local246.aClass6_Sub1_Sub2_Sub1_2.aBoolean630) {
				local250 = 0;
			} else if (local255.anInt2434 == local246.aClass6_Sub1_Sub2_Sub1_2.anInt8534 || local255.anInt2412 == local246.aClass6_Sub1_Sub2_Sub1_2.anInt8534 || local255.anInt2425 == local246.aClass6_Sub1_Sub2_Sub1_2.anInt8534 || local255.anInt2439 == local246.aClass6_Sub1_Sub2_Sub1_2.anInt8534) {
				local250 = 2;
			} else if (local255.anInt2417 == local246.aClass6_Sub1_Sub2_Sub1_2.anInt8534 || local255.anInt2407 == local246.aClass6_Sub1_Sub2_Sub1_2.anInt8534 || local246.aClass6_Sub1_Sub2_Sub1_2.anInt8534 == local255.anInt2403 || local255.anInt2419 == local246.aClass6_Sub1_Sub2_Sub1_2.anInt8534) {
				local250 = 3;
			}
			if (local250 != local246.anInt2628) {
				@Pc(346) int local346 = Static475.method7097(local246.aClass6_Sub1_Sub2_Sub1_2);
				if (local346 != local246.anInt2622 || local246.aBoolean197 != local246.aClass6_Sub1_Sub2_Sub1_2.aBoolean162) {
					if (local246.aClass3_Sub9_Sub2_2 != null) {
						Static530.aClass3_Sub9_Sub3_2.method5653(local246.aClass3_Sub9_Sub2_2);
						local246.aClass3_Sub9_Sub2_2 = null;
					}
					local246.aClass3_Sub42_Sub1_2 = null;
					local246.aBoolean197 = local246.aClass6_Sub1_Sub2_Sub1_2.aBoolean162;
					local246.anInt2622 = local346;
					local246.aClass3_Sub44_2 = null;
				}
				local246.anInt2628 = local250;
			}
			local246.anInt2636 = local246.aClass6_Sub1_Sub2_Sub1_2.anInt8811;
			local246.anInt2627 = local246.aClass6_Sub1_Sub2_Sub1_2.anInt8811 + (local246.aClass6_Sub1_Sub2_Sub1_2.method7083() << 8);
			local246.anInt2630 = local246.aClass6_Sub1_Sub2_Sub1_2.anInt8813;
			local246.anInt2637 = local246.aClass6_Sub1_Sub2_Sub1_2.anInt8813 + (local246.aClass6_Sub1_Sub2_Sub1_2.method7083() << 8);
			Static76.method1555(arg2, arg0, arg3, arg1, local246);
		}
	}
}
