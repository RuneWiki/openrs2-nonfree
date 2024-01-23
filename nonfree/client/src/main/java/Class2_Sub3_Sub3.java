import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!c", name = "N", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!c", name = "V", descriptor = "[[I")
	public int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!c", name = "W", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "[I")
	public int[] anIntArray77;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "I")
	public int anInt438 = 5;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "I")
	public int anInt439 = 2;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	public int anInt440 = -1;

	@OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
	public int anInt448 = -1;

	@OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
	public int anInt447 = -1;

	@OriginalMember(owner = "client!c", name = "Y", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
	public int anInt451 = -1;

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
	public int anInt443 = 99;

	@OriginalMember(owner = "client!c", name = "cb", descriptor = "Z")
	public boolean aBoolean16 = false;

	@OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
	public int anInt450 = -1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!nh;)V")
	public void method321(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2122();
			if (local7 == 0) {
				return;
			}
			this.method322(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!nh;Z)V")
	private void method322(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub23 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(36) int local36;
		@Pc(54) int local54;
		if (arg0 == 1) {
			local12 = arg1.method2095();
			this.anIntArray77 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray77[local18] = arg1.method2095();
			}
			this.anIntArray76 = new int[local12];
			for (local36 = 0; local36 < local12; local36++) {
				this.anIntArray76[local36] = arg1.method2095();
			}
			for (local54 = 0; local54 < local12; local54++) {
				this.anIntArray76[local54] += arg1.method2095() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt448 = arg1.method2095();
		} else if (arg0 == 3) {
			local12 = arg1.method2122();
			this.anIntArray74 = new int[local12 + 1];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray74[local18] = arg1.method2122();
			}
			this.anIntArray74[local12] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean16 = true;
		} else if (arg0 == 5) {
			this.anInt438 = arg1.method2122();
		} else if (arg0 == 6) {
			this.anInt447 = arg1.method2095();
		} else if (arg0 == 7) {
			this.anInt451 = arg1.method2095();
		} else if (arg0 == 8) {
			this.anInt443 = arg1.method2122();
		} else if (arg0 == 9) {
			this.anInt450 = arg1.method2122();
		} else if (arg0 == 10) {
			this.anInt440 = arg1.method2122();
		} else if (arg0 == 11) {
			this.anInt439 = arg1.method2122();
		} else if (arg0 == 12) {
			local12 = arg1.method2122();
			this.anIntArray73 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray73[local18] = arg1.method2095();
			}
			for (local36 = 0; local36 < local12; local36++) {
				this.anIntArray73[local36] = (arg1.method2095() << 16) + this.anIntArray73[local36];
			}
		} else if (arg0 == 13) {
			local12 = arg1.method2095();
			this.anIntArrayArray10 = new int[local12][];
			for (local18 = 0; local18 < local12; local18++) {
				local36 = arg1.method2122();
				if (local36 > 0) {
					this.anIntArrayArray10[local18] = new int[local36];
					this.anIntArrayArray10[local18][0] = arg1.method2091();
					for (local54 = 1; local54 < local36; local54++) {
						this.anIntArrayArray10[local18][local54] = arg1.method2095();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean15 = true;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!qc;BI)Lclient!qc;")
	public Class5_Sub3 method323(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray76[arg1];
		@Pc(14) Class2_Sub3_Sub22 local14 = Static34.method424(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1421(true, true);
		} else {
			@Pc(42) Class5_Sub3 local42 = arg0.method1421(!local14.method2707(local18), !this.aBoolean15);
			local42.method1423(local14, local18, this.aBoolean15);
			return local42;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!qc;IIILclient!c;)Lclient!qc;")
	public Class5_Sub3 method324(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub3_Sub3 arg3) {
		@Pc(8) int local8 = this.anIntArray76[arg2];
		@Pc(14) Class2_Sub3_Sub22 local14 = Static34.method424(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg3.method323(arg0, arg1);
		}
		@Pc(31) int local31 = arg3.anIntArray76[arg1];
		@Pc(37) Class2_Sub3_Sub22 local37 = Static34.method424(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(60) Class5_Sub3 local60;
		if (local37 == null) {
			local60 = arg0.method1421(!local14.method2707(local18), !this.aBoolean15);
			local60.method1423(local14, local18, this.aBoolean15);
			return local60;
		} else {
			local60 = arg0.method1421(!local14.method2707(local18) & !local37.method2707(local41), !this.aBoolean15 & !arg3.aBoolean15);
			local60.method1428(local14, local18, local37, local41, this.anIntArray74, this.aBoolean15 | arg3.aBoolean15);
			return local60;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!qc;II)Lclient!qc;")
	public Class5_Sub3 method325(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray76[arg1];
		@Pc(10) Class2_Sub3_Sub22 local10 = Static34.method424(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method1421(true, true);
		}
		@Pc(32) int local32 = 0;
		@Pc(34) Class2_Sub3_Sub22 local34 = null;
		if (this.anIntArray73 != null && arg1 < this.anIntArray73.length) {
			local32 = this.anIntArray73[arg1];
			local34 = Static34.method424(local32 >> 16);
			local32 &= 0xFFFF;
		}
		@Pc(79) Class5_Sub3 local79;
		if (local34 == null || local32 == 65535) {
			local79 = arg0.method1421(!local10.method2707(local14), !this.aBoolean15);
			local79.method1423(local10, local14, this.aBoolean15);
			return local79;
		} else {
			local79 = arg0.method1421(!local10.method2707(local14) & !local34.method2707(local32), !this.aBoolean15);
			local79.method1423(local10, local14, this.aBoolean15);
			local79.method1423(local34, local32, this.aBoolean15);
			return local79;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!qc;I)Lclient!qc;")
	public Class5_Sub3 method329(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray76[arg1];
		@Pc(14) Class2_Sub3_Sub22 local14 = Static34.method424(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1417(true, true);
		} else {
			@Pc(42) Class5_Sub3 local42 = arg0.method1417(!local14.method2707(local18), !this.aBoolean15);
			local42.method1423(local14, local18, this.aBoolean15);
			return local42;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!qc;II)Lclient!qc;")
	public Class5_Sub3 method330(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray76[arg1];
		@Pc(21) Class2_Sub3_Sub22 local21 = Static34.method424(local10 >> 16);
		@Pc(25) int local25 = local10 & 0xFFFF;
		if (local21 == null) {
			return arg0.method1421(true, true);
		}
		@Pc(36) int local36 = arg2 & 0x3;
		@Pc(53) Class5_Sub3 local53 = arg0.method1421(!local21.method2707(local25), !this.aBoolean15);
		if (local36 == 1) {
			local53.method1424();
		} else if (local36 == 2) {
			local53.method1427();
		} else if (local36 == 3) {
			local53.method1429();
		}
		local53.method1423(local21, local25, this.aBoolean15);
		if (local36 == 1) {
			local53.method1429();
		} else if (local36 == 2) {
			local53.method1427();
		} else if (local36 == 3) {
			local53.method1424();
		}
		return local53;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V")
	public void method331() {
		if (this.anInt450 == -1) {
			if (this.anIntArray74 == null) {
				this.anInt450 = 0;
			} else {
				this.anInt450 = 2;
			}
		}
		if (this.anInt440 != -1) {
			return;
		}
		if (this.anIntArray74 == null) {
			this.anInt440 = 0;
		} else {
			this.anInt440 = 2;
		}
	}
}
