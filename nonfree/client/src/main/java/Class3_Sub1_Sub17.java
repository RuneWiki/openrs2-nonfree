import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!uc", name = "qb", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!uc", name = "vb", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!uc", name = "xb", descriptor = "I")
	public int anInt2929;

	@OriginalMember(owner = "client!uc", name = "Ab", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!uc", name = "Hb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!uc", name = "Ub", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
	private int anInt2918 = 128;

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
	public int anInt2915 = -1;

	@OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
	public int anInt2921 = -1;

	@OriginalMember(owner = "client!uc", name = "ub", descriptor = "I")
	public int anInt2927 = 1;

	@OriginalMember(owner = "client!uc", name = "hb", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!uc", name = "Eb", descriptor = "I")
	private int anInt2933 = -1;

	@OriginalMember(owner = "client!uc", name = "yb", descriptor = "I")
	public int anInt2930 = -1;

	@OriginalMember(owner = "client!uc", name = "Mb", descriptor = "Z")
	public boolean aBoolean159 = true;

	@OriginalMember(owner = "client!uc", name = "Fb", descriptor = "Z")
	public boolean aBoolean158 = false;

	@OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
	public int anInt2920 = -1;

	@OriginalMember(owner = "client!uc", name = "Cb", descriptor = "I")
	private int anInt2932 = 0;

	@OriginalMember(owner = "client!uc", name = "Kb", descriptor = "I")
	private int anInt2935 = 0;

	@OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
	public int anInt2919 = -1;

	@OriginalMember(owner = "client!uc", name = "Vb", descriptor = "I")
	private int anInt2942 = 128;

	@OriginalMember(owner = "client!uc", name = "Bb", descriptor = "I")
	public int anInt2931 = -1;

	@OriginalMember(owner = "client!uc", name = "Qb", descriptor = "I")
	public int anInt2938 = -1;

	@OriginalMember(owner = "client!uc", name = "Wb", descriptor = "[Lclient!oa;")
	public final Class56[] aClass56Array16 = new Class56[5];

	@OriginalMember(owner = "client!uc", name = "Tb", descriptor = "I")
	private int anInt2941 = -1;

	@OriginalMember(owner = "client!uc", name = "Ob", descriptor = "Z")
	public boolean aBoolean160 = true;

	@OriginalMember(owner = "client!uc", name = "gb", descriptor = "Lclient!oa;")
	public Class56 aClass56_1589 = Static124.aClass56_1696;

	@OriginalMember(owner = "client!uc", name = "Pb", descriptor = "I")
	public int anInt2937 = -1;

	@OriginalMember(owner = "client!uc", name = "Lb", descriptor = "I")
	public int anInt2936 = -1;

	@OriginalMember(owner = "client!uc", name = "Zb", descriptor = "I")
	public int anInt2944 = 32;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method1894() {
		if (this.anIntArray290 != null) {
			@Pc(12) Class3_Sub1_Sub17 local12 = this.method1901();
			return local12 == null ? null : local12.method1894();
		} else if (this.anIntArray291 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray291.length; local29++) {
				if (!Static117.aClass44_65.method1137(this.anIntArray291[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(57) Class3_Sub1_Sub2_Sub1[] local57 = new Class3_Sub1_Sub2_Sub1[this.anIntArray291.length];
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray291.length; local59++) {
				local57[local59] = Static10.method222(Static117.aClass44_65, this.anIntArray291[local59]);
			}
			@Pc(94) Class3_Sub1_Sub2_Sub1 local94;
			if (local57.length == 1) {
				local94 = local57[0];
			} else {
				local94 = new Class3_Sub1_Sub2_Sub1(local57, local57.length);
			}
			if (this.aShortArray13 != null) {
				for (@Pc(105) int local105 = 0; local105 < this.aShortArray13.length; local105++) {
					local94.method223(this.aShortArray13[local105], this.aShortArray14[local105]);
				}
			}
			return local94;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLclient!ed;ILclient!ed;)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method1897(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub4 arg3) {
		if (this.anIntArray290 != null) {
			@Pc(19) Class3_Sub1_Sub17 local19 = this.method1901();
			return local19 == null ? null : local19.method1897(arg0, arg1, arg2, arg3);
		}
		@Pc(39) Class3_Sub1_Sub2_Sub6 local39 = (Class3_Sub1_Sub2_Sub6) Static15.aClass52_7.method1342((long) this.anInt2929);
		if (local39 == null) {
			@Pc(43) boolean local43 = false;
			for (@Pc(45) int local45 = 0; local45 < this.anIntArray289.length; local45++) {
				if (!Static117.aClass44_65.method1137(this.anIntArray289[local45], 0)) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(73) Class3_Sub1_Sub2_Sub1[] local73 = new Class3_Sub1_Sub2_Sub1[this.anIntArray289.length];
			for (@Pc(75) int local75 = 0; local75 < this.anIntArray289.length; local75++) {
				local73[local75] = Static10.method222(Static117.aClass44_65, this.anIntArray289[local75]);
			}
			@Pc(108) Class3_Sub1_Sub2_Sub1 local108;
			if (local73.length == 1) {
				local108 = local73[0];
			} else {
				local108 = new Class3_Sub1_Sub2_Sub1(local73, local73.length);
			}
			if (this.aShortArray13 != null) {
				for (@Pc(119) int local119 = 0; local119 < this.aShortArray13.length; local119++) {
					local108.method223(this.aShortArray13[local119], this.aShortArray14[local119]);
				}
			}
			local39 = local108.method215(this.anInt2932 + 64, this.anInt2935 + 850, -30, -50, -30);
			Static15.aClass52_7.method1344(local39, (long) this.anInt2929);
		}
		@Pc(170) Class3_Sub1_Sub2_Sub6 local170;
		if (arg3 != null && arg1 != null) {
			local170 = arg3.method594(arg0, local39, arg1, arg2);
		} else if (arg3 != null) {
			local170 = arg3.method597(arg0, local39);
		} else if (arg1 == null) {
			local170 = local39.method1796(true);
		} else {
			local170 = arg1.method597(arg2, local39);
		}
		if (this.anInt2942 != 128 || this.anInt2918 != 128) {
			local170.method1793(this.anInt2942, this.anInt2918, this.anInt2942);
		}
		return local170;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!b;Z)V")
	public void method1899(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method270();
			if (local5 == 0) {
				return;
			}
			this.method1904(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Lclient!uc;")
	public Class3_Sub1_Sub17 method1901() {
		@Pc(5) int local5 = -1;
		if (this.anInt2933 != -1) {
			local5 = Static75.method1343(this.anInt2933);
		} else if (this.anInt2941 != -1) {
			local5 = Static115.anIntArray292[this.anInt2941];
		}
		return local5 < 0 || local5 >= this.anIntArray290.length || this.anIntArray290[local5] == -1 ? null : Static9.method177(this.anIntArray290[local5]);
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z")
	public boolean method1902() {
		if (this.anIntArray290 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt2933 != -1) {
			local10 = Static75.method1343(this.anInt2933);
		} else if (this.anInt2941 != -1) {
			local10 = Static115.anIntArray292[this.anInt2941];
		}
		return local10 >= 0 && local10 < this.anIntArray290.length && this.anIntArray290[local10] != -1;
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
	public void method1903() {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZILclient!b;)V")
	private void method1904(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		if (arg0 == 1) {
			local16 = arg1.method270();
			this.anIntArray289 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray289[local22] = arg1.method276();
			}
		} else if (arg0 == 2) {
			this.aClass56_1589 = arg1.method301();
		} else if (arg0 == 12) {
			this.anInt2927 = arg1.method270();
		} else if (arg0 == 13) {
			this.anInt2915 = arg1.method276();
		} else if (arg0 == 14) {
			this.anInt2937 = arg1.method276();
		} else if (arg0 == 15) {
			this.anInt2920 = arg1.method276();
		} else if (arg0 == 16) {
			this.anInt2938 = arg1.method276();
		} else if (arg0 == 17) {
			this.anInt2937 = arg1.method276();
			this.anInt2931 = arg1.method276();
			this.anInt2919 = arg1.method276();
			this.anInt2921 = arg1.method276();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass56Array16[arg0 - 30] = arg1.method301();
			if (this.aClass56Array16[arg0 - 30].method1418(Static15.aClass56_217)) {
				this.aClass56Array16[arg0 - 30] = null;
				return;
			}
		} else if (arg0 == 40) {
			local16 = arg1.method270();
			this.aShortArray13 = new short[local16];
			this.aShortArray14 = new short[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.aShortArray13[local22] = (short) arg1.method276();
				this.aShortArray14[local22] = (short) arg1.method276();
			}
		} else if (arg0 == 60) {
			local16 = arg1.method270();
			this.anIntArray291 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray291[local22] = arg1.method276();
			}
			return;
		} else if (arg0 == 93) {
			this.aBoolean160 = false;
			return;
		} else if (arg0 == 95) {
			this.anInt2930 = arg1.method276();
			return;
		} else if (arg0 == 97) {
			this.anInt2942 = arg1.method276();
			return;
		} else if (arg0 == 98) {
			this.anInt2918 = arg1.method276();
			return;
		} else if (arg0 == 99) {
			this.aBoolean158 = true;
			return;
		} else if (arg0 == 100) {
			this.anInt2932 = arg1.method265();
			return;
		} else if (arg0 == 101) {
			this.anInt2935 = arg1.method265() * 5;
			return;
		} else if (arg0 == 102) {
			this.anInt2936 = arg1.method276();
			return;
		} else if (arg0 == 103) {
			this.anInt2944 = arg1.method276();
			return;
		} else if (arg0 == 106) {
			this.anInt2933 = arg1.method276();
			if (this.anInt2933 == 65535) {
				this.anInt2933 = -1;
			}
			this.anInt2941 = arg1.method276();
			if (this.anInt2941 == 65535) {
				this.anInt2941 = -1;
			}
			local16 = arg1.method270();
			this.anIntArray290 = new int[local16 + 1];
			for (local22 = 0; local22 <= local16; local22++) {
				this.anIntArray290[local22] = arg1.method276();
				if (this.anIntArray290[local22] == 65535) {
					this.anIntArray290[local22] = -1;
				}
			}
			return;
		} else {
			if (arg0 == 107) {
				this.aBoolean159 = false;
			} else if (arg0 == 109) {
				this.aBoolean156 = false;
				return;
			}
			return;
		}
	}
}
