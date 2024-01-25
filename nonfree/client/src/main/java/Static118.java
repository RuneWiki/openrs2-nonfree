import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "Lclient!bc;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!la;")
	public static final Class136 aClass136_56 = new Class136(10, 5);

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!of;")
	public static final Class174 aClass174_67 = new Class174("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
	public static int anInt2076 = 0;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[Lclient!ok;")
	public static final Class176[] aClass176Array1 = new Class176[30];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method1897() {
		@Pc(11) int local11 = Static271.anInt4534;
		@Pc(13) int[] local13 = Static215.anIntArray267;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			@Pc(23) Class1_Sub2_Sub6_Sub2 local23 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local13[local15]];
			if (local23 != null) {
				Static64.method1222(local23.method6204(), local23);
			}
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	public static void method1898() {
		@Pc(5) Class268 local5 = Static13.aClass268_2;
		synchronized (Static13.aClass268_2) {
			Static13.aClass268_2.method6160();
		}
		local5 = Static438.aClass268_24;
		synchronized (Static438.aClass268_24) {
			Static438.aClass268_24.method6160();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg3 && arg8 == arg5 && arg4 == arg7 && arg0 == arg6) {
			Static452.method6157(arg4, arg3, arg5, arg0, arg1);
			return;
		}
		@Pc(43) int local43 = arg3;
		@Pc(45) int local45 = arg5;
		@Pc(49) int local49 = arg3 * 3;
		@Pc(53) int local53 = arg5 * 3;
		@Pc(57) int local57 = arg2 * 3;
		@Pc(61) int local61 = arg8 * 3;
		@Pc(65) int local65 = arg7 * 3;
		@Pc(69) int local69 = arg6 * 3;
		@Pc(78) int local78 = local57 + arg4 - arg3 - local65;
		@Pc(88) int local88 = arg0 + local61 - local69 - arg5;
		@Pc(98) int local98 = local49 + local65 - local57 - local57;
		@Pc(107) int local107 = local53 + local69 - local61 - local61;
		@Pc(111) int local111 = local57 - local49;
		@Pc(115) int local115 = local61 - local53;
		for (@Pc(117) int local117 = 128; local117 <= 4096; local117 += 128) {
			@Pc(125) int local125 = local117 * local117 >> 12;
			@Pc(131) int local131 = local117 * local125 >> 12;
			@Pc(135) int local135 = local131 * local78;
			@Pc(139) int local139 = local131 * local88;
			@Pc(143) int local143 = local98 * local125;
			@Pc(147) int local147 = local107 * local125;
			@Pc(151) int local151 = local117 * local111;
			@Pc(155) int local155 = local115 * local117;
			@Pc(165) int local165 = arg3 + (local151 + local143 + local135 >> 12);
			@Pc(176) int local176 = arg5 + (local155 + local139 + local147 >> 12);
			Static452.method6157(local165, local43, local45, local176, arg1);
			local45 = local176;
			local43 = local165;
		}
	}
}
