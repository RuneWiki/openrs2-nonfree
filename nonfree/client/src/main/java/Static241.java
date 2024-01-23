import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	public static int anInt4772 = 0;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString277 = "wave:";

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString278 = "Loading world list data";

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public static int anInt4778 = 0;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!ik;")
	public static Class70 aClass70_16 = new Class70(16);

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public static int anInt4779 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method3699() {
		Static31.method643();
		Static111.method2040();
		Static250.method3856();
		Static95.method1755();
		Static123.method2167();
		Static67.method1220();
		Static113.method2066();
		Static106.method1952();
		Static109.method2014();
		Static202.method3260();
		Static296.method4435();
		Static3.method140();
		Static218.method3433();
		Static283.method4251();
		Static286.method4313();
		Static118.method2116();
		Static115.method2094();
		Static57.method1065();
		Static170.method2922();
		Static192.method3174();
		Static97.aClass135_9.method3324();
		Static86.aClass135_8.method3324();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!bo;)V")
	public static void method3700(@OriginalArg(1) Class14_Sub2 arg0) {
		@Pc(5) int local5 = arg0.anInt4692 - Static237.anInt4710;
		@Pc(21) int local21 = arg0.anInt4643 * 128 + arg0.method3656() * 64;
		@Pc(32) int local32 = arg0.anInt4634 * 128 + arg0.method3656() * 64;
		arg0.anInt4680 += (local21 - arg0.anInt4680) / local5;
		if (arg0.anInt4649 == 0) {
			arg0.anInt4618 = 1024;
		}
		arg0.anInt4614 = 0;
		arg0.anInt4630 += (local32 - arg0.anInt4630) / local5;
		if (arg0.anInt4649 == 1) {
			arg0.anInt4618 = 1536;
		}
		if (arg0.anInt4649 == 2) {
			arg0.anInt4618 = 0;
		}
		if (arg0.anInt4649 == 3) {
			arg0.anInt4618 = 512;
		}
	}
}
