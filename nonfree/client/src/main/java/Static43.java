import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "Lclient!mg;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
	public static int anInt1086 = -1;

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_373 = Static177.method3050("Standort");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
	public static void method728(@OriginalArg(0) boolean arg0) {
		if (Static110.aClass27_5 == null) {
			return;
		}
		try {
			@Pc(16) Class4_Sub11 local16 = new Class4_Sub11(4);
			local16.method1238(arg0 ? 2 : 3);
			local16.method1249(0);
			Static110.aClass27_5.method957(local16.aByteArray19, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				Static110.aClass27_5.method952();
			} catch (@Pc(46) Exception local46) {
			}
			Static110.aClass27_5 = null;
			Static39.anInt1037++;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)I")
	public static int method730(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = 256 - arg1;
		return (local9 * (arg0 & 0xFF00FF) + (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg1 + (arg0 & 0xFF00) * local9 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIILclient!tg;JZ)V")
	public static void method731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class17 local6 = new Class17();
		local6.aClass4_Sub1_Sub1_1 = arg4;
		local6.anInt594 = arg1 * 128 + 64;
		local6.anInt599 = arg2 * 128 + 64;
		local6.anInt597 = arg3;
		local6.aLong19 = arg5;
		if (Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub7(arg0, arg1, arg2);
		}
		Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local6;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	public static void method733() {
		Static4.aClass66_40.method2218();
	}
}
