import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class98 {

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray31;

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!bd;")
	private Class13 aClass13_1 = null;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "Lclient!se;")
	private Class153 aClass153_1;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!se;ZZ)V")
	public Class98(@OriginalArg(0) Class153 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean199 = arg2;
		this.aClass153_1 = arg0;
		this.aBoolean200 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
	private boolean method2372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2379()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass13_1.anIntArray36.length > arg0 && this.aClass13_1.anIntArray36[arg0] > arg1) {
			return true;
		} else if (Static286.aBoolean352) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2373(@OriginalArg(0) String arg0) {
		if (this.method2379()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass13_1.aClass40_1.method948(Static241.method3694(local21));
			return this.method2395(local30);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI[I)Z")
	private boolean method2374(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method2402(arg0)) {
			return false;
		} else if (this.anObjectArray31[arg0] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass13_1.anIntArray35[arg0];
			@Pc(37) boolean local37 = true;
			@Pc(43) int[] local43 = this.aClass13_1.anIntArrayArray5[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass13_1.anIntArray36[arg0]];
			}
			@Pc(65) Object[] local65 = this.anObjectArrayArray1[arg0];
			for (@Pc(67) int local67 = 0; local67 < local27; local67++) {
				@Pc(76) int local76;
				if (local43 == null) {
					local76 = local67;
				} else {
					local76 = local43[local67];
				}
				if (local65[local76] == null) {
					local37 = false;
					break;
				}
			}
			if (local37) {
				return true;
			}
			@Pc(132) byte[] local132;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local132 = Static104.method1701(false, this.anObjectArray31[arg0]);
			} else {
				local132 = Static104.method1701(true, this.anObjectArray31[arg0]);
				@Pc(137) Class4_Sub17 local137 = new Class4_Sub17(local132);
				local137.method1879(arg1, local137.aByteArray30.length);
			}
			@Pc(158) byte[] local158;
			try {
				local158 = Static116.method2003(local132);
			} catch (@Pc(160) RuntimeException local160) {
				throw Static42.method693(local160, "T3 - " + (arg1 != null) + "," + arg0 + "," + local132.length + "," + Static269.method4012(local132, local132.length) + "," + Static269.method4012(local132, local132.length - 2) + "," + this.aClass13_1.anIntArray34[arg0] + "," + this.aClass13_1.anInt317);
			}
			if (this.aBoolean200) {
				this.anObjectArray31[arg0] = null;
			}
			@Pc(235) int local235;
			if (local27 <= 1) {
				if (local43 == null) {
					local235 = 0;
				} else {
					local235 = local43[0];
				}
				if (this.aBoolean199) {
					local65[local235] = local158;
				} else {
					local65[local235] = Static223.method3566(local158);
				}
			} else {
				local235 = local158.length;
				local235--;
				@Pc(267) int local267 = local158[local235] & 0xFF;
				local235 -= local267 * local27 * 4;
				@Pc(280) Class4_Sub17 local280 = new Class4_Sub17(local158);
				local280.anInt2400 = local235;
				@Pc(286) int[] local286 = new int[local27];
				@Pc(293) int local293;
				@Pc(295) int local295;
				for (@Pc(288) int local288 = 0; local288 < local267; local288++) {
					local293 = 0;
					for (local295 = 0; local295 < local27; local295++) {
						local293 += local280.method1889();
						if (local43 != null) {
						}
						local286[local295] += local293;
					}
				}
				@Pc(326) byte[][] local326 = new byte[local27][];
				for (local293 = 0; local293 < local27; local293++) {
					local326[local293] = new byte[local286[local293]];
					local286[local293] = 0;
				}
				local293 = 0;
				local280.anInt2400 = local235;
				@Pc(357) int local357;
				for (local295 = 0; local295 < local267; local295++) {
					local357 = 0;
					for (@Pc(359) int local359 = 0; local359 < local27; local359++) {
						local357 += local280.method1889();
						Static307.method3244(local158, local293, local326[local359], local286[local359], local357);
						local286[local359] += local357;
						local293 += local357;
					}
				}
				for (local295 = 0; local295 < local27; local295++) {
					if (local43 == null) {
						local357 = local295;
					} else {
						local357 = local43[local295];
					}
					if (this.aBoolean199) {
						local65[local357] = local326[local295];
					} else {
						local65[local357] = Static223.method3566(local326[local295]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method2376(@OriginalArg(1) String arg0) {
		if (this.method2379()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass13_1.aClass40_1.method948(Static241.method3694(local13));
			return this.method2402(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method2377(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2379()) {
			return null;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(25) int local25 = this.aClass13_1.aClass40_1.method948(Static241.method3694(local13));
		if (this.method2402(local25)) {
			@Pc(51) int local51 = this.aClass13_1.aClass40Array1[local25].method948(Static241.method3694(local16));
			return this.method2396(local51, local25);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V")
	public void method2378(@OriginalArg(0) int arg0) {
		if (this.method2402(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	private boolean method2379() {
		if (this.aClass13_1 == null) {
			this.aClass13_1 = this.aClass153_1.method3910();
			if (this.aClass13_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass13_1.anInt310][];
			this.anObjectArray31 = new Object[this.aClass13_1.anInt310];
		}
		return true;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
	public int method2380() {
		return this.method2379() ? this.aClass13_1.anIntArray36.length : -1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B[III)[B")
	public byte[] method2381(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method2372(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(40) boolean local40 = this.method2374(arg2, arg0);
			if (!local40) {
				this.method2400(arg2);
				local40 = this.method2374(arg2, arg0);
				if (!local40) {
					return null;
				}
			}
		}
		@Pc(68) byte[] local68 = Static104.method1701(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.aBoolean199) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass13_1.anIntArray36[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		}
		return local68;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z")
	public boolean method2382(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2372(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray31[arg1] == null) {
			this.method2400(arg1);
			return this.anObjectArray31[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public void method2383() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray1.length; local16++) {
				this.anObjectArrayArray1[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)[I")
	public int[] method2384(@OriginalArg(0) int arg0) {
		if (!this.method2402(arg0)) {
			return null;
		}
		@Pc(30) int[] local30 = this.aClass13_1.anIntArrayArray5[arg0];
		if (local30 == null) {
			local30 = new int[this.aClass13_1.anIntArray35[arg0]];
			@Pc(43) int local43 = 0;
			while (local43 < local30.length) {
				local30[local43] = local43++;
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Z")
	public boolean method2385() {
		if (!this.method2379()) {
			return false;
		}
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < this.aClass13_1.anIntArray31.length; local18++) {
			@Pc(43) int local43 = this.aClass13_1.anIntArray31[local18];
			if (this.anObjectArray31[local43] == null) {
				this.method2400(local43);
				if (this.anObjectArray31[local43] == null) {
					local16 = false;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Z")
	public boolean method2386(@OriginalArg(1) int arg0) {
		if (!this.method2402(arg0)) {
			return false;
		} else if (this.anObjectArray31[arg0] == null) {
			this.method2400(arg0);
			return this.anObjectArray31[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method2388(@OriginalArg(1) String arg0) {
		if (this.method2379()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass13_1.aClass40_1.method948(Static241.method3694(local13));
			return local31 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method2389(@OriginalArg(0) String arg0) {
		if (this.method2379()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass13_1.aClass40_1.method948(Static241.method3694(local12));
			this.method2398(local24);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZI)V")
	public void method2390(@OriginalArg(0) boolean arg0) {
		if (!this.method2379()) {
			return;
		}
		this.aClass13_1.aClass40Array1 = null;
		this.aClass13_1.anIntArrayArray4 = null;
		if (arg0) {
			this.aClass13_1.aClass40_1 = null;
			this.aClass13_1.anIntArray37 = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(IB)Z")
	public boolean method2391(@OriginalArg(0) int arg0) {
		if (!this.method2379()) {
			return false;
		} else if (this.aClass13_1.anIntArray36.length == 1) {
			return this.method2382(arg0, 0);
		} else if (!this.method2402(arg0)) {
			return false;
		} else if (this.aClass13_1.anIntArray36[arg0] == 1) {
			return this.method2382(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[B")
	public byte[] method2392(@OriginalArg(1) int arg0) {
		if (!this.method2379()) {
			return null;
		} else if (this.aClass13_1.anIntArray36.length == 1) {
			return this.method2396(arg0, 0);
		} else if (!this.method2402(arg0)) {
			return null;
		} else if (this.aClass13_1.anIntArray36[arg0] == 1) {
			return this.method2396(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
	public int method2394(@OriginalArg(1) int arg0) {
		return this.method2402(arg0) ? this.aClass13_1.anIntArray36[arg0] : 0;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(IB)I")
	private int method2395(@OriginalArg(0) int arg0) {
		if (this.method2402(arg0)) {
			return this.anObjectArray31[arg0] == null ? this.aClass153_1.method3904(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(III)[B")
	public byte[] method2396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method2381(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(III)[B")
	public byte[] method2397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2372(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method2374(arg0, null);
			if (!local30) {
				this.method2400(arg0);
				local30 = this.method2374(arg0, null);
				if (!local30) {
					return null;
				}
			}
		}
		return Static104.method1701(false, this.anObjectArrayArray1[arg0][arg1]);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(ZI)V")
	private void method2398(@OriginalArg(1) int arg0) {
		this.aClass153_1.method3907(arg0);
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)I")
	public int method2399() {
		if (!this.method2379()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anObjectArray31.length; local18++) {
			if (this.aClass13_1.anIntArray35[local18] > 0) {
				local16 += this.method2395(local18);
				local14 += 100;
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)V")
	private void method2400(@OriginalArg(1) int arg0) {
		if (this.aBoolean200) {
			this.anObjectArray31[arg0] = this.aClass153_1.method3905(arg0);
		} else {
			this.anObjectArray31[arg0] = Static223.method3566(this.aClass153_1.method3905(arg0));
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method2401(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2379()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass13_1.aClass40_1.method948(Static241.method3694(local12));
		if (this.method2402(local24)) {
			@Pc(50) int local50 = this.aClass13_1.aClass40Array1[local24].method948(Static241.method3694(local15));
			return this.method2382(local50, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)Z")
	private boolean method2402(@OriginalArg(1) int arg0) {
		if (!this.method2379()) {
			return false;
		} else if (arg0 >= 0 && this.aClass13_1.anIntArray36.length > arg0 && this.aClass13_1.anIntArray36[arg0] != 0) {
			return true;
		} else if (Static286.aBoolean352) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)I")
	public int method2403() {
		if (!this.method2379()) {
			throw new IllegalStateException("");
		}
		return this.aClass13_1.anInt317;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method2404(@OriginalArg(0) String arg0) {
		if (this.method2379()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass13_1.aClass40_1.method948(Static241.method3694(local13));
			return this.method2386(local22);
		} else {
			return false;
		}
	}
}
