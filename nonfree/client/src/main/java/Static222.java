import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	public static void method3876() {
		Static111.aClass198_20.method5236();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V")
	public static void method3877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub7_Sub11 local8 = Static116.method2029(arg0, 10);
		local8.method2509();
		local8.anInt3054 = arg3;
		local8.anInt3053 = arg1;
		local8.anInt3057 = arg2;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
	public static void method3878(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static72.method1115();
		} else if (arg0 == 2) {
			Static11.method175();
		} else if (arg0 == 3) {
			Static257.method4354();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIILclient!sj;I)V")
	public static void method3879(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class181 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt5704;
		if (arg2.lb == 0) {
			arg2.anInt5704 = arg2.anInt5723;
		} else if (arg2.lb == 1) {
			arg2.anInt5704 = arg3 - arg2.anInt5723;
		} else if (arg2.lb == 2) {
			arg2.anInt5704 = arg2.anInt5723 * arg3 >> 14;
		} else if (arg2.lb == 3) {
			if (arg2.anInt5715 == 2) {
				arg2.anInt5704 = arg2.anInt5723 * 32 + arg2.anInt5697 * (arg2.anInt5723 - 1);
			} else if (arg2.anInt5715 == 7) {
				arg2.anInt5704 = arg2.anInt5697 * (arg2.anInt5723 - 1) + arg2.anInt5723 * 115;
			}
		}
		@Pc(99) int local99 = arg2.anInt5721;
		if (arg2.aByte67 == 0) {
			arg2.anInt5721 = arg2.anInt5773;
		} else if (arg2.aByte67 == 1) {
			arg2.anInt5721 = arg1 - arg2.anInt5773;
		} else if (arg2.aByte67 == 2) {
			arg2.anInt5721 = arg2.anInt5773 * arg1 >> 14;
		} else if (arg2.aByte67 == 3) {
			if (arg2.anInt5715 == 2) {
				arg2.anInt5721 = arg2.anInt5773 * 32 + (arg2.anInt5773 - 1) * arg2.anInt5775;
			} else if (arg2.anInt5715 == 7) {
				arg2.anInt5721 = (arg2.anInt5773 - 1) * arg2.anInt5775 + arg2.anInt5773 * 12;
			}
		}
		if (arg2.lb == 4) {
			arg2.anInt5704 = arg2.anInt5721 * arg2.anInt5758 / arg2.anInt5705;
		}
		if (arg2.aByte67 == 4) {
			arg2.anInt5721 = arg2.anInt5705 * arg2.anInt5704 / arg2.anInt5758;
		}
		if (Static212.aBoolean98 && (Static47.method819(arg2).anInt1455 != 0 || arg2.anInt5715 == 0)) {
			if (arg2.anInt5721 < 5 && arg2.anInt5704 < 5) {
				arg2.anInt5721 = 5;
				arg2.anInt5704 = 5;
			} else {
				if (arg2.anInt5704 <= 0) {
					arg2.anInt5704 = 5;
				}
				if (arg2.anInt5721 <= 0) {
					arg2.anInt5721 = 5;
				}
			}
		}
		if (arg2.anInt5755 == 1337) {
			Static88.aClass181_14 = arg2;
		}
		if (arg0 && arg2.anObjectArray28 != null && (arg2.anInt5704 != local8 || arg2.anInt5721 != local99)) {
			@Pc(290) Class3_Sub41 local290 = new Class3_Sub41();
			local290.aClass181_54 = arg2;
			local290.anObjectArray34 = arg2.anObjectArray28;
			Static160.aClass127_16.method3387(local290);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!ro;)V")
	public static void method3880(@OriginalArg(0) Class5_Sub4 arg0) {
		for (@Pc(2) int local2 = arg0.aShort86; local2 <= arg0.aShort89; local2++) {
			for (@Pc(6) int local6 = arg0.aShort87; local6 <= arg0.aShort88; local6++) {
				@Pc(16) Class45 local16 = Static256.aClass45ArrayArrayArray2[arg0.aByte69][local2][local6];
				if (local16 != null) {
					@Pc(21) Class160 local21 = local16.aClass160_1;
					@Pc(23) Class160 local23 = null;
					while (local21 != null) {
						if (local21.aClass5_Sub4_1 == arg0) {
							if (local23 == null) {
								local16.aClass160_1 = local21.aClass160_3;
							} else {
								local23.aClass160_3 = local21.aClass160_3;
							}
							local21.method4146();
							break;
						}
						local23 = local21;
						local21 = local21.aClass160_3;
					}
					local16.aByte8 = 0;
					for (@Pc(56) Class160 local56 = local16.aClass160_1; local56 != null; local56 = local56.aClass160_3) {
						local16.aByte8 = (byte) (local16.aByte8 | local56.anInt4807);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)V")
	public static void method3881(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub7_Sub3 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class22 local8 = Static355.aClass22Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static116.anInt2499; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static103.anInt2156; local15++) {
						local1 = local8.method4665(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class22 local41 = Static355.aClass22Array3[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method4672(local15, local12) - local41.method4672(local15, local12);
									@Pc(67) int local67 = local8.method4672(local15 + 1, local12) - local41.method4672(local15 + 1, local12);
									@Pc(85) int local85 = local8.method4672(local15 + 1, local12 + 1) - local41.method4672(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method4672(local15, local12 + 1) - local41.method4672(local15, local12 + 1);
									local41.method4676(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}
}
