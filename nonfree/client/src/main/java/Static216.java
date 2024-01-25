import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "Lclient!an;")
	public static Class16 aClass16_57;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
	public static int anInt4689 = 0;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIILclient!ss;)V")
	public static void method3991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class279 arg3) {
		for (@Pc(18) Class12_Sub22 local18 = (Class12_Sub22) Static316.aClass73_49.method2005(); local18 != null; local18 = (Class12_Sub22) Static316.aClass73_49.method2009()) {
			if (local18.anInt4477 == arg1 && local18.anInt4479 == arg0 << 7 && arg2 << 7 == local18.anInt4475 && local18.aClass279_1.anInt8315 == arg3.anInt8315) {
				if (local18.aClass12_Sub13_Sub4_3 != null) {
					Static328.aClass12_Sub13_Sub1_1.method2443(local18.aClass12_Sub13_Sub4_3);
					local18.aClass12_Sub13_Sub4_3 = null;
				}
				if (local18.aClass12_Sub13_Sub4_2 != null) {
					Static328.aClass12_Sub13_Sub1_1.method2443(local18.aClass12_Sub13_Sub4_2);
					local18.aClass12_Sub13_Sub4_2 = null;
				}
				local18.method7967();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!at;")
	public static Class12_Sub5 method3993(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class12_Sub5_Sub2");
			@Pc(10) Class12_Sub5 local10 = (Class12_Sub5) local6.getDeclaredConstructor().newInstance();
			local10.method7567(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class12_Sub5_Sub1 local26 = new Class12_Sub5_Sub1();
			local26.method7567(arg0);
			return local26;
		}
	}
}
