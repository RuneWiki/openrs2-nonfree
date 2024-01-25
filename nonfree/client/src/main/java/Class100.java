import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class100 {

	@OriginalMember(owner = "client!fda", name = "l", descriptor = "[[Lclient!vaa;")
	private Class338[][] aClass338ArrayArray1;

	@OriginalMember(owner = "client!fda", name = "k", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_10;

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "Lclient!vfa;")
	private final Class47_Sub3 aClass47_Sub3_1;

	@OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
	public final int anInt2578;

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
	private final int anInt2569;

	@OriginalMember(owner = "client!fda", name = "j", descriptor = "[B")
	public final byte[] aByteArray28;

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
	private final int anInt2573;

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
	private final int anInt2571;

	@OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
	private final int anInt2577;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!ok;Lclient!vfa;)V")
	public Class100(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class47_Sub3 arg1) {
		this.aClass134_Sub2_10 = arg0;
		this.aClass47_Sub3_1 = arg1;
		this.anInt2578 = (this.aClass47_Sub3_1.anInt9208 * this.aClass47_Sub3_1.anInt9209 >> this.aClass134_Sub2_10.anInt6550) + 2;
		this.anInt2569 = (this.aClass47_Sub3_1.anInt9210 * this.aClass47_Sub3_1.anInt9208 >> this.aClass134_Sub2_10.anInt6550) + 2;
		this.aByteArray28 = new byte[this.anInt2578 * this.anInt2569];
		this.anInt2573 = this.aClass134_Sub2_10.anInt6550 + 7 - this.aClass47_Sub3_1.anInt9205;
		this.anInt2571 = this.aClass47_Sub3_1.anInt9209 >> this.anInt2573;
		this.anInt2577 = this.aClass47_Sub3_1.anInt9210 >> this.anInt2573;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!ha;IIB)V")
	public void method2038(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub6_Sub5_Sub1 local6 = (Class1_Sub6_Sub5_Sub1) arg0;
		arg1 += local6.anInt8721 + 1;
		arg2 += local6.anInt8724 + 1;
		@Pc(28) int local28 = arg1 + this.anInt2578 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt8715;
		@Pc(36) int local36 = local6.anInt8719;
		@Pc(42) int local42 = this.anInt2578 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local28 += this.anInt2578 * local54;
			local33 -= local54;
			local30 = local36 * local54;
			arg2 = 1;
		}
		if (local33 + arg2 >= this.anInt2569) {
			local54 = local33 + arg2 + 1 - this.anInt2569;
			local33 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local30 += local54;
			local28 += local54;
			arg1 = 1;
			local42 += local54;
			local36 -= local54;
			local44 = local54;
		}
		if (this.anInt2578 <= arg1 + local36) {
			local54 = arg1 + local36 + 1 - this.anInt2578;
			local36 -= local54;
			local42 += local54;
			local44 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static89.method1547(local36, local44, local33, local6.aByteArray92, this.aByteArray28, local28, local30, local42);
			this.method2042(local33, arg2, arg1, local36);
		}
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(Lclient!ha;IIB)V")
	public void method2039(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub6_Sub5_Sub1 local6 = (Class1_Sub6_Sub5_Sub1) arg0;
		arg2 += local6.anInt8724 + 1;
		arg1 += local6.anInt8721 + 1;
		@Pc(27) int local27 = this.anInt2578 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8715;
		@Pc(35) int local35 = local6.anInt8719;
		@Pc(40) int local40 = this.anInt2578 - local35;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			arg2 = 1;
			local29 = local50 * local35;
			local32 -= local50;
			local27 += local50 * this.anInt2578;
		}
		@Pc(71) int local71 = 0;
		if (local32 + arg2 >= this.anInt2569) {
			local50 = arg2 + local32 + 1 - this.anInt2569;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local27 += local50;
			local71 = local50;
			arg1 = 1;
			local29 += local50;
			local40 += local50;
			local35 -= local50;
		}
		if (local35 + arg1 >= this.anInt2578) {
			local50 = arg1 + local35 + 1 - this.anInt2578;
			local35 -= local50;
			local40 += local50;
			local71 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static578.method7767(local29, local71, this.aByteArray28, local32, local6.aByteArray92, local40, local35, local27);
			this.method2042(local32, arg2, arg1, local35);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
	public void method2040() {
		this.aClass338ArrayArray1 = new Class338[this.anInt2571][this.anInt2577];
		for (@Pc(23) int local23 = 0; local23 < this.anInt2577; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt2571; local27++) {
				this.aClass338ArrayArray1[local27][local23] = new Class338(this.aClass134_Sub2_10, this, this.aClass47_Sub3_1, local27, local23, this.anInt2573, local27 * 128 + 1, local23 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIZ)V")
	private void method2042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass338ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg3 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg1 - 1 >> 7;
		@Pc(43) int local43 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local26; local49++) {
			@Pc(56) Class338[] local56 = this.aClass338ArrayArray1[local49];
			for (@Pc(58) int local58 = local32; local58 <= local43; local58++) {
				local56[local58].aBoolean702 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IILclient!ha;I)Z")
	public boolean method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub6_Sub5 arg2) {
		@Pc(6) Class1_Sub6_Sub5_Sub1 local6 = (Class1_Sub6_Sub5_Sub1) arg2;
		arg0 += local6.anInt8724 + 1;
		arg1 += local6.anInt8721 + 1;
		@Pc(27) int local27 = arg1 + this.anInt2578 * arg0;
		@Pc(30) int local30 = local6.anInt8715;
		@Pc(38) int local38 = local6.anInt8719;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local30 -= local48;
			local27 += this.anInt2578 * local48;
			arg0 = 1;
		}
		@Pc(67) int local67 = this.anInt2578 - local38;
		if (local30 + arg0 >= this.anInt2569) {
			local48 = arg0 + local30 + 1 - this.anInt2569;
			local30 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local27 += local48;
			arg1 = 1;
			local38 -= local48;
			local67 += local48;
		}
		if (local38 + arg1 >= this.anInt2578) {
			local48 = arg1 + local38 + 1 - this.anInt2578;
			local38 -= local48;
			local67 += local48;
		}
		if (local38 > 0 && local30 > 0) {
			local67 += this.anInt2578 * 7;
			return Static313.method4342(this.aByteArray28, local27, local30, local67, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIII[[ZZ)V")
	public void method2046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) boolean arg4) {
		this.aClass134_Sub2_10.method5190(false);
		this.aClass134_Sub2_10.method5231(false);
		this.aClass134_Sub2_10.method5207(-2);
		this.aClass134_Sub2_10.method5194(1);
		this.aClass134_Sub2_10.method5233(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass134_Sub2_10.anInt6549 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg4) {
			for (local43 = 0; local43 < this.anInt2577; local43++) {
				local50 = local43 << this.anInt2573;
				local57 = local43 + 1 << this.anInt2573;
				label128: for (local59 = 0; local59 < this.anInt2571; local59++) {
					local66 = local59 << this.anInt2573;
					local73 = local59 + 1 << this.anInt2573;
					for (local75 = local66; local75 < local73; local75++) {
						if (local75 - arg2 >= -arg0 && local75 - arg2 <= arg0) {
							for (@Pc(92) int local92 = local50; local92 < local57; local92++) {
								if (local92 - arg1 >= -arg0 && local92 - arg1 <= arg0 && arg3[local75 + arg0 - arg2][arg0 + local92 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass338ArrayArray1[local59][local43].method7449();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt2577; local43++) {
				local50 = local43 << this.anInt2573;
				local57 = local43 + 1 << this.anInt2573;
				for (local59 = 0; local59 < this.anInt2571; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt2573;
					local75 = local59 + 1 << this.anInt2573;
					@Pc(213) Class1_Sub35_Sub1 local213 = this.aClass134_Sub2_10.aClass1_Sub35_Sub1_2;
					local213.anInt7214 = 0;
					for (@Pc(218) int local218 = local50; local218 < local57; local218++) {
						if (-arg0 <= local218 - arg1 && local218 - arg1 <= arg0) {
							@Pc(241) int local241 = this.aClass47_Sub3_1.anInt9209 * local218 + local73;
							for (@Pc(243) int local243 = local73; local243 < local75; local243++) {
								if (local243 - arg2 >= -arg0 && arg0 >= local243 - arg2 && arg3[arg0 + local243 - arg2][arg0 + local218 - arg1]) {
									@Pc(287) short[] local287 = this.aClass47_Sub3_1.aShortArrayArray13[local241];
									if (local287 != null) {
										@Pc(295) int local295;
										if (this.aClass134_Sub2_10.aBoolean517) {
											for (local295 = 0; local295 < local287.length; local295++) {
												local66++;
												local213.method5776(local287[local295] & 0xFFFF);
											}
										} else {
											for (local295 = 0; local295 < local287.length; local295++) {
												local66++;
												local213.method5767(local287[local295] & 0xFFFF);
											}
										}
									}
								}
								local241++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass338ArrayArray1[local59][local43].method7448(local66, local213.aByteArray85);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}
}
