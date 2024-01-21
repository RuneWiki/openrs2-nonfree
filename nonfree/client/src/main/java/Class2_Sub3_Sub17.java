import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class2_Sub3_Sub17 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!ug", name = "U", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!ug", name = "W", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!ug", name = "fb", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!ug", name = "lb", descriptor = "I")
	public int anInt3918;

	@OriginalMember(owner = "client!ug", name = "mb", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!ug", name = "rb", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
	public int anInt3902 = -1;

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
	public int anInt3906 = 1;

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
	private int anInt3903 = 0;

	@OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
	private int anInt3912 = 128;

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "[Lclient!ai;")
	public final Class6[] aClass6Array22 = new Class6[5];

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "Z")
	public boolean aBoolean154 = true;

	@OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
	private int anInt3917 = -1;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
	public int anInt3898 = -1;

	@OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
	private int anInt3901 = -1;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	public int anInt3897 = -1;

	@OriginalMember(owner = "client!ug", name = "K", descriptor = "Lclient!ai;")
	public Class6 aClass6_1162 = Static22.aClass6_151;

	@OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
	public int anInt3909 = -1;

	@OriginalMember(owner = "client!ug", name = "Z", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
	public int anInt3900 = -1;

	@OriginalMember(owner = "client!ug", name = "pb", descriptor = "I")
	public int anInt3920 = -1;

	@OriginalMember(owner = "client!ug", name = "qb", descriptor = "I")
	private int anInt3921 = 0;

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
	public int anInt3899 = -1;

	@OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
	public int anInt3914 = 32;

	@OriginalMember(owner = "client!ug", name = "ob", descriptor = "I")
	public int anInt3919 = -1;

	@OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
	public int anInt3913 = -1;

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
	private int anInt3904 = 128;

	@OriginalMember(owner = "client!ug", name = "sb", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!me;)V")
	public void method2644(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1402();
			if (local9 == 0) {
				return;
			}
			this.method2645(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!me;I)V")
	private void method2645(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		@Pc(198) int local198;
		@Pc(206) int local206;
		if (arg1 == 1) {
			local198 = arg0.method1402();
			this.anIntArray381 = new int[local198];
			for (local206 = 0; local206 < local198; local206++) {
				this.anIntArray381[local206] = arg0.method1397();
			}
		} else if (arg1 == 2) {
			this.aClass6_1162 = arg0.method1399();
		} else if (arg1 == 12) {
			this.anInt3906 = arg0.method1402();
		} else if (arg1 == 13) {
			this.anInt3898 = arg0.method1397();
		} else if (arg1 == 14) {
			this.anInt3913 = arg0.method1397();
		} else if (arg1 == 15) {
			this.anInt3920 = arg0.method1397();
		} else if (arg1 == 16) {
			this.anInt3919 = arg0.method1397();
		} else if (arg1 == 17) {
			this.anInt3913 = arg0.method1397();
			this.anInt3909 = arg0.method1397();
			this.anInt3900 = arg0.method1397();
			this.anInt3897 = arg0.method1397();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass6Array22[arg1 - 30] = arg0.method1399();
			if (this.aClass6Array22[arg1 - 30].method137(Static140.aClass6_953)) {
				this.aClass6Array22[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local198 = arg0.method1402();
			this.aShortArray34 = new short[local198];
			this.aShortArray33 = new short[local198];
			for (local206 = 0; local206 < local198; local206++) {
				this.aShortArray33[local206] = (short) arg0.method1397();
				this.aShortArray34[local206] = (short) arg0.method1397();
			}
		} else if (arg1 == 41) {
			local198 = arg0.method1402();
			this.aShortArray35 = new short[local198];
			this.aShortArray36 = new short[local198];
			for (local206 = 0; local206 < local198; local206++) {
				this.aShortArray35[local206] = (short) arg0.method1397();
				this.aShortArray36[local206] = (short) arg0.method1397();
			}
		} else if (arg1 == 60) {
			local198 = arg0.method1402();
			this.anIntArray383 = new int[local198];
			for (local206 = 0; local206 < local198; local206++) {
				this.anIntArray383[local206] = arg0.method1397();
			}
		} else if (arg1 == 93) {
			this.aBoolean154 = false;
		} else if (arg1 == 95) {
			this.anInt3899 = arg0.method1397();
		} else if (arg1 == 97) {
			this.anInt3904 = arg0.method1397();
		} else if (arg1 == 98) {
			this.anInt3912 = arg0.method1397();
		} else if (arg1 == 99) {
			this.aBoolean155 = true;
		} else if (arg1 == 100) {
			this.anInt3903 = arg0.method1394();
		} else if (arg1 == 101) {
			this.anInt3921 = arg0.method1394() * 5;
		} else if (arg1 == 102) {
			this.anInt3902 = arg0.method1397();
		} else if (arg1 == 103) {
			this.anInt3914 = arg0.method1397();
		} else if (arg1 == 106) {
			this.anInt3901 = arg0.method1397();
			if (this.anInt3901 == 65535) {
				this.anInt3901 = -1;
			}
			this.anInt3917 = arg0.method1397();
			if (this.anInt3917 == 65535) {
				this.anInt3917 = -1;
			}
			local198 = arg0.method1402();
			this.anIntArray382 = new int[local198 + 1];
			for (local206 = 0; local206 <= local198; local206++) {
				this.anIntArray382[local206] = arg0.method1397();
				if (this.anIntArray382[local206] == 65535) {
					this.anIntArray382[local206] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean157 = false;
		} else if (arg1 == 109) {
			this.aBoolean156 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method1397();
				arg0.method1397();
			} else if (arg1 == 114) {
				arg0.method1394();
				arg0.method1394();
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)Z")
	public boolean method2647() {
		if (this.anIntArray382 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3901 != -1) {
			local10 = Static182.method2812(this.anInt3901);
		} else if (this.anInt3917 != -1) {
			local10 = Static11.anIntArray9[this.anInt3917];
		}
		return local10 >= 0 && local10 < this.anIntArray382.length && this.anIntArray382[local10] != -1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ic;I)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method2648(@OriginalArg(1) Class2_Sub3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray382 != null) {
			@Pc(12) Class2_Sub3_Sub17 local12 = this.method2651();
			return local12 == null ? null : local12.method2648(arg0, arg1);
		} else if (this.anIntArray383 == null) {
			return null;
		} else {
			@Pc(40) Class2_Sub3_Sub5_Sub7 local40 = (Class2_Sub3_Sub5_Sub7) Static135.aClass17_21.method505((long) this.anInt3918);
			if (local40 == null) {
				@Pc(44) boolean local44 = false;
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray383.length; local46++) {
					if (!Static177.aClass10_141.method1596(0, this.anIntArray383[local46])) {
						local44 = true;
					}
				}
				if (local44) {
					return null;
				}
				@Pc(78) Class2_Sub3_Sub5_Sub3[] local78 = new Class2_Sub3_Sub5_Sub3[this.anIntArray383.length];
				for (@Pc(80) int local80 = 0; local80 < this.anIntArray383.length; local80++) {
					local78[local80] = Static99.method1637(Static177.aClass10_141, this.anIntArray383[local80]);
				}
				@Pc(106) Class2_Sub3_Sub5_Sub3 local106;
				if (local78.length == 1) {
					local106 = local78[0];
				} else {
					local106 = new Class2_Sub3_Sub5_Sub3(local78, local78.length);
				}
				@Pc(120) int local120;
				if (this.aShortArray33 != null) {
					for (local120 = 0; local120 < this.aShortArray33.length; local120++) {
						local106.method1644(this.aShortArray33[local120], this.aShortArray34[local120]);
					}
				}
				if (this.aShortArray35 != null) {
					for (local120 = 0; local120 < this.aShortArray35.length; local120++) {
						local106.method1648(this.aShortArray35[local120], this.aShortArray36[local120]);
					}
				}
				local40 = local106.method1642(64, 768, -50, -10, -50, true);
				Static135.aClass17_21.method508((long) this.anInt3918, local40);
			}
			if (arg0 != null) {
				local40 = arg0.method1074(local40, arg1);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
	public void method2649() {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ic;IILclient!ic;I)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method2650(@OriginalArg(0) Class2_Sub3_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub3_Sub8 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray382 != null) {
			@Pc(12) Class2_Sub3_Sub17 local12 = this.method2651();
			return local12 == null ? null : local12.method2650(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class2_Sub3_Sub5_Sub7 local37 = (Class2_Sub3_Sub5_Sub7) Static132.aClass17_19.method505((long) this.anInt3918);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray381.length; local43++) {
				if (!Static177.aClass10_141.method1596(0, this.anIntArray381[local43])) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(71) Class2_Sub3_Sub5_Sub3[] local71 = new Class2_Sub3_Sub5_Sub3[this.anIntArray381.length];
			for (@Pc(73) int local73 = 0; local73 < this.anIntArray381.length; local73++) {
				local71[local73] = Static99.method1637(Static177.aClass10_141, this.anIntArray381[local73]);
			}
			@Pc(104) Class2_Sub3_Sub5_Sub3 local104;
			if (local71.length == 1) {
				local104 = local71[0];
			} else {
				local104 = new Class2_Sub3_Sub5_Sub3(local71, local71.length);
			}
			@Pc(115) int local115;
			if (this.aShortArray33 != null) {
				for (local115 = 0; local115 < this.aShortArray33.length; local115++) {
					local104.method1644(this.aShortArray33[local115], this.aShortArray34[local115]);
				}
			}
			if (this.aShortArray35 != null) {
				for (local115 = 0; local115 < this.aShortArray35.length; local115++) {
					local104.method1648(this.aShortArray35[local115], this.aShortArray36[local115]);
				}
			}
			local37 = local104.method1642(this.anInt3903 + 64, this.anInt3921 + 850, -30, -50, -30, true);
			Static132.aClass17_19.method508((long) this.anInt3918, local37);
		}
		@Pc(195) Class2_Sub3_Sub5_Sub7 local195;
		if (arg2 != null && arg0 != null) {
			local195 = arg2.method1072(local37, arg0, arg3, arg1);
		} else if (arg2 != null) {
			local195 = arg2.method1073(local37, arg1);
		} else if (arg0 == null) {
			local195 = local37.method2307(true);
		} else {
			local195 = arg0.method1073(local37, arg3);
		}
		if (this.anInt3904 != 128 || this.anInt3912 != 128) {
			local195.method2309(this.anInt3904, this.anInt3912, this.anInt3904);
		}
		return local195;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)Lclient!ug;")
	public Class2_Sub3_Sub17 method2651() {
		@Pc(9) int local9 = -1;
		if (this.anInt3901 != -1) {
			local9 = Static182.method2812(this.anInt3901);
		} else if (this.anInt3917 != -1) {
			local9 = Static11.anIntArray9[this.anInt3917];
		}
		return local9 < 0 || this.anIntArray382.length <= local9 || this.anIntArray382[local9] == -1 ? null : Static116.method1867(this.anIntArray382[local9]);
	}
}
