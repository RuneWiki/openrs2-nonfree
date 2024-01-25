import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	public static int anInt301;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "[I")
	public static final int[] anIntArray27 = new int[50];

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "J")
	public static long aLong11 = 0L;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	public static void method342() {
		if (Static31.aBoolean54) {
			return;
		}
		Static368.method6083(Static103.aClass155ArrayArrayArray2);
		if (Static46.aClass155ArrayArrayArray1 != null) {
			Static368.method6083(Static46.aClass155ArrayArrayArray1);
		}
		Static31.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZZBLclient!dp;)V")
	public static void method343(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class1_Sub15 arg2) {
		@Pc(12) int local12 = arg2.anInt1496;
		@Pc(16) int local16 = (int) arg2.aLong217;
		arg2.method6045();
		if (arg1) {
			Static181.method3455(local12);
		}
		Static175.method3417(local12);
		@Pc(31) Class112 local31 = Static188.method3536(local16);
		if (local31 != null) {
			Static133.method2725(local31);
		}
		Static146.method5910();
		if (!arg0 && Static336.anInt6389 != -1) {
			Static127.method2641(1, Static336.anInt6389);
		}
		@Pc(53) Class122 local53 = new Class122(Static281.aClass38_30);
		for (@Pc(58) Class1_Sub15 local58 = (Class1_Sub15) local53.method3452(); local58 != null; local58 = (Class1_Sub15) local53.method3450()) {
			if (!local58.method6047()) {
				local58 = (Class1_Sub15) local53.method3452();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt1494 == 3) {
				@Pc(80) int local80 = (int) local58.aLong217;
				if (local12 == local80 >>> 16) {
					method343(arg0, true, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!at;)Lclient!it;")
	public static Class25_Sub2 method344(@OriginalArg(1) Class1_Sub7 arg0) {
		return new Class25_Sub2(arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2119(), arg0.method2132());
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!ct;)Lclient!bk;")
	public static Class1_Sub10 method347(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(8) byte[] local8 = arg1.method1179(arg0);
		return local8 == null ? null : new Class1_Sub10(local8);
	}
}
