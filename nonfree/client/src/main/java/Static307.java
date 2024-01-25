import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "Lclient!wd;")
	public static Class212 aClass212_7;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!jm;")
	public static Class107 aClass107_3;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!bd;")
	public static final Class18 aClass18_11 = new Class18();

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
	public static int anInt2887 = 0;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
	public static int anInt2890 = -60;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public static void method2743() {
		Static288.anIntArray504 = Static108.method2348(0.4F);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIILclient!mo;)Lclient!gh;")
	public static Class76 method2744(@OriginalArg(0) int arg0, @OriginalArg(3) Class143 arg1) {
		@Pc(9) byte[] local9 = arg1.method3745(arg0, 0);
		return local9 == null ? null : new Class76(local9);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	public static void method2746() {
		@Pc(1) Class11 local1 = Static159.aClass11_73;
		synchronized (Static159.aClass11_73) {
			Static159.aClass11_73.method215(5);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBI)V")
	public static void method2747(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static86.anIntArray191[arg0] = arg1;
		@Pc(21) Class14_Sub38 local21 = (Class14_Sub38) Static279.aClass25_28.method691((long) arg0);
		if (local21 == null) {
			local21 = new Class14_Sub38(4611686018427387905L);
			Static279.aClass25_28.method687((long) arg0, local21);
		} else if (local21.aLong206 != 4611686018427387905L) {
			local21.aLong206 = Static168.method3300() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Lclient!oh;")
	public static Class6_Sub1 method2748() {
		return Static161.anInt3401 < Static337.aClass6_Sub1Array1.length ? Static337.aClass6_Sub1Array1[Static161.anInt3401++] : null;
	}
}
