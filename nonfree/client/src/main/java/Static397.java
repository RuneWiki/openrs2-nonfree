import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
	public static int anInt6372;

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
	public static int anInt6373;

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
	public static int anInt6377;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "Lclient!su;")
	public static final Class227 aClass227_10 = new Class227();

	@OriginalMember(owner = "client!tu", name = "z", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_197 = new Class107(97, 3);

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "[I")
	public static int[] anIntArray590 = new int[2];

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZIB)V")
	public static void method5304(@OriginalArg(1) boolean arg0) {
		Static247.anInt7108 = 22050;
		Static181.anInt3301 = 2;
		Static222.aBoolean288 = arg0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public static void method5305() {
		if (Static307.anInt5296 < 0) {
			Static307.anInt5296 = 0;
			Static129.anInt3956 = -1;
			Static161.anInt3016 = -1;
		}
		if (Static307.anInt5296 > Static168.anInt433) {
			Static307.anInt5296 = Static168.anInt433;
			Static129.anInt3956 = -1;
			Static161.anInt3016 = -1;
		}
		if (Static138.anInt6309 < 0) {
			Static138.anInt6309 = 0;
			Static129.anInt3956 = -1;
			Static161.anInt3016 = -1;
		}
		if (Static138.anInt6309 > Static168.anInt431) {
			Static138.anInt6309 = Static168.anInt431;
			Static161.anInt3016 = -1;
			Static129.anInt3956 = -1;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5306(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(14) int local14 = 0; local14 < Static313.anInt5409; local14++) {
			if (arg0.equalsIgnoreCase(Static22.aStringArray6[local14])) {
				return local14;
			}
		}
		return -1;
	}
}
