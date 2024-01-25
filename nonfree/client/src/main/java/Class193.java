import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class193 {

	@OriginalMember(owner = "client!tj", name = "s", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!tj", name = "x", descriptor = "Lclient!r;")
	private Class171 aClass171_2 = null;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "Z")
	private final boolean aBoolean441;

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
	public int anInt5952;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!ag;")
	private final Class7 aClass7_1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!ag;ZI)V")
	public Class193(@OriginalArg(0) Class7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean441 = arg1;
		this.anInt5952 = arg2;
		this.aClass7_1 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method5034(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5059()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass171_2.aClass163_1.method4468(Static32.method560(local12));
		if (this.method5050(local24)) {
			@Pc(50) int local50 = this.aClass171_2.aClass163Array1[local24].method4468(Static32.method560(local15));
			return this.method5047(local24, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([IBII)[B")
	public byte[] method5035(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5036(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(35) boolean local35 = this.method5053(arg0, arg1, arg2);
			if (!local35) {
				this.method5057(arg1);
				local35 = this.method5053(arg0, arg1, arg2);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static283.method4822(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt5952 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass171_2.anIntArray439[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt5952 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Z")
	private boolean method5036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5059()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass171_2.anIntArray439.length && this.aClass171_2.anIntArray439[arg1] > arg0) {
			return true;
		} else if (Static332.aBoolean464) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)I")
	public int method5037() {
		return this.method5059() ? this.aClass171_2.anIntArray439.length : -1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)[I")
	public int[] method5038(@OriginalArg(0) int arg0) {
		if (!this.method5050(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass171_2.anIntArrayArray146[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass171_2.anIntArray437[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local26.length) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5040(@OriginalArg(0) String arg0) {
		if (this.method5059()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass171_2.aClass163_1.method4468(Static32.method560(local18));
			return this.method5042(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I")
	public int method5041(@OriginalArg(1) int arg0) {
		if (this.method5059()) {
			@Pc(16) int local16 = this.aClass171_2.aClass163_1.method4468(arg0);
			return this.method5050(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(IB)Z")
	public boolean method5042(@OriginalArg(0) int arg0) {
		if (!this.method5050(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method5057(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)I")
	private int method5043(@OriginalArg(0) int arg0) {
		if (this.method5050(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass7_1.method2584(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method5044(@OriginalArg(0) String arg0) {
		if (this.method5059()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass171_2.aClass163_1.method4468(Static32.method560(local17));
			return this.method5043(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5045(@OriginalArg(1) String arg0) {
		if (this.method5059()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass171_2.aClass163_1.method4468(Static32.method560(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method5046(@OriginalArg(0) String arg0) {
		if (this.method5059()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass171_2.aClass163_1.method4468(Static32.method560(local11));
			this.method5051(local24);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)[B")
	public byte[] method5047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method5035(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I")
	public int method5048() {
		if (!this.method5059()) {
			throw new IllegalStateException("");
		}
		return this.aClass171_2.anInt5363;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)[B")
	public byte[] method5049(@OriginalArg(1) int arg0) {
		if (!this.method5059()) {
			return null;
		} else if (this.aClass171_2.anIntArray439.length == 1) {
			return this.method5047(0, arg0);
		} else if (!this.method5050(arg0)) {
			return null;
		} else if (this.aClass171_2.anIntArray439[arg0] == 1) {
			return this.method5047(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Z")
	private boolean method5050(@OriginalArg(1) int arg0) {
		if (!this.method5059()) {
			return false;
		} else if (arg0 >= 0 && this.aClass171_2.anIntArray439.length > arg0 && this.aClass171_2.anIntArray439[arg0] != 0) {
			return true;
		} else if (Static332.aBoolean464) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)V")
	private void method5051(@OriginalArg(1) int arg0) {
		this.aClass7_1.method2579(arg0);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BZZ)V")
	public void method5052(@OriginalArg(2) boolean arg0) {
		if (!this.method5059()) {
			return;
		}
		if (arg0) {
			this.aClass171_2.anIntArray436 = null;
			this.aClass171_2.aClass163_1 = null;
		}
		this.aClass171_2.anIntArrayArray145 = null;
		this.aClass171_2.aClass163Array1 = null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[III)Z")
	private boolean method5053(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5050(arg1)) {
			return false;
		} else if (this.anObjectArray35[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass171_2.anIntArray437[arg1];
			@Pc(31) int[] local31 = this.aClass171_2.anIntArrayArray146[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass171_2.anIntArray439[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
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
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local119 = Static283.method4822(false, this.anObjectArray35[arg1]);
			} else {
				local119 = Static283.method4822(true, this.anObjectArray35[arg1]);
				@Pc(134) Class4_Sub11 local134 = new Class4_Sub11(local119);
				local134.method3431(local134.aByteArray55.length, arg0);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Static23.method380(local119);
			} catch (@Pc(148) RuntimeException local148) {
				throw Static209.method3881(local148, "T3 - " + (arg0 != null) + "," + arg1 + "," + local119.length + "," + Static86.method2110(local119.length, local119) + "," + Static86.method2110(local119.length - 2, local119) + "," + this.aClass171_2.anIntArray434[arg1] + "," + this.aClass171_2.anInt5363);
			}
			if (this.aBoolean441) {
				this.anObjectArray35[arg1] = null;
			}
			@Pc(223) int local223;
			if (local25 > 1) {
				@Pc(230) int local230;
				@Pc(243) Class4_Sub11 local243;
				@Pc(250) int local250;
				@Pc(252) int local252;
				@Pc(256) int local256;
				@Pc(258) int local258;
				@Pc(270) int local270;
				@Pc(320) int local320;
				@Pc(322) int local322;
				if (this.anInt5952 == 2) {
					local223 = local146.length;
					@Pc(225) int local225 = local223 - 1;
					local230 = local146[local225] & 0xFF;
					@Pc(238) int local238 = local225 - local230 * local25 * 4;
					local243 = new Class4_Sub11(local146);
					@Pc(245) int local245 = 0;
					local243.anInt3768 = local238;
					local250 = 0;
					for (local252 = 0; local252 < local230; local252++) {
						local256 = 0;
						for (local258 = 0; local258 < local25; local258++) {
							local256 += local243.method3418();
							if (local31 == null) {
								local270 = local258;
							} else {
								local270 = local31[local258];
							}
							if (arg2 == local270) {
								local250 = local270;
								local245 += local256;
							}
						}
					}
					if (local245 == 0) {
						return true;
					}
					@Pc(307) byte[] local307 = new byte[local245];
					local243.anInt3768 = local238;
					local245 = 0;
					local258 = 0;
					for (local270 = 0; local270 < local230; local270++) {
						local320 = 0;
						for (local322 = 0; local322 < local25; local322++) {
							local320 += local243.method3418();
							@Pc(336) int local336;
							if (local31 == null) {
								local336 = local322;
							} else {
								local336 = local31[local322];
							}
							if (arg2 == local336) {
								Static359.method761(local146, local258, local307, local245, local320);
								local245 += local320;
							}
							local258 += local320;
						}
					}
					local51[local250] = local307;
				} else {
					local223 = local146.length;
					local223--;
					local230 = local146[local223] & 0xFF;
					local223 -= local25 * local230 * 4;
					local243 = new Class4_Sub11(local146);
					@Pc(401) int[] local401 = new int[local25];
					local243.anInt3768 = local223;
					for (local250 = 0; local250 < local230; local250++) {
						local252 = 0;
						for (local256 = 0; local256 < local25; local256++) {
							local252 += local243.method3418();
							local401[local256] += local252;
						}
					}
					@Pc(446) byte[][] local446 = new byte[local25][];
					for (local256 = 0; local256 < local25; local256++) {
						local446[local256] = new byte[local401[local256]];
						local401[local256] = 0;
					}
					local243.anInt3768 = local223;
					local258 = 0;
					for (local270 = 0; local270 < local230; local270++) {
						local320 = 0;
						for (local322 = 0; local322 < local25; local322++) {
							local320 += local243.method3418();
							Static359.method761(local146, local258, local446[local322], local401[local322], local320);
							local401[local322] += local320;
							local258 += local320;
						}
					}
					for (local320 = 0; local320 < local25; local320++) {
						if (local31 == null) {
							local322 = local320;
						} else {
							local322 = local31[local320];
						}
						if (this.anInt5952 == 0) {
							local51[local322] = Static189.method3603(local446[local320]);
						} else {
							local51[local322] = local446[local320];
						}
					}
				}
			} else {
				if (local31 == null) {
					local223 = 0;
				} else {
					local223 = local31[0];
				}
				if (this.anInt5952 == 0) {
					local51[local223] = Static189.method3603(local146);
				} else {
					local51[local223] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(BI)V")
	public void method5054(@OriginalArg(1) int arg0) {
		if (this.method5050(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(II)I")
	public int method5055(@OriginalArg(1) int arg0) {
		return this.method5050(arg0) ? this.aClass171_2.anIntArray439[arg0] : 0;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)I")
	public int method5056() {
		if (!this.method5059()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray35.length; local17++) {
			if (this.aClass171_2.anIntArray437[local17] > 0) {
				local13 += 100;
				local15 += this.method5043(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(IB)V")
	private void method5057(@OriginalArg(0) int arg0) {
		if (this.aBoolean441) {
			this.anObjectArray35[arg0] = this.aClass7_1.method2582(arg0);
		} else {
			this.anObjectArray35[arg0] = Static189.method3603(this.aClass7_1.method2582(arg0));
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method5058(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5059()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass171_2.aClass163_1.method4468(Static32.method560(local12));
		if (this.method5050(local24)) {
			@Pc(42) int local42 = this.aClass171_2.aClass163Array1[local24].method4468(Static32.method560(local15));
			return this.method5065(local24, local42);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)Z")
	private boolean method5059() {
		if (this.aClass171_2 == null) {
			this.aClass171_2 = this.aClass7_1.method2580();
			if (this.aClass171_2 == null) {
				return false;
			}
			this.anObjectArray35 = new Object[this.aClass171_2.anInt5365];
			this.anObjectArrayArray1 = new Object[this.aClass171_2.anInt5365][];
		}
		return true;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)Z")
	public boolean method5060() {
		if (!this.method5059()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass171_2.anIntArray438.length; local15++) {
			@Pc(23) int local23 = this.aClass171_2.anIntArray438[local15];
			if (this.anObjectArray35[local23] == null) {
				this.method5057(local23);
				if (this.anObjectArray35[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
	public void method5062() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V")
	public void method5063() {
		if (this.anObjectArray35 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArray35.length; local18++) {
				this.anObjectArray35[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(IB)Z")
	public boolean method5064(@OriginalArg(0) int arg0) {
		if (!this.method5059()) {
			return false;
		} else if (this.aClass171_2.anIntArray439.length == 1) {
			return this.method5065(0, arg0);
		} else if (!this.method5050(arg0)) {
			return false;
		} else if (this.aClass171_2.anIntArray439[arg0] == 1) {
			return this.method5065(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZI)Z")
	public boolean method5065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5036(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method5057(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method5066(@OriginalArg(1) String arg0) {
		if (this.method5059()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass171_2.aClass163_1.method4468(Static32.method560(local17));
			return this.method5050(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}
}
