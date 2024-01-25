import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class109 {

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "Lclient!lb;")
	private Class147 aClass147_1 = null;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!hq;")
	private final Class113 aClass113_1;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "Z")
	private final boolean aBoolean212;

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
	public int anInt2631;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!hq;ZI)V")
	public Class109(@OriginalArg(0) Class113 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass113_1 = arg0;
		this.aBoolean212 = arg1;
		this.anInt2631 = arg2;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)I")
	public int method2322(@OriginalArg(1) int arg0) {
		return this.method2333(arg0) ? this.aClass147_1.anIntArray306[arg0] : 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method2323(@OriginalArg(1) String arg0) {
		if (this.method2335()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass147_1.aClass199_1.method4745(Static57.method723(local17));
			return this.method2344(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
	public int method2324() {
		return this.method2335() ? this.aClass147_1.anIntArray306.length : -1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
	public int method2325() {
		if (!this.method2335()) {
			throw new IllegalStateException("");
		}
		return this.aClass147_1.anInt3880;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZZI)V")
	public void method2326(@OriginalArg(0) boolean arg0) {
		if (!this.method2335()) {
			return;
		}
		this.aClass147_1.anIntArrayArray26 = null;
		this.aClass147_1.aClass199Array1 = null;
		if (arg0) {
			this.aClass147_1.aClass199_1 = null;
			this.aClass147_1.anIntArray303 = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	private void method2328(@OriginalArg(1) int arg0) {
		this.aClass113_1.method3784(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	public void method2329() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
	private boolean method2330(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2335()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass147_1.anIntArray306.length > arg1 && this.aClass147_1.anIntArray306[arg1] > arg0) {
			return true;
		} else if (Static80.aBoolean533) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method2331(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2335()) {
			return false;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass147_1.aClass199_1.method4745(Static57.method723(local20));
		if (this.method2333(local32)) {
			@Pc(50) int local50 = this.aClass147_1.aClass199Array1[local32].method4745(Static57.method723(local23));
			return this.method2354(local32, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)I")
	public int method2332() {
		if (!this.method2335()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray2.length; local23++) {
			if (this.aClass147_1.anIntArray304[local23] > 0) {
				local21 += this.method2344(local23);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local21 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)Z")
	private boolean method2333(@OriginalArg(0) int arg0) {
		if (!this.method2335()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass147_1.anIntArray306.length && this.aClass147_1.anIntArray306[arg0] != 0) {
			return true;
		} else if (Static80.aBoolean533) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2334(@OriginalArg(0) String arg0) {
		if (this.method2335()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass147_1.aClass199_1.method4745(Static57.method723(local14));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)Z")
	private boolean method2335() {
		if (this.aClass147_1 == null) {
			this.aClass147_1 = this.aClass113_1.method3787();
			if (this.aClass147_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass147_1.anInt3881][];
			this.anObjectArray2 = new Object[this.aClass147_1.anInt3881];
		}
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V")
	public void method2336(@OriginalArg(0) int arg0) {
		if (this.method2333(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)V")
	private void method2337(@OriginalArg(0) int arg0) {
		if (this.aBoolean212) {
			this.anObjectArray2[arg0] = this.aClass113_1.method3788(arg0);
		} else {
			this.anObjectArray2[arg0] = Static230.method3356(this.aClass113_1.method3788(arg0));
		}
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	public void method2338() {
		if (this.anObjectArray2 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anObjectArray2.length; local12++) {
				this.anObjectArray2[local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(II)Z")
	public boolean method2339(@OriginalArg(1) int arg0) {
		if (!this.method2333(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method2337(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method2340(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2335()) {
			return null;
		}
		@Pc(14) String local14 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass147_1.aClass199_1.method4745(Static57.method723(local14));
		if (this.method2333(local31)) {
			@Pc(51) int local51 = this.aClass147_1.aClass199Array1[local31].method4745(Static57.method723(local22));
			return this.method2349(local31, local51);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(BI)[I")
	public int[] method2341(@OriginalArg(1) int arg0) {
		if (!this.method2333(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass147_1.anIntArrayArray25[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass147_1.anIntArray304[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method2342(@OriginalArg(0) String arg0) {
		if (this.method2335()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass147_1.aClass199_1.method4745(Static57.method723(local12));
			return this.method2339(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2343(@OriginalArg(1) String arg0) {
		if (this.method2335()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass147_1.aClass199_1.method4745(Static57.method723(local12));
			return this.method2333(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(II)I")
	private int method2344(@OriginalArg(0) int arg0) {
		if (this.method2333(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass113_1.method3786(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[II)[B")
	public byte[] method2345(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method2330(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(36) boolean local36 = this.method2351(arg0, arg2, arg1);
			if (!local36) {
				this.method2337(arg2);
				local36 = this.method2351(arg0, arg2, arg1);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static100.method1623(this.anObjectArrayArray1[arg2][arg0], false);
		if (this.anInt2631 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass147_1.anIntArray306[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt2631 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)[B")
	public byte[] method2346(@OriginalArg(1) int arg0) {
		if (!this.method2335()) {
			return null;
		} else if (this.aClass147_1.anIntArray306.length == 1) {
			return this.method2349(0, arg0);
		} else if (!this.method2333(arg0)) {
			return null;
		} else if (this.aClass147_1.anIntArray306[arg0] == 1) {
			return this.method2349(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(II)I")
	public int method2347(@OriginalArg(1) int arg0) {
		if (this.method2335()) {
			@Pc(24) int local24 = this.aClass147_1.aClass199_1.method4745(arg0);
			return this.method2333(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(II)Z")
	public boolean method2348(@OriginalArg(1) int arg0) {
		if (!this.method2335()) {
			return false;
		} else if (this.aClass147_1.anIntArray306.length == 1) {
			return this.method2354(0, arg0);
		} else if (!this.method2333(arg0)) {
			return false;
		} else if (this.aClass147_1.anIntArray306[arg0] == 1) {
			return this.method2354(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)[B")
	public byte[] method2349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method2345(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZI[I)Z")
	private boolean method2351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method2333(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass147_1.anIntArray304[arg1];
			@Pc(29) int[] local29 = this.aClass147_1.anIntArrayArray25[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass147_1.anIntArray306[arg1]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg1];
			@Pc(51) boolean local51 = true;
			for (@Pc(53) int local53 = 0; local53 < local23; local53++) {
				@Pc(60) int local60;
				if (local29 == null) {
					local60 = local53;
				} else {
					local60 = local29[local53];
				}
				if (local49[local60] == null) {
					local51 = false;
					break;
				}
			}
			if (local51) {
				return true;
			}
			@Pc(114) byte[] local114;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local114 = Static100.method1623(this.anObjectArray2[arg1], false);
			} else {
				local114 = Static100.method1623(this.anObjectArray2[arg1], true);
				@Pc(119) Class1_Sub14 local119 = new Class1_Sub14(local114);
				local119.method4510(local119.aByteArray65.length, arg2);
			}
			@Pc(140) byte[] local140;
			try {
				local140 = Static171.method2646(local114);
			} catch (@Pc(142) RuntimeException local142) {
				throw Static102.method1635(local142, "T3 - " + (arg2 != null) + "," + arg1 + "," + local114.length + "," + Static302.method4113(local114, local114.length) + "," + Static302.method4113(local114, local114.length - 2) + "," + this.aClass147_1.anIntArray308[arg1] + "," + this.aClass147_1.anInt3880);
			}
			if (this.aBoolean212) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(214) int local214;
			if (local23 <= 1) {
				if (local29 == null) {
					local214 = 0;
				} else {
					local214 = local29[0];
				}
				if (this.anInt2631 == 0) {
					local49[local214] = Static230.method3356(local140);
				} else {
					local49[local214] = local140;
				}
			} else {
				@Pc(247) int local247;
				@Pc(260) Class1_Sub14 local260;
				@Pc(264) int local264;
				@Pc(269) int local269;
				@Pc(272) int local272;
				@Pc(274) int local274;
				@Pc(287) int local287;
				@Pc(334) int local334;
				@Pc(336) int local336;
				if (this.anInt2631 == 2) {
					local214 = local140.length;
					local214--;
					local247 = local140[local214] & 0xFF;
					local214 -= local247 * local23 * 4;
					local260 = new Class1_Sub14(local140);
					@Pc(262) int local262 = 0;
					local264 = 0;
					local260.anInt5695 = local214;
					for (local269 = 0; local269 < local247; local269++) {
						local272 = 0;
						for (local274 = 0; local274 < local23; local274++) {
							local272 += local260.method4500();
							if (local29 == null) {
								local287 = local274;
							} else {
								local287 = local29[local274];
							}
							if (arg0 == local287) {
								local262 += local272;
								local264 = local287;
							}
						}
					}
					if (local262 == 0) {
						return true;
					}
					@Pc(322) byte[] local322 = new byte[local262];
					local262 = 0;
					local260.anInt5695 = local214;
					local274 = 0;
					for (local287 = 0; local287 < local247; local287++) {
						local334 = 0;
						for (local336 = 0; local336 < local23; local336++) {
							local334 += local260.method4500();
							@Pc(347) int local347;
							if (local29 == null) {
								local347 = local336;
							} else {
								local347 = local29[local336];
							}
							if (local347 == arg0) {
								Static459.method1552(local140, local274, local322, local262, local334);
								local262 += local334;
							}
							local274 += local334;
						}
					}
					local49[local264] = local322;
				} else {
					local214 = local140.length;
					local214--;
					local247 = local140[local214] & 0xFF;
					local214 -= local23 * local247 * 4;
					local260 = new Class1_Sub14(local140);
					local260.anInt5695 = local214;
					@Pc(419) int[] local419 = new int[local23];
					for (local264 = 0; local264 < local247; local264++) {
						local269 = 0;
						for (local272 = 0; local272 < local23; local272++) {
							local269 += local260.method4500();
							local419[local272] += local269;
						}
					}
					@Pc(459) byte[][] local459 = new byte[local23][];
					for (local272 = 0; local272 < local23; local272++) {
						local459[local272] = new byte[local419[local272]];
						local419[local272] = 0;
					}
					local260.anInt5695 = local214;
					local274 = 0;
					for (local287 = 0; local287 < local247; local287++) {
						local334 = 0;
						for (local336 = 0; local336 < local23; local336++) {
							local334 += local260.method4500();
							Static459.method1552(local140, local274, local459[local336], local419[local336], local334);
							local419[local336] += local334;
							local274 += local334;
						}
					}
					for (local334 = 0; local334 < local23; local334++) {
						if (local29 == null) {
							local336 = local334;
						} else {
							local336 = local29[local334];
						}
						if (this.anInt2631 == 0) {
							local49[local336] = Static230.method3356(local459[local334]);
						} else {
							local49[local336] = local459[local334];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(BLjava/lang/String;)V")
	public void method2352(@OriginalArg(1) String arg0) {
		if (this.method2335()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass147_1.aClass199_1.method4745(Static57.method723(local11));
			this.method2328(local20);
		}
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)Z")
	public boolean method2353() {
		if (!this.method2335()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass147_1.anIntArray307.length; local15++) {
			@Pc(23) int local23 = this.aClass147_1.anIntArray307[local15];
			if (this.anObjectArray2[local23] == null) {
				this.method2337(local23);
				if (this.anObjectArray2[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BII)Z")
	public boolean method2354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2330(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method2337(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
