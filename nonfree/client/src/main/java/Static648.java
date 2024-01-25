import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString113 = null;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!s;)V")
	public static void method8705(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1) {
		Static582.aClass35Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!td;)I")
	public static int method8707(@OriginalArg(1) Class3_Sub5_Sub18 arg0) {
		@Pc(15) String local15 = Static262.method3910(arg0);
		@Pc(17) int[] local17 = null;
		if (Static413.method5631(arg0.anInt9217)) {
			local17 = Static117.aClass197_2.method4518((int) arg0.aLong259).anIntArray16;
		} else if (arg0.anInt9210 != -1) {
			local17 = Static117.aClass197_2.method4518(arg0.anInt9210).anIntArray16;
		} else if (Static475.method6321(arg0.anInt9217)) {
			@Pc(94) Class3_Sub52 local94 = (Class3_Sub52) Static105.aClass333_11.method7489((long) (int) arg0.aLong259);
			if (local94 != null) {
				@Pc(99) Class34_Sub1_Sub1_Sub2_Sub2 local99 = local94.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				@Pc(102) Class261 local102 = local99.aClass261_1;
				if (local102.anIntArray364 != null) {
					local102 = local102.method5772(Static210.aClass262_1);
				}
				if (local102 != null) {
					local17 = local102.anIntArray367;
				}
			}
		} else if (Static210.method3123(arg0.anInt9217)) {
			@Pc(59) Class216 local59;
			if (arg0.anInt9217 == 1012) {
				local59 = Static466.aClass340_6.method7665((int) arg0.aLong259);
			} else {
				local59 = Static466.aClass340_6.method7665((int) (arg0.aLong259 >>> 32 & 0x7FFFFFFFL));
			}
			if (local59.anIntArray325 != null) {
				local59 = local59.method5043(Static210.aClass262_1);
			}
			if (local59 != null) {
				local17 = local59.anIntArray326;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static483.method6386(local17);
		}
		@Pc(143) int local143 = Static281.aClass91_7.method1857(local15, Static470.aClass6Array11);
		if (arg0.aBoolean641) {
			local143 += Static74.aClass6_6.method5119() + 4;
		}
		return local143;
	}
}
