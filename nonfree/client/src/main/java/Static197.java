import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
	public static int[] anIntArray390;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "[I")
	public static int[] anIntArray391;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
	public static void method3555() {
		@Pc(16) byte[] local16;
		if (Static112.anObject13 == null) {
			@Pc(9) Class63_Sub2_Sub2 local9 = new Class63_Sub2_Sub2();
			local16 = local9.method5913();
			Static112.anObject13 = Static422.method6064(local16);
		}
		if (Static174.anObject19 == null) {
			@Pc(27) Class63_Sub1_Sub1 local27 = new Class63_Sub1_Sub1();
			local16 = local27.method1403();
			Static174.anObject19 = Static422.method6064(local16);
		}
	}
}
