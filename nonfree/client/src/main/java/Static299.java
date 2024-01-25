import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!jw", name = "P", descriptor = "F")
	public static float aFloat80;

	@OriginalMember(owner = "client!jw", name = "L", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_156 = new Class160(58, 8);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I[[I)V")
	public static void method4898(@OriginalArg(1) int[][] arg0) {
		Static144.anIntArrayArray30 = arg0;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZLclient!vv;)[I")
	public static int[] method4899(@OriginalArg(1) Class14_Sub54 arg0) {
		@Pc(8) Class14_Sub21 local8 = new Class14_Sub21(518);
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			local11[local13] = (int) (Math.random() * 9.9999999E7D);
		}
		local8.method7747(10);
		local8.method7730(local11[0]);
		local8.method7730(local11[1]);
		local8.method7730(local11[2]);
		local8.method7730(local11[3]);
		for (@Pc(57) int local57 = 0; local57 < 10; local57++) {
			local8.method7730((int) (Math.random() * 9.9999999E7D));
		}
		local8.method7751((int) (Math.random() * 9.9999999E7D));
		local8.method7697(Static141.aBigInteger5, Static51.aBigInteger1);
		arg0.aClass14_Sub21_Sub2_2.method7743(0, local8.aByteArray99, local8.anInt8936);
		return local11;
	}
}
