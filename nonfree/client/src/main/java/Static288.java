import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "Lclient!kp;")
	public static Class168 aClass168_1 = new Class168();

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)I")
	public static int method5068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static93.anIntArray146[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIB)V")
	public static void method5069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(14, arg0);
		local8.method6693();
		local8.anInt7487 = arg1;
	}
}
