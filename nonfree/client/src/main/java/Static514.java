import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!rba", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!qo;)V")
	public static void method7394(@OriginalArg(1) Class60_Sub1_Sub1_Sub3 arg0) {
		@Pc(8) Class104 local8 = arg0.aClass104_7;
		if (local8.method9030() && local8.method9039(1) && local8.method9038()) {
			if (arg0.aBoolean369) {
				local8.method9035(arg0.method4417(27750).method8960());
				arg0.aBoolean369 = local8.method9030();
			}
			local8.method9022();
		}
		@Pc(71) Class104 local71;
		for (@Pc(54) int local54 = 0; local54 < arg0.aClass40Array3.length; local54++) {
			if (arg0.aClass40Array3[local54].anInt571 != -1) {
				local71 = arg0.aClass40Array3[local54].aClass104_1;
				if (local71.method9021()) {
					@Pc(86) Class17 local86 = Static655.aClass172_2.method4449(arg0.aClass40Array3[local54].anInt571);
					@Pc(92) Class212 local92 = local71.method9041();
					if (local86.aBoolean21) {
						if (local92.anInt5527 == 3) {
							if (arg0.anInt4880 > 0 && Static141.anInt8737 >= arg0.anInt4869 && Static141.anInt8737 > arg0.anInt4875) {
								local71.method9035(-1);
								arg0.aClass40Array3[local54].anInt571 = -1;
								continue;
							}
						} else if (local92.anInt5527 == 1 && arg0.anInt4880 > 0 && Static141.anInt8737 >= arg0.anInt4869 && arg0.anInt4875 < Static141.anInt8737) {
							continue;
						}
					}
				}
				if (local71.method9039(1) && local71.method9038()) {
					local71.method9035(-1);
					arg0.aClass40Array3[local54].anInt571 = -1;
				}
			}
		}
		local71 = arg0.aClass104_8;
		if (local71.method9030()) {
			label81: {
				@Pc(222) Class212 local222 = local71.method9041();
				if (local222.anInt5527 == 3) {
					if (arg0.anInt4880 > 0 && Static141.anInt8737 >= arg0.anInt4869 && Static141.anInt8737 > arg0.anInt4875) {
						arg0.anIntArray256 = null;
						local71.method9035(-1);
						break label81;
					}
				} else if (local222.anInt5527 == 1 && arg0.anInt4880 > 0 && Static141.anInt8737 >= arg0.anInt4869 && Static141.anInt8737 > arg0.anInt4875) {
					break label81;
				}
				if (local71.method9039(1) && local71.method9038()) {
					arg0.anIntArray256 = null;
					local71.method9035(-1);
				}
			}
		}
		for (@Pc(320) int local320 = 0; local320 < arg0.aClass104_Sub2_Sub1Array3.length; local320++) {
			@Pc(327) Class104_Sub2_Sub1 local327 = arg0.aClass104_Sub2_Sub1Array3[local320];
			if (local327 != null) {
				if (local327.anInt10533 > 0) {
					local327.anInt10533--;
				} else if (local327.method9039(1) && local327.method9038()) {
					arg0.aClass104_Sub2_Sub1Array3[local320] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)V")
	public static void method7395(@OriginalArg(1) int arg0) {
		if (!Static349.method5348()) {
			return;
		}
		if (Static561.anInt9080 != arg0) {
			Static87.aString114 = "";
		}
		Static561.anInt9080 = arg0;
		Static525.aClass260_3.method6400();
		Static307.method4889(5);
	}
}
