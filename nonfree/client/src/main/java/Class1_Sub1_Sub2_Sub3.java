import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	private int anInt673 = 4;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private int anInt674 = 19987;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "B")
	private byte aByte25 = -37;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt675 = 8;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt676 = -760;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(arg0.method666(arg1 + ".dat", null), 58);
		@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3(arg0.method666("index.dat", null), 58);
		local49.anInt742 = local40.method482();
		this.anInt681 = local49.method482();
		this.anInt682 = local49.method482();
		@Pc(64) int local64 = local49.method480();
		this.anIntArray212 = new int[local64];
		for (@Pc(70) int local70 = 0; local70 < local64 - 1; local70++) {
			this.anIntArray212[local70 + 1] = local49.method484();
		}
		for (@Pc(94) int local94 = 0; local94 < arg2; local94++) {
			local49.anInt742 += 2;
			local40.anInt742 += local49.method482() * local49.method482();
			local49.anInt742++;
		}
		this.anInt679 = local49.method480();
		this.anInt680 = local49.method480();
		this.anInt677 = local49.method482();
		this.anInt678 = local49.method482();
		@Pc(141) int local141 = local49.method480();
		@Pc(147) int local147 = this.anInt677 * this.anInt678;
		this.aByteArray7 = new byte[local147];
		@Pc(155) int local155;
		if (local141 == 0) {
			for (local155 = 0; local155 < local147; local155++) {
				this.aByteArray7[local155] = local40.method481();
			}
		} else if (local141 == 1) {
			for (local155 = 0; local155 < this.anInt677; local155++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt678; local177++) {
					this.aByteArray7[local155 + local177 * this.anInt677] = local40.method481();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Z)V")
	public void method413() {
		try {
			this.anInt681 /= 2;
			this.anInt682 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt681 * this.anInt682];
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < this.anInt678; local33++) {
				for (@Pc(37) int local37 = 0; local37 < this.anInt677; local37++) {
					local20[(local37 + this.anInt679 >> 1) + (local33 + this.anInt680 >> 1) * this.anInt681] = this.aByteArray7[local31++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt677 = this.anInt681;
			this.anInt678 = this.anInt682;
			this.anInt679 = 0;
			this.anInt680 = 0;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("67300, " + false + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method414(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt677 != this.anInt681 || this.anInt678 != this.anInt682) {
				@Pc(19) byte[] local19 = new byte[this.anInt681 * this.anInt682];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt678; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt677; local27++) {
						local19[local27 + this.anInt679 + (local23 + this.anInt680) * this.anInt681] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt677 = this.anInt681;
				this.anInt678 = this.anInt682;
				this.anInt679 = 0;
				if (arg0 < 0) {
					this.anInt680 = 0;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("11293, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method415() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt677 * this.anInt678];
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < this.anInt678; local18++) {
				for (@Pc(25) int local25 = this.anInt677 - 1; local25 >= 0; local25--) {
					local8[local16++] = this.aByteArray7[local25 + local18 * this.anInt677];
				}
			}
			this.aByteArray7 = local8;
			this.anInt679 = this.anInt681 - this.anInt677 - this.anInt679;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("45977, " + -3417 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(Z)V")
	public void method416() {
		try {
			@Pc(11) byte[] local11 = new byte[this.anInt677 * this.anInt678];
			@Pc(13) int local13 = 0;
			for (@Pc(18) int local18 = this.anInt678 - 1; local18 >= 0; local18--) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt677; local22++) {
					local11[local13++] = this.aByteArray7[local22 + local18 * this.anInt677];
				}
			}
			this.aByteArray7 = local11;
			this.anInt680 = this.anInt682 - this.anInt678 - this.anInt680;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("66436, " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray212.length; local14++) {
				@Pc(25) int local25 = this.anIntArray212[local14] >> 16 & 0xFF;
				local25 += arg0;
				if (local25 < 0) {
					local25 = 0;
				} else if (local25 > 255) {
					local25 = 255;
				}
				@Pc(49) int local49 = this.anIntArray212[local14] >> 8 & 0xFF;
				local49 += arg2;
				if (local49 < 0) {
					local49 = 0;
				} else if (local49 > 255) {
					local49 = 255;
				}
				@Pc(71) int local71 = this.anIntArray212[local14] & 0xFF;
				local71 += arg1;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 255) {
					local71 = 255;
				}
				this.anIntArray212[local14] = (local25 << 16) + (local49 << 8) + local71;
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("42788, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -45258 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZII)V")
	public void method418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt679;
			arg1 += this.anInt680;
			@Pc(20) int local20 = arg0 + arg1 * Class1_Sub1_Sub2.anInt696;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt678;
			@Pc(28) int local28 = this.anInt677;
			@Pc(32) int local32 = Class1_Sub1_Sub2.anInt696 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub1_Sub2.anInt698) {
				local41 = Class1_Sub1_Sub2.anInt698 - arg1;
				local25 -= local41;
				arg1 = Class1_Sub1_Sub2.anInt698;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg1 + local25 > Class1_Sub1_Sub2.anInt699) {
				local25 -= arg1 + local25 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt700) {
				local41 = Class1_Sub1_Sub2.anInt700 - arg0;
				local28 -= local41;
				arg0 = Class1_Sub1_Sub2.anInt700;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class1_Sub1_Sub2.anInt701) {
				local41 = arg0 + local28 - Class1_Sub1_Sub2.anInt701;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method419(local32, Class1_Sub1_Sub2.anIntArray213, local22, local28, local25, local34, local20, this.anIntArray212, this.aByteArray7);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("17960, " + true + ", " + arg0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIIII[II[B)V")
	private void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) byte[] arg8) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			for (@Pc(17) int local17 = -arg4; local17 < 0; local17++) {
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					@Pc(28) byte local28 = arg8[arg2++];
					if (local28 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg7[local28 & 0xFF];
					}
					local28 = arg8[arg2++];
					if (local28 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg7[local28 & 0xFF];
					}
					local28 = arg8[arg2++];
					if (local28 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg7[local28 & 0xFF];
					}
					local28 = arg8[arg2++];
					if (local28 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg7[local28 & 0xFF];
					}
				}
				for (@Pc(104) int local104 = local11; local104 < 0; local104++) {
					@Pc(111) byte local111 = arg8[arg2++];
					if (local111 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg7[local111 & 0xFF];
					}
				}
				arg6 += arg0;
				arg2 += arg5;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("12002, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -96 + ", " + arg8 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
