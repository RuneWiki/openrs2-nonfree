import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	public static int anInt4341;

	@OriginalMember(owner = "client!ql", name = "R", descriptor = "Z")
	public static boolean aBoolean288;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "Lclient!gk;")
	public static Class4_Sub9_Sub4 aClass4_Sub9_Sub4_2;

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
	public static int anInt4347;

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "Lclient!dh;")
	public static Class33 aClass33_32 = new Class33(2);

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString139 = "rating: ";

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "[I")
	public static int[] anIntArray389 = new int[14];

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)V")
	public static void method3517() {
		aClass4_Sub9_Sub4_2 = null;
		aClass33_32 = null;
		anIntArray389 = null;
		aString139 = null;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(III)I")
	public static int method3518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub32 local12 = (Class4_Sub32) Static105.aClass97_9.method2360((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local12.anIntArray482.length; local29++) {
				if (arg0 == local12.anIntArray480[local29]) {
					local27 += local12.anIntArray482[local29];
				}
			}
			return local27;
		}
	}
}
