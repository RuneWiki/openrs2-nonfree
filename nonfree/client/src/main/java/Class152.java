import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class152 {

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	private int anInt4727;

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	public int anInt4730;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "I")
	public int anInt4733;

	@OriginalMember(owner = "client!j", name = "n", descriptor = "I")
	public int anInt4735;

	@OriginalMember(owner = "client!j", name = "s", descriptor = "I")
	private int anInt4738;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "I")
	private int anInt4740;

	@OriginalMember(owner = "client!j", name = "B", descriptor = "I")
	private int anInt4745;

	@OriginalMember(owner = "client!j", name = "F", descriptor = "I")
	public int anInt4749;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	public int anInt4750;

	@OriginalMember(owner = "client!j", name = "I", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "I")
	public int anInt4753;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!ep;")
	public Class93 aClass93_4;

	@OriginalMember(owner = "client!j", name = "R", descriptor = "Lclient!dea;")
	private Class68 aClass68_38;

	@OriginalMember(owner = "client!j", name = "S", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public int anInt4722 = -1;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "I")
	public int anInt4724 = -1;

	@OriginalMember(owner = "client!j", name = "m", descriptor = "I")
	public int anInt4734 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!j", name = "p", descriptor = "I")
	public int anInt4736 = -1;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Z")
	public boolean aBoolean377 = true;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "I")
	private int anInt4729 = -1;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "I")
	public int anInt4746 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "I")
	private int anInt4728 = -1;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "I")
	private int anInt4748 = -1;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public int anInt4739 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	private int anInt4752 = -1;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "I")
	public int anInt4751 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!j", name = "D", descriptor = "I")
	private int anInt4747 = -1;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	public int anInt4756 = 0;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "Z")
	public boolean aBoolean380 = true;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "Z")
	public boolean aBoolean378 = true;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray27 = new String[5];

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	public int anInt4754 = -1;

	static {
		new Class88("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZLclient!qa;)Lclient!ha;")
	public Class84 method4017(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class42 arg1) {
		@Pc(16) int local16 = arg0 ? this.anInt4722 : this.anInt4736;
		@Pc(23) int local23 = arg1.anInt6927 << 29 | local16;
		@Pc(32) Class84 local32 = (Class84) this.aClass93_4.aClass125_12.method3446((long) local23);
		if (local32 != null) {
			return local32;
		} else if (this.aClass93_4.aClass16_30.method389(local16)) {
			@Pc(52) Class40 local52 = Static550.method897(this.aClass93_4.aClass16_30, local16, 0);
			if (local52 != null) {
				local32 = arg1.method5839(local52);
				this.aClass93_4.aClass125_12.method3437(local32, (long) local23);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IILclient!daa;)V")
	private void method4018(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt4736 = arg1.method5199();
		} else if (arg0 == 2) {
			this.anInt4722 = arg1.method5199();
		} else if (arg0 == 3) {
			this.aString44 = arg1.method5206();
		} else if (arg0 == 4) {
			this.anInt4730 = arg1.method5195();
		} else if (arg0 == 5) {
			this.anInt4754 = arg1.method5195();
		} else if (arg0 == 6) {
			this.anInt4756 = arg1.method5216();
		} else {
			@Pc(72) int local72;
			if (arg0 == 7) {
				local72 = arg1.method5216();
				if ((local72 & 0x1) == 0) {
					this.aBoolean380 = false;
				}
				if ((local72 & 0x2) == 2) {
					this.aBoolean379 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean377 = arg1.method5216() == 1;
			} else if (arg0 == 9) {
				this.anInt4728 = arg1.method5199();
				if (this.anInt4728 == 65535) {
					this.anInt4728 = -1;
				}
				this.anInt4748 = arg1.method5199();
				if (this.anInt4748 == 65535) {
					this.anInt4748 = -1;
				}
				this.anInt4740 = arg1.method5225();
				this.anInt4745 = arg1.method5225();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray27[arg0 - 10] = arg1.method5206();
			} else {
				@Pc(80) int local80;
				if (arg0 == 15) {
					local72 = arg1.method5216();
					this.anIntArray344 = new int[local72 * 2];
					for (local80 = 0; local80 < local72 * 2; local80++) {
						this.anIntArray344[local80] = arg1.method5217();
					}
					this.anInt4750 = arg1.method5225();
					this.anInt4735 = arg1.method5225();
				} else if (arg0 == 16) {
					this.aBoolean378 = false;
				} else if (arg0 == 17) {
					this.aString45 = arg1.method5206();
				} else if (arg0 == 18) {
					this.anInt4752 = arg1.method5199();
				} else if (arg0 == 19) {
					this.anInt4724 = arg1.method5199();
				} else if (arg0 == 20) {
					this.anInt4729 = arg1.method5199();
					if (this.anInt4729 == 65535) {
						this.anInt4729 = -1;
					}
					this.anInt4747 = arg1.method5199();
					if (this.anInt4747 == 65535) {
						this.anInt4747 = -1;
					}
					this.anInt4738 = arg1.method5225();
					this.anInt4727 = arg1.method5225();
				} else if (arg0 == 21) {
					this.anInt4749 = arg1.method5225();
				} else if (arg0 == 22) {
					this.anInt4733 = arg1.method5225();
				} else if (arg0 == 249) {
					local72 = arg1.method5216();
					if (this.aClass68_38 == null) {
						local80 = Static37.method6277(local72);
						this.aClass68_38 = new Class68(local80);
					}
					for (local80 = 0; local80 < local72; local80++) {
						@Pc(243) boolean local243 = arg1.method5216() == 1;
						@Pc(247) int local247 = arg1.method5195();
						@Pc(256) Class12 local256;
						if (local243) {
							local256 = new Class12_Sub16(arg1.method5206());
						} else {
							local256 = new Class12_Sub18(arg1.method5225());
						}
						this.aClass68_38.method1916(local256, (long) local247);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method4021(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass68_38 == null) {
			return arg0;
		} else {
			@Pc(16) Class12_Sub16 local16 = (Class12_Sub16) this.aClass68_38.method1917((long) arg1);
			return local16 == null ? arg0 : local16.aString30;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)I")
	public int method4022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass68_38 == null) {
			return arg1;
		} else {
			@Pc(22) Class12_Sub18 local22 = (Class12_Sub18) this.aClass68_38.method1917((long) arg0);
			return local22 == null ? arg1 : local22.anInt3978;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public void method4024() {
		if (this.anIntArray344 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray344.length; local15 += 2) {
			if (this.anInt4734 > this.anIntArray344[local15]) {
				this.anInt4734 = this.anIntArray344[local15];
			} else if (this.anInt4751 < this.anIntArray344[local15]) {
				this.anInt4751 = this.anIntArray344[local15];
			}
			if (this.anIntArray344[local15 + 1] < this.anInt4739) {
				this.anInt4739 = this.anIntArray344[local15 + 1];
			} else if (this.anInt4746 < this.anIntArray344[local15 + 1]) {
				this.anInt4746 = this.anIntArray344[local15 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!kca;B)Z")
	public boolean method4026(@OriginalArg(0) Interface9 arg0) {
		@Pc(20) int local20;
		if (this.anInt4748 == -1) {
			if (this.anInt4728 == -1) {
				return true;
			}
			local20 = arg0.method788(this.anInt4728);
		} else {
			local20 = arg0.method787(this.anInt4748);
		}
		if (local20 < this.anInt4740 || this.anInt4745 < local20) {
			return false;
		}
		@Pc(69) int local69;
		if (this.anInt4747 == -1) {
			if (this.anInt4729 == -1) {
				return true;
			}
			local69 = arg0.method788(this.anInt4729);
		} else {
			local69 = arg0.method787(this.anInt4747);
		}
		return local69 >= this.anInt4738 && this.anInt4727 >= local69;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLclient!daa;)V")
	public void method4027(@OriginalArg(1) Class12_Sub8 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5216();
			if (local11 == 0) {
				return;
			}
			this.method4018(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!qa;I)Lclient!ha;")
	public Class84 method4028(@OriginalArg(0) Class42 arg0) {
		@Pc(20) Class84 local20 = (Class84) this.aClass93_4.aClass125_12.method3446((long) (this.anInt4752 | 0x20000 | arg0.anInt6927 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass93_4.aClass16_30.method389(this.anInt4752);
		@Pc(48) Class40 local48 = Static550.method897(this.aClass93_4.aClass16_30, this.anInt4752, 0);
		if (local48 != null) {
			local20 = arg0.method5839(local48);
			this.aClass93_4.aClass125_12.method3437(local20, (long) (this.anInt4752 | 0x20000 | arg0.anInt6927 << 29));
		}
		return local20;
	}
}
