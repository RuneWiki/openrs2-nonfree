import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public static int anInt6804;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lclient!wq;")
	public static final Class268[] aClass268Array1 = new Class268[4];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!ns;I)Lclient!rt;")
	public static Class4_Sub1_Sub16 method5280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		@Pc(14) Class4_Sub30 local14 = new Class4_Sub30(arg2.method3696(arg0, arg1));
		@Pc(45) Class4_Sub1_Sub16 local45 = new Class4_Sub1_Sub16(arg0, local14.method4867(), local14.method4867(), local14.method4872(), local14.method4872(), local14.method4864() == 1, local14.method4864(), local14.method4864());
		@Pc(49) int local49 = local14.method4864();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass258_43.method5526(new Class4_Sub38(local14.method4864(), local14.method4877(), local14.method4877(), local14.method4877(), local14.method4877(), local14.method4877(), local14.method4877(), local14.method4877(), local14.method4877()));
		}
		local45.method4920();
		return local45;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method5281() {
		@Pc(6) Class69 local6 = Static53.aClass69_12;
		synchronized (Static53.aClass69_12) {
			Static53.aClass69_12.method1593();
		}
	}
}
