import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DEITBGVL")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!DEITBGVL", name = "z", descriptor = "I")
	private int anInt123 = 7;

	@OriginalMember(owner = "client!DEITBGVL", name = "A", descriptor = "I")
	private int anInt124 = 22736;

	@OriginalMember(owner = "client!DEITBGVL", name = "B", descriptor = "Z")
	private boolean aBoolean29 = true;

	@OriginalMember(owner = "client!DEITBGVL", name = "C", descriptor = "I")
	private int anInt125 = -668;

	@OriginalMember(owner = "client!DEITBGVL", name = "D", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!DEITBGVL", name = "K", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!DEITBGVL", name = "L", descriptor = "I")
	private int anInt131;

	@OriginalMember(owner = "client!DEITBGVL", name = "F", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!DEITBGVL", name = "I", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!DEITBGVL", name = "J", descriptor = "I")
	public int anInt129;

	@OriginalMember(owner = "client!DEITBGVL", name = "G", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!DEITBGVL", name = "H", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!DEITBGVL", name = "E", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!DEITBGVL", name = "<init>", descriptor = "(Lclient!QKFGLETG;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) Class36 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3((byte) 9, arg0.method337(arg1 + ".dat", null));
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("index.dat", null));
		local43.anInt806 = local34.method500();
		this.anInt130 = local43.method500();
		this.anInt131 = local43.method500();
		@Pc(58) int local58 = local43.method498();
		this.anIntArray12 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray12[local64 + 1] = local43.method502();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt806 += 2;
			local34.anInt806 += local43.method500() * local43.method500();
			local43.anInt806++;
		}
		this.anInt128 = local43.method498();
		this.anInt129 = local43.method498();
		this.anInt126 = local43.method500();
		this.anInt127 = local43.method500();
		@Pc(129) int local129 = local43.method498();
		@Pc(135) int local135 = this.anInt126 * this.anInt127;
		this.aByteArray2 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray2[local143] = local34.method499();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt126; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt127; local165++) {
					this.aByteArray2[local143 + local165 * this.anInt126] = local34.method499();
				}
			}
		}
	}

	@OriginalMember(owner = "client!DEITBGVL", name = "c", descriptor = "(I)V")
	public void method57() {
		try {
			this.anInt130 /= 2;
			this.anInt131 /= 2;
			@Pc(34) byte[] local34 = new byte[this.anInt130 * this.anInt131];
			@Pc(36) int local36 = 0;
			for (@Pc(38) int local38 = 0; local38 < this.anInt127; local38++) {
				for (@Pc(42) int local42 = 0; local42 < this.anInt126; local42++) {
					local34[(local42 + this.anInt128 >> 1) + (local38 + this.anInt129 >> 1) * this.anInt130] = this.aByteArray2[local36++];
				}
			}
			this.aByteArray2 = local34;
			this.anInt126 = this.anInt130;
			this.anInt127 = this.anInt131;
			this.anInt128 = 0;
			this.anInt129 = 0;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("44603, " + 3 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEITBGVL", name = "a", descriptor = "(B)V")
	public void method58() {
		try {
			if (this.anInt126 != this.anInt130 || this.anInt127 != this.anInt131) {
				@Pc(19) byte[] local19 = new byte[this.anInt130 * this.anInt131];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt127; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt126; local27++) {
						local19[local27 + this.anInt128 + (local23 + this.anInt129) * this.anInt130] = this.aByteArray2[local21++];
					}
				}
				this.aByteArray2 = local19;
				this.anInt126 = this.anInt130;
				this.anInt127 = this.anInt131;
				this.anInt128 = 0;
				this.anInt129 = 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("34268, " + -125 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEITBGVL", name = "d", descriptor = "(I)V")
	public void method59() {
		try {
			@Pc(17) byte[] local17 = new byte[this.anInt126 * this.anInt127];
			@Pc(19) int local19 = 0;
			for (@Pc(21) int local21 = 0; local21 < this.anInt127; local21++) {
				for (@Pc(28) int local28 = this.anInt126 - 1; local28 >= 0; local28--) {
					local17[local19++] = this.aByteArray2[local28 + local21 * this.anInt126];
				}
			}
			this.aByteArray2 = local17;
			this.anInt128 = this.anInt130 - this.anInt126 - this.anInt128;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("56379, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEITBGVL", name = "e", descriptor = "(I)V")
	public void method60() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt126 * this.anInt127];
			@Pc(10) int local10 = 0;
			for (@Pc(20) int local20 = this.anInt127 - 1; local20 >= 0; local20--) {
				for (@Pc(24) int local24 = 0; local24 < this.anInt126; local24++) {
					local8[local10++] = this.aByteArray2[local24 + local20 * this.anInt126];
				}
			}
			this.aByteArray2 = local8;
			this.anInt129 = this.anInt131 - this.anInt127 - this.anInt129;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("83126, " + -365 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEITBGVL", name = "a", descriptor = "(IBII)V")
	public void method61(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray12.length; local3++) {
				@Pc(14) int local14 = this.anIntArray12[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray12[local3] >> 8 & 0xFF;
				local38 += arg3;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray12[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray12[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			if (arg1 == -79) {
				;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("87716, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEITBGVL", name = "a", descriptor = "(IIB)V")
	public void method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt128;
			arg0 += this.anInt129;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt817;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt127;
			@Pc(23) int local23 = this.anInt126;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt817 - local23;
			@Pc(29) int local29 = 0;
			@Pc(47) int local47;
			if (arg0 < Class1_Sub1_Sub2.anInt819) {
				local47 = Class1_Sub1_Sub2.anInt819 - arg0;
				local20 -= local47;
				arg0 = Class1_Sub1_Sub2.anInt819;
				local17 = local47 * local23 + 0;
				local15 += local47 * Class1_Sub1_Sub2.anInt817;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt820) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt820;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt821) {
				local47 = Class1_Sub1_Sub2.anInt821 - arg1;
				local23 -= local47;
				arg1 = Class1_Sub1_Sub2.anInt821;
				local17 += local47;
				local15 += local47;
				local29 = local47 + 0;
				local27 += local47;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt822) {
				local47 = arg1 + local23 - Class1_Sub1_Sub2.anInt822;
				local23 -= local47;
				local29 += local47;
				local27 += local47;
			}
			if (local23 > 0 && local20 > 0) {
				this.method63(this.anInt125, Class1_Sub1_Sub2.anIntArray207, local29, local23, this.anIntArray12, local17, local15, local20, local27, this.aByteArray2);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("14784, " + arg0 + ", " + arg1 + ", " + 35 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEITBGVL", name = "a", descriptor = "(I[III[IIIII[B)V")
	private void method63(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[] arg9) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(10) int local10;
			while (arg0 >= 0) {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			@Pc(22) int local22 = -(arg3 & 0x3);
			for (local10 = -arg7; local10 < 0; local10++) {
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					@Pc(36) byte local36 = arg9[arg5++];
					if (local36 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg4[local36 & 0xFF];
					}
					local36 = arg9[arg5++];
					if (local36 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg4[local36 & 0xFF];
					}
					local36 = arg9[arg5++];
					if (local36 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg4[local36 & 0xFF];
					}
					local36 = arg9[arg5++];
					if (local36 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg4[local36 & 0xFF];
					}
				}
				for (@Pc(112) int local112 = local22; local112 < 0; local112++) {
					@Pc(119) byte local119 = arg9[arg5++];
					if (local119 == 0) {
						arg6++;
					} else {
						arg1[arg6++] = arg4[local119 & 0xFF];
					}
				}
				arg6 += arg8;
				arg5 += arg2;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("39719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
