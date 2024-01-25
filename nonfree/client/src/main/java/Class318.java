import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sda")
public final class Class318 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "[I")
	public int[] anIntArray586;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "Ljava/lang/String;")
	public String aString120;

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
	public int anInt8696;

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
	public int anInt8699;

	@OriginalMember(owner = "client!sda", name = "m", descriptor = "Lclient!qb;")
	public Class280 aClass280_4;

	@OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
	public int anInt8704;

	@OriginalMember(owner = "client!sda", name = "o", descriptor = "I")
	public int anInt8705;

	@OriginalMember(owner = "client!sda", name = "q", descriptor = "Lclient!lk;")
	private Class209 aClass209_48;

	@OriginalMember(owner = "client!sda", name = "s", descriptor = "I")
	public int anInt8708;

	@OriginalMember(owner = "client!sda", name = "u", descriptor = "I")
	private int anInt8710;

	@OriginalMember(owner = "client!sda", name = "z", descriptor = "I")
	private int anInt8712;

	@OriginalMember(owner = "client!sda", name = "E", descriptor = "[I")
	public int[] anIntArray587;

	@OriginalMember(owner = "client!sda", name = "G", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!sda", name = "K", descriptor = "Ljava/lang/String;")
	public String aString121;

	@OriginalMember(owner = "client!sda", name = "L", descriptor = "I")
	public int anInt8721;

	@OriginalMember(owner = "client!sda", name = "V", descriptor = "I")
	private int anInt8729;

	@OriginalMember(owner = "client!sda", name = "W", descriptor = "I")
	public int anInt8730;

	@OriginalMember(owner = "client!sda", name = "X", descriptor = "I")
	private int anInt8731;

	@OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
	public int anInt8700 = -1;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
	public int anInt8698 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "Z")
	public boolean aBoolean616 = true;

	@OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
	public int anInt8707 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sda", name = "F", descriptor = "I")
	public int anInt8717 = -1;

	@OriginalMember(owner = "client!sda", name = "x", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray54 = new String[5];

	@OriginalMember(owner = "client!sda", name = "w", descriptor = "Z")
	public boolean aBoolean618 = false;

	@OriginalMember(owner = "client!sda", name = "D", descriptor = "I")
	public int anInt8716 = -1;

	@OriginalMember(owner = "client!sda", name = "O", descriptor = "I")
	public int anInt8724 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sda", name = "y", descriptor = "I")
	public int anInt8711 = -1;

	@OriginalMember(owner = "client!sda", name = "J", descriptor = "I")
	public int anInt8720 = 0;

	@OriginalMember(owner = "client!sda", name = "A", descriptor = "I")
	private int anInt8713 = -1;

	@OriginalMember(owner = "client!sda", name = "M", descriptor = "I")
	public int anInt8722 = -1;

	@OriginalMember(owner = "client!sda", name = "I", descriptor = "I")
	public int anInt8719 = -1;

	@OriginalMember(owner = "client!sda", name = "R", descriptor = "I")
	private int anInt8727 = -1;

	@OriginalMember(owner = "client!sda", name = "H", descriptor = "I")
	private int anInt8718 = -1;

	@OriginalMember(owner = "client!sda", name = "U", descriptor = "I")
	private int anInt8728 = -1;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
	public int anInt8695 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
	public int anInt8701 = -1;

	@OriginalMember(owner = "client!sda", name = "S", descriptor = "Z")
	public boolean aBoolean619 = true;

	@OriginalMember(owner = "client!sda", name = "P", descriptor = "I")
	private int anInt8725 = -1;

	@OriginalMember(owner = "client!sda", name = "v", descriptor = "Z")
	public boolean aBoolean617 = true;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
	public void method7383() {
		if (this.anIntArray587 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray587.length; local16 += 2) {
			if (this.anInt8698 > this.anIntArray587[local16]) {
				this.anInt8698 = this.anIntArray587[local16];
			} else if (this.anIntArray587[local16] > this.anInt8707) {
				this.anInt8707 = this.anIntArray587[local16];
			}
			if (this.anIntArray587[local16 + 1] < this.anInt8695) {
				this.anInt8695 = this.anIntArray587[local16 + 1];
			} else if (this.anInt8724 < this.anIntArray587[local16 + 1]) {
				this.anInt8724 = this.anIntArray587[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!gga;B)V")
	public void method7384(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8374();
			if (local14 == 0) {
				return;
			}
			this.method7389(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!ha;Z)Lclient!ho;")
	public Class9 method7385(@OriginalArg(1) Class132 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt8719 : this.anInt8722;
		@Pc(18) int local18 = arg0.anInt8773 << 29 | local11;
		@Pc(35) Class9 local35 = (Class9) this.aClass280_4.aClass10_51.method373((long) local18);
		if (local35 != null) {
			return local35;
		} else if (this.aClass280_4.aClass8_118.method273(local11)) {
			@Pc(55) Class112 local55 = Static681.method2327(this.aClass280_4.aClass8_118, local11, 0);
			if (local55 != null) {
				local35 = arg0.method7488(local55, true);
				this.aClass280_4.aClass10_51.method366(local35, (long) local18);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!oia;)Z")
	public boolean method7386(@OriginalArg(1) Interface19 arg0) {
		@Pc(15) int local15;
		if (this.anInt8718 == -1) {
			if (this.anInt8725 == -1) {
				return true;
			}
			local15 = arg0.method8556(this.anInt8725);
		} else {
			local15 = arg0.method8557(this.anInt8718);
		}
		if (local15 < this.anInt8731 || this.anInt8710 < local15) {
			return false;
		}
		@Pc(74) int local74;
		if (this.anInt8727 == -1) {
			if (this.anInt8728 == -1) {
				return true;
			}
			local74 = arg0.method8556(this.anInt8728);
		} else {
			local74 = arg0.method8557(this.anInt8727);
		}
		return this.anInt8729 <= local74 && this.anInt8712 >= local74;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!ha;Z)Lclient!ho;")
	public Class9 method7387(@OriginalArg(0) Class132 arg0) {
		@Pc(26) Class9 local26 = (Class9) this.aClass280_4.aClass10_51.method373((long) (this.anInt8713 | 0x20000 | arg0.anInt8773 << 29));
		if (local26 != null) {
			return local26;
		}
		this.aClass280_4.aClass8_118.method273(this.anInt8713);
		@Pc(46) Class112 local46 = Static681.method2327(this.aClass280_4.aClass8_118, this.anInt8713, 0);
		if (local46 != null) {
			local26 = arg0.method7488(local46, true);
			this.aClass280_4.aClass10_51.method366(local26, (long) (arg0.anInt8773 << 29 | this.anInt8713 | 0x20000));
		}
		return local26;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method7388(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass209_48 == null) {
			return arg1;
		} else {
			@Pc(16) Class6_Sub16 local16 = (Class6_Sub16) this.aClass209_48.method5038((long) arg0);
			return local16 == null ? arg1 : local16.aString22;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IILclient!gga;)V")
	private void method7389(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt8722 = arg1.method8363();
		} else if (arg0 == 2) {
			this.anInt8719 = arg1.method8363();
		} else if (arg0 == 3) {
			this.aString120 = arg1.method8354();
		} else if (arg0 == 4) {
			this.anInt8704 = arg1.method8344();
		} else if (arg0 == 5) {
			this.anInt8717 = arg1.method8344();
		} else if (arg0 == 6) {
			this.anInt8720 = arg1.method8374();
		} else {
			@Pc(44) int local44;
			if (arg0 == 7) {
				local44 = arg1.method8374();
				if ((local44 & 0x2) == 2) {
					this.aBoolean618 = true;
				}
				if ((local44 & 0x1) == 0) {
					this.aBoolean616 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean619 = arg1.method8374() == 1;
			} else if (arg0 == 9) {
				this.anInt8725 = arg1.method8363();
				if (this.anInt8725 == 65535) {
					this.anInt8725 = -1;
				}
				this.anInt8718 = arg1.method8363();
				if (this.anInt8718 == 65535) {
					this.anInt8718 = -1;
				}
				this.anInt8731 = arg1.method8369();
				this.anInt8710 = arg1.method8369();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray54[arg0 - 10] = arg1.method8354();
			} else {
				@Pc(94) int local94;
				@Pc(130) int local130;
				if (arg0 == 15) {
					local44 = arg1.method8374();
					this.anIntArray587 = new int[local44 * 2];
					for (local94 = 0; local94 < local44 * 2; local94++) {
						this.anIntArray587[local94] = arg1.method8395();
					}
					this.anInt8730 = arg1.method8369();
					@Pc(124) int local124 = arg1.method8374();
					this.anIntArray586 = new int[local124];
					for (local130 = 0; local130 < this.anIntArray586.length; local130++) {
						this.anIntArray586[local130] = arg1.method8369();
					}
					this.aByteArray94 = new byte[local44];
					for (@Pc(155) int local155 = 0; local155 < local44; local155++) {
						this.aByteArray94[local155] = arg1.method8391();
					}
				} else if (arg0 == 16) {
					this.aBoolean617 = false;
				} else if (arg0 == 17) {
					this.aString121 = arg1.method8354();
				} else if (arg0 == 18) {
					this.anInt8713 = arg1.method8363();
				} else if (arg0 == 19) {
					this.anInt8700 = arg1.method8363();
				} else if (arg0 == 20) {
					this.anInt8728 = arg1.method8363();
					if (this.anInt8728 == 65535) {
						this.anInt8728 = -1;
					}
					this.anInt8727 = arg1.method8363();
					if (this.anInt8727 == 65535) {
						this.anInt8727 = -1;
					}
					this.anInt8729 = arg1.method8369();
					this.anInt8712 = arg1.method8369();
				} else if (arg0 == 21) {
					this.anInt8699 = arg1.method8369();
				} else if (arg0 == 22) {
					this.anInt8721 = arg1.method8369();
				} else if (arg0 == 23) {
					this.anInt8711 = arg1.method8374();
					this.anInt8701 = arg1.method8374();
					this.anInt8716 = arg1.method8374();
				} else if (arg0 == 24) {
					this.anInt8696 = arg1.method8395();
					this.anInt8705 = arg1.method8395();
				} else if (arg0 == 249) {
					local44 = arg1.method8374();
					if (this.aClass209_48 == null) {
						local94 = Static655.method8912(local44);
						this.aClass209_48 = new Class209(local94);
					}
					for (local94 = 0; local94 < local44; local94++) {
						@Pc(278) boolean local278 = arg1.method8374() == 1;
						local130 = arg1.method8344();
						@Pc(291) Class6 local291;
						if (local278) {
							local291 = new Class6_Sub16(arg1.method8354());
						} else {
							local291 = new Class6_Sub36(arg1.method8369());
						}
						this.aClass209_48.method5035((long) local130, local291);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)I")
	public int method7391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass209_48 == null) {
			return arg1;
		} else {
			@Pc(21) Class6_Sub36 local21 = (Class6_Sub36) this.aClass209_48.method5038((long) arg0);
			return local21 == null ? arg1 : local21.anInt5996;
		}
	}
}
