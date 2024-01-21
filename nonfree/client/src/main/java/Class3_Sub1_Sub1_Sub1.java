import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AGTHLVTI")
public final class Class3_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!AGTHLVTI", name = "z", descriptor = "I")
	private int anInt35 = 99;

	@OriginalMember(owner = "client!AGTHLVTI", name = "A", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!AGTHLVTI", name = "B", descriptor = "I")
	private int anInt36 = 46583;

	@OriginalMember(owner = "client!AGTHLVTI", name = "C", descriptor = "I")
	private int anInt37 = -925;

	@OriginalMember(owner = "client!AGTHLVTI", name = "D", descriptor = "I")
	private int anInt38 = 317;

	@OriginalMember(owner = "client!AGTHLVTI", name = "K", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!AGTHLVTI", name = "L", descriptor = "I")
	private int anInt44;

	@OriginalMember(owner = "client!AGTHLVTI", name = "F", descriptor = "[I")
	public int[] anIntArray5;

	@OriginalMember(owner = "client!AGTHLVTI", name = "I", descriptor = "I")
	public int anInt41;

	@OriginalMember(owner = "client!AGTHLVTI", name = "J", descriptor = "I")
	public int anInt42;

	@OriginalMember(owner = "client!AGTHLVTI", name = "G", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!AGTHLVTI", name = "H", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!AGTHLVTI", name = "E", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!AGTHLVTI", name = "<init>", descriptor = "(Lclient!BYZSQZUF;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub1_Sub1(@OriginalArg(0) Class5 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class3_Sub1_Sub3 local34 = new Class3_Sub1_Sub3(0, arg0.method66(arg1 + ".dat", null));
		@Pc(43) Class3_Sub1_Sub3 local43 = new Class3_Sub1_Sub3(0, arg0.method66("index.dat", null));
		local43.anInt243 = local34.method148();
		this.anInt43 = local43.method148();
		this.anInt44 = local43.method148();
		@Pc(58) int local58 = local43.method146();
		this.anIntArray5 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray5[local64 + 1] = local43.method150();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt243 += 2;
			local34.anInt243 += local43.method148() * local43.method148();
			local43.anInt243++;
		}
		this.anInt41 = local43.method146();
		this.anInt42 = local43.method146();
		this.anInt39 = local43.method148();
		this.anInt40 = local43.method148();
		@Pc(129) int local129 = local43.method146();
		@Pc(135) int local135 = this.anInt39 * this.anInt40;
		this.aByteArray1 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray1[local143] = local34.method147();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt39; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt40; local165++) {
					this.aByteArray1[local143 + local165 * this.anInt39] = local34.method147();
				}
			}
		}
	}

	@OriginalMember(owner = "client!AGTHLVTI", name = "b", descriptor = "(I)V")
	public void method39() {
		try {
			this.anInt43 /= 2;
			this.anInt44 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt43 * this.anInt44];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt40; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt39; local28++) {
					local20[(local28 + this.anInt41 >> 1) + (local24 + this.anInt42 >> 1) * this.anInt43] = this.aByteArray1[local22++];
				}
			}
			this.aByteArray1 = local20;
			this.anInt39 = this.anInt43;
			this.anInt40 = this.anInt44;
			this.anInt41 = 0;
			this.anInt42 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("53817, " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGTHLVTI", name = "c", descriptor = "(I)V")
	public void method40(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt39 != this.anInt43 || this.anInt40 != this.anInt44) {
				@Pc(19) byte[] local19 = new byte[this.anInt43 * this.anInt44];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt40; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt39; local27++) {
						local19[local27 + this.anInt41 + (local23 + this.anInt42) * this.anInt43] = this.aByteArray1[local21++];
					}
				}
				this.aByteArray1 = local19;
				this.anInt39 = this.anInt43;
				this.anInt40 = this.anInt44;
				this.anInt41 = 0;
				if (arg0 < 0) {
					this.anInt42 = 0;
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("46633, " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGTHLVTI", name = "b", descriptor = "(B)V")
	public void method41(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt39 * this.anInt40];
			@Pc(13) boolean local13 = false;
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anInt40; local20++) {
				for (@Pc(27) int local27 = this.anInt39 - 1; local27 >= 0; local27--) {
					local8[local18++] = this.aByteArray1[local27 + local20 * this.anInt39];
				}
			}
			this.aByteArray1 = local8;
			this.anInt41 = this.anInt43 - this.anInt39 - this.anInt41;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("92240, " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGTHLVTI", name = "d", descriptor = "(I)V")
	public void method42() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt39 * this.anInt40];
			@Pc(10) int local10 = 0;
			for (@Pc(20) int local20 = this.anInt40 - 1; local20 >= 0; local20--) {
				for (@Pc(24) int local24 = 0; local24 < this.anInt39; local24++) {
					local8[local10++] = this.aByteArray1[local24 + local20 * this.anInt39];
				}
			}
			this.aByteArray1 = local8;
			this.anInt42 = this.anInt44 - this.anInt40 - this.anInt42;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("75208, " + -689 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGTHLVTI", name = "a", descriptor = "(IIII)V")
	public void method43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(6) int local6 = 0; local6 < this.anIntArray5.length; local6++) {
				@Pc(17) int local17 = this.anIntArray5[local6] >> 16 & 0xFF;
				local17 += arg0;
				if (local17 < 0) {
					local17 = 0;
				} else if (local17 > 255) {
					local17 = 255;
				}
				@Pc(41) int local41 = this.anIntArray5[local6] >> 8 & 0xFF;
				local41 += arg2;
				if (local41 < 0) {
					local41 = 0;
				} else if (local41 > 255) {
					local41 = 255;
				}
				@Pc(63) int local63 = this.anIntArray5[local6] & 0xFF;
				local63 += arg1;
				if (local63 < 0) {
					local63 = 0;
				} else if (local63 > 255) {
					local63 = 255;
				}
				this.anIntArray5[local6] = (local17 << 16) + (local41 << 8) + local63;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("29235, " + arg0 + ", " + arg1 + ", " + 47 + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGTHLVTI", name = "a", descriptor = "(III)V")
	public void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt41;
			arg1 += this.anInt42;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub1_Sub1.anInt760;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt40;
			@Pc(23) int local23 = this.anInt39;
			@Pc(27) int local27 = Class3_Sub1_Sub1.anInt760 - local23;
			@Pc(29) int local29 = 0;
			@Pc(42) int local42;
			if (arg1 < Class3_Sub1_Sub1.anInt762) {
				local42 = Class3_Sub1_Sub1.anInt762 - arg1;
				local20 -= local42;
				arg1 = Class3_Sub1_Sub1.anInt762;
				local17 = local42 * local23 + 0;
				local15 += local42 * Class3_Sub1_Sub1.anInt760;
			}
			if (arg1 + local20 > Class3_Sub1_Sub1.anInt763) {
				local20 -= arg1 + local20 - Class3_Sub1_Sub1.anInt763;
			}
			if (arg0 < Class3_Sub1_Sub1.anInt764) {
				local42 = Class3_Sub1_Sub1.anInt764 - arg0;
				local23 -= local42;
				arg0 = Class3_Sub1_Sub1.anInt764;
				local17 += local42;
				local15 += local42;
				local29 = local42 + 0;
				local27 += local42;
			}
			if (arg0 + local23 > Class3_Sub1_Sub1.anInt765) {
				local42 = arg0 + local23 - Class3_Sub1_Sub1.anInt765;
				local23 -= local42;
				local29 += local42;
				local27 += local42;
			}
			if (local23 > 0 && local20 > 0) {
				this.method45(this.anIntArray5, local23, this.aByteArray1, local27, local17, local29, local15, Class3_Sub1_Sub1.anIntArray203, local20);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("30246, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AGTHLVTI", name = "a", descriptor = "([II[BIIIII[II)V")
	private void method45(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(25) int local25 = -arg8; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					@Pc(36) byte local36 = arg2[arg4++];
					if (local36 == 0) {
						arg6++;
					} else {
						arg7[arg6++] = arg0[local36 & 0xFF];
					}
					local36 = arg2[arg4++];
					if (local36 == 0) {
						arg6++;
					} else {
						arg7[arg6++] = arg0[local36 & 0xFF];
					}
					local36 = arg2[arg4++];
					if (local36 == 0) {
						arg6++;
					} else {
						arg7[arg6++] = arg0[local36 & 0xFF];
					}
					local36 = arg2[arg4++];
					if (local36 == 0) {
						arg6++;
					} else {
						arg7[arg6++] = arg0[local36 & 0xFF];
					}
				}
				for (@Pc(112) int local112 = local11; local112 < 0; local112++) {
					@Pc(119) byte local119 = arg2[arg4++];
					if (local119 == 0) {
						arg6++;
					} else {
						arg7[arg6++] = arg0[local119 & 0xFF];
					}
				}
				arg6 += arg3;
				arg4 += arg5;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("94567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -925 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
