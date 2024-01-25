import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class288 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "Lclient!mo;")
	private Class221 aClass221_31;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
	private int anInt8574;

	@OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
	public int anInt8575;

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
	private int anInt8583;

	@OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
	private int anInt8584;

	@OriginalMember(owner = "client!rca", name = "v", descriptor = "I")
	public int anInt8589;

	@OriginalMember(owner = "client!rca", name = "y", descriptor = "I")
	private int anInt8592;

	@OriginalMember(owner = "client!rca", name = "A", descriptor = "Ljava/lang/String;")
	public String aString177;

	@OriginalMember(owner = "client!rca", name = "C", descriptor = "Ljava/lang/String;")
	public String aString178;

	@OriginalMember(owner = "client!rca", name = "D", descriptor = "I")
	public int anInt8595;

	@OriginalMember(owner = "client!rca", name = "H", descriptor = "Lclient!gda;")
	public Class121 aClass121_2;

	@OriginalMember(owner = "client!rca", name = "L", descriptor = "I")
	public int anInt8600;

	@OriginalMember(owner = "client!rca", name = "O", descriptor = "I")
	public int anInt8602;

	@OriginalMember(owner = "client!rca", name = "S", descriptor = "[I")
	public int[] anIntArray498;

	@OriginalMember(owner = "client!rca", name = "T", descriptor = "I")
	public int anInt8606;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Z")
	public boolean aBoolean606 = true;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
	public int anInt8573 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
	public int anInt8577 = -1;

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
	public int anInt8576 = -1;

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "I")
	private int anInt8580 = -1;

	@OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
	private int anInt8586 = -1;

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "I")
	private int anInt8578 = -1;

	@OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
	private int anInt8585 = -1;

	@OriginalMember(owner = "client!rca", name = "G", descriptor = "I")
	public int anInt8596 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
	public int anInt8581 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rca", name = "E", descriptor = "Z")
	public boolean aBoolean607 = true;

	@OriginalMember(owner = "client!rca", name = "B", descriptor = "I")
	private int anInt8594 = -1;

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray32 = new String[5];

	@OriginalMember(owner = "client!rca", name = "M", descriptor = "I")
	public int anInt8601 = -1;

	@OriginalMember(owner = "client!rca", name = "P", descriptor = "I")
	public int anInt8603 = 0;

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "Z")
	public boolean aBoolean605 = true;

	@OriginalMember(owner = "client!rca", name = "w", descriptor = "I")
	public int anInt8590 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rca", name = "F", descriptor = "Z")
	public boolean aBoolean608 = false;

	@OriginalMember(owner = "client!rca", name = "I", descriptor = "I")
	public int anInt8597 = -1;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZLclient!of;)Z")
	public boolean method6627(@OriginalArg(1) Interface17 arg0) {
		@Pc(22) int local22;
		if (this.anInt8580 == -1) {
			if (this.anInt8594 == -1) {
				return true;
			}
			local22 = arg0.method4069(this.anInt8594);
		} else {
			local22 = arg0.method4068(this.anInt8580);
		}
		if (this.anInt8584 > local22 || local22 > this.anInt8583) {
			return false;
		}
		@Pc(63) int local63;
		if (this.anInt8586 == -1) {
			if (this.anInt8585 == -1) {
				return true;
			}
			local63 = arg0.method4069(this.anInt8585);
		} else {
			local63 = arg0.method4068(this.anInt8586);
		}
		return this.anInt8574 <= local63 && this.anInt8592 >= local63;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!ek;IB)V")
	private void method6628(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8577 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt8597 = arg0.method7054();
		} else if (arg1 == 3) {
			this.aString177 = arg0.method7016();
		} else if (arg1 == 4) {
			this.anInt8589 = arg0.method7013();
		} else if (arg1 == 5) {
			this.anInt8576 = arg0.method7013();
		} else if (arg1 == 6) {
			this.anInt8603 = arg0.method7004();
		} else {
			@Pc(68) int local68;
			if (arg1 == 7) {
				local68 = arg0.method7004();
				if ((local68 & 0x1) == 0) {
					this.aBoolean606 = false;
				}
				if ((local68 & 0x2) == 2) {
					this.aBoolean608 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean605 = arg0.method7004() == 1;
				return;
			} else if (arg1 == 9) {
				this.anInt8594 = arg0.method7054();
				if (this.anInt8594 == 65535) {
					this.anInt8594 = -1;
				}
				this.anInt8580 = arg0.method7054();
				if (this.anInt8580 == 65535) {
					this.anInt8580 = -1;
				}
				this.anInt8584 = arg0.method6990();
				this.anInt8583 = arg0.method6990();
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(205) int local205;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 != 17) {
							if (arg1 == 18) {
								this.anInt8578 = arg0.method7054();
								return;
							}
							if (arg1 != 19) {
								if (arg1 == 20) {
									this.anInt8585 = arg0.method7054();
									if (this.anInt8585 == 65535) {
										this.anInt8585 = -1;
									}
									this.anInt8586 = arg0.method7054();
									if (this.anInt8586 == 65535) {
										this.anInt8586 = -1;
									}
									this.anInt8574 = arg0.method6990();
									this.anInt8592 = arg0.method6990();
									return;
								}
								if (arg1 != 21) {
									if (arg1 == 22) {
										this.anInt8606 = arg0.method6990();
									} else if (arg1 == 249) {
										local68 = arg0.method7004();
										if (this.aClass221_31 == null) {
											local205 = Static488.method7100(local68);
											this.aClass221_31 = new Class221(local205);
										}
										for (local205 = 0; local205 < local68; local205++) {
											@Pc(224) boolean local224 = arg0.method7004() == 1;
											@Pc(228) int local228 = arg0.method7013();
											@Pc(237) Class4 local237;
											if (local224) {
												local237 = new Class4_Sub11(arg0.method7016());
											} else {
												local237 = new Class4_Sub27(arg0.method6990());
											}
											this.aClass221_31.method5073(local237, (long) local228);
										}
										return;
									}
									return;
								}
								this.anInt8595 = arg0.method6990();
								return;
							}
							this.anInt8601 = arg0.method7054();
							return;
						}
						this.aString178 = arg0.method7016();
						return;
					}
					this.aBoolean607 = false;
					return;
				}
				local68 = arg0.method7004();
				this.anIntArray498 = new int[local68 * 2];
				for (local205 = 0; local205 < local68 * 2; local205++) {
					this.anIntArray498[local205] = arg0.method7043();
				}
				this.anInt8600 = arg0.method6990();
				this.anInt8602 = arg0.method6990();
				return;
			} else {
				this.aStringArray32[arg1 - 10] = arg0.method7016();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZLclient!r;)Lclient!f;")
	public Class88 method6629(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt8597 : this.anInt8577;
		@Pc(18) int local18 = arg1.anInt10078 << 29 | local11;
		@Pc(27) Class88 local27 = (Class88) this.aClass121_2.aClass167_11.method3966((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass121_2.aClass348_40.method7960(local11)) {
			@Pc(47) Class103 local47 = Static598.method2462(this.aClass121_2.aClass348_40, local11, 0);
			if (local47 != null) {
				local27 = arg1.method7808(local47, true);
				this.aClass121_2.aClass167_11.method3974((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method6630(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass221_31 == null) {
			return arg0;
		} else {
			@Pc(18) Class4_Sub11 local18 = (Class4_Sub11) this.aClass221_31.method5075((long) arg1);
			return local18 == null ? arg0 : local18.aString37;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!r;)Lclient!f;")
	public Class88 method6633(@OriginalArg(1) Class7 arg0) {
		@Pc(20) Class88 local20 = (Class88) this.aClass121_2.aClass167_11.method3966((long) (arg0.anInt10078 << 29 | 0x20000 | this.anInt8578));
		if (local20 != null) {
			return local20;
		}
		this.aClass121_2.aClass348_40.method7960(this.anInt8578);
		@Pc(40) Class103 local40 = Static598.method2462(this.aClass121_2.aClass348_40, this.anInt8578, 0);
		if (local40 != null) {
			local20 = arg0.method7808(local40, true);
			this.aClass121_2.aClass167_11.method3974((long) (arg0.anInt10078 << 29 | this.anInt8578 | 0x20000), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!ek;)V")
	public void method6634(@OriginalArg(1) Class4_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7004();
			if (local17 == 0) {
				return;
			}
			this.method6628(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(Z)V")
	public void method6636() {
		if (this.anIntArray498 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray498.length; local14 += 2) {
			if (this.anInt8596 > this.anIntArray498[local14]) {
				this.anInt8596 = this.anIntArray498[local14];
			} else if (this.anIntArray498[local14] > this.anInt8590) {
				this.anInt8590 = this.anIntArray498[local14];
			}
			if (this.anInt8573 > this.anIntArray498[local14 + 1]) {
				this.anInt8573 = this.anIntArray498[local14 + 1];
			} else if (this.anInt8581 < this.anIntArray498[local14 + 1]) {
				this.anInt8581 = this.anIntArray498[local14 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)I")
	public int method6637(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass221_31 == null) {
			return arg0;
		} else {
			@Pc(16) Class4_Sub27 local16 = (Class4_Sub27) this.aClass221_31.method5075((long) arg1);
			return local16 == null ? arg0 : local16.anInt4968;
		}
	}
}
