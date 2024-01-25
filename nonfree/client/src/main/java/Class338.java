import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class338 {

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "Lclient!lk;")
	public Class189 aClass189_4;

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "[I")
	public int[] anIntArray561;

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
	public int anInt9719;

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
	public int anInt9721;

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
	public int anInt9722;

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
	public int anInt9726;

	@OriginalMember(owner = "client!vca", name = "s", descriptor = "Ljava/lang/String;")
	public String aString255;

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "Ljava/lang/String;")
	public String aString256;

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
	private int anInt9733;

	@OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
	public int anInt9736;

	@OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
	public int anInt9738;

	@OriginalMember(owner = "client!vca", name = "E", descriptor = "I")
	private int anInt9739;

	@OriginalMember(owner = "client!vca", name = "J", descriptor = "I")
	private int anInt9744;

	@OriginalMember(owner = "client!vca", name = "K", descriptor = "Lclient!sba;")
	private Class297 aClass297_35;

	@OriginalMember(owner = "client!vca", name = "U", descriptor = "I")
	private int anInt9752;

	@OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
	private int anInt9730 = -1;

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
	public int anInt9720 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
	private int anInt9734 = -1;

	@OriginalMember(owner = "client!vca", name = "y", descriptor = "Z")
	public boolean aBoolean644 = true;

	@OriginalMember(owner = "client!vca", name = "H", descriptor = "I")
	public int anInt9742 = 0;

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "Z")
	public boolean aBoolean643 = false;

	@OriginalMember(owner = "client!vca", name = "z", descriptor = "Z")
	public boolean aBoolean645 = true;

	@OriginalMember(owner = "client!vca", name = "M", descriptor = "I")
	public int anInt9746 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vca", name = "L", descriptor = "I")
	public int anInt9745 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vca", name = "G", descriptor = "I")
	public int anInt9741 = -1;

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
	private int anInt9729 = -1;

	@OriginalMember(owner = "client!vca", name = "m", descriptor = "I")
	public int anInt9725 = -1;

	@OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
	public int anInt9728 = -1;

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray47 = new String[5];

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
	public int anInt9732 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vca", name = "I", descriptor = "I")
	private int anInt9743 = -1;

	@OriginalMember(owner = "client!vca", name = "S", descriptor = "I")
	private int anInt9750 = -1;

	@OriginalMember(owner = "client!vca", name = "R", descriptor = "I")
	public int anInt9749 = -1;

	@OriginalMember(owner = "client!vca", name = "Q", descriptor = "Z")
	public boolean aBoolean646 = true;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!r;ZZ)Lclient!f;")
	public Class73 method7654(@OriginalArg(0) Class31 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt9728 : this.anInt9741;
		@Pc(18) int local18 = arg0.anInt10222 << 29 | local11;
		@Pc(27) Class73 local27 = (Class73) this.aClass189_4.aClass342_119.method7684((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass189_4.aClass284_95.method6347(local11)) {
			@Pc(47) Class365 local47 = Static607.method8163(this.aClass189_4.aClass284_95, local11, 0);
			if (local47 != null) {
				local27 = arg0.method8086(local47, true);
				this.aClass189_4.aClass342_119.method7683(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!ie;BI)V")
	private void method7655(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9741 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt9728 = arg0.method6811();
		} else if (arg1 == 3) {
			this.aString255 = arg0.method6786();
		} else if (arg1 == 4) {
			this.anInt9736 = arg0.method6830();
		} else if (arg1 == 5) {
			this.anInt9725 = arg0.method6830();
		} else if (arg1 == 6) {
			this.anInt9742 = arg0.method6814();
			return;
		} else {
			@Pc(84) int local84;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean646 = arg0.method6814() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt9743 = arg0.method6811();
					if (this.anInt9743 == 65535) {
						this.anInt9743 = -1;
					}
					this.anInt9750 = arg0.method6811();
					if (this.anInt9750 == 65535) {
						this.anInt9750 = -1;
					}
					this.anInt9752 = arg0.method6816();
					this.anInt9744 = arg0.method6816();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray47[arg1 - 10] = arg0.method6786();
					return;
				}
				@Pc(92) int local92;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 == 17) {
							this.aString256 = arg0.method6786();
						} else if (arg1 == 18) {
							this.anInt9729 = arg0.method6811();
							return;
						} else if (arg1 == 19) {
							this.anInt9749 = arg0.method6811();
							return;
						} else if (arg1 == 20) {
							this.anInt9730 = arg0.method6811();
							if (this.anInt9730 == 65535) {
								this.anInt9730 = -1;
							}
							this.anInt9734 = arg0.method6811();
							if (this.anInt9734 == 65535) {
								this.anInt9734 = -1;
							}
							this.anInt9739 = arg0.method6816();
							this.anInt9733 = arg0.method6816();
							return;
						} else if (arg1 == 21) {
							this.anInt9721 = arg0.method6816();
							return;
						} else if (arg1 == 22) {
							this.anInt9719 = arg0.method6816();
							return;
						} else if (arg1 == 249) {
							local84 = arg0.method6814();
							if (this.aClass297_35 == null) {
								local92 = Static538.method7366(local84);
								this.aClass297_35 = new Class297(local92);
							}
							for (local92 = 0; local92 < local84; local92++) {
								@Pc(249) boolean local249 = arg0.method6814() == 1;
								@Pc(255) int local255 = arg0.method6830();
								@Pc(266) Class3 local266;
								if (local249) {
									local266 = new Class3_Sub46(arg0.method6786());
								} else {
									local266 = new Class3_Sub2(arg0.method6816());
								}
								this.aClass297_35.method6537((long) local255, local266);
							}
							return;
						}
						return;
					}
					this.aBoolean645 = false;
					return;
				}
				local84 = arg0.method6814();
				this.anIntArray561 = new int[local84 * 2];
				for (local92 = 0; local92 < local84 * 2; local92++) {
					this.anIntArray561[local92] = arg0.method6789();
				}
				this.anInt9726 = arg0.method6816();
				this.anInt9738 = arg0.method6816();
				return;
			}
			local84 = arg0.method6814();
			if ((local84 & 0x2) == 2) {
				this.aBoolean643 = true;
			}
			if ((local84 & 0x1) == 0) {
				this.aBoolean644 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BII)I")
	public int method7657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass297_35 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub2 local16 = (Class3_Sub2) this.aClass297_35.method6531((long) arg0);
			return local16 == null ? arg1 : local16.anInt39;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILclient!r;)Lclient!f;")
	public Class73 method7658(@OriginalArg(1) Class31 arg0) {
		@Pc(20) Class73 local20 = (Class73) this.aClass189_4.aClass342_119.method7684((long) (this.anInt9729 | 0x20000 | arg0.anInt10222 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass189_4.aClass284_95.method6347(this.anInt9729);
		@Pc(40) Class365 local40 = Static607.method8163(this.aClass189_4.aClass284_95, this.anInt9729, 0);
		if (local40 != null) {
			local20 = arg0.method8086(local40, true);
			this.aClass189_4.aClass342_119.method7683(local20, (long) (this.anInt9729 | 0x20000 | arg0.anInt10222 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
	public void method7659() {
		if (this.anIntArray561 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray561.length; local14 += 2) {
			if (this.anInt9745 > this.anIntArray561[local14]) {
				this.anInt9745 = this.anIntArray561[local14];
			} else if (this.anIntArray561[local14] > this.anInt9746) {
				this.anInt9746 = this.anIntArray561[local14];
			}
			if (this.anInt9732 > this.anIntArray561[local14 + 1]) {
				this.anInt9732 = this.anIntArray561[local14 + 1];
			} else if (this.anInt9720 < this.anIntArray561[local14 + 1]) {
				this.anInt9720 = this.anIntArray561[local14 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method7660(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass297_35 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub46 local16 = (Class3_Sub46) this.aClass297_35.method6531((long) arg0);
			return local16 == null ? arg1 : local16.aString217;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLclient!hfa;)Z")
	public boolean method7661(@OriginalArg(1) Interface7 arg0) {
		@Pc(22) int local22;
		if (this.anInt9750 == -1) {
			if (this.anInt9743 == -1) {
				return true;
			}
			local22 = arg0.method3687(this.anInt9743);
		} else {
			local22 = arg0.method3688(this.anInt9750);
		}
		if (this.anInt9752 > local22 || this.anInt9744 < local22) {
			return false;
		}
		@Pc(61) int local61;
		if (this.anInt9734 == -1) {
			if (this.anInt9730 == -1) {
				return true;
			}
			local61 = arg0.method3687(this.anInt9730);
		} else {
			local61 = arg0.method3688(this.anInt9734);
		}
		return local61 >= this.anInt9739 && this.anInt9733 >= local61;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!ie;I)V")
	public void method7663(@OriginalArg(0) Class3_Sub26 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6814();
			if (local11 == 0) {
				return;
			}
			this.method7655(arg0, local11);
		}
	}
}
