import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class3_Sub3_Sub24 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!ui", name = "O", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!ui", name = "V", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!ui", name = "W", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!ui", name = "bb", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!ui", name = "pb", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!ui", name = "wb", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!ui", name = "Bb", descriptor = "I")
	public int anInt3976;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
	public int anInt3953 = -1;

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
	public int anInt3954 = 1;

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "Z")
	public boolean aBoolean177 = true;

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "S")
	public short aShort19 = 0;

	@OriginalMember(owner = "client!ui", name = "X", descriptor = "I")
	public int anInt3959 = -1;

	@OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
	public int anInt3960 = -1;

	@OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
	public int anInt3962 = -1;

	@OriginalMember(owner = "client!ui", name = "kb", descriptor = "I")
	public int anInt3966 = -1;

	@OriginalMember(owner = "client!ui", name = "lb", descriptor = "I")
	private int anInt3967 = 0;

	@OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
	public int anInt3956 = 32;

	@OriginalMember(owner = "client!ui", name = "nb", descriptor = "I")
	private int anInt3969 = -1;

	@OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
	public int anInt3957 = -1;

	@OriginalMember(owner = "client!ui", name = "tb", descriptor = "I")
	public int anInt3972 = -1;

	@OriginalMember(owner = "client!ui", name = "fb", descriptor = "I")
	public int anInt3964 = -1;

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!ui", name = "qb", descriptor = "I")
	private int anInt3971 = 0;

	@OriginalMember(owner = "client!ui", name = "mb", descriptor = "I")
	public int anInt3968 = -1;

	@OriginalMember(owner = "client!ui", name = "gb", descriptor = "Lclient!oc;")
	public Class70 aClass70_1928 = Static208.aClass70_1238;

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "[Lclient!oc;")
	public final Class70[] aClass70Array72 = new Class70[5];

	@OriginalMember(owner = "client!ui", name = "zb", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!ui", name = "xb", descriptor = "Z")
	public boolean aBoolean178 = true;

	@OriginalMember(owner = "client!ui", name = "ub", descriptor = "I")
	private int anInt3973 = 128;

	@OriginalMember(owner = "client!ui", name = "Db", descriptor = "S")
	public short aShort20 = 0;

	@OriginalMember(owner = "client!ui", name = "Eb", descriptor = "I")
	private int anInt3978 = -1;

	@OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
	private int anInt3958 = 128;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!nd;I)Lclient!wa;")
	public Class26_Sub6 method3054(@OriginalArg(1) Class3_Sub3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray344 != null) {
			@Pc(10) Class3_Sub3_Sub24 local10 = this.method3065();
			return local10 == null ? null : local10.method3054(arg0, arg1);
		} else if (this.anIntArray346 == null) {
			return null;
		} else {
			@Pc(33) Class26_Sub6 local33 = (Class26_Sub6) Static63.aClass94_4.method3153((long) this.anInt3976);
			if (local33 == null) {
				@Pc(42) boolean local42 = false;
				for (@Pc(44) int local44 = 0; local44 < this.anIntArray346.length; local44++) {
					if (!Static14.aClass52_4.method1558(this.anIntArray346[local44], 0)) {
						local42 = true;
					}
				}
				if (local42) {
					return null;
				}
				@Pc(71) Class26_Sub5[] local71 = new Class26_Sub5[this.anIntArray346.length];
				for (@Pc(73) int local73 = 0; local73 < this.anIntArray346.length; local73++) {
					local71[local73] = Static128.method1788(Static14.aClass52_4, this.anIntArray346[local73]);
				}
				@Pc(100) Class26_Sub5 local100;
				if (local71.length == 1) {
					local100 = local71[0];
				} else {
					local100 = new Class26_Sub5(local71, local71.length);
				}
				@Pc(113) int local113;
				if (this.aShortArray65 != null) {
					for (local113 = 0; local113 < this.aShortArray65.length; local113++) {
						if (this.aByteArray48 == null || local113 >= this.aByteArray48.length) {
							local100.method1779(this.aShortArray65[local113], this.aShortArray66[local113]);
						} else {
							local100.method1779(this.aShortArray65[local113], Static116.aShortArray55[this.aByteArray48[local113] & 0xFF]);
						}
					}
				}
				if (this.aShortArray63 != null) {
					for (local113 = 0; local113 < this.aShortArray63.length; local113++) {
						local100.method1793(this.aShortArray63[local113], this.aShortArray64[local113]);
					}
				}
				local33 = local100.method1798(64, 768, -50, -10, -50);
				Static63.aClass94_4.method3154((long) this.anInt3976, local33);
			}
			if (arg0 != null) {
				local33 = arg0.method1926(local33, arg1);
			}
			return local33;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
	public void method3055() {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!ce;I)V")
	private void method3059(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(102) int local102;
		@Pc(112) int local112;
		if (arg1 == 1) {
			local102 = arg0.method1278();
			this.anIntArray345 = new int[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.anIntArray345[local112] = arg0.method1270();
			}
		} else if (arg1 == 2) {
			this.aClass70_1928 = arg0.method1246();
		} else if (arg1 == 12) {
			this.anInt3954 = arg0.method1278();
		} else if (arg1 == 13) {
			this.anInt3966 = arg0.method1270();
		} else if (arg1 == 14) {
			this.anInt3960 = arg0.method1270();
		} else if (arg1 == 15) {
			this.anInt3962 = arg0.method1270();
		} else if (arg1 == 16) {
			this.anInt3953 = arg0.method1270();
		} else if (arg1 == 17) {
			this.anInt3960 = arg0.method1270();
			this.anInt3964 = arg0.method1270();
			this.anInt3968 = arg0.method1270();
			this.anInt3972 = arg0.method1270();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass70Array72[arg1 - 30] = arg0.method1246();
			if (this.aClass70Array72[arg1 - 30].method2059(Static33.aClass70_322)) {
				this.aClass70Array72[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local102 = arg0.method1278();
			this.aShortArray66 = new short[local102];
			this.aShortArray65 = new short[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.aShortArray65[local112] = (short) arg0.method1270();
				this.aShortArray66[local112] = (short) arg0.method1270();
			}
		} else if (arg1 == 41) {
			local102 = arg0.method1278();
			this.aShortArray63 = new short[local102];
			this.aShortArray64 = new short[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.aShortArray63[local112] = (short) arg0.method1270();
				this.aShortArray64[local112] = (short) arg0.method1270();
			}
		} else if (arg1 == 42) {
			local102 = arg0.method1278();
			this.aByteArray48 = new byte[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.aByteArray48[local112] = arg0.method1248();
			}
		} else if (arg1 == 60) {
			local102 = arg0.method1278();
			this.anIntArray346 = new int[local102];
			for (local112 = 0; local112 < local102; local112++) {
				this.anIntArray346[local112] = arg0.method1270();
			}
		} else if (arg1 == 93) {
			this.aBoolean178 = false;
		} else if (arg1 == 95) {
			this.anInt3959 = arg0.method1270();
		} else if (arg1 == 97) {
			this.anInt3973 = arg0.method1270();
		} else if (arg1 == 98) {
			this.anInt3958 = arg0.method1270();
		} else if (arg1 == 99) {
			this.aBoolean176 = true;
		} else if (arg1 == 100) {
			this.anInt3971 = arg0.method1248();
		} else if (arg1 == 101) {
			this.anInt3967 = arg0.method1248() * 5;
		} else if (arg1 == 102) {
			this.anInt3957 = arg0.method1270();
		} else if (arg1 == 103) {
			this.anInt3956 = arg0.method1270();
		} else if (arg1 == 106) {
			this.anInt3969 = arg0.method1270();
			if (this.anInt3969 == 65535) {
				this.anInt3969 = -1;
			}
			this.anInt3978 = arg0.method1270();
			if (this.anInt3978 == 65535) {
				this.anInt3978 = -1;
			}
			local102 = arg0.method1278();
			this.anIntArray344 = new int[local102 + 1];
			for (local112 = 0; local112 <= local102; local112++) {
				this.anIntArray344[local112] = arg0.method1270();
				if (this.anIntArray344[local112] == 65535) {
					this.anIntArray344[local112] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean177 = false;
		} else if (arg1 == 109) {
			this.aBoolean179 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method1270();
				arg0.method1270();
			} else if (arg1 == 114) {
				arg0.method1248();
				arg0.method1248();
			} else if (arg1 == 115) {
				this.aShort20 = (short) (arg0.method1278() * 4);
				this.aShort19 = (short) (arg0.method1278() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBILclient!nd;Lclient!nd;)Lclient!wa;")
	public Class26_Sub6 method3060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub3_Sub17 arg2, @OriginalArg(4) Class3_Sub3_Sub17 arg3) {
		if (this.anIntArray344 != null) {
			@Pc(10) Class3_Sub3_Sub24 local10 = this.method3065();
			return local10 == null ? null : local10.method3060(arg0, arg1, arg2, arg3);
		}
		@Pc(30) Class26_Sub6 local30 = (Class26_Sub6) Static181.aClass94_10.method3153((long) this.anInt3976);
		if (local30 == null) {
			@Pc(34) boolean local34 = false;
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray345.length; local36++) {
				if (!Static14.aClass52_4.method1558(this.anIntArray345[local36], 0)) {
					local34 = true;
				}
			}
			if (local34) {
				return null;
			}
			@Pc(63) Class26_Sub5[] local63 = new Class26_Sub5[this.anIntArray345.length];
			for (@Pc(65) int local65 = 0; local65 < this.anIntArray345.length; local65++) {
				local63[local65] = Static128.method1788(Static14.aClass52_4, this.anIntArray345[local65]);
			}
			@Pc(93) Class26_Sub5 local93;
			if (local63.length == 1) {
				local93 = local63[0];
			} else {
				local93 = new Class26_Sub5(local63, local63.length);
			}
			@Pc(103) int local103;
			if (this.aShortArray65 != null) {
				for (local103 = 0; local103 < this.aShortArray65.length; local103++) {
					if (this.aByteArray48 == null || local103 >= this.aByteArray48.length) {
						local93.method1779(this.aShortArray65[local103], this.aShortArray66[local103]);
					} else {
						local93.method1779(this.aShortArray65[local103], Static116.aShortArray55[this.aByteArray48[local103] & 0xFF]);
					}
				}
			}
			if (this.aShortArray63 != null) {
				for (local103 = 0; local103 < this.aShortArray63.length; local103++) {
					local93.method1793(this.aShortArray63[local103], this.aShortArray64[local103]);
				}
			}
			local30 = local93.method1798(this.anInt3971 + 64, this.anInt3967 + 850, -30, -50, -30);
			Static181.aClass94_10.method3154((long) this.anInt3976, local30);
		}
		@Pc(214) Class26_Sub6 local214;
		if (arg2 != null && arg3 != null) {
			local214 = arg2.method1928(arg1, arg0, arg3, local30);
		} else if (arg2 != null) {
			local214 = arg2.method1924(local30, arg0);
		} else if (arg3 == null) {
			local214 = local30.method2527(true);
		} else {
			local214 = arg3.method1924(local30, arg1);
		}
		if (this.anInt3973 != 128 || this.anInt3958 != 128) {
			local214.method2536(this.anInt3973, this.anInt3958, this.anInt3973);
		}
		return local214;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!ce;)V")
	public void method3061(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method1278();
			if (local11 == 0) {
				return;
			}
			this.method3059(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)Z")
	public boolean method3064() {
		if (this.anIntArray344 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3969 != -1) {
			local10 = Static160.method2409(this.anInt3969);
		} else if (this.anInt3978 != -1) {
			local10 = Static16.anIntArray27[this.anInt3978];
		}
		return local10 >= 0 && this.anIntArray344.length > local10 && this.anIntArray344[local10] != -1;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)Lclient!ui;")
	public Class3_Sub3_Sub24 method3065() {
		@Pc(11) int local11 = -1;
		if (this.anInt3969 != -1) {
			local11 = Static160.method2409(this.anInt3969);
		} else if (this.anInt3978 != -1) {
			local11 = Static16.anIntArray27[this.anInt3978];
		}
		return local11 < 0 || this.anIntArray344.length <= local11 || this.anIntArray344[local11] == -1 ? null : Static37.method2344(this.anIntArray344[local11]);
	}
}
