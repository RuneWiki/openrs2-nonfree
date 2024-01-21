import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RZWMPYWU")
public final class Class3_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!RZWMPYWU", name = "w", descriptor = "I")
	private int anInt558 = 7;

	@OriginalMember(owner = "client!RZWMPYWU", name = "x", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!RZWMPYWU", name = "E", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!RZWMPYWU", name = "F", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!RZWMPYWU", name = "z", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!RZWMPYWU", name = "C", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!RZWMPYWU", name = "D", descriptor = "I")
	public int anInt562;

	@OriginalMember(owner = "client!RZWMPYWU", name = "A", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!RZWMPYWU", name = "B", descriptor = "I")
	public int anInt560;

	@OriginalMember(owner = "client!RZWMPYWU", name = "y", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!RZWMPYWU", name = "<init>", descriptor = "(Lclient!INOFEYKQ;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub2_Sub2(@OriginalArg(0) Class14 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class3_Sub1_Sub3 local25 = new Class3_Sub1_Sub3((byte) -103, arg0.method202(arg1 + ".dat", (byte[]) null));
		@Pc(34) Class3_Sub1_Sub3 local34 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("index.dat", (byte[]) null));
		local34.anInt441 = local25.method276();
		this.anInt563 = local34.method276();
		this.anInt564 = local34.method276();
		@Pc(49) int local49 = local34.method274();
		this.anIntArray159 = new int[local49];
		for (@Pc(55) int local55 = 0; local55 < local49 - 1; local55++) {
			this.anIntArray159[local55 + 1] = local34.method278();
		}
		for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
			local34.anInt441 += 2;
			local25.anInt441 += local34.method276() * local34.method276();
			local34.anInt441++;
		}
		this.anInt561 = local34.method274();
		this.anInt562 = local34.method274();
		this.anInt559 = local34.method276();
		this.anInt560 = local34.method276();
		@Pc(120) int local120 = local34.method274();
		@Pc(126) int local126 = this.anInt559 * this.anInt560;
		this.aByteArray13 = new byte[local126];
		@Pc(134) int local134;
		if (local120 == 0) {
			for (local134 = 0; local134 < local126; local134++) {
				this.aByteArray13[local134] = local25.method275();
			}
		} else if (local120 == 1) {
			for (local134 = 0; local134 < this.anInt559; local134++) {
				for (@Pc(156) int local156 = 0; local156 < this.anInt560; local156++) {
					this.aByteArray13[local134 + local156 * this.anInt559] = local25.method275();
				}
			}
		}
	}

	@OriginalMember(owner = "client!RZWMPYWU", name = "a", descriptor = "(B)V")
	public void method368() {
		try {
			this.anInt563 /= 2;
			this.anInt564 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt563 * this.anInt564];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt560; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt559; local28++) {
					local20[(local28 + this.anInt561 >> 1) + (local24 + this.anInt562 >> 1) * this.anInt563] = this.aByteArray13[local22++];
				}
			}
			this.aByteArray13 = local20;
			this.anInt559 = this.anInt563;
			this.anInt560 = this.anInt564;
			this.anInt561 = 0;
			this.anInt562 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("31788, " + 78 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZWMPYWU", name = "c", descriptor = "(I)V")
	public void method369() {
		try {
			if (this.anInt559 != this.anInt563 || this.anInt560 != this.anInt564) {
				@Pc(19) byte[] local19 = new byte[this.anInt563 * this.anInt564];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt560; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt559; local27++) {
						local19[local27 + this.anInt561 + (local23 + this.anInt562) * this.anInt563] = this.aByteArray13[local21++];
					}
				}
				this.aByteArray13 = local19;
				this.anInt559 = this.anInt563;
				this.anInt560 = this.anInt564;
				this.anInt561 = 0;
				this.anInt562 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("47024, " + -333 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZWMPYWU", name = "d", descriptor = "(I)V")
	public void method370() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt559 * this.anInt560];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt560; local12++) {
				for (@Pc(19) int local19 = this.anInt559 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray13[local19 + local12 * this.anInt559];
				}
			}
			this.aByteArray13 = local8;
			this.anInt561 = this.anInt563 - this.anInt559 - this.anInt561;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("72370, " + 0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZWMPYWU", name = "e", descriptor = "(I)V")
	public void method371() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt559 * this.anInt560];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt560 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt559; local19++) {
					local8[local10++] = this.aByteArray13[local19 + local15 * this.anInt559];
				}
			}
			this.aByteArray13 = local8;
			this.anInt562 = this.anInt564 - this.anInt560 - this.anInt562;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("26481, " + -29160 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZWMPYWU", name = "a", descriptor = "(IIIB)V")
	public void method372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray159.length; local3++) {
				@Pc(14) int local14 = this.anIntArray159[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray159[local3] >> 8 & 0xFF;
				local38 += arg2;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray159[local3] & 0xFF;
				local60 += arg1;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray159[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			@Pc(99) boolean local99 = false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("64450, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZWMPYWU", name = "a", descriptor = "(IIB)V")
	public void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt561;
			arg1 += this.anInt562;
			@Pc(19) int local19 = arg0 + arg1 * Class3_Sub1_Sub2.anInt783;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt560;
			@Pc(27) int local27 = this.anInt559;
			@Pc(31) int local31 = Class3_Sub1_Sub2.anInt783 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class3_Sub1_Sub2.anInt785) {
				local40 = Class3_Sub1_Sub2.anInt785 - arg1;
				local24 -= local40;
				arg1 = Class3_Sub1_Sub2.anInt785;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class3_Sub1_Sub2.anInt783;
			}
			if (arg1 + local24 > Class3_Sub1_Sub2.anInt786) {
				local24 -= arg1 + local24 - Class3_Sub1_Sub2.anInt786;
			}
			if (arg0 < Class3_Sub1_Sub2.anInt787) {
				local40 = Class3_Sub1_Sub2.anInt787 - arg0;
				local27 -= local40;
				arg0 = Class3_Sub1_Sub2.anInt787;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class3_Sub1_Sub2.anInt788) {
				local40 = arg0 + local27 - Class3_Sub1_Sub2.anInt788;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method374(local31, local24, local21, local27, this.aByteArray13, local33, this.anIntArray159, this.anInt558, Class3_Sub1_Sub2.anIntArray208, local19);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("8488, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RZWMPYWU", name = "a", descriptor = "(IIII[BI[II[II)V")
	private void method374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		try {
			if (arg7 == 7) {
				@Pc(10) int local10 = -(arg3 >> 2);
				@Pc(15) int local15 = -(arg3 & 0x3);
				for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
					for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
						@Pc(29) byte local29 = arg4[arg2++];
						if (local29 == 0) {
							arg9++;
						} else {
							arg8[arg9++] = arg6[local29 & 0xFF];
						}
						local29 = arg4[arg2++];
						if (local29 == 0) {
							arg9++;
						} else {
							arg8[arg9++] = arg6[local29 & 0xFF];
						}
						local29 = arg4[arg2++];
						if (local29 == 0) {
							arg9++;
						} else {
							arg8[arg9++] = arg6[local29 & 0xFF];
						}
						local29 = arg4[arg2++];
						if (local29 == 0) {
							arg9++;
						} else {
							arg8[arg9++] = arg6[local29 & 0xFF];
						}
					}
					for (@Pc(105) int local105 = local15; local105 < 0; local105++) {
						@Pc(112) byte local112 = arg4[arg2++];
						if (local112 == 0) {
							arg9++;
						} else {
							arg8[arg9++] = arg6[local112 & 0xFF];
						}
					}
					arg9 += arg0;
					arg2 += arg5;
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("98740, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
