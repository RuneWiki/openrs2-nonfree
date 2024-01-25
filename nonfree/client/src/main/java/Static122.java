import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!efa", name = "L", descriptor = "Lclient!qg;")
	public static final Class286 aClass286_1 = new Class286();

	@OriginalMember(owner = "client!efa", name = "O", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_69 = new Class87(8);

	@OriginalMember(owner = "client!efa", name = "P", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "(II)I")
	public static int method1867(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(ZII)Z")
	public static boolean method1869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!raa;I)V")
	public static void method1872(@OriginalArg(0) Class295 arg0) {
		if (!Static285.aBoolean378) {
			return;
		}
		if (arg0.anObjectArray9 != null) {
			@Pc(14) Class295 local14 = Static324.method4920(Static375.anInt6224, Static570.anInt9615);
			if (local14 != null) {
				@Pc(20) Class5_Sub51 local20 = new Class5_Sub51();
				local20.aClass295_19 = arg0;
				local20.aClass295_18 = local14;
				local20.anObjectArray33 = arg0.anObjectArray9;
				Static370.method5457(local20);
			}
		}
		@Pc(41) Class5_Sub48 local41 = Static16.method232(Static82.aClass46_20, Static276.aClass251_2);
		local41.aClass5_Sub22_Sub1_2.method5949(arg0.anInt8022);
		local41.aClass5_Sub22_Sub1_2.method5918(arg0.anInt8025);
		local41.aClass5_Sub22_Sub1_2.method5959(Static375.anInt6224);
		local41.aClass5_Sub22_Sub1_2.method5904(Static289.anInt5055);
		local41.aClass5_Sub22_Sub1_2.method5961(arg0.anInt8010);
		local41.aClass5_Sub22_Sub1_2.method5918(Static570.anInt9615);
		Static277.method4436(local41);
	}
}
