import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class246 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "Lclient!ot;")
	private Class250 aClass250_1 = null;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "Z")
	private final boolean aBoolean538;

	@OriginalMember(owner = "client!om", name = "P", descriptor = "I")
	public int anInt6627;

	@OriginalMember(owner = "client!om", name = "D", descriptor = "Lclient!sda;")
	private final Class303 aClass303_1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!sda;ZI)V")
	public Class246(@OriginalArg(0) Class303 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean538 = arg1;
		this.anInt6627 = arg2;
		this.aClass303_1 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([IIII)[B")
	public byte[] method5647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method5678(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(38) boolean local38 = this.method5657(arg0, arg1, arg2);
			if (!local38) {
				this.method5680(arg2);
				local38 = this.method5657(arg0, arg1, arg2);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static403.method5862(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.anInt6627 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass250_1.anIntArray534[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt6627 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method5648(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5676()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(30) int local30 = this.aClass250_1.aClass338_1.method7133(Static45.method774(local12));
		if (this.method5660(local30)) {
			@Pc(50) int local50 = this.aClass250_1.aClass338Array1[local30].method7133(Static45.method774(local15));
			return this.method5653(local30, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Z")
	public boolean method5649() {
		if (!this.method5676()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass250_1.anIntArray536.length; local22++) {
			@Pc(30) int local30 = this.aClass250_1.anIntArray536[local22];
			if (this.anObjectArray32[local30] == null) {
				this.method5680(local30);
				if (this.anObjectArray32[local30] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5651(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = this.method5665("");
		return local8 == -1 ? this.method5674(arg0, "") : this.method5674("", arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
	private void method5652(@OriginalArg(0) int arg0) {
		this.aClass303_1.method6951(arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)[B")
	public byte[] method5653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method5647(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
	public boolean method5654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5678(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method5680(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method5655(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5676()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass250_1.aClass338_1.method7133(Static45.method774(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(39) int local39 = this.aClass250_1.aClass338Array1[local24].method7133(Static45.method774(local15));
			return local39 >= 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)I")
	public int method5656() {
		if (!this.method5676()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray32.length; local17++) {
			if (this.aClass250_1.anIntArray537[local17] > 0) {
				local15 += this.method5681(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([IIZI)Z")
	private boolean method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5660(arg2)) {
			return false;
		} else if (this.anObjectArray32[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass250_1.anIntArray537[arg2];
			@Pc(31) int[] local31 = this.aClass250_1.anIntArrayArray51[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass250_1.anIntArray534[arg2]];
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
			@Pc(116) byte[] local116;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local116 = Static403.method5862(false, this.anObjectArray32[arg2]);
			} else {
				local116 = Static403.method5862(true, this.anObjectArray32[arg2]);
				@Pc(121) Class3_Sub11 local121 = new Class3_Sub11(local116);
				local121.method3082(arg0, local121.aByteArray36.length);
			}
			@Pc(143) byte[] local143;
			try {
				local143 = Static39.method723(local116);
			} catch (@Pc(145) RuntimeException local145) {
				throw Static87.method1967(local145, "T3 - " + (arg0 != null) + "," + arg2 + "," + local116.length + "," + Static574.method7620(local116.length, local116) + "," + Static574.method7620(local116.length - 2, local116) + "," + this.aClass250_1.anIntArray533[arg2] + "," + this.aClass250_1.anInt6694);
			}
			if (this.aBoolean538) {
				this.anObjectArray32[arg2] = null;
			}
			@Pc(225) int local225;
			if (local25 > 1) {
				@Pc(232) int local232;
				@Pc(245) Class3_Sub11 local245;
				@Pc(252) int local252;
				@Pc(254) int local254;
				@Pc(258) int local258;
				@Pc(260) int local260;
				@Pc(272) int local272;
				@Pc(327) int local327;
				@Pc(329) int local329;
				if (this.anInt6627 == 2) {
					local225 = local143.length;
					@Pc(227) int local227 = local225 - 1;
					local232 = local143[local227] & 0xFF;
					@Pc(240) int local240 = local227 - local25 * local232 * 4;
					local245 = new Class3_Sub11(local143);
					@Pc(247) int local247 = 0;
					local245.anInt3520 = local240;
					local252 = 0;
					for (local254 = 0; local254 < local232; local254++) {
						local258 = 0;
						for (local260 = 0; local260 < local25; local260++) {
							local258 += local245.method3116();
							if (local31 == null) {
								local272 = local260;
							} else {
								local272 = local31[local260];
							}
							if (local272 == arg1) {
								local247 += local258;
								local252 = local272;
							}
						}
					}
					if (local247 == 0) {
						return true;
					}
					@Pc(314) byte[] local314 = new byte[local247];
					local245.anInt3520 = local240;
					local247 = 0;
					local260 = 0;
					for (local272 = 0; local272 < local232; local272++) {
						local327 = 0;
						for (local329 = 0; local329 < local25; local329++) {
							local327 += local245.method3116();
							@Pc(343) int local343;
							if (local31 == null) {
								local343 = local329;
							} else {
								local343 = local31[local329];
							}
							if (local343 == arg1) {
								Static604.method5910(local143, local260, local314, local247, local327);
								local247 += local327;
							}
							local260 += local327;
						}
					}
					local51[local252] = local314;
				} else {
					local225 = local143.length;
					local225--;
					local232 = local143[local225] & 0xFF;
					local225 -= local25 * 4 * local232;
					local245 = new Class3_Sub11(local143);
					local245.anInt3520 = local225;
					@Pc(415) int[] local415 = new int[local25];
					for (local252 = 0; local252 < local232; local252++) {
						local254 = 0;
						for (local258 = 0; local258 < local25; local258++) {
							local254 += local245.method3116();
							local415[local258] += local254;
						}
					}
					@Pc(449) byte[][] local449 = new byte[local25][];
					for (local258 = 0; local258 < local25; local258++) {
						local449[local258] = new byte[local415[local258]];
						local415[local258] = 0;
					}
					local245.anInt3520 = local225;
					local260 = 0;
					for (local272 = 0; local272 < local232; local272++) {
						local327 = 0;
						for (local329 = 0; local329 < local25; local329++) {
							local327 += local245.method3116();
							Static604.method5910(local143, local260, local449[local329], local415[local329], local327);
							local415[local329] += local327;
							local260 += local327;
						}
					}
					for (local327 = 0; local327 < local25; local327++) {
						if (local31 == null) {
							local329 = local327;
						} else {
							local329 = local31[local327];
						}
						if (this.anInt6627 == 0) {
							local51[local329] = Static223.method3868(local449[local327]);
						} else {
							local51[local329] = local449[local327];
						}
					}
				}
			} else {
				if (local31 == null) {
					local225 = 0;
				} else {
					local225 = local31[0];
				}
				if (this.anInt6627 == 0) {
					local51[local225] = Static223.method3868(local143);
				} else {
					local51[local225] = local143;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(IZ)Z")
	public boolean method5658(@OriginalArg(0) int arg0) {
		if (!this.method5660(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method5680(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method5659(@OriginalArg(1) String arg0) {
		if (this.method5676()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass250_1.aClass338_1.method7133(Static45.method774(local17));
			this.method5652(local26);
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(IZ)Z")
	private boolean method5660(@OriginalArg(0) int arg0) {
		if (!this.method5676()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass250_1.anIntArray534.length && this.aClass250_1.anIntArray534[arg0] != 0) {
			return true;
		} else if (Static162.aBoolean266) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V")
	public void method5661() {
		if (this.anObjectArray32 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray32.length; local14++) {
				this.anObjectArray32[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public void method5662() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray1.length; local15++) {
				this.anObjectArrayArray1[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5663(@OriginalArg(0) String arg0) {
		if (this.method5676()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass250_1.aClass338_1.method7133(Static45.method774(local12));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5664(@OriginalArg(0) String arg0) {
		if (this.method5676()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass250_1.aClass338_1.method7133(Static45.method774(local17));
			return this.method5681(local28);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method5665(@OriginalArg(0) String arg0) {
		if (this.method5676()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass250_1.aClass338_1.method7133(Static45.method774(local12));
			return this.method5660(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(B)I")
	public int method5666() {
		if (!this.method5676()) {
			throw new IllegalStateException("");
		}
		return this.aClass250_1.anInt6694;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)Z")
	public boolean method5667(@OriginalArg(1) int arg0) {
		if (!this.method5676()) {
			return false;
		} else if (this.aClass250_1.anIntArray534.length == 1) {
			return this.method5654(0, arg0);
		} else if (!this.method5660(arg0)) {
			return false;
		} else if (this.aClass250_1.anIntArray534[arg0] == 1) {
			return this.method5654(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[I")
	public int[] method5668(@OriginalArg(0) int arg0) {
		if (!this.method5660(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass250_1.anIntArrayArray51[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass250_1.anIntArray537[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5669(@OriginalArg(1) String arg0) {
		if (this.method5676()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass250_1.aClass338_1.method7133(Static45.method774(local12));
			return this.method5658(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(IZ)I")
	public int method5670(@OriginalArg(0) int arg0) {
		if (this.method5676()) {
			@Pc(24) int local24 = this.aClass250_1.aClass338_1.method7133(arg0);
			return this.method5660(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZI)V")
	public void method5672(@OriginalArg(1) boolean arg0) {
		if (!this.method5676()) {
			return;
		}
		if (arg0) {
			this.aClass250_1.anIntArray535 = null;
			this.aClass250_1.aClass338_1 = null;
		}
		this.aClass250_1.anIntArrayArray52 = null;
		this.aClass250_1.aClass338Array1 = null;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)I")
	public int method5673(@OriginalArg(0) int arg0) {
		return this.method5660(arg0) ? this.aClass250_1.anIntArray534[arg0] : 0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	private boolean method5674(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5676()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass250_1.aClass338_1.method7133(Static45.method774(local12));
		if (this.method5660(local24)) {
			@Pc(52) int local52 = this.aClass250_1.aClass338Array1[local24].method7133(Static45.method774(local15));
			return this.method5654(local24, local52);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)Z")
	private boolean method5676() {
		if (this.aClass250_1 == null) {
			this.aClass250_1 = this.aClass303_1.method6950();
			if (this.aClass250_1 == null) {
				return false;
			}
			this.anObjectArray32 = new Object[this.aClass250_1.anInt6696];
			this.anObjectArrayArray1 = new Object[this.aClass250_1.anInt6696][];
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(II)V")
	public void method5677(@OriginalArg(1) int arg0) {
		if (this.method5660(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)Z")
	private boolean method5678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5676()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass250_1.anIntArray534.length && arg0 < this.aClass250_1.anIntArray534[arg1]) {
			return true;
		} else if (Static162.aBoolean266) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(II)[B")
	public byte[] method5679(@OriginalArg(1) int arg0) {
		if (!this.method5676()) {
			return null;
		} else if (this.aClass250_1.anIntArray534.length == 1) {
			return this.method5653(0, arg0);
		} else if (!this.method5660(arg0)) {
			return null;
		} else if (this.aClass250_1.anIntArray534[arg0] == 1) {
			return this.method5653(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(II)V")
	private void method5680(@OriginalArg(0) int arg0) {
		if (this.aBoolean538) {
			this.anObjectArray32[arg0] = this.aClass303_1.method6952(arg0);
		} else {
			this.anObjectArray32[arg0] = Static223.method3868(this.aClass303_1.method6952(arg0));
		}
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(II)I")
	private int method5681(@OriginalArg(0) int arg0) {
		if (this.method5660(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass303_1.method6953(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)I")
	public int method5682() {
		return this.method5676() ? this.aClass250_1.anIntArray534.length : -1;
	}
}
