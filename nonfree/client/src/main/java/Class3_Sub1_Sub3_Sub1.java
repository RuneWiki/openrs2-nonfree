import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KZTQXFDC")
public final class Class3_Sub1_Sub3_Sub1 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!KZTQXFDC", name = "x", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!KZTQXFDC", name = "y", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!KZTQXFDC", name = "z", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!KZTQXFDC", name = "A", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!KZTQXFDC", name = "B", descriptor = "I")
	private int anInt360 = -73;

	@OriginalMember(owner = "client!KZTQXFDC", name = "I", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!KZTQXFDC", name = "J", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!KZTQXFDC", name = "D", descriptor = "[I")
	public int[] anIntArray53;

	@OriginalMember(owner = "client!KZTQXFDC", name = "G", descriptor = "I")
	public int anInt363;

	@OriginalMember(owner = "client!KZTQXFDC", name = "H", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!KZTQXFDC", name = "E", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!KZTQXFDC", name = "F", descriptor = "I")
	public int anInt362;

	@OriginalMember(owner = "client!KZTQXFDC", name = "C", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!KZTQXFDC", name = "<init>", descriptor = "(Lclient!DTIATKJO;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub3_Sub1(@OriginalArg(0) Class7 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class3_Sub1_Sub2 local34 = new Class3_Sub1_Sub2(-527, arg0.method30(arg1 + ".dat", null));
		@Pc(43) Class3_Sub1_Sub2 local43 = new Class3_Sub1_Sub2(-527, arg0.method30("index.dat", null));
		local43.anInt257 = local34.method91();
		this.anInt365 = local43.method91();
		this.anInt366 = local43.method91();
		@Pc(58) int local58 = local43.method89();
		this.anIntArray53 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray53[local64 + 1] = local43.method93();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt257 += 2;
			local34.anInt257 += local43.method91() * local43.method91();
			local43.anInt257++;
		}
		this.anInt363 = local43.method89();
		this.anInt364 = local43.method89();
		this.anInt361 = local43.method91();
		this.anInt362 = local43.method91();
		@Pc(129) int local129 = local43.method89();
		@Pc(135) int local135 = this.anInt361 * this.anInt362;
		this.aByteArray10 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray10[local143] = local34.method90();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt361; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt362; local165++) {
					this.aByteArray10[local143 + local165 * this.anInt361] = local34.method90();
				}
			}
		}
	}

	@OriginalMember(owner = "client!KZTQXFDC", name = "c", descriptor = "(I)V")
	public void method199() {
		try {
			this.anInt365 /= 2;
			this.anInt366 /= 2;
			@Pc(26) byte[] local26 = new byte[this.anInt365 * this.anInt366];
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < this.anInt362; local30++) {
				for (@Pc(34) int local34 = 0; local34 < this.anInt361; local34++) {
					local26[(local34 + this.anInt363 >> 1) + (local30 + this.anInt364 >> 1) * this.anInt365] = this.aByteArray10[local28++];
				}
			}
			this.aByteArray10 = local26;
			this.anInt361 = this.anInt365;
			this.anInt362 = this.anInt366;
			this.anInt363 = 0;
			this.anInt364 = 0;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("82243, " + 7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZTQXFDC", name = "d", descriptor = "(I)V")
	public void method200() {
		try {
			if (this.anInt361 != this.anInt365 || this.anInt362 != this.anInt366) {
				@Pc(19) byte[] local19 = new byte[this.anInt365 * this.anInt366];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt362; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt361; local27++) {
						local19[local27 + this.anInt363 + (local23 + this.anInt364) * this.anInt365] = this.aByteArray10[local21++];
					}
				}
				this.aByteArray10 = local19;
				this.anInt361 = this.anInt365;
				this.anInt362 = this.anInt366;
				this.anInt363 = 0;
				this.anInt364 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("82393, " + -10722 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZTQXFDC", name = "e", descriptor = "(I)V")
	public void method201() {
		try {
			@Pc(12) byte[] local12 = new byte[this.anInt361 * this.anInt362];
			@Pc(14) int local14 = 0;
			for (@Pc(16) int local16 = 0; local16 < this.anInt362; local16++) {
				for (@Pc(23) int local23 = this.anInt361 - 1; local23 >= 0; local23--) {
					local12[local14++] = this.aByteArray10[local23 + local16 * this.anInt361];
				}
			}
			this.aByteArray10 = local12;
			this.anInt363 = this.anInt365 - this.anInt361 - this.anInt363;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("10312, " + 5496 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZTQXFDC", name = "a", descriptor = "(Z)V")
	public void method202() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt361 * this.anInt362];
			@Pc(13) int local13 = 0;
			for (@Pc(18) int local18 = this.anInt362 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt361; local22++) {
					local8[local13++] = this.aByteArray10[local22 + local18 * this.anInt361];
				}
			}
			this.aByteArray10 = local8;
			this.anInt364 = this.anInt366 - this.anInt362 - this.anInt364;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("21769, " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZTQXFDC", name = "a", descriptor = "(IIII)V")
	public void method203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray53.length; local3++) {
				@Pc(14) int local14 = this.anIntArray53[local3] >> 16 & 0xFF;
				local14 += arg1;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray53[local3] >> 8 & 0xFF;
				local38 += arg2;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray53[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray53[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("80680, " + arg0 + ", " + arg1 + ", " + 307 + ", " + arg2 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZTQXFDC", name = "a", descriptor = "(IZI)V")
	public void method204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt363;
			arg0 += this.anInt364;
			@Pc(15) int local15 = arg1 + arg0 * Class3_Sub1_Sub3.anInt663;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt362;
			@Pc(26) int local26 = this.anInt361;
			@Pc(30) int local30 = Class3_Sub1_Sub3.anInt663 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class3_Sub1_Sub3.anInt665) {
				local39 = Class3_Sub1_Sub3.anInt665 - arg0;
				local23 -= local39;
				arg0 = Class3_Sub1_Sub3.anInt665;
				local17 = local39 * local26 + 0;
				local15 += local39 * Class3_Sub1_Sub3.anInt663;
			}
			if (arg0 + local23 > Class3_Sub1_Sub3.anInt666) {
				local23 -= arg0 + local23 - Class3_Sub1_Sub3.anInt666;
			}
			if (arg1 < Class3_Sub1_Sub3.anInt667) {
				local39 = Class3_Sub1_Sub3.anInt667 - arg1;
				local26 -= local39;
				arg1 = Class3_Sub1_Sub3.anInt667;
				local17 += local39;
				local15 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class3_Sub1_Sub3.anInt668) {
				local39 = arg1 + local26 - Class3_Sub1_Sub3.anInt668;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method205(local32, local23, this.aByteArray10, this.anIntArray53, local30, Class3_Sub1_Sub3.anIntArray162, local17, local15, local26);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("97051, " + arg0 + ", " + true + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KZTQXFDC", name = "a", descriptor = "(II[B[II[IIIII)V")
	private void method205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(12) int local12 = -(arg8 >> 2);
			@Pc(17) int local17 = -(arg8 & 0x3);
			for (@Pc(20) int local20 = -arg1; local20 < 0; local20++) {
				for (@Pc(24) int local24 = local12; local24 < 0; local24++) {
					@Pc(31) byte local31 = arg2[arg6++];
					if (local31 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg3[local31 & 0xFF];
					}
					local31 = arg2[arg6++];
					if (local31 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg3[local31 & 0xFF];
					}
					local31 = arg2[arg6++];
					if (local31 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg3[local31 & 0xFF];
					}
					local31 = arg2[arg6++];
					if (local31 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg3[local31 & 0xFF];
					}
				}
				for (@Pc(107) int local107 = local17; local107 < 0; local107++) {
					@Pc(114) byte local114 = arg2[arg6++];
					if (local114 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg3[local114 & 0xFF];
					}
				}
				arg7 += arg4;
				arg6 += arg0;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("9402, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -22274 + ", " + arg7 + ", " + arg8 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
