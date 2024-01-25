import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!om", name = "D", descriptor = "I")
	public static int anInt4654;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "Lclient!v;")
	public static Class207 aClass207_3;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "Lclient!c;")
	public static Class5 aClass5_24;

	@OriginalMember(owner = "client!om", name = "P", descriptor = "Lclient!wo;")
	public static Class216 aClass216_75;

	@OriginalMember(owner = "client!om", name = "R", descriptor = "Lclient!wo;")
	public static Class216 aClass216_76;

	@OriginalMember(owner = "client!om", name = "V", descriptor = "I")
	public static int anInt4662 = -1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V")
	public static void method4189(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class1 local9 = Static264.aClass197_32.method5161(); local9 != null; local9 = Static264.aClass197_32.method5154()) {
			if ((local9.aLong213 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method5628();
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)I")
	public static int method4191(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "(I)Lclient!oo;")
	public static Class104_Sub1 method4192() {
		return Static13.anInt486 < Static90.aClass104_Sub1Array3.length ? Static90.aClass104_Sub1Array3[Static13.anInt486++] : null;
	}
}
