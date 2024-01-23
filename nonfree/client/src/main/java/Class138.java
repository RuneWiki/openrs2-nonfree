import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class138 {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "Lclient!gk;")
	private Class64 aClass64_1 = null;

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "Z")
	private boolean aBoolean286;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
	private boolean aBoolean285;

	@OriginalMember(owner = "client!ph", name = "U", descriptor = "Lclient!fl;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!fl;ZZ)V")
	public Class138(@OriginalArg(0) Class55 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean286 = arg1;
		this.aBoolean285 = arg2;
		this.aClass55_1 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3331(@OriginalArg(0) String arg0) {
		if (this.method3344()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass64_1.aClass128_1.method3209(Static252.method3846(local13));
			return this.method3332(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Z")
	private boolean method3332(@OriginalArg(1) int arg0) {
		if (!this.method3344()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass64_1.anIntArray139.length && this.aClass64_1.anIntArray139[arg0] != 0) {
			return true;
		} else if (Static45.aBoolean71) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	private int method3333(@OriginalArg(1) int arg0) {
		if (this.method3332(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass55_1.method4239(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)[I")
	public int[] method3334(@OriginalArg(1) int arg0) {
		if (!this.method3332(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass64_1.anIntArrayArray7[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass64_1.anIntArray136[arg0]];
			@Pc(37) int local37 = 0;
			while (local24.length > local37) {
				local24[local37] = local37++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3335(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3344()) {
			return null;
		}
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(24) String local24 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass64_1.aClass128_1.method3209(Static252.method3846(local21));
		if (this.method3332(local33)) {
			@Pc(52) int local52 = this.aClass64_1.aClass128Array1[local33].method3209(Static252.method3846(local24));
			return this.method3346(local33, local52);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)V")
	private void method3337(@OriginalArg(1) int arg0) {
		if (this.aBoolean286) {
			this.anObjectArray1[arg0] = this.aClass55_1.method4234(arg0);
		} else {
			this.anObjectArray1[arg0] = Static45.method811(this.aClass55_1.method4234(arg0));
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(BI)[B")
	public byte[] method3339(@OriginalArg(1) int arg0) {
		if (!this.method3344()) {
			return null;
		} else if (this.aClass64_1.anIntArray139.length == 1) {
			return this.method3346(0, arg0);
		} else if (!this.method3332(arg0)) {
			return null;
		} else if (this.aClass64_1.anIntArray139[arg0] == 1) {
			return this.method3346(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(BI)Z")
	public boolean method3340(@OriginalArg(1) int arg0) {
		if (!this.method3344()) {
			return false;
		} else if (this.aClass64_1.anIntArray139.length == 1) {
			return this.method3362(arg0, 0);
		} else if (!this.method3332(arg0)) {
			return false;
		} else if (this.aClass64_1.anIntArray139[arg0] == 1) {
			return this.method3362(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Z")
	public boolean method3341() {
		if (!this.method3344()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass64_1.anIntArray135.length; local20++) {
			@Pc(32) int local32 = this.aClass64_1.anIntArray135[local20];
			if (this.anObjectArray1[local32] == null) {
				this.method3337(local32);
				if (this.anObjectArray1[local32] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3342(@OriginalArg(1) String arg0) {
		if (this.method3344()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass64_1.aClass128_1.method3209(Static252.method3846(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)V")
	public void method3343(@OriginalArg(1) int arg0) {
		if (this.method3332(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Z")
	private boolean method3344() {
		if (this.aClass64_1 == null) {
			this.aClass64_1 = this.aClass55_1.method4232();
			if (this.aClass64_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass64_1.anInt1745][];
			this.anObjectArray1 = new Object[this.aClass64_1.anInt1745];
		}
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(BI)I")
	public int method3345(@OriginalArg(1) int arg0) {
		if (this.method3344()) {
			@Pc(24) int local24 = this.aClass64_1.aClass128_1.method3209(arg0);
			return this.method3332(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)[B")
	public byte[] method3346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3351(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIB)[B")
	public byte[] method3348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3353(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(32) boolean local32 = this.method3368(null, arg1);
			if (!local32) {
				this.method3337(arg1);
				local32 = this.method3368(null, arg1);
				if (!local32) {
					return null;
				}
			}
		}
		return Static233.method3676(this.anObjectArrayArray1[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I")
	public int method3349() {
		if (!this.method3344()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anObjectArray1.length; local18++) {
			if (this.aClass64_1.anIntArray136[local18] > 0) {
				local16 += this.method3333(local18);
				local14 += 100;
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[I)[B")
	public byte[] method3351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method3353(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(39) boolean local39 = this.method3368(arg2, arg1);
			if (!local39) {
				this.method3337(arg1);
				local39 = this.method3368(arg2, arg1);
				if (!local39) {
					return null;
				}
			}
		}
		@Pc(69) byte[] local69 = Static233.method3676(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.aBoolean285) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass64_1.anIntArray139[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		}
		return local69;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
	public int method3352() {
		return this.method3344() ? this.aClass64_1.anIntArray139.length : -1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)Z")
	private boolean method3353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3344()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass64_1.anIntArray139.length > arg1 && this.aClass64_1.anIntArray139[arg1] > arg0) {
			return true;
		} else if (Static45.aBoolean71) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
	public boolean method3356(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3344()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass64_1.aClass128_1.method3209(Static252.method3846(local12));
		if (this.method3332(local24)) {
			@Pc(48) int local48 = this.aClass64_1.aClass128Array1[local24].method3209(Static252.method3846(local15));
			return this.method3362(local48, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZI)V")
	public void method3357(@OriginalArg(0) boolean arg0) {
		if (!this.method3344()) {
			return;
		}
		if (arg0) {
			this.aClass64_1.aClass128_1 = null;
			this.aClass64_1.anIntArray140 = null;
		}
		this.aClass64_1.aClass128Array1 = null;
		this.aClass64_1.anIntArrayArray8 = null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)Z")
	public boolean method3358(@OriginalArg(1) int arg0) {
		if (!this.method3332(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3337(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(BLjava/lang/String;)V")
	public void method3359(@OriginalArg(1) String arg0) {
		if (this.method3344()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass64_1.aClass128_1.method3209(Static252.method3846(local19));
			this.method3361(local28);
		}
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(II)V")
	private void method3361(@OriginalArg(0) int arg0) {
		this.aClass55_1.method4233(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Z")
	public boolean method3362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3353(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method3337(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
	public void method3363() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray1.length; local7++) {
				this.anObjectArrayArray1[local7] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZI)I")
	public int method3365(@OriginalArg(1) int arg0) {
		return this.method3332(arg0) ? this.aClass64_1.anIntArray139[arg0] : 0;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)I")
	public int method3366() {
		if (!this.method3344()) {
			throw new IllegalStateException("");
		}
		return this.aClass64_1.anInt1739;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3367(@OriginalArg(1) String arg0) {
		if (this.method3344()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass64_1.aClass128_1.method3209(Static252.method3846(local17));
			return this.method3358(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([III)Z")
	private boolean method3368(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (!this.method3332(arg1)) {
			return false;
		} else if (this.anObjectArray1[arg1] == null) {
			return false;
		} else {
			@Pc(26) int local26 = this.aClass64_1.anIntArray136[arg1];
			@Pc(32) int[] local32 = this.aClass64_1.anIntArrayArray7[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass64_1.anIntArray139[arg1]];
			}
			@Pc(53) Object[] local53 = this.anObjectArrayArray1[arg1];
			@Pc(55) boolean local55 = true;
			for (@Pc(57) int local57 = 0; local57 < local26; local57++) {
				@Pc(69) int local69;
				if (local32 == null) {
					local69 = local57;
				} else {
					local69 = local32[local57];
				}
				if (local53[local69] == null) {
					local55 = false;
					break;
				}
			}
			if (local55) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local127 = Static233.method3676(this.anObjectArray1[arg1], false);
			} else {
				local127 = Static233.method3676(this.anObjectArray1[arg1], true);
				@Pc(141) Class1_Sub14 local141 = new Class1_Sub14(local127);
				local141.method2602(local141.aByteArray34.length, arg0);
			}
			@Pc(153) byte[] local153;
			try {
				local153 = Static154.method2653(local127);
			} catch (@Pc(163) RuntimeException local163) {
				throw Static289.method4286(local163, "T3 - " + (arg0 != null) + "," + arg1 + "," + local127.length + "," + Static110.method1797(local127.length, local127) + "," + Static110.method1797(local127.length - 2, local127) + "," + this.aClass64_1.anIntArray137[arg1] + "," + this.aClass64_1.anInt1739);
			}
			if (this.aBoolean286) {
				this.anObjectArray1[arg1] = null;
			}
			@Pc(233) int local233;
			if (local26 > 1) {
				local233 = local153.length;
				@Pc(236) int local236 = local233 - 1;
				@Pc(240) int local240 = local153[local236] & 0xFF;
				@Pc(248) int local248 = local236 - local240 * 4 * local26;
				@Pc(253) Class1_Sub14 local253 = new Class1_Sub14(local153);
				local253.anInt3290 = local248;
				@Pc(259) int[] local259 = new int[local26];
				@Pc(270) int local270;
				@Pc(272) int local272;
				for (@Pc(261) int local261 = 0; local261 < local240; local261++) {
					local270 = 0;
					for (local272 = 0; local272 < local26; local272++) {
						if (local32 == null) {
						}
						local270 += local253.method2647();
						local259[local272] += local270;
					}
				}
				@Pc(300) byte[][] local300 = new byte[local26][];
				for (local270 = 0; local270 < local26; local270++) {
					local300[local270] = new byte[local259[local270]];
					local259[local270] = 0;
				}
				local270 = 0;
				local253.anInt3290 = local248;
				@Pc(335) int local335;
				for (local272 = 0; local272 < local240; local272++) {
					local335 = 0;
					for (@Pc(337) int local337 = 0; local337 < local26; local337++) {
						local335 += local253.method2647();
						Static319.method508(local153, local270, local300[local337], local259[local337], local335);
						local259[local337] += local335;
						local270 += local335;
					}
				}
				for (local272 = 0; local272 < local26; local272++) {
					if (local32 == null) {
						local335 = local272;
					} else {
						local335 = local32[local272];
					}
					if (this.aBoolean285) {
						local53[local335] = local300[local272];
					} else {
						local53[local335] = Static45.method811(local300[local272]);
					}
				}
			} else {
				if (local32 == null) {
					local233 = 0;
				} else {
					local233 = local32[0];
				}
				if (this.aBoolean285) {
					local53[local233] = local153;
				} else {
					local53[local233] = Static45.method811(local153);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method3370(@OriginalArg(1) String arg0) {
		if (this.method3344()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(32) int local32 = this.aClass64_1.aClass128_1.method3209(Static252.method3846(local12));
			return this.method3333(local32);
		} else {
			return 0;
		}
	}
}
