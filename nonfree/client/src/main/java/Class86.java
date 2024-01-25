import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class86 {

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!efa", name = "h", descriptor = "Lclient!pb;")
	public Class242 aClass242_1;

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "[I")
	private final int[] anIntArray179 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!jr;)V")
	public void method1912(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6019();
			if (local9 == 0) {
				return;
			}
			this.method1915(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)Z")
	public boolean method1913() {
		if (this.anIntArray178 == null) {
			return true;
		}
		@Pc(21) boolean local21 = true;
		@Pc(25) Class248 local25 = this.aClass242_1.aClass248_65;
		synchronized (this.aClass242_1.aClass248_65) {
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray178.length; local29++) {
				if (!this.aClass242_1.aClass248_65.method5788(0, this.anIntArray178[local29])) {
					local21 = false;
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IILclient!jr;)V")
	private void method1915(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			arg1.method6019();
			return;
		}
		@Pc(31) int local31;
		@Pc(41) int local41;
		if (arg0 == 2) {
			local31 = arg1.method6019();
			this.anIntArray178 = new int[local31];
			for (local41 = 0; local41 < local31; local41++) {
				this.anIntArray178[local41] = arg1.method6044();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local31 = arg1.method6019();
				this.aShortArray22 = new short[local31];
				this.aShortArray21 = new short[local31];
				for (local41 = 0; local41 < local31; local41++) {
					this.aShortArray21[local41] = (short) arg1.method6044();
					this.aShortArray22[local41] = (short) arg1.method6044();
				}
				return;
			}
			if (arg0 == 41) {
				local31 = arg1.method6019();
				this.aShortArray23 = new short[local31];
				this.aShortArray20 = new short[local31];
				for (local41 = 0; local41 < local31; local41++) {
					this.aShortArray23[local41] = (short) arg1.method6044();
					this.aShortArray20[local41] = (short) arg1.method6044();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray179[arg0 - 60] = arg1.method6044();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)Z")
	public boolean method1916() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class248 local11 = this.aClass242_1.aClass248_65;
		synchronized (this.aClass242_1.aClass248_65) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray179[local15] != -1 && !this.aClass242_1.aClass248_65.method5788(0, this.anIntArray179[local15])) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Lclient!hn;")
	public Class134 method1918() {
		if (this.anIntArray178 == null) {
			return null;
		}
		@Pc(15) Class134[] local15 = new Class134[this.anIntArray178.length];
		@Pc(24) Class248 local24 = this.aClass242_1.aClass248_65;
		@Pc(28) int local28;
		synchronized (this.aClass242_1.aClass248_65) {
			local28 = 0;
			while (true) {
				if (this.anIntArray178.length <= local28) {
					break;
				}
				local15[local28] = Static311.method4670(this.aClass242_1.aClass248_65, this.anIntArray178[local28]);
				local28++;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray178.length; local61++) {
			if (local15[local61].anInt3869 < 13) {
				local15[local61].method3345();
			}
		}
		@Pc(95) Class134 local95;
		if (local15.length == 1) {
			local95 = local15[0];
		} else {
			local95 = new Class134(local15, local15.length);
		}
		if (local95 == null) {
			return null;
		}
		if (this.aShortArray21 != null) {
			for (local28 = 0; local28 < this.aShortArray21.length; local28++) {
				local95.method3351(this.aShortArray21[local28], this.aShortArray22[local28]);
			}
		}
		if (this.aShortArray23 != null) {
			for (local28 = 0; local28 < this.aShortArray23.length; local28++) {
				local95.method3352(this.aShortArray20[local28], this.aShortArray23[local28]);
			}
		}
		return local95;
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)Lclient!hn;")
	public Class134 method1920() {
		@Pc(8) Class134[] local8 = new Class134[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class248 local14 = this.aClass242_1.aClass248_65;
		@Pc(18) int local18;
		synchronized (this.aClass242_1.aClass248_65) {
			local18 = 0;
			while (true) {
				if (local18 >= 5) {
					break;
				}
				if (this.anIntArray179[local18] != -1) {
					local8[local10++] = Static311.method4670(this.aClass242_1.aClass248_65, this.anIntArray179[local18]);
				}
				local18++;
			}
		}
		for (@Pc(59) int local59 = 0; local59 < 5; local59++) {
			if (local8[local59] != null && local8[local59].anInt3869 < 13) {
				local8[local59].method3345();
			}
		}
		@Pc(89) Class134 local89 = new Class134(local8, local10);
		if (this.aShortArray21 != null) {
			for (local18 = 0; local18 < this.aShortArray21.length; local18++) {
				local89.method3351(this.aShortArray21[local18], this.aShortArray22[local18]);
			}
		}
		if (this.aShortArray23 != null) {
			for (local18 = 0; local18 < this.aShortArray23.length; local18++) {
				local89.method3352(this.aShortArray20[local18], this.aShortArray23[local18]);
			}
		}
		return local89;
	}
}
