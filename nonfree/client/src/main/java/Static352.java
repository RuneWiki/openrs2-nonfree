import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!mha", name = "t", descriptor = "Lclient!rs;")
	public static final Class3_Sub46 aClass3_Sub46_3 = new Class3_Sub46(0, 0);

	@OriginalMember(owner = "client!mha", name = "w", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[1000][];

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)Z")
	public static boolean method5771() {
		return Static82.anInt1653 >= 1;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!cea;B)V")
	public static void method5772(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class3_Sub31 local11 = (Class3_Sub31) Static554.aClass25_41.method426((long) arg0.anInt10204);
		if (local11 == null) {
			Static280.method4567(arg0, 0, (Class9_Sub2_Sub1_Sub2_Sub2) null, arg0.anIntArray675[0], arg0.aByte127, (Class330) null, arg0.anIntArray676[0]);
		} else {
			local11.method5121();
		}
	}
}
