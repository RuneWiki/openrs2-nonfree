import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	public static int anInt9295;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
	public static int anInt9294 = 0;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZZ)V")
	public static void method8016(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static183.anInt3502--;
			if (Static183.anInt3502 == 0) {
				Static513.anIntArray548 = null;
			}
		}
		if (arg1) {
			Static644.anInt10230--;
			if (Static644.anInt10230 == 0) {
				Static159.anIntArray159 = null;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)Z")
	public static boolean method8017(@OriginalArg(0) int arg0) {
		return arg0 == 47 || arg0 == 8 || arg0 == 13 || arg0 == 57 || arg0 == 22 || arg0 == 23 || arg0 == 25;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Lclient!hha;")
	public static Class3_Sub4_Sub12 method8018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub4_Sub12 local15 = (Class3_Sub4_Sub12) Static517.aClass280_42.method7107((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class3_Sub4_Sub12(arg0, arg1);
			Static517.aClass280_42.method7109(local15, local15.aLong276);
		}
		return local15;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)V")
	public static void method8019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = method8018(12, arg1);
		local8.method3608();
		local8.anInt4062 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method8020(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!qk;IZ)V")
	public static void method8021(@OriginalArg(0) int arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2) {
		Static511.aClass279_17 = arg1;
		Static353.anInt6778 = arg2;
		Static285.anInt5068 = arg0;
	}
}
