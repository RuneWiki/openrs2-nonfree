import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_209 = new Class215(104, 1);

	@OriginalMember(owner = "client!sl", name = "cb", descriptor = "Lclient!wq;")
	public static final Class375 aClass375_44 = new Class375(1);

	@OriginalMember(owner = "client!sl", name = "db", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_97 = new Class94(20, -1);

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(II)V")
	public static void method7890(@OriginalArg(1) int arg0) {
		if (arg0 == Static245.anInt5279) {
			return;
		}
		Static47.anInt1794 = Static209.anInt4742 = Static298.anIntArray366[arg0];
		Static63.method1964();
		Static277.anIntArrayArrayArray11 = new int[4][Static47.anInt1794 >> 3][Static209.anInt4742 >> 3];
		Static345.anIntArrayArray34 = new int[Static47.anInt1794][Static209.anInt4742];
		Static198.anIntArrayArray19 = new int[Static47.anInt1794][Static209.anInt4742];
		for (@Pc(41) int local41 = 0; local41 < 4; local41++) {
			Static55.aClass104Array3[local41] = Static256.method4724(Static209.anInt4742, Static47.anInt1794);
		}
		Static612.aByteArrayArrayArray18 = new byte[4][Static47.anInt1794][Static209.anInt4742];
		Static527.method9036(Static209.anInt4742, Static47.anInt1794);
		Static339.method5849(Static47.anInt1794 >> 3, Static186.aClass20_4, Static209.anInt4742 >> 3);
		Static245.anInt5279 = arg0;
	}
}
