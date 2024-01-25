import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!um", name = "o", descriptor = "[Lclient!ic;")
	public static final Class2_Sub7_Sub6[] aClass2_Sub7_Sub6Array9 = new Class2_Sub7_Sub6[14];

	@OriginalMember(owner = "client!um", name = "p", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray7 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(III)Lclient!he;")
	public static Class16_Sub1_Sub2 method8331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass16_Sub1_Sub2_1;
	}
}
