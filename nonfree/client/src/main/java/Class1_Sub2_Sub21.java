import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
	public int anInt3946;

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!tb", name = "rb", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!tb", name = "zb", descriptor = "[I")
	private int[] anIntArray340;

	@OriginalMember(owner = "client!tb", name = "Ib", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
	public int anInt3941 = -1;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
	public int anInt3942 = -1;

	@OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
	private int anInt3943 = 0;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
	public int anInt3950 = -1;

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	private int anInt3949 = 0;

	@OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
	public int anInt3954 = -1;

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!tb", name = "nb", descriptor = "Z")
	public boolean aBoolean183 = true;

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "I")
	public int anInt3952 = -1;

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
	public int anInt3958 = -1;

	@OriginalMember(owner = "client!tb", name = "sb", descriptor = "I")
	public int anInt3960 = -1;

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "I")
	public int anInt3959 = -1;

	@OriginalMember(owner = "client!tb", name = "ub", descriptor = "I")
	private int anInt3961 = 128;

	@OriginalMember(owner = "client!tb", name = "tb", descriptor = "Z")
	public boolean aBoolean184 = true;

	@OriginalMember(owner = "client!tb", name = "Cb", descriptor = "I")
	public int anInt3965 = -1;

	@OriginalMember(owner = "client!tb", name = "yb", descriptor = "I")
	private int anInt3963 = -1;

	@OriginalMember(owner = "client!tb", name = "Db", descriptor = "I")
	public int anInt3966 = 1;

	@OriginalMember(owner = "client!tb", name = "Bb", descriptor = "[Lclient!dj;")
	public final Class24[] aClass24Array23 = new Class24[5];

	@OriginalMember(owner = "client!tb", name = "Eb", descriptor = "I")
	private int anInt3967 = -1;

	@OriginalMember(owner = "client!tb", name = "Hb", descriptor = "Lclient!dj;")
	public Class24 aClass24_1151 = Static156.aClass24_1009;

	@OriginalMember(owner = "client!tb", name = "Kb", descriptor = "S")
	public short aShort20 = 0;

	@OriginalMember(owner = "client!tb", name = "Jb", descriptor = "S")
	public short aShort19 = 0;

	@OriginalMember(owner = "client!tb", name = "Gb", descriptor = "I")
	public int anInt3969 = 32;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "Z")
	public boolean aBoolean182 = false;

	@OriginalMember(owner = "client!tb", name = "Mb", descriptor = "I")
	private int anInt3970 = 128;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLclient!td;)Lclient!lg;")
	public Class5_Sub1 method3040(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub22 arg1) {
		if (this.anIntArray337 != null) {
			@Pc(17) Class1_Sub2_Sub21 local17 = this.method3046();
			return local17 == null ? null : local17.method3040(arg0, arg1);
		} else if (this.anIntArray340 == null) {
			return null;
		} else {
			@Pc(40) Class5_Sub1 local40 = (Class5_Sub1) Static153.aClass46_9.method1588((long) this.anInt3946);
			if (local40 == null) {
				@Pc(44) boolean local44 = false;
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray340.length; local46++) {
					if (!Static48.aClass69_12.method2194(this.anIntArray340[local46], 0)) {
						local44 = true;
					}
				}
				if (local44) {
					return null;
				}
				@Pc(74) Class5_Sub6[] local74 = new Class5_Sub6[this.anIntArray340.length];
				for (@Pc(76) int local76 = 0; local76 < this.anIntArray340.length; local76++) {
					local74[local76] = Static171.method2955(Static48.aClass69_12, this.anIntArray340[local76]);
				}
				@Pc(109) Class5_Sub6 local109;
				if (local74.length == 1) {
					local109 = local74[0];
				} else {
					local109 = new Class5_Sub6(local74, local74.length);
				}
				@Pc(120) int local120;
				if (this.aShortArray54 != null) {
					for (local120 = 0; local120 < this.aShortArray54.length; local120++) {
						if (this.aByteArray52 == null || local120 >= this.aByteArray52.length) {
							local109.method2936(this.aShortArray54[local120], this.aShortArray53[local120]);
						} else {
							local109.method2936(this.aShortArray54[local120], Static133.aShortArray37[this.aByteArray52[local120] & 0xFF]);
						}
					}
				}
				if (this.aShortArray52 != null) {
					for (local120 = 0; local120 < this.aShortArray52.length; local120++) {
						local109.method2934(this.aShortArray52[local120], this.aShortArray51[local120]);
					}
				}
				local40 = local109.method2942(64, 768, -50, -10, -50);
				Static153.aClass46_9.method1586(local40, (long) this.anInt3946);
			}
			if (arg1 != null) {
				local40 = arg1.method3079(arg0, local40);
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	public void method3041() {
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)Z")
	public boolean method3044() {
		if (this.anIntArray337 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3967 != -1) {
			local10 = Static43.method797(this.anInt3967);
		} else if (this.anInt3963 != -1) {
			local10 = Static122.anIntArray213[this.anInt3963];
		}
		return local10 >= 0 && this.anIntArray337.length > local10 && this.anIntArray337[local10] != -1;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!fj;B)V")
	public void method3045(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2771();
			if (local9 == 0) {
				return;
			}
			this.method3047(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Lclient!tb;")
	public Class1_Sub2_Sub21 method3046() {
		@Pc(5) int local5 = -1;
		if (this.anInt3967 != -1) {
			local5 = Static43.method797(this.anInt3967);
		} else if (this.anInt3963 != -1) {
			local5 = Static122.anIntArray213[this.anInt3963];
		}
		return local5 < 0 || local5 >= this.anIntArray337.length || this.anIntArray337[local5] == -1 ? null : Static135.method2296(this.anIntArray337[local5]);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!fj;I)V")
	private void method3047(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(246) int local246;
		@Pc(254) int local254;
		if (arg1 == 1) {
			local246 = arg0.method2771();
			this.anIntArray338 = new int[local246];
			for (local254 = 0; local254 < local246; local254++) {
				this.anIntArray338[local254] = arg0.method2765();
			}
		} else if (arg1 == 2) {
			this.aClass24_1151 = arg0.method2761();
		} else if (arg1 == 12) {
			this.anInt3966 = arg0.method2771();
		} else if (arg1 == 13) {
			this.anInt3941 = arg0.method2765();
		} else if (arg1 == 14) {
			this.anInt3950 = arg0.method2765();
		} else if (arg1 == 15) {
			this.anInt3965 = arg0.method2765();
		} else if (arg1 == 16) {
			this.anInt3954 = arg0.method2765();
		} else if (arg1 == 17) {
			this.anInt3950 = arg0.method2765();
			this.anInt3960 = arg0.method2765();
			this.anInt3952 = arg0.method2765();
			this.anInt3942 = arg0.method2765();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass24Array23[arg1 - 30] = arg0.method2761();
			if (this.aClass24Array23[arg1 - 30].method771(Static93.aClass24_635)) {
				this.aClass24Array23[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local246 = arg0.method2771();
			this.aShortArray53 = new short[local246];
			this.aShortArray54 = new short[local246];
			for (local254 = 0; local254 < local246; local254++) {
				this.aShortArray54[local254] = (short) arg0.method2765();
				this.aShortArray53[local254] = (short) arg0.method2765();
			}
		} else if (arg1 == 41) {
			local246 = arg0.method2771();
			this.aShortArray52 = new short[local246];
			this.aShortArray51 = new short[local246];
			for (local254 = 0; local254 < local246; local254++) {
				this.aShortArray52[local254] = (short) arg0.method2765();
				this.aShortArray51[local254] = (short) arg0.method2765();
			}
		} else if (arg1 == 42) {
			local246 = arg0.method2771();
			this.aByteArray52 = new byte[local246];
			for (local254 = 0; local254 < local246; local254++) {
				this.aByteArray52[local254] = arg0.method2770();
			}
		} else if (arg1 == 60) {
			local246 = arg0.method2771();
			this.anIntArray340 = new int[local246];
			for (local254 = 0; local254 < local246; local254++) {
				this.anIntArray340[local254] = arg0.method2765();
			}
		} else if (arg1 == 93) {
			this.aBoolean183 = false;
		} else if (arg1 == 95) {
			this.anInt3958 = arg0.method2765();
		} else if (arg1 == 97) {
			this.anInt3961 = arg0.method2765();
		} else if (arg1 == 98) {
			this.anInt3970 = arg0.method2765();
		} else if (arg1 == 99) {
			this.aBoolean182 = true;
		} else if (arg1 == 100) {
			this.anInt3949 = arg0.method2770();
		} else if (arg1 == 101) {
			this.anInt3943 = arg0.method2770() * 5;
		} else if (arg1 == 102) {
			this.anInt3959 = arg0.method2765();
		} else if (arg1 == 103) {
			this.anInt3969 = arg0.method2765();
		} else if (arg1 == 106) {
			this.anInt3967 = arg0.method2765();
			if (this.anInt3967 == 65535) {
				this.anInt3967 = -1;
			}
			this.anInt3963 = arg0.method2765();
			if (this.anInt3963 == 65535) {
				this.anInt3963 = -1;
			}
			local246 = arg0.method2771();
			this.anIntArray337 = new int[local246 + 1];
			for (local254 = 0; local254 <= local246; local254++) {
				this.anIntArray337[local254] = arg0.method2765();
				if (this.anIntArray337[local254] == 65535) {
					this.anIntArray337[local254] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean184 = false;
		} else if (arg1 == 109) {
			this.aBoolean181 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method2765();
				arg0.method2765();
			} else if (arg1 == 114) {
				arg0.method2770();
				arg0.method2770();
			} else if (arg1 == 115) {
				this.aShort19 = (short) (arg0.method2771() * 4);
				this.aShort20 = (short) (arg0.method2771() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!td;ILclient!td;)Lclient!lg;")
	public Class5_Sub1 method3048(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub22 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub22 arg3) {
		if (this.anIntArray337 != null) {
			@Pc(12) Class1_Sub2_Sub21 local12 = this.method3046();
			return local12 == null ? null : local12.method3048(arg0, arg1, arg2, arg3);
		}
		@Pc(37) Class5_Sub1 local37 = (Class5_Sub1) Static140.aClass46_4.method1588((long) this.anInt3946);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray338.length; local43++) {
				if (!Static48.aClass69_12.method2194(this.anIntArray338[local43], 0)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(71) Class5_Sub6[] local71 = new Class5_Sub6[this.anIntArray338.length];
			for (@Pc(73) int local73 = 0; local73 < this.anIntArray338.length; local73++) {
				local71[local73] = Static171.method2955(Static48.aClass69_12, this.anIntArray338[local73]);
			}
			@Pc(99) Class5_Sub6 local99;
			if (local71.length == 1) {
				local99 = local71[0];
			} else {
				local99 = new Class5_Sub6(local71, local71.length);
			}
			@Pc(113) int local113;
			if (this.aShortArray54 != null) {
				for (local113 = 0; local113 < this.aShortArray54.length; local113++) {
					if (this.aByteArray52 == null || local113 >= this.aByteArray52.length) {
						local99.method2936(this.aShortArray54[local113], this.aShortArray53[local113]);
					} else {
						local99.method2936(this.aShortArray54[local113], Static133.aShortArray37[this.aByteArray52[local113] & 0xFF]);
					}
				}
			}
			if (this.aShortArray52 != null) {
				for (local113 = 0; local113 < this.aShortArray52.length; local113++) {
					local99.method2934(this.aShortArray52[local113], this.aShortArray51[local113]);
				}
			}
			local37 = local99.method2942(this.anInt3949 + 64, this.anInt3943 + 850, -30, -50, -30);
			Static140.aClass46_4.method1586(local37, (long) this.anInt3946);
		}
		@Pc(219) Class5_Sub1 local219;
		if (arg1 != null && arg3 != null) {
			local219 = arg1.method3074(local37, arg2, arg3, arg0);
		} else if (arg1 != null) {
			local219 = arg1.method3072(arg2, local37);
		} else if (arg3 == null) {
			local219 = local37.method153(true);
		} else {
			local219 = arg3.method3072(arg0, local37);
		}
		if (this.anInt3961 != 128 || this.anInt3970 != 128) {
			local219.method154(this.anInt3961, this.anInt3970, this.anInt3961);
		}
		return local219;
	}
}
