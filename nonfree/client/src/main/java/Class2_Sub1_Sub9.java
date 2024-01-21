import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class2_Sub1_Sub9 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!ke", name = "S", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!ke", name = "X", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!ke", name = "hb", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
	public int anInt1920 = 2;

	@OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
	public int anInt1927 = 5;

	@OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
	public int anInt1929 = -1;

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
	public int anInt1932 = 99;

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
	public int anInt1933 = -1;

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
	public int anInt1934 = -1;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	public int anInt1924 = -1;

	@OriginalMember(owner = "client!ke", name = "R", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
	public int anInt1928 = -1;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
	public void method1359() {
		if (this.anInt1933 == -1) {
			if (this.anIntArray216 == null) {
				this.anInt1933 = 0;
			} else {
				this.anInt1933 = 2;
			}
		}
		if (this.anInt1924 != -1) {
			return;
		}
		if (this.anIntArray216 == null) {
			this.anInt1924 = 0;
		} else {
			this.anInt1924 = 2;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!va;)V")
	private void method1360(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		@Pc(96) int local96;
		@Pc(102) int local102;
		@Pc(141) int local141;
		if (arg0 == 1) {
			local96 = arg1.method1456();
			this.anIntArray217 = new int[local96];
			for (local102 = 0; local102 < local96; local102++) {
				this.anIntArray217[local102] = arg1.method1456();
			}
			this.anIntArray214 = new int[local96];
			for (local141 = 0; local141 < local96; local141++) {
				this.anIntArray214[local141] = arg1.method1456();
			}
			for (@Pc(278) int local278 = 0; local278 < local96; local278++) {
				this.anIntArray214[local278] = (arg1.method1456() << 16) + this.anIntArray214[local278];
			}
		} else if (arg0 == 2) {
			this.anInt1929 = arg1.method1456();
		} else if (arg0 == 3) {
			local96 = arg1.method1461();
			this.anIntArray216 = new int[local96 + 1];
			for (local102 = 0; local102 < local96; local102++) {
				this.anIntArray216[local102] = arg1.method1461();
			}
			this.anIntArray216[local96] = 9999999;
		} else if (arg0 == 4) {
			this.aBoolean84 = true;
		} else if (arg0 == 5) {
			this.anInt1927 = arg1.method1461();
		} else if (arg0 == 6) {
			this.anInt1934 = arg1.method1456();
		} else if (arg0 == 7) {
			this.anInt1928 = arg1.method1456();
		} else if (arg0 == 8) {
			this.anInt1932 = arg1.method1461();
		} else if (arg0 == 9) {
			this.anInt1933 = arg1.method1461();
		} else if (arg0 == 10) {
			this.anInt1924 = arg1.method1461();
		} else if (arg0 == 11) {
			this.anInt1920 = arg1.method1461();
		} else if (arg0 == 12) {
			local96 = arg1.method1461();
			this.anIntArray213 = new int[local96];
			for (local102 = 0; local102 < local96; local102++) {
				this.anIntArray213[local102] = arg1.method1456();
			}
			for (local141 = 0; local141 < local96; local141++) {
				this.anIntArray213[local141] = (arg1.method1456() << 16) + this.anIntArray213[local141];
			}
		} else if (arg0 == 13) {
			local96 = arg1.method1461();
			this.anIntArray215 = new int[local96];
			for (local102 = 0; local102 < local96; local102++) {
				this.anIntArray215[local102] = arg1.method1436();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!bh;II)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method1361(@OriginalArg(0) Class2_Sub1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray214[arg1];
		@Pc(14) Class2_Sub1_Sub1 local14 = Static138.method2180(local8 >> 16);
		@Pc(26) int local26 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method809(true);
		} else {
			@Pc(43) Class2_Sub1_Sub3_Sub3 local43 = arg0.method809(!local14.method31(local26));
			local43.method816(local14, local26);
			return local43;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!va;I)V")
	public void method1362(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1461();
			if (local5 == 0) {
				return;
			}
			this.method1360(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!bh;I)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method1365(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub3_Sub3 arg1) {
		@Pc(8) int local8 = this.anIntArray214[arg0];
		@Pc(14) Class2_Sub1_Sub1 local14 = Static138.method2180(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method819(true);
		} else {
			@Pc(46) Class2_Sub1_Sub3_Sub3 local46 = arg1.method819(!local14.method31(local18));
			local46.method816(local14, local18);
			return local46;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ke;IIILclient!bh;)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method1366(@OriginalArg(0) Class2_Sub1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub3_Sub3 arg3) {
		@Pc(8) int local8 = this.anIntArray214[arg2];
		@Pc(14) Class2_Sub1_Sub1 local14 = Static138.method2180(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1361(arg3, arg1);
		}
		@Pc(31) int local31 = arg0.anIntArray214[arg1];
		@Pc(37) Class2_Sub1_Sub1 local37 = Static138.method2180(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class2_Sub1_Sub3_Sub3 local54;
		if (local37 == null) {
			local54 = arg3.method809(!local14.method31(local18));
			local54.method816(local14, local18);
			return local54;
		} else {
			local54 = arg3.method809(!local14.method31(local18) & !local37.method31(local41));
			local54.method810(local14, local18, local37, local41, this.anIntArray216);
			return local54;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!bh;I)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method1367(@OriginalArg(1) Class2_Sub1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray214[arg1];
		@Pc(14) Class2_Sub1_Sub1 local14 = Static138.method2180(local4 >> 16);
		@Pc(18) int local18 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method809(true);
		}
		@Pc(26) Class2_Sub1_Sub1 local26 = null;
		@Pc(28) int local28 = 0;
		if (this.anIntArray213 != null && this.anIntArray213.length > arg1) {
			local28 = this.anIntArray213[arg1];
			local26 = Static138.method2180(local28 >> 16);
			local28 &= 0xFFFF;
		}
		@Pc(76) Class2_Sub1_Sub3_Sub3 local76;
		if (local26 == null || local28 == 65535) {
			local76 = arg0.method809(!local14.method31(local18));
			local76.method816(local14, local18);
			return local76;
		} else {
			local76 = arg0.method809(!local14.method31(local18) & !local26.method31(local28));
			local76.method816(local14, local18);
			local76.method816(local26, local28);
			return local76;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!bh;III)Lclient!bh;")
	public Class2_Sub1_Sub3_Sub3 method1368(@OriginalArg(0) Class2_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = this.anIntArray214[arg2];
		@Pc(16) Class2_Sub1_Sub1 local16 = Static138.method2180(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg0.method809(true);
		}
		@Pc(30) int local30 = arg1 & 0x3;
		@Pc(41) Class2_Sub1_Sub3_Sub3 local41 = arg0.method809(!local16.method31(local20));
		if (local30 == 1) {
			local41.method815();
		} else if (local30 == 2) {
			local41.method820();
		} else if (local30 == 3) {
			local41.method817();
		}
		local41.method816(local16, local20);
		if (local30 == 1) {
			local41.method817();
		} else if (local30 == 2) {
			local41.method820();
		} else if (local30 == 3) {
			local41.method815();
		}
		return local41;
	}
}
