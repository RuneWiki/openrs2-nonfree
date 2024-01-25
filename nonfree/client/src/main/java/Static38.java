import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_12 = new Class349(58, 3);

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)Lclient!et;")
	public static Class2_Sub20 method550() {
		@Pc(8) Class2_Sub20 local8 = new Class2_Sub20(518);
		Static515.anIntArray587 = new int[4];
		Static515.anIntArray587[3] = (int) (Math.random() * 9.9999999E7D);
		Static515.anIntArray587[2] = (int) (Math.random() * 9.9999999E7D);
		Static515.anIntArray587[1] = (int) (Math.random() * 9.9999999E7D);
		Static515.anIntArray587[0] = (int) (Math.random() * 9.9999999E7D);
		local8.method8584(10);
		local8.method8577(Static515.anIntArray587[0]);
		local8.method8577(Static515.anIntArray587[1]);
		local8.method8577(Static515.anIntArray587[2]);
		local8.method8577(Static515.anIntArray587[3]);
		return local8;
	}
}
