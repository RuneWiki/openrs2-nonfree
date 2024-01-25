import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class187 {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!ph", name = "I", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "Lclient!ea;")
	private Class64 aClass64_2 = null;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "Z")
	private final boolean aBoolean357;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "Lclient!lc;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	public int anInt5387;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!lc;ZI)V")
	public Class187(@OriginalArg(0) Class131 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean357 = arg1;
		this.aClass131_1 = arg0;
		this.anInt5387 = arg2;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4275(@OriginalArg(1) String arg0) {
		if (this.method4292()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass64_2.aClass135_1.method3188(Static378.method5101(local14));
			return this.method4287(local23);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method4276(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4292()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass64_2.aClass135_1.method3188(Static378.method5101(local12));
		if (this.method4299(local24)) {
			@Pc(50) int local50 = this.aClass64_2.aClass135Array1[local24].method3188(Static378.method5101(local15));
			return this.method4284(local50, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)I")
	public int method4277(@OriginalArg(0) int arg0) {
		if (this.method4292()) {
			@Pc(21) int local21 = this.aClass64_2.aClass135_1.method3188(arg0);
			return this.method4299(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4278(@OriginalArg(0) String arg0) {
		if (this.method4292()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass64_2.aClass135_1.method3188(Static378.method5101(local20));
			return this.method4299(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZI)V")
	public void method4279(@OriginalArg(0) boolean arg0) {
		if (!this.method4292()) {
			return;
		}
		this.aClass64_2.aClass135Array1 = null;
		this.aClass64_2.anIntArrayArray13 = null;
		if (arg0) {
			this.aClass64_2.aClass135_1 = null;
			this.aClass64_2.anIntArray142 = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4280(@OriginalArg(0) String arg0) {
		if (this.method4292()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass64_2.aClass135_1.method3188(Static378.method5101(local14));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)Z")
	public boolean method4282(@OriginalArg(0) int arg0) {
		if (!this.method4292()) {
			return false;
		} else if (this.aClass64_2.anIntArray144.length == 1) {
			return this.method4284(arg0, 0);
		} else if (!this.method4299(arg0)) {
			return false;
		} else if (this.aClass64_2.anIntArray144[arg0] == 1) {
			return this.method4284(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Z")
	public boolean method4284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4304(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray35[arg1] == null) {
			this.method4295(arg1);
			return this.anObjectArray35[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public void method4285() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
	public int method4286() {
		if (!this.method4292()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray35.length; local17++) {
			if (this.aClass64_2.anIntArray141[local17] > 0) {
				local15 += this.method4288(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Z")
	public boolean method4287(@OriginalArg(1) int arg0) {
		if (!this.method4299(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method4295(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I")
	private int method4288(@OriginalArg(1) int arg0) {
		if (this.method4299(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass131_1.method3126(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method4289(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4292()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass64_2.aClass135_1.method3188(Static378.method5101(local12));
		if (this.method4299(local24)) {
			@Pc(42) int local42 = this.aClass64_2.aClass135Array1[local24].method3188(Static378.method5101(local15));
			return this.method4300(local24, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method4290(@OriginalArg(1) String arg0) {
		if (this.method4292()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass64_2.aClass135_1.method3188(Static378.method5101(local11));
			this.method4296(local26);
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)[I")
	public int[] method4291(@OriginalArg(1) int arg0) {
		if (!this.method4299(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass64_2.anIntArrayArray14[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass64_2.anIntArray141[arg0]];
			@Pc(29) int local29 = 0;
			while (local29 < local18.length) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)Z")
	private boolean method4292() {
		if (this.aClass64_2 == null) {
			this.aClass64_2 = this.aClass131_1.method3125();
			if (this.aClass64_2 == null) {
				return false;
			}
			this.anObjectArray35 = new Object[this.aClass64_2.anInt1829];
			this.anObjectArrayArray1 = new Object[this.aClass64_2.anInt1829][];
		}
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
	public boolean method4293() {
		if (!this.method4292()) {
			return false;
		}
		@Pc(22) boolean local22 = true;
		for (@Pc(24) int local24 = 0; local24 < this.aClass64_2.anIntArray146.length; local24++) {
			@Pc(32) int local32 = this.aClass64_2.anIntArray146[local24];
			if (this.anObjectArray35[local32] == null) {
				this.method4295(local32);
				if (this.anObjectArray35[local32] == null) {
					local22 = false;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IB)V")
	private void method4295(@OriginalArg(0) int arg0) {
		if (this.aBoolean357) {
			this.anObjectArray35[arg0] = this.aClass131_1.method3124(arg0);
		} else {
			this.anObjectArray35[arg0] = Static102.method1793(this.aClass131_1.method3124(arg0));
		}
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(II)V")
	private void method4296(@OriginalArg(1) int arg0) {
		this.aClass131_1.method3123(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(II)V")
	public void method4297(@OriginalArg(0) int arg0) {
		if (this.method4299(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
	public void method4298() {
		if (this.anObjectArray35 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray35.length; local10++) {
				this.anObjectArray35[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(II)Z")
	private boolean method4299(@OriginalArg(0) int arg0) {
		if (!this.method4292()) {
			return false;
		} else if (arg0 >= 0 && this.aClass64_2.anIntArray144.length > arg0 && this.aClass64_2.anIntArray144[arg0] != 0) {
			return true;
		} else if (Static338.aBoolean368) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)[B")
	public byte[] method4300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4301(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[I)[B")
	public byte[] method4301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4304(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(32) boolean local32 = this.method4307(arg0, arg1, arg2);
			if (!local32) {
				this.method4295(arg0);
				local32 = this.method4307(arg0, arg1, arg2);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static228.method3400(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt5387 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass64_2.anIntArray144[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt5387 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)I")
	public int method4302() {
		return this.method4292() ? this.aClass64_2.anIntArray144.length : -1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[B")
	public byte[] method4303(@OriginalArg(1) int arg0) {
		if (!this.method4292()) {
			return null;
		} else if (this.aClass64_2.anIntArray144.length == 1) {
			return this.method4300(0, arg0);
		} else if (!this.method4299(arg0)) {
			return null;
		} else if (this.aClass64_2.anIntArray144[arg0] == 1) {
			return this.method4300(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)Z")
	private boolean method4304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4292()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass64_2.anIntArray144.length > arg0 && this.aClass64_2.anIntArray144[arg0] > arg1) {
			return true;
		} else if (Static338.aBoolean368) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "(II)I")
	public int method4306(@OriginalArg(0) int arg0) {
		return this.method4299(arg0) ? this.aClass64_2.anIntArray144[arg0] : 0;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III[I)Z")
	private boolean method4307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4299(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			return false;
		} else {
			@Pc(36) int local36 = this.aClass64_2.anIntArray141[arg0];
			@Pc(42) int[] local42 = this.aClass64_2.anIntArrayArray14[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass64_2.anIntArray144[arg0]];
			}
			@Pc(62) Object[] local62 = this.anObjectArrayArray1[arg0];
			@Pc(64) boolean local64 = true;
			for (@Pc(66) int local66 = 0; local66 < local36; local66++) {
				@Pc(74) int local74;
				if (local42 == null) {
					local74 = local66;
				} else {
					local74 = local42[local66];
				}
				if (local62[local74] == null) {
					local64 = false;
					break;
				}
			}
			if (local64) {
				return true;
			}
			@Pc(130) byte[] local130;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local130 = Static228.method3400(false, this.anObjectArray35[arg0]);
			} else {
				local130 = Static228.method3400(true, this.anObjectArray35[arg0]);
				@Pc(135) Class10_Sub8 local135 = new Class10_Sub8(local130);
				local135.method2501(local135.aByteArray44.length, arg2);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static140.method2398(local130);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static149.method2570(local159, "T3 - " + (arg2 != null) + "," + arg0 + "," + local130.length + "," + Static375.method4993(local130.length, local130) + "," + Static375.method4993(local130.length - 2, local130) + "," + this.aClass64_2.anIntArray145[arg0] + "," + this.aClass64_2.anInt1827);
			}
			if (this.aBoolean357) {
				this.anObjectArray35[arg0] = null;
			}
			@Pc(231) int local231;
			if (local36 <= 1) {
				if (local42 == null) {
					local231 = 0;
				} else {
					local231 = local42[0];
				}
				if (this.anInt5387 == 0) {
					local62[local231] = Static102.method1793(local157);
				} else {
					local62[local231] = local157;
				}
			} else {
				@Pc(272) int local272;
				@Pc(285) Class10_Sub8 local285;
				@Pc(289) int local289;
				@Pc(294) int local294;
				@Pc(298) int local298;
				@Pc(300) int local300;
				@Pc(312) int local312;
				@Pc(358) int local358;
				@Pc(360) int local360;
				if (this.anInt5387 == 2) {
					local231 = local157.length;
					local231--;
					local272 = local157[local231] & 0xFF;
					local231 -= local272 * local36 * 4;
					local285 = new Class10_Sub8(local157);
					@Pc(287) int local287 = 0;
					local289 = 0;
					local285.anInt2989 = local231;
					for (local294 = 0; local294 < local272; local294++) {
						local298 = 0;
						for (local300 = 0; local300 < local36; local300++) {
							local298 += local285.method2459();
							if (local42 == null) {
								local312 = local300;
							} else {
								local312 = local42[local300];
							}
							if (arg1 == local312) {
								local289 = local312;
								local287 += local298;
							}
						}
					}
					if (local287 == 0) {
						return true;
					}
					@Pc(345) byte[] local345 = new byte[local287];
					local285.anInt2989 = local231;
					local287 = 0;
					local300 = 0;
					for (local312 = 0; local312 < local272; local312++) {
						local358 = 0;
						for (local360 = 0; local360 < local36; local360++) {
							local358 += local285.method2459();
							@Pc(372) int local372;
							if (local42 == null) {
								local372 = local360;
							} else {
								local372 = local42[local360];
							}
							if (local372 == arg1) {
								Static468.method4350(local157, local300, local345, local287, local358);
								local287 += local358;
							}
							local300 += local358;
						}
					}
					local62[local289] = local345;
				} else {
					local231 = local157.length;
					local231--;
					local272 = local157[local231] & 0xFF;
					local231 -= local36 * local272 * 4;
					local285 = new Class10_Sub8(local157);
					@Pc(439) int[] local439 = new int[local36];
					local285.anInt2989 = local231;
					for (local289 = 0; local289 < local272; local289++) {
						local294 = 0;
						for (local298 = 0; local298 < local36; local298++) {
							local294 += local285.method2459();
							local439[local298] += local294;
						}
					}
					@Pc(480) byte[][] local480 = new byte[local36][];
					for (local298 = 0; local298 < local36; local298++) {
						local480[local298] = new byte[local439[local298]];
						local439[local298] = 0;
					}
					local285.anInt2989 = local231;
					local300 = 0;
					for (local312 = 0; local312 < local272; local312++) {
						local358 = 0;
						for (local360 = 0; local360 < local36; local360++) {
							local358 += local285.method2459();
							Static468.method4350(local157, local300, local480[local360], local439[local360], local358);
							local439[local360] += local358;
							local300 += local358;
						}
					}
					for (local358 = 0; local358 < local36; local358++) {
						if (local42 == null) {
							local360 = local358;
						} else {
							local360 = local42[local358];
						}
						if (this.anInt5387 == 0) {
							local62[local360] = Static102.method1793(local480[local358]);
						} else {
							local62[local360] = local480[local358];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)I")
	public int method4309() {
		if (!this.method4292()) {
			throw new IllegalStateException("");
		}
		return this.aClass64_2.anInt1827;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method4310(@OriginalArg(1) String arg0) {
		if (this.method4292()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass64_2.aClass135_1.method3188(Static378.method5101(local20));
			return this.method4288(local29);
		} else {
			return 0;
		}
	}
}
