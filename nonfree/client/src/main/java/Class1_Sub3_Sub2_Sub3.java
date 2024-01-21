import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ib")
public final class Class1_Sub3_Sub2_Sub3 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	private int anInt514 = -12745;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	private int anInt515 = -937;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
	private boolean aBoolean117 = true;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt518;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt516;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(35) Class1_Sub3_Sub3 local35 = new Class1_Sub3_Sub3(0, arg0.method528(arg1 + ".dat", null));
		@Pc(45) Class1_Sub3_Sub3 local45 = new Class1_Sub3_Sub3(0, arg0.method528("index.dat", null));
		local45.anInt566 = local35.method385();
		this.anInt520 = local45.method385();
		this.anInt521 = local45.method385();
		@Pc(60) int local60 = local45.method383();
		this.anIntArray177 = new int[local60];
		for (@Pc(66) int local66 = 0; local66 < local60 - 1; local66++) {
			this.anIntArray177[local66 + 1] = local45.method387();
		}
		for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
			local45.anInt566 += 2;
			local35.anInt566 += local45.method385() * local45.method385();
			local45.anInt566++;
		}
		this.anInt518 = local45.method383();
		this.anInt519 = local45.method383();
		this.anInt516 = local45.method385();
		this.anInt517 = local45.method385();
		@Pc(136) int local136 = local45.method383();
		@Pc(142) int local142 = this.anInt516 * this.anInt517;
		this.aByteArray6 = new byte[local142];
		@Pc(150) int local150;
		if (local136 == 0) {
			for (local150 = 0; local150 < local142; local150++) {
				this.aByteArray6[local150] = local35.method384();
			}
		} else if (local136 == 1) {
			for (local150 = 0; local150 < this.anInt516; local150++) {
				for (@Pc(172) int local172 = 0; local172 < this.anInt517; local172++) {
					this.aByteArray6[local150 + local172 * this.anInt516] = local35.method384();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method342() {
		try {
			this.anInt520 /= 2;
			this.anInt521 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt520 * this.anInt521];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt517; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt516; local28++) {
					local20[(local28 + this.anInt518 >> 1) + (local24 + this.anInt519 >> 1) * this.anInt520] = this.aByteArray6[local22++];
				}
			}
			this.aByteArray6 = local20;
			if (this.anInt514 != -12745) {
				this.aBoolean115 = !this.aBoolean115;
			}
			this.anInt516 = this.anInt520;
			this.anInt517 = this.anInt521;
			this.anInt518 = 0;
			this.anInt519 = 0;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("90180, " + -12745 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public void method343(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt516 != this.anInt520 || this.anInt517 != this.anInt521) {
				@Pc(19) byte[] local19 = new byte[this.anInt520 * this.anInt521];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt517; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt516; local27++) {
						local19[local27 + this.anInt518 + (local23 + this.anInt519) * this.anInt520] = this.aByteArray6[local21++];
					}
				}
				if (arg0) {
					this.anInt514 = 161;
				}
				this.aByteArray6 = local19;
				this.anInt516 = this.anInt520;
				this.anInt517 = this.anInt521;
				this.anInt518 = 0;
				this.anInt519 = 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("26926, " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public void method344() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt516 * this.anInt517];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt517; local12++) {
				for (@Pc(19) int local19 = this.anInt516 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray6[local19 + local12 * this.anInt516];
				}
			}
			this.aByteArray6 = local8;
			this.anInt518 = this.anInt520 - this.anInt516 - this.anInt518;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("48068, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public void method345() {
		try {
			@Pc(12) byte[] local12 = new byte[this.anInt516 * this.anInt517];
			@Pc(14) int local14 = 0;
			for (@Pc(19) int local19 = this.anInt517 - 1; local19 >= 0; local19--) {
				for (@Pc(23) int local23 = 0; local23 < this.anInt516; local23++) {
					local12[local14++] = this.aByteArray6[local23 + local19 * this.anInt516];
				}
			}
			this.aByteArray6 = local12;
			this.anInt519 = this.anInt521 - this.anInt517 - this.anInt519;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("19946, " + 92 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method346(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt518;
			arg1 += this.anInt519;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub3_Sub2.anInt532;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt517;
			@Pc(23) int local23 = this.anInt516;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt532 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub3_Sub2.anInt534) {
				local36 = Class1_Sub3_Sub2.anInt534 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub3_Sub2.anInt534;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub3_Sub2.anInt532;
			}
			if (arg1 + local20 > Class1_Sub3_Sub2.anInt535) {
				local20 -= arg1 + local20 - Class1_Sub3_Sub2.anInt535;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt536) {
				local36 = Class1_Sub3_Sub2.anInt536 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub3_Sub2.anInt536;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub3_Sub2.anInt537) {
				local36 = arg0 + local23 - Class1_Sub3_Sub2.anInt537;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method347(this.anIntArray177, local15, local20, local17, local29, local23, local27, Class1_Sub3_Sub2.anIntArray178, this.aByteArray6);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("89578, " + -790 + ", " + arg0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IIIIIII[I[B)V")
	private void method347(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) byte[] arg8) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(19) int local19 = -arg2; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					@Pc(30) byte local30 = arg8[arg3++];
					if (local30 == 0) {
						arg1++;
					} else {
						arg7[arg1++] = arg0[local30 & 0xFF];
					}
					local30 = arg8[arg3++];
					if (local30 == 0) {
						arg1++;
					} else {
						arg7[arg1++] = arg0[local30 & 0xFF];
					}
					local30 = arg8[arg3++];
					if (local30 == 0) {
						arg1++;
					} else {
						arg7[arg1++] = arg0[local30 & 0xFF];
					}
					local30 = arg8[arg3++];
					if (local30 == 0) {
						arg1++;
					} else {
						arg7[arg1++] = arg0[local30 & 0xFF];
					}
				}
				for (@Pc(106) int local106 = local11; local106 < 0; local106++) {
					@Pc(113) byte local113 = arg8[arg3++];
					if (local113 == 0) {
						arg1++;
					} else {
						arg7[arg1++] = arg0[local113 & 0xFF];
					}
				}
				arg1 += arg6;
				arg3 += arg4;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("27209, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
