import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class284 {

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray33;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!it;")
	private Class151 aClass151_2 = null;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	public int anInt8049;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "Z")
	private final boolean aBoolean555;

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "Lclient!fc;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!fc;ZI)V")
	public Class284(@OriginalArg(0) Class98 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt8049 = arg2;
		this.aBoolean555 = arg1;
		this.aClass98_1 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z")
	public boolean method6321() {
		if (!this.method6355()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass151_2.anIntArray219.length; local23++) {
			@Pc(31) int local31 = this.aClass151_2.anIntArray219[local23];
			if (this.anObjectArray33[local31] == null) {
				this.method6339(local31);
				if (this.anObjectArray33[local31] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)I")
	public int method6322() {
		return this.method6355() ? this.aClass151_2.anIntArray222.length : -1;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)[I")
	public int[] method6324(@OriginalArg(1) int arg0) {
		if (!this.method6338(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass151_2.anIntArrayArray46[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass151_2.anIntArray218[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6325(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method6333("");
		return local8 == -1 ? this.method6343("", arg0) : this.method6343(arg0, "");
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public void method6326(@OriginalArg(0) String arg0) {
		if (this.method6355()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass151_2.aClass306_1.method6697(Static176.method3156(local11));
			this.method6329(local26);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	public void method6327(@OriginalArg(1) int arg0) {
		if (this.method6338(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method6328(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6355()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass151_2.aClass306_1.method6697(Static176.method3156(local12));
		if (this.method6338(local26)) {
			@Pc(54) int local54 = this.aClass151_2.aClass306Array1[local26].method6697(Static176.method3156(local15));
			return this.method6331(local26, local54);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V")
	private void method6329(@OriginalArg(0) int arg0) {
		this.aClass98_1.method4611(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[II)[B")
	public byte[] method6330(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method6337(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(36) boolean local36 = this.method6344(arg2, arg1, arg0);
			if (!local36) {
				this.method6339(arg2);
				local36 = this.method6344(arg2, arg1, arg0);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static193.method3393(false, this.anObjectArrayArray1[arg2][arg0]);
		if (this.anInt8049 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass151_2.anIntArray222[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt8049 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)[B")
	public byte[] method6331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method6330(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)I")
	public int method6332() {
		if (!this.method6355()) {
			throw new IllegalStateException("");
		}
		return this.aClass151_2.anInt4717;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method6333(@OriginalArg(1) String arg0) {
		if (this.method6355()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass151_2.aClass306_1.method6697(Static176.method3156(local12));
			return this.method6338(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	public void method6334() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZZ)V")
	public void method6335(@OriginalArg(2) boolean arg0) {
		if (!this.method6355()) {
			return;
		}
		this.aClass151_2.aClass306Array1 = null;
		this.aClass151_2.anIntArrayArray47 = null;
		if (arg0) {
			this.aClass151_2.anIntArray220 = null;
			this.aClass151_2.aClass306_1 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)Z")
	public boolean method6336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method6337(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method6339(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)Z")
	private boolean method6337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method6355()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass151_2.anIntArray222.length > arg0 && this.aClass151_2.anIntArray222[arg0] > arg1) {
			return true;
		} else if (Static338.aBoolean428) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)Z")
	private boolean method6338(@OriginalArg(0) int arg0) {
		if (!this.method6355()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass151_2.anIntArray222.length && this.aClass151_2.anIntArray222[arg0] != 0) {
			return true;
		} else if (Static338.aBoolean428) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)V")
	private void method6339(@OriginalArg(0) int arg0) {
		if (this.aBoolean555) {
			this.anObjectArray33[arg0] = this.aClass98_1.method4617(arg0);
		} else {
			this.anObjectArray33[arg0] = Static342.method4996(this.aClass98_1.method4617(arg0));
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public int method6340(@OriginalArg(0) String arg0) {
		if (this.method6355()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass151_2.aClass306_1.method6697(Static176.method3156(local12));
			return this.method6353(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
	public void method6341() {
		if (this.anObjectArray33 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray33.length; local6++) {
				this.anObjectArray33[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	private boolean method6343(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6355()) {
			return false;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass151_2.aClass306_1.method6697(Static176.method3156(local17));
		if (this.method6338(local29)) {
			@Pc(47) int local47 = this.aClass151_2.aClass306Array1[local29].method6697(Static176.method3156(local20));
			return this.method6336(local29, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[III)Z")
	private boolean method6344(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method6338(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass151_2.anIntArray218[arg0];
			@Pc(33) int[] local33 = this.aClass151_2.anIntArrayArray46[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass151_2.anIntArray222[arg0]];
			}
			@Pc(53) Object[] local53 = this.anObjectArrayArray1[arg0];
			@Pc(55) boolean local55 = true;
			for (@Pc(57) int local57 = 0; local57 < local27; local57++) {
				@Pc(63) int local63;
				if (local33 == null) {
					local63 = local57;
				} else {
					local63 = local33[local57];
				}
				if (local53[local63] == null) {
					local55 = false;
					break;
				}
			}
			if (local55) {
				return true;
			}
			@Pc(129) byte[] local129;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local129 = Static193.method3393(false, this.anObjectArray33[arg0]);
			} else {
				local129 = Static193.method3393(true, this.anObjectArray33[arg0]);
				@Pc(146) Class3_Sub26 local146 = new Class3_Sub26(local129);
				local146.method6831(arg1, local146.aByteArray213.length);
			}
			@Pc(160) byte[] local160;
			try {
				local160 = Static156.method2877(local129);
			} catch (@Pc(162) RuntimeException local162) {
				throw Static538.method7361(local162, "T3 - " + (arg1 != null) + "," + arg0 + "," + local129.length + "," + Static143.method2747(local129.length, local129) + "," + Static143.method2747(local129.length - 2, local129) + "," + this.aClass151_2.anIntArray221[arg0] + "," + this.aClass151_2.anInt4717);
			}
			if (this.aBoolean555) {
				this.anObjectArray33[arg0] = null;
			}
			@Pc(232) int local232;
			if (local27 <= 1) {
				if (local33 == null) {
					local232 = 0;
				} else {
					local232 = local33[0];
				}
				if (this.anInt8049 == 0) {
					local53[local232] = Static342.method4996(local160);
				} else {
					local53[local232] = local160;
				}
			} else {
				@Pc(270) int local270;
				@Pc(283) Class3_Sub26 local283;
				@Pc(290) int local290;
				@Pc(292) int local292;
				@Pc(296) int local296;
				@Pc(298) int local298;
				@Pc(312) int local312;
				@Pc(368) int local368;
				@Pc(370) int local370;
				if (this.anInt8049 == 2) {
					local232 = local160.length;
					local232--;
					local270 = local160[local232] & 0xFF;
					local232 -= local270 * local27 * 4;
					local283 = new Class3_Sub26(local160);
					@Pc(285) int local285 = 0;
					local283.anInt8703 = local232;
					local290 = 0;
					for (local292 = 0; local292 < local270; local292++) {
						local296 = 0;
						for (local298 = 0; local298 < local27; local298++) {
							local296 += local283.method6816();
							if (local33 == null) {
								local312 = local298;
							} else {
								local312 = local33[local298];
							}
							if (local312 == arg2) {
								local290 = local312;
								local285 += local296;
							}
						}
					}
					if (local285 == 0) {
						return true;
					}
					@Pc(355) byte[] local355 = new byte[local285];
					local283.anInt8703 = local232;
					local285 = 0;
					local298 = 0;
					for (local312 = 0; local312 < local270; local312++) {
						local368 = 0;
						for (local370 = 0; local370 < local27; local370++) {
							local368 += local283.method6816();
							@Pc(382) int local382;
							if (local33 == null) {
								local382 = local370;
							} else {
								local382 = local33[local370];
							}
							if (local382 == arg2) {
								Static604.method6225(local160, local298, local355, local285, local368);
								local285 += local368;
							}
							local298 += local368;
						}
					}
					local53[local290] = local355;
				} else {
					local232 = local160.length;
					local232--;
					local270 = local160[local232] & 0xFF;
					local232 -= local27 * 4 * local270;
					local283 = new Class3_Sub26(local160);
					local283.anInt8703 = local232;
					@Pc(460) int[] local460 = new int[local27];
					for (local290 = 0; local290 < local270; local290++) {
						local292 = 0;
						for (local296 = 0; local296 < local27; local296++) {
							local292 += local283.method6816();
							local460[local296] += local292;
						}
					}
					@Pc(498) byte[][] local498 = new byte[local27][];
					for (local296 = 0; local296 < local27; local296++) {
						local498[local296] = new byte[local460[local296]];
						local460[local296] = 0;
					}
					local283.anInt8703 = local232;
					local298 = 0;
					for (local312 = 0; local312 < local270; local312++) {
						local368 = 0;
						for (local370 = 0; local370 < local27; local370++) {
							local368 += local283.method6816();
							Static604.method6225(local160, local298, local498[local370], local460[local370], local368);
							local298 += local368;
							local460[local370] += local368;
						}
					}
					for (local368 = 0; local368 < local27; local368++) {
						if (local33 == null) {
							local370 = local368;
						} else {
							local370 = local33[local368];
						}
						if (this.anInt8049 == 0) {
							local53[local370] = Static342.method4996(local498[local368]);
						} else {
							local53[local370] = local498[local368];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(II)Z")
	public boolean method6347(@OriginalArg(1) int arg0) {
		if (!this.method6355()) {
			return false;
		} else if (this.aClass151_2.anIntArray222.length == 1) {
			return this.method6336(0, arg0);
		} else if (!this.method6338(arg0)) {
			return false;
		} else if (this.aClass151_2.anIntArray222[arg0] == 1) {
			return this.method6336(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method6348(@OriginalArg(0) String arg0) {
		if (this.method6355()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass151_2.aClass306_1.method6697(Static176.method3156(local12));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(BI)Z")
	public boolean method6349(@OriginalArg(1) int arg0) {
		if (!this.method6338(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method6339(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)I")
	public int method6350() {
		if (!this.method6355()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray33.length; local22++) {
			if (this.aClass151_2.anIntArray218[local22] > 0) {
				local20 += this.method6353(local22);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local20 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(BI)I")
	public int method6351(@OriginalArg(1) int arg0) {
		if (this.method6355()) {
			@Pc(18) int local18 = this.aClass151_2.aClass306_1.method6697(arg0);
			return this.method6338(local18) ? local18 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method6352(@OriginalArg(1) String arg0) {
		if (this.method6355()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass151_2.aClass306_1.method6697(Static176.method3156(local12));
			return this.method6349(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)I")
	private int method6353(@OriginalArg(0) int arg0) {
		if (this.method6338(arg0)) {
			return this.anObjectArray33[arg0] == null ? this.aClass98_1.method4610(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "(II)I")
	public int method6354(@OriginalArg(0) int arg0) {
		return this.method6338(arg0) ? this.aClass151_2.anIntArray222[arg0] : 0;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Z")
	private boolean method6355() {
		if (this.aClass151_2 == null) {
			this.aClass151_2 = this.aClass98_1.method4613();
			if (this.aClass151_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass151_2.anInt4713][];
			this.anObjectArray33 = new Object[this.aClass151_2.anInt4713];
		}
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method6356(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method6355()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass151_2.aClass306_1.method6697(Static176.method3156(local12));
		if (local29 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass151_2.aClass306Array1[local29].method6697(Static176.method3156(local20));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "(II)[B")
	public byte[] method6357(@OriginalArg(1) int arg0) {
		if (!this.method6355()) {
			return null;
		} else if (this.aClass151_2.anIntArray222.length == 1) {
			return this.method6331(0, arg0);
		} else if (!this.method6338(arg0)) {
			return null;
		} else if (this.aClass151_2.anIntArray222[arg0] == 1) {
			return this.method6331(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
