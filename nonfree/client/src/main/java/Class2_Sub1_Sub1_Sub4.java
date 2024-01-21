import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KYEPSAQL")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!KYEPSAQL", name = "z", descriptor = "I")
	private int anInt290 = 345;

	@OriginalMember(owner = "client!KYEPSAQL", name = "B", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!KYEPSAQL", name = "C", descriptor = "I")
	private int anInt291 = 7;

	@OriginalMember(owner = "client!KYEPSAQL", name = "D", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!KYEPSAQL", name = "E", descriptor = "B")
	private byte aByte28 = 0;

	@OriginalMember(owner = "client!KYEPSAQL", name = "F", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!KYEPSAQL", name = "M", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!KYEPSAQL", name = "N", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!KYEPSAQL", name = "H", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!KYEPSAQL", name = "K", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!KYEPSAQL", name = "L", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!KYEPSAQL", name = "I", descriptor = "I")
	public int anInt292;

	@OriginalMember(owner = "client!KYEPSAQL", name = "J", descriptor = "I")
	public int anInt293;

	@OriginalMember(owner = "client!KYEPSAQL", name = "G", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!KYEPSAQL", name = "<init>", descriptor = "(Lclient!SMIVAFST;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub1_Sub4(@OriginalArg(0) Class35 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class2_Sub1_Sub2 local37 = new Class2_Sub1_Sub2(arg0.method485(arg1 + ".dat", null), (byte) 3);
		@Pc(46) Class2_Sub1_Sub2 local46 = new Class2_Sub1_Sub2(arg0.method485("index.dat", null), (byte) 3);
		local46.anInt81 = local37.method96();
		this.anInt296 = local46.method96();
		this.anInt297 = local46.method96();
		@Pc(61) int local61 = local46.method94();
		this.anIntArray69 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray69[local67 + 1] = local46.method98();
		}
		for (@Pc(85) int local85 = 0; local85 < arg2; local85++) {
			local46.anInt81 += 2;
			local37.anInt81 += local46.method96() * local46.method96();
			local46.anInt81++;
		}
		this.anInt294 = local46.method94();
		this.anInt295 = local46.method94();
		this.anInt292 = local46.method96();
		this.anInt293 = local46.method96();
		@Pc(132) int local132 = local46.method94();
		@Pc(138) int local138 = this.anInt292 * this.anInt293;
		this.aByteArray10 = new byte[local138];
		@Pc(146) int local146;
		if (local132 == 0) {
			for (local146 = 0; local146 < local138; local146++) {
				this.aByteArray10[local146] = local37.method95();
			}
		} else if (local132 == 1) {
			for (local146 = 0; local146 < this.anInt292; local146++) {
				for (@Pc(168) int local168 = 0; local168 < this.anInt293; local168++) {
					this.aByteArray10[local146 + local168 * this.anInt292] = local37.method95();
				}
			}
		}
	}

	@OriginalMember(owner = "client!KYEPSAQL", name = "a", descriptor = "(Z)V")
	public void method285() {
		try {
			this.anInt296 /= 2;
			this.anInt297 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt296 * this.anInt297];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt293; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt292; local28++) {
					local20[(local28 + this.anInt294 >> 1) + (local24 + this.anInt295 >> 1) * this.anInt296] = this.aByteArray10[local22++];
				}
			}
			this.aByteArray10 = local20;
			this.anInt292 = this.anInt296;
			this.anInt293 = this.anInt297;
			this.anInt294 = 0;
			this.anInt295 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("97400, " + true + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KYEPSAQL", name = "b", descriptor = "(I)V")
	public void method286(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt292 != this.anInt296 || this.anInt293 != this.anInt297) {
				@Pc(19) byte[] local19 = new byte[this.anInt296 * this.anInt297];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt293; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt292; local27++) {
						local19[local27 + this.anInt294 + (local23 + this.anInt295) * this.anInt296] = this.aByteArray10[local21++];
					}
				}
				this.aByteArray10 = local19;
				this.anInt292 = this.anInt296;
				if (arg0 == 40711) {
					this.anInt293 = this.anInt297;
					this.anInt294 = 0;
					this.anInt295 = 0;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("1256, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KYEPSAQL", name = "b", descriptor = "(Z)V")
	public void method287() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt292 * this.anInt293];
			@Pc(10) int local10 = 0;
			for (@Pc(22) int local22 = 0; local22 < this.anInt293; local22++) {
				for (@Pc(29) int local29 = this.anInt292 - 1; local29 >= 0; local29--) {
					local8[local10++] = this.aByteArray10[local29 + local22 * this.anInt292];
				}
			}
			this.aByteArray10 = local8;
			this.anInt294 = this.anInt296 - this.anInt292 - this.anInt294;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("72074, " + false + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KYEPSAQL", name = "c", descriptor = "(I)V")
	public void method288() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt292 * this.anInt293];
			@Pc(10) int local10 = 0;
			for (@Pc(18) int local18 = this.anInt293 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt292; local22++) {
					local8[local10++] = this.aByteArray10[local22 + local18 * this.anInt292];
				}
			}
			this.aByteArray10 = local8;
			this.anInt295 = this.anInt297 - this.anInt293 - this.anInt295;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("64958, " + -972 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KYEPSAQL", name = "a", descriptor = "(IIIZ)V")
	public void method289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray69.length; local3++) {
				@Pc(14) int local14 = this.anIntArray69[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray69[local3] >> 8 & 0xFF;
				local38 += arg2;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray69[local3] & 0xFF;
				local60 += arg1;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray69[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("99315, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KYEPSAQL", name = "a", descriptor = "(IBI)V")
	public void method290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt294;
			arg0 += this.anInt295;
			@Pc(15) int local15 = arg1 + arg0 * Class2_Sub1_Sub1.anInt281;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt293;
			@Pc(23) int local23 = this.anInt292;
			@Pc(27) int local27 = Class2_Sub1_Sub1.anInt281 - local23;
			@Pc(29) int local29 = 0;
			@Pc(43) int local43;
			if (arg0 < Class2_Sub1_Sub1.anInt283) {
				local43 = Class2_Sub1_Sub1.anInt283 - arg0;
				local20 -= local43;
				arg0 = Class2_Sub1_Sub1.anInt283;
				local17 = local43 * local23 + 0;
				local15 += local43 * Class2_Sub1_Sub1.anInt281;
			}
			if (arg0 + local20 > Class2_Sub1_Sub1.anInt284) {
				local20 -= arg0 + local20 - Class2_Sub1_Sub1.anInt284;
			}
			if (arg1 < Class2_Sub1_Sub1.anInt285) {
				local43 = Class2_Sub1_Sub1.anInt285 - arg1;
				local23 -= local43;
				arg1 = Class2_Sub1_Sub1.anInt285;
				local17 += local43;
				local15 += local43;
				local29 = local43 + 0;
				local27 += local43;
			}
			if (arg1 + local23 > Class2_Sub1_Sub1.anInt286) {
				local43 = arg1 + local23 - Class2_Sub1_Sub1.anInt286;
				local23 -= local43;
				local29 += local43;
				local27 += local43;
			}
			if (local23 > 0 && local20 > 0) {
				this.method291(this.aBoolean108, local17, this.anIntArray69, local23, local20, local27, local29, this.aByteArray10, Class2_Sub1_Sub1.anIntArray68, local15);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("44590, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KYEPSAQL", name = "a", descriptor = "(ZI[IIIII[B[II)V")
	private void method291(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			for (@Pc(14) int local14 = -arg4; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg7[arg1++];
					if (local25 == 0) {
						arg9++;
					} else {
						arg8[arg9++] = arg2[local25 & 0xFF];
					}
					local25 = arg7[arg1++];
					if (local25 == 0) {
						arg9++;
					} else {
						arg8[arg9++] = arg2[local25 & 0xFF];
					}
					local25 = arg7[arg1++];
					if (local25 == 0) {
						arg9++;
					} else {
						arg8[arg9++] = arg2[local25 & 0xFF];
					}
					local25 = arg7[arg1++];
					if (local25 == 0) {
						arg9++;
					} else {
						arg8[arg9++] = arg2[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg7[arg1++];
					if (local108 == 0) {
						arg9++;
					} else {
						arg8[arg9++] = arg2[local108 & 0xFF];
					}
				}
				arg9 += arg5;
				arg1 += arg6;
			}
			if (arg0) {
				;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("75577, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
