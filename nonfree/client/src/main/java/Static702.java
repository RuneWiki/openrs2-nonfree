import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static702 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!bt;")
	public static Class38 aClass38_8;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!jr;")
	public static Class194 aClass194_2;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!hd;")
	public static final Class145 aClass145_15 = new Class145(3);

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public static int anInt10990 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)S")
	public static short method9174(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >> 10 & 0x3F;
		@Pc(21) int local21 = arg0 >> 3 & 0x70;
		@Pc(25) int local25 = arg0 & 0x7F;
		@Pc(45) int local45 = local25 > 64 ? (127 - local25) * local21 >> 7 : local21 * local25 >> 7;
		@Pc(49) int local49 = local25 + local45;
		@Pc(55) int local55;
		if (local49 == 0) {
			local55 = local45 << 1;
		} else {
			local55 = (local45 << 8) / local49;
		}
		return (short) (local49 | local55 >> 4 << 7 | local15 << 10);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
	public static void method9177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static636.anInt10302 != arg0) {
			Static508.anIntArray472 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static508.anIntArray472[local13] = (local13 << 12) / arg0;
			}
			Static644.anInt10386 = arg0 * 32;
			Static144.anInt2744 = arg0 - 1;
			Static636.anInt10302 = arg0;
		}
		if (arg1 == Static443.anInt7682) {
			return;
		}
		if (arg1 == Static636.anInt10302) {
			Static123.anIntArray113 = Static508.anIntArray472;
		} else {
			Static123.anIntArray113 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static123.anIntArray113[local13] = (local13 << 12) / arg1;
			}
		}
		Static599.anInt9773 = arg1 - 1;
		Static443.anInt7682 = arg1;
	}
}
