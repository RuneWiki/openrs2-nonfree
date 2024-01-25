import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_171 = new Class77(13, -1);

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
	public static int anInt6290 = 0;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_192 = new Class41(39, 3);

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "[I")
	public static final int[] anIntArray760 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!lk;I)Lclient!st;")
	public static Class104_Sub4 method5414(@OriginalArg(0) Class2_Sub13 arg0) {
		return new Class104_Sub4(arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4251(), arg0.method4235(), arg0.method4235(), arg0.method4240());
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)I")
	public static int method5421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static174.method5749(arg0 + 45365, 4, arg1 + 91923) + (Static174.method5749(arg0 + 10294, 2, arg1 + 37821) - 128 >> 1) + (Static174.method5749(arg0, 1, arg1) - 128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public static void method5424() {
		Static143.method2454(Static304.aClass82_4, (long) Static295.anInt5281);
		if (Static226.anInt4223 != -1) {
			Static216.method3641(Static226.anInt4223);
		}
		for (@Pc(18) int local18 = 0; local18 < Static318.anInt4651; local18++) {
			if (Static370.aBooleanArray143[local18]) {
				Static185.aBooleanArray73[local18] = true;
			}
			Static5.aBooleanArray148[local18] = Static370.aBooleanArray143[local18];
			Static370.aBooleanArray143[local18] = false;
		}
		Static213.anInt3923 = Static295.anInt5281;
		if (Static304.aClass82_4.method4543()) {
			Static257.aBoolean490 = true;
		}
		if (Static226.anInt4223 != -1) {
			Static318.anInt4651 = 0;
			Static236.method3858();
		}
		Static304.aClass82_4.method4512();
		Static344.method5463(Static29.anInt669);
		Static346.anInt6113 = 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!wk;IIB)J")
	public static long method5425(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) Class34 local24 = Static11.aClass123_5.method2703(arg0.method5025());
		@Pc(45) long local45 = (long) (arg2 | arg1 << 7 | arg0.method5027() << 14 | arg0.method5024() << 20 | 0x40000000);
		if (local24.anInt788 == 0) {
			local45 |= local17;
		}
		if (local24.anInt815 == 1) {
			local45 |= local5;
		}
		if (local24.aBoolean57) {
			local45 |= local15;
		}
		return local45 | (long) arg0.method5025() << 32;
	}
}
