import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	public static int anInt6458;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array16;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
	public static int anInt6460 = -1;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method5747(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static288.anInt5569 : Static96.anInt2230) + local19;
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(35) Class14_Sub2_Sub11 local35 = Static209.method3811(local29);
			if (local35.aBoolean216 && local35.method3075().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static125.aShortArray73 = null;
					Static60.anInt1452 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(65) short[] local65 = new short[local11.length * 2];
					for (@Pc(67) int local67 = 0; local67 < local13; local67++) {
						local65[local67] = local11[local67];
					}
					local11 = local65;
				}
				local11[local13++] = (short) local29;
			}
		}
		Static60.anInt1452 = local13;
		Static125.aShortArray73 = local11;
		Static351.anInt6641 = 0;
		@Pc(100) String[] local100 = new String[Static60.anInt1452];
		for (@Pc(102) int local102 = 0; local102 < Static60.anInt1452; local102++) {
			local100[local102] = Static209.method3811(local11[local102]).method3075();
		}
		Static96.method2207(local100, Static125.aShortArray73);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
	public static void method5748() {
		for (@Pc(10) Class14_Sub2_Sub7 local10 = (Class14_Sub2_Sub7) Static54.aClass18_4.method459(); local10 != null; local10 = (Class14_Sub2_Sub7) Static54.aClass18_4.method453()) {
			@Pc(22) Class10_Sub3_Sub5 local22 = local10.aClass10_Sub3_Sub5_1;
			if (Static219.anInt4400 != local22.aByte64 || local22.aBoolean247) {
				local10.method5986();
				local22.method3655();
			} else if (local22.anInt3939 <= Static153.anInt3257) {
				local22.method3653(Static71.anInt5636);
				if (local22.aBoolean247) {
					local10.method5986();
				} else {
					Static194.method3667(local22, true);
				}
			}
		}
	}
}
