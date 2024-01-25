import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public static int anInt6889 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BIILjava/lang/Object;)[B")
	public static byte[] method6202(@OriginalArg(2) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static524.method7316(local13, arg0);
		} else if (arg1 instanceof Class159) {
			@Pc(25) Class159 local25 = (Class159) arg1;
			return local25.method4165(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!bba;)V")
	public static void method6203(@OriginalArg(1) Class28_Sub1_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class28_Sub1_Sub1_Sub1_Sub2) {
			@Pc(5) Class28_Sub1_Sub1_Sub1_Sub2 local5 = (Class28_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local5.aClass300_1 != null) {
				Static342.method5135(local5.aByte174 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, local5);
			}
		} else if (arg0 instanceof Class28_Sub1_Sub1_Sub1_Sub1) {
			@Pc(27) Class28_Sub1_Sub1_Sub1_Sub1 local27 = (Class28_Sub1_Sub1_Sub1_Sub1) arg0;
			Static40.method1043(local27, local27.aByte174 != Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174);
		}
	}
}
