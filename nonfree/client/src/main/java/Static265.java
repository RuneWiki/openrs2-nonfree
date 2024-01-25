import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString190 = " ";

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public static int anInt5044 = 0;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Z")
	public static boolean aBoolean336 = false;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
	public static int anInt5046 = 0;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public static int anInt5049 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Z")
	public static boolean method4529(@OriginalArg(0) int arg0) {
		Static313.anInt6041 = arg0 + 1 & 0xFFFF;
		Static49.aBoolean82 = true;
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!jg;I)Lclient!uo;")
	public static Class202 method4530(@OriginalArg(0) Class14_Sub4 arg0) {
		@Pc(7) Class202 local7 = new Class202();
		local7.anInt6257 = arg0.method2498();
		local7.aClass14_Sub2_Sub11_1 = Static209.method3811(local7.anInt6257);
		return local7;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLclient!um;)V")
	public static void method4532(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.aClass10_1 = null;
		@Pc(12) int local12 = arg0.aClass1_Sub3Array1.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			arg0.aClass1_Sub3Array1[local14].aBoolean47 = false;
		}
		@Pc(33) Class126[] local33 = Class14_Sub25.aClass126Array1;
		synchronized (Class14_Sub25.aClass126Array1) {
			if (local12 < Class14_Sub25.aClass126Array1.length && Static256.anIntArray443[local12] < 200) {
				Class14_Sub25.aClass126Array1[local12].method3401(arg0);
				@Pc(56) int local56 = Static256.anIntArray443[local12]++;
			}
		}
	}
}
