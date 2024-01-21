import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ea", name = "Ib", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ea", name = "Hb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_698 = Static107.method1838("");

	@OriginalMember(owner = "client!ea", name = "Kb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_699 = Static107.method1838("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public static void method738() {
		aByteArrayArrayArray3 = null;
		aClass28_699 = null;
		aClass28_698 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I[Lclient!hd;[III)V")
	public static void method739(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class31[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg0 <= arg4) {
			return;
		}
		@Pc(21) int local21 = arg4 - 1;
		@Pc(27) int local27 = (arg0 + arg4) / 2;
		@Pc(31) int local31 = arg0 + 1;
		@Pc(35) Class31 local35 = arg2[local27];
		arg2[local27] = arg2[arg4];
		arg2[arg4] = local35;
		while (local21 < local31) {
			@Pc(49) boolean local49 = true;
			@Pc(52) int local52;
			@Pc(66) int local66;
			@Pc(69) int local69;
			do {
				local31--;
				for (local52 = 0; local52 < 4; local52++) {
					if (arg3[local52] == 2) {
						local66 = arg2[local31].anInt1793;
						local69 = local35.anInt1793;
					} else if (arg3[local52] == 1) {
						local66 = arg2[local31].anInt1798;
						if (local66 == -1 && arg1[local52] == 1) {
							local66 = 2001;
						}
						local69 = local35.anInt1798;
						if (local69 == -1 && arg1[local52] == 1) {
							local69 = 2001;
						}
					} else if (arg3[local52] == 3) {
						local66 = arg2[local31].aBoolean91 ? 1 : 0;
						local69 = local35.aBoolean91 ? 1 : 0;
					} else {
						local69 = local35.anInt1795;
						local66 = arg2[local31].anInt1795;
					}
					if (local66 != local69) {
						if ((arg1[local52] != 1 || local66 <= local69) && (arg1[local52] != 0 || local69 <= local66)) {
							local49 = false;
						}
						break;
					}
					if (local52 == 3) {
						local49 = false;
					}
				}
			} while (local49);
			local49 = true;
			do {
				local21++;
				for (local52 = 0; local52 < 4; local52++) {
					if (arg3[local52] == 2) {
						local66 = arg2[local21].anInt1793;
						local69 = local35.anInt1793;
					} else if (arg3[local52] == 1) {
						local66 = arg2[local21].anInt1798;
						local69 = local35.anInt1798;
						if (local66 == -1 && arg1[local52] == 1) {
							local66 = 2001;
						}
						if (local69 == -1 && arg1[local52] == 1) {
							local69 = 2001;
						}
					} else if (arg3[local52] == 3) {
						local69 = local35.aBoolean91 ? 1 : 0;
						local66 = arg2[local21].aBoolean91 ? 1 : 0;
					} else {
						local66 = arg2[local21].anInt1795;
						local69 = local35.anInt1795;
					}
					if (local66 != local69) {
						if ((arg1[local52] != 1 || local66 >= local69) && (arg1[local52] != 0 || local69 >= local66)) {
							local49 = false;
						}
						break;
					}
					if (local52 == 3) {
						local49 = false;
					}
				}
			} while (local49);
			if (local31 > local21) {
				@Pc(346) Class31 local346 = arg2[local21];
				arg2[local21] = arg2[local31];
				arg2[local31] = local346;
			}
		}
		method739(local31, arg1, arg2, arg3, arg4);
		method739(arg0, arg1, arg2, arg3, local31 + 1);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)J")
	public static long method740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass52_1 == null ? 0L : local7.aClass52_1.aLong93;
	}
}
