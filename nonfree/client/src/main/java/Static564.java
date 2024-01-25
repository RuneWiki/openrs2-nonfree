import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
	public static int anInt9377;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "Lclient!u;")
	public static Class357 aClass357_4;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "[Lclient!oj;")
	public static Class272[] aClass272Array1 = null;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
	public static void method8087(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static173.anInt2826 = arg0;
		Static192.aClass4_Sub8Array5 = new Class4_Sub8[Static435.anIntArray389[Static173.anInt2826] + 1];
		Static19.anInt252 = 0;
		Static44.anInt763 = 0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!haa;ZZ)V")
	public static void method8088(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean779 = arg1;
		if (Static326.aBoolean408) {
			Static100.aClass399Array1[Static100.aClass399Array1.length - 1].method9461(arg0);
		} else {
			Static200.method8474(arg0, Static15.aClass14_Sub18Array1);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(JIIZ)Ljava/lang/String;")
	public static String method8090(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static611.method8631(arg0);
		@Pc(16) Calendar local16 = Static183.aCalendar3;
		@Pc(20) int local20 = local16.get(5);
		@Pc(26) int local26 = local16.get(2) + 1;
		@Pc(37) int local37 = local16.get(1);
		@Pc(41) int local41 = local16.get(11);
		@Pc(45) int local45 = local16.get(12);
		return Integer.toString(local20 / 10) + local20 % 10 + "/" + local26 / 10 + local26 % 10 + "/" + local37 % 100 / 10 + local37 % 10 + " " + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!pi;Z)V")
	public static void method8091(@OriginalArg(0) Class144_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static174.anObject3 == null) {
			@Pc(5) Class67_Sub2_Sub1 local5 = new Class67_Sub2_Sub1();
			local12 = local5.method5477();
			Static174.anObject3 = Static649.method9108(local12);
		}
		if (Static470.anObject18 == null) {
			@Pc(27) Class67_Sub1_Sub2 local27 = new Class67_Sub1_Sub2();
			local12 = local27.method4406();
			Static470.anObject18 = Static649.method9108(local12);
		}
		@Pc(53) Class320 local53 = arg0.aClass320_1;
		if (local53.method7901() && Static663.anObject21 == null) {
			local12 = Static236.method3981(16.0F, 0.6F, 0.5F, 4.0F, new Class295_Sub1(419684), 4.0F);
			Static663.anObject21 = Static649.method9108(local12);
		}
	}
}
