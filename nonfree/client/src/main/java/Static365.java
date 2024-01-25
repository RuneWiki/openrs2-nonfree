import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "I")
	public static int anInt6348;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "I")
	public static int anInt6347 = 0;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_84 = new Class160(40, 8);

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[B")
	public static final byte[] aByteArray80 = new byte[2048];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!qe;I)V")
	public static void method5386(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub14_Sub2 arg1) {
		Static199.aBoolean227 = false;
		Static480.anInt8070 = 0;
		Static242.method3513(arg1);
		Static344.method5184(arg1);
		if (Static199.aBoolean227) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt7244 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt7244 + " psize:" + arg0);
		}
	}
}
