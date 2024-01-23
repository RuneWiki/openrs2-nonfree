import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class168 {

	@OriginalMember(owner = "client!th", name = "D", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!th", name = "R", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "Lclient!ha;")
	private Class67 aClass67_2 = null;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "Z")
	private boolean aBoolean334;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Lclient!ba;")
	private Class13 aClass13_1;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "Z")
	private boolean aBoolean333;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!ba;ZZ)V")
	public Class168(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean334 = arg2;
		this.aClass13_1 = arg0;
		this.aBoolean333 = arg1;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)Z")
	public boolean method4038(@OriginalArg(0) int arg0) {
		if (!this.method4076()) {
			return false;
		} else if (this.aClass67_2.anIntArray211.length == 1) {
			return this.method4072(0, arg0);
		} else if (!this.method4049(arg0)) {
			return false;
		} else if (this.aClass67_2.anIntArray211[arg0] == 1) {
			return this.method4072(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(BI)I")
	private int method4040(@OriginalArg(1) int arg0) {
		if (this.method4049(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass13_1.method2959(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
	private void method4041(@OriginalArg(0) int arg0) {
		if (this.aBoolean333) {
			this.anObjectArray2[arg0] = this.aClass13_1.method2964(arg0);
		} else {
			this.anObjectArray2[arg0] = Static279.method4265(this.aClass13_1.method2964(arg0));
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
	public int method4042() {
		if (!this.method4076()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass67_2.anIntArray216[local17] > 0) {
				local13 += this.method4040(local17);
				local15 += 100;
			}
		}
		if (local15 == 0) {
			return 100;
		} else {
			return local13 * 100 / local15;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I")
	public int[] method4044(@OriginalArg(0) int arg0) {
		if (!this.method4049(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass67_2.anIntArrayArray25[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass67_2.anIntArray216[arg0]];
			@Pc(39) int local39 = 0;
			while (local27.length > local39) {
				local27[local39] = local39++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4045(@OriginalArg(0) String arg0) {
		if (this.method4076()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass67_2.aClass38_1.method955(Static149.method2417(local13));
			return local24 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(IB)V")
	public void method4047(@OriginalArg(0) int arg0) {
		if (this.method4049(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method4048(@OriginalArg(1) String arg0) {
		if (this.method4076()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass67_2.aClass38_1.method955(Static149.method2417(local11));
			this.method4070(local20);
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(IB)Z")
	private boolean method4049(@OriginalArg(0) int arg0) {
		if (!this.method4076()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass67_2.anIntArray211.length && this.aClass67_2.anIntArray211[arg0] != 0) {
			return true;
		} else if (Static58.aBoolean89) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)[B")
	public byte[] method4051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4055(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method4073(null, arg0);
			if (!local30) {
				this.method4041(arg0);
				local30 = this.method4073(null, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		return Static249.method3846(this.anObjectArrayArray1[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public void method4052() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray1.length; local7++) {
				this.anObjectArrayArray1[local7] = null;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method4053(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4076()) {
			return null;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass67_2.aClass38_1.method955(Static149.method2417(local13));
		if (this.method4049(local31)) {
			@Pc(49) int local49 = this.aClass67_2.aClass38Array1[local31].method955(Static149.method2417(local16));
			return this.method4058(local49, local31);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Z")
	public boolean method4054() {
		if (!this.method4076()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass67_2.anIntArray217.length; local15++) {
			@Pc(27) int local27 = this.aClass67_2.anIntArray217[local15];
			if (this.anObjectArray2[local27] == null) {
				this.method4041(local27);
				if (this.anObjectArray2[local27] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIB)Z")
	private boolean method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4076()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass67_2.anIntArray211.length > arg1 && arg0 < this.aClass67_2.anIntArray211[arg1]) {
			return true;
		} else if (Static58.aBoolean89) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III[I)[B")
	public byte[] method4056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4055(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(38) boolean local38 = this.method4073(arg2, arg0);
			if (!local38) {
				this.method4041(arg0);
				local38 = this.method4073(arg2, arg0);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static249.method3846(this.anObjectArrayArray1[arg0][arg1], false);
		if (this.aBoolean334) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass67_2.anIntArray211[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZZ)V")
	public void method4057(@OriginalArg(2) boolean arg0) {
		if (!this.method4076()) {
			return;
		}
		this.aClass67_2.anIntArrayArray24 = null;
		this.aClass67_2.aClass38Array1 = null;
		if (arg0) {
			this.aClass67_2.aClass38_1 = null;
			this.aClass67_2.anIntArray214 = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(III)[B")
	public byte[] method4058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method4056(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)Z")
	public boolean method4060(@OriginalArg(1) int arg0) {
		if (!this.method4049(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method4041(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4061(@OriginalArg(1) String arg0) {
		if (this.method4076()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass67_2.aClass38_1.method955(Static149.method2417(local18));
			return this.method4060(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(BI)[B")
	public byte[] method4062(@OriginalArg(1) int arg0) {
		if (!this.method4076()) {
			return null;
		} else if (this.aClass67_2.anIntArray211.length == 1) {
			return this.method4058(arg0, 0);
		} else if (!this.method4049(arg0)) {
			return null;
		} else if (this.aClass67_2.anIntArray211[arg0] == 1) {
			return this.method4058(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)I")
	public int method4064() {
		if (!this.method4076()) {
			throw new IllegalStateException("");
		}
		return this.aClass67_2.anInt2196;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(II)I")
	public int method4065(@OriginalArg(1) int arg0) {
		if (this.method4076()) {
			@Pc(22) int local22 = this.aClass67_2.aClass38_1.method955(arg0);
			return this.method4049(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(ILjava/lang/String;)I")
	public int method4066(@OriginalArg(1) String arg0) {
		if (this.method4076()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass67_2.aClass38_1.method955(Static149.method2417(local12));
			return this.method4040(local28);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(II)I")
	public int method4068(@OriginalArg(1) int arg0) {
		return this.method4049(arg0) ? this.aClass67_2.anIntArray211[arg0] : 0;
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(ILjava/lang/String;)I")
	public int method4069(@OriginalArg(1) String arg0) {
		if (this.method4076()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass67_2.aClass38_1.method955(Static149.method2417(local19));
			return this.method4049(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(II)V")
	private void method4070(@OriginalArg(0) int arg0) {
		this.aClass13_1.method2962(arg0);
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(III)Z")
	public boolean method4072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4055(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method4041(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "([IBI)Z")
	private boolean method4073(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method4049(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass67_2.anIntArray216[arg1];
			@Pc(31) int[] local31 = this.aClass67_2.anIntArrayArray25[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass67_2.anIntArray211[arg1]];
			}
			@Pc(48) boolean local48 = true;
			@Pc(53) Object[] local53 = this.anObjectArrayArray1[arg1];
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(62) int local62;
				if (local31 == null) {
					local62 = local55;
				} else {
					local62 = local31[local55];
				}
				if (local53[local62] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local117 = Static249.method3846(this.anObjectArray2[arg1], false);
			} else {
				local117 = Static249.method3846(this.anObjectArray2[arg1], true);
				@Pc(122) Class1_Sub14 local122 = new Class1_Sub14(local117);
				local122.method2186(local122.aByteArray55.length, arg0);
			}
			@Pc(148) byte[] local148;
			try {
				local148 = Static79.method1349(local117);
			} catch (@Pc(150) RuntimeException local150) {
				throw Static112.method1818(local150, "T3 - " + (arg0 != null) + "," + arg1 + "," + local117.length + "," + Static269.method4063(local117.length, local117) + "," + Static269.method4063(local117.length - 2, local117) + "," + this.aClass67_2.anIntArray215[arg1] + "," + this.aClass67_2.anInt2196);
			}
			if (this.aBoolean333) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(222) int local222;
			if (local25 > 1) {
				local222 = local148.length;
				@Pc(225) int local225 = local222 - 1;
				@Pc(229) int local229 = local148[local225] & 0xFF;
				@Pc(237) int local237 = local225 - local25 * 4 * local229;
				@Pc(242) Class1_Sub14 local242 = new Class1_Sub14(local148);
				@Pc(245) int[] local245 = new int[local25];
				local242.anInt3000 = local237;
				@Pc(259) int local259;
				@Pc(261) int local261;
				for (@Pc(250) int local250 = 0; local250 < local229; local250++) {
					local259 = 0;
					for (local261 = 0; local261 < local25; local261++) {
						if (local31 == null) {
						}
						local259 += local242.method2194();
						local245[local261] += local259;
					}
				}
				@Pc(288) byte[][] local288 = new byte[local25][];
				for (local259 = 0; local259 < local25; local259++) {
					local288[local259] = new byte[local245[local259]];
					local245[local259] = 0;
				}
				local242.anInt3000 = local237;
				local259 = 0;
				@Pc(323) int local323;
				for (local261 = 0; local261 < local229; local261++) {
					local323 = 0;
					for (@Pc(325) int local325 = 0; local325 < local25; local325++) {
						local323 += local242.method2194();
						Static319.method1419(local148, local259, local288[local325], local245[local325], local323);
						local245[local325] += local323;
						local259 += local323;
					}
				}
				for (local261 = 0; local261 < local25; local261++) {
					if (local31 == null) {
						local323 = local261;
					} else {
						local323 = local31[local261];
					}
					if (this.aBoolean334) {
						local53[local323] = local288[local261];
					} else {
						local53[local323] = Static279.method4265(local288[local261]);
					}
				}
			} else {
				if (local31 == null) {
					local222 = 0;
				} else {
					local222 = local31[0];
				}
				if (this.aBoolean334) {
					local53[local222] = local148;
				} else {
					local53[local222] = Static279.method4265(local148);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method4074(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4076()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass67_2.aClass38_1.method955(Static149.method2417(local12));
		if (this.method4049(local29)) {
			@Pc(47) int local47 = this.aClass67_2.aClass38Array1[local29].method955(Static149.method2417(local20));
			return this.method4072(local29, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)I")
	public int method4075() {
		return this.method4076() ? this.aClass67_2.anIntArray211.length : -1;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)Z")
	private boolean method4076() {
		if (this.aClass67_2 == null) {
			this.aClass67_2 = this.aClass13_1.method2963();
			if (this.aClass67_2 == null) {
				return false;
			}
			this.anObjectArray2 = new Object[this.aClass67_2.anInt2190];
			this.anObjectArrayArray1 = new Object[this.aClass67_2.anInt2190][];
		}
		return true;
	}
}
