import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class61 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "[[Lclient!aj;")
	private Class9[][] aClass9ArrayArray1;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Lclient!ae;")
	private final Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_5;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public final int anInt1828;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	private final int anInt1821;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	private final int anInt1826;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	private final int anInt1830;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	private final int anInt1823;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!mh;Lclient!ae;)V")
	public Class61(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class7_Sub1 arg1) {
		this.aClass7_Sub1_1 = arg1;
		this.aClass4_Sub3_5 = arg0;
		this.anInt1828 = (this.aClass7_Sub1_1.anInt9577 * this.aClass7_Sub1_1.anInt9576 >> this.aClass4_Sub3_5.anInt5795) + 2;
		this.anInt1821 = (this.aClass7_Sub1_1.anInt9576 * this.aClass7_Sub1_1.anInt9575 >> this.aClass4_Sub3_5.anInt5795) + 2;
		this.aByteArray16 = new byte[this.anInt1821 * this.anInt1828];
		this.anInt1826 = this.aClass4_Sub3_5.anInt5795 + 7 - this.aClass7_Sub1_1.anInt9573;
		this.anInt1830 = this.aClass7_Sub1_1.anInt9577 >> this.anInt1826;
		this.anInt1823 = this.aClass7_Sub1_1.anInt9575 >> this.anInt1826;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
	private void method1763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass9ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg3 - 1 >> 7;
		@Pc(46) int local46 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local25; local48++) {
			@Pc(55) Class9[] local55 = this.aClass9ArrayArray1[local48];
			for (@Pc(57) int local57 = local31; local57 <= local46; local57++) {
				local55[local57].aBoolean19 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIILclient!k;)V")
	public void method1764(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub2 arg2) {
		@Pc(6) Class1_Sub2_Sub2_Sub2 local6 = (Class1_Sub2_Sub2_Sub2) arg2;
		arg1 += local6.anInt6882 + 1;
		arg0 += local6.anInt6880 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt1828;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt6873;
		@Pc(36) int local36 = local6.anInt6878;
		@Pc(42) int local42 = this.anInt1828 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			arg1 = 1;
			local33 -= local54;
			local28 += this.anInt1828 * local54;
			local30 = local54 * local36;
		}
		if (this.anInt1821 <= local33 + arg1) {
			local54 = local33 + arg1 + 1 - this.anInt1821;
			local33 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local28 += local54;
			local30 += local54;
			local36 -= local54;
			local44 = local54;
			arg0 = 1;
			local42 += local54;
		}
		if (this.anInt1828 <= arg0 + local36) {
			local54 = local36 + arg0 + 1 - this.anInt1828;
			local42 += local54;
			local36 -= local54;
			local44 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static454.method6989(local36, this.aByteArray16, local28, local30, local42, local33, local6.aByteArray94, local44);
			this.method1763(local36, local33, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([[ZZIIII)V")
	public void method1766(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass4_Sub3_5.method5273(false);
		this.aClass4_Sub3_5.method5268(false);
		this.aClass4_Sub3_5.method5238(-2);
		this.aClass4_Sub3_5.method5230(1);
		this.aClass4_Sub3_5.method5225(1);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass4_Sub3_5.anInt5793 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (arg1) {
			for (local45 = 0; local45 < this.anInt1823; local45++) {
				local52 = local45 << this.anInt1826;
				local59 = local45 + 1 << this.anInt1826;
				label128: for (local61 = 0; local61 < this.anInt1830; local61++) {
					local68 = local61 << this.anInt1826;
					local75 = local61 + 1 << this.anInt1826;
					for (local77 = local68; local77 < local75; local77++) {
						if (-arg3 <= local77 - arg2 && arg3 >= local77 - arg2) {
							for (@Pc(98) int local98 = local52; local98 < local59; local98++) {
								if (local98 - arg4 >= -arg3 && local98 - arg4 <= arg3 && arg0[local77 + arg3 - arg2][local98 + arg3 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local41, local41, 1.0F);
									OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass9ArrayArray1[local61][local45].method514();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt1823; local45++) {
				local52 = local45 << this.anInt1826;
				local59 = local45 + 1 << this.anInt1826;
				for (local61 = 0; local61 < this.anInt1830; local61++) {
					local68 = 0;
					local75 = local61 << this.anInt1826;
					local77 = local61 + 1 << this.anInt1826;
					@Pc(224) Class1_Sub17_Sub1 local224 = this.aClass4_Sub3_5.aClass1_Sub17_Sub1_2;
					local224.anInt4872 = 0;
					for (@Pc(229) int local229 = local52; local229 < local59; local229++) {
						if (local229 - arg4 >= -arg3 && arg3 >= local229 - arg4) {
							@Pc(254) int local254 = local229 * this.aClass7_Sub1_1.anInt9577 + local75;
							for (@Pc(256) int local256 = local75; local256 < local77; local256++) {
								if (local256 - arg2 >= -arg3 && local256 - arg2 <= arg3 && arg0[arg3 + local256 - arg2][local229 + arg3 - arg4]) {
									@Pc(298) short[] local298 = this.aClass7_Sub1_1.aShortArrayArray1[local254];
									if (local298 != null) {
										@Pc(306) int local306;
										if (this.aClass4_Sub3_5.aBoolean421) {
											for (local306 = 0; local306 < local298.length; local306++) {
												local68++;
												local224.method4473(local298[local306] & 0xFFFF);
											}
										} else {
											for (local306 = 0; local306 < local298.length; local306++) {
												local68++;
												local224.method4455(local298[local306] & 0xFFFF);
											}
										}
									}
								}
								local254++;
							}
						}
					}
					if (local68 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local41, local41, 1.0F);
						OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass9ArrayArray1[local61][local45].method517(local224.aByteArray58, local68);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!k;II)Z")
	public boolean method1767(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub2_Sub2_Sub2 local6 = (Class1_Sub2_Sub2_Sub2) arg1;
		arg0 += local6.anInt6882 + 1;
		arg2 += local6.anInt6880 + 1;
		@Pc(37) int local37 = this.anInt1828 * arg0 + arg2;
		@Pc(40) int local40 = local6.anInt6873;
		@Pc(43) int local43 = local6.anInt6878;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local37 += local53 * this.anInt1828;
			local40 -= local53;
		}
		@Pc(72) int local72 = this.anInt1828 - local43;
		if (this.anInt1821 <= arg0 + local40) {
			local53 = local40 + arg0 + 1 - this.anInt1821;
			local40 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local43 -= local53;
			arg2 = 1;
			local72 += local53;
			local37 += local53;
		}
		if (arg2 + local43 >= this.anInt1828) {
			local53 = arg2 + local43 + 1 - this.anInt1828;
			local72 += local53;
			local43 -= local53;
		}
		if (local43 > 0 && local40 > 0) {
			local72 += this.anInt1828 * 7;
			return Static390.method6234(this.aByteArray16, local43, local40, local72, local37);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public void method1771() {
		this.aClass9ArrayArray1 = new Class9[this.anInt1830][this.anInt1823];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1823; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt1830; local22++) {
				this.aClass9ArrayArray1[local22][local18] = new Class9(this.aClass4_Sub3_5, this, this.aClass7_Sub1_1, local22, local18, this.anInt1826, local22 * 128 + 1, local18 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!k;I)V")
	public void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub2 arg2) {
		@Pc(6) Class1_Sub2_Sub2_Sub2 local6 = (Class1_Sub2_Sub2_Sub2) arg2;
		arg1 += local6.anInt6882 + 1;
		arg0 += local6.anInt6880 + 1;
		@Pc(28) int local28 = arg0 + this.anInt1828 * arg1;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt6873;
		@Pc(41) int local41 = local6.anInt6878;
		@Pc(47) int local47 = this.anInt1828 - local41;
		@Pc(49) int local49 = 0;
		@Pc(58) int local58;
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			arg1 = 1;
			local28 += this.anInt1828 * local58;
			local38 -= local58;
			local35 = local58 * local41;
		}
		if (this.anInt1821 <= arg1 + local38) {
			local58 = arg1 + local38 + 1 - this.anInt1821;
			local38 -= local58;
		}
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			arg0 = 1;
			local47 += local58;
			local41 -= local58;
			local35 += local58;
			local49 = local58;
			local28 += local58;
		}
		if (this.anInt1828 <= local41 + arg0) {
			local58 = local41 + arg0 + 1 - this.anInt1828;
			local49 += local58;
			local47 += local58;
			local41 -= local58;
		}
		if (local41 > 0 && local38 > 0) {
			Static512.method7833(local28, local35, local38, this.aByteArray16, local49, local47, local41, local6.aByteArray94);
			this.method1763(local41, local38, arg0, arg1);
		}
	}
}
