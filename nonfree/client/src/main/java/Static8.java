import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
	public static int anInt204;

	@OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
	public static int anInt208;

	@OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
	public static int anInt216;

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Lclient!pj;")
	public static final Class156 aClass156_3 = new Class156(128);

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
	public static int anInt201 = 127;

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString7 = "wave2:";

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "Z")
	public static boolean aBoolean28 = true;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB)I")
	public static int method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)Lclient!ne;")
	public static Class1_Sub25 method284() {
		if (Static342.aClass195_17 == null || Static49.aClass76_1 == null) {
			return null;
		}
		Static49.aClass76_1.method2084(Static342.aClass195_17);
		@Pc(23) Class1_Sub25 local23 = (Class1_Sub25) Static49.aClass76_1.method2087();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class202 local32 = Static221.method4034(local23.anInt4124);
			return local32 != null && local32.aBoolean519 && local32.method5175() ? local23 : Static288.method5421();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V")
	public static void method286(@OriginalArg(0) int arg0) {
		Static326.anInt6247 = arg0;
		Static158.aClass140_83.method3819();
	}

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(B)V")
	public static void method287() {
		if (Static93.aBoolean161 && Static220.aBooleanArray24[81] && Static277.anInt6207 > 2) {
			Static310.method5234((Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248.aClass1_248);
		} else {
			Static310.method5234((Class1_Sub41) Static175.aClass195_36.aClass1_207.aClass1_248);
		}
	}
}
