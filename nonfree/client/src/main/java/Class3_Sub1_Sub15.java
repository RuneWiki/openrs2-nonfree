import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ri", name = "S", descriptor = "[I")
	public int[] anIntArray439;

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "[I")
	public int[] anIntArray440;

	@OriginalMember(owner = "client!ri", name = "cb", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!ri", name = "hb", descriptor = "[I")
	public int[] anIntArray442;

	@OriginalMember(owner = "client!ri", name = "lb", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
	public int anInt3546 = -1;

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
	public int anInt3549 = -1;

	@OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
	public int anInt3554 = 2;

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
	public int anInt3551 = -1;

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	public int anInt3548 = -1;

	@OriginalMember(owner = "client!ri", name = "fb", descriptor = "I")
	public int anInt3559 = -1;

	@OriginalMember(owner = "client!ri", name = "kb", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!ri", name = "gb", descriptor = "I")
	public int anInt3560 = 99;

	@OriginalMember(owner = "client!ri", name = "jb", descriptor = "I")
	public int anInt3562 = 5;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!vf;B)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method2533(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub3 arg1) {
		@Pc(4) int local4 = this.anIntArray439[arg0];
		@Pc(10) Class3_Sub1_Sub6 local10 = Static11.method202(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method1375(true);
		} else {
			@Pc(37) Class3_Sub1_Sub5_Sub3 local37 = arg1.method1375(!local10.method591(local14));
			local37.method1383(local10, local14);
			return local37;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(ILclient!vf;B)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method2535(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub3 arg1) {
		@Pc(8) int local8 = this.anIntArray439[arg0];
		@Pc(14) Class3_Sub1_Sub6 local14 = Static11.method202(local8 >> 16);
		@Pc(24) int local24 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1371(true);
		} else {
			@Pc(41) Class3_Sub1_Sub5_Sub3 local41 = arg1.method1371(!local14.method591(local24));
			local41.method1383(local14, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!mb;)V")
	public void method2536(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method2107();
			if (local17 == 0) {
				return;
			}
			this.method2537(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!mb;IB)V")
	private void method2537(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(39) int local39;
		if (arg1 == 1) {
			local10 = arg0.method2111();
			this.anIntArray440 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray440[local16] = arg0.method2111();
			}
			this.anIntArray439 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray439[local39] = arg0.method2111();
			}
			for (@Pc(58) int local58 = 0; local58 < local10; local58++) {
				this.anIntArray439[local58] += arg0.method2111() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3549 = arg0.method2111();
		} else if (arg1 == 3) {
			local10 = arg0.method2107();
			this.anIntArray441 = new int[local10 + 1];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray441[local16] = arg0.method2107();
			}
			this.anIntArray441[local10] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean145 = true;
		} else if (arg1 == 5) {
			this.anInt3562 = arg0.method2107();
		} else if (arg1 == 6) {
			this.anInt3548 = arg0.method2111();
		} else if (arg1 == 7) {
			this.anInt3559 = arg0.method2111();
		} else if (arg1 == 8) {
			this.anInt3560 = arg0.method2107();
		} else if (arg1 == 9) {
			this.anInt3546 = arg0.method2107();
		} else if (arg1 == 10) {
			this.anInt3551 = arg0.method2107();
		} else if (arg1 == 11) {
			this.anInt3554 = arg0.method2107();
		} else if (arg1 == 12) {
			local10 = arg0.method2107();
			this.anIntArray443 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray443[local16] = arg0.method2111();
			}
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray443[local39] = (arg0.method2111() << 16) + this.anIntArray443[local39];
			}
		} else if (arg1 == 13) {
			local10 = arg0.method2107();
			this.anIntArray442 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray442[local16] = arg0.method2136();
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!vf;I)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method2540(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub5_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray439[arg2];
		@Pc(18) Class3_Sub1_Sub6 local18 = Static11.method202(local10 >> 16);
		@Pc(22) int local22 = local10 & 0xFFFF;
		if (local18 == null) {
			return arg1.method1371(true);
		}
		@Pc(41) Class3_Sub1_Sub5_Sub3 local41 = arg1.method1371(!local18.method591(local22));
		@Pc(45) int local45 = arg0 & 0x3;
		if (local45 == 1) {
			local41.method1373();
		} else if (local45 == 2) {
			local41.method1380();
		} else if (local45 == 3) {
			local41.method1374();
		}
		local41.method1383(local18, local22);
		if (local45 == 1) {
			local41.method1374();
		} else if (local45 == 2) {
			local41.method1380();
		} else if (local45 == 3) {
			local41.method1373();
		}
		return local41;
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
	public void method2542() {
		if (this.anInt3546 == -1) {
			if (this.anIntArray441 == null) {
				this.anInt3546 = 0;
			} else {
				this.anInt3546 = 2;
			}
		}
		if (this.anInt3551 != -1) {
			return;
		}
		if (this.anIntArray441 == null) {
			this.anInt3551 = 0;
		} else {
			this.anInt3551 = 2;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ri;IBLclient!vf;)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method2543(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub1_Sub5_Sub3 arg3) {
		@Pc(4) int local4 = this.anIntArray439[arg0];
		@Pc(10) Class3_Sub1_Sub6 local10 = Static11.method202(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method2535(arg2, arg3);
		}
		@Pc(31) int local31 = arg1.anIntArray439[arg2];
		@Pc(39) Class3_Sub1_Sub6 local39 = Static11.method202(local31 >> 16);
		@Pc(43) int local43 = local31 & 0xFFFF;
		@Pc(58) Class3_Sub1_Sub5_Sub3 local58;
		if (local39 == null) {
			local58 = arg3.method1371(!local10.method591(local18));
			local58.method1383(local10, local18);
			return local58;
		} else {
			local58 = arg3.method1371(!local10.method591(local18) & !local39.method591(local43));
			local58.method1377(local10, local18, local39, local43, this.anIntArray441);
			return local58;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!vf;II)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method2545(@OriginalArg(0) Class3_Sub1_Sub5_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray439[arg1];
		@Pc(14) Class3_Sub1_Sub6 local14 = Static11.method202(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1371(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class3_Sub1_Sub6 local28 = null;
		if (this.anIntArray443 != null && this.anIntArray443.length > arg1) {
			local26 = this.anIntArray443[arg1];
			local28 = Static11.method202(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(71) Class3_Sub1_Sub5_Sub3 local71;
		if (local28 == null || local26 == 65535) {
			local71 = arg0.method1371(!local14.method591(local18));
			local71.method1383(local14, local18);
			return local71;
		} else {
			local71 = arg0.method1371(!local14.method591(local18) & !local28.method591(local26));
			local71.method1383(local14, local18);
			local71.method1383(local28, local26);
			return local71;
		}
	}
}
