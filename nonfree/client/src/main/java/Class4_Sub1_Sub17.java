import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
	public int anInt2987 = -1;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	public int anInt2995 = -1;

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
	public int anInt2996 = -1;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
	public int anInt2997 = 5;

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "Z")
	public boolean aBoolean271 = false;

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
	public int anInt2998 = -1;

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
	public int anInt3001 = -1;

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "I")
	public int anInt3000 = 99;

	@OriginalMember(owner = "client!vc", name = "kb", descriptor = "I")
	public int anInt3005 = 2;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lclient!jd;B)V")
	public void method1911(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method719();
			if (local17 == 0) {
				return;
			}
			this.method1914(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!od;B)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub3_Sub3 arg2) {
		@Pc(6) int local6 = this.anIntArray330[arg1];
		@Pc(16) Class4_Sub1_Sub12 local16 = Static72.method1186(local6 >> 16);
		@Pc(20) int local20 = local6 & 0xFFFF;
		if (local16 == null) {
			return arg2.method1469(true);
		}
		@Pc(30) int local30 = arg0 & 0x3;
		@Pc(41) Class4_Sub1_Sub3_Sub3 local41 = arg2.method1469(!local16.method1702(local20));
		if (local30 == 1) {
			local41.method1482();
		} else if (local30 == 2) {
			local41.method1473();
		} else if (local30 == 3) {
			local41.method1471();
		}
		local41.method1480(local16, local20);
		if (local30 == 1) {
			local41.method1471();
		} else if (local30 == 2) {
			local41.method1473();
		} else if (local30 == 3) {
			local41.method1482();
		}
		return local41;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!jd;IB)V")
	private void method1914(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(43) int local43;
		if (arg1 == 1) {
			local18 = arg0.method718();
			this.anIntArray327 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray327[local24] = arg0.method718();
			}
			this.anIntArray330 = new int[local18];
			for (local43 = 0; local43 < local18; local43++) {
				this.anIntArray330[local43] = arg0.method718();
			}
			for (@Pc(62) int local62 = 0; local62 < local18; local62++) {
				this.anIntArray330[local62] += arg0.method718() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt2998 = arg0.method718();
		} else if (arg1 == 3) {
			local18 = arg0.method719();
			this.anIntArray328 = new int[local18 + 1];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray328[local24] = arg0.method719();
			}
			this.anIntArray328[local18] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean271 = true;
		} else if (arg1 == 5) {
			this.anInt2997 = arg0.method719();
		} else if (arg1 == 6) {
			this.anInt3001 = arg0.method718();
		} else if (arg1 == 7) {
			this.anInt2987 = arg0.method718();
		} else if (arg1 == 8) {
			this.anInt3000 = arg0.method719();
		} else if (arg1 == 9) {
			this.anInt2996 = arg0.method719();
		} else if (arg1 == 10) {
			this.anInt2995 = arg0.method719();
		} else if (arg1 == 11) {
			this.anInt3005 = arg0.method719();
		} else if (arg1 == 12) {
			local18 = arg0.method719();
			this.anIntArray329 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray329[local24] = arg0.method718();
			}
			for (local43 = 0; local43 < local18; local43++) {
				this.anIntArray329[local43] = (arg0.method718() << 16) + this.anIntArray329[local43];
			}
			return;
		} else if (arg1 == 13) {
			local18 = arg0.method719();
			this.anIntArray326 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray326[local24] = arg0.method704();
			}
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLclient!od;I)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1915(@OriginalArg(1) Class4_Sub1_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray330[arg1];
		@Pc(14) Class4_Sub1_Sub12 local14 = Static72.method1186(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1490(true);
		} else {
			@Pc(46) Class4_Sub1_Sub3_Sub3 local46 = arg0.method1490(!local14.method1702(local18));
			local46.method1480(local14, local18);
			return local46;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!od;)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1917(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub3_Sub3 arg1) {
		@Pc(8) int local8 = this.anIntArray330[arg0];
		@Pc(14) Class4_Sub1_Sub12 local14 = Static72.method1186(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1469(true);
		}
		@Pc(32) Class4_Sub1_Sub12 local32 = null;
		@Pc(34) int local34 = 0;
		if (this.anIntArray329 != null && arg0 < this.anIntArray329.length) {
			local34 = this.anIntArray329[arg0];
			local32 = Static72.method1186(local34 >> 16);
			local34 &= 0xFFFF;
		}
		@Pc(75) Class4_Sub1_Sub3_Sub3 local75;
		if (local32 == null || local34 == 65535) {
			local75 = arg1.method1469(!local14.method1702(local18));
			local75.method1480(local14, local18);
			return local75;
		} else {
			local75 = arg1.method1469(!local14.method1702(local18) & !local32.method1702(local34));
			local75.method1480(local14, local18);
			local75.method1480(local32, local34);
			return local75;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!vc;Lclient!od;II)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1918(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub17 arg1, @OriginalArg(2) Class4_Sub1_Sub3_Sub3 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray330[arg3];
		@Pc(14) Class4_Sub1_Sub12 local14 = Static72.method1186(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1920(arg2, arg0);
		}
		@Pc(31) int local31 = arg1.anIntArray330[arg0];
		@Pc(41) Class4_Sub1_Sub12 local41 = Static72.method1186(local31 >> 16);
		@Pc(45) int local45 = local31 & 0xFFFF;
		@Pc(58) Class4_Sub1_Sub3_Sub3 local58;
		if (local41 == null) {
			local58 = arg2.method1469(!local14.method1702(local18));
			local58.method1480(local14, local18);
			return local58;
		} else {
			local58 = arg2.method1469(!local14.method1702(local18) & !local41.method1702(local45));
			local58.method1484(local14, local18, local41, local45, this.anIntArray328);
			return local58;
		}
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	public void method1919() {
		if (this.anInt2996 == -1) {
			if (this.anIntArray328 == null) {
				this.anInt2996 = 0;
			} else {
				this.anInt2996 = 2;
			}
		}
		if (this.anInt2995 != -1) {
			return;
		}
		if (this.anIntArray328 == null) {
			this.anInt2995 = 0;
		} else {
			this.anInt2995 = 2;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!od;II)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1920(@OriginalArg(0) Class4_Sub1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray330[arg1];
		@Pc(14) Class4_Sub1_Sub12 local14 = Static72.method1186(local4 >> 16);
		@Pc(23) int local23 = local4 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1469(true);
		} else {
			@Pc(40) Class4_Sub1_Sub3_Sub3 local40 = arg0.method1469(!local14.method1702(local23));
			local40.method1480(local14, local23);
			return local40;
		}
	}
}
