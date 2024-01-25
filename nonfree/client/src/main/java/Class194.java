import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class194 {

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	public int anInt5816;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "I")
	private int anInt5817;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!dq;")
	private Class38 aClass38_31;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "[I")
	public int[] anIntArray452;

	@OriginalMember(owner = "client!td", name = "t", descriptor = "I")
	private int anInt5824;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "I")
	private int anInt5825;

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	public int anInt5827;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "I")
	private int anInt5829;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "I")
	public int anInt5835;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "I")
	public int anInt5838;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "I")
	public int anInt5841;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "I")
	public int anInt5843;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Z")
	public boolean aBoolean435 = true;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	public int anInt5818 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	private int anInt5822 = -1;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "I")
	public int anInt5823 = -1;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	private int anInt5826 = -1;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
	public boolean aBoolean436 = false;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	public int anInt5836 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	private int anInt5813 = -1;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray38 = new String[5];

	@OriginalMember(owner = "client!td", name = "B", descriptor = "I")
	public int anInt5831 = -1;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	private int anInt5830 = -1;

	@OriginalMember(owner = "client!td", name = "M", descriptor = "Z")
	public boolean aBoolean438 = true;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Z")
	public boolean aBoolean437 = true;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "I")
	public int anInt5839 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "I")
	public int anInt5845 = -1;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	public int anInt5814 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	private int anInt5842 = -1;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "I")
	public int anInt5834 = 0;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "I")
	public int anInt5848 = -1;

	static {
		new Class106("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!at;I)V")
	public void method5258(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2132();
			if (local13 == 0) {
				return;
			}
			this.method5267(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public void method5260() {
		if (this.anIntArray452 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray452.length; local10 += 2) {
			if (this.anIntArray452[local10] < this.anInt5818) {
				this.anInt5818 = this.anIntArray452[local10];
			} else if (this.anIntArray452[local10] > this.anInt5839) {
				this.anInt5839 = this.anIntArray452[local10];
			}
			if (this.anInt5814 > this.anIntArray452[local10 + 1]) {
				this.anInt5814 = this.anIntArray452[local10 + 1];
			} else if (this.anInt5836 < this.anIntArray452[local10 + 1]) {
				this.anInt5836 = this.anIntArray452[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZBLclient!fp;)Lclient!ae;")
	public Class4 method5262(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt5831 : this.anInt5823;
		@Pc(18) int local18 = arg1.anInt5007 << 29 | local11;
		@Pc(25) Class4 local25 = (Class4) Static336.aClass21_169.method854((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static331.aClass30_94.method1154(local11)) {
			@Pc(49) Class201 local49 = Static382.method5432(Static331.aClass30_94, local11, 0);
			if (local49 != null) {
				local25 = arg1.method4589(local49);
				Static336.aClass21_169.method843(local25, (long) local18);
			}
			return local25;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)I")
	public int method5264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass38_31 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub9 local16 = (Class1_Sub9) this.aClass38_31.method1475((long) arg1);
			return local16 == null ? arg0 : local16.anInt571;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fp;B)Lclient!ae;")
	public Class4 method5265(@OriginalArg(0) Class63 arg0) {
		@Pc(23) Class4 local23 = (Class4) Static336.aClass21_169.method854((long) (arg0.anInt5007 << 29 | this.anInt5830 | 0x20000));
		if (local23 != null) {
			return local23;
		}
		Static331.aClass30_94.method1154(this.anInt5830);
		@Pc(39) Class201 local39 = Static382.method5432(Static331.aClass30_94, this.anInt5830, 0);
		if (local39 != null) {
			local23 = arg0.method4589(local39);
			Static336.aClass21_169.method843(local23, (long) (this.anInt5830 | 0x20000 | arg0.anInt5007 << 29));
		}
		return local23;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!at;IB)V")
	private void method5267(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5823 = arg0.method2161();
		} else if (arg1 == 2) {
			this.anInt5831 = arg0.method2161();
		} else if (arg1 == 3) {
			this.aString51 = arg0.method2109();
		} else if (arg1 == 4) {
			this.anInt5843 = arg0.method2119();
		} else if (arg1 == 5) {
			this.anInt5845 = arg0.method2119();
		} else if (arg1 == 6) {
			this.anInt5834 = arg0.method2132();
		} else {
			@Pc(197) int local197;
			if (arg1 == 7) {
				local197 = arg0.method2132();
				if ((local197 & 0x2) == 2) {
					this.aBoolean436 = true;
				}
				if ((local197 & 0x1) == 0) {
					this.aBoolean438 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean437 = arg0.method2132() == 1;
			} else if (arg1 == 9) {
				this.anInt5842 = arg0.method2161();
				if (this.anInt5842 == 65535) {
					this.anInt5842 = -1;
				}
				this.anInt5826 = arg0.method2161();
				if (this.anInt5826 == 65535) {
					this.anInt5826 = -1;
				}
				this.anInt5824 = arg0.method2140();
				this.anInt5829 = arg0.method2140();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray38[arg1 - 10] = arg0.method2109();
			} else {
				@Pc(204) int local204;
				if (arg1 == 15) {
					local197 = arg0.method2132();
					this.anIntArray452 = new int[local197 * 2];
					for (local204 = 0; local204 < local197 * 2; local204++) {
						this.anIntArray452[local204] = arg0.method2141();
					}
					this.anInt5841 = arg0.method2140();
					this.anInt5816 = arg0.method2140();
				} else if (arg1 == 16) {
					this.aBoolean435 = false;
				} else if (arg1 == 17) {
					this.aString52 = arg0.method2109();
				} else if (arg1 == 18) {
					this.anInt5830 = arg0.method2161();
				} else if (arg1 == 19) {
					this.anInt5848 = arg0.method2161();
				} else if (arg1 == 20) {
					this.anInt5822 = arg0.method2161();
					if (this.anInt5822 == 65535) {
						this.anInt5822 = -1;
					}
					this.anInt5813 = arg0.method2161();
					if (this.anInt5813 == 65535) {
						this.anInt5813 = -1;
					}
					this.anInt5825 = arg0.method2140();
					this.anInt5817 = arg0.method2140();
				} else if (arg1 == 21) {
					this.anInt5838 = arg0.method2140();
				} else if (arg1 == 22) {
					this.anInt5835 = arg0.method2140();
				} else if (arg1 == 249) {
					local197 = arg0.method2132();
					if (this.aClass38_31 == null) {
						local204 = Static73.method1617(local197);
						this.aClass38_31 = new Class38(local204);
					}
					for (local204 = 0; local204 < local197; local204++) {
						@Pc(225) boolean local225 = arg0.method2132() == 1;
						@Pc(229) int local229 = arg0.method2119();
						@Pc(238) Class1 local238;
						if (local225) {
							local238 = new Class1_Sub38(arg0.method2109());
						} else {
							local238 = new Class1_Sub9(arg0.method2140());
						}
						this.aClass38_31.method1472(local238, (long) local229);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Z")
	public boolean method5269() {
		if (this.anInt5826 == -1 && this.anInt5842 == -1) {
			return true;
		}
		@Pc(35) int local35;
		if (this.anInt5826 == -1) {
			local35 = Static56.method1385(this.anInt5842);
		} else {
			local35 = Static87.anIntArray147[this.anInt5826];
		}
		if (local35 < this.anInt5824 || this.anInt5829 < local35) {
			return false;
		} else if (this.anInt5813 == -1 && this.anInt5822 == -1) {
			return true;
		} else {
			if (this.anInt5813 == -1) {
				local35 = Static56.method1385(this.anInt5822);
			} else {
				local35 = Static87.anIntArray147[this.anInt5813];
			}
			return this.anInt5825 <= local35 && this.anInt5817 >= local35;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method5270(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass38_31 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub38 local21 = (Class1_Sub38) this.aClass38_31.method1475((long) arg1);
			return local21 == null ? arg0 : local21.aString56;
		}
	}
}
