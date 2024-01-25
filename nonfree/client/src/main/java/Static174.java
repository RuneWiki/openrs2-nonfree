import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "[I")
	public static final int[] anIntArray177 = new int[25];

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "Lclient!fe;")
	public static final Class99 aClass99_1 = new Class99();

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_78 = new Class362(4, -1);

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString32 = "";

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZZ)V")
	public static void method3171(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) Class4_Sub36 local12 = (Class4_Sub36) Static88.aClass244_18.method5963(); local12 != null; local12 = (Class4_Sub36) Static88.aClass244_18.method5965()) {
			if (local12.aClass4_Sub7_Sub4_1 != null) {
				Static444.aClass4_Sub7_Sub1_2.method400(local12.aClass4_Sub7_Sub4_1);
				local12.aClass4_Sub7_Sub4_1 = null;
			}
			if (local12.aClass4_Sub7_Sub4_2 != null) {
				Static444.aClass4_Sub7_Sub1_2.method400(local12.aClass4_Sub7_Sub4_2);
				local12.aClass4_Sub7_Sub4_2 = null;
			}
			local12.method8379();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class4_Sub36 local54 = (Class4_Sub36) Static190.aClass244_25.method5963(); local54 != null; local54 = (Class4_Sub36) Static190.aClass244_25.method5965()) {
			if (local54.aClass4_Sub7_Sub4_1 != null) {
				Static444.aClass4_Sub7_Sub1_2.method400(local54.aClass4_Sub7_Sub4_1);
				local54.aClass4_Sub7_Sub4_1 = null;
			}
			local54.method8379();
		}
		for (@Pc(80) Class4_Sub36 local80 = (Class4_Sub36) Static583.aClass350_42.method8198(); local80 != null; local80 = (Class4_Sub36) Static583.aClass350_42.method8205()) {
			if (local80.aClass4_Sub7_Sub4_1 != null) {
				Static444.aClass4_Sub7_Sub1_2.method400(local80.aClass4_Sub7_Sub4_1);
				local80.aClass4_Sub7_Sub4_1 = null;
			}
			local80.method8379();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method3173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(11) Class4_Sub51 local11 = null;
		for (@Pc(16) Class4_Sub51 local16 = (Class4_Sub51) Static377.aClass244_51.method5963(); local16 != null; local16 = (Class4_Sub51) Static377.aClass244_51.method5965()) {
			if (arg1 == local16.anInt10249 && arg4 == local16.anInt10248 && local16.anInt10261 == arg6 && local16.anInt10262 == arg3) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class4_Sub51();
			local11.anInt10248 = arg4;
			local11.anInt10261 = arg6;
			local11.anInt10249 = arg1;
			local11.anInt10262 = arg3;
			if (arg4 >= 0 && arg6 >= 0 && Static428.anInt8046 > arg4 && arg6 < Static119.anInt2717) {
				Static275.method4771(local11);
			}
			Static377.aClass244_51.method5960(local11);
		}
		local11.anInt10252 = arg5;
		local11.anInt10255 = arg0;
		local11.anInt10257 = -1;
		local11.anInt10260 = arg2;
		local11.anInt10254 = 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIZ)I")
	public static int method3174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(13) int local13 = 128 - arg0;
		@Pc(32) int local32 = (arg2 & 0x7F) * arg0 + local13 * (arg1 & 0x7F) >> 7;
		@Pc(46) int local46 = arg0 * (arg2 & 0x380) + (arg1 & 0x380) * local13 >> 7;
		@Pc(61) int local61 = (arg1 & 0xFC00) * local13 + arg0 * (arg2 & 0xFC00) >> 7;
		return local61 & 0xFC00 | local46 & 0x380 | local32 & 0x7F;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lclient!uc;")
	public static Class122 method3175() {
		try {
			return (Class122) Class.forName("Class122_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}
