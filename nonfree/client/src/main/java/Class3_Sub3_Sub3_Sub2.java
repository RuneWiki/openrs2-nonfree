import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OSRLSEOB")
public final class Class3_Sub3_Sub3_Sub2 extends Class3_Sub3_Sub3 {

	@OriginalMember(owner = "client!OSRLSEOB", name = "w", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!OSRLSEOB", name = "x", descriptor = "I")
	private int anInt456 = -79;

	@OriginalMember(owner = "client!OSRLSEOB", name = "y", descriptor = "Z")
	private boolean aBoolean109 = true;

	@OriginalMember(owner = "client!OSRLSEOB", name = "z", descriptor = "I")
	private int anInt457 = 1;

	@OriginalMember(owner = "client!OSRLSEOB", name = "G", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!OSRLSEOB", name = "H", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!OSRLSEOB", name = "B", descriptor = "[I")
	public int[] anIntArray121;

	@OriginalMember(owner = "client!OSRLSEOB", name = "E", descriptor = "I")
	public int anInt460;

	@OriginalMember(owner = "client!OSRLSEOB", name = "F", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!OSRLSEOB", name = "C", descriptor = "I")
	public int anInt458;

	@OriginalMember(owner = "client!OSRLSEOB", name = "D", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!OSRLSEOB", name = "A", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!OSRLSEOB", name = "<init>", descriptor = "(Lclient!LKPVZAQN;Ljava/lang/String;I)V")
	public Class3_Sub3_Sub3_Sub2(@OriginalArg(0) Class22 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class3_Sub3_Sub4 local31 = new Class3_Sub3_Sub4((byte) -115, arg0.method207(arg1 + ".dat", null));
		@Pc(40) Class3_Sub3_Sub4 local40 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("index.dat", null));
		local40.anInt738 = local31.method470();
		this.anInt462 = local40.method470();
		this.anInt463 = local40.method470();
		@Pc(55) int local55 = local40.method468();
		this.anIntArray121 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray121[local61 + 1] = local40.method472();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt738 += 2;
			local31.anInt738 += local40.method470() * local40.method470();
			local40.anInt738++;
		}
		this.anInt460 = local40.method468();
		this.anInt461 = local40.method468();
		this.anInt458 = local40.method470();
		this.anInt459 = local40.method470();
		@Pc(126) int local126 = local40.method468();
		@Pc(132) int local132 = this.anInt458 * this.anInt459;
		this.aByteArray17 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray17[local140] = local31.method469();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt458; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt459; local162++) {
					this.aByteArray17[local140 + local162 * this.anInt458] = local31.method469();
				}
			}
		}
	}

	@OriginalMember(owner = "client!OSRLSEOB", name = "b", descriptor = "(I)V")
	public void method280(@OriginalArg(0) int arg0) {
		try {
			this.anInt462 /= 2;
			this.anInt463 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt462 * this.anInt463];
			@Pc(22) int local22 = 0;
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 0; local24 < this.anInt459; local24++) {
				for (local28 = 0; local28 < this.anInt458; local28++) {
					local20[(local28 + this.anInt460 >> 1) + (local24 + this.anInt461 >> 1) * this.anInt462] = this.aByteArray17[local22++];
				}
			}
			this.aByteArray17 = local20;
			this.anInt458 = this.anInt462;
			this.anInt459 = this.anInt463;
			this.anInt460 = 0;
			while (arg0 >= 0) {
				for (local28 = 1; local28 > 0; local28++) {
				}
			}
			this.anInt461 = 0;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("89097, " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OSRLSEOB", name = "c", descriptor = "(I)V")
	public void method281() {
		try {
			if (this.anInt458 != this.anInt462 || this.anInt459 != this.anInt463) {
				@Pc(19) byte[] local19 = new byte[this.anInt462 * this.anInt463];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt459; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt458; local27++) {
						local19[local27 + this.anInt460 + (local23 + this.anInt461) * this.anInt462] = this.aByteArray17[local21++];
					}
				}
				this.aByteArray17 = local19;
				this.anInt458 = this.anInt462;
				this.anInt459 = this.anInt463;
				this.anInt460 = 0;
				this.anInt461 = 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("69547, " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OSRLSEOB", name = "d", descriptor = "(I)V")
	public void method282() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt458 * this.anInt459];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt459; local12++) {
				for (@Pc(19) int local19 = this.anInt458 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray17[local19 + local12 * this.anInt458];
				}
			}
			this.aByteArray17 = local8;
			this.anInt460 = this.anInt462 - this.anInt458 - this.anInt460;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("12740, " + 0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OSRLSEOB", name = "e", descriptor = "(I)V")
	public void method283() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt458 * this.anInt459];
			@Pc(20) int local20 = 0;
			for (@Pc(25) int local25 = this.anInt459 - 1; local25 >= 0; local25--) {
				for (@Pc(29) int local29 = 0; local29 < this.anInt458; local29++) {
					local8[local20++] = this.aByteArray17[local29 + local25 * this.anInt458];
				}
			}
			this.aByteArray17 = local8;
			this.anInt461 = this.anInt463 - this.anInt459 - this.anInt461;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("49005, " + -17803 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OSRLSEOB", name = "a", descriptor = "(IIBI)V")
	public void method284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray121.length; local3++) {
				@Pc(14) int local14 = this.anIntArray121[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray121[local3] >> 8 & 0xFF;
				local38 += arg3;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray121[local3] & 0xFF;
				local60 += arg1;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray121[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			@Pc(99) boolean local99 = false;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("35564, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OSRLSEOB", name = "a", descriptor = "(III)V")
	public void method285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt460;
			arg1 += this.anInt461;
			@Pc(20) int local20 = arg0 + arg1 * Class3_Sub3_Sub3.anInt815;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt459;
			@Pc(28) int local28 = this.anInt458;
			@Pc(32) int local32 = Class3_Sub3_Sub3.anInt815 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class3_Sub3_Sub3.anInt817) {
				local41 = Class3_Sub3_Sub3.anInt817 - arg1;
				local25 -= local41;
				arg1 = Class3_Sub3_Sub3.anInt817;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class3_Sub3_Sub3.anInt815;
			}
			if (arg1 + local25 > Class3_Sub3_Sub3.anInt818) {
				local25 -= arg1 + local25 - Class3_Sub3_Sub3.anInt818;
			}
			if (arg0 < Class3_Sub3_Sub3.anInt819) {
				local41 = Class3_Sub3_Sub3.anInt819 - arg0;
				local28 -= local41;
				arg0 = Class3_Sub3_Sub3.anInt819;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class3_Sub3_Sub3.anInt820) {
				local41 = arg0 + local28 - Class3_Sub3_Sub3.anInt820;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method286(this.anIntArray121, local22, local25, this.aByteArray17, Class3_Sub3_Sub3.anIntArray204, local34, local32, local20, local28);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("12065, " + arg0 + ", " + arg1 + ", " + -973 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OSRLSEOB", name = "a", descriptor = "([III[B[IIIIBI)V")
	private void method286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(22) int local22 = -(arg8 & 0x3);
			for (@Pc(25) int local25 = -arg2; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					@Pc(36) byte local36 = arg3[arg1++];
					if (local36 == 0) {
						arg7++;
					} else {
						arg4[arg7++] = arg0[local36 & 0xFF];
					}
					local36 = arg3[arg1++];
					if (local36 == 0) {
						arg7++;
					} else {
						arg4[arg7++] = arg0[local36 & 0xFF];
					}
					local36 = arg3[arg1++];
					if (local36 == 0) {
						arg7++;
					} else {
						arg4[arg7++] = arg0[local36 & 0xFF];
					}
					local36 = arg3[arg1++];
					if (local36 == 0) {
						arg7++;
					} else {
						arg4[arg7++] = arg0[local36 & 0xFF];
					}
				}
				for (@Pc(112) int local112 = local22; local112 < 0; local112++) {
					@Pc(119) byte local119 = arg3[arg1++];
					if (local119 == 0) {
						arg7++;
					} else {
						arg4[arg7++] = arg0[local119 & 0xFF];
					}
				}
				arg7 += arg6;
				arg1 += arg5;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("58170, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 74 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
