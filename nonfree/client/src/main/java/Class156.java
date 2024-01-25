import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class156 {

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "[[Lclient!lca;")
	private Class201[][] aClass201ArrayArray1;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "Lclient!ov;")
	private final Class112_Sub2 aClass112_Sub2_3;

	@OriginalMember(owner = "client!ica", name = "o", descriptor = "Lclient!gt;")
	private final Class87_Sub1 aClass87_Sub1_11;

	@OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
	public final int anInt4664;

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
	private final int anInt4659;

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
	private final int anInt4663;

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "[B")
	public final byte[] aByteArray45;

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
	private final int anInt4665;

	@OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
	private final int anInt4668;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!gt;Lclient!ov;)V")
	public Class156(@OriginalArg(0) Class87_Sub1 arg0, @OriginalArg(1) Class112_Sub2 arg1) {
		this.aClass112_Sub2_3 = arg1;
		this.aClass87_Sub1_11 = arg0;
		this.anInt4664 = (this.aClass112_Sub2_3.anInt9344 * this.aClass112_Sub2_3.anInt9348 >> this.aClass87_Sub1_11.anInt6129) + 2;
		this.anInt4659 = (this.aClass112_Sub2_3.anInt9344 * this.aClass112_Sub2_3.anInt9340 >> this.aClass87_Sub1_11.anInt6129) + 2;
		this.anInt4663 = this.aClass87_Sub1_11.anInt6129 + 7 - this.aClass112_Sub2_3.anInt9341;
		this.aByteArray45 = new byte[this.anInt4659 * this.anInt4664];
		this.anInt4665 = this.aClass112_Sub2_3.anInt9348 >> this.anInt4663;
		this.anInt4668 = this.aClass112_Sub2_3.anInt9340 >> this.anInt4663;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZILclient!r;I)Z")
	public boolean method3864(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub5_Sub12 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub5_Sub12_Sub1 local6 = (Class2_Sub5_Sub12_Sub1) arg1;
		arg2 += local6.anInt5313 + 1;
		arg0 += local6.anInt5312 + 1;
		@Pc(32) int local32 = arg0 * this.anInt4664 + arg2;
		@Pc(35) int local35 = local6.anInt5307;
		@Pc(38) int local38 = local6.anInt5308;
		@Pc(44) int local44 = this.anInt4664 - local38;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local32 += local51 * this.anInt4664;
			local35 -= local51;
			arg0 = 1;
		}
		if (this.anInt4659 <= arg0 + local35) {
			local51 = arg0 + local35 + 1 - this.anInt4659;
			local35 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local38 -= local51;
			arg2 = 1;
			local32 += local51;
			local44 += local51;
		}
		if (local38 + arg2 >= this.anInt4664) {
			local51 = arg2 + local38 + 1 - this.anInt4664;
			local38 -= local51;
			local44 += local51;
		}
		if (local38 > 0 && local35 > 0) {
			local44 += this.anInt4664 * 7;
			return Static490.method7020(local32, local38, local44, this.aByteArray45, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIB[[ZZI)V")
	public void method3865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass87_Sub1_11.method5108(false);
		this.aClass87_Sub1_11.method5053(false);
		this.aClass87_Sub1_11.method5093(1);
		this.aClass87_Sub1_11.method5062(1);
		this.aClass87_Sub1_11.method5071(false, false, -2);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass87_Sub1_11.anInt6131 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg3) {
			for (local45 = 0; local45 < this.anInt4668; local45++) {
				local52 = local45 << this.anInt4663;
				local59 = local45 + 1 << this.anInt4663;
				label87: for (local61 = 0; local61 < this.anInt4665; local61++) {
					if (this.aClass201ArrayArray1[local61][local45] != null) {
						@Pc(325) int local325 = local61 << this.anInt4663;
						@Pc(332) int local332 = local61 + 1 << this.anInt4663;
						for (@Pc(334) int local334 = local325; local334 < local332; local334++) {
							if (local334 - arg4 >= -arg1 && arg1 >= local334 - arg4) {
								for (@Pc(355) int local355 = local52; local355 < local59; local355++) {
									if (-arg1 <= local355 - arg0 && local355 - arg0 <= arg1 && arg2[arg1 + local334 - arg4][arg1 + local355 - arg0]) {
										@Pc(397) Class6_Sub2 local397 = this.aClass87_Sub1_11.method5141();
										local397.method2717(1.0F, local41, local41);
										local397.method6694(-local61, -local45, 0);
										this.aClass87_Sub1_11.method5023(Static542.aClass108_23);
										this.aClass201ArrayArray1[local61][local45].method4759();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt4668; local45++) {
				local52 = local45 << this.anInt4663;
				local59 = local45 + 1 << this.anInt4663;
				for (local61 = 0; local61 < this.anInt4665; local61++) {
					@Pc(70) Class201 local70 = this.aClass201ArrayArray1[local61][local45];
					if (local70 != null) {
						@Pc(81) Interface10 local81 = this.aClass87_Sub1_11.method5051(local70.anInt5699 * 3);
						@Pc(86) Buffer local86 = local81.method7682();
						if (local86 != null) {
							@Pc(94) Stream local94 = this.aClass87_Sub1_11.method5128(local86);
							@Pc(96) int local96 = 0;
							@Pc(101) int local101 = local61 << this.anInt4663;
							@Pc(108) int local108 = local61 + 1 << this.anInt4663;
							for (@Pc(110) int local110 = local52; local110 < local59; local110++) {
								if (local110 - arg0 >= -arg1 && arg1 >= local110 - arg0) {
									@Pc(137) int local137 = this.aClass112_Sub2_3.anInt9348 * local110 + local101;
									for (@Pc(139) int local139 = local101; local139 < local108; local139++) {
										if (local139 - arg4 >= -arg1 && arg1 >= local139 - arg4 && arg2[arg1 + local139 - arg4][arg1 + local110 - arg0]) {
											@Pc(183) short[] local183 = this.aClass112_Sub2_3.aShortArrayArray19[local137];
											if (local183 != null) {
												@Pc(189) int local189;
												if (Stream.b()) {
													for (local189 = 0; local189 < local183.length; local189++) {
														local94.c(local183[local189] & 0xFFFF);
														local96++;
													}
												} else {
													for (local189 = 0; local189 < local183.length; local189++) {
														local96++;
														local94.d(local183[local189] & 0xFFFF);
													}
												}
											}
										}
										local137++;
									}
								}
							}
							local94.a();
							if (local81.method7683() && local96 > 0) {
								@Pc(256) Class6_Sub2 local256 = this.aClass87_Sub1_11.method5141();
								local256.method2717(1.0F, local41, local41);
								local256.method6694(-local61, -local45, 0);
								this.aClass87_Sub1_11.method5023(Static542.aClass108_23);
								local70.method4760(local96 / 3, local81);
							}
						}
					}
				}
			}
		}
		this.aClass87_Sub1_11.method5127();
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
	public void method3867() {
		this.aClass201ArrayArray1 = new Class201[this.anInt4665][this.anInt4668];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4668; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt4665; local18++) {
				this.aClass201ArrayArray1[local18][local14] = new Class201(this.aClass87_Sub1_11, this, this.aClass112_Sub2_3, local18, local14, this.anInt4663, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass201ArrayArray1[local18][local14].anInt5699 == 0) {
					this.aClass201ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!r;BII)V")
	public void method3868(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub5_Sub12_Sub1 local6 = (Class2_Sub5_Sub12_Sub1) arg0;
		arg2 += local6.anInt5313 + 1;
		arg1 += local6.anInt5312 + 1;
		@Pc(27) int local27 = this.anInt4664 * arg1 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5307;
		@Pc(35) int local35 = local6.anInt5308;
		@Pc(50) int local50 = this.anInt4664 - local35;
		@Pc(52) int local52 = 0;
		@Pc(59) int local59;
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			arg1 = 1;
			local27 += local59 * this.anInt4664;
			local29 = local35 * local59;
			local32 -= local59;
		}
		if (arg1 + local32 >= this.anInt4659) {
			local59 = arg1 + local32 + 1 - this.anInt4659;
			local32 -= local59;
		}
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			arg2 = 1;
			local35 -= local59;
			local27 += local59;
			local52 = local59;
			local29 += local59;
			local50 += local59;
		}
		if (this.anInt4664 <= arg2 + local35) {
			local59 = local35 + arg2 + 1 - this.anInt4664;
			local35 -= local59;
			local50 += local59;
			local52 += local59;
		}
		if (local35 > 0 && local32 > 0) {
			Static438.method6521(local27, local52, local50, local35, this.aByteArray45, local29, local32, local6.aByteArray49);
			this.method3869(arg1, local35, local32, arg2);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIII)V")
	private void method3869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass201ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class201[] local50 = this.aClass201ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				if (local50[local52] != null) {
					local50[local52].aBoolean432 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIILclient!r;)V")
	public void method3870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub5_Sub12 arg2) {
		@Pc(6) Class2_Sub5_Sub12_Sub1 local6 = (Class2_Sub5_Sub12_Sub1) arg2;
		arg1 += local6.anInt5312 + 1;
		arg0 += local6.anInt5313 + 1;
		@Pc(28) int local28 = arg0 + this.anInt4664 * arg1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt5307;
		@Pc(36) int local36 = local6.anInt5308;
		@Pc(42) int local42 = this.anInt4664 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local30 = local36 * local54;
			arg1 = 1;
			local28 += this.anInt4664 * local54;
			local33 -= local54;
		}
		if (this.anInt4659 <= local33 + arg1) {
			local54 = arg1 + local33 + 1 - this.anInt4659;
			local33 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local44 = local54;
			local28 += local54;
			arg0 = 1;
			local36 -= local54;
			local42 += local54;
			local30 += local54;
		}
		if (local36 + arg0 >= this.anInt4664) {
			local54 = local36 + arg0 + 1 - this.anInt4664;
			local36 -= local54;
			local42 += local54;
			local44 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static197.method3494(local28, local42, local44, local30, this.aByteArray45, local36, local33, local6.aByteArray49);
			this.method3869(arg1, local36, local33, arg0);
		}
	}
}
