import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "[I")
	public static final int[] anIntArray523 = new int[5];

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "[F")
	public static final float[] aFloatArray89 = new float[4];

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
	public static int anInt8194 = 0;

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "Lclient!wp;")
	public static Class361 aClass361_14 = null;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
	public static int anInt8197 = -1;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!tf;I)I")
	public static int method6790(@OriginalArg(0) Class322 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method6797(Static70.anInt1594)) {
			local5++;
		}
		if (arg0.method6797(Static196.anInt9122)) {
			local5++;
		}
		if (arg0.method6797(Static61.anInt1467)) {
			local5++;
		}
		if (arg0.method6797(Static339.anInt5929)) {
			local5++;
		}
		if (arg0.method6797(Static403.anInt6974)) {
			local5++;
		}
		if (arg0.method6797(Static498.anInt8095)) {
			local5++;
		}
		if (arg0.method6797(Static466.anInt7754)) {
			local5++;
		}
		if (arg0.method6797(Static275.anInt4831)) {
			local5++;
		}
		if (arg0.method6797(Static261.anInt4597)) {
			local5++;
		}
		if (arg0.method6797(Static230.anInt4044)) {
			local5++;
		}
		if (arg0.method6797(Static96.anInt1960)) {
			local5++;
		}
		if (arg0.method6797(Static476.anInt7884)) {
			local5++;
		}
		if (arg0.method6797(Static283.anInt4877)) {
			local5++;
		}
		if (arg0.method6797(Static366.anInt6318)) {
			local5++;
		}
		if (arg0.method6797(Static391.anInt6857)) {
			local5++;
		}
		if (arg0.method6797(Static100.anInt2048)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IBI)Z")
	public static boolean method6792(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)V")
	public static void method6794() {
		Static403.anInt6982 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static164.aClass3_Sub11Array1[local14] = null;
			Static477.aByteArray89[local14] = 1;
			Static352.aClass252Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(JJ)J")
	public static long method6795(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
