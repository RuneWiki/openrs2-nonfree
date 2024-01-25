import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lh", name = "M", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_3;

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "Lclient!cv;")
	public static final Class62 aClass62_3 = new Class62();

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
	public static int anInt5839 = -1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/awt/Canvas;III)Lclient!id;")
	public static Class2_Sub27 method4852(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("Class2_Sub27_Sub2");
			@Pc(16) Class2_Sub27 local16 = (Class2_Sub27) local12.getDeclaredConstructor().newInstance();
			local16.method6243(arg1, arg0, arg2);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class2_Sub27_Sub1 local29 = new Class2_Sub27_Sub1();
			local29.method6243(arg1, arg0, arg2);
			return local29;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!ud;)Lclient!ada;")
	public static Class8_Sub1 method4854(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(7) Class8 local7 = Static140.method2667(arg0);
		@Pc(16) int local16 = arg0.method6865();
		@Pc(20) int local20 = arg0.method6865();
		@Pc(24) int local24 = arg0.method6884();
		return new Class8_Sub1(local7.aClass174_11, local7.aClass176_10, local7.anInt5338, local7.anInt5331, local7.anInt5334, local7.anInt5330, local7.anInt5340, local7.anInt5337, local7.anInt5341, local16, local20, local24);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method4855(@OriginalArg(1) int arg0) {
		Static347.anInt6415 = 3;
		Static59.anInt1226 = 100;
		Static432.anInt7737 = arg0;
		Static549.anInt9101 = -1;
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)I")
	public static int method4856() {
		return Static279.anInt5329;
	}
}
