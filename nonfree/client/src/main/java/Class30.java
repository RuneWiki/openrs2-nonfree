import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class30 {

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "[I")
	public int[] anIntArray120;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "Lclient!ba;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	public int anInt872;

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "Lclient!so;")
	public Class272 aClass272_3;

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
	public int anInt875;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
	private int anInt880;

	@OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
	public int anInt888;

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
	public int anInt889;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
	public int anInt897;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
	public int anInt898;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
	public int anInt869 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
	private int anInt876 = -1;

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
	public int anInt879 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
	private int anInt883 = -1;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "Z")
	public boolean aBoolean45 = false;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
	private int anInt874 = -1;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	public int anInt870 = 0;

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
	public int anInt885 = -1;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
	private int anInt882 = -1;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
	public int anInt871 = -1;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	public int anInt873 = -1;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray3 = new String[5];

	@OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
	public int anInt893 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "Z")
	public boolean aBoolean46 = true;

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "Z")
	public boolean aBoolean48 = true;

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
	public int anInt894 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
	public int anInt895 = -1;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
	private int anInt896 = -1;

	@OriginalMember(owner = "client!bl", name = "R", descriptor = "Z")
	public boolean aBoolean49 = true;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!tv;)Z")
	public boolean method907(@OriginalArg(1) Interface16 arg0) {
		@Pc(19) int local19;
		if (this.anInt883 == -1) {
			if (this.anInt896 == -1) {
				return true;
			}
			local19 = arg0.method2643(this.anInt896);
		} else {
			local19 = arg0.method2642(this.anInt883);
		}
		if (local19 < this.anInt892 || local19 > this.anInt891) {
			return false;
		}
		@Pc(53) int local53;
		if (this.anInt876 == -1) {
			if (this.anInt882 == -1) {
				return true;
			}
			local53 = arg0.method2643(this.anInt882);
		} else {
			local53 = arg0.method2642(this.anInt876);
		}
		return local53 >= this.anInt880 && this.anInt878 >= local53;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!qa;)Lclient!ha;")
	public Class2 method908(@OriginalArg(1) Class122 arg0) {
		@Pc(20) Class2 local20 = (Class2) this.aClass272_3.aClass313_58.method7406((long) (arg0.anInt8823 << 29 | 0x20000 | this.anInt874));
		if (local20 != null) {
			return local20;
		}
		this.aClass272_3.aClass171_139.method4327(this.anInt874);
		@Pc(46) Class136 local46 = Static552.method3541(this.aClass272_3.aClass171_139, this.anInt874, 0);
		if (local46 != null) {
			local20 = arg0.method7220(local46);
			this.aClass272_3.aClass313_58.method7399((long) (arg0.anInt8823 << 29 | 0x20000 | this.anInt874), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method909(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass17_7 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub25 local21 = (Class1_Sub25) this.aClass17_7.method738((long) arg0);
			return local21 == null ? arg1 : local21.aString37;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)I")
	public int method910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass17_7 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub9 local16 = (Class1_Sub9) this.aClass17_7.method738((long) arg0);
			return local16 == null ? arg1 : local16.anInt1173;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!ge;)V")
	public void method911(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3922();
			if (local14 == 0) {
				return;
			}
			this.method914(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	public void method912() {
		if (this.anIntArray120 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < this.anIntArray120.length; local4 += 2) {
			if (this.anInt869 > this.anIntArray120[local4]) {
				this.anInt869 = this.anIntArray120[local4];
			} else if (this.anInt879 < this.anIntArray120[local4]) {
				this.anInt879 = this.anIntArray120[local4];
			}
			if (this.anInt893 > this.anIntArray120[local4 + 1]) {
				this.anInt893 = this.anIntArray120[local4 + 1];
			} else if (this.anIntArray120[local4 + 1] > this.anInt894) {
				this.anInt894 = this.anIntArray120[local4 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!qa;ZB)Lclient!ha;")
	public Class2 method913(@OriginalArg(0) Class122 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) int local17 = arg1 ? this.anInt895 : this.anInt873;
		@Pc(24) int local24 = arg0.anInt8823 << 29 | local17;
		@Pc(33) Class2 local33 = (Class2) this.aClass272_3.aClass313_58.method7406((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass272_3.aClass171_139.method4327(local17)) {
			@Pc(53) Class136 local53 = Static552.method3541(this.aClass272_3.aClass171_139, local17, 0);
			if (local53 != null) {
				local33 = arg0.method7220(local53);
				this.aClass272_3.aClass313_58.method7399((long) local24, local33);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILclient!ge;)V")
	private void method914(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt873 = arg1.method3967();
		} else if (arg0 == 2) {
			this.anInt895 = arg1.method3967();
		} else if (arg0 == 3) {
			this.aString5 = arg1.method3954();
		} else if (arg0 == 4) {
			this.anInt872 = arg1.method3920();
		} else if (arg0 == 5) {
			this.anInt885 = arg1.method3920();
		} else if (arg0 == 6) {
			this.anInt870 = arg1.method3922();
		} else {
			@Pc(73) int local73;
			if (arg0 != 7) {
				if (arg0 == 8) {
					this.aBoolean48 = arg1.method3922() == 1;
					return;
				}
				if (arg0 == 9) {
					this.anInt896 = arg1.method3967();
					if (this.anInt896 == 65535) {
						this.anInt896 = -1;
					}
					this.anInt883 = arg1.method3967();
					if (this.anInt883 == 65535) {
						this.anInt883 = -1;
					}
					this.anInt892 = arg1.method3925();
					this.anInt891 = arg1.method3925();
					return;
				}
				if (arg0 >= 10 && arg0 <= 14) {
					this.aStringArray3[arg0 - 10] = arg1.method3954();
					return;
				}
				@Pc(81) int local81;
				if (arg0 != 15) {
					if (arg0 == 16) {
						this.aBoolean49 = false;
						return;
					}
					if (arg0 != 17) {
						if (arg0 != 18) {
							if (arg0 != 19) {
								if (arg0 != 20) {
									if (arg0 == 21) {
										this.anInt897 = arg1.method3925();
									} else if (arg0 == 22) {
										this.anInt875 = arg1.method3925();
										return;
									} else if (arg0 == 249) {
										local73 = arg1.method3922();
										if (this.aClass17_7 == null) {
											local81 = Static352.method5306(local73);
											this.aClass17_7 = new Class17(local81);
										}
										for (local81 = 0; local81 < local73; local81++) {
											@Pc(177) boolean local177 = arg1.method3922() == 1;
											@Pc(181) int local181 = arg1.method3920();
											@Pc(190) Class1 local190;
											if (local177) {
												local190 = new Class1_Sub25(arg1.method3954());
											} else {
												local190 = new Class1_Sub9(arg1.method3925());
											}
											this.aClass17_7.method737(local190, (long) local181);
										}
										return;
									}
									return;
								}
								this.anInt882 = arg1.method3967();
								if (this.anInt882 == 65535) {
									this.anInt882 = -1;
								}
								this.anInt876 = arg1.method3967();
								if (this.anInt876 == 65535) {
									this.anInt876 = -1;
								}
								this.anInt880 = arg1.method3925();
								this.anInt878 = arg1.method3925();
								return;
							}
							this.anInt871 = arg1.method3967();
							return;
						}
						this.anInt874 = arg1.method3967();
						return;
					}
					this.aString4 = arg1.method3954();
					return;
				}
				local73 = arg1.method3922();
				this.anIntArray120 = new int[local73 * 2];
				for (local81 = 0; local81 < local73 * 2; local81++) {
					this.anIntArray120[local81] = arg1.method3964();
				}
				this.anInt889 = arg1.method3925();
				this.anInt898 = arg1.method3925();
				return;
			}
			local73 = arg1.method3922();
			if ((local73 & 0x2) == 2) {
				this.aBoolean45 = true;
			}
			if ((local73 & 0x1) == 0) {
				this.aBoolean46 = false;
				return;
			}
		}
	}
}
