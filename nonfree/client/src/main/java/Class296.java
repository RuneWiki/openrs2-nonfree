import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class296 {

	@OriginalMember(owner = "client!qw", name = "o", descriptor = "[[Lclient!kj;")
	private Class191[][] aClass191ArrayArray1;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_18;

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "Lclient!via;")
	private final Class40_Sub3 aClass40_Sub3_3;

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
	public final int anInt8008;

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
	private final int anInt8006;

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "[B")
	public final byte[] aByteArray73;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
	private final int anInt8014;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
	private final int anInt8007;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
	private final int anInt8015;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lclient!rv;Lclient!via;)V")
	public Class296(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) Class40_Sub3 arg1) {
		this.aClass126_Sub2_18 = arg0;
		this.aClass40_Sub3_3 = arg1;
		this.anInt8008 = (this.aClass40_Sub3_3.anInt9920 * this.aClass40_Sub3_3.anInt9918 >> this.aClass126_Sub2_18.anInt6254) + 2;
		this.anInt8006 = (this.aClass40_Sub3_3.anInt9918 * this.aClass40_Sub3_3.anInt9923 >> this.aClass126_Sub2_18.anInt6254) + 2;
		this.aByteArray73 = new byte[this.anInt8008 * this.anInt8006];
		this.anInt8014 = this.aClass126_Sub2_18.anInt6254 + 7 - this.aClass40_Sub3_3.anInt9919;
		this.anInt8007 = this.aClass40_Sub3_3.anInt9920 >> this.anInt8014;
		this.anInt8015 = this.aClass40_Sub3_3.anInt9923 >> this.anInt8014;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BILclient!r;I)Z")
	public boolean method6944(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub4_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub4_Sub10_Sub2 local6 = (Class5_Sub4_Sub10_Sub2) arg1;
		arg0 += local6.anInt3819 + 1;
		arg2 += local6.anInt3820 + 1;
		@Pc(33) int local33 = arg0 * this.anInt8008 + arg2;
		@Pc(36) int local36 = local6.anInt3809;
		@Pc(39) int local39 = local6.anInt3813;
		@Pc(45) int local45 = this.anInt8008 - local39;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			arg0 = 1;
			local36 -= local55;
			local33 += local55 * this.anInt8008;
		}
		if (this.anInt8006 <= local36 + arg0) {
			local55 = arg0 + local36 + 1 - this.anInt8006;
			local36 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local45 += local55;
			local39 -= local55;
			local33 += local55;
			arg2 = 1;
		}
		if (local39 + arg2 >= this.anInt8008) {
			local55 = local39 + arg2 + 1 - this.anInt8008;
			local39 -= local55;
			local45 += local55;
		}
		if (local39 > 0 && local36 > 0) {
			local45 += this.anInt8008 * 7;
			return Static208.method3205(this.aByteArray73, local33, local39, local45, local36);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([[ZIIIZI)V")
	public void method6945(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass126_Sub2_18.method5443(false);
		this.aClass126_Sub2_18.method5470(false);
		this.aClass126_Sub2_18.method5462(1);
		this.aClass126_Sub2_18.method5513(1);
		this.aClass126_Sub2_18.method5482(-2, false, false);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass126_Sub2_18.anInt6267 * 128);
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(74) int local74;
		@Pc(76) int local76;
		if (arg3) {
			for (local60 = 0; local60 < this.anInt8015; local60++) {
				local67 = local60 << this.anInt8014;
				local74 = local60 + 1 << this.anInt8014;
				label87: for (local76 = 0; local76 < this.anInt8007; local76++) {
					if (this.aClass191ArrayArray1[local76][local60] != null) {
						@Pc(350) int local350 = local76 << this.anInt8014;
						@Pc(357) int local357 = local76 + 1 << this.anInt8014;
						for (@Pc(359) int local359 = local350; local359 < local357; local359++) {
							if (-arg1 <= local359 - arg2 && local359 - arg2 <= arg1) {
								for (@Pc(380) int local380 = local67; local380 < local74; local380++) {
									if (local380 - arg4 >= -arg1 && local380 - arg4 <= arg1 && arg0[local359 + arg1 - arg2][arg1 + local380 - arg4]) {
										@Pc(425) Class117_Sub2 local425 = this.aClass126_Sub2_18.method5542();
										local425.method3878(local45, local45, 1.0F);
										local425.method7247(-local76, -local60, 0);
										this.aClass126_Sub2_18.method5504(Static242.aClass52_2);
										this.aClass191ArrayArray1[local76][local60].method4321();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local60 = 0; local60 < this.anInt8015; local60++) {
				local67 = local60 << this.anInt8014;
				local74 = local60 + 1 << this.anInt8014;
				for (local76 = 0; local76 < this.anInt8007; local76++) {
					@Pc(85) Class191 local85 = this.aClass191ArrayArray1[local76][local60];
					if (local85 != null) {
						@Pc(96) Interface21 local96 = this.aClass126_Sub2_18.method5481(local85.anInt4742 * 3);
						@Pc(103) Buffer local103 = local96.method5730();
						if (local103 != null) {
							@Pc(111) Stream local111 = this.aClass126_Sub2_18.method5446(local103);
							@Pc(113) int local113 = 0;
							@Pc(118) int local118 = local76 << this.anInt8014;
							@Pc(125) int local125 = local76 + 1 << this.anInt8014;
							for (@Pc(127) int local127 = local67; local127 < local74; local127++) {
								if (-arg1 <= local127 - arg4 && local127 - arg4 <= arg1) {
									@Pc(153) int local153 = this.aClass40_Sub3_3.anInt9920 * local127 + local118;
									for (@Pc(155) int local155 = local118; local155 < local125; local155++) {
										if (local155 - arg2 >= -arg1 && local155 - arg2 <= arg1 && arg0[arg1 + local155 - arg2][local127 + arg1 - arg4]) {
											@Pc(201) short[] local201 = this.aClass40_Sub3_3.aShortArrayArray21[local153];
											if (local201 != null) {
												@Pc(207) int local207;
												if (Stream.b()) {
													for (local207 = 0; local207 < local201.length; local207++) {
														local111.b(local201[local207] & 0xFFFF);
														local113++;
													}
												} else {
													for (local207 = 0; local207 < local201.length; local207++) {
														local113++;
														local111.d(local201[local207] & 0xFFFF);
													}
												}
											}
										}
										local153++;
									}
								}
							}
							local111.a();
							if (local96.method5734() && local113 > 0) {
								@Pc(271) Class117_Sub2 local271 = this.aClass126_Sub2_18.method5542();
								local271.method3878(local45, local45, 1.0F);
								local271.method7247(-local76, -local60, 0);
								this.aClass126_Sub2_18.method5504(Static242.aClass52_2);
								local85.method4320(local96, local113 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass126_Sub2_18.method5445();
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!r;II)V")
	public void method6946(@OriginalArg(1) Class5_Sub4_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub4_Sub10_Sub2 local6 = (Class5_Sub4_Sub10_Sub2) arg0;
		arg2 += local6.anInt3819 + 1;
		arg1 += local6.anInt3820 + 1;
		@Pc(28) int local28 = arg1 + this.anInt8008 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt3809;
		@Pc(36) int local36 = local6.anInt3813;
		@Pc(42) int local42 = this.anInt8008 - local36;
		@Pc(44) int local44 = 0;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local30 = local36 * local50;
			arg2 = 1;
			local28 += this.anInt8008 * local50;
			local33 -= local50;
		}
		if (this.anInt8006 <= local33 + arg2) {
			local50 = arg2 + local33 + 1 - this.anInt8006;
			local33 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local42 += local50;
			arg1 = 1;
			local28 += local50;
			local44 = local50;
			local36 -= local50;
			local30 += local50;
		}
		if (this.anInt8008 <= local36 + arg1) {
			local50 = arg1 + local36 + 1 - this.anInt8008;
			local36 -= local50;
			local44 += local50;
			local42 += local50;
		}
		if (local36 > 0 && local33 > 0) {
			Static12.method231(local33, local42, local30, local6.aByteArray33, local36, this.aByteArray73, local28, local44);
			this.method6951(local36, arg2, arg1, local33);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIILclient!r;)V")
	public void method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub4_Sub10 arg2) {
		@Pc(6) Class5_Sub4_Sub10_Sub2 local6 = (Class5_Sub4_Sub10_Sub2) arg2;
		arg0 += local6.anInt3819 + 1;
		arg1 += local6.anInt3820 + 1;
		@Pc(28) int local28 = arg1 + arg0 * this.anInt8008;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt3809;
		@Pc(36) int local36 = local6.anInt3813;
		@Pc(42) int local42 = this.anInt8008 - local36;
		@Pc(44) int local44 = 0;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			arg0 = 1;
			local30 = local50 * local36;
			local33 -= local50;
			local28 += this.anInt8008 * local50;
		}
		if (arg0 + local33 >= this.anInt8006) {
			local50 = local33 + arg0 + 1 - this.anInt8006;
			local33 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local36 -= local50;
			local28 += local50;
			arg1 = 1;
			local44 = local50;
			local42 += local50;
			local30 += local50;
		}
		if (this.anInt8008 <= arg1 + local36) {
			local50 = local36 + arg1 + 1 - this.anInt8008;
			local44 += local50;
			local36 -= local50;
			local42 += local50;
		}
		if (local36 > 0 && local33 > 0) {
			Static94.method8743(local44, local28, local36, local33, local6.aByteArray33, this.aByteArray73, local30, local42);
			this.method6951(local36, arg0, arg1, local33);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
	private void method6951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass191ArrayArray1 == null) {
			return;
		}
		@Pc(19) int local19 = arg2 - 1 >> 7;
		@Pc(29) int local29 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 >> 7;
		@Pc(45) int local45 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local19; local47 <= local29; local47++) {
			@Pc(54) Class191[] local54 = this.aClass191ArrayArray1[local47];
			for (@Pc(56) int local56 = local35; local56 <= local45; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean387 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(B)V")
	public void method6953() {
		this.aClass191ArrayArray1 = new Class191[this.anInt8007][this.anInt8015];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8015; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt8007; local18++) {
				this.aClass191ArrayArray1[local18][local14] = new Class191(this.aClass126_Sub2_18, this, this.aClass40_Sub3_3, local18, local14, this.anInt8014, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass191ArrayArray1[local18][local14].anInt4742 == 0) {
					this.aClass191ArrayArray1[local18][local14] = null;
				}
			}
		}
	}
}
