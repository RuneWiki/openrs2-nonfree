import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class171 {

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "[I")
	public static final int[] anIntArray395 = new int[32];

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "Lclient!ne;")
	private Class178 aClass178_1 = null;

	@OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
	public int anInt4582;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "Z")
	private final boolean aBoolean328;

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Lclient!aj;")
	private final Class10 aClass10_1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray395[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!aj;ZI)V")
	public Class171(@OriginalArg(0) Class10 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt4582 = arg2;
		this.aBoolean328 = arg1;
		this.aClass10_1 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([IIBI)Z")
	private boolean method3645(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method3654(arg1)) {
			return false;
		} else if (this.anObjectArray34[arg1] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass178_1.anIntArray414[arg1];
			@Pc(29) int[] local29 = this.aClass178_1.anIntArrayArray117[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass178_1.anIntArray409[arg1]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg1];
			@Pc(51) boolean local51 = true;
			for (@Pc(53) int local53 = 0; local53 < local23; local53++) {
				@Pc(60) int local60;
				if (local29 == null) {
					local60 = local53;
				} else {
					local60 = local29[local53];
				}
				if (local49[local60] == null) {
					local51 = false;
					break;
				}
			}
			if (local51) {
				return true;
			}
			@Pc(113) byte[] local113;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local113 = Static183.method2650(this.anObjectArray34[arg1], false);
			} else {
				local113 = Static183.method2650(this.anObjectArray34[arg1], true);
				@Pc(127) Class2_Sub17 local127 = new Class2_Sub17(local113);
				local127.method6166(arg0, local127.aByteArray94.length);
			}
			@Pc(139) byte[] local139;
			try {
				local139 = Static290.method4111(local113);
			} catch (@Pc(141) RuntimeException local141) {
				throw Static29.method476(local141, "T3 - " + (arg0 != null) + "," + arg1 + "," + local113.length + "," + Static203.method2863(local113.length, local113) + "," + Static203.method2863(local113.length - 2, local113) + "," + this.aClass178_1.anIntArray415[arg1] + "," + this.aClass178_1.anInt4951);
			}
			if (this.aBoolean328) {
				this.anObjectArray34[arg1] = null;
			}
			@Pc(213) int local213;
			if (local23 <= 1) {
				if (local29 == null) {
					local213 = 0;
				} else {
					local213 = local29[0];
				}
				if (this.anInt4582 == 0) {
					local49[local213] = Static191.method2759(local139);
				} else {
					local49[local213] = local139;
				}
			} else {
				@Pc(249) int local249;
				@Pc(262) Class2_Sub17 local262;
				@Pc(270) int local270;
				@Pc(273) int local273;
				@Pc(275) int local275;
				@Pc(331) int local331;
				@Pc(333) int local333;
				@Pc(336) int local336;
				@Pc(338) int local338;
				if (this.anInt4582 == 2) {
					local213 = local139.length;
					local213--;
					local249 = local139[local213] & 0xFF;
					local213 -= local23 * local249 * 4;
					local262 = new Class2_Sub17(local139);
					@Pc(435) int local435 = 0;
					local270 = 0;
					local262.anInt7523 = local213;
					for (local273 = 0; local273 < local249; local273++) {
						local275 = 0;
						for (local331 = 0; local331 < local23; local331++) {
							local275 += local262.method6129();
							if (local29 == null) {
								local333 = local331;
							} else {
								local333 = local29[local331];
							}
							if (local333 == arg2) {
								local270 = local333;
								local435 += local275;
							}
						}
					}
					if (local435 == 0) {
						return true;
					}
					@Pc(495) byte[] local495 = new byte[local435];
					local262.anInt7523 = local213;
					local435 = 0;
					local331 = 0;
					for (local333 = 0; local333 < local249; local333++) {
						local336 = 0;
						for (local338 = 0; local338 < local23; local338++) {
							local336 += local262.method6129();
							@Pc(522) int local522;
							if (local29 == null) {
								local522 = local338;
							} else {
								local522 = local29[local338];
							}
							if (arg2 == local522) {
								Static472.method5022(local139, local331, local495, local435, local336);
								local435 += local336;
							}
							local331 += local336;
						}
					}
					local49[local270] = local495;
				} else {
					local213 = local139.length;
					local213--;
					local249 = local139[local213] & 0xFF;
					local213 -= local23 * local249 * 4;
					local262 = new Class2_Sub17(local139);
					local262.anInt7523 = local213;
					@Pc(268) int[] local268 = new int[local23];
					for (local270 = 0; local270 < local249; local270++) {
						local273 = 0;
						for (local275 = 0; local275 < local23; local275++) {
							local273 += local262.method6129();
							local268[local275] += local273;
						}
					}
					@Pc(308) byte[][] local308 = new byte[local23][];
					for (local275 = 0; local275 < local23; local275++) {
						local308[local275] = new byte[local268[local275]];
						local268[local275] = 0;
					}
					local262.anInt7523 = local213;
					local331 = 0;
					for (local333 = 0; local333 < local249; local333++) {
						local336 = 0;
						for (local338 = 0; local338 < local23; local338++) {
							local336 += local262.method6129();
							Static472.method5022(local139, local331, local308[local338], local268[local338], local336);
							local331 += local336;
							local268[local338] += local336;
						}
					}
					for (local336 = 0; local336 < local23; local336++) {
						if (local29 == null) {
							local338 = local336;
						} else {
							local338 = local29[local336];
						}
						if (this.anInt4582 == 0) {
							local49[local338] = Static191.method2759(local308[local336]);
						} else {
							local49[local338] = local308[local336];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Z")
	public boolean method3646() {
		if (!this.method3660()) {
			return false;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass178_1.anIntArray413.length; local21++) {
			@Pc(28) int local28 = this.aClass178_1.anIntArray413[local21];
			if (this.anObjectArray34[local28] == null) {
				this.method3659(local28);
				if (this.anObjectArray34[local28] == null) {
					local19 = false;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)Z")
	public boolean method3647(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3675(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method3659(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method3648(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3660()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass178_1.aClass207_1.method4852(Static331.method4732(local12));
		if (this.method3654(local24)) {
			@Pc(42) int local42 = this.aClass178_1.aClass207Array1[local24].method4852(Static331.method4732(local15));
			return this.method3647(local24, local42);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)I")
	public int method3649(@OriginalArg(0) int arg0) {
		if (this.method3660()) {
			@Pc(23) int local23 = this.aClass178_1.aClass207_1.method4852(arg0);
			return this.method3654(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	public void method3651() {
		if (this.anObjectArray34 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray34.length; local10++) {
				this.anObjectArray34[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(IB)I")
	private int method3652(@OriginalArg(0) int arg0) {
		if (this.method3654(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass10_1.method5080(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(IB)V")
	public void method3653(@OriginalArg(0) int arg0) {
		if (this.method3654(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)Z")
	private boolean method3654(@OriginalArg(1) int arg0) {
		if (!this.method3660()) {
			return false;
		} else if (arg0 >= 0 && this.aClass178_1.anIntArray409.length > arg0 && this.aClass178_1.anIntArray409[arg0] != 0) {
			return true;
		} else if (Static22.aBoolean18) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3655(@OriginalArg(1) String arg0) {
		if (this.method3660()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass178_1.aClass207_1.method4852(Static331.method4732(local12));
			return this.method3656(local21);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)Z")
	public boolean method3656(@OriginalArg(1) int arg0) {
		if (!this.method3654(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method3659(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3657(@OriginalArg(0) String arg0) {
		if (this.method3660()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass178_1.aClass207_1.method4852(Static331.method4732(local12));
			return this.method3652(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)[B")
	public byte[] method3658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method3665(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)V")
	private void method3659(@OriginalArg(1) int arg0) {
		if (this.aBoolean328) {
			this.anObjectArray34[arg0] = this.aClass10_1.method5077(arg0);
		} else {
			this.anObjectArray34[arg0] = Static191.method2759(this.aClass10_1.method5077(arg0));
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)Z")
	private boolean method3660() {
		if (this.aClass178_1 == null) {
			this.aClass178_1 = this.aClass10_1.method5076();
			if (this.aClass178_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass178_1.anInt4955][];
			this.anObjectArray34 = new Object[this.aClass178_1.anInt4955];
		}
		return true;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3661(@OriginalArg(1) String arg0) {
		if (this.method3660()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass178_1.aClass207_1.method4852(Static331.method4732(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(IB)I")
	public int method3662(@OriginalArg(0) int arg0) {
		return this.method3654(arg0) ? this.aClass178_1.anIntArray409[arg0] : 0;
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(IB)V")
	private void method3663(@OriginalArg(0) int arg0) {
		this.aClass10_1.method5073(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "(IB)[B")
	public byte[] method3664(@OriginalArg(0) int arg0) {
		if (!this.method3660()) {
			return null;
		} else if (this.aClass178_1.anIntArray409.length == 1) {
			return this.method3658(0, arg0);
		} else if (!this.method3654(arg0)) {
			return null;
		} else if (this.aClass178_1.anIntArray409[arg0] == 1) {
			return this.method3658(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([IZII)[B")
	public byte[] method3665(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method3675(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(30) boolean local30 = this.method3645(arg0, arg2, arg1);
			if (!local30) {
				this.method3659(arg2);
				local30 = this.method3645(arg0, arg2, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static183.method2650(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt4582 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass178_1.anIntArray409[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt4582 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)Z")
	public boolean method3666(@OriginalArg(0) int arg0) {
		if (!this.method3660()) {
			return false;
		} else if (this.aClass178_1.anIntArray409.length == 1) {
			return this.method3647(0, arg0);
		} else if (!this.method3654(arg0)) {
			return false;
		} else if (this.aClass178_1.anIntArray409[arg0] == 1) {
			return this.method3647(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	public void method3667() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArrayArray1.length; local4++) {
				this.anObjectArrayArray1[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method3668(@OriginalArg(1) String arg0) {
		if (this.method3660()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass178_1.aClass207_1.method4852(Static331.method4732(local12));
			return this.method3654(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIZ)V")
	public void method3669(@OriginalArg(0) boolean arg0) {
		if (!this.method3660()) {
			return;
		}
		if (arg0) {
			this.aClass178_1.aClass207_1 = null;
			this.aClass178_1.anIntArray412 = null;
		}
		this.aClass178_1.aClass207Array1 = null;
		this.aClass178_1.anIntArrayArray116 = null;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)[I")
	public int[] method3670(@OriginalArg(0) int arg0) {
		if (!this.method3654(arg0)) {
			return null;
		}
		@Pc(21) int[] local21 = this.aClass178_1.anIntArrayArray117[arg0];
		if (local21 == null) {
			local21 = new int[this.aClass178_1.anIntArray414[arg0]];
			@Pc(32) int local32 = 0;
			while (local21.length > local32) {
				local21[local32] = local32++;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
	public int method3671() {
		if (!this.method3660()) {
			throw new IllegalStateException("");
		}
		return this.aClass178_1.anInt4951;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)I")
	public int method3672() {
		if (!this.method3660()) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray34.length; local25++) {
			if (this.aClass178_1.anIntArray414[local25] > 0) {
				local23 += this.method3652(local25);
				local21 += 100;
			}
		}
		if (local21 == 0) {
			return 100;
		} else {
			return local23 * 100 / local21;
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method3674(@OriginalArg(1) String arg0) {
		if (this.method3660()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass178_1.aClass207_1.method4852(Static331.method4732(local11));
			this.method3663(local20);
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)Z")
	private boolean method3675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3660()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass178_1.anIntArray409.length && this.aClass178_1.anIntArray409[arg1] > arg0) {
			return true;
		} else if (Static22.aBoolean18) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3676(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3660()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass178_1.aClass207_1.method4852(Static331.method4732(local12));
		if (this.method3654(local29)) {
			@Pc(47) int local47 = this.aClass178_1.aClass207Array1[local29].method4852(Static331.method4732(local20));
			return this.method3658(local29, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)I")
	public int method3677() {
		return this.method3660() ? this.aClass178_1.anIntArray409.length : -1;
	}
}
