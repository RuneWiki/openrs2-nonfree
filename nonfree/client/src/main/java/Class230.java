import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class230 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!ui", name = "R", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "Lclient!ms;")
	private Class160 aClass160_2 = null;

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "Lclient!dg;")
	private final Class56 aClass56_1;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Z")
	private final boolean aBoolean530;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	public int anInt5779;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!dg;ZI)V")
	public Class230(@OriginalArg(0) Class56 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass56_1 = arg0;
		this.aBoolean530 = arg1;
		this.anInt5779 = arg2;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
	private boolean method4951() {
		if (this.aClass160_2 == null) {
			this.aClass160_2 = this.aClass56_1.method3294();
			if (this.aClass160_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass160_2.anInt3843][];
			this.anObjectArray35 = new Object[this.aClass160_2.anInt3843];
		}
		return true;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4953(@OriginalArg(1) String arg0) {
		if (this.method4951()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass160_2.aClass122_1.method2589(Static37.method565(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Z")
	public boolean method4954() {
		if (!this.method4951()) {
			return false;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass160_2.anIntArray491.length; local21++) {
			@Pc(29) int local29 = this.aClass160_2.anIntArray491[local21];
			if (this.anObjectArray35[local29] == null) {
				this.method4957(local29);
				if (this.anObjectArray35[local29] == null) {
					local19 = false;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)I")
	public int method4955() {
		if (!this.method4951()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray35.length; local17++) {
			if (this.aClass160_2.anIntArray489[local17] > 0) {
				local13 += 100;
				local15 += this.method4977(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)I")
	public int method4956(@OriginalArg(0) int arg0) {
		return this.method4980(arg0) ? this.aClass160_2.anIntArray490[arg0] : 0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
	private void method4957(@OriginalArg(1) int arg0) {
		if (this.aBoolean530) {
			this.anObjectArray35[arg0] = this.aClass56_1.method3292(arg0);
		} else {
			this.anObjectArray35[arg0] = Static99.method1457(this.aClass56_1.method3292(arg0));
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method4958(@OriginalArg(0) String arg0) {
		if (this.method4951()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass160_2.aClass122_1.method2589(Static37.method565(local12));
			return this.method4964(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public void method4959(@OriginalArg(1) int arg0) {
		if (this.method4980(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)I")
	public int method4960() {
		if (!this.method4951()) {
			throw new IllegalStateException("");
		}
		return this.aClass160_2.anInt3845;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(BI)[B")
	public byte[] method4961(@OriginalArg(1) int arg0) {
		if (!this.method4951()) {
			return null;
		} else if (this.aClass160_2.anIntArray490.length == 1) {
			return this.method4985(arg0, 0);
		} else if (!this.method4980(arg0)) {
			return null;
		} else if (this.aClass160_2.anIntArray490[arg0] == 1) {
			return this.method4985(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V")
	private void method4962(@OriginalArg(0) int arg0) {
		this.aClass56_1.method3290(arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(IB)Z")
	public boolean method4964(@OriginalArg(0) int arg0) {
		if (!this.method4980(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method4957(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)Z")
	public boolean method4966(@OriginalArg(0) int arg0) {
		if (!this.method4951()) {
			return false;
		} else if (this.aClass160_2.anIntArray490.length == 1) {
			return this.method4974(arg0, 0);
		} else if (!this.method4980(arg0)) {
			return false;
		} else if (this.aClass160_2.anIntArray490[arg0] == 1) {
			return this.method4974(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIZ)V")
	public void method4967(@OriginalArg(0) boolean arg0) {
		if (!this.method4951()) {
			return;
		}
		if (arg0) {
			this.aClass160_2.anIntArray488 = null;
			this.aClass160_2.aClass122_1 = null;
		}
		this.aClass160_2.aClass122Array1 = null;
		this.aClass160_2.anIntArrayArray47 = null;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	public void method4968() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray1.length; local12++) {
				this.anObjectArrayArray1[local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(Z)I")
	public int method4969() {
		return this.method4951() ? this.aClass160_2.anIntArray490.length : -1;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method4970(@OriginalArg(0) String arg0) {
		if (this.method4951()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass160_2.aClass122_1.method2589(Static37.method565(local17));
			return this.method4980(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method4972(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4951()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass160_2.aClass122_1.method2589(Static37.method565(local12));
		if (this.method4980(local24)) {
			@Pc(44) int local44 = this.aClass160_2.aClass122Array1[local24].method2589(Static37.method565(local15));
			return this.method4974(local44, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZ)Z")
	public boolean method4974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4975(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray35[arg1] == null) {
			this.method4957(arg1);
			return this.anObjectArray35[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)Z")
	private boolean method4975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4951()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass160_2.anIntArray490.length && this.aClass160_2.anIntArray490[arg0] > arg1) {
			return true;
		} else if (Static62.aBoolean108) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "([IIII)Z")
	private boolean method4976(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4980(arg1)) {
			return false;
		} else if (this.anObjectArray35[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass160_2.anIntArray489[arg1];
			@Pc(31) int[] local31 = this.aClass160_2.anIntArrayArray48[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass160_2.anIntArray490[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
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
			@Pc(109) byte[] local109;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local109 = Static277.method4253(false, this.anObjectArray35[arg1]);
			} else {
				local109 = Static277.method4253(true, this.anObjectArray35[arg1]);
				@Pc(124) Class1_Sub33 local124 = new Class1_Sub33(local109);
				local124.method5129(local124.aByteArray86.length, arg0);
			}
			@Pc(138) byte[] local138;
			try {
				local138 = Static348.method5108(local109);
			} catch (@Pc(140) RuntimeException local140) {
				throw Static215.method2997(local140, "T3 - " + (arg0 != null) + "," + arg1 + "," + local109.length + "," + Static167.method2462(local109.length, local109) + "," + Static167.method2462(local109.length - 2, local109) + "," + this.aClass160_2.anIntArray487[arg1] + "," + this.aClass160_2.anInt3845);
			}
			if (this.aBoolean530) {
				this.anObjectArray35[arg1] = null;
			}
			@Pc(216) int local216;
			if (local25 <= 1) {
				if (local31 == null) {
					local216 = 0;
				} else {
					local216 = local31[0];
				}
				if (this.anInt5779 == 0) {
					local51[local216] = Static99.method1457(local138);
				} else {
					local51[local216] = local138;
				}
			} else {
				@Pc(255) int local255;
				@Pc(268) Class1_Sub33 local268;
				@Pc(276) int local276;
				@Pc(280) int local280;
				@Pc(282) int local282;
				@Pc(336) int local336;
				@Pc(338) int local338;
				@Pc(342) int local342;
				@Pc(344) int local344;
				if (this.anInt5779 == 2) {
					local216 = local138.length;
					local216--;
					local255 = local138[local216] & 0xFF;
					local216 -= local255 * local25 * 4;
					local268 = new Class1_Sub33(local138);
					@Pc(450) int local450 = 0;
					local268.lb = local216;
					local276 = 0;
					for (local280 = 0; local280 < local255; local280++) {
						local282 = 0;
						for (local336 = 0; local336 < local25; local336++) {
							local282 += local268.method5150();
							if (local31 == null) {
								local338 = local336;
							} else {
								local338 = local31[local336];
							}
							if (arg2 == local338) {
								local276 = local338;
								local450 += local282;
							}
						}
					}
					if (local450 == 0) {
						return true;
					}
					@Pc(516) byte[] local516 = new byte[local450];
					local268.lb = local216;
					local450 = 0;
					local336 = 0;
					for (local338 = 0; local338 < local255; local338++) {
						local342 = 0;
						for (local344 = 0; local344 < local25; local344++) {
							local342 += local268.method5150();
							@Pc(545) int local545;
							if (local31 == null) {
								local545 = local344;
							} else {
								local545 = local31[local344];
							}
							if (arg2 == local545) {
								Static404.method4337(local138, local336, local516, local450, local342);
								local450 += local342;
							}
							local336 += local342;
						}
					}
					local51[local276] = local516;
				} else {
					local216 = local138.length;
					local216--;
					local255 = local138[local216] & 0xFF;
					local216 -= local255 * 4 * local25;
					local268 = new Class1_Sub33(local138);
					@Pc(271) int[] local271 = new int[local25];
					local268.lb = local216;
					for (local276 = 0; local276 < local255; local276++) {
						local280 = 0;
						for (local282 = 0; local282 < local25; local282++) {
							local280 += local268.method5150();
							local271[local282] += local280;
						}
					}
					@Pc(312) byte[][] local312 = new byte[local25][];
					for (local282 = 0; local282 < local25; local282++) {
						local312[local282] = new byte[local271[local282]];
						local271[local282] = 0;
					}
					local268.lb = local216;
					local336 = 0;
					for (local338 = 0; local338 < local255; local338++) {
						local342 = 0;
						for (local344 = 0; local344 < local25; local344++) {
							local342 += local268.method5150();
							Static404.method4337(local138, local336, local312[local344], local271[local344], local342);
							local336 += local342;
							local271[local344] += local342;
						}
					}
					for (local342 = 0; local342 < local25; local342++) {
						if (local31 == null) {
							local344 = local342;
						} else {
							local344 = local31[local342];
						}
						if (this.anInt5779 == 0) {
							local51[local344] = Static99.method1457(local312[local342]);
						} else {
							local51[local344] = local312[local342];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)I")
	private int method4977(@OriginalArg(1) int arg0) {
		if (this.method4980(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass56_1.method3293(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[III)[B")
	public byte[] method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method4975(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method4976(arg1, arg0, arg2);
			if (!local30) {
				this.method4957(arg0);
				local30 = this.method4976(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static277.method4253(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt5779 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass160_2.anIntArray490[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt5779 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(BLjava/lang/String;)V")
	public void method4979(@OriginalArg(1) String arg0) {
		if (this.method4951()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass160_2.aClass122_1.method2589(Static37.method565(local11));
			this.method4962(local20);
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(II)Z")
	private boolean method4980(@OriginalArg(0) int arg0) {
		if (!this.method4951()) {
			return false;
		} else if (arg0 >= 0 && this.aClass160_2.anIntArray490.length > arg0 && this.aClass160_2.anIntArray490[arg0] != 0) {
			return true;
		} else if (Static62.aBoolean108) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method4981(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4951()) {
			return null;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass160_2.aClass122_1.method2589(Static37.method565(local20));
		if (this.method4980(local32)) {
			@Pc(50) int local50 = this.aClass160_2.aClass122Array1[local32].method2589(Static37.method565(local23));
			return this.method4985(local50, local32);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(II)I")
	public int method4982(@OriginalArg(0) int arg0) {
		if (this.method4951()) {
			@Pc(16) int local16 = this.aClass160_2.aClass122_1.method2589(arg0);
			return this.method4980(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "(II)[I")
	public int[] method4983(@OriginalArg(0) int arg0) {
		if (!this.method4980(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass160_2.anIntArrayArray48[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass160_2.anIntArray489[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local18.length) {
				local18[local37] = local37++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(Z)V")
	public void method4984() {
		if (this.anObjectArray35 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray35.length; local6++) {
				this.anObjectArray35[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(III)[B")
	public byte[] method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4978(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method4986(@OriginalArg(0) String arg0) {
		if (this.method4951()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass160_2.aClass122_1.method2589(Static37.method565(local18));
			return this.method4977(local27);
		} else {
			return 0;
		}
	}
}
