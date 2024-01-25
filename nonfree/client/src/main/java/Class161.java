import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class161 {

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray5;

	@OriginalMember(owner = "client!kea", name = "M", descriptor = "Lclient!bs;")
	private Class37 aClass37_1 = null;

	@OriginalMember(owner = "client!kea", name = "z", descriptor = "Z")
	private final boolean aBoolean347;

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "Lclient!gs;")
	private final Class113 aClass113_1;

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
	public int anInt5061;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!gs;ZI)V")
	public Class161(@OriginalArg(0) Class113 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean347 = arg1;
		this.aClass113_1 = arg0;
		this.anInt5061 = arg2;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)I")
	public int method4236(@OriginalArg(0) int arg0) {
		if (this.method4260()) {
			@Pc(24) int local24 = this.aClass37_1.aClass260_1.method6520(arg0);
			return this.method4244(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(II)V")
	private void method4237(@OriginalArg(1) int arg0) {
		if (this.aBoolean347) {
			this.anObjectArray5[arg0] = this.aClass113_1.method5707(arg0);
		} else {
			this.anObjectArray5[arg0] = Static11.method646(this.aClass113_1.method5707(arg0));
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method4238(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4260()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass37_1.aClass260_1.method6520(Static16.method672(local12));
		if (this.method4244(local29)) {
			@Pc(47) int local47 = this.aClass37_1.aClass260Array1[local29].method6520(Static16.method672(local20));
			return this.method4243(local47, local29);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)I")
	public int method4239() {
		return this.method4260() ? this.aClass37_1.anIntArray139.length : -1;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4240(@OriginalArg(1) String arg0) {
		if (this.method4260()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass37_1.aClass260_1.method6520(Static16.method672(local12));
			return this.method4244(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBI)Z")
	public boolean method4241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4249(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method4237(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(II)[I")
	public int[] method4242(@OriginalArg(0) int arg0) {
		if (!this.method4244(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass37_1.anIntArrayArray15[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass37_1.anIntArray138[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIB)[B")
	public byte[] method4243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4254(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI)Z")
	private boolean method4244(@OriginalArg(1) int arg0) {
		if (!this.method4260()) {
			return false;
		} else if (arg0 >= 0 && this.aClass37_1.anIntArray139.length > arg0 && this.aClass37_1.anIntArray139[arg0] != 0) {
			return true;
		} else if (Static496.aBoolean648) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method4245(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4260()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass37_1.aClass260_1.method6520(Static16.method672(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(42) int local42 = this.aClass37_1.aClass260Array1[local24].method6520(Static16.method672(local15));
			return local42 >= 0;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4246(@OriginalArg(0) String arg0) {
		if (this.method4260()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass37_1.aClass260_1.method6520(Static16.method672(local20));
			return this.method4269(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(II)V")
	private void method4247(@OriginalArg(0) int arg0) {
		this.aClass113_1.method5706(arg0);
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(II)I")
	private int method4248(@OriginalArg(0) int arg0) {
		if (this.method4244(arg0)) {
			return this.anObjectArray5[arg0] == null ? this.aClass113_1.method5708(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)Z")
	private boolean method4249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4260()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass37_1.anIntArray139.length > arg1 && this.aClass37_1.anIntArray139[arg1] > arg0) {
			return true;
		} else if (Static496.aBoolean648) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V")
	public void method4250() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4251(@OriginalArg(1) String arg0) {
		if (this.method4260()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass37_1.aClass260_1.method6520(Static16.method672(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)I")
	public int method4253() {
		if (!this.method4260()) {
			throw new IllegalStateException("");
		}
		return this.aClass37_1.anInt1017;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZI[II)[B")
	public byte[] method4254(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method4249(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(34) boolean local34 = this.method4261(arg2, arg1, arg0);
			if (!local34) {
				this.method4237(arg2);
				local34 = this.method4261(arg2, arg1, arg0);
				if (!local34) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static242.method4205(false, this.anObjectArrayArray1[arg2][arg0]);
		if (this.anInt5061 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass37_1.anIntArray139[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt5061 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local61;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZZ)V")
	public void method4255(@OriginalArg(2) boolean arg0) {
		if (!this.method4260()) {
			return;
		}
		if (arg0) {
			this.aClass37_1.anIntArray140 = null;
			this.aClass37_1.aClass260_1 = null;
		}
		this.aClass37_1.aClass260Array1 = null;
		this.aClass37_1.anIntArrayArray16 = null;
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
	public void method4256() {
		if (this.anObjectArray5 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anObjectArray5.length; local13++) {
				this.anObjectArray5[local13] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method4258(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4260()) {
			return false;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(30) int local30 = this.aClass37_1.aClass260_1.method6520(Static16.method672(local18));
		if (this.method4244(local30)) {
			@Pc(48) int local48 = this.aClass37_1.aClass260Array1[local30].method6520(Static16.method672(local21));
			return this.method4241(local30, local48);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public void method4259(@OriginalArg(1) String arg0) {
		if (this.method4260()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass37_1.aClass260_1.method6520(Static16.method672(local11));
			this.method4247(local20);
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)Z")
	private boolean method4260() {
		if (this.aClass37_1 == null) {
			this.aClass37_1 = this.aClass113_1.method5710();
			if (this.aClass37_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass37_1.anInt1020][];
			this.anObjectArray5 = new Object[this.aClass37_1.anInt1020];
		}
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[III)Z")
	private boolean method4261(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method4244(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass37_1.anIntArray138[arg0];
			@Pc(31) int[] local31 = this.aClass37_1.anIntArrayArray15[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass37_1.anIntArray139[arg0]];
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
			@Pc(112) byte[] local112;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local112 = Static242.method4205(false, this.anObjectArray5[arg0]);
			} else {
				local112 = Static242.method4205(true, this.anObjectArray5[arg0]);
				@Pc(127) Class3_Sub27 local127 = new Class3_Sub27(local112);
				local127.method7599(local127.aByteArray114.length, arg1);
			}
			@Pc(139) byte[] local139;
			try {
				local139 = Static508.method7284(local112);
			} catch (@Pc(141) RuntimeException local141) {
				throw Static209.method3851(local141, "T3 - " + (arg1 != null) + "," + arg0 + "," + local112.length + "," + Static359.method5618(local112, local112.length) + "," + Static359.method5618(local112, local112.length - 2) + "," + this.aClass37_1.anIntArray136[arg0] + "," + this.aClass37_1.anInt1017);
			}
			if (this.aBoolean347) {
				this.anObjectArray5[arg0] = null;
			}
			@Pc(216) int local216;
			if (local25 > 1) {
				@Pc(223) int local223;
				@Pc(236) Class3_Sub27 local236;
				@Pc(244) int local244;
				@Pc(248) int local248;
				@Pc(250) int local250;
				@Pc(312) int local312;
				@Pc(314) int local314;
				@Pc(318) int local318;
				@Pc(320) int local320;
				if (this.anInt5061 == 2) {
					local216 = local139.length;
					local216--;
					local223 = local139[local216] & 0xFF;
					local216 -= local25 * 4 * local223;
					local236 = new Class3_Sub27(local139);
					@Pc(429) int local429 = 0;
					local244 = 0;
					local236.anInt9191 = local216;
					for (local248 = 0; local248 < local223; local248++) {
						local250 = 0;
						for (local312 = 0; local312 < local25; local312++) {
							local250 += local236.method7549();
							if (local31 == null) {
								local314 = local312;
							} else {
								local314 = local31[local312];
							}
							if (local314 == arg2) {
								local244 = local314;
								local429 += local250;
							}
						}
					}
					if (local429 == 0) {
						return true;
					}
					@Pc(488) byte[] local488 = new byte[local429];
					local236.anInt9191 = local216;
					local429 = 0;
					local312 = 0;
					for (local314 = 0; local314 < local223; local314++) {
						local318 = 0;
						for (local320 = 0; local320 < local25; local320++) {
							local318 += local236.method7549();
							@Pc(517) int local517;
							if (local31 == null) {
								local517 = local320;
							} else {
								local517 = local31[local320];
							}
							if (arg2 == local517) {
								Static559.method5957(local139, local312, local488, local429, local318);
								local429 += local318;
							}
							local312 += local318;
						}
					}
					local51[local244] = local488;
				} else {
					local216 = local139.length;
					@Pc(219) int local219 = local216 - 1;
					local223 = local139[local219] & 0xFF;
					@Pc(231) int local231 = local219 - local223 * 4 * local25;
					local236 = new Class3_Sub27(local139);
					@Pc(239) int[] local239 = new int[local25];
					local236.anInt9191 = local231;
					for (local244 = 0; local244 < local223; local244++) {
						local248 = 0;
						for (local250 = 0; local250 < local25; local250++) {
							local248 += local236.method7549();
							local239[local250] += local248;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local25][];
					for (local250 = 0; local250 < local25; local250++) {
						local284[local250] = new byte[local239[local250]];
						local239[local250] = 0;
					}
					local236.anInt9191 = local231;
					local312 = 0;
					for (local314 = 0; local314 < local223; local314++) {
						local318 = 0;
						for (local320 = 0; local320 < local25; local320++) {
							local318 += local236.method7549();
							Static559.method5957(local139, local312, local284[local320], local239[local320], local318);
							local239[local320] += local318;
							local312 += local318;
						}
					}
					for (local318 = 0; local318 < local25; local318++) {
						if (local31 == null) {
							local320 = local318;
						} else {
							local320 = local31[local318];
						}
						if (this.anInt5061 == 0) {
							local51[local320] = Static11.method646(local284[local318]);
						} else {
							local51[local320] = local284[local318];
						}
					}
				}
			} else {
				if (local31 == null) {
					local216 = 0;
				} else {
					local216 = local31[0];
				}
				if (this.anInt5061 == 0) {
					local51[local216] = Static11.method646(local139);
				} else {
					local51[local216] = local139;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!kea", name = "e", descriptor = "(I)Z")
	public boolean method4262() {
		if (!this.method4260()) {
			return false;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass37_1.anIntArray137.length; local21++) {
			@Pc(29) int local29 = this.aClass37_1.anIntArray137[local21];
			if (this.anObjectArray5[local29] == null) {
				this.method4237(local29);
				if (this.anObjectArray5[local29] == null) {
					local19 = false;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Z)I")
	public int method4263() {
		if (!this.method4260()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray5.length; local17++) {
			if (this.aClass37_1.anIntArray138[local17] > 0) {
				local13 += 100;
				local15 += this.method4248(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(II)V")
	public void method4264(@OriginalArg(0) int arg0) {
		if (this.method4244(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BI)[B")
	public byte[] method4265(@OriginalArg(1) int arg0) {
		if (!this.method4260()) {
			return null;
		} else if (this.aClass37_1.anIntArray139.length == 1) {
			return this.method4243(arg0, 0);
		} else if (!this.method4244(arg0)) {
			return null;
		} else if (this.aClass37_1.anIntArray139[arg0] == 1) {
			return this.method4243(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "(II)I")
	public int method4266(@OriginalArg(1) int arg0) {
		return this.method4244(arg0) ? this.aClass37_1.anIntArray139[arg0] : 0;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method4267(@OriginalArg(0) String arg0) {
		if (this.method4260()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass37_1.aClass260_1.method6520(Static16.method672(local17));
			return this.method4248(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)Z")
	public boolean method4268(@OriginalArg(0) int arg0) {
		if (!this.method4260()) {
			return false;
		} else if (this.aClass37_1.anIntArray139.length == 1) {
			return this.method4241(0, arg0);
		} else if (!this.method4244(arg0)) {
			return false;
		} else if (this.aClass37_1.anIntArray139[arg0] == 1) {
			return this.method4241(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "(II)Z")
	public boolean method4269(@OriginalArg(1) int arg0) {
		if (!this.method4244(arg0)) {
			return false;
		} else if (this.anObjectArray5[arg0] == null) {
			this.method4237(arg0);
			return this.anObjectArray5[arg0] != null;
		} else {
			return true;
		}
	}
}
