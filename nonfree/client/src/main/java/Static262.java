import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public static int anInt5000;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "I")
	public static int anInt5002;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "Lclient!hl;")
	public static final Class148 aClass148_12 = new Class148(0, 1);

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_55 = new Class341(39, 6);

	@OriginalMember(owner = "client!io", name = "k", descriptor = "S")
	public static short aShort53 = 32767;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lclient!ww;")
	public static Class15_Sub3_Sub4 method4520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub3_Sub4_2;
	}
}
