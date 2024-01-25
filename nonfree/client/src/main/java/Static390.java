import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!pv", name = "N", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!pv", name = "L", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_68 = new Class77(78, -1);

	@OriginalMember(owner = "client!pv", name = "O", descriptor = "I")
	public static int anInt7421 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIZI)V")
	public static void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static447.anInt8134 = arg3;
		Static469.anInt8586 = arg1;
		Static416.anInt9658 = arg0;
		Static6.anInt95 = arg5;
		Static180.anInt4075 = arg2;
		if (arg4 && Static416.anInt9658 >= 100) {
			Static368.anInt6832 = Static6.anInt95 * 128 + 64;
			Static6.anInt93 = Static180.anInt4075 * 128 + 64;
			Static62.anInt1472 = Static443.method6717(Static368.anInt6832, Static6.anInt93, Static56.anInt1418) - Static447.anInt8134;
		}
		Static242.anInt4993 = 2;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILjava/io/File;Ljava/lang/String;)V")
	public static void method6181(@OriginalArg(1) File arg0, @OriginalArg(2) String arg1) {
		Static158.aHashtable6.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLclient!om;Lclient!qa;)I")
	public static int method6182(@OriginalArg(1) Class231 arg0, @OriginalArg(2) Class42 arg1) {
		if (arg0.anInt6669 != -1) {
			return arg0.anInt6669;
		}
		if (arg0.anInt6668 != -1) {
			@Pc(30) Class278 local30 = arg1.anInterface11_11.method6215(arg1.method5843() ? arg0.anInt6668 : arg0.anInt6675);
			if (!local30.aBoolean568) {
				return local30.aShort96;
			}
		}
		return arg0.anInt6664;
	}
}
