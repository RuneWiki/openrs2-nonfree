import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class3_Sub3_Sub14 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!ua", name = "fb", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!ua", name = "hb", descriptor = "[I")
	private int[] anIntArray384;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
	public int anInt2609 = -1;

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
	public int anInt2607 = -1;

	@OriginalMember(owner = "client!ua", name = "gb", descriptor = "I")
	public int anInt2612 = -1;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	public int anInt2611 = 99;

	@OriginalMember(owner = "client!ua", name = "ib", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!ua", name = "ob", descriptor = "I")
	public int anInt2616 = -1;

	@OriginalMember(owner = "client!ua", name = "rb", descriptor = "I")
	public int anInt2618 = -1;

	@OriginalMember(owner = "client!ua", name = "ub", descriptor = "I")
	public int anInt2621 = 5;

	@OriginalMember(owner = "client!ua", name = "tb", descriptor = "I")
	public int anInt2620 = 2;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!wd;I)V")
	public void method1795(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1421();
			if (local9 == 0) {
				return;
			}
			this.method1799(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!de;II)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1796(@OriginalArg(0) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray382[arg1];
		@Pc(14) Class3_Sub3_Sub15 local14 = Static75.method1507(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method405(true);
		} else {
			@Pc(35) Class3_Sub3_Sub1_Sub1 local35 = arg0.method405(!local14.method1833(local18));
			local35.method401(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!de;B)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub1_Sub1 arg2) {
		@Pc(15) int local15 = this.anIntArray382[arg0];
		@Pc(23) Class3_Sub3_Sub15 local23 = Static75.method1507(local15 >> 16);
		@Pc(27) int local27 = local15 & 0xFFFF;
		if (local23 == null) {
			return arg2.method405(true);
		}
		@Pc(44) Class3_Sub3_Sub1_Sub1 local44 = arg2.method405(!local23.method1833(local27));
		@Pc(48) int local48 = arg1 & 0x3;
		if (local48 == 1) {
			local44.method420();
		} else if (local48 == 2) {
			local44.method397();
		} else if (local48 == 3) {
			local44.method408();
		}
		local44.method401(local23, local27);
		if (local48 == 1) {
			local44.method408();
		} else if (local48 == 2) {
			local44.method397();
		} else if (local48 == 3) {
			local44.method420();
		}
		return local44;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!wd;I)V")
	private void method1799(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(41) int local41;
		if (arg1 == 1) {
			local12 = arg0.method1421();
			this.anIntArray383 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray383[local18] = arg0.method1451();
			}
			this.anIntArray382 = new int[local12];
			for (local41 = 0; local41 < local12; local41++) {
				this.anIntArray382[local41] = arg0.method1451();
			}
			for (@Pc(56) int local56 = 0; local56 < local12; local56++) {
				this.anIntArray382[local56] = (arg0.method1451() << 16) + this.anIntArray382[local56];
			}
		} else if (arg1 == 2) {
			this.anInt2609 = arg0.method1451();
		} else if (arg1 == 3) {
			local12 = arg0.method1421();
			this.anIntArray385 = new int[local12 + 1];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray385[local18] = arg0.method1421();
			}
			this.anIntArray385[local12] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean126 = true;
		} else if (arg1 == 5) {
			this.anInt2621 = arg0.method1421();
		} else if (arg1 == 6) {
			this.anInt2618 = arg0.method1451();
		} else if (arg1 == 7) {
			this.anInt2612 = arg0.method1451();
		} else if (arg1 == 8) {
			this.anInt2611 = arg0.method1421();
		} else if (arg1 == 9) {
			this.anInt2616 = arg0.method1421();
		} else if (arg1 == 10) {
			this.anInt2607 = arg0.method1421();
		} else if (arg1 == 11) {
			this.anInt2620 = arg0.method1421();
		} else if (arg1 == 12) {
			local12 = arg0.method1421();
			this.anIntArray384 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray384[local18] = arg0.method1451();
			}
			for (local41 = 0; local41 < local12; local41++) {
				this.anIntArray384[local41] += arg0.method1451() << 16;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V")
	public void method1800() {
		if (this.anInt2607 == -1) {
			if (this.anIntArray385 == null) {
				this.anInt2607 = 0;
			} else {
				this.anInt2607 = 2;
			}
		}
		if (this.anInt2616 != -1) {
			return;
		}
		if (this.anIntArray385 == null) {
			this.anInt2616 = 0;
		} else {
			this.anInt2616 = 2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILclient!de;)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1801(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3_Sub1_Sub1 arg1) {
		@Pc(8) int local8 = this.anIntArray382[arg0];
		@Pc(14) Class3_Sub3_Sub15 local14 = Static75.method1507(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method422(true);
		} else {
			@Pc(35) Class3_Sub3_Sub1_Sub1 local35 = arg1.method422(!local14.method1833(local18));
			local35.method401(local14, local18);
			return local35;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!de;I)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1804(@OriginalArg(1) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray382[arg1];
		@Pc(14) Class3_Sub3_Sub15 local14 = Static75.method1507(local8 >> 31947952);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method405(true);
		}
		@Pc(26) int local26 = 0;
		@Pc(28) Class3_Sub3_Sub15 local28 = null;
		if (this.anIntArray384 != null && arg1 < this.anIntArray384.length) {
			local26 = this.anIntArray384[arg1];
			local28 = Static75.method1507(local26 >> 16);
			local26 &= 0xFFFF;
		}
		@Pc(71) Class3_Sub3_Sub1_Sub1 local71;
		if (local28 == null || local26 == 65535) {
			local71 = arg0.method405(!local14.method1833(local18));
			local71.method401(local14, local18);
			return local71;
		} else {
			local71 = arg0.method405(!local14.method1833(local18) & !local28.method1833(local26));
			local71.method401(local14, local18);
			local71.method401(local28, local26);
			return local71;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!de;Lclient!ua;III)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method1805(@OriginalArg(0) Class3_Sub3_Sub1_Sub1 arg0, @OriginalArg(1) Class3_Sub3_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray382[arg2];
		@Pc(14) Class3_Sub3_Sub15 local14 = Static75.method1507(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1796(arg0, arg3);
		}
		@Pc(31) int local31 = arg1.anIntArray382[arg3];
		@Pc(43) Class3_Sub3_Sub15 local43 = Static75.method1507(local31 >> 16);
		@Pc(47) int local47 = local31 & 0xFFFF;
		@Pc(60) Class3_Sub3_Sub1_Sub1 local60;
		if (local43 == null) {
			local60 = arg0.method405(!local14.method1833(local18));
			local60.method401(local14, local18);
			return local60;
		} else {
			local60 = arg0.method405(!local14.method1833(local18) & !local43.method1833(local47));
			local60.method421(local14, local18, local43, local47, this.anIntArray385);
			return local60;
		}
	}
}
