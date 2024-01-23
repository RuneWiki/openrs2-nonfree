import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class40 {

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
	public int[] anIntArray75;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public int anInt1245 = 2;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt1246 = 5;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public int anInt1249 = 99;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public int anInt1248 = -1;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt1254 = -1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public int anInt1243 = -1;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	public int anInt1260 = -1;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public int anInt1258 = -1;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "Z")
	public boolean aBoolean62 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZLclient!k;)V")
	private void method931(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		@Pc(20) int local20;
		@Pc(28) int local28;
		@Pc(137) int local137;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local20 = arg1.method3805();
			this.anIntArray76 = new int[local20];
			for (local28 = 0; local28 < local20; local28++) {
				this.anIntArray76[local28] = arg1.method3805();
			}
			this.anIntArray75 = new int[local20];
			for (local137 = 0; local137 < local20; local137++) {
				this.anIntArray75[local137] = arg1.method3805();
			}
			for (local159 = 0; local159 < local20; local159++) {
				this.anIntArray75[local159] += arg1.method3805() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt1248 = arg1.method3805();
		} else if (arg0 == 3) {
			local20 = arg1.method3793();
			this.anIntArray77 = new int[local20 + 1];
			for (local28 = 0; local28 < local20; local28++) {
				this.anIntArray77[local28] = arg1.method3793();
			}
			this.anIntArray77[local20] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean62 = true;
		} else if (arg0 == 5) {
			this.anInt1246 = arg1.method3793();
		} else if (arg0 == 6) {
			this.anInt1243 = arg1.method3805();
		} else if (arg0 == 7) {
			this.anInt1260 = arg1.method3805();
		} else if (arg0 == 8) {
			this.anInt1249 = arg1.method3793();
		} else if (arg0 == 9) {
			this.anInt1254 = arg1.method3793();
		} else if (arg0 == 10) {
			this.anInt1258 = arg1.method3793();
		} else if (arg0 == 11) {
			this.anInt1245 = arg1.method3793();
		} else if (arg0 == 12) {
			local20 = arg1.method3793();
			this.anIntArray78 = new int[local20];
			for (local28 = 0; local28 < local20; local28++) {
				this.anIntArray78[local28] = arg1.method3805();
			}
			for (local137 = 0; local137 < local20; local137++) {
				this.anIntArray78[local137] += arg1.method3805() << 16;
			}
		} else if (arg0 == 13) {
			local20 = arg1.method3805();
			this.anIntArrayArray8 = new int[local20][];
			for (local28 = 0; local28 < local20; local28++) {
				local137 = arg1.method3793();
				if (local137 > 0) {
					this.anIntArrayArray8[local28] = new int[local137];
					this.anIntArrayArray8[local28][0] = arg1.method3806();
					for (local159 = 1; local159 < local137; local159++) {
						this.anIntArrayArray8[local28][local159] = arg1.method3805();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean61 = true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!k;Z)V")
	public void method932(@OriginalArg(0) Class1_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3793();
			if (local9 == 0) {
				return;
			}
			this.method931(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ei;II)Lclient!ei;")
	public Class5_Sub2 method934(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray75[arg1];
		@Pc(14) Class1_Sub2_Sub14 local14 = Static71.method1262(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method2931(true, true);
		}
		@Pc(33) Class1_Sub2_Sub14 local33 = null;
		@Pc(35) int local35 = 0;
		if (this.anIntArray78 != null && arg1 < this.anIntArray78.length) {
			local35 = this.anIntArray78[arg1];
			local33 = Static71.method1262(local35 >> 16);
			local35 &= 0xFFFF;
		}
		@Pc(84) Class5_Sub2 local84;
		if (local33 == null || local35 == 65535) {
			local84 = arg0.method2931(!local14.method2867(local18), !this.aBoolean61);
			local84.method2926(local14, local18, this.aBoolean61);
			return local84;
		} else {
			local84 = arg0.method2931(!local14.method2867(local18) & !local33.method2867(local35), !this.aBoolean61);
			local84.method2926(local14, local18, this.aBoolean61);
			local84.method2926(local33, local35, this.aBoolean61);
			return local84;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!fc;Lclient!ei;B)Lclient!ei;")
	public Class5_Sub2 method935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class5_Sub2 arg3) {
		@Pc(8) int local8 = this.anIntArray75[arg1];
		@Pc(20) Class1_Sub2_Sub14 local20 = Static71.method1262(local8 >> 16);
		@Pc(24) int local24 = local8 & 0xFFFF;
		if (local20 == null) {
			return arg2.method940(arg0, arg3);
		}
		@Pc(37) int local37 = arg2.anIntArray75[arg0];
		@Pc(43) Class1_Sub2_Sub14 local43 = Static71.method1262(local37 >> 16);
		@Pc(47) int local47 = local37 & 0xFFFF;
		@Pc(68) Class5_Sub2 local68;
		if (local43 == null) {
			local68 = arg3.method2931(!local20.method2867(local24), !this.aBoolean61);
			local68.method2926(local20, local24, this.aBoolean61);
			return local68;
		} else {
			local68 = arg3.method2931(!local20.method2867(local24) & !local43.method2867(local47), !arg2.aBoolean61 & !this.aBoolean61);
			local68.method2929(local20, local24, local43, local47, this.anIntArray77, this.aBoolean61 | arg2.aBoolean61);
			return local68;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZILclient!ei;)Lclient!ei;")
	public Class5_Sub2 method937(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub2 arg1) {
		@Pc(4) int local4 = this.anIntArray75[arg0];
		@Pc(10) Class1_Sub2_Sub14 local10 = Static71.method1262(local4 >> 16);
		@Pc(26) int local26 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method2916(true, true);
		} else {
			@Pc(50) Class5_Sub2 local50 = arg1.method2916(!local10.method2867(local26), !this.aBoolean61);
			local50.method2926(local10, local26, this.aBoolean61);
			return local50;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ei;IB)Lclient!ei;")
	public Class5_Sub2 method939(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = this.anIntArray75[arg2];
		@Pc(16) Class1_Sub2_Sub14 local16 = Static71.method1262(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method2931(true, true);
		}
		@Pc(31) int local31 = arg0 & 0x3;
		@Pc(55) Class5_Sub2 local55 = arg1.method2931(!local16.method2867(local20), !this.aBoolean61);
		if (local31 == 1) {
			local55.method2924();
		} else if (local31 == 2) {
			local55.method2921();
		} else if (local31 == 3) {
			local55.method2928();
		}
		local55.method2926(local16, local20, this.aBoolean61);
		if (local31 == 1) {
			local55.method2928();
		} else if (local31 == 2) {
			local55.method2921();
		} else if (local31 == 3) {
			local55.method2924();
		}
		return local55;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILclient!ei;)Lclient!ei;")
	public Class5_Sub2 method940(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2 arg1) {
		@Pc(4) int local4 = this.anIntArray75[arg0];
		@Pc(14) Class1_Sub2_Sub14 local14 = Static71.method1262(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method2931(true, true);
		} else {
			@Pc(52) Class5_Sub2 local52 = arg1.method2931(!local14.method2867(local18), !this.aBoolean61);
			local52.method2926(local14, local18, this.aBoolean61);
			return local52;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public void method943() {
		if (this.anInt1254 == -1) {
			if (this.anIntArray77 == null) {
				this.anInt1254 = 0;
			} else {
				this.anInt1254 = 2;
			}
		}
		if (this.anInt1258 != -1) {
			return;
		}
		if (this.anIntArray77 == null) {
			this.anInt1258 = 0;
		} else {
			this.anInt1258 = 2;
		}
	}
}
