import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class96 {

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public int anInt3645 = -1;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public int anInt3651 = -1;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	public int anInt3653 = -1;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Z")
	public boolean aBoolean324 = false;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public int anInt3649 = 5;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Z")
	private boolean aBoolean325 = false;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public int anInt3659 = 2;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public int anInt3652 = -1;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public int anInt3646 = 99;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	public int anInt3655 = -1;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILclient!qa;ILclient!nb;)Lclient!nb;")
	public Class5_Sub3 method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(4) Class5_Sub3 arg3) {
		@Pc(4) int local4 = this.anIntArray323[arg0];
		@Pc(14) Class1_Sub2_Sub3 local14 = Static14.method336(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg2.method2697(arg3, arg1);
		}
		@Pc(36) int local36 = arg2.anIntArray323[arg1];
		@Pc(42) Class1_Sub2_Sub3 local42 = Static14.method336(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(67) Class5_Sub3 local67;
		if (local42 == null) {
			local67 = arg3.method531(!local14.method474(local23), !this.aBoolean325);
			local67.method539(local14, local23, this.aBoolean325);
			return local67;
		} else {
			local67 = arg3.method531(!local14.method474(local23) & !local42.method474(local46), !this.aBoolean325 & !arg2.aBoolean325);
			local67.method533(local14, local23, local42, local46, this.anIntArray325, this.aBoolean325 | arg2.aBoolean325);
			return local67;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!nb;II)Lclient!nb;")
	public Class5_Sub3 method2696(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray323[arg1];
		@Pc(20) Class1_Sub2_Sub3 local20 = Static14.method336(local8 >> 16);
		@Pc(24) int local24 = local8 & 0xFFFF;
		if (local20 == null) {
			return arg0.method546(true, true);
		} else {
			@Pc(48) Class5_Sub3 local48 = arg0.method546(!local20.method474(local24), !this.aBoolean325);
			local48.method539(local20, local24, this.aBoolean325);
			return local48;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lclient!nb;II)Lclient!nb;")
	public Class5_Sub3 method2697(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray323[arg1];
		@Pc(14) Class1_Sub2_Sub3 local14 = Static14.method336(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method531(true, true);
		} else {
			@Pc(50) Class5_Sub3 local50 = arg0.method531(!local14.method474(local18), !this.aBoolean325);
			local50.method539(local14, local18, this.aBoolean325);
			return local50;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!vf;I)V")
	public void method2698(@OriginalArg(0) Class1_Sub26 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2945();
			if (local14 == 0) {
				return;
			}
			this.method2699(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BILclient!vf;)V")
	private void method2699(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		@Pc(39) int local39;
		@Pc(54) int local54;
		if (arg0 == 1) {
			local10 = arg1.method2964();
			this.anIntArray327 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray327[local16] = arg1.method2964();
			}
			this.anIntArray323 = new int[local10];
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray323[local39] = arg1.method2964();
			}
			for (local54 = 0; local54 < local10; local54++) {
				this.anIntArray323[local54] += arg1.method2964() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3645 = arg1.method2964();
		} else if (arg0 == 3) {
			local10 = arg1.method2945();
			this.anIntArray325 = new int[local10 + 1];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray325[local16] = arg1.method2945();
			}
			this.anIntArray325[local10] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean324 = true;
		} else if (arg0 == 5) {
			this.anInt3649 = arg1.method2945();
		} else if (arg0 == 6) {
			this.anInt3655 = arg1.method2964();
		} else if (arg0 == 7) {
			this.anInt3651 = arg1.method2964();
		} else if (arg0 == 8) {
			this.anInt3646 = arg1.method2945();
		} else if (arg0 == 9) {
			this.anInt3652 = arg1.method2945();
		} else if (arg0 == 10) {
			this.anInt3653 = arg1.method2945();
		} else if (arg0 == 11) {
			this.anInt3659 = arg1.method2945();
		} else if (arg0 == 12) {
			local10 = arg1.method2945();
			this.anIntArray326 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray326[local16] = arg1.method2964();
			}
			for (local39 = 0; local39 < local10; local39++) {
				this.anIntArray326[local39] = (arg1.method2964() << 16) + this.anIntArray326[local39];
			}
		} else if (arg0 == 13) {
			local10 = arg1.method2964();
			this.anIntArrayArray35 = new int[local10][];
			for (local16 = 0; local16 < local10; local16++) {
				local39 = arg1.method2945();
				if (local39 > 0) {
					this.anIntArrayArray35[local16] = new int[local39];
					this.anIntArrayArray35[local16][0] = arg1.method2937();
					for (local54 = 1; local54 < local39; local54++) {
						this.anIntArrayArray35[local16][local54] = arg1.method2964();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean325 = true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!nb;II)Lclient!nb;")
	public Class5_Sub3 method2700(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = this.anIntArray323[arg2];
		@Pc(12) Class1_Sub2_Sub3 local12 = Static14.method336(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local12 == null) {
			return arg1.method531(true, true);
		}
		@Pc(31) int local31 = arg0 & 0x3;
		@Pc(48) Class5_Sub3 local48 = arg1.method531(!local12.method474(local20), !this.aBoolean325);
		if (local31 == 1) {
			local48.method541();
		} else if (local31 == 2) {
			local48.method534();
		} else if (local31 == 3) {
			local48.method547();
		}
		local48.method539(local12, local20, this.aBoolean325);
		if (local31 == 1) {
			local48.method547();
		} else if (local31 == 2) {
			local48.method534();
		} else if (local31 == 3) {
			local48.method541();
		}
		return local48;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!nb;I)Lclient!nb;")
	public Class5_Sub3 method2701(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3 arg1) {
		@Pc(8) int local8 = this.anIntArray323[arg0];
		@Pc(14) Class1_Sub2_Sub3 local14 = Static14.method336(local8 >> 16);
		@Pc(26) int local26 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method531(true, true);
		}
		@Pc(35) Class1_Sub2_Sub3 local35 = null;
		@Pc(37) int local37 = 0;
		if (this.anIntArray326 != null && arg0 < this.anIntArray326.length) {
			local37 = this.anIntArray326[arg0];
			local35 = Static14.method336(local37 >> 16);
			local37 &= 0xFFFF;
		}
		@Pc(82) Class5_Sub3 local82;
		if (local35 == null || local37 == 65535) {
			local82 = arg1.method531(!local14.method474(local26), !this.aBoolean325);
			local82.method539(local14, local26, this.aBoolean325);
			return local82;
		} else {
			local82 = arg1.method531(!local14.method474(local26) & !local35.method474(local37), !this.aBoolean325);
			local82.method539(local14, local26, this.aBoolean325);
			local82.method539(local35, local37, this.aBoolean325);
			return local82;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public void method2702() {
		if (this.anInt3652 == -1) {
			if (this.anIntArray325 == null) {
				this.anInt3652 = 0;
			} else {
				this.anInt3652 = 2;
			}
		}
		if (this.anInt3653 != -1) {
			return;
		}
		if (this.anIntArray325 == null) {
			this.anInt3653 = 0;
		} else {
			this.anInt3653 = 2;
		}
	}
}
