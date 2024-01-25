import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class76 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!fs", name = "G", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray3;

	@OriginalMember(owner = "client!fs", name = "K", descriptor = "Lclient!rt;")
	private Class209 aClass209_1 = null;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
	public int anInt2476;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "Z")
	private final boolean aBoolean230;

	@OriginalMember(owner = "client!fs", name = "F", descriptor = "Lclient!oi;")
	private final Class143 aClass143_1;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!oi;ZI)V")
	public Class76(@OriginalArg(0) Class143 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt2476 = arg2;
		this.aBoolean230 = arg1;
		this.aClass143_1 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)Z")
	private boolean method2097() {
		if (this.aClass209_1 == null) {
			this.aClass209_1 = this.aClass143_1.method3514();
			if (this.aClass209_1 == null) {
				return false;
			}
			this.anObjectArray3 = new Object[this.aClass209_1.anInt6112];
			this.anObjectArrayArray1 = new Object[this.aClass209_1.anInt6112][];
		}
		return true;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBI)Z")
	public boolean method2098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2127(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray3[arg1] == null) {
			this.method2119(arg1);
			return this.anObjectArray3[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2099(@OriginalArg(0) String arg0) {
		if (this.method2097()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass209_1.aClass235_1.method5174(Static269.method3854(local20));
			return this.method2106(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I")
	public int method2100() {
		return this.method2097() ? this.aClass209_1.anIntArray433.length : -1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Z")
	public boolean method2101(@OriginalArg(0) int arg0) {
		if (!this.method2106(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method2119(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
	public void method2102() {
		if (this.anObjectArray3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray3.length; local10++) {
				this.anObjectArray3[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2103(@OriginalArg(1) String arg0) {
		if (this.method2097()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass209_1.aClass235_1.method5174(Static269.method3854(local17));
			return this.method2101(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)[B")
	public byte[] method2104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method2121(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)I")
	private int method2105(@OriginalArg(1) int arg0) {
		if (this.method2106(arg0)) {
			return this.anObjectArray3[arg0] == null ? this.aClass143_1.method3515(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(II)Z")
	private boolean method2106(@OriginalArg(0) int arg0) {
		if (!this.method2097()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass209_1.anIntArray433.length && this.aClass209_1.anIntArray433[arg0] != 0) {
			return true;
		} else if (Static415.aBoolean625) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2107(@OriginalArg(0) String arg0) {
		if (this.method2097()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass209_1.aClass235_1.method5174(Static269.method3854(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(II)I")
	public int method2108(@OriginalArg(0) int arg0) {
		return this.method2106(arg0) ? this.aClass209_1.anIntArray433[arg0] : 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B")
	public byte[] method2109(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2097()) {
			return null;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(30) int local30 = this.aClass209_1.aClass235_1.method5174(Static269.method3854(local18));
		if (this.method2106(local30)) {
			@Pc(48) int local48 = this.aClass209_1.aClass235Array1[local30].method5174(Static269.method3854(local21));
			return this.method2104(local48, local30);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)I")
	public int method2111() {
		if (!this.method2097()) {
			throw new IllegalStateException("");
		}
		return this.aClass209_1.anInt6111;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)I")
	public int method2112() {
		if (!this.method2097()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray3.length; local22++) {
			if (this.aClass209_1.anIntArray428[local22] > 0) {
				local18 += 100;
				local20 += this.method2105(local22);
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method2113(@OriginalArg(0) String arg0) {
		if (this.method2097()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass209_1.aClass235_1.method5174(Static269.method3854(local17));
			return this.method2105(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III[I)Z")
	private boolean method2114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method2106(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass209_1.anIntArray428[arg0];
			@Pc(31) int[] local31 = this.aClass209_1.anIntArrayArray46[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass209_1.anIntArray433[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(63) int local63;
				if (local31 == null) {
					local63 = local55;
				} else {
					local63 = local31[local55];
				}
				if (local51[local63] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(122) byte[] local122;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local122 = Static366.method4930(false, this.anObjectArray3[arg0]);
			} else {
				local122 = Static366.method4930(true, this.anObjectArray3[arg0]);
				@Pc(127) Class4_Sub12 local127 = new Class4_Sub12(local122);
				local127.method2544(local127.aByteArray36.length, arg2);
			}
			@Pc(149) byte[] local149;
			try {
				local149 = Static453.method5680(local122);
			} catch (@Pc(151) RuntimeException local151) {
				throw Static350.method4724(local151, "T3 - " + (arg2 != null) + "," + arg0 + "," + local122.length + "," + Static276.method879(local122.length, local122) + "," + Static276.method879(local122.length - 2, local122) + "," + this.aClass209_1.anIntArray430[arg0] + "," + this.aClass209_1.anInt6111);
			}
			if (this.aBoolean230) {
				this.anObjectArray3[arg0] = null;
			}
			@Pc(228) int local228;
			if (local25 > 1) {
				@Pc(235) int local235;
				@Pc(248) Class4_Sub12 local248;
				@Pc(252) int local252;
				@Pc(257) int local257;
				@Pc(261) int local261;
				@Pc(263) int local263;
				@Pc(275) int local275;
				@Pc(325) int local325;
				@Pc(327) int local327;
				if (this.anInt2476 == 2) {
					local228 = local149.length;
					@Pc(230) int local230 = local228 - 1;
					local235 = local149[local230] & 0xFF;
					@Pc(243) int local243 = local230 - local25 * local235 * 4;
					local248 = new Class4_Sub12(local149);
					@Pc(250) int local250 = 0;
					local252 = 0;
					local248.anInt2997 = local243;
					for (local257 = 0; local257 < local235; local257++) {
						local261 = 0;
						for (local263 = 0; local263 < local25; local263++) {
							local261 += local248.method2529();
							if (local31 == null) {
								local275 = local263;
							} else {
								local275 = local31[local263];
							}
							if (arg1 == local275) {
								local250 += local261;
								local252 = local275;
							}
						}
					}
					if (local250 == 0) {
						return true;
					}
					@Pc(312) byte[] local312 = new byte[local250];
					local248.anInt2997 = local243;
					local250 = 0;
					local263 = 0;
					for (local275 = 0; local275 < local235; local275++) {
						local325 = 0;
						for (local327 = 0; local327 < local25; local327++) {
							local325 += local248.method2529();
							@Pc(339) int local339;
							if (local31 == null) {
								local339 = local327;
							} else {
								local339 = local31[local327];
							}
							if (arg1 == local339) {
								Static459.method3330(local149, local263, local312, local250, local325);
								local250 += local325;
							}
							local263 += local325;
						}
					}
					local51[local252] = local312;
				} else {
					local228 = local149.length;
					local228--;
					local235 = local149[local228] & 0xFF;
					local228 -= local25 * local235 * 4;
					local248 = new Class4_Sub12(local149);
					@Pc(410) int[] local410 = new int[local25];
					local248.anInt2997 = local228;
					for (local252 = 0; local252 < local235; local252++) {
						local257 = 0;
						for (local261 = 0; local261 < local25; local261++) {
							local257 += local248.method2529();
							local410[local261] += local257;
						}
					}
					@Pc(451) byte[][] local451 = new byte[local25][];
					for (local261 = 0; local261 < local25; local261++) {
						local451[local261] = new byte[local410[local261]];
						local410[local261] = 0;
					}
					local248.anInt2997 = local228;
					local263 = 0;
					for (local275 = 0; local275 < local235; local275++) {
						local325 = 0;
						for (local327 = 0; local327 < local25; local327++) {
							local325 += local248.method2529();
							Static459.method3330(local149, local263, local451[local327], local410[local327], local325);
							local263 += local325;
							local410[local327] += local325;
						}
					}
					for (local325 = 0; local325 < local25; local325++) {
						if (local31 == null) {
							local327 = local325;
						} else {
							local327 = local31[local325];
						}
						if (this.anInt2476 == 0) {
							local51[local327] = Static327.method4416(local451[local325]);
						} else {
							local51[local327] = local451[local325];
						}
					}
				}
			} else {
				if (local31 == null) {
					local228 = 0;
				} else {
					local228 = local31[0];
				}
				if (this.anInt2476 == 0) {
					local51[local228] = Static327.method4416(local149);
				} else {
					local51[local228] = local149;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(II)V")
	public void method2115(@OriginalArg(1) int arg0) {
		if (this.method2106(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)Z")
	public boolean method2116() {
		if (!this.method2097()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass209_1.anIntArray431.length; local15++) {
			@Pc(23) int local23 = this.aClass209_1.anIntArray431[local15];
			if (this.anObjectArray3[local23] == null) {
				this.method2119(local23);
				if (this.anObjectArray3[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "(II)I")
	public int method2117(@OriginalArg(1) int arg0) {
		if (this.method2097()) {
			@Pc(16) int local16 = this.aClass209_1.aClass235_1.method5174(arg0);
			return this.method2106(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V")
	public void method2118() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray1.length; local13++) {
				this.anObjectArrayArray1[local13] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "(II)V")
	private void method2119(@OriginalArg(1) int arg0) {
		if (this.aBoolean230) {
			this.anObjectArray3[arg0] = this.aClass143_1.method3516(arg0);
		} else {
			this.anObjectArray3[arg0] = Static327.method4416(this.aClass143_1.method3516(arg0));
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)V")
	private void method2120(@OriginalArg(1) int arg0) {
		this.aClass143_1.method3512(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II[IB)[B")
	public byte[] method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method2127(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method2114(arg0, arg1, arg2);
			if (!local30) {
				this.method2119(arg0);
				local30 = this.method2114(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static366.method4930(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt2476 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass209_1.anIntArray433[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt2476 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "(II)[B")
	public byte[] method2122(@OriginalArg(0) int arg0) {
		if (!this.method2097()) {
			return null;
		} else if (this.aClass209_1.anIntArray433.length == 1) {
			return this.method2104(arg0, 0);
		} else if (!this.method2106(arg0)) {
			return null;
		} else if (this.aClass209_1.anIntArray433[arg0] == 1) {
			return this.method2104(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method2123(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2097()) {
			return false;
		}
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(24) String local24 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass209_1.aClass235_1.method5174(Static269.method3854(local21));
		if (this.method2106(local33)) {
			@Pc(51) int local51 = this.aClass209_1.aClass235Array1[local33].method5174(Static269.method3854(local24));
			return this.method2098(local51, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "(II)[I")
	public int[] method2124(@OriginalArg(1) int arg0) {
		if (!this.method2106(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass209_1.anIntArrayArray46[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass209_1.anIntArray428[arg0]];
			@Pc(38) int local38 = 0;
			while (local27.length > local38) {
				local27[local38] = local38++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "(II)Z")
	public boolean method2125(@OriginalArg(1) int arg0) {
		if (!this.method2097()) {
			return false;
		} else if (this.aClass209_1.anIntArray433.length == 1) {
			return this.method2098(arg0, 0);
		} else if (!this.method2106(arg0)) {
			return false;
		} else if (this.aClass209_1.anIntArray433[arg0] == 1) {
			return this.method2098(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method2126(@OriginalArg(1) String arg0) {
		if (this.method2097()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass209_1.aClass235_1.method5174(Static269.method3854(local11));
			this.method2120(local28);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BII)Z")
	private boolean method2127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2097()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass209_1.anIntArray433.length > arg0 && this.aClass209_1.anIntArray433[arg0] > arg1) {
			return true;
		} else if (Static415.aBoolean625) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIZ)V")
	public void method2128(@OriginalArg(0) boolean arg0) {
		if (!this.method2097()) {
			return;
		}
		this.aClass209_1.anIntArrayArray47 = null;
		this.aClass209_1.aClass235Array1 = null;
		if (arg0) {
			this.aClass209_1.anIntArray432 = null;
			this.aClass209_1.aClass235_1 = null;
		}
	}
}
