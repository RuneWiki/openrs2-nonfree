import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DGXCFOYI")
public final class Class4_Sub1_Sub2_Sub1 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!DGXCFOYI", name = "z", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!DGXCFOYI", name = "A", descriptor = "I")
	private int anInt190 = 1;

	@OriginalMember(owner = "client!DGXCFOYI", name = "B", descriptor = "I")
	private int anInt191 = 7964;

	@OriginalMember(owner = "client!DGXCFOYI", name = "C", descriptor = "B")
	private byte aByte5 = 3;

	@OriginalMember(owner = "client!DGXCFOYI", name = "D", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!DGXCFOYI", name = "E", descriptor = "I")
	private int anInt192 = -313;

	@OriginalMember(owner = "client!DGXCFOYI", name = "F", descriptor = "B")
	private byte aByte6 = -81;

	@OriginalMember(owner = "client!DGXCFOYI", name = "G", descriptor = "I")
	private int anInt193 = -13936;

	@OriginalMember(owner = "client!DGXCFOYI", name = "H", descriptor = "I")
	private int anInt194 = 133;

	@OriginalMember(owner = "client!DGXCFOYI", name = "O", descriptor = "I")
	public int anInt199;

	@OriginalMember(owner = "client!DGXCFOYI", name = "P", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!DGXCFOYI", name = "J", descriptor = "[I")
	public int[] anIntArray23;

	@OriginalMember(owner = "client!DGXCFOYI", name = "M", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!DGXCFOYI", name = "N", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!DGXCFOYI", name = "K", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!DGXCFOYI", name = "L", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!DGXCFOYI", name = "I", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!DGXCFOYI", name = "<init>", descriptor = "(Lclient!TKEGJSFV;Ljava/lang/String;I)V")
	public Class4_Sub1_Sub2_Sub1(@OriginalArg(0) Class38 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(46) Class4_Sub1_Sub3 local46 = new Class4_Sub1_Sub3(arg0.method514(arg1 + ".dat", null), false);
		@Pc(55) Class4_Sub1_Sub3 local55 = new Class4_Sub1_Sub3(arg0.method514("index.dat", null), false);
		local55.anInt242 = local46.method169();
		this.anInt199 = local55.method169();
		this.anInt200 = local55.method169();
		@Pc(70) int local70 = local55.method167();
		this.anIntArray23 = new int[local70];
		for (@Pc(76) int local76 = 0; local76 < local70 - 1; local76++) {
			this.anIntArray23[local76 + 1] = local55.method171();
		}
		for (@Pc(100) int local100 = 0; local100 < arg2; local100++) {
			local55.anInt242 += 2;
			local46.anInt242 += local55.method169() * local55.method169();
			local55.anInt242++;
		}
		this.anInt197 = local55.method167();
		this.anInt198 = local55.method167();
		this.anInt195 = local55.method169();
		this.anInt196 = local55.method169();
		@Pc(147) int local147 = local55.method167();
		@Pc(153) int local153 = this.anInt195 * this.anInt196;
		this.aByteArray2 = new byte[local153];
		@Pc(161) int local161;
		if (local147 == 0) {
			for (local161 = 0; local161 < local153; local161++) {
				this.aByteArray2[local161] = local46.method168();
			}
		} else if (local147 == 1) {
			for (local161 = 0; local161 < this.anInt195; local161++) {
				for (@Pc(183) int local183 = 0; local183 < this.anInt196; local183++) {
					this.aByteArray2[local161 + local183 * this.anInt195] = local46.method168();
				}
			}
		}
	}

	@OriginalMember(owner = "client!DGXCFOYI", name = "a", descriptor = "(I)V")
	public void method81() {
		try {
			this.anInt199 /= 2;
			this.anInt200 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt199 * this.anInt200];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt196; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt195; local28++) {
					local20[(local28 + this.anInt197 >> 1) + (local24 + this.anInt198 >> 1) * this.anInt199] = this.aByteArray2[local22++];
				}
			}
			this.aByteArray2 = local20;
			this.anInt195 = this.anInt199;
			this.anInt196 = this.anInt200;
			this.anInt197 = 0;
			this.anInt198 = 0;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("26004, " + 14439 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGXCFOYI", name = "b", descriptor = "(I)V")
	public void method82() {
		try {
			if (this.anInt195 != this.anInt199 || this.anInt196 != this.anInt200) {
				@Pc(22) byte[] local22 = new byte[this.anInt199 * this.anInt200];
				@Pc(24) int local24 = 0;
				for (@Pc(26) int local26 = 0; local26 < this.anInt196; local26++) {
					for (@Pc(30) int local30 = 0; local30 < this.anInt195; local30++) {
						local22[local30 + this.anInt197 + (local26 + this.anInt198) * this.anInt199] = this.aByteArray2[local24++];
					}
				}
				this.aByteArray2 = local22;
				this.anInt195 = this.anInt199;
				this.anInt196 = this.anInt200;
				this.anInt197 = 0;
				this.anInt198 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("87413, " + 0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGXCFOYI", name = "c", descriptor = "(I)V")
	public void method83() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt195 * this.anInt196];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt196; local12++) {
				for (@Pc(19) int local19 = this.anInt195 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray2[local19 + local12 * this.anInt195];
				}
			}
			this.aByteArray2 = local8;
			this.anInt197 = this.anInt199 - this.anInt195 - this.anInt197;
			if (this.anInt190 > 1 || this.anInt190 < 1) {
				;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("28930, " + 1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGXCFOYI", name = "d", descriptor = "(I)V")
	public void method84(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt195 * this.anInt196];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt196 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt195; local19++) {
					local8[local10++] = this.aByteArray2[local19 + local15 * this.anInt195];
				}
			}
			this.aByteArray2 = local8;
			if (arg0 >= 0) {
				this.aBoolean43 = !this.aBoolean43;
			}
			this.anInt198 = this.anInt200 - this.anInt196 - this.anInt198;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("73523, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGXCFOYI", name = "a", descriptor = "(IIBI)V")
	public void method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray23.length; local14++) {
				@Pc(25) int local25 = this.anIntArray23[local14] >> 16 & 0xFF;
				local25 += arg1;
				if (local25 < 0) {
					local25 = 0;
				} else if (local25 > 255) {
					local25 = 255;
				}
				@Pc(49) int local49 = this.anIntArray23[local14] >> 8 & 0xFF;
				local49 += arg0;
				if (local49 < 0) {
					local49 = 0;
				} else if (local49 > 255) {
					local49 = 255;
				}
				@Pc(71) int local71 = this.anIntArray23[local14] & 0xFF;
				local71 += arg2;
				if (local71 < 0) {
					local71 = 0;
				} else if (local71 > 255) {
					local71 = 255;
				}
				this.anIntArray23[local14] = (local25 << 16) + (local49 << 8) + local71;
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("88238, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGXCFOYI", name = "a", descriptor = "(III)V")
	public void method86(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			@Pc(5) int local5;
			if (this.anInt191 != 7964) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			arg1 += this.anInt197;
			arg0 += this.anInt198;
			local5 = arg1 + arg0 * Class4_Sub1_Sub2.anInt698;
			@Pc(28) int local28 = 0;
			@Pc(31) int local31 = this.anInt196;
			@Pc(34) int local34 = this.anInt195;
			@Pc(38) int local38 = Class4_Sub1_Sub2.anInt698 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg0 < Class4_Sub1_Sub2.anInt700) {
				local47 = Class4_Sub1_Sub2.anInt700 - arg0;
				local31 -= local47;
				arg0 = Class4_Sub1_Sub2.anInt700;
				local28 = local47 * local34 + 0;
				local5 += local47 * Class4_Sub1_Sub2.anInt698;
			}
			if (arg0 + local31 > Class4_Sub1_Sub2.anInt701) {
				local31 -= arg0 + local31 - Class4_Sub1_Sub2.anInt701;
			}
			if (arg1 < Class4_Sub1_Sub2.anInt702) {
				local47 = Class4_Sub1_Sub2.anInt702 - arg1;
				local34 -= local47;
				arg1 = Class4_Sub1_Sub2.anInt702;
				local28 += local47;
				local5 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg1 + local34 > Class4_Sub1_Sub2.anInt703) {
				local47 = arg1 + local34 - Class4_Sub1_Sub2.anInt703;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method87(local28, local5, this.anIntArray23, local40, local31, Class4_Sub1_Sub2.anIntArray165, local34, local38, this.aByteArray2);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("14570, " + 7964 + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DGXCFOYI", name = "a", descriptor = "(II[III[IBII[B)V")
	private void method87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(22) int local22 = -(arg6 & 0x3);
			for (@Pc(25) int local25 = -arg4; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					@Pc(36) byte local36 = arg8[arg0++];
					if (local36 == 0) {
						arg1++;
					} else {
						arg5[arg1++] = arg2[local36 & 0xFF];
					}
					local36 = arg8[arg0++];
					if (local36 == 0) {
						arg1++;
					} else {
						arg5[arg1++] = arg2[local36 & 0xFF];
					}
					local36 = arg8[arg0++];
					if (local36 == 0) {
						arg1++;
					} else {
						arg5[arg1++] = arg2[local36 & 0xFF];
					}
					local36 = arg8[arg0++];
					if (local36 == 0) {
						arg1++;
					} else {
						arg5[arg1++] = arg2[local36 & 0xFF];
					}
				}
				for (@Pc(112) int local112 = local22; local112 < 0; local112++) {
					@Pc(119) byte local119 = arg8[arg0++];
					if (local119 == 0) {
						arg1++;
					} else {
						arg5[arg1++] = arg2[local119 & 0xFF];
					}
				}
				arg1 += arg7;
				arg0 += arg3;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("75996, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 8 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
