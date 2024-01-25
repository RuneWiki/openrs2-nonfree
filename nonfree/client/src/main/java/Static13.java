import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
	public static int anInt331;

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	public static int anInt335;

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "[Lclient!pk;")
	public static Class1_Sub5_Sub1[] aClass1_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_11 = new Class217(82, 0);

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "[B")
	public static final byte[] aByteArray8 = new byte[520];

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
	public static int anInt332 = 0;

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
	public static int anInt334 = 0;

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "[I")
	public static final int[] anIntArray28 = new int[3];

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BILclient!at;)V")
	public static void method375(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (Static5.aClass162_1 == null) {
			return;
		}
		try {
			Static5.aClass162_1.method4553(0L);
			Static5.aClass162_1.method4549(arg1.aByteArray41, 24, arg0);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
