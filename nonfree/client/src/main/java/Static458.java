import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	public static int anInt7787;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Lclient!he;")
	public static Class141 aClass141_3;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!qf;")
	public static final Class279 aClass279_1 = new Class279(0, 3, Static280.aClass182_12);

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!qf;")
	public static final Class279 aClass279_2 = new Class279(1, 3, Static280.aClass182_12);

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!qf;")
	public static final Class279 aClass279_3 = new Class279(2, 4, Static280.aClass182_8);

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Lclient!qf;")
	public static final Class279 aClass279_4 = new Class279(3, 1, Static280.aClass182_12);

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!qf;")
	public static final Class279 aClass279_5 = new Class279(4, 2, Static280.aClass182_12);

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "Lclient!qf;")
	public static final Class279 aClass279_6 = new Class279(5, 3, Static280.aClass182_12);

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Lclient!qf;")
	public static final Class279 aClass279_7 = new Class279(6, 4, Static280.aClass182_12);

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
	public static final int anInt7785 = Static613.method8376(16);

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
	public static int anInt7786 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lclient!kaa;")
	public static Class3_Sub27 method6779() {
		@Pc(6) Class3_Sub27 local6 = Static430.method6552();
		local6.anInt5446 = 0;
		local6.aClass314_84 = null;
		local6.aClass3_Sub9_Sub2_2 = new Class3_Sub9_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lclient!qf;")
	public static Class279 method6781(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass279_1;
		} else if (arg0 == 1) {
			return aClass279_2;
		} else if (arg0 == 2) {
			return aClass279_3;
		} else if (arg0 == 3) {
			return aClass279_4;
		} else if (arg0 == 4) {
			return aClass279_5;
		} else if (arg0 == 5) {
			return aClass279_6;
		} else if (arg0 == 6) {
			return aClass279_7;
		} else {
			return null;
		}
	}
}
