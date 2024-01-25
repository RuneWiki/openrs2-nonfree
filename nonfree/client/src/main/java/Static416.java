import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
	public static final int anInt7829 = 50;

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "[I")
	public static final int[] anIntArray407 = new int[anInt7829];

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "[I")
	public static final int[] anIntArray408 = new int[anInt7829];

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "[I")
	public static final int[] anIntArray409 = new int[anInt7829];

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_173 = new Class362(108, -1);

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "[I")
	public static final int[] anIntArray410 = new int[anInt7829];

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "[I")
	public static final int[] anIntArray411 = new int[anInt7829];

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray54 = new String[anInt7829];

	@OriginalMember(owner = "client!qba", name = "k", descriptor = "[I")
	public static final int[] anIntArray412 = new int[anInt7829];

	@OriginalMember(owner = "client!qba", name = "l", descriptor = "[Lclient!kk;")
	public static final Class191[] aClass191Array1 = new Class191[4];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)Z")
	public static boolean method6527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!qm;Lclient!r;Z)I")
	public static int method6528(@OriginalArg(0) Class274 arg0, @OriginalArg(1) Class44 arg1) {
		if (arg0.anInt8109 != -1) {
			return arg0.anInt8109;
		}
		if (arg0.anInt8106 != -1) {
			@Pc(28) Class14 local28 = arg1.anInterface11_11.method7405(arg0.anInt8106);
			if (!local28.aBoolean11) {
				return local28.aShort12;
			}
		}
		return arg0.anInt8101;
	}
}
