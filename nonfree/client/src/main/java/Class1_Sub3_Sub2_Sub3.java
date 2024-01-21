import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ib")
public final class Class1_Sub3_Sub2_Sub3 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	private int anInt507 = 19303;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	private int anInt508 = -638;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(29) Class1_Sub3_Sub3 local29 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, arg1 + ".dat"));
		@Pc(39) Class1_Sub3_Sub3 local39 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "index.dat"));
		local39.anInt554 = local29.method393();
		this.anInt513 = local39.method393();
		this.anInt514 = local39.method393();
		@Pc(54) int local54 = local39.method391();
		this.anIntArray177 = new int[local54];
		for (@Pc(60) int local60 = 0; local60 < local54 - 1; local60++) {
			this.anIntArray177[local60 + 1] = local39.method395();
		}
		for (@Pc(78) int local78 = 0; local78 < arg2; local78++) {
			local39.anInt554 += 2;
			local29.anInt554 += local39.method393() * local39.method393();
			local39.anInt554++;
		}
		this.anInt511 = local39.method391();
		this.anInt512 = local39.method391();
		this.anInt509 = local39.method393();
		this.anInt510 = local39.method393();
		@Pc(125) int local125 = local39.method391();
		@Pc(131) int local131 = this.anInt509 * this.anInt510;
		this.aByteArray6 = new byte[local131];
		@Pc(139) int local139;
		if (local125 == 0) {
			for (local139 = 0; local139 < local131; local139++) {
				this.aByteArray6[local139] = local29.method392();
			}
		} else if (local125 == 1) {
			for (local139 = 0; local139 < this.anInt509; local139++) {
				for (@Pc(161) int local161 = 0; local161 < this.anInt510; local161++) {
					this.aByteArray6[local139 + local161 * this.anInt509] = local29.method392();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public void method345() {
		try {
			this.anInt513 /= 2;
			this.anInt514 /= 2;
			@Pc(25) byte[] local25 = new byte[this.anInt513 * this.anInt514];
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < this.anInt510; local29++) {
				for (@Pc(33) int local33 = 0; local33 < this.anInt509; local33++) {
					local25[(local33 + this.anInt511 >> 1) + (local29 + this.anInt512 >> 1) * this.anInt513] = this.aByteArray6[local27++];
				}
			}
			this.aByteArray6 = local25;
			this.anInt509 = this.anInt513;
			this.anInt510 = this.anInt514;
			this.anInt511 = 0;
			this.anInt512 = 0;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("58202, " + true + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method346() {
		try {
			if (this.anInt509 != this.anInt513 || this.anInt510 != this.anInt514) {
				@Pc(19) byte[] local19 = new byte[this.anInt513 * this.anInt514];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt510; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt509; local27++) {
						local19[local27 + this.anInt511 + (local23 + this.anInt512) * this.anInt513] = this.aByteArray6[local21++];
					}
				}
				this.aByteArray6 = local19;
				this.anInt509 = this.anInt513;
				this.anInt510 = this.anInt514;
				this.anInt511 = 0;
				this.anInt512 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("79850, " + -20585 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public void method347() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt509 * this.anInt510];
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < this.anInt510; local15++) {
				for (@Pc(22) int local22 = this.anInt509 - 1; local22 >= 0; local22--) {
					local8[local13++] = this.aByteArray6[local22 + local15 * this.anInt509];
				}
			}
			this.aByteArray6 = local8;
			this.anInt511 = this.anInt513 - this.anInt509 - this.anInt511;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("91799, " + 0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public void method348() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt509 * this.anInt510];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt510 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt509; local19++) {
					local8[local10++] = this.aByteArray6[local19 + local15 * this.anInt509];
				}
			}
			this.aByteArray6 = local8;
			this.anInt512 = this.anInt514 - this.anInt510 - this.anInt512;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("59747, " + 0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray177.length; local3++) {
				@Pc(14) int local14 = this.anIntArray177[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray177[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray177[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray177[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("2449, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt511;
			arg0 += this.anInt512;
			@Pc(28) int local28 = arg1 + arg0 * Class1_Sub3_Sub2.anInt524;
			@Pc(30) int local30 = 0;
			@Pc(33) int local33 = this.anInt510;
			@Pc(36) int local36 = this.anInt509;
			@Pc(40) int local40 = Class1_Sub3_Sub2.anInt524 - local36;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49;
			if (arg0 < Class1_Sub3_Sub2.anInt526) {
				local49 = Class1_Sub3_Sub2.anInt526 - arg0;
				local33 -= local49;
				arg0 = Class1_Sub3_Sub2.anInt526;
				local30 = local49 * local36 + 0;
				local28 += local49 * Class1_Sub3_Sub2.anInt524;
			}
			if (arg0 + local33 > Class1_Sub3_Sub2.anInt527) {
				local33 -= arg0 + local33 - Class1_Sub3_Sub2.anInt527;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt528) {
				local49 = Class1_Sub3_Sub2.anInt528 - arg1;
				local36 -= local49;
				arg1 = Class1_Sub3_Sub2.anInt528;
				local30 += local49;
				local28 += local49;
				local42 = local49 + 0;
				local40 += local49;
			}
			if (arg1 + local36 > Class1_Sub3_Sub2.anInt529) {
				local49 = arg1 + local36 - Class1_Sub3_Sub2.anInt529;
				local36 -= local49;
				local42 += local49;
				local40 += local49;
			}
			if (local36 > 0 && local33 > 0) {
				this.method351(Class1_Sub3_Sub2.anIntArray178, local30, local28, local40, local42, this.aByteArray6, local36, local33, this.anIntArray177);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("77184, " + arg0 + ", " + -462 + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIIII[BII[I)V")
	private void method351(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(14) int local14 = -arg7; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg5[arg1++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg0[arg2++] = arg8[local25 & 0xFF];
					}
					local25 = arg5[arg1++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg0[arg2++] = arg8[local25 & 0xFF];
					}
					local25 = arg5[arg1++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg0[arg2++] = arg8[local25 & 0xFF];
					}
					local25 = arg5[arg1++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg0[arg2++] = arg8[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg5[arg1++];
					if (local108 == 0) {
						arg2++;
					} else {
						arg0[arg2++] = arg8[local108 & 0xFF];
					}
				}
				arg2 += arg3;
				arg1 += arg4;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("71423, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
