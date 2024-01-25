import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class361 {

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "[[Lclient!ica;")
	private Class150[][] aClass150ArrayArray1;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "Lclient!ni;")
	private final Class47_Sub2 aClass47_Sub2_3;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "Lclient!hea;")
	private final Class134_Sub1 aClass134_Sub1_23;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	public final int anInt9592;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
	private final int anInt9601;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "[B")
	public final byte[] aByteArray103;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	private final int anInt9600;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
	private final int anInt9599;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	private final int anInt9594;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!hea;Lclient!ni;)V")
	public Class361(@OriginalArg(0) Class134_Sub1 arg0, @OriginalArg(1) Class47_Sub2 arg1) {
		this.aClass47_Sub2_3 = arg1;
		this.aClass134_Sub1_23 = arg0;
		this.anInt9592 = (this.aClass47_Sub2_3.anInt9209 * this.aClass47_Sub2_3.anInt9208 >> this.aClass134_Sub1_23.anInt8441) + 2;
		this.anInt9601 = (this.aClass47_Sub2_3.anInt9210 * this.aClass47_Sub2_3.anInt9208 >> this.aClass134_Sub1_23.anInt8441) + 2;
		this.aByteArray103 = new byte[this.anInt9601 * this.anInt9592];
		this.anInt9600 = this.aClass134_Sub1_23.anInt8441 + 7 - this.aClass47_Sub2_3.anInt9205;
		this.anInt9599 = this.aClass47_Sub2_3.anInt9209 >> this.anInt9600;
		this.anInt9594 = this.aClass47_Sub2_3.anInt9210 >> this.anInt9600;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ha;IB)Z")
	public boolean method7824(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6_Sub5 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub6_Sub5_Sub2 local6 = (Class1_Sub6_Sub5_Sub2) arg1;
		arg0 += local6.anInt8923 + 1;
		arg2 += local6.anInt8919 + 1;
		@Pc(36) int local36 = arg2 + arg0 * this.anInt9592;
		@Pc(39) int local39 = local6.anInt8925;
		@Pc(42) int local42 = local6.anInt8924;
		@Pc(48) int local48 = this.anInt9592 - local42;
		@Pc(58) int local58;
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local36 += local58 * this.anInt9592;
			arg0 = 1;
			local39 -= local58;
		}
		if (this.anInt9601 <= arg0 + local39) {
			local58 = arg0 + local39 + 1 - this.anInt9601;
			local39 -= local58;
		}
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local48 += local58;
			local36 += local58;
			local42 -= local58;
			arg2 = 1;
		}
		if (local42 + arg2 >= this.anInt9592) {
			local58 = arg2 + local42 + 1 - this.anInt9592;
			local48 += local58;
			local42 -= local58;
		}
		if (local42 > 0 && local39 > 0) {
			local48 += this.anInt9592 * 7;
			return Static483.method6536(local39, local42, local48, local36, this.aByteArray103);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(ILclient!ha;IB)V")
	public void method7825(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6_Sub5 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub6_Sub5_Sub2 local6 = (Class1_Sub6_Sub5_Sub2) arg1;
		arg0 += local6.anInt8923 + 1;
		arg2 += local6.anInt8919 + 1;
		@Pc(28) int local28 = arg2 + this.anInt9592 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(39) int local39 = local6.anInt8925;
		@Pc(42) int local42 = local6.anInt8924;
		@Pc(48) int local48 = this.anInt9592 - local42;
		@Pc(50) int local50 = 0;
		@Pc(56) int local56;
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			arg0 = 1;
			local28 += local56 * this.anInt9592;
			local30 = local42 * local56;
			local39 -= local56;
		}
		if (this.anInt9601 <= local39 + arg0) {
			local56 = local39 + arg0 + 1 - this.anInt9601;
			local39 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local48 += local56;
			local50 = local56;
			local28 += local56;
			local30 += local56;
			local42 -= local56;
			arg2 = 1;
		}
		if (arg2 + local42 >= this.anInt9592) {
			local56 = local42 + arg2 + 1 - this.anInt9592;
			local42 -= local56;
			local50 += local56;
			local48 += local56;
		}
		if (local42 > 0 && local39 > 0) {
			Static46.method708(local30, local42, local48, local6.aByteArray95, local28, local50, this.aByteArray103, local39);
			this.method7826(local42, arg2, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIIII)V")
	private void method7826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass150ArrayArray1 == null) {
			return;
		}
		@Pc(26) int local26 = arg1 - 1 >> 7;
		@Pc(35) int local35 = arg1 + arg0 - 2 >> 7;
		@Pc(41) int local41 = arg2 - 1 >> 7;
		@Pc(51) int local51 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(53) int local53 = local26; local53 <= local35; local53++) {
			@Pc(60) Class150[] local60 = this.aClass150ArrayArray1[local53];
			for (@Pc(62) int local62 = local41; local62 <= local51; local62++) {
				if (local60[local62] != null) {
					local60[local62].aBoolean315 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public void method7827() {
		this.aClass150ArrayArray1 = new Class150[this.anInt9599][this.anInt9594];
		for (@Pc(23) int local23 = 0; local23 < this.anInt9594; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt9599; local27++) {
				this.aClass150ArrayArray1[local27][local23] = new Class150(this.aClass134_Sub1_23, this, this.aClass47_Sub2_3, local27, local23, this.anInt9600, local27 * 128 + 1, local23 * 128 + 1);
				if (this.aClass150ArrayArray1[local27][local23].anInt4100 == 0) {
					this.aClass150ArrayArray1[local27][local23] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZ[[ZIII)V")
	public void method7829(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass134_Sub1_23.method6735(false);
		this.aClass134_Sub1_23.method6827(false);
		this.aClass134_Sub1_23.method6746(1);
		this.aClass134_Sub1_23.method6724(1);
		this.aClass134_Sub1_23.method6857(false, false, -2);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass134_Sub1_23.anInt8431 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg1) {
			for (local45 = 0; local45 < this.anInt9594; local45++) {
				local52 = local45 << this.anInt9600;
				local59 = local45 + 1 << this.anInt9600;
				label87: for (local61 = 0; local61 < this.anInt9599; local61++) {
					if (this.aClass150ArrayArray1[local61][local45] != null) {
						@Pc(329) int local329 = local61 << this.anInt9600;
						@Pc(336) int local336 = local61 + 1 << this.anInt9600;
						for (@Pc(338) int local338 = local329; local338 < local336; local338++) {
							if (local338 - arg3 >= -arg4 && local338 - arg3 <= arg4) {
								for (@Pc(359) int local359 = local52; local359 < local59; local359++) {
									if (-arg4 <= local359 - arg0 && arg4 >= local359 - arg0 && arg2[arg4 + local338 - arg3][local359 + arg4 - arg0]) {
										@Pc(398) Class113_Sub3 local398 = this.aClass134_Sub1_23.method6748();
										local398.method6054(1.0F, local41, local41);
										local398.U(-local61, -local45, 0);
										this.aClass134_Sub1_23.method6808(Static117.aClass309_2);
										this.aClass150ArrayArray1[local61][local45].method3322();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt9594; local45++) {
				local52 = local45 << this.anInt9600;
				local59 = local45 + 1 << this.anInt9600;
				for (local61 = 0; local61 < this.anInt9599; local61++) {
					@Pc(70) Class150 local70 = this.aClass150ArrayArray1[local61][local45];
					if (local70 != null) {
						@Pc(83) Interface20 local83 = this.aClass134_Sub1_23.method6828(local70.anInt4100 * 3);
						@Pc(88) Buffer local88 = local83.method7387();
						if (local88 != null) {
							@Pc(96) Stream local96 = this.aClass134_Sub1_23.method6846(local88);
							@Pc(98) int local98 = 0;
							@Pc(103) int local103 = local61 << this.anInt9600;
							@Pc(110) int local110 = local61 + 1 << this.anInt9600;
							for (@Pc(112) int local112 = local52; local112 < local59; local112++) {
								if (-arg4 <= local112 - arg0 && arg4 >= local112 - arg0) {
									@Pc(135) int local135 = this.aClass47_Sub2_3.anInt9209 * local112 + local103;
									for (@Pc(137) int local137 = local103; local137 < local110; local137++) {
										if (-arg4 <= local137 - arg3 && local137 - arg3 <= arg4 && arg2[local137 + arg4 - arg3][arg4 + local112 - arg0]) {
											@Pc(182) short[] local182 = this.aClass47_Sub2_3.aShortArrayArray3[local135];
											if (local182 != null) {
												@Pc(188) int local188;
												if (Stream.c()) {
													for (local188 = 0; local188 < local182.length; local188++) {
														local96.c(local182[local188] & 0xFFFF);
														local98++;
													}
												} else {
													for (local188 = 0; local188 < local182.length; local188++) {
														local96.a(local182[local188] & 0xFFFF);
														local98++;
													}
												}
											}
										}
										local135++;
									}
								}
							}
							local96.a();
							if (local83.method7389() && local98 > 0) {
								@Pc(256) Class113_Sub3 local256 = this.aClass134_Sub1_23.method6748();
								local256.method6054(1.0F, local41, local41);
								local256.U(-local61, -local45, 0);
								this.aClass134_Sub1_23.method6808(Static117.aClass309_2);
								local70.method3323(local83, local98 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass134_Sub1_23.method6813();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ha;III)V")
	public void method7831(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub6_Sub5_Sub2 local6 = (Class1_Sub6_Sub5_Sub2) arg0;
		arg1 += local6.anInt8919 + 1;
		arg2 += local6.anInt8923 + 1;
		@Pc(27) int local27 = arg2 * this.anInt9592 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8925;
		@Pc(35) int local35 = local6.anInt8924;
		@Pc(47) int local47 = this.anInt9592 - local35;
		@Pc(49) int local49 = 0;
		@Pc(59) int local59;
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			local32 -= local59;
			local29 = local35 * local59;
			arg2 = 1;
			local27 += local59 * this.anInt9592;
		}
		if (arg2 + local32 >= this.anInt9601) {
			local59 = local32 + arg2 + 1 - this.anInt9601;
			local32 -= local59;
		}
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			local29 += local59;
			local27 += local59;
			arg1 = 1;
			local35 -= local59;
			local49 = local59;
			local47 += local59;
		}
		if (arg1 + local35 >= this.anInt9592) {
			local59 = arg1 + local35 + 1 - this.anInt9592;
			local49 += local59;
			local47 += local59;
			local35 -= local59;
		}
		if (local35 > 0 && local32 > 0) {
			Static566.method7645(local29, local6.aByteArray95, local27, local47, local35, this.aByteArray103, local32, local49);
			this.method7826(local35, arg1, arg2, local32);
		}
	}
}
