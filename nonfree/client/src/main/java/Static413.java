import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	public static int anInt6892;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_159 = new Class265(65, 8);

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public static int anInt6881 = 0;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	public static int anInt6885 = 0;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Lclient!wa;")
	public static Class258 method5433(@OriginalArg(1) int arg0) {
		@Pc(8) Class258[] local8 = Static143.method2411();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class258 local21 = local8[local15];
			if (local21.anInt7175 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!vc;B)V")
	public static void method5434(@OriginalArg(0) Class2_Sub23_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static404.anInt6735; local3++) {
			@Pc(17) int local17 = Static344.anIntArray506[local3];
			@Pc(21) Class3_Sub2_Sub1_Sub2 local21 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local17];
			@Pc(25) int local25 = arg0.method5495();
			if ((local25 & 0x2) != 0) {
				local25 += arg0.method5495() << 8;
			}
			if ((local25 & 0x200) != 0) {
				local25 += arg0.method5495() << 16;
			}
			Static322.method4526(local25, local21, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)I")
	public static int method5435(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
