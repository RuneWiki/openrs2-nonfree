import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	public static final int anInt5722 = 1407;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZZ)V")
	public static void method4540(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static103.anInt5365 != -1) {
				Static188.method5356(Static103.anInt5365);
			}
			for (@Pc(19) Class2_Sub9 local19 = (Class2_Sub9) Static394.aClass220_45.method5096(); local19 != null; local19 = (Class2_Sub9) Static394.aClass220_45.method5098()) {
				if (!local19.method6258()) {
					local19 = (Class2_Sub9) Static394.aClass220_45.method5096();
					if (local19 == null) {
						break;
					}
				}
				Static343.method2399(true, local19, false);
			}
			Static103.anInt5365 = -1;
			Static394.aClass220_45 = new Class220(8);
			Static404.method2274();
			Static103.anInt5365 = Static274.anInt4978;
			Static92.method1399(false);
			Static323.method4576();
			Static76.method1144(Static103.anInt5365);
		}
		Static418.aBoolean480 = true;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZI)V")
	public static void method4541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class226 local9 = Static57.aClass226ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static449.anInt7477 = local9.anInt6537;
			Static73.anInt1228 = local9.anInt6542;
			Static258.anInt4503 = local9.anInt6543;
		}
		Static433.method5871();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!ot;IIIII)V")
	public static void method4542(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt164 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub4Array2[local4] != null) {
				arg0.anInt164++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt164; local22++) {
			@Pc(31) long local31 = Static254.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class38 local41;
			while (local31 != 0L) {
				local41 = Static330.aClass38Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub4_1 == arg0.aClass2_Sub4Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static254.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static330.aClass38Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub4_1 == arg0.aClass2_Sub4Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt164 - 1; local93++) {
				arg0.aClass2_Sub4Array2[local93] = arg0.aClass2_Sub4Array2[local93 + 1];
			}
			arg0.anInt164--;
		}
	}
}
