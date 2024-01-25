import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class384 {

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "Lclient!qia;")
	private Class287 aClass287_2 = null;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "Lclient!ud;")
	private final Class277 aClass277_1;

	@OriginalMember(owner = "client!wu", name = "M", descriptor = "Z")
	private final boolean aBoolean841;

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
	public int anInt10469;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!ud;ZI)V")
	public Class384(@OriginalArg(0) Class277 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass277_1 = arg0;
		this.aBoolean841 = arg1;
		this.anInt10469 = arg2;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZI)I")
	private int method8861(@OriginalArg(1) int arg0) {
		if (this.method8884(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass277_1.method6632(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
	public int method8862(@OriginalArg(0) int arg0) {
		return this.method8884(arg0) ? this.aClass287_2.anIntArray628[arg0] : 0;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V")
	private void method8863(@OriginalArg(0) int arg0) {
		if (this.aBoolean841) {
			this.anObjectArray32[arg0] = this.aClass277_1.method6636(arg0);
		} else {
			this.anObjectArray32[arg0] = Static434.method6481(this.aClass277_1.method6636(arg0));
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Z")
	private boolean method8864() {
		if (this.aClass287_2 == null) {
			this.aClass287_2 = this.aClass277_1.method6635();
			if (this.aClass287_2 == null) {
				return false;
			}
			this.anObjectArray32 = new Object[this.aClass287_2.anInt7873];
			this.anObjectArrayArray1 = new Object[this.aClass287_2.anInt7873][];
		}
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I")
	public int method8865() {
		return this.method8864() ? this.aClass287_2.anIntArray628.length : -1;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)Z")
	private boolean method8866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method8864()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass287_2.anIntArray628.length && this.aClass287_2.anIntArray628[arg1] > arg0) {
			return true;
		} else if (Static518.aBoolean711) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)I")
	public int method8867(@OriginalArg(0) int arg0) {
		if (this.method8864()) {
			@Pc(16) int local16 = this.aClass287_2.aClass147_1.method3310(arg0);
			return this.method8884(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	public void method8868() {
		if (this.anObjectArray32 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anObjectArray32.length; local13++) {
				this.anObjectArray32[local13] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)Z")
	public boolean method8869(@OriginalArg(1) int arg0) {
		if (!this.method8884(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method8863(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(II)V")
	private void method8870(@OriginalArg(0) int arg0) {
		this.aClass277_1.method6633(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
	public byte[] method8871(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method8864()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass287_2.aClass147_1.method3310(Static647.method8887(local12));
		if (this.method8884(local29)) {
			@Pc(47) int local47 = this.aClass287_2.aClass147Array1[local29].method3310(Static647.method8887(local20));
			return this.method8885(local29, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(II)V")
	public void method8872(@OriginalArg(1) int arg0) {
		if (this.method8884(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([IIII)[B")
	public byte[] method8874(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method8866(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(30) boolean local30 = this.method8888(arg0, arg2, arg1);
			if (!local30) {
				this.method8863(arg2);
				local30 = this.method8888(arg0, arg2, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static383.method5945(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt10469 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass287_2.anIntArray628[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt10469 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V")
	public void method8875() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method8876(@OriginalArg(0) String arg0) {
		if (this.method8864()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass287_2.aClass147_1.method3310(Static647.method8887(local18));
			return local27 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)Z")
	public boolean method8877() {
		if (!this.method8864()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass287_2.anIntArray630.length; local21++) {
			@Pc(29) int local29 = this.aClass287_2.anIntArray630[local21];
			if (this.anObjectArray32[local29] == null) {
				this.method8863(local29);
				if (this.anObjectArray32[local29] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(III)Z")
	public boolean method8878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method8866(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray32[arg1] == null) {
			this.method8863(arg1);
			return this.anObjectArray32[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method8879(@OriginalArg(1) String arg0) {
		if (this.method8864()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass287_2.aClass147_1.method3310(Static647.method8887(local12));
			return this.method8861(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(II)[I")
	public int[] method8881(@OriginalArg(0) int arg0) {
		if (!this.method8884(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass287_2.anIntArrayArray47[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass287_2.anIntArray629[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local26.length) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)I")
	public int method8882() {
		if (!this.method8864()) {
			throw new IllegalStateException("");
		}
		return this.aClass287_2.anInt7867;
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(II)Z")
	public boolean method8883(@OriginalArg(0) int arg0) {
		if (!this.method8864()) {
			return false;
		} else if (this.aClass287_2.anIntArray628.length == 1) {
			return this.method8878(arg0, 0);
		} else if (!this.method8884(arg0)) {
			return false;
		} else if (this.aClass287_2.anIntArray628[arg0] == 1) {
			return this.method8878(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)Z")
	private boolean method8884(@OriginalArg(1) int arg0) {
		if (!this.method8864()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass287_2.anIntArray628.length && this.aClass287_2.anIntArray628[arg0] != 0) {
			return true;
		} else if (Static518.aBoolean711) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BII)[B")
	public byte[] method8885(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method8874((int[]) null, arg1, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method8886(@OriginalArg(0) String arg0) {
		if (this.method8864()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass287_2.aClass147_1.method3310(Static647.method8887(local11));
			this.method8870(local20);
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([IIIZ)Z")
	private boolean method8888(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method8884(arg1)) {
			return false;
		} else if (this.anObjectArray32[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass287_2.anIntArray629[arg1];
			@Pc(31) int[] local31 = this.aClass287_2.anIntArrayArray47[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass287_2.anIntArray628[arg1]];
			}
			@Pc(56) Object[] local56 = this.anObjectArrayArray1[arg1];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local25; local60++) {
				@Pc(68) int local68;
				if (local31 == null) {
					local68 = local60;
				} else {
					local68 = local31[local60];
				}
				if (local56[local68] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local124 = Static383.method5945(this.anObjectArray32[arg1], false);
			} else {
				local124 = Static383.method5945(this.anObjectArray32[arg1], true);
				@Pc(139) Class5_Sub12 local139 = new Class5_Sub12(local124);
				local139.method8603(local139.aByteArray104.length, arg0);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static281.method4200(local124);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static522.method6793(local153, "T3 - " + (arg0 != null) + "," + arg1 + "," + local124.length + "," + Static487.method7154(local124.length, local124) + "," + Static487.method7154(local124.length - 2, local124) + "," + this.aClass287_2.anIntArray633[arg1] + "," + this.aClass287_2.anInt7867);
			}
			if (this.aBoolean841) {
				this.anObjectArray32[arg1] = null;
			}
			@Pc(223) int local223;
			if (local25 <= 1) {
				if (local31 == null) {
					local223 = 0;
				} else {
					local223 = local31[0];
				}
				if (this.anInt10469 == 0) {
					local56[local223] = Static434.method6481(local151);
				} else {
					local56[local223] = local151;
				}
			} else {
				@Pc(264) int local264;
				@Pc(277) Class5_Sub12 local277;
				@Pc(285) int local285;
				@Pc(289) int local289;
				@Pc(291) int local291;
				@Pc(349) int local349;
				@Pc(351) int local351;
				@Pc(355) int local355;
				@Pc(357) int local357;
				if (this.anInt10469 == 2) {
					local223 = local151.length;
					local223--;
					local264 = local151[local223] & 0xFF;
					local223 -= local264 * 4 * local25;
					local277 = new Class5_Sub12(local151);
					@Pc(471) int local471 = 0;
					local277.anInt10154 = local223;
					local285 = 0;
					for (local289 = 0; local289 < local264; local289++) {
						local291 = 0;
						for (local349 = 0; local349 < local25; local349++) {
							local291 += local277.method8623();
							if (local31 == null) {
								local351 = local349;
							} else {
								local351 = local31[local349];
							}
							if (local351 == arg2) {
								local285 = local351;
								local471 += local291;
							}
						}
					}
					if (local471 == 0) {
						return true;
					}
					@Pc(534) byte[] local534 = new byte[local471];
					local471 = 0;
					local277.anInt10154 = local223;
					local349 = 0;
					for (local351 = 0; local351 < local264; local351++) {
						local355 = 0;
						for (local357 = 0; local357 < local25; local357++) {
							local355 += local277.method8623();
							@Pc(561) int local561;
							if (local31 == null) {
								local561 = local357;
							} else {
								local561 = local31[local357];
							}
							if (local561 == arg2) {
								Static655.method4109(local151, local349, local534, local471, local355);
								local471 += local355;
							}
							local349 += local355;
						}
					}
					local56[local285] = local534;
				} else {
					local223 = local151.length;
					local223--;
					local264 = local151[local223] & 0xFF;
					local223 -= local25 * local264 * 4;
					local277 = new Class5_Sub12(local151);
					local277.anInt10154 = local223;
					@Pc(283) int[] local283 = new int[local25];
					for (local285 = 0; local285 < local264; local285++) {
						local289 = 0;
						for (local291 = 0; local291 < local25; local291++) {
							local289 += local277.method8623();
							local283[local291] += local289;
						}
					}
					@Pc(321) byte[][] local321 = new byte[local25][];
					for (local291 = 0; local291 < local25; local291++) {
						local321[local291] = new byte[local283[local291]];
						local283[local291] = 0;
					}
					local277.anInt10154 = local223;
					local349 = 0;
					for (local351 = 0; local351 < local264; local351++) {
						local355 = 0;
						for (local357 = 0; local357 < local25; local357++) {
							local355 += local277.method8623();
							Static655.method4109(local151, local349, local321[local357], local283[local357], local355);
							local349 += local355;
							local283[local357] += local355;
						}
					}
					for (local355 = 0; local355 < local25; local355++) {
						if (local31 == null) {
							local357 = local355;
						} else {
							local357 = local31[local355];
						}
						if (this.anInt10469 == 0) {
							local56[local357] = Static434.method6481(local321[local355]);
						} else {
							local56[local357] = local321[local355];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZZ)V")
	public void method8889(@OriginalArg(2) boolean arg0) {
		if (!this.method8864()) {
			return;
		}
		if (arg0) {
			this.aClass287_2.aClass147_1 = null;
			this.aClass287_2.anIntArray631 = null;
		}
		this.aClass287_2.aClass147Array1 = null;
		this.aClass287_2.anIntArrayArray46 = null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method8890(@OriginalArg(1) String arg0) {
		if (this.method8864()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass287_2.aClass147_1.method3310(Static647.method8887(local12));
			return this.method8884(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method8891(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method8864()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass287_2.aClass147_1.method3310(Static647.method8887(local12));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass287_2.aClass147Array1[local32].method3310(Static647.method8887(local23));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method8892(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method8890("");
		return local8 == -1 ? this.method8895("", arg0) : this.method8895(arg0, "");
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(II)[B")
	public byte[] method8893(@OriginalArg(1) int arg0) {
		if (!this.method8864()) {
			return null;
		} else if (this.aClass287_2.anIntArray628.length == 1) {
			return this.method8885(0, arg0);
		} else if (!this.method8884(arg0)) {
			return null;
		} else if (this.aClass287_2.anIntArray628[arg0] == 1) {
			return this.method8885(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method8894(@OriginalArg(0) String arg0) {
		if (this.method8864()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass287_2.aClass147_1.method3310(Static647.method8887(local18));
			return this.method8869(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method8895(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8864()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass287_2.aClass147_1.method3310(Static647.method8887(local12));
		if (this.method8884(local32)) {
			@Pc(50) int local50 = this.aClass287_2.aClass147Array1[local32].method3310(Static647.method8887(local15));
			return this.method8878(local50, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)I")
	public int method8896() {
		if (!this.method8864()) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray32.length; local25++) {
			if (this.aClass287_2.anIntArray629[local25] > 0) {
				local23 += this.method8861(local25);
				local21 += 100;
			}
		}
		if (local21 == 0) {
			return 100;
		} else {
			return local23 * 100 / local21;
		}
	}
}
