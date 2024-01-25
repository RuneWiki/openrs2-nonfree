import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "F")
	public static float aFloat113;

	// $FF: synthetic field
	@OriginalMember(owner = "client!nda", name = "e", descriptor = "Ljava/lang/Class;")
	private static Class aClass35;

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)I")
	public static int method6113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg2) {
			return arg0;
		}
		@Pc(18) int local18 = 128 - arg1;
		@Pc(32) int local32 = arg1 * (arg2 & 0x7F) + local18 * (arg0 & 0x7F) >> 7;
		@Pc(53) int local53 = (arg0 & 0x380) * local18 + (arg2 & 0x380) * arg1 >> 7;
		@Pc(68) int local68 = local18 * (arg0 & 0xFC00) + (arg2 & 0xFC00) * arg1 >> 7;
		return local53 & 0x380 | local68 & 0xFC00 | local32 & 0x7F;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)V")
	public static void method6114() {
		Static450.anInt7299 = -1;
		Static225.anInt3586 = 2;
		Static112.aBoolean215 = false;
		Static39.anInt535 = 1;
		Static24.aClass254_16 = null;
		Static478.aClass2_Sub23_Sub5_4 = null;
		Static515.anInt8213 = 0;
		Static403.anInt6656 = -1;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
	public static void method6115() {
		if (Static396.aClass145_6 == null) {
			return;
		}
		if (Static392.aBoolean549) {
			Static19.method267();
		}
		Static655.aClass52_3.method1069();
		Static506.method7169();
		Static145.method2135();
		Static385.method5735();
		Static303.method4229();
		Static158.method8562();
		Static33.method471();
		Static248.method3462();
		Static249.method3468();
		Static580.method8081();
		Static529.method7451(false);
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class4_Sub2_Sub1_Sub2_Sub1 local51 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local45];
			if (local51 != null) {
				for (@Pc(55) int local55 = 0; local55 < local51.aClass45Array3.length; local55++) {
					local51.aClass45Array3[local55] = null;
				}
			}
		}
		for (@Pc(84) int local84 = 0; local84 < Static676.anInt10488; local84++) {
			@Pc(91) Class4_Sub2_Sub1_Sub2_Sub2 local91 = Static459.aClass2_Sub49Array1[local84].aClass4_Sub2_Sub1_Sub2_Sub2_3;
			if (local91 != null) {
				for (@Pc(95) int local95 = 0; local95 < local91.aClass45Array3.length; local95++) {
					local91.aClass45Array3[local95] = null;
				}
			}
		}
		Static359.aClass86_2 = null;
		Static390.aClass86_3 = null;
		Static396.aClass145_6.method9661();
		Static396.aClass145_6 = null;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
	public static void method6116() {
		if (Static135.aClass389_2.aBoolean912) {
			Static510.anInt8117 = 96;
			return;
		}
		try {
			@Pc(33) Method local33 = (aClass35 == null ? (aClass35 = Class255.a("java.lang.Runtime")) : aClass35).getMethod("maxMemory");
			if (local33 != null) {
				try {
					@Pc(37) Runtime local37 = Runtime.getRuntime();
					@Pc(43) Long local43 = (Long) local33.invoke(local37, (Object[]) null);
					Static510.anInt8117 = (int) (local43 / 1048576L) + 1;
				} catch (@Pc(53) Throwable local53) {
				}
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!bi;BI)V")
	public static void method6117(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int[] local11 = new int[4];
		Static728.method275(local11, 0, local11.length, arg2);
		Static274.method3838(false, local11, arg0, arg1, 29498);
	}
}
