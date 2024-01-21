import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FDCAWVRL")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!FDCAWVRL", name = "B", descriptor = "I")
	private int anInt264;

	@OriginalMember(owner = "client!FDCAWVRL", name = "z", descriptor = "Z")
	private boolean aBoolean74 = true;

	@OriginalMember(owner = "client!FDCAWVRL", name = "A", descriptor = "I")
	private int anInt263 = -3381;

	@OriginalMember(owner = "client!FDCAWVRL", name = "C", descriptor = "I")
	private int anInt265 = 47773;

	@OriginalMember(owner = "client!FDCAWVRL", name = "D", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!FDCAWVRL", name = "E", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!FDCAWVRL", name = "L", descriptor = "I")
	public int anInt270;

	@OriginalMember(owner = "client!FDCAWVRL", name = "M", descriptor = "I")
	private int anInt271;

	@OriginalMember(owner = "client!FDCAWVRL", name = "G", descriptor = "[I")
	public int[] anIntArray41;

	@OriginalMember(owner = "client!FDCAWVRL", name = "J", descriptor = "I")
	public int anInt268;

	@OriginalMember(owner = "client!FDCAWVRL", name = "K", descriptor = "I")
	public int anInt269;

	@OriginalMember(owner = "client!FDCAWVRL", name = "H", descriptor = "I")
	public int anInt266;

	@OriginalMember(owner = "client!FDCAWVRL", name = "I", descriptor = "I")
	public int anInt267;

	@OriginalMember(owner = "client!FDCAWVRL", name = "F", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!FDCAWVRL", name = "<init>", descriptor = "(Lclient!VSUYIIVA;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub3_Sub2(@OriginalArg(0) Class42 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub2 local34 = new Class1_Sub1_Sub2(arg0.method539(arg1 + ".dat", null), 792);
		@Pc(43) Class1_Sub1_Sub2 local43 = new Class1_Sub1_Sub2(arg0.method539("index.dat", null), 792);
		local43.anInt153 = local34.method61();
		this.anInt270 = local43.method61();
		this.anInt271 = local43.method61();
		@Pc(58) int local58 = local43.method59();
		this.anIntArray41 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray41[local64 + 1] = local43.method63();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt153 += 2;
			local34.anInt153 += local43.method61() * local43.method61();
			local43.anInt153++;
		}
		this.anInt268 = local43.method59();
		this.anInt269 = local43.method59();
		this.anInt266 = local43.method61();
		this.anInt267 = local43.method61();
		@Pc(129) int local129 = local43.method59();
		@Pc(135) int local135 = this.anInt266 * this.anInt267;
		this.aByteArray2 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray2[local143] = local34.method60();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt266; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt267; local165++) {
					this.aByteArray2[local143 + local165 * this.anInt266] = local34.method60();
				}
			}
		}
	}

	@OriginalMember(owner = "client!FDCAWVRL", name = "a", descriptor = "(Z)V")
	public void method203() {
		try {
			this.anInt270 /= 2;
			this.anInt271 /= 2;
			@Pc(23) byte[] local23 = new byte[this.anInt270 * this.anInt271];
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < this.anInt267; local27++) {
				for (@Pc(31) int local31 = 0; local31 < this.anInt266; local31++) {
					local23[(local31 + this.anInt268 >> 1) + (local27 + this.anInt269 >> 1) * this.anInt270] = this.aByteArray2[local25++];
				}
			}
			this.aByteArray2 = local23;
			this.anInt266 = this.anInt270;
			this.anInt267 = this.anInt271;
			this.anInt268 = 0;
			this.anInt269 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("11599, " + false + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDCAWVRL", name = "b", descriptor = "(I)V")
	public void method204() {
		try {
			if (this.anInt266 != this.anInt270 || this.anInt267 != this.anInt271) {
				@Pc(23) byte[] local23 = new byte[this.anInt270 * this.anInt271];
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < this.anInt267; local27++) {
					for (@Pc(31) int local31 = 0; local31 < this.anInt266; local31++) {
						local23[local31 + this.anInt268 + (local27 + this.anInt269) * this.anInt270] = this.aByteArray2[local25++];
					}
				}
				this.aByteArray2 = local23;
				this.anInt266 = this.anInt270;
				this.anInt267 = this.anInt271;
				this.anInt268 = 0;
				this.anInt269 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("55942, " + 6 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDCAWVRL", name = "c", descriptor = "(I)V")
	public void method205(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt266 * this.anInt267];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt267; local12++) {
				for (@Pc(19) int local19 = this.anInt266 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray2[local19 + local12 * this.anInt266];
				}
			}
			this.aByteArray2 = local8;
			this.anInt268 = this.anInt270 - this.anInt266 - this.anInt268;
			if (arg0 >= 0) {
				this.anInt265 = -244;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("82894, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDCAWVRL", name = "d", descriptor = "(I)V")
	public void method206(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt266 * this.anInt267];
			@Pc(10) int local10 = 0;
			@Pc(19) int local19;
			for (@Pc(15) int local15 = this.anInt267 - 1; local15 >= 0; local15--) {
				for (local19 = 0; local19 < this.anInt266; local19++) {
					local8[local10++] = this.aByteArray2[local19 + local15 * this.anInt266];
				}
			}
			this.aByteArray2 = local8;
			this.anInt269 = this.anInt271 - this.anInt267 - this.anInt269;
			while (arg0 >= 0) {
				for (local19 = 1; local19 > 0; local19++) {
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("19421, " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDCAWVRL", name = "a", descriptor = "(IIBI)V")
	public void method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(10) int local10;
			if (arg2 == 3) {
				@Pc(6) boolean local6 = false;
			} else {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			for (local10 = 0; local10 < this.anIntArray41.length; local10++) {
				@Pc(28) int local28 = this.anIntArray41[local10] >> 16 & 0xFF;
				local28 += arg1;
				if (local28 < 0) {
					local28 = 0;
				} else if (local28 > 255) {
					local28 = 255;
				}
				@Pc(52) int local52 = this.anIntArray41[local10] >> 8 & 0xFF;
				local52 += arg3;
				if (local52 < 0) {
					local52 = 0;
				} else if (local52 > 255) {
					local52 = 255;
				}
				@Pc(74) int local74 = this.anIntArray41[local10] & 0xFF;
				local74 += arg0;
				if (local74 < 0) {
					local74 = 0;
				} else if (local74 > 255) {
					local74 = 255;
				}
				this.anIntArray41[local10] = (local28 << 16) + (local52 << 8) + local74;
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("2082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDCAWVRL", name = "a", descriptor = "(III)V")
	public void method208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt268;
			arg1 += this.anInt269;
			@Pc(24) int local24 = arg0 + arg1 * Class1_Sub1_Sub3.anInt735;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt267;
			@Pc(32) int local32 = this.anInt266;
			@Pc(36) int local36 = Class1_Sub1_Sub3.anInt735 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub3.anInt737) {
				local45 = Class1_Sub1_Sub3.anInt737 - arg1;
				local29 -= local45;
				arg1 = Class1_Sub1_Sub3.anInt737;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub3.anInt735;
			}
			if (arg1 + local29 > Class1_Sub1_Sub3.anInt738) {
				local29 -= arg1 + local29 - Class1_Sub1_Sub3.anInt738;
			}
			if (arg0 < Class1_Sub1_Sub3.anInt739) {
				local45 = Class1_Sub1_Sub3.anInt739 - arg0;
				local32 -= local45;
				arg0 = Class1_Sub1_Sub3.anInt739;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class1_Sub1_Sub3.anInt740) {
				local45 = arg0 + local32 - Class1_Sub1_Sub3.anInt740;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method209(local32, local26, this.aByteArray2, Class1_Sub1_Sub3.anIntArray176, this.anInt264, local38, local36, local24, this.anIntArray41, local29);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("22348, " + arg0 + ", " + arg1 + ", " + 9 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FDCAWVRL", name = "a", descriptor = "(II[B[IIIII[II)V")
	private void method209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(14) int local14 = -arg9; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg2[arg1++];
					if (local25 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local25 & 0xFF];
					}
					local25 = arg2[arg1++];
					if (local25 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local25 & 0xFF];
					}
					local25 = arg2[arg1++];
					if (local25 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local25 & 0xFF];
					}
					local25 = arg2[arg1++];
					if (local25 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg2[arg1++];
					if (local108 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg8[local108 & 0xFF];
					}
				}
				arg7 += arg6;
				arg1 += arg5;
			}
			if (arg4 != 0) {
				this.anInt264 = 460;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("80754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
