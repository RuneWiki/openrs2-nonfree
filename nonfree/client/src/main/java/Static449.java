import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
	public static int anInt8531;

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "Lclient!mf;")
	public static final Class214 aClass214_12 = new Class214();

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "[Lclient!fo;")
	public static final Class111[] aClass111Array2 = new Class111[14];

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)[Lclient!kd;")
	public static Class176[] method6611() {
		return new Class176[] { Static223.aClass176_2, Static485.aClass176_4, Static255.aClass176_3 };
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(ZII)Ljava/lang/String;")
	public static String method6615(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static497.method7184(arg0);
	}
}
