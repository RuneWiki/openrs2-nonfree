import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!du", name = "k", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_3 = new Class178(1, 2, 2, 0);

	@OriginalMember(owner = "client!du", name = "m", descriptor = "[I")
	public static int[] anIntArray151 = new int[1];

	@OriginalMember(owner = "client!du", name = "o", descriptor = "I")
	public static int anInt2222 = -1;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString13 = null;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public static void method1836() {
		Static247.aClass25_23.method433();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IBII)V")
	public static void method1838(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static546.aByteArrayArrayArray18 = new byte[4][arg0][arg1];
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIZII)V")
	public static void method1839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) long local19 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(25) Class3_Sub52 local25 = (Class3_Sub52) Static247.aClass25_23.method426(local19);
		if (local25 == null) {
			local25 = new Class3_Sub52();
			Static247.aClass25_23.method434(local19, local25);
		}
		if (arg0 >= local25.anIntArray653.length) {
			@Pc(50) int[] local50 = new int[arg0 + 1];
			@Pc(55) int[] local55 = new int[arg0 + 1];
			for (@Pc(57) int local57 = 0; local57 < local25.anIntArray653.length; local57++) {
				local50[local57] = local25.anIntArray653[local57];
				local55[local57] = local25.anIntArray654[local57];
			}
			for (@Pc(87) int local87 = local25.anIntArray653.length; local87 < arg0; local87++) {
				local50[local87] = -1;
				local55[local87] = 0;
			}
			local25.anIntArray653 = local50;
			local25.anIntArray654 = local55;
		}
		local25.anIntArray653[arg0] = arg4;
		local25.anIntArray654[arg0] = arg1;
	}
}
