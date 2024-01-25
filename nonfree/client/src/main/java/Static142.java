import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)V")
	public static void method2737(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub18 local8 = Static72.method6564(arg0, arg1);
		if (local8 != null) {
			local8.method8379();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)I")
	public static int method2738() {
		if (Static317.aClass225_54 == null) {
			if (!Static49.aBoolean36 && Static339.anInt6583 > 0) {
				if (Static89.aBoolean156 && Static584.aClass154_1.method3569(81) && Static339.anInt6583 > 2) {
					return ((Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286.aClass4_286).anInt8546;
				}
				return ((Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286).anInt8546;
			}
			@Pc(15) int local15 = Static172.aClass135_1.method6370();
			@Pc(19) int local19 = Static172.aClass135_1.method6378();
			@Pc(21) int local21 = Static19.anInt285;
			@Pc(23) int local23 = Static543.anInt9642;
			@Pc(25) int local25 = Static179.anInt3618;
			if (local15 > local21 && local21 + local25 > local15) {
				@Pc(44) int local44 = -1;
				@Pc(63) int local63;
				for (@Pc(46) int local46 = 0; local46 < Static339.anInt6583; local46++) {
					if (Static567.aBoolean701) {
						local63 = (Static339.anInt6583 - local46 - 1) * 16 + local23 + 33;
						if (local63 - 13 < local19 && local63 + 3 >= local19) {
							local44 = local46;
						}
					} else {
						local63 = (Static339.anInt6583 - local46 - 1) * 16 + local23 + 31;
						if (local19 > local63 - 13 && local63 + 3 >= local19) {
							local44 = local46;
						}
					}
				}
				if (local44 != -1) {
					local63 = 0;
					@Pc(124) Class89 local124 = new Class89(Static40.aClass244_4);
					for (@Pc(129) Class4_Sub39 local129 = (Class4_Sub39) local124.method2483(); local129 != null; local129 = (Class4_Sub39) local124.method2481()) {
						if (local63++ == local44) {
							return local129.anInt8546;
						}
					}
				}
			}
		}
		return -1;
	}
}
