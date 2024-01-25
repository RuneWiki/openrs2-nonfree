import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "[[[Lclient!fu;")
	public static Class106[][][] aClass106ArrayArrayArray3;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_85 = new Class218(48, 6);

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean606 = false;

	@OriginalMember(owner = "client!naa", name = "m", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray4 = new int[2][][];

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I[Lclient!gaa;B)V")
	public static void method5865(@OriginalArg(0) int arg0, @OriginalArg(1) Class108[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class108 local17 = arg1[local11];
			if (local17 != null) {
				if (local17.anInt4018 == 0) {
					if (local17.aClass108Array1 != null) {
						method5865(arg0, local17.aClass108Array1);
					}
					@Pc(38) Class3_Sub50 local38 = (Class3_Sub50) Static40.aClass307_5.method7424((long) local17.anInt4043);
					if (local38 != null) {
						Static172.method3556(arg0, local38.anInt9575);
					}
				}
				@Pc(57) Class3_Sub51 local57;
				if (arg0 == 0 && local17.anObjectArray11 != null) {
					local57 = new Class3_Sub51();
					local57.anObjectArray33 = local17.anObjectArray11;
					local57.aClass108_13 = local17;
					Static84.method2222(local57);
				}
				if (arg0 == 1 && local17.anObjectArray13 != null) {
					if (local17.anInt4083 >= 0) {
						@Pc(82) Class108 local82 = Static113.method8285(local17.anInt4043);
						if (local82 == null || local82.aClass108Array1 == null || local82.aClass108Array1.length <= local17.anInt4083 || local17 != local82.aClass108Array1[local17.anInt4083]) {
							continue;
						}
					}
					local57 = new Class3_Sub51();
					local57.anObjectArray33 = local17.anObjectArray13;
					local57.aClass108_13 = local17;
					Static84.method2222(local57);
				}
			}
		}
	}
}
