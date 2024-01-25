import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class180 {

	@OriginalMember(owner = "client!rk", name = "D", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "Lclient!lr;")
	private Class135 aClass135_2 = null;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Z")
	private final boolean aBoolean402;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "Lclient!ph;")
	private final Class119 aClass119_1;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	public int anInt5411;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!ph;ZI)V")
	public Class180(@OriginalArg(0) Class119 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean402 = arg1;
		this.aClass119_1 = arg0;
		this.anInt5411 = arg2;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
	public int method4553(@OriginalArg(0) int arg0) {
		return this.method4580(arg0) ? this.aClass135_2.anIntArray530[arg0] : 0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4554(@OriginalArg(1) String arg0) {
		if (this.method4561()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(34) int local34 = this.aClass135_2.aClass40_1.method882(Static85.method1799(local12));
			return this.method4563(local34);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)Z")
	public boolean method4555(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4581(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method4556(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)V")
	private void method4556(@OriginalArg(0) int arg0) {
		if (this.aBoolean402) {
			this.anObjectArray35[arg0] = this.aClass119_1.method3140(arg0);
		} else {
			this.anObjectArray35[arg0] = Static308.method4999(this.aClass119_1.method3140(arg0));
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)I")
	public int method4557(@OriginalArg(0) int arg0) {
		if (this.method4561()) {
			@Pc(21) int local21 = this.aClass135_2.aClass40_1.method882(arg0);
			return this.method4580(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public void method4558() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArrayArray1.length; local4++) {
				this.anObjectArrayArray1[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method4559(@OriginalArg(0) String arg0) {
		if (this.method4561()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass135_2.aClass40_1.method882(Static85.method1799(local12));
			return this.method4572(local23);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)[B")
	public byte[] method4560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method4566(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Z")
	private boolean method4561() {
		if (this.aClass135_2 == null) {
			this.aClass135_2 = this.aClass119_1.method3138();
			if (this.aClass135_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass135_2.anInt3837][];
			this.anObjectArray35 = new Object[this.aClass135_2.anInt3837];
		}
		return true;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(IB)Z")
	public boolean method4562(@OriginalArg(0) int arg0) {
		if (!this.method4561()) {
			return false;
		} else if (this.aClass135_2.anIntArray530.length == 1) {
			return this.method4555(0, arg0);
		} else if (!this.method4580(arg0)) {
			return false;
		} else if (this.aClass135_2.anIntArray530[arg0] == 1) {
			return this.method4555(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(IB)I")
	private int method4563(@OriginalArg(0) int arg0) {
		if (this.method4580(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass119_1.method3142(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
	public byte[] method4564(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4561()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass135_2.aClass40_1.method882(Static85.method1799(local12));
		if (this.method4580(local24)) {
			@Pc(48) int local48 = this.aClass135_2.aClass40Array1[local24].method882(Static85.method1799(local15));
			return this.method4560(local48, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
	public void method4565() {
		if (this.anObjectArray35 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray35.length; local16++) {
				this.anObjectArray35[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB[II)[B")
	public byte[] method4566(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method4581(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(30) boolean local30 = this.method4577(arg2, arg0, arg1);
			if (!local30) {
				this.method4556(arg2);
				local30 = this.method4577(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static196.method3495(this.anObjectArrayArray1[arg2][arg0], false);
		if (this.anInt5411 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass135_2.anIntArray530[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt5411 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)[I")
	public int[] method4568(@OriginalArg(0) int arg0) {
		if (!this.method4580(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass135_2.anIntArrayArray28[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass135_2.anIntArray525[arg0]];
			@Pc(35) int local35 = 0;
			while (local24.length > local35) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(IB)V")
	public void method4569(@OriginalArg(0) int arg0) {
		if (this.method4580(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4570(@OriginalArg(0) String arg0) {
		if (this.method4561()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass135_2.aClass40_1.method882(Static85.method1799(local12));
			return this.method4580(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Z")
	public boolean method4572(@OriginalArg(0) int arg0) {
		if (!this.method4580(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method4556(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZZ)V")
	public void method4573(@OriginalArg(1) boolean arg0) {
		if (!this.method4561()) {
			return;
		}
		if (arg0) {
			this.aClass135_2.aClass40_1 = null;
			this.aClass135_2.anIntArray526 = null;
		}
		this.aClass135_2.aClass40Array1 = null;
		this.aClass135_2.anIntArrayArray29 = null;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4574(@OriginalArg(1) String arg0) {
		if (this.method4561()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass135_2.aClass40_1.method882(Static85.method1799(local18));
			return local27 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Z")
	public boolean method4575() {
		if (!this.method4561()) {
			return false;
		}
		@Pc(22) boolean local22 = true;
		for (@Pc(24) int local24 = 0; local24 < this.aClass135_2.anIntArray529.length; local24++) {
			@Pc(32) int local32 = this.aClass135_2.anIntArray529[local24];
			if (this.anObjectArray35[local32] == null) {
				this.method4556(local32);
				if (this.anObjectArray35[local32] == null) {
					local22 = false;
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(B)I")
	public int method4576() {
		return this.method4561() ? this.aClass135_2.anIntArray530.length : -1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III[I)Z")
	private boolean method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4580(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			return false;
		} else {
			@Pc(28) int local28 = this.aClass135_2.anIntArray525[arg0];
			@Pc(34) int[] local34 = this.aClass135_2.anIntArrayArray28[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass135_2.anIntArray530[arg0]];
			}
			@Pc(54) Object[] local54 = this.anObjectArrayArray1[arg0];
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
				@Pc(63) int local63;
				if (local34 == null) {
					local63 = local58;
				} else {
					local63 = local34[local58];
				}
				if (local54[local63] == null) {
					local56 = false;
					break;
				}
			}
			if (local56) {
				return true;
			}
			@Pc(119) byte[] local119;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local119 = Static196.method3495(this.anObjectArray35[arg0], false);
			} else {
				local119 = Static196.method3495(this.anObjectArray35[arg0], true);
				@Pc(133) Class7_Sub3 local133 = new Class7_Sub3(local119);
				local133.method2759(local133.aByteArray33.length, arg2);
			}
			@Pc(145) byte[] local145;
			try {
				local145 = Static14.method203(local119);
			} catch (@Pc(147) RuntimeException local147) {
				throw Static143.method3642(local147, "T3 - " + (arg2 != null) + "," + arg0 + "," + local119.length + "," + Static281.method4416(local119, local119.length) + "," + Static281.method4416(local119, local119.length - 2) + "," + this.aClass135_2.anIntArray528[arg0] + "," + this.aClass135_2.anInt3832);
			}
			if (this.aBoolean402) {
				this.anObjectArray35[arg0] = null;
			}
			@Pc(219) int local219;
			if (local28 <= 1) {
				if (local34 == null) {
					local219 = 0;
				} else {
					local219 = local34[0];
				}
				if (this.anInt5411 == 0) {
					local54[local219] = Static308.method4999(local145);
				} else {
					local54[local219] = local145;
				}
			} else {
				@Pc(257) int local257;
				@Pc(270) Class7_Sub3 local270;
				@Pc(278) int local278;
				@Pc(281) int local281;
				@Pc(283) int local283;
				@Pc(335) int local335;
				@Pc(337) int local337;
				@Pc(340) int local340;
				@Pc(342) int local342;
				if (this.anInt5411 == 2) {
					local219 = local145.length;
					local219--;
					local257 = local145[local219] & 0xFF;
					local219 -= local257 * local28 * 4;
					local270 = new Class7_Sub3(local145);
					@Pc(450) int local450 = 0;
					local278 = 0;
					local270.anInt3005 = local219;
					for (local281 = 0; local281 < local257; local281++) {
						local283 = 0;
						for (local335 = 0; local335 < local28; local335++) {
							local283 += local270.method2767();
							if (local34 == null) {
								local337 = local335;
							} else {
								local337 = local34[local335];
							}
							if (arg1 == local337) {
								local278 = local337;
								local450 += local283;
							}
						}
					}
					if (local450 == 0) {
						return true;
					}
					@Pc(517) byte[] local517 = new byte[local450];
					local270.anInt3005 = local219;
					local450 = 0;
					local335 = 0;
					for (local337 = 0; local337 < local257; local337++) {
						local340 = 0;
						for (local342 = 0; local342 < local28; local342++) {
							local340 += local270.method2767();
							@Pc(544) int local544;
							if (local34 == null) {
								local544 = local342;
							} else {
								local544 = local34[local342];
							}
							if (arg1 == local544) {
								Static366.method4202(local145, local335, local517, local450, local340);
								local450 += local340;
							}
							local335 += local340;
						}
					}
					local54[local278] = local517;
				} else {
					local219 = local145.length;
					local219--;
					local257 = local145[local219] & 0xFF;
					local219 -= local257 * 4 * local28;
					local270 = new Class7_Sub3(local145);
					local270.anInt3005 = local219;
					@Pc(276) int[] local276 = new int[local28];
					for (local278 = 0; local278 < local257; local278++) {
						local281 = 0;
						for (local283 = 0; local283 < local28; local283++) {
							local281 += local270.method2767();
							local276[local283] += local281;
						}
					}
					@Pc(312) byte[][] local312 = new byte[local28][];
					for (local283 = 0; local283 < local28; local283++) {
						local312[local283] = new byte[local276[local283]];
						local276[local283] = 0;
					}
					local270.anInt3005 = local219;
					local335 = 0;
					for (local337 = 0; local337 < local257; local337++) {
						local340 = 0;
						for (local342 = 0; local342 < local28; local342++) {
							local340 += local270.method2767();
							Static366.method4202(local145, local335, local312[local342], local276[local342], local340);
							local276[local342] += local340;
							local335 += local340;
						}
					}
					for (local340 = 0; local340 < local28; local340++) {
						if (local34 == null) {
							local342 = local340;
						} else {
							local342 = local34[local340];
						}
						if (this.anInt5411 == 0) {
							local54[local342] = Static308.method4999(local312[local340]);
						} else {
							local54[local342] = local312[local340];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method4578(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4561()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass135_2.aClass40_1.method882(Static85.method1799(local12));
		if (this.method4580(local26)) {
			@Pc(44) int local44 = this.aClass135_2.aClass40Array1[local26].method882(Static85.method1799(local15));
			return this.method4555(local26, local44);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I")
	public int method4579() {
		if (!this.method4561()) {
			throw new IllegalStateException("");
		}
		return this.aClass135_2.anInt3832;
	}

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "(II)Z")
	private boolean method4580(@OriginalArg(1) int arg0) {
		if (!this.method4561()) {
			return false;
		} else if (arg0 >= 0 && this.aClass135_2.anIntArray530.length > arg0 && this.aClass135_2.anIntArray530[arg0] != 0) {
			return true;
		} else if (Static82.aBoolean148) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(BII)Z")
	private boolean method4581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4561()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass135_2.anIntArray530.length && this.aClass135_2.anIntArray530[arg1] > arg0) {
			return true;
		} else if (Static82.aBoolean148) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)I")
	public int method4582() {
		if (!this.method4561()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray35.length; local17++) {
			if (this.aClass135_2.anIntArray525[local17] > 0) {
				local15 += this.method4563(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(II)[B")
	public byte[] method4583(@OriginalArg(1) int arg0) {
		if (!this.method4561()) {
			return null;
		} else if (this.aClass135_2.anIntArray530.length == 1) {
			return this.method4560(arg0, 0);
		} else if (!this.method4580(arg0)) {
			return null;
		} else if (this.aClass135_2.anIntArray530[arg0] == 1) {
			return this.method4560(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "(II)V")
	private void method4584(@OriginalArg(1) int arg0) {
		this.aClass119_1.method3143(arg0);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method4585(@OriginalArg(1) String arg0) {
		if (this.method4561()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass135_2.aClass40_1.method882(Static85.method1799(local11));
			this.method4584(local28);
		}
	}
}
