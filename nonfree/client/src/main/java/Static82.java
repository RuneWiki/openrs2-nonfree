import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "Lclient!dv;")
	public static Class96 aClass96_27 = new Class96(4, 1, 1, 1);

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
	public static void method9317(@OriginalArg(0) int arg0) {
		if (arg0 != 10268) {
			aClass96_27 = null;
		}
		@Pc(12) Class391 local12 = Static320.aClass391_27;
		synchronized (Static320.aClass391_27) {
			Static320.aClass391_27.method9276(0);
		}
		local12 = Static32.aClass391_5;
		synchronized (Static32.aClass391_5) {
			Static32.aClass391_5.method9276(0);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIIII)V")
	public static void method9318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static659.anInt10597 != 1) {
			return;
		}
		@Pc(14) int local14 = arg3 / Static324.anInt10471;
		@Pc(18) int local18 = arg2 / Static324.anInt10471;
		@Pc(22) int local22 = arg1 / Static625.anInt10198;
		@Pc(31) int local31 = arg0 / Static625.anInt10198;
		if (local14 >= Static3.anInt23 || local18 < 0 || Static171.anInt2921 <= local22 || local31 < 0) {
			return;
		}
		if (Static3.anInt23 <= local18) {
			local18 = Static3.anInt23 - 1;
		}
		if (local14 < 0) {
			local14 = 0;
		}
		if (local22 < 0) {
			local22 = 0;
		}
		if (Static171.anInt2921 <= local31) {
			local31 = Static171.anInt2921 - 1;
		}
		for (@Pc(91) int local91 = local22; local91 <= local31; local91++) {
			@Pc(102) int local102 = Static92.method1361(Static171.anInt2921, Static32.anInt566 + local91) * Static3.anInt23;
			for (@Pc(104) int local104 = local14; local104 <= local18; local104++) {
				@Pc(115) int local115 = Static92.method1361(Static3.anInt23, Static213.anInt3473 + local104) + local102;
				Static615.anIntArray561[local115] = Static156.anInt2449;
			}
		}
	}
}
