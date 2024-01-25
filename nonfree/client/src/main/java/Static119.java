import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "[Lclient!ba;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_46 = new Class117("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "[I")
	public static final int[] anIntArray157 = new int[14];

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_21 = new Class16();

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZLclient!nq;I)Lclient!br;")
	public static Class31 method1790(@OriginalArg(2) Class144 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method3896(0, arg1);
		return local14 == null ? null : new Class31(local14);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public static void method1791() {
		if (Static107.aClass129_4.method4959()) {
			Static172.method2812();
			Static107.aClass129_4.method4936(Static34.aCanvas1);
			Static239.method4236();
		} else {
			Static156.method2520(Static74.anInt1413);
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
	public static void method1792() {
		for (@Pc(8) int local8 = 0; local8 < Static141.anInt2601; local8++) {
			@Pc(14) int local14 = Static4.anIntArray4[local8];
			@Pc(18) Class67_Sub3_Sub3_Sub1 local18 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local14];
			if (local18 != null) {
				Static318.method5289(local18.aClass82_1.anInt1871, local18);
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)I")
	public static int method1793() {
		@Pc(10) Class26 local10 = Static196.aClass26_38;
		synchronized (Static196.aClass26_38) {
			return Static196.aClass26_38.method337();
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public static void method1795() {
		@Pc(11) Class26 local11 = Static262.aClass26_48;
		synchronized (Static262.aClass26_48) {
			Static262.aClass26_48.method333();
		}
	}
}
