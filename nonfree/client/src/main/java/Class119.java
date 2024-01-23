import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class119 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "Lclient!qc;")
	private Class140 aClass140_1 = null;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "Z")
	private boolean aBoolean324;

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "Lclient!fi;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!fi;ZZ)V")
	public Class119(@OriginalArg(0) Class53 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean323 = arg1;
		this.aBoolean324 = arg2;
		this.aClass53_1 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
	private int method3216(@OriginalArg(0) int arg0) {
		if (this.method3228(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass53_1.method3986(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)I")
	public int method3217(@OriginalArg(0) int arg0) {
		return this.method3228(arg0) ? this.aClass140_1.anIntArray465[arg0] : 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	public void method3218() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArrayArray1.length; local17++) {
				this.anObjectArrayArray1[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method3219(@OriginalArg(1) String arg0) {
		if (this.method3230()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass140_1.aClass149_1.method3864(Static85.method1715(local13));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B")
	public byte[] method3220(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3230()) {
			return null;
		}
		@Pc(18) String local18 = arg1.toLowerCase();
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass140_1.aClass149_1.method3864(Static85.method1715(local18));
		if (this.method3228(local30)) {
			@Pc(48) int local48 = this.aClass140_1.aClass149Array1[local30].method3864(Static85.method1715(local21));
			return this.method3235(local48, local30);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)Z")
	public boolean method3222() {
		if (!this.method3230()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass140_1.anIntArray463.length; local23++) {
			@Pc(35) int local35 = this.aClass140_1.anIntArray463[local23];
			if (this.anObjectArray1[local35] == null) {
				this.method3243(local35);
				if (this.anObjectArray1[local35] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(II)I")
	public int method3223(@OriginalArg(0) int arg0) {
		if (this.method3230()) {
			@Pc(26) int local26 = this.aClass140_1.aClass149_1.method3864(arg0);
			return this.method3228(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method3224(@OriginalArg(0) String arg0) {
		if (this.method3230()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass140_1.aClass149_1.method3864(Static85.method1715(local11));
			this.method3240(local22);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)Z")
	public boolean method3226(@OriginalArg(0) int arg0) {
		if (!this.method3228(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3243(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(IB)V")
	public void method3227(@OriginalArg(0) int arg0) {
		if (this.method3228(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(II)Z")
	private boolean method3228(@OriginalArg(1) int arg0) {
		if (!this.method3230()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass140_1.anIntArray465.length && this.aClass140_1.anIntArray465[arg0] != 0) {
			return true;
		} else if (Static173.aBoolean294) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z")
	public boolean method3229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3245(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3243(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z")
	private boolean method3230() {
		if (this.aClass140_1 == null) {
			this.aClass140_1 = this.aClass53_1.method3991();
			if (this.aClass140_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass140_1.anInt4193][];
			this.anObjectArray1 = new Object[this.aClass140_1.anInt4193];
		}
		return true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([IIZ)Z")
	private boolean method3231(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (!this.method3228(arg1)) {
			return false;
		} else if (this.anObjectArray1[arg1] == null) {
			return false;
		} else {
			@Pc(28) int[] local28 = this.aClass140_1.anIntArrayArray30[arg1];
			@Pc(34) int local34 = this.aClass140_1.anIntArray466[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass140_1.anIntArray465[arg1]];
			}
			@Pc(56) Object[] local56 = this.anObjectArrayArray1[arg1];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local34; local60++) {
				@Pc(72) int local72;
				if (local28 == null) {
					local72 = local60;
				} else {
					local72 = local28[local60];
				}
				if (local56[local72] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(134) byte[] local134;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local134 = Static218.method3529(this.anObjectArray1[arg1], false);
			} else {
				local134 = Static218.method3529(this.anObjectArray1[arg1], true);
				@Pc(139) Class1_Sub13 local139 = new Class1_Sub13(local134);
				local139.method1875(local139.aByteArray63.length, arg0);
			}
			@Pc(160) byte[] local160;
			try {
				local160 = Static178.method3132(local134);
			} catch (@Pc(162) RuntimeException local162) {
				throw Static66.method1152(local162, "T3 - " + (arg0 != null) + "," + arg1 + "," + local134.length + "," + Static9.method168(local134, local134.length) + "," + Static9.method168(local134, local134.length - 2) + "," + this.aClass140_1.anIntArray467[arg1] + "," + this.aClass140_1.anInt4194);
			}
			if (this.aBoolean323) {
				this.anObjectArray1[arg1] = null;
			}
			@Pc(239) int local239;
			if (local34 <= 1) {
				if (local28 == null) {
					local239 = 0;
				} else {
					local239 = local28[0];
				}
				if (this.aBoolean324) {
					local56[local239] = local160;
				} else {
					local56[local239] = Static78.method1609(local160);
				}
			} else {
				local239 = local160.length;
				local239--;
				@Pc(271) int local271 = local160[local239] & 0xFF;
				@Pc(276) Class1_Sub13 local276 = new Class1_Sub13(local160);
				local239 -= local271 * 4 * local34;
				local276.anInt2018 = local239;
				@Pc(290) int[] local290 = new int[local34];
				@Pc(301) int local301;
				@Pc(303) int local303;
				for (@Pc(292) int local292 = 0; local292 < local271; local292++) {
					local301 = 0;
					for (local303 = 0; local303 < local34; local303++) {
						if (local28 == null) {
						}
						local301 += local276.method1860();
						local290[local303] += local301;
					}
				}
				@Pc(331) byte[][] local331 = new byte[local34][];
				for (local301 = 0; local301 < local34; local301++) {
					local331[local301] = new byte[local290[local301]];
					local290[local301] = 0;
				}
				local276.anInt2018 = local239;
				local301 = 0;
				@Pc(370) int local370;
				for (local303 = 0; local303 < local271; local303++) {
					local370 = 0;
					for (@Pc(372) int local372 = 0; local372 < local34; local372++) {
						local370 += local276.method1860();
						Static317.method1049(local160, local301, local331[local372], local290[local372], local370);
						local301 += local370;
						local290[local372] += local370;
					}
				}
				for (local303 = 0; local303 < local34; local303++) {
					if (local28 == null) {
						local370 = local303;
					} else {
						local370 = local28[local303];
					}
					if (this.aBoolean324) {
						local56[local370] = local331[local303];
					} else {
						local56[local370] = Static78.method1609(local331[local303]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)I")
	public int method3232() {
		if (!this.method3230()) {
			throw new IllegalStateException("");
		}
		return this.aClass140_1.anInt4194;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method3233(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3230()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.aClass140_1.aClass149_1.method3864(Static85.method1715(local13));
		if (this.method3228(local25)) {
			@Pc(48) int local48 = this.aClass140_1.aClass149Array1[local25].method3864(Static85.method1715(local16));
			return this.method3229(local25, local48);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)I")
	public int method3234() {
		return this.method3230() ? this.aClass140_1.anIntArray465.length : -1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZI)[B")
	public byte[] method3235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method3237(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)I")
	public int method3236() {
		if (!this.method3230()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray1.length; local23++) {
			if (this.aClass140_1.anIntArray466[local23] > 0) {
				local14 += this.method3216(local23);
				local21 += 100;
			}
		}
		if (local21 == 0) {
			return 100;
		} else {
			return local14 * 100 / local21;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II[IZ)[B")
	public byte[] method3237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method3245(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(42) boolean local42 = this.method3231(arg2, arg0);
			if (!local42) {
				this.method3243(arg0);
				local42 = this.method3231(arg2, arg0);
				if (!local42) {
					return null;
				}
			}
		}
		@Pc(69) byte[] local69 = Static218.method3529(this.anObjectArrayArray1[arg0][arg1], false);
		if (this.aBoolean324) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass140_1.anIntArray465[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local69;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method3238(@OriginalArg(0) String arg0) {
		if (this.method3230()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass140_1.aClass149_1.method3864(Static85.method1715(local13));
			return this.method3216(local22);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(II)V")
	private void method3240(@OriginalArg(0) int arg0) {
		this.aClass53_1.method3992(arg0);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public int method3241(@OriginalArg(0) String arg0) {
		if (this.method3230()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass140_1.aClass149_1.method3864(Static85.method1715(local12));
			return this.method3228(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)[B")
	public byte[] method3242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3245(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(38) boolean local38 = this.method3231(null, arg0);
			if (!local38) {
				this.method3243(arg0);
				local38 = this.method3231(null, arg0);
				if (!local38) {
					return null;
				}
			}
		}
		return Static218.method3529(this.anObjectArrayArray1[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(IB)V")
	private void method3243(@OriginalArg(0) int arg0) {
		if (this.aBoolean323) {
			this.anObjectArray1[arg0] = this.aClass53_1.method3983(arg0);
		} else {
			this.anObjectArray1[arg0] = Static78.method1609(this.aClass53_1.method3983(arg0));
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)[B")
	public byte[] method3244(@OriginalArg(0) int arg0) {
		if (!this.method3230()) {
			return null;
		} else if (this.aClass140_1.anIntArray465.length == 1) {
			return this.method3235(arg0, 0);
		} else if (!this.method3228(arg0)) {
			return null;
		} else if (this.aClass140_1.anIntArray465[arg0] == 1) {
			return this.method3235(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)Z")
	private boolean method3245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3230()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass140_1.anIntArray465.length && arg0 < this.aClass140_1.anIntArray465[arg1]) {
			return true;
		} else if (Static173.aBoolean294) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)[I")
	public int[] method3246(@OriginalArg(1) int arg0) {
		if (!this.method3228(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass140_1.anIntArrayArray30[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass140_1.anIntArray466[arg0]];
			@Pc(39) int local39 = 0;
			while (local26.length > local39) {
				local26[local39] = local39++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZZZ)V")
	public void method3247(@OriginalArg(0) boolean arg0) {
		if (!this.method3230()) {
			return;
		}
		this.aClass140_1.aClass149Array1 = null;
		this.aClass140_1.anIntArrayArray29 = null;
		if (arg0) {
			this.aClass140_1.anIntArray464 = null;
			this.aClass140_1.aClass149_1 = null;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3248(@OriginalArg(1) String arg0) {
		if (this.method3230()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass140_1.aClass149_1.method3864(Static85.method1715(local13));
			return this.method3226(local22);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)Z")
	public boolean method3250(@OriginalArg(1) int arg0) {
		if (!this.method3230()) {
			return false;
		} else if (this.aClass140_1.anIntArray465.length == 1) {
			return this.method3229(0, arg0);
		} else if (!this.method3228(arg0)) {
			return false;
		} else if (this.aClass140_1.anIntArray465[arg0] == 1) {
			return this.method3229(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
