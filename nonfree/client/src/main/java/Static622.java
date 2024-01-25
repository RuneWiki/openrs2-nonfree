import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "[Lclient!rca;")
	public static Class296[] aClass296Array3;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "Lclient!ad;")
	public static final Class7 aClass7_9 = new Class7();

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
	public static int anInt10474 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Lclient!eba;")
	public static Class12_Sub2_Sub1 method8738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass12_Sub2_Sub1_1;
	}
}
