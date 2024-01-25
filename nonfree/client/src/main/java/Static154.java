import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
	public static int anInt2554 = 0;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "[I")
	public static final int[] anIntArray192 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_46 = new Class225(114, 3);

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "[B")
	public static final byte[] aByteArray30 = new byte[520];

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
	public static int anInt2563 = -1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)Z")
	public static boolean method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!nca;II)Lclient!pga;")
	public static Class289 method2200(@OriginalArg(1) Class254 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method6087(0, arg1);
		return local9 == null ? null : new Class289(local9);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)V")
	public static void method2201(@OriginalArg(0) int arg0) {
		Static55.anInt898 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V")
	public static void method2202() {
		Static214.anInt3419 = -2;
		Static391.anInt6484 = 0;
		Static421.anInt6854 = -2;
	}
}
