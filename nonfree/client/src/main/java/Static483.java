import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_264 = new Class194(45, 1);

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "Lclient!gp;")
	public static final Class133 aClass133_14 = new Class133("runescape", 0);

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
	public static int anInt8232 = 0;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
	public static int anInt8233 = 4;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
	public static void method7126() {
		Static319.aClass344ArrayArray2 = new Class344[Static5.aClass343_8.method8144()][];
		Static69.aClass344ArrayArray1 = new Class344[Static5.aClass343_8.method8144()][];
		Static397.aBooleanArray25 = new boolean[Static5.aClass343_8.method8144()];
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!ha;Lclient!uv;)V")
	public static void method7128(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class344 arg1) {
		@Pc(35) boolean local35 = Static298.aClass132_1.method3057(arg1.aBoolean729 ? Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aClass375_1 : null, arg1.anInt9588, arg0, arg1.anInt9567, arg1.anInt9565, arg1.anInt9600 | 0xFF000000, arg1.anInt9619) == null;
		if (local35) {
			Static423.aClass216_53.method5449(new Class3_Sub39(arg1.anInt9567, arg1.anInt9565, arg1.anInt9588, arg1.anInt9600 | 0xFF000000, arg1.anInt9619, arg1.aBoolean729));
			Static605.method8323(arg1);
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(III)Lclient!ki;")
	public static Class9_Sub2_Sub5 method7129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub2_Sub5_1;
	}
}
