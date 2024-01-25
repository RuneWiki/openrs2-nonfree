import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static628 {

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!raa;")
	public static Class294 aClass294_3;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public static int anInt10563;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!jc;")
	public static Class14_Sub5_Sub2 aClass14_Sub5_Sub2_4;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public static int anInt10569;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!ne;")
	public static final Class240 aClass240_8 = new Class240("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "[Lclient!eo;")
	public static final Class14_Sub19[] aClass14_Sub19Array1 = new Class14_Sub19[300];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)Z")
	public static boolean method8809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
