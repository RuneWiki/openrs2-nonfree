import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class338 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public int anInt9740;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	private int anInt9741;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	private int anInt9742;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public int anInt9743;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	public int anInt9749;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	private int anInt9755;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
	private int anInt9758;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	public int anInt9759;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
	public int anInt9761;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Ljava/lang/String;")
	public String aString92;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Ljava/lang/String;")
	public String aString93;

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "Lclient!hn;")
	public Class142 aClass142_4;

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "Lclient!waa;")
	private Class350 aClass350_40;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
	public int anInt9766;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Z")
	public boolean aBoolean682 = true;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	private int anInt9748 = -1;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public int anInt9746 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	public int anInt9753 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	private int anInt9750 = -1;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	private int anInt9744 = -1;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
	public int anInt9762 = 0;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
	private int anInt9760 = -1;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
	public int anInt9756 = -1;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "Z")
	public boolean aBoolean684 = true;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
	private int anInt9767 = -1;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	public int anInt9754 = -1;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "Z")
	public boolean aBoolean683 = false;

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray68 = new String[5];

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "Z")
	public boolean aBoolean685 = true;

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
	public int anInt9770 = -1;

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
	public int anInt9768 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
	public int anInt9763 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
	public int anInt9771 = -1;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLclient!r;)Lclient!f;")
	public Class78 method7970(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class44 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt9771 : this.anInt9756;
		@Pc(18) int local18 = local11 | arg1.anInt5872 << 29;
		@Pc(27) Class78 local27 = (Class78) this.aClass142_4.aClass223_26.method5388((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass142_4.aClass176_57.method3996(local11)) {
			@Pc(53) Class261 local53 = Static598.method6312(this.aClass142_4.aClass176_57, local11, 0);
			if (local53 != null) {
				local27 = arg1.method5018(local53, true);
				this.aClass142_4.aClass223_26.method5394(local27, (long) local18);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)I")
	public int method7971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass350_40 == null) {
			return arg1;
		} else {
			@Pc(16) Class4_Sub38 local16 = (Class4_Sub38) this.aClass350_40.method8207((long) arg0);
			return local16 == null ? arg1 : local16.anInt8496;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public void method7972() {
		if (this.anIntArray522 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray522.length; local10 += 2) {
			if (this.anInt9768 > this.anIntArray522[local10]) {
				this.anInt9768 = this.anIntArray522[local10];
			} else if (this.anInt9753 < this.anIntArray522[local10]) {
				this.anInt9753 = this.anIntArray522[local10];
			}
			if (this.anInt9746 > this.anIntArray522[local10 + 1]) {
				this.anInt9746 = this.anIntArray522[local10 + 1];
			} else if (this.anIntArray522[local10 + 1] > this.anInt9763) {
				this.anInt9763 = this.anIntArray522[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ri;B)Z")
	public boolean method7973(@OriginalArg(0) Interface21 arg0) {
		@Pc(19) int local19;
		if (this.anInt9750 == -1) {
			if (this.anInt9744 == -1) {
				return true;
			}
			local19 = arg0.method3448(this.anInt9744);
		} else {
			local19 = arg0.method3447(this.anInt9750);
		}
		if (this.anInt9758 > local19 || local19 > this.anInt9742) {
			return false;
		}
		@Pc(68) int local68;
		if (this.anInt9767 == -1) {
			if (this.anInt9760 == -1) {
				return true;
			}
			local68 = arg0.method3448(this.anInt9760);
		} else {
			local68 = arg0.method3447(this.anInt9767);
		}
		return local68 >= this.anInt9741 && this.anInt9755 >= local68;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!r;)Lclient!f;")
	public Class78 method7974(@OriginalArg(1) Class44 arg0) {
		@Pc(25) Class78 local25 = (Class78) this.aClass142_4.aClass223_26.method5388((long) (arg0.anInt5872 << 29 | this.anInt9748 | 0x20000));
		if (local25 != null) {
			return local25;
		}
		this.aClass142_4.aClass176_57.method3996(this.anInt9748);
		@Pc(45) Class261 local45 = Static598.method6312(this.aClass142_4.aClass176_57, this.anInt9748, 0);
		if (local45 != null) {
			local25 = arg0.method5018(local45, true);
			this.aClass142_4.aClass223_26.method5394(local25, (long) (this.anInt9748 | 0x20000 | arg0.anInt5872 << 29));
		}
		return local25;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method7976(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass350_40 == null) {
			return arg1;
		} else {
			@Pc(16) Class4_Sub50 local16 = (Class4_Sub50) this.aClass350_40.method8207((long) arg0);
			return local16 == null ? arg1 : local16.aString105;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!un;Z)V")
	public void method7977(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4905();
			if (local5 == 0) {
				return;
			}
			this.method7978(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!un;ZI)V")
	private void method7978(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9756 = arg0.method4936();
		} else if (arg1 == 2) {
			this.anInt9771 = arg0.method4936();
		} else if (arg1 == 3) {
			this.aString92 = arg0.method4920();
		} else if (arg1 == 4) {
			this.anInt9740 = arg0.method4934();
		} else if (arg1 == 5) {
			this.anInt9754 = arg0.method4934();
		} else if (arg1 == 6) {
			this.anInt9762 = arg0.method4905();
		} else {
			@Pc(54) int local54;
			if (arg1 == 7) {
				local54 = arg0.method4905();
				if ((local54 & 0x1) == 0) {
					this.aBoolean684 = false;
				}
				if ((local54 & 0x2) == 2) {
					this.aBoolean683 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean682 = arg0.method4905() == 1;
			} else if (arg1 == 9) {
				this.anInt9744 = arg0.method4936();
				if (this.anInt9744 == 65535) {
					this.anInt9744 = -1;
				}
				this.anInt9750 = arg0.method4936();
				if (this.anInt9750 == 65535) {
					this.anInt9750 = -1;
				}
				this.anInt9758 = arg0.method4931();
				this.anInt9742 = arg0.method4931();
				return;
			} else if (arg1 < 10 || arg1 > 14) {
				@Pc(216) int local216;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean685 = false;
						return;
					}
					if (arg1 != 17) {
						if (arg1 != 18) {
							if (arg1 != 19) {
								if (arg1 == 20) {
									this.anInt9760 = arg0.method4936();
									if (this.anInt9760 == 65535) {
										this.anInt9760 = -1;
									}
									this.anInt9767 = arg0.method4936();
									if (this.anInt9767 == 65535) {
										this.anInt9767 = -1;
									}
									this.anInt9741 = arg0.method4931();
									this.anInt9755 = arg0.method4931();
									return;
								}
								if (arg1 != 21) {
									if (arg1 == 22) {
										this.anInt9759 = arg0.method4931();
									} else if (arg1 == 249) {
										local54 = arg0.method4905();
										if (this.aClass350_40 == null) {
											local216 = Static341.method5553(local54);
											this.aClass350_40 = new Class350(local216);
										}
										for (local216 = 0; local216 < local54; local216++) {
											@Pc(237) boolean local237 = arg0.method4905() == 1;
											@Pc(241) int local241 = arg0.method4934();
											@Pc(250) Class4 local250;
											if (local237) {
												local250 = new Class4_Sub50(arg0.method4920());
											} else {
												local250 = new Class4_Sub38(arg0.method4931());
											}
											this.aClass350_40.method8199((long) local241, local250);
										}
										return;
									}
									return;
								}
								this.anInt9761 = arg0.method4931();
								return;
							}
							this.anInt9770 = arg0.method4936();
							return;
						}
						this.anInt9748 = arg0.method4936();
						return;
					}
					this.aString93 = arg0.method4920();
					return;
				}
				local54 = arg0.method4905();
				this.anIntArray522 = new int[local54 * 2];
				for (local216 = 0; local216 < local54 * 2; local216++) {
					this.anIntArray522[local216] = arg0.method4946();
				}
				this.anInt9743 = arg0.method4931();
				this.anInt9749 = arg0.method4931();
				return;
			} else {
				this.aStringArray68[arg1 - 10] = arg0.method4920();
				return;
			}
		}
	}
}
