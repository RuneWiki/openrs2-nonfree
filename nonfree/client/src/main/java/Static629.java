import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!tv", name = "T", descriptor = "I")
	public static int anInt9655;

	@OriginalMember(owner = "client!tv", name = "B", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!tv", name = "C", descriptor = "[I")
	public static final int[] anIntArray702 = new int[5];

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BIIIIII)Lclient!db;")
	public static Class74 method8511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 986053L ^ (long) arg4 * 97549L ^ (long) arg0 * 67481L ^ (long) arg3 * 475427L ^ (long) arg5 * 32147369L ^ (long) arg1 * 76724863L;
		@Pc(39) Class74 local39 = (Class74) Static108.aClass85_13.method1737(local33);
		if (local39 == null) {
			local39 = Static587.aClass145_12.method9692(arg0, arg4, arg3, arg2, arg5, arg1);
			Static108.aClass85_13.method1745(local33, 16383, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V")
	public static void method8513() {
		Static529.method7451(false);
		if (Static707.anInt10827 >= 0 && Static707.anInt10827 != 0) {
			Static213.method2982(false, Static707.anInt10827);
			Static707.anInt10827 = -1;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	public static void method8519() {
		if (Static566.anInt8894 <= 0) {
			Static570.aString99 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static371.aStringArray22.length; local14++) {
			if (Static371.aStringArray22[local14].indexOf("--> ") != -1) {
				local12++;
				if (local12 == Static566.anInt8894) {
					Static570.aString99 = Static371.aStringArray22[local14].substring(Static371.aStringArray22[local14].indexOf(">") + 2);
					return;
				}
			}
		}
	}
}
