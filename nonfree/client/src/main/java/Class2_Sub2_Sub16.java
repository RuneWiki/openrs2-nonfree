import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!ki", name = "S", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!ki", name = "T", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Z")
	public boolean aBoolean114 = false;

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
	public int anInt2342 = 99;

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
	public int anInt2341 = -1;

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
	public int anInt2338 = -1;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	public int anInt2334 = 2;

	@OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
	public int anInt2345 = -1;

	@OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
	public int anInt2351 = -1;

	@OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
	public int anInt2352 = -1;

	@OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
	public int anInt2355 = 5;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ki;Lclient!gj;IBI)Lclient!gj;")
	public Class24_Sub3 method1760(@OriginalArg(0) Class2_Sub2_Sub16 arg0, @OriginalArg(1) Class24_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray232[arg2];
		@Pc(20) Class2_Sub2_Sub10 local20 = Static138.method2245(local8 >> 16);
		@Pc(24) int local24 = local8 & 0xFFFF;
		if (local20 == null) {
			return arg0.method1765(arg3, arg1);
		}
		@Pc(37) int local37 = arg0.anIntArray232[arg3];
		@Pc(43) Class2_Sub2_Sub10 local43 = Static138.method2245(local37 >> 16);
		@Pc(47) int local47 = local37 & 0xFFFF;
		@Pc(60) Class24_Sub3 local60;
		if (local43 == null) {
			local60 = arg1.method2727(!local20.method1041(local24));
			local60.method2741(local20, local24);
			return local60;
		} else {
			local60 = arg1.method2727(!local20.method1041(local24) & !local43.method1041(local47));
			local60.method2737(local20, local24, local43, local47, this.anIntArray233);
			return local60;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ra;IB)V")
	private void method1762(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(87) int local87;
		@Pc(93) int local93;
		@Pc(137) int local137;
		if (arg1 == 1) {
			local87 = arg0.method269();
			this.anIntArray229 = new int[local87];
			for (local93 = 0; local93 < local87; local93++) {
				this.anIntArray229[local93] = arg0.method269();
			}
			this.anIntArray232 = new int[local87];
			for (local137 = 0; local137 < local87; local137++) {
				this.anIntArray232[local137] = arg0.method269();
			}
			for (@Pc(267) int local267 = 0; local267 < local87; local267++) {
				this.anIntArray232[local267] = (arg0.method269() << 16) + this.anIntArray232[local267];
			}
		} else if (arg1 == 2) {
			this.anInt2341 = arg0.method269();
		} else if (arg1 == 3) {
			local87 = arg0.method260();
			this.anIntArray233 = new int[local87 + 1];
			for (local93 = 0; local93 < local87; local93++) {
				this.anIntArray233[local93] = arg0.method260();
			}
			this.anIntArray233[local87] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean114 = true;
		} else if (arg1 == 5) {
			this.anInt2355 = arg0.method260();
		} else if (arg1 == 6) {
			this.anInt2345 = arg0.method269();
		} else if (arg1 == 7) {
			this.anInt2338 = arg0.method269();
		} else if (arg1 == 8) {
			this.anInt2342 = arg0.method260();
		} else if (arg1 == 9) {
			this.anInt2351 = arg0.method260();
		} else if (arg1 == 10) {
			this.anInt2352 = arg0.method260();
		} else if (arg1 == 11) {
			this.anInt2334 = arg0.method260();
		} else if (arg1 == 12) {
			local87 = arg0.method260();
			this.anIntArray230 = new int[local87];
			for (local93 = 0; local93 < local87; local93++) {
				this.anIntArray230[local93] = arg0.method269();
			}
			for (local137 = 0; local137 < local87; local137++) {
				this.anIntArray230[local137] += arg0.method269() << 16;
			}
		} else if (arg1 == 13) {
			local87 = arg0.method260();
			this.anIntArray231 = new int[local87];
			for (local93 = 0; local93 < local87; local93++) {
				this.anIntArray231[local93] = arg0.method261();
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
	public void method1763() {
		if (this.anInt2352 == -1) {
			if (this.anIntArray233 == null) {
				this.anInt2352 = 0;
			} else {
				this.anInt2352 = 2;
			}
		}
		if (this.anInt2351 != -1) {
			return;
		}
		if (this.anIntArray233 == null) {
			this.anInt2351 = 0;
		} else {
			this.anInt2351 = 2;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BILclient!gj;)Lclient!gj;")
	public Class24_Sub3 method1764(@OriginalArg(1) int arg0, @OriginalArg(2) Class24_Sub3 arg1) {
		@Pc(4) int local4 = this.anIntArray232[arg0];
		@Pc(14) Class2_Sub2_Sub10 local14 = Static138.method2245(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg1.method2727(true);
		}
		@Pc(33) Class2_Sub2_Sub10 local33 = null;
		@Pc(35) int local35 = 0;
		if (this.anIntArray230 != null && arg0 < this.anIntArray230.length) {
			local35 = this.anIntArray230[arg0];
			local33 = Static138.method2245(local35 >> 16);
			local35 &= 0xFFFF;
		}
		@Pc(76) Class24_Sub3 local76;
		if (local33 == null || local35 == 65535) {
			local76 = arg1.method2727(!local14.method1041(local18));
			local76.method2741(local14, local18);
			return local76;
		} else {
			local76 = arg1.method2727(!local14.method1041(local18) & !local33.method1041(local35));
			local76.method2741(local14, local18);
			local76.method2741(local33, local35);
			return local76;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!gj;B)Lclient!gj;")
	public Class24_Sub3 method1765(@OriginalArg(0) int arg0, @OriginalArg(1) Class24_Sub3 arg1) {
		@Pc(8) int local8 = this.anIntArray232[arg0];
		@Pc(14) Class2_Sub2_Sub10 local14 = Static138.method2245(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method2727(true);
		} else {
			@Pc(40) Class24_Sub3 local40 = arg1.method2727(!local14.method1041(local18));
			local40.method2741(local14, local18);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!gj;I)Lclient!gj;")
	public Class24_Sub3 method1767(@OriginalArg(1) int arg0, @OriginalArg(2) Class24_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray232[arg2];
		@Pc(16) Class2_Sub2_Sub10 local16 = Static138.method2245(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method2727(true);
		}
		@Pc(30) int local30 = arg0 & 0x3;
		@Pc(46) Class24_Sub3 local46 = arg1.method2727(!local16.method1041(local20));
		if (local30 == 1) {
			local46.method2729();
		} else if (local30 == 2) {
			local46.method2740();
		} else if (local30 == 3) {
			local46.method2724();
		}
		local46.method2741(local16, local20);
		if (local30 == 1) {
			local46.method2724();
		} else if (local30 == 2) {
			local46.method2740();
		} else if (local30 == 3) {
			local46.method2729();
		}
		return local46;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!ra;)V")
	public void method1769(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method260();
			if (local15 == 0) {
				return;
			}
			this.method1762(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!gj;I)Lclient!gj;")
	public Class24_Sub3 method1770(@OriginalArg(1) Class24_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anIntArray232[arg1];
		@Pc(19) Class2_Sub2_Sub10 local19 = Static138.method2245(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method2725(true);
		} else {
			@Pc(40) Class24_Sub3 local40 = arg0.method2725(!local19.method1041(local23));
			local40.method2741(local19, local23);
			return local40;
		}
	}
}
