import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class58 {

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "Lclient!fo;")
	private Class61 aClass61_1 = null;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "Z")
	private boolean aBoolean108;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "Lclient!ga;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Z")
	private boolean aBoolean107;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ga;ZZ)V")
	public Class58(@OriginalArg(0) Class62 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean108 = arg2;
		this.aClass62_1 = arg0;
		this.aBoolean107 = arg1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method1340(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1348()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.aClass61_1.aClass66_1.method1564(Static164.method2657(local13));
		if (this.method1366(local25)) {
			@Pc(52) int local52 = this.aClass61_1.aClass66Array1[local25].method1564(Static164.method2657(local16));
			return this.method1370(local25, local52);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	private void method1341(@OriginalArg(1) int arg0) {
		this.aClass62_1.method4693(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method1342(@OriginalArg(0) String arg0) {
		if (this.method1348()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass61_1.aClass66_1.method1564(Static164.method2657(local19));
			return this.method1346(local30);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZ)[B")
	public byte[] method1343(@OriginalArg(0) int arg0) {
		if (!this.method1348()) {
			return null;
		} else if (this.aClass61_1.anIntArray152.length == 1) {
			return this.method1372(0, arg0);
		} else if (!this.method1366(arg0)) {
			return null;
		} else if (this.aClass61_1.anIntArray152[arg0] == 1) {
			return this.method1372(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1344(@OriginalArg(0) String arg0) {
		if (this.method1348()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass61_1.aClass66_1.method1564(Static164.method2657(local18));
			return local27 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public int method1345() {
		if (!this.method1348()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray1.length; local17++) {
			if (this.aClass61_1.anIntArray154[local17] > 0) {
				local15 += this.method1346(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)I")
	private int method1346(@OriginalArg(0) int arg0) {
		if (this.method1366(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass62_1.method4692(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Z")
	private boolean method1348() {
		if (this.aClass61_1 == null) {
			this.aClass61_1 = this.aClass62_1.method4696();
			if (this.aClass61_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass61_1.anInt1979];
			this.anObjectArrayArray1 = new Object[this.aClass61_1.anInt1979][];
		}
		return true;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public void method1349() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray1.length; local11++) {
				this.anObjectArrayArray1[local11] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZII)[B")
	public byte[] method1350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1353(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method1354(null, arg1);
			if (!local29) {
				this.method1352(arg1);
				local29 = this.method1354(null, arg1);
				if (!local29) {
					return null;
				}
			}
		}
		return Static218.method3529(false, this.anObjectArrayArray1[arg1][arg0]);
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)I")
	public int method1351() {
		return this.method1348() ? this.aClass61_1.anIntArray152.length : -1;
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(II)V")
	private void method1352(@OriginalArg(1) int arg0) {
		if (this.aBoolean107) {
			this.anObjectArray1[arg0] = this.aClass62_1.method4694(arg0);
		} else {
			this.anObjectArray1[arg0] = Static29.method461(this.aClass62_1.method4694(arg0));
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
	private boolean method1353(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1348()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass61_1.anIntArray152.length > arg1 && arg0 < this.aClass61_1.anIntArray152[arg1]) {
			return true;
		} else if (Static138.aBoolean182) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[II)Z")
	private boolean method1354(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method1366(arg1)) {
			return false;
		} else if (this.anObjectArray1[arg1] == null) {
			return false;
		} else {
			@Pc(27) int[] local27 = this.aClass61_1.anIntArrayArray14[arg1];
			@Pc(33) int local33 = this.aClass61_1.anIntArray154[arg1];
			@Pc(35) boolean local35 = true;
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass61_1.anIntArray152[arg1]];
			}
			@Pc(57) Object[] local57 = this.anObjectArrayArray1[arg1];
			for (@Pc(59) int local59 = 0; local59 < local33; local59++) {
				@Pc(71) int local71;
				if (local27 == null) {
					local71 = local59;
				} else {
					local71 = local27[local59];
				}
				if (local57[local71] == null) {
					local35 = false;
					break;
				}
			}
			if (local35) {
				return true;
			}
			@Pc(123) byte[] local123;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local123 = Static218.method3529(false, this.anObjectArray1[arg1]);
			} else {
				local123 = Static218.method3529(true, this.anObjectArray1[arg1]);
				@Pc(128) Class4_Sub10 local128 = new Class4_Sub10(local123);
				local128.method4644(arg0, local128.aByteArray71.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static109.method1750(local123);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static39.method612(local153, "T3 - " + (arg0 != null) + "," + arg1 + "," + local123.length + "," + Static43.method2328(local123.length, local123) + "," + Static43.method2328(local123.length - 2, local123) + "," + this.aClass61_1.anIntArray153[arg1] + "," + this.aClass61_1.anInt1978);
			}
			if (this.aBoolean107) {
				this.anObjectArray1[arg1] = null;
			}
			@Pc(226) int local226;
			if (local33 > 1) {
				local226 = local151.length;
				@Pc(229) int[] local229 = new int[local33];
				@Pc(231) int local231 = local226 - 1;
				@Pc(236) int local236 = local151[local231] & 0xFF;
				@Pc(241) Class4_Sub10 local241 = new Class4_Sub10(local151);
				@Pc(249) int local249 = local231 - local33 * local236 * 4;
				local241.anInt5713 = local249;
				@Pc(259) int local259;
				@Pc(261) int local261;
				for (@Pc(254) int local254 = 0; local254 < local236; local254++) {
					local259 = 0;
					for (local261 = 0; local261 < local33; local261++) {
						if (local27 != null) {
						}
						local259 += local241.method4632();
						local229[local261] += local259;
					}
				}
				@Pc(289) byte[][] local289 = new byte[local33][];
				for (local259 = 0; local259 < local33; local259++) {
					local289[local259] = new byte[local229[local259]];
					local229[local259] = 0;
				}
				local241.anInt5713 = local249;
				local259 = 0;
				@Pc(320) int local320;
				for (local261 = 0; local261 < local236; local261++) {
					local320 = 0;
					for (@Pc(322) int local322 = 0; local322 < local33; local322++) {
						local320 += local241.method4632();
						Static316.method80(local151, local259, local289[local322], local229[local322], local320);
						local259 += local320;
						local229[local322] += local320;
					}
				}
				for (local261 = 0; local261 < local33; local261++) {
					if (local27 == null) {
						local320 = local261;
					} else {
						local320 = local27[local261];
					}
					if (this.aBoolean108) {
						local57[local320] = local289[local261];
					} else {
						local57[local320] = Static29.method461(local289[local261]);
					}
				}
			} else {
				if (local27 == null) {
					local226 = 0;
				} else {
					local226 = local27[0];
				}
				if (this.aBoolean108) {
					local57[local226] = local151;
				} else {
					local57[local226] = Static29.method461(local151);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)Z")
	public boolean method1355(@OriginalArg(0) int arg0) {
		if (!this.method1366(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1352(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZB)V")
	public void method1356(@OriginalArg(0) boolean arg0) {
		if (!this.method1348()) {
			return;
		}
		this.aClass61_1.aClass66Array1 = null;
		this.aClass61_1.anIntArrayArray15 = null;
		if (arg0) {
			this.aClass61_1.anIntArray155 = null;
			this.aClass61_1.aClass66_1 = null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method1357(@OriginalArg(1) String arg0) {
		if (this.method1348()) {
			@Pc(23) String local23 = arg0.toLowerCase();
			@Pc(32) int local32 = this.aClass61_1.aClass66_1.method1564(Static164.method2657(local23));
			this.method1341(local32);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method1358(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1348()) {
			return null;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass61_1.aClass66_1.method1564(Static164.method2657(local13));
		if (this.method1366(local31)) {
			@Pc(50) int local50 = this.aClass61_1.aClass66Array1[local31].method1564(Static164.method2657(local22));
			return this.method1372(local31, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(II)Z")
	public boolean method1359(@OriginalArg(0) int arg0) {
		if (!this.method1348()) {
			return false;
		} else if (this.aClass61_1.anIntArray152.length == 1) {
			return this.method1370(0, arg0);
		} else if (!this.method1366(arg0)) {
			return false;
		} else if (this.aClass61_1.anIntArray152[arg0] == 1) {
			return this.method1370(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Z")
	public boolean method1360() {
		if (!this.method1348()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass61_1.anIntArray156.length; local16++) {
			@Pc(32) int local32 = this.aClass61_1.anIntArray156[local16];
			if (this.anObjectArray1[local32] == null) {
				this.method1352(local32);
				if (this.anObjectArray1[local32] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[II)[B")
	public byte[] method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1353(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(32) boolean local32 = this.method1354(arg2, arg1);
			if (!local32) {
				this.method1352(arg1);
				local32 = this.method1354(arg2, arg1);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static218.method3529(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.aBoolean108) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass61_1.anIntArray152[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method1362(@OriginalArg(1) String arg0) {
		if (this.method1348()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass61_1.aClass66_1.method1564(Static164.method2657(local13));
			return this.method1366(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)[I")
	public int[] method1363(@OriginalArg(1) int arg0) {
		if (!this.method1366(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass61_1.anIntArrayArray14[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass61_1.anIntArray154[arg0]];
			@Pc(38) int local38 = 0;
			while (local38 < local27.length) {
				local27[local38] = local38++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1365(@OriginalArg(0) String arg0) {
		if (this.method1348()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass61_1.aClass66_1.method1564(Static164.method2657(local12));
			return this.method1355(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(II)Z")
	private boolean method1366(@OriginalArg(0) int arg0) {
		if (!this.method1348()) {
			return false;
		} else if (arg0 >= 0 && this.aClass61_1.anIntArray152.length > arg0 && this.aClass61_1.anIntArray152[arg0] != 0) {
			return true;
		} else if (Static138.aBoolean182) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IB)I")
	public int method1367(@OriginalArg(0) int arg0) {
		if (this.method1348()) {
			@Pc(17) int local17 = this.aClass61_1.aClass66_1.method1564(arg0);
			return this.method1366(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(ZI)V")
	public void method1368(@OriginalArg(1) int arg0) {
		if (this.method1366(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I")
	public int method1369() {
		if (!this.method1348()) {
			throw new IllegalStateException("");
		}
		return this.aClass61_1.anInt1978;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZI)Z")
	public boolean method1370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1353(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1352(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(II)I")
	public int method1371(@OriginalArg(0) int arg0) {
		return this.method1366(arg0) ? this.aClass61_1.anIntArray152[arg0] : 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)[B")
	public byte[] method1372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1361(arg1, arg0, null);
	}
}
