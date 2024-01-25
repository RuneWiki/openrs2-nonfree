import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "Lclient!ci;")
	public static Class38 aClass38_22;

	@OriginalMember(owner = "client!fj", name = "Q", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!fj", name = "M", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_85 = new Class214(87, 0);

	@OriginalMember(owner = "client!fj", name = "R", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_11 = new Class49(5, 16);

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B[[BLclient!th;)V")
	public static void method2169(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class191_Sub1 arg1) {
		@Pc(8) int local8 = Static353.aByteArrayArray18.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(24) byte[] local24 = arg0[local10];
			if (local24 != null) {
				@Pc(37) int local37 = (anIntArray203[local10] >> 8) * 64 - Static426.anInt7325;
				@Pc(47) int local47 = (anIntArray203[local10] & 0xFF) * 64 - Static72.anInt1776;
				Static256.method4185();
				arg1.method5587(local47, local24, local37, Static335.aClass253Array1, Static30.aClass30_3);
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)I")
	public static int method2170(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
