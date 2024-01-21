import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class2_Sub4_Sub4 extends Class2_Sub4 {

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!cg", name = "U", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!cg", name = "ab", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!cg", name = "qb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!cg", name = "Db", descriptor = "I")
	public int anInt869;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
	public int anInt842 = -1;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
	public int anInt841 = -1;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "Z")
	public boolean aBoolean30 = true;

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
	private int anInt843 = 128;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
	public int anInt840 = -1;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "Lclient!gg;")
	public Class28 aClass28_534 = Static4.aClass28_64;

	@OriginalMember(owner = "client!cg", name = "db", descriptor = "S")
	public short aShort5 = 0;

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
	private int anInt847 = 0;

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
	public int anInt849 = -1;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
	private int anInt844 = 128;

	@OriginalMember(owner = "client!cg", name = "jb", descriptor = "[Lclient!gg;")
	public final Class28[] aClass28Array10 = new Class28[5];

	@OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
	private int anInt850 = -1;

	@OriginalMember(owner = "client!cg", name = "Ab", descriptor = "I")
	private int anInt866 = -1;

	@OriginalMember(owner = "client!cg", name = "ib", descriptor = "Z")
	public boolean aBoolean31 = true;

	@OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
	public int anInt853 = 32;

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
	public int anInt846 = -1;

	@OriginalMember(owner = "client!cg", name = "sb", descriptor = "I")
	private int anInt860 = 0;

	@OriginalMember(owner = "client!cg", name = "kb", descriptor = "I")
	public int anInt854 = 1;

	@OriginalMember(owner = "client!cg", name = "mb", descriptor = "S")
	public short aShort6 = 0;

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
	public int anInt848 = -1;

	@OriginalMember(owner = "client!cg", name = "Eb", descriptor = "Z")
	public boolean aBoolean33 = true;

	@OriginalMember(owner = "client!cg", name = "Fb", descriptor = "I")
	public int anInt870 = -1;

	@OriginalMember(owner = "client!cg", name = "wb", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!cg", name = "Cb", descriptor = "I")
	public int anInt868 = -1;

	@OriginalMember(owner = "client!cg", name = "zb", descriptor = "I")
	public int anInt865 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ah;II)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method583(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray66 != null) {
			@Pc(12) Class2_Sub4_Sub4 local12 = this.method595();
			return local12 == null ? null : local12.method583(arg0, arg1);
		} else if (this.anIntArray65 == null) {
			return null;
		} else {
			@Pc(35) Class2_Sub4_Sub1_Sub3 local35 = (Class2_Sub4_Sub1_Sub3) Static8.aClass14_26.method603((long) this.anInt869);
			if (local35 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray65.length; local41++) {
					if (!Static43.aClass40_13.method1783(this.anIntArray65[local41], 0)) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(69) Class2_Sub4_Sub1_Sub5[] local69 = new Class2_Sub4_Sub1_Sub5[this.anIntArray65.length];
				for (@Pc(71) int local71 = 0; local71 < this.anIntArray65.length; local71++) {
					local69[local71] = Static86.method1530(Static43.aClass40_13, this.anIntArray65[local71]);
				}
				@Pc(106) Class2_Sub4_Sub1_Sub5 local106;
				if (local69.length == 1) {
					local106 = local69[0];
				} else {
					local106 = new Class2_Sub4_Sub1_Sub5(local69, local69.length);
				}
				@Pc(117) int local117;
				if (this.aShortArray6 != null) {
					for (local117 = 0; local117 < this.aShortArray6.length; local117++) {
						local106.method1531(this.aShortArray6[local117], this.aShortArray8[local117]);
					}
				}
				if (this.aShortArray5 != null) {
					for (local117 = 0; local117 < this.aShortArray5.length; local117++) {
						local106.method1537(this.aShortArray5[local117], this.aShortArray7[local117]);
					}
				}
				local35 = local106.method1544(64, 768, -50, -10, -50, true);
				Static8.aClass14_26.method607((long) this.anInt869, local35);
			}
			if (arg0 != null) {
				local35 = arg0.method311(arg1, local35);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	public void method584() {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ab;Z)V")
	public void method585(@OriginalArg(0) Class2_Sub2 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1698();
			if (local15 == 0) {
				return;
			}
			this.method590(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ah;IILclient!ah;I)Lclient!df;")
	public Class2_Sub4_Sub1_Sub3 method589(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub4_Sub2 arg3) {
		if (this.anIntArray66 != null) {
			@Pc(12) Class2_Sub4_Sub4 local12 = this.method595();
			return local12 == null ? null : local12.method589(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class2_Sub4_Sub1_Sub3 local32 = (Class2_Sub4_Sub1_Sub3) Static166.aClass14_187.method603((long) this.anInt869);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray67.length; local38++) {
				if (!Static43.aClass40_13.method1783(this.anIntArray67[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class2_Sub4_Sub1_Sub5[] local70 = new Class2_Sub4_Sub1_Sub5[this.anIntArray67.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray67.length; local72++) {
				local70[local72] = Static86.method1530(Static43.aClass40_13, this.anIntArray67[local72]);
			}
			@Pc(103) Class2_Sub4_Sub1_Sub5 local103;
			if (local70.length == 1) {
				local103 = local70[0];
			} else {
				local103 = new Class2_Sub4_Sub1_Sub5(local70, local70.length);
			}
			@Pc(114) int local114;
			if (this.aShortArray6 != null) {
				for (local114 = 0; local114 < this.aShortArray6.length; local114++) {
					local103.method1531(this.aShortArray6[local114], this.aShortArray8[local114]);
				}
			}
			if (this.aShortArray5 != null) {
				for (local114 = 0; local114 < this.aShortArray5.length; local114++) {
					local103.method1537(this.aShortArray5[local114], this.aShortArray7[local114]);
				}
			}
			local32 = local103.method1544(this.anInt847 + 64, this.anInt860 + 850, -30, -50, -30, true);
			Static166.aClass14_187.method607((long) this.anInt869, local32);
		}
		@Pc(199) Class2_Sub4_Sub1_Sub3 local199;
		if (arg0 != null && arg3 != null) {
			local199 = arg0.method306(arg3, arg2, arg1, local32);
		} else if (arg0 != null) {
			local199 = arg0.method315(arg1, local32);
		} else if (arg3 == null) {
			local199 = local32.method1201(true);
		} else {
			local199 = arg3.method315(arg2, local32);
		}
		if (this.anInt844 != 128 || this.anInt843 != 128) {
			local199.method1189(this.anInt844, this.anInt843, this.anInt844);
		}
		return local199;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ab;IB)V")
	private void method590(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(78) int local78;
		@Pc(88) int local88;
		if (arg1 == 1) {
			local78 = arg0.method1698();
			this.anIntArray67 = new int[local78];
			for (local88 = 0; local88 < local78; local88++) {
				this.anIntArray67[local88] = arg0.method1680();
			}
		} else if (arg1 == 2) {
			this.aClass28_534 = arg0.method1662();
		} else if (arg1 == 12) {
			this.anInt854 = arg0.method1698();
		} else if (arg1 == 13) {
			this.anInt841 = arg0.method1680();
		} else if (arg1 == 14) {
			this.anInt849 = arg0.method1680();
		} else if (arg1 == 15) {
			this.anInt848 = arg0.method1680();
		} else if (arg1 == 16) {
			this.anInt840 = arg0.method1680();
		} else if (arg1 == 17) {
			this.anInt849 = arg0.method1680();
			this.anInt865 = arg0.method1680();
			this.anInt868 = arg0.method1680();
			this.anInt842 = arg0.method1680();
		} else {
			if (arg1 < 30 || arg1 >= 35) {
				if (arg1 == 40) {
					local78 = arg0.method1698();
					this.aShortArray8 = new short[local78];
					this.aShortArray6 = new short[local78];
					for (local88 = 0; local88 < local78; local88++) {
						this.aShortArray6[local88] = (short) arg0.method1680();
						this.aShortArray8[local88] = (short) arg0.method1680();
					}
					return;
				} else if (arg1 == 41) {
					local78 = arg0.method1698();
					this.aShortArray7 = new short[local78];
					this.aShortArray5 = new short[local78];
					for (local88 = 0; local88 < local78; local88++) {
						this.aShortArray5[local88] = (short) arg0.method1680();
						this.aShortArray7[local88] = (short) arg0.method1680();
					}
					return;
				} else if (arg1 == 60) {
					local78 = arg0.method1698();
					this.anIntArray65 = new int[local78];
					for (local88 = 0; local88 < local78; local88++) {
						this.anIntArray65[local88] = arg0.method1680();
					}
					return;
				} else if (arg1 == 93) {
					this.aBoolean31 = false;
					return;
				} else if (arg1 == 95) {
					this.anInt870 = arg0.method1680();
					return;
				} else if (arg1 == 97) {
					this.anInt844 = arg0.method1680();
					return;
				} else if (arg1 == 98) {
					this.anInt843 = arg0.method1680();
					return;
				} else if (arg1 == 99) {
					this.aBoolean32 = true;
					return;
				} else if (arg1 == 100) {
					this.anInt847 = arg0.method1707();
					return;
				} else if (arg1 == 101) {
					this.anInt860 = arg0.method1707() * 5;
					return;
				} else if (arg1 == 102) {
					this.anInt846 = arg0.method1680();
					return;
				} else if (arg1 == 103) {
					this.anInt853 = arg0.method1680();
					return;
				} else if (arg1 == 106) {
					this.anInt866 = arg0.method1680();
					if (this.anInt866 == 65535) {
						this.anInt866 = -1;
					}
					this.anInt850 = arg0.method1680();
					if (this.anInt850 == 65535) {
						this.anInt850 = -1;
					}
					local78 = arg0.method1698();
					this.anIntArray66 = new int[local78 + 1];
					for (local88 = 0; local88 <= local78; local88++) {
						this.anIntArray66[local88] = arg0.method1680();
						if (this.anIntArray66[local88] == 65535) {
							this.anIntArray66[local88] = -1;
						}
					}
					return;
				} else if (arg1 == 107) {
					this.aBoolean33 = false;
					return;
				} else {
					if (arg1 == 109) {
						this.aBoolean30 = false;
					} else if (arg1 != 111) {
						if (arg1 == 113) {
							arg0.method1680();
							arg0.method1680();
							return;
						}
						if (arg1 == 114) {
							arg0.method1707();
							arg0.method1707();
							return;
						}
						if (arg1 == 115) {
							this.aShort6 = (short) (arg0.method1698() * 4);
							this.aShort5 = (short) (arg0.method1698() * 4);
							return;
						}
					}
					return;
				}
			}
			this.aClass28Array10[arg1 - 30] = arg0.method1662();
			if (this.aClass28Array10[arg1 - 30].method1140(Static90.aClass28_1388)) {
				this.aClass28Array10[arg1 - 30] = null;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z")
	public boolean method594() {
		if (this.anIntArray66 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt866 != -1) {
			local10 = Static27.method1953(this.anInt866);
		} else if (this.anInt850 != -1) {
			local10 = Static24.anIntArray52[this.anInt850];
		}
		return local10 >= 0 && this.anIntArray66.length > local10 && this.anIntArray66[local10] != -1;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(Z)Lclient!cg;")
	public Class2_Sub4_Sub4 method595() {
		@Pc(1) int local1 = -1;
		if (this.anInt866 != -1) {
			local1 = Static27.method1953(this.anInt866);
		} else if (this.anInt850 != -1) {
			local1 = Static24.anIntArray52[this.anInt850];
		}
		return local1 < 0 || local1 >= this.anIntArray66.length || this.anIntArray66[local1] == -1 ? null : Static127.method2066(this.anIntArray66[local1]);
	}
}
