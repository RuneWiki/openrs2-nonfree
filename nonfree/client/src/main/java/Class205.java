import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class205 {

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
	public int anInt5742;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!qh;")
	private Class199 aClass199_154;

	@OriginalMember(owner = "client!qr", name = "o", descriptor = "Lclient!ok;")
	public Class178 aClass178_3;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public int anInt5748;

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
	public int anInt5753;

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
	private int anInt5754;

	@OriginalMember(owner = "client!qr", name = "A", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!qr", name = "F", descriptor = "I")
	public int anInt5758;

	@OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
	public int anInt5759;

	@OriginalMember(owner = "client!qr", name = "M", descriptor = "I")
	public int anInt5763;

	@OriginalMember(owner = "client!qr", name = "P", descriptor = "[I")
	public int[] anIntArray394;

	@OriginalMember(owner = "client!qr", name = "T", descriptor = "I")
	private int anInt5768;

	@OriginalMember(owner = "client!qr", name = "U", descriptor = "I")
	private int anInt5769;

	@OriginalMember(owner = "client!qr", name = "Z", descriptor = "I")
	private int anInt5772;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
	public int anInt5747 = -1;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "Z")
	public boolean aBoolean655 = true;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
	private int anInt5744 = -1;

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
	private int anInt5755 = -1;

	@OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
	public int anInt5760 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qr", name = "N", descriptor = "I")
	public int anInt5764 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qr", name = "O", descriptor = "I")
	public int anInt5765 = -1;

	@OriginalMember(owner = "client!qr", name = "L", descriptor = "I")
	private int anInt5762 = -1;

	@OriginalMember(owner = "client!qr", name = "B", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray38 = new String[5];

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
	public int anInt5745 = 0;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	public int anInt5737 = -1;

	@OriginalMember(owner = "client!qr", name = "Q", descriptor = "I")
	public int anInt5766 = -1;

	@OriginalMember(owner = "client!qr", name = "W", descriptor = "I")
	private int anInt5770 = -1;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	public int anInt5741 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "Z")
	public boolean aBoolean653 = true;

	@OriginalMember(owner = "client!qr", name = "X", descriptor = "Z")
	public boolean aBoolean657 = false;

	@OriginalMember(owner = "client!qr", name = "R", descriptor = "Z")
	public boolean aBoolean656 = true;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	private int anInt5746 = -1;

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "I")
	public int anInt5767 = Integer.MIN_VALUE;

	static {
		new Class119("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
	public String method4515(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass199_154 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub33 local16 = (Class1_Sub33) this.aClass199_154.method4387((long) arg0);
			return local16 == null ? arg1 : local16.aString60;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!ro;B)Z")
	public boolean method4516(@OriginalArg(0) Interface9 arg0) {
		@Pc(23) int local23;
		if (this.anInt5762 == -1) {
			if (this.anInt5770 == -1) {
				return true;
			}
			local23 = arg0.method5594(this.anInt5770);
		} else {
			local23 = arg0.method5593(this.anInt5762);
		}
		if (this.anInt5769 > local23 || local23 > this.anInt5772) {
			return false;
		}
		@Pc(67) int local67;
		if (this.anInt5746 == -1) {
			if (this.anInt5755 == -1) {
				return true;
			}
			local67 = arg0.method5594(this.anInt5755);
		} else {
			local67 = arg0.method5593(this.anInt5746);
		}
		return this.anInt5768 <= local67 && this.anInt5754 >= local67;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public void method4517() {
		if (this.anIntArray394 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray394.length; local12 += 2) {
			if (this.anIntArray394[local12] < this.anInt5760) {
				this.anInt5760 = this.anIntArray394[local12];
			} else if (this.anIntArray394[local12] > this.anInt5741) {
				this.anInt5741 = this.anIntArray394[local12];
			}
			if (this.anInt5764 > this.anIntArray394[local12 + 1]) {
				this.anInt5764 = this.anIntArray394[local12 + 1];
			} else if (this.anIntArray394[local12 + 1] > this.anInt5767) {
				this.anInt5767 = this.anIntArray394[local12 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLclient!ug;)V")
	public void method4520(@OriginalArg(1) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method4525(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)I")
	public int method4521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass199_154 == null) {
			return arg0;
		} else {
			@Pc(22) Class1_Sub26 local22 = (Class1_Sub26) this.aClass199_154.method4387((long) arg1);
			return local22 == null ? arg0 : local22.anInt3459;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZLclient!za;)Lclient!o;")
	public Class6 method4522(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt5766 : this.anInt5765;
		@Pc(18) int local18 = local11 | arg1.anInt7333 << 29;
		@Pc(29) Class6 local29 = (Class6) this.aClass178_3.aClass102_38.method2258((long) local18);
		if (local29 != null) {
			return local29;
		} else if (this.aClass178_3.aClass82_70.method1820(local11)) {
			@Pc(51) Class72 local51 = Static460.method1572(this.aClass178_3.aClass82_70, local11, 0);
			if (local51 != null) {
				local29 = arg1.method5756(local51);
				this.aClass178_3.aClass102_38.method2272((long) local18, local29);
			}
			return local29;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZLclient!ug;)V")
	private void method4525(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub28 arg1) {
		if (arg0 == 1) {
			this.anInt5765 = arg1.method5335();
		} else if (arg0 == 2) {
			this.anInt5766 = arg1.method5335();
		} else if (arg0 == 3) {
			this.aString65 = arg1.method5381();
		} else if (arg0 == 4) {
			this.anInt5753 = arg1.method5345();
		} else if (arg0 == 5) {
			this.anInt5737 = arg1.method5345();
		} else if (arg0 == 6) {
			this.anInt5745 = arg1.method5337();
		} else {
			@Pc(41) int local41;
			if (arg0 == 7) {
				local41 = arg1.method5337();
				if ((local41 & 0x1) == 0) {
					this.aBoolean653 = false;
				}
				if ((local41 & 0x2) == 2) {
					this.aBoolean657 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean656 = arg1.method5337() == 1;
			} else if (arg0 == 9) {
				this.anInt5770 = arg1.method5335();
				if (this.anInt5770 == 65535) {
					this.anInt5770 = -1;
				}
				this.anInt5762 = arg1.method5335();
				if (this.anInt5762 == 65535) {
					this.anInt5762 = -1;
				}
				this.anInt5769 = arg1.method5355();
				this.anInt5772 = arg1.method5355();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray38[arg0 - 10] = arg1.method5381();
			} else {
				@Pc(178) int local178;
				if (arg0 == 15) {
					local41 = arg1.method5337();
					this.anIntArray394 = new int[local41 * 2];
					for (local178 = 0; local178 < local41 * 2; local178++) {
						this.anIntArray394[local178] = arg1.method5382();
					}
					this.anInt5758 = arg1.method5355();
					this.anInt5748 = arg1.method5355();
				} else if (arg0 == 16) {
					this.aBoolean655 = false;
				} else if (arg0 == 17) {
					this.aString66 = arg1.method5381();
				} else if (arg0 == 18) {
					this.anInt5744 = arg1.method5335();
				} else if (arg0 == 19) {
					this.anInt5747 = arg1.method5335();
				} else if (arg0 == 20) {
					this.anInt5755 = arg1.method5335();
					if (this.anInt5755 == 65535) {
						this.anInt5755 = -1;
					}
					this.anInt5746 = arg1.method5335();
					if (this.anInt5746 == 65535) {
						this.anInt5746 = -1;
					}
					this.anInt5768 = arg1.method5355();
					this.anInt5754 = arg1.method5355();
				} else if (arg0 == 21) {
					this.anInt5763 = arg1.method5355();
				} else if (arg0 == 22) {
					this.anInt5759 = arg1.method5355();
				} else if (arg0 == 249) {
					local41 = arg1.method5337();
					if (this.aClass199_154 == null) {
						local178 = Static191.method2740(local41);
						this.aClass199_154 = new Class199(local178);
					}
					for (local178 = 0; local178 < local41; local178++) {
						@Pc(199) boolean local199 = arg1.method5337() == 1;
						@Pc(203) int local203 = arg1.method5345();
						@Pc(212) Class1 local212;
						if (local199) {
							local212 = new Class1_Sub33(arg1.method5381());
						} else {
							local212 = new Class1_Sub26(arg1.method5355());
						}
						this.aClass199_154.method4383((long) local203, local212);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!za;B)Lclient!o;")
	public Class6 method4526(@OriginalArg(0) Class34 arg0) {
		@Pc(28) Class6 local28 = (Class6) this.aClass178_3.aClass102_38.method2258((long) (arg0.anInt7333 << 29 | this.anInt5744 | 0x20000));
		if (local28 != null) {
			return local28;
		}
		this.aClass178_3.aClass82_70.method1820(this.anInt5744);
		@Pc(48) Class72 local48 = Static460.method1572(this.aClass178_3.aClass82_70, this.anInt5744, 0);
		if (local48 != null) {
			local28 = arg0.method5756(local48);
			this.aClass178_3.aClass102_38.method2272((long) (this.anInt5744 | 0x20000 | arg0.anInt7333 << 29), local28);
		}
		return local28;
	}
}
