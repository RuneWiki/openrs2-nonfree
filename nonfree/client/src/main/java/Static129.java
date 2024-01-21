import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!od", name = "U", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_16;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
	public static int anInt3533;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_975 = Static158.method3034("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_976 = Static158.method3034("null");

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_977 = Static158.method3034("Angreifen");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!pe;I)Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2 method2729(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		return Static12.method311(arg0, arg1) ? Static104.method2371() : null;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	public static void method2730() {
		Static98.aClass89_36.method3439();
		Static149.aClass89_56.method3439();
		Static181.aClass89_66.method3439();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	public static void method2731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static42.anInt1305; local3++) {
			if (arg1 < Static38.anIntArray101[local3] + Static99.anIntArray329[local3] && arg2 + arg1 > Static38.anIntArray101[local3] && arg0 < Static16.anIntArray42[local3] + Static98.anIntArray326[local3] && Static16.anIntArray42[local3] < arg3 + arg0) {
				Static127.aBooleanArray14[local3] = true;
			}
		}
	}
}
