import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!at", name = "sb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!at", name = "eb", descriptor = "Lclient!dn;")
	public static final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IBI)Z")
	public static boolean method714(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!wv;BZ)V")
	public static void method716(@OriginalArg(0) Class365 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt9594 == 0 ? arg0.anInt9578 : arg0.anInt9594;
		@Pc(29) int local29 = arg0.anInt9599 == 0 ? arg0.anInt9638 : arg0.anInt9599;
		Static184.method4619(arg1, arg0.anInt9646, local29, Static249.aClass365ArrayArray3[arg0.anInt9646 >> 16], local12);
		if (arg0.aClass365Array2 != null) {
			Static184.method4619(arg1, arg0.anInt9646, local29, arg0.aClass365Array2, local12);
		}
		@Pc(62) Class1_Sub16 local62 = (Class1_Sub16) Static68.aClass356_4.method7796((long) arg0.anInt9646);
		if (local62 != null) {
			Static253.method4028(arg1, local62.anInt2681, local12, local29);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method717(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
