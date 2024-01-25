import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class223 {

	@OriginalMember(owner = "client!li", name = "e", descriptor = "[[Lclient!gs;")
	private Class144[][] aClass144ArrayArray1;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_30;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!gba;")
	private final Class133_Sub1 aClass133_Sub1_3;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public final int anInt5824;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	private final int anInt5825;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "I")
	private final int anInt5822;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "[B")
	public final byte[] aByteArray75;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	private final int anInt5826;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "I")
	private final int anInt5820;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!uja;Lclient!gba;)V")
	public Class223(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class133_Sub1 arg1) {
		this.aClass145_Sub3_30 = arg0;
		this.aClass133_Sub1_3 = arg1;
		this.anInt5824 = (this.aClass133_Sub1_3.anInt9318 * this.aClass133_Sub1_3.anInt9321 >> this.aClass145_Sub3_30.anInt10144) + 2;
		this.anInt5825 = (this.aClass133_Sub1_3.anInt9315 * this.aClass133_Sub1_3.anInt9321 >> this.aClass145_Sub3_30.anInt10144) + 2;
		this.anInt5822 = this.aClass145_Sub3_30.anInt10144 + 7 - this.aClass133_Sub1_3.anInt9317;
		this.aByteArray75 = new byte[this.anInt5825 * this.anInt5824];
		this.anInt5826 = this.aClass133_Sub1_3.anInt9318 >> this.anInt5822;
		this.anInt5820 = this.aClass133_Sub1_3.anInt9315 >> this.anInt5822;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public void method5217() {
		this.aClass144ArrayArray1 = new Class144[this.anInt5826][this.anInt5820];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5820; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt5826; local26++) {
				this.aClass144ArrayArray1[local26][local22] = new Class144(this.aClass145_Sub3_30, this, this.aClass133_Sub1_3, local26, local22, this.anInt5822, local26 * 128 + 1, local22 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!r;BI)Z")
	public boolean method5220(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub6_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub6_Sub9_Sub1 local6 = (Class2_Sub6_Sub9_Sub1) arg1;
		arg0 += local6.anInt5102 + 1;
		arg2 += local6.anInt5106 + 1;
		@Pc(34) int local34 = arg2 + this.anInt5824 * arg0;
		@Pc(37) int local37 = local6.anInt5097;
		@Pc(40) int local40 = local6.anInt5100;
		@Pc(46) int local46 = this.anInt5824 - local40;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local34 += local53 * this.anInt5824;
			local37 -= local53;
		}
		if (arg0 + local37 >= this.anInt5825) {
			local53 = local37 + arg0 + 1 - this.anInt5825;
			local37 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local46 += local53;
			arg2 = 1;
			local40 -= local53;
			local34 += local53;
		}
		if (arg2 + local40 >= this.anInt5824) {
			local53 = local40 + arg2 + 1 - this.anInt5824;
			local40 -= local53;
			local46 += local53;
		}
		if (local40 > 0 && local37 > 0) {
			local46 += this.anInt5824 * 7;
			return Static10.method195(this.aByteArray75, local37, local34, local46, local40);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([[ZIIZII)V")
	public void method5221(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass145_Sub3_30.method8907(false);
		this.aClass145_Sub3_30.method8905(false);
		this.aClass145_Sub3_30.method8881(-2);
		this.aClass145_Sub3_30.method8900(1);
		this.aClass145_Sub3_30.method8847(1);
		@Pc(53) float local53 = 1.0F / (float) (this.aClass145_Sub3_30.anInt10143 * 128);
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(73) int local73;
		@Pc(80) int local80;
		@Pc(87) int local87;
		@Pc(89) int local89;
		if (arg3) {
			for (local57 = 0; local57 < this.anInt5820; local57++) {
				local64 = local57 << this.anInt5822;
				local71 = local57 + 1 << this.anInt5822;
				label128: for (local73 = 0; local73 < this.anInt5826; local73++) {
					local80 = local73 << this.anInt5822;
					local87 = local73 + 1 << this.anInt5822;
					for (local89 = local80; local89 < local87; local89++) {
						if (-arg1 <= local89 - arg4 && arg1 >= local89 - arg4) {
							for (@Pc(110) int local110 = local64; local110 < local71; local110++) {
								if (-arg1 <= local110 - arg2 && local110 - arg2 <= arg1 && arg0[local89 + arg1 - arg4][local110 + arg1 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local53, local53, 1.0F);
									OpenGL.glTranslatef((float) -local73 / local53, (float) -local57 / local53, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass144ArrayArray1[local73][local57].method3086();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local57 = 0; local57 < this.anInt5820; local57++) {
				local64 = local57 << this.anInt5822;
				local71 = local57 + 1 << this.anInt5822;
				for (local73 = 0; local73 < this.anInt5826; local73++) {
					local80 = 0;
					local87 = local73 << this.anInt5822;
					local89 = local73 + 1 << this.anInt5822;
					@Pc(261) Class2_Sub20_Sub1 local261 = this.aClass145_Sub3_30.aClass2_Sub20_Sub1_3;
					local261.anInt9723 = 0;
					for (@Pc(266) int local266 = local64; local266 < local71; local266++) {
						if (-arg1 <= local266 - arg2 && local266 - arg2 <= arg1) {
							@Pc(296) int local296 = local87 + local266 * this.aClass133_Sub1_3.anInt9318;
							for (@Pc(298) int local298 = local87; local298 < local89; local298++) {
								if (-arg1 <= local298 - arg4 && arg1 >= local298 - arg4 && arg0[arg1 + local298 - arg4][arg1 + local266 - arg2]) {
									@Pc(347) short[] local347 = this.aClass133_Sub1_3.aShortArrayArray3[local296];
									if (local347 != null) {
										@Pc(357) int local357;
										if (this.aClass145_Sub3_30.aBoolean872) {
											for (local357 = 0; local357 < local347.length; local357++) {
												local261.method8551(local347[local357] & 0xFFFF);
												local80++;
											}
										} else {
											for (local357 = 0; local357 < local347.length; local357++) {
												local80++;
												local261.method8589(local347[local357] & 0xFFFF);
											}
										}
									}
								}
								local296++;
							}
						}
					}
					if (local80 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local53, local53, 1.0F);
						OpenGL.glTranslatef((float) -local73 / local53, (float) -local57 / local53, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass144ArrayArray1[local73][local57].method3087(local80, local261.aByteArray111);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
	private void method5223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass144ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg3 - 1 >> 7;
		@Pc(32) int local32 = arg3 + arg0 - 2 >> 7;
		@Pc(38) int local38 = arg2 - 1 >> 7;
		@Pc(48) int local48 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(50) int local50 = local16; local50 <= local32; local50++) {
			@Pc(57) Class144[] local57 = this.aClass144ArrayArray1[local50];
			for (@Pc(59) int local59 = local38; local59 <= local48; local59++) {
				local57[local59].aBoolean320 = true;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BIILclient!r;)V")
	public void method5224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub6_Sub9 arg2) {
		@Pc(6) Class2_Sub6_Sub9_Sub1 local6 = (Class2_Sub6_Sub9_Sub1) arg2;
		arg0 += local6.anInt5102 + 1;
		arg1 += local6.anInt5106 + 1;
		@Pc(27) int local27 = arg0 * this.anInt5824 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5097;
		@Pc(35) int local35 = local6.anInt5100;
		@Pc(41) int local41 = this.anInt5824 - local35;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local29 = local35 * local50;
			arg0 = 1;
			local27 += this.anInt5824 * local50;
			local32 -= local50;
		}
		@Pc(71) int local71 = 0;
		if (this.anInt5825 <= local32 + arg0) {
			local50 = local32 + arg0 + 1 - this.anInt5825;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			arg1 = 1;
			local71 = local50;
			local35 -= local50;
			local41 += local50;
			local27 += local50;
			local29 += local50;
		}
		if (local35 + arg1 >= this.anInt5824) {
			local50 = arg1 + local35 + 1 - this.anInt5824;
			local71 += local50;
			local35 -= local50;
			local41 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static511.method7248(local6.aByteArray70, this.aByteArray75, local32, local35, local71, local29, local27, local41);
			this.method5223(local35, local32, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIBLclient!r;)V")
	public void method5225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub6_Sub9 arg2) {
		@Pc(6) Class2_Sub6_Sub9_Sub1 local6 = (Class2_Sub6_Sub9_Sub1) arg2;
		arg0 += local6.anInt5106 + 1;
		arg1 += local6.anInt5102 + 1;
		@Pc(27) int local27 = arg1 * this.anInt5824 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5097;
		@Pc(43) int local43 = local6.anInt5100;
		@Pc(49) int local49 = this.anInt5824 - local43;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local27 += this.anInt5824 * local56;
			local29 = local56 * local43;
			local32 -= local56;
			arg1 = 1;
		}
		@Pc(77) int local77 = 0;
		if (this.anInt5825 <= local32 + arg1) {
			local56 = local32 + arg1 + 1 - this.anInt5825;
			local32 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local77 = local56;
			local27 += local56;
			arg0 = 1;
			local29 += local56;
			local49 += local56;
			local43 -= local56;
		}
		if (local43 + arg0 >= this.anInt5824) {
			local56 = local43 + arg0 + 1 - this.anInt5824;
			local77 += local56;
			local49 += local56;
			local43 -= local56;
		}
		if (local43 > 0 && local32 > 0) {
			Static29.method429(local32, this.aByteArray75, local49, local6.aByteArray70, local43, local29, local77, local27);
			this.method5223(local43, local32, arg1, arg0);
		}
	}
}
