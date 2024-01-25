import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!he", name = "C", descriptor = "I")
	public static int anInt3711;

	@OriginalMember(owner = "client!he", name = "E", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array7;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "Lclient!jk;")
	public static Class168 aClass168_2;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_116 = new Class272(85, 10);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
	public static boolean method3279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!qh;)Lclient!gr;")
	public static Class120 method3283(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method3109();
		return new Class120(local7);
	}
}
