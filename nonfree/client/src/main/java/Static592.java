import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
	public static int anInt9252;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
	public static int anInt9253;

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_176 = new Class225(51, -2);

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_189 = new Class60();

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZLclient!tda;Lclient!bp;)Lclient!jga;")
	public static Class2_Sub33 method8154(@OriginalArg(1) Class349 arg0, @OriginalArg(2) Class48 arg1) {
		@Pc(8) Class2_Sub33 local8 = Static541.method7568();
		local8.aClass349_74 = arg0;
		local8.anInt4582 = arg0.anInt9427;
		if (local8.anInt4582 == -1) {
			local8.aClass2_Sub20_Sub2_1 = new Class2_Sub20_Sub2(260);
		} else if (local8.anInt4582 == -2) {
			local8.aClass2_Sub20_Sub2_1 = new Class2_Sub20_Sub2(10000);
		} else if (local8.anInt4582 <= 18) {
			local8.aClass2_Sub20_Sub2_1 = new Class2_Sub20_Sub2(20);
		} else if (local8.anInt4582 <= 98) {
			local8.aClass2_Sub20_Sub2_1 = new Class2_Sub20_Sub2(100);
		} else {
			local8.aClass2_Sub20_Sub2_1 = new Class2_Sub20_Sub2(260);
		}
		local8.aClass2_Sub20_Sub2_1.method8601(arg1);
		local8.aClass2_Sub20_Sub2_1.method8606(local8.aClass349_74.method8323());
		local8.anInt4584 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(JI)I")
	public static int method8156(@OriginalArg(0) long arg0) {
		Static97.method1514(arg0);
		return Static246.aCalendar3.get(1);
	}
}
