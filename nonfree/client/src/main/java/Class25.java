import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class25 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Lclient!qo;")
	private Class196 aClass196_2;

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
	private int anInt849;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "Lclient!qq;")
	public Class198 aClass198_1;

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
	public int anInt859;

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!bo", name = "I", descriptor = "I")
	public int anInt863;

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
	private int anInt866;

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
	public int anInt867;

	@OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
	public int anInt868;

	@OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
	public int anInt841 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray5 = new String[5];

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
	public int anInt848 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "Z")
	public boolean aBoolean44 = false;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
	public int anInt851 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	private int anInt844 = -1;

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "Z")
	public boolean aBoolean46 = true;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "Z")
	public boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
	public int anInt853 = -1;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
	private int anInt858 = -1;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	public int anInt845 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
	public int anInt855 = -1;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
	private int anInt846 = -1;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "Z")
	public boolean aBoolean45 = true;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
	private int anInt854 = -1;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
	public int anInt861 = 0;

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
	public int anInt865 = -1;

	@OriginalMember(owner = "client!bo", name = "Q", descriptor = "I")
	public int anInt870 = -1;

	@OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
	private int anInt874 = -1;

	static {
		new Class242("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
	public void method662() {
		if (this.anIntArray71 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray71.length; local6 += 2) {
			if (this.anIntArray71[local6] < this.anInt848) {
				this.anInt848 = this.anIntArray71[local6];
			} else if (this.anInt851 < this.anIntArray71[local6]) {
				this.anInt851 = this.anIntArray71[local6];
			}
			if (this.anInt841 > this.anIntArray71[local6 + 1]) {
				this.anInt841 = this.anIntArray71[local6 + 1];
			} else if (this.anInt845 < this.anIntArray71[local6 + 1]) {
				this.anInt845 = this.anIntArray71[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method663(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass196_2 == null) {
			return arg0;
		} else {
			@Pc(16) Class4_Sub25 local16 = (Class4_Sub25) this.aClass196_2.method4477((long) arg1);
			return local16 == null ? arg0 : local16.aString45;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILclient!tl;)V")
	private void method664(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 1) {
			this.anInt855 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt870 = arg1.method4877();
		} else if (arg0 == 3) {
			this.aString8 = arg1.method4867();
		} else if (arg0 == 4) {
			this.anInt862 = arg1.method4887();
		} else if (arg0 == 5) {
			this.anInt853 = arg1.method4887();
		} else if (arg0 == 6) {
			this.anInt861 = arg1.method4864();
		} else {
			@Pc(68) int local68;
			if (arg0 == 7) {
				local68 = arg1.method4864();
				if ((local68 & 0x1) == 0) {
					this.aBoolean46 = false;
				}
				if ((local68 & 0x2) == 2) {
					this.aBoolean44 = true;
					return;
				}
			} else if (arg0 == 8) {
				this.aBoolean43 = arg1.method4864() == 1;
				return;
			} else if (arg0 == 9) {
				this.anInt874 = arg1.method4877();
				if (this.anInt874 == 65535) {
					this.anInt874 = -1;
				}
				this.anInt854 = arg1.method4877();
				if (this.anInt854 == 65535) {
					this.anInt854 = -1;
				}
				this.anInt871 = arg1.method4872();
				this.anInt866 = arg1.method4872();
			} else if (arg0 < 10 || arg0 > 14) {
				@Pc(131) int local131;
				if (arg0 != 15) {
					if (arg0 != 16) {
						if (arg0 != 17) {
							if (arg0 != 18) {
								if (arg0 != 19) {
									if (arg0 == 20) {
										this.anInt846 = arg1.method4877();
										if (this.anInt846 == 65535) {
											this.anInt846 = -1;
										}
										this.anInt844 = arg1.method4877();
										if (this.anInt844 == 65535) {
											this.anInt844 = -1;
										}
										this.anInt856 = arg1.method4872();
										this.anInt849 = arg1.method4872();
									} else if (arg0 == 21) {
										this.anInt863 = arg1.method4872();
										return;
									} else if (arg0 == 22) {
										this.anInt868 = arg1.method4872();
										return;
									} else if (arg0 == 249) {
										local68 = arg1.method4864();
										if (this.aClass196_2 == null) {
											local131 = Static183.method2711(local68);
											this.aClass196_2 = new Class196(local131);
										}
										for (local131 = 0; local131 < local68; local131++) {
											@Pc(237) boolean local237 = arg1.method4864() == 1;
											@Pc(241) int local241 = arg1.method4887();
											@Pc(250) Class4 local250;
											if (local237) {
												local250 = new Class4_Sub25(arg1.method4867());
											} else {
												local250 = new Class4_Sub15(arg1.method4872());
											}
											this.aClass196_2.method4474((long) local241, local250);
										}
										return;
									}
									return;
								}
								this.anInt865 = arg1.method4877();
								return;
							}
							this.anInt858 = arg1.method4877();
							return;
						}
						this.aString9 = arg1.method4867();
						return;
					}
					this.aBoolean45 = false;
					return;
				}
				local68 = arg1.method4864();
				this.anIntArray71 = new int[local68 * 2];
				for (local131 = 0; local131 < local68 * 2; local131++) {
					this.anIntArray71[local131] = arg1.method4889();
				}
				this.anInt867 = arg1.method4872();
				this.anInt847 = arg1.method4872();
				return;
			} else {
				this.aStringArray5[arg0 - 10] = arg1.method4867();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qa;I)Lclient!f;")
	public Class3 method665(@OriginalArg(0) Class30 arg0) {
		@Pc(25) Class3 local25 = (Class3) this.aClass198_1.aClass69_54.method1591((long) (this.anInt858 | 0x20000 | arg0.anInt5975 << 29));
		if (local25 != null) {
			return local25;
		}
		this.aClass198_1.aClass166_230.method3670(this.anInt858);
		@Pc(45) Class205 local45 = Static464.method4782(this.aClass198_1.aClass166_230, this.anInt858, 0);
		if (local45 != null) {
			local25 = arg0.method4656(local45);
			this.aClass198_1.aClass69_54.method1590((long) (this.anInt858 | 0x20000 | arg0.anInt5975 << 29), local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!fb;)Z")
	public boolean method666(@OriginalArg(1) Interface4 arg0) {
		@Pc(15) int local15;
		if (this.anInt854 == -1) {
			if (this.anInt874 == -1) {
				return true;
			}
			local15 = arg0.method3212(this.anInt874);
		} else {
			local15 = arg0.method3211(this.anInt854);
		}
		if (local15 < this.anInt871 || local15 > this.anInt866) {
			return false;
		}
		@Pc(73) int local73;
		if (this.anInt844 == -1) {
			if (this.anInt846 == -1) {
				return true;
			}
			local73 = arg0.method3212(this.anInt846);
		} else {
			local73 = arg0.method3211(this.anInt844);
		}
		return this.anInt856 <= local73 && this.anInt849 >= local73;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB)I")
	public int method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass196_2 == null) {
			return arg0;
		} else {
			@Pc(16) Class4_Sub15 local16 = (Class4_Sub15) this.aClass196_2.method4477((long) arg1);
			return local16 == null ? arg0 : local16.anInt2603;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!qa;IZ)Lclient!f;")
	public Class3 method670(@OriginalArg(0) Class30 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt870 : this.anInt855;
		@Pc(18) int local18 = arg0.anInt5975 << 29 | local11;
		@Pc(27) Class3 local27 = (Class3) this.aClass198_1.aClass69_54.method1591((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass198_1.aClass166_230.method3670(local11)) {
			@Pc(47) Class205 local47 = Static464.method4782(this.aClass198_1.aClass166_230, local11, 0);
			if (local47 != null) {
				local27 = arg0.method4656(local47);
				this.aClass198_1.aClass69_54.method1590((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!tl;)V")
	public void method672(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4864();
			if (local5 == 0) {
				return;
			}
			this.method664(local5, arg0);
		}
	}
}
