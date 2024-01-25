import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lclient!fo;")
	public static Class82 aClass82_78;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
	public static int anInt5693;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "[I")
	public static final int[] anIntArray389 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
	public static int anInt5694 = -1;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZIIBFI)[I")
	public static int[] method4486(@OriginalArg(6) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub4_Sub1 local10 = new Class1_Sub4_Sub1();
		local10.anInt176 = 8;
		local10.anInt168 = 8;
		local10.anInt167 = 35;
		local10.aBoolean17 = true;
		local10.anInt170 = (int) (arg0 * 4096.0F);
		local10.anInt175 = 4;
		local10.method5686();
		Static412.method5317(2048, 1);
		local10.method136(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fq;BI)I")
	public static int method4487(@OriginalArg(0) Class83 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLjava/awt/Component;)Lclient!tu;")
	public static Class123 method4488(@OriginalArg(1) Component arg0) {
		return new Class123_Sub1(arg0);
	}
}
