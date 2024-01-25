import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class366 {

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
	private int anInt9622;

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "Lclient!aw;")
	public Class25 aClass25_4;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
	private int anInt9627;

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
	public int anInt9631;

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
	private int anInt9633;

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "I")
	public int anInt9637;

	@OriginalMember(owner = "client!ww", name = "E", descriptor = "I")
	public int anInt9643;

	@OriginalMember(owner = "client!ww", name = "G", descriptor = "I")
	public int anInt9645;

	@OriginalMember(owner = "client!ww", name = "I", descriptor = "Lclient!il;")
	private Class162 aClass162_44;

	@OriginalMember(owner = "client!ww", name = "M", descriptor = "I")
	private int anInt9649;

	@OriginalMember(owner = "client!ww", name = "O", descriptor = "[I")
	public int[] anIntArray702;

	@OriginalMember(owner = "client!ww", name = "Q", descriptor = "I")
	public int anInt9652;

	@OriginalMember(owner = "client!ww", name = "R", descriptor = "I")
	public int anInt9653;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "Z")
	public boolean aBoolean735 = true;

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
	private int anInt9625 = -1;

	@OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
	public int anInt9632 = -1;

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
	private int anInt9630 = -1;

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
	public int anInt9620 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
	private int anInt9636 = -1;

	@OriginalMember(owner = "client!ww", name = "A", descriptor = "I")
	private int anInt9641 = -1;

	@OriginalMember(owner = "client!ww", name = "x", descriptor = "I")
	public int anInt9638 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
	public int anInt9621 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ww", name = "z", descriptor = "I")
	public int anInt9640 = -1;

	@OriginalMember(owner = "client!ww", name = "B", descriptor = "Z")
	public boolean aBoolean736 = true;

	@OriginalMember(owner = "client!ww", name = "J", descriptor = "Z")
	public boolean aBoolean737 = false;

	@OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
	public int anInt9648 = -1;

	@OriginalMember(owner = "client!ww", name = "H", descriptor = "I")
	private int anInt9646 = -1;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "Z")
	public boolean aBoolean734 = true;

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
	public int anInt9623 = 0;

	@OriginalMember(owner = "client!ww", name = "D", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray190 = new String[5];

	@OriginalMember(owner = "client!ww", name = "C", descriptor = "I")
	public int anInt9642 = -1;

	@OriginalMember(owner = "client!ww", name = "P", descriptor = "I")
	public int anInt9651 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!r;)Lclient!f;")
	public Class39 method7993(@OriginalArg(1) Class100 arg0) {
		@Pc(28) Class39 local28 = (Class39) this.aClass25_4.aClass313_6.method6989((long) (this.anInt9641 | 0x20000 | arg0.anInt7465 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass25_4.aClass259_17.method5988(this.anInt9641);
		@Pc(48) Class13 local48 = Static596.method247(this.aClass25_4.aClass259_17, this.anInt9641, 0);
		if (local48 != null) {
			local28 = arg0.method6256(local48, true);
			this.aClass25_4.aClass313_6.method6980((long) (arg0.anInt7465 << 29 | 0x20000 | this.anInt9641), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method7994(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass162_44 == null) {
			return arg0;
		} else {
			@Pc(22) Class2_Sub1 local22 = (Class2_Sub1) this.aClass162_44.method3519((long) arg1);
			return local22 == null ? arg0 : local22.aString1;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!haa;Z)Z")
	public boolean method7995(@OriginalArg(0) Interface9 arg0) {
		@Pc(23) int local23;
		if (this.anInt9630 == -1) {
			if (this.anInt9636 == -1) {
				return true;
			}
			local23 = arg0.method1459(this.anInt9636);
		} else {
			local23 = arg0.method1460(this.anInt9630);
		}
		if (this.anInt9622 > local23 || local23 > this.anInt9627) {
			return false;
		}
		@Pc(68) int local68;
		if (this.anInt9646 == -1) {
			if (this.anInt9625 == -1) {
				return true;
			}
			local68 = arg0.method1459(this.anInt9625);
		} else {
			local68 = arg0.method1460(this.anInt9646);
		}
		return local68 >= this.anInt9633 && this.anInt9649 >= local68;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!es;B)V")
	private void method7996(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt9648 = arg1.method4294();
		} else if (arg0 == 2) {
			this.anInt9632 = arg1.method4294();
		} else if (arg0 == 3) {
			this.aString101 = arg1.method4324();
		} else if (arg0 == 4) {
			this.anInt9643 = arg1.method4341();
		} else if (arg0 == 5) {
			this.anInt9640 = arg1.method4341();
		} else if (arg0 == 6) {
			this.anInt9623 = arg1.method4325();
		} else {
			@Pc(68) int local68;
			if (arg0 == 7) {
				local68 = arg1.method4325();
				if ((local68 & 0x2) == 2) {
					this.aBoolean737 = true;
				}
				if ((local68 & 0x1) == 0) {
					this.aBoolean734 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean736 = arg1.method4325() == 1;
			} else if (arg0 == 9) {
				this.anInt9636 = arg1.method4294();
				if (this.anInt9636 == 65535) {
					this.anInt9636 = -1;
				}
				this.anInt9630 = arg1.method4294();
				if (this.anInt9630 == 65535) {
					this.anInt9630 = -1;
				}
				this.anInt9622 = arg1.method4307();
				this.anInt9627 = arg1.method4307();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray190[arg0 - 10] = arg1.method4324();
			} else {
				@Pc(146) int local146;
				if (arg0 == 15) {
					local68 = arg1.method4325();
					this.anIntArray702 = new int[local68 * 2];
					for (local146 = 0; local146 < local68 * 2; local146++) {
						this.anIntArray702[local146] = arg1.method4334();
					}
					this.anInt9653 = arg1.method4307();
					this.anInt9652 = arg1.method4307();
				} else if (arg0 == 16) {
					this.aBoolean735 = false;
				} else if (arg0 == 17) {
					this.aString100 = arg1.method4324();
				} else if (arg0 == 18) {
					this.anInt9641 = arg1.method4294();
				} else if (arg0 == 19) {
					this.anInt9642 = arg1.method4294();
				} else if (arg0 == 20) {
					this.anInt9625 = arg1.method4294();
					if (this.anInt9625 == 65535) {
						this.anInt9625 = -1;
					}
					this.anInt9646 = arg1.method4294();
					if (this.anInt9646 == 65535) {
						this.anInt9646 = -1;
					}
					this.anInt9633 = arg1.method4307();
					this.anInt9649 = arg1.method4307();
				} else if (arg0 == 21) {
					this.anInt9637 = arg1.method4307();
				} else if (arg0 == 22) {
					this.anInt9631 = arg1.method4307();
				} else if (arg0 == 249) {
					local68 = arg1.method4325();
					if (this.aClass162_44 == null) {
						local146 = Static89.method7259(local68);
						this.aClass162_44 = new Class162(local146);
					}
					for (local146 = 0; local146 < local68; local146++) {
						@Pc(303) boolean local303 = arg1.method4325() == 1;
						@Pc(307) int local307 = arg1.method4341();
						@Pc(316) Class2 local316;
						if (local303) {
							local316 = new Class2_Sub1(arg1.method4324());
						} else {
							local316 = new Class2_Sub22(arg1.method4307());
						}
						this.aClass162_44.method3522(local316, (long) local307);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!r;Z)Lclient!f;")
	public Class39 method7997(@OriginalArg(1) Class100 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg1 ? this.anInt9632 : this.anInt9648;
		@Pc(24) int local24 = arg0.anInt7465 << 29 | local17;
		@Pc(33) Class39 local33 = (Class39) this.aClass25_4.aClass313_6.method6989((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass25_4.aClass259_17.method5988(local17)) {
			@Pc(53) Class13 local53 = Static596.method247(this.aClass25_4.aClass259_17, local17, 0);
			if (local53 != null) {
				local33 = arg0.method6256(local53, true);
				this.aClass25_4.aClass313_6.method6980((long) local24, local33);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!es;)V")
	public void method7998(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4325();
			if (local17 == 0) {
				return;
			}
			this.method7996(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
	public void method7999() {
		if (this.anIntArray702 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray702.length; local6 += 2) {
			if (this.anIntArray702[local6] < this.anInt9651) {
				this.anInt9651 = this.anIntArray702[local6];
			} else if (this.anInt9638 < this.anIntArray702[local6]) {
				this.anInt9638 = this.anIntArray702[local6];
			}
			if (this.anIntArray702[local6 + 1] < this.anInt9621) {
				this.anInt9621 = this.anIntArray702[local6 + 1];
			} else if (this.anIntArray702[local6 + 1] > this.anInt9620) {
				this.anInt9620 = this.anIntArray702[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BII)I")
	public int method8001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass162_44 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub22 local21 = (Class2_Sub22) this.aClass162_44.method3519((long) arg0);
			return local21 == null ? arg1 : local21.anInt3866;
		}
	}
}
