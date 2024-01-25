import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_18 = new Class328(8, 7);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIIZIB)V")
	public static void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		Static526.anInt8805 = arg2;
		Static489.anInt8245 = arg5;
		Static109.anInt2112 = arg3;
		Static130.anInt2957 = arg1;
		Static25.anInt764 = arg0;
		if (arg4 && Static130.anInt2957 >= 100) {
			Static322.anInt5904 = Static109.anInt2112 * 512 + 256;
			Static371.anInt6572 = Static526.anInt8805 * 512 + 256;
			Static111.anInt2160 = Static160.method2951(Static322.anInt5904, Static371.anInt6572, Static97.anInt1863) - Static25.anInt764;
		}
		Static346.anInt6215 = 2;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZ)V")
	public static void method4807(@OriginalArg(0) boolean arg0) {
		for (@Pc(14) Class6_Sub16 local14 = (Class6_Sub16) Static1.aClass361_67.method7838(); local14 != null; local14 = (Class6_Sub16) Static1.aClass361_67.method7845()) {
			if (local14.aClass6_Sub18_Sub1_3 != null) {
				Static374.aClass6_Sub18_Sub4_2.method6380(local14.aClass6_Sub18_Sub1_3);
				local14.aClass6_Sub18_Sub1_3 = null;
			}
			if (local14.aClass6_Sub18_Sub1_2 != null) {
				Static374.aClass6_Sub18_Sub4_2.method6380(local14.aClass6_Sub18_Sub1_2);
				local14.aClass6_Sub18_Sub1_2 = null;
			}
			local14.method7804();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(58) Class6_Sub16 local58 = (Class6_Sub16) Static427.aClass361_54.method7838(); local58 != null; local58 = (Class6_Sub16) Static427.aClass361_54.method7845()) {
			if (local58.aClass6_Sub18_Sub1_3 != null) {
				Static374.aClass6_Sub18_Sub4_2.method6380(local58.aClass6_Sub18_Sub1_3);
				local58.aClass6_Sub18_Sub1_3 = null;
			}
			local58.method7804();
		}
		for (@Pc(85) Class6_Sub16 local85 = (Class6_Sub16) Static156.aClass128_12.method3265(); local85 != null; local85 = (Class6_Sub16) Static156.aClass128_12.method3273()) {
			if (local85.aClass6_Sub18_Sub1_3 != null) {
				Static374.aClass6_Sub18_Sub4_2.method6380(local85.aClass6_Sub18_Sub1_3);
				local85.aClass6_Sub18_Sub1_3 = null;
			}
			local85.method7804();
		}
	}
}
