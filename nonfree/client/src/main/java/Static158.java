import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public static int anInt3163;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
	public static int anInt3162 = 0;

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_68 = new Class119(99, 7);

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_69 = new Class119(19, 6);

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_100 = new Class189("M", "M", "M", "M");

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
	public static final int anInt3165 = 1405;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "[B")
	public static final byte[] aByteArray45 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)V")
	public static void method2542(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 5);
		local8.method3244();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ob;Z)V")
	public static void method2543(@OriginalArg(0) Class7_Sub2_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static253.anInt4787 == arg0.anInt4398 || arg0.anInt4366 == -1 || arg0.anInt4387 != 0) {
			local5 = true;
		} else {
			@Pc(25) Class128 local25 = Static301.aClass170_3.method3936(arg0.anInt4366);
			if (local25.aBoolean342 || local25.anIntArray254[arg0.anInt4327] < arg0.anInt4397 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(53) int local53 = arg0.anInt4398 - arg0.anInt4339;
			@Pc(59) int local59 = Static253.anInt4787 - arg0.anInt4339;
			@Pc(71) int local71 = arg0.anInt4372 * 128 + arg0.method3499() * 64;
			@Pc(82) int local82 = arg0.anInt4343 * 128 + arg0.method3499() * 64;
			@Pc(93) int local93 = arg0.anInt4378 * 128 + arg0.method3499() * 64;
			@Pc(105) int local105 = arg0.anInt4394 * 128 + arg0.method3499() * 64;
			arg0.anInt4318 = (local71 * (local53 - local59) + local93 * local59) / local53;
			arg0.anInt4321 = (local105 * local59 + local82 * (local53 - local59)) / local53;
		}
		arg0.anInt4405 = 0;
		if (arg0.anInt4393 == 0) {
			arg0.method3503(8192);
		}
		if (arg0.anInt4393 == 1) {
			arg0.method3503(12288);
		}
		if (arg0.anInt4393 == 2) {
			arg0.method3503(0);
		}
		if (arg0.anInt4393 == 3) {
			arg0.method3503(4096);
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V")
	public static void method2545() {
		Static30.method641(Static105.aClass217_43);
		Static302.aClass3_Sub7_Sub1_2.method2613(Static2.anInt51);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!gm;III)V")
	public static void method2546(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class3_Sub12 local12 = (Class3_Sub12) Static17.aClass243_1.method5208(); local12 != null; local12 = (Class3_Sub12) Static17.aClass243_1.method5203()) {
			if (local12.anInt2113 == arg0 && arg2 << 7 == local12.anInt2117 && local12.anInt2125 == arg3 << 7 && local12.aClass93_1.anInt2747 == arg1.anInt2747) {
				if (local12.aClass3_Sub5_Sub2_1 != null) {
					Static331.aClass3_Sub5_Sub1_42.method886(local12.aClass3_Sub5_Sub2_1);
					local12.aClass3_Sub5_Sub2_1 = null;
				}
				if (local12.aClass3_Sub5_Sub2_2 != null) {
					Static331.aClass3_Sub5_Sub1_42.method886(local12.aClass3_Sub5_Sub2_2);
					local12.aClass3_Sub5_Sub2_2 = null;
				}
				local12.method5977();
				return;
			}
		}
	}
}
