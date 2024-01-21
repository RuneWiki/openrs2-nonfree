import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CMELCUKG")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!CMELCUKG", name = "y", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!CMELCUKG", name = "z", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!CMELCUKG", name = "A", descriptor = "I")
	private int anInt97 = -3548;

	@OriginalMember(owner = "client!CMELCUKG", name = "B", descriptor = "I")
	private int anInt98 = 8;

	@OriginalMember(owner = "client!CMELCUKG", name = "C", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!CMELCUKG", name = "D", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!CMELCUKG", name = "K", descriptor = "I")
	public int anInt103;

	@OriginalMember(owner = "client!CMELCUKG", name = "L", descriptor = "I")
	private int anInt104;

	@OriginalMember(owner = "client!CMELCUKG", name = "F", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!CMELCUKG", name = "I", descriptor = "I")
	public int anInt101;

	@OriginalMember(owner = "client!CMELCUKG", name = "J", descriptor = "I")
	public int anInt102;

	@OriginalMember(owner = "client!CMELCUKG", name = "G", descriptor = "I")
	public int anInt99;

	@OriginalMember(owner = "client!CMELCUKG", name = "H", descriptor = "I")
	public int anInt100;

	@OriginalMember(owner = "client!CMELCUKG", name = "E", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!CMELCUKG", name = "<init>", descriptor = "(Lclient!MAARFNGV;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) Class22 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class2_Sub1_Sub3 local37 = new Class2_Sub1_Sub3(arg0.method218(arg1 + ".dat", null), true);
		@Pc(46) Class2_Sub1_Sub3 local46 = new Class2_Sub1_Sub3(arg0.method218("index.dat", null), true);
		local46.anInt136 = local37.method99();
		this.anInt103 = local46.method99();
		this.anInt104 = local46.method99();
		@Pc(61) int local61 = local46.method97();
		this.anIntArray15 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray15[local67 + 1] = local46.method101();
		}
		for (@Pc(91) int local91 = 0; local91 < arg2; local91++) {
			local46.anInt136 += 2;
			local37.anInt136 += local46.method99() * local46.method99();
			local46.anInt136++;
		}
		this.anInt101 = local46.method97();
		this.anInt102 = local46.method97();
		this.anInt99 = local46.method99();
		this.anInt100 = local46.method99();
		@Pc(138) int local138 = local46.method97();
		@Pc(144) int local144 = this.anInt99 * this.anInt100;
		this.aByteArray9 = new byte[local144];
		@Pc(152) int local152;
		if (local138 == 0) {
			for (local152 = 0; local152 < local144; local152++) {
				this.aByteArray9[local152] = local37.method98();
			}
		} else if (local138 == 1) {
			for (local152 = 0; local152 < this.anInt99; local152++) {
				for (@Pc(174) int local174 = 0; local174 < this.anInt100; local174++) {
					this.aByteArray9[local152 + local174 * this.anInt99] = local37.method98();
				}
			}
		}
	}

	@OriginalMember(owner = "client!CMELCUKG", name = "b", descriptor = "(I)V")
	public void method72(@OriginalArg(0) int arg0) {
		try {
			this.anInt103 /= 2;
			if (arg0 == this.anInt97) {
				this.anInt104 /= 2;
				@Pc(25) byte[] local25 = new byte[this.anInt103 * this.anInt104];
				@Pc(27) int local27 = 0;
				for (@Pc(29) int local29 = 0; local29 < this.anInt100; local29++) {
					for (@Pc(33) int local33 = 0; local33 < this.anInt99; local33++) {
						local25[(local33 + this.anInt101 >> 1) + (local29 + this.anInt102 >> 1) * this.anInt103] = this.aByteArray9[local27++];
					}
				}
				this.aByteArray9 = local25;
				this.anInt99 = this.anInt103;
				this.anInt100 = this.anInt104;
				this.anInt101 = 0;
				this.anInt102 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("83072, " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMELCUKG", name = "c", descriptor = "(I)V")
	public void method73() {
		try {
			if (this.anInt99 != this.anInt103 || this.anInt100 != this.anInt104) {
				@Pc(19) byte[] local19 = new byte[this.anInt103 * this.anInt104];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt100; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt99; local27++) {
						local19[local27 + this.anInt101 + (local23 + this.anInt102) * this.anInt103] = this.aByteArray9[local21++];
					}
				}
				this.aByteArray9 = local19;
				this.anInt99 = this.anInt103;
				this.anInt100 = this.anInt104;
				this.anInt101 = 0;
				this.anInt102 = 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("21017, " + 4 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMELCUKG", name = "b", descriptor = "(Z)V")
	public void method74() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt99 * this.anInt100];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = 0; local15 < this.anInt100; local15++) {
				for (@Pc(22) int local22 = this.anInt99 - 1; local22 >= 0; local22--) {
					local8[local10++] = this.aByteArray9[local22 + local15 * this.anInt99];
				}
			}
			this.aByteArray9 = local8;
			this.anInt101 = this.anInt103 - this.anInt99 - this.anInt101;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("6854, " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMELCUKG", name = "a", descriptor = "(B)V")
	public void method75(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt99 * this.anInt100];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt100 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt99; local19++) {
					local8[local10++] = this.aByteArray9[local19 + local15 * this.anInt99];
				}
			}
			this.aByteArray9 = local8;
			this.anInt102 = this.anInt104 - this.anInt100 - this.anInt102;
			@Pc(60) boolean local60 = false;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("84169, " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMELCUKG", name = "a", descriptor = "(IIZI)V")
	public void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray15.length; local12++) {
				@Pc(23) int local23 = this.anIntArray15[local12] >> 16 & 0xFF;
				local23 += arg0;
				if (local23 < 0) {
					local23 = 0;
				} else if (local23 > 255) {
					local23 = 255;
				}
				@Pc(47) int local47 = this.anIntArray15[local12] >> 8 & 0xFF;
				local47 += arg2;
				if (local47 < 0) {
					local47 = 0;
				} else if (local47 > 255) {
					local47 = 255;
				}
				@Pc(69) int local69 = this.anIntArray15[local12] & 0xFF;
				local69 += arg1;
				if (local69 < 0) {
					local69 = 0;
				} else if (local69 > 255) {
					local69 = 255;
				}
				this.anIntArray15[local12] = (local23 << 16) + (local47 << 8) + local69;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("12782, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMELCUKG", name = "a", descriptor = "(III)V")
	public void method77(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt101;
			arg1 += this.anInt102;
			@Pc(15) int local15 = arg0 + arg1 * Class2_Sub1_Sub1.anInt637;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt100;
			@Pc(23) int local23 = this.anInt99;
			@Pc(27) int local27 = Class2_Sub1_Sub1.anInt637 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub1.anInt639) {
				local40 = Class2_Sub1_Sub1.anInt639 - arg1;
				local20 -= local40;
				arg1 = Class2_Sub1_Sub1.anInt639;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class2_Sub1_Sub1.anInt637;
			}
			if (arg1 + local20 > Class2_Sub1_Sub1.anInt640) {
				local20 -= arg1 + local20 - Class2_Sub1_Sub1.anInt640;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt641) {
				local40 = Class2_Sub1_Sub1.anInt641 - arg0;
				local23 -= local40;
				arg0 = Class2_Sub1_Sub1.anInt641;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class2_Sub1_Sub1.anInt642) {
				local40 = arg0 + local23 - Class2_Sub1_Sub1.anInt642;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method78(local27, local20, local23, local29, this.aByteArray9, local15, Class2_Sub1_Sub1.anIntArray172, local17, this.anIntArray15);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("6569, " + -24669 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMELCUKG", name = "a", descriptor = "(IIIII[BI[II[I)V")
	private void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(7) int local7;
			if (this.anInt98 != 8) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			local7 = -(arg2 >> 2);
			@Pc(22) int local22 = -(arg2 & 0x3);
			for (@Pc(25) int local25 = -arg1; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local7; local29 < 0; local29++) {
					@Pc(36) byte local36 = arg4[arg7++];
					if (local36 == 0) {
						arg5++;
					} else {
						arg6[arg5++] = arg8[local36 & 0xFF];
					}
					local36 = arg4[arg7++];
					if (local36 == 0) {
						arg5++;
					} else {
						arg6[arg5++] = arg8[local36 & 0xFF];
					}
					local36 = arg4[arg7++];
					if (local36 == 0) {
						arg5++;
					} else {
						arg6[arg5++] = arg8[local36 & 0xFF];
					}
					local36 = arg4[arg7++];
					if (local36 == 0) {
						arg5++;
					} else {
						arg6[arg5++] = arg8[local36 & 0xFF];
					}
				}
				for (@Pc(112) int local112 = local22; local112 < 0; local112++) {
					@Pc(119) byte local119 = arg4[arg7++];
					if (local119 == 0) {
						arg5++;
					} else {
						arg6[arg5++] = arg8[local119 & 0xFF];
					}
				}
				arg5 += arg0;
				arg7 += arg3;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("94172, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
