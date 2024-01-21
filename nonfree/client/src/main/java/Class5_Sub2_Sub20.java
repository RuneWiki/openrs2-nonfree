import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class5_Sub2_Sub20 extends Class5_Sub2 {

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "[I")
	private int[] anIntArray371;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!sj", name = "T", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
	public int anInt3602;

	@OriginalMember(owner = "client!sj", name = "bb", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!sj", name = "fb", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!sj", name = "ib", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!sj", name = "qb", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!sj", name = "yb", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
	public int anInt3592 = -1;

	@OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
	private int anInt3589 = 128;

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
	private int anInt3588 = -1;

	@OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
	public int anInt3591 = -1;

	@OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
	private int anInt3600 = 128;

	@OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
	public int anInt3594 = -1;

	@OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
	private int anInt3601 = -1;

	@OriginalMember(owner = "client!sj", name = "cb", descriptor = "I")
	public int anInt3603 = -1;

	@OriginalMember(owner = "client!sj", name = "jb", descriptor = "Z")
	public boolean aBoolean165 = true;

	@OriginalMember(owner = "client!sj", name = "gb", descriptor = "I")
	public int anInt3605 = -1;

	@OriginalMember(owner = "client!sj", name = "eb", descriptor = "I")
	public int anInt3604 = -1;

	@OriginalMember(owner = "client!sj", name = "U", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!sj", name = "ab", descriptor = "Z")
	public boolean aBoolean164 = false;

	@OriginalMember(owner = "client!sj", name = "L", descriptor = "S")
	public short aShort42 = 0;

	@OriginalMember(owner = "client!sj", name = "nb", descriptor = "I")
	public int anInt3610 = 1;

	@OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
	public int anInt3590 = -1;

	@OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
	private int anInt3598 = 0;

	@OriginalMember(owner = "client!sj", name = "kb", descriptor = "I")
	public int anInt3607 = -1;

	@OriginalMember(owner = "client!sj", name = "sb", descriptor = "Z")
	public boolean aBoolean166 = true;

	@OriginalMember(owner = "client!sj", name = "xb", descriptor = "S")
	public short aShort43 = 0;

	@OriginalMember(owner = "client!sj", name = "wb", descriptor = "[Lclient!dc;")
	public final Class20[] aClass20Array28 = new Class20[5];

	@OriginalMember(owner = "client!sj", name = "tb", descriptor = "I")
	private int anInt3614 = 0;

	@OriginalMember(owner = "client!sj", name = "vb", descriptor = "I")
	public int anInt3616 = -1;

	@OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
	public int anInt3597 = 32;

	@OriginalMember(owner = "client!sj", name = "zb", descriptor = "Lclient!dc;")
	public Class20 aClass20_1325 = Static188.aClass20_1376;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)Lclient!sj;")
	public Class5_Sub2_Sub20 method2717() {
		@Pc(5) int local5 = -1;
		if (this.anInt3601 != -1) {
			local5 = Static208.method3105(this.anInt3601);
		} else if (this.anInt3588 != -1) {
			local5 = Static139.anIntArray309[this.anInt3588];
		}
		if (local5 < 0 || this.anIntArray373.length - 1 <= local5 || this.anIntArray373[local5] == -1) {
			@Pc(63) int local63 = this.anIntArray373[this.anIntArray373.length - 1];
			return local63 == -1 ? null : Static50.method887(local63);
		} else {
			return Static50.method887(this.anIntArray373[local5]);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ta;IIILclient!ta;)Lclient!a;")
	public Class1_Sub1 method2719(@OriginalArg(0) Class5_Sub2_Sub22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub2_Sub22 arg3) {
		if (this.anIntArray373 != null) {
			@Pc(19) Class5_Sub2_Sub20 local19 = this.method2717();
			return local19 == null ? null : local19.method2719(arg0, arg1, arg2, arg3);
		}
		@Pc(39) Class1_Sub1 local39 = (Class1_Sub1) Static205.aClass84_22.method2332((long) this.anInt3602);
		if (local39 == null) {
			@Pc(43) boolean local43 = false;
			for (@Pc(45) int local45 = 0; local45 < this.anIntArray372.length; local45++) {
				if (!Static66.aClass23_28.method756(this.anIntArray372[local45], 0)) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(75) Class1_Sub5[] local75 = new Class1_Sub5[this.anIntArray372.length];
			for (@Pc(77) int local77 = 0; local77 < this.anIntArray372.length; local77++) {
				local75[local77] = Static112.method1814(Static66.aClass23_28, this.anIntArray372[local77]);
			}
			@Pc(107) Class1_Sub5 local107;
			if (local75.length == 1) {
				local107 = local75[0];
			} else {
				local107 = new Class1_Sub5(local75, local75.length);
			}
			@Pc(121) int local121;
			if (this.aShortArray56 != null) {
				for (local121 = 0; local121 < this.aShortArray56.length; local121++) {
					if (this.aByteArray53 == null || local121 >= this.aByteArray53.length) {
						local107.method1819(this.aShortArray56[local121], this.aShortArray54[local121]);
					} else {
						local107.method1819(this.aShortArray56[local121], Static166.aShortArray46[this.aByteArray53[local121] & 0xFF]);
					}
				}
			}
			if (this.aShortArray53 != null) {
				for (local121 = 0; local121 < this.aShortArray53.length; local121++) {
					local107.method1797(this.aShortArray53[local121], this.aShortArray55[local121]);
				}
			}
			local39 = local107.method1818(this.anInt3614 + 64, this.anInt3598 + 850, -30, -50, -30);
			Static205.aClass84_22.method2331((long) this.anInt3602, local39);
		}
		@Pc(227) Class1_Sub1 local227;
		if (arg0 != null && arg3 != null) {
			local227 = arg0.method2762(arg3, arg2, local39, arg1);
		} else if (arg0 != null) {
			local227 = arg0.method2755(arg1, local39);
		} else if (arg3 == null) {
			local227 = local39.method670(true, true);
		} else {
			local227 = arg3.method2755(arg2, local39);
		}
		if (this.anInt3589 != 128 || this.anInt3600 != 128) {
			local227.method657(this.anInt3589, this.anInt3600, this.anInt3589);
		}
		return local227;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ce;)V")
	public void method2720(@OriginalArg(1) Class5_Sub6 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3062();
			if (local16 == 0) {
				return;
			}
			this.method2723(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLclient!ce;)V")
	private void method2723(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub6 arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		if (arg0 == 1) {
			local10 = arg1.method3062();
			this.anIntArray372 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray372[local16] = arg1.method3077();
			}
		} else if (arg0 == 2) {
			this.aClass20_1325 = arg1.method3027();
		} else if (arg0 == 12) {
			this.anInt3610 = arg1.method3062();
		} else if (arg0 == 13) {
			this.anInt3592 = arg1.method3077();
		} else if (arg0 == 14) {
			this.anInt3590 = arg1.method3077();
		} else if (arg0 == 15) {
			this.anInt3603 = arg1.method3077();
		} else if (arg0 == 16) {
			this.anInt3616 = arg1.method3077();
		} else if (arg0 == 17) {
			this.anInt3590 = arg1.method3077();
			this.anInt3594 = arg1.method3077();
			this.anInt3607 = arg1.method3077();
			this.anInt3591 = arg1.method3077();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass20Array28[arg0 - 30] = arg1.method3027();
			if (this.aClass20Array28[arg0 - 30].method551(Static24.aClass20_180)) {
				this.aClass20Array28[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local10 = arg1.method3062();
			this.aShortArray56 = new short[local10];
			this.aShortArray54 = new short[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.aShortArray56[local16] = (short) arg1.method3077();
				this.aShortArray54[local16] = (short) arg1.method3077();
			}
		} else if (arg0 == 41) {
			local10 = arg1.method3062();
			this.aShortArray55 = new short[local10];
			this.aShortArray53 = new short[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.aShortArray53[local16] = (short) arg1.method3077();
				this.aShortArray55[local16] = (short) arg1.method3077();
			}
		} else if (arg0 == 42) {
			local10 = arg1.method3062();
			this.aByteArray53 = new byte[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.aByteArray53[local16] = arg1.method3053();
			}
		} else if (arg0 == 60) {
			local10 = arg1.method3062();
			this.anIntArray371 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray371[local16] = arg1.method3077();
			}
		} else if (arg0 == 93) {
			this.aBoolean163 = false;
		} else if (arg0 == 95) {
			this.anInt3605 = arg1.method3077();
		} else if (arg0 == 97) {
			this.anInt3589 = arg1.method3077();
		} else if (arg0 == 98) {
			this.anInt3600 = arg1.method3077();
		} else if (arg0 == 99) {
			this.aBoolean164 = true;
		} else if (arg0 == 100) {
			this.anInt3614 = arg1.method3053();
		} else if (arg0 == 101) {
			this.anInt3598 = arg1.method3053() * 5;
		} else if (arg0 == 102) {
			this.anInt3604 = arg1.method3077();
		} else if (arg0 == 103) {
			this.anInt3597 = arg1.method3077();
		} else if (arg0 == 106 || arg0 == 118) {
			local10 = -1;
			this.anInt3601 = arg1.method3077();
			if (this.anInt3601 == 65535) {
				this.anInt3601 = -1;
			}
			this.anInt3588 = arg1.method3077();
			if (this.anInt3588 == 65535) {
				this.anInt3588 = -1;
			}
			if (arg0 == 118) {
				local10 = arg1.method3077();
				if (local10 == 65535) {
					local10 = -1;
				}
			}
			local16 = arg1.method3062();
			this.anIntArray373 = new int[local16 + 2];
			for (@Pc(309) int local309 = 0; local309 <= local16; local309++) {
				this.anIntArray373[local309] = arg1.method3077();
				if (this.anIntArray373[local309] == 65535) {
					this.anIntArray373[local309] = -1;
				}
			}
			this.anIntArray373[local16 + 1] = local10;
		} else if (arg0 == 107) {
			this.aBoolean165 = false;
		} else if (arg0 == 109) {
			this.aBoolean166 = false;
		} else if (arg0 != 111) {
			if (arg0 == 113) {
				arg1.method3077();
				arg1.method3077();
			} else if (arg0 == 114) {
				arg1.method3053();
				arg1.method3053();
			} else if (arg0 == 115) {
				this.aShort43 = (short) (arg1.method3062() * 4);
				this.aShort42 = (short) (arg1.method3062() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)Z")
	public boolean method2724() {
		if (this.anIntArray373 == null) {
			return true;
		}
		@Pc(14) int local14 = -1;
		if (this.anInt3601 != -1) {
			local14 = Static208.method3105(this.anInt3601);
		} else if (this.anInt3588 != -1) {
			local14 = Static139.anIntArray309[this.anInt3588];
		}
		if (local14 < 0 || this.anIntArray373.length - 1 <= local14 || this.anIntArray373[local14] == -1) {
			@Pc(66) int local66 = this.anIntArray373[this.anIntArray373.length - 1];
			return local66 != -1;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ta;I)Lclient!a;")
	public Class1_Sub1 method2728(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub22 arg1) {
		if (this.anIntArray373 != null) {
			@Pc(14) Class5_Sub2_Sub20 local14 = this.method2717();
			return local14 == null ? null : local14.method2728(arg0, arg1);
		} else if (this.anIntArray371 == null) {
			return null;
		} else {
			@Pc(37) Class1_Sub1 local37 = (Class1_Sub1) Static196.aClass84_20.method2332((long) this.anInt3602);
			if (local37 == null) {
				@Pc(41) boolean local41 = false;
				for (@Pc(43) int local43 = 0; local43 < this.anIntArray371.length; local43++) {
					if (!Static66.aClass23_28.method756(this.anIntArray371[local43], 0)) {
						local41 = true;
					}
				}
				if (local41) {
					return null;
				}
				@Pc(77) Class1_Sub5[] local77 = new Class1_Sub5[this.anIntArray371.length];
				for (@Pc(79) int local79 = 0; local79 < this.anIntArray371.length; local79++) {
					local77[local79] = Static112.method1814(Static66.aClass23_28, this.anIntArray371[local79]);
				}
				@Pc(108) Class1_Sub5 local108;
				if (local77.length == 1) {
					local108 = local77[0];
				} else {
					local108 = new Class1_Sub5(local77, local77.length);
				}
				@Pc(119) int local119;
				if (this.aShortArray56 != null) {
					for (local119 = 0; local119 < this.aShortArray56.length; local119++) {
						if (this.aByteArray53 == null || this.aByteArray53.length <= local119) {
							local108.method1819(this.aShortArray56[local119], this.aShortArray54[local119]);
						} else {
							local108.method1819(this.aShortArray56[local119], Static166.aShortArray46[this.aByteArray53[local119] & 0xFF]);
						}
					}
				}
				if (this.aShortArray53 != null) {
					for (local119 = 0; local119 < this.aShortArray53.length; local119++) {
						local108.method1797(this.aShortArray53[local119], this.aShortArray55[local119]);
					}
				}
				local37 = local108.method1818(64, 768, -50, -10, -50);
				Static196.aClass84_20.method2331((long) this.anInt3602, local37);
			}
			if (arg1 != null) {
				local37 = arg1.method2759(local37, arg0);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "(I)V")
	public void method2729() {
	}
}
