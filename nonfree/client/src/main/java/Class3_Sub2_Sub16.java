import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "[I")
	private int[] anIntArray426;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
	public int anInt3816;

	@OriginalMember(owner = "client!ve", name = "lb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!ve", name = "nb", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!ve", name = "ob", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "Z")
	public boolean aBoolean162 = true;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
	public int anInt3803 = -1;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
	public int anInt3808 = 32;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
	private int anInt3797 = 0;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "[Lclient!kb;")
	public final Class46[] aClass46Array24 = new Class46[5];

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "S")
	public short aShort35 = 0;

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
	public int anInt3805 = -1;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
	private int anInt3796 = 0;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "Z")
	public boolean aBoolean165 = false;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
	public int anInt3798 = -1;

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
	public int anInt3815 = -1;

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
	public int anInt3810 = -1;

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "I")
	private int anInt3813 = 128;

	@OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
	public int anInt3820 = -1;

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
	public int anInt3811 = -1;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "S")
	public short aShort36 = 0;

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "I")
	private int anInt3817 = 128;

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
	public int anInt3812 = -1;

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
	public int anInt3814 = 1;

	@OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
	private int anInt3819 = -1;

	@OriginalMember(owner = "client!ve", name = "U", descriptor = "Z")
	public boolean aBoolean164 = true;

	@OriginalMember(owner = "client!ve", name = "mb", descriptor = "I")
	private int anInt3821 = -1;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "Lclient!kb;")
	public Class46 aClass46_1370 = Static167.aClass46_190;

	@OriginalMember(owner = "client!ve", name = "zb", descriptor = "I")
	public int anInt3824 = -1;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public void method2739() {
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)Z")
	public boolean method2740() {
		if (this.anIntArray428 == null) {
			return true;
		}
		@Pc(16) int local16 = -1;
		if (this.anInt3819 != -1) {
			local16 = Static20.method401(this.anInt3819);
		} else if (this.anInt3821 != -1) {
			local16 = Static41.anIntArray419[this.anInt3821];
		}
		return local16 >= 0 && this.anIntArray428.length > local16 && this.anIntArray428[local16] != -1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!dg;Lclient!dg;IB)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method2741(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub2 arg1, @OriginalArg(2) Class3_Sub2_Sub2 arg2, @OriginalArg(3) int arg3) {
		if (this.anIntArray428 != null) {
			@Pc(12) Class3_Sub2_Sub16 local12 = this.method2747();
			return local12 == null ? null : local12.method2741(arg0, arg1, arg2, arg3);
		}
		@Pc(43) Class3_Sub2_Sub1_Sub2 local43 = (Class3_Sub2_Sub1_Sub2) Static46.aClass57_12.method1719((long) this.anInt3816);
		if (local43 == null) {
			@Pc(47) boolean local47 = false;
			for (@Pc(49) int local49 = 0; local49 < this.anIntArray427.length; local49++) {
				if (!Static141.aClass44_25.method1618(0, this.anIntArray427[local49])) {
					local47 = true;
				}
			}
			if (local47) {
				return null;
			}
			@Pc(77) Class3_Sub2_Sub1_Sub6[] local77 = new Class3_Sub2_Sub1_Sub6[this.anIntArray427.length];
			for (@Pc(79) int local79 = 0; local79 < this.anIntArray427.length; local79++) {
				local77[local79] = Static115.method1944(Static141.aClass44_25, this.anIntArray427[local79]);
			}
			@Pc(110) Class3_Sub2_Sub1_Sub6 local110;
			if (local77.length == 1) {
				local110 = local77[0];
			} else {
				local110 = new Class3_Sub2_Sub1_Sub6(local77, local77.length);
			}
			@Pc(121) int local121;
			if (this.aShortArray38 != null) {
				for (local121 = 0; local121 < this.aShortArray38.length; local121++) {
					local110.method1954(this.aShortArray38[local121], this.aShortArray36[local121]);
				}
			}
			if (this.aShortArray35 != null) {
				for (local121 = 0; local121 < this.aShortArray35.length; local121++) {
					local110.method1933(this.aShortArray35[local121], this.aShortArray37[local121]);
				}
			}
			local43 = local110.method1938(this.anInt3796 + 64, this.anInt3797 + 850, -30, -50, -30, true);
			Static46.aClass57_12.method1717(local43, (long) this.anInt3816);
		}
		@Pc(198) Class3_Sub2_Sub1_Sub2 local198;
		if (arg1 != null && arg2 != null) {
			local198 = arg1.method596(local43, arg3, arg2, arg0);
		} else if (arg1 != null) {
			local198 = arg1.method605(local43, arg0);
		} else if (arg2 == null) {
			local198 = local43.method1789(true);
		} else {
			local198 = arg2.method605(local43, arg3);
		}
		if (this.anInt3813 != 128 || this.anInt3817 != 128) {
			local198.method1799(this.anInt3813, this.anInt3817, this.anInt3813);
		}
		return local198;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!rd;ZI)V")
	private void method2742(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 1) {
			local14 = arg0.method191();
			this.anIntArray427 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray427[local20] = arg0.method208();
			}
		} else if (arg1 == 2) {
			this.aClass46_1370 = arg0.method172();
		} else if (arg1 == 12) {
			this.anInt3814 = arg0.method191();
		} else if (arg1 == 13) {
			this.anInt3820 = arg0.method208();
		} else if (arg1 == 14) {
			this.anInt3803 = arg0.method208();
		} else if (arg1 == 15) {
			this.anInt3810 = arg0.method208();
		} else if (arg1 == 16) {
			this.anInt3805 = arg0.method208();
		} else if (arg1 == 17) {
			this.anInt3803 = arg0.method208();
			this.anInt3812 = arg0.method208();
			this.anInt3815 = arg0.method208();
			this.anInt3798 = arg0.method208();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass46Array24[arg1 - 30] = arg0.method172();
			if (this.aClass46Array24[arg1 - 30].method1389(Static114.aClass46_932)) {
				this.aClass46Array24[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local14 = arg0.method191();
			this.aShortArray36 = new short[local14];
			this.aShortArray38 = new short[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.aShortArray38[local20] = (short) arg0.method208();
				this.aShortArray36[local20] = (short) arg0.method208();
			}
		} else if (arg1 == 41) {
			local14 = arg0.method191();
			this.aShortArray37 = new short[local14];
			this.aShortArray35 = new short[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.aShortArray35[local20] = (short) arg0.method208();
				this.aShortArray37[local20] = (short) arg0.method208();
			}
		} else if (arg1 == 60) {
			local14 = arg0.method191();
			this.anIntArray426 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray426[local20] = arg0.method208();
			}
		} else if (arg1 == 93) {
			this.aBoolean163 = false;
		} else if (arg1 == 95) {
			this.anInt3824 = arg0.method208();
		} else if (arg1 == 97) {
			this.anInt3813 = arg0.method208();
		} else if (arg1 == 98) {
			this.anInt3817 = arg0.method208();
		} else if (arg1 == 99) {
			this.aBoolean165 = true;
		} else if (arg1 == 100) {
			this.anInt3796 = arg0.method203();
		} else if (arg1 == 101) {
			this.anInt3797 = arg0.method203() * 5;
		} else if (arg1 == 102) {
			this.anInt3811 = arg0.method208();
		} else if (arg1 == 103) {
			this.anInt3808 = arg0.method208();
		} else if (arg1 == 106) {
			this.anInt3819 = arg0.method208();
			if (this.anInt3819 == 65535) {
				this.anInt3819 = -1;
			}
			this.anInt3821 = arg0.method208();
			if (this.anInt3821 == 65535) {
				this.anInt3821 = -1;
			}
			local14 = arg0.method191();
			this.anIntArray428 = new int[local14 + 1];
			for (local20 = 0; local20 <= local14; local20++) {
				this.anIntArray428[local20] = arg0.method208();
				if (this.anIntArray428[local20] == 65535) {
					this.anIntArray428[local20] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean164 = false;
		} else if (arg1 == 109) {
			this.aBoolean162 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method208();
				arg0.method208();
			} else if (arg1 == 114) {
				arg0.method203();
				arg0.method203();
			} else if (arg1 == 115) {
				this.aShort36 = (short) (arg0.method191() * 4);
				this.aShort35 = (short) (arg0.method191() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!rd;I)V")
	public void method2743(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method191();
			if (local5 == 0) {
				return;
			}
			this.method2742(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!dg;I)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method2744(@OriginalArg(1) Class3_Sub2_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray428 != null) {
			@Pc(12) Class3_Sub2_Sub16 local12 = this.method2747();
			return local12 == null ? null : local12.method2744(arg0, arg1);
		} else if (this.anIntArray426 == null) {
			return null;
		} else {
			@Pc(46) Class3_Sub2_Sub1_Sub2 local46 = (Class3_Sub2_Sub1_Sub2) Static156.aClass57_27.method1719((long) this.anInt3816);
			if (local46 == null) {
				@Pc(50) boolean local50 = false;
				for (@Pc(52) int local52 = 0; local52 < this.anIntArray426.length; local52++) {
					if (!Static141.aClass44_25.method1618(0, this.anIntArray426[local52])) {
						local50 = true;
					}
				}
				if (local50) {
					return null;
				}
				@Pc(80) Class3_Sub2_Sub1_Sub6[] local80 = new Class3_Sub2_Sub1_Sub6[this.anIntArray426.length];
				for (@Pc(82) int local82 = 0; local82 < this.anIntArray426.length; local82++) {
					local80[local82] = Static115.method1944(Static141.aClass44_25, this.anIntArray426[local82]);
				}
				@Pc(110) Class3_Sub2_Sub1_Sub6 local110;
				if (local80.length == 1) {
					local110 = local80[0];
				} else {
					local110 = new Class3_Sub2_Sub1_Sub6(local80, local80.length);
				}
				@Pc(124) int local124;
				if (this.aShortArray38 != null) {
					for (local124 = 0; local124 < this.aShortArray38.length; local124++) {
						local110.method1954(this.aShortArray38[local124], this.aShortArray36[local124]);
					}
				}
				if (this.aShortArray35 != null) {
					for (local124 = 0; local124 < this.aShortArray35.length; local124++) {
						local110.method1933(this.aShortArray35[local124], this.aShortArray37[local124]);
					}
				}
				local46 = local110.method1938(64, 768, -50, -10, -50, true);
				Static156.aClass57_27.method1717(local46, (long) this.anInt3816);
			}
			if (arg0 != null) {
				local46 = arg0.method604(arg1, local46);
			}
			return local46;
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)Lclient!ve;")
	public Class3_Sub2_Sub16 method2747() {
		@Pc(5) int local5 = -1;
		if (this.anInt3819 != -1) {
			local5 = Static20.method401(this.anInt3819);
		} else if (this.anInt3821 != -1) {
			local5 = Static41.anIntArray419[this.anInt3821];
		}
		return local5 < 0 || local5 >= this.anIntArray428.length || this.anIntArray428[local5] == -1 ? null : Static176.method2828(this.anIntArray428[local5]);
	}
}
