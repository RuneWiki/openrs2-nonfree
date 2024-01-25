import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_12 = new Class181(30, 1);

	@OriginalMember(owner = "client!bp", name = "z", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_2 = new Class186(9, 0, 4, 1);

	@OriginalMember(owner = "client!bp", name = "B", descriptor = "Lclient!du;")
	public static final Class81 aClass81_11 = new Class81(64);

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_28 = new Class136(23, 7);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZI)Z")
	public static boolean method804(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V")
	public static void method805() {
		Static451.method6701(255, -1);
	}
}
