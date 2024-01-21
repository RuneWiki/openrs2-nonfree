import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
	private static boolean aBoolean184;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt665 = 11239;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt666 = 160;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean185 = true;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt671;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method666(arg1 + ".dat", null), aBoolean184);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method666("index.dat", null), aBoolean184);
		local37.anInt733 = local28.method482();
		this.anInt671 = local37.method482();
		this.anInt672 = local37.method482();
		@Pc(52) int local52 = local37.method480();
		this.anIntArray212 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray212[local58 + 1] = local37.method484();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt733 += 2;
			local28.anInt733 += local37.method482() * local37.method482();
			local37.anInt733++;
		}
		this.anInt669 = local37.method480();
		this.anInt670 = local37.method480();
		this.anInt667 = local37.method482();
		this.anInt668 = local37.method482();
		@Pc(123) int local123 = local37.method480();
		@Pc(129) int local129 = this.anInt667 * this.anInt668;
		this.aByteArray7 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray7[local137] = local28.method481();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt667; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt668; local159++) {
					this.aByteArray7[local137 + local159 * this.anInt667] = local28.method481();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public void method413() {
		try {
			this.anInt671 /= 2;
			this.anInt672 /= 2;
			@Pc(30) byte[] local30 = new byte[this.anInt671 * this.anInt672];
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = 0; local34 < this.anInt668; local34++) {
				for (@Pc(38) int local38 = 0; local38 < this.anInt667; local38++) {
					local30[(local38 + this.anInt669 >> 1) + (local34 + this.anInt670 >> 1) * this.anInt671] = this.aByteArray7[local32++];
				}
			}
			this.aByteArray7 = local30;
			this.anInt667 = this.anInt671;
			this.anInt668 = this.anInt672;
			this.anInt669 = 0;
			this.anInt670 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("94341, " + 1 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method414(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt667 != this.anInt671 || this.anInt668 != this.anInt672) {
				@Pc(19) byte[] local19 = new byte[this.anInt671 * this.anInt672];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt668; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt667; local27++) {
						local19[local27 + this.anInt669 + (local23 + this.anInt670) * this.anInt671] = this.aByteArray7[local21++];
					}
				}
				@Pc(62) boolean local62 = false;
				this.aByteArray7 = local19;
				this.anInt667 = this.anInt671;
				this.anInt668 = this.anInt672;
				this.anInt669 = 0;
				this.anInt670 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("77535, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method415() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt667 * this.anInt668];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt668; local12++) {
				for (@Pc(19) int local19 = this.anInt667 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt667];
				}
			}
			this.aByteArray7 = local8;
			this.anInt669 = this.anInt671 - this.anInt667 - this.anInt669;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("86074, " + 4 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public void method416() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt667 * this.anInt668];
			@Pc(10) int local10 = 0;
			for (@Pc(25) int local25 = this.anInt668 - 1; local25 >= 0; local25--) {
				for (@Pc(29) int local29 = 0; local29 < this.anInt667; local29++) {
					local8[local10++] = this.aByteArray7[local29 + local25 * this.anInt667];
				}
			}
			this.aByteArray7 = local8;
			this.anInt670 = this.anInt672 - this.anInt668 - this.anInt670;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("52703, " + -289 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIII)V")
	public void method417(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray212.length; local17++) {
				@Pc(28) int local28 = this.anIntArray212[local17] >> 16 & 0xFF;
				local28 += arg3;
				if (local28 < 0) {
					local28 = 0;
				} else if (local28 > 255) {
					local28 = 255;
				}
				@Pc(52) int local52 = this.anIntArray212[local17] >> 8 & 0xFF;
				local52 += arg2;
				if (local52 < 0) {
					local52 = 0;
				} else if (local52 > 255) {
					local52 = 255;
				}
				@Pc(74) int local74 = this.anIntArray212[local17] & 0xFF;
				local74 += arg1;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 > 255) {
					local74 = 255;
				}
				this.anIntArray212[local17] = (local28 << 16) + (local52 << 8) + local74;
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("2875, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt669;
			arg1 += this.anInt670;
			@Pc(25) int local25 = arg0 + arg1 * Class1_Sub1_Sub2.anInt687;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt668;
			@Pc(33) int local33 = this.anInt667;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt687 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt689) {
				local46 = Class1_Sub1_Sub2.anInt689 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt689;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt687;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt690) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt690;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt691) {
				local46 = Class1_Sub1_Sub2.anInt691 - arg0;
				local33 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt691;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class1_Sub1_Sub2.anInt692) {
				local46 = arg0 + local33 - Class1_Sub1_Sub2.anInt692;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method419(this.anIntArray212, local37, local30, local27, local25, local33, this.aByteArray7, local39, Class1_Sub1_Sub2.anIntArray213);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("70367, " + arg0 + ", " + arg1 + ", " + false + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIZIII[BI[I)V")
	private void method419(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(9) int local9 = -(arg5 >> 2);
			@Pc(14) int local14 = -(arg5 & 0x3);
			for (@Pc(17) int local17 = -arg2; local17 < 0; local17++) {
				for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
					@Pc(28) byte local28 = arg6[arg3++];
					if (local28 == 0) {
						arg4++;
					} else {
						arg8[arg4++] = arg0[local28 & 0xFF];
					}
					local28 = arg6[arg3++];
					if (local28 == 0) {
						arg4++;
					} else {
						arg8[arg4++] = arg0[local28 & 0xFF];
					}
					local28 = arg6[arg3++];
					if (local28 == 0) {
						arg4++;
					} else {
						arg8[arg4++] = arg0[local28 & 0xFF];
					}
					local28 = arg6[arg3++];
					if (local28 == 0) {
						arg4++;
					} else {
						arg8[arg4++] = arg0[local28 & 0xFF];
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					@Pc(111) byte local111 = arg6[arg3++];
					if (local111 == 0) {
						arg4++;
					} else {
						arg8[arg4++] = arg0[local111 & 0xFF];
					}
				}
				arg4 += arg1;
				arg3 += arg7;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("56661, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
