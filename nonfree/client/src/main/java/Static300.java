import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
	public static int anInt6134;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Lclient!ji;")
	public static final Class6_Sub8 aClass6_Sub8_7 = new Class6_Sub8(1350);

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_65 = new Class185(78, 11);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public static void method5130() {
		@Pc(3) Class234[] local3 = Class6_Sub5_Sub1_Sub2.aClass234Array1;
		synchronized (Class6_Sub5_Sub1_Sub2.aClass234Array1) {
			for (@Pc(13) int local13 = 0; local13 < Class6_Sub5_Sub1_Sub2.aClass234Array1.length; local13++) {
				Class6_Sub5_Sub1_Sub2.aClass234Array1[local13] = new Class234();
				Static3.anIntArray1[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BIIII)V")
	public static void method5132(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 > arg2) {
			Static571.method7990(arg0, Static173.anIntArrayArray15[arg3], arg2, arg1);
		} else {
			Static571.method7990(arg0, Static173.anIntArrayArray15[arg3], arg1, arg2);
		}
	}
}
