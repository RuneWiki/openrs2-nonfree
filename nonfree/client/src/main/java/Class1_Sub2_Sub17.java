import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qe", name = "V", descriptor = "[I")
	public int[] anIntArray406;

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "[I")
	private int[] anIntArray407;

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!qe", name = "mb", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!qe", name = "rb", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	public int anInt2337 = -1;

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
	public int anInt2351 = 99;

	@OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
	public int anInt2348 = -1;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	public int anInt2338 = 2;

	@OriginalMember(owner = "client!qe", name = "ob", descriptor = "I")
	public int anInt2355 = -1;

	@OriginalMember(owner = "client!qe", name = "tb", descriptor = "I")
	public int anInt2358 = -1;

	@OriginalMember(owner = "client!qe", name = "vb", descriptor = "Z")
	public boolean aBoolean108 = false;

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
	public int anInt2354 = -1;

	@OriginalMember(owner = "client!qe", name = "qb", descriptor = "I")
	public int anInt2356 = 5;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
	public void method1669() {
		if (this.anInt2358 == -1) {
			if (this.anIntArray408 == null) {
				this.anInt2358 = 0;
			} else {
				this.anInt2358 = 2;
			}
		}
		if (this.anInt2354 != -1) {
			return;
		}
		if (this.anIntArray408 == null) {
			this.anInt2354 = 0;
		} else {
			this.anInt2354 = 2;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!da;Lclient!qe;III)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1672(@OriginalArg(0) Class1_Sub2_Sub3_Sub2 arg0, @OriginalArg(1) Class1_Sub2_Sub17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray410[arg3];
		@Pc(10) Class1_Sub2_Sub10 local10 = Static15.method358(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method1675(arg2, arg0);
		}
		@Pc(31) int local31 = arg1.anIntArray410[arg2];
		@Pc(37) Class1_Sub2_Sub10 local37 = Static15.method358(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class1_Sub2_Sub3_Sub2 local54;
		if (local37 == null) {
			local54 = arg0.method481(!local10.method1010(local18));
			local54.method464(local10, local18);
			return local54;
		} else {
			local54 = arg0.method481(!local10.method1010(local18) & !local37.method1010(local41));
			local54.method461(local10, local18, local37, local41, this.anIntArray408);
			return local54;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLclient!dc;)V")
	private void method1674(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(33) int local33;
		if (arg0 == 1) {
			local8 = arg1.method651();
			this.anIntArray406 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray406[local14] = arg1.method651();
			}
			this.anIntArray410 = new int[local8];
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray410[local33] = arg1.method651();
			}
			for (@Pc(48) int local48 = 0; local48 < local8; local48++) {
				this.anIntArray410[local48] += arg1.method651() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt2348 = arg1.method651();
		} else if (arg0 == 3) {
			local8 = arg1.method672();
			this.anIntArray408 = new int[local8 + 1];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray408[local14] = arg1.method672();
			}
			this.anIntArray408[local8] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean108 = true;
		} else if (arg0 == 5) {
			this.anInt2356 = arg1.method672();
		} else if (arg0 == 6) {
			this.anInt2355 = arg1.method651();
		} else if (arg0 == 7) {
			this.anInt2337 = arg1.method651();
		} else if (arg0 == 8) {
			this.anInt2351 = arg1.method672();
		} else if (arg0 == 9) {
			this.anInt2354 = arg1.method672();
		} else if (arg0 == 10) {
			this.anInt2358 = arg1.method672();
		} else if (arg0 == 11) {
			this.anInt2338 = arg1.method672();
		} else if (arg0 == 12) {
			local8 = arg1.method672();
			this.anIntArray407 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray407[local14] = arg1.method651();
			}
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray407[local33] = (arg1.method651() << 16) + this.anIntArray407[local33];
			}
		} else if (arg0 == 13) {
			local8 = arg1.method672();
			this.anIntArray409 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray409[local14] = arg1.method660();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!da;)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1675(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub3_Sub2 arg1) {
		@Pc(9) int local9 = this.anIntArray410[arg0];
		@Pc(19) Class1_Sub2_Sub10 local19 = Static15.method358(local9 >> 16);
		@Pc(23) int local23 = local9 & 0xFFFF;
		if (local19 == null) {
			return arg1.method481(true);
		} else {
			@Pc(40) Class1_Sub2_Sub3_Sub2 local40 = arg1.method481(!local19.method1010(local23));
			local40.method464(local19, local23);
			return local40;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!da;I)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1676(@OriginalArg(1) Class1_Sub2_Sub3_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray410[arg1];
		@Pc(14) Class1_Sub2_Sub10 local14 = Static15.method358(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method481(true);
		}
		@Pc(26) Class1_Sub2_Sub10 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray407 != null && this.anIntArray407.length > arg1) {
			local28 = this.anIntArray407[arg1];
			local26 = Static15.method358(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(69) Class1_Sub2_Sub3_Sub2 local69;
		if (local26 == null || local28 == 65535) {
			local69 = arg0.method481(!local14.method1010(local18));
			local69.method464(local14, local18);
			return local69;
		} else {
			local69 = arg0.method481(!local14.method1010(local18) & !local26.method1010(local28));
			local69.method464(local14, local18);
			local69.method464(local26, local28);
			return local69;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method1678(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method672();
			if (local13 == 0) {
				return;
			}
			this.method1674(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBILclient!da;)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub3_Sub2 arg2) {
		@Pc(6) int local6 = this.anIntArray410[arg1];
		@Pc(22) Class1_Sub2_Sub10 local22 = Static15.method358(local6 >> 16);
		@Pc(26) int local26 = local6 & 0xFFFF;
		if (local22 == null) {
			return arg2.method481(true);
		}
		@Pc(36) int local36 = arg0 & 0x3;
		@Pc(47) Class1_Sub2_Sub3_Sub2 local47 = arg2.method481(!local22.method1010(local26));
		if (local36 == 1) {
			local47.method466();
		} else if (local36 == 2) {
			local47.method480();
		} else if (local36 == 3) {
			local47.method467();
		}
		local47.method464(local22, local26);
		if (local36 == 1) {
			local47.method467();
		} else if (local36 == 2) {
			local47.method480();
		} else if (local36 == 3) {
			local47.method466();
		}
		return local47;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLclient!da;)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1680(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub3_Sub2 arg1) {
		@Pc(4) int local4 = this.anIntArray410[arg0];
		@Pc(14) Class1_Sub2_Sub10 local14 = Static15.method358(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method463(true);
		} else {
			@Pc(44) Class1_Sub2_Sub3_Sub2 local44 = arg1.method463(!local14.method1010(local18));
			local44.method464(local14, local18);
			return local44;
		}
	}
}
