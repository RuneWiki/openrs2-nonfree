import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class17 {

	@OriginalMember(owner = "client!aia", name = "A", descriptor = "Ljava/lang/String;")
	public static final String aString6;

	@OriginalMember(owner = "client!aia", name = "I", descriptor = "Ljava/lang/String;")
	public static final String aString7;

	@OriginalMember(owner = "client!aia", name = "j", descriptor = "I")
	private int anInt782;

	@OriginalMember(owner = "client!aia", name = "m", descriptor = "I")
	public int anInt785;

	@OriginalMember(owner = "client!aia", name = "v", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!aia", name = "w", descriptor = "Lclient!afa;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!aia", name = "x", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!aia", name = "y", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!aia", name = "E", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!aia", name = "K", descriptor = "I")
	public int anInt804;

	@OriginalMember(owner = "client!aia", name = "M", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!aia", name = "P", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!aia", name = "R", descriptor = "I")
	private int anInt809;

	@OriginalMember(owner = "client!aia", name = "U", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!aia", name = "W", descriptor = "Lclient!pfa;")
	private Class253 aClass253_2;

	@OriginalMember(owner = "client!aia", name = "Z", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!aia", name = "ab", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!aia", name = "cb", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!aia", name = "db", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!aia", name = "ib", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!aia", name = "e", descriptor = "Z")
	public boolean aBoolean74 = true;

	@OriginalMember(owner = "client!aia", name = "h", descriptor = "I")
	public int anInt781 = -1;

	@OriginalMember(owner = "client!aia", name = "l", descriptor = "I")
	public int anInt784 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!aia", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray3 = new String[5];

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!aia", name = "u", descriptor = "I")
	public int anInt793 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!aia", name = "i", descriptor = "Z")
	public boolean aBoolean75 = true;

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "I")
	private int anInt791 = -1;

	@OriginalMember(owner = "client!aia", name = "H", descriptor = "I")
	public int anInt802 = 0;

	@OriginalMember(owner = "client!aia", name = "B", descriptor = "I")
	public int anInt797 = -1;

	@OriginalMember(owner = "client!aia", name = "t", descriptor = "I")
	private int anInt792 = -1;

	@OriginalMember(owner = "client!aia", name = "L", descriptor = "I")
	public int anInt805 = -1;

	@OriginalMember(owner = "client!aia", name = "S", descriptor = "I")
	private int anInt810 = -1;

	@OriginalMember(owner = "client!aia", name = "T", descriptor = "I")
	public int anInt811 = -1;

	@OriginalMember(owner = "client!aia", name = "n", descriptor = "I")
	public int anInt786 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "I")
	private int anInt788 = -1;

	@OriginalMember(owner = "client!aia", name = "X", descriptor = "I")
	public int anInt813 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!aia", name = "o", descriptor = "I")
	public int anInt787 = -1;

	@OriginalMember(owner = "client!aia", name = "N", descriptor = "Z")
	public boolean aBoolean76 = true;

	@OriginalMember(owner = "client!aia", name = "bb", descriptor = "I")
	public int anInt814 = -1;

	@OriginalMember(owner = "client!aia", name = "k", descriptor = "I")
	public int anInt783 = -1;

	@OriginalMember(owner = "client!aia", name = "gb", descriptor = "I")
	private int anInt817 = -1;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString6 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString7 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(III)I")
	public int method759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass253_2 == null) {
			return arg0;
		} else {
			@Pc(22) Class8_Sub17 local22 = (Class8_Sub17) this.aClass253_2.method6594((long) arg1);
			return local22 == null ? arg0 : local22.anInt2919;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!ha;ZZ)Lclient!hu;")
	public Class21 method760(@OriginalArg(0) Class16 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt814 : this.anInt783;
		@Pc(18) int local18 = local11 | arg0.anInt7420 << 29;
		@Pc(27) Class21 local27 = (Class21) this.aClass12_1.aClass236_2.method6242((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass12_1.aClass237_7.method6296(local11)) {
			@Pc(52) Class111 local52 = Static647.method3292(this.aClass12_1.aClass237_7, local11, 0);
			if (local52 != null) {
				local27 = arg0.method6135(local52, true);
				this.aClass12_1.aClass236_2.method6241((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method761(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method770(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lclient!nf;I)Z")
	public boolean method764(@OriginalArg(0) Interface17 arg0) {
		@Pc(15) int local15;
		if (this.anInt788 == -1) {
			if (this.anInt791 == -1) {
				return true;
			}
			local15 = arg0.method2386(this.anInt791);
		} else {
			local15 = arg0.method2387(this.anInt788);
		}
		if (this.anInt794 > local15 || this.anInt782 < local15) {
			return false;
		}
		@Pc(59) int local59;
		if (this.anInt810 == -1) {
			if (this.anInt792 == -1) {
				return true;
			}
			local59 = arg0.method2386(this.anInt792);
		} else {
			local59 = arg0.method2387(this.anInt810);
		}
		return this.anInt809 <= local59 && local59 <= this.anInt806;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)V")
	public void method766() {
		if (this.anIntArray17 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray17.length; local19 += 2) {
			if (this.anInt786 > this.anIntArray17[local19]) {
				this.anInt786 = this.anIntArray17[local19];
			} else if (this.anIntArray17[local19] > this.anInt784) {
				this.anInt784 = this.anIntArray17[local19];
			}
			if (this.anIntArray17[local19 + 1] < this.anInt813) {
				this.anInt813 = this.anIntArray17[local19 + 1];
			} else if (this.anIntArray17[local19 + 1] > this.anInt793) {
				this.anInt793 = this.anIntArray17[local19 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method767(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass253_2 == null) {
			return arg0;
		} else {
			@Pc(16) Class8_Sub28 local16 = (Class8_Sub28) this.aClass253_2.method6594((long) arg1);
			return local16 == null ? arg0 : local16.aString63;
		}
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!ha;)Lclient!hu;")
	public Class21 method769(@OriginalArg(1) Class16 arg0) {
		@Pc(31) Class21 local31 = (Class21) this.aClass12_1.aClass236_2.method6242((long) (this.anInt817 | 0x20000 | arg0.anInt7420 << 29));
		if (local31 != null) {
			return local31;
		}
		this.aClass12_1.aClass237_7.method6296(this.anInt817);
		@Pc(51) Class111 local51 = Static647.method3292(this.aClass12_1.aClass237_7, this.anInt817, 0);
		if (local51 != null) {
			local31 = arg0.method6135(local51, true);
			this.aClass12_1.aClass236_2.method6241((long) (arg0.anInt7420 << 29 | this.anInt817 | 0x20000), local31);
		}
		return local31;
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BILclient!ig;)V")
	private void method770(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt783 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt814 = arg1.method8578();
		} else if (arg0 == 3) {
			this.aString8 = arg1.method8570();
		} else if (arg0 == 4) {
			this.anInt804 = arg1.method8560();
		} else if (arg0 == 5) {
			this.anInt797 = arg1.method8560();
		} else if (arg0 == 6) {
			this.anInt802 = arg1.method8525();
		} else {
			@Pc(62) int local62;
			if (arg0 == 7) {
				local62 = arg1.method8525();
				if ((local62 & 0x2) == 2) {
					this.aBoolean73 = true;
				}
				if ((local62 & 0x1) == 0) {
					this.aBoolean75 = false;
					return;
				}
			} else if (arg0 == 8) {
				this.aBoolean74 = arg1.method8525() == 1;
			} else if (arg0 == 9) {
				this.anInt791 = arg1.method8578();
				if (this.anInt791 == 65535) {
					this.anInt791 = -1;
				}
				this.anInt788 = arg1.method8578();
				if (this.anInt788 == 65535) {
					this.anInt788 = -1;
				}
				this.anInt794 = arg1.method8540();
				this.anInt782 = arg1.method8540();
				return;
			} else if (arg0 < 10 || arg0 > 14) {
				@Pc(245) int local245;
				@Pc(270) int local270;
				if (arg0 != 15) {
					if (arg0 != 16) {
						if (arg0 != 17) {
							if (arg0 != 18) {
								if (arg0 != 19) {
									if (arg0 == 20) {
										this.anInt792 = arg1.method8578();
										if (this.anInt792 == 65535) {
											this.anInt792 = -1;
										}
										this.anInt810 = arg1.method8578();
										if (this.anInt810 == 65535) {
											this.anInt810 = -1;
										}
										this.anInt809 = arg1.method8540();
										this.anInt806 = arg1.method8540();
										return;
									}
									if (arg0 != 21) {
										if (arg0 == 22) {
											this.anInt807 = arg1.method8540();
										} else if (arg0 == 23) {
											this.anInt805 = arg1.method8525();
											this.anInt781 = arg1.method8525();
											this.anInt787 = arg1.method8525();
											return;
										} else if (arg0 == 24) {
											this.anInt800 = arg1.method8568();
											this.anInt815 = arg1.method8568();
											return;
										} else if (arg0 == 249) {
											local62 = arg1.method8525();
											if (this.aClass253_2 == null) {
												local245 = Static629.method8469(local62);
												this.aClass253_2 = new Class253(local245);
											}
											for (local245 = 0; local245 < local62; local245++) {
												@Pc(266) boolean local266 = arg1.method8525() == 1;
												local270 = arg1.method8560();
												@Pc(279) Class8 local279;
												if (local266) {
													local279 = new Class8_Sub28(arg1.method8570());
												} else {
													local279 = new Class8_Sub17(arg1.method8540());
												}
												this.aClass253_2.method6591(local279, (long) local270);
											}
											return;
										}
										return;
									}
									this.anInt795 = arg1.method8540();
									return;
								}
								this.anInt811 = arg1.method8578();
								return;
							}
							this.anInt817 = arg1.method8578();
							return;
						}
						this.aString5 = arg1.method8570();
						return;
					}
					this.aBoolean76 = false;
					return;
				}
				local62 = arg1.method8525();
				this.anIntArray17 = new int[local62 * 2];
				for (local245 = 0; local245 < local62 * 2; local245++) {
					this.anIntArray17[local245] = arg1.method8568();
				}
				this.anInt785 = arg1.method8540();
				@Pc(374) int local374 = arg1.method8525();
				this.anIntArray18 = new int[local374];
				for (local270 = 0; local270 < this.anIntArray18.length; local270++) {
					this.anIntArray18[local270] = arg1.method8540();
				}
				this.aByteArray3 = new byte[local62];
				for (@Pc(405) int local405 = 0; local405 < local62; local405++) {
					this.aByteArray3[local405] = arg1.method8550();
				}
				return;
			} else {
				this.aStringArray3[arg0 - 10] = arg1.method8570();
				return;
			}
		}
	}
}
