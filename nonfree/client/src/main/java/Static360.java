import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "[[I")
	public static int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_93 = new Class177(67, -1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([BB)[B")
	public static byte[] method5071(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static469.method6021(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method5074(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg0, 1);
		local8.method2954();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
	public static void method5075() {
		if (Static193.aClass31_2 != null) {
			Static193.aClass31_2.method2013();
		}
		if (Static99.aClass31_1 != null) {
			Static99.aClass31_1.method2013();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)I")
	public static int method5078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static337.anIntArray581[arg0 & 0x3] : Static289.anIntArray514[arg0 & 0x3];
	}
}
