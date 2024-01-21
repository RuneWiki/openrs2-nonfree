import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OJMMOVXV")
public final class Class2_Sub1_Sub2_Sub3 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!OJMMOVXV", name = "w", descriptor = "Z")
	private boolean aBoolean115 = true;

	@OriginalMember(owner = "client!OJMMOVXV", name = "x", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!OJMMOVXV", name = "y", descriptor = "I")
	private int anInt473 = 165;

	@OriginalMember(owner = "client!OJMMOVXV", name = "F", descriptor = "I")
	public int anInt478;

	@OriginalMember(owner = "client!OJMMOVXV", name = "G", descriptor = "I")
	private int anInt479;

	@OriginalMember(owner = "client!OJMMOVXV", name = "A", descriptor = "[I")
	public int[] anIntArray102;

	@OriginalMember(owner = "client!OJMMOVXV", name = "D", descriptor = "I")
	public int anInt476;

	@OriginalMember(owner = "client!OJMMOVXV", name = "E", descriptor = "I")
	public int anInt477;

	@OriginalMember(owner = "client!OJMMOVXV", name = "B", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!OJMMOVXV", name = "C", descriptor = "I")
	public int anInt475;

	@OriginalMember(owner = "client!OJMMOVXV", name = "z", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!OJMMOVXV", name = "<init>", descriptor = "(Lclient!FXNTEMPE;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub2_Sub3(@OriginalArg(0) Class13 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class2_Sub1_Sub4 local28 = new Class2_Sub1_Sub4(arg0.method117(arg1 + ".dat", null), -46859);
		@Pc(37) Class2_Sub1_Sub4 local37 = new Class2_Sub1_Sub4(arg0.method117("index.dat", null), -46859);
		local37.anInt556 = local28.method342();
		this.anInt478 = local37.method342();
		this.anInt479 = local37.method342();
		@Pc(52) int local52 = local37.method340();
		this.anIntArray102 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray102[local58 + 1] = local37.method344();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt556 += 2;
			local28.anInt556 += local37.method342() * local37.method342();
			local37.anInt556++;
		}
		this.anInt476 = local37.method340();
		this.anInt477 = local37.method340();
		this.anInt474 = local37.method342();
		this.anInt475 = local37.method342();
		@Pc(123) int local123 = local37.method340();
		@Pc(129) int local129 = this.anInt474 * this.anInt475;
		this.aByteArray11 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray11[local137] = local28.method341();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt474; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt475; local159++) {
					this.aByteArray11[local137 + local159 * this.anInt474] = local28.method341();
				}
			}
		}
	}

	@OriginalMember(owner = "client!OJMMOVXV", name = "a", descriptor = "(Z)V")
	public void method272() {
		try {
			this.anInt478 /= 2;
			this.anInt479 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt478 * this.anInt479];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt475; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt474; local28++) {
					local20[(local28 + this.anInt476 >> 1) + (local24 + this.anInt477 >> 1) * this.anInt478] = this.aByteArray11[local22++];
				}
			}
			this.aByteArray11 = local20;
			this.anInt474 = this.anInt478;
			this.anInt475 = this.anInt479;
			this.anInt476 = 0;
			this.anInt477 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("12429, " + true + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJMMOVXV", name = "b", descriptor = "(Z)V")
	public void method273() {
		try {
			if (this.anInt474 != this.anInt478 || this.anInt475 != this.anInt479) {
				@Pc(19) byte[] local19 = new byte[this.anInt478 * this.anInt479];
				@Pc(21) int local21 = 0;
				for (@Pc(26) int local26 = 0; local26 < this.anInt475; local26++) {
					for (@Pc(30) int local30 = 0; local30 < this.anInt474; local30++) {
						local19[local30 + this.anInt476 + (local26 + this.anInt477) * this.anInt478] = this.aByteArray11[local21++];
					}
				}
				this.aByteArray11 = local19;
				this.anInt474 = this.anInt478;
				this.anInt475 = this.anInt479;
				this.anInt476 = 0;
				this.anInt477 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("33362, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJMMOVXV", name = "c", descriptor = "(Z)V")
	public void method274(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt474 * this.anInt475];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt475; local12++) {
				for (@Pc(19) int local19 = this.anInt474 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray11[local19 + local12 * this.anInt474];
				}
			}
			this.aByteArray11 = local8;
			this.anInt476 = this.anInt478 - this.anInt474 - this.anInt476;
			if (!arg0) {
				;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("13741, " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJMMOVXV", name = "b", descriptor = "(I)V")
	public void method275() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt474 * this.anInt475];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt475 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt474; local19++) {
					local8[local10++] = this.aByteArray11[local19 + local15 * this.anInt474];
				}
			}
			this.aByteArray11 = local8;
			this.anInt477 = this.anInt479 - this.anInt475 - this.anInt477;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("56387, " + 22940 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJMMOVXV", name = "a", descriptor = "(IIIZ)V")
	public void method276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray102.length; local3++) {
				@Pc(14) int local14 = this.anIntArray102[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray102[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray102[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray102[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("6967, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJMMOVXV", name = "a", descriptor = "(BII)V")
	public void method277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt476;
			arg1 += this.anInt477;
			@Pc(19) int local19 = arg0 + arg1 * Class2_Sub1_Sub2.anInt710;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt475;
			@Pc(27) int local27 = this.anInt474;
			@Pc(31) int local31 = Class2_Sub1_Sub2.anInt710 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub2.anInt712) {
				local40 = Class2_Sub1_Sub2.anInt712 - arg1;
				local24 -= local40;
				arg1 = Class2_Sub1_Sub2.anInt712;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub2.anInt710;
			}
			if (arg1 + local24 > Class2_Sub1_Sub2.anInt713) {
				local24 -= arg1 + local24 - Class2_Sub1_Sub2.anInt713;
			}
			if (arg0 < Class2_Sub1_Sub2.anInt714) {
				local40 = Class2_Sub1_Sub2.anInt714 - arg0;
				local27 -= local40;
				arg0 = Class2_Sub1_Sub2.anInt714;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class2_Sub1_Sub2.anInt715) {
				local40 = arg0 + local27 - Class2_Sub1_Sub2.anInt715;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method278(local24, local27, Class2_Sub1_Sub2.anIntArray184, this.anIntArray102, local19, this.aByteArray11, local33, local31, local21);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("56355, " + -91 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OJMMOVXV", name = "a", descriptor = "(II[I[III[BIII)V")
	private void method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(14) int local14 = -arg0; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg5[arg8++];
					if (local25 == 0) {
						arg4++;
					} else {
						arg2[arg4++] = arg3[local25 & 0xFF];
					}
					local25 = arg5[arg8++];
					if (local25 == 0) {
						arg4++;
					} else {
						arg2[arg4++] = arg3[local25 & 0xFF];
					}
					local25 = arg5[arg8++];
					if (local25 == 0) {
						arg4++;
					} else {
						arg2[arg4++] = arg3[local25 & 0xFF];
					}
					local25 = arg5[arg8++];
					if (local25 == 0) {
						arg4++;
					} else {
						arg2[arg4++] = arg3[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg5[arg8++];
					if (local108 == 0) {
						arg4++;
					} else {
						arg2[arg4++] = arg3[local108 & 0xFF];
					}
				}
				arg4 += arg7;
				arg8 += arg6;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("66862, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 912 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
