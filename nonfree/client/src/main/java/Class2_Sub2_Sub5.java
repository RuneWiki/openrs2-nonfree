import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!bf", name = "vb", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!bf", name = "Db", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!bf", name = "Kb", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!bf", name = "Mb", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!bf", name = "Ob", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
	private int anInt505 = -1;

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "Z")
	public boolean aBoolean22 = true;

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "I")
	private int anInt512 = 128;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "I")
	public int anInt513 = -1;

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "I")
	public int anInt520 = 1;

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
	public int anInt524 = -1;

	@OriginalMember(owner = "client!bf", name = "rb", descriptor = "I")
	public int anInt523 = 0;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
	private int anInt507 = 0;

	@OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
	private int anInt521 = -1;

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
	private int anInt511 = 0;

	@OriginalMember(owner = "client!bf", name = "Eb", descriptor = "Z")
	public boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "I")
	public int anInt522 = 0;

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!bf", name = "tb", descriptor = "Lclient!sg;")
	public Class77 aClass77_246 = Static166.aClass77_1504;

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "[Lclient!sg;")
	public final Class77[] aClass77Array4 = new Class77[5];

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "I")
	public int anInt514 = 2;

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!bf", name = "wb", descriptor = "I")
	public int anInt526 = 16;

	@OriginalMember(owner = "client!bf", name = "Ib", descriptor = "I")
	private int anInt533 = 0;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bf", name = "Qb", descriptor = "Z")
	public boolean aBoolean28 = true;

	@OriginalMember(owner = "client!bf", name = "Jb", descriptor = "I")
	private int anInt534 = 128;

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
	public int anInt517 = 0;

	@OriginalMember(owner = "client!bf", name = "yb", descriptor = "I")
	private int anInt527 = -1;

	@OriginalMember(owner = "client!bf", name = "Nb", descriptor = "I")
	private int anInt536 = 128;

	@OriginalMember(owner = "client!bf", name = "Lb", descriptor = "I")
	public int anInt535 = -1;

	@OriginalMember(owner = "client!bf", name = "Tb", descriptor = "I")
	public int anInt540 = -1;

	@OriginalMember(owner = "client!bf", name = "Bb", descriptor = "I")
	private int anInt529 = 0;

	@OriginalMember(owner = "client!bf", name = "Cb", descriptor = "I")
	public int anInt530 = -1;

	@OriginalMember(owner = "client!bf", name = "Sb", descriptor = "I")
	public int anInt539 = 0;

	@OriginalMember(owner = "client!bf", name = "Rb", descriptor = "I")
	public int anInt538 = 1;

	@OriginalMember(owner = "client!bf", name = "Yb", descriptor = "I")
	public int anInt544 = -1;

	@OriginalMember(owner = "client!bf", name = "Wb", descriptor = "I")
	private int anInt543 = 0;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)Z")
	public boolean method342() {
		if (this.anIntArray75 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray75.length; local14++) {
			local12 &= Static117.aClass43_28.method2220(0, this.anIntArray75[local14] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Lclient!fe;")
	private Class2_Sub2_Sub1_Sub3 method344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(1) Class2_Sub2_Sub1_Sub3 local1 = null;
		@Pc(12) int local12;
		@Pc(43) int local43;
		@Pc(111) boolean local111;
		@Pc(131) int local131;
		if (this.anIntArray74 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray75 == null) {
				return null;
			}
			local12 = this.anIntArray75.length;
			local111 = this.aBoolean21;
			if (arg0 == 2 && arg1 > 3) {
				local111 = !local111;
			}
			for (local43 = 0; local43 < local12; local43++) {
				local131 = this.anIntArray75[local43];
				if (local111) {
					local131 += 65536;
				}
				local1 = (Class2_Sub2_Sub1_Sub3) Static143.aClass82_51.method2699((long) local131);
				if (local1 == null) {
					local1 = Static47.method877(Static117.aClass43_28, local131 & 0xFFFF);
					if (local1 == null) {
						return null;
					}
					if (local111) {
						local1.method870();
					}
					Static143.aClass82_51.method2701((long) local131, local1);
				}
				if (local12 > 1) {
					Static70.aClass2_Sub2_Sub1_Sub3Array1[local43] = local1;
				}
			}
			if (local12 > 1) {
				local1 = new Class2_Sub2_Sub1_Sub3(Static70.aClass2_Sub2_Sub1_Sub3Array1, local12);
			}
		} else {
			@Pc(10) int local10 = -1;
			for (local12 = 0; local12 < this.anIntArray74.length; local12++) {
				if (arg0 == this.anIntArray74[local12]) {
					local10 = local12;
					break;
				}
			}
			if (local10 == -1) {
				return null;
			}
			local43 = this.anIntArray75[local10];
			@Pc(55) boolean local55 = this.aBoolean21 ^ arg1 > 3;
			if (local55) {
				local43 += 65536;
			}
			local1 = (Class2_Sub2_Sub1_Sub3) Static143.aClass82_51.method2699((long) local43);
			if (local1 == null) {
				local1 = Static47.method877(Static117.aClass43_28, local43 & 0xFFFF);
				if (local1 == null) {
					return null;
				}
				if (local55) {
					local1.method870();
				}
				Static143.aClass82_51.method2701((long) local43, local1);
			}
		}
		if (this.anInt512 == 128 && this.anInt536 == 128 && this.anInt534 == 128) {
			local111 = false;
		} else {
			local111 = true;
		}
		@Pc(227) boolean local227;
		if (this.anInt507 == 0 && this.anInt533 == 0 && this.anInt529 == 0) {
			local227 = false;
		} else {
			local227 = true;
		}
		@Pc(260) Class2_Sub2_Sub1_Sub3 local260 = new Class2_Sub2_Sub1_Sub3(local1, arg1 == 0 && !local111 && !local227, this.aShortArray18 == null, this.aShortArray21 == null, true);
		if (arg0 == 4 && arg1 > 3) {
			local260.method869();
			local260.method871(45, 0, -45);
		}
		@Pc(283) int local283 = arg1 & 0x3;
		if (local283 == 1) {
			local260.method878();
		} else if (local283 == 2) {
			local260.method868();
		} else if (local283 == 3) {
			local260.method881();
		}
		if (this.aShortArray18 != null) {
			for (local131 = 0; local131 < this.aShortArray18.length; local131++) {
				local260.method864(this.aShortArray18[local131], this.aShortArray20[local131]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local131 = 0; local131 < this.aShortArray21.length; local131++) {
				local260.method880(this.aShortArray21[local131], this.aShortArray19[local131]);
			}
		}
		if (local111) {
			local260.method859(this.anInt512, this.anInt536, this.anInt534);
		}
		if (local227) {
			local260.method871(this.anInt507, this.anInt533, this.anInt529);
		}
		return local260;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[[IBIIILclient!tc;I)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub2_Sub15 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray74 == null) {
			local16 = arg5 + (this.anInt516 << 10);
		} else {
			local16 = arg5 + (arg7 << 3) + (this.anInt516 << 10);
		}
		@Pc(32) Class2_Sub2_Sub1_Sub2 local32 = (Class2_Sub2_Sub1_Sub2) Static176.aClass82_63.method2699(local16);
		if (local32 == null) {
			@Pc(44) Class2_Sub2_Sub1_Sub3 local44 = this.method344(arg7, arg5);
			if (local44 == null) {
				return null;
			}
			local32 = local44.method865(this.anInt543 + 64, this.anInt511 * 5 + 768, -50, -10, -50, true);
			Static176.aClass82_63.method2701(local16, local32);
		}
		if (arg6 == null && this.anInt527 == -1) {
			return local32;
		}
		if (arg6 == null) {
			local32 = local32.method582(true);
		} else {
			local32 = arg6.method2590(local32, arg5, arg4);
		}
		if (this.anInt527 >= 0) {
			local32 = local32.method593(arg2, arg3, arg1, arg0, false, this.anInt527);
		}
		return local32;
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)Lclient!bf;")
	public Class2_Sub2_Sub5 method347() {
		@Pc(13) int local13 = -1;
		if (this.anInt505 != -1) {
			local13 = Static53.method1023(this.anInt505);
		} else if (this.anInt521 != -1) {
			local13 = Static6.anIntArray24[this.anInt521];
		}
		return local13 < 0 || local13 >= this.anIntArray73.length || this.anIntArray73[local13] == -1 ? null : Static121.method2129(this.anIntArray73[local13]);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([[IIIIIII)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method348(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray74 == null) {
			local19 = arg3 + (this.anInt516 << 10);
		} else {
			local19 = arg3 + (arg2 << 3) + (this.anInt516 << 10);
		}
		@Pc(38) Class2_Sub2_Sub1_Sub2 local38 = (Class2_Sub2_Sub1_Sub2) Static46.aClass82_18.method2699(local19);
		if (local38 == null) {
			@Pc(46) Class2_Sub2_Sub1_Sub3 local46 = this.method344(arg2, arg3);
			if (local46 == null) {
				return null;
			}
			local38 = local46.method865(this.anInt543 + 64, this.anInt511 * 5 + 768, -50, -10, -50, ~this.anInt527 <= -1);
			Static46.aClass82_18.method2701(local19, local38);
		}
		if (this.anInt527 >= 0) {
			local38 = local38.method593(arg0, arg5, arg1, arg4, true, this.anInt527);
		}
		return local38;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method349(@OriginalArg(0) Class2_Sub18 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2387();
			if (local3 == 0) {
				return;
			}
			this.method355(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[[IIIII)Lclient!ac;")
	public Class2_Sub2_Sub1 method351(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) long local16;
		if (this.anIntArray74 == null) {
			local16 = (this.anInt516 << 10) + arg3;
		} else {
			local16 = arg3 + (arg4 << 3) + (this.anInt516 << 10);
		}
		@Pc(36) Class2_Sub2_Sub1 local36 = (Class2_Sub2_Sub1) Static46.aClass82_17.method2699(local16);
		if (local36 == null) {
			@Pc(44) Class2_Sub2_Sub1_Sub3 local44 = this.method344(arg4, arg3);
			if (local44 == null) {
				return null;
			}
			if (this.aBoolean23) {
				local36 = local44;
				local44.aShort21 = (short) (this.anInt511 * 5 + 768);
				local44.aShort24 = (short) (this.anInt543 + 64);
				local44.method875();
			} else {
				local36 = local44.method865(this.anInt543 + 64, this.anInt511 * 5 + 768, -50, -10, -50, ~this.anInt527 <= -1);
			}
			Static46.aClass82_17.method2701(local16, local36);
		}
		if (this.aBoolean23) {
			local36 = ((Class2_Sub2_Sub1_Sub3) local36).method860();
		}
		if (this.anInt527 >= 0) {
			if (local36 instanceof Class2_Sub2_Sub1_Sub2) {
				local36 = ((Class2_Sub2_Sub1_Sub2) local36).method593(arg1, arg5, arg2, arg0, true, this.anInt527);
			} else if (local36 instanceof Class2_Sub2_Sub1_Sub3) {
				local36 = ((Class2_Sub2_Sub1_Sub3) local36).method873(arg1, arg5, arg2, arg0, this.anInt527);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)Z")
	public boolean method352() {
		if (this.anIntArray73 == null) {
			return this.anInt535 != -1 || this.anIntArray76 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray73.length; local21++) {
			if (this.anIntArray73[local21] != -1) {
				@Pc(36) Class2_Sub2_Sub5 local36 = Static121.method2129(this.anIntArray73[local21]);
				if (local36.anInt535 != -1 || local36.anIntArray76 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "(I)V")
	public void method353() {
		if (this.anInt540 == -1) {
			this.anInt540 = 0;
			if (this.anIntArray75 != null && (this.anIntArray74 == null || this.anIntArray74[0] == 10)) {
				this.anInt540 = 1;
			}
			for (@Pc(27) int local27 = 0; local27 < 5; local27++) {
				if (this.aClass77Array4[local27] != null) {
					this.anInt540 = 1;
				}
			}
		}
		if (this.anInt524 == -1) {
			this.anInt524 = this.anInt514 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)Z")
	public boolean method354(@OriginalArg(0) int arg0) {
		if (this.anIntArray74 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray74.length; local15++) {
				if (arg0 == this.anIntArray74[local15]) {
					return Static117.aClass43_28.method2220(0, this.anIntArray75[local15] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray75 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(54) boolean local54 = true;
			for (@Pc(56) int local56 = 0; local56 < this.anIntArray75.length; local56++) {
				local54 &= Static117.aClass43_28.method2220(0, this.anIntArray75[local56] & 0xFFFF);
			}
			return local54;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!oa;II)V")
	private void method355(@OriginalArg(0) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		@Pc(141) int local141;
		@Pc(151) int local151;
		if (arg1 == 1) {
			local141 = arg0.method2387();
			if (local141 > 0) {
				if (this.anIntArray75 == null || Static4.aBoolean179) {
					this.anIntArray74 = new int[local141];
					this.anIntArray75 = new int[local141];
					for (local151 = 0; local151 < local141; local151++) {
						this.anIntArray75[local151] = arg0.method2353();
						this.anIntArray74[local151] = arg0.method2387();
					}
				} else {
					arg0.anInt3423 += local141 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass77_246 = arg0.method2361();
		} else if (arg1 == 5) {
			local141 = arg0.method2387();
			if (local141 > 0) {
				if (this.anIntArray75 == null || Static4.aBoolean179) {
					this.anIntArray75 = new int[local141];
					this.anIntArray74 = null;
					for (local151 = 0; local151 < local141; local151++) {
						this.anIntArray75[local151] = arg0.method2353();
					}
				} else {
					arg0.anInt3423 += local141 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt520 = arg0.method2387();
		} else if (arg1 == 15) {
			this.anInt538 = arg0.method2387();
		} else if (arg1 == 17) {
			this.aBoolean28 = false;
			this.anInt514 = 0;
		} else if (arg1 == 18) {
			this.aBoolean28 = false;
		} else if (arg1 == 19) {
			this.anInt540 = arg0.method2387();
		} else if (arg1 == 21) {
			this.anInt527 = 0;
		} else if (arg1 == 22) {
			this.aBoolean23 = true;
		} else if (arg1 == 23) {
			this.aBoolean27 = true;
		} else if (arg1 == 24) {
			this.anInt513 = arg0.method2353();
			if (this.anInt513 == 65535) {
				this.anInt513 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt514 = 1;
		} else if (arg1 == 28) {
			this.anInt526 = arg0.method2387();
		} else if (arg1 == 29) {
			this.anInt543 = arg0.method2392();
		} else if (arg1 == 39) {
			this.anInt511 = arg0.method2392() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass77Array4[arg1 - 30] = arg0.method2361();
			if (this.aClass77Array4[arg1 - 30].method2508(Static119.aClass77_1104)) {
				this.aClass77Array4[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local141 = arg0.method2387();
			this.aShortArray18 = new short[local141];
			this.aShortArray20 = new short[local141];
			for (local151 = 0; local151 < local141; local151++) {
				this.aShortArray18[local151] = (short) arg0.method2353();
				this.aShortArray20[local151] = (short) arg0.method2353();
			}
		} else if (arg1 == 41) {
			local141 = arg0.method2387();
			this.aShortArray19 = new short[local141];
			this.aShortArray21 = new short[local141];
			for (local151 = 0; local151 < local141; local151++) {
				this.aShortArray21[local151] = (short) arg0.method2353();
				this.aShortArray19[local151] = (short) arg0.method2353();
			}
		} else if (arg1 == 60) {
			this.anInt544 = arg0.method2353();
		} else if (arg1 == 62) {
			this.aBoolean21 = true;
		} else if (arg1 == 64) {
			this.aBoolean22 = false;
		} else if (arg1 == 65) {
			this.anInt512 = arg0.method2353();
		} else if (arg1 == 66) {
			this.anInt536 = arg0.method2353();
		} else if (arg1 == 67) {
			this.anInt534 = arg0.method2353();
		} else if (arg1 == 68) {
			this.anInt530 = arg0.method2353();
		} else if (arg1 == 69) {
			this.anInt517 = arg0.method2387();
		} else if (arg1 == 70) {
			this.anInt507 = arg0.method2386();
		} else if (arg1 == 71) {
			this.anInt533 = arg0.method2386();
		} else if (arg1 == 72) {
			this.anInt529 = arg0.method2386();
		} else if (arg1 == 73) {
			this.aBoolean26 = true;
		} else if (arg1 == 74) {
			this.aBoolean24 = true;
		} else if (arg1 == 75) {
			this.anInt524 = arg0.method2387();
		} else if (arg1 == 77) {
			this.anInt505 = arg0.method2353();
			if (this.anInt505 == 65535) {
				this.anInt505 = -1;
			}
			this.anInt521 = arg0.method2353();
			if (this.anInt521 == 65535) {
				this.anInt521 = -1;
			}
			local141 = arg0.method2387();
			this.anIntArray73 = new int[local141 + 1];
			for (local151 = 0; local151 <= local141; local151++) {
				this.anIntArray73[local151] = arg0.method2353();
				if (this.anIntArray73[local151] == 65535) {
					this.anIntArray73[local151] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt535 = arg0.method2353();
			this.anInt522 = arg0.method2387();
		} else if (arg1 == 79) {
			this.anInt523 = arg0.method2353();
			this.anInt539 = arg0.method2353();
			this.anInt522 = arg0.method2387();
			local141 = arg0.method2387();
			this.anIntArray76 = new int[local141];
			for (local151 = 0; local151 < local141; local151++) {
				this.anIntArray76[local151] = arg0.method2353();
			}
		} else if (arg1 == 81) {
			this.anInt527 = arg0.method2387() * 256;
		}
	}
}
