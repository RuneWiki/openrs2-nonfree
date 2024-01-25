import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class165 {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!qj", name = "N", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray5;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Lclient!md;")
	private Class126 aClass126_2 = null;

	@OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
	public int anInt4890;

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "Lclient!or;")
	private final Class56 aClass56_1;

	@OriginalMember(owner = "client!qj", name = "X", descriptor = "Z")
	private final boolean aBoolean410;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!or;ZI)V")
	public Class165(@OriginalArg(0) Class56 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt4890 = arg2;
		this.aClass56_1 = arg0;
		this.aBoolean410 = arg1;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method4474(@OriginalArg(1) String arg0) {
		if (this.method4493()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass126_2.aClass157_1.method4259(Static31.method865(local11));
			this.method4507(local20);
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)I")
	public int method4475(@OriginalArg(0) int arg0) {
		if (this.method4493()) {
			@Pc(21) int local21 = this.aClass126_2.aClass157_1.method4259(arg0);
			return this.method4504(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	public boolean method4477(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4493()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass126_2.aClass157_1.method4259(Static31.method865(local12));
		if (this.method4504(local24)) {
			@Pc(50) int local50 = this.aClass126_2.aClass157Array1[local24].method4259(Static31.method865(local15));
			return this.method4485(local24, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
	public int method4479() {
		if (!this.method4493()) {
			throw new IllegalStateException("");
		}
		return this.aClass126_2.anInt3925;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B")
	public byte[] method4480(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4493()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass126_2.aClass157_1.method4259(Static31.method865(local12));
		if (this.method4504(local24)) {
			@Pc(42) int local42 = this.aClass126_2.aClass157Array1[local24].method4259(Static31.method865(local15));
			return this.method4508(local42, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method4481(@OriginalArg(0) String arg0) {
		if (this.method4493()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass126_2.aClass157_1.method4259(Static31.method865(local12));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)V")
	public void method4482(@OriginalArg(1) int arg0) {
		if (this.method4504(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
	public int method4484() {
		if (!this.method4493()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray5.length; local17++) {
			if (this.aClass126_2.anIntArray464[local17] > 0) {
				local15 += this.method4506(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Z")
	public boolean method4485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4489(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method4496(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(II)Z")
	public boolean method4486(@OriginalArg(0) int arg0) {
		if (!this.method4493()) {
			return false;
		} else if (this.aClass126_2.anIntArray468.length == 1) {
			return this.method4485(0, arg0);
		} else if (!this.method4504(arg0)) {
			return false;
		} else if (this.aClass126_2.anIntArray468[arg0] == 1) {
			return this.method4485(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(II)Z")
	public boolean method4487(@OriginalArg(1) int arg0) {
		if (!this.method4504(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method4496(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B[III)[B")
	public byte[] method4488(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4489(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(30) boolean local30 = this.method4505(arg2, arg1, arg0);
			if (!local30) {
				this.method4496(arg2);
				local30 = this.method4505(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static156.method2953(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt4890 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass126_2.anIntArray468[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt4890 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local64;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)Z")
	private boolean method4489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4493()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass126_2.anIntArray468.length && arg1 < this.aClass126_2.anIntArray468[arg0]) {
			return true;
		} else if (Static233.aBoolean383) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZ)V")
	public void method4490(@OriginalArg(2) boolean arg0) {
		if (!this.method4493()) {
			return;
		}
		this.aClass126_2.anIntArrayArray41 = null;
		this.aClass126_2.aClass157Array1 = null;
		if (arg0) {
			this.aClass126_2.aClass157_1 = null;
			this.aClass126_2.anIntArray469 = null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Z")
	public boolean method4491() {
		if (!this.method4493()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass126_2.anIntArray465.length; local20++) {
			@Pc(28) int local28 = this.aClass126_2.anIntArray465[local20];
			if (this.anObjectArray5[local28] == null) {
				this.method4496(local28);
				if (this.anObjectArray5[local28] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(II)[B")
	public byte[] method4492(@OriginalArg(0) int arg0) {
		if (!this.method4493()) {
			return null;
		} else if (this.aClass126_2.anIntArray468.length == 1) {
			return this.method4508(arg0, 0);
		} else if (!this.method4504(arg0)) {
			return null;
		} else if (this.aClass126_2.anIntArray468[arg0] == 1) {
			return this.method4508(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)Z")
	private boolean method4493() {
		if (this.aClass126_2 == null) {
			this.aClass126_2 = this.aClass56_1.method1637();
			if (this.aClass126_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass126_2.anInt3922][];
			this.anObjectArray5 = new Object[this.aClass126_2.anInt3922];
		}
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4494(@OriginalArg(0) String arg0) {
		if (this.method4493()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass126_2.aClass157_1.method4259(Static31.method865(local20));
			return this.method4487(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
	public void method4495() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V")
	private void method4496(@OriginalArg(0) int arg0) {
		if (this.aBoolean410) {
			this.anObjectArray5[arg0] = this.aClass56_1.method1641(arg0);
		} else {
			this.anObjectArray5[arg0] = Static185.method1071(this.aClass56_1.method1641(arg0));
		}
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
	public void method4498() {
		if (this.anObjectArray5 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArray5.length; local17++) {
				this.anObjectArray5[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "(II)I")
	public int method4499(@OriginalArg(1) int arg0) {
		return this.method4504(arg0) ? this.aClass126_2.anIntArray468[arg0] : 0;
	}

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "(II)[I")
	public int[] method4500(@OriginalArg(0) int arg0) {
		if (!this.method4504(arg0)) {
			return null;
		}
		@Pc(20) int[] local20 = this.aClass126_2.anIntArrayArray40[arg0];
		if (local20 == null) {
			local20 = new int[this.aClass126_2.anIntArray464[arg0]];
			@Pc(31) int local31 = 0;
			while (local20.length > local31) {
				local20[local31] = local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method4501(@OriginalArg(0) String arg0) {
		if (this.method4493()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass126_2.aClass157_1.method4259(Static31.method865(local12));
			return this.method4506(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method4502(@OriginalArg(1) String arg0) {
		if (this.method4493()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass126_2.aClass157_1.method4259(Static31.method865(local18));
			return this.method4504(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)I")
	public int method4503() {
		return this.method4493() ? this.aClass126_2.anIntArray468.length : -1;
	}

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "(II)Z")
	private boolean method4504(@OriginalArg(0) int arg0) {
		if (!this.method4493()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass126_2.anIntArray468.length && this.aClass126_2.anIntArray468[arg0] != 0) {
			return true;
		} else if (Static233.aBoolean383) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III[I)Z")
	private boolean method4505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4504(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass126_2.anIntArray464[arg0];
			@Pc(31) int[] local31 = this.aClass126_2.anIntArrayArray40[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass126_2.anIntArray468[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
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
			@Pc(116) byte[] local116;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local116 = Static156.method2953(this.anObjectArray5[arg0], false);
			} else {
				local116 = Static156.method2953(this.anObjectArray5[arg0], true);
				@Pc(131) Class1_Sub7 local131 = new Class1_Sub7(local116);
				local131.method3122(local131.aByteArray58.length, arg2);
			}
			@Pc(143) byte[] local143;
			try {
				local143 = Static222.method4058(local116);
			} catch (@Pc(145) RuntimeException local145) {
				throw Static69.method1391(local145, "T3 - " + (arg2 != null) + "," + arg0 + "," + local116.length + "," + Static63.method1325(local116, local116.length) + "," + Static63.method1325(local116, local116.length - 2) + "," + this.aClass126_2.anIntArray466[arg0] + "," + this.aClass126_2.anInt3925);
			}
			if (this.aBoolean410) {
				this.anObjectArray5[arg0] = null;
			}
			@Pc(225) int local225;
			if (local25 > 1) {
				@Pc(232) int local232;
				@Pc(245) Class1_Sub7 local245;
				@Pc(249) int local249;
				@Pc(254) int local254;
				@Pc(258) int local258;
				@Pc(260) int local260;
				@Pc(272) int local272;
				@Pc(318) int local318;
				@Pc(320) int local320;
				if (this.anInt4890 == 2) {
					local225 = local143.length;
					@Pc(228) int local228 = local225 - 1;
					local232 = local143[local228] & 0xFF;
					@Pc(240) int local240 = local228 - local232 * local25 * 4;
					local245 = new Class1_Sub7(local143);
					@Pc(247) int local247 = 0;
					local249 = 0;
					local245.anInt3368 = local240;
					for (local254 = 0; local254 < local232; local254++) {
						local258 = 0;
						for (local260 = 0; local260 < local25; local260++) {
							local258 += local245.method3125();
							if (local31 == null) {
								local272 = local260;
							} else {
								local272 = local31[local260];
							}
							if (local272 == arg1) {
								local247 += local258;
								local249 = local272;
							}
						}
					}
					if (local247 == 0) {
						return true;
					}
					@Pc(305) byte[] local305 = new byte[local247];
					local247 = 0;
					local245.anInt3368 = local240;
					local260 = 0;
					for (local272 = 0; local272 < local232; local272++) {
						local318 = 0;
						for (local320 = 0; local320 < local25; local320++) {
							local318 += local245.method3125();
							@Pc(332) int local332;
							if (local31 == null) {
								local332 = local320;
							} else {
								local332 = local31[local320];
							}
							if (local332 == arg1) {
								Static367.method5383(local143, local260, local305, local247, local318);
								local247 += local318;
							}
							local260 += local318;
						}
					}
					local51[local249] = local305;
				} else {
					local225 = local143.length;
					local225--;
					local232 = local143[local225] & 0xFF;
					local225 -= local232 * local25 * 4;
					local245 = new Class1_Sub7(local143);
					local245.anInt3368 = local225;
					@Pc(402) int[] local402 = new int[local25];
					for (local249 = 0; local249 < local232; local249++) {
						local254 = 0;
						for (local258 = 0; local258 < local25; local258++) {
							local254 += local245.method3125();
							local402[local258] += local254;
						}
					}
					@Pc(440) byte[][] local440 = new byte[local25][];
					for (local258 = 0; local258 < local25; local258++) {
						local440[local258] = new byte[local402[local258]];
						local402[local258] = 0;
					}
					local245.anInt3368 = local225;
					local260 = 0;
					for (local272 = 0; local272 < local232; local272++) {
						local318 = 0;
						for (local320 = 0; local320 < local25; local320++) {
							local318 += local245.method3125();
							Static367.method5383(local143, local260, local440[local320], local402[local320], local318);
							local402[local320] += local318;
							local260 += local318;
						}
					}
					for (local318 = 0; local318 < local25; local318++) {
						if (local31 == null) {
							local320 = local318;
						} else {
							local320 = local31[local318];
						}
						if (this.anInt4890 == 0) {
							local51[local320] = Static185.method1071(local440[local318]);
						} else {
							local51[local320] = local440[local318];
						}
					}
				}
			} else {
				if (local31 == null) {
					local225 = 0;
				} else {
					local225 = local31[0];
				}
				if (this.anInt4890 == 0) {
					local51[local225] = Static185.method1071(local143);
				} else {
					local51[local225] = local143;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "(II)I")
	private int method4506(@OriginalArg(0) int arg0) {
		if (this.method4504(arg0)) {
			return this.anObjectArray5[arg0] == null ? this.aClass56_1.method1636(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
	private void method4507(@OriginalArg(0) int arg0) {
		this.aClass56_1.method1639(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZI)[B")
	public byte[] method4508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method4488(null, arg0, arg1);
	}
}
