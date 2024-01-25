import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!ul;")
	public static Class246 aClass246_43;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "J")
	public static long aLong45;

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
	public static int anInt1593;

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
	public static int anInt1587 = 1;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_36 = new Class7("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	public static int anInt1592 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([[BILclient!js;)V")
	public static void method1401(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class14_Sub1 arg1) {
		@Pc(12) int local12 = Static390.aByteArrayArray18.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) byte[] local20 = arg0[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static266.anIntArray627[local14] >> 8) * 64 - Static165.anInt3049;
				@Pc(44) int local44 = (Static266.anIntArray627[local14] & 0xFF) * 64 - Static345.anInt5799;
				Static435.method5771();
				arg1.method3013(local20, local33, Static125.aClass188Array1, Static415.aClass39_11, local44);
			}
		}
	}
}
