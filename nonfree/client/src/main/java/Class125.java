import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class125 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public int anInt3945;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "[Z")
	public boolean[] aBooleanArray39;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public int anInt3941 = 2;

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	public int anInt3947 = -1;

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public int anInt3944 = 5;

	@OriginalMember(owner = "client!om", name = "p", descriptor = "I")
	public int anInt3953 = 99;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "Z")
	public boolean aBoolean299 = false;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	public int anInt3950 = -1;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "I")
	public int anInt3959 = -1;

	@OriginalMember(owner = "client!om", name = "G", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "I")
	public int anInt3964 = -1;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	public int anInt3946 = -1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BIILclient!q;II)Lclient!q;")
	public Class14_Sub6 method3163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub6 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray356[arg4];
		@Pc(21) int local21 = this.anIntArray357[arg4];
		@Pc(27) Class1_Sub2_Sub10 local27 = Static274.method4179(local21 >> 16);
		@Pc(31) int local31 = local21 & 0xFFFF;
		if (local27 == null) {
			return arg2.method4104(true, true, true);
		}
		@Pc(45) int local45 = arg0 & 0x3;
		@Pc(47) Class1_Sub2_Sub10 local47 = null;
		if ((this.aBoolean298 || Static297.aBoolean453) && arg3 != -1 && arg3 < this.anIntArray357.length) {
			@Pc(66) int local66 = this.anIntArray357[arg3];
			local47 = Static274.method4179(local66 >> 16);
			arg3 = local66 & 0xFFFF;
		}
		@Pc(121) Class14_Sub6 local121;
		if (local47 == null) {
			local121 = arg2.method4104(!local27.method1589(local31), !local27.method1587(local31), !this.aBoolean302);
		} else {
			local121 = arg2.method4104(!local27.method1589(local31) & !local47.method1589(arg3), !local27.method1587(local31) & !local47.method1587(arg3), !this.aBoolean302);
		}
		if (this.aBoolean302 && Static277.aBoolean412) {
			if (local45 == 1) {
				((Class14_Sub6_Sub1) local121).method2479();
			} else if (local45 == 2) {
				((Class14_Sub6_Sub1) local121).method2482();
			} else if (local45 == 3) {
				((Class14_Sub6_Sub1) local121).method2454();
			}
		} else if (local45 == 1) {
			local121.method4106();
		} else if (local45 == 2) {
			local121.method4116();
		} else if (local45 == 3) {
			local121.method4111();
		}
		local121.method4105(local27, local31, local47, arg3, arg1 - 1, local10, this.aBoolean302);
		if (this.aBoolean302 && Static277.aBoolean412) {
			if (local45 == 1) {
				((Class14_Sub6_Sub1) local121).method2454();
			} else if (local45 == 2) {
				((Class14_Sub6_Sub1) local121).method2482();
			} else if (local45 == 3) {
				((Class14_Sub6_Sub1) local121).method2479();
			}
		} else if (local45 == 1) {
			local121.method4111();
		} else if (local45 == 2) {
			local121.method4116();
		} else if (local45 == 3) {
			local121.method4106();
		}
		return local121;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public void method3164() {
		if (this.anInt3959 == -1) {
			if (this.aBooleanArray39 == null) {
				this.anInt3959 = 0;
			} else {
				this.anInt3959 = 2;
			}
		}
		if (this.anInt3964 != -1) {
			return;
		}
		if (this.aBooleanArray39 == null) {
			this.anInt3964 = 0;
		} else {
			this.anInt3964 = 2;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZIILclient!q;)Lclient!q;")
	public Class14_Sub6 method3165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14_Sub6 arg3) {
		@Pc(8) int local8 = this.anIntArray357[arg2];
		@Pc(13) int local13 = this.anIntArray356[arg2];
		@Pc(19) Class1_Sub2_Sub10 local19 = Static274.method4179(local8 >> 16);
		@Pc(23) int local23 = local8 & 0xFFFF;
		if (local19 == null) {
			return arg3.method4104(true, true, true);
		}
		@Pc(34) Class1_Sub2_Sub10 local34 = null;
		if ((this.aBoolean298 || Static297.aBoolean453) && arg0 != -1 && this.anIntArray357.length > arg0) {
			@Pc(54) int local54 = this.anIntArray357[arg0];
			local34 = Static274.method4179(local54 >> 16);
			arg0 = local54 & 0xFFFF;
		}
		@Pc(66) Class1_Sub2_Sub10 local66 = null;
		@Pc(68) Class1_Sub2_Sub10 local68 = null;
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = 0;
		if (this.anIntArray354 != null) {
			if (this.anIntArray354.length > arg2) {
				local70 = this.anIntArray354[arg2];
				if (local70 != 65535) {
					local66 = Static274.method4179(local70 >> 16);
					local70 &= 0xFFFF;
				}
			}
			if ((this.aBoolean298 || Static297.aBoolean453) && arg0 != -1 && arg0 < this.anIntArray354.length) {
				local72 = this.anIntArray354[arg0];
				if (local72 != 65535) {
					local68 = Static274.method4179(local72 >> 16);
					local72 &= 0xFFFF;
				}
			}
		}
		@Pc(149) boolean local149 = !local19.method1589(local23);
		@Pc(158) boolean local158 = !local19.method1587(local23);
		if (local66 != null) {
			local149 &= !local66.method1589(local70);
			local158 &= !local66.method1587(local70);
		}
		if (local34 != null) {
			local149 &= !local34.method1589(arg0);
			local158 &= !local34.method1587(arg0);
		}
		if (local68 != null) {
			local149 &= !local68.method1589(local72);
			local158 &= !local68.method1587(local72);
		}
		@Pc(250) Class14_Sub6 local250 = arg3.method4104(local149, local158, !this.aBoolean302);
		local250.method4105(local19, local23, local34, arg0, arg1 - 1, local13, this.aBoolean302);
		if (local66 != null) {
			local250.method4105(local66, local70, local68, local72, arg1 - 1, local13, this.aBoolean302);
		}
		return local250;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!q;IIZ)Lclient!q;")
	public Class14_Sub6 method3168(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8 = this.anIntArray356[arg2];
		@Pc(13) int local13 = this.anIntArray357[arg2];
		@Pc(19) Class1_Sub2_Sub10 local19 = Static274.method4179(local13 >> 16);
		@Pc(29) int local29 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method4118(true, true, true);
		}
		@Pc(40) Class1_Sub2_Sub10 local40 = null;
		if ((this.aBoolean298 || Static297.aBoolean453) && arg0 != -1 && this.anIntArray357.length > arg0) {
			@Pc(65) int local65 = this.anIntArray357[arg0];
			local40 = Static274.method4179(local65 >> 16);
			arg0 = local65 & 0xFFFF;
		}
		@Pc(120) Class14_Sub6 local120;
		if (local40 == null) {
			local120 = arg1.method4118(!local19.method1589(local29), !local19.method1587(local29), !this.aBoolean302);
		} else {
			local120 = arg1.method4118(!local19.method1589(local29) & !local40.method1589(arg0), !local19.method1587(local29) & !local40.method1587(arg0), !this.aBoolean302);
		}
		local120.method4105(local19, local29, local40, arg0, arg3 - 1, local8, this.aBoolean302);
		return local120;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!q;IIB)Lclient!q;")
	public Class14_Sub6 method3169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = this.anIntArray356[arg4];
		@Pc(15) int local15 = this.anIntArray357[arg4];
		@Pc(21) Class1_Sub2_Sub10 local21 = Static274.method4179(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg2.method4099(true, true, true);
		}
		@Pc(36) Class1_Sub2_Sub10 local36 = null;
		if ((this.aBoolean298 || Static297.aBoolean453) && arg1 != -1 && this.anIntArray357.length > arg1) {
			@Pc(60) int local60 = this.anIntArray357[arg1];
			local36 = Static274.method4179(local60 >> 16);
			arg1 = local60 & 0xFFFF;
		}
		@Pc(106) Class14_Sub6 local106;
		if (local36 == null) {
			local106 = arg2.method4099(!local21.method1589(local25), !local21.method1587(local25), !this.aBoolean302);
		} else {
			local106 = arg2.method4099(!local21.method1589(local25) & !local36.method1589(arg1), !local21.method1587(local25) & !local36.method1587(arg1), !this.aBoolean302);
		}
		@Pc(157) int local157 = arg3 & 0x3;
		if (Static277.aBoolean412 && this.aBoolean302) {
			if (local157 == 1) {
				((Class14_Sub6_Sub1) local106).method2479();
			} else if (local157 == 2) {
				((Class14_Sub6_Sub1) local106).method2482();
			} else if (local157 == 3) {
				((Class14_Sub6_Sub1) local106).method2454();
			}
		} else if (local157 == 1) {
			local106.method4106();
		} else if (local157 == 2) {
			local106.method4116();
		} else if (local157 == 3) {
			local106.method4111();
		}
		local106.method4105(local21, local25, local36, arg1, arg0 - 1, local10, this.aBoolean302);
		if (Static277.aBoolean412 && this.aBoolean302) {
			if (local157 == 1) {
				((Class14_Sub6_Sub1) local106).method2454();
			} else if (local157 == 2) {
				((Class14_Sub6_Sub1) local106).method2482();
			} else if (local157 == 3) {
				((Class14_Sub6_Sub1) local106).method2479();
			}
		} else if (local157 == 1) {
			local106.method4111();
		} else if (local157 == 2) {
			local106.method4116();
		} else if (local157 == 3) {
			local106.method4106();
		}
		return local106;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!cg;II)V")
	private void method3170(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(37) int local37;
		@Pc(39) int local39;
		if (arg1 == 1) {
			local37 = arg0.method2691();
			this.anIntArray356 = new int[local37];
			for (local39 = 0; local39 < local37; local39++) {
				this.anIntArray356[local39] = arg0.method2691();
			}
			this.anIntArray357 = new int[local37];
			for (local39 = 0; local39 < local37; local39++) {
				this.anIntArray357[local39] = arg0.method2691();
			}
			for (local39 = 0; local39 < local37; local39++) {
				this.anIntArray357[local39] += arg0.method2691() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3946 = arg0.method2691();
		} else if (arg1 == 3) {
			this.aBooleanArray39 = new boolean[256];
			local37 = arg0.method2690();
			for (local39 = 0; local39 < local37; local39++) {
				this.aBooleanArray39[arg0.method2690()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean299 = true;
		} else if (arg1 == 5) {
			this.anInt3944 = arg0.method2690();
		} else if (arg1 == 6) {
			this.anInt3950 = arg0.method2691();
		} else if (arg1 == 7) {
			this.anInt3947 = arg0.method2691();
		} else if (arg1 == 8) {
			this.anInt3953 = arg0.method2690();
		} else if (arg1 == 9) {
			this.anInt3964 = arg0.method2690();
		} else if (arg1 == 10) {
			this.anInt3959 = arg0.method2690();
		} else if (arg1 == 11) {
			this.anInt3941 = arg0.method2690();
		} else if (arg1 == 12) {
			local37 = arg0.method2690();
			this.anIntArray354 = new int[local37];
			for (local39 = 0; local39 < local37; local39++) {
				this.anIntArray354[local39] = arg0.method2691();
			}
			for (local39 = 0; local39 < local37; local39++) {
				this.anIntArray354[local39] += arg0.method2691() << 16;
			}
		} else if (arg1 == 13) {
			local37 = arg0.method2691();
			this.anIntArrayArray19 = new int[local37][];
			for (local39 = 0; local39 < local37; local39++) {
				@Pc(235) int local235 = arg0.method2690();
				if (local235 > 0) {
					this.anIntArrayArray19[local39] = new int[local235];
					this.anIntArrayArray19[local39][0] = arg0.method2681();
					for (@Pc(256) int local256 = 1; local256 < local235; local256++) {
						this.anIntArrayArray19[local39][local256] = arg0.method2691();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean302 = true;
		} else if (arg1 == 15) {
			this.aBoolean298 = true;
		} else if (arg1 == 16) {
			this.aBoolean300 = true;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!cg;I)V")
	public void method3173(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2690();
			if (local9 == 0) {
				return;
			}
			this.method3170(arg0, local9);
		}
	}
}
