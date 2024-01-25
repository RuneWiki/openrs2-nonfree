import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class52 {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!gr;")
	public Class103 aClass103_1;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	private int anInt1174;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	private int anInt1175;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	private int anInt1177;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public int anInt1181;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public int anInt1182;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt1184;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt1185;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "Lclient!cv;")
	private Class51 aClass51_4;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "[I")
	public int[] anIntArray56;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	private int anInt1202;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "I")
	public int anInt1204;

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	public int anInt1207;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public int anInt1179 = -1;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	public int anInt1178 = 0;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	private int anInt1180 = -1;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt1183 = -1;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Z")
	public boolean aBoolean101 = true;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public int anInt1194 = -1;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "Z")
	public boolean aBoolean102 = true;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	public int anInt1190 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public int anInt1189 = -1;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	public int anInt1191 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "I")
	private int anInt1193 = -1;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	public int anInt1200 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	public int anInt1197 = -1;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
	private int anInt1201 = -1;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "Z")
	public boolean aBoolean104 = true;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public int anInt1196 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "I")
	private int anInt1205 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ti;B)V")
	public void method974(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4548();
			if (local13 == 0) {
				return;
			}
			this.method986(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(III)I")
	public int method979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass51_4 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub37 local16 = (Class1_Sub37) this.aClass51_4.method930((long) arg0);
			return local16 == null ? arg1 : local16.anInt6451;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!av;I)Z")
	public boolean method981(@OriginalArg(0) Interface1 arg0) {
		@Pc(22) int local22;
		if (this.anInt1201 == -1) {
			if (this.anInt1180 == -1) {
				return true;
			}
			local22 = arg0.method1612(this.anInt1180);
		} else {
			local22 = arg0.method1613(this.anInt1201);
		}
		if (local22 < this.anInt1177 || this.anInt1174 < local22) {
			return false;
		}
		@Pc(61) int local61;
		if (this.anInt1183 == -1) {
			if (this.anInt1205 == -1) {
				return true;
			}
			local61 = arg0.method1612(this.anInt1205);
		} else {
			local61 = arg0.method1613(this.anInt1183);
		}
		return local61 >= this.anInt1175 && local61 <= this.anInt1202;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!qa;I)Lclient!f;")
	public Class78 method982(@OriginalArg(0) Class121 arg0) {
		@Pc(26) Class78 local26 = (Class78) this.aClass103_1.aClass151_63.method3288((long) (arg0.anInt5745 << 29 | 0x20000 | this.anInt1193));
		if (local26 != null) {
			return local26;
		}
		this.aClass103_1.aClass109_33.method2348(this.anInt1193);
		@Pc(46) Class63 local46 = Static457.method1163(this.aClass103_1.aClass109_33, this.anInt1193, 0);
		if (local46 != null) {
			local26 = arg0.method4589(local46);
			this.aClass103_1.aClass151_63.method3291((long) (this.anInt1193 | 0x20000 | arg0.anInt5745 << 29), local26);
		}
		return local26;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!qa;IZ)Lclient!f;")
	public Class78 method984(@OriginalArg(0) Class121 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1194 : this.anInt1197;
		@Pc(18) int local18 = local11 | arg0.anInt5745 << 29;
		@Pc(27) Class78 local27 = (Class78) this.aClass103_1.aClass151_63.method3288((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass103_1.aClass109_33.method2348(local11)) {
			@Pc(49) Class63 local49 = Static457.method1163(this.aClass103_1.aClass109_33, local11, 0);
			if (local49 != null) {
				local27 = arg0.method4589(local49);
				this.aClass103_1.aClass151_63.method3291((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method985(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass51_4 == null) {
			return arg0;
		} else {
			@Pc(22) Class1_Sub18 local22 = (Class1_Sub18) this.aClass51_4.method930((long) arg1);
			return local22 == null ? arg0 : local22.aString47;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!ti;I)V")
	private void method986(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1197 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt1194 = arg0.method4498();
		} else if (arg1 == 3) {
			this.aString26 = arg0.method4509();
		} else if (arg1 == 4) {
			this.anInt1182 = arg0.method4496();
		} else if (arg1 == 5) {
			this.anInt1189 = arg0.method4496();
		} else if (arg1 == 6) {
			this.anInt1178 = arg0.method4548();
		} else {
			@Pc(62) int local62;
			if (arg1 == 7) {
				local62 = arg0.method4548();
				if ((local62 & 0x1) == 0) {
					this.aBoolean101 = false;
				}
				if ((local62 & 0x2) == 2) {
					this.aBoolean103 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean102 = arg0.method4548() == 1;
			} else if (arg1 == 9) {
				this.anInt1180 = arg0.method4498();
				if (this.anInt1180 == 65535) {
					this.anInt1180 = -1;
				}
				this.anInt1201 = arg0.method4498();
				if (this.anInt1201 == 65535) {
					this.anInt1201 = -1;
				}
				this.anInt1177 = arg0.method4500();
				this.anInt1174 = arg0.method4500();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(161) int local161;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 != 17) {
							if (arg1 == 18) {
								this.anInt1193 = arg0.method4498();
							} else if (arg1 == 19) {
								this.anInt1179 = arg0.method4498();
								return;
							} else if (arg1 == 20) {
								this.anInt1205 = arg0.method4498();
								if (this.anInt1205 == 65535) {
									this.anInt1205 = -1;
								}
								this.anInt1183 = arg0.method4498();
								if (this.anInt1183 == 65535) {
									this.anInt1183 = -1;
								}
								this.anInt1175 = arg0.method4500();
								this.anInt1202 = arg0.method4500();
								return;
							} else if (arg1 == 21) {
								this.anInt1185 = arg0.method4500();
								return;
							} else if (arg1 == 22) {
								this.anInt1207 = arg0.method4500();
								return;
							} else if (arg1 == 249) {
								local62 = arg0.method4548();
								if (this.aClass51_4 == null) {
									local161 = Static30.method427(local62);
									this.aClass51_4 = new Class51(local161);
								}
								for (local161 = 0; local161 < local62; local161++) {
									@Pc(306) boolean local306 = arg0.method4548() == 1;
									@Pc(310) int local310 = arg0.method4496();
									@Pc(319) Class1 local319;
									if (local306) {
										local319 = new Class1_Sub18(arg0.method4509());
									} else {
										local319 = new Class1_Sub37(arg0.method4500());
									}
									this.aClass51_4.method931(local319, (long) local310);
								}
								return;
							}
							return;
						}
						this.aString25 = arg0.method4509();
						return;
					}
					this.aBoolean104 = false;
					return;
				}
				local62 = arg0.method4548();
				this.anIntArray56 = new int[local62 * 2];
				for (local161 = 0; local161 < local62 * 2; local161++) {
					this.anIntArray56[local161] = arg0.method4531();
				}
				this.anInt1204 = arg0.method4500();
				this.anInt1181 = arg0.method4500();
				return;
			} else {
				this.aStringArray10[arg1 - 10] = arg0.method4509();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public void method987() {
		if (this.anIntArray56 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray56.length; local6 += 2) {
			if (this.anIntArray56[local6] < this.anInt1196) {
				this.anInt1196 = this.anIntArray56[local6];
			} else if (this.anInt1200 < this.anIntArray56[local6]) {
				this.anInt1200 = this.anIntArray56[local6];
			}
			if (this.anIntArray56[local6 + 1] < this.anInt1191) {
				this.anInt1191 = this.anIntArray56[local6 + 1];
			} else if (this.anIntArray56[local6 + 1] > this.anInt1190) {
				this.anInt1190 = this.anIntArray56[local6 + 1];
			}
		}
	}
}
