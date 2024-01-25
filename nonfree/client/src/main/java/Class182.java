import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class182 {

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "Lclient!nq;")
	private Class269 aClass269_2 = null;

	@OriginalMember(owner = "client!ik", name = "N", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	public int anInt4310;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "Lclient!lga;")
	private final Class102 aClass102_1;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!lga;ZI)V")
	public Class182(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean286 = arg1;
		this.anInt4310 = arg2;
		this.aClass102_1 = arg0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3953(@OriginalArg(1) String arg0) {
		if (this.method3960()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass269_2.aClass299_1.method6956(Static493.method6701(local20));
			return this.method3957(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(II)[I")
	public int[] method3954(@OriginalArg(1) int arg0) {
		if (!this.method3975(arg0)) {
			return null;
		}
		@Pc(21) int[] local21 = this.aClass269_2.anIntArrayArray37[arg0];
		if (local21 == null) {
			local21 = new int[this.aClass269_2.anIntArray507[arg0]];
			@Pc(39) int local39 = 0;
			while (local21.length > local39) {
				local21[local39] = local39++;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method3955(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3960()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(27) int local27 = this.aClass269_2.aClass299_1.method6956(Static493.method6701(local13));
		if (local27 < 0) {
			return false;
		} else {
			@Pc(43) int local43 = this.aClass269_2.aClass299Array1[local27].method6956(Static493.method6701(local16));
			return local43 >= 0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)I")
	public int method3956() {
		return this.method3960() ? this.aClass269_2.anIntArray504.length : -1;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(BI)Z")
	public boolean method3957(@OriginalArg(1) int arg0) {
		if (!this.method3975(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3971(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method3958(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3960()) {
			return null;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass269_2.aClass299_1.method6956(Static493.method6701(local13));
		if (this.method3975(local32)) {
			@Pc(51) int local51 = this.aClass269_2.aClass299Array1[local32].method6956(Static493.method6701(local16));
			return this.method3985(local51, local32);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)Z")
	public boolean method3959() {
		if (!this.method3960()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass269_2.anIntArray509.length; local22++) {
			@Pc(32) int local32 = this.aClass269_2.anIntArray509[local22];
			if (this.anObjectArray1[local32] == null) {
				this.method3971(local32);
				if (this.anObjectArray1[local32] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)Z")
	private boolean method3960() {
		if (this.aClass269_2 == null) {
			this.aClass269_2 = this.aClass102_1.method2508();
			if (this.aClass269_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass269_2.anInt6892][];
			this.anObjectArray1 = new Object[this.aClass269_2.anInt6892];
		}
		return true;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)[B")
	public byte[] method3961(@OriginalArg(0) int arg0) {
		if (!this.method3960()) {
			return null;
		} else if (this.aClass269_2.anIntArray504.length == 1) {
			return this.method3985(arg0, 0);
		} else if (!this.method3975(arg0)) {
			return null;
		} else if (this.aClass269_2.anIntArray504[arg0] == 1) {
			return this.method3985(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(ZII)Z")
	private boolean method3962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3960()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass269_2.anIntArray504.length > arg1 && this.aClass269_2.anIntArray504[arg1] > arg0) {
			return true;
		} else if (Static94.aBoolean153) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3963(@OriginalArg(0) String arg0) {
		if (this.method3960()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass269_2.aClass299_1.method6956(Static493.method6701(local21));
			return this.method3981(local30);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(IB)Z")
	public boolean method3964(@OriginalArg(0) int arg0) {
		if (!this.method3960()) {
			return false;
		} else if (this.aClass269_2.anIntArray504.length == 1) {
			return this.method3986(0, arg0);
		} else if (!this.method3975(arg0)) {
			return false;
		} else if (this.aClass269_2.anIntArray504[arg0] == 1) {
			return this.method3986(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZI)V")
	public void method3965(@OriginalArg(0) boolean arg0) {
		if (!this.method3960()) {
			return;
		}
		this.aClass269_2.anIntArrayArray36 = null;
		this.aClass269_2.aClass299Array1 = null;
		if (arg0) {
			this.aClass269_2.anIntArray505 = null;
			this.aClass269_2.aClass299_1 = null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II[II)Z")
	private boolean method3966(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3975(arg2)) {
			return false;
		} else if (this.anObjectArray1[arg2] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass269_2.anIntArray507[arg2];
			@Pc(33) int[] local33 = this.aClass269_2.anIntArrayArray37[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass269_2.anIntArray504[arg2]];
			}
			@Pc(63) Object[] local63 = this.anObjectArrayArray1[arg2];
			@Pc(65) boolean local65 = true;
			for (@Pc(67) int local67 = 0; local67 < local27; local67++) {
				@Pc(75) int local75;
				if (local33 == null) {
					local75 = local67;
				} else {
					local75 = local33[local67];
				}
				if (local63[local75] == null) {
					local65 = false;
					break;
				}
			}
			if (local65) {
				return true;
			}
			@Pc(152) byte[] local152;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local152 = Static601.method7729(false, this.anObjectArray1[arg2]);
			} else {
				local152 = Static601.method7729(true, this.anObjectArray1[arg2]);
				@Pc(167) Class3_Sub2 local167 = new Class3_Sub2(local152);
				local167.method2058(local167.aByteArray20.length, arg1);
			}
			@Pc(179) byte[] local179;
			try {
				local179 = Static422.method5605(local152);
			} catch (@Pc(181) RuntimeException local181) {
				throw Static583.method7521(local181, "T3 - " + (arg1 != null) + "," + arg2 + "," + local152.length + "," + Static332.method4777(local152, local152.length) + "," + Static332.method4777(local152, local152.length - 2) + "," + this.aClass269_2.anIntArray506[arg2] + "," + this.aClass269_2.anInt6898);
			}
			if (this.aBoolean286) {
				this.anObjectArray1[arg2] = null;
			}
			@Pc(260) int local260;
			if (local27 <= 1) {
				if (local33 == null) {
					local260 = 0;
				} else {
					local260 = local33[0];
				}
				if (this.anInt4310 == 0) {
					local63[local260] = Static508.method6908(local179);
				} else {
					local63[local260] = local179;
				}
			} else {
				@Pc(304) int local304;
				@Pc(317) Class3_Sub2 local317;
				@Pc(325) int local325;
				@Pc(331) int local331;
				@Pc(333) int local333;
				@Pc(391) int local391;
				@Pc(393) int local393;
				@Pc(399) int local399;
				@Pc(401) int local401;
				if (this.anInt4310 == 2) {
					local260 = local179.length;
					local260--;
					local304 = local179[local260] & 0xFF;
					local260 -= local304 * 4 * local27;
					local317 = new Class3_Sub2(local179);
					@Pc(527) int local527 = 0;
					local325 = 0;
					local317.anInt2178 = local260;
					for (local331 = 0; local331 < local304; local331++) {
						local333 = 0;
						for (local391 = 0; local391 < local27; local391++) {
							local333 += local317.method2036();
							if (local33 == null) {
								local393 = local391;
							} else {
								local393 = local33[local391];
							}
							if (local393 == arg0) {
								local325 = local393;
								local527 += local333;
							}
						}
					}
					if (local527 == 0) {
						return true;
					}
					@Pc(601) byte[] local601 = new byte[local527];
					local527 = 0;
					local317.anInt2178 = local260;
					local391 = 0;
					for (local393 = 0; local393 < local304; local393++) {
						local399 = 0;
						for (local401 = 0; local401 < local27; local401++) {
							local399 += local317.method2036();
							@Pc(628) int local628;
							if (local33 == null) {
								local628 = local401;
							} else {
								local628 = local33[local401];
							}
							if (local628 == arg0) {
								Static732.method6320(local179, local391, local601, local527, local399);
								local527 += local399;
							}
							local391 += local399;
						}
					}
					local63[local325] = local601;
				} else {
					local260 = local179.length;
					local260--;
					local304 = local179[local260] & 0xFF;
					local260 -= local27 * 4 * local304;
					local317 = new Class3_Sub2(local179);
					local317.anInt2178 = local260;
					@Pc(323) int[] local323 = new int[local27];
					for (local325 = 0; local325 < local304; local325++) {
						local331 = 0;
						for (local333 = 0; local333 < local27; local333++) {
							local331 += local317.method2036();
							local323[local333] += local331;
						}
					}
					@Pc(363) byte[][] local363 = new byte[local27][];
					for (local333 = 0; local333 < local27; local333++) {
						local363[local333] = new byte[local323[local333]];
						local323[local333] = 0;
					}
					local317.anInt2178 = local260;
					local391 = 0;
					for (local393 = 0; local393 < local304; local393++) {
						local399 = 0;
						for (local401 = 0; local401 < local27; local401++) {
							local399 += local317.method2036();
							Static732.method6320(local179, local391, local363[local401], local323[local401], local399);
							local391 += local399;
							local323[local401] += local399;
						}
					}
					for (local399 = 0; local399 < local27; local399++) {
						if (local33 == null) {
							local401 = local399;
						} else {
							local401 = local33[local399];
						}
						if (this.anInt4310 == 0) {
							local63[local401] = Static508.method6908(local363[local399]);
						} else {
							local63[local401] = local363[local399];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(II)V")
	public void method3968(@OriginalArg(0) int arg0) {
		if (this.method3975(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	public void method3969() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)I")
	public int method3970(@OriginalArg(1) int arg0) {
		return this.method3975(arg0) ? this.aClass269_2.anIntArray504[arg0] : 0;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(IB)V")
	private void method3971(@OriginalArg(0) int arg0) {
		if (this.aBoolean286) {
			this.anObjectArray1[arg0] = this.aClass102_1.method2511(arg0);
		} else {
			this.anObjectArray1[arg0] = Static508.method6908(this.aClass102_1.method2511(arg0));
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method3972(@OriginalArg(0) String arg0) {
		if (this.method3960()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass269_2.aClass299_1.method6956(Static493.method6701(local14));
			this.method3974(local28);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method3973(@OriginalArg(0) String arg0) {
		if (this.method3960()) {
			@Pc(22) String local22 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass269_2.aClass299_1.method6956(Static493.method6701(local22));
			return local31 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
	private void method3974(@OriginalArg(0) int arg0) {
		this.aClass102_1.method2509(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)Z")
	private boolean method3975(@OriginalArg(1) int arg0) {
		if (!this.method3960()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass269_2.anIntArray504.length && this.aClass269_2.anIntArray504[arg0] != 0) {
			return true;
		} else if (Static94.aBoolean153) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	private boolean method3976(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3960()) {
			return false;
		}
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(26) String local26 = arg1.toLowerCase();
		@Pc(35) int local35 = this.aClass269_2.aClass299_1.method6956(Static493.method6701(local23));
		if (this.method3975(local35)) {
			@Pc(54) int local54 = this.aClass269_2.aClass299Array1[local35].method6956(Static493.method6701(local26));
			return this.method3986(local35, local54);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3977(@OriginalArg(1) String arg0) {
		@Pc(19) int local19 = this.method3978("");
		return local19 == -1 ? this.method3976(arg0, "") : this.method3976("", arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method3978(@OriginalArg(1) String arg0) {
		if (this.method3960()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass269_2.aClass299_1.method6956(Static493.method6701(local13));
			return this.method3975(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([IIII)[B")
	public byte[] method3979(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method3962(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(47) boolean local47 = this.method3966(arg1, arg0, arg2);
			if (!local47) {
				this.method3971(arg2);
				local47 = this.method3966(arg1, arg0, arg2);
				if (!local47) {
					return null;
				}
			}
		}
		@Pc(77) byte[] local77 = Static601.method7729(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.anInt4310 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass269_2.anIntArray504[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt4310 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local77;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
	public int method3980() {
		if (!this.method3960()) {
			throw new IllegalStateException("");
		}
		return this.aClass269_2.anInt6898;
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(II)I")
	private int method3981(@OriginalArg(1) int arg0) {
		if (this.method3975(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass102_1.method2510(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
	public void method3982() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
	public int method3983() {
		if (!this.method3960()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anObjectArray1.length; local26++) {
			if (this.aClass269_2.anIntArray507[local26] > 0) {
				local14 += 100;
				local16 += this.method3981(local26);
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)I")
	public int method3984(@OriginalArg(1) int arg0) {
		if (this.method3960()) {
			@Pc(27) int local27 = this.aClass269_2.aClass299_1.method6956(arg0);
			return this.method3975(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZII)[B")
	public byte[] method3985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method3979((int[]) null, arg0, arg1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z")
	public boolean method3986(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3962(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3971(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}
}
