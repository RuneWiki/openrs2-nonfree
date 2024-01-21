import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!ai", name = "O", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!ai", name = "S", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ai", name = "db", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ai", name = "lb", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!ai", name = "nb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ai", name = "Bb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
	private int anInt323 = 0;

	@OriginalMember(owner = "client!ai", name = "H", descriptor = "[Lclient!ob;")
	public final Class60[] aClass60Array4 = new Class60[5];

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "S")
	public short aShort1 = 0;

	@OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
	private int anInt328 = -1;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
	private int anInt318 = 0;

	@OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
	public int anInt319 = -1;

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
	public int anInt334 = -1;

	@OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
	public int anInt333 = -1;

	@OriginalMember(owner = "client!ai", name = "ib", descriptor = "I")
	public int anInt335 = -1;

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "Lclient!ob;")
	public Class60 aClass60_92 = Static129.aClass60_976;

	@OriginalMember(owner = "client!ai", name = "jb", descriptor = "I")
	private int anInt336 = 128;

	@OriginalMember(owner = "client!ai", name = "hb", descriptor = "Z")
	public boolean aBoolean7 = true;

	@OriginalMember(owner = "client!ai", name = "kb", descriptor = "I")
	public int anInt337 = -1;

	@OriginalMember(owner = "client!ai", name = "sb", descriptor = "I")
	public int anInt342 = -1;

	@OriginalMember(owner = "client!ai", name = "tb", descriptor = "I")
	public int anInt343 = 1;

	@OriginalMember(owner = "client!ai", name = "Ab", descriptor = "I")
	public int anInt348 = -1;

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
	private int anInt327 = 128;

	@OriginalMember(owner = "client!ai", name = "mb", descriptor = "I")
	public int anInt338 = -1;

	@OriginalMember(owner = "client!ai", name = "xb", descriptor = "S")
	public short aShort2 = 0;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "Z")
	public boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ai", name = "Cb", descriptor = "I")
	public int anInt349 = 32;

	@OriginalMember(owner = "client!ai", name = "zb", descriptor = "I")
	public int anInt347 = -1;

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
	private int anInt330 = -1;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Lclient!ai;")
	public Class2_Sub1_Sub2 method273() {
		@Pc(11) int local11 = -1;
		if (this.anInt328 != -1) {
			local11 = Static7.method3570(this.anInt328);
		} else if (this.anInt330 != -1) {
			local11 = Static163.anIntArray447[this.anInt330];
		}
		return local11 < 0 || local11 >= this.anIntArray32.length || this.anIntArray32[local11] == -1 ? null : Static50.method1143(this.anIntArray32[local11]);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!og;II)V")
	private void method274(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		if (arg1 == 1) {
			local10 = arg0.method218();
			this.anIntArray31 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray31[local16] = arg0.method234();
			}
		} else if (arg1 == 2) {
			this.aClass60_92 = arg0.method240();
		} else if (arg1 == 12) {
			this.anInt343 = arg0.method218();
		} else if (arg1 == 13) {
			this.anInt342 = arg0.method234();
		} else if (arg1 == 14) {
			this.anInt335 = arg0.method234();
		} else if (arg1 == 15) {
			this.anInt348 = arg0.method234();
		} else if (arg1 == 16) {
			this.anInt334 = arg0.method234();
		} else if (arg1 == 17) {
			this.anInt335 = arg0.method234();
			this.anInt347 = arg0.method234();
			this.anInt319 = arg0.method234();
			this.anInt333 = arg0.method234();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass60Array4[arg1 - 30] = arg0.method240();
			if (this.aClass60Array4[arg1 - 30].method2698(Static161.aClass60_1093)) {
				this.aClass60Array4[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local10 = arg0.method218();
			this.aShortArray3 = new short[local10];
			this.aShortArray2 = new short[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.aShortArray2[local16] = (short) arg0.method234();
				this.aShortArray3[local16] = (short) arg0.method234();
			}
		} else if (arg1 == 41) {
			local10 = arg0.method218();
			this.aShortArray4 = new short[local10];
			this.aShortArray1 = new short[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.aShortArray4[local16] = (short) arg0.method234();
				this.aShortArray1[local16] = (short) arg0.method234();
			}
		} else if (arg1 == 60) {
			local10 = arg0.method218();
			this.anIntArray30 = new int[local10];
			for (local16 = 0; local16 < local10; local16++) {
				this.anIntArray30[local16] = arg0.method234();
			}
		} else if (arg1 == 93) {
			this.aBoolean7 = false;
		} else if (arg1 == 95) {
			this.anInt337 = arg0.method234();
		} else if (arg1 == 97) {
			this.anInt336 = arg0.method234();
		} else if (arg1 == 98) {
			this.anInt327 = arg0.method234();
		} else if (arg1 == 99) {
			this.aBoolean5 = true;
		} else if (arg1 == 100) {
			this.anInt323 = arg0.method227();
		} else if (arg1 == 101) {
			this.anInt318 = arg0.method227() * 5;
		} else if (arg1 == 102) {
			this.anInt338 = arg0.method234();
		} else if (arg1 == 103) {
			this.anInt349 = arg0.method234();
		} else if (arg1 == 106) {
			this.anInt328 = arg0.method234();
			if (this.anInt328 == 65535) {
				this.anInt328 = -1;
			}
			this.anInt330 = arg0.method234();
			if (this.anInt330 == 65535) {
				this.anInt330 = -1;
			}
			local10 = arg0.method218();
			this.anIntArray32 = new int[local10 + 1];
			for (local16 = 0; local16 <= local10; local16++) {
				this.anIntArray32[local16] = arg0.method234();
				if (this.anIntArray32[local16] == 65535) {
					this.anIntArray32[local16] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean4 = false;
		} else if (arg1 == 109) {
			this.aBoolean6 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method234();
				arg0.method234();
			} else if (arg1 == 114) {
				arg0.method227();
				arg0.method227();
			} else if (arg1 == 115) {
				this.aShort1 = (short) (arg0.method218() * 4);
				this.aShort2 = (short) (arg0.method218() * 4);
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!ce;)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method275(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub5 arg1) {
		if (this.anIntArray32 != null) {
			@Pc(18) Class2_Sub1_Sub2 local18 = this.method273();
			return local18 == null ? null : local18.method275(arg0, arg1);
		} else if (this.anIntArray30 == null) {
			return null;
		} else {
			@Pc(41) Class2_Sub1_Sub1_Sub4 local41 = (Class2_Sub1_Sub1_Sub4) Static181.aClass89_66.method3437((long) this.anInt322);
			if (local41 == null) {
				@Pc(45) boolean local45 = false;
				for (@Pc(47) int local47 = 0; local47 < this.anIntArray30.length; local47++) {
					if (!Static168.aClass13_36.method538(this.anIntArray30[local47], 0)) {
						local45 = true;
					}
				}
				if (local45) {
					return null;
				}
				@Pc(79) Class2_Sub1_Sub1_Sub1[] local79 = new Class2_Sub1_Sub1_Sub1[this.anIntArray30.length];
				for (@Pc(81) int local81 = 0; local81 < this.anIntArray30.length; local81++) {
					local79[local81] = Static23.method578(Static168.aClass13_36, this.anIntArray30[local81]);
				}
				@Pc(113) Class2_Sub1_Sub1_Sub1 local113;
				if (local79.length == 1) {
					local113 = local79[0];
				} else {
					local113 = new Class2_Sub1_Sub1_Sub1(local79, local79.length);
				}
				@Pc(127) int local127;
				if (this.aShortArray2 != null) {
					for (local127 = 0; local127 < this.aShortArray2.length; local127++) {
						local113.method588(this.aShortArray2[local127], this.aShortArray3[local127]);
					}
				}
				if (this.aShortArray4 != null) {
					for (local127 = 0; local127 < this.aShortArray4.length; local127++) {
						local113.method576(this.aShortArray4[local127], this.aShortArray1[local127]);
					}
				}
				local41 = local113.method595(64, 768, -50, -10, -50);
				Static181.aClass89_66.method3432(local41, (long) this.anInt322);
			}
			if (arg1 != null) {
				local41 = arg1.method646(local41, arg0);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	public void method276() {
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)Z")
	public boolean method277() {
		if (this.anIntArray32 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt328 != -1) {
			local10 = Static7.method3570(this.anInt328);
		} else if (this.anInt330 != -1) {
			local10 = Static163.anIntArray447[this.anInt330];
		}
		return local10 >= 0 && this.anIntArray32.length > local10 && this.anIntArray32[local10] != -1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZILclient!ce;Lclient!ce;I)Lclient!fe;")
	public Class2_Sub1_Sub1_Sub4 method278(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub5 arg1, @OriginalArg(3) Class2_Sub1_Sub5 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray32 != null) {
			@Pc(12) Class2_Sub1_Sub2 local12 = this.method273();
			return local12 == null ? null : local12.method278(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class2_Sub1_Sub1_Sub4 local32 = (Class2_Sub1_Sub1_Sub4) Static149.aClass89_56.method3437((long) this.anInt322);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray31.length; local38++) {
				if (!Static168.aClass13_36.method538(this.anIntArray31[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class2_Sub1_Sub1_Sub1[] local70 = new Class2_Sub1_Sub1_Sub1[this.anIntArray31.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray31.length; local72++) {
				local70[local72] = Static23.method578(Static168.aClass13_36, this.anIntArray31[local72]);
			}
			@Pc(102) Class2_Sub1_Sub1_Sub1 local102;
			if (local70.length == 1) {
				local102 = local70[0];
			} else {
				local102 = new Class2_Sub1_Sub1_Sub1(local70, local70.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray2 != null) {
				for (local116 = 0; local116 < this.aShortArray2.length; local116++) {
					local102.method588(this.aShortArray2[local116], this.aShortArray3[local116]);
				}
			}
			if (this.aShortArray4 != null) {
				for (local116 = 0; local116 < this.aShortArray4.length; local116++) {
					local102.method576(this.aShortArray4[local116], this.aShortArray1[local116]);
				}
			}
			local32 = local102.method595(this.anInt323 + 64, this.anInt318 + 850, -30, -50, -30);
			Static149.aClass89_56.method3432(local32, (long) this.anInt322);
		}
		@Pc(200) Class2_Sub1_Sub1_Sub4 local200;
		if (arg1 != null && arg2 != null) {
			local200 = arg1.method647(local32, arg2, arg0, arg3);
		} else if (arg1 != null) {
			local200 = arg1.method645(local32, arg3);
		} else if (arg2 == null) {
			local200 = local32.method1615(true);
		} else {
			local200 = arg2.method645(local32, arg0);
		}
		if (this.anInt336 != 128 || this.anInt327 != 128) {
			local200.method1611(this.anInt336, this.anInt327, this.anInt336);
		}
		return local200;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!og;I)V")
	public void method279(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method218();
			if (local7 == 0) {
				return;
			}
			this.method274(arg0, local7);
		}
	}
}
