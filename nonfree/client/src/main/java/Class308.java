import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class308 {

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!sea", name = "M", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!sea", name = "h", descriptor = "Lclient!fga;")
	private Class99 aClass99_2 = null;

	@OriginalMember(owner = "client!sea", name = "G", descriptor = "Lclient!ig;")
	private final Class156 aClass156_1;

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "Z")
	private final boolean aBoolean612;

	@OriginalMember(owner = "client!sea", name = "O", descriptor = "I")
	public int anInt8167;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!ig;ZI)V")
	public Class308(@OriginalArg(0) Class156 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass156_1 = arg0;
		this.aBoolean612 = arg1;
		this.anInt8167 = arg2;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Z")
	public boolean method6535() {
		if (!this.method6544()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(24) int local24 = 0; local24 < this.aClass99_2.anIntArray122.length; local24++) {
			@Pc(32) int local32 = this.aClass99_2.anIntArray122[local24];
			if (this.anObjectArray32[local32] == null) {
				this.method6565(local32);
				if (this.anObjectArray32[local32] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method6536(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6544()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass99_2.aClass266_1.method5771(Static524.method1210(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(42) int local42 = this.aClass99_2.aClass266Array1[local24].method5771(Static524.method1210(local15));
			return local42 >= 0;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZZZ)V")
	public void method6537(@OriginalArg(0) boolean arg0) {
		if (!this.method6544()) {
			return;
		}
		this.aClass99_2.aClass266Array1 = null;
		this.aClass99_2.anIntArrayArray8 = null;
		if (arg0) {
			this.aClass99_2.aClass266_1 = null;
			this.aClass99_2.anIntArray117 = null;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Z")
	public boolean method6538(@OriginalArg(1) int arg0) {
		if (!this.method6544()) {
			return false;
		} else if (this.aClass99_2.anIntArray121.length == 1) {
			return this.method6545(arg0, 0);
		} else if (!this.method6542(arg0)) {
			return false;
		} else if (this.aClass99_2.anIntArray121[arg0] == 1) {
			return this.method6545(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method6539(@OriginalArg(1) String arg0) {
		if (this.method6544()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass99_2.aClass266_1.method5771(Static524.method1210(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6540(@OriginalArg(0) String arg0) {
		if (this.method6544()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass99_2.aClass266_1.method5771(Static524.method1210(local18));
			return this.method6566(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z")
	private boolean method6541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method6544()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass99_2.anIntArray121.length > arg1 && this.aClass99_2.anIntArray121[arg1] > arg0) {
			return true;
		} else if (Static177.aBoolean661) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(II)Z")
	private boolean method6542(@OriginalArg(1) int arg0) {
		if (!this.method6544()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass99_2.anIntArray121.length && this.aClass99_2.anIntArray121[arg0] != 0) {
			return true;
		} else if (Static177.aBoolean661) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)V")
	public void method6543() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray1.length; local16++) {
				this.anObjectArrayArray1[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)Z")
	private boolean method6544() {
		if (this.aClass99_2 == null) {
			this.aClass99_2 = this.aClass156_1.method4683();
			if (this.aClass99_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass99_2.anInt2727][];
			this.anObjectArray32 = new Object[this.aClass99_2.anInt2727];
		}
		return true;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(III)Z")
	public boolean method6545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method6541(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray32[arg1] == null) {
			this.method6565(arg1);
			return this.anObjectArray32[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(II)V")
	private void method6546(@OriginalArg(1) int arg0) {
		this.aClass156_1.method4687(arg0);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)[B")
	public byte[] method6547(@OriginalArg(1) int arg0) {
		if (!this.method6544()) {
			return null;
		} else if (this.aClass99_2.anIntArray121.length == 1) {
			return this.method6569(0, arg0);
		} else if (!this.method6542(arg0)) {
			return null;
		} else if (this.aClass99_2.anIntArray121[arg0] == 1) {
			return this.method6569(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)I")
	public int method6548(@OriginalArg(0) int arg0) {
		if (this.method6544()) {
			@Pc(22) int local22 = this.aClass99_2.aClass266_1.method5771(arg0);
			return this.method6542(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[II)[B")
	public byte[] method6549(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method6541(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(37) boolean local37 = this.method6555(arg2, arg0, arg1);
			if (!local37) {
				this.method6565(arg2);
				local37 = this.method6555(arg2, arg0, arg1);
				if (!local37) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static42.method745(false, this.anObjectArrayArray1[arg2][arg0]);
		if (this.anInt8167 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass99_2.anIntArray121[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt8167 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local64;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)I")
	private int method6551(@OriginalArg(0) int arg0) {
		if (this.method6542(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass156_1.method4686(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method6552(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = this.method6558("");
		return local8 == -1 ? this.method6554(arg0, "") : this.method6554("", arg0);
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(ZLjava/lang/String;)I")
	public int method6553(@OriginalArg(1) String arg0) {
		if (this.method6544()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass99_2.aClass266_1.method5771(Static524.method1210(local12));
			return this.method6551(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	private boolean method6554(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6544()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass99_2.aClass266_1.method5771(Static524.method1210(local12));
		if (this.method6542(local24)) {
			@Pc(42) int local42 = this.aClass99_2.aClass266Array1[local24].method5771(Static524.method1210(local15));
			return this.method6545(local42, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[IB)Z")
	private boolean method6555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method6542(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass99_2.anIntArray118[arg0];
			@Pc(31) int[] local31 = this.aClass99_2.anIntArrayArray9[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass99_2.anIntArray121[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(59) boolean local59 = true;
			for (@Pc(61) int local61 = 0; local61 < local25; local61++) {
				@Pc(67) int local67;
				if (local31 == null) {
					local67 = local61;
				} else {
					local67 = local31[local61];
				}
				if (local51[local67] == null) {
					local59 = false;
					break;
				}
			}
			if (local59) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local124 = Static42.method745(false, this.anObjectArray32[arg0]);
			} else {
				local124 = Static42.method745(true, this.anObjectArray32[arg0]);
				@Pc(141) Class1_Sub3 local141 = new Class1_Sub3(local124);
				local141.method7925(arg2, local141.aByteArray104.length);
			}
			@Pc(153) byte[] local153;
			try {
				local153 = Static258.method3756(local124);
			} catch (@Pc(155) RuntimeException local155) {
				throw Static517.method7176(local155, "T3 - " + (arg2 != null) + "," + arg0 + "," + local124.length + "," + Static330.method4877(local124.length, local124) + "," + Static330.method4877(local124.length - 2, local124) + "," + this.aClass99_2.anIntArray119[arg0] + "," + this.aClass99_2.anInt2731);
			}
			if (this.aBoolean612) {
				this.anObjectArray32[arg0] = null;
			}
			@Pc(234) int local234;
			if (local25 > 1) {
				@Pc(241) int local241;
				@Pc(254) Class1_Sub3 local254;
				@Pc(262) int local262;
				@Pc(266) int local266;
				@Pc(268) int local268;
				@Pc(326) int local326;
				@Pc(328) int local328;
				@Pc(332) int local332;
				@Pc(334) int local334;
				if (this.anInt8167 == 2) {
					local234 = local153.length;
					local234--;
					local241 = local153[local234] & 0xFF;
					local234 -= local241 * local25 * 4;
					local254 = new Class1_Sub3(local153);
					@Pc(444) int local444 = 0;
					local254.anInt9802 = local234;
					local262 = 0;
					for (local266 = 0; local266 < local241; local266++) {
						local268 = 0;
						for (local326 = 0; local326 < local25; local326++) {
							local268 += local254.method7940();
							if (local31 == null) {
								local328 = local326;
							} else {
								local328 = local31[local326];
							}
							if (arg1 == local328) {
								local444 += local268;
								local262 = local328;
							}
						}
					}
					if (local444 == 0) {
						return true;
					}
					@Pc(506) byte[] local506 = new byte[local444];
					local254.anInt9802 = local234;
					local444 = 0;
					local326 = 0;
					for (local328 = 0; local328 < local241; local328++) {
						local332 = 0;
						for (local334 = 0; local334 < local25; local334++) {
							local332 += local254.method7940();
							@Pc(533) int local533;
							if (local31 == null) {
								local533 = local334;
							} else {
								local533 = local31[local334];
							}
							if (arg1 == local533) {
								Static598.method774(local153, local326, local506, local444, local332);
								local444 += local332;
							}
							local326 += local332;
						}
					}
					local51[local262] = local506;
				} else {
					local234 = local153.length;
					@Pc(236) int local236 = local234 - 1;
					local241 = local153[local236] & 0xFF;
					@Pc(249) int local249 = local236 - local25 * local241 * 4;
					local254 = new Class1_Sub3(local153);
					@Pc(257) int[] local257 = new int[local25];
					local254.anInt9802 = local249;
					for (local262 = 0; local262 < local241; local262++) {
						local266 = 0;
						for (local268 = 0; local268 < local25; local268++) {
							local266 += local254.method7940();
							local257[local268] += local266;
						}
					}
					@Pc(298) byte[][] local298 = new byte[local25][];
					for (local268 = 0; local268 < local25; local268++) {
						local298[local268] = new byte[local257[local268]];
						local257[local268] = 0;
					}
					local254.anInt9802 = local249;
					local326 = 0;
					for (local328 = 0; local328 < local241; local328++) {
						local332 = 0;
						for (local334 = 0; local334 < local25; local334++) {
							local332 += local254.method7940();
							Static598.method774(local153, local326, local298[local334], local257[local334], local332);
							local257[local334] += local332;
							local326 += local332;
						}
					}
					for (local332 = 0; local332 < local25; local332++) {
						if (local31 == null) {
							local334 = local332;
						} else {
							local334 = local31[local332];
						}
						if (this.anInt8167 == 0) {
							local51[local334] = Static161.method2652(local298[local332]);
						} else {
							local51[local334] = local298[local332];
						}
					}
				}
			} else {
				if (local31 == null) {
					local234 = 0;
				} else {
					local234 = local31[0];
				}
				if (this.anInt8167 == 0) {
					local51[local234] = Static161.method2652(local153);
				} else {
					local51[local234] = local153;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!sea", name = "d", descriptor = "(II)V")
	public void method6556(@OriginalArg(0) int arg0) {
		if (this.method6542(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method6557(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6544()) {
			return null;
		}
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(24) String local24 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass99_2.aClass266_1.method5771(Static524.method1210(local21));
		if (this.method6542(local33)) {
			@Pc(51) int local51 = this.aClass99_2.aClass266Array1[local33].method5771(Static524.method1210(local24));
			return this.method6569(local33, local51);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method6558(@OriginalArg(0) String arg0) {
		if (this.method6544()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass99_2.aClass266_1.method5771(Static524.method1210(local12));
			return this.method6542(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method6559(@OriginalArg(1) String arg0) {
		if (this.method6544()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass99_2.aClass266_1.method5771(Static524.method1210(local19));
			this.method6546(local28);
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(Z)V")
	public void method6561() {
		if (this.anObjectArray32 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray32.length; local6++) {
				this.anObjectArray32[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)I")
	public int method6562() {
		if (!this.method6544()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray32.length; local17++) {
			if (this.aClass99_2.anIntArray118[local17] > 0) {
				local15 += this.method6551(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "(B)I")
	public int method6564() {
		return this.method6544() ? this.aClass99_2.anIntArray121.length : -1;
	}

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "(II)V")
	private void method6565(@OriginalArg(1) int arg0) {
		if (this.aBoolean612) {
			this.anObjectArray32[arg0] = this.aClass156_1.method4688(arg0);
		} else {
			this.anObjectArray32[arg0] = Static161.method2652(this.aClass156_1.method4688(arg0));
		}
	}

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "(II)Z")
	public boolean method6566(@OriginalArg(0) int arg0) {
		if (!this.method6542(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method6565(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sea", name = "f", descriptor = "(B)I")
	public int method6567() {
		if (!this.method6544()) {
			throw new IllegalStateException("");
		}
		return this.aClass99_2.anInt2731;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(IZ)I")
	public int method6568(@OriginalArg(0) int arg0) {
		return this.method6542(arg0) ? this.aClass99_2.anIntArray121[arg0] : 0;
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(III)[B")
	public byte[] method6569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method6549(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!sea", name = "g", descriptor = "(II)[I")
	public int[] method6570(@OriginalArg(1) int arg0) {
		if (!this.method6542(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass99_2.anIntArrayArray9[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass99_2.anIntArray118[arg0]];
			@Pc(29) int local29 = 0;
			while (local18.length > local29) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}
}
