import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class171 {

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "Lclient!ba;")
	private Class15 aClass15_1 = null;

	@OriginalMember(owner = "client!nl", name = "N", descriptor = "Lclient!bb;")
	private final Class16 aClass16_1;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "Z")
	private final boolean aBoolean310;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
	public int anInt4076;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!bb;ZI)V")
	public Class171(@OriginalArg(0) Class16 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass16_1 = arg0;
		this.aBoolean310 = arg1;
		this.anInt4076 = arg2;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method3737(@OriginalArg(0) String arg0) {
		if (this.method3754()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass15_1.aClass97_1.method2515(Static85.method1522(local12));
			return this.method3765(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method3738(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3754()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass15_1.aClass97_1.method2515(Static85.method1522(local12));
		if (this.method3746(local24)) {
			@Pc(42) int local42 = this.aClass15_1.aClass97Array1[local24].method2515(Static85.method1522(local15));
			return this.method3745(local24, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Z")
	public boolean method3739(@OriginalArg(1) int arg0) {
		if (!this.method3754()) {
			return false;
		} else if (this.aClass15_1.anIntArray92.length == 1) {
			return this.method3761(arg0, 0);
		} else if (!this.method3746(arg0)) {
			return false;
		} else if (this.aClass15_1.anIntArray92[arg0] == 1) {
			return this.method3761(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)I")
	public int method3741() {
		if (!this.method3754()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray34.length; local17++) {
			if (this.aClass15_1.anIntArray95[local17] > 0) {
				local13 += 100;
				local15 += this.method3765(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z")
	public boolean method3742(@OriginalArg(1) int arg0) {
		if (!this.method3746(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method3756(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	public void method3743() {
		if (this.anObjectArray34 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray34.length; local16++) {
				this.anObjectArray34[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZZ)V")
	public void method3744(@OriginalArg(1) boolean arg0) {
		if (!this.method3754()) {
			return;
		}
		this.aClass15_1.aClass97Array1 = null;
		this.aClass15_1.anIntArrayArray3 = null;
		if (arg0) {
			this.aClass15_1.aClass97_1 = null;
			this.aClass15_1.anIntArray94 = null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)[B")
	public byte[] method3745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3764(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Z")
	private boolean method3746(@OriginalArg(1) int arg0) {
		if (!this.method3754()) {
			return false;
		} else if (arg0 >= 0 && this.aClass15_1.anIntArray92.length > arg0 && this.aClass15_1.anIntArray92[arg0] != 0) {
			return true;
		} else if (Static293.aBoolean464) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII[I)Z")
	private boolean method3747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method3746(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass15_1.anIntArray95[arg0];
			@Pc(29) int[] local29 = this.aClass15_1.anIntArrayArray2[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass15_1.anIntArray92[arg0]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg0];
			@Pc(51) boolean local51 = true;
			for (@Pc(59) int local59 = 0; local59 < local23; local59++) {
				@Pc(66) int local66;
				if (local29 == null) {
					local66 = local59;
				} else {
					local66 = local29[local59];
				}
				if (local49[local66] == null) {
					local51 = false;
					break;
				}
			}
			if (local51) {
				return true;
			}
			@Pc(110) byte[] local110;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local110 = Static226.method5463(this.anObjectArray34[arg0], false);
			} else {
				local110 = Static226.method5463(this.anObjectArray34[arg0], true);
				@Pc(115) Class2_Sub16 local115 = new Class2_Sub16(local110);
				local115.method5375(arg2, local115.aByteArray112.length);
			}
			@Pc(136) byte[] local136;
			try {
				local136 = Static225.method3692(local110);
			} catch (@Pc(138) RuntimeException local138) {
				throw Static192.method3300(local138, "T3 - " + (arg2 != null) + "," + arg0 + "," + local110.length + "," + Static121.method2478(local110, local110.length) + "," + Static121.method2478(local110, local110.length - 2) + "," + this.aClass15_1.anIntArray97[arg0] + "," + this.aClass15_1.anInt431);
			}
			if (this.aBoolean310) {
				this.anObjectArray34[arg0] = null;
			}
			@Pc(213) int local213;
			if (local23 > 1) {
				@Pc(220) int local220;
				@Pc(233) Class2_Sub16 local233;
				@Pc(237) int local237;
				@Pc(242) int local242;
				@Pc(245) int local245;
				@Pc(247) int local247;
				@Pc(258) int local258;
				@Pc(310) int local310;
				@Pc(312) int local312;
				if (this.anInt4076 == 2) {
					local213 = local136.length;
					@Pc(216) int local216 = local213 - 1;
					local220 = local136[local216] & 0xFF;
					@Pc(228) int local228 = local216 - local23 * 4 * local220;
					local233 = new Class2_Sub16(local136);
					@Pc(235) int local235 = 0;
					local237 = 0;
					local233.anInt6145 = local228;
					for (local242 = 0; local242 < local220; local242++) {
						local245 = 0;
						for (local247 = 0; local247 < local23; local247++) {
							local245 += local233.method5346();
							if (local29 == null) {
								local258 = local247;
							} else {
								local258 = local29[local247];
							}
							if (local258 == arg1) {
								local235 += local245;
								local237 = local258;
							}
						}
					}
					if (local235 == 0) {
						return true;
					}
					@Pc(298) byte[] local298 = new byte[local235];
					local235 = 0;
					local233.anInt6145 = local228;
					local247 = 0;
					for (local258 = 0; local258 < local220; local258++) {
						local310 = 0;
						for (local312 = 0; local312 < local23; local312++) {
							local310 += local233.method5346();
							@Pc(325) int local325;
							if (local29 == null) {
								local325 = local312;
							} else {
								local325 = local29[local312];
							}
							if (local325 == arg1) {
								Static399.method2487(local136, local247, local298, local235, local310);
								local235 += local310;
							}
							local247 += local310;
						}
					}
					local49[local237] = local298;
				} else {
					local213 = local136.length;
					local213--;
					local220 = local136[local213] & 0xFF;
					local213 -= local23 * 4 * local220;
					local233 = new Class2_Sub16(local136);
					local233.anInt6145 = local213;
					@Pc(395) int[] local395 = new int[local23];
					for (local237 = 0; local237 < local220; local237++) {
						local242 = 0;
						for (local245 = 0; local245 < local23; local245++) {
							local242 += local233.method5346();
							local395[local245] += local242;
						}
					}
					@Pc(435) byte[][] local435 = new byte[local23][];
					for (local245 = 0; local245 < local23; local245++) {
						local435[local245] = new byte[local395[local245]];
						local395[local245] = 0;
					}
					local233.anInt6145 = local213;
					local247 = 0;
					for (local258 = 0; local258 < local220; local258++) {
						local310 = 0;
						for (local312 = 0; local312 < local23; local312++) {
							local310 += local233.method5346();
							Static399.method2487(local136, local247, local435[local312], local395[local312], local310);
							local247 += local310;
							local395[local312] += local310;
						}
					}
					for (local310 = 0; local310 < local23; local310++) {
						if (local29 == null) {
							local312 = local310;
						} else {
							local312 = local29[local310];
						}
						if (this.anInt4076 == 0) {
							local49[local312] = Static56.method929(local435[local310]);
						} else {
							local49[local312] = local435[local310];
						}
					}
				}
			} else {
				if (local29 == null) {
					local213 = 0;
				} else {
					local213 = local29[0];
				}
				if (this.anInt4076 == 0) {
					local49[local213] = Static56.method929(local136);
				} else {
					local49[local213] = local136;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V")
	private void method3748(@OriginalArg(0) int arg0) {
		this.aClass16_1.method4711(arg0);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)Z")
	public boolean method3749() {
		if (!this.method3754()) {
			return false;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass15_1.anIntArray96.length; local22++) {
			@Pc(30) int local30 = this.aClass15_1.anIntArray96[local22];
			if (this.anObjectArray34[local30] == null) {
				this.method3756(local30);
				if (this.anObjectArray34[local30] == null) {
					local20 = false;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(II)I")
	public int method3750(@OriginalArg(1) int arg0) {
		return this.method3746(arg0) ? this.aClass15_1.anIntArray92[arg0] : 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3751(@OriginalArg(0) String arg0) {
		if (this.method3754()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass15_1.aClass97_1.method2515(Static85.method1522(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3752(@OriginalArg(0) String arg0) {
		if (this.method3754()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass15_1.aClass97_1.method2515(Static85.method1522(local12));
			return this.method3742(local25);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "(II)V")
	public void method3753(@OriginalArg(1) int arg0) {
		if (this.method3746(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)Z")
	private boolean method3754() {
		if (this.aClass15_1 == null) {
			this.aClass15_1 = this.aClass16_1.method4714();
			if (this.aClass15_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass15_1.anInt430][];
			this.anObjectArray34 = new Object[this.aClass15_1.anInt430];
		}
		return true;
	}

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "(II)V")
	private void method3756(@OriginalArg(1) int arg0) {
		if (this.aBoolean310) {
			this.anObjectArray34[arg0] = this.aClass16_1.method4713(arg0);
		} else {
			this.anObjectArray34[arg0] = Static56.method929(this.aClass16_1.method4713(arg0));
		}
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(Ljava/lang/String;I)V")
	public void method3758(@OriginalArg(0) String arg0) {
		if (this.method3754()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass15_1.aClass97_1.method2515(Static85.method1522(local15));
			this.method3748(local24);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method3759(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3754()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass15_1.aClass97_1.method2515(Static85.method1522(local12));
		if (this.method3746(local31)) {
			@Pc(49) int local49 = this.aClass15_1.aClass97Array1[local31].method2515(Static85.method1522(local15));
			return this.method3761(local49, local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)I")
	public int method3760(@OriginalArg(0) int arg0) {
		if (this.method3754()) {
			@Pc(16) int local16 = this.aClass15_1.aClass97_1.method2515(arg0);
			return this.method3746(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(III)Z")
	public boolean method3761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3773(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray34[arg1] == null) {
			this.method3756(arg1);
			return this.anObjectArray34[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(BI)[B")
	public byte[] method3762(@OriginalArg(1) int arg0) {
		if (!this.method3754()) {
			return null;
		} else if (this.aClass15_1.anIntArray92.length == 1) {
			return this.method3745(0, arg0);
		} else if (!this.method3746(arg0)) {
			return null;
		} else if (this.aClass15_1.anIntArray92[arg0] == 1) {
			return this.method3745(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
	public void method3763() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArrayArray1.length; local4++) {
				this.anObjectArrayArray1[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([IBII)[B")
	public byte[] method3764(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method3773(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(30) boolean local30 = this.method3747(arg2, arg1, arg0);
			if (!local30) {
				this.method3756(arg2);
				local30 = this.method3747(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static226.method5463(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt4076 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass15_1.anIntArray92[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt4076 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "(II)I")
	private int method3765(@OriginalArg(1) int arg0) {
		if (this.method3746(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass16_1.method4715(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "(II)[I")
	public int[] method3767(@OriginalArg(1) int arg0) {
		if (!this.method3746(arg0)) {
			return null;
		}
		@Pc(20) int[] local20 = this.aClass15_1.anIntArrayArray2[arg0];
		if (local20 == null) {
			local20 = new int[this.aClass15_1.anIntArray95[arg0]];
			@Pc(31) int local31 = 0;
			while (local20.length > local31) {
				local20[local31] = local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method3769(@OriginalArg(0) String arg0) {
		if (this.method3754()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass15_1.aClass97_1.method2515(Static85.method1522(local20));
			return this.method3746(local31) ? local31 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)I")
	public int method3770() {
		return this.method3754() ? this.aClass15_1.anIntArray92.length : -1;
	}

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "(I)I")
	public int method3771() {
		if (!this.method3754()) {
			throw new IllegalStateException("");
		}
		return this.aClass15_1.anInt431;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)Z")
	private boolean method3773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3754()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass15_1.anIntArray92.length > arg0 && this.aClass15_1.anIntArray92[arg0] > arg1) {
			return true;
		} else if (Static293.aBoolean464) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}
}
