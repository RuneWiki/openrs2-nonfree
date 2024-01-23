import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class42 {

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "Lclient!oh;")
	private Class126 aClass126_1 = null;

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "Z")
	private boolean aBoolean106;

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "Z")
	private boolean aBoolean105;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "Lclient!d;")
	private Class31 aClass31_1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!d;ZZ)V")
	public Class42(@OriginalArg(0) Class31 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean106 = arg1;
		this.aBoolean105 = arg2;
		this.aClass31_1 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z")
	public boolean method1251(@OriginalArg(0) int arg0) {
		if (!this.method1281(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method1255(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method1252(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1267()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass126_1.aClass79_1.method1993(Static81.method1477(local12));
		if (this.method1281(local24)) {
			@Pc(51) int local51 = this.aClass126_1.aClass79Array1[local24].method1993(Static81.method1477(local15));
			return this.method1256(local24, local51);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Z")
	public boolean method1253(@OriginalArg(0) int arg0) {
		if (!this.method1267()) {
			return false;
		} else if (this.aClass126_1.anIntArray421.length == 1) {
			return this.method1273(0, arg0);
		} else if (!this.method1281(arg0)) {
			return false;
		} else if (this.aClass126_1.anIntArray421[arg0] == 1) {
			return this.method1273(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method1254(@OriginalArg(1) String arg0) {
		if (this.method1267()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass126_1.aClass79_1.method1993(Static81.method1477(local18));
			return this.method1281(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)V")
	private void method1255(@OriginalArg(0) int arg0) {
		if (this.aBoolean106) {
			this.anObjectArray2[arg0] = this.aClass31_1.method1411(arg0);
		} else {
			this.anObjectArray2[arg0] = Static189.method3285(this.aClass31_1.method1411(arg0));
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIB)[B")
	public byte[] method1256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1282(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZII)Z")
	private boolean method1257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1267()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass126_1.anIntArray421.length && arg0 < this.aClass126_1.anIntArray421[arg1]) {
			return true;
		} else if (Static118.aBoolean194) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
	public int method1258() {
		if (!this.method1267()) {
			throw new IllegalStateException("");
		}
		return this.aClass126_1.anInt4265;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(II)[B")
	public byte[] method1259(@OriginalArg(1) int arg0) {
		if (!this.method1267()) {
			return null;
		} else if (this.aClass126_1.anIntArray421.length == 1) {
			return this.method1256(0, arg0);
		} else if (!this.method1281(arg0)) {
			return null;
		} else if (this.aClass126_1.anIntArray421[arg0] == 1) {
			return this.method1256(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
	public int method1260() {
		if (!this.method1267()) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anObjectArray2.length; local19++) {
			if (this.aClass126_1.anIntArray419[local19] > 0) {
				local15 += this.method1280(local19);
				local17 += 100;
			}
		}
		if (local17 == 0) {
			return 100;
		} else {
			return local15 * 100 / local17;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method1261(@OriginalArg(1) String arg0) {
		if (this.method1267()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass126_1.aClass79_1.method1993(Static81.method1477(local12));
			return local25 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)I")
	public int method1262(@OriginalArg(0) int arg0) {
		if (this.method1267()) {
			@Pc(16) int local16 = this.aClass126_1.aClass79_1.method1993(arg0);
			return this.method1281(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method1263(@OriginalArg(1) String arg0) {
		if (this.method1267()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass126_1.aClass79_1.method1993(Static81.method1477(local20));
			this.method1279(local29);
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method1264(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1267()) {
			return false;
		}
		@Pc(19) String local19 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass126_1.aClass79_1.method1993(Static81.method1477(local19));
		if (this.method1281(local33)) {
			@Pc(52) int local52 = this.aClass126_1.aClass79Array1[local33].method1993(Static81.method1477(local22));
			return this.method1273(local33, local52);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)[I")
	public int[] method1265(@OriginalArg(0) int arg0) {
		if (!this.method1281(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass126_1.anIntArrayArray30[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass126_1.anIntArray419[arg0]];
			@Pc(40) int local40 = 0;
			while (local27.length > local40) {
				local27[local40] = local40++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Z")
	public boolean method1266() {
		if (!this.method1267()) {
			return false;
		}
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < this.aClass126_1.anIntArray422.length; local18++) {
			@Pc(30) int local30 = this.aClass126_1.anIntArray422[local18];
			if (this.anObjectArray2[local30] == null) {
				this.method1255(local30);
				if (this.anObjectArray2[local30] == null) {
					local16 = false;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z")
	private boolean method1267() {
		if (this.aClass126_1 == null) {
			this.aClass126_1 = this.aClass31_1.method1406();
			if (this.aClass126_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass126_1.anInt4267][];
			this.anObjectArray2 = new Object[this.aClass126_1.anInt4267];
		}
		return true;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method1268(@OriginalArg(0) String arg0) {
		if (this.method1267()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass126_1.aClass79_1.method1993(Static81.method1477(local20));
			return this.method1280(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)I")
	public int method1269(@OriginalArg(1) int arg0) {
		return this.method1281(arg0) ? this.aClass126_1.anIntArray421[arg0] : 0;
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(II)V")
	public void method1270(@OriginalArg(0) int arg0) {
		if (this.method1281(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
	public void method1272() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray1.length; local16++) {
				this.anObjectArrayArray1[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z")
	public boolean method1273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1257(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method1255(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZZI)V")
	public void method1274(@OriginalArg(1) boolean arg0) {
		if (!this.method1267()) {
			return;
		}
		if (arg0) {
			this.aClass126_1.anIntArray418 = null;
			this.aClass126_1.aClass79_1 = null;
		}
		this.aClass126_1.anIntArrayArray29 = null;
		this.aClass126_1.aClass79Array1 = null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)I")
	public int method1275() {
		return this.method1267() ? this.aClass126_1.anIntArray421.length : -1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ[I)Z")
	private boolean method1276(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method1281(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass126_1.anIntArray419[arg0];
			@Pc(33) int[] local33 = this.aClass126_1.anIntArrayArray30[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass126_1.anIntArray421[arg0]];
			}
			@Pc(50) boolean local50 = true;
			@Pc(55) Object[] local55 = this.anObjectArrayArray1[arg0];
			for (@Pc(57) int local57 = 0; local57 < local27; local57++) {
				@Pc(69) int local69;
				if (local33 == null) {
					local69 = local57;
				} else {
					local69 = local33[local57];
				}
				if (local55[local69] == null) {
					local50 = false;
					break;
				}
			}
			if (local50) {
				return true;
			}
			@Pc(129) byte[] local129;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local129 = Static279.method4349(this.anObjectArray2[arg0], false);
			} else {
				local129 = Static279.method4349(this.anObjectArray2[arg0], true);
				@Pc(134) Class2_Sub16 local134 = new Class2_Sub16(local129);
				local134.method2171(arg1, local134.aByteArray17.length);
			}
			@Pc(155) byte[] local155;
			try {
				local155 = Static264.method4161(local129);
			} catch (@Pc(157) RuntimeException local157) {
				throw Static22.method440(local157, "T3 - " + (arg1 != null) + "," + arg0 + "," + local129.length + "," + Static257.method4044(local129, local129.length) + "," + Static257.method4044(local129, local129.length - 2) + "," + this.aClass126_1.anIntArray420[arg0] + "," + this.aClass126_1.anInt4265);
			}
			if (this.aBoolean106) {
				this.anObjectArray2[arg0] = null;
			}
			@Pc(228) int local228;
			if (local27 > 1) {
				local228 = local155.length;
				@Pc(230) int local230 = local228 - 1;
				@Pc(235) int local235 = local155[local230] & 0xFF;
				@Pc(240) Class2_Sub16 local240 = new Class2_Sub16(local155);
				@Pc(243) int[] local243 = new int[local27];
				@Pc(251) int local251 = local230 - local235 * local27 * 4;
				local240.anInt2789 = local251;
				@Pc(261) int local261;
				@Pc(263) int local263;
				for (@Pc(256) int local256 = 0; local256 < local235; local256++) {
					local261 = 0;
					for (local263 = 0; local263 < local27; local263++) {
						local261 += local240.method2145();
						if (local33 != null) {
						}
						local243[local263] += local261;
					}
				}
				@Pc(291) byte[][] local291 = new byte[local27][];
				for (local261 = 0; local261 < local27; local261++) {
					local291[local261] = new byte[local243[local261]];
					local243[local261] = 0;
				}
				local240.anInt2789 = local251;
				local261 = 0;
				@Pc(326) int local326;
				for (local263 = 0; local263 < local235; local263++) {
					local326 = 0;
					for (@Pc(328) int local328 = 0; local328 < local27; local328++) {
						local326 += local240.method2145();
						Static323.method3554(local155, local261, local291[local328], local243[local328], local326);
						local243[local328] += local326;
						local261 += local326;
					}
				}
				for (local263 = 0; local263 < local27; local263++) {
					if (local33 == null) {
						local326 = local263;
					} else {
						local326 = local33[local263];
					}
					if (this.aBoolean105) {
						local55[local326] = local291[local263];
					} else {
						local55[local326] = Static189.method3285(local291[local263]);
					}
				}
			} else {
				if (local33 == null) {
					local228 = 0;
				} else {
					local228 = local33[0];
				}
				if (this.aBoolean105) {
					local55[local228] = local155;
				} else {
					local55[local228] = Static189.method3285(local155);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1277(@OriginalArg(0) String arg0) {
		if (this.method1267()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass126_1.aClass79_1.method1993(Static81.method1477(local18));
			return this.method1251(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IIB)[B")
	public byte[] method1278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1257(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(38) boolean local38 = this.method1276(arg1, null);
			if (!local38) {
				this.method1255(arg1);
				local38 = this.method1276(arg1, null);
				if (!local38) {
					return null;
				}
			}
		}
		return Static279.method4349(this.anObjectArrayArray1[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(IB)V")
	private void method1279(@OriginalArg(0) int arg0) {
		this.aClass31_1.method1405(arg0);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI)I")
	private int method1280(@OriginalArg(1) int arg0) {
		if (this.method1281(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass31_1.method1408(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(II)Z")
	private boolean method1281(@OriginalArg(0) int arg0) {
		if (!this.method1267()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass126_1.anIntArray421.length && this.aClass126_1.anIntArray421[arg0] != 0) {
			return true;
		} else if (Static118.aBoolean194) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[IB)[B")
	public byte[] method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1257(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method1276(arg1, arg2);
			if (!local30) {
				this.method1255(arg1);
				local30 = this.method1276(arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static279.method4349(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.aBoolean105) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass126_1.anIntArray421[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		}
		return local63;
	}
}
