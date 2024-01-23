import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class121 {

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!nk", name = "L", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Lclient!fc;")
	private Class47 aClass47_2 = null;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!nk", name = "M", descriptor = "Lclient!cc;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!cc;ZZ)V")
	public Class121(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean247 = arg1;
		this.aClass21_1 = arg0;
		this.aBoolean246 = arg2;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3108(@OriginalArg(1) String arg0) {
		if (this.method3131()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass47_2.aClass173_1.method4268(Static269.method2119(local13));
			return this.method3129(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIB)Z")
	public boolean method3110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3130(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method3138(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "([IIII)[B")
	public byte[] method3111(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method3130(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(39) boolean local39 = this.method3127(arg2, arg0);
			if (!local39) {
				this.method3138(arg2);
				local39 = this.method3127(arg2, arg0);
				if (!local39) {
					return null;
				}
			}
		}
		@Pc(67) byte[] local67 = Static88.method1623(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.aBoolean246) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass47_2.anIntArray125[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		}
		return local67;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)[B")
	public byte[] method3112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3130(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(32) boolean local32 = this.method3127(arg1, null);
			if (!local32) {
				this.method3138(arg1);
				local32 = this.method3127(arg1, null);
				if (!local32) {
					return null;
				}
			}
		}
		return Static88.method1623(this.anObjectArrayArray1[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3113(@OriginalArg(0) String arg0) {
		if (this.method3131()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass47_2.aClass173_1.method4268(Static269.method2119(local13));
			return this.method3116(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method3114(@OriginalArg(0) String arg0) {
		if (this.method3131()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass47_2.aClass173_1.method4268(Static269.method2119(local21));
			return this.method3133(local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IIB)[B")
	public byte[] method3115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3111(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)I")
	private int method3116(@OriginalArg(1) int arg0) {
		if (this.method3129(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass21_1.method2403(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)Z")
	public boolean method3117() {
		if (!this.method3131()) {
			return false;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass47_2.anIntArray129.length; local21++) {
			@Pc(37) int local37 = this.aClass47_2.anIntArray129[local21];
			if (this.anObjectArray32[local37] == null) {
				this.method3138(local37);
				if (this.anObjectArray32[local37] == null) {
					local19 = false;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method3118(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3131()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(27) int local27 = this.aClass47_2.aClass173_1.method4268(Static269.method2119(local13));
		if (this.method3129(local27)) {
			@Pc(51) int local51 = this.aClass47_2.aClass173Array1[local27].method4268(Static269.method2119(local16));
			return this.method3110(local27, local51);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public void method3119(@OriginalArg(0) String arg0) {
		if (this.method3131()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass47_2.aClass173_1.method4268(Static269.method2119(local20));
			this.method3128(local29);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3120(@OriginalArg(1) String arg0) {
		if (this.method3131()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass47_2.aClass173_1.method4268(Static269.method2119(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZZ)V")
	public void method3121(@OriginalArg(1) boolean arg0) {
		if (!this.method3131()) {
			return;
		}
		if (arg0) {
			this.aClass47_2.anIntArray128 = null;
			this.aClass47_2.aClass173_1 = null;
		}
		this.aClass47_2.aClass173Array1 = null;
		this.aClass47_2.anIntArrayArray14 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V")
	public void method3122(@OriginalArg(0) int arg0) {
		if (this.method3129(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)I")
	public int method3123(@OriginalArg(0) int arg0) {
		if (this.method3131()) {
			@Pc(21) int local21 = this.aClass47_2.aClass173_1.method4268(arg0);
			return this.method3129(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)I")
	public int method3124() {
		if (!this.method3131()) {
			throw new IllegalStateException("");
		}
		return this.aClass47_2.anInt1558;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(ZI)I")
	public int method3125(@OriginalArg(1) int arg0) {
		return this.method3129(arg0) ? this.aClass47_2.anIntArray125[arg0] : 0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)I")
	public int method3126() {
		if (!this.method3131()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray32.length; local17++) {
			if (this.aClass47_2.anIntArray126[local17] > 0) {
				local13 += 100;
				local15 += this.method3116(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[I)Z")
	private boolean method3127(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method3129(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass47_2.anIntArray126[arg0];
			@Pc(33) int[] local33 = this.aClass47_2.anIntArrayArray15[arg0];
			@Pc(35) boolean local35 = true;
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass47_2.anIntArray125[arg0]];
			}
			@Pc(56) Object[] local56 = this.anObjectArrayArray1[arg0];
			for (@Pc(58) int local58 = 0; local58 < local27; local58++) {
				@Pc(68) int local68;
				if (local33 == null) {
					local68 = local58;
				} else {
					local68 = local33[local58];
				}
				if (local56[local68] == null) {
					local35 = false;
					break;
				}
			}
			if (local35) {
				return true;
			}
			@Pc(128) byte[] local128;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local128 = Static88.method1623(this.anObjectArray32[arg0], false);
			} else {
				local128 = Static88.method1623(this.anObjectArray32[arg0], true);
				@Pc(142) Class1_Sub14 local142 = new Class1_Sub14(local128);
				local142.method1389(arg1, local142.aByteArray17.length);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static263.method4149(local128);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static95.method1735(local156, "T3 - " + (arg1 != null) + "," + arg0 + "," + local128.length + "," + Static168.method2849(local128, local128.length) + "," + Static168.method2849(local128, local128.length - 2) + "," + this.aClass47_2.anIntArray127[arg0] + "," + this.aClass47_2.anInt1558);
			}
			if (this.aBoolean247) {
				this.anObjectArray32[arg0] = null;
			}
			@Pc(228) int local228;
			if (local27 > 1) {
				local228 = local154.length;
				@Pc(230) int local230 = local228 - 1;
				@Pc(235) int local235 = local154[local230] & 0xFF;
				@Pc(243) int local243 = local230 - local235 * 4 * local27;
				@Pc(246) int[] local246 = new int[local27];
				@Pc(251) Class1_Sub14 local251 = new Class1_Sub14(local154);
				local251.anInt1480 = local243;
				@Pc(261) int local261;
				@Pc(263) int local263;
				for (@Pc(256) int local256 = 0; local256 < local235; local256++) {
					local261 = 0;
					for (local263 = 0; local263 < local27; local263++) {
						local261 += local251.method1392();
						if (local33 != null) {
						}
						local246[local263] += local261;
					}
				}
				@Pc(294) byte[][] local294 = new byte[local27][];
				for (local261 = 0; local261 < local27; local261++) {
					local294[local261] = new byte[local246[local261]];
					local246[local261] = 0;
				}
				local251.anInt1480 = local243;
				local261 = 0;
				@Pc(329) int local329;
				for (local263 = 0; local263 < local235; local263++) {
					local329 = 0;
					for (@Pc(331) int local331 = 0; local331 < local27; local331++) {
						local329 += local251.method1392();
						Static319.method1766(local154, local261, local294[local331], local246[local331], local329);
						local246[local331] += local329;
						local261 += local329;
					}
				}
				for (local263 = 0; local263 < local27; local263++) {
					if (local33 == null) {
						local329 = local263;
					} else {
						local329 = local33[local263];
					}
					if (this.aBoolean246) {
						local56[local329] = local294[local263];
					} else {
						local56[local329] = Static167.method2846(local294[local263]);
					}
				}
			} else {
				if (local33 == null) {
					local228 = 0;
				} else {
					local228 = local33[0];
				}
				if (this.aBoolean246) {
					local56[local228] = local154;
				} else {
					local56[local228] = Static167.method2846(local154);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V")
	private void method3128(@OriginalArg(1) int arg0) {
		this.aClass21_1.method2408(arg0);
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)Z")
	private boolean method3129(@OriginalArg(1) int arg0) {
		if (!this.method3131()) {
			return false;
		} else if (arg0 >= 0 && this.aClass47_2.anIntArray125.length > arg0 && this.aClass47_2.anIntArray125[arg0] != 0) {
			return true;
		} else if (Static192.aBoolean248) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(III)Z")
	private boolean method3130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3131()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass47_2.anIntArray125.length > arg1 && arg0 < this.aClass47_2.anIntArray125[arg1]) {
			return true;
		} else if (Static192.aBoolean248) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)Z")
	private boolean method3131() {
		if (this.aClass47_2 == null) {
			this.aClass47_2 = this.aClass21_1.method2406();
			if (this.aClass47_2 == null) {
				return false;
			}
			this.anObjectArray32 = new Object[this.aClass47_2.anInt1564];
			this.anObjectArrayArray1 = new Object[this.aClass47_2.anInt1564][];
		}
		return true;
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(II)Z")
	public boolean method3133(@OriginalArg(1) int arg0) {
		if (!this.method3129(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method3138(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method3134(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3131()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass47_2.aClass173_1.method4268(Static269.method2119(local12));
		if (this.method3129(local32)) {
			@Pc(50) int local50 = this.aClass47_2.aClass173Array1[local32].method4268(Static269.method2119(local15));
			return this.method3115(local32, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)[I")
	public int[] method3135(@OriginalArg(0) int arg0) {
		if (!this.method3129(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass47_2.anIntArrayArray15[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass47_2.anIntArray126[arg0]];
			@Pc(39) int local39 = 0;
			while (local27.length > local39) {
				local27[local39] = local39++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
	public void method3136() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArrayArray1.length; local17++) {
				this.anObjectArrayArray1[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)I")
	public int method3137() {
		return this.method3131() ? this.aClass47_2.anIntArray125.length : -1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V")
	private void method3138(@OriginalArg(0) int arg0) {
		if (this.aBoolean247) {
			this.anObjectArray32[arg0] = this.aClass21_1.method2407(arg0);
		} else {
			this.anObjectArray32[arg0] = Static167.method2846(this.aClass21_1.method2407(arg0));
		}
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(II)[B")
	public byte[] method3139(@OriginalArg(0) int arg0) {
		if (!this.method3131()) {
			return null;
		} else if (this.aClass47_2.anIntArray125.length == 1) {
			return this.method3115(0, arg0);
		} else if (!this.method3129(arg0)) {
			return null;
		} else if (this.aClass47_2.anIntArray125[arg0] == 1) {
			return this.method3115(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(II)Z")
	public boolean method3140(@OriginalArg(0) int arg0) {
		if (!this.method3131()) {
			return false;
		} else if (this.aClass47_2.anIntArray125.length == 1) {
			return this.method3110(0, arg0);
		} else if (!this.method3129(arg0)) {
			return false;
		} else if (this.aClass47_2.anIntArray125[arg0] == 1) {
			return this.method3110(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
