import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UZETOFZZ")
public final class Class6_Sub2_Sub2_Sub3 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!UZETOFZZ", name = "G", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!UZETOFZZ", name = "B", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!UZETOFZZ", name = "C", descriptor = "I")
	private int anInt600 = -962;

	@OriginalMember(owner = "client!UZETOFZZ", name = "D", descriptor = "I")
	private int anInt601 = -447;

	@OriginalMember(owner = "client!UZETOFZZ", name = "E", descriptor = "I")
	private int anInt602 = -171;

	@OriginalMember(owner = "client!UZETOFZZ", name = "F", descriptor = "I")
	private int anInt603 = 43335;

	@OriginalMember(owner = "client!UZETOFZZ", name = "N", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!UZETOFZZ", name = "O", descriptor = "I")
	private int anInt610;

	@OriginalMember(owner = "client!UZETOFZZ", name = "I", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!UZETOFZZ", name = "L", descriptor = "I")
	public int anInt607;

	@OriginalMember(owner = "client!UZETOFZZ", name = "M", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!UZETOFZZ", name = "J", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!UZETOFZZ", name = "K", descriptor = "I")
	public int anInt606;

	@OriginalMember(owner = "client!UZETOFZZ", name = "H", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!UZETOFZZ", name = "<init>", descriptor = "(Lclient!RSPRYUFS;Ljava/lang/String;I)V")
	public Class6_Sub2_Sub2_Sub3(@OriginalArg(0) Class37 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class6_Sub2_Sub3 local34 = new Class6_Sub2_Sub3(-587, arg0.method358(arg1 + ".dat", null));
		@Pc(43) Class6_Sub2_Sub3 local43 = new Class6_Sub2_Sub3(-587, arg0.method358("index.dat", null));
		local43.anInt404 = local34.method264();
		this.anInt609 = local43.method264();
		this.anInt610 = local43.method264();
		@Pc(58) int local58 = local43.method262();
		this.anIntArray172 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray172[local64 + 1] = local43.method266();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt404 += 2;
			local34.anInt404 += local43.method264() * local43.method264();
			local43.anInt404++;
		}
		this.anInt607 = local43.method262();
		this.anInt608 = local43.method262();
		this.anInt605 = local43.method264();
		this.anInt606 = local43.method264();
		@Pc(129) int local129 = local43.method262();
		@Pc(135) int local135 = this.anInt605 * this.anInt606;
		this.aByteArray13 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray13[local143] = local34.method263();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt605; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt606; local165++) {
					this.aByteArray13[local143 + local165 * this.anInt605] = local34.method263();
				}
			}
		}
	}

	@OriginalMember(owner = "client!UZETOFZZ", name = "b", descriptor = "(I)V")
	public void method483() {
		try {
			this.anInt609 /= 2;
			this.anInt610 /= 2;
			@Pc(29) byte[] local29 = new byte[this.anInt609 * this.anInt610];
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < this.anInt606; local33++) {
				for (@Pc(37) int local37 = 0; local37 < this.anInt605; local37++) {
					local29[(local37 + this.anInt607 >> 1) + (local33 + this.anInt608 >> 1) * this.anInt609] = this.aByteArray13[local31++];
				}
			}
			this.aByteArray13 = local29;
			this.anInt605 = this.anInt609;
			this.anInt606 = this.anInt610;
			this.anInt607 = 0;
			this.anInt608 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("84283, " + -962 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZETOFZZ", name = "c", descriptor = "(I)V")
	public void method484() {
		try {
			if (this.anInt605 != this.anInt609 || this.anInt606 != this.anInt610) {
				@Pc(19) byte[] local19 = new byte[this.anInt609 * this.anInt610];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt606; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt605; local27++) {
						local19[local27 + this.anInt607 + (local23 + this.anInt608) * this.anInt609] = this.aByteArray13[local21++];
					}
				}
				this.aByteArray13 = local19;
				this.anInt605 = this.anInt609;
				this.anInt606 = this.anInt610;
				this.anInt607 = 0;
				this.anInt608 = 0;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("57869, " + -447 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZETOFZZ", name = "a", descriptor = "(Z)V")
	public void method485() {
		try {
			@Pc(13) byte[] local13 = new byte[this.anInt605 * this.anInt606];
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < this.anInt606; local17++) {
				for (@Pc(24) int local24 = this.anInt605 - 1; local24 >= 0; local24--) {
					local13[local15++] = this.aByteArray13[local24 + local17 * this.anInt605];
				}
			}
			this.aByteArray13 = local13;
			this.anInt607 = this.anInt609 - this.anInt605 - this.anInt607;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("36878, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZETOFZZ", name = "b", descriptor = "(Z)V")
	public void method486() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt605 * this.anInt606];
			@Pc(13) int local13 = 0;
			for (@Pc(18) int local18 = this.anInt606 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt605; local22++) {
					local8[local13++] = this.aByteArray13[local22 + local18 * this.anInt605];
				}
			}
			this.aByteArray13 = local8;
			this.anInt608 = this.anInt610 - this.anInt606 - this.anInt608;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("47952, " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZETOFZZ", name = "a", descriptor = "(IIII)V")
	public void method487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray172.length; local3++) {
				@Pc(14) int local14 = this.anIntArray172[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray172[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray172[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray172[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("56220, " + arg0 + ", " + 568 + ", " + arg1 + ", " + arg2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZETOFZZ", name = "a", descriptor = "(III)V")
	public void method488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt607;
			arg0 += this.anInt608;
			@Pc(25) int local25 = arg1 + arg0 * Class6_Sub2_Sub2.anInt802;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt606;
			@Pc(33) int local33 = this.anInt605;
			@Pc(37) int local37 = Class6_Sub2_Sub2.anInt802 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class6_Sub2_Sub2.anInt804) {
				local46 = Class6_Sub2_Sub2.anInt804 - arg0;
				local30 -= local46;
				arg0 = Class6_Sub2_Sub2.anInt804;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class6_Sub2_Sub2.anInt802;
			}
			if (arg0 + local30 > Class6_Sub2_Sub2.anInt805) {
				local30 -= arg0 + local30 - Class6_Sub2_Sub2.anInt805;
			}
			if (arg1 < Class6_Sub2_Sub2.anInt806) {
				local46 = Class6_Sub2_Sub2.anInt806 - arg1;
				local33 -= local46;
				arg1 = Class6_Sub2_Sub2.anInt806;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class6_Sub2_Sub2.anInt807) {
				local46 = arg1 + local33 - Class6_Sub2_Sub2.anInt807;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method489(this.aByteArray13, local39, local25, local30, local33, Class6_Sub2_Sub2.anIntArray201, local37, this.anIntArray172, local27);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("74565, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UZETOFZZ", name = "a", descriptor = "([BIBIII[II[II)V")
	private void method489(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(20) int local20 = -arg3; local20 < 0; local20++) {
				for (@Pc(24) int local24 = local6; local24 < 0; local24++) {
					@Pc(31) byte local31 = arg0[arg8++];
					if (local31 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg7[local31 & 0xFF];
					}
					local31 = arg0[arg8++];
					if (local31 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg7[local31 & 0xFF];
					}
					local31 = arg0[arg8++];
					if (local31 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg7[local31 & 0xFF];
					}
					local31 = arg0[arg8++];
					if (local31 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg7[local31 & 0xFF];
					}
				}
				for (@Pc(107) int local107 = local11; local107 < 0; local107++) {
					@Pc(114) byte local114 = arg0[arg8++];
					if (local114 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg7[local114 & 0xFF];
					}
				}
				arg2 += arg6;
				arg8 += arg1;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("11309, " + arg0 + ", " + arg1 + ", " + -94 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
