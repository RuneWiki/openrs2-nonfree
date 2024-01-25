import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_13 = new Class326(8);

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_82 = new Class81(75, 2);

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable3 = new Hashtable();

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILclient!hca;IIIZ)V")
	public static void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (Static113.anInt2286 >= 50 || (arg2 == null || arg2.anIntArrayArray25 == null || arg0 >= arg2.anIntArrayArray25.length || arg2.anIntArrayArray25[arg0] == null)) {
			return;
		}
		@Pc(36) int local36 = arg2.anIntArrayArray25[arg0][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg2.anIntArrayArray25[arg0].length > 1) {
			local63 = (int) ((double) arg2.anIntArrayArray25[arg0].length * Math.random());
			if (local63 > 0) {
				local40 = arg2.anIntArrayArray25[arg0][local63];
			}
		}
		@Pc(79) int local79 = local36 & 0x1F;
		if (local79 == 0) {
			if (arg5) {
				if (arg2.aBoolean305) {
					Static291.method4575(local40, 0, local46, 255, false);
					return;
				}
				Static364.method5314(local46, local40, 255, 0);
			}
		} else if (Static479.aClass1_Sub7_Sub1_1.anInt3107 != 0) {
			local63 = arg1 - 256 >> 9;
			@Pc(129) int local129 = arg3 - 256 >> 9;
			Static450.aClass177Array1[Static113.anInt2286++] = new Class177((byte) (arg2.aBoolean305 ? 2 : 1), local40, local46, 0, 255, (local129 << 8) + ((arg4 << 24) + (local63 << 16) + local79));
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)V")
	public static void method2605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub48 local12 = Static320.method4867(Static442.aClass170_2, Static193.aClass319_71);
		local12.aClass1_Sub20_Sub1_2.method4400(arg0);
		local12.aClass1_Sub20_Sub1_2.method4381(arg1);
		Static34.method813(local12);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z")
	public static boolean method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZII)Z")
	public static boolean method2608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
