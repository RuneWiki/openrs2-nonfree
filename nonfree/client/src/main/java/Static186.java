import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IB)V")
	public static void method2904(@OriginalArg(0) int arg0) {
		Static399.anInt6574 = arg0;
		Static367.anInt10954 = 2;
		if (Static464.aString94 == null) {
			Static302.method4386(35);
		} else {
			@Pc(20) Class3_Sub4 local20 = new Class3_Sub4(Static9.method172(Static550.method7044(Static464.aString94)));
			@Pc(24) long local24 = local20.method7946();
			Static425.aLong191 = local20.method7946();
			Static220.method3264("", Static611.method8283(local24), true);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!hia;ZIZ)V")
	public static void method2905(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt3959;
		@Pc(12) int local12 = (int) arg0.aLong313;
		arg0.method9034();
		if (arg1) {
			Static223.method3279(local8);
		}
		Static138.method2316(local8);
		@Pc(27) Class265 local27 = Static223.method3278(local12);
		if (local27 != null) {
			Static218.method3194(local27);
		}
		Static190.method2932();
		if (!arg2 && Static187.anInt3418 != -1) {
			Static628.method8496(Static187.anInt3418, 1);
		}
		@Pc(56) Class129 local56 = new Class129(Static513.aClass333_33);
		for (@Pc(61) Class3_Sub25 local61 = (Class3_Sub25) local56.method3011(); local61 != null; local61 = (Class3_Sub25) local56.method3007()) {
			if (!local61.method9036()) {
				local61 = (Class3_Sub25) local56.method3011();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt3966 == 3) {
				@Pc(85) int local85 = (int) local61.aLong313;
				if (local85 >>> 16 == local8) {
					method2905(local61, true, arg2);
				}
			}
		}
	}
}
