import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "Lclient!jn;")
	public static Class176 aClass176_19;

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "Lclient!bv;")
	public static final Class42 aClass42_1 = new Class42(1);

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "Lclient!bv;")
	public static final Class42 aClass42_2 = new Class42(2);

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "Lclient!bv;")
	public static final Class42 aClass42_3 = new Class42(4);

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Lclient!bv;")
	public static final Class42 aClass42_4 = new Class42(1);

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "Lclient!bv;")
	public static final Class42 aClass42_5 = new Class42(2);

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "Lclient!bv;")
	public static final Class42 aClass42_6 = new Class42(4);

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "Lclient!bv;")
	public static final Class42 aClass42_7 = new Class42(2);

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "Lclient!bv;")
	public static final Class42 aClass42_8 = new Class42(4);

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_28 = new Class362(40, 12);

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BILclient!jn;IJZII)V")
	public static void method685(@OriginalArg(2) Class176 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) long arg2, @OriginalArg(6) int arg3) {
		Static116.anInt2684 = 0;
		Static280.aClass4_Sub7_Sub3_2 = null;
		Static451.aClass176_108 = arg0;
		Static353.anInt6872 = arg1;
		Static544.anInt9651 = 0;
		Static472.anInt8704 = 10000;
		Static342.anInt6643 = 1;
		Static230.aLong124 = arg2;
		Static450.aBoolean599 = false;
		Static480.anInt10083 = arg3;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ub;Z[[[BIB)Z")
	public static boolean method686(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static516.aBoolean643) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt9934 >> Static145.anInt3093;
		@Pc(13) int local13 = arg0.anInt9935 >> Static145.anInt3093;
		if (local8 < Static354.anInt6889 || local8 >= Static296.anInt5973 || local13 < Static309.anInt6179 || local13 >= Static22.anInt331) {
			return true;
		} else if ((arg2 == null || arg0.aByte126 < arg3 || arg2[arg0.aByte126][local8][local13] != arg4) && arg0.method8126() && !arg0.method8115()) {
			return false;
		} else {
			if (!arg1 && local8 >= Static26.anInt403 - 16 && local8 <= Static26.anInt403 + 16 && local13 >= Static528.anInt9392 - 16 && local13 <= Static528.anInt9392 + 16) {
				if (Static175.aBoolean289) {
					Static526.aClass124Array2[Static451.anInt8507++].method3121(arg0);
					Static451.anInt8507 %= Static24.anInt388;
				} else {
					arg0.method8124(Static468.aClass44_7);
				}
			}
			return true;
		}
	}
}
