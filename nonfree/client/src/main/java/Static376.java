import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	public static int anInt5906;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public static int anInt5904 = 0;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!pf;")
	public static final Class266 aClass266_3 = new Class266();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public static void method5059() {
		@Pc(13) Class2_Sub12 local13 = (Class2_Sub12) Static595.aClass109_69.method2325();
		@Pc(21) boolean local21 = Static444.aClass261_9 != null || Static91.anInt1707 > 0;
		@Pc(25) int local25 = local13.method7237();
		@Pc(31) int local31 = local13.method7238();
		if (local21) {
			Static615.anInt9912 = 1;
		}
		if (local21) {
			Static472.aClass2_Sub2_Sub11_3 = Static601.aClass2_Sub2_Sub11_4;
		} else {
			Static530.method7339(Static601.aClass2_Sub2_Sub11_4, local31, local25);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZZ)Z")
	public static boolean method5061(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
