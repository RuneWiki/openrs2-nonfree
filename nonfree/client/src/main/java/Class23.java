import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class23 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "I")
	public int anInt289;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "I")
	public int anInt291;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "I")
	public int anInt305;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!be", name = "A", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!be", name = "H", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!be", name = "L", descriptor = "I")
	public int anInt314;

	@OriginalMember(owner = "client!be", name = "M", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!be", name = "N", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	private int anInt287 = -1;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	private int anInt300 = -1;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	private int anInt307 = -1;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "I")
	public int anInt306 = -1;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "I")
	public int anInt292 = -1;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	private int anInt294 = -1;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public int anInt297 = -1;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
	public boolean aBoolean16 = true;

	@OriginalMember(owner = "client!be", name = "B", descriptor = "Z")
	public boolean aBoolean17 = true;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "I")
	public int anInt308 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	public int anInt298 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public int anInt299 = 0;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	public int anInt303 = -1;

	@OriginalMember(owner = "client!be", name = "I", descriptor = "I")
	public int anInt312 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	private int anInt304 = -1;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "Z")
	public boolean aBoolean18 = true;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "I")
	public int anInt317 = Integer.MAX_VALUE;

	static {
		new Class117("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!kh;)V")
	public void method242(@OriginalArg(1) Class11_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5185();
			if (local5 == 0) {
				return;
			}
			this.method243(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BILclient!kh;)V")
	private void method243(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt303 = arg1.method5187();
		} else if (arg0 == 2) {
			this.anInt292 = arg1.method5187();
		} else if (arg0 == 3) {
			this.aString7 = arg1.method5184();
		} else if (arg0 == 4) {
			this.anInt305 = arg1.method5221();
		} else if (arg0 == 5) {
			this.anInt306 = arg1.method5221();
		} else if (arg0 == 6) {
			this.anInt299 = arg1.method5185();
		} else {
			@Pc(43) int local43;
			if (arg0 == 7) {
				local43 = arg1.method5185();
				if ((local43 & 0x2) == 2) {
					this.aBoolean15 = true;
				}
				if ((local43 & 0x1) == 0) {
					this.aBoolean16 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean17 = arg1.method5185() == 1;
			} else if (arg0 == 9) {
				this.anInt304 = arg1.method5187();
				if (this.anInt304 == 65535) {
					this.anInt304 = -1;
				}
				this.anInt294 = arg1.method5187();
				if (this.anInt294 == 65535) {
					this.anInt294 = -1;
				}
				this.anInt311 = arg1.method5198();
				this.anInt310 = arg1.method5198();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray1[arg0 - 10] = arg1.method5184();
			} else if (arg0 == 15) {
				local43 = arg1.method5185();
				this.anIntArray19 = new int[local43 * 2];
				for (@Pc(144) int local144 = 0; local144 < local43 * 2; local144++) {
					this.anIntArray19[local144] = arg1.method5220();
				}
				this.anInt291 = arg1.method5198();
				this.anInt314 = arg1.method5198();
			} else if (arg0 == 16) {
				this.aBoolean18 = false;
			} else if (arg0 == 17) {
				this.aString6 = arg1.method5184();
			} else if (arg0 == 18) {
				this.anInt300 = arg1.method5187();
			} else if (arg0 == 19) {
				this.anInt297 = arg1.method5187();
			} else if (arg0 == 20) {
				this.anInt307 = arg1.method5187();
				if (this.anInt307 == 65535) {
					this.anInt307 = -1;
				}
				this.anInt287 = arg1.method5187();
				if (this.anInt287 == 65535) {
					this.anInt287 = -1;
				}
				this.anInt309 = arg1.method5198();
				this.anInt316 = arg1.method5198();
			} else if (arg0 == 21) {
				this.anInt315 = arg1.method5198();
			} else if (arg0 == 22) {
				this.anInt295 = arg1.method5198();
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!uo;B)Lclient!sg;")
	public Class97 method244(@OriginalArg(0) Class129 arg0) {
		@Pc(18) Class97 local18 = (Class97) Static310.aClass26_55.method332((long) (arg0.anInt5876 << 29 | 0x20000 | this.anInt300));
		if (local18 != null) {
			return local18;
		}
		Static39.aClass144_16.method3910(this.anInt300);
		@Pc(34) Class125 local34 = Static368.method2857(Static39.aClass144_16, this.anInt300, 0);
		if (local34 != null) {
			local18 = arg0.method5018(local34);
			Static310.aClass26_55.method330((long) (this.anInt300 | 0x20000 | arg0.anInt5876 << 29), local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZLclient!uo;)Lclient!sg;")
	public Class97 method247(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class129 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt292 : this.anInt303;
		@Pc(18) int local18 = local11 | arg1.anInt5876 << 29;
		@Pc(25) Class97 local25 = (Class97) Static310.aClass26_55.method332((long) local18);
		if (local25 != null) {
			return local25;
		} else if (Static39.aClass144_16.method3910(local11)) {
			@Pc(41) Class125 local41 = Static368.method2857(Static39.aClass144_16, local11, 0);
			if (local41 != null) {
				local25 = arg1.method5018(local41);
				Static310.aClass26_55.method330((long) local18, local25);
			}
			return local25;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public void method249() {
		if (this.anIntArray19 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray19.length; local15 += 2) {
			if (this.anInt298 > this.anIntArray19[local15]) {
				this.anInt298 = this.anIntArray19[local15];
			} else if (this.anInt312 < this.anIntArray19[local15]) {
				this.anInt312 = this.anIntArray19[local15];
			}
			if (this.anIntArray19[local15 + 1] < this.anInt317) {
				this.anInt317 = this.anIntArray19[local15 + 1];
			} else if (this.anInt308 < this.anIntArray19[local15 + 1]) {
				this.anInt308 = this.anIntArray19[local15 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Z")
	public boolean method250() {
		if (this.anInt294 == -1 && this.anInt304 == -1) {
			return true;
		}
		@Pc(36) int local36;
		if (this.anInt294 == -1) {
			local36 = Static239.method4231(this.anInt304);
		} else {
			local36 = Static198.anIntArray311[this.anInt294];
		}
		if (local36 < this.anInt311 || local36 > this.anInt310) {
			return false;
		} else if (this.anInt287 == -1 && this.anInt307 == -1) {
			return true;
		} else {
			if (this.anInt287 == -1) {
				local36 = Static239.method4231(this.anInt307);
			} else {
				local36 = Static198.anIntArray311[this.anInt287];
			}
			return this.anInt309 <= local36 && this.anInt316 >= local36;
		}
	}
}
