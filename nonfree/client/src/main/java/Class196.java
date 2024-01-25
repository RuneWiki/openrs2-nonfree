import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class196 {

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "[[Lclient!cma;")
	private Class55[][] aClass55ArrayArray1;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "Lclient!tla;")
	private final Class313_Sub2 aClass313_Sub2_2;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "Lclient!nb;")
	private final Class67_Sub1 aClass67_Sub1_8;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
	public final int anInt5613;

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
	private final int anInt5606;

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "[B")
	public final byte[] aByteArray47;

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
	private final int anInt5616;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
	private final int anInt5619;

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
	private final int anInt5615;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!nb;Lclient!tla;)V")
	public Class196(@OriginalArg(0) Class67_Sub1 arg0, @OriginalArg(1) Class313_Sub2 arg1) {
		this.aClass313_Sub2_2 = arg1;
		this.aClass67_Sub1_8 = arg0;
		this.anInt5613 = (this.aClass313_Sub2_2.anInt10875 * this.aClass313_Sub2_2.anInt10871 >> this.aClass67_Sub1_8.anInt6658) + 2;
		this.anInt5606 = (this.aClass313_Sub2_2.anInt10872 * this.aClass313_Sub2_2.anInt10871 >> this.aClass67_Sub1_8.anInt6658) + 2;
		this.aByteArray47 = new byte[this.anInt5613 * this.anInt5606];
		this.anInt5616 = this.aClass67_Sub1_8.anInt6658 + 7 - this.aClass313_Sub2_2.anInt10873;
		this.anInt5619 = this.aClass313_Sub2_2.anInt10875 >> this.anInt5616;
		this.anInt5615 = this.aClass313_Sub2_2.anInt10872 >> this.anInt5616;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
	public void method4774() {
		this.aClass55ArrayArray1 = new Class55[this.anInt5619][this.anInt5615];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5615; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt5619; local26++) {
				this.aClass55ArrayArray1[local26][local22] = new Class55(this.aClass67_Sub1_8, this, this.aClass313_Sub2_2, local26, local22, this.anInt5616, local26 * 128 + 1, local22 * 128 - -1);
				if (this.aClass55ArrayArray1[local26][local22].anInt1475 == 0) {
					this.aClass55ArrayArray1[local26][local22] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!r;IBI)Z")
	public boolean method4776(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub13_Sub1 local6 = (Class3_Sub4_Sub13_Sub1) arg0;
		arg1 += local6.anInt7019 + 1;
		arg2 += local6.anInt7015 + 1;
		@Pc(27) int local27 = arg1 * this.anInt5613 + arg2;
		@Pc(30) int local30 = local6.anInt7020;
		@Pc(33) int local33 = local6.anInt7011;
		@Pc(47) int local47 = this.anInt5613 - local33;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local30 -= local54;
			arg1 = 1;
			local27 += this.anInt5613 * local54;
		}
		if (local30 + arg1 >= this.anInt5606) {
			local54 = arg1 + local30 + 1 - this.anInt5606;
			local30 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local47 += local54;
			local27 += local54;
			arg2 = 1;
			local33 -= local54;
		}
		if (local33 + arg2 >= this.anInt5613) {
			local54 = arg2 + local33 + 1 - this.anInt5613;
			local33 -= local54;
			local47 += local54;
		}
		if (local33 > 0 && local30 > 0) {
			local47 += this.anInt5613 * 7;
			return Static198.method2986(local27, local47, local33, local30, this.aByteArray47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([[ZZIZII)V")
	public void method4778(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass67_Sub1_8.method5592(false);
		this.aClass67_Sub1_8.method5652(false);
		this.aClass67_Sub1_8.method5617(1);
		this.aClass67_Sub1_8.method5655(1);
		this.aClass67_Sub1_8.method5575(false, false, -2);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass67_Sub1_8.anInt6650 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg1) {
			for (local45 = 0; local45 < this.anInt5615; local45++) {
				local52 = local45 << this.anInt5616;
				local59 = local45 + 1 << this.anInt5616;
				label87: for (local61 = 0; local61 < this.anInt5619; local61++) {
					if (this.aClass55ArrayArray1[local61][local45] != null) {
						@Pc(361) int local361 = local61 << this.anInt5616;
						@Pc(368) int local368 = local61 + 1 << this.anInt5616;
						for (@Pc(370) int local370 = local361; local370 < local368; local370++) {
							if (-arg3 <= local370 - arg2 && local370 - arg2 <= arg3) {
								for (@Pc(395) int local395 = local52; local395 < local59; local395++) {
									if (local395 - arg4 >= -arg3 && local395 - arg4 <= arg3 && arg0[local370 + arg3 - arg2][local395 + arg3 - arg4]) {
										@Pc(445) Class181_Sub1 local445 = this.aClass67_Sub1_8.method5601();
										local445.method4918(local41, 1.0F, local41);
										local445.method6354(-local61, -local45, 0);
										this.aClass67_Sub1_8.method5666(Static32.aClass96_1);
										this.aClass55ArrayArray1[local61][local45].method1194();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt5615; local45++) {
				local52 = local45 << this.anInt5616;
				local59 = local45 + 1 << this.anInt5616;
				for (local61 = 0; local61 < this.anInt5619; local61++) {
					@Pc(70) Class55 local70 = this.aClass55ArrayArray1[local61][local45];
					if (local70 != null) {
						@Pc(81) Interface5 local81 = this.aClass67_Sub1_8.method5571(local70.anInt1475 * 3);
						@Pc(86) Buffer local86 = local81.method9252();
						if (local86 != null) {
							@Pc(94) Stream local94 = this.aClass67_Sub1_8.method5616(local86);
							@Pc(96) int local96 = 0;
							@Pc(101) int local101 = local61 << this.anInt5616;
							@Pc(108) int local108 = local61 + 1 << this.anInt5616;
							for (@Pc(110) int local110 = local52; local110 < local59; local110++) {
								if (local110 - arg4 >= -arg3 && arg3 >= local110 - arg4) {
									@Pc(142) int local142 = this.aClass313_Sub2_2.anInt10875 * local110 + local101;
									for (@Pc(144) int local144 = local101; local144 < local108; local144++) {
										if (-arg3 <= local144 - arg2 && local144 - arg2 <= arg3 && arg0[local144 + arg3 - arg2][local110 + arg3 - arg4]) {
											@Pc(193) short[] local193 = this.aClass313_Sub2_2.aShortArrayArray5[local142];
											if (local193 != null) {
												@Pc(201) int local201;
												if (Stream.b()) {
													for (local201 = 0; local201 < local193.length; local201++) {
														local94.b(local193[local201] & 0xFFFF);
														local96++;
													}
												} else {
													for (local201 = 0; local201 < local193.length; local201++) {
														local96++;
														local94.d(local193[local201] & 0xFFFF);
													}
												}
											}
										}
										local142++;
									}
								}
							}
							local94.a();
							if (local81.method9250() && local96 > 0) {
								@Pc(282) Class181_Sub1 local282 = this.aClass67_Sub1_8.method5601();
								local282.method4918(local41, 1.0F, local41);
								local282.method6354(-local61, -local45, 0);
								this.aClass67_Sub1_8.method5666(Static32.aClass96_1);
								local70.method1196(local96 / 3, local81);
							}
						}
					}
				}
			}
		}
		this.aClass67_Sub1_8.method5614();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILclient!r;I)V")
	public void method4779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub13 arg2) {
		@Pc(6) Class3_Sub4_Sub13_Sub1 local6 = (Class3_Sub4_Sub13_Sub1) arg2;
		arg1 += local6.anInt7015 + 1;
		arg0 += local6.anInt7019 + 1;
		@Pc(27) int local27 = arg1 + this.anInt5613 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7020;
		@Pc(35) int local35 = local6.anInt7011;
		@Pc(40) int local40 = this.anInt5613 - local35;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local29 = local35 * local52;
			local32 -= local52;
			local27 += local52 * this.anInt5613;
			arg0 = 1;
		}
		if (arg0 + local32 >= this.anInt5606) {
			local52 = arg0 + local32 + 1 - this.anInt5606;
			local32 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local40 += local52;
			local42 = local52;
			local29 += local52;
			local35 -= local52;
			arg1 = 1;
			local27 += local52;
		}
		if (this.anInt5613 <= arg1 + local35) {
			local52 = local35 + arg1 + 1 - this.anInt5613;
			local42 += local52;
			local35 -= local52;
			local40 += local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static467.method6926(this.aByteArray47, local6.aByteArray55, local42, local40, local32, local29, local27, local35);
			this.method4784(local32, arg0, arg1, local35);
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(IILclient!r;I)V")
	public void method4783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub13 arg2) {
		@Pc(6) Class3_Sub4_Sub13_Sub1 local6 = (Class3_Sub4_Sub13_Sub1) arg2;
		arg1 += local6.anInt7019 + 1;
		arg0 += local6.anInt7015 + 1;
		@Pc(27) int local27 = this.anInt5613 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7020;
		@Pc(35) int local35 = local6.anInt7011;
		@Pc(41) int local41 = this.anInt5613 - local35;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local27 += this.anInt5613 * local53;
			arg1 = 1;
			local29 = local35 * local53;
			local32 -= local53;
		}
		if (this.anInt5606 <= arg1 + local32) {
			local53 = local32 + arg1 + 1 - this.anInt5606;
			local32 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local29 += local53;
			local35 -= local53;
			local43 = local53;
			local41 += local53;
			arg0 = 1;
			local27 += local53;
		}
		if (this.anInt5613 <= arg0 + local35) {
			local53 = local35 + arg0 + 1 - this.anInt5613;
			local35 -= local53;
			local41 += local53;
			local43 += local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static435.method6373(this.aByteArray47, local6.aByteArray55, local43, local35, local29, local27, local41, local32);
			this.method4784(local32, arg1, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIII)V")
	private void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass55ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(40) int local40 = arg1 - 1 >> 7;
		@Pc(50) int local50 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local16; local52 <= local26; local52++) {
			@Pc(59) Class55[] local59 = this.aClass55ArrayArray1[local52];
			for (@Pc(61) int local61 = local40; local61 <= local50; local61++) {
				if (local59[local61] != null) {
					local59[local61].aBoolean124 = true;
				}
			}
		}
	}
}
