import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!ir;")
	public static Class100 aClass100_20;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "[I")
	public static final int[] anIntArray64 = new int[100];

	@OriginalMember(owner = "client!co", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString33 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public static void method850() {
		@Pc(9) Class198 local9 = Static250.aClass198_45;
		synchronized (Static250.aClass198_45) {
			Static250.aClass198_45.method5230();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)V")
	public static void method851(@OriginalArg(1) int arg0) {
		if (Static221.anInt4557 == 0) {
			Static348.aClass3_Sub2_Sub4_3.method5117(arg0);
		} else {
			Static196.anInt4046 = arg0;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!so;IB)V")
	public static void method852(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1) {
		if (Static305.aBoolean412) {
			Static305.aBoolean412 = false;
			arg1 = 0;
		}
		if (Static213.aClass184_2 != null && Static213.aClass184_2.method4953(arg0)) {
			return;
		}
		Static213.aClass184_2 = arg0;
		Static52.aLong47 = Static53.method898();
		Static174.anInt3622 = arg1;
		Static301.anInt5983 = arg1;
		if (Static301.anInt5983 != 0) {
			Static116.anInt2486 = Static76.anInt1472;
			Static18.aFloat1 = Static97.aFloat10;
			Static117.anInt2505 = Static227.anInt4635;
			Static190.aFloat25 = Static320.aFloat18;
			Static134.aFloat22 = Static285.aFloat69;
			Static167.anInt3454 = Static79.anInt5531;
			Static204.aFloat26 = Static103.aFloat11;
			Static123.aFloat20 = Static121.aFloat19;
			Static112.aClass113_1 = Static295.aClass113_4;
			Static221.aFloat30 = Static212.aFloat9;
			return;
		}
		Static35.method2333();
	}
}
