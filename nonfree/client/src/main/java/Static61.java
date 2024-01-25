import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "Lclient!iha;")
	public static Class173 aClass173_2;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Lclient!jc;")
	public static Class14_Sub21 method1032() {
		@Pc(8) Class14_Sub21 local8 = new Class14_Sub21(518);
		Static4.anIntArray2 = new int[4];
		Static4.anIntArray2[0] = (int) (Math.random() * 9.9999999E7D);
		Static4.anIntArray2[1] = (int) (Math.random() * 9.9999999E7D);
		Static4.anIntArray2[2] = (int) (Math.random() * 9.9999999E7D);
		Static4.anIntArray2[3] = (int) (Math.random() * 9.9999999E7D);
		local8.method7747(10);
		local8.method7730(Static4.anIntArray2[0]);
		local8.method7730(Static4.anIntArray2[1]);
		local8.method7730(Static4.anIntArray2[2]);
		local8.method7730(Static4.anIntArray2[3]);
		return local8;
	}
}
