import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "Lclient!uha;")
	public static Class177 aClass177_4;

	@OriginalMember(owner = "client!gi", name = "Y", descriptor = "F")
	public static float aFloat52;

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "Lclient!qs;")
	public static final Class291 aClass291_3 = new Class291();

	@OriginalMember(owner = "client!gi", name = "W", descriptor = "F")
	public static float aFloat51 = 1.0F;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	public static void method2704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static132.anInt2246 + arg1;
		@Pc(14) int local14 = arg0 + Static123.anInt2176;
		if (Static28.aClass53ArrayArrayArray1 == null || arg1 < 0 || arg0 < 0 || arg1 >= Static228.anInt3704 || Static162.anInt2911 <= arg0 || Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 0 && arg2 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127) {
			return;
		}
		@Pc(58) long local58 = (long) (local14 << 14 | arg2 << 28 | local9);
		@Pc(64) Class2_Sub11 local64 = (Class2_Sub11) Static41.aClass118_6.method2595(local58);
		if (local64 == null) {
			Static529.method7305(arg2, arg1, arg0);
			return;
		}
		@Pc(78) Class2_Sub4 local78 = (Class2_Sub4) local64.aClass109_23.method2325();
		if (local78 == null) {
			Static529.method7305(arg2, arg1, arg0);
			return;
		}
		@Pc(92) Class13_Sub1_Sub5_Sub1 local92 = (Class13_Sub1_Sub5_Sub1) Static529.method7305(arg2, arg1, arg0);
		if (local92 == null) {
			local92 = new Class13_Sub1_Sub5_Sub1(arg1 << 9, Static314.aClass76Array2[arg2].method7396(arg0, arg1), arg0 << 9, arg2, arg2);
		} else {
			local92.anInt8000 = local92.anInt7990 = -1;
		}
		local92.anInt7999 = local78.anInt69;
		local92.anInt7991 = local78.anInt71;
		label56: while (true) {
			@Pc(135) Class2_Sub4 local135 = (Class2_Sub4) local64.aClass109_23.method2318();
			if (local135 == null) {
				break;
			}
			if (local135.anInt69 != local92.anInt7999) {
				local92.anInt8000 = local135.anInt69;
				local92.anInt7987 = local135.anInt71;
				while (true) {
					@Pc(156) Class2_Sub4 local156 = (Class2_Sub4) local64.aClass109_23.method2318();
					if (local156 == null) {
						break label56;
					}
					if (local156.anInt69 != local92.anInt7999 && local156.anInt69 != local92.anInt8000) {
						local92.anInt7998 = local156.anInt71;
						local92.anInt7990 = local156.anInt69;
					}
				}
			}
		}
		@Pc(212) int local212 = Static504.method6917((arg1 << 9) + 256, arg2, (arg0 << 9) + 256);
		local92.aByte127 = (byte) arg2;
		local92.anInt7997 = 0;
		local92.aByte126 = (byte) arg2;
		local92.anInt10089 = arg0 << 9;
		local92.anInt10090 = arg1 << 9;
		local92.anInt10097 = local212;
		if (Static181.method2642(arg0, arg1)) {
			local92.aByte126++;
		}
		Static467.method6316(arg2, arg1, arg0, local212, local92);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIIBIIII)V")
	public static void method2705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static234.aClass2_Sub5_48.aClass6_Sub22_5.method7291() != 0 && arg3 != 0 && Static270.anInt4355 < 50 && arg4 != -1) {
			Static81.aClass105Array1[Static270.anInt4355++] = new Class105((byte) 2, arg4, arg3, arg1, arg2, arg0, arg5, null);
		}
	}
}
