import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class254 {

	@OriginalMember(owner = "client!nca", name = "M", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray3;

	@OriginalMember(owner = "client!nca", name = "w", descriptor = "Lclient!lia;")
	private Class224 aClass224_2 = null;

	@OriginalMember(owner = "client!nca", name = "L", descriptor = "I")
	public int anInt6802;

	@OriginalMember(owner = "client!nca", name = "x", descriptor = "Lclient!lla;")
	private final Class147 aClass147_1;

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "Z")
	private final boolean aBoolean573;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!lla;ZI)V")
	public Class254(@OriginalArg(0) Class147 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.anInt6802 = arg2;
		this.aClass147_1 = arg0;
		this.aBoolean573 = arg1;
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(ILjava/lang/String;)Z")
	public boolean method6069(@OriginalArg(1) String arg0) {
		if (this.method6080()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass224_2.aClass272_1.method6598(Static100.method1531(local19));
			return this.method6095(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method6070(@OriginalArg(1) String arg0) {
		if (this.method6080()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass224_2.aClass272_1.method6598(Static100.method1531(local19));
			return local28 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BII)Z")
	public boolean method6071(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method6102(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method6098(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(II)Z")
	public boolean method6072(@OriginalArg(0) int arg0) {
		if (!this.method6080()) {
			return false;
		} else if (this.aClass224_2.anIntArray388.length == 1) {
			return this.method6071(0, arg0);
		} else if (!this.method6083(arg0)) {
			return false;
		} else if (this.aClass224_2.anIntArray388[arg0] == 1) {
			return this.method6071(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "(II)I")
	public int method6074(@OriginalArg(1) int arg0) {
		if (this.method6080()) {
			@Pc(25) int local25 = this.aClass224_2.aClass272_1.method6598(arg0);
			return this.method6083(local25) ? local25 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)I")
	public int method6075() {
		if (!this.method6080()) {
			throw new IllegalStateException("");
		}
		return this.aClass224_2.anInt5830;
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)V")
	public void method6076() {
		if (this.anObjectArray3 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray3.length; local6++) {
				this.anObjectArray3[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method6077(@OriginalArg(0) String arg0) {
		if (this.method6080()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass224_2.aClass272_1.method6598(Static100.method1531(local13));
			return this.method6083(local30) ? local30 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method6078(@OriginalArg(1) String arg0) {
		if (this.method6080()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass224_2.aClass272_1.method6598(Static100.method1531(local12));
			this.method6103(local29);
		}
	}

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "(II)[B")
	public byte[] method6079(@OriginalArg(0) int arg0) {
		if (!this.method6080()) {
			return null;
		} else if (this.aClass224_2.anIntArray388.length == 1) {
			return this.method6087(arg0, 0);
		} else if (!this.method6083(arg0)) {
			return null;
		} else if (this.aClass224_2.anIntArray388[arg0] == 1) {
			return this.method6087(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)Z")
	private boolean method6080() {
		if (this.aClass224_2 == null) {
			this.aClass224_2 = this.aClass147_1.method3237();
			if (this.aClass224_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass224_2.anInt5834][];
			this.anObjectArray3 = new Object[this.aClass224_2.anInt5834];
		}
		return true;
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(II)I")
	private int method6082(@OriginalArg(0) int arg0) {
		if (this.method6083(arg0)) {
			return this.anObjectArray3[arg0] == null ? this.aClass147_1.method3241(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BI)Z")
	private boolean method6083(@OriginalArg(1) int arg0) {
		if (!this.method6080()) {
			return false;
		} else if (arg0 >= 0 && this.aClass224_2.anIntArray388.length > arg0 && this.aClass224_2.anIntArray388[arg0] != 0) {
			return true;
		} else if (Static482.aBoolean674) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)I")
	public int method6084(@OriginalArg(0) byte arg0) {
		if (!this.method6080()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anObjectArray3.length; local18++) {
			if (this.aClass224_2.anIntArray386[local18] > 0) {
				local14 += 100;
				local16 += this.method6082(local18);
			}
		}
		if (arg0 <= 9) {
			this.method6078((String) null);
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZBZ)V")
	public void method6085(@OriginalArg(2) boolean arg0) {
		if (!this.method6080()) {
			return;
		}
		this.aClass224_2.aClass272Array1 = null;
		this.aClass224_2.anIntArrayArray40 = null;
		if (arg0) {
			this.aClass224_2.aClass272_1 = null;
			this.aClass224_2.anIntArray384 = null;
		}
	}

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "(II)V")
	public void method6086(@OriginalArg(1) int arg0) {
		if (this.method6083(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)[B")
	public byte[] method6087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method6099((int[]) null, arg1, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(II)[I")
	public int[] method6088(@OriginalArg(1) int arg0) {
		if (!this.method6083(arg0)) {
			return null;
		}
		@Pc(19) int[] local19 = this.aClass224_2.anIntArrayArray39[arg0];
		if (local19 == null) {
			local19 = new int[this.aClass224_2.anIntArray386[arg0]];
			@Pc(36) int local36 = 0;
			while (local19.length > local36) {
				local19[local36] = local36++;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(Z)Z")
	public boolean method6089() {
		if (!this.method6080()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass224_2.anIntArray387.length; local16++) {
			@Pc(26) int local26 = this.aClass224_2.anIntArray387[local16];
			if (this.anObjectArray3[local26] == null) {
				this.method6098(local26);
				if (this.anObjectArray3[local26] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method6090(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = this.method6077("");
		return local16 == -1 ? this.method6097("", arg0) : this.method6097(arg0, "");
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "([IBII)Z")
	private boolean method6091(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method6083(arg1)) {
			return false;
		} else if (this.anObjectArray3[arg1] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass224_2.anIntArray386[arg1];
			@Pc(33) int[] local33 = this.aClass224_2.anIntArrayArray39[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass224_2.anIntArray388[arg1]];
			}
			@Pc(55) Object[] local55 = this.anObjectArrayArray1[arg1];
			@Pc(57) boolean local57 = true;
			for (@Pc(59) int local59 = 0; local59 < local27; local59++) {
				@Pc(67) int local67;
				if (local33 == null) {
					local67 = local59;
				} else {
					local67 = local33[local59];
				}
				if (local55[local67] == null) {
					local57 = false;
					break;
				}
			}
			if (local57) {
				return true;
			}
			@Pc(145) byte[] local145;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local145 = Static524.method7384(false, this.anObjectArray3[arg1]);
			} else {
				local145 = Static524.method7384(true, this.anObjectArray3[arg1]);
				@Pc(162) Class2_Sub20 local162 = new Class2_Sub20(local145);
				local162.method8574(arg0, local162.aByteArray111.length);
			}
			@Pc(176) byte[] local176;
			try {
				local176 = Static586.method8131(local145);
			} catch (@Pc(178) RuntimeException local178) {
				throw Static686.method9236(local178, "T3 - " + (arg0 != null) + "," + arg1 + "," + local145.length + "," + Static552.method4268(local145.length, local145) + "," + Static552.method4268(local145.length - 2, local145) + "," + this.aClass224_2.anIntArray385[arg1] + "," + this.aClass224_2.anInt5830);
			}
			if (this.aBoolean573) {
				this.anObjectArray3[arg1] = null;
			}
			@Pc(263) int local263;
			if (local27 <= 1) {
				if (local33 == null) {
					local263 = 0;
				} else {
					local263 = local33[0];
				}
				if (this.anInt6802 == 0) {
					local55[local263] = Static195.method2764(local176);
				} else {
					local55[local263] = local176;
				}
			} else {
				@Pc(307) int local307;
				@Pc(320) Class2_Sub20 local320;
				@Pc(328) int local328;
				@Pc(334) int local334;
				@Pc(336) int local336;
				@Pc(400) int local400;
				@Pc(402) int local402;
				@Pc(408) int local408;
				@Pc(410) int local410;
				if (this.anInt6802 == 2) {
					local263 = local176.length;
					local263--;
					local307 = local176[local263] & 0xFF;
					local263 -= local27 * 4 * local307;
					local320 = new Class2_Sub20(local176);
					@Pc(537) int local537 = 0;
					local328 = 0;
					local320.anInt9723 = local263;
					for (local334 = 0; local334 < local307; local334++) {
						local336 = 0;
						for (local400 = 0; local400 < local27; local400++) {
							local336 += local320.method8555(-9372);
							if (local33 == null) {
								local402 = local400;
							} else {
								local402 = local33[local400];
							}
							if (local402 == arg2) {
								local537 += local336;
								local328 = local402;
							}
						}
					}
					if (local537 == 0) {
						return true;
					}
					@Pc(607) byte[] local607 = new byte[local537];
					local320.anInt9723 = local263;
					local537 = 0;
					local400 = 0;
					for (local402 = 0; local402 < local307; local402++) {
						local408 = 0;
						for (local410 = 0; local410 < local27; local410++) {
							local408 += local320.method8555(-9372);
							@Pc(638) int local638;
							if (local33 == null) {
								local638 = local410;
							} else {
								local638 = local33[local410];
							}
							if (arg2 == local638) {
								Static728.method274(local176, local400, local607, local537, local408);
								local537 += local408;
							}
							local400 += local408;
						}
					}
					local55[local328] = local607;
				} else {
					local263 = local176.length;
					local263--;
					local307 = local176[local263] & 0xFF;
					local263 -= local27 * 4 * local307;
					local320 = new Class2_Sub20(local176);
					@Pc(323) int[] local323 = new int[local27];
					local320.anInt9723 = local263;
					for (local328 = 0; local328 < local307; local328++) {
						local334 = 0;
						for (local336 = 0; local336 < local27; local336++) {
							local334 += local320.method8555(-9372);
							local323[local336] += local334;
						}
					}
					@Pc(368) byte[][] local368 = new byte[local27][];
					for (local336 = 0; local336 < local27; local336++) {
						local368[local336] = new byte[local323[local336]];
						local323[local336] = 0;
					}
					local320.anInt9723 = local263;
					local400 = 0;
					for (local402 = 0; local402 < local307; local402++) {
						local408 = 0;
						for (local410 = 0; local410 < local27; local410++) {
							local408 += local320.method8555(-9372);
							Static728.method274(local176, local400, local368[local410], local323[local410], local408);
							local400 += local408;
							local323[local410] += local408;
						}
					}
					for (local408 = 0; local408 < local27; local408++) {
						if (local33 == null) {
							local410 = local408;
						} else {
							local410 = local33[local408];
						}
						if (this.anInt6802 == 0) {
							local55[local410] = Static195.method2764(local368[local408]);
						} else {
							local55[local410] = local368[local408];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method6092(@OriginalArg(0) String arg0) {
		if (this.method6080()) {
			@Pc(24) String local24 = arg0.toLowerCase();
			@Pc(33) int local33 = this.aClass224_2.aClass272_1.method6598(Static100.method1531(local24));
			return this.method6082(local33);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)I")
	public int method6094() {
		return this.method6080() ? this.aClass224_2.anIntArray388.length : -1;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(II)Z")
	public boolean method6095(@OriginalArg(0) int arg0) {
		if (!this.method6083(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method6098(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(I)V")
	public void method6096() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray1.length; local15++) {
				this.anObjectArrayArray1[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	private boolean method6097(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6080()) {
			return false;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass224_2.aClass272_1.method6598(Static100.method1531(local13));
		if (this.method6083(local31)) {
			@Pc(50) int local50 = this.aClass224_2.aClass272Array1[local31].method6598(Static100.method1531(local16));
			return this.method6071(local31, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ)V")
	private void method6098(@OriginalArg(0) int arg0) {
		if (this.aBoolean573) {
			this.anObjectArray3[arg0] = this.aClass147_1.method3240(arg0);
		} else {
			this.anObjectArray3[arg0] = Static195.method2764(this.aClass147_1.method3240(arg0));
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I[III)[B")
	public byte[] method6099(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method6102(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(35) boolean local35 = this.method6091(arg0, arg1, arg2);
			if (!local35) {
				this.method6098(arg1);
				local35 = this.method6091(arg0, arg1, arg2);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(69) byte[] local69 = Static524.method7384(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt6802 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass224_2.anIntArray388[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt6802 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local69;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z")
	public boolean method6100(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6080()) {
			return false;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(25) String local25 = arg0.toLowerCase();
		@Pc(34) int local34 = this.aClass224_2.aClass272_1.method6598(Static100.method1531(local13));
		if (local34 < 0) {
			return false;
		} else {
			@Pc(50) int local50 = this.aClass224_2.aClass272Array1[local34].method6598(Static100.method1531(local25));
			return local50 >= 0;
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(BI)I")
	public int method6101(@OriginalArg(1) int arg0) {
		return this.method6083(arg0) ? this.aClass224_2.anIntArray388[arg0] : 0;
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(III)Z")
	private boolean method6102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method6080()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass224_2.anIntArray388.length && arg1 < this.aClass224_2.anIntArray388[arg0]) {
			return true;
		} else if (Static482.aBoolean674) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "(II)V")
	private void method6103(@OriginalArg(0) int arg0) {
		this.aClass147_1.method3243(arg0);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method6104(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6080()) {
			return null;
		}
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(22) String local22 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass224_2.aClass272_1.method6598(Static100.method1531(local19));
		if (this.method6083(local31)) {
			@Pc(50) int local50 = this.aClass224_2.aClass272Array1[local31].method6598(Static100.method1531(local22));
			return this.method6087(local50, local31);
		} else {
			return null;
		}
	}
}
