import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BNGXLHWA")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!BNGXLHWA", name = "v", descriptor = "I")
	private int anInt183 = 8868;

	@OriginalMember(owner = "client!BNGXLHWA", name = "w", descriptor = "I")
	private int anInt184 = 3;

	@OriginalMember(owner = "client!BNGXLHWA", name = "x", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!BNGXLHWA", name = "E", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!BNGXLHWA", name = "F", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!BNGXLHWA", name = "z", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!BNGXLHWA", name = "C", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!BNGXLHWA", name = "D", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!BNGXLHWA", name = "A", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!BNGXLHWA", name = "B", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!BNGXLHWA", name = "y", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!BNGXLHWA", name = "<init>", descriptor = "(Lclient!IEMHZJLX;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class1_Sub1_Sub4 local28 = new Class1_Sub1_Sub4(0, arg0.method181(arg1 + ".dat", null));
		@Pc(37) Class1_Sub1_Sub4 local37 = new Class1_Sub1_Sub4(0, arg0.method181("index.dat", null));
		local37.anInt529 = local28.method296();
		this.anInt189 = local37.method296();
		this.anInt190 = local37.method296();
		@Pc(52) int local52 = local37.method294();
		this.anIntArray24 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray24[local58 + 1] = local37.method298();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt529 += 2;
			local28.anInt529 += local37.method296() * local37.method296();
			local37.anInt529++;
		}
		this.anInt187 = local37.method294();
		this.anInt188 = local37.method294();
		this.anInt185 = local37.method296();
		this.anInt186 = local37.method296();
		@Pc(123) int local123 = local37.method294();
		@Pc(129) int local129 = this.anInt185 * this.anInt186;
		this.aByteArray2 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray2[local137] = local28.method295();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt185; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt186; local159++) {
					this.aByteArray2[local137 + local159 * this.anInt185] = local28.method295();
				}
			}
		}
	}

	@OriginalMember(owner = "client!BNGXLHWA", name = "b", descriptor = "(I)V")
	public void method98() {
		try {
			this.anInt189 /= 2;
			this.anInt190 /= 2;
			@Pc(25) byte[] local25 = new byte[this.anInt189 * this.anInt190];
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < this.anInt186; local29++) {
				for (@Pc(33) int local33 = 0; local33 < this.anInt185; local33++) {
					local25[(local33 + this.anInt187 >> 1) + (local29 + this.anInt188 >> 1) * this.anInt189] = this.aByteArray2[local27++];
				}
			}
			this.aByteArray2 = local25;
			this.anInt185 = this.anInt189;
			this.anInt186 = this.anInt190;
			this.anInt187 = 0;
			this.anInt188 = 0;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("69951, " + 0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BNGXLHWA", name = "c", descriptor = "(I)V")
	public void method99() {
		try {
			if (this.anInt185 != this.anInt189 || this.anInt186 != this.anInt190) {
				@Pc(23) byte[] local23 = new byte[this.anInt189 * this.anInt190];
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < this.anInt186; local27++) {
					for (@Pc(31) int local31 = 0; local31 < this.anInt185; local31++) {
						local23[local31 + this.anInt187 + (local27 + this.anInt188) * this.anInt189] = this.aByteArray2[local25++];
					}
				}
				this.aByteArray2 = local23;
				this.anInt185 = this.anInt189;
				this.anInt186 = this.anInt190;
				this.anInt187 = 0;
				this.anInt188 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("72194, " + 1038 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BNGXLHWA", name = "b", descriptor = "(B)V")
	public void method100() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt185 * this.anInt186];
			@Pc(20) int local20 = 0;
			for (@Pc(22) int local22 = 0; local22 < this.anInt186; local22++) {
				for (@Pc(29) int local29 = this.anInt185 - 1; local29 >= 0; local29--) {
					local8[local20++] = this.aByteArray2[local29 + local22 * this.anInt185];
				}
			}
			this.aByteArray2 = local8;
			this.anInt187 = this.anInt189 - this.anInt185 - this.anInt187;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("89091, " + -18 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BNGXLHWA", name = "a", descriptor = "(Z)V")
	public void method101() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt185 * this.anInt186];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt186 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt185; local19++) {
					local8[local10++] = this.aByteArray2[local19 + local15 * this.anInt185];
				}
			}
			this.aByteArray2 = local8;
			this.anInt188 = this.anInt190 - this.anInt186 - this.anInt188;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("46355, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BNGXLHWA", name = "a", descriptor = "(BIII)V")
	public void method102(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 != 7) {
				this.aBoolean29 = !this.aBoolean29;
			}
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray24.length; local14++) {
				@Pc(25) int local25 = this.anIntArray24[local14] >> 16 & 0xFF;
				local25 += arg2;
				if (local25 < 0) {
					local25 = 0;
				} else if (local25 > 255) {
					local25 = 255;
				}
				@Pc(49) int local49 = this.anIntArray24[local14] >> 8 & 0xFF;
				local49 += arg1;
				if (local49 < 0) {
					local49 = 0;
				} else if (local49 > 255) {
					local49 = 255;
				}
				@Pc(71) int local71 = this.anIntArray24[local14] & 0xFF;
				local71 += arg3;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 255) {
					local71 = 255;
				}
				this.anIntArray24[local14] = (local25 << 16) + (local49 << 8) + local71;
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("12389, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BNGXLHWA", name = "a", descriptor = "(III)V")
	public void method103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt187;
			arg1 += this.anInt188;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt730;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt186;
			@Pc(23) int local23 = this.anInt185;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt730 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt732) {
				local36 = Class1_Sub1_Sub2.anInt732 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt732;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt730;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt733) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt733;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt734) {
				local36 = Class1_Sub1_Sub2.anInt734 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt734;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt735) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt735;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method104(local20, Class1_Sub1_Sub2.anIntArray192, this.anIntArray24, local23, local15, local17, this.aByteArray2, local29, local27);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("89404, " + -23827 + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BNGXLHWA", name = "a", descriptor = "(I[I[IIIII[BII)V")
	private void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			for (@Pc(14) int local14 = -arg0; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg6[arg5++];
					if (local25 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg2[local25 & 0xFF];
					}
					local25 = arg6[arg5++];
					if (local25 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg2[local25 & 0xFF];
					}
					local25 = arg6[arg5++];
					if (local25 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg2[local25 & 0xFF];
					}
					local25 = arg6[arg5++];
					if (local25 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg2[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg6[arg5++];
					if (local108 == 0) {
						arg4++;
					} else {
						arg1[arg4++] = arg2[local108 & 0xFF];
					}
				}
				arg4 += arg8;
				arg5 += arg7;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("62511, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
