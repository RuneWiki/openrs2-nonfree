import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PQKEJITK")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!PQKEJITK", name = "x", descriptor = "Z")
	private static boolean aBoolean144 = true;

	@OriginalMember(owner = "client!PQKEJITK", name = "A", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!PQKEJITK", name = "y", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!PQKEJITK", name = "z", descriptor = "I")
	private int anInt545 = -24571;

	@OriginalMember(owner = "client!PQKEJITK", name = "H", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!PQKEJITK", name = "I", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!PQKEJITK", name = "C", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!PQKEJITK", name = "F", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!PQKEJITK", name = "G", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!PQKEJITK", name = "D", descriptor = "I")
	public int anInt547;

	@OriginalMember(owner = "client!PQKEJITK", name = "E", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!PQKEJITK", name = "B", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!PQKEJITK", name = "<init>", descriptor = "(Lclient!FNOQZAYQ;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) Class8 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class2_Sub1_Sub4 local25 = new Class2_Sub1_Sub4(arg0.method165(arg1 + ".dat", null), aBoolean144);
		@Pc(34) Class2_Sub1_Sub4 local34 = new Class2_Sub1_Sub4(arg0.method165("index.dat", null), aBoolean144);
		local34.anInt166 = local25.method96();
		this.anInt551 = local34.method96();
		this.anInt552 = local34.method96();
		@Pc(49) int local49 = local34.method94();
		this.anIntArray119 = new int[local49];
		for (@Pc(55) int local55 = 0; local55 < local49 - 1; local55++) {
			this.anIntArray119[local55 + 1] = local34.method98();
		}
		for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
			local34.anInt166 += 2;
			local25.anInt166 += local34.method96() * local34.method96();
			local34.anInt166++;
		}
		this.anInt549 = local34.method94();
		this.anInt550 = local34.method94();
		this.anInt547 = local34.method96();
		this.anInt548 = local34.method96();
		@Pc(120) int local120 = local34.method94();
		@Pc(126) int local126 = this.anInt547 * this.anInt548;
		this.aByteArray13 = new byte[local126];
		@Pc(134) int local134;
		if (local120 == 0) {
			for (local134 = 0; local134 < local126; local134++) {
				this.aByteArray13[local134] = local25.method95();
			}
		} else if (local120 == 1) {
			for (local134 = 0; local134 < this.anInt547; local134++) {
				for (@Pc(156) int local156 = 0; local156 < this.anInt548; local156++) {
					this.aByteArray13[local134 + local156 * this.anInt547] = local25.method95();
				}
			}
		}
	}

	@OriginalMember(owner = "client!PQKEJITK", name = "a", descriptor = "(Z)V")
	public void method343() {
		try {
			this.anInt551 /= 2;
			this.anInt552 /= 2;
			@Pc(23) byte[] local23 = new byte[this.anInt551 * this.anInt552];
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < this.anInt548; local27++) {
				for (@Pc(31) int local31 = 0; local31 < this.anInt547; local31++) {
					local23[(local31 + this.anInt549 >> 1) + (local27 + this.anInt550 >> 1) * this.anInt551] = this.aByteArray13[local25++];
				}
			}
			this.aByteArray13 = local23;
			this.anInt547 = this.anInt551;
			this.anInt548 = this.anInt552;
			this.anInt549 = 0;
			this.anInt550 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("80677, " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQKEJITK", name = "b", descriptor = "(B)V")
	public void method344() {
		try {
			if (this.anInt547 != this.anInt551 || this.anInt548 != this.anInt552) {
				@Pc(23) byte[] local23 = new byte[this.anInt551 * this.anInt552];
				@Pc(25) int local25 = 0;
				for (@Pc(27) int local27 = 0; local27 < this.anInt548; local27++) {
					for (@Pc(31) int local31 = 0; local31 < this.anInt547; local31++) {
						local23[local31 + this.anInt549 + (local27 + this.anInt550) * this.anInt551] = this.aByteArray13[local25++];
					}
				}
				this.aByteArray13 = local23;
				this.anInt547 = this.anInt551;
				this.anInt548 = this.anInt552;
				this.anInt549 = 0;
				this.anInt550 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("78373, " + -59 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQKEJITK", name = "b", descriptor = "(I)V")
	public void method345(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt547 * this.anInt548];
			@Pc(12) boolean local12 = false;
			@Pc(14) int local14 = 0;
			for (@Pc(16) int local16 = 0; local16 < this.anInt548; local16++) {
				for (@Pc(23) int local23 = this.anInt547 - 1; local23 >= 0; local23--) {
					local8[local14++] = this.aByteArray13[local23 + local16 * this.anInt547];
				}
			}
			this.aByteArray13 = local8;
			this.anInt549 = this.anInt551 - this.anInt547 - this.anInt549;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("16547, " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQKEJITK", name = "c", descriptor = "(B)V")
	public void method346() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt547 * this.anInt548];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt548 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt547; local19++) {
					local8[local10++] = this.aByteArray13[local19 + local15 * this.anInt547];
				}
			}
			this.aByteArray13 = local8;
			this.anInt550 = this.anInt552 - this.anInt548 - this.anInt550;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("50049, " + 118 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQKEJITK", name = "a", descriptor = "(IIII)V")
	public void method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray119.length; local3++) {
				@Pc(14) int local14 = this.anIntArray119[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray119[local3] >> 8 & 0xFF;
				local38 += arg2;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray119[local3] & 0xFF;
				local60 += arg1;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray119[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("36272, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQKEJITK", name = "a", descriptor = "(BII)V")
	public void method348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt549;
			arg1 += this.anInt550;
			@Pc(19) int local19 = arg0 + arg1 * Class2_Sub1_Sub1.anInt688;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt548;
			@Pc(27) int local27 = this.anInt547;
			@Pc(31) int local31 = Class2_Sub1_Sub1.anInt688 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub1.anInt690) {
				local40 = Class2_Sub1_Sub1.anInt690 - arg1;
				local24 -= local40;
				arg1 = Class2_Sub1_Sub1.anInt690;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub1.anInt688;
			}
			if (arg1 + local24 > Class2_Sub1_Sub1.anInt691) {
				local24 -= arg1 + local24 - Class2_Sub1_Sub1.anInt691;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt692) {
				local40 = Class2_Sub1_Sub1.anInt692 - arg0;
				local27 -= local40;
				arg0 = Class2_Sub1_Sub1.anInt692;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class2_Sub1_Sub1.anInt693) {
				local40 = arg0 + local27 - Class2_Sub1_Sub1.anInt693;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method349(local31, this.anIntArray119, local19, local27, local24, Class2_Sub1_Sub1.anIntArray189, local21, this.aByteArray13, local33, (byte) 9);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("42000, " + 50 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQKEJITK", name = "a", descriptor = "(I[IIII[II[BIB)V")
	private void method349(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) boolean local11 = false;
			@Pc(26) int local26 = -(arg3 & 0x3);
			for (@Pc(29) int local29 = -arg4; local29 < 0; local29++) {
				for (@Pc(33) int local33 = local6; local33 < 0; local33++) {
					@Pc(40) byte local40 = arg7[arg6++];
					if (local40 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg1[local40 & 0xFF];
					}
					local40 = arg7[arg6++];
					if (local40 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg1[local40 & 0xFF];
					}
					local40 = arg7[arg6++];
					if (local40 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg1[local40 & 0xFF];
					}
					local40 = arg7[arg6++];
					if (local40 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg1[local40 & 0xFF];
					}
				}
				for (@Pc(116) int local116 = local26; local116 < 0; local116++) {
					@Pc(123) byte local123 = arg7[arg6++];
					if (local123 == 0) {
						arg2++;
					} else {
						arg5[arg2++] = arg1[local123 & 0xFF];
					}
				}
				arg2 += arg0;
				arg6 += arg8;
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("75626, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}
}
