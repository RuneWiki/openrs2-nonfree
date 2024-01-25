import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet4;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_8;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!mq;I[I)V")
	public static void method3585(@OriginalArg(1) Class12_Sub2_Sub1_Sub4_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(10) boolean local10;
		@Pc(12) int local12;
		if (arg0.anIntArray558 != null) {
			local10 = true;
			for (local12 = 0; local12 < arg0.anIntArray558.length; local12++) {
				if (arg2[local12] != arg0.anIntArray558[local12]) {
					local10 = false;
					break;
				}
			}
			if (local10 && arg0.anInt8394 != -1) {
				@Pc(52) Class148 local52 = Static117.aClass18_1.method296(arg0.anInt8394);
				@Pc(55) int local55 = local52.anInt3043;
				if (local55 == 1) {
					arg0.anInt8379 = 1;
					arg0.anInt8397 = arg1;
					arg0.anInt8420 = 0;
					arg0.anInt8357 = 0;
					arg0.anInt8396 = 0;
					if (!arg0.aBoolean709) {
						Static543.method7102(arg0, arg0.anInt8420, local52);
					}
				}
				if (local55 == 2) {
					arg0.anInt8357 = 0;
				}
			}
		}
		local10 = true;
		for (local12 = 0; local12 < arg2.length; local12++) {
			if (arg2[local12] != -1) {
				local10 = false;
			}
			if (arg0.anIntArray558 == null || arg0.anIntArray558[local12] == -1 || Static117.aClass18_1.method296(arg2[local12]).anInt3050 >= Static117.aClass18_1.method296(arg0.anIntArray558[local12]).anInt3050) {
				arg0.anIntArray558 = arg2;
				arg0.anInt8397 = arg1;
				break;
			}
		}
		if (local10) {
			arg0.anInt8397 = arg1;
			arg0.anIntArray558 = arg2;
		}
	}
}
