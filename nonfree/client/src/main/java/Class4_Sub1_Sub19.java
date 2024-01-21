import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class4_Sub1_Sub19 extends Class4_Sub1 {

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "[I")
	public int[] anIntArray442;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "[I")
	private int[] anIntArray444;

	@OriginalMember(owner = "client!wh", name = "bb", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!wh", name = "ib", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!wh", name = "pb", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!wh", name = "Bb", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!wh", name = "Gb", descriptor = "I")
	public int anInt4188;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
	public int anInt4154 = 0;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
	private int anInt4152 = 0;

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
	private int anInt4161 = -1;

	@OriginalMember(owner = "client!wh", name = "W", descriptor = "I")
	private int anInt4166 = 128;

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "I")
	private int anInt4150 = 128;

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
	public int anInt4167 = -1;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
	private int anInt4153 = 0;

	@OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
	private int anInt4163 = 0;

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "Z")
	public boolean aBoolean173 = false;

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
	private int anInt4165 = 0;

	@OriginalMember(owner = "client!wh", name = "gb", descriptor = "Lclient!jd;")
	public Class46 aClass46_1521 = Static159.aClass46_1315;

	@OriginalMember(owner = "client!wh", name = "nb", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!wh", name = "ob", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	public int anInt4156 = 2;

	@OriginalMember(owner = "client!wh", name = "hb", descriptor = "I")
	private int anInt4174 = 128;

	@OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
	public int anInt4175 = -1;

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
	public int anInt4168 = 16;

	@OriginalMember(owner = "client!wh", name = "sb", descriptor = "I")
	public int anInt4181 = 0;

	@OriginalMember(owner = "client!wh", name = "ub", descriptor = "I")
	public int anInt4182 = 0;

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
	public int anInt4164 = -1;

	@OriginalMember(owner = "client!wh", name = "zb", descriptor = "Z")
	public boolean aBoolean178 = true;

	@OriginalMember(owner = "client!wh", name = "vb", descriptor = "I")
	public int anInt4183 = -1;

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
	private int anInt4155 = -1;

	@OriginalMember(owner = "client!wh", name = "tb", descriptor = "Z")
	public boolean aBoolean177 = true;

	@OriginalMember(owner = "client!wh", name = "wb", descriptor = "I")
	public int anInt4184 = -1;

	@OriginalMember(owner = "client!wh", name = "Ab", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!wh", name = "mb", descriptor = "I")
	public int anInt4178 = 0;

	@OriginalMember(owner = "client!wh", name = "Y", descriptor = "Z")
	public boolean aBoolean174 = false;

	@OriginalMember(owner = "client!wh", name = "Fb", descriptor = "I")
	public int anInt4187 = 1;

	@OriginalMember(owner = "client!wh", name = "Db", descriptor = "I")
	public int anInt4185 = -1;

	@OriginalMember(owner = "client!wh", name = "Hb", descriptor = "Z")
	private boolean aBoolean180 = false;

	@OriginalMember(owner = "client!wh", name = "Ib", descriptor = "I")
	private int anInt4189 = -1;

	@OriginalMember(owner = "client!wh", name = "Cb", descriptor = "[Lclient!jd;")
	public final Class46[] aClass46Array26 = new Class46[5];

	@OriginalMember(owner = "client!wh", name = "Kb", descriptor = "I")
	private int anInt4190 = 0;

	@OriginalMember(owner = "client!wh", name = "Lb", descriptor = "I")
	public int anInt4191 = 1;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)Z")
	public boolean method3180() {
		if (this.anIntArray444 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray444.length; local14++) {
			local12 &= Static96.aClass62_26.method2872(0, this.anIntArray444[local14] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!h;)V")
	public void method3181(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1253();
			if (local5 == 0) {
				return;
			}
			this.method3194(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V")
	public void method3183() {
		if (this.anInt4175 == -1) {
			this.anInt4175 = 0;
			if (this.anIntArray444 != null && (this.anIntArray443 == null || this.anIntArray443[0] == 10)) {
				this.anInt4175 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < 5; local31++) {
				if (this.aClass46Array26[local31] != null) {
					this.anInt4175 = 1;
				}
			}
		}
		if (this.anInt4164 == -1) {
			this.anInt4164 = this.anInt4156 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Lclient!ff;")
	private Class4_Sub1_Sub1_Sub6 method3184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class4_Sub1_Sub1_Sub6 local3 = null;
		@Pc(10) boolean local10 = this.aBoolean180;
		if (arg0 == 2 && arg1 > 3) {
			local10 = !local10;
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		@Pc(63) int local63;
		if (this.anIntArray443 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray444 == null) {
				return null;
			}
			local29 = this.anIntArray444.length;
			for (local31 = 0; local31 < local29; local31++) {
				local63 = this.anIntArray444[local31];
				if (local10) {
					local63 += 65536;
				}
				local3 = (Class4_Sub1_Sub1_Sub6) Static149.aClass66_45.method2225((long) local63);
				if (local3 == null) {
					local3 = Static51.method1003(Static96.aClass62_26, local63 & 0xFFFF);
					if (local3 == null) {
						return null;
					}
					if (local10) {
						local3.method1000();
					}
					Static149.aClass66_45.method2222(local3, (long) local63);
				}
				if (local29 > 1) {
					Static131.aClass4_Sub1_Sub1_Sub6Array1[local31] = local3;
				}
			}
			if (local29 > 1) {
				local3 = new Class4_Sub1_Sub1_Sub6(Static131.aClass4_Sub1_Sub1_Sub6Array1, local29);
			}
		} else {
			local29 = -1;
			for (local31 = 0; local31 < this.anIntArray443.length; local31++) {
				if (arg0 == this.anIntArray443[local31]) {
					local29 = local31;
					break;
				}
			}
			if (local29 == -1) {
				return null;
			}
			local63 = this.anIntArray444[local29];
			if (local10) {
				local63 += 65536;
			}
			local3 = (Class4_Sub1_Sub1_Sub6) Static149.aClass66_45.method2225((long) local63);
			if (local3 == null) {
				local3 = Static51.method1003(Static96.aClass62_26, local63 & 0xFFFF);
				if (local3 == null) {
					return null;
				}
				if (local10) {
					local3.method1000();
				}
				Static149.aClass66_45.method2222(local3, (long) local63);
			}
		}
		@Pc(206) boolean local206;
		if (this.anInt4150 == 128 && this.anInt4174 == 128 && this.anInt4166 == 128) {
			local206 = false;
		} else {
			local206 = true;
		}
		@Pc(221) boolean local221;
		if (this.anInt4165 == 0 && this.anInt4163 == 0 && this.anInt4152 == 0) {
			local221 = false;
		} else {
			local221 = true;
		}
		@Pc(255) Class4_Sub1_Sub1_Sub6 local255 = new Class4_Sub1_Sub1_Sub6(local3, arg1 == 0 && !local206 && !local221 && !local10, this.aShortArray46 == null, this.aShortArray48 == null, true);
		if (local10) {
			local255.method1015();
		}
		if (arg0 == 4 && arg1 > 3) {
			local255.method1014();
			local255.method992(45, 0, -45);
		}
		@Pc(281) int local281 = arg1 & 0x3;
		if (local281 == 1) {
			local255.method1009();
		} else if (local281 == 2) {
			local255.method994();
		} else if (local281 == 3) {
			local255.method998();
		}
		@Pc(311) int local311;
		if (this.aShortArray46 != null) {
			for (local311 = 0; local311 < this.aShortArray46.length; local311++) {
				local255.method1011(this.aShortArray46[local311], this.aShortArray49[local311]);
			}
		}
		if (this.aShortArray48 != null) {
			for (local311 = 0; local311 < this.aShortArray48.length; local311++) {
				local255.method1010(this.aShortArray48[local311], this.aShortArray47[local311]);
			}
		}
		if (local206) {
			local255.method996(this.anInt4150, this.anInt4174, this.anInt4166);
		}
		if (local221) {
			local255.method992(this.anInt4165, this.anInt4163, this.anInt4152);
		}
		return local255;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)Lclient!wh;")
	public Class4_Sub1_Sub19 method3185() {
		@Pc(1) int local1 = -1;
		if (this.anInt4155 != -1) {
			local1 = Static26.method438(this.anInt4155);
		} else if (this.anInt4161 != -1) {
			local1 = Static147.anIntArray64[this.anInt4161];
		}
		return local1 < 0 || this.anIntArray442.length <= local1 || this.anIntArray442[local1] == -1 ? null : Static113.method2090(this.anIntArray442[local1]);
	}

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)Z")
	public boolean method3187() {
		if (this.anIntArray442 == null) {
			return this.anInt4167 != -1 || this.anIntArray445 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray442.length; local21++) {
			if (this.anIntArray442[local21] != -1) {
				@Pc(36) Class4_Sub1_Sub19 local36 = Static113.method2090(this.anIntArray442[local21]);
				if (local36.anInt4167 != -1 || local36.anIntArray445 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Z")
	public boolean method3188(@OriginalArg(1) int arg0) {
		if (this.anIntArray443 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray443.length; local18++) {
				if (arg0 == this.anIntArray443[local18]) {
					return Static96.aClass62_26.method2872(0, this.anIntArray444[local18] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray444 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(57) boolean local57 = true;
			for (@Pc(59) int local59 = 0; local59 < this.anIntArray444.length; local59++) {
				local57 &= Static96.aClass62_26.method2872(0, this.anIntArray444[local59] & 0xFFFF);
			}
			return local57;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIILclient!ca;II[[IZ)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method3189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[][] arg7) {
		@Pc(19) long local19;
		if (this.anIntArray443 == null) {
			local19 = (this.anInt4188 << 10) + arg2;
		} else {
			local19 = (arg0 << 3) + (this.anInt4188 << 10) + arg2;
		}
		@Pc(39) Class4_Sub1_Sub1_Sub4 local39 = (Class4_Sub1_Sub1_Sub4) Static147.aClass66_11.method2225(local19);
		if (local39 == null) {
			@Pc(51) Class4_Sub1_Sub1_Sub6 local51 = this.method3184(arg0, arg2);
			if (local51 == null) {
				return null;
			}
			local39 = local51.method1007(this.anInt4190 + 64, this.anInt4153 * 5 + 768, -50, -10, -50, true);
			Static147.aClass66_11.method2222(local39, local19);
		}
		if (arg4 == null && this.anInt4189 == -1) {
			return local39;
		}
		if (arg4 == null) {
			local39 = local39.method2833(true);
		} else {
			local39 = arg4.method343(arg6, local39, arg2);
		}
		if (this.anInt4189 >= 0) {
			local39 = local39.method2825(arg7, arg3, arg1, arg5, false, this.anInt4189);
		}
		return local39;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIIIII[[I)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method3190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(15) long local15;
		if (this.anIntArray443 == null) {
			local15 = arg0 + (this.anInt4188 << 10);
		} else {
			local15 = (this.anInt4188 << 10) + (arg3 << 3) + arg0;
		}
		@Pc(40) Class4_Sub1_Sub1_Sub4 local40 = (Class4_Sub1_Sub1_Sub4) Static91.aClass66_36.method2225(local15);
		if (local40 == null) {
			@Pc(48) Class4_Sub1_Sub1_Sub6 local48 = this.method3184(arg3, arg0);
			if (local48 == null) {
				return null;
			}
			local40 = local48.method1007(this.anInt4190 + 64, this.anInt4153 * 5 + 768, -50, -10, -50, ~this.anInt4189 <= -1);
			Static91.aClass66_36.method2222(local40, local15);
		}
		if (this.anInt4189 >= 0) {
			local40 = local40.method2825(arg5, arg1, arg4, arg2, true, this.anInt4189);
		}
		return local40;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII[[III)Lclient!jh;")
	public Class4_Sub1_Sub10 method3193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(27) long local27;
		if (this.anIntArray443 == null) {
			local27 = arg1 + (this.anInt4188 << 10);
		} else {
			local27 = (arg4 << 3) + (this.anInt4188 << 10) + arg1;
		}
		@Pc(43) Class4_Sub1_Sub10 local43 = (Class4_Sub1_Sub10) Static163.aClass66_46.method2225(local27);
		if (local43 == null) {
			local43 = new Class4_Sub1_Sub10();
			@Pc(55) Class4_Sub1_Sub1_Sub6 local55 = this.method3184(arg4, arg1);
			if (local55 == null) {
				return local43;
			}
			if (this.aBoolean172) {
				local55.aShort15 = (short) (this.anInt4153 * 5 + 768);
				local55.aShort21 = (short) (this.anInt4190 + 64);
				local55.method995();
				local43.aClass4_Sub1_Sub1_4 = local55;
			} else {
				local43.aClass4_Sub1_Sub1_4 = local55.method1007(this.anInt4190 + 64, this.anInt4153 * 5 + 768, -50, -10, -50, this.anInt4189 >= 0);
			}
			Static163.aClass66_46.method2222(local43, local27);
		}
		if (this.aBoolean172 || this.anInt4189 >= 0) {
			@Pc(125) Class4_Sub1_Sub10 local125 = new Class4_Sub1_Sub10();
			local125.aClass4_Sub1_Sub1_4 = local43.aClass4_Sub1_Sub1_4;
			local43 = local125;
			if (this.aBoolean172) {
				local125.aClass4_Sub1_Sub1_4 = ((Class4_Sub1_Sub1_Sub6) local125.aClass4_Sub1_Sub1_4).method1013();
			}
			if (this.anInt4189 >= 0) {
				if (local125.aClass4_Sub1_Sub1_4 instanceof Class4_Sub1_Sub1_Sub4) {
					local125.aClass4_Sub1_Sub1_4 = ((Class4_Sub1_Sub1_Sub4) local125.aClass4_Sub1_Sub1_4).method2825(arg3, arg2, arg0, arg5, true, this.anInt4189);
				} else if (local125.aClass4_Sub1_Sub1_4 instanceof Class4_Sub1_Sub1_Sub6) {
					local125.aClass4_Sub1_Sub1_4 = ((Class4_Sub1_Sub1_Sub6) local125.aClass4_Sub1_Sub1_4).method1004(arg3, arg2, arg0, arg5, this.anInt4189);
				}
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!h;I)V")
	private void method3194(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		@Pc(12) int local12;
		@Pc(29) int local29;
		if (arg0 == 1) {
			local12 = arg1.method1253();
			if (local12 > 0) {
				if (this.anIntArray444 == null || Static103.aBoolean112) {
					this.anIntArray444 = new int[local12];
					this.anIntArray443 = new int[local12];
					for (local29 = 0; local29 < local12; local29++) {
						this.anIntArray444[local29] = arg1.method1252();
						this.anIntArray443[local29] = arg1.method1253();
					}
				} else {
					arg1.anInt1597 += local12 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass46_1521 = arg1.method1247();
		} else if (arg0 == 5) {
			local12 = arg1.method1253();
			if (local12 > 0) {
				if (this.anIntArray444 == null || Static103.aBoolean112) {
					this.anIntArray443 = null;
					this.anIntArray444 = new int[local12];
					for (local29 = 0; local29 < local12; local29++) {
						this.anIntArray444[local29] = arg1.method1252();
					}
				} else {
					arg1.anInt1597 += local12 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt4191 = arg1.method1253();
		} else if (arg0 == 15) {
			this.anInt4187 = arg1.method1253();
		} else if (arg0 == 17) {
			this.aBoolean177 = false;
			this.anInt4156 = 0;
		} else if (arg0 == 18) {
			this.aBoolean177 = false;
		} else if (arg0 == 19) {
			this.anInt4175 = arg1.method1253();
		} else if (arg0 == 21) {
			this.anInt4189 = 0;
		} else if (arg0 == 22) {
			this.aBoolean172 = true;
		} else if (arg0 == 23) {
			this.aBoolean175 = true;
		} else if (arg0 == 24) {
			this.anInt4185 = arg1.method1252();
			if (this.anInt4185 == 65535) {
				this.anInt4185 = -1;
			}
		} else if (arg0 == 27) {
			this.anInt4156 = 1;
		} else if (arg0 == 28) {
			this.anInt4168 = arg1.method1253();
		} else if (arg0 == 29) {
			this.anInt4190 = arg1.method1241();
		} else if (arg0 == 39) {
			this.anInt4153 = arg1.method1241() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass46Array26[arg0 - 30] = arg1.method1247();
			if (this.aClass46Array26[arg0 - 30].method1683(Static130.aClass46_1141)) {
				this.aClass46Array26[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local12 = arg1.method1253();
			this.aShortArray46 = new short[local12];
			this.aShortArray49 = new short[local12];
			for (local29 = 0; local29 < local12; local29++) {
				this.aShortArray46[local29] = (short) arg1.method1252();
				this.aShortArray49[local29] = (short) arg1.method1252();
			}
		} else if (arg0 == 41) {
			local12 = arg1.method1253();
			this.aShortArray47 = new short[local12];
			this.aShortArray48 = new short[local12];
			for (local29 = 0; local29 < local12; local29++) {
				this.aShortArray48[local29] = (short) arg1.method1252();
				this.aShortArray47[local29] = (short) arg1.method1252();
			}
		} else if (arg0 == 60) {
			this.anInt4184 = arg1.method1252();
		} else if (arg0 == 62) {
			this.aBoolean180 = true;
		} else if (arg0 == 64) {
			this.aBoolean179 = false;
		} else if (arg0 == 65) {
			this.anInt4150 = arg1.method1252();
		} else if (arg0 == 66) {
			this.anInt4174 = arg1.method1252();
		} else if (arg0 == 67) {
			this.anInt4166 = arg1.method1252();
		} else if (arg0 == 68) {
			this.anInt4183 = arg1.method1252();
		} else if (arg0 == 69) {
			this.anInt4178 = arg1.method1253();
		} else if (arg0 == 70) {
			this.anInt4165 = arg1.method1227();
		} else if (arg0 == 71) {
			this.anInt4163 = arg1.method1227();
		} else if (arg0 == 72) {
			this.anInt4152 = arg1.method1227();
		} else if (arg0 == 73) {
			this.aBoolean173 = true;
		} else if (arg0 == 74) {
			this.aBoolean176 = true;
		} else if (arg0 == 75) {
			this.anInt4164 = arg1.method1253();
		} else if (arg0 == 77) {
			this.anInt4155 = arg1.method1252();
			if (this.anInt4155 == 65535) {
				this.anInt4155 = -1;
			}
			this.anInt4161 = arg1.method1252();
			if (this.anInt4161 == 65535) {
				this.anInt4161 = -1;
			}
			local12 = arg1.method1253();
			this.anIntArray442 = new int[local12 + 1];
			for (local29 = 0; local29 <= local12; local29++) {
				this.anIntArray442[local29] = arg1.method1252();
				if (this.anIntArray442[local29] == 65535) {
					this.anIntArray442[local29] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt4167 = arg1.method1252();
			this.anInt4154 = arg1.method1253();
		} else if (arg0 == 79) {
			this.anInt4181 = arg1.method1252();
			this.anInt4182 = arg1.method1252();
			this.anInt4154 = arg1.method1253();
			local12 = arg1.method1253();
			this.anIntArray445 = new int[local12];
			for (local29 = 0; local29 < local12; local29++) {
				this.anIntArray445[local29] = arg1.method1252();
			}
		} else if (arg0 == 81) {
			this.anInt4189 = arg1.method1253() * 256;
		} else if (arg0 != 82) {
			if (arg0 == 83) {
				arg1.method1253();
			} else if (arg0 == 84) {
				arg1.method1227();
			} else if (arg0 == 85) {
				arg1.method1227();
			} else if (arg0 == 86) {
				arg1.method1227();
			} else if (arg0 == 87) {
				arg1.method1252();
			} else if (arg0 != 88) {
				if (arg0 == 89) {
					this.aBoolean178 = false;
				} else if (arg0 == 90) {
					this.aBoolean174 = true;
				}
			}
		}
	}
}
