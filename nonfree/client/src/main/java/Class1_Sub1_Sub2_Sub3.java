import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt692 = 315;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt693 = -46;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	private int anInt694 = -112;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	public int anInt699;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt697;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt698;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt695;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt696;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(-49365, arg0.method666(arg1 + ".dat", null));
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(-49365, arg0.method666("index.dat", null));
		local40.anInt763 = local31.method482();
		this.anInt699 = local40.method482();
		this.anInt700 = local40.method482();
		@Pc(55) int local55 = local40.method480();
		this.anIntArray212 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray212[local61 + 1] = local40.method484();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt763 += 2;
			local31.anInt763 += local40.method482() * local40.method482();
			local40.anInt763++;
		}
		this.anInt697 = local40.method480();
		this.anInt698 = local40.method480();
		this.anInt695 = local40.method482();
		this.anInt696 = local40.method482();
		@Pc(126) int local126 = local40.method480();
		@Pc(132) int local132 = this.anInt695 * this.anInt696;
		this.aByteArray7 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray7[local140] = local31.method481();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt695; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt696; local162++) {
					this.aByteArray7[local140 + local162 * this.anInt695] = local31.method481();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Z)V")
	public void method413() {
		try {
			this.anInt699 /= 2;
			this.anInt700 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt699 * this.anInt700];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt696; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt695; local28++) {
					local20[(local28 + this.anInt697 >> 1) + (local24 + this.anInt698 >> 1) * this.anInt699] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt695 = this.anInt699;
			this.anInt696 = this.anInt700;
			this.anInt697 = 0;
			this.anInt698 = 0;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("93421, " + false + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method414() {
		try {
			if (this.anInt695 != this.anInt699 || this.anInt696 != this.anInt700) {
				@Pc(19) byte[] local19 = new byte[this.anInt699 * this.anInt700];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt696; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt695; local27++) {
						local19[local27 + this.anInt697 + (local23 + this.anInt698) * this.anInt699] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt695 = this.anInt699;
				this.anInt696 = this.anInt700;
				this.anInt697 = 0;
				this.anInt698 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("30807, " + 33065 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method415(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt695 * this.anInt696];
			if (arg0 == 3) {
				@Pc(13) boolean local13 = false;
				@Pc(17) int local17 = 0;
				for (@Pc(19) int local19 = 0; local19 < this.anInt696; local19++) {
					for (@Pc(27) int local27 = this.anInt695 - 1; local27 >= 0; local27--) {
						local8[local17++] = this.aByteArray7[local27 + local19 * this.anInt695];
					}
				}
				this.aByteArray7 = local8;
				this.anInt697 = this.anInt699 - this.anInt695 - this.anInt697;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("33844, " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public void method416(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(23) byte[] local23 = new byte[this.anInt695 * this.anInt696];
			@Pc(25) int local25 = 0;
			for (@Pc(30) int local30 = this.anInt696 - 1; local30 >= 0; local30--) {
				for (@Pc(34) int local34 = 0; local34 < this.anInt695; local34++) {
					local23[local25++] = this.aByteArray7[local34 + local30 * this.anInt695];
				}
			}
			this.aByteArray7 = local23;
			this.anInt698 = this.anInt700 - this.anInt696 - this.anInt698;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("26142, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray212.length; local8++) {
				@Pc(19) int local19 = this.anIntArray212[local8] >> 16 & 0xFF;
				local19 += arg0;
				if (local19 < 0) {
					local19 = 0;
				} else if (local19 > 255) {
					local19 = 255;
				}
				@Pc(43) int local43 = this.anIntArray212[local8] >> 8 & 0xFF;
				local43 += arg1;
				if (local43 < 0) {
					local43 = 0;
				} else if (local43 > 255) {
					local43 = 255;
				}
				@Pc(65) int local65 = this.anIntArray212[local8] & 0xFF;
				local65 += arg2;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 255) {
					local65 = 255;
				}
				this.anIntArray212[local8] = (local19 << 16) + (local43 << 8) + local65;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("35885, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 908 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZI)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt697;
			arg1 += this.anInt698;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt719;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt696;
			@Pc(26) int local26 = this.anInt695;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt719 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub1_Sub2.anInt721) {
				local39 = Class1_Sub1_Sub2.anInt721 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt721;
				local17 = local39 * local26 + 0;
				local15 += local39 * Class1_Sub1_Sub2.anInt719;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt722) {
				local23 -= arg1 + local23 - Class1_Sub1_Sub2.anInt722;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt723) {
				local39 = Class1_Sub1_Sub2.anInt723 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt723;
				local17 += local39;
				local15 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub1_Sub2.anInt724) {
				local39 = arg0 + local26 - Class1_Sub1_Sub2.anInt724;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method419(local17, local23, this.anIntArray212, local15, this.aByteArray7, local30, local26, Class1_Sub1_Sub2.anIntArray213, local32);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("16755, " + arg0 + ", " + true + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[IIB[BII[II)V")
	private void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(17) int local17 = -(arg6 & 0x3);
			for (@Pc(20) int local20 = -arg1; local20 < 0; local20++) {
				for (@Pc(24) int local24 = local6; local24 < 0; local24++) {
					@Pc(31) byte local31 = arg4[arg0++];
					if (local31 == 0) {
						arg3++;
					} else {
						arg7[arg3++] = arg2[local31 & 0xFF];
					}
					local31 = arg4[arg0++];
					if (local31 == 0) {
						arg3++;
					} else {
						arg7[arg3++] = arg2[local31 & 0xFF];
					}
					local31 = arg4[arg0++];
					if (local31 == 0) {
						arg3++;
					} else {
						arg7[arg3++] = arg2[local31 & 0xFF];
					}
					local31 = arg4[arg0++];
					if (local31 == 0) {
						arg3++;
					} else {
						arg7[arg3++] = arg2[local31 & 0xFF];
					}
				}
				for (@Pc(107) int local107 = local17; local107 < 0; local107++) {
					@Pc(114) byte local114 = arg4[arg0++];
					if (local114 == 0) {
						arg3++;
					} else {
						arg7[arg3++] = arg2[local114 & 0xFF];
					}
				}
				arg3 += arg5;
				arg0 += arg8;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("72280, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 7 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
