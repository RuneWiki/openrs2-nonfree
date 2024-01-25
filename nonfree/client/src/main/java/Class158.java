import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class158 {

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "[[Lclient!pc;")
	private Class154[][] aClass154ArrayArray1;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_30;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "Lclient!pj;")
	private final Class105_Sub2 aClass105_Sub2_1;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public final int anInt5216;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	private final int anInt5218;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "[B")
	public final byte[] aByteArray75;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	private final int anInt5219;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	private final int anInt5217;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
	private final int anInt5215;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!cg;Lclient!pj;)V")
	public Class158(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Class105_Sub2 arg1) {
		this.aClass37_Sub1_30 = arg0;
		this.aClass105_Sub2_1 = arg1;
		this.anInt5216 = (this.aClass105_Sub2_1.anInt5260 * this.aClass105_Sub2_1.anInt5265 >> this.aClass37_Sub1_30.anInt639) + 2;
		this.anInt5218 = (this.aClass105_Sub2_1.anInt5261 * this.aClass105_Sub2_1.anInt5265 >> this.aClass37_Sub1_30.anInt639) + 2;
		this.aByteArray75 = new byte[this.anInt5216 * this.anInt5218];
		this.anInt5219 = this.aClass37_Sub1_30.anInt639 + 7 - this.aClass105_Sub2_1.anInt5267;
		this.anInt5217 = this.aClass105_Sub2_1.anInt5260 >> this.anInt5219;
		this.anInt5215 = this.aClass105_Sub2_1.anInt5261 >> this.anInt5219;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([[ZZIIBI)V")
	public void method4406(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_30.anOpengl1;
		this.aClass37_Sub1_30.method741();
		this.aClass37_Sub1_30.method793(false);
		this.aClass37_Sub1_30.method772(false);
		this.aClass37_Sub1_30.method781();
		this.aClass37_Sub1_30.method774(0);
		this.aClass37_Sub1_30.method731(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass37_Sub1_30.anInt632 * 128);
		@Pc(39) int local39;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		if (arg1) {
			for (local39 = 0; local39 < this.anInt5215; local39++) {
				local52 = local39 << this.anInt5219;
				local59 = local39 + 1 << this.anInt5219;
				label84: for (local61 = 0; local61 < this.anInt5217; local61++) {
					local67 = local61 << this.anInt5219;
					local72 = local61 + 1 << this.anInt5219;
					for (local79 = local67; local79 < local72; local79++) {
						if (-arg4 <= local79 - arg2 && arg4 >= local79 - arg2) {
							for (@Pc(320) int local320 = local52; local320 < local59; local320++) {
								if (-arg4 <= local320 - arg3 && local320 - arg3 <= arg4 && arg0[local79 + arg4 - arg2][arg4 + local320 - arg3]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass154ArrayArray1[local61][local39].method4390();
									continue label84;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt5215; local39++) {
				local52 = local39 << this.anInt5219;
				local59 = local39 + 1 << this.anInt5219;
				for (local61 = 0; local61 < this.anInt5217; local61++) {
					local67 = 0;
					local72 = local61 << this.anInt5219;
					local79 = local61 + 1 << this.anInt5219;
					@Pc(81) Class2_Sub12 local81 = Static252.aClass2_Sub12_6;
					local81.anInt3606 = 0;
					for (@Pc(86) int local86 = local52; local86 < local59; local86++) {
						if (local86 - arg3 >= -arg4 && local86 - arg3 <= arg4) {
							@Pc(122) int local122 = local72 + this.aClass105_Sub2_1.anInt5260 * local86;
							for (@Pc(124) int local124 = local72; local124 < local79; local124++) {
								if (-arg4 <= local124 - arg2 && local124 - arg2 <= arg4 && arg0[local124 + arg4 - arg2][arg4 + local86 - arg3]) {
									@Pc(161) short[] local161 = this.aClass105_Sub2_1.aShortArrayArray13[local122];
									if (local161 != null) {
										@Pc(169) int local169;
										if (this.aClass37_Sub1_30.aBoolean72) {
											for (local169 = 0; local169 < local161.length; local169++) {
												local81.method3158(local161[local169] & 0xFFFF);
												local67++;
											}
										} else {
											for (local169 = 0; local169 < local161.length; local169++) {
												local67++;
												local81.method3110(local161[local169] & 0xFFFF);
											}
										}
									}
								}
								local122++;
							}
						}
					}
					if (local67 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass154ArrayArray1[local61][local39].method4389(local67, local81.aByteArray30);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!qn;ZII)V")
	public void method4408(@OriginalArg(0) Class2_Sub9_Sub16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub9_Sub16_Sub1 local2 = (Class2_Sub9_Sub16_Sub1) arg0;
		arg2 += local2.anInt4698 + 1;
		arg1 += local2.anInt4699 + 1;
		@Pc(34) int local34 = arg2 + arg1 * this.anInt5216;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = local2.anInt4700;
		@Pc(42) int local42 = local2.anInt4701;
		@Pc(48) int local48 = this.anInt5216 - local42;
		@Pc(50) int local50 = 0;
		@Pc(61) int local61;
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			arg1 = 1;
			local39 -= local61;
			local34 += this.anInt5216 * local61;
			local36 = local61 * local42;
		}
		if (local39 + arg1 >= this.anInt5218) {
			local61 = arg1 + local39 + 1 - this.anInt5218;
			local39 -= local61;
		}
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local42 -= local61;
			local34 += local61;
			arg2 = 1;
			local36 += local61;
			local50 = local61;
			local48 += local61;
		}
		if (local42 + arg2 >= this.anInt5216) {
			local61 = local42 + arg2 + 1 - this.anInt5216;
			local50 += local61;
			local48 += local61;
			local42 -= local61;
		}
		if (local42 > 0 && local39 > 0) {
			Static374.method4411(local50, local34, local2.aByteArray59, local42, local39, this.aByteArray75, local48, local36);
			this.method4412(local39, arg2, arg1, local42);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILclient!qn;I)V")
	public void method4409(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub9_Sub16 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub9_Sub16_Sub1 local2 = (Class2_Sub9_Sub16_Sub1) arg1;
		arg0 += local2.anInt4699 + 1;
		arg2 += local2.anInt4698 + 1;
		@Pc(23) int local23 = arg0 * this.anInt5216 + arg2;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt4700;
		@Pc(31) int local31 = local2.anInt4701;
		@Pc(37) int local37 = this.anInt5216 - local31;
		@Pc(45) int local45;
		if (arg0 <= 0) {
			local45 = 1 - arg0;
			local25 = local31 * local45;
			local23 += local45 * this.anInt5216;
			local28 -= local45;
			arg0 = 1;
		}
		@Pc(66) int local66 = 0;
		if (arg0 + local28 >= this.anInt5218) {
			local45 = local28 + arg0 + 1 - this.anInt5218;
			local28 -= local45;
		}
		if (arg2 <= 0) {
			local45 = 1 - arg2;
			local25 += local45;
			local31 -= local45;
			local66 = local45;
			local23 += local45;
			arg2 = 1;
			local37 += local45;
		}
		if (this.anInt5216 <= local31 + arg2) {
			local45 = local31 + arg2 + 1 - this.anInt5216;
			local37 += local45;
			local31 -= local45;
			local66 += local45;
		}
		if (local31 > 0 && local28 > 0) {
			Static374.method4405(local31, local66, local37, local2.aByteArray59, local25, local28, local23, this.aByteArray75);
			this.method4412(local28, arg2, arg0, local31);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public void method4410() {
		this.aClass154ArrayArray1 = new Class154[this.anInt5217][this.anInt5215];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5215; local12++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt5217; local22++) {
				this.aClass154ArrayArray1[local22][local12] = new Class154(this.aClass37_Sub1_30, this, this.aClass105_Sub2_1, local22, local12, this.anInt5219, local22 * 128 + 1, local12 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
	private void method4412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass154ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg1 - 1 >> 7;
		@Pc(19) int local19 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(25) int local25 = arg2 - 1 >> 7;
		@Pc(35) int local35 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(37) int local37 = local9; local37 <= local19; local37++) {
			@Pc(59) Class154[] local59 = this.aClass154ArrayArray1[local37];
			for (@Pc(61) int local61 = local25; local61 <= local35; local61++) {
				local59[local61].aBoolean454 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!qn;III)Z")
	public boolean method4413(@OriginalArg(0) Class2_Sub9_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class2_Sub9_Sub16_Sub1 local2 = (Class2_Sub9_Sub16_Sub1) arg0;
		arg1 += local2.anInt4698 + 1;
		arg2 += local2.anInt4699 + 1;
		@Pc(23) int local23 = arg1 + this.anInt5216 * arg2;
		@Pc(31) int local31 = local2.anInt4700;
		@Pc(34) int local34 = local2.anInt4701;
		@Pc(45) int local45;
		if (arg2 <= 0) {
			local45 = 1 - arg2;
			local31 -= local45;
			local23 += local45 * this.anInt5216;
			arg2 = 1;
		}
		@Pc(64) int local64 = this.anInt5216 - local34;
		if (local31 + arg2 >= this.anInt5218) {
			local45 = local31 + arg2 + 1 - this.anInt5218;
			local31 -= local45;
		}
		if (arg1 <= 0) {
			local45 = 1 - arg1;
			arg1 = 1;
			local34 -= local45;
			local64 += local45;
			local23 += local45;
		}
		if (arg1 + local34 >= this.anInt5216) {
			local45 = local34 + arg1 + 1 - this.anInt5216;
			local34 -= local45;
			local64 += local45;
		}
		if (local34 > 0 && local31 > 0) {
			local64 += this.anInt5216 * 7;
			return Static374.method4407(local34, local23, this.aByteArray75, local31, local64);
		} else {
			return false;
		}
	}
}
