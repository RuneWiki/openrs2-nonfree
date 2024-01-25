import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!wt;")
	public static Class1_Sub51 aClass1_Sub51_5;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array19;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!pu;)V")
	public static void method6517(@OriginalArg(1) Class270 arg0) {
		Static480.anInt8096 = arg0.method5677("p11_full");
		Static580.anInt9540 = arg0.method5677("p12_full");
		Static222.anInt4250 = arg0.method5677("b12_full");
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
	public static void method6518(@OriginalArg(1) int arg0) {
		Static197.anInt6253 = arg0;
		@Pc(7) Class222 local7 = Static218.aClass222_26;
		synchronized (Static218.aClass222_26) {
			Static218.aClass222_26.method4428();
		}
	}
}
