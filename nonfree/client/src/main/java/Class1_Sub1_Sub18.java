import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "[I")
	public int[] anIntArray599;

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "[I")
	private int[] anIntArray600;

	@OriginalMember(owner = "client!wf", name = "Q", descriptor = "[I")
	public int[] anIntArray601;

	@OriginalMember(owner = "client!wf", name = "V", descriptor = "[I")
	public int[] anIntArray602;

	@OriginalMember(owner = "client!wf", name = "cb", descriptor = "[I")
	private int[] anIntArray603;

	@OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
	public int anInt4297 = 2;

	@OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
	public int anInt4296 = 99;

	@OriginalMember(owner = "client!wf", name = "Z", descriptor = "Z")
	public boolean aBoolean214 = false;

	@OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
	public int anInt4304 = -1;

	@OriginalMember(owner = "client!wf", name = "bb", descriptor = "I")
	public int anInt4301 = -1;

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
	public int anInt4287 = 5;

	@OriginalMember(owner = "client!wf", name = "ab", descriptor = "I")
	public int anInt4300 = -1;

	@OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
	public int anInt4307 = -1;

	@OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
	public int anInt4303 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!w;I)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method3099(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray602[arg0];
		@Pc(16) Class1_Sub1_Sub11 local16 = Static62.method1112(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1083(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(41) Class1_Sub1_Sub1_Sub2 local41 = arg1.method1083(!local16.method1619(local20));
		if (local30 == 1) {
			local41.method1081();
		} else if (local30 == 2) {
			local41.method1070();
		} else if (local30 == 3) {
			local41.method1074();
		}
		local41.method1077(local16, local20);
		if (local30 == 1) {
			local41.method1074();
		} else if (local30 == 2) {
			local41.method1070();
		} else if (local30 == 3) {
			local41.method1081();
		}
		return local41;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!w;BI)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method3100(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray602[arg1];
		@Pc(14) Class1_Sub1_Sub11 local14 = Static62.method1112(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1083(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class1_Sub1_Sub11 local28 = null;
		if (this.anIntArray600 != null && arg1 < this.anIntArray600.length) {
			local26 = this.anIntArray600[arg1];
			local28 = Static62.method1112(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(71) Class1_Sub1_Sub1_Sub2 local71;
		if (local28 == null || local26 == 65535) {
			local71 = arg0.method1083(!local14.method1619(local18));
			local71.method1077(local14, local18);
			return local71;
		} else {
			local71 = arg0.method1083(!local14.method1619(local18) & !local28.method1619(local26));
			local71.method1077(local14, local18);
			local71.method1077(local28, local26);
			return local71;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!wf;IILclient!w;B)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method3101(@OriginalArg(0) Class1_Sub1_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub1_Sub2 arg3) {
		@Pc(8) int local8 = this.anIntArray602[arg2];
		@Pc(19) Class1_Sub1_Sub11 local19 = Static62.method1112(local8 >> 16);
		@Pc(23) int local23 = local8 & 0xFFFF;
		if (local19 == null) {
			return arg0.method3102(arg3, arg1);
		}
		@Pc(36) int local36 = arg0.anIntArray602[arg1];
		@Pc(42) Class1_Sub1_Sub11 local42 = Static62.method1112(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(59) Class1_Sub1_Sub1_Sub2 local59;
		if (local42 == null) {
			local59 = arg3.method1083(!local19.method1619(local23));
			local59.method1077(local19, local23);
			return local59;
		} else {
			local59 = arg3.method1083(!local19.method1619(local23) & !local42.method1619(local46));
			local59.method1086(local19, local23, local42, local46, this.anIntArray603);
			return local59;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!w;IB)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method3102(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray602[arg1];
		@Pc(14) Class1_Sub1_Sub11 local14 = Static62.method1112(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1083(true);
		} else {
			@Pc(35) Class1_Sub1_Sub1_Sub2 local35 = arg0.method1083(!local14.method1619(local18));
			local35.method1077(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
	public void method3104() {
		if (this.anInt4303 == -1) {
			if (this.anIntArray603 == null) {
				this.anInt4303 = 0;
			} else {
				this.anInt4303 = 2;
			}
		}
		if (this.anInt4301 != -1) {
			return;
		}
		if (this.anIntArray603 == null) {
			this.anInt4301 = 0;
		} else {
			this.anInt4301 = 2;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!w;I)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method3106(@OriginalArg(1) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray602[arg1];
		@Pc(14) Class1_Sub1_Sub11 local14 = Static62.method1112(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1076(true);
		} else {
			@Pc(35) Class1_Sub1_Sub1_Sub2 local35 = arg0.method1076(!local14.method1619(local18));
			local35.method1077(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILclient!jg;)V")
	private void method3107(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(136) int local136;
		if (arg0 == 1) {
			local111 = arg1.method878();
			this.anIntArray601 = new int[local111];
			for (local117 = 0; local117 < local111; local117++) {
				this.anIntArray601[local117] = arg1.method878();
			}
			this.anIntArray602 = new int[local111];
			for (local136 = 0; local136 < local111; local136++) {
				this.anIntArray602[local136] = arg1.method878();
			}
			for (@Pc(276) int local276 = 0; local276 < local111; local276++) {
				this.anIntArray602[local276] += arg1.method878() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt4304 = arg1.method878();
		} else if (arg0 == 3) {
			local111 = arg1.method861();
			this.anIntArray603 = new int[local111 + 1];
			for (local117 = 0; local117 < local111; local117++) {
				this.anIntArray603[local117] = arg1.method861();
			}
			this.anIntArray603[local111] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean214 = true;
		} else if (arg0 == 5) {
			this.anInt4287 = arg1.method861();
		} else if (arg0 == 6) {
			this.anInt4300 = arg1.method878();
		} else if (arg0 == 7) {
			this.anInt4307 = arg1.method878();
		} else if (arg0 == 8) {
			this.anInt4296 = arg1.method861();
		} else if (arg0 == 9) {
			this.anInt4303 = arg1.method861();
		} else if (arg0 == 10) {
			this.anInt4301 = arg1.method861();
		} else if (arg0 == 11) {
			this.anInt4297 = arg1.method861();
		} else if (arg0 == 12) {
			local111 = arg1.method861();
			this.anIntArray600 = new int[local111];
			for (local117 = 0; local117 < local111; local117++) {
				this.anIntArray600[local117] = arg1.method878();
			}
			for (local136 = 0; local136 < local111; local136++) {
				this.anIntArray600[local136] = (arg1.method878() << 16) + this.anIntArray600[local136];
			}
		} else if (arg0 == 13) {
			local111 = arg1.method861();
			this.anIntArray599 = new int[local111];
			for (local117 = 0; local117 < local111; local117++) {
				this.anIntArray599[local117] = arg1.method888();
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!jg;)V")
	public void method3110(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method861();
			if (local18 == 0) {
				return;
			}
			this.method3107(local18, arg0);
		}
	}
}
