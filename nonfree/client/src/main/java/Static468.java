import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
	public static int anInt10546;

	@OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
	public static int anInt10549;

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "Lclient!of;")
	public static final Class236 aClass236_107 = new Class236(8);

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
	public static int anInt10554 = 0;

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
	public static int anInt10558 = -1;

	@OriginalMember(owner = "client!qt", name = "B", descriptor = "[I")
	public static final int[] anIntArray622 = new int[4];

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[Lclient!hu;)V")
	public static void method8504(@OriginalArg(1) Class21[] arg0) {
		Static595.anInt10186 = arg0.length;
		Static99.aClass21Array5 = new Class21[Static595.anInt10186 + 10];
		Static446.anIntArray421 = new int[Static595.anInt10186 + 10];
		Static649.method5530(arg0, 0, Static99.aClass21Array5, 0, Static595.anInt10186);
		for (@Pc(31) int local31 = 0; local31 < Static595.anInt10186; local31++) {
			Static446.anIntArray421[local31] = Static99.aClass21Array5[local31].method5785();
		}
		for (@Pc(46) int local46 = Static595.anInt10186; local46 < Static99.aClass21Array5.length; local46++) {
			Static446.anIntArray421[local46] = 12;
		}
	}
}
