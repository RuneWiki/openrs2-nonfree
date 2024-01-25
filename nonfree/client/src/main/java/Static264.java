import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	public static int anInt5018;

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
	public static int anInt5034;

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!iq", name = "E", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_56 = new Class341(28, 5);

	@OriginalMember(owner = "client!iq", name = "J", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!iq", name = "K", descriptor = "Lclient!jd;")
	public static final Class177 aClass177_3 = new Class177("RC", 1);

	@OriginalMember(owner = "client!iq", name = "R", descriptor = "[I")
	public static final int[] anIntArray254 = new int[4];

	@OriginalMember(owner = "client!iq", name = "T", descriptor = "Z")
	public static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4548(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(21) Class2_Sub52 local21 = Static311.method5098(Static362.aClass341_92, Static125.aClass179_1);
			local21.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(arg0));
			local21.aClass2_Sub8_Sub2_2.method5212(arg0);
			Static38.method791(local21);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIBLclient!ka;I)Lclient!mg;")
	public static Class232 method4550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class14 arg2, @OriginalArg(4) int arg3) {
		return arg2 == null ? null : new Class232(arg3, arg1, arg0, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZI)Z")
	public static boolean method4551(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
