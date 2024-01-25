import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class170 {

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "[[Lclient!jm;")
	private Class152[][] aClass152ArrayArray1;

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "Lclient!sb;")
	private final Class10_Sub3 aClass10_Sub3_2;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_23;

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
	public final int anInt5133;

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
	private final int anInt5125;

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "[B")
	public final byte[] aByteArray69;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
	private final int anInt5129;

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
	private final int anInt5124;

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
	private final int anInt5132;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!te;Lclient!sb;)V")
	public Class170(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class10_Sub3 arg1) {
		this.aClass10_Sub3_2 = arg1;
		this.aClass9_Sub3_23 = arg0;
		this.anInt5133 = (this.aClass10_Sub3_2.anInt7410 * this.aClass10_Sub3_2.anInt7412 >> this.aClass9_Sub3_23.anInt7874) + 2;
		this.anInt5125 = (this.aClass10_Sub3_2.anInt7409 * this.aClass10_Sub3_2.anInt7410 >> this.aClass9_Sub3_23.anInt7874) + 2;
		this.aByteArray69 = new byte[this.anInt5125 * this.anInt5133];
		this.anInt5129 = this.aClass9_Sub3_23.anInt7874 + 7 - this.aClass10_Sub3_2.anInt7411;
		this.anInt5124 = this.aClass10_Sub3_2.anInt7412 >> this.anInt5129;
		this.anInt5132 = this.aClass10_Sub3_2.anInt7409 >> this.anInt5129;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	public void method4381() {
		this.aClass152ArrayArray1 = new Class152[this.anInt5124][this.anInt5132];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5132; local14++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt5124; local24++) {
				this.aClass152ArrayArray1[local24][local14] = new Class152(this.aClass9_Sub3_23, this, this.aClass10_Sub3_2, local24, local14, this.anInt5129, local24 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!k;I)V")
	public void method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub4 arg2) {
		@Pc(6) Class1_Sub1_Sub4_Sub2 local6 = (Class1_Sub1_Sub4_Sub2) arg2;
		arg0 += local6.anInt2916 + 1;
		arg1 += local6.anInt2910 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt5133;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt2911;
		@Pc(36) int local36 = local6.anInt2912;
		@Pc(42) int local42 = this.anInt5133 - local36;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local28 += this.anInt5133 * local49;
			local30 = local49 * local36;
			local33 -= local49;
			arg1 = 1;
		}
		@Pc(70) int local70 = 0;
		if (local33 + arg1 >= this.anInt5125) {
			local49 = arg1 + local33 + 1 - this.anInt5125;
			local33 -= local49;
		}
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local30 += local49;
			local42 += local49;
			local70 = local49;
			local36 -= local49;
			local28 += local49;
			arg0 = 1;
		}
		if (local36 + arg0 >= this.anInt5133) {
			local49 = local36 + arg0 + 1 - this.anInt5133;
			local42 += local49;
			local36 -= local49;
			local70 += local49;
		}
		if (local36 > 0 && local33 > 0) {
			Static279.method4749(local42, local33, local36, local30, local28, local70, this.aByteArray69, local6.aByteArray32);
			this.method4386(local36, arg1, arg0, local33);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "([[ZIIIBZ)V")
	public void method4383(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass9_Sub3_23.method6733(false);
		this.aClass9_Sub3_23.method6691(false);
		this.aClass9_Sub3_23.method6672(-2);
		this.aClass9_Sub3_23.method6670(1);
		this.aClass9_Sub3_23.method6654(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass9_Sub3_23.anInt7875 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg4) {
			for (local43 = 0; local43 < this.anInt5132; local43++) {
				local50 = local43 << this.anInt5129;
				local57 = local43 + 1 << this.anInt5129;
				label128: for (local59 = 0; local59 < this.anInt5124; local59++) {
					local66 = local59 << this.anInt5129;
					local73 = local59 + 1 << this.anInt5129;
					for (local75 = local66; local75 < local73; local75++) {
						if (-arg3 <= local75 - arg1 && arg3 >= local75 - arg1) {
							for (@Pc(96) int local96 = local50; local96 < local57; local96++) {
								if (-arg3 <= local96 - arg2 && arg3 >= local96 - arg2 && arg0[arg3 + local75 - arg1][arg3 + local96 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass152ArrayArray1[local59][local43].method3988();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt5132; local43++) {
				local50 = local43 << this.anInt5129;
				local57 = local43 + 1 << this.anInt5129;
				for (local59 = 0; local59 < this.anInt5124; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt5129;
					local75 = local59 + 1 << this.anInt5129;
					@Pc(231) Class1_Sub13_Sub1 local231 = this.aClass9_Sub3_23.aClass1_Sub13_Sub1_3;
					local231.anInt3400 = 0;
					for (@Pc(236) int local236 = local50; local236 < local57; local236++) {
						if (-arg3 <= local236 - arg2 && local236 - arg2 <= arg3) {
							@Pc(263) int local263 = local73 + local236 * this.aClass10_Sub3_2.anInt7412;
							for (@Pc(265) int local265 = local73; local265 < local75; local265++) {
								if (-arg3 <= local265 - arg1 && arg3 >= local265 - arg1 && arg0[local265 + arg3 - arg1][local236 + arg3 - arg2]) {
									@Pc(306) short[] local306 = this.aClass10_Sub3_2.aShortArrayArray11[local263];
									if (local306 != null) {
										@Pc(314) int local314;
										if (this.aClass9_Sub3_23.aBoolean523) {
											for (local314 = 0; local314 < local306.length; local314++) {
												local66++;
												local231.method3038(local306[local314] & 0xFFFF);
											}
										} else {
											for (local314 = 0; local314 < local306.length; local314++) {
												local231.method3068(local306[local314] & 0xFFFF);
												local66++;
											}
										}
									}
								}
								local263++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass152ArrayArray1[local59][local43].method3990(local66, local231.aByteArray45);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBILclient!k;)Z")
	public boolean method4384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub4 arg2) {
		@Pc(11) Class1_Sub1_Sub4_Sub2 local11 = (Class1_Sub1_Sub4_Sub2) arg2;
		arg0 += local11.anInt2916 + 1;
		arg1 += local11.anInt2910 + 1;
		@Pc(33) int local33 = arg0 + arg1 * this.anInt5133;
		@Pc(36) int local36 = local11.anInt2911;
		@Pc(39) int local39 = local11.anInt2912;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			arg1 = 1;
			local33 += local49 * this.anInt5133;
			local36 -= local49;
		}
		@Pc(68) int local68 = this.anInt5133 - local39;
		if (local36 + arg1 >= this.anInt5125) {
			local49 = local36 + arg1 + 1 - this.anInt5125;
			local36 -= local49;
		}
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			arg0 = 1;
			local39 -= local49;
			local68 += local49;
			local33 += local49;
		}
		if (this.anInt5133 <= arg0 + local39) {
			local49 = local39 + arg0 + 1 - this.anInt5133;
			local39 -= local49;
			local68 += local49;
		}
		if (local39 > 0 && local36 > 0) {
			local68 += this.anInt5133 * 7;
			return Static133.method2879(this.aByteArray69, local33, local36, local39, local68);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIII)V")
	private void method4386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass152ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg0 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg1 - 1 >> 7;
		@Pc(42) int local42 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local26; local44++) {
			@Pc(51) Class152[] local51 = this.aClass152ArrayArray1[local44];
			for (@Pc(53) int local53 = local32; local53 <= local42; local53++) {
				local51[local53].aBoolean278 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!k;BI)V")
	public void method4387(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub1_Sub4_Sub2 local6 = (Class1_Sub1_Sub4_Sub2) arg1;
		arg2 += local6.anInt2916 + 1;
		arg0 += local6.anInt2910 + 1;
		@Pc(28) int local28 = arg2 + this.anInt5133 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt2911;
		@Pc(36) int local36 = local6.anInt2912;
		@Pc(41) int local41 = this.anInt5133 - local36;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			arg0 = 1;
			local30 = local50 * local36;
			local28 += this.anInt5133 * local50;
			local33 -= local50;
		}
		@Pc(71) int local71 = 0;
		if (this.anInt5125 <= arg0 + local33) {
			local50 = arg0 + local33 + 1 - this.anInt5125;
			local33 -= local50;
		}
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local28 += local50;
			local36 -= local50;
			arg2 = 1;
			local71 = local50;
			local30 += local50;
			local41 += local50;
		}
		if (this.anInt5133 <= local36 + arg2) {
			local50 = arg2 + local36 + 1 - this.anInt5133;
			local71 += local50;
			local36 -= local50;
			local41 += local50;
		}
		if (local36 > 0 && local33 > 0) {
			Static39.method1336(local33, local6.aByteArray32, local71, local36, this.aByteArray69, local41, local28, local30);
			this.method4386(local36, arg0, arg2, local33);
		}
	}
}
