import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray16;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "Lclient!su;")
	public static final Class298 aClass298_66 = new Class298();

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_39 = new Class98(19, 14);

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_37 = new Class316(37, -1);

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "[I")
	public static final int[] anIntArray289 = new int[500];

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_38 = new Class316(14, 4);

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_39 = new Class316(61, 2);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)Lclient!du;")
	public static Class79 method2575(@OriginalArg(0) int arg0) {
		@Pc(8) Class79[] local8 = Static8.method102();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class79 local16 = local8[local10];
			if (arg0 == local16.anInt1885) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)[Lclient!of;")
	public static Class230[] method2577() {
		return new Class230[] { Static157.aClass230_42, Static230.aClass230_27, Static176.aClass230_56, Static118.aClass230_59, Static10.aClass230_1, Static307.aClass230_34, Static327.aClass230_38, Static237.aClass230_29, Static178.aClass230_23, Static283.aClass230_32, Static315.aClass230_37, Static153.aClass230_17, Static451.aClass230_46, Static564.aClass230_58, Static493.aClass230_52, Static476.aClass230_48 };
	}
}
