import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
	public static int anInt9821;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
	public static final int[] anIntArray562 = new int[6];

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "Lclient!ga;")
	public static Class124 aClass124_98 = new Class124();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	public static void method8177() {
		if (Static385.aClass143_9 != null) {
			Static385.aClass143_9.method6225();
			Static404.aClass72_11 = null;
			Static385.aClass143_9 = null;
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)I")
	public static int method8179() {
		if (Static610.aClass394_12 == null) {
			if (!Static423.aBoolean549 && Static529.aClass5_Sub2_Sub13_5 != null) {
				return Static529.aClass5_Sub2_Sub13_5.anInt6708;
			}
			@Pc(15) int local15 = Static178.aClass111_1.method8703();
			@Pc(19) int local19 = Static178.aClass111_1.method8696();
			@Pc(35) int local35;
			@Pc(37) int local37;
			@Pc(55) int local55;
			@Pc(124) Class5_Sub2_Sub13 local124;
			if (Static530.aBoolean634) {
				@Pc(231) Class277 local231;
				if (Static73.anInt1175 < local15 && Static73.anInt1175 + Static342.anInt6177 > local15) {
					local35 = -1;
					for (local37 = 0; local37 < Static150.anInt2471; local37++) {
						if (Static530.aBoolean635) {
							local55 = local37 * 16 + Static676.anInt9309 + 33;
							if (local19 > local55 - 13 && local19 <= local55 + 3) {
								local35 = local37;
							}
						} else {
							local55 = local37 * 16 + Static676.anInt9309 + 31;
							if (local19 > local55 - 13 && local19 <= local55 + 3) {
								local35 = local37;
							}
						}
					}
					if (local35 != -1) {
						local55 = 0;
						local231 = new Class277(Static600.aClass150_16);
						for (@Pc(236) Class5_Sub2_Sub5 local236 = (Class5_Sub2_Sub5) local231.method6753(); local236 != null; local236 = (Class5_Sub2_Sub5) local231.method6752()) {
							if (local55++ == local35) {
								return ((Class5_Sub2_Sub13) local236.aClass150_3.aClass5_Sub2_24.aClass5_Sub2_67).anInt6708;
							}
						}
					}
				} else if (Static303.aClass5_Sub2_Sub5_1 != null && Static501.anInt8524 < local15 && Static501.anInt8524 + Static469.anInt8171 > local15) {
					local35 = -1;
					for (local37 = 0; local37 < Static303.aClass5_Sub2_Sub5_1.anInt2821; local37++) {
						if (Static530.aBoolean635) {
							local55 = Static212.anInt3404 + local37 * 16 + 33;
							if (local55 - 13 < local19 && local55 + 3 >= local19) {
								local35 = local37;
							}
						} else {
							local55 = Static212.anInt3404 + local37 * 16 + 31;
							if (local55 - 13 < local19 && local55 + 3 >= local19) {
								local35 = local37;
							}
						}
					}
					if (local35 != -1) {
						local55 = 0;
						local231 = new Class277(Static303.aClass5_Sub2_Sub5_1.aClass150_3);
						for (local124 = (Class5_Sub2_Sub13) local231.method6753(); local124 != null; local124 = (Class5_Sub2_Sub13) local231.method6752()) {
							if (local55++ == local35) {
								return local124.anInt6708;
							}
						}
					}
				}
			} else if (local15 > Static73.anInt1175 && local15 < Static342.anInt6177 + Static73.anInt1175) {
				local35 = -1;
				for (local37 = 0; local37 < Static223.anInt3566; local37++) {
					if (Static530.aBoolean635) {
						local55 = Static676.anInt9309 + (Static223.anInt3566 - local37 - 1) * 16 + 33;
						if (local19 > local55 - 13 && local19 <= local55 + 3) {
							local35 = local37;
						}
					} else {
						local55 = (Static223.anInt3566 - local37 - 1) * 16 + Static676.anInt9309 + 31;
						if (local55 - 13 < local19 && local55 + 3 >= local19) {
							local35 = local37;
						}
					}
				}
				if (local35 != -1) {
					local55 = 0;
					@Pc(119) Class328 local119 = new Class328(Static153.aClass124_24);
					for (local124 = (Class5_Sub2_Sub13) local119.method7633(); local124 != null; local124 = (Class5_Sub2_Sub13) local119.method7631()) {
						if (local55++ == local35) {
							return local124.anInt6708;
						}
					}
				}
			}
		}
		return -1;
	}
}
