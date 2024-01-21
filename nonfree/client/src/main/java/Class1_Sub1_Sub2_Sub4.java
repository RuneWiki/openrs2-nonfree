import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZXDQRRNS")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZXDQRRNS", name = "x", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "w", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "y", descriptor = "B")
	private byte aByte28 = 9;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "z", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "G", descriptor = "I")
	public int anInt801;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "H", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "B", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "E", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "F", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "C", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "D", descriptor = "I")
	public int anInt798;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "A", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!ZXDQRRNS", name = "<init>", descriptor = "(Lclient!WEMOPWVJ;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class43 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class1_Sub1_Sub4 local28 = new Class1_Sub1_Sub4(arg0.method515(arg1 + ".dat", null), true);
		@Pc(37) Class1_Sub1_Sub4 local37 = new Class1_Sub1_Sub4(arg0.method515("index.dat", null), true);
		local37.anInt624 = local28.method407();
		this.anInt801 = local37.method407();
		this.anInt802 = local37.method407();
		@Pc(52) int local52 = local37.method405();
		this.anIntArray209 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray209[local58 + 1] = local37.method409();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt624 += 2;
			local28.anInt624 += local37.method407() * local37.method407();
			local37.anInt624++;
		}
		this.anInt799 = local37.method405();
		this.anInt800 = local37.method405();
		this.anInt797 = local37.method407();
		this.anInt798 = local37.method407();
		@Pc(123) int local123 = local37.method405();
		@Pc(129) int local129 = this.anInt797 * this.anInt798;
		this.aByteArray20 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray20[local137] = local28.method406();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt797; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt798; local159++) {
					this.aByteArray20[local137 + local159 * this.anInt797] = local28.method406();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ZXDQRRNS", name = "c", descriptor = "(I)V")
	public void method565() {
		try {
			this.anInt801 /= 2;
			this.anInt802 /= 2;
			@Pc(23) byte[] local23 = new byte[this.anInt801 * this.anInt802];
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < this.anInt798; local27++) {
				for (@Pc(31) int local31 = 0; local31 < this.anInt797; local31++) {
					local23[(local31 + this.anInt799 >> 1) + (local27 + this.anInt800 >> 1) * this.anInt801] = this.aByteArray20[local25++];
				}
			}
			this.aByteArray20 = local23;
			this.anInt797 = this.anInt801;
			this.anInt798 = this.anInt802;
			this.anInt799 = 0;
			this.anInt800 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("72164, " + -362 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXDQRRNS", name = "d", descriptor = "(I)V")
	public void method566(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt797 != this.anInt801 || this.anInt798 != this.anInt802) {
				@Pc(19) byte[] local19 = new byte[this.anInt801 * this.anInt802];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt798; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt797; local27++) {
						local19[local27 + this.anInt799 + (local23 + this.anInt800) * this.anInt801] = this.aByteArray20[local21++];
					}
				}
				this.aByteArray20 = local19;
				this.anInt797 = this.anInt801;
				this.anInt798 = this.anInt802;
				this.anInt799 = 0;
				@Pc(76) boolean local76 = false;
				this.anInt800 = 0;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("91560, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXDQRRNS", name = "e", descriptor = "(I)V")
	public void method567() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt797 * this.anInt798];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt798; local12++) {
				for (@Pc(19) int local19 = this.anInt797 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray20[local19 + local12 * this.anInt797];
				}
			}
			this.aByteArray20 = local8;
			this.anInt799 = this.anInt801 - this.anInt797 - this.anInt799;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("27534, " + -6360 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXDQRRNS", name = "f", descriptor = "(I)V")
	public void method568() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt797 * this.anInt798];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt798 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt797; local19++) {
					local8[local10++] = this.aByteArray20[local19 + local15 * this.anInt797];
				}
			}
			this.aByteArray20 = local8;
			this.anInt800 = this.anInt802 - this.anInt798 - this.anInt800;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("1467, " + 0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXDQRRNS", name = "a", descriptor = "(IIII)V")
	public void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray209.length; local3++) {
				@Pc(14) int local14 = this.anIntArray209[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray209[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray209[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray209[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("43611, " + arg0 + ", " + arg1 + ", " + -879 + ", " + arg2 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXDQRRNS", name = "a", descriptor = "(IIB)V")
	public void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt799;
			arg0 += this.anInt800;
			@Pc(22) int local22 = arg1 + arg0 * Class1_Sub1_Sub2.anInt787;
			@Pc(24) int local24 = 0;
			@Pc(27) int local27 = this.anInt798;
			@Pc(30) int local30 = this.anInt797;
			@Pc(34) int local34 = Class1_Sub1_Sub2.anInt787 - local30;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43;
			if (arg0 < Class1_Sub1_Sub2.anInt789) {
				local43 = Class1_Sub1_Sub2.anInt789 - arg0;
				local27 -= local43;
				arg0 = Class1_Sub1_Sub2.anInt789;
				local24 = local43 * local30 + 0;
				local22 += local43 * Class1_Sub1_Sub2.anInt787;
			}
			if (arg0 + local27 > Class1_Sub1_Sub2.anInt790) {
				local27 -= arg0 + local27 - Class1_Sub1_Sub2.anInt790;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt791) {
				local43 = Class1_Sub1_Sub2.anInt791 - arg1;
				local30 -= local43;
				arg1 = Class1_Sub1_Sub2.anInt791;
				local24 += local43;
				local22 += local43;
				local36 = local43 + 0;
				local34 += local43;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt792) {
				local43 = arg1 + local30 - Class1_Sub1_Sub2.anInt792;
				local30 -= local43;
				local36 += local43;
				local34 += local43;
			}
			if (local30 > 0 && local27 > 0) {
				this.method571(local30, this.aByteArray20, local24, local34, this.anIntArray209, local36, local22, local27, Class1_Sub1_Sub2.anIntArray208);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("31251, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZXDQRRNS", name = "a", descriptor = "(IZ[BII[IIII[I)V")
	private void method571(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(19) int local19 = -arg7; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					@Pc(30) byte local30 = arg1[arg2++];
					if (local30 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg4[local30 & 0xFF];
					}
					local30 = arg1[arg2++];
					if (local30 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg4[local30 & 0xFF];
					}
					local30 = arg1[arg2++];
					if (local30 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg4[local30 & 0xFF];
					}
					local30 = arg1[arg2++];
					if (local30 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg4[local30 & 0xFF];
					}
				}
				for (@Pc(106) int local106 = local11; local106 < 0; local106++) {
					@Pc(113) byte local113 = arg1[arg2++];
					if (local113 == 0) {
						arg6++;
					} else {
						arg8[arg6++] = arg4[local113 & 0xFF];
					}
				}
				arg6 += arg3;
				arg2 += arg5;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("52002, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
