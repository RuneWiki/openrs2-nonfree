import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method1269() {
		Static147.aClass129_43.method3025();
		Static419.aClass129_73.method3025();
		Static294.aClass129_35.method3025();
		Static172.aClass129_26.method3025();
		Static387.aClass129_61.method3025();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
	public static void method1272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class240 local10 = new Class240(16);
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) Static383.aClass240_34.method5438(); local15 != null; local15 = (Class2_Sub21) Static383.aClass240_34.method5436()) {
			local15.method6072();
			@Pc(31) int local31 = (int) (local15.aLong227 >> 28);
			@Pc(41) int local41 = (int) (local15.aLong227 >> 14 & 0x3FFFL) - arg0;
			@Pc(50) int local50 = (int) (local15.aLong227 & 0x3FFFL) - arg1;
			if (local50 >= 0 && local41 >= 0 && local50 < Static81.anInt1950 && Static171.anInt3288 > local41) {
				local10.method5430((long) (local41 << 14 | local31 << 28 | local50), local15);
			}
		}
		Static383.aClass240_34 = local10;
	}
}
