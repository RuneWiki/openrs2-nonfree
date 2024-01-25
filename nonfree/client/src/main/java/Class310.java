import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class310 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
	public int anInt8106;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	private int anInt8109;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
	public int anInt8111;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
	public int anInt8115;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
	public int anInt8118;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
	public int anInt8119;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
	private int anInt8120;

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "I")
	public int anInt8126;

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "[I")
	public int[] anIntArray624;

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
	private int anInt8131;

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
	private int anInt8132;

	@OriginalMember(owner = "client!sp", name = "M", descriptor = "Lclient!qca;")
	public Class273 aClass273_4;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "Lclient!kea;")
	private Class187 aClass187_35;

	@OriginalMember(owner = "client!sp", name = "X", descriptor = "Ljava/lang/String;")
	public String aString84;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
	public int anInt8110 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
	private int anInt8114 = -1;

	@OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
	public int anInt8121 = -1;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
	public int anInt8108 = -1;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
	public int anInt8124 = -1;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
	private int anInt8125 = -1;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
	public int anInt8130 = -1;

	@OriginalMember(owner = "client!sp", name = "O", descriptor = "Z")
	public boolean aBoolean619 = false;

	@OriginalMember(owner = "client!sp", name = "H", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray34 = new String[5];

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
	private int anInt8112 = -1;

	@OriginalMember(owner = "client!sp", name = "P", descriptor = "I")
	public int anInt8138 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
	private int anInt8137 = -1;

	@OriginalMember(owner = "client!sp", name = "G", descriptor = "I")
	public int anInt8133 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sp", name = "Q", descriptor = "Z")
	public boolean aBoolean620 = true;

	@OriginalMember(owner = "client!sp", name = "S", descriptor = "I")
	private int anInt8140 = -1;

	@OriginalMember(owner = "client!sp", name = "V", descriptor = "Z")
	public boolean aBoolean621 = true;

	@OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
	public int anInt8135 = 0;

	@OriginalMember(owner = "client!sp", name = "W", descriptor = "I")
	public int anInt8142 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sp", name = "Z", descriptor = "Z")
	public boolean aBoolean622 = true;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!r;I)Lclient!f;")
	public Class22 method6530(@OriginalArg(0) Class134 arg0) {
		@Pc(25) Class22 local25 = (Class22) this.aClass273_4.aClass222_47.method4430((long) (this.anInt8112 | 0x20000 | arg0.anInt8508 << 29));
		if (local25 != null) {
			return local25;
		}
		this.aClass273_4.aClass270_89.method5694(this.anInt8112);
		@Pc(45) Class102 local45 = Static601.method2070(this.aClass273_4.aClass270_89, this.anInt8112, 0);
		if (local45 != null) {
			local25 = arg0.method6896(local45, true);
			this.aClass273_4.aClass222_47.method4434(local25, (long) (this.anInt8112 | 0x20000 | arg0.anInt8508 << 29));
		}
		return local25;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZILclient!r;)Lclient!f;")
	public Class22 method6532(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(18) int local18 = arg0 ? this.anInt8108 : this.anInt8124;
		@Pc(25) int local25 = arg1.anInt8508 << 29 | local18;
		@Pc(34) Class22 local34 = (Class22) this.aClass273_4.aClass222_47.method4430((long) local25);
		if (local34 != null) {
			return local34;
		} else if (this.aClass273_4.aClass270_89.method5694(local18)) {
			@Pc(54) Class102 local54 = Static601.method2070(this.aClass273_4.aClass270_89, local18, 0);
			if (local54 != null) {
				local34 = arg1.method6896(local54, true);
				this.aClass273_4.aClass222_47.method4434(local34, (long) local25);
			}
			return local34;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!qj;)Z")
	public boolean method6534(@OriginalArg(1) Interface16 arg0) {
		@Pc(22) int local22;
		if (this.anInt8140 == -1) {
			if (this.anInt8125 == -1) {
				return true;
			}
			local22 = arg0.method7083(this.anInt8125);
		} else {
			local22 = arg0.method7084(this.anInt8140);
		}
		if (local22 < this.anInt8132 || this.anInt8109 < local22) {
			return false;
		}
		@Pc(60) int local60;
		if (this.anInt8137 == -1) {
			if (this.anInt8114 == -1) {
				return true;
			}
			local60 = arg0.method7083(this.anInt8114);
		} else {
			local60 = arg0.method7084(this.anInt8137);
		}
		return local60 >= this.anInt8120 && this.anInt8131 >= local60;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(III)I")
	public int method6537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass187_35 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub13 local21 = (Class1_Sub13) this.aClass187_35.method3797((long) arg1);
			return local21 == null ? arg0 : local21.anInt1812;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!mo;II)V")
	private void method6538(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8124 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt8108 = arg0.method5771();
		} else if (arg1 == 3) {
			this.aString84 = arg0.method5760();
		} else if (arg1 == 4) {
			this.anInt8126 = arg0.method5797();
		} else if (arg1 == 5) {
			this.anInt8121 = arg0.method5797();
		} else if (arg1 == 6) {
			this.anInt8135 = arg0.method5750();
		} else {
			@Pc(136) int local136;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean621 = arg0.method5750() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt8125 = arg0.method5771();
					if (this.anInt8125 == 65535) {
						this.anInt8125 = -1;
					}
					this.anInt8140 = arg0.method5771();
					if (this.anInt8140 == 65535) {
						this.anInt8140 = -1;
					}
					this.anInt8132 = arg0.method5804();
					this.anInt8109 = arg0.method5804();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray34[arg1 - 10] = arg0.method5760();
					return;
				}
				@Pc(143) int local143;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 != 17) {
							if (arg1 == 18) {
								this.anInt8112 = arg0.method5771();
								return;
							}
							if (arg1 == 19) {
								this.anInt8130 = arg0.method5771();
								return;
							}
							if (arg1 != 20) {
								if (arg1 != 21) {
									if (arg1 == 22) {
										this.anInt8115 = arg0.method5804();
									} else if (arg1 == 249) {
										local136 = arg0.method5750();
										if (this.aClass187_35 == null) {
											local143 = Static457.method6299(local136);
											this.aClass187_35 = new Class187(local143);
										}
										for (local143 = 0; local143 < local136; local143++) {
											@Pc(164) boolean local164 = arg0.method5750() == 1;
											@Pc(168) int local168 = arg0.method5797();
											@Pc(177) Class1 local177;
											if (local164) {
												local177 = new Class1_Sub3(arg0.method5760());
											} else {
												local177 = new Class1_Sub13(arg0.method5804());
											}
											this.aClass187_35.method3795(local177, (long) local168);
										}
										return;
									}
									return;
								}
								this.anInt8119 = arg0.method5804();
								return;
							}
							this.anInt8114 = arg0.method5771();
							if (this.anInt8114 == 65535) {
								this.anInt8114 = -1;
							}
							this.anInt8137 = arg0.method5771();
							if (this.anInt8137 == 65535) {
								this.anInt8137 = -1;
							}
							this.anInt8120 = arg0.method5804();
							this.anInt8131 = arg0.method5804();
							return;
						}
						this.aString83 = arg0.method5760();
						return;
					}
					this.aBoolean620 = false;
					return;
				}
				local136 = arg0.method5750();
				this.anIntArray624 = new int[local136 * 2];
				for (local143 = 0; local143 < local136 * 2; local143++) {
					this.anIntArray624[local143] = arg0.method5738();
				}
				this.anInt8118 = arg0.method5804();
				this.anInt8111 = arg0.method5804();
				return;
			}
			local136 = arg0.method5750();
			if ((local136 & 0x1) == 0) {
				this.aBoolean622 = false;
			}
			if ((local136 & 0x2) == 2) {
				this.aBoolean619 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!mo;B)V")
	public void method6539(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5750();
			if (local5 == 0) {
				return;
			}
			this.method6538(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	public void method6540() {
		if (this.anIntArray624 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray624.length; local15 += 2) {
			if (this.anInt8133 > this.anIntArray624[local15]) {
				this.anInt8133 = this.anIntArray624[local15];
			} else if (this.anIntArray624[local15] > this.anInt8110) {
				this.anInt8110 = this.anIntArray624[local15];
			}
			if (this.anIntArray624[local15 + 1] < this.anInt8142) {
				this.anInt8142 = this.anIntArray624[local15 + 1];
			} else if (this.anIntArray624[local15 + 1] > this.anInt8138) {
				this.anInt8138 = this.anIntArray624[local15 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method6542(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass187_35 == null) {
			return arg0;
		} else {
			@Pc(22) Class1_Sub3 local22 = (Class1_Sub3) this.aClass187_35.method3797((long) arg1);
			return local22 == null ? arg0 : local22.aString3;
		}
	}
}
