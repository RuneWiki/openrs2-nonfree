import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class83 {

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!up;")
	private Class234 aClass234_1 = null;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "Z")
	private final boolean aBoolean178;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!la;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!la;ZI)V")
	public Class83(@OriginalArg(0) Class135 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean178 = arg1;
		this.aClass135_1 = arg0;
		this.anInt2413 = arg2;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)I")
	public int method1947(@OriginalArg(1) int arg0) {
		if (this.method1959()) {
			@Pc(21) int local21 = this.aClass234_1.aClass110_1.method2743(arg0);
			return this.method1967(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
	public boolean method1948() {
		if (!this.method1959()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass234_1.anIntArray559.length; local23++) {
			@Pc(31) int local31 = this.aClass234_1.anIntArray559[local23];
			if (this.anObjectArray34[local31] == null) {
				this.method1975(local31);
				if (this.anObjectArray34[local31] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)Z")
	public boolean method1949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1976(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray34[arg1] == null) {
			this.method1975(arg1);
			return this.anObjectArray34[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(BI)V")
	private void method1950(@OriginalArg(1) int arg0) {
		this.aClass135_1.method4411(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
	public void method1951(@OriginalArg(0) int arg0) {
		if (this.method1967(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public void method1952() {
		if (this.anObjectArray34 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray34.length; local16++) {
				this.anObjectArray34[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method1953(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1959()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass234_1.aClass110_1.method2743(Static286.method4708(local12));
		if (this.method1967(local24)) {
			@Pc(47) int local47 = this.aClass234_1.aClass110Array1[local24].method2743(Static286.method4708(local15));
			return this.method1968(local47, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I")
	public int method1955(@OriginalArg(1) int arg0) {
		return this.method1967(arg0) ? this.aClass234_1.anIntArray563[arg0] : 0;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)I")
	public int method1956() {
		return this.method1959() ? this.aClass234_1.anIntArray563.length : -1;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)I")
	public int method1957() {
		if (!this.method1959()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray34.length; local23++) {
			if (this.aClass234_1.anIntArray564[local23] > 0) {
				local21 += this.method1960(local23);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local21 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)Z")
	public boolean method1958(@OriginalArg(0) int arg0) {
		if (!this.method1959()) {
			return false;
		} else if (this.aClass234_1.anIntArray563.length == 1) {
			return this.method1949(arg0, 0);
		} else if (!this.method1967(arg0)) {
			return false;
		} else if (this.aClass234_1.anIntArray563[arg0] == 1) {
			return this.method1949(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Z")
	private boolean method1959() {
		if (this.aClass234_1 == null) {
			this.aClass234_1 = this.aClass135_1.method4409();
			if (this.aClass234_1 == null) {
				return false;
			}
			this.anObjectArray34 = new Object[this.aClass234_1.anInt6528];
			this.anObjectArrayArray1 = new Object[this.aClass234_1.anInt6528][];
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(II)I")
	private int method1960(@OriginalArg(1) int arg0) {
		if (this.method1967(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass135_1.method4407(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method1961(@OriginalArg(1) String arg0) {
		if (this.method1959()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass234_1.aClass110_1.method2743(Static286.method4708(local12));
			return this.method1967(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1963(@OriginalArg(0) String arg0) {
		if (this.method1959()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass234_1.aClass110_1.method2743(Static286.method4708(local18));
			return this.method1978(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method1964(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1959()) {
			return false;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(33) int local33 = this.aClass234_1.aClass110_1.method2743(Static286.method4708(local14));
		if (this.method1967(local33)) {
			@Pc(51) int local51 = this.aClass234_1.aClass110Array1[local33].method2743(Static286.method4708(local17));
			return this.method1949(local51, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(II)[I")
	public int[] method1965(@OriginalArg(0) int arg0) {
		if (!this.method1967(arg0)) {
			return null;
		}
		@Pc(20) int[] local20 = this.aClass234_1.anIntArrayArray59[arg0];
		if (local20 == null) {
			local20 = new int[this.aClass234_1.anIntArray564[arg0]];
			@Pc(35) int local35 = 0;
			while (local20.length > local35) {
				local20[local35] = local35++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(II)Z")
	private boolean method1967(@OriginalArg(1) int arg0) {
		if (!this.method1959()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass234_1.anIntArray563.length && this.aClass234_1.anIntArray563[arg0] != 0) {
			return true;
		} else if (Static199.aBoolean300) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(III)[B")
	public byte[] method1968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1972(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public void method1969() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray1.length; local16++) {
				this.anObjectArrayArray1[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)I")
	public int method1970() {
		if (!this.method1959()) {
			throw new IllegalStateException("");
		}
		return this.aClass234_1.anInt6529;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II[IB)[B")
	public byte[] method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1976(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(38) boolean local38 = this.method1977(arg0, arg1, arg2);
			if (!local38) {
				this.method1975(arg1);
				local38 = this.method1977(arg0, arg1, arg2);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static164.method2906(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt2413 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass234_1.anIntArray563[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt2413 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1973(@OriginalArg(0) String arg0) {
		if (this.method1959()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass234_1.aClass110_1.method2743(Static286.method4708(local12));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(Ljava/lang/String;I)V")
	public void method1974(@OriginalArg(0) String arg0) {
		if (this.method1959()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass234_1.aClass110_1.method2743(Static286.method4708(local11));
			this.method1950(local22);
		}
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(II)V")
	private void method1975(@OriginalArg(0) int arg0) {
		if (this.aBoolean178) {
			this.anObjectArray34[arg0] = this.aClass135_1.method4410(arg0);
		} else {
			this.anObjectArray34[arg0] = Static281.method4696(this.aClass135_1.method4410(arg0));
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(III)Z")
	private boolean method1976(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1959()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass234_1.anIntArray563.length && this.aClass234_1.anIntArray563[arg0] > arg1) {
			return true;
		} else if (Static199.aBoolean300) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II[IZ)Z")
	private boolean method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1967(arg1)) {
			return false;
		} else if (this.anObjectArray34[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass234_1.anIntArray564[arg1];
			@Pc(31) int[] local31 = this.aClass234_1.anIntArrayArray59[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass234_1.anIntArray563[arg1]];
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
			@Pc(116) byte[] local116;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local116 = Static164.method2906(false, this.anObjectArray34[arg1]);
			} else {
				local116 = Static164.method2906(true, this.anObjectArray34[arg1]);
				@Pc(121) Class2_Sub24 local121 = new Class2_Sub24(local116);
				local121.method5738(local121.aByteArray100.length, arg2);
			}
			@Pc(143) byte[] local143;
			try {
				local143 = Static321.method5187(local116);
			} catch (@Pc(145) RuntimeException local145) {
				throw Static50.method730(local145, "T3 - " + (arg2 != null) + "," + arg1 + "," + local116.length + "," + Static113.method5097(local116.length, local116) + "," + Static113.method5097(local116.length - 2, local116) + "," + this.aClass234_1.anIntArray562[arg1] + "," + this.aClass234_1.anInt6529);
			}
			if (this.aBoolean178) {
				this.anObjectArray34[arg1] = null;
			}
			@Pc(217) int local217;
			if (local25 <= 1) {
				if (local31 == null) {
					local217 = 0;
				} else {
					local217 = local31[0];
				}
				if (this.anInt2413 == 0) {
					local51[local217] = Static281.method4696(local143);
				} else {
					local51[local217] = local143;
				}
			} else {
				@Pc(257) int local257;
				@Pc(270) Class2_Sub24 local270;
				@Pc(278) int local278;
				@Pc(282) int local282;
				@Pc(284) int local284;
				@Pc(338) int local338;
				@Pc(340) int local340;
				@Pc(344) int local344;
				@Pc(346) int local346;
				if (this.anInt2413 == 2) {
					local217 = local143.length;
					local217--;
					local257 = local143[local217] & 0xFF;
					local217 -= local257 * local25 * 4;
					local270 = new Class2_Sub24(local143);
					@Pc(455) int local455 = 0;
					local278 = 0;
					local270.anInt6669 = local217;
					for (local282 = 0; local282 < local257; local282++) {
						local284 = 0;
						for (local338 = 0; local338 < local25; local338++) {
							local284 += local270.method5776();
							if (local31 == null) {
								local340 = local338;
							} else {
								local340 = local31[local338];
							}
							if (arg0 == local340) {
								local278 = local340;
								local455 += local284;
							}
						}
					}
					if (local455 == 0) {
						return true;
					}
					@Pc(518) byte[] local518 = new byte[local455];
					local455 = 0;
					local270.anInt6669 = local217;
					local338 = 0;
					for (local340 = 0; local340 < local257; local340++) {
						local344 = 0;
						for (local346 = 0; local346 < local25; local346++) {
							local344 += local270.method5776();
							@Pc(545) int local545;
							if (local31 == null) {
								local545 = local346;
							} else {
								local545 = local31[local346];
							}
							if (arg0 == local545) {
								Static394.method2443(local143, local338, local518, local455, local344);
								local455 += local344;
							}
							local338 += local344;
						}
					}
					local51[local278] = local518;
				} else {
					local217 = local143.length;
					local217--;
					local257 = local143[local217] & 0xFF;
					local217 -= local25 * 4 * local257;
					local270 = new Class2_Sub24(local143);
					@Pc(273) int[] local273 = new int[local25];
					local270.anInt6669 = local217;
					for (local278 = 0; local278 < local257; local278++) {
						local282 = 0;
						for (local284 = 0; local284 < local25; local284++) {
							local282 += local270.method5776();
							local273[local284] += local282;
						}
					}
					@Pc(314) byte[][] local314 = new byte[local25][];
					for (local284 = 0; local284 < local25; local284++) {
						local314[local284] = new byte[local273[local284]];
						local273[local284] = 0;
					}
					local270.anInt6669 = local217;
					local338 = 0;
					for (local340 = 0; local340 < local257; local340++) {
						local344 = 0;
						for (local346 = 0; local346 < local25; local346++) {
							local344 += local270.method5776();
							Static394.method2443(local143, local338, local314[local346], local273[local346], local344);
							local338 += local344;
							local273[local346] += local344;
						}
					}
					for (local344 = 0; local344 < local25; local344++) {
						if (local31 == null) {
							local346 = local344;
						} else {
							local346 = local31[local344];
						}
						if (this.anInt2413 == 0) {
							local51[local346] = Static281.method4696(local314[local344]);
						} else {
							local51[local346] = local314[local344];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(IB)Z")
	public boolean method1978(@OriginalArg(0) int arg0) {
		if (!this.method1967(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method1975(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(II)[B")
	public byte[] method1979(@OriginalArg(1) int arg0) {
		if (!this.method1959()) {
			return null;
		} else if (this.aClass234_1.anIntArray563.length == 1) {
			return this.method1968(arg0, 0);
		} else if (!this.method1967(arg0)) {
			return null;
		} else if (this.aClass234_1.anIntArray563[arg0] == 1) {
			return this.method1968(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZI)V")
	public void method1980(@OriginalArg(0) boolean arg0) {
		if (!this.method1959()) {
			return;
		}
		this.aClass234_1.anIntArrayArray60 = null;
		this.aClass234_1.aClass110Array1 = null;
		if (arg0) {
			this.aClass234_1.anIntArray560 = null;
			this.aClass234_1.aClass110_1 = null;
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(Ljava/lang/String;I)I")
	public int method1982(@OriginalArg(0) String arg0) {
		if (this.method1959()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass234_1.aClass110_1.method2743(Static286.method4708(local12));
			return this.method1960(local21);
		} else {
			return 0;
		}
	}
}
