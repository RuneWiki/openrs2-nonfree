import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class83 {

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!wf;")
	private Class176 aClass176_1 = null;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!wi;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!wi;ZZ)V")
	public Class83(@OriginalArg(0) Class85 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aClass85_1 = arg0;
		this.aBoolean155 = arg1;
		this.aBoolean156 = arg2;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZI)Z")
	public boolean method2299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2312(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method2321(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z")
	public boolean method2300() {
		if (!this.method2307()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass176_1.anIntArray614.length; local23++) {
			@Pc(39) int local39 = this.aClass176_1.anIntArray614[local23];
			if (this.anObjectArray1[local39] == null) {
				this.method2321(local39);
				if (this.anObjectArray1[local39] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public void method2301(@OriginalArg(1) int arg0) {
		if (this.method2308(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Z")
	public boolean method2302(@OriginalArg(1) int arg0) {
		if (!this.method2307()) {
			return false;
		} else if (this.aClass176_1.anIntArray612.length == 1) {
			return this.method2299(arg0, 0);
		} else if (!this.method2308(arg0)) {
			return false;
		} else if (this.aClass176_1.anIntArray612[arg0] == 1) {
			return this.method2299(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZI)V")
	public void method2303(@OriginalArg(1) boolean arg0) {
		if (!this.method2307()) {
			return;
		}
		if (arg0) {
			this.aClass176_1.anIntArray616 = null;
			this.aClass176_1.aClass61_1 = null;
		}
		this.aClass176_1.aClass61Array1 = null;
		this.aClass176_1.anIntArrayArray45 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[II)Z")
	private boolean method2304(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method2308(arg1)) {
			return false;
		} else if (this.anObjectArray1[arg1] == null) {
			return false;
		} else {
			@Pc(26) int local26 = this.aClass176_1.anIntArray613[arg1];
			@Pc(37) int[] local37 = this.aClass176_1.anIntArrayArray46[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass176_1.anIntArray612[arg1]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg1];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local26; local63++) {
				@Pc(70) int local70;
				if (local37 == null) {
					local70 = local63;
				} else {
					local70 = local37[local63];
				}
				if (local59[local70] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(123) byte[] local123;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local123 = Static122.method2095(this.anObjectArray1[arg1], false);
			} else {
				local123 = Static122.method2095(this.anObjectArray1[arg1], true);
				@Pc(128) Class1_Sub16 local128 = new Class1_Sub16(local123);
				local128.method2664(local128.aByteArray39.length, arg0);
			}
			@Pc(149) byte[] local149;
			try {
				local149 = Static150.method1242(local123);
			} catch (@Pc(151) RuntimeException local151) {
				throw Static75.method1383(local151, "T3 - " + (arg0 != null) + "," + arg1 + "," + local123.length + "," + Static193.method3429(local123.length, local123) + "," + Static193.method3429(local123.length - 2, local123) + "," + this.aClass176_1.anIntArray611[arg1] + "," + this.aClass176_1.anInt6187);
			}
			if (this.aBoolean155) {
				this.anObjectArray1[arg1] = null;
			}
			@Pc(225) int local225;
			if (local26 <= 1) {
				if (local37 == null) {
					local225 = 0;
				} else {
					local225 = local37[0];
				}
				if (this.aBoolean156) {
					local59[local225] = local149;
				} else {
					local59[local225] = Static191.method3400(local149);
				}
			} else {
				local225 = local149.length;
				local225--;
				@Pc(257) int local257 = local149[local225] & 0xFF;
				local225 -= local26 * 4 * local257;
				@Pc(268) int[] local268 = new int[local26];
				@Pc(273) Class1_Sub16 local273 = new Class1_Sub16(local149);
				local273.anInt3328 = local225;
				@Pc(283) int local283;
				@Pc(285) int local285;
				for (@Pc(278) int local278 = 0; local278 < local257; local278++) {
					local283 = 0;
					for (local285 = 0; local285 < local26; local285++) {
						if (local37 == null) {
						}
						local283 += local273.method2610();
						local268[local285] += local283;
					}
				}
				@Pc(313) byte[][] local313 = new byte[local26][];
				for (local283 = 0; local283 < local26; local283++) {
					local313[local283] = new byte[local268[local283]];
					local268[local283] = 0;
				}
				local273.anInt3328 = local225;
				local283 = 0;
				@Pc(352) int local352;
				for (local285 = 0; local285 < local257; local285++) {
					local352 = 0;
					for (@Pc(354) int local354 = 0; local354 < local26; local354++) {
						local352 += local273.method2610();
						Static302.method1372(local149, local283, local313[local354], local268[local354], local352);
						local283 += local352;
						local268[local354] += local352;
					}
				}
				for (local285 = 0; local285 < local26; local285++) {
					if (local37 == null) {
						local352 = local285;
					} else {
						local352 = local37[local285];
					}
					if (this.aBoolean156) {
						local59[local352] = local313[local285];
					} else {
						local59[local352] = Static191.method3400(local313[local285]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)[B")
	public byte[] method2306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method2323(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z")
	private boolean method2307() {
		if (this.aClass176_1 == null) {
			this.aClass176_1 = this.aClass85_1.method2503();
			if (this.aClass176_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass176_1.anInt6191];
			this.anObjectArrayArray1 = new Object[this.aClass176_1.anInt6191][];
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)Z")
	private boolean method2308(@OriginalArg(1) int arg0) {
		if (!this.method2307()) {
			return false;
		} else if (arg0 >= 0 && this.aClass176_1.anIntArray612.length > arg0 && this.aClass176_1.anIntArray612[arg0] != 0) {
			return true;
		} else if (Static126.aBoolean144) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method2310(@OriginalArg(0) String arg0) {
		if (this.method2307()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass176_1.aClass61_1.method1482(Static150.method1233(local12));
			this.method2313(local21);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	public boolean method2311(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2307()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass176_1.aClass61_1.method1482(Static150.method1233(local12));
		if (this.method2308(local24)) {
			@Pc(47) int local47 = this.aClass176_1.aClass61Array1[local24].method1482(Static150.method1233(local15));
			return this.method2299(local47, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)Z")
	private boolean method2312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2307()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass176_1.anIntArray612.length && arg1 < this.aClass176_1.anIntArray612[arg0]) {
			return true;
		} else if (Static126.aBoolean144) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	private void method2313(@OriginalArg(0) int arg0) {
		this.aClass85_1.method2507(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method2314(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2307()) {
			return null;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass176_1.aClass61_1.method1482(Static150.method1233(local14));
		if (this.method2308(local32)) {
			@Pc(50) int local50 = this.aClass176_1.aClass61Array1[local32].method1482(Static150.method1233(local23));
			return this.method2306(local32, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
	public int method2315() {
		if (!this.method2307()) {
			throw new IllegalStateException("");
		}
		return this.aClass176_1.anInt6187;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2316(@OriginalArg(1) String arg0) {
		if (this.method2307()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass176_1.aClass61_1.method1482(Static150.method1233(local20));
			return this.method2319(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I")
	public int method2317(@OriginalArg(1) int arg0) {
		return this.method2308(arg0) ? this.aClass176_1.anIntArray612[arg0] : 0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)I")
	public int method2318() {
		if (!this.method2307()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anObjectArray1.length; local18++) {
			if (this.aClass176_1.anIntArray613[local18] > 0) {
				local14 += 100;
				local16 += this.method2328(local18);
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Z")
	public boolean method2319(@OriginalArg(0) int arg0) {
		if (!this.method2308(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method2321(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2320(@OriginalArg(0) String arg0) {
		if (this.method2307()) {
			@Pc(23) String local23 = arg0.toLowerCase();
			@Pc(34) int local34 = this.aClass176_1.aClass61_1.method1482(Static150.method1233(local23));
			return this.method2328(local34);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)V")
	private void method2321(@OriginalArg(0) int arg0) {
		if (this.aBoolean155) {
			this.anObjectArray1[arg0] = this.aClass85_1.method2505(arg0);
		} else {
			this.anObjectArray1[arg0] = Static191.method3400(this.aClass85_1.method2505(arg0));
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method2322(@OriginalArg(1) String arg0) {
		if (this.method2307()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass176_1.aClass61_1.method1482(Static150.method1233(local13));
			return this.method2308(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[IZI)[B")
	public byte[] method2323(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method2312(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(36) boolean local36 = this.method2304(arg1, arg2);
			if (!local36) {
				this.method2321(arg2);
				local36 = this.method2304(arg1, arg2);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static122.method2095(this.anObjectArrayArray1[arg2][arg0], false);
		if (this.aBoolean156) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass176_1.anIntArray612[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method2324() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2325(@OriginalArg(1) String arg0) {
		if (this.method2307()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass176_1.aClass61_1.method1482(Static150.method1233(local21));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)[I")
	public int[] method2326(@OriginalArg(1) int arg0) {
		if (!this.method2308(arg0)) {
			return null;
		}
		@Pc(25) int[] local25 = this.aClass176_1.anIntArrayArray46[arg0];
		if (local25 == null) {
			local25 = new int[this.aClass176_1.anIntArray613[arg0]];
			@Pc(36) int local36 = 0;
			while (local25.length > local36) {
				local25[local36] = local36++;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)I")
	public int method2327() {
		return this.method2307() ? this.aClass176_1.anIntArray612.length : -1;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)I")
	private int method2328(@OriginalArg(0) int arg0) {
		if (this.method2308(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass85_1.method2504(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)[B")
	public byte[] method2329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2312(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(38) boolean local38 = this.method2304(null, arg0);
			if (!local38) {
				this.method2321(arg0);
				local38 = this.method2304(null, arg0);
				if (!local38) {
					return null;
				}
			}
		}
		return Static122.method2095(this.anObjectArrayArray1[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(BI)[B")
	public byte[] method2330(@OriginalArg(1) int arg0) {
		if (!this.method2307()) {
			return null;
		} else if (this.aClass176_1.anIntArray612.length == 1) {
			return this.method2306(0, arg0);
		} else if (!this.method2308(arg0)) {
			return null;
		} else if (this.aClass176_1.anIntArray612[arg0] == 1) {
			return this.method2306(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
