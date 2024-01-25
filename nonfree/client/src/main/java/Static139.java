import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Z")
	public static boolean aBoolean197 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BI)I")
	public static int method2103(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public static void method2104() {
		Static184.anInt3253 = -1;
		Static404.anInt7074 = 1;
		if (Static194.aString33 == null) {
			Static138.method2101(35);
		} else {
			@Pc(20) Class1_Sub35 local20 = new Class1_Sub35(Static263.method3789(Static191.method2937(Static194.aString33)));
			@Pc(24) long local24 = local20.method5778();
			Static435.aLong284 = local20.method5778();
			Static199.method3213(true, Static91.method1613(local24), "");
		}
	}
}
