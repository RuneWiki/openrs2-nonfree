import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "Z")
	public static boolean aBoolean281;

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "[[[Lclient!up;")
	public static Class333[][][] aClass333ArrayArrayArray1;

	@OriginalMember(owner = "client!hca", name = "w", descriptor = "I")
	public static int anInt4100 = 0;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[FB)[F")
	public static float[] method3315(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static604.method6222(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
	public static void method3320() {
		if (Static253.aBoolean324) {
			return;
		}
		Static129.method2398(Static566.aClass333ArrayArrayArray2);
		if (Static590.aClass333ArrayArrayArray3 != null) {
			Static129.method2398(Static590.aClass333ArrayArrayArray3);
		}
		Static253.aBoolean324 = true;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZJLjava/lang/String;)V")
	public static void method3321(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) String arg2) {
		if (arg0) {
			Static78.method3300();
			if (Static223.aString111.equals("")) {
				Static36.anInt1076 = 39;
				return;
			}
		}
		@Pc(19) Class3_Sub26 local19 = new Class3_Sub26(576);
		local19.method6809(10);
		local19.method6769((int) (Math.random() * 65535.0D));
		local19.method6782(arg1);
		local19.method6769(arg0 ? Static403.anInt7292 : Static501.anInt8649);
		local19.method6772(arg2);
		local19.method6782(arg0 ? Static330.aLong165 : Static182.aLong91);
		if (arg0) {
			local19.method6782(Static68.method1648(Static223.aString111));
			try {
				local19.method6782(Long.parseLong(Static342.aString159));
			} catch (@Pc(104) Exception local104) {
				Static36.anInt1076 = 39;
				return;
			}
		} else {
			local19.method6826((int) (Math.random() * 9.9999999E7D));
			local19.method6826((int) (Math.random() * 9.9999999E7D));
			local19.method6826((int) (Math.random() * 9.9999999E7D));
			local19.method6826((int) (Math.random() * 9.9999999E7D));
		}
		local19.method6826((int) (Math.random() * 9.9999999E7D));
		local19.method6835(Static128.aBigInteger5, Static422.aBigInteger8);
		@Pc(122) Class3_Sub10 local122 = Static271.method4111();
		local122.aClass3_Sub26_Sub1_1.method6809(arg0 ? Static556.aClass126_40.anInt4274 : Static556.aClass126_37.anInt4274);
		@Pc(135) int local135 = 1;
		if (Static303.aString152 != null) {
			local135 = Static303.aString152.length() + 1 + 1;
		}
		local122.aClass3_Sub26_Sub1_1.method6769(local19.anInt8703 + local135 + 28);
		local122.aClass3_Sub26_Sub1_1.method6769(625);
		local122.aClass3_Sub26_Sub1_1.method6809(Static201.anInt4321);
		local122.aClass3_Sub26_Sub1_1.method6809(Static31.aClass89_1.anInt2860);
		Static278.method4207(local122.aClass3_Sub26_Sub1_1);
		@Pc(180) String local180 = arg0 ? Static387.aString175 : Static303.aString152;
		local122.aClass3_Sub26_Sub1_1.method6809(local180 == null ? 0 : 1);
		if (local180 != null) {
			local122.aClass3_Sub26_Sub1_1.method6772(local180);
		}
		local122.aClass3_Sub26_Sub1_1.method6824(local19.aByteArray213, local19.anInt8703);
		Static193.method3398(local122);
		Static560.anInt9754 = 0;
		Static318.anInt5854 = 1;
		Static79.anInt2120 = 0;
		Static36.anInt1076 = -3;
	}
}
