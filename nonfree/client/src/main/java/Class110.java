import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class110 {

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "[I")
	public int[] anIntArray460;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "[I")
	private int[] anIntArray461;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	public int anInt4005 = -1;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	public int anInt4003 = 99;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	public int anInt4008 = -1;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
	public int anInt4012 = 5;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
	public int anInt4013 = -1;

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
	public int anInt4015 = -1;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	public int anInt4014 = 2;

	@OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
	public int anInt4010 = -1;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!ra;)Lclient!ra;")
	public Class20_Sub5 method3182(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub5 arg1) {
		@Pc(4) int local4 = this.anIntArray458[arg0];
		@Pc(10) Class1_Sub1_Sub15 local10 = Static16.method229(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method1705(true, true);
		} else {
			@Pc(48) Class20_Sub5 local48 = arg1.method1705(!local10.method2744(local18), !this.aBoolean188);
			local48.method1699(local10, local18, this.aBoolean188);
			return local48;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ra;Lclient!tc;III)Lclient!ra;")
	public Class20_Sub5 method3183(@OriginalArg(0) Class20_Sub5 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = this.anIntArray458[arg2];
		@Pc(20) Class1_Sub1_Sub15 local20 = Static16.method229(local14 >> 16);
		@Pc(24) int local24 = local14 & 0xFFFF;
		if (local20 == null) {
			return arg1.method3182(arg3, arg0);
		}
		@Pc(37) int local37 = arg1.anIntArray458[arg3];
		@Pc(45) Class1_Sub1_Sub15 local45 = Static16.method229(local37 >> 16);
		@Pc(49) int local49 = local37 & 0xFFFF;
		@Pc(70) Class20_Sub5 local70;
		if (local45 == null) {
			local70 = arg0.method1705(!local20.method2744(local24), !this.aBoolean188);
			local70.method1699(local20, local24, this.aBoolean188);
			return local70;
		} else {
			local70 = arg0.method1705(!local20.method2744(local24) & !local45.method2744(local49), !this.aBoolean188 & !arg1.aBoolean188);
			local70.method1695(local20, local24, local45, local49, this.anIntArray461, arg1.aBoolean188 | this.aBoolean188);
			return local70;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!pg;I)V")
	public void method3184(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2142();
			if (local5 == 0) {
				return;
			}
			this.method3185(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!pg;II)V")
	private void method3185(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(48) int local48;
		@Pc(63) int local63;
		if (arg1 == 1) {
			local19 = arg0.method2178();
			this.anIntArray460 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray460[local25] = arg0.method2178();
			}
			this.anIntArray458 = new int[local19];
			for (local48 = 0; local48 < local19; local48++) {
				this.anIntArray458[local48] = arg0.method2178();
			}
			for (local63 = 0; local63 < local19; local63++) {
				this.anIntArray458[local63] += arg0.method2178() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt4010 = arg0.method2178();
		} else if (arg1 == 3) {
			local19 = arg0.method2142();
			this.anIntArray461 = new int[local19 + 1];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray461[local25] = arg0.method2142();
			}
			this.anIntArray461[local19] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean187 = true;
		} else if (arg1 == 5) {
			this.anInt4012 = arg0.method2142();
		} else if (arg1 == 6) {
			this.anInt4015 = arg0.method2178();
		} else if (arg1 == 7) {
			this.anInt4008 = arg0.method2178();
		} else if (arg1 == 8) {
			this.anInt4003 = arg0.method2142();
		} else if (arg1 == 9) {
			this.anInt4013 = arg0.method2142();
		} else if (arg1 == 10) {
			this.anInt4005 = arg0.method2142();
		} else if (arg1 == 11) {
			this.anInt4014 = arg0.method2142();
		} else if (arg1 == 12) {
			local19 = arg0.method2142();
			this.anIntArray459 = new int[local19];
			for (local25 = 0; local25 < local19; local25++) {
				this.anIntArray459[local25] = arg0.method2178();
			}
			for (local48 = 0; local48 < local19; local48++) {
				this.anIntArray459[local48] = (arg0.method2178() << 16) + this.anIntArray459[local48];
			}
		} else if (arg1 == 13) {
			local19 = arg0.method2178();
			this.anIntArrayArray30 = new int[local19][];
			for (local25 = 0; local25 < local19; local25++) {
				local48 = arg0.method2142();
				if (local48 > 0) {
					this.anIntArrayArray30[local25] = new int[local48];
					this.anIntArrayArray30[local25][0] = arg0.method2135();
					for (local63 = 1; local63 < local48; local63++) {
						this.anIntArrayArray30[local25][local63] = arg0.method2178();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean188 = true;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!ra;I)Lclient!ra;")
	public Class20_Sub5 method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20_Sub5 arg2) {
		@Pc(10) int local10 = this.anIntArray458[arg1];
		@Pc(16) Class1_Sub1_Sub15 local16 = Static16.method229(local10 >> 16);
		@Pc(31) int local31 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg2.method1705(true, true);
		}
		@Pc(42) int local42 = arg0 & 0x3;
		@Pc(59) Class20_Sub5 local59 = arg2.method1705(!local16.method2744(local31), !this.aBoolean188);
		if (local42 == 1) {
			local59.method1706();
		} else if (local42 == 2) {
			local59.method1692();
		} else if (local42 == 3) {
			local59.method1709();
		}
		local59.method1699(local16, local31, this.aBoolean188);
		if (local42 == 1) {
			local59.method1709();
		} else if (local42 == 2) {
			local59.method1692();
		} else if (local42 == 3) {
			local59.method1706();
		}
		return local59;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ra;BI)Lclient!ra;")
	public Class20_Sub5 method3188(@OriginalArg(0) Class20_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray458[arg1];
		@Pc(14) Class1_Sub1_Sub15 local14 = Static16.method229(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1708(true, true);
		} else {
			@Pc(48) Class20_Sub5 local48 = arg0.method1708(!local14.method2744(local18), !this.aBoolean188);
			local48.method1699(local14, local18, this.aBoolean188);
			return local48;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public void method3189() {
		if (this.anInt4005 == -1) {
			if (this.anIntArray461 == null) {
				this.anInt4005 = 0;
			} else {
				this.anInt4005 = 2;
			}
		}
		if (this.anInt4013 != -1) {
			return;
		}
		if (this.anIntArray461 == null) {
			this.anInt4013 = 0;
		} else {
			this.anInt4013 = 2;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IILclient!ra;)Lclient!ra;")
	public Class20_Sub5 method3191(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub5 arg1) {
		@Pc(4) int local4 = this.anIntArray458[arg0];
		@Pc(10) Class1_Sub1_Sub15 local10 = Static16.method229(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method1705(true, true);
		}
		@Pc(27) int local27 = 0;
		@Pc(29) Class1_Sub1_Sub15 local29 = null;
		if (this.anIntArray459 != null && this.anIntArray459.length > arg0) {
			local27 = this.anIntArray459[arg0];
			local29 = Static16.method229(local27 >> 16);
			local27 &= 0xFFFF;
		}
		@Pc(78) Class20_Sub5 local78;
		if (local29 == null || local27 == 65535) {
			local78 = arg1.method1705(!local10.method2744(local18), !this.aBoolean188);
			local78.method1699(local10, local18, this.aBoolean188);
			return local78;
		} else {
			local78 = arg1.method1705(!local10.method2744(local18) & !local29.method2744(local27), !this.aBoolean188);
			local78.method1699(local10, local18, this.aBoolean188);
			local78.method1699(local29, local27, this.aBoolean188);
			return local78;
		}
	}
}
