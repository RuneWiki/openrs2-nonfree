import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ib")
public final class Class1_Sub3_Sub2_Sub3 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
	private static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "B")
	private byte aByte22 = 3;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "B")
	private byte aByte23 = 5;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "B")
	private byte aByte24 = -104;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "B")
	private byte aByte25 = -19;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "B")
	private byte aByte26 = -19;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public int anInt494;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	public int anInt495;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	public int anInt493;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(38) Class1_Sub3_Sub3 local38 = new Class1_Sub3_Sub3(arg0.method516(arg1 + ".dat", null), aBoolean129);
		@Pc(48) Class1_Sub3_Sub3 local48 = new Class1_Sub3_Sub3(arg0.method516("index.dat", null), aBoolean129);
		local48.anInt539 = local38.method374();
		this.anInt496 = local48.method374();
		this.anInt497 = local48.method374();
		@Pc(63) int local63 = local48.method372();
		this.anIntArray177 = new int[local63];
		for (@Pc(69) int local69 = 0; local69 < local63 - 1; local69++) {
			this.anIntArray177[local69 + 1] = local48.method376();
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local48.anInt539 += 2;
			local38.anInt539 += local48.method374() * local48.method374();
			local48.anInt539++;
		}
		this.anInt494 = local48.method372();
		this.anInt495 = local48.method372();
		this.anInt492 = local48.method374();
		this.anInt493 = local48.method374();
		@Pc(139) int local139 = local48.method372();
		@Pc(145) int local145 = this.anInt492 * this.anInt493;
		this.aByteArray7 = new byte[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.aByteArray7[local153] = local38.method373();
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt492; local153++) {
				for (@Pc(175) int local175 = 0; local175 < this.anInt493; local175++) {
					this.aByteArray7[local153 + local175 * this.anInt492] = local38.method373();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public void method331() {
		try {
			this.anInt496 /= 2;
			this.anInt497 /= 2;
			@Pc(24) byte[] local24 = new byte[this.anInt496 * this.anInt497];
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < this.anInt493; local28++) {
				for (@Pc(32) int local32 = 0; local32 < this.anInt492; local32++) {
					local24[(local32 + this.anInt494 >> 1) + (local28 + this.anInt495 >> 1) * this.anInt496] = this.aByteArray7[local26++];
				}
			}
			this.aByteArray7 = local24;
			this.anInt492 = this.anInt496;
			this.anInt493 = this.anInt497;
			this.anInt494 = 0;
			this.anInt495 = 0;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("78445, " + -128 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
	public void method332() {
		try {
			if (this.anInt492 != this.anInt496 || this.anInt493 != this.anInt497) {
				@Pc(19) byte[] local19 = new byte[this.anInt496 * this.anInt497];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt493; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt492; local27++) {
						local19[local27 + this.anInt494 + (local23 + this.anInt495) * this.anInt496] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt492 = this.anInt496;
				this.anInt493 = this.anInt497;
				this.anInt494 = 0;
				this.anInt495 = 0;
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("54812, " + false + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method333() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt492 * this.anInt493];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt493; local12++) {
				for (@Pc(19) int local19 = this.anInt492 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt492];
				}
			}
			this.aByteArray7 = local8;
			this.anInt494 = this.anInt496 - this.anInt492 - this.anInt494;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("87965, " + 1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public void method334() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt492 * this.anInt493];
			@Pc(18) int local18 = 0;
			for (@Pc(23) int local23 = this.anInt493 - 1; local23 >= 0; local23--) {
				for (@Pc(27) int local27 = 0; local27 < this.anInt492; local27++) {
					local8[local18++] = this.aByteArray7[local27 + local23 * this.anInt492];
				}
			}
			this.aByteArray7 = local8;
			this.anInt495 = this.anInt497 - this.anInt493 - this.anInt495;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("16631, " + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt494;
			arg1 += this.anInt495;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub3_Sub2.anInt507;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt493;
			@Pc(23) int local23 = this.anInt492;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt507 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub3_Sub2.anInt509) {
				local36 = Class1_Sub3_Sub2.anInt509 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub3_Sub2.anInt509;
				local17 = local36 * local23;
				local15 += local36 * Class1_Sub3_Sub2.anInt507;
			}
			if (arg1 + local20 > Class1_Sub3_Sub2.anInt510) {
				local20 -= arg1 + local20 - Class1_Sub3_Sub2.anInt510;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt511) {
				local36 = Class1_Sub3_Sub2.anInt511 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub3_Sub2.anInt511;
				local17 += local36;
				local15 += local36;
				local29 = local36;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub3_Sub2.anInt512) {
				local36 = arg0 + local23 - Class1_Sub3_Sub2.anInt512;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method336(this.anIntArray177, local29, local17, this.aByte24, local27, local15, this.aByteArray7, local20, local23, Class1_Sub3_Sub2.anIntArray178);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("5487, " + arg0 + ", " + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIBII[BII[I)V")
	private void method336(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9) {
		try {
			if (arg3 != -104) {
				this.aBoolean130 = !this.aBoolean130;
			}
			@Pc(17) int local17 = -(arg8 >> 2);
			@Pc(22) int local22 = -(arg8 & 0x3);
			for (@Pc(25) int local25 = -arg7; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local17; local29 < 0; local29++) {
					@Pc(36) byte local36 = arg6[arg2++];
					if (local36 == 0) {
						arg5++;
					} else {
						arg9[arg5++] = arg0[local36 & 0xFF];
					}
					local36 = arg6[arg2++];
					if (local36 == 0) {
						arg5++;
					} else {
						arg9[arg5++] = arg0[local36 & 0xFF];
					}
					local36 = arg6[arg2++];
					if (local36 == 0) {
						arg5++;
					} else {
						arg9[arg5++] = arg0[local36 & 0xFF];
					}
					local36 = arg6[arg2++];
					if (local36 == 0) {
						arg5++;
					} else {
						arg9[arg5++] = arg0[local36 & 0xFF];
					}
				}
				for (@Pc(112) int local112 = local22; local112 < 0; local112++) {
					@Pc(119) byte local119 = arg6[arg2++];
					if (local119 == 0) {
						arg5++;
					} else {
						arg9[arg5++] = arg0[local119 & 0xFF];
					}
				}
				arg5 += arg4;
				arg2 += arg1;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("89201, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
