import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class84 {

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "Lclient!of;")
	private Class125 aClass125_1 = null;

	@OriginalMember(owner = "client!jd", name = "N", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "client!jd", name = "M", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!gl;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!gl;ZZ)V")
	public Class84(@OriginalArg(0) Class63 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean193 = arg1;
		this.aBoolean192 = arg2;
		this.aClass63_1 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
	private boolean method2115(@OriginalArg(1) int arg0) {
		if (!this.method2145()) {
			return false;
		} else if (arg0 >= 0 && this.aClass125_1.anIntArray321.length > arg0 && this.aClass125_1.anIntArray321[arg0] != 0) {
			return true;
		} else if (Static242.aBoolean413) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)I")
	public int method2116(@OriginalArg(1) int arg0) {
		return this.method2115(arg0) ? this.aClass125_1.anIntArray321[arg0] : 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method2117(@OriginalArg(0) String arg0) {
		if (this.method2145()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass125_1.aClass164_1.method4120(Static202.method3408(local12));
			return this.method2128(local21);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I")
	public int method2118() {
		return this.method2145() ? this.aClass125_1.anIntArray321.length : -1;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
	public int[] method2119(@OriginalArg(0) int arg0) {
		if (!this.method2115(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass125_1.anIntArrayArray34[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass125_1.anIntArray316[arg0]];
			@Pc(38) int local38 = 0;
			while (local26.length > local38) {
				local26[local38] = local38++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method2121(@OriginalArg(1) String arg0) {
		if (this.method2145()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass125_1.aClass164_1.method4120(Static202.method3408(local19));
			return this.method2115(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)[B")
	public byte[] method2122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2129(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(36) boolean local36 = this.method2134(null, arg0);
			if (!local36) {
				this.method2144(arg0);
				local36 = this.method2134(null, arg0);
				if (!local36) {
					return null;
				}
			}
		}
		return Static207.method3483(this.anObjectArrayArray1[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(II)V")
	private void method2123(@OriginalArg(0) int arg0) {
		this.aClass63_1.method3794(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public void method2125() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray1.length; local11++) {
				this.anObjectArrayArray1[local11] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[I)[B")
	public byte[] method2126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method2129(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(38) boolean local38 = this.method2134(arg2, arg0);
			if (!local38) {
				this.method2144(arg0);
				local38 = this.method2134(arg2, arg0);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static207.method3483(this.anObjectArrayArray1[arg0][arg1], false);
		if (this.aBoolean192) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass125_1.anIntArray321[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local65;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IBI)[B")
	public byte[] method2127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method2126(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)Z")
	public boolean method2128(@OriginalArg(0) int arg0) {
		if (!this.method2115(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method2144(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
	private boolean method2129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2145()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass125_1.anIntArray321.length && arg1 < this.aClass125_1.anIntArray321[arg0]) {
			return true;
		} else if (Static242.aBoolean413) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method2130(@OriginalArg(1) String arg0) {
		if (this.method2145()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass125_1.aClass164_1.method4120(Static202.method3408(local19));
			this.method2123(local28);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BZZ)V")
	public void method2131(@OriginalArg(1) boolean arg0) {
		if (!this.method2145()) {
			return;
		}
		if (arg0) {
			this.aClass125_1.aClass164_1 = null;
			this.aClass125_1.anIntArray320 = null;
		}
		this.aClass125_1.aClass164Array1 = null;
		this.aClass125_1.anIntArrayArray35 = null;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V")
	public void method2132(@OriginalArg(1) int arg0) {
		if (this.method2115(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method2133(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2145()) {
			return false;
		}
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(26) String local26 = arg0.toLowerCase();
		@Pc(35) int local35 = this.aClass125_1.aClass164_1.method4120(Static202.method3408(local23));
		if (this.method2115(local35)) {
			@Pc(53) int local53 = this.aClass125_1.aClass164Array1[local35].method4120(Static202.method3408(local26));
			return this.method2147(local53, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([III)Z")
	private boolean method2134(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method2115(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(35) int[] local35 = this.aClass125_1.anIntArrayArray34[arg1];
			@Pc(41) int local41 = this.aClass125_1.anIntArray316[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass125_1.anIntArray321[arg1]];
			}
			@Pc(63) Object[] local63 = this.anObjectArrayArray1[arg1];
			@Pc(65) boolean local65 = true;
			for (@Pc(67) int local67 = 0; local67 < local41; local67++) {
				@Pc(74) int local74;
				if (local35 == null) {
					local74 = local67;
				} else {
					local74 = local35[local67];
				}
				if (local63[local74] == null) {
					local65 = false;
					break;
				}
			}
			if (local65) {
				return true;
			}
			@Pc(133) byte[] local133;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local133 = Static207.method3483(this.anObjectArray2[arg1], false);
			} else {
				local133 = Static207.method3483(this.anObjectArray2[arg1], true);
				@Pc(138) Class2_Sub26 local138 = new Class2_Sub26(local133);
				local138.method4222(arg0, local138.aByteArray72.length);
			}
			@Pc(159) byte[] local159;
			try {
				local159 = Static150.method2609(local133);
			} catch (@Pc(161) RuntimeException local161) {
				throw Static8.method243(local161, "T3 - " + (arg0 != null) + "," + arg1 + "," + local133.length + "," + Static56.method1093(local133, local133.length) + "," + Static56.method1093(local133, local133.length - 2) + "," + this.aClass125_1.anIntArray322[arg1] + "," + this.aClass125_1.anInt3943);
			}
			if (this.aBoolean193) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(236) int local236;
			if (local41 <= 1) {
				if (local35 == null) {
					local236 = 0;
				} else {
					local236 = local35[0];
				}
				if (this.aBoolean192) {
					local63[local236] = local159;
				} else {
					local63[local236] = Static82.method4609(local159);
				}
			} else {
				@Pc(261) int[] local261 = new int[local41];
				local236 = local159.length;
				local236--;
				@Pc(271) int local271 = local159[local236] & 0xFF;
				@Pc(276) Class2_Sub26 local276 = new Class2_Sub26(local159);
				local236 -= local271 * 4 * local41;
				local276.anInt5328 = local236;
				@Pc(298) int local298;
				@Pc(300) int local300;
				for (@Pc(289) int local289 = 0; local289 < local271; local289++) {
					local298 = 0;
					for (local300 = 0; local300 < local41; local300++) {
						local298 += local276.method4228();
						if (local35 != null) {
						}
						local261[local300] += local298;
					}
				}
				@Pc(331) byte[][] local331 = new byte[local41][];
				for (local298 = 0; local298 < local41; local298++) {
					local331[local298] = new byte[local261[local298]];
					local261[local298] = 0;
				}
				local276.anInt5328 = local236;
				local298 = 0;
				@Pc(366) int local366;
				for (local300 = 0; local300 < local271; local300++) {
					local366 = 0;
					for (@Pc(368) int local368 = 0; local368 < local41; local368++) {
						local366 += local276.method4228();
						Static301.method302(local159, local298, local331[local368], local261[local368], local366);
						local298 += local366;
						local261[local368] += local366;
					}
				}
				for (local300 = 0; local300 < local41; local300++) {
					if (local35 == null) {
						local366 = local300;
					} else {
						local366 = local35[local300];
					}
					if (this.aBoolean192) {
						local63[local366] = local331[local300];
					} else {
						local63[local366] = Static82.method4609(local331[local300]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method2135(@OriginalArg(0) String arg0) {
		if (this.method2145()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass125_1.aClass164_1.method4120(Static202.method3408(local18));
			return this.method2141(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Z")
	public boolean method2137() {
		if (!this.method2145()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass125_1.anIntArray317.length; local21++) {
			@Pc(37) int local37 = this.aClass125_1.anIntArray317[local21];
			if (this.anObjectArray2[local37] == null) {
				this.method2144(local37);
				if (this.anObjectArray2[local37] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)Z")
	public boolean method2138(@OriginalArg(0) int arg0) {
		if (!this.method2145()) {
			return false;
		} else if (this.aClass125_1.anIntArray321.length == 1) {
			return this.method2147(arg0, 0);
		} else if (!this.method2115(arg0)) {
			return false;
		} else if (this.aClass125_1.anIntArray321[arg0] == 1) {
			return this.method2147(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I")
	public int method2140() {
		if (!this.method2145()) {
			throw new IllegalStateException("");
		}
		return this.aClass125_1.anInt3943;
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(II)I")
	private int method2141(@OriginalArg(0) int arg0) {
		if (this.method2115(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass63_1.method3796(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method2142(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2145()) {
			return null;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.aClass125_1.aClass164_1.method4120(Static202.method3408(local13));
		if (this.method2115(local25)) {
			@Pc(56) int local56 = this.aClass125_1.aClass164Array1[local25].method4120(Static202.method3408(local16));
			return this.method2127(local56, local25);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2143(@OriginalArg(0) String arg0) {
		if (this.method2145()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass125_1.aClass164_1.method4120(Static202.method3408(local21));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(II)V")
	private void method2144(@OriginalArg(0) int arg0) {
		if (this.aBoolean193) {
			this.anObjectArray2[arg0] = this.aClass63_1.method3797(arg0);
		} else {
			this.anObjectArray2[arg0] = Static82.method4609(this.aClass63_1.method3797(arg0));
		}
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)Z")
	private boolean method2145() {
		if (this.aClass125_1 == null) {
			this.aClass125_1 = this.aClass63_1.method3792();
			if (this.aClass125_1 == null) {
				return false;
			}
			this.anObjectArray2 = new Object[this.aClass125_1.anInt3945];
			this.anObjectArrayArray1 = new Object[this.aClass125_1.anInt3945][];
		}
		return true;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)[B")
	public byte[] method2146(@OriginalArg(1) int arg0) {
		if (!this.method2145()) {
			return null;
		} else if (this.aClass125_1.anIntArray321.length == 1) {
			return this.method2127(arg0, 0);
		} else if (!this.method2115(arg0)) {
			return null;
		} else if (this.aClass125_1.anIntArray321[arg0] == 1) {
			return this.method2127(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(III)Z")
	public boolean method2147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2129(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method2144(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)I")
	public int method2148() {
		if (!this.method2145()) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray2.length; local25++) {
			if (this.aClass125_1.anIntArray316[local25] > 0) {
				local23 += 100;
				local21 += this.method2141(local25);
			}
		}
		if (local23 == 0) {
			return 100;
		} else {
			return local21 * 100 / local23;
		}
	}
}
