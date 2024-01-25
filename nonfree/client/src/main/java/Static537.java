import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "Lclient!fda;")
	public static Class85_Sub1 aClass85_Sub1_2;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)Z")
	public static boolean method7689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLclient!e;ILjava/awt/Canvas;)Lclient!oa;")
	public static Class5 method7690(@OriginalArg(0) boolean arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(3) Canvas arg2) {
		return arg0 ? new Class5_Sub2_Sub1(arg2, arg1) : new Class5_Sub2_Sub2(arg2, arg1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!ad;)V")
	public static void method7691(@OriginalArg(1) Class5_Sub1 arg0) {
		@Pc(20) byte[] local20;
		if (Static424.anObject16 == null) {
			@Pc(13) Class12_Sub1_Sub1 local13 = new Class12_Sub1_Sub1();
			local20 = local13.method2075();
			Static424.anObject16 = Static11.method646(local20);
		}
		if (Static508.anObject21 == null) {
			@Pc(37) Class12_Sub2_Sub2 local37 = new Class12_Sub2_Sub2();
			local20 = local37.method4750();
			Static508.anObject21 = Static11.method646(local20);
		}
		@Pc(52) Class293 local52 = arg0.aClass293_1;
		if (local52.method7165() && Static186.anObject8 == null) {
			local20 = Static509.method7294(16.0F, new Class248_Sub1(419684), 4.0F, 0.6F, 4.0F, 0.5F);
			Static186.anObject8 = Static11.method646(local20);
		}
	}
}
