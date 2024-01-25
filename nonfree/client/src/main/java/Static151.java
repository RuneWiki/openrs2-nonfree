import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "[[Lclient!at;")
	public static Class16[][] aClass16ArrayArray1;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_51 = new Class134("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[I")
	public static final int[] anIntArray209 = new int[2048];

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_88 = new Class102(40, -1);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!mb;III)V")
	public static void method2184(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static174.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt607 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub29Array2[arg0.anInt607++] = Static210.aClass250Array1[local21 - 1].aClass2_Sub29_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt607; local21 < 4; local21++) {
			arg0.aClass2_Sub29Array2[local21] = null;
		}
	}
}
