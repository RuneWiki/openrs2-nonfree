import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ci", name = "R", descriptor = "[B")
	public static final byte[] aByteArray16 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILclient!bi;ZI)V")
	public static void method1112(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class31 arg2) {
		Static211.anInt4328 = 0;
		Static347.aClass31_74 = arg2;
		Static445.anInt7588 = 1;
		Static289.anInt5377 = 2;
		Static481.anInt8134 = arg1;
		Static554.anInt9318 = arg0;
		Static189.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;ZJI)V")
	public static void method1113(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2) {
		if (arg1) {
			Static282.method4470();
			if (Static40.aString12.equals("")) {
				Static521.anInt8882 = 39;
				return;
			}
		}
		@Pc(19) Class4_Sub9 local19 = new Class4_Sub9(576);
		local19.method5961(-345277664, 10);
		local19.method6012((int) (Math.random() * 65535.0D));
		local19.method6008(arg2);
		local19.method6012(arg1 ? Static126.anInt2948 : Static431.anInt7395);
		local19.method6000(arg0);
		local19.method6008(arg1 ? Static226.aLong119 : Static316.aLong165);
		if (arg1) {
			local19.method6008(Static551.method7610(Static40.aString12));
			try {
				local19.method6008(Long.parseLong(Static240.aString58));
			} catch (@Pc(99) Exception local99) {
				Static521.anInt8882 = 39;
				return;
			}
		} else {
			local19.method5963((int) (Math.random() * 9.9999999E7D));
			local19.method5963((int) (Math.random() * 9.9999999E7D));
			local19.method5963((int) (Math.random() * 9.9999999E7D));
			local19.method5963((int) (Math.random() * 9.9999999E7D));
		}
		local19.method5963((int) (Math.random() * 9.9999999E7D));
		local19.method5975(Static204.aBigInteger4, Static574.aBigInteger8);
		@Pc(117) Class4_Sub41 local117 = Static212.method3682();
		local117.aClass4_Sub9_Sub1_3.method5961(-345277664, arg1 ? Static581.aClass118_12.anInt3562 : Static581.aClass118_9.anInt3562);
		@Pc(130) int local130 = 1;
		if (Static248.aString60 != null) {
			local130 = Static248.aString60.length() + 1 + 1;
		}
		local117.aClass4_Sub9_Sub1_3.method6012(local19.anInt7219 + local130 + 28);
		local117.aClass4_Sub9_Sub1_3.method6012(617);
		local117.aClass4_Sub9_Sub1_3.method5961(-345277664, Static56.anInt953);
		local117.aClass4_Sub9_Sub1_3.method5961(-345277664, Static538.aClass263_5.anInt6964);
		Static28.method519(local117.aClass4_Sub9_Sub1_3);
		@Pc(177) String local177 = arg1 ? Static240.aString57 : Static248.aString60;
		local117.aClass4_Sub9_Sub1_3.method5961(-345277664, local177 == null ? 0 : 1);
		if (local177 != null) {
			local117.aClass4_Sub9_Sub1_3.method6000(local177);
		}
		local117.aClass4_Sub9_Sub1_3.method5985(local19.aByteArray97, local19.anInt7219);
		Static551.method7603(local117);
		Static521.anInt8882 = -3;
		Static430.anInt7383 = 1;
		Static166.anInt3598 = 0;
		Static228.anInt4680 = 0;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
	public static void method1120() {
		Static551.aFont2 = null;
		Static314.anImage16 = null;
	}
}
