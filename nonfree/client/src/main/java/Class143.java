import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class143 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Lclient!ega;")
	private Class99 aClass99_2 = null;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "Z")
	private final boolean aBoolean284;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
	public int anInt3570;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "Lclient!ua;")
	private final Class89 aClass89_1;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!ua;ZI)V")
	public Class143(@OriginalArg(0) Class89 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean284 = arg1;
		this.anInt3570 = arg2;
		this.aClass89_1 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
	private int method3111(@OriginalArg(1) int arg0) {
		if (this.method3143(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass89_1.method2152(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZZ)V")
	public void method3112(@OriginalArg(2) boolean arg0) {
		if (!this.method3137()) {
			return;
		}
		if (arg0) {
			this.aClass99_2.anIntArray167 = null;
			this.aClass99_2.aClass38_1 = null;
		}
		this.aClass99_2.aClass38Array1 = null;
		this.aClass99_2.anIntArrayArray34 = null;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Z")
	public boolean method3113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3139(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3117(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)Z")
	public boolean method3114() {
		if (!this.method3137()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass99_2.anIntArray165.length; local20++) {
			@Pc(28) int local28 = this.aClass99_2.anIntArray165[local20];
			if (this.anObjectArray2[local28] == null) {
				this.method3117(local28);
				if (this.anObjectArray2[local28] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I")
	public int method3115() {
		if (!this.method3137()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray2.length; local22++) {
			if (this.aClass99_2.anIntArray168[local22] > 0) {
				local20 += this.method3111(local22);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local20 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I")
	public int method3116() {
		return this.method3137() ? this.aClass99_2.anIntArray166.length : -1;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V")
	private void method3117(@OriginalArg(1) int arg0) {
		if (this.aBoolean284) {
			this.anObjectArray2[arg0] = this.aClass89_1.method2151(arg0);
		} else {
			this.anObjectArray2[arg0] = Static331.method8338(this.aClass89_1.method2151(arg0));
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3118(@OriginalArg(1) String arg0) {
		if (this.method3137()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass99_2.aClass38_1.method1248(Static53.method1375(local12));
			return this.method3144(local21);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3119(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3137()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass99_2.aClass38_1.method1248(Static53.method1375(local12));
		if (this.method3143(local29)) {
			@Pc(47) int local47 = this.aClass99_2.aClass38Array1[local29].method1248(Static53.method1375(local15));
			return this.method3125(local47, local29);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V")
	private void method3120(@OriginalArg(0) int arg0) {
		this.aClass89_1.method2153(arg0);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3121(@OriginalArg(0) String arg0) {
		if (this.method3137()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass99_2.aClass38_1.method1248(Static53.method1375(local20));
			return this.method3111(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method3122(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3137()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass99_2.aClass38_1.method1248(Static53.method1375(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(42) int local42 = this.aClass99_2.aClass38Array1[local24].method1248(Static53.method1375(local15));
			return local42 >= 0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)I")
	public int method3123(@OriginalArg(1) int arg0) {
		return this.method3143(arg0) ? this.aClass99_2.anIntArray166[arg0] : 0;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V")
	public void method3124(@OriginalArg(0) int arg0) {
		if (this.method3143(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)[B")
	public byte[] method3125(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method3126(arg1, arg0, (int[]) null);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIB[I)[B")
	public byte[] method3126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method3139(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method3134(arg1, arg2, arg0);
			if (!local30) {
				this.method3117(arg0);
				local30 = this.method3134(arg1, arg2, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static128.method2246(this.anObjectArrayArray1[arg0][arg1], false);
		if (this.anInt3570 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass99_2.anIntArray166[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt3570 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(BI)I")
	public int method3127(@OriginalArg(1) int arg0) {
		if (this.method3137()) {
			@Pc(16) int local16 = this.aClass99_2.aClass38_1.method1248(arg0);
			return this.method3143(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public void method3128(@OriginalArg(0) String arg0) {
		if (this.method3137()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass99_2.aClass38_1.method1248(Static53.method1375(local15));
			this.method3120(local26);
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IZ)Z")
	public boolean method3130(@OriginalArg(0) int arg0) {
		if (!this.method3137()) {
			return false;
		} else if (this.aClass99_2.anIntArray166.length == 1) {
			return this.method3113(0, arg0);
		} else if (!this.method3143(arg0)) {
			return false;
		} else if (this.aClass99_2.anIntArray166[arg0] == 1) {
			return this.method3113(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method3131(@OriginalArg(1) String arg0) {
		if (this.method3137()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass99_2.aClass38_1.method1248(Static53.method1375(local12));
			return this.method3143(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)I")
	public int method3132() {
		if (!this.method3137()) {
			throw new IllegalStateException("");
		}
		return this.aClass99_2.anInt2484;
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(II)[I")
	public int[] method3133(@OriginalArg(1) int arg0) {
		if (!this.method3143(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass99_2.anIntArrayArray33[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass99_2.anIntArray168[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI[II)Z")
	private boolean method3134(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3143(arg2)) {
			return false;
		} else if (this.anObjectArray2[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass99_2.anIntArray168[arg2];
			@Pc(31) int[] local31 = this.aClass99_2.anIntArrayArray33[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass99_2.anIntArray166[arg2]];
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
			@Pc(122) byte[] local122;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local122 = Static128.method2246(this.anObjectArray2[arg2], false);
			} else {
				local122 = Static128.method2246(this.anObjectArray2[arg2], true);
				@Pc(127) Class3_Sub17 local127 = new Class3_Sub17(local122);
				local127.method4896(arg1, local127.aByteArray59.length);
			}
			@Pc(149) byte[] local149;
			try {
				local149 = Static55.method1383(local122);
			} catch (@Pc(151) RuntimeException local151) {
				throw Static7.method72(local151, "T3 - " + (arg1 != null) + "," + arg2 + "," + local122.length + "," + Static131.method2270(local122.length, local122) + "," + Static131.method2270(local122.length - 2, local122) + "," + this.aClass99_2.anIntArray164[arg2] + "," + this.aClass99_2.anInt2484);
			}
			if (this.aBoolean284) {
				this.anObjectArray2[arg2] = null;
			}
			@Pc(223) int local223;
			if (local25 <= 1) {
				if (local31 == null) {
					local223 = 0;
				} else {
					local223 = local31[0];
				}
				if (this.anInt3570 == 0) {
					local51[local223] = Static331.method8338(local149);
				} else {
					local51[local223] = local149;
				}
			} else {
				@Pc(263) int local263;
				@Pc(276) Class3_Sub17 local276;
				@Pc(284) int local284;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(342) int local342;
				@Pc(344) int local344;
				@Pc(348) int local348;
				@Pc(350) int local350;
				if (this.anInt3570 == 2) {
					local223 = local149.length;
					local223--;
					local263 = local149[local223] & 0xFF;
					local223 -= local25 * 4 * local263;
					local276 = new Class3_Sub17(local149);
					@Pc(467) int local467 = 0;
					local276.lb = local223;
					local284 = 0;
					for (local288 = 0; local288 < local263; local288++) {
						local290 = 0;
						for (local342 = 0; local342 < local25; local342++) {
							local290 += local276.method4868();
							if (local31 == null) {
								local344 = local342;
							} else {
								local344 = local31[local342];
							}
							if (arg0 == local344) {
								local467 += local290;
								local284 = local344;
							}
						}
					}
					if (local467 == 0) {
						return true;
					}
					@Pc(526) byte[] local526 = new byte[local467];
					local276.lb = local223;
					local467 = 0;
					local342 = 0;
					for (local344 = 0; local344 < local263; local344++) {
						local348 = 0;
						for (local350 = 0; local350 < local25; local350++) {
							local348 += local276.method4868();
							@Pc(553) int local553;
							if (local31 == null) {
								local553 = local350;
							} else {
								local553 = local31[local350];
							}
							if (local553 == arg0) {
								Static689.method8055(local149, local342, local526, local467, local348);
								local467 += local348;
							}
							local342 += local348;
						}
					}
					local51[local284] = local526;
				} else {
					local223 = local149.length;
					local223--;
					local263 = local149[local223] & 0xFF;
					local223 -= local263 * 4 * local25;
					local276 = new Class3_Sub17(local149);
					local276.lb = local223;
					@Pc(282) int[] local282 = new int[local25];
					for (local284 = 0; local284 < local263; local284++) {
						local288 = 0;
						for (local290 = 0; local290 < local25; local290++) {
							local288 += local276.method4868();
							local282[local290] += local288;
						}
					}
					@Pc(318) byte[][] local318 = new byte[local25][];
					for (local290 = 0; local290 < local25; local290++) {
						local318[local290] = new byte[local282[local290]];
						local282[local290] = 0;
					}
					local276.lb = local223;
					local342 = 0;
					for (local344 = 0; local344 < local263; local344++) {
						local348 = 0;
						for (local350 = 0; local350 < local25; local350++) {
							local348 += local276.method4868();
							Static689.method8055(local149, local342, local318[local350], local282[local350], local348);
							local342 += local348;
							local282[local350] += local348;
						}
					}
					for (local348 = 0; local348 < local25; local348++) {
						if (local31 == null) {
							local350 = local348;
						} else {
							local350 = local31[local348];
						}
						if (this.anInt3570 == 0) {
							local51[local350] = Static331.method8338(local318[local348]);
						} else {
							local51[local350] = local318[local348];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(II)[B")
	public byte[] method3135(@OriginalArg(1) int arg0) {
		if (!this.method3137()) {
			return null;
		} else if (this.aClass99_2.anIntArray166.length == 1) {
			return this.method3125(arg0, 0);
		} else if (!this.method3143(arg0)) {
			return null;
		} else if (this.aClass99_2.anIntArray166[arg0] == 1) {
			return this.method3125(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method3136(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3137()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass99_2.aClass38_1.method1248(Static53.method1375(local12));
		if (this.method3143(local29)) {
			@Pc(47) int local47 = this.aClass99_2.aClass38Array1[local29].method1248(Static53.method1375(local15));
			return this.method3113(local29, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(B)Z")
	private boolean method3137() {
		if (this.aClass99_2 == null) {
			this.aClass99_2 = this.aClass89_1.method2154();
			if (this.aClass99_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass99_2.anInt2490][];
			this.anObjectArray2 = new Object[this.aClass99_2.anInt2490];
		}
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3138(@OriginalArg(1) String arg0) {
		if (this.method3137()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass99_2.aClass38_1.method1248(Static53.method1375(local12));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(III)Z")
	private boolean method3139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3137()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass99_2.anIntArray166.length && this.aClass99_2.anIntArray166[arg1] > arg0) {
			return true;
		} else if (Static419.aBoolean534) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3140(@OriginalArg(0) String arg0) {
		@Pc(17) int local17 = this.method3131("");
		return local17 == -1 ? this.method3136("", arg0) : this.method3136(arg0, "");
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	public void method3141() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "(B)V")
	public void method3142() {
		if (this.anObjectArray2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray2.length; local6++) {
				this.anObjectArray2[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)Z")
	private boolean method3143(@OriginalArg(1) int arg0) {
		if (!this.method3137()) {
			return false;
		} else if (arg0 >= 0 && this.aClass99_2.anIntArray166.length > arg0 && this.aClass99_2.anIntArray166[arg0] != 0) {
			return true;
		} else if (Static419.aBoolean534) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(II)Z")
	public boolean method3144(@OriginalArg(0) int arg0) {
		if (!this.method3143(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3117(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
