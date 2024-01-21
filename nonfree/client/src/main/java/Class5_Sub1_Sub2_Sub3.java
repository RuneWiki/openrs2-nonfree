import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VSJQVIFL")
public final class Class5_Sub1_Sub2_Sub3 extends Class5_Sub1_Sub2 {

	@OriginalMember(owner = "client!VSJQVIFL", name = "x", descriptor = "I")
	private int anInt610 = 6;

	@OriginalMember(owner = "client!VSJQVIFL", name = "y", descriptor = "B")
	private byte aByte21 = 2;

	@OriginalMember(owner = "client!VSJQVIFL", name = "z", descriptor = "I")
	private int anInt611 = -42286;

	@OriginalMember(owner = "client!VSJQVIFL", name = "A", descriptor = "I")
	private int anInt612 = -207;

	@OriginalMember(owner = "client!VSJQVIFL", name = "B", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!VSJQVIFL", name = "I", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!VSJQVIFL", name = "J", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!VSJQVIFL", name = "D", descriptor = "[I")
	public int[] anIntArray116;

	@OriginalMember(owner = "client!VSJQVIFL", name = "G", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!VSJQVIFL", name = "H", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!VSJQVIFL", name = "E", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!VSJQVIFL", name = "F", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!VSJQVIFL", name = "C", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!VSJQVIFL", name = "<init>", descriptor = "(Lclient!MJLXHQTQ;Ljava/lang/String;I)V")
	public Class5_Sub1_Sub2_Sub3(@OriginalArg(0) Class31 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class5_Sub1_Sub4 local34 = new Class5_Sub1_Sub4(arg0.method227(arg1 + ".dat", null), -82);
		@Pc(43) Class5_Sub1_Sub4 local43 = new Class5_Sub1_Sub4(arg0.method227("index.dat", null), -82);
		local43.anInt755 = local34.method439();
		this.anInt617 = local43.method439();
		this.anInt618 = local43.method439();
		@Pc(58) int local58 = local43.method437();
		this.anIntArray116 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray116[local64 + 1] = local43.method441();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt755 += 2;
			local34.anInt755 += local43.method439() * local43.method439();
			local43.anInt755++;
		}
		this.anInt615 = local43.method437();
		this.anInt616 = local43.method437();
		this.anInt613 = local43.method439();
		this.anInt614 = local43.method439();
		@Pc(129) int local129 = local43.method437();
		@Pc(135) int local135 = this.anInt613 * this.anInt614;
		this.aByteArray13 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray13[local143] = local34.method438();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt613; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt614; local165++) {
					this.aByteArray13[local143 + local165 * this.anInt613] = local34.method438();
				}
			}
		}
	}

	@OriginalMember(owner = "client!VSJQVIFL", name = "b", descriptor = "(I)V")
	public void method321(@OriginalArg(0) int arg0) {
		try {
			this.anInt617 /= 2;
			this.anInt618 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt617 * this.anInt618];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt614; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt613; local28++) {
					local20[(local28 + this.anInt615 >> 1) + (local24 + this.anInt616 >> 1) * this.anInt617] = this.aByteArray13[local22++];
				}
			}
			this.aByteArray13 = local20;
			if (arg0 > 0) {
				this.anInt613 = this.anInt617;
				this.anInt614 = this.anInt618;
				this.anInt615 = 0;
				this.anInt616 = 0;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("49954, " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSJQVIFL", name = "c", descriptor = "(I)V")
	public void method322() {
		try {
			if (this.anInt613 != this.anInt617 || this.anInt614 != this.anInt618) {
				@Pc(19) byte[] local19 = new byte[this.anInt617 * this.anInt618];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt614; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt613; local27++) {
						local19[local27 + this.anInt615 + (local23 + this.anInt616) * this.anInt617] = this.aByteArray13[local21++];
					}
				}
				this.aByteArray13 = local19;
				this.anInt613 = this.anInt617;
				this.anInt614 = this.anInt618;
				this.anInt615 = 0;
				this.anInt616 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("61445, " + 46806 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSJQVIFL", name = "d", descriptor = "(I)V")
	public void method323() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt613 * this.anInt614];
			@Pc(10) int local10 = 0;
			for (@Pc(21) int local21 = 0; local21 < this.anInt614; local21++) {
				for (@Pc(28) int local28 = this.anInt613 - 1; local28 >= 0; local28--) {
					local8[local10++] = this.aByteArray13[local28 + local21 * this.anInt613];
				}
			}
			this.aByteArray13 = local8;
			this.anInt615 = this.anInt617 - this.anInt613 - this.anInt615;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("852, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSJQVIFL", name = "b", descriptor = "(B)V")
	public void method324() {
		try {
			@Pc(12) byte[] local12 = new byte[this.anInt613 * this.anInt614];
			@Pc(14) int local14 = 0;
			for (@Pc(19) int local19 = this.anInt614 - 1; local19 >= 0; local19--) {
				for (@Pc(23) int local23 = 0; local23 < this.anInt613; local23++) {
					local12[local14++] = this.aByteArray13[local23 + local19 * this.anInt613];
				}
			}
			this.aByteArray13 = local12;
			this.anInt616 = this.anInt618 - this.anInt614 - this.anInt616;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("82197, " + 8 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSJQVIFL", name = "a", descriptor = "(IZII)V")
	public void method325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray116.length; local12++) {
				@Pc(23) int local23 = this.anIntArray116[local12] >> 16 & 0xFF;
				local23 += arg1;
				if (local23 < 0) {
					local23 = 0;
				} else if (local23 > 255) {
					local23 = 255;
				}
				@Pc(47) int local47 = this.anIntArray116[local12] >> 8 & 0xFF;
				local47 += arg2;
				if (local47 < 0) {
					local47 = 0;
				} else if (local47 > 255) {
					local47 = 255;
				}
				@Pc(69) int local69 = this.anIntArray116[local12] & 0xFF;
				local69 += arg0;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 255) {
					local69 = 255;
				}
				this.anIntArray116[local12] = (local23 << 16) + (local47 << 8) + local69;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("23406, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSJQVIFL", name = "a", descriptor = "(IZI)V")
	public void method326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt615;
			arg0 += this.anInt616;
			@Pc(20) int local20 = arg1 + arg0 * Class5_Sub1_Sub2.anInt622;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt614;
			@Pc(28) int local28 = this.anInt613;
			@Pc(32) int local32 = Class5_Sub1_Sub2.anInt622 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg0 < Class5_Sub1_Sub2.anInt624) {
				local41 = Class5_Sub1_Sub2.anInt624 - arg0;
				local25 -= local41;
				arg0 = Class5_Sub1_Sub2.anInt624;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class5_Sub1_Sub2.anInt622;
			}
			if (arg0 + local25 > Class5_Sub1_Sub2.anInt625) {
				local25 -= arg0 + local25 - Class5_Sub1_Sub2.anInt625;
			}
			if (arg1 < Class5_Sub1_Sub2.anInt626) {
				local41 = Class5_Sub1_Sub2.anInt626 - arg1;
				local28 -= local41;
				arg1 = Class5_Sub1_Sub2.anInt626;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg1 + local28 > Class5_Sub1_Sub2.anInt627) {
				local41 = arg1 + local28 - Class5_Sub1_Sub2.anInt627;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method327(this.anIntArray116, local28, Class5_Sub1_Sub2.anIntArray117, local32, local25, local20, local34, this.aByteArray13, local22);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("55404, " + arg0 + ", " + false + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSJQVIFL", name = "a", descriptor = "([II[IIIIII[BI)V")
	private void method327(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(24) int local24 = -arg4; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg7[arg8++];
					if (local35 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg0[local35 & 0xFF];
					}
					local35 = arg7[arg8++];
					if (local35 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg0[local35 & 0xFF];
					}
					local35 = arg7[arg8++];
					if (local35 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg0[local35 & 0xFF];
					}
					local35 = arg7[arg8++];
					if (local35 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg0[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local11; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg7[arg8++];
					if (local118 == 0) {
						arg5++;
					} else {
						arg2[arg5++] = arg0[local118 & 0xFF];
					}
				}
				arg5 += arg3;
				arg8 += arg6;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("28235, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
