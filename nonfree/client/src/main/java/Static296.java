import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static296 {

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
	public static int anInt5926;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "Lclient!kl;")
	public static final Class174 aClass174_9 = new Class174(3);

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_89 = new Class40("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "Lclient!faa;")
	public static final Class95 aClass95_4 = new Class95();

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
	public static int anInt5925 = 0;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V")
	public static void method4924(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static490.anInt8412 = arg0;
		Static67.aClass30_Sub7Array3 = new Class30_Sub7[Static112.anIntArray210[Static490.anInt8412] + 1];
		Static528.anInt8608 = 0;
		Static134.anInt2771 = 0;
	}
}
