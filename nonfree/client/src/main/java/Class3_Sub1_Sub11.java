import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!oe", name = "wb", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!oe", name = "xb", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
	public int anInt2015 = 99;

	@OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
	public int anInt2016 = -1;

	@OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
	public int anInt2014 = -1;

	@OriginalMember(owner = "client!oe", name = "pb", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
	public int anInt2013 = -1;

	@OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
	public int anInt2018 = -1;

	@OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
	public int anInt2005 = 2;

	@OriginalMember(owner = "client!oe", name = "W", descriptor = "I")
	public int anInt2008 = 5;

	@OriginalMember(owner = "client!oe", name = "tb", descriptor = "I")
	public int anInt2024 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!kd;)V")
	public void method1216(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1803();
			if (local9 == 0) {
				return;
			}
			this.method1221(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZLclient!lb;)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub3_Sub3 arg2) {
		@Pc(6) int local6 = this.anIntArray232[arg0];
		@Pc(16) Class3_Sub1_Sub16 local16 = Static24.method504(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg2.method950(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(41) Class3_Sub1_Sub3_Sub3 local41 = arg2.method950(!local16.method1650(local20));
		if (local30 == 1) {
			local41.method971();
		} else if (local30 == 2) {
			local41.method966();
		} else if (local30 == 3) {
			local41.method960();
		}
		local41.method944(local16, local20);
		if (local30 == 1) {
			local41.method960();
		} else if (local30 == 2) {
			local41.method966();
		} else if (local30 == 3) {
			local41.method971();
		}
		return local41;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!lb;II)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1219(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anIntArray232[arg1];
		@Pc(22) Class3_Sub1_Sub16 local22 = Static24.method504(local16 >> 16);
		@Pc(26) int local26 = local16 & 0xFFFF;
		if (local22 == null) {
			return arg0.method951(true);
		} else {
			@Pc(43) Class3_Sub1_Sub3_Sub3 local43 = arg0.method951(!local22.method1650(local26));
			local43.method944(local22, local26);
			return local43;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!kd;BI)V")
	private void method1221(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(92) int local92;
		@Pc(98) int local98;
		@Pc(117) int local117;
		if (arg1 == 1) {
			local92 = arg0.method1803();
			this.anIntArray231 = new int[local92];
			for (local98 = 0; local98 < local92; local98++) {
				this.anIntArray231[local98] = arg0.method1789();
			}
			this.anIntArray232 = new int[local92];
			for (local117 = 0; local117 < local92; local117++) {
				this.anIntArray232[local117] = arg0.method1789();
			}
			for (@Pc(280) int local280 = 0; local280 < local92; local280++) {
				this.anIntArray232[local280] = (arg0.method1789() << 16) + this.anIntArray232[local280];
			}
		} else if (arg1 == 2) {
			this.anInt2016 = arg0.method1789();
		} else if (arg1 == 3) {
			local92 = arg0.method1803();
			this.anIntArray233 = new int[local92 + 1];
			for (local98 = 0; local98 < local92; local98++) {
				this.anIntArray233[local98] = arg0.method1803();
			}
			this.anIntArray233[local92] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean117 = true;
		} else if (arg1 == 5) {
			this.anInt2008 = arg0.method1803();
		} else if (arg1 == 6) {
			this.anInt2013 = arg0.method1789();
		} else if (arg1 == 7) {
			this.anInt2024 = arg0.method1789();
		} else if (arg1 == 8) {
			this.anInt2015 = arg0.method1803();
		} else if (arg1 == 9) {
			this.anInt2018 = arg0.method1803();
		} else if (arg1 == 10) {
			this.anInt2014 = arg0.method1803();
		} else if (arg1 == 11) {
			this.anInt2005 = arg0.method1803();
		} else if (arg1 == 12) {
			local92 = arg0.method1803();
			this.anIntArray230 = new int[local92];
			for (local98 = 0; local98 < local92; local98++) {
				this.anIntArray230[local98] = arg0.method1789();
			}
			for (local117 = 0; local117 < local92; local117++) {
				this.anIntArray230[local117] = (arg0.method1789() << 16) + this.anIntArray230[local117];
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!lb;IB)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1223(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray232[arg1];
		@Pc(14) Class3_Sub1_Sub16 local14 = Static24.method504(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method950(true);
		}
		@Pc(26) Class3_Sub1_Sub16 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray230 != null && this.anIntArray230.length > arg1) {
			local28 = this.anIntArray230[arg1];
			local26 = Static24.method504(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(67) Class3_Sub1_Sub3_Sub3 local67;
		if (local26 == null || local28 == 65535) {
			local67 = arg0.method950(!local14.method1650(local18));
			local67.method944(local14, local18);
			return local67;
		} else {
			local67 = arg0.method950(!local14.method1650(local18) & !local26.method1650(local28));
			local67.method944(local14, local18);
			local67.method944(local26, local28);
			return local67;
		}
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)V")
	public void method1224() {
		if (this.anInt2014 == -1) {
			if (this.anIntArray233 == null) {
				this.anInt2014 = 0;
			} else {
				this.anInt2014 = 2;
			}
		}
		if (this.anInt2018 != -1) {
			return;
		}
		if (this.anIntArray233 == null) {
			this.anInt2018 = 0;
		} else {
			this.anInt2018 = 2;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!oe;Lclient!lb;I)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub11 arg2, @OriginalArg(3) Class3_Sub1_Sub3_Sub3 arg3) {
		@Pc(8) int local8 = this.anIntArray232[arg0];
		@Pc(14) Class3_Sub1_Sub16 local14 = Static24.method504(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method1228(arg3, arg1);
		}
		@Pc(39) int local39 = arg2.anIntArray232[arg1];
		@Pc(45) Class3_Sub1_Sub16 local45 = Static24.method504(local39 >> 16);
		@Pc(49) int local49 = local39 & 0xFFFF;
		@Pc(62) Class3_Sub1_Sub3_Sub3 local62;
		if (local45 == null) {
			local62 = arg3.method950(!local14.method1650(local18));
			local62.method944(local14, local18);
			return local62;
		} else {
			local62 = arg3.method950(!local14.method1650(local18) & !local45.method1650(local49));
			local62.method952(local14, local18, local45, local49, this.anIntArray233);
			return local62;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!lb;BI)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1228(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anIntArray232[arg1];
		@Pc(22) Class3_Sub1_Sub16 local22 = Static24.method504(local16 >> 16);
		@Pc(26) int local26 = local16 & 0xFFFF;
		if (local22 == null) {
			return arg0.method950(true);
		} else {
			@Pc(43) Class3_Sub1_Sub3_Sub3 local43 = arg0.method950(!local22.method1650(local26));
			local43.method944(local22, local26);
			return local43;
		}
	}
}
