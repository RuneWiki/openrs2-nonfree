import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ib")
public final class Class1_Sub3_Sub2_Sub3 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
	private int anInt386 = 129;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	private int anInt387 = -25737;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt392;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	public int anInt388;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	public int anInt389;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub3(@OriginalArg(0) Class36 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(35) Class1_Sub3_Sub3 local35 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, arg1 + ".dat"), 4);
		@Pc(45) Class1_Sub3_Sub3 local45 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "index.dat"), 4);
		local45.anInt433 = local35.method382();
		this.anInt392 = local45.method382();
		this.anInt393 = local45.method382();
		@Pc(60) int local60 = local45.method380();
		this.anIntArray157 = new int[local60];
		for (@Pc(66) int local66 = 0; local66 < local60 - 1; local66++) {
			this.anIntArray157[local66 + 1] = local45.method384();
		}
		for (@Pc(90) int local90 = 0; local90 < arg2; local90++) {
			local45.anInt433 += 2;
			local35.anInt433 += local45.method382() * local45.method382();
			local45.anInt433++;
		}
		this.anInt390 = local45.method380();
		this.anInt391 = local45.method380();
		this.anInt388 = local45.method382();
		this.anInt389 = local45.method382();
		@Pc(137) int local137 = local45.method380();
		@Pc(143) int local143 = this.anInt388 * this.anInt389;
		this.aByteArray3 = new byte[local143];
		@Pc(151) int local151;
		if (local137 == 0) {
			for (local151 = 0; local151 < local143; local151++) {
				this.aByteArray3[local151] = local35.method381();
			}
		} else if (local137 == 1) {
			for (local151 = 0; local151 < this.anInt388; local151++) {
				for (@Pc(173) int local173 = 0; local173 < this.anInt389; local173++) {
					this.aByteArray3[local151 + local173 * this.anInt388] = local35.method381();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method303(@OriginalArg(0) int arg0) {
		try {
			this.anInt392 /= 2;
			this.anInt393 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt392 * this.anInt393];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt389; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt388; local28++) {
					local20[(local28 + this.anInt390 >> 1) + (local24 + this.anInt391 >> 1) * this.anInt392] = this.aByteArray3[local22++];
				}
			}
			this.aByteArray3 = local20;
			this.anInt388 = this.anInt392;
			this.anInt389 = this.anInt393;
			this.anInt390 = 0;
			@Pc(81) boolean local81 = false;
			this.anInt391 = 0;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("89067, " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public void method304(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt388 != this.anInt392 || this.anInt389 != this.anInt393) {
				@Pc(19) byte[] local19 = new byte[this.anInt392 * this.anInt393];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt389; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt388; local27++) {
						local19[local27 + this.anInt390 + (local23 + this.anInt391) * this.anInt392] = this.aByteArray3[local21++];
					}
				}
				this.aByteArray3 = local19;
				this.anInt388 = this.anInt392;
				this.anInt389 = this.anInt393;
				while (arg0 >= 0) {
					this.aBoolean107 = !this.aBoolean107;
				}
				this.anInt390 = 0;
				this.anInt391 = 0;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("91333, " + arg0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public void method305() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt388 * this.anInt389];
			@Pc(10) int local10 = 0;
			if (this.anInt387 != -25737) {
				this.aBoolean107 = !this.aBoolean107;
			}
			for (@Pc(24) int local24 = 0; local24 < this.anInt389; local24++) {
				for (@Pc(31) int local31 = this.anInt388 - 1; local31 >= 0; local31--) {
					local8[local10++] = this.aByteArray3[local31 + local24 * this.anInt388];
				}
			}
			this.aByteArray3 = local8;
			this.anInt390 = this.anInt392 - this.anInt388 - this.anInt390;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("22980, " + -25737 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public void method306() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt388 * this.anInt389];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt389 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt388; local19++) {
					local8[local10++] = this.aByteArray3[local19 + local15 * this.anInt388];
				}
			}
			this.aByteArray3 = local8;
			this.anInt391 = this.anInt393 - this.anInt389 - this.anInt391;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("30647, " + false + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt390;
			arg0 += this.anInt391;
			@Pc(15) int local15 = arg2 + arg0 * Class1_Sub3_Sub2.anInt406;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt389;
			@Pc(23) int local23 = this.anInt388;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt406 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class1_Sub3_Sub2.anInt408) {
				local36 = Class1_Sub3_Sub2.anInt408 - arg0;
				local20 -= local36;
				arg0 = Class1_Sub3_Sub2.anInt408;
				local17 = local36 * local23;
				local15 += local36 * Class1_Sub3_Sub2.anInt406;
			}
			if (arg0 + local20 > Class1_Sub3_Sub2.anInt409) {
				local20 -= arg0 + local20 - Class1_Sub3_Sub2.anInt409;
			}
			if (arg2 < Class1_Sub3_Sub2.anInt410) {
				local36 = Class1_Sub3_Sub2.anInt410 - arg2;
				local23 -= local36;
				arg2 = Class1_Sub3_Sub2.anInt410;
				local17 += local36;
				local15 += local36;
				local29 = local36;
				local27 += local36;
			}
			if (arg2 + local23 > Class1_Sub3_Sub2.anInt411) {
				local36 = arg2 + local23 - Class1_Sub3_Sub2.anInt411;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method308(local20, local17, local29, Class1_Sub3_Sub2.anIntArray159, this.anIntArray157, this.aByteArray3, local27, local15, local23);
				@Pc(142) int local142 = 3 / arg1;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("62384, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[I[I[BBIII)V")
	private void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(20) int local20 = -(arg8 >> 2);
			@Pc(25) int local25 = -(arg8 & 0x3);
			for (@Pc(28) int local28 = -arg0; local28 < 0; local28++) {
				for (@Pc(32) int local32 = local20; local32 < 0; local32++) {
					@Pc(39) byte local39 = arg5[arg1++];
					if (local39 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg4[local39 & 0xFF];
					}
					local39 = arg5[arg1++];
					if (local39 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg4[local39 & 0xFF];
					}
					local39 = arg5[arg1++];
					if (local39 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg4[local39 & 0xFF];
					}
					local39 = arg5[arg1++];
					if (local39 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg4[local39 & 0xFF];
					}
				}
				for (@Pc(115) int local115 = local25; local115 < 0; local115++) {
					@Pc(122) byte local122 = arg5[arg1++];
					if (local122 == 0) {
						arg7++;
					} else {
						arg3[arg7++] = arg4[local122 & 0xFF];
					}
				}
				arg7 += arg6;
				arg1 += arg2;
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("86725, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}
}
