import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mn", name = "M", descriptor = "Lclient!ci;")
	public static Class38 aClass38_52;

	@OriginalMember(owner = "client!mn", name = "I", descriptor = "F")
	public static float aFloat69 = 0.0F;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!ki;)V")
	public static void method4101(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0) {
		@Pc(11) Class4_Sub6 local11 = (Class4_Sub6) Static48.aClass96_3.method2797((long) arg0.anInt6518);
		if (local11 == null) {
			Static456.method6201(arg0.anIntArray523[0], arg0.aByte100, null, 0, arg0.anIntArray524[0], null, arg0);
		} else {
			local11.method924();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;BZJ)V")
	public static void method4102(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2) {
		if (arg1) {
			Static177.method3242();
			if (Static235.aString41.equals("")) {
				Static266.anInt5058 = 39;
				return;
			}
		}
		@Pc(19) Class4_Sub20 local19 = new Class4_Sub20(128);
		local19.method4590(10);
		local19.method4558((int) (Math.random() * 65535.0D));
		local19.method4556(arg2);
		local19.method4558(Static399.anInt7070);
		local19.method4561((int) (Math.random() * 9.9999999E7D));
		local19.method4599(arg0);
		local19.method4561((int) (Math.random() * 9.9999999E7D));
		if (arg1) {
			local19.method4556(Static234.method3954(Static235.aString41));
			try {
				local19.method4556(Long.parseLong(Static133.aString20));
			} catch (@Pc(83) Exception local83) {
				Static266.anInt5058 = 39;
				return;
			}
		} else {
			local19.method4561((int) (Math.random() * 9.9999999E7D));
			local19.method4561((int) (Math.random() * 9.9999999E7D));
			local19.method4561((int) (Math.random() * 9.9999999E7D));
			local19.method4561((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4561((int) (Math.random() * 9.9999999E7D));
		local19.method4583(Static110.aBigInteger2, Static67.aBigInteger1);
		Static457.aClass4_Sub20_Sub1_5.anInt5526 = 0;
		Static457.aClass4_Sub20_Sub1_5.method4590(arg1 ? Static34.aClass81_11.anInt2486 : Class4_Sub3_Sub3.lb.anInt2486);
		Static457.aClass4_Sub20_Sub1_5.method4558(local19.anInt5526 + 28);
		Static457.aClass4_Sub20_Sub1_5.method4558(604);
		Static457.aClass4_Sub20_Sub1_5.method4590(Static168.anInt3290);
		Static457.aClass4_Sub20_Sub1_5.method4590(Static332.aClass235_6.anInt6654);
		Static42.method914(Static457.aClass4_Sub20_Sub1_5);
		Static457.aClass4_Sub20_Sub1_5.method4600(local19.aByteArray77, local19.anInt5526);
		Static266.anInt5058 = -3;
		Static328.anInt5873 = 1;
		Static186.anInt3782 = 0;
		Static44.anInt1000 = 0;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(II)V")
	public static void method4104(@OriginalArg(0) int arg0) {
		if (!Static157.aClass185_Sub1_1.aBoolean403) {
			arg0 = -1;
		}
		if (arg0 == Static441.anInt7552) {
			return;
		}
		if (arg0 != -1) {
			@Pc(22) Class194 local22 = Static433.aClass275_2.method6300(arg0);
			@Pc(26) Class98 local26 = local22.method4691();
			if (local26 == null) {
				arg0 = -1;
			} else {
				Static390.aClass255_5.method5829(Static409.aCanvas7, local26.method2849(), new Point(local22.anInt5649, local22.anInt5650), local26.method2837(), local26.method2851());
				Static441.anInt7552 = arg0;
			}
		}
		if (arg0 == -1 && Static441.anInt7552 != -1) {
			Static390.aClass255_5.method5829(Static409.aCanvas7, -1, new Point(), null, -1);
			Static441.anInt7552 = -1;
		}
	}
}
