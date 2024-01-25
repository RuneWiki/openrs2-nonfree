import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class32 {

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray3;

	@OriginalMember(owner = "client!bu", name = "q", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!bu", name = "G", descriptor = "Lclient!fv;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
	public int anInt1093;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Lclient!nb;")
	private final Class25 aClass25_1;

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "Z")
	private final boolean aBoolean99;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!nb;ZI)V")
	public Class32(@OriginalArg(0) Class25 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt1093 = arg2;
		this.aClass25_1 = arg0;
		this.aBoolean99 = arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method782(@OriginalArg(1) String arg0) {
		if (this.method794()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass84_2.aClass220_1.method4753(Static414.method5320(local19));
			this.method814(local28);
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Z")
	private boolean method784(@OriginalArg(0) int arg0) {
		if (!this.method794()) {
			return false;
		} else if (arg0 >= 0 && this.aClass84_2.anIntArray150.length > arg0 && this.aClass84_2.anIntArray150[arg0] != 0) {
			return true;
		} else if (Static57.aBoolean448) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)[B")
	public byte[] method785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method801(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIZ)Z")
	private boolean method786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method794()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass84_2.anIntArray150.length && this.aClass84_2.anIntArray150[arg0] > arg1) {
			return true;
		} else if (Static57.aBoolean448) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method788(@OriginalArg(0) String arg0) {
		if (this.method794()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass84_2.aClass220_1.method4753(Static414.method5320(local19));
			return this.method789(local28);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)I")
	private int method789(@OriginalArg(1) int arg0) {
		if (this.method784(arg0)) {
			return this.anObjectArray3[arg0] == null ? this.aClass25_1.method666(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)I")
	public int method790(@OriginalArg(1) int arg0) {
		return this.method784(arg0) ? this.aClass84_2.anIntArray150[arg0] : 0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZZI)V")
	public void method791(@OriginalArg(1) boolean arg0) {
		if (!this.method794()) {
			return;
		}
		if (arg0) {
			this.aClass84_2.anIntArray152 = null;
			this.aClass84_2.aClass220_1 = null;
		}
		this.aClass84_2.anIntArrayArray19 = null;
		this.aClass84_2.aClass220Array1 = null;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public void method792() {
		if (this.anObjectArray3 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArray3.length; local8++) {
				this.anObjectArray3[local8] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method793(@OriginalArg(0) String arg0) {
		if (this.method794()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass84_2.aClass220_1.method4753(Static414.method5320(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)Z")
	private boolean method794() {
		if (this.aClass84_2 == null) {
			this.aClass84_2 = this.aClass25_1.method662();
			if (this.aClass84_2 == null) {
				return false;
			}
			this.anObjectArray3 = new Object[this.aClass84_2.anInt2621];
			this.anObjectArrayArray1 = new Object[this.aClass84_2.anInt2621][];
		}
		return true;
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(II)Z")
	public boolean method795(@OriginalArg(1) int arg0) {
		if (!this.method784(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method805(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)I")
	public int method796() {
		if (!this.method794()) {
			return 0;
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anObjectArray3.length; local27++) {
			if (this.aClass84_2.anIntArray154[local27] > 0) {
				local23 += 100;
				local25 += this.method789(local27);
			}
		}
		if (local23 == 0) {
			return 100;
		} else {
			return local25 * 100 / local23;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II[II)Z")
	private boolean method797(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method784(arg2)) {
			return false;
		} else if (this.anObjectArray3[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass84_2.anIntArray154[arg2];
			@Pc(31) int[] local31 = this.aClass84_2.anIntArrayArray18[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass84_2.anIntArray150[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(62) int local62;
				if (local31 == null) {
					local62 = local55;
				} else {
					local62 = local31[local55];
				}
				if (local51[local62] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(112) byte[] local112;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local112 = Static415.method5326(false, this.anObjectArray3[arg2]);
			} else {
				local112 = Static415.method5326(true, this.anObjectArray3[arg2]);
				@Pc(117) Class3_Sub7 local117 = new Class3_Sub7(local112);
				local117.method2617(arg1, local117.aByteArray46.length);
			}
			@Pc(138) byte[] local138;
			try {
				local138 = Static153.method2480(local112);
			} catch (@Pc(140) RuntimeException local140) {
				throw Static351.method4666(local140, "T3 - " + (arg1 != null) + "," + arg2 + "," + local112.length + "," + Static86.method1647(local112, local112.length) + "," + Static86.method1647(local112, local112.length - 2) + "," + this.aClass84_2.anIntArray151[arg2] + "," + this.aClass84_2.anInt2622);
			}
			if (this.aBoolean99) {
				this.anObjectArray3[arg2] = null;
			}
			@Pc(213) int local213;
			if (local25 > 1) {
				@Pc(220) int local220;
				@Pc(233) Class3_Sub7 local233;
				@Pc(237) int local237;
				@Pc(242) int local242;
				@Pc(245) int local245;
				@Pc(247) int local247;
				@Pc(260) int local260;
				@Pc(310) int local310;
				@Pc(312) int local312;
				if (this.anInt1093 == 2) {
					local213 = local138.length;
					@Pc(215) int local215 = local213 - 1;
					local220 = local138[local215] & 0xFF;
					@Pc(228) int local228 = local215 - local25 * local220 * 4;
					local233 = new Class3_Sub7(local138);
					@Pc(235) int local235 = 0;
					local237 = 0;
					local233.anInt3235 = local228;
					for (local242 = 0; local242 < local220; local242++) {
						local245 = 0;
						for (local247 = 0; local247 < local25; local247++) {
							local245 += local233.method2589();
							if (local31 == null) {
								local260 = local247;
							} else {
								local260 = local31[local247];
							}
							if (arg0 == local260) {
								local237 = local260;
								local235 += local245;
							}
						}
					}
					if (local235 == 0) {
						return true;
					}
					@Pc(298) byte[] local298 = new byte[local235];
					local233.anInt3235 = local228;
					local235 = 0;
					local247 = 0;
					for (local260 = 0; local260 < local220; local260++) {
						local310 = 0;
						for (local312 = 0; local312 < local25; local312++) {
							local310 += local233.method2589();
							@Pc(325) int local325;
							if (local31 == null) {
								local325 = local312;
							} else {
								local325 = local31[local312];
							}
							if (local325 == arg0) {
								Static462.method4611(local138, local247, local298, local235, local310);
								local235 += local310;
							}
							local247 += local310;
						}
					}
					local51[local237] = local298;
				} else {
					local213 = local138.length;
					local213--;
					local220 = local138[local213] & 0xFF;
					local213 -= local220 * 4 * local25;
					local233 = new Class3_Sub7(local138);
					@Pc(394) int[] local394 = new int[local25];
					local233.anInt3235 = local213;
					for (local237 = 0; local237 < local220; local237++) {
						local242 = 0;
						for (local245 = 0; local245 < local25; local245++) {
							local242 += local233.method2589();
							local394[local245] += local242;
						}
					}
					@Pc(433) byte[][] local433 = new byte[local25][];
					for (local245 = 0; local245 < local25; local245++) {
						local433[local245] = new byte[local394[local245]];
						local394[local245] = 0;
					}
					local233.anInt3235 = local213;
					local247 = 0;
					for (local260 = 0; local260 < local220; local260++) {
						local310 = 0;
						for (local312 = 0; local312 < local25; local312++) {
							local310 += local233.method2589();
							Static462.method4611(local138, local247, local433[local312], local394[local312], local310);
							local247 += local310;
							local394[local312] += local310;
						}
					}
					for (local310 = 0; local310 < local25; local310++) {
						if (local31 == null) {
							local312 = local310;
						} else {
							local312 = local31[local310];
						}
						if (this.anInt1093 == 0) {
							local51[local312] = Static14.method317(local433[local310]);
						} else {
							local51[local312] = local433[local310];
						}
					}
				}
			} else {
				if (local31 == null) {
					local213 = 0;
				} else {
					local213 = local31[0];
				}
				if (this.anInt1093 == 0) {
					local51[local213] = Static14.method317(local138);
				} else {
					local51[local213] = local138;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "(II)I")
	public int method798(@OriginalArg(1) int arg0) {
		if (this.method794()) {
			@Pc(21) int local21 = this.aClass84_2.aClass220_1.method4753(arg0);
			return this.method784(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "(II)V")
	public void method799(@OriginalArg(0) int arg0) {
		if (this.method784(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZI)Z")
	public boolean method800(@OriginalArg(1) int arg0) {
		if (!this.method794()) {
			return false;
		} else if (this.aClass84_2.anIntArray150.length == 1) {
			return this.method808(0, arg0);
		} else if (!this.method784(arg0)) {
			return false;
		} else if (this.aClass84_2.anIntArray150[arg0] == 1) {
			return this.method808(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "([IIII)[B")
	public byte[] method801(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method786(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(30) boolean local30 = this.method797(arg2, arg0, arg1);
			if (!local30) {
				this.method805(arg1);
				local30 = this.method797(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static415.method5326(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt1093 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass84_2.anIntArray150[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt1093 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "(II)[I")
	public int[] method802(@OriginalArg(0) int arg0) {
		if (!this.method784(arg0)) {
			return null;
		}
		@Pc(16) int[] local16 = this.aClass84_2.anIntArrayArray18[arg0];
		if (local16 == null) {
			local16 = new int[this.aClass84_2.anIntArray154[arg0]];
			@Pc(27) int local27 = 0;
			while (local16.length > local27) {
				local16[local27] = local27++;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
	public void method803() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray1.length; local15++) {
				this.anObjectArrayArray1[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method804(@OriginalArg(0) String arg0) {
		if (this.method794()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(33) int local33 = this.aClass84_2.aClass220_1.method4753(Static414.method5320(local14));
			return this.method795(local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)V")
	private void method805(@OriginalArg(0) int arg0) {
		if (this.aBoolean99) {
			this.anObjectArray3[arg0] = this.aClass25_1.method663(arg0);
		} else {
			this.anObjectArray3[arg0] = Static14.method317(this.aClass25_1.method663(arg0));
		}
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)I")
	public int method806() {
		if (!this.method794()) {
			throw new IllegalStateException("");
		}
		return this.aClass84_2.anInt2622;
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public int method807(@OriginalArg(0) String arg0) {
		if (this.method794()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass84_2.aClass220_1.method4753(Static414.method5320(local20));
			return this.method784(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)Z")
	public boolean method808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method786(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method805(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)I")
	public int method809() {
		return this.method794() ? this.aClass84_2.anIntArray150.length : -1;
	}

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)Z")
	public boolean method810() {
		if (!this.method794()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass84_2.anIntArray153.length; local15++) {
			@Pc(22) int local22 = this.aClass84_2.anIntArray153[local15];
			if (this.anObjectArray3[local22] == null) {
				this.method805(local22);
				if (this.anObjectArray3[local22] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "(II)[B")
	public byte[] method811(@OriginalArg(0) int arg0) {
		if (!this.method794()) {
			return null;
		} else if (this.aClass84_2.anIntArray150.length == 1) {
			return this.method785(arg0, 0);
		} else if (!this.method784(arg0)) {
			return null;
		} else if (this.aClass84_2.anIntArray150[arg0] == 1) {
			return this.method785(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	public boolean method812(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method794()) {
			return false;
		}
		@Pc(19) String local19 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass84_2.aClass220_1.method4753(Static414.method5320(local19));
		if (this.method784(local31)) {
			@Pc(51) int local51 = this.aClass84_2.aClass220Array1[local31].method4753(Static414.method5320(local22));
			return this.method808(local31, local51);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method813(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method794()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass84_2.aClass220_1.method4753(Static414.method5320(local12));
		if (this.method784(local24)) {
			@Pc(52) int local52 = this.aClass84_2.aClass220Array1[local24].method4753(Static414.method5320(local15));
			return this.method785(local52, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "(II)V")
	private void method814(@OriginalArg(1) int arg0) {
		this.aClass25_1.method665(arg0);
	}
}
