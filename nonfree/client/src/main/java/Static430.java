import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "[Lclient!bka;")
	public static Class9[] aClass9Array26;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "Lclient!ui;")
	public static final Class369 aClass369_5 = new Class369();

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Lclient!rs;")
	public static Class3_Sub46 aClass3_Sub46_1 = null;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/awt/Frame;Lclient!cea;)V")
	public static void method6332(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class47 arg1) {
		while (true) {
			@Pc(10) Class201 local10 = arg1.method957(arg0);
			while (local10.anInt5729 == 0) {
				Static564.method7845(10L);
			}
			if (local10.anInt5729 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static564.method7845(100L);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	public static void method6333() {
		Static556.aClient1.method1156();
		Static167.aClass400_1.method9230();
		Static167.aClass400_1.aClass186_194 = null;
		Static167.aClass400_1.aClass186_195 = null;
		Static49.anInt834 = 0;
		Static167.aClass400_1.aClass3_Sub28_Sub2_2.anInt6241 = 0;
		Static167.aClass400_1.aClass186_197 = null;
		Static167.aClass400_1.anInt11055 = 0;
		Static156.method2475();
		Static319.aClass237_7 = null;
		Static474.aClass237_4 = null;
		Static657.aString127 = null;
		Static22.anInt373 = 0;
		Static303.aClass101Array1 = null;
		Static621.anInt10020 = 0;
		Static502.anInt8591 = 0;
	}
}
