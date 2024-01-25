import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Lclient!bc;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_18 = new Class77(64);

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
	public static final int[] anIntArray154 = new int[250];

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_32 = new Class242(27, 2);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BJZLjava/lang/String;)V")
	public static void method1399(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		if (arg1) {
			Static348.method4539();
			if (Static290.aString53.equals("")) {
				Static228.anInt5704 = 39;
				return;
			}
		}
		@Pc(23) Class1_Sub19 local23 = new Class1_Sub19(128);
		local23.method2934(10);
		local23.method2930((int) (Math.random() * 65535.0D));
		local23.method2916(arg0);
		local23.method2930(Static209.anInt3892);
		local23.method2912((int) (Math.random() * 9.9999999E7D));
		local23.method2935(arg2);
		local23.method2912((int) (Math.random() * 9.9999999E7D));
		if (arg1) {
			local23.method2916(Static114.method1409(Static290.aString53));
			try {
				local23.method2916(Long.parseLong(Static244.aString3));
			} catch (@Pc(105) Exception local105) {
				Static228.anInt5704 = 39;
				return;
			}
		} else {
			local23.method2912((int) (Math.random() * 9.9999999E7D));
			local23.method2912((int) (Math.random() * 9.9999999E7D));
			local23.method2912((int) (Math.random() * 9.9999999E7D));
			local23.method2912((int) (Math.random() * 9.9999999E7D));
		}
		local23.method2912((int) (Math.random() * 9.9999999E7D));
		local23.method2922(Static251.aBigInteger1, Static417.aBigInteger2);
		Static426.aClass1_Sub19_Sub2_2.anInt3698 = 0;
		Static426.aClass1_Sub19_Sub2_2.method2934(arg1 ? Static67.aClass210_72.anInt5528 : Static67.aClass210_69.anInt5528);
		Static426.aClass1_Sub19_Sub2_2.method2930(local23.anInt3698 + 28);
		Static426.aClass1_Sub19_Sub2_2.method2930(601);
		Static426.aClass1_Sub19_Sub2_2.method2934(Static63.anInt981);
		Static426.aClass1_Sub19_Sub2_2.method2934(Static94.aClass148_3.anInt4191);
		Static188.method2695(Static426.aClass1_Sub19_Sub2_2);
		Static426.aClass1_Sub19_Sub2_2.method2921(local23.aByteArray38, local23.anInt3698);
		Static228.anInt5704 = -3;
		Static396.anInt6368 = 0;
		Static212.anInt3922 = 1;
		Static341.anInt5529 = 0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFI)I")
	public static int method1400(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local26 > local17 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local35 > local26) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public static void method1401() {
		Static284.aBoolean433 = true;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!hm;B)V")
	public static void method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class107 arg2) {
		if (Static364.aClass107_13 != null || Static170.aBoolean282 || (arg2 == null || Static116.method2264(arg2) == null)) {
			return;
		}
		Static364.aClass107_13 = arg2;
		Static192.aClass107_9 = Static116.method2264(arg2);
		Static373.aBoolean642 = false;
		Static256.anInt4522 = arg1;
		Static456.anInt3744 = arg0;
		Static156.anInt2548 = 0;
	}
}
