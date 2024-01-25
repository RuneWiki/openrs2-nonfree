import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!jca", name = "j", descriptor = "I")
	public static int anInt6990;

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "F")
	public static float aFloat137;

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "Lclient!jj;")
	public static Class156 aClass156_2;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "Z")
	public static boolean aBoolean555 = true;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "Lclient!mu;")
	public static final Class212 aClass212_13 = new Class212("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
	public static int anInt6991 = 0;

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_70 = new Class185(11, 15);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IILclient!kia;)Z")
	public static boolean method5839(@OriginalArg(0) int arg0, @OriginalArg(2) Class169 arg1) {
		Static506.aClass115_9.method6293(arg1.anIntArray278[arg0], arg1.anIntArray277[arg0], arg1.anIntArray279[arg0], Static212.anIntArray204);
		@Pc(27) int local27 = Static212.anIntArray204[2];
		if (local27 < 50) {
			return false;
		} else {
			arg1.aShortArray83[arg0] = (short) (Static6.anInt461 + Static76.anInt2537 * Static212.anIntArray204[0] / local27);
			arg1.aShortArray82[arg0] = (short) (Static386.anInt7276 + Static212.anIntArray204[1] * Static569.anInt9768 / local27);
			arg1.aShortArray81[arg0] = (short) local27;
			return true;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)I")
	public static int method5840() {
		return Static218.anInt4659;
	}
}
