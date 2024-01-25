import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Lclient!vf;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_55 = new Class198("M", "M", "M", "M");

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	public static int anInt3344 = 0;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIILclient!pv;)V")
	public static void method2688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub3_Sub1 arg2) {
		if (arg0 == arg2.anInt6193 && arg0 != -1) {
			@Pc(86) Class143 local86 = Static271.aClass219_4.method4752(arg0);
			@Pc(89) int local89 = local86.anInt3772;
			if (local89 == 1) {
				arg2.anInt6143 = 0;
				arg2.anInt6147 = arg1;
				arg2.anInt6159 = 0;
				arg2.anInt6117 = 0;
				arg2.anInt6183 = 1;
				Static340.method4406(false, local86, arg2.anInt7500, arg2.anInt6117, arg2.anInt7502, arg2.aByte105);
			}
			if (local89 == 2) {
				arg2.anInt6159 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt6193 == -1 || Static271.aClass219_4.method4752(arg0).anInt3783 >= Static271.aClass219_4.method4752(arg2.anInt6193).anInt3783) {
			arg2.anInt6117 = 0;
			arg2.anInt6147 = arg1;
			arg2.anInt6183 = 1;
			arg2.anInt6196 = arg2.anInt6199;
			arg2.anInt6143 = 0;
			arg2.anInt6159 = 0;
			arg2.anInt6193 = arg0;
			if (arg2.anInt6193 != -1) {
				Static340.method4406(false, Static271.aClass219_4.method4752(arg2.anInt6193), arg2.anInt7500, arg2.anInt6117, arg2.anInt7502, arg2.aByte105);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!uu;I)I")
	public static int method2689(@OriginalArg(0) Class5_Sub15_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method5610(2);
		@Pc(32) int local32;
		if (local10 == 0) {
			local32 = 0;
		} else if (local10 == 1) {
			local32 = arg0.method5610(5);
		} else if (local10 == 2) {
			local32 = arg0.method5610(8);
		} else {
			local32 = arg0.method5610(11);
		}
		return local32;
	}
}
