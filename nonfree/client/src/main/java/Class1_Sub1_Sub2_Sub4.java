import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MRCVLIXG")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!MRCVLIXG", name = "x", descriptor = "I")
	private int anInt559 = 670;

	@OriginalMember(owner = "client!MRCVLIXG", name = "y", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!MRCVLIXG", name = "z", descriptor = "I")
	private int anInt560 = -28345;

	@OriginalMember(owner = "client!MRCVLIXG", name = "A", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!MRCVLIXG", name = "B", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!MRCVLIXG", name = "C", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!MRCVLIXG", name = "J", descriptor = "I")
	public int anInt565;

	@OriginalMember(owner = "client!MRCVLIXG", name = "K", descriptor = "I")
	private int anInt566;

	@OriginalMember(owner = "client!MRCVLIXG", name = "E", descriptor = "[I")
	public int[] anIntArray87;

	@OriginalMember(owner = "client!MRCVLIXG", name = "H", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!MRCVLIXG", name = "I", descriptor = "I")
	public int anInt564;

	@OriginalMember(owner = "client!MRCVLIXG", name = "F", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!MRCVLIXG", name = "G", descriptor = "I")
	public int anInt562;

	@OriginalMember(owner = "client!MRCVLIXG", name = "D", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!MRCVLIXG", name = "<init>", descriptor = "(Lclient!HBJEXSJX;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class13 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method278(arg1 + ".dat", null), 0);
		@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3(arg0.method278("index.dat", null), 0);
		local46.anInt301 = local37.method157();
		this.anInt565 = local46.method157();
		this.anInt566 = local46.method157();
		@Pc(61) int local61 = local46.method155();
		this.anIntArray87 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray87[local67 + 1] = local46.method159();
		}
		for (@Pc(85) int local85 = 0; local85 < arg2; local85++) {
			local46.anInt301 += 2;
			local37.anInt301 += local46.method157() * local46.method157();
			local46.anInt301++;
		}
		this.anInt563 = local46.method155();
		this.anInt564 = local46.method155();
		this.anInt561 = local46.method157();
		this.anInt562 = local46.method157();
		@Pc(132) int local132 = local46.method155();
		@Pc(138) int local138 = this.anInt561 * this.anInt562;
		this.aByteArray11 = new byte[local138];
		@Pc(146) int local146;
		if (local132 == 0) {
			for (local146 = 0; local146 < local138; local146++) {
				this.aByteArray11[local146] = local37.method156();
			}
		} else if (local132 == 1) {
			for (local146 = 0; local146 < this.anInt561; local146++) {
				for (@Pc(168) int local168 = 0; local168 < this.anInt562; local168++) {
					this.aByteArray11[local146 + local168 * this.anInt561] = local37.method156();
				}
			}
		}
	}

	@OriginalMember(owner = "client!MRCVLIXG", name = "c", descriptor = "(I)V")
	public void method358() {
		try {
			this.anInt565 /= 2;
			this.anInt566 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt565 * this.anInt566];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt562; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt561; local28++) {
					local20[(local28 + this.anInt563 >> 1) + (local24 + this.anInt564 >> 1) * this.anInt565] = this.aByteArray11[local22++];
				}
			}
			this.aByteArray11 = local20;
			this.anInt561 = this.anInt565;
			this.anInt562 = this.anInt566;
			this.anInt563 = 0;
			this.anInt564 = 0;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("10026, " + 3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "(Z)V")
	public void method359() {
		try {
			if (this.anInt561 != this.anInt565 || this.anInt562 != this.anInt566) {
				@Pc(19) byte[] local19 = new byte[this.anInt565 * this.anInt566];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt562; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt561; local27++) {
						local19[local27 + this.anInt563 + (local23 + this.anInt564) * this.anInt565] = this.aByteArray11[local21++];
					}
				}
				this.aByteArray11 = local19;
				this.anInt561 = this.anInt565;
				this.anInt562 = this.anInt566;
				this.anInt563 = 0;
				this.anInt564 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("29428, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "(B)V")
	public void method360() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt561 * this.anInt562];
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < this.anInt562; local18++) {
				for (@Pc(25) int local25 = this.anInt561 - 1; local25 >= 0; local25--) {
					local8[local16++] = this.aByteArray11[local25 + local18 * this.anInt561];
				}
			}
			this.aByteArray11 = local8;
			this.anInt563 = this.anInt565 - this.anInt561 - this.anInt563;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("59115, " + 1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MRCVLIXG", name = "d", descriptor = "(I)V")
	public void method361() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt561 * this.anInt562];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt562 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt561; local19++) {
					local8[local10++] = this.aByteArray11[local19 + local15 * this.anInt561];
				}
			}
			this.aByteArray11 = local8;
			this.anInt564 = this.anInt566 - this.anInt562 - this.anInt564;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("9658, " + 6 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "(IIIB)V")
	public void method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray87.length; local13++) {
				@Pc(24) int local24 = this.anIntArray87[local13] >> 16 & 0xFF;
				local24 += arg2;
				if (local24 < 0) {
					local24 = 0;
				} else if (local24 > 255) {
					local24 = 255;
				}
				@Pc(48) int local48 = this.anIntArray87[local13] >> 8 & 0xFF;
				local48 += arg0;
				if (local48 < 0) {
					local48 = 0;
				} else if (local48 > 255) {
					local48 = 255;
				}
				@Pc(70) int local70 = this.anIntArray87[local13] & 0xFF;
				local70 += arg1;
				if (local70 < 0) {
					local70 = 0;
				} else if (local70 > 255) {
					local70 = 255;
				}
				this.anIntArray87[local13] = (local24 << 16) + (local48 << 8) + local70;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("18985, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -108 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "(III)V")
	public void method363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt563;
			arg1 += this.anInt564;
			@Pc(28) int local28 = arg0 + arg1 * Class1_Sub1_Sub2.anInt550;
			@Pc(30) int local30 = 0;
			@Pc(33) int local33 = this.anInt562;
			@Pc(36) int local36 = this.anInt561;
			@Pc(40) int local40 = Class1_Sub1_Sub2.anInt550 - local36;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49;
			if (arg1 < Class1_Sub1_Sub2.anInt552) {
				local49 = Class1_Sub1_Sub2.anInt552 - arg1;
				local33 -= local49;
				arg1 = Class1_Sub1_Sub2.anInt552;
				local30 = local49 * local36 + 0;
				local28 += local49 * Class1_Sub1_Sub2.anInt550;
			}
			if (arg1 + local33 > Class1_Sub1_Sub2.anInt553) {
				local33 -= arg1 + local33 - Class1_Sub1_Sub2.anInt553;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt554) {
				local49 = Class1_Sub1_Sub2.anInt554 - arg0;
				local36 -= local49;
				arg0 = Class1_Sub1_Sub2.anInt554;
				local30 += local49;
				local28 += local49;
				local42 = local49 + 0;
				local40 += local49;
			}
			if (arg0 + local36 > Class1_Sub1_Sub2.anInt555) {
				local49 = arg0 + local36 - Class1_Sub1_Sub2.anInt555;
				local36 -= local49;
				local42 += local49;
				local40 += local49;
			}
			if (local36 > 0 && local33 > 0) {
				this.method364(Class1_Sub1_Sub2.anIntArray86, local36, local33, local28, local30, local42, this.aByteArray11, local40, this.anIntArray87);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("72084, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MRCVLIXG", name = "a", descriptor = "([IIIIII[BII[I)V")
	private void method364(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(14) int local14 = -arg2; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg6[arg4++];
					if (local25 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg8[local25 & 0xFF];
					}
					local25 = arg6[arg4++];
					if (local25 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg8[local25 & 0xFF];
					}
					local25 = arg6[arg4++];
					if (local25 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg8[local25 & 0xFF];
					}
					local25 = arg6[arg4++];
					if (local25 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg8[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg6[arg4++];
					if (local108 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg8[local108 & 0xFF];
					}
				}
				arg3 += arg7;
				arg4 += arg5;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("26287, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 4 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
