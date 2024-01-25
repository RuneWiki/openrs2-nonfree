import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Lclient!vo;")
	public static Class348 aClass348_136;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "I")
	public static int anInt10565 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!fa;)Lclient!r;")
	public static Class7 method8237(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface7 arg2) {
		return new Class7_Sub2(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([Ljava/lang/String;B)V")
	public static void method8238(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static437.aString173 = Static437.aString173 + arg0[0];
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < arg0.length; local16++) {
			if (arg0[local16].startsWith("pause")) {
				@Pc(26) int local26 = 5;
				try {
					local26 = Integer.parseInt(arg0[local16].substring(6));
				} catch (@Pc(35) Exception local35) {
				}
				Static47.method1139("Pausing for " + local26 + " seconds...");
				Static123.aStringArray37 = arg0;
				Static61.anInt1631 = local16 + 1;
				Static322.aLong169 = Static112.method2047() + (long) (local26 * 1000);
				return;
			}
			Static437.aString173 = arg0[local16];
			Static84.method1789(false);
		}
	}
}
