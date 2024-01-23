import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class155 {

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!rn", name = "J", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "Lclient!fd;")
	private Class52 aClass52_2 = null;

	@OriginalMember(owner = "client!rn", name = "F", descriptor = "Z")
	private boolean aBoolean347;

	@OriginalMember(owner = "client!rn", name = "D", descriptor = "Lclient!ac;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
	private boolean aBoolean345;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!ac;ZZ)V")
	public Class155(@OriginalArg(0) Class4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean347 = arg2;
		this.aClass4_1 = arg0;
		this.aBoolean345 = arg1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)[I")
	public int[] method4117(@OriginalArg(1) int arg0) {
		if (!this.method4132(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.aClass52_2.anIntArrayArray18[arg0];
		if (local22 == null) {
			local22 = new int[this.aClass52_2.anIntArray145[arg0]];
			@Pc(34) int local34 = 0;
			while (local22.length > local34) {
				local22[local34] = local34++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V")
	private void method4118(@OriginalArg(0) int arg0) {
		if (this.aBoolean345) {
			this.anObjectArray32[arg0] = this.aClass4_1.method3424(arg0);
		} else {
			this.anObjectArray32[arg0] = Static29.method439(this.aClass4_1.method3424(arg0));
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I")
	public int method4119() {
		return this.method4123() ? this.aClass52_2.anIntArray146.length : -1;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method4120(@OriginalArg(1) String arg0) {
		if (this.method4123()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass52_2.aClass147_1.method3785(Static263.method4394(local12));
			return this.method4132(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)[B")
	public byte[] method4121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4126(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)I")
	public int method4122(@OriginalArg(1) int arg0) {
		if (this.method4123()) {
			@Pc(17) int local17 = this.aClass52_2.aClass147_1.method3785(arg0);
			return this.method4132(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z")
	private boolean method4123() {
		if (this.aClass52_2 == null) {
			this.aClass52_2 = this.aClass4_1.method3425();
			if (this.aClass52_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass52_2.anInt1455][];
			this.anObjectArray32 = new Object[this.aClass52_2.anInt1455];
		}
		return true;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I")
	public int method4124() {
		if (!this.method4123()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray32.length; local22++) {
			if (this.aClass52_2.anIntArray145[local22] > 0) {
				local13 += 100;
				local20 += this.method4130(local22);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local20 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II[I)Z")
	private boolean method4125(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method4132(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			return false;
		} else {
			@Pc(28) int local28 = this.aClass52_2.anIntArray145[arg0];
			@Pc(34) int[] local34 = this.aClass52_2.anIntArrayArray18[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass52_2.anIntArray146[arg0]];
			}
			@Pc(52) boolean local52 = true;
			@Pc(57) Object[] local57 = this.anObjectArrayArray1[arg0];
			for (@Pc(59) int local59 = 0; local59 < local28; local59++) {
				@Pc(69) int local69;
				if (local34 == null) {
					local69 = local59;
				} else {
					local69 = local34[local59];
				}
				if (local57[local69] == null) {
					local52 = false;
					break;
				}
			}
			if (local52) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local124 = Static96.method1441(false, this.anObjectArray32[arg0]);
			} else {
				local124 = Static96.method1441(true, this.anObjectArray32[arg0]);
				@Pc(129) Class3_Sub26 local129 = new Class3_Sub26(local124);
				local129.method3901(local129.aByteArray64.length, arg1);
			}
			@Pc(159) byte[] local159;
			try {
				local159 = Static149.method2524(local124);
			} catch (@Pc(161) RuntimeException local161) {
				throw Static249.method4211(local161, "T3 - " + (arg1 != null) + "," + arg0 + "," + local124.length + "," + Static147.method2495(local124, local124.length) + "," + Static147.method2495(local124, local124.length - 2) + "," + this.aClass52_2.anIntArray144[arg0] + "," + this.aClass52_2.anInt1450);
			}
			if (this.aBoolean345) {
				this.anObjectArray32[arg0] = null;
			}
			@Pc(233) int local233;
			if (local28 > 1) {
				local233 = local159.length;
				@Pc(236) int local236 = local233 - 1;
				@Pc(240) int local240 = local159[local236] & 0xFF;
				@Pc(248) int local248 = local236 - local240 * 4 * local28;
				@Pc(253) Class3_Sub26 local253 = new Class3_Sub26(local159);
				local253.anInt4615 = local248;
				@Pc(259) int[] local259 = new int[local28];
				@Pc(266) int local266;
				@Pc(268) int local268;
				for (@Pc(261) int local261 = 0; local261 < local240; local261++) {
					local266 = 0;
					for (local268 = 0; local268 < local28; local268++) {
						if (local34 == null) {
						}
						local266 += local253.method3896();
						local259[local268] += local266;
					}
				}
				@Pc(300) byte[][] local300 = new byte[local28][];
				for (local266 = 0; local266 < local28; local266++) {
					local300[local266] = new byte[local259[local266]];
					local259[local266] = 0;
				}
				local253.anInt4615 = local248;
				local266 = 0;
				@Pc(331) int local331;
				for (local268 = 0; local268 < local240; local268++) {
					local331 = 0;
					for (@Pc(333) int local333 = 0; local333 < local28; local333++) {
						local331 += local253.method3896();
						Static326.method4270(local159, local266, local300[local333], local259[local333], local331);
						local259[local333] += local331;
						local266 += local331;
					}
				}
				for (local268 = 0; local268 < local28; local268++) {
					if (local34 == null) {
						local331 = local268;
					} else {
						local331 = local34[local268];
					}
					if (this.aBoolean347) {
						local57[local331] = local300[local268];
					} else {
						local57[local331] = Static29.method439(local300[local268]);
					}
				}
			} else {
				if (local34 == null) {
					local233 = 0;
				} else {
					local233 = local34[0];
				}
				if (this.aBoolean347) {
					local57[local233] = local159;
				} else {
					local57[local233] = Static29.method439(local159);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III[I)[B")
	public byte[] method4126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4152(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method4125(arg1, arg2);
			if (!local30) {
				this.method4118(arg1);
				local30 = this.method4125(arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(58) byte[] local58 = Static96.method1441(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.aBoolean347) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass52_2.anIntArray146[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method4127(@OriginalArg(0) String arg0) {
		if (this.method4123()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass52_2.aClass147_1.method3785(Static263.method4394(local12));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)I")
	private int method4130(@OriginalArg(0) int arg0) {
		if (this.method4132(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass4_1.method3422(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(BI)I")
	public int method4131(@OriginalArg(1) int arg0) {
		return this.method4132(arg0) ? this.aClass52_2.anIntArray146[arg0] : 0;
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(BI)Z")
	private boolean method4132(@OriginalArg(1) int arg0) {
		if (!this.method4123()) {
			return false;
		} else if (arg0 >= 0 && this.aClass52_2.anIntArray146.length > arg0 && this.aClass52_2.anIntArray146[arg0] != 0) {
			return true;
		} else if (Static255.aBoolean362) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(II)Z")
	public boolean method4133(@OriginalArg(1) int arg0) {
		if (!this.method4123()) {
			return false;
		} else if (this.aClass52_2.anIntArray146.length == 1) {
			return this.method4144(arg0, 0);
		} else if (!this.method4132(arg0)) {
			return false;
		} else if (this.aClass52_2.anIntArray146[arg0] == 1) {
			return this.method4144(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)Z")
	public boolean method4134() {
		if (!this.method4123()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass52_2.anIntArray143.length; local22++) {
			@Pc(34) int local34 = this.aClass52_2.anIntArray143[local22];
			if (this.anObjectArray32[local34] == null) {
				this.method4118(local34);
				if (this.anObjectArray32[local34] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method4136(@OriginalArg(0) String arg0) {
		if (this.method4123()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass52_2.aClass147_1.method3785(Static263.method4394(local11));
			this.method4147(local20);
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(IB)[B")
	public byte[] method4137(@OriginalArg(0) int arg0) {
		if (!this.method4123()) {
			return null;
		} else if (this.aClass52_2.anIntArray146.length == 1) {
			return this.method4121(0, arg0);
		} else if (!this.method4132(arg0)) {
			return null;
		} else if (this.aClass52_2.anIntArray146[arg0] == 1) {
			return this.method4121(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBI)[B")
	public byte[] method4138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4152(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(41) boolean local41 = this.method4125(arg0, null);
			if (!local41) {
				this.method4118(arg0);
				local41 = this.method4125(arg0, null);
				if (!local41) {
					return null;
				}
			}
		}
		return Static96.method1441(false, this.anObjectArrayArray1[arg0][arg1]);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)I")
	public int method4139() {
		if (!this.method4123()) {
			throw new IllegalStateException("");
		}
		return this.aClass52_2.anInt1450;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method4140(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4123()) {
			return false;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass52_2.aClass147_1.method3785(Static263.method4394(local13));
		if (this.method4132(local30)) {
			@Pc(50) int local50 = this.aClass52_2.aClass147Array1[local30].method3785(Static263.method4394(local21));
			return this.method4144(local50, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method4143(@OriginalArg(1) String arg0) {
		if (this.method4123()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass52_2.aClass147_1.method3785(Static263.method4394(local12));
			return this.method4130(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZI)Z")
	public boolean method4144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4152(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray32[arg1] == null) {
			this.method4118(arg1);
			return this.anObjectArray32[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4145(@OriginalArg(0) String arg0) {
		if (this.method4123()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass52_2.aClass147_1.method3785(Static263.method4394(local13));
			return this.method4146(local22);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(II)Z")
	public boolean method4146(@OriginalArg(0) int arg0) {
		if (!this.method4132(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method4118(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(II)V")
	private void method4147(@OriginalArg(0) int arg0) {
		this.aClass4_1.method3420(arg0);
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(Z)V")
	public void method4148() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray1.length; local12++) {
				this.anObjectArrayArray1[local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B")
	public byte[] method4149(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4123()) {
			return null;
		}
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(28) int local28 = this.aClass52_2.aClass147_1.method3785(Static263.method4394(local16));
		if (this.method4132(local28)) {
			@Pc(47) int local47 = this.aClass52_2.aClass147Array1[local28].method3785(Static263.method4394(local19));
			return this.method4121(local28, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V")
	public void method4150(@OriginalArg(0) int arg0) {
		if (this.method4132(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZZ)V")
	public void method4151(@OriginalArg(1) boolean arg0) {
		if (!this.method4123()) {
			return;
		}
		this.aClass52_2.anIntArrayArray17 = null;
		this.aClass52_2.aClass147Array1 = null;
		if (arg0) {
			this.aClass52_2.aClass147_1 = null;
			this.aClass52_2.anIntArray147 = null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(III)Z")
	private boolean method4152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4123()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass52_2.anIntArray146.length > arg1 && arg0 < this.aClass52_2.anIntArray146[arg1]) {
			return true;
		} else if (Static255.aBoolean362) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}
}
