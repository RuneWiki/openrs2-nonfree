import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "[I")
	public static final int[] anIntArray396 = new int[32];

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "[I")
	public int[] anIntArray389;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "[I")
	public int[] anIntArray392;

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "[I")
	private int[] anIntArray393;

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "[I")
	private int[] anIntArray394;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	public int anInt4368 = -1;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	public int anInt4364 = -1;

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
	public int anInt4371 = -1;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	public int anInt4366 = -1;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
	public int anInt4372 = 5;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
	public int anInt4367 = -1;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
	public int anInt4373 = 2;

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	public int anInt4370 = 99;

	static {
		@Pc(45) int local45 = 2;
		for (@Pc(47) int local47 = 0; local47 < 32; local47++) {
			anIntArray396[local47] = local45 - 1;
			local45 += local45;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ug;IB)Lclient!ug;")
	public Class7_Sub7 method3048(@OriginalArg(0) Class7_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray392[arg1];
		@Pc(14) Class2_Sub1_Sub24 local14 = Static133.method2036(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method3156(true);
		} else {
			@Pc(43) Class7_Sub7 local43 = arg0.method3156(!local14.method2775(local18));
			local43.method3160(local14, local18);
			return local43;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!kd;I)V")
	private void method3049(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(146) int local146;
		if (arg1 == 1) {
			local22 = arg0.method1557();
			this.anIntArray389 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray389[local30] = arg0.method1557();
			}
			this.anIntArray392 = new int[local22];
			for (local146 = 0; local146 < local22; local146++) {
				this.anIntArray392[local146] = arg0.method1557();
			}
			for (@Pc(296) int local296 = 0; local296 < local22; local296++) {
				this.anIntArray392[local296] = (arg0.method1557() << 16) + this.anIntArray392[local296];
			}
		} else if (arg1 == 2) {
			this.anInt4368 = arg0.method1557();
		} else if (arg1 == 3) {
			local22 = arg0.method1534();
			this.anIntArray393 = new int[local22 + 1];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray393[local30] = arg0.method1534();
			}
			this.anIntArray393[local22] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean188 = true;
		} else if (arg1 == 5) {
			this.anInt4372 = arg0.method1534();
		} else if (arg1 == 6) {
			this.anInt4364 = arg0.method1557();
		} else if (arg1 == 7) {
			this.anInt4366 = arg0.method1557();
		} else if (arg1 == 8) {
			this.anInt4370 = arg0.method1534();
		} else if (arg1 == 9) {
			this.anInt4367 = arg0.method1534();
		} else if (arg1 == 10) {
			this.anInt4371 = arg0.method1534();
		} else if (arg1 == 11) {
			this.anInt4373 = arg0.method1534();
		} else if (arg1 == 12) {
			local22 = arg0.method1534();
			this.anIntArray394 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray394[local30] = arg0.method1557();
			}
			for (local146 = 0; local146 < local22; local146++) {
				this.anIntArray394[local146] = (arg0.method1557() << 16) + this.anIntArray394[local146];
			}
		} else if (arg1 == 13) {
			local22 = arg0.method1534();
			this.anIntArray390 = new int[local22];
			for (local30 = 0; local30 < local22; local30++) {
				this.anIntArray390[local30] = arg0.method1536();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!ug;Lclient!wb;BI)Lclient!ug;")
	public Class7_Sub7 method3050(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub7 arg1, @OriginalArg(2) Class2_Sub1_Sub25 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray392[arg0];
		@Pc(14) Class2_Sub1_Sub24 local14 = Static133.method2036(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg2.method3048(arg1, arg3);
		}
		@Pc(31) int local31 = arg2.anIntArray392[arg3];
		@Pc(37) Class2_Sub1_Sub24 local37 = Static133.method2036(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class7_Sub7 local54;
		if (local37 == null) {
			local54 = arg1.method3156(!local14.method2775(local18));
			local54.method3160(local14, local18);
			return local54;
		} else {
			local54 = arg1.method3156(!local14.method2775(local18) & !local37.method2775(local41));
			local54.method3159(local14, local18, local37, local41, this.anIntArray393);
			return local54;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!kd;B)V")
	public void method3051(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1534();
			if (local5 == 0) {
				return;
			}
			this.method3049(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V")
	public void method3052() {
		if (this.anInt4367 == -1) {
			if (this.anIntArray393 == null) {
				this.anInt4367 = 0;
			} else {
				this.anInt4367 = 2;
			}
		}
		if (this.anInt4371 != -1) {
			return;
		}
		if (this.anIntArray393 == null) {
			this.anInt4371 = 0;
		} else {
			this.anInt4371 = 2;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ug;II)Lclient!ug;")
	public Class7_Sub7 method3054(@OriginalArg(0) Class7_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray392[arg1];
		@Pc(10) Class2_Sub1_Sub24 local10 = Static133.method2036(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method3164(true);
		} else {
			@Pc(43) Class7_Sub7 local43 = arg0.method3164(!local10.method2775(local14));
			local43.method3160(local10, local14);
			return local43;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILclient!ug;I)Lclient!ug;")
	public Class7_Sub7 method3056(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray392[arg0];
		@Pc(12) Class2_Sub1_Sub24 local12 = Static133.method2036(local6 >> 16);
		@Pc(16) int local16 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg1.method3156(true);
		}
		@Pc(36) int local36 = arg2 & 0x3;
		@Pc(47) Class7_Sub7 local47 = arg1.method3156(!local12.method2775(local16));
		if (local36 == 1) {
			local47.method3163();
		} else if (local36 == 2) {
			local47.method3158();
		} else if (local36 == 3) {
			local47.method3165();
		}
		local47.method3160(local12, local16);
		if (local36 == 1) {
			local47.method3165();
		} else if (local36 == 2) {
			local47.method3158();
		} else if (local36 == 3) {
			local47.method3163();
		}
		return local47;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!ug;II)Lclient!ug;")
	public Class7_Sub7 method3057(@OriginalArg(0) Class7_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray392[arg1];
		@Pc(10) Class2_Sub1_Sub24 local10 = Static133.method2036(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method3156(true);
		}
		@Pc(34) int local34 = 0;
		@Pc(36) Class2_Sub1_Sub24 local36 = null;
		if (this.anIntArray394 != null && arg1 < this.anIntArray394.length) {
			local34 = this.anIntArray394[arg1];
			local36 = Static133.method2036(local34 >> 16);
			local34 &= 0xFFFF;
		}
		@Pc(77) Class7_Sub7 local77;
		if (local36 == null || local34 == 65535) {
			local77 = arg0.method3156(!local10.method2775(local14));
			local77.method3160(local10, local14);
			return local77;
		} else {
			local77 = arg0.method3156(!local10.method2775(local14) & !local36.method2775(local34));
			local77.method3160(local10, local14);
			local77.method3160(local36, local34);
			return local77;
		}
	}
}
