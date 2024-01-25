import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!mka", name = "j", descriptor = "I")
	public static int anInt6360;

	@OriginalMember(owner = "client!mka", name = "n", descriptor = "Lclient!fr;")
	public static final Class123 aClass123_8 = new Class123(10, 2, 2, 0);

	@OriginalMember(owner = "client!mka", name = "u", descriptor = "[I")
	public static final int[] anIntArray486 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!mka", name = "p", descriptor = "I")
	public static int anInt6361 = 0;

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!nt;IIB)V")
	public static void method5511(@OriginalArg(0) Class270 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static474.aBoolean505) {
			@Pc(21) Class303 local21 = Static496.anInt7898 == -1 ? null : Static583.aClass150_2.method3385(Static496.anInt7898);
			if (Static85.method1871(arg0).method6623() && (Static723.anInt11214 & 0x20) != 0 && (local21 == null || arg0.method6023(local21.anInt8150, Static496.anInt7898) != local21.anInt8150)) {
				Static283.method4000(arg0.anInt6973, Static261.aString59, true, (long) (arg0.anInt7020 << 0 | arg0.anInt6973), arg0.anInt7001, Static302.anInt4875, false, arg0.anInt7020, Static96.aString130 + " -> " + arg0.aString93, 48, 0L, false);
			}
		}
		@Pc(107) String local107;
		for (@Pc(100) int local100 = 9; local100 >= 5; local100--) {
			local107 = Static183.method2903(arg0, local100);
			if (local107 != null) {
				Static283.method4000(arg0.anInt6973, local107, true, (long) (arg0.anInt6973 | arg0.anInt7020 << 0), arg0.anInt7001, Static175.method2824(local100, arg0), false, arg0.anInt7020, arg0.aString93, 1002, (long) (local100 + 1), false);
			}
		}
		local107 = Static699.method9255(arg0);
		if (local107 != null) {
			Static283.method4000(arg0.anInt6973, local107, true, (long) (arg0.anInt6973 | arg0.anInt7020 << 0), arg0.anInt7001, arg0.anInt7053, false, arg0.anInt7020, arg0.aString93, 25, 0L, false);
		}
		for (@Pc(192) int local192 = 4; local192 >= 0; local192--) {
			@Pc(201) String local201 = Static183.method2903(arg0, local192);
			if (local201 != null) {
				Static283.method4000(arg0.anInt6973, local201, true, (long) (arg0.anInt6973 | arg0.anInt7020 << 0), arg0.anInt7001, Static175.method2824(local192, arg0), false, arg0.anInt7020, arg0.aString93, 20, (long) (local192 + 1), false);
			}
		}
		if (!Static85.method1871(arg0).method6625()) {
			return;
		}
		if (arg0.aString91 == null) {
			Static283.method4000(arg0.anInt6973, Static430.aClass257_10.method5699(Static456.anInt7118), true, (long) (arg0.anInt7020 << 0 | arg0.anInt6973), arg0.anInt7001, -1, false, arg0.anInt7020, "", 23, 0L, false);
		} else {
			Static283.method4000(arg0.anInt6973, arg0.aString91, true, (long) (arg0.anInt6973 | arg0.anInt7020 << 0), arg0.anInt7001, -1, false, arg0.anInt7020, "", 23, 0L, false);
		}
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method5512(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class270 local8 = Static1.method9504(arg2, arg3);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray30 != null) {
			@Pc(19) Class3_Sub41 local19 = new Class3_Sub41();
			local19.anInt6147 = arg1;
			local19.aClass270_12 = local8;
			local19.aString82 = arg0;
			local19.anObjectArray4 = local8.anObjectArray30;
			Static540.method7160(local19);
		}
		if (Static98.anInt2140 != 11 || !Static85.method1871(local8).method6628(arg1 - 1)) {
			return;
		}
		@Pc(64) Class3_Sub29 local64;
		if (arg1 == 1) {
			local64 = Static507.method6901(Static528.aClass144_80, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 2) {
			local64 = Static507.method6901(Static321.aClass144_50, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 3) {
			local64 = Static507.method6901(Static167.aClass144_27, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 4) {
			local64 = Static507.method6901(Static395.aClass144_61, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 5) {
			local64 = Static507.method6901(Static367.aClass144_57, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 6) {
			local64 = Static507.method6901(Static607.aClass144_92, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 7) {
			local64 = Static507.method6901(Static188.aClass144_31, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 8) {
			local64 = Static507.method6901(Static719.aClass144_77, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 9) {
			local64 = Static507.method6901(Static95.aClass144_19, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
		if (arg1 == 10) {
			local64 = Static507.method6901(Static357.aClass144_88, Static95.aClass292_2.aClass88_2);
			Static171.method7425(arg2, local8.anInt7001, local64, arg3);
			Static95.aClass292_2.method6855(local64);
		}
	}
}
