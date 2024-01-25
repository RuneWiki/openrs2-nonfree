import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class69 {

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray3;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "Lclient!wh;")
	private Class317 aClass317_1 = null;

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
	public int anInt2003;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "Z")
	private final boolean aBoolean170;

	@OriginalMember(owner = "client!dn", name = "K", descriptor = "Lclient!tk;")
	private final Class235 aClass235_1;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!tk;ZI)V")
	public Class69(@OriginalArg(0) Class235 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt2003 = arg2;
		this.aBoolean170 = arg1;
		this.aClass235_1 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public void method1879() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZ)Z")
	private boolean method1881(@OriginalArg(0) int arg0) {
		if (!this.method1882()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass317_1.anIntArray829.length && this.aClass317_1.anIntArray829[arg0] != 0) {
			return true;
		} else if (Static343.aBoolean695) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)Z")
	private boolean method1882() {
		if (this.aClass317_1 == null) {
			this.aClass317_1 = this.aClass235_1.method6221();
			if (this.aClass317_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass317_1.anInt9413][];
			this.anObjectArray3 = new Object[this.aClass317_1.anInt9413];
		}
		return true;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method1883(@OriginalArg(1) String arg0) {
		if (this.method1882()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass317_1.aClass191_1.method5380(Static207.method3826(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)I")
	public int method1884(@OriginalArg(0) int arg0) {
		return this.method1881(arg0) ? this.aClass317_1.anIntArray829[arg0] : 0;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
	private int method1885(@OriginalArg(1) int arg0) {
		if (this.method1881(arg0)) {
			return this.anObjectArray3[arg0] == null ? this.aClass235_1.method6217(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)V")
	private void method1886(@OriginalArg(1) int arg0) {
		if (this.aBoolean170) {
			this.anObjectArray3[arg0] = this.aClass235_1.method6218(arg0);
		} else {
			this.anObjectArray3[arg0] = Static271.method4827(this.aClass235_1.method6218(arg0));
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method1887(@OriginalArg(0) String arg0) {
		if (this.method1882()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass317_1.aClass191_1.method5380(Static207.method3826(local13));
			this.method1901(local24);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)[B")
	public byte[] method1888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1903(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)[I")
	public int[] method1889(@OriginalArg(0) int arg0) {
		if (!this.method1881(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass317_1.anIntArrayArray123[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass317_1.anIntArray826[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)[B")
	public byte[] method1890(@OriginalArg(0) int arg0) {
		if (!this.method1882()) {
			return null;
		} else if (this.aClass317_1.anIntArray829.length == 1) {
			return this.method1888(arg0, 0);
		} else if (!this.method1881(arg0)) {
			return null;
		} else if (this.aClass317_1.anIntArray829[arg0] == 1) {
			return this.method1888(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[III)Z")
	private boolean method1891(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method1881(arg2)) {
			return false;
		} else if (this.anObjectArray3[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass317_1.anIntArray826[arg2];
			@Pc(31) int[] local31 = this.aClass317_1.anIntArrayArray123[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass317_1.anIntArray829[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(63) int local63;
				if (local31 == null) {
					local63 = local55;
				} else {
					local63 = local31[local55];
				}
				if (local51[local63] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(115) byte[] local115;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local115 = Static542.method8243(false, this.anObjectArray3[arg2]);
			} else {
				local115 = Static542.method8243(true, this.anObjectArray3[arg2]);
				@Pc(120) Class1_Sub17 local120 = new Class1_Sub17(local115);
				local120.method4495(local120.aByteArray58.length, arg1);
			}
			@Pc(144) byte[] local144;
			try {
				local144 = Static76.method1744(local115);
			} catch (@Pc(146) RuntimeException local146) {
				throw Static90.method1928(local146, "T3 - " + (arg1 != null) + "," + arg2 + "," + local115.length + "," + Static304.method5354(local115.length, local115) + "," + Static304.method5354(local115.length - 2, local115) + "," + this.aClass317_1.anIntArray827[arg2] + "," + this.aClass317_1.anInt9412);
			}
			if (this.aBoolean170) {
				this.anObjectArray3[arg2] = null;
			}
			@Pc(221) int local221;
			if (local25 > 1) {
				@Pc(228) int local228;
				@Pc(241) Class1_Sub17 local241;
				@Pc(245) int local245;
				@Pc(250) int local250;
				@Pc(254) int local254;
				@Pc(256) int local256;
				@Pc(270) int local270;
				@Pc(311) int local311;
				@Pc(313) int local313;
				if (this.anInt2003 == 2) {
					local221 = local144.length;
					@Pc(224) int local224 = local221 - 1;
					local228 = local144[local224] & 0xFF;
					@Pc(236) int local236 = local224 - local25 * local228 * 4;
					local241 = new Class1_Sub17(local144);
					@Pc(243) int local243 = 0;
					local245 = 0;
					local241.anInt4872 = local236;
					for (local250 = 0; local250 < local228; local250++) {
						local254 = 0;
						for (local256 = 0; local256 < local25; local256++) {
							local254 += local241.method4481();
							if (local31 == null) {
								local270 = local256;
							} else {
								local270 = local31[local256];
							}
							if (arg0 == local270) {
								local243 += local254;
								local245 = local270;
							}
						}
					}
					if (local243 == 0) {
						return true;
					}
					@Pc(298) byte[] local298 = new byte[local243];
					local243 = 0;
					local241.anInt4872 = local236;
					local256 = 0;
					for (local270 = 0; local270 < local228; local270++) {
						local311 = 0;
						for (local313 = 0; local313 < local25; local313++) {
							local311 += local241.method4481();
							@Pc(327) int local327;
							if (local31 == null) {
								local327 = local313;
							} else {
								local327 = local31[local313];
							}
							if (arg0 == local327) {
								Static556.method7044(local144, local256, local298, local243, local311);
								local243 += local311;
							}
							local256 += local311;
						}
					}
					local51[local245] = local298;
				} else {
					local221 = local144.length;
					local221--;
					local228 = local144[local221] & 0xFF;
					local221 -= local228 * local25 * 4;
					local241 = new Class1_Sub17(local144);
					local241.anInt4872 = local221;
					@Pc(395) int[] local395 = new int[local25];
					for (local245 = 0; local245 < local228; local245++) {
						local250 = 0;
						for (local254 = 0; local254 < local25; local254++) {
							local250 += local241.method4481();
							local395[local254] += local250;
						}
					}
					@Pc(437) byte[][] local437 = new byte[local25][];
					for (local254 = 0; local254 < local25; local254++) {
						local437[local254] = new byte[local395[local254]];
						local395[local254] = 0;
					}
					local241.anInt4872 = local221;
					local256 = 0;
					for (local270 = 0; local270 < local228; local270++) {
						local311 = 0;
						for (local313 = 0; local313 < local25; local313++) {
							local311 += local241.method4481();
							Static556.method7044(local144, local256, local437[local313], local395[local313], local311);
							local256 += local311;
							local395[local313] += local311;
						}
					}
					for (local311 = 0; local311 < local25; local311++) {
						if (local31 == null) {
							local313 = local311;
						} else {
							local313 = local31[local311];
						}
						if (this.anInt2003 == 0) {
							local51[local313] = Static271.method4827(local437[local311]);
						} else {
							local51[local313] = local437[local311];
						}
					}
				}
			} else {
				if (local31 == null) {
					local221 = 0;
				} else {
					local221 = local31[0];
				}
				if (this.anInt2003 == 0) {
					local51[local221] = Static271.method4827(local144);
				} else {
					local51[local221] = local144;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(III)Z")
	private boolean method1892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1882()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass317_1.anIntArray829.length > arg1 && this.aClass317_1.anIntArray829[arg1] > arg0) {
			return true;
		} else if (Static343.aBoolean695) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBI)Z")
	public boolean method1893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1892(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1886(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZZ)V")
	public void method1894(@OriginalArg(1) boolean arg0) {
		if (!this.method1882()) {
			return;
		}
		if (arg0) {
			this.aClass317_1.aClass191_1 = null;
			this.aClass317_1.anIntArray824 = null;
		}
		this.aClass317_1.aClass191Array1 = null;
		this.aClass317_1.anIntArrayArray122 = null;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)I")
	public int method1895() {
		return this.method1882() ? this.aClass317_1.anIntArray829.length : -1;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)Z")
	public boolean method1896(@OriginalArg(1) int arg0) {
		if (!this.method1882()) {
			return false;
		} else if (this.aClass317_1.anIntArray829.length == 1) {
			return this.method1893(0, arg0);
		} else if (!this.method1881(arg0)) {
			return false;
		} else if (this.aClass317_1.anIntArray829[arg0] == 1) {
			return this.method1893(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method1897(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1882()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass317_1.aClass191_1.method5380(Static207.method3826(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(39) int local39 = this.aClass317_1.aClass191Array1[local24].method5380(Static207.method3826(local15));
			return local39 >= 0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)I")
	public int method1898() {
		if (!this.method1882()) {
			throw new IllegalStateException("");
		}
		return this.aClass317_1.anInt9412;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method1900(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1882()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass317_1.aClass191_1.method5380(Static207.method3826(local12));
		if (this.method1881(local32)) {
			@Pc(50) int local50 = this.aClass317_1.aClass191Array1[local32].method5380(Static207.method3826(local15));
			return this.method1888(local50, local32);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(BI)V")
	private void method1901(@OriginalArg(1) int arg0) {
		this.aClass235_1.method6215(arg0);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)I")
	public int method1902() {
		if (!this.method1882()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray3.length; local17++) {
			if (this.aClass317_1.anIntArray826[local17] > 0) {
				local15 += this.method1885(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([IBII)[B")
	public byte[] method1903(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method1892(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(30) boolean local30 = this.method1891(arg2, arg0, arg1);
			if (!local30) {
				this.method1886(arg1);
				local30 = this.method1891(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static542.method8243(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt2003 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass317_1.anIntArray829[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt2003 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z")
	public boolean method1904() {
		if (!this.method1882()) {
			return false;
		}
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < this.aClass317_1.anIntArray825.length; local13++) {
			@Pc(24) int local24 = this.aClass317_1.anIntArray825[local13];
			if (this.anObjectArray3[local24] == null) {
				this.method1886(local24);
				if (this.anObjectArray3[local24] == null) {
					local11 = false;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)V")
	public void method1905() {
		if (this.anObjectArray3 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray3.length; local14++) {
				this.anObjectArray3[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(II)I")
	public int method1906(@OriginalArg(1) int arg0) {
		if (this.method1882()) {
			@Pc(16) int local16 = this.aClass317_1.aClass191_1.method5380(arg0);
			return this.method1881(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method1907(@OriginalArg(0) String arg0) {
		if (this.method1882()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass317_1.aClass191_1.method5380(Static207.method3826(local12));
			return this.method1885(local28);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1908(@OriginalArg(1) String arg0) {
		if (this.method1882()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass317_1.aClass191_1.method5380(Static207.method3826(local12));
			return this.method1911(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method1909(@OriginalArg(1) String arg0) {
		if (this.method1882()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass317_1.aClass191_1.method5380(Static207.method3826(local18));
			return this.method1881(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "(II)V")
	public void method1910(@OriginalArg(1) int arg0) {
		if (this.method1881(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(IZ)Z")
	public boolean method1911(@OriginalArg(0) int arg0) {
		if (!this.method1881(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1886(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method1912(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1882()) {
			return false;
		}
		@Pc(17) String local17 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass317_1.aClass191_1.method5380(Static207.method3826(local17));
		if (this.method1881(local29)) {
			@Pc(47) int local47 = this.aClass317_1.aClass191Array1[local29].method5380(Static207.method3826(local20));
			return this.method1893(local29, local47);
		} else {
			return false;
		}
	}
}
