import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class209 {

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "[[Lclient!lo;")
	private Class192[][] aClass192ArrayArray1;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "Lclient!hm;")
	private final Class127_Sub1 aClass127_Sub1_3;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_11;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
	public final int anInt6080;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	private final int anInt6072;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
	private final int anInt6078;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "[B")
	public final byte[] aByteArray155;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	private final int anInt6069;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
	private final int anInt6074;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!rr;Lclient!hm;)V")
	public Class209(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) Class127_Sub1 arg1) {
		this.aClass127_Sub1_3 = arg1;
		this.aClass31_Sub1_11 = arg0;
		this.anInt6080 = (this.aClass127_Sub1_3.anInt10004 * this.aClass127_Sub1_3.anInt10009 >> this.aClass31_Sub1_11.anInt9130) + 2;
		this.anInt6072 = (this.aClass127_Sub1_3.anInt10007 * this.aClass127_Sub1_3.anInt10009 >> this.aClass31_Sub1_11.anInt9130) + 2;
		this.anInt6078 = this.aClass31_Sub1_11.anInt9130 + 7 - this.aClass127_Sub1_3.anInt10008;
		this.aByteArray155 = new byte[this.anInt6080 * this.anInt6072];
		this.anInt6069 = this.aClass127_Sub1_3.anInt10004 >> this.anInt6078;
		this.anInt6074 = this.aClass127_Sub1_3.anInt10007 >> this.anInt6078;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	public void method4915() {
		this.aClass192ArrayArray1 = new Class192[this.anInt6069][this.anInt6074];
		for (@Pc(20) int local20 = 0; local20 < this.anInt6074; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt6069; local24++) {
				this.aClass192ArrayArray1[local24][local20] = new Class192(this.aClass31_Sub1_11, this, this.aClass127_Sub1_3, local24, local20, this.anInt6078, local24 * 128 + 1, local20 * 128 - -1);
				if (this.aClass192ArrayArray1[local24][local20].anInt5769 == 0) {
					this.aClass192ArrayArray1[local24][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIIII)V")
	private void method4916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass192ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(26) int local26 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg1 - 1 >> 7;
		@Pc(43) int local43 = arg1 + arg2 - 1 - 1 >> 7;
		for (@Pc(51) int local51 = local15; local51 <= local26; local51++) {
			@Pc(58) Class192[] local58 = this.aClass192ArrayArray1[local51];
			for (@Pc(60) int local60 = local32; local60 <= local43; local60++) {
				if (local58[local60] != null) {
					local58[local60].aBoolean393 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZ[[ZIB)V")
	public void method4917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) int arg4) {
		this.aClass31_Sub1_11.method7082(false);
		this.aClass31_Sub1_11.method7058(false);
		this.aClass31_Sub1_11.method7115(1);
		this.aClass31_Sub1_11.method7141(1);
		this.aClass31_Sub1_11.method7088(false, -2, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass31_Sub1_11.anInt9136 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg2) {
			for (local45 = 0; local45 < this.anInt6074; local45++) {
				local52 = local45 << this.anInt6078;
				local59 = local45 + 1 << this.anInt6078;
				label87: for (local61 = 0; local61 < this.anInt6069; local61++) {
					if (this.aClass192ArrayArray1[local61][local45] != null) {
						@Pc(314) int local314 = local61 << this.anInt6078;
						@Pc(321) int local321 = local61 + 1 << this.anInt6078;
						for (@Pc(323) int local323 = local314; local323 < local321; local323++) {
							if (local323 - arg4 >= -arg0 && arg0 >= local323 - arg4) {
								for (@Pc(344) int local344 = local52; local344 < local59; local344++) {
									if (-arg0 <= local344 - arg1 && local344 - arg1 <= arg0 && arg3[arg0 + local323 - arg4][arg0 + local344 - arg1]) {
										@Pc(382) Class42_Sub3 local382 = this.aClass31_Sub1_11.method7146();
										local382.method7532(local41, local41, 1.0F);
										local382.U(-local61, -local45, 0);
										this.aClass31_Sub1_11.method7161(Static130.aClass51_15);
										this.aClass192ArrayArray1[local61][local45].method4677();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt6074; local45++) {
				local52 = local45 << this.anInt6078;
				local59 = local45 + 1 << this.anInt6078;
				for (local61 = 0; local61 < this.anInt6069; local61++) {
					@Pc(70) Class192 local70 = this.aClass192ArrayArray1[local61][local45];
					if (local70 != null) {
						@Pc(81) Interface2 local81 = this.aClass31_Sub1_11.method7119(local70.anInt5769 * 3);
						@Pc(86) Buffer local86 = local81.method7292();
						if (local86 != null) {
							@Pc(94) Stream local94 = this.aClass31_Sub1_11.method7154(local86);
							@Pc(96) int local96 = 0;
							@Pc(101) int local101 = local61 << this.anInt6078;
							@Pc(108) int local108 = local61 + 1 << this.anInt6078;
							for (@Pc(110) int local110 = local52; local110 < local59; local110++) {
								if (-arg0 <= local110 - arg1 && local110 - arg1 <= arg0) {
									@Pc(137) int local137 = local101 + local110 * this.aClass127_Sub1_3.anInt10004;
									for (@Pc(139) int local139 = local101; local139 < local108; local139++) {
										if (local139 - arg4 >= -arg0 && arg0 >= local139 - arg4 && arg3[arg0 + local139 - arg4][arg0 + local110 - arg1]) {
											@Pc(174) short[] local174 = this.aClass127_Sub1_3.aShortArrayArray4[local137];
											if (local174 != null) {
												@Pc(180) int local180;
												if (Stream.a()) {
													for (local180 = 0; local180 < local174.length; local180++) {
														local96++;
														local94.e(local174[local180] & 0xFFFF);
													}
												} else {
													for (local180 = 0; local180 < local174.length; local180++) {
														local94.c(local174[local180] & 0xFFFF);
														local96++;
													}
												}
											}
										}
										local137++;
									}
								}
							}
							local94.c();
							if (local81.method7291() && local96 > 0) {
								@Pc(239) Class42_Sub3 local239 = this.aClass31_Sub1_11.method7146();
								local239.method7532(local41, local41, 1.0F);
								local239.U(-local61, -local45, 0);
								this.aClass31_Sub1_11.method7161(Static130.aClass51_15);
								local70.method4676(local81, local96 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass31_Sub1_11.method7120();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BILclient!ha;I)Z")
	public boolean method4919(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub3_Sub2 local6 = (Class3_Sub7_Sub3_Sub2) arg1;
		arg0 += local6.anInt10303 + 1;
		arg2 += local6.anInt10304 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt6080;
		@Pc(31) int local31 = local6.anInt10300;
		@Pc(40) int local40 = local6.anInt10302;
		@Pc(46) int local46 = this.anInt6080 - local40;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local28 += local53 * this.anInt6080;
			local31 -= local53;
			arg0 = 1;
		}
		if (local31 + arg0 >= this.anInt6072) {
			local53 = local31 + arg0 + 1 - this.anInt6072;
			local31 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local40 -= local53;
			local28 += local53;
			arg2 = 1;
			local46 += local53;
		}
		if (local40 + arg2 >= this.anInt6080) {
			local53 = local40 + arg2 + 1 - this.anInt6080;
			local40 -= local53;
			local46 += local53;
		}
		if (local40 > 0 && local31 > 0) {
			local46 += this.anInt6080 * 7;
			return Static397.method5596(local40, local31, this.aByteArray155, local46, local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBLclient!ha;I)V")
	public void method4921(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub3_Sub2 local6 = (Class3_Sub7_Sub3_Sub2) arg1;
		arg2 += local6.anInt10304 + 1;
		arg0 += local6.anInt10303 + 1;
		@Pc(27) int local27 = arg2 + this.anInt6080 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt10300;
		@Pc(35) int local35 = local6.anInt10302;
		@Pc(40) int local40 = this.anInt6080 - local35;
		if (arg0 <= 0) {
			@Pc(47) int local47 = 1 - arg0;
			arg0 = 1;
			local29 = local47 * local35;
			local27 += this.anInt6080 * local47;
			local32 -= local47;
		}
		@Pc(76) int local76 = 0;
		@Pc(93) int local93;
		if (local32 + arg0 >= this.anInt6072) {
			local93 = arg0 + local32 + 1 - this.anInt6072;
			local32 -= local93;
		}
		if (arg2 <= 0) {
			local93 = 1 - arg2;
			local27 += local93;
			local29 += local93;
			local35 -= local93;
			arg2 = 1;
			local40 += local93;
			local76 = local93;
		}
		if (local35 + arg2 >= this.anInt6080) {
			local93 = arg2 + local35 + 1 - this.anInt6080;
			local40 += local93;
			local76 += local93;
			local35 -= local93;
		}
		if (local35 > 0 && local32 > 0) {
			Static105.method2184(local32, local76, local27, this.aByteArray155, local6.aByteArray245, local29, local40, local35);
			this.method4916(arg2, arg0, local32, local35);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLclient!ha;II)V")
	public void method4922(@OriginalArg(1) Class3_Sub7_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub3_Sub2 local6 = (Class3_Sub7_Sub3_Sub2) arg0;
		arg2 += local6.anInt10303 + 1;
		arg1 += local6.anInt10304 + 1;
		@Pc(32) int local32 = arg1 + arg2 * this.anInt6080;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local6.anInt10300;
		@Pc(40) int local40 = local6.anInt10302;
		@Pc(46) int local46 = this.anInt6080 - local40;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local34 = local53 * local40;
			arg2 = 1;
			local32 += this.anInt6080 * local53;
			local37 -= local53;
		}
		@Pc(74) int local74 = 0;
		if (this.anInt6072 <= arg2 + local37) {
			local53 = arg2 + local37 + 1 - this.anInt6072;
			local37 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local40 -= local53;
			local34 += local53;
			local32 += local53;
			local74 = local53;
			arg1 = 1;
			local46 += local53;
		}
		if (arg1 + local40 >= this.anInt6080) {
			local53 = local40 + arg1 + 1 - this.anInt6080;
			local46 += local53;
			local40 -= local53;
			local74 += local53;
		}
		if (local40 > 0 && local37 > 0) {
			Static37.method1053(local34, local32, local46, local74, this.aByteArray155, local40, local37, local6.aByteArray245);
			this.method4916(arg1, arg2, local37, local40);
		}
	}
}
