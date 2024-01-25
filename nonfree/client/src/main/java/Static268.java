import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!iga", name = "n", descriptor = "I")
	public static int anInt4159;

	@OriginalMember(owner = "client!iga", name = "o", descriptor = "I")
	public static int anInt4160 = 1;

	@OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
	public static int anInt4162 = 0;

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_77 = new Class225(1, -2);

	@OriginalMember(owner = "client!iga", name = "m", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_78 = new Class225(143, 4);

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIILclient!uca;Lclient!uca;)V")
	public static void method3773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2_Sub4 arg3, @OriginalArg(4) Class4_Sub2_Sub4 arg4) {
		@Pc(4) Class311 local4 = Static582.method8090(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub2_Sub4_1 = arg3;
		local4.aClass4_Sub2_Sub4_2 = arg4;
		@Pc(22) int local22 = Static158.aClass133Array4 == Static685.aClass133Array5 ? 1 : 0;
		if (!arg3.method8970()) {
			arg3.aClass4_Sub2_25 = Static699.aClass4_Sub2Array6[local22];
			Static699.aClass4_Sub2Array6[local22] = arg3;
		} else if (arg3.method8976()) {
			arg3.aClass4_Sub2_25 = Static161.aClass4_Sub2Array1[local22];
			Static161.aClass4_Sub2Array1[local22] = arg3;
		} else {
			arg3.aClass4_Sub2_25 = Static594.aClass4_Sub2Array5[local22];
			Static594.aClass4_Sub2Array5[local22] = arg3;
			Static415.aBoolean615 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8970()) {
			if (arg4.method8976()) {
				arg4.aClass4_Sub2_25 = Static161.aClass4_Sub2Array1[local22];
				Static161.aClass4_Sub2Array1[local22] = arg4;
				return;
			}
			arg4.aClass4_Sub2_25 = Static594.aClass4_Sub2Array5[local22];
			Static594.aClass4_Sub2Array5[local22] = arg4;
			Static415.aBoolean615 = true;
			return;
		}
		arg4.aClass4_Sub2_25 = Static699.aClass4_Sub2Array6[local22];
		Static699.aClass4_Sub2Array6[local22] = arg4;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IB)Lclient!bv;")
	public static Class50 method3775() {
		return new Class50(1, false);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)Z")
	public static boolean method3778(@OriginalArg(0) int arg0) {
		if (Static39.aBooleanArray5[arg0]) {
			return true;
		} else if (Static240.aClass254_166.method6095(arg0)) {
			@Pc(31) int local31 = Static240.aClass254_166.method6101(arg0);
			if (local31 == 0) {
				Static39.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static581.aClass273ArrayArray2[arg0] == null) {
				Static581.aClass273ArrayArray2[arg0] = new Class273[local31];
			}
			for (@Pc(53) int local53 = 0; local53 < local31; local53++) {
				if (Static581.aClass273ArrayArray2[arg0][local53] == null) {
					@Pc(69) byte[] local69 = Static240.aClass254_166.method6087(local53, arg0);
					if (local69 != null) {
						@Pc(81) Class273 local81 = Static581.aClass273ArrayArray2[arg0][local53] = new Class273();
						local81.anInt7350 = local53 + (arg0 << 16);
						if (local69[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local81.method6601(new Class2_Sub20(local69));
					}
				}
			}
			Static39.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
