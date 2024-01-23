import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class51 {

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "Lclient!uj;")
	private Class136 aClass136_1 = null;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "Z")
	private boolean aBoolean136;

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "Lclient!bh;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!bh;ZZ)V")
	public Class51(@OriginalArg(0) Class17 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean137 = arg2;
		this.aBoolean136 = arg1;
		this.aClass17_1 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method1845(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1872()) {
			return false;
		}
		@Pc(14) String local14 = arg1.toLowerCase();
		@Pc(17) String local17 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass136_1.aClass10_1.method191(Static22.method2188(local14));
		if (this.method1864(local30)) {
			@Pc(50) int local50 = this.aClass136_1.aClass10Array1[local30].method191(Static22.method2188(local17));
			return this.method1862(local30, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public void method1846() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray1.length; local15++) {
				this.anObjectArrayArray1[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)I")
	public int method1848() {
		if (!this.method1872()) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray1.length; local23++) {
			if (this.aClass136_1.anIntArray451[local23] > 0) {
				local19 += this.method1871(local23);
				local21 += 100;
			}
		}
		if (local21 == 0) {
			return 100;
		} else {
			return local19 * 100 / local21;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method1849(@OriginalArg(0) String arg0) {
		if (this.method1872()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass136_1.aClass10_1.method191(Static22.method2188(local11));
			this.method1867(local26);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method1850(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1872()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass136_1.aClass10_1.method191(Static22.method2188(local12));
		if (this.method1864(local26)) {
			@Pc(52) int local52 = this.aClass136_1.aClass10Array1[local26].method191(Static22.method2188(local15));
			return this.method1874(local26, local52);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method1851(@OriginalArg(1) String arg0) {
		if (this.method1872()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass136_1.aClass10_1.method191(Static22.method2188(local20));
			return this.method1879(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ[I)Z")
	private boolean method1852(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method1864(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass136_1.anIntArray451[arg0];
			@Pc(31) int[] local31 = this.aClass136_1.anIntArrayArray37[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass136_1.anIntArray450[arg0]];
			}
			@Pc(48) boolean local48 = true;
			@Pc(53) Object[] local53 = this.anObjectArrayArray1[arg0];
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(61) int local61;
				if (local31 == null) {
					local61 = local55;
				} else {
					local61 = local31[local55];
				}
				if (local53[local61] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(112) byte[] local112;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local112 = Static171.method2974(false, this.anObjectArray1[arg0]);
			} else {
				local112 = Static171.method2974(true, this.anObjectArray1[arg0]);
				@Pc(117) Class1_Sub13 local117 = new Class1_Sub13(local112);
				local117.method1797(arg1, local117.aByteArray29.length);
			}
			@Pc(139) byte[] local139;
			try {
				local139 = Static182.method3130(local112);
			} catch (@Pc(141) RuntimeException local141) {
				throw Static108.method2209(local141, "T3 - " + (arg1 != null) + "," + arg0 + "," + local112.length + "," + Static121.method2367(local112.length, local112) + "," + Static121.method2367(local112.length - 2, local112) + "," + this.aClass136_1.anIntArray454[arg0] + "," + this.aClass136_1.anInt5168);
			}
			if (this.aBoolean136) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(217) int local217;
			if (local25 > 1) {
				local217 = local139.length;
				@Pc(220) int local220 = local217 - 1;
				@Pc(224) int local224 = local139[local220] & 0xFF;
				@Pc(229) Class1_Sub13 local229 = new Class1_Sub13(local139);
				@Pc(237) int local237 = local220 - local224 * local25 * 4;
				local229.anInt2395 = local237;
				@Pc(243) int[] local243 = new int[local25];
				@Pc(251) int local251;
				for (@Pc(245) int local245 = 0; local245 < local224; local245++) {
					@Pc(249) int local249 = 0;
					for (local251 = 0; local251 < local25; local251++) {
						local249 += local229.method1802();
						local243[local251] += local249;
					}
				}
				@Pc(281) byte[][] local281 = new byte[local25][];
				for (local251 = 0; local251 < local25; local251++) {
					local281[local251] = new byte[local243[local251]];
					local243[local251] = 0;
				}
				local229.anInt2395 = local237;
				@Pc(305) int local305 = 0;
				@Pc(311) int local311;
				@Pc(313) int local313;
				for (@Pc(307) int local307 = 0; local307 < local224; local307++) {
					local311 = 0;
					for (local313 = 0; local313 < local25; local313++) {
						local311 += local229.method1802();
						Static274.method2685(local139, local305, local281[local313], local243[local313], local311);
						local305 += local311;
						local243[local313] += local311;
					}
				}
				for (local311 = 0; local311 < local25; local311++) {
					if (local31 == null) {
						local313 = local311;
					} else {
						local313 = local31[local311];
					}
					if (this.aBoolean137) {
						local53[local313] = local281[local311];
					} else {
						local53[local313] = Static250.method4060(local281[local311]);
					}
				}
			} else {
				if (local31 == null) {
					local217 = 0;
				} else {
					local217 = local31[0];
				}
				if (this.aBoolean137) {
					local53[local217] = local139;
				} else {
					local53[local217] = Static250.method4060(local139);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public void method1853(@OriginalArg(1) int arg0) {
		if (this.method1864(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1854(@OriginalArg(1) String arg0) {
		if (this.method1872()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass136_1.aClass10_1.method191(Static22.method2188(local21));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZZI)V")
	public void method1855(@OriginalArg(0) boolean arg0) {
		if (!this.method1872()) {
			return;
		}
		this.aClass136_1.anIntArrayArray38 = null;
		this.aClass136_1.aClass10Array1 = null;
		if (arg0) {
			this.aClass136_1.anIntArray453 = null;
			this.aClass136_1.aClass10_1 = null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I")
	public int method1856() {
		if (!this.method1872()) {
			throw new IllegalStateException("");
		}
		return this.aClass136_1.anInt5168;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method1857(@OriginalArg(1) String arg0) {
		if (this.method1872()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass136_1.aClass10_1.method191(Static22.method2188(local12));
			return this.method1871(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([IIBI)[B")
	public byte[] method1858(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method1869(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(38) boolean local38 = this.method1852(arg2, arg0);
			if (!local38) {
				this.method1877(arg2);
				local38 = this.method1852(arg2, arg0);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static171.method2974(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.aBoolean137) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass136_1.anIntArray450[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I")
	public int method1859() {
		return this.method1872() ? this.aClass136_1.anIntArray450.length : -1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
	public boolean method1860() {
		if (!this.method1872()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass136_1.anIntArray452.length; local23++) {
			@Pc(31) int local31 = this.aClass136_1.anIntArray452[local23];
			if (this.anObjectArray1[local31] == null) {
				this.method1877(local31);
				if (this.anObjectArray1[local31] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
	public boolean method1862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1869(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1877(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[B")
	public byte[] method1863(@OriginalArg(0) int arg0) {
		if (!this.method1872()) {
			return null;
		} else if (this.aClass136_1.anIntArray450.length == 1) {
			return this.method1874(0, arg0);
		} else if (!this.method1864(arg0)) {
			return null;
		} else if (this.aClass136_1.anIntArray450[arg0] == 1) {
			return this.method1874(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)Z")
	private boolean method1864(@OriginalArg(1) int arg0) {
		if (!this.method1872()) {
			return false;
		} else if (arg0 >= 0 && this.aClass136_1.anIntArray450.length > arg0 && this.aClass136_1.anIntArray450[arg0] != 0) {
			return true;
		} else if (Static222.aBoolean253) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[I")
	public int[] method1865(@OriginalArg(1) int arg0) {
		if (!this.method1864(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass136_1.anIntArrayArray37[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass136_1.anIntArray451[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method1866(@OriginalArg(0) String arg0) {
		if (this.method1872()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass136_1.aClass10_1.method191(Static22.method2188(local12));
			return this.method1864(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(BI)V")
	private void method1867(@OriginalArg(1) int arg0) {
		this.aClass17_1.method2187(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(BI)Z")
	public boolean method1868(@OriginalArg(1) int arg0) {
		if (!this.method1872()) {
			return false;
		} else if (this.aClass136_1.anIntArray450.length == 1) {
			return this.method1862(0, arg0);
		} else if (!this.method1864(arg0)) {
			return false;
		} else if (this.aClass136_1.anIntArray450[arg0] == 1) {
			return this.method1862(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)Z")
	private boolean method1869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1872()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass136_1.anIntArray450.length > arg1 && this.aClass136_1.anIntArray450[arg1] > arg0) {
			return true;
		} else if (Static222.aBoolean253) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(II)I")
	private int method1871(@OriginalArg(0) int arg0) {
		if (this.method1864(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass17_1.method2190(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)Z")
	private boolean method1872() {
		if (this.aClass136_1 == null) {
			this.aClass136_1 = this.aClass17_1.method2181();
			if (this.aClass136_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass136_1.anInt5163][];
			this.anObjectArray1 = new Object[this.aClass136_1.anInt5163];
		}
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)[B")
	public byte[] method1874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1858(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(II)I")
	public int method1875(@OriginalArg(0) int arg0) {
		return this.method1864(arg0) ? this.aClass136_1.anIntArray450[arg0] : 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V")
	private void method1877(@OriginalArg(0) int arg0) {
		if (this.aBoolean136) {
			this.anObjectArray1[arg0] = this.aClass17_1.method2184(arg0);
		} else {
			this.anObjectArray1[arg0] = Static250.method4060(this.aClass17_1.method2184(arg0));
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)[B")
	public byte[] method1878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1869(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(29) boolean local29 = this.method1852(arg0, null);
			if (!local29) {
				this.method1877(arg0);
				local29 = this.method1852(arg0, null);
				if (!local29) {
					return null;
				}
			}
		}
		return Static171.method2974(false, this.anObjectArrayArray1[arg0][arg1]);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)Z")
	public boolean method1879(@OriginalArg(0) int arg0) {
		if (!this.method1864(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1877(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}
}
