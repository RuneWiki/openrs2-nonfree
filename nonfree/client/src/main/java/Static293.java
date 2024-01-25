import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "Lclient!su;")
	public static Class325 aClass325_2;

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "Lclient!cj;")
	public static Class55 aClass55_3;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_166 = new Class288(3, -2);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!vj;)Lclient!wr;")
	public static Class3_Sub4 method4045(@OriginalArg(1) Class2_Sub22 arg0) {
		return new Class3_Sub4(arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8526(), arg0.method8539(), arg0.method8539(), arg0.method8547());
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)Lclient!cba;")
	public static Class45 method4046(@OriginalArg(0) int arg0) {
		@Pc(13) Class45[] local13 = Static255.method3524();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class45 local21 = local13[local15];
			if (local21.anInt1158 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(III)Z")
	public static boolean method4047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static311.method4221(arg1, arg0)) {
			return (arg1 & 0xB000) != 0 | Static437.method5996(arg0, arg1) | Static297.method4098(arg0, arg1) ? true : (Static134.method1848(arg1, arg0) | Static288.method4011(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
	public static void method4049() {
		for (@Pc(16) Class2_Sub21 local16 = (Class2_Sub21) Static242.aClass118_21.method2596(); local16 != null; local16 = (Class2_Sub21) Static242.aClass118_21.method2597()) {
			if (local16.aBoolean286) {
				local16.aBoolean286 = false;
			} else {
				Static183.method2678(local16.anInt4043);
			}
		}
	}
}
