import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class105 {

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!qc;")
	private Class90 aClass90_21;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!se", name = "R", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!se", name = "V", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
	public int anInt3917;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "[I")
	private int[] anIntArray442;

	@OriginalMember(owner = "client!se", name = "jb", descriptor = "[I")
	public int[] anIntArray443;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public int anInt3893 = -1;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	public int anInt3894 = 32;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	public int anInt3900 = -1;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public int anInt3895 = -1;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public int anInt3890 = -1;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "I")
	public int anInt3908 = -1;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "B")
	public byte aByte14 = -16;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "S")
	public short aShort29 = 0;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public int anInt3886 = -1;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "I")
	public int anInt3913 = -1;

	@OriginalMember(owner = "client!se", name = "N", descriptor = "I")
	public int anInt3910 = 0;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "Lclient!hh;")
	public Class50 aClass50_1258 = Static46.aClass50_345;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "Z")
	public boolean aBoolean180 = true;

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "S")
	public short aShort30 = 0;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public int anInt3888 = -1;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "[Lclient!hh;")
	public Class50[] aClass50Array74 = new Class50[5];

	@OriginalMember(owner = "client!se", name = "E", descriptor = "I")
	public int anInt3904 = -1;

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
	private int anInt3918 = -1;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "I")
	public int anInt3912 = -1;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public int anInt3889 = 1;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "B")
	public byte aByte13 = 0;

	@OriginalMember(owner = "client!se", name = "S", descriptor = "I")
	public int anInt3911 = -1;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!se", name = "ib", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "I")
	private int anInt3919 = 128;

	@OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
	public int anInt3923 = -1;

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
	private int anInt3920 = 128;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "B")
	public byte aByte15 = -96;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "S")
	public short aShort28 = 0;

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "S")
	public short aShort31 = 0;

	@OriginalMember(owner = "client!se", name = "ob", descriptor = "I")
	public int anInt3925 = -1;

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
	private int anInt3926 = 0;

	@OriginalMember(owner = "client!se", name = "qb", descriptor = "Z")
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
	private int anInt3921 = 0;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	private int anInt3898 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!hh;IB)Lclient!hh;")
	public Class50 method3118(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass90_21 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub6 local16 = (Class1_Sub6) this.aClass90_21.method2819((long) arg1);
			return local16 == null ? arg0 : local16.aClass50_187;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZLclient!tc;)Lclient!ra;")
	public Class20_Sub5 method3119(@OriginalArg(0) int arg0, @OriginalArg(2) Class110 arg1) {
		if (this.anIntArray443 != null) {
			@Pc(12) Class105 local12 = this.method3127();
			return local12 == null ? null : local12.method3119(arg0, arg1);
		} else if (this.anIntArray441 == null) {
			return null;
		} else {
			@Pc(35) Class20_Sub5 local35 = (Class20_Sub5) Static64.aClass84_20.method2579((long) this.anInt3917);
			if (local35 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray441.length; local41++) {
					if (!Static183.aClass86_70.method3329(0, this.anIntArray441[local41])) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(69) Class20_Sub4[] local69 = new Class20_Sub4[this.anIntArray441.length];
				for (@Pc(71) int local71 = 0; local71 < this.anIntArray441.length; local71++) {
					local69[local71] = Static89.method1399(Static183.aClass86_70, this.anIntArray441[local71]);
				}
				@Pc(100) Class20_Sub4 local100;
				if (local69.length == 1) {
					local100 = local69[0];
				} else {
					local100 = new Class20_Sub4(local69, local69.length);
				}
				@Pc(111) int local111;
				if (this.aShortArray58 != null) {
					for (local111 = 0; local111 < this.aShortArray58.length; local111++) {
						if (this.aByteArray54 == null || local111 >= this.aByteArray54.length) {
							local100.method1406(this.aShortArray58[local111], this.aShortArray57[local111]);
						} else {
							local100.method1406(this.aShortArray58[local111], Static173.aShortArray54[this.aByteArray54[local111] & 0xFF]);
						}
					}
				}
				if (this.aShortArray59 != null) {
					for (local111 = 0; local111 < this.aShortArray59.length; local111++) {
						local100.method1398(this.aShortArray59[local111], this.aShortArray56[local111]);
					}
				}
				local35 = local100.method1402(64, 768, -50, -10, -50);
				Static64.aClass84_20.method2582(local35, (long) this.anInt3917);
			}
			if (arg1 != null) {
				local35 = arg1.method3191(arg0, local35);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
	public boolean method3120() {
		if (this.anIntArray443 == null) {
			return true;
		}
		@Pc(18) int local18 = -1;
		if (this.anInt3918 != -1) {
			local18 = Static53.method804(this.anInt3918);
		} else if (this.anInt3898 != -1) {
			local18 = Static24.anIntArray49[this.anInt3898];
		}
		if (local18 < 0 || this.anIntArray443.length - 1 <= local18 || this.anIntArray443[local18] == -1) {
			@Pc(68) int local68 = this.anIntArray443[this.anIntArray443.length - 1];
			return local68 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Z")
	public boolean method3121() {
		if (this.anIntArray443 == null) {
			return this.anInt3888 != -1 || this.anInt3886 != -1 || this.anInt3913 != -1;
		}
		for (@Pc(33) int local33 = 0; local33 < this.anIntArray443.length; local33++) {
			if (this.anIntArray443[local33] != -1) {
				@Pc(49) Class105 local49 = Static162.method2710(this.anIntArray443[local33]);
				if (local49.anInt3888 != -1 || local49.anInt3886 != -1 || local49.anInt3913 != -1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!tc;ZILclient!tc;)Lclient!ra;")
	public Class20_Sub5 method3122(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class110 arg3) {
		if (this.anIntArray443 != null) {
			@Pc(12) Class105 local12 = this.method3127();
			return local12 == null ? null : local12.method3122(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class20_Sub5 local32 = (Class20_Sub5) Static49.aClass84_19.method2579((long) this.anInt3917);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray442.length; local38++) {
				if (!Static183.aClass86_70.method3329(0, this.anIntArray442[local38])) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class20_Sub4[] local70 = new Class20_Sub4[this.anIntArray442.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray442.length; local72++) {
				local70[local72] = Static89.method1399(Static183.aClass86_70, this.anIntArray442[local72]);
				if (this.anIntArrayArray29 != null && this.anIntArrayArray29[local72] != null && local70[local72] != null) {
					local70[local72].method1425(this.anIntArrayArray29[local72][0], this.anIntArrayArray29[local72][1], this.anIntArrayArray29[local72][2]);
				}
			}
			@Pc(132) Class20_Sub4 local132;
			if (local70.length == 1) {
				local132 = local70[0];
			} else {
				local132 = new Class20_Sub4(local70, local70.length);
			}
			@Pc(146) int local146;
			if (this.aShortArray58 != null) {
				for (local146 = 0; local146 < this.aShortArray58.length; local146++) {
					if (this.aByteArray54 == null || this.aByteArray54.length <= local146) {
						local132.method1406(this.aShortArray58[local146], this.aShortArray57[local146]);
					} else {
						local132.method1406(this.aShortArray58[local146], Static173.aShortArray54[this.aByteArray54[local146] & 0xFF]);
					}
				}
			}
			if (this.aShortArray59 != null) {
				for (local146 = 0; local146 < this.aShortArray59.length; local146++) {
					local132.method1398(this.aShortArray59[local146], this.aShortArray56[local146]);
				}
			}
			local32 = local132.method1402(this.anInt3926 + 64, this.anInt3921 + 850, -30, -50, -30);
			Static49.aClass84_19.method2582(local32, (long) this.anInt3917);
		}
		@Pc(251) Class20_Sub5 local251;
		if (arg3 != null && arg1 != null) {
			local251 = arg3.method3183(local32, arg1, arg0, arg2);
		} else if (arg3 != null) {
			local251 = arg3.method3182(arg0, local32);
		} else if (arg1 == null) {
			local251 = local32.method1705(true, true);
		} else {
			local251 = arg1.method3182(arg2, local32);
		}
		if (this.anInt3919 != 128 || this.anInt3920 != 128) {
			local251.method1697(this.anInt3919, this.anInt3920, this.anInt3919);
		}
		return local251;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZII)I")
	public int method3126(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass90_21 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub5 local16 = (Class1_Sub5) this.aClass90_21.method2819((long) arg0);
			return local16 == null ? arg1 : local16.anInt409;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Lclient!se;")
	public Class105 method3127() {
		@Pc(5) int local5 = -1;
		if (this.anInt3918 != -1) {
			local5 = Static53.method804(this.anInt3918);
		} else if (this.anInt3898 != -1) {
			local5 = Static24.anIntArray49[this.anInt3898];
		}
		if (local5 < 0 || this.anIntArray443.length - 1 <= local5 || this.anIntArray443[local5] == -1) {
			@Pc(54) int local54 = this.anIntArray443[this.anIntArray443.length - 1];
			return local54 == -1 ? null : Static162.method2710(local54);
		} else {
			return Static162.method2710(this.anIntArray443[local5]);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!pg;)V")
	public void method3128(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2142();
			if (local5 == 0) {
				return;
			}
			this.method3129(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!pg;BI)V")
	private void method3129(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		@Pc(107) int local107;
		@Pc(117) int local117;
		if (arg1 == 1) {
			local107 = arg0.method2142();
			this.anIntArray442 = new int[local107];
			for (local117 = 0; local117 < local107; local117++) {
				this.anIntArray442[local117] = arg0.method2178();
			}
		} else if (arg1 == 2) {
			this.aClass50_1258 = arg0.method2125();
		} else if (arg1 == 12) {
			this.anInt3889 = arg0.method2142();
		} else if (arg1 == 13) {
			this.anInt3911 = arg0.method2178();
		} else if (arg1 == 14) {
			this.anInt3890 = arg0.method2178();
		} else if (arg1 == 15) {
			this.anInt3908 = arg0.method2178();
		} else if (arg1 == 16) {
			this.anInt3923 = arg0.method2178();
		} else if (arg1 == 17) {
			this.anInt3890 = arg0.method2178();
			this.anInt3895 = arg0.method2178();
			this.anInt3904 = arg0.method2178();
			this.anInt3925 = arg0.method2178();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass50Array74[arg1 - 30] = arg0.method2125();
			if (this.aClass50Array74[arg1 - 30].method1256(Static198.aClass50_1292)) {
				this.aClass50Array74[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local107 = arg0.method2142();
			this.aShortArray58 = new short[local107];
			this.aShortArray57 = new short[local107];
			for (local117 = 0; local117 < local107; local117++) {
				this.aShortArray58[local117] = (short) arg0.method2178();
				this.aShortArray57[local117] = (short) arg0.method2178();
			}
		} else if (arg1 == 41) {
			local107 = arg0.method2142();
			this.aShortArray56 = new short[local107];
			this.aShortArray59 = new short[local107];
			for (local117 = 0; local117 < local107; local117++) {
				this.aShortArray59[local117] = (short) arg0.method2178();
				this.aShortArray56[local117] = (short) arg0.method2178();
			}
		} else if (arg1 == 42) {
			local107 = arg0.method2142();
			this.aByteArray54 = new byte[local107];
			for (local117 = 0; local117 < local107; local117++) {
				this.aByteArray54[local117] = arg0.method2155();
			}
		} else if (arg1 == 60) {
			local107 = arg0.method2142();
			this.anIntArray441 = new int[local107];
			for (local117 = 0; local117 < local107; local117++) {
				this.anIntArray441[local117] = arg0.method2178();
			}
		} else if (arg1 == 93) {
			this.aBoolean179 = false;
		} else if (arg1 == 95) {
			this.anInt3900 = arg0.method2178();
		} else if (arg1 == 97) {
			this.anInt3919 = arg0.method2178();
		} else if (arg1 == 98) {
			this.anInt3920 = arg0.method2178();
		} else if (arg1 == 99) {
			this.aBoolean182 = true;
		} else if (arg1 == 100) {
			this.anInt3926 = arg0.method2155();
		} else if (arg1 == 101) {
			this.anInt3921 = arg0.method2155() * 5;
		} else if (arg1 == 102) {
			this.anInt3893 = arg0.method2178();
		} else if (arg1 == 103) {
			this.anInt3894 = arg0.method2178();
		} else {
			@Pc(414) int local414;
			if (arg1 == 106 || arg1 == 118) {
				this.anInt3918 = arg0.method2178();
				if (this.anInt3918 == 65535) {
					this.anInt3918 = -1;
				}
				local107 = -1;
				this.anInt3898 = arg0.method2178();
				if (this.anInt3898 == 65535) {
					this.anInt3898 = -1;
				}
				if (arg1 == 118) {
					local107 = arg0.method2178();
					if (local107 == 65535) {
						local107 = -1;
					}
				}
				local117 = arg0.method2142();
				this.anIntArray443 = new int[local117 + 2];
				for (local414 = 0; local414 <= local117; local414++) {
					this.anIntArray443[local414] = arg0.method2178();
					if (this.anIntArray443[local414] == 65535) {
						this.anIntArray443[local414] = -1;
					}
				}
				this.anIntArray443[local117 + 1] = local107;
			} else if (arg1 == 107) {
				this.aBoolean181 = false;
			} else if (arg1 == 109) {
				this.aBoolean183 = false;
			} else if (arg1 == 111) {
				this.aBoolean180 = false;
			} else if (arg1 == 113) {
				this.aShort28 = (short) arg0.method2178();
				this.aShort30 = (short) arg0.method2178();
			} else if (arg1 == 114) {
				this.aByte15 = arg0.method2155();
				this.aByte14 = arg0.method2155();
			} else if (arg1 == 115) {
				this.aShort29 = (short) (arg0.method2142() * 4);
				this.aShort31 = (short) (arg0.method2142() * 4);
			} else if (arg1 == 119) {
				this.aByte13 = arg0.method2155();
			} else if (arg1 == 120) {
				this.anInt3888 = arg0.method2178();
				this.anInt3886 = arg0.method2178();
				this.anInt3913 = arg0.method2178();
				this.anInt3910 = arg0.method2142();
			} else if (arg1 == 121) {
				this.anIntArrayArray29 = new int[this.anIntArray442.length][];
				local107 = arg0.method2142();
				for (local117 = 0; local117 < local107; local117++) {
					local414 = arg0.method2142();
					@Pc(422) int[] local422 = this.anIntArrayArray29[local414] = new int[3];
					local422[0] = arg0.method2155();
					local422[1] = arg0.method2155();
					local422[2] = arg0.method2155();
				}
			} else if (arg1 == 122) {
				this.anInt3912 = arg0.method2178();
			} else if (arg1 == 249) {
				local107 = arg0.method2142();
				if (this.aClass90_21 == null) {
					local117 = Static194.method3146(local107);
					this.aClass90_21 = new Class90(local117);
				}
				for (local117 = 0; local117 < local107; local117++) {
					@Pc(350) boolean local350 = arg0.method2142() == 1;
					@Pc(354) int local354 = arg0.method2135();
					@Pc(363) Class1 local363;
					if (local350) {
						local363 = new Class1_Sub6(arg0.method2125());
					} else {
						local363 = new Class1_Sub5(arg0.method2140());
					}
					this.aClass90_21.method2817(local363, (long) local354);
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public void method3132() {
	}
}
