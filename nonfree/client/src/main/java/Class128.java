import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class128 {

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "[[Lclient!ej;")
	private Class57[][] aClass57ArrayArray1;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Lclient!ef;")
	private final Class53_Sub1 aClass53_Sub1_2;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_27;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	public final int anInt3840;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
	private final int anInt3837;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "[B")
	public final byte[] aByteArray61;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
	private final int anInt3841;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	private final int anInt3838;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	private final int anInt3839;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!h;Lclient!ef;)V")
	public Class128(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Class53_Sub1 arg1) {
		this.aClass53_Sub1_2 = arg1;
		this.aClass32_Sub2_27 = arg0;
		this.anInt3840 = (this.aClass53_Sub1_2.anInt3017 * this.aClass53_Sub1_2.anInt1814 >> this.aClass32_Sub2_27.anInt2483) + 2;
		this.anInt3837 = (this.aClass53_Sub1_2.anInt1814 * this.aClass53_Sub1_2.anInt3016 >> this.aClass32_Sub2_27.anInt2483) + 2;
		this.aByteArray61 = new byte[this.anInt3840 * this.anInt3837];
		this.anInt3841 = this.aClass32_Sub2_27.anInt2483 + 7 - this.aClass53_Sub1_2.anInt1811;
		this.anInt3838 = this.aClass53_Sub1_2.anInt3017 >> this.anInt3841;
		this.anInt3839 = this.aClass53_Sub1_2.anInt3016 >> this.anInt3841;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZLclient!gi;I)V")
	public void method3499(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub4_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class1_Sub4_Sub10_Sub1 local2 = (Class1_Sub4_Sub10_Sub1) arg1;
		arg2 += local2.anInt6254 + 1;
		arg0 += local2.anInt6252 + 1;
		@Pc(23) int local23 = arg0 * this.anInt3840 + arg2;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt6255;
		@Pc(31) int local31 = local2.anInt6253;
		@Pc(37) int local37 = this.anInt3840 - local31;
		@Pc(39) int local39 = 0;
		@Pc(46) int local46;
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			arg0 = 1;
			local28 -= local46;
			local25 = local31 * local46;
			local23 += this.anInt3840 * local46;
		}
		if (arg0 + local28 >= this.anInt3837) {
			local46 = arg0 + local28 + 1 - this.anInt3837;
			local28 -= local46;
		}
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local25 += local46;
			arg2 = 1;
			local23 += local46;
			local37 += local46;
			local39 = local46;
			local31 -= local46;
		}
		if (arg2 + local31 >= this.anInt3840) {
			local46 = local31 + arg2 + 1 - this.anInt3840;
			local37 += local46;
			local39 += local46;
			local31 -= local46;
		}
		if (local31 > 0 && local28 > 0) {
			Static369.method3502(local23, local31, this.aByteArray61, local25, local39, local2.aByteArray91, local28, local37);
			this.method3504(local31, arg2, local28, arg0);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BIII[[ZZ)V")
	public void method3500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass32_Sub2_27.anOpengl2;
		this.aClass32_Sub2_27.method2295();
		this.aClass32_Sub2_27.method2250(false);
		this.aClass32_Sub2_27.method2281(false);
		this.aClass32_Sub2_27.method2258();
		this.aClass32_Sub2_27.method2282(0);
		this.aClass32_Sub2_27.method2291(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass32_Sub2_27.anInt2484 * 128);
		@Pc(39) int local39;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg4) {
			for (local39 = 0; local39 < this.anInt3839; local39++) {
				local52 = local39 << this.anInt3841;
				local59 = local39 + 1 << this.anInt3841;
				label84: for (local61 = 0; local61 < this.anInt3838; local61++) {
					local71 = local61 << this.anInt3841;
					local76 = local61 + 1 << this.anInt3841;
					for (local83 = local71; local83 < local76; local83++) {
						if (local83 - arg2 >= -arg1 && arg1 >= local83 - arg2) {
							for (@Pc(340) int local340 = local52; local340 < local59; local340++) {
								if (local340 - arg0 >= -arg1 && local340 - arg0 <= arg1 && arg3[local83 + arg1 - arg2][arg1 + local340 - arg0]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass57ArrayArray1[local61][local39].method1622();
									continue label84;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt3839; local39++) {
				local52 = local39 << this.anInt3841;
				local59 = local39 + 1 << this.anInt3841;
				for (local61 = 0; local61 < this.anInt3838; local61++) {
					local71 = 0;
					local76 = local61 << this.anInt3841;
					local83 = local61 + 1 << this.anInt3841;
					@Pc(85) Class1_Sub8 local85 = Static66.aClass1_Sub8_3;
					local85.anInt5182 = 0;
					for (@Pc(90) int local90 = local52; local90 < local59; local90++) {
						if (local90 - arg0 >= -arg1 && local90 - arg0 <= arg1) {
							@Pc(127) int local127 = local90 * this.aClass53_Sub1_2.anInt3017 + local76;
							for (@Pc(129) int local129 = local76; local129 < local83; local129++) {
								if (local129 - arg2 >= -arg1 && arg1 >= local129 - arg2 && arg3[local129 + arg1 - arg2][arg1 + local90 - arg0]) {
									@Pc(171) short[] local171 = this.aClass53_Sub1_2.aShortArrayArray1[local127];
									if (local171 != null) {
										@Pc(179) int local179;
										if (this.aClass32_Sub2_27.aBoolean240) {
											for (local179 = 0; local179 < local171.length; local179++) {
												local85.method4542(local171[local179] & 0xFFFF);
												local71++;
											}
										} else {
											for (local179 = 0; local179 < local171.length; local179++) {
												local85.method4509(local171[local179] & 0xFFFF);
												local71++;
											}
										}
									}
								}
								local127++;
							}
						}
					}
					if (local71 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass57ArrayArray1[local61][local39].method1619(local85.aByteArray81, local71);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!gi;IBI)V")
	public void method3501(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class1_Sub4_Sub10_Sub1 local2 = (Class1_Sub4_Sub10_Sub1) arg0;
		arg2 += local2.anInt6252 + 1;
		arg1 += local2.anInt6254 + 1;
		@Pc(23) int local23 = this.anInt3840 * arg2 + arg1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt6255;
		@Pc(31) int local31 = local2.anInt6253;
		@Pc(50) int local50 = this.anInt3840 - local31;
		@Pc(59) int local59;
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			local23 += local59 * this.anInt3840;
			local25 = local59 * local31;
			arg2 = 1;
			local28 -= local59;
		}
		@Pc(80) int local80 = 0;
		if (this.anInt3837 <= local28 + arg2) {
			local59 = arg2 + local28 + 1 - this.anInt3837;
			local28 -= local59;
		}
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			local23 += local59;
			local50 += local59;
			local80 = local59;
			local31 -= local59;
			arg1 = 1;
			local25 += local59;
		}
		if (local31 + arg1 >= this.anInt3840) {
			local59 = arg1 + local31 + 1 - this.anInt3840;
			local80 += local59;
			local50 += local59;
			local31 -= local59;
		}
		if (local31 > 0 && local28 > 0) {
			Static369.method3505(local31, local28, local23, local2.aByteArray91, local80, local50, local25, this.aByteArray61);
			this.method3504(local31, arg1, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIBI)V")
	private void method3504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass57ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg1 - 1 >> 7;
		@Pc(19) int local19 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(25) int local25 = arg3 - 1 >> 7;
		@Pc(43) int local43 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local9; local45 <= local19; local45++) {
			@Pc(53) Class57[] local53 = this.aClass57ArrayArray1[local45];
			for (@Pc(55) int local55 = local25; local55 <= local43; local55++) {
				local53[local55].aBoolean176 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBLclient!gi;I)Z")
	public boolean method3506(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub4_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class1_Sub4_Sub10_Sub1 local2 = (Class1_Sub4_Sub10_Sub1) arg1;
		arg2 += local2.anInt6254 + 1;
		arg0 += local2.anInt6252 + 1;
		@Pc(23) int local23 = this.anInt3840 * arg0 + arg2;
		@Pc(26) int local26 = local2.anInt6255;
		@Pc(29) int local29 = local2.anInt6253;
		@Pc(35) int local35 = this.anInt3840 - local29;
		@Pc(46) int local46;
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			arg0 = 1;
			local23 += this.anInt3840 * local46;
			local26 -= local46;
		}
		if (arg0 + local26 >= this.anInt3837) {
			local46 = local26 + arg0 + 1 - this.anInt3837;
			local26 -= local46;
		}
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local35 += local46;
			arg2 = 1;
			local23 += local46;
			local29 -= local46;
		}
		if (local29 + arg2 >= this.anInt3840) {
			local46 = local29 + arg2 + 1 - this.anInt3840;
			local29 -= local46;
			local35 += local46;
		}
		if (local29 > 0 && local26 > 0) {
			local35 += this.anInt3840 * 7;
			return Static369.method3503(local35, local23, local29, this.aByteArray61, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public void method3507() {
		this.aClass57ArrayArray1 = new Class57[this.anInt3838][this.anInt3839];
		for (@Pc(21) int local21 = 0; local21 < this.anInt3839; local21++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt3838; local27++) {
				this.aClass57ArrayArray1[local27][local21] = new Class57(this.aClass32_Sub2_27, this, this.aClass53_Sub1_2, local27, local21, this.anInt3841, local27 * 128 + 1, local21 * 128 + 1);
			}
		}
	}
}
