import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
	public static int anInt6482 = 0;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "Lclient!nha;")
	public static final Class229 aClass229_7 = new Class229("", 16);

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Z")
	public static boolean aBoolean554 = true;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIIIII)V")
	public static void method5428(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static174.anInt4141 = arg2;
		Static206.anInt6647 = arg3;
		Class2_Sub3_Sub5_Sub1.lb = arg4;
		Static66.anInt1410 = arg5;
		Static493.anInt8769 = arg1;
		if (arg0 && Static206.anInt6647 >= 100) {
			Static465.anInt8425 = Static493.anInt8769 * 512 + 256;
			Static289.anInt5908 = Static66.anInt1410 * 512 + 256;
			Static641.anInt10516 = Static202.method3958(Static289.anInt5908, Static552.anInt9440, Static465.anInt8425) - Static174.anInt4141;
		}
		Static516.anInt9019 = 2;
		Static155.anInt3810 = -1;
		Static531.anInt9157 = -1;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5429(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(local15 + local13);
		for (@Pc(43) int local43 = 0; local43 < local13; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local49 == '<') {
				local41.append("<lt>");
			} else if (local49 == '>') {
				local41.append("<gt>");
			} else {
				local41.append(local49);
			}
		}
		return local41.toString();
	}
}
