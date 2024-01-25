import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public static int anInt6779;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Lclient!ql;")
	public static Class284 aClass284_3;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!cu;")
	public static Class61 aClass61_4;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "[Lclient!tn;")
	public static final Class328[] aClass328Array1 = new Class328[2048];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
	public static void method5896(@OriginalArg(0) int arg0) {
		Static27.anInt402 = arg0;
		@Pc(7) Class136 local7 = Static89.aClass136_40;
		synchronized (Static89.aClass136_40) {
			Static89.aClass136_40.method3142();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method5897() {
		Static511.aClass82_16.L(Static159.anInt3199, Static32.aClass3_Sub41_3.aClass7_Sub7_1.method3298() == 1 ? Static465.anInt7959 + 256 << 2 : -1, 0);
	}
}
