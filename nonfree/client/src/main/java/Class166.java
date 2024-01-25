import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class166 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray33;

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!to;")
	private Class232 aClass232_1 = null;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Z")
	private final boolean aBoolean343;

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "I")
	public int anInt4829;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Lclient!tm;")
	private final Class193 aClass193_1;

	static {
		new Class242("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!tm;ZI)V")
	public Class166(@OriginalArg(0) Class193 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean343 = arg1;
		this.anInt4829 = arg2;
		this.aClass193_1 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZ)I")
	public int method3665(@OriginalArg(0) int arg0) {
		if (this.method3676()) {
			@Pc(16) int local16 = this.aClass232_1.aClass87_1.method1905(arg0);
			return this.method3688(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[II)[B")
	public byte[] method3666(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3685(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(32) boolean local32 = this.method3678(arg2, arg1, arg0);
			if (!local32) {
				this.method3699(arg0);
				local32 = this.method3678(arg2, arg1, arg0);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static326.method2435(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt4829 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass232_1.anIntArray584[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt4829 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local64;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method3667(@OriginalArg(0) String arg0) {
		if (this.method3676()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass232_1.aClass87_1.method1905(Static170.method4308(local11));
			this.method3683(local25);
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)I")
	public int method3668() {
		if (!this.method3676()) {
			throw new IllegalStateException("");
		}
		return this.aClass232_1.anInt6723;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I")
	private int method3669(@OriginalArg(1) int arg0) {
		if (this.method3688(arg0)) {
			return this.anObjectArray33[arg0] == null ? this.aClass193_1.method4419(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)Z")
	public boolean method3670(@OriginalArg(1) int arg0) {
		if (!this.method3676()) {
			return false;
		} else if (this.aClass232_1.anIntArray584.length == 1) {
			return this.method3693(0, arg0);
		} else if (!this.method3688(arg0)) {
			return false;
		} else if (this.aClass232_1.anIntArray584[arg0] == 1) {
			return this.method3693(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public void method3671() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method3672(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3676()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass232_1.aClass87_1.method1905(Static170.method4308(local12));
		if (this.method3688(local24)) {
			@Pc(48) int local48 = this.aClass232_1.aClass87Array1[local24].method1905(Static170.method4308(local15));
			return this.method3693(local24, local48);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method3673(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3676()) {
			return null;
		}
		@Pc(19) String local19 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass232_1.aClass87_1.method1905(Static170.method4308(local19));
		if (this.method3688(local31)) {
			@Pc(51) int local51 = this.aClass232_1.aClass87Array1[local31].method1905(Static170.method4308(local22));
			return this.method3696(local51, local31);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I")
	public int method3674() {
		if (!this.method3676()) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray33.length; local25++) {
			if (this.aClass232_1.anIntArray583[local25] > 0) {
				local21 += 100;
				local23 += this.method3669(local25);
			}
		}
		if (local21 == 0) {
			return 100;
		} else {
			return local23 * 100 / local21;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZZB)V")
	public void method3675(@OriginalArg(0) boolean arg0) {
		if (!this.method3676()) {
			return;
		}
		if (arg0) {
			this.aClass232_1.anIntArray585 = null;
			this.aClass232_1.aClass87_1 = null;
		}
		this.aClass232_1.anIntArrayArray60 = null;
		this.aClass232_1.aClass87Array1 = null;
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z")
	private boolean method3676() {
		if (this.aClass232_1 == null) {
			this.aClass232_1 = this.aClass193_1.method4422();
			if (this.aClass232_1 == null) {
				return false;
			}
			this.anObjectArray33 = new Object[this.aClass232_1.anInt6729];
			this.anObjectArrayArray1 = new Object[this.aClass232_1.anInt6729][];
		}
		return true;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(II[II)Z")
	private boolean method3678(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3688(arg2)) {
			return false;
		} else if (this.anObjectArray33[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass232_1.anIntArray583[arg2];
			@Pc(31) int[] local31 = this.aClass232_1.anIntArrayArray59[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass232_1.anIntArray584[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(61) int local61;
				if (local31 == null) {
					local61 = local55;
				} else {
					local61 = local31[local55];
				}
				if (local51[local61] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(119) byte[] local119;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local119 = Static326.method2435(this.anObjectArray33[arg2], false);
			} else {
				local119 = Static326.method2435(this.anObjectArray33[arg2], true);
				@Pc(134) Class4_Sub30 local134 = new Class4_Sub30(local119);
				local134.method4869(arg1, local134.aByteArray79.length);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Static444.method5711(local119);
			} catch (@Pc(148) RuntimeException local148) {
				throw Static181.method2908(local148, "T3 - " + (arg1 != null) + "," + arg2 + "," + local119.length + "," + Static183.method2712(local119.length, local119) + "," + Static183.method2712(local119.length - 2, local119) + "," + this.aClass232_1.anIntArray580[arg2] + "," + this.aClass232_1.anInt6723);
			}
			if (this.aBoolean343) {
				this.anObjectArray33[arg2] = null;
			}
			@Pc(225) int local225;
			if (local25 > 1) {
				@Pc(232) int local232;
				@Pc(245) Class4_Sub30 local245;
				@Pc(253) int local253;
				@Pc(257) int local257;
				@Pc(259) int local259;
				@Pc(317) int local317;
				@Pc(319) int local319;
				@Pc(323) int local323;
				@Pc(325) int local325;
				if (this.anInt4829 == 2) {
					local225 = local146.length;
					local225--;
					local232 = local146[local225] & 0xFF;
					local225 -= local232 * local25 * 4;
					local245 = new Class4_Sub30(local146);
					@Pc(437) int local437 = 0;
					local245.anInt6244 = local225;
					local253 = 0;
					for (local257 = 0; local257 < local232; local257++) {
						local259 = 0;
						for (local317 = 0; local317 < local25; local317++) {
							local259 += local245.method4872();
							if (local31 == null) {
								local319 = local317;
							} else {
								local319 = local31[local317];
							}
							if (local319 == arg0) {
								local253 = local319;
								local437 += local259;
							}
						}
					}
					if (local437 == 0) {
						return true;
					}
					@Pc(503) byte[] local503 = new byte[local437];
					local437 = 0;
					local245.anInt6244 = local225;
					local317 = 0;
					for (local319 = 0; local319 < local232; local319++) {
						local323 = 0;
						for (local325 = 0; local325 < local25; local325++) {
							local323 += local245.method4872();
							@Pc(530) int local530;
							if (local31 == null) {
								local530 = local325;
							} else {
								local530 = local31[local325];
							}
							if (local530 == arg0) {
								Static457.method1215(local146, local317, local503, local437, local323);
								local437 += local323;
							}
							local317 += local323;
						}
					}
					local51[local253] = local503;
				} else {
					local225 = local146.length;
					@Pc(228) int local228 = local225 - 1;
					local232 = local146[local228] & 0xFF;
					@Pc(240) int local240 = local228 - local25 * 4 * local232;
					local245 = new Class4_Sub30(local146);
					local245.anInt6244 = local240;
					@Pc(251) int[] local251 = new int[local25];
					for (local253 = 0; local253 < local232; local253++) {
						local257 = 0;
						for (local259 = 0; local259 < local25; local259++) {
							local257 += local245.method4872();
							local251[local259] += local257;
						}
					}
					@Pc(293) byte[][] local293 = new byte[local25][];
					for (local259 = 0; local259 < local25; local259++) {
						local293[local259] = new byte[local251[local259]];
						local251[local259] = 0;
					}
					local245.anInt6244 = local240;
					local317 = 0;
					for (local319 = 0; local319 < local232; local319++) {
						local323 = 0;
						for (local325 = 0; local325 < local25; local325++) {
							local323 += local245.method4872();
							Static457.method1215(local146, local317, local293[local325], local251[local325], local323);
							local317 += local323;
							local251[local325] += local323;
						}
					}
					for (local323 = 0; local323 < local25; local323++) {
						if (local31 == null) {
							local325 = local323;
						} else {
							local325 = local31[local323];
						}
						if (this.anInt4829 == 0) {
							local51[local325] = Static36.method661(local293[local323]);
						} else {
							local51[local325] = local293[local323];
						}
					}
				}
			} else {
				if (local31 == null) {
					local225 = 0;
				} else {
					local225 = local31[0];
				}
				if (this.anInt4829 == 0) {
					local51[local225] = Static36.method661(local146);
				} else {
					local51[local225] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3679(@OriginalArg(1) String arg0) {
		if (this.method3676()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass232_1.aClass87_1.method1905(Static170.method4308(local14));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(II)Z")
	public boolean method3680(@OriginalArg(1) int arg0) {
		if (!this.method3688(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method3699(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3682(@OriginalArg(1) String arg0) {
		if (this.method3676()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass232_1.aClass87_1.method1905(Static170.method4308(local17));
			return this.method3680(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(II)V")
	private void method3683(@OriginalArg(1) int arg0) {
		this.aClass193_1.method4424(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)[B")
	public byte[] method3684(@OriginalArg(1) int arg0) {
		if (!this.method3676()) {
			return null;
		} else if (this.aClass232_1.anIntArray584.length == 1) {
			return this.method3696(arg0, 0);
		} else if (!this.method3688(arg0)) {
			return null;
		} else if (this.aClass232_1.anIntArray584[arg0] == 1) {
			return this.method3696(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)Z")
	private boolean method3685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3676()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass232_1.anIntArray584.length > arg0 && arg1 < this.aClass232_1.anIntArray584[arg0]) {
			return true;
		} else if (Static35.aBoolean42) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V")
	public void method3686() {
		if (this.anObjectArray33 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArray33.length; local15++) {
				this.anObjectArray33[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(II)[I")
	public int[] method3687(@OriginalArg(0) int arg0) {
		if (!this.method3688(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.aClass232_1.anIntArrayArray59[arg0];
		if (local22 == null) {
			local22 = new int[this.aClass232_1.anIntArray583[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local22.length) {
				local22[local33] = local33++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(ZI)Z")
	private boolean method3688(@OriginalArg(1) int arg0) {
		if (!this.method3676()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass232_1.anIntArray584.length && this.aClass232_1.anIntArray584[arg0] != 0) {
			return true;
		} else if (Static35.aBoolean42) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)Z")
	public boolean method3689() {
		if (!this.method3676()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass232_1.anIntArray582.length; local15++) {
			@Pc(23) int local23 = this.aClass232_1.anIntArray582[local15];
			if (this.anObjectArray33[local23] == null) {
				this.method3699(local23);
				if (this.anObjectArray33[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(II)I")
	public int method3691(@OriginalArg(1) int arg0) {
		return this.method3688(arg0) ? this.aClass232_1.anIntArray584[arg0] : 0;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method3692(@OriginalArg(1) String arg0) {
		if (this.method3676()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass232_1.aClass87_1.method1905(Static170.method4308(local12));
			return this.method3669(local25);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(III)Z")
	public boolean method3693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3685(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method3699(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(II)V")
	public void method3694(@OriginalArg(0) int arg0) {
		if (this.method3688(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)I")
	public int method3695() {
		return this.method3676() ? this.aClass232_1.anIntArray584.length : -1;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(III)[B")
	public byte[] method3696(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method3666(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method3698(@OriginalArg(0) String arg0) {
		if (this.method3676()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass232_1.aClass87_1.method1905(Static170.method4308(local20));
			return this.method3688(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(II)V")
	private void method3699(@OriginalArg(1) int arg0) {
		if (this.aBoolean343) {
			this.anObjectArray33[arg0] = this.aClass193_1.method4425(arg0);
		} else {
			this.anObjectArray33[arg0] = Static36.method661(this.aClass193_1.method4425(arg0));
		}
	}
}
