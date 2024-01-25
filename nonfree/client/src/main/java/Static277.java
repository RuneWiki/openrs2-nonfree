import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "Lclient!tca;")
	public static final Class325 aClass325_3 = new Class325();

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)[Lclient!ec;")
	public static Class86[] method5088() {
		return new Class86[] { Static310.aClass86_7, Static224.aClass86_5, Static589.aClass86_11 };
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)V")
	public static void method5090() {
		for (@Pc(15) Class2_Sub26 local15 = (Class2_Sub26) Static224.aClass99_38.method3060(); local15 != null; local15 = (Class2_Sub26) Static224.aClass99_38.method3058()) {
			if (local15.aBoolean388) {
				local15.aBoolean388 = false;
			} else {
				Static415.method6712(local15.anInt5281);
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)J")
	public static synchronized long method5091() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static192.aLong95) {
			Static3.aLong259 += Static192.aLong95 - local10;
		}
		Static192.aLong95 = local10;
		return local10 + Static3.aLong259;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BII)I")
	public static int method5092(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) byte local21;
		if (arg1 > 20000) {
			Static381.method6295();
			local21 = 4;
		} else if (arg1 > 10000) {
			local21 = 3;
			Static247.method6231();
		} else if (arg1 <= 5000) {
			Static27.method681();
			local21 = 1;
		} else {
			local21 = 2;
			Static418.method6758();
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != arg0) {
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, arg0);
			Static316.method5509(false, arg0);
		}
		Static318.method5531();
		return local21;
	}
}
