import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class91 {

	@OriginalMember(owner = "client!km", name = "g", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!km", name = "B", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!km", name = "D", descriptor = "Lclient!ki;")
	private Class89 aClass89_2 = null;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!km", name = "r", descriptor = "Lclient!pc;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!pc;ZZ)V")
	public Class91(@OriginalArg(0) Class63 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean231 = arg2;
		this.aClass63_1 = arg0;
		this.aBoolean232 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Z")
	private boolean method2486() {
		if (this.aClass89_2 == null) {
			this.aClass89_2 = this.aClass63_1.method1925();
			if (this.aClass89_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass89_2.anInt3040][];
			this.anObjectArray32 = new Object[this.aClass89_2.anInt3040];
		}
		return true;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI)[B")
	public byte[] method2487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2496(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(31) boolean local31 = this.method2506(null, arg0);
			if (!local31) {
				this.method2502(arg0);
				local31 = this.method2506(null, arg0);
				if (!local31) {
					return null;
				}
			}
		}
		return Static69.method1255(this.anObjectArrayArray1[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)[B")
	public byte[] method2488(@OriginalArg(1) int arg0) {
		if (!this.method2486()) {
			return null;
		} else if (this.aClass89_2.anIntArray279.length == 1) {
			return this.method2495(0, arg0);
		} else if (!this.method2493(arg0)) {
			return null;
		} else if (this.aClass89_2.anIntArray279[arg0] == 1) {
			return this.method2495(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I")
	private int method2489(@OriginalArg(1) int arg0) {
		if (this.method2493(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass63_1.method1927(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[IIB)[B")
	public byte[] method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method2496(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method2506(arg1, arg0);
			if (!local30) {
				this.method2502(arg0);
				local30 = this.method2506(arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static69.method1255(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.aBoolean231) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass89_2.anIntArray279[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2491(@OriginalArg(0) String arg0) {
		if (this.method2486()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(33) int local33 = this.aClass89_2.aClass65_1.method1948(Static191.method3157(local13));
			return this.method2509(local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)I")
	public int method2492() {
		return this.method2486() ? this.aClass89_2.anIntArray279.length : -1;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IB)Z")
	private boolean method2493(@OriginalArg(0) int arg0) {
		if (!this.method2486()) {
			return false;
		} else if (arg0 >= 0 && this.aClass89_2.anIntArray279.length > arg0 && this.aClass89_2.anIntArray279[arg0] != 0) {
			return true;
		} else if (Static45.aBoolean80) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)[I")
	public int[] method2494(@OriginalArg(1) int arg0) {
		if (!this.method2493(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass89_2.anIntArrayArray12[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass89_2.anIntArray278[arg0]];
			@Pc(36) int local36 = 0;
			while (local23.length > local36) {
				local23[local36] = local36++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)[B")
	public byte[] method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method2490(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(III)Z")
	private boolean method2496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2486()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass89_2.anIntArray279.length > arg1 && arg0 < this.aClass89_2.anIntArray279[arg1]) {
			return true;
		} else if (Static45.aBoolean80) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
	public int method2497() {
		if (!this.method2486()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray32.length; local23++) {
			if (this.aClass89_2.anIntArray278[local23] > 0) {
				local16 += this.method2489(local23);
				local14 += 100;
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	public void method2498() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray1.length; local7++) {
				this.anObjectArrayArray1[local7] = null;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)Z")
	public boolean method2499() {
		if (!this.method2486()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass89_2.anIntArray276.length; local16++) {
			@Pc(32) int local32 = this.aClass89_2.anIntArray276[local16];
			if (this.anObjectArray32[local32] == null) {
				this.method2502(local32);
				if (this.anObjectArray32[local32] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method2500(@OriginalArg(1) String arg0) {
		if (this.method2486()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass89_2.aClass65_1.method1948(Static191.method3157(local12));
			this.method2513(local29);
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(IB)Z")
	public boolean method2501(@OriginalArg(0) int arg0) {
		if (!this.method2486()) {
			return false;
		} else if (this.aClass89_2.anIntArray279.length == 1) {
			return this.method2515(arg0, 0);
		} else if (!this.method2493(arg0)) {
			return false;
		} else if (this.aClass89_2.anIntArray279[arg0] == 1) {
			return this.method2515(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V")
	private void method2502(@OriginalArg(0) int arg0) {
		if (this.aBoolean232) {
			this.anObjectArray32[arg0] = this.aClass63_1.method1929(arg0);
		} else {
			this.anObjectArray32[arg0] = Static291.method4389(this.aClass63_1.method1929(arg0));
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(B)I")
	public int method2503() {
		if (!this.method2486()) {
			throw new IllegalStateException("");
		}
		return this.aClass89_2.anInt3043;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2504(@OriginalArg(1) String arg0) {
		if (this.method2486()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass89_2.aClass65_1.method1948(Static191.method3157(local21));
			return this.method2493(local30) ? local30 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method2505(@OriginalArg(1) String arg0) {
		if (this.method2486()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass89_2.aClass65_1.method1948(Static191.method3157(local12));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([III)Z")
	private boolean method2506(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (!this.method2493(arg1)) {
			return false;
		} else if (this.anObjectArray32[arg1] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass89_2.anIntArray278[arg1];
			@Pc(33) int[] local33 = this.aClass89_2.anIntArrayArray12[arg1];
			@Pc(40) boolean local40 = true;
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass89_2.anIntArray279[arg1]];
			}
			@Pc(60) Object[] local60 = this.anObjectArrayArray1[arg1];
			for (@Pc(62) int local62 = 0; local62 < local27; local62++) {
				@Pc(70) int local70;
				if (local33 == null) {
					local70 = local62;
				} else {
					local70 = local33[local62];
				}
				if (local60[local70] == null) {
					local40 = false;
					break;
				}
			}
			if (local40) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local127 = Static69.method1255(this.anObjectArray32[arg1], false);
			} else {
				local127 = Static69.method1255(this.anObjectArray32[arg1], true);
				@Pc(141) Class1_Sub11 local141 = new Class1_Sub11(local127);
				local141.method2637(arg0, local141.aByteArray47.length);
			}
			@Pc(153) byte[] local153;
			try {
				local153 = Static207.method3771(local127);
			} catch (@Pc(155) RuntimeException local155) {
				throw Static5.method201(local155, "T3 - " + (arg0 != null) + "," + arg1 + "," + local127.length + "," + Static149.method2599(local127, local127.length) + "," + Static149.method2599(local127, local127.length - 2) + "," + this.aClass89_2.anIntArray274[arg1] + "," + this.aClass89_2.anInt3043);
			}
			if (this.aBoolean232) {
				this.anObjectArray32[arg1] = null;
			}
			@Pc(228) int local228;
			if (local27 > 1) {
				local228 = local153.length;
				@Pc(231) int local231 = local228 - 1;
				@Pc(235) int local235 = local153[local231] & 0xFF;
				@Pc(240) Class1_Sub11 local240 = new Class1_Sub11(local153);
				@Pc(243) int[] local243 = new int[local27];
				@Pc(251) int local251 = local231 - local27 * 4 * local235;
				local240.anInt3264 = local251;
				@Pc(265) int local265;
				@Pc(267) int local267;
				for (@Pc(256) int local256 = 0; local256 < local235; local256++) {
					local265 = 0;
					for (local267 = 0; local267 < local27; local267++) {
						if (local33 == null) {
						}
						local265 += local240.method2643();
						local243[local267] += local265;
					}
				}
				@Pc(298) byte[][] local298 = new byte[local27][];
				for (local265 = 0; local265 < local27; local265++) {
					local298[local265] = new byte[local243[local265]];
					local243[local265] = 0;
				}
				local265 = 0;
				local240.anInt3264 = local251;
				@Pc(337) int local337;
				for (local267 = 0; local267 < local235; local267++) {
					local337 = 0;
					for (@Pc(339) int local339 = 0; local339 < local27; local339++) {
						local337 += local240.method2643();
						Static304.method2609(local153, local265, local298[local339], local243[local339], local337);
						local243[local339] += local337;
						local265 += local337;
					}
				}
				for (local267 = 0; local267 < local27; local267++) {
					if (local33 == null) {
						local337 = local267;
					} else {
						local337 = local33[local267];
					}
					if (this.aBoolean231) {
						local60[local337] = local298[local267];
					} else {
						local60[local337] = Static291.method4389(local298[local267]);
					}
				}
			} else {
				if (local33 == null) {
					local228 = 0;
				} else {
					local228 = local33[0];
				}
				if (this.aBoolean231) {
					local60[local228] = local153;
				} else {
					local60[local228] = Static291.method4389(local153);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIZ)V")
	public void method2507(@OriginalArg(0) boolean arg0) {
		if (!this.method2486()) {
			return;
		}
		if (arg0) {
			this.aClass89_2.aClass65_1 = null;
			this.aClass89_2.anIntArray275 = null;
		}
		this.aClass89_2.aClass65Array1 = null;
		this.aClass89_2.anIntArrayArray11 = null;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(BLjava/lang/String;)I")
	public int method2508(@OriginalArg(1) String arg0) {
		if (this.method2486()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass89_2.aClass65_1.method1948(Static191.method3157(local20));
			return this.method2489(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(II)Z")
	public boolean method2509(@OriginalArg(1) int arg0) {
		if (!this.method2493(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method2502(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(II)I")
	public int method2510(@OriginalArg(1) int arg0) {
		return this.method2493(arg0) ? this.aClass89_2.anIntArray279[arg0] : 0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method2511(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2486()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass89_2.aClass65_1.method1948(Static191.method3157(local12));
		if (this.method2493(local31)) {
			@Pc(49) int local49 = this.aClass89_2.aClass65Array1[local31].method1948(Static191.method3157(local15));
			return this.method2495(local31, local49);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method2512(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2486()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass89_2.aClass65_1.method1948(Static191.method3157(local20));
		if (this.method2493(local32)) {
			@Pc(53) int local53 = this.aClass89_2.aClass65Array1[local32].method1948(Static191.method3157(local23));
			return this.method2515(local53, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(II)V")
	private void method2513(@OriginalArg(1) int arg0) {
		this.aClass63_1.method1930(arg0);
	}

	@OriginalMember(owner = "client!km", name = "g", descriptor = "(II)V")
	public void method2514(@OriginalArg(1) int arg0) {
		if (this.method2493(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BII)Z")
	public boolean method2515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2496(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray32[arg1] == null) {
			this.method2502(arg1);
			return this.anObjectArray32[arg1] != null;
		} else {
			return true;
		}
	}
}
