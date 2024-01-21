import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ib")
public final class Class1_Sub3_Sub2_Sub3 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "B")
	private static byte aByte38 = 4;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Z")
	private boolean aBoolean125 = true;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	private int anInt501 = -638;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(29) Class1_Sub3_Sub3 local29 = new Class1_Sub3_Sub3(arg0.method528(aByte38, arg1 + ".dat", null), 0);
		@Pc(39) Class1_Sub3_Sub3 local39 = new Class1_Sub3_Sub3(arg0.method528(aByte38, "index.dat", null), 0);
		local39.anInt548 = local29.method385();
		this.anInt506 = local39.method385();
		this.anInt507 = local39.method385();
		@Pc(54) int local54 = local39.method383();
		this.anIntArray177 = new int[local54];
		for (@Pc(60) int local60 = 0; local60 < local54 - 1; local60++) {
			this.anIntArray177[local60 + 1] = local39.method387();
		}
		for (@Pc(83) int local83 = 0; local83 < arg2; local83++) {
			local39.anInt548 += 2;
			local29.anInt548 += local39.method385() * local39.method385();
			local39.anInt548++;
		}
		this.anInt504 = local39.method383();
		this.anInt505 = local39.method383();
		this.anInt502 = local39.method385();
		this.anInt503 = local39.method385();
		@Pc(130) int local130 = local39.method383();
		@Pc(136) int local136 = this.anInt502 * this.anInt503;
		this.aByteArray6 = new byte[local136];
		@Pc(144) int local144;
		if (local130 == 0) {
			for (local144 = 0; local144 < local136; local144++) {
				this.aByteArray6[local144] = local29.method384();
			}
		} else if (local130 == 1) {
			for (local144 = 0; local144 < this.anInt502; local144++) {
				for (@Pc(166) int local166 = 0; local166 < this.anInt503; local166++) {
					this.aByteArray6[local144 + local166 * this.anInt502] = local29.method384();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public void method342() {
		try {
			this.anInt506 /= 2;
			this.anInt507 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt506 * this.anInt507];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt503; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt502; local28++) {
					local20[(local28 + this.anInt504 >> 1) + (local24 + this.anInt505 >> 1) * this.anInt506] = this.aByteArray6[local22++];
				}
			}
			this.aByteArray6 = local20;
			this.anInt502 = this.anInt506;
			this.anInt503 = this.anInt507;
			this.anInt504 = 0;
			this.anInt505 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("1151, " + false + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
	public void method343() {
		try {
			if (this.anInt502 != this.anInt506 || this.anInt503 != this.anInt507) {
				@Pc(19) byte[] local19 = new byte[this.anInt506 * this.anInt507];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt503; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt502; local27++) {
						local19[local27 + this.anInt504 + (local23 + this.anInt505) * this.anInt506] = this.aByteArray6[local21++];
					}
				}
				this.aByteArray6 = local19;
				this.anInt502 = this.anInt506;
				this.anInt503 = this.anInt507;
				this.anInt504 = 0;
				this.anInt505 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("38025, " + true + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(Z)V")
	public void method344() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt502 * this.anInt503];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = 0; local15 < this.anInt503; local15++) {
				for (@Pc(22) int local22 = this.anInt502 - 1; local22 >= 0; local22--) {
					local8[local10++] = this.aByteArray6[local22 + local15 * this.anInt502];
				}
			}
			this.aByteArray6 = local8;
			this.anInt504 = this.anInt506 - this.anInt502 - this.anInt504;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("68037, " + true + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method345() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt502 * this.anInt503];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt503 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt502; local19++) {
					local8[local10++] = this.aByteArray6[local19 + local15 * this.anInt502];
				}
			}
			this.aByteArray6 = local8;
			this.anInt505 = this.anInt507 - this.anInt503 - this.anInt505;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("48835, " + -638 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)V")
	public void method346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt504;
			arg0 += this.anInt505;
			@Pc(25) int local25 = arg1 + arg0 * Class1_Sub3_Sub2.anInt516;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt503;
			@Pc(33) int local33 = this.anInt502;
			@Pc(37) int local37 = Class1_Sub3_Sub2.anInt516 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub3_Sub2.anInt518) {
				local46 = Class1_Sub3_Sub2.anInt518 - arg0;
				local30 -= local46;
				arg0 = Class1_Sub3_Sub2.anInt518;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub3_Sub2.anInt516;
			}
			if (arg0 + local30 > Class1_Sub3_Sub2.anInt519) {
				local30 -= arg0 + local30 - Class1_Sub3_Sub2.anInt519;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt520) {
				local46 = Class1_Sub3_Sub2.anInt520 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub3_Sub2.anInt520;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub3_Sub2.anInt521) {
				local46 = arg1 + local33 - Class1_Sub3_Sub2.anInt521;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method347(local27, this.aByteArray6, local30, local39, local25, this.anIntArray177, Class1_Sub3_Sub2.anIntArray178, local37, local33);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("32395, " + arg0 + ", " + true + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[BIII[II[III)V")
	private void method347(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(21) int local21 = -(arg8 & 0x3);
			for (@Pc(24) int local24 = -arg2; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg1[arg0++];
					if (local35 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg5[local35 & 0xFF];
					}
					local35 = arg1[arg0++];
					if (local35 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg5[local35 & 0xFF];
					}
					local35 = arg1[arg0++];
					if (local35 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg5[local35 & 0xFF];
					}
					local35 = arg1[arg0++];
					if (local35 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg5[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local21; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg1[arg0++];
					if (local118 == 0) {
						arg4++;
					} else {
						arg6[arg4++] = arg5[local118 & 0xFF];
					}
				}
				arg4 += arg7;
				arg0 += arg3;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("42978, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 13667 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
