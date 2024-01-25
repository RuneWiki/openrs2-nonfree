import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	public static int anInt5010;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public static int anInt5007 = 64;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	public static int anInt5013 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method4246() {
		if (Static403.anInt3405 < 0) {
			return;
		}
		@Pc(19) long local19 = Static167.method2929();
		Static403.anInt3405 = (int) ((long) Static403.anInt3405 + Static309.aLong171 - local19);
		if (Static403.anInt3405 > 0) {
			@Pc(38) int local38 = (Static403.anInt3405 << 8) / Static218.anInt4426;
			@Pc(43) int local43 = 255 - local38;
			@Pc(48) float local48 = (float) local38 / 255.0F;
			Static352.anInt6230 = ((Static78.aClass169_1.anInt5004 & 0xFF00FF) * local43 + (Static453.anInt7765 & 0xFF00FF) * local38 & 0xFF00FF00) + ((Static78.aClass169_1.anInt5004 & 0xFF00) * local43 + (Static453.anInt7765 & 0xFF00) * local38 & 0xFF0000) >>> 8;
			@Pc(85) float local85 = 1.0F - local48;
			Static363.aFloat88 = local85 * (Static78.aClass169_1.aFloat70 - Static77.aFloat36) + Static77.aFloat36;
			Static122.aFloat58 = Static449.aFloat95 + local85 * (Static78.aClass169_1.aFloat72 - Static449.aFloat95);
			Static13.aFloat4 = Static196.aFloat94 + local85 * (Static78.aClass169_1.aFloat74 - Static196.aFloat94);
			Static368.anInt6380 = Static78.aClass169_1.anInt5009 * local43 + Static218.anInt4425 * local38 >> 8;
			Static229.anInt4569 = (local43 * (Static78.aClass169_1.anInt5008 & 0xFF00) + local38 * (Static178.anInt3669 & 0xFF00) & 0xFF0000) + (local43 * (Static78.aClass169_1.anInt5008 & 0xFF00FF) + local38 * (Static178.anInt3669 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static354.aFloat85 = Static162.aFloat34 + local85 * (Static78.aClass169_1.aFloat73 - Static162.aFloat34);
			Static341.aFloat84 = local85 * (Static78.aClass169_1.aFloat75 - Static67.aFloat33) + Static67.aFloat33;
			Static199.aFloat3 = local85 * (Static78.aClass169_1.aFloat71 - Static460.aFloat99) + Static460.aFloat99;
			if (Static14.aClass41_1 != Static78.aClass169_1.aClass41_5) {
				Static254.aClass41_4 = Static182.aClass30_12.method2035(Static14.aClass41_1, Static78.aClass169_1.aClass41_5, local85, Static254.aClass41_4);
			}
		} else {
			Static13.aFloat4 = Static78.aClass169_1.aFloat74;
			Static199.aFloat3 = Static78.aClass169_1.aFloat71;
			Static122.aFloat58 = Static78.aClass169_1.aFloat72;
			Static254.aClass41_4 = Static78.aClass169_1.aClass41_5;
			Static352.anInt6230 = Static78.aClass169_1.anInt5004;
			Static354.aFloat85 = Static78.aClass169_1.aFloat73;
			Static403.anInt3405 = -1;
			Static229.anInt4569 = Static78.aClass169_1.anInt5008;
			Static368.anInt6380 = Static78.aClass169_1.anInt5009;
			Static341.aFloat84 = Static78.aClass169_1.aFloat75;
			Static363.aFloat88 = Static78.aClass169_1.aFloat70;
		}
		Static309.aLong171 = local19;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
	public static int method4248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 31 & arg0 - 1;
		return local11 + (arg1 + (arg1 >>> 31)) % arg0;
	}
}
