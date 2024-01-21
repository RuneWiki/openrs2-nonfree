import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "[I")
	public int[] anIntArray35;

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "[I")
	public int[] anIntArray36;

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "[I")
	private int[] anIntArray37;

	@OriginalMember(owner = "client!bi", name = "eb", descriptor = "[I")
	private int[] anIntArray38;

	@OriginalMember(owner = "client!bi", name = "pb", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "Z")
	public boolean aBoolean16 = false;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
	public int anInt399 = -1;

	@OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
	public int anInt408 = -1;

	@OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
	public int anInt401 = -1;

	@OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
	public int anInt406 = 2;

	@OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
	public int anInt409 = 99;

	@OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
	public int anInt407 = -1;

	@OriginalMember(owner = "client!bi", name = "sb", descriptor = "I")
	public int anInt416 = -1;

	@OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
	public int anInt411 = 5;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ja;B)V")
	public void method360(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2962();
			if (local9 == 0) {
				return;
			}
			this.method362(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!bi;IILclient!ue;I)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method361(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub3_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray35[arg1];
		@Pc(10) Class2_Sub2_Sub16 local10 = Static167.method2774(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg0.method369(arg3, arg2);
		}
		@Pc(31) int local31 = arg0.anIntArray35[arg3];
		@Pc(37) Class2_Sub2_Sub16 local37 = Static167.method2774(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(62) Class2_Sub2_Sub3_Sub4 local62;
		if (local37 == null) {
			local62 = arg2.method1041(!local10.method2661(local14));
			local62.method1056(local10, local14);
			return local62;
		} else {
			local62 = arg2.method1041(!local10.method2661(local14) & !local37.method2661(local41));
			local62.method1054(local10, local14, local37, local41, this.anIntArray38);
			return local62;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBLclient!ja;)V")
	private void method362(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		@Pc(31) int local31;
		@Pc(39) int local39;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local31 = arg1.method2933();
			this.anIntArray36 = new int[local31];
			for (local39 = 0; local39 < local31; local39++) {
				this.anIntArray36[local39] = arg1.method2933();
			}
			this.anIntArray35 = new int[local31];
			for (local160 = 0; local160 < local31; local160++) {
				this.anIntArray35[local160] = arg1.method2933();
			}
			for (@Pc(283) int local283 = 0; local283 < local31; local283++) {
				this.anIntArray35[local283] = (arg1.method2933() << 16) + this.anIntArray35[local283];
			}
		} else if (arg0 == 2) {
			this.anInt407 = arg1.method2933();
		} else if (arg0 == 3) {
			local31 = arg1.method2962();
			this.anIntArray38 = new int[local31 + 1];
			for (local39 = 0; local39 < local31; local39++) {
				this.anIntArray38[local39] = arg1.method2962();
			}
			this.anIntArray38[local31] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean16 = true;
		} else if (arg0 == 5) {
			this.anInt411 = arg1.method2962();
		} else if (arg0 == 6) {
			this.anInt399 = arg1.method2933();
		} else if (arg0 == 7) {
			this.anInt408 = arg1.method2933();
		} else if (arg0 == 8) {
			this.anInt409 = arg1.method2962();
		} else if (arg0 == 9) {
			this.anInt401 = arg1.method2962();
		} else if (arg0 == 10) {
			this.anInt416 = arg1.method2962();
		} else if (arg0 == 11) {
			this.anInt406 = arg1.method2962();
		} else if (arg0 == 12) {
			local31 = arg1.method2962();
			this.anIntArray37 = new int[local31];
			for (local39 = 0; local39 < local31; local39++) {
				this.anIntArray37[local39] = arg1.method2933();
			}
			for (local160 = 0; local160 < local31; local160++) {
				this.anIntArray37[local160] += arg1.method2933() << 16;
			}
		} else if (arg0 == 13) {
			local31 = arg1.method2962();
			this.anIntArray39 = new int[local31];
			for (local39 = 0; local39 < local31; local39++) {
				this.anIntArray39[local39] = arg1.method2942();
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ue;II)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method363(@OriginalArg(0) Class2_Sub2_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray35[arg1];
		@Pc(14) Class2_Sub2_Sub16 local14 = Static167.method2774(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1041(true);
		}
		@Pc(31) int local31 = 0;
		@Pc(33) Class2_Sub2_Sub16 local33 = null;
		if (this.anIntArray37 != null && arg1 < this.anIntArray37.length) {
			local31 = this.anIntArray37[arg1];
			local33 = Static167.method2774(local31 >> 16);
			local31 &= 0xFFFF;
		}
		@Pc(78) Class2_Sub2_Sub3_Sub4 local78;
		if (local33 == null || local31 == 65535) {
			local78 = arg0.method1041(!local14.method2661(local18));
			local78.method1056(local14, local18);
			return local78;
		} else {
			local78 = arg0.method1041(!local14.method2661(local18) & !local33.method2661(local31));
			local78.method1056(local14, local18);
			local78.method1056(local33, local31);
			return local78;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lclient!ue;II)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method364(@OriginalArg(0) Class2_Sub2_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anIntArray35[arg1];
		@Pc(20) Class2_Sub2_Sub16 local20 = Static167.method2774(local14 >> 16);
		@Pc(24) int local24 = local14 & 0xFFFF;
		if (local20 == null) {
			return arg0.method1045(true);
		} else {
			@Pc(41) Class2_Sub2_Sub3_Sub4 local41 = arg0.method1045(!local20.method2661(local24));
			local41.method1056(local20, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	public void method366() {
		if (this.anInt416 == -1) {
			if (this.anIntArray38 == null) {
				this.anInt416 = 0;
			} else {
				this.anInt416 = 2;
			}
		}
		if (this.anInt401 != -1) {
			return;
		}
		if (this.anIntArray38 == null) {
			this.anInt401 = 0;
		} else {
			this.anInt401 = 2;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ue;IB)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method367(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub3_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = this.anIntArray35[arg0];
		@Pc(16) Class2_Sub2_Sub16 local16 = Static167.method2774(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1041(true);
		}
		@Pc(37) int local37 = arg2 & 0x3;
		@Pc(48) Class2_Sub2_Sub3_Sub4 local48 = arg1.method1041(!local16.method2661(local20));
		if (local37 == 1) {
			local48.method1051();
		} else if (local37 == 2) {
			local48.method1050();
		} else if (local37 == 3) {
			local48.method1053();
		}
		local48.method1056(local16, local20);
		if (local37 == 1) {
			local48.method1053();
		} else if (local37 == 2) {
			local48.method1050();
		} else if (local37 == 3) {
			local48.method1051();
		}
		return local48;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ue;B)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method369(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub3_Sub4 arg1) {
		@Pc(8) int local8 = this.anIntArray35[arg0];
		@Pc(14) Class2_Sub2_Sub16 local14 = Static167.method2774(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1041(true);
		} else {
			@Pc(35) Class2_Sub2_Sub3_Sub4 local35 = arg1.method1041(!local14.method2661(local18));
			local35.method1056(local14, local18);
			return local35;
		}
	}
}
