import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method4869() {
		for (@Pc(8) Class2_Sub5_Sub20 local8 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5833(); local8 != null; local8 = (Class2_Sub5_Sub20) Static261.aClass238_28.method5838()) {
			if (Static20.method474(local8.anInt10077)) {
				Static369.method5572(local8);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!nl;ZZI)V")
	public static void method4870(@OriginalArg(0) Class2_Sub37 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(6) int local6 = arg0.anInt6848;
		@Pc(10) int local10 = (int) arg0.aLong287;
		arg0.method8599();
		if (arg1) {
			Static535.method7477(local6);
		}
		Static290.method4543(local6);
		@Pc(34) Class78 local34 = Static180.method3291(local10);
		if (local34 != null) {
			Static397.method6022(local34);
		}
		method4869();
		if (!arg2 && Static387.anInt6978 != -1) {
			Static446.method6622(1, Static387.anInt6978);
		}
		@Pc(55) Class145 local55 = new Class145(Static206.aClass222_14);
		for (@Pc(60) Class2_Sub37 local60 = (Class2_Sub37) local55.method3600(); local60 != null; local60 = (Class2_Sub37) local55.method3599()) {
			if (!local60.method8600()) {
				local60 = (Class2_Sub37) local55.method3600();
				if (local60 == null) {
					return;
				}
			}
			if (local60.anInt6849 == 3) {
				@Pc(81) int local81 = (int) local60.aLong287;
				if (local6 == local81 >>> 16) {
					method4870(local60, true, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)I")
	public static int method4872(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return arg2;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
