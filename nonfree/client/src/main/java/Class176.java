import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class176 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "[[Lclient!fa;")
	private Class89[][] aClass89ArrayArray1;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_9;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "Lclient!uo;")
	private final Class205_Sub3 aClass205_Sub3_1;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "I")
	public final int anInt5088;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	private final int anInt5087;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	private final int anInt5078;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[B")
	public final byte[] aByteArray77;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "I")
	private final int anInt5082;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	private final int anInt5081;

	static {
		new Class306(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!re;Lclient!uo;)V")
	public Class176(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class205_Sub3 arg1) {
		this.aClass122_Sub2_9 = arg0;
		this.aClass205_Sub3_1 = arg1;
		this.anInt5088 = (this.aClass205_Sub3_1.anInt8175 * this.aClass205_Sub3_1.anInt8174 >> this.aClass122_Sub2_9.anInt6714) + 2;
		this.anInt5087 = (this.aClass205_Sub3_1.anInt8175 * this.aClass205_Sub3_1.anInt8177 >> this.aClass122_Sub2_9.anInt6714) + 2;
		this.anInt5078 = this.aClass122_Sub2_9.anInt6714 + 7 - this.aClass205_Sub3_1.anInt8176;
		this.aByteArray77 = new byte[this.anInt5088 * this.anInt5087];
		this.anInt5082 = this.aClass205_Sub3_1.anInt8174 >> this.anInt5078;
		this.anInt5081 = this.aClass205_Sub3_1.anInt8177 >> this.anInt5078;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[[ZIIZ)V")
	public void method4397(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass122_Sub2_9.method5633(false);
		this.aClass122_Sub2_9.method5551(false);
		this.aClass122_Sub2_9.method5650(1);
		this.aClass122_Sub2_9.method5561(1);
		this.aClass122_Sub2_9.method5622(false, false, -2);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass122_Sub2_9.anInt6700 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		if (arg4) {
			for (local51 = 0; local51 < this.anInt5081; local51++) {
				local58 = local51 << this.anInt5078;
				local65 = local51 + 1 << this.anInt5078;
				label87: for (local67 = 0; local67 < this.anInt5082; local67++) {
					if (this.aClass89ArrayArray1[local67][local51] != null) {
						@Pc(336) int local336 = local67 << this.anInt5078;
						@Pc(343) int local343 = local67 + 1 << this.anInt5078;
						for (@Pc(345) int local345 = local336; local345 < local343; local345++) {
							if (-arg2 <= local345 - arg0 && arg2 >= local345 - arg0) {
								for (@Pc(369) int local369 = local58; local369 < local65; local369++) {
									if (-arg2 <= local369 - arg3 && arg2 >= local369 - arg3 && arg1[local345 + arg2 - arg0][local369 + arg2 - arg3]) {
										@Pc(408) Class118_Sub3 local408 = this.aClass122_Sub2_9.method5574();
										local408.method6977(local47, local47, 1.0F);
										local408.TA(-local67, -local51, 0);
										this.aClass122_Sub2_9.method5612(Static272.aClass110_4);
										this.aClass89ArrayArray1[local67][local51].method2113();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt5081; local51++) {
				local58 = local51 << this.anInt5078;
				local65 = local51 + 1 << this.anInt5078;
				for (local67 = 0; local67 < this.anInt5082; local67++) {
					@Pc(76) Class89 local76 = this.aClass89ArrayArray1[local67][local51];
					if (local76 != null) {
						@Pc(87) Interface1 local87 = this.aClass122_Sub2_9.method5576(local76.anInt2510 * 3);
						@Pc(92) Buffer local92 = local87.method5729();
						if (local92 != null) {
							@Pc(100) Stream local100 = this.aClass122_Sub2_9.method5555(local92);
							@Pc(102) int local102 = 0;
							@Pc(107) int local107 = local67 << this.anInt5078;
							@Pc(114) int local114 = local67 + 1 << this.anInt5078;
							for (@Pc(116) int local116 = local58; local116 < local65; local116++) {
								if (-arg2 <= local116 - arg3 && local116 - arg3 <= arg2) {
									@Pc(143) int local143 = local107 + local116 * this.aClass205_Sub3_1.anInt8174;
									for (@Pc(145) int local145 = local107; local145 < local114; local145++) {
										if (local145 - arg0 >= -arg2 && arg2 >= local145 - arg0 && arg1[arg2 + local145 - arg0][arg2 + local116 - arg3]) {
											@Pc(188) short[] local188 = this.aClass205_Sub3_1.aShortArrayArray9[local143];
											if (local188 != null) {
												@Pc(194) int local194;
												if (Stream.c()) {
													for (local194 = 0; local194 < local188.length; local194++) {
														local100.a(local188[local194] & 0xFFFF);
														local102++;
													}
												} else {
													for (local194 = 0; local194 < local188.length; local194++) {
														local100.d(local188[local194] & 0xFFFF);
														local102++;
													}
												}
											}
										}
										local143++;
									}
								}
							}
							local100.b();
							if (local87.method5730() && local102 > 0) {
								@Pc(263) Class118_Sub3 local263 = this.aClass122_Sub2_9.method5574();
								local263.method6977(local47, local47, 1.0F);
								local263.TA(-local67, -local51, 0);
								this.aClass122_Sub2_9.method5612(Static272.aClass110_4);
								local76.method2112(local87, local102 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass122_Sub2_9.method5614();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!k;IB)V")
	public void method4398(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub9 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub1_Sub9_Sub2 local6 = (Class1_Sub1_Sub9_Sub2) arg1;
		arg0 += local6.anInt6058 + 1;
		arg2 += local6.anInt6060 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt5088;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt6061;
		@Pc(44) int local44 = local6.anInt6062;
		@Pc(50) int local50 = this.anInt5088 - local44;
		@Pc(52) int local52 = 0;
		@Pc(61) int local61;
		if (arg0 <= 0) {
			local61 = 1 - arg0;
			local28 += this.anInt5088 * local61;
			local30 = local61 * local44;
			local33 -= local61;
			arg0 = 1;
		}
		if (this.anInt5087 <= local33 + arg0) {
			local61 = local33 + arg0 + 1 - this.anInt5087;
			local33 -= local61;
		}
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			arg2 = 1;
			local44 -= local61;
			local52 = local61;
			local28 += local61;
			local30 += local61;
			local50 += local61;
		}
		if (arg2 + local44 >= this.anInt5088) {
			local61 = local44 + arg2 + 1 - this.anInt5088;
			local50 += local61;
			local44 -= local61;
			local52 += local61;
		}
		if (local44 > 0 && local33 > 0) {
			Static454.method6444(local52, local6.aByteArray96, local30, local44, local33, local28, local50, this.aByteArray77);
			this.method4404(local33, arg2, local44, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public void method4399() {
		this.aClass89ArrayArray1 = new Class89[this.anInt5082][this.anInt5081];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5081; local14++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt5082; local24++) {
				this.aClass89ArrayArray1[local24][local14] = new Class89(this.aClass122_Sub2_9, this, this.aClass205_Sub3_1, local24, local14, this.anInt5078, local24 * 128 + 1, local14 * 128 - -1);
				if (this.aClass89ArrayArray1[local24][local14].anInt2510 == 0) {
					this.aClass89ArrayArray1[local24][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!k;II)V")
	public void method4400(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub1_Sub9_Sub2 local6 = (Class1_Sub1_Sub9_Sub2) arg1;
		arg2 += local6.anInt6060 + 1;
		arg0 += local6.anInt6058 + 1;
		@Pc(27) int local27 = this.anInt5088 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6061;
		@Pc(35) int local35 = local6.anInt6062;
		@Pc(41) int local41 = this.anInt5088 - local35;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			arg0 = 1;
			local29 = local48 * local35;
			local32 -= local48;
			local27 += this.anInt5088 * local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt5087 <= arg0 + local32) {
			local48 = arg0 + local32 + 1 - this.anInt5087;
			local32 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local27 += local48;
			local41 += local48;
			local29 += local48;
			local35 -= local48;
			arg2 = 1;
			local69 = local48;
		}
		if (this.anInt5088 <= arg2 + local35) {
			local48 = arg2 + local35 + 1 - this.anInt5088;
			local69 += local48;
			local35 -= local48;
			local41 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static462.method6520(local32, local69, local29, local41, local6.aByteArray96, local27, this.aByteArray77, local35);
			this.method4404(local32, arg2, local35, arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!k;I)Z")
	public boolean method4402(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub1_Sub9_Sub2 local6 = (Class1_Sub1_Sub9_Sub2) arg1;
		arg2 += local6.anInt6058 + 1;
		arg0 += local6.anInt6060 + 1;
		@Pc(27) int local27 = this.anInt5088 * arg2 + arg0;
		@Pc(30) int local30 = local6.anInt6061;
		@Pc(33) int local33 = local6.anInt6062;
		@Pc(43) int local43;
		if (arg2 <= 0) {
			local43 = 1 - arg2;
			local30 -= local43;
			local27 += local43 * this.anInt5088;
			arg2 = 1;
		}
		@Pc(62) int local62 = this.anInt5088 - local33;
		if (local30 + arg2 >= this.anInt5087) {
			local43 = arg2 + local30 + 1 - this.anInt5087;
			local30 -= local43;
		}
		if (arg0 <= 0) {
			local43 = 1 - arg0;
			local33 -= local43;
			arg0 = 1;
			local27 += local43;
			local62 += local43;
		}
		if (this.anInt5088 <= arg0 + local33) {
			local43 = local33 + arg0 + 1 - this.anInt5088;
			local62 += local43;
			local33 -= local43;
		}
		if (local33 > 0 && local30 > 0) {
			local62 += this.anInt5088 * 7;
			return Static223.method3882(this.aByteArray77, local62, local33, local30, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIII)V")
	private void method4404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass89ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg3 - 1 >> 7;
		@Pc(42) int local42 = arg3 + arg0 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local25; local44++) {
			@Pc(51) Class89[] local51 = this.aClass89ArrayArray1[local44];
			for (@Pc(53) int local53 = local31; local53 <= local42; local53++) {
				if (local51[local53] != null) {
					local51[local53].aBoolean159 = true;
				}
			}
		}
	}
}
