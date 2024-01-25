import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_14 = new Class240(56, 18);

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString14 = null;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILclient!wc;I)V")
	public static void method751(@OriginalArg(1) int arg0, @OriginalArg(2) Class382 arg1, @OriginalArg(3) int arg2) {
		Static26.aClass382ArrayArray1[arg0][arg2] = arg1;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	public static void method753() {
		@Pc(5) int local5 = 0;
		if (Static336.aClass3_Sub41_18 != null) {
			local5 = Static336.aClass3_Sub41_18.aClass14_Sub29_1.method8914();
		}
		@Pc(22) int local22;
		@Pc(31) int local31;
		if (local5 == 2) {
			local22 = Static190.anInt3438 > 800 ? 800 : Static190.anInt3438;
			local31 = Static674.anInt10898 > 600 ? 600 : Static674.anInt10898;
			Static531.anInt8327 = local22;
			Static462.anInt7379 = (Static190.anInt3438 - local22) / 2;
			Static640.anInt10686 = 0;
			Static13.anInt306 = local31;
		} else if (local5 == 1) {
			local22 = Static190.anInt3438 <= 1024 ? Static190.anInt3438 : 1024;
			Static531.anInt8327 = local22;
			Static462.anInt7379 = (Static190.anInt3438 - local22) / 2;
			local31 = Static674.anInt10898 > 768 ? 768 : Static674.anInt10898;
			Static13.anInt306 = local31;
			Static640.anInt10686 = 0;
		} else {
			Static13.anInt306 = Static674.anInt10898;
			Static462.anInt7379 = 0;
			Static640.anInt10686 = 0;
			Static531.anInt8327 = Static190.anInt3438;
		}
	}
}
