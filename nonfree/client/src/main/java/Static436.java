import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "Lclient!it;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
	public static int anInt7961 = 0;

	@OriginalMember(owner = "client!rca", name = "v", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!rca", name = "y", descriptor = "Lclient!qo;")
	public static final Class267 aClass267_6 = new Class267();

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)[I")
	public static int[] method6658() {
		return new int[] { Static129.anInt2834, Static523.anInt9090, Static323.anInt6114 };
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!jo;II)Lclient!ed;")
	public static Class82 method6660(@OriginalArg(1) Class168 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte[] local16 = arg0.method4435(0, arg1);
		return local16 == null ? null : new Class82(local16);
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(III)Z")
	public static boolean method6661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
