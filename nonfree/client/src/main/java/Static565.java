import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public static int anInt9214;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_116 = new Class179(10, 4);

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
	public static final int[] anIntArray631 = new int[3];

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[200];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7737(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static653.method5398(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	public static void method7738(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = Static228.aClass256_7.method5534(Static434.aClass271_24.method5972(Static483.anInt7694));
		@Pc(69) int local69;
		@Pc(37) int local37;
		if (Static187.aBoolean234) {
			for (@Pc(25) Class2_Sub2_Sub12 local25 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1573(); local25 != null; local25 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1568()) {
				if (local25.anInt4924 == 1) {
					local37 = Static437.method5994((Class2_Sub2_Sub11) local25.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67);
				} else {
					local37 = Static236.method3209(local25);
				}
				if (local37 > local18) {
					local18 = local37;
				}
			}
			local69 = Static121.anInt2166 * 16 + 21;
			local18 += 8;
			Static467.anInt7465 = (Static500.aBoolean612 ? 26 : 22) + Static121.anInt2166 * 16;
		} else {
			for (@Pc(87) Class2_Sub2_Sub11 local87 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local87 != null; local87 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
				local37 = Static437.method5994(local87);
				if (local18 < local37) {
					local18 = local37;
				}
			}
			local18 += 8;
			local69 = Static474.anInt7600 * 16 + 21;
			Static467.anInt7465 = (Static500.aBoolean612 ? 26 : 22) + Static474.anInt7600 * 16;
		}
		@Pc(132) int local132 = arg1 - local18 / 2;
		if (local18 + local132 > Static511.anInt8548) {
			local132 = Static511.anInt8548 - local18;
		}
		if (local132 < 0) {
			local132 = 0;
		}
		local37 = arg0;
		if (Static153.anInt2747 < arg0 + local69) {
			local37 = Static153.anInt2747 - local69;
		}
		Static46.anInt975 = local132;
		if (local37 < 0) {
			local37 = 0;
		}
		Static408.anInt6345 = local18;
		Static627.aBoolean736 = true;
		Static139.anInt2567 = local37;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!wu;ZIBI)V")
	public static void method7740(@OriginalArg(0) int arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(5) int arg2) {
		Static31.method572(arg1, 0L, arg2, arg0);
	}
}
