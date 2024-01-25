import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class229 {

	@OriginalMember(owner = "client!mv", name = "B", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!mv", name = "J", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!mv", name = "L", descriptor = "Lclient!gr;")
	private Class129 aClass129_1 = null;

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "Lclient!fca;")
	private final Class102 aClass102_1;

	@OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
	public int anInt5920;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "Z")
	private final boolean aBoolean466;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!fca;ZI)V")
	public Class229(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass102_1 = arg0;
		this.anInt5920 = arg2;
		this.aBoolean466 = arg1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method4950(@OriginalArg(1) String arg0) {
		if (this.method4974()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass129_1.aClass183_1.method3666(Static577.method7484(local16));
			return this.method4973(local25);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4951(@OriginalArg(0) String arg0) {
		if (this.method4974()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass129_1.aClass183_1.method3666(Static577.method7484(local12));
			return local28 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
	public int method4952() {
		return this.method4974() ? this.aClass129_1.anIntArray223.length : -1;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method4953(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4974()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass129_1.aClass183_1.method3666(Static577.method7484(local12));
		if (this.method4986(local32)) {
			@Pc(50) int local50 = this.aClass129_1.aClass183Array1[local32].method3666(Static577.method7484(local23));
			return this.method4980(local32, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II)Z")
	public boolean method4954(@OriginalArg(0) int arg0) {
		if (!this.method4974()) {
			return false;
		} else if (this.aClass129_1.anIntArray223.length == 1) {
			return this.method4979(0, arg0);
		} else if (!this.method4986(arg0)) {
			return false;
		} else if (this.aClass129_1.anIntArray223[arg0] == 1) {
			return this.method4979(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method4955(@OriginalArg(0) String arg0) {
		if (this.method4974()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass129_1.aClass183_1.method3666(Static577.method7484(local12));
			return this.method4986(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)I")
	public int method4956() {
		if (!this.method4974()) {
			throw new IllegalStateException("");
		}
		return this.aClass129_1.anInt2684;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BI)V")
	private void method4958(@OriginalArg(1) int arg0) {
		if (this.aBoolean466) {
			this.anObjectArray2[arg0] = this.aClass102_1.method6630(arg0);
		} else {
			this.anObjectArray2[arg0] = Static144.method1989(this.aClass102_1.method6630(arg0));
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method4959(@OriginalArg(0) String arg0) {
		if (this.method4974()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass129_1.aClass183_1.method3666(Static577.method7484(local20));
			return this.method4984(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
	public void method4961() {
		if (this.anObjectArray2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray2.length; local6++) {
				this.anObjectArray2[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IBI)Z")
	private boolean method4962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4974()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass129_1.anIntArray223.length && arg0 < this.aClass129_1.anIntArray223[arg1]) {
			return true;
		} else if (Static174.aBoolean187) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method4963(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4974()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass129_1.aClass183_1.method3666(Static577.method7484(local12));
		if (this.method4986(local29)) {
			@Pc(49) int local49 = this.aClass129_1.aClass183Array1[local29].method3666(Static577.method7484(local20));
			return this.method4979(local29, local49);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(II)I")
	public int method4964(@OriginalArg(0) int arg0) {
		if (this.method4974()) {
			@Pc(16) int local16 = this.aClass129_1.aClass183_1.method3666(arg0);
			return this.method4986(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
	public void method4965() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZI)[B")
	public byte[] method4966(@OriginalArg(1) int arg0) {
		if (!this.method4974()) {
			return null;
		} else if (this.aClass129_1.anIntArray223.length == 1) {
			return this.method4980(0, arg0);
		} else if (!this.method4986(arg0)) {
			return null;
		} else if (this.aClass129_1.anIntArray223[arg0] == 1) {
			return this.method4980(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method4967(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4974()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass129_1.aClass183_1.method3666(Static577.method7484(local12));
		if (local26 < 0) {
			return false;
		} else {
			@Pc(44) int local44 = this.aClass129_1.aClass183Array1[local26].method3666(Static577.method7484(local15));
			return local44 >= 0;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)V")
	public void method4968(@OriginalArg(0) int arg0) {
		if (this.method4986(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZZB)V")
	public void method4969(@OriginalArg(1) boolean arg0) {
		if (!this.method4974()) {
			return;
		}
		if (arg0) {
			this.aClass129_1.aClass183_1 = null;
			this.aClass129_1.anIntArray226 = null;
		}
		this.aClass129_1.anIntArrayArray29 = null;
		this.aClass129_1.aClass183Array1 = null;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[IB)[B")
	public byte[] method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method4962(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method4985(arg1, arg0, arg2);
			if (!local30) {
				this.method4958(arg0);
				local30 = this.method4985(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static479.method6201(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt5920 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass129_1.anIntArray223[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt5920 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public void method4971(@OriginalArg(0) String arg0) {
		if (this.method4974()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass129_1.aClass183_1.method3666(Static577.method7484(local15));
			this.method4972(local24);
		}
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(II)V")
	private void method4972(@OriginalArg(1) int arg0) {
		this.aClass102_1.method6628(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(BI)I")
	private int method4973(@OriginalArg(1) int arg0) {
		if (this.method4986(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass102_1.method6629(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)Z")
	private boolean method4974() {
		if (this.aClass129_1 == null) {
			this.aClass129_1 = this.aClass102_1.method6631();
			if (this.aClass129_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass129_1.anInt2679][];
			this.anObjectArray2 = new Object[this.aClass129_1.anInt2679];
		}
		return true;
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)I")
	public int method4976() {
		if (!this.method4974()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass129_1.anIntArray227[local17] > 0) {
				local15 += this.method4973(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method4977(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method4955("");
		return local8 == -1 ? this.method4963(arg0, "") : this.method4963("", arg0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BII)Z")
	public boolean method4979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4962(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method4958(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)[B")
	public byte[] method4980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method4970(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZ)I")
	public int method4981(@OriginalArg(0) int arg0) {
		return this.method4986(arg0) ? this.aClass129_1.anIntArray223[arg0] : 0;
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(II)[I")
	public int[] method4982(@OriginalArg(0) int arg0) {
		if (!this.method4986(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass129_1.anIntArrayArray30[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass129_1.anIntArray227[arg0]];
			@Pc(29) int local29 = 0;
			while (local29 < local18.length) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)Z")
	public boolean method4983() {
		if (!this.method4974()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass129_1.anIntArray224.length; local20++) {
			@Pc(28) int local28 = this.aClass129_1.anIntArray224[local20];
			if (this.anObjectArray2[local28] == null) {
				this.method4958(local28);
				if (this.anObjectArray2[local28] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(II)Z")
	public boolean method4984(@OriginalArg(1) int arg0) {
		if (!this.method4986(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method4958(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(II[IB)Z")
	private boolean method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method4986(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass129_1.anIntArray227[arg1];
			@Pc(33) int[] local33 = this.aClass129_1.anIntArrayArray30[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass129_1.anIntArray223[arg1]];
			}
			@Pc(53) Object[] local53 = this.anObjectArrayArray1[arg1];
			@Pc(55) boolean local55 = true;
			for (@Pc(63) int local63 = 0; local63 < local27; local63++) {
				@Pc(69) int local69;
				if (local33 == null) {
					local69 = local63;
				} else {
					local69 = local33[local63];
				}
				if (local53[local69] == null) {
					local55 = false;
					break;
				}
			}
			if (local55) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local127 = Static479.method6201(false, this.anObjectArray2[arg1]);
			} else {
				local127 = Static479.method6201(true, this.anObjectArray2[arg1]);
				@Pc(132) Class2_Sub7 local132 = new Class2_Sub7(local127);
				local132.method4485(arg2, local132.aByteArray52.length);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static250.method3584(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static215.method2637(local156, "T3 - " + (arg2 != null) + "," + arg1 + "," + local127.length + "," + Static397.method5449(local127, local127.length) + "," + Static397.method5449(local127, local127.length - 2) + "," + this.aClass129_1.anIntArray225[arg1] + "," + this.aClass129_1.anInt2684);
			}
			if (this.aBoolean466) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(228) int local228;
			if (local27 <= 1) {
				if (local33 == null) {
					local228 = 0;
				} else {
					local228 = local33[0];
				}
				if (this.anInt5920 == 0) {
					local53[local228] = Static144.method1989(local154);
				} else {
					local53[local228] = local154;
				}
			} else {
				@Pc(268) int local268;
				@Pc(281) Class2_Sub7 local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(294) int local294;
				@Pc(296) int local296;
				@Pc(310) int local310;
				@Pc(358) int local358;
				@Pc(360) int local360;
				if (this.anInt5920 == 2) {
					local228 = local154.length;
					local228--;
					local268 = local154[local228] & 0xFF;
					local228 -= local27 * local268 * 4;
					local281 = new Class2_Sub7(local154);
					@Pc(283) int local283 = 0;
					local281.anInt5186 = local228;
					local288 = 0;
					for (local290 = 0; local290 < local268; local290++) {
						local294 = 0;
						for (local296 = 0; local296 < local27; local296++) {
							local294 += local281.method4509();
							if (local33 == null) {
								local310 = local296;
							} else {
								local310 = local33[local296];
							}
							if (local310 == arg0) {
								local288 = local310;
								local283 += local294;
							}
						}
					}
					if (local283 == 0) {
						return true;
					}
					@Pc(345) byte[] local345 = new byte[local283];
					local281.anInt5186 = local228;
					local283 = 0;
					local296 = 0;
					for (local310 = 0; local310 < local268; local310++) {
						local358 = 0;
						for (local360 = 0; local360 < local27; local360++) {
							local358 += local281.method4509();
							@Pc(372) int local372;
							if (local33 == null) {
								local372 = local360;
							} else {
								local372 = local33[local360];
							}
							if (local372 == arg0) {
								Static598.method4261(local154, local296, local345, local283, local358);
								local283 += local358;
							}
							local296 += local358;
						}
					}
					local53[local288] = local345;
				} else {
					local228 = local154.length;
					local228--;
					local268 = local154[local228] & 0xFF;
					local228 -= local268 * 4 * local27;
					local281 = new Class2_Sub7(local154);
					local281.anInt5186 = local228;
					@Pc(446) int[] local446 = new int[local27];
					for (local288 = 0; local288 < local268; local288++) {
						local290 = 0;
						for (local294 = 0; local294 < local27; local294++) {
							local290 += local281.method4509();
							local446[local294] += local290;
						}
					}
					@Pc(488) byte[][] local488 = new byte[local27][];
					for (local294 = 0; local294 < local27; local294++) {
						local488[local294] = new byte[local446[local294]];
						local446[local294] = 0;
					}
					local281.anInt5186 = local228;
					local296 = 0;
					for (local310 = 0; local310 < local268; local310++) {
						local358 = 0;
						for (local360 = 0; local360 < local27; local360++) {
							local358 += local281.method4509();
							Static598.method4261(local154, local296, local488[local360], local446[local360], local358);
							local296 += local358;
							local446[local360] += local358;
						}
					}
					for (local358 = 0; local358 < local27; local358++) {
						if (local33 == null) {
							local360 = local358;
						} else {
							local360 = local33[local358];
						}
						if (this.anInt5920 == 0) {
							local53[local360] = Static144.method1989(local488[local358]);
						} else {
							local53[local360] = local488[local358];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "(II)Z")
	private boolean method4986(@OriginalArg(1) int arg0) {
		if (!this.method4974()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass129_1.anIntArray223.length && this.aClass129_1.anIntArray223[arg0] != 0) {
			return true;
		} else if (Static174.aBoolean187) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}
}
