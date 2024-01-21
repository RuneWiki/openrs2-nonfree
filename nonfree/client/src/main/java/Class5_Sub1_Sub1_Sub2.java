import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SFAIBATY")
public final class Class5_Sub1_Sub1_Sub2 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!SFAIBATY", name = "x", descriptor = "I")
	private int anInt620 = -166;

	@OriginalMember(owner = "client!SFAIBATY", name = "y", descriptor = "I")
	private int anInt621 = 6;

	@OriginalMember(owner = "client!SFAIBATY", name = "z", descriptor = "I")
	private int anInt622 = -3665;

	@OriginalMember(owner = "client!SFAIBATY", name = "A", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!SFAIBATY", name = "B", descriptor = "I")
	private int anInt623 = -71;

	@OriginalMember(owner = "client!SFAIBATY", name = "C", descriptor = "I")
	private int anInt624 = 2;

	@OriginalMember(owner = "client!SFAIBATY", name = "D", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!SFAIBATY", name = "E", descriptor = "I")
	private int anInt625 = -35541;

	@OriginalMember(owner = "client!SFAIBATY", name = "L", descriptor = "I")
	public int anInt630;

	@OriginalMember(owner = "client!SFAIBATY", name = "M", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!SFAIBATY", name = "G", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!SFAIBATY", name = "J", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!SFAIBATY", name = "K", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!SFAIBATY", name = "H", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!SFAIBATY", name = "I", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!SFAIBATY", name = "F", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!SFAIBATY", name = "<init>", descriptor = "(Lclient!TXPLZUUI;Ljava/lang/String;I)V")
	public Class5_Sub1_Sub1_Sub2(@OriginalArg(0) Class40 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(43) Class5_Sub1_Sub4 local43 = new Class5_Sub1_Sub4(arg0.method464(arg1 + ".dat", null), 0);
		@Pc(52) Class5_Sub1_Sub4 local52 = new Class5_Sub1_Sub4(arg0.method464("index.dat", null), 0);
		local52.anInt429 = local43.method242();
		this.anInt630 = local52.method242();
		this.anInt631 = local52.method242();
		@Pc(67) int local67 = local52.method240();
		this.anIntArray168 = new int[local67];
		for (@Pc(73) int local73 = 0; local73 < local67 - 1; local73++) {
			this.anIntArray168[local73 + 1] = local52.method244();
		}
		for (@Pc(97) int local97 = 0; local97 < arg2; local97++) {
			local52.anInt429 += 2;
			local43.anInt429 += local52.method242() * local52.method242();
			local52.anInt429++;
		}
		this.anInt628 = local52.method240();
		this.anInt629 = local52.method240();
		this.anInt626 = local52.method242();
		this.anInt627 = local52.method242();
		@Pc(144) int local144 = local52.method240();
		@Pc(150) int local150 = this.anInt626 * this.anInt627;
		this.aByteArray17 = new byte[local150];
		@Pc(158) int local158;
		if (local144 == 0) {
			for (local158 = 0; local158 < local150; local158++) {
				this.aByteArray17[local158] = local43.method241();
			}
		} else if (local144 == 1) {
			for (local158 = 0; local158 < this.anInt626; local158++) {
				for (@Pc(180) int local180 = 0; local180 < this.anInt627; local180++) {
					this.aByteArray17[local158 + local180 * this.anInt626] = local43.method241();
				}
			}
		}
	}

	@OriginalMember(owner = "client!SFAIBATY", name = "c", descriptor = "(I)V")
	public void method412() {
		try {
			this.anInt630 /= 2;
			this.anInt631 /= 2;
			@Pc(31) byte[] local31 = new byte[this.anInt630 * this.anInt631];
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = 0; local35 < this.anInt627; local35++) {
				for (@Pc(39) int local39 = 0; local39 < this.anInt626; local39++) {
					local31[(local39 + this.anInt628 >> 1) + (local35 + this.anInt629 >> 1) * this.anInt630] = this.aByteArray17[local33++];
				}
			}
			this.aByteArray17 = local31;
			this.anInt626 = this.anInt630;
			this.anInt627 = this.anInt631;
			this.anInt628 = 0;
			this.anInt629 = 0;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("75137, " + 0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFAIBATY", name = "a", descriptor = "(Z)V")
	public void method413() {
		try {
			if (this.anInt626 != this.anInt630 || this.anInt627 != this.anInt631) {
				@Pc(22) byte[] local22 = new byte[this.anInt630 * this.anInt631];
				@Pc(24) int local24 = 0;
				for (@Pc(26) int local26 = 0; local26 < this.anInt627; local26++) {
					for (@Pc(30) int local30 = 0; local30 < this.anInt626; local30++) {
						local22[local30 + this.anInt628 + (local26 + this.anInt629) * this.anInt630] = this.aByteArray17[local24++];
					}
				}
				this.aByteArray17 = local22;
				this.anInt626 = this.anInt630;
				this.anInt627 = this.anInt631;
				this.anInt628 = 0;
				this.anInt629 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("46272, " + false + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFAIBATY", name = "d", descriptor = "(I)V")
	public void method414() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt626 * this.anInt627];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt627; local12++) {
				for (@Pc(19) int local19 = this.anInt626 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray17[local19 + local12 * this.anInt626];
				}
			}
			if (this.anInt622 != -3665) {
				this.anInt620 = 396;
			}
			this.aByteArray17 = local8;
			this.anInt628 = this.anInt630 - this.anInt626 - this.anInt628;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("71000, " + -3665 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFAIBATY", name = "b", descriptor = "(Z)V")
	public void method415() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt626 * this.anInt627];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt627 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt626; local19++) {
					local8[local10++] = this.aByteArray17[local19 + local15 * this.anInt626];
				}
			}
			this.aByteArray17 = local8;
			this.anInt629 = this.anInt631 - this.anInt627 - this.anInt629;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("79821, " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFAIBATY", name = "a", descriptor = "(ZIII)V")
	public void method416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray168.length; local3++) {
				@Pc(14) int local14 = this.anIntArray168[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray168[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray168[local3] & 0xFF;
				local60 += arg2;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray168[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("51606, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFAIBATY", name = "a", descriptor = "(III)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt628;
			arg1 += this.anInt629;
			@Pc(19) int local19 = arg0 + arg1 * Class5_Sub1_Sub1.anInt773;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt627;
			@Pc(27) int local27 = this.anInt626;
			@Pc(31) int local31 = Class5_Sub1_Sub1.anInt773 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class5_Sub1_Sub1.anInt775) {
				local40 = Class5_Sub1_Sub1.anInt775 - arg1;
				local24 -= local40;
				arg1 = Class5_Sub1_Sub1.anInt775;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class5_Sub1_Sub1.anInt773;
			}
			if (arg1 + local24 > Class5_Sub1_Sub1.anInt776) {
				local24 -= arg1 + local24 - Class5_Sub1_Sub1.anInt776;
			}
			if (arg0 < Class5_Sub1_Sub1.anInt777) {
				local40 = Class5_Sub1_Sub1.anInt777 - arg0;
				local27 -= local40;
				arg0 = Class5_Sub1_Sub1.anInt777;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class5_Sub1_Sub1.anInt778) {
				local40 = arg0 + local27 - Class5_Sub1_Sub1.anInt778;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method418(Class5_Sub1_Sub1.anIntArray201, this.anIntArray168, this.aByteArray17, local31, local19, local27, local33, local21, local24);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("90979, " + arg0 + ", " + arg1 + ", " + 30573 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SFAIBATY", name = "a", descriptor = "([I[I[BBIIIIII)V")
	private void method418(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(18) int local18 = -arg8; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					@Pc(29) byte local29 = arg2[arg7++];
					if (local29 == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg1[local29 & 0xFF];
					}
					local29 = arg2[arg7++];
					if (local29 == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg1[local29 & 0xFF];
					}
					local29 = arg2[arg7++];
					if (local29 == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg1[local29 & 0xFF];
					}
					local29 = arg2[arg7++];
					if (local29 == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg1[local29 & 0xFF];
					}
				}
				for (@Pc(105) int local105 = local11; local105 < 0; local105++) {
					@Pc(112) byte local112 = arg2[arg7++];
					if (local112 == 0) {
						arg4++;
					} else {
						arg0[arg4++] = arg1[local112 & 0xFF];
					}
				}
				arg4 += arg3;
				arg7 += arg6;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("54964, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 29 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
