import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static209 {

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
	public static int anInt3644;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_41 = new Class171(63, 1);

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	public static int anInt3642 = 0;

	@OriginalMember(owner = "client!gs", name = "k", descriptor = "F")
	public static float aFloat66 = 0.0F;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIB)Z")
	public static boolean method3118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static315.aByteArrayArrayArray13[1].length && Static315.aByteArrayArrayArray13[1][arg0].length > arg1) {
			return (Static315.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
	public static void method3119() {
		Static375.aClass295_50.method6464();
	}
}
