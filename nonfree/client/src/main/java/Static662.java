import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Z")
	public static boolean aBoolean802;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
	public static boolean method9137(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class3_Sub11_Sub14 local15 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local15 != null; local15 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
			if (Static494.method7103(local15.anInt6738) && local15.aLong211 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)I")
	public static int method9139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!jp;I)Lclient!jl;")
	public static Class170 method9140(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(7) String local7 = arg0.method8613();
		@Pc(23) Class356 local23 = Static126.method2369()[arg0.method8632()];
		@Pc(30) Class56 local30 = Static398.method5612()[arg0.method8632()];
		@Pc(34) int local34 = arg0.method8589();
		@Pc(38) int local38 = arg0.method8589();
		@Pc(42) int local42 = arg0.method8632();
		@Pc(48) int local48 = arg0.method8632();
		@Pc(52) int local52 = arg0.method8632();
		@Pc(56) int local56 = arg0.method8593();
		@Pc(60) int local60 = arg0.method8593();
		@Pc(64) int local64 = arg0.method8618();
		@Pc(70) int local70 = arg0.method8618();
		@Pc(76) int local76 = arg0.method8618();
		return new Class170(local7, local23, local30, local34, local38, local42, local48, local52, local56, local60, local64, local70, local76);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	public static void method9143() {
		Static186.anInt3783 = Static59.aClass88_1.anInt2733 + Static59.aClass88_1.anInt2731 + 2;
		Static603.anInt9670 = Static253.aClass88_19.anInt2733 + Static253.aClass88_19.anInt2731 + 2;
		Static605.aStringArray33 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Static605.aStringArray33.length; local28++) {
			Static605.aStringArray33[local28] = "";
		}
		Static238.method4024(Static601.aClass346_3.method8440(Static609.anInt9834));
	}
}
