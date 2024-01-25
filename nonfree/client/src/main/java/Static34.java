import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bea", name = "v", descriptor = "Lclient!ts;")
	public static Class6_Sub45 aClass6_Sub45_1;

	@OriginalMember(owner = "client!bea", name = "z", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!bea", name = "s", descriptor = "Lclient!nh;")
	public static final Class219 aClass219_3 = new Class219(1);

	@OriginalMember(owner = "client!bea", name = "x", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_16 = new Class47(30, 3);

	@OriginalMember(owner = "client!bea", name = "B", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_14 = new Class73(59, 6);

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "(I)Lclient!saa;")
	public static Class299_Sub1 method942() {
		return Static332.aClass299_Sub1Array2.length > Static408.anInt7210 ? Static332.aClass299_Sub1Array2[Static408.anInt7210++] : null;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IILclient!wda;)Lclient!qe;")
	public static Class267 method943(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		@Pc(14) Class267 local14;
		if (Static376.aClass267_1 == null) {
			local14 = new Class267();
		} else {
			local14 = Static376.aClass267_1;
			Static376.aClass267_1 = Static376.aClass267_1.aClass267_2;
			local14.aClass267_2 = null;
			Static6.anInt4018--;
		}
		local14.aClass4_Sub1_2 = arg1;
		local14.anInt7270 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(III[B)[B")
	public static byte[] method944(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static601.method2938(arg1, arg0, local6, 0, 32768);
		return local6;
	}
}
