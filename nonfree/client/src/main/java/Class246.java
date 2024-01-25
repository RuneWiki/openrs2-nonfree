import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class246 {

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray5;

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "Lclient!hd;")
	private Class101 aClass101_2 = null;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Lclient!gk;")
	private final Class90 aClass90_1;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Z")
	private final boolean aBoolean448;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public int anInt6592;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!gk;ZI)V")
	public Class246(@OriginalArg(0) Class90 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass90_1 = arg0;
		this.aBoolean448 = arg1;
		this.anInt6592 = arg2;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method5474() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArrayArray1.length; local4++) {
				this.anObjectArrayArray1[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Z")
	private boolean method5476(@OriginalArg(1) int arg0) {
		if (!this.method5505()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass101_2.anIntArray218.length && this.aClass101_2.anIntArray218[arg0] != 0) {
			return true;
		} else if (Static40.aBoolean39) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)[B")
	public byte[] method5477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method5495(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5478(@OriginalArg(0) String arg0) {
		if (this.method5505()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass101_2.aClass138_1.method3300(Static375.method5099(local12));
			return this.method5476(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(II)I")
	public int method5479(@OriginalArg(0) int arg0) {
		if (this.method5505()) {
			@Pc(16) int local16 = this.aClass101_2.aClass138_1.method3300(arg0);
			return this.method5476(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
	public int method5480() {
		if (!this.method5505()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray5.length; local25++) {
			if (this.aClass101_2.anIntArray219[local25] > 0) {
				local13 += 100;
				local23 += this.method5498(local25);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local23 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(II)[I")
	public int[] method5481(@OriginalArg(1) int arg0) {
		if (!this.method5476(arg0)) {
			return null;
		}
		@Pc(16) int[] local16 = this.aClass101_2.anIntArrayArray26[arg0];
		if (local16 == null) {
			local16 = new int[this.aClass101_2.anIntArray219[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local16.length) {
				local16[local35] = local35++;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public void method5482(@OriginalArg(0) String arg0) {
		if (this.method5505()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass101_2.aClass138_1.method3300(Static375.method5099(local19));
			this.method5496(local28);
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)I")
	public int method5483() {
		if (!this.method5505()) {
			throw new IllegalStateException("");
		}
		return this.aClass101_2.anInt2771;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method5484(@OriginalArg(0) String arg0) {
		if (this.method5505()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass101_2.aClass138_1.method3300(Static375.method5099(local12));
			return this.method5498(local23);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
	private boolean method5487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5505()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass101_2.anIntArray218.length && arg1 < this.aClass101_2.anIntArray218[arg0]) {
			return true;
		} else if (Static40.aBoolean39) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5488(@OriginalArg(1) String arg0) {
		if (this.method5505()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass101_2.aClass138_1.method3300(Static375.method5099(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)Z")
	public boolean method5489(@OriginalArg(1) int arg0) {
		if (!this.method5476(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method5507(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZI)Z")
	public boolean method5490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5487(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray5[arg1] == null) {
			this.method5507(arg1);
			return this.anObjectArray5[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B")
	public byte[] method5491(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5505()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(28) int local28 = this.aClass101_2.aClass138_1.method3300(Static375.method5099(local12));
		if (this.method5476(local28)) {
			@Pc(55) int local55 = this.aClass101_2.aClass138Array1[local28].method3300(Static375.method5099(local15));
			return this.method5477(local28, local55);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(II)I")
	public int method5492(@OriginalArg(0) int arg0) {
		return this.method5476(arg0) ? this.aClass101_2.anIntArray218[arg0] : 0;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
	public void method5493() {
		if (this.anObjectArray5 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArray5.length; local15++) {
				this.anObjectArray5[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[III)Z")
	private boolean method5494(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method5476(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass101_2.anIntArray219[arg0];
			@Pc(29) int[] local29 = this.aClass101_2.anIntArrayArray26[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass101_2.anIntArray218[arg0]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg0];
			@Pc(51) boolean local51 = true;
			for (@Pc(53) int local53 = 0; local53 < local23; local53++) {
				@Pc(58) int local58;
				if (local29 == null) {
					local58 = local53;
				} else {
					local58 = local29[local53];
				}
				if (local49[local58] == null) {
					local51 = false;
					break;
				}
			}
			if (local51) {
				return true;
			}
			@Pc(107) byte[] local107;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local107 = Static418.method5565(this.anObjectArray5[arg0], false);
			} else {
				local107 = Static418.method5565(this.anObjectArray5[arg0], true);
				@Pc(121) Class1_Sub5 local121 = new Class1_Sub5(local107);
				local121.method5360(local121.aByteArray89.length, arg1);
			}
			@Pc(133) byte[] local133;
			try {
				local133 = Static107.method1963(local107);
			} catch (@Pc(141) RuntimeException local141) {
				throw Static224.method3443(local141, "T3 - " + (arg1 != null) + "," + arg0 + "," + local107.length + "," + Static101.method1834(local107, local107.length) + "," + Static101.method1834(local107, local107.length - 2) + "," + this.aClass101_2.anIntArray217[arg0] + "," + this.aClass101_2.anInt2771);
			}
			if (this.aBoolean448) {
				this.anObjectArray5[arg0] = null;
			}
			@Pc(215) int local215;
			if (local23 <= 1) {
				if (local29 == null) {
					local215 = 0;
				} else {
					local215 = local29[0];
				}
				if (this.anInt6592 == 0) {
					local49[local215] = Static105.method1873(local133);
				} else {
					local49[local215] = local133;
				}
			} else {
				@Pc(251) int local251;
				@Pc(264) Class1_Sub5 local264;
				@Pc(268) int local268;
				@Pc(273) int local273;
				@Pc(276) int local276;
				@Pc(278) int local278;
				@Pc(289) int local289;
				@Pc(338) int local338;
				@Pc(340) int local340;
				if (this.anInt6592 == 2) {
					local215 = local133.length;
					local215--;
					local251 = local133[local215] & 0xFF;
					local215 -= local251 * local23 * 4;
					local264 = new Class1_Sub5(local133);
					@Pc(266) int local266 = 0;
					local268 = 0;
					local264.anInt6475 = local215;
					for (local273 = 0; local273 < local251; local273++) {
						local276 = 0;
						for (local278 = 0; local278 < local23; local278++) {
							local276 += local264.method5407();
							if (local29 == null) {
								local289 = local278;
							} else {
								local289 = local29[local278];
							}
							if (arg2 == local289) {
								local268 = local289;
								local266 += local276;
							}
						}
					}
					if (local266 == 0) {
						return true;
					}
					@Pc(326) byte[] local326 = new byte[local266];
					local264.anInt6475 = local215;
					local266 = 0;
					local278 = 0;
					for (local289 = 0; local289 < local251; local289++) {
						local338 = 0;
						for (local340 = 0; local340 < local23; local340++) {
							local338 += local264.method5407();
							@Pc(353) int local353;
							if (local29 == null) {
								local353 = local340;
							} else {
								local353 = local29[local340];
							}
							if (arg2 == local353) {
								Static468.method4329(local133, local278, local326, local266, local338);
								local266 += local338;
							}
							local278 += local338;
						}
					}
					local49[local268] = local326;
				} else {
					local215 = local133.length;
					local215--;
					local251 = local133[local215] & 0xFF;
					local215 -= local23 * local251 * 4;
					local264 = new Class1_Sub5(local133);
					local264.anInt6475 = local215;
					@Pc(419) int[] local419 = new int[local23];
					for (local268 = 0; local268 < local251; local268++) {
						local273 = 0;
						for (local276 = 0; local276 < local23; local276++) {
							local273 += local264.method5407();
							local419[local276] += local273;
						}
					}
					@Pc(455) byte[][] local455 = new byte[local23][];
					for (local276 = 0; local276 < local23; local276++) {
						local455[local276] = new byte[local419[local276]];
						local419[local276] = 0;
					}
					local264.anInt6475 = local215;
					local278 = 0;
					for (local289 = 0; local289 < local251; local289++) {
						local338 = 0;
						for (local340 = 0; local340 < local23; local340++) {
							local338 += local264.method5407();
							Static468.method4329(local133, local278, local455[local340], local419[local340], local338);
							local278 += local338;
							local419[local340] += local338;
						}
					}
					for (local338 = 0; local338 < local23; local338++) {
						if (local29 == null) {
							local340 = local338;
						} else {
							local340 = local29[local338];
						}
						if (this.anInt6592 == 0) {
							local49[local340] = Static105.method1873(local455[local338]);
						} else {
							local49[local340] = local455[local338];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI[I)[B")
	public byte[] method5495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method5487(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(32) boolean local32 = this.method5494(arg0, arg2, arg1);
			if (!local32) {
				this.method5507(arg0);
				local32 = this.method5494(arg0, arg2, arg1);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static418.method5565(this.anObjectArrayArray1[arg0][arg1], false);
		if (this.anInt6592 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass101_2.anIntArray218[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt6592 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local61;
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(II)V")
	private void method5496(@OriginalArg(0) int arg0) {
		this.aClass90_1.method3336(arg0);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(BI)Z")
	public boolean method5497(@OriginalArg(1) int arg0) {
		if (!this.method5505()) {
			return false;
		} else if (this.aClass101_2.anIntArray218.length == 1) {
			return this.method5490(arg0, 0);
		} else if (!this.method5476(arg0)) {
			return false;
		} else if (this.aClass101_2.anIntArray218[arg0] == 1) {
			return this.method5490(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(II)I")
	private int method5498(@OriginalArg(1) int arg0) {
		if (this.method5476(arg0)) {
			return this.anObjectArray5[arg0] == null ? this.aClass90_1.method3341(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "(II)[B")
	public byte[] method5499(@OriginalArg(0) int arg0) {
		if (!this.method5505()) {
			return null;
		} else if (this.aClass101_2.anIntArray218.length == 1) {
			return this.method5477(0, arg0);
		} else if (!this.method5476(arg0)) {
			return null;
		} else if (this.aClass101_2.anIntArray218[arg0] == 1) {
			return this.method5477(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5500(@OriginalArg(0) String arg0) {
		if (this.method5505()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass101_2.aClass138_1.method3300(Static375.method5099(local12));
			return this.method5489(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZZI)V")
	public void method5501(@OriginalArg(1) boolean arg0) {
		if (!this.method5505()) {
			return;
		}
		if (arg0) {
			this.aClass101_2.anIntArray215 = null;
			this.aClass101_2.aClass138_1 = null;
		}
		this.aClass101_2.anIntArrayArray27 = null;
		this.aClass101_2.aClass138Array1 = null;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)I")
	public int method5502() {
		return this.method5505() ? this.aClass101_2.anIntArray218.length : -1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
	public void method5503(@OriginalArg(0) int arg0) {
		if (this.method5476(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z")
	public boolean method5504() {
		if (!this.method5505()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass101_2.anIntArray216.length; local15++) {
			@Pc(23) int local23 = this.aClass101_2.anIntArray216[local15];
			if (this.anObjectArray5[local23] == null) {
				this.method5507(local23);
				if (this.anObjectArray5[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)Z")
	private boolean method5505() {
		if (this.aClass101_2 == null) {
			this.aClass101_2 = this.aClass90_1.method3335();
			if (this.aClass101_2 == null) {
				return false;
			}
			this.anObjectArray5 = new Object[this.aClass101_2.anInt2769];
			this.anObjectArrayArray1 = new Object[this.aClass101_2.anInt2769][];
		}
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method5506(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5505()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass101_2.aClass138_1.method3300(Static375.method5099(local12));
		if (this.method5476(local26)) {
			@Pc(51) int local51 = this.aClass101_2.aClass138Array1[local26].method3300(Static375.method5099(local15));
			return this.method5490(local51, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(IB)V")
	private void method5507(@OriginalArg(0) int arg0) {
		if (this.aBoolean448) {
			this.anObjectArray5[arg0] = this.aClass90_1.method3339(arg0);
		} else {
			this.anObjectArray5[arg0] = Static105.method1873(this.aClass90_1.method3339(arg0));
		}
	}
}
