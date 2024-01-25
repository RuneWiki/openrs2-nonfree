import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static594 {

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
	public static int anInt10160;

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "Lclient!jt;")
	public static final Class165 aClass165_11 = new Class165("", 14);

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "Lclient!of;")
	public static final Class236 aClass236_100 = new Class236(20);

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "I")
	public static int anInt10159 = 503;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(JJ)J")
	public static long method8199(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!lha;Lclient!lha;I)V")
	public static void method8201(@OriginalArg(0) Class8_Sub5 arg0, @OriginalArg(1) Class8_Sub5 arg1) {
		if (arg0.aClass8_Sub5_67 != null) {
			arg0.method8381();
		}
		arg0.aClass8_Sub5_67 = arg1.aClass8_Sub5_67;
		arg0.aClass8_Sub5_66 = arg1;
		arg0.aClass8_Sub5_67.aClass8_Sub5_66 = arg0;
		arg0.aClass8_Sub5_66.aClass8_Sub5_67 = arg0;
	}
}
