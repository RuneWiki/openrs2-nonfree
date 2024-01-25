import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class53 {

	@OriginalMember(owner = "client!dda", name = "E", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!dda", name = "L", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!dda", name = "s", descriptor = "Lclient!vm;")
	private Class301 aClass301_1 = null;

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
	public int anInt1684;

	@OriginalMember(owner = "client!dda", name = "G", descriptor = "Z")
	private final boolean aBoolean121;

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "Lclient!nq;")
	private final Class164 aClass164_1;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!nq;ZI)V")
	public Class53(@OriginalArg(0) Class164 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt1684 = arg2;
		this.aBoolean121 = arg1;
		this.aClass164_1 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method1590(@OriginalArg(1) String arg0) {
		if (this.method1617()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass301_1.aClass3_1.method266(Static57.method4382(local17));
			this.method1615(local26);
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)Z")
	public boolean method1591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1600(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1622(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)I")
	public int method1592(@OriginalArg(0) int arg0) {
		return this.method1594(arg0) ? this.aClass301_1.anIntArray687[arg0] : 0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1593(@OriginalArg(0) String arg0) {
		if (this.method1617()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass301_1.aClass3_1.method266(Static57.method4382(local12));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)Z")
	private boolean method1594(@OriginalArg(0) int arg0) {
		if (!this.method1617()) {
			return false;
		} else if (arg0 >= 0 && this.aClass301_1.anIntArray687.length > arg0 && this.aClass301_1.anIntArray687[arg0] != 0) {
			return true;
		} else if (Static431.aBoolean582) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)[I")
	public int[] method1595(@OriginalArg(1) int arg0) {
		if (!this.method1594(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass301_1.anIntArrayArray82[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass301_1.anIntArray686[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local18.length) {
				local18[local33] = local33++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method1596(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1617()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass301_1.aClass3_1.method266(Static57.method4382(local12));
		if (this.method1594(local24)) {
			@Pc(46) int local46 = this.aClass301_1.aClass3Array1[local24].method266(Static57.method4382(local15));
			return this.method1616(local46, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
	public int method1597() {
		if (!this.method1617()) {
			throw new IllegalStateException("");
		}
		return this.aClass301_1.anInt8968;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
	public boolean method1598() {
		if (!this.method1617()) {
			return false;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass301_1.anIntArray688.length; local21++) {
			@Pc(29) int local29 = this.aClass301_1.anIntArray688[local21];
			if (this.anObjectArray1[local29] == null) {
				this.method1622(local29);
				if (this.anObjectArray1[local29] == null) {
					local19 = false;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(II)[B")
	public byte[] method1599(@OriginalArg(0) int arg0) {
		if (!this.method1617()) {
			return null;
		} else if (this.aClass301_1.anIntArray687.length == 1) {
			return this.method1616(arg0, 0);
		} else if (!this.method1594(arg0)) {
			return null;
		} else if (this.aClass301_1.anIntArray687[arg0] == 1) {
			return this.method1616(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(III)Z")
	private boolean method1600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1617()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass301_1.anIntArray687.length > arg0 && this.aClass301_1.anIntArray687[arg0] > arg1) {
			return true;
		} else if (Static431.aBoolean582) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method1601(@OriginalArg(0) String arg0) {
		if (this.method1617()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass301_1.aClass3_1.method266(Static57.method4382(local12));
			return this.method1619(local25);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method1602(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1617()) {
			return false;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(30) int local30 = this.aClass301_1.aClass3_1.method266(Static57.method4382(local18));
		if (this.method1594(local30)) {
			@Pc(48) int local48 = this.aClass301_1.aClass3Array1[local30].method266(Static57.method4382(local21));
			return this.method1591(local30, local48);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIII)[B")
	public byte[] method1603(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method1600(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(38) boolean local38 = this.method1620(arg2, arg1, arg0);
			if (!local38) {
				this.method1622(arg1);
				local38 = this.method1620(arg2, arg1, arg0);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(67) byte[] local67 = Static50.method898(this.anObjectArrayArray1[arg1][arg2], false);
		if (this.anInt1684 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass301_1.anIntArray687[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt1684 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local67;
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(II)Z")
	public boolean method1604(@OriginalArg(1) int arg0) {
		if (!this.method1594(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1622(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "(II)I")
	public int method1605(@OriginalArg(0) int arg0) {
		if (this.method1617()) {
			@Pc(16) int local16 = this.aClass301_1.aClass3_1.method266(arg0);
			return this.method1594(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1606(@OriginalArg(1) String arg0) {
		if (this.method1617()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass301_1.aClass3_1.method266(Static57.method4382(local20));
			return this.method1604(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)I")
	public int method1607() {
		return this.method1617() ? this.aClass301_1.anIntArray687.length : -1;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(ILjava/lang/String;)I")
	public int method1608(@OriginalArg(1) String arg0) {
		if (this.method1617()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass301_1.aClass3_1.method266(Static57.method4382(local18));
			return this.method1594(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)I")
	public int method1609() {
		if (!this.method1617()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray1.length; local17++) {
			if (this.aClass301_1.anIntArray686[local17] > 0) {
				local13 += 100;
				local15 += this.method1619(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZI)V")
	public void method1610(@OriginalArg(1) int arg0) {
		if (this.method1594(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZIZ)V")
	public void method1612(@OriginalArg(2) boolean arg0) {
		if (!this.method1617()) {
			return;
		}
		this.aClass301_1.anIntArrayArray81 = null;
		this.aClass301_1.aClass3Array1 = null;
		if (arg0) {
			this.aClass301_1.aClass3_1 = null;
			this.aClass301_1.anIntArray684 = null;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	public boolean method1613(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1617()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass301_1.aClass3_1.method266(Static57.method4382(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(42) int local42 = this.aClass301_1.aClass3Array1[local24].method266(Static57.method4382(local15));
			return local42 >= 0;
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V")
	public void method1614() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "(II)V")
	private void method1615(@OriginalArg(1) int arg0) {
		this.aClass164_1.method3996(arg0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BII)[B")
	public byte[] method1616(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1603(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)Z")
	private boolean method1617() {
		if (this.aClass301_1 == null) {
			this.aClass301_1 = this.aClass164_1.method3995();
			if (this.aClass301_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass301_1.anInt8967][];
			this.anObjectArray1 = new Object[this.aClass301_1.anInt8967];
		}
		return true;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(Z)V")
	public void method1618() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray1.length; local16++) {
				this.anObjectArrayArray1[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(II)I")
	private int method1619(@OriginalArg(1) int arg0) {
		if (this.method1594(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass164_1.method3991(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II[II)Z")
	private boolean method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1594(arg1)) {
			return false;
		} else if (this.anObjectArray1[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass301_1.anIntArray686[arg1];
			@Pc(36) int[] local36 = this.aClass301_1.anIntArrayArray82[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass301_1.anIntArray687[arg1]];
			}
			@Pc(56) Object[] local56 = this.anObjectArrayArray1[arg1];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local25; local60++) {
				@Pc(66) int local66;
				if (local36 == null) {
					local66 = local60;
				} else {
					local66 = local36[local60];
				}
				if (local56[local66] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local127 = Static50.method898(this.anObjectArray1[arg1], false);
			} else {
				local127 = Static50.method898(this.anObjectArray1[arg1], true);
				@Pc(132) Class2_Sub29 local132 = new Class2_Sub29(local127);
				local132.method5215(arg2, local132.aByteArray96.length);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static356.method2690(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static188.method259(local156, "T3 - " + (arg2 != null) + "," + arg1 + "," + local127.length + "," + Static433.method5294(local127.length, local127) + "," + Static433.method5294(local127.length - 2, local127) + "," + this.aClass301_1.anIntArray685[arg1] + "," + this.aClass301_1.anInt8968);
			}
			if (this.aBoolean121) {
				this.anObjectArray1[arg1] = null;
			}
			@Pc(228) int local228;
			if (local25 <= 1) {
				if (local36 == null) {
					local228 = 0;
				} else {
					local228 = local36[0];
				}
				if (this.anInt1684 == 0) {
					local56[local228] = Static252.method3975(local154);
				} else {
					local56[local228] = local154;
				}
			} else {
				@Pc(269) int local269;
				@Pc(282) Class2_Sub29 local282;
				@Pc(289) int local289;
				@Pc(291) int local291;
				@Pc(295) int local295;
				@Pc(297) int local297;
				@Pc(309) int local309;
				@Pc(359) int local359;
				@Pc(361) int local361;
				if (this.anInt1684 == 2) {
					local228 = local154.length;
					local228--;
					local269 = local154[local228] & 0xFF;
					local228 -= local269 * 4 * local25;
					local282 = new Class2_Sub29(local154);
					@Pc(284) int local284 = 0;
					local282.anInt6132 = local228;
					local289 = 0;
					for (local291 = 0; local291 < local269; local291++) {
						local295 = 0;
						for (local297 = 0; local297 < local25; local297++) {
							local295 += local282.method5198();
							if (local36 == null) {
								local309 = local297;
							} else {
								local309 = local36[local297];
							}
							if (local309 == arg0) {
								local289 = local309;
								local284 += local295;
							}
						}
					}
					if (local284 == 0) {
						return true;
					}
					@Pc(346) byte[] local346 = new byte[local284];
					local282.anInt6132 = local228;
					local284 = 0;
					local297 = 0;
					for (local309 = 0; local309 < local269; local309++) {
						local359 = 0;
						for (local361 = 0; local361 < local25; local361++) {
							local359 += local282.method5198();
							@Pc(377) int local377;
							if (local36 == null) {
								local377 = local361;
							} else {
								local377 = local36[local361];
							}
							if (arg0 == local377) {
								Static553.method3373(local154, local297, local346, local284, local359);
								local284 += local359;
							}
							local297 += local359;
						}
					}
					local56[local289] = local346;
				} else {
					local228 = local154.length;
					local228--;
					local269 = local154[local228] & 0xFF;
					local228 -= local269 * local25 * 4;
					local282 = new Class2_Sub29(local154);
					local282.anInt6132 = local228;
					@Pc(445) int[] local445 = new int[local25];
					for (local289 = 0; local289 < local269; local289++) {
						local291 = 0;
						for (local295 = 0; local295 < local25; local295++) {
							local291 += local282.method5198();
							local445[local295] += local291;
						}
					}
					@Pc(483) byte[][] local483 = new byte[local25][];
					for (local295 = 0; local295 < local25; local295++) {
						local483[local295] = new byte[local445[local295]];
						local445[local295] = 0;
					}
					local282.anInt6132 = local228;
					local297 = 0;
					for (local309 = 0; local309 < local269; local309++) {
						local359 = 0;
						for (local361 = 0; local361 < local25; local361++) {
							local359 += local282.method5198();
							Static553.method3373(local154, local297, local483[local361], local445[local361], local359);
							local445[local361] += local359;
							local297 += local359;
						}
					}
					for (local359 = 0; local359 < local25; local359++) {
						if (local36 == null) {
							local361 = local359;
						} else {
							local361 = local36[local359];
						}
						if (this.anInt1684 == 0) {
							local56[local361] = Static252.method3975(local483[local359]);
						} else {
							local56[local361] = local483[local359];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "(II)Z")
	public boolean method1621(@OriginalArg(1) int arg0) {
		if (!this.method1617()) {
			return false;
		} else if (this.aClass301_1.anIntArray687.length == 1) {
			return this.method1591(0, arg0);
		} else if (!this.method1594(arg0)) {
			return false;
		} else if (this.aClass301_1.anIntArray687[arg0] == 1) {
			return this.method1591(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "(II)V")
	private void method1622(@OriginalArg(1) int arg0) {
		if (this.aBoolean121) {
			this.anObjectArray1[arg0] = this.aClass164_1.method3993(arg0);
		} else {
			this.anObjectArray1[arg0] = Static252.method3975(this.aClass164_1.method3993(arg0));
		}
	}
}
