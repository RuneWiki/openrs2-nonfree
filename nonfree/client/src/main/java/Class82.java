import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class82 {

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray3;

	@OriginalMember(owner = "client!fo", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "Lclient!wv;")
	private Class272 aClass272_1 = null;

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "Lclient!hr;")
	private final Class85 aClass85_1;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
	private final boolean aBoolean247;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!hr;ZI)V")
	public Class82(@OriginalArg(0) Class85 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt2180 = arg2;
		this.aClass85_1 = arg0;
		this.aBoolean247 = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method1814(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1836()) {
			return false;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass272_1.aClass115_1.method2598(Static70.method1140(local20));
		if (this.method1842(local32)) {
			@Pc(50) int local50 = this.aClass272_1.aClass115Array1[local32].method2598(Static70.method1140(local23));
			return this.method1829(local32, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)[B")
	public byte[] method1815(@OriginalArg(1) int arg0) {
		if (!this.method1836()) {
			return null;
		} else if (this.aClass272_1.anIntArray519.length == 1) {
			return this.method1817(0, arg0);
		} else if (!this.method1842(arg0)) {
			return null;
		} else if (this.aClass272_1.anIntArray519[arg0] == 1) {
			return this.method1817(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V")
	private void method1816(@OriginalArg(0) int arg0) {
		this.aClass85_1.method1894(arg0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)[B")
	public byte[] method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1845(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method1819(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1836()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass272_1.aClass115_1.method2598(Static70.method1140(local12));
		if (this.method1842(local24)) {
			@Pc(42) int local42 = this.aClass272_1.aClass115Array1[local24].method2598(Static70.method1140(local15));
			return this.method1817(local24, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)Z")
	public boolean method1820(@OriginalArg(1) int arg0) {
		if (!this.method1836()) {
			return false;
		} else if (this.aClass272_1.anIntArray519.length == 1) {
			return this.method1829(0, arg0);
		} else if (!this.method1842(arg0)) {
			return false;
		} else if (this.aClass272_1.anIntArray519[arg0] == 1) {
			return this.method1829(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)I")
	public int method1821() {
		if (!this.method1836()) {
			return 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anObjectArray3.length; local24++) {
			if (this.aClass272_1.anIntArray516[local24] > 0) {
				local22 += this.method1840(local24);
				local20 += 100;
			}
		}
		if (local20 == 0) {
			return 100;
		} else {
			return local22 * 100 / local20;
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(IB)V")
	private void method1822(@OriginalArg(0) int arg0) {
		if (this.aBoolean247) {
			this.anObjectArray3[arg0] = this.aClass85_1.method1897(arg0);
		} else {
			this.anObjectArray3[arg0] = Static316.method4271(this.aClass85_1.method1897(arg0));
		}
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(II)I")
	public int method1823(@OriginalArg(1) int arg0) {
		return this.method1842(arg0) ? this.aClass272_1.anIntArray519[arg0] : 0;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)I")
	public int method1824() {
		if (!this.method1836()) {
			throw new IllegalStateException("");
		}
		return this.aClass272_1.anInt7539;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)I")
	public int method1825() {
		return this.method1836() ? this.aClass272_1.anIntArray519.length : -1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IZ)V")
	public void method1826(@OriginalArg(0) int arg0) {
		if (this.method1842(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZII)Z")
	private boolean method1827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1836()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass272_1.anIntArray519.length && this.aClass272_1.anIntArray519[arg1] > arg0) {
			return true;
		} else if (Static44.aBoolean82) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)Z")
	public boolean method1828() {
		if (!this.method1836()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass272_1.anIntArray520.length; local15++) {
			@Pc(23) int local23 = this.aClass272_1.anIntArray520[local15];
			if (this.anObjectArray3[local23] == null) {
				this.method1822(local23);
				if (this.anObjectArray3[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIB)Z")
	public boolean method1829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1827(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1822(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[II)Z")
	private boolean method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1842(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass272_1.anIntArray516[arg0];
			@Pc(31) int[] local31 = this.aClass272_1.anIntArrayArray64[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass272_1.anIntArray519[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(53) boolean local53 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local63;
				} else {
					local69 = local31[local63];
				}
				if (local51[local69] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local127 = Static113.method1804(false, this.anObjectArray3[arg0]);
			} else {
				local127 = Static113.method1804(true, this.anObjectArray3[arg0]);
				@Pc(142) Class1_Sub28 local142 = new Class1_Sub28(local127);
				local142.method5349(arg2, local142.aByteArray86.length);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static369.method4903(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static203.method4776(local156, "T3 - " + (arg2 != null) + "," + arg0 + "," + local127.length + "," + Static278.method3865(local127, local127.length) + "," + Static278.method3865(local127, local127.length - 2) + "," + this.aClass272_1.anIntArray517[arg0] + "," + this.aClass272_1.anInt7539);
			}
			if (this.aBoolean247) {
				this.anObjectArray3[arg0] = null;
			}
			@Pc(226) int local226;
			if (local25 <= 1) {
				if (local31 == null) {
					local226 = 0;
				} else {
					local226 = local31[0];
				}
				if (this.anInt2180 == 0) {
					local51[local226] = Static316.method4271(local154);
				} else {
					local51[local226] = local154;
				}
			} else {
				@Pc(264) int local264;
				@Pc(277) Class1_Sub28 local277;
				@Pc(281) int local281;
				@Pc(286) int local286;
				@Pc(290) int local290;
				@Pc(292) int local292;
				@Pc(304) int local304;
				@Pc(358) int local358;
				@Pc(360) int local360;
				if (this.anInt2180 == 2) {
					local226 = local154.length;
					local226--;
					local264 = local154[local226] & 0xFF;
					local226 -= local264 * local25 * 4;
					local277 = new Class1_Sub28(local154);
					@Pc(279) int local279 = 0;
					local281 = 0;
					local277.anInt6812 = local226;
					for (local286 = 0; local286 < local264; local286++) {
						local290 = 0;
						for (local292 = 0; local292 < local25; local292++) {
							local290 += local277.method5355();
							if (local31 == null) {
								local304 = local292;
							} else {
								local304 = local31[local292];
							}
							if (arg1 == local304) {
								local281 = local304;
								local279 += local290;
							}
						}
					}
					if (local279 == 0) {
						return true;
					}
					@Pc(345) byte[] local345 = new byte[local279];
					local279 = 0;
					local277.anInt6812 = local226;
					local292 = 0;
					for (local304 = 0; local304 < local264; local304++) {
						local358 = 0;
						for (local360 = 0; local360 < local25; local360++) {
							local358 += local277.method5355();
							@Pc(372) int local372;
							if (local31 == null) {
								local372 = local360;
							} else {
								local372 = local31[local360];
							}
							if (arg1 == local372) {
								Static468.method5036(local154, local292, local345, local279, local358);
								local279 += local358;
							}
							local292 += local358;
						}
					}
					local51[local281] = local345;
				} else {
					local226 = local154.length;
					local226--;
					local264 = local154[local226] & 0xFF;
					local226 -= local25 * local264 * 4;
					local277 = new Class1_Sub28(local154);
					local277.anInt6812 = local226;
					@Pc(450) int[] local450 = new int[local25];
					for (local281 = 0; local281 < local264; local281++) {
						local286 = 0;
						for (local290 = 0; local290 < local25; local290++) {
							local286 += local277.method5355();
							local450[local290] += local286;
						}
					}
					@Pc(488) byte[][] local488 = new byte[local25][];
					for (local290 = 0; local290 < local25; local290++) {
						local488[local290] = new byte[local450[local290]];
						local450[local290] = 0;
					}
					local277.anInt6812 = local226;
					local292 = 0;
					for (local304 = 0; local304 < local264; local304++) {
						local358 = 0;
						for (local360 = 0; local360 < local25; local360++) {
							local358 += local277.method5355();
							Static468.method5036(local154, local292, local488[local360], local450[local360], local358);
							local292 += local358;
							local450[local360] += local358;
						}
					}
					for (local358 = 0; local358 < local25; local358++) {
						if (local31 == null) {
							local360 = local358;
						} else {
							local360 = local31[local358];
						}
						if (this.anInt2180 == 0) {
							local51[local360] = Static316.method4271(local488[local358]);
						} else {
							local51[local360] = local488[local358];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZIZ)V")
	public void method1831(@OriginalArg(0) boolean arg0) {
		if (!this.method1836()) {
			return;
		}
		this.aClass272_1.anIntArrayArray65 = null;
		this.aClass272_1.aClass115Array1 = null;
		if (arg0) {
			this.aClass272_1.anIntArray518 = null;
			this.aClass272_1.aClass115_1 = null;
		}
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(II)Z")
	public boolean method1832(@OriginalArg(0) int arg0) {
		if (!this.method1842(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1822(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V")
	public void method1833() {
		if (this.anObjectArray3 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray3.length; local6++) {
				this.anObjectArray3[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(II)I")
	public int method1834(@OriginalArg(1) int arg0) {
		if (this.method1836()) {
			@Pc(16) int local16 = this.aClass272_1.aClass115_1.method2598(arg0);
			return this.method1842(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method1835(@OriginalArg(0) String arg0) {
		if (this.method1836()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass272_1.aClass115_1.method2598(Static70.method1140(local12));
			return this.method1842(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)Z")
	private boolean method1836() {
		if (this.aClass272_1 == null) {
			this.aClass272_1 = this.aClass85_1.method1893();
			if (this.aClass272_1 == null) {
				return false;
			}
			this.anObjectArray3 = new Object[this.aClass272_1.anInt7538];
			this.anObjectArrayArray1 = new Object[this.aClass272_1.anInt7538][];
		}
		return true;
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V")
	public void method1837() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method1838(@OriginalArg(0) String arg0) {
		if (this.method1836()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass272_1.aClass115_1.method2598(Static70.method1140(local18));
			this.method1816(local27);
		}
	}

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "(II)[I")
	public int[] method1839(@OriginalArg(0) int arg0) {
		if (!this.method1842(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass272_1.anIntArrayArray64[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass272_1.anIntArray516[arg0]];
			@Pc(37) int local37 = 0;
			while (local26.length > local37) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "(II)I")
	private int method1840(@OriginalArg(0) int arg0) {
		if (this.method1842(arg0)) {
			return this.anObjectArray3[arg0] == null ? this.aClass85_1.method1896(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method1841(@OriginalArg(1) String arg0) {
		if (this.method1836()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass272_1.aClass115_1.method2598(Static70.method1140(local19));
			return this.method1840(local28);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "(II)Z")
	private boolean method1842(@OriginalArg(0) int arg0) {
		if (!this.method1836()) {
			return false;
		} else if (arg0 >= 0 && this.aClass272_1.anIntArray519.length > arg0 && this.aClass272_1.anIntArray519[arg0] != 0) {
			return true;
		} else if (Static44.aBoolean82) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1843(@OriginalArg(0) String arg0) {
		if (this.method1836()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass272_1.aClass115_1.method2598(Static70.method1140(local19));
			return local28 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1844(@OriginalArg(0) String arg0) {
		if (this.method1836()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass272_1.aClass115_1.method2598(Static70.method1140(local12));
			return this.method1832(local21);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[IZI)[B")
	public byte[] method1845(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method1827(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(30) boolean local30 = this.method1830(arg2, arg0, arg1);
			if (!local30) {
				this.method1822(arg2);
				local30 = this.method1830(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static113.method1804(false, this.anObjectArrayArray1[arg2][arg0]);
		if (this.anInt2180 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass272_1.anIntArray519[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt2180 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local57;
	}
}
