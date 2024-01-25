import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class207 {

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "[[Lclient!le;")
	private Class153[][] aClass153ArrayArray1;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_36;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Lclient!gk;")
	private final Class96_Sub1 aClass96_Sub1_3;

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	public final int anInt6082;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	private final int anInt6081;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
	private final int anInt6083;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "[B")
	public final byte[] aByteArray76;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
	private final int anInt6074;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
	private final int anInt6084;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!ih;Lclient!gk;)V")
	public Class207(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) Class96_Sub1 arg1) {
		this.aClass106_Sub2_36 = arg0;
		this.aClass96_Sub1_3 = arg1;
		this.anInt6082 = (this.aClass96_Sub1_3.anInt5778 * this.aClass96_Sub1_3.anInt5777 >> this.aClass106_Sub2_36.anInt3734) + 2;
		this.anInt6081 = (this.aClass96_Sub1_3.anInt5778 * this.aClass96_Sub1_3.anInt5775 >> this.aClass106_Sub2_36.anInt3734) + 2;
		this.anInt6083 = this.aClass106_Sub2_36.anInt3734 + 7 - this.aClass96_Sub1_3.anInt5779;
		this.aByteArray76 = new byte[this.anInt6081 * this.anInt6082];
		this.anInt6074 = this.aClass96_Sub1_3.anInt5777 >> this.anInt6083;
		this.anInt6084 = this.aClass96_Sub1_3.anInt5775 >> this.anInt6083;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!i;IIB)V")
	public void method4666(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub1_Sub10_Sub1 local6 = (Class1_Sub1_Sub10_Sub1) arg0;
		arg1 += local6.anInt4402 + 1;
		arg2 += local6.anInt4397 + 1;
		@Pc(27) int local27 = arg2 + this.anInt6082 * arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4399;
		@Pc(35) int local35 = local6.anInt4392;
		@Pc(45) int local45 = this.anInt6082 - local35;
		@Pc(47) int local47 = 0;
		@Pc(57) int local57;
		if (arg1 <= 0) {
			local57 = 1 - arg1;
			arg1 = 1;
			local27 += this.anInt6082 * local57;
			local32 -= local57;
			local29 = local35 * local57;
		}
		if (this.anInt6081 <= local32 + arg1) {
			local57 = local32 + arg1 + 1 - this.anInt6081;
			local32 -= local57;
		}
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			arg2 = 1;
			local47 = local57;
			local29 += local57;
			local45 += local57;
			local35 -= local57;
			local27 += local57;
		}
		if (this.anInt6082 <= arg2 + local35) {
			local57 = local35 + arg2 + 1 - this.anInt6082;
			local45 += local57;
			local47 += local57;
			local35 -= local57;
		}
		if (local35 > 0 && local32 > 0) {
			Static20.method424(local45, this.aByteArray76, local6.aByteArray52, local27, local32, local29, local47, local35);
			this.method4670(local35, arg2, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIILclient!i;)V")
	public void method4667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub10 arg2) {
		@Pc(6) Class1_Sub1_Sub10_Sub1 local6 = (Class1_Sub1_Sub10_Sub1) arg2;
		arg0 += local6.anInt4397 + 1;
		arg1 += local6.anInt4402 + 1;
		@Pc(27) int local27 = this.anInt6082 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4399;
		@Pc(39) int local39 = local6.anInt4392;
		@Pc(45) int local45 = this.anInt6082 - local39;
		@Pc(52) int local52;
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local27 += this.anInt6082 * local52;
			local32 -= local52;
			local29 = local52 * local39;
			arg1 = 1;
		}
		@Pc(73) int local73 = 0;
		if (local32 + arg1 >= this.anInt6081) {
			local52 = arg1 + local32 + 1 - this.anInt6081;
			local32 -= local52;
		}
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			arg0 = 1;
			local29 += local52;
			local73 = local52;
			local45 += local52;
			local39 -= local52;
			local27 += local52;
		}
		if (this.anInt6082 <= local39 + arg0) {
			local52 = arg0 + local39 + 1 - this.anInt6082;
			local45 += local52;
			local73 += local52;
			local39 -= local52;
		}
		if (local39 > 0 && local32 > 0) {
			Static42.method784(local39, local32, local6.aByteArray52, local45, this.aByteArray76, local73, local27, local29);
			this.method4670(local39, arg0, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	public void method4668() {
		this.aClass153ArrayArray1 = new Class153[this.anInt6074][this.anInt6084];
		for (@Pc(20) int local20 = 0; local20 < this.anInt6084; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt6074; local24++) {
				this.aClass153ArrayArray1[local24][local20] = new Class153(this.aClass106_Sub2_36, this, this.aClass96_Sub1_3, local24, local20, this.anInt6083, local24 * 128 + 1, local20 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILclient!i;)Z")
	public boolean method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub10 arg2) {
		@Pc(6) Class1_Sub1_Sub10_Sub1 local6 = (Class1_Sub1_Sub10_Sub1) arg2;
		arg1 += local6.anInt4402 + 1;
		arg0 += local6.anInt4397 + 1;
		@Pc(27) int local27 = arg0 + this.anInt6082 * arg1;
		@Pc(30) int local30 = local6.anInt4399;
		@Pc(33) int local33 = local6.anInt4392;
		@Pc(39) int local39 = this.anInt6082 - local33;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local27 += this.anInt6082 * local49;
			local30 -= local49;
			arg1 = 1;
		}
		if (this.anInt6081 <= local30 + arg1) {
			local49 = local30 + arg1 + 1 - this.anInt6081;
			local30 -= local49;
		}
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local33 -= local49;
			arg0 = 1;
			local39 += local49;
			local27 += local49;
		}
		if (this.anInt6082 <= local33 + arg0) {
			local49 = local33 + arg0 + 1 - this.anInt6082;
			local33 -= local49;
			local39 += local49;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt6082 * 7;
			return Static301.method4360(this.aByteArray76, local33, local39, local27, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)V")
	private void method4670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass153ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class153[] local50 = this.aClass153ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				local50[local52].aBoolean285 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[[ZZII)V")
	public void method4671(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass106_Sub2_36.method2858(false);
		this.aClass106_Sub2_36.method2914(false);
		this.aClass106_Sub2_36.method2904(-2);
		this.aClass106_Sub2_36.method2851(1);
		this.aClass106_Sub2_36.method2927(1);
		@Pc(53) float local53 = 1.0F / (float) (this.aClass106_Sub2_36.anInt3733 * 128);
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(73) int local73;
		@Pc(80) int local80;
		@Pc(87) int local87;
		@Pc(89) int local89;
		if (arg2) {
			for (local57 = 0; local57 < this.anInt6084; local57++) {
				local64 = local57 << this.anInt6083;
				local71 = local57 + 1 << this.anInt6083;
				label128: for (local73 = 0; local73 < this.anInt6074; local73++) {
					local80 = local73 << this.anInt6083;
					local87 = local73 + 1 << this.anInt6083;
					for (local89 = local80; local89 < local87; local89++) {
						if (-arg3 <= local89 - arg0 && arg3 >= local89 - arg0) {
							for (@Pc(108) int local108 = local64; local108 < local71; local108++) {
								if (-arg3 <= local108 - arg4 && local108 - arg4 <= arg3 && arg1[local89 + arg3 - arg0][local108 + arg3 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local53, local53, 1.0F);
									OpenGL.glTranslatef((float) -local73 / local53, (float) -local57 / local53, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass153ArrayArray1[local73][local57].method3483();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local57 = 0; local57 < this.anInt6084; local57++) {
				local64 = local57 << this.anInt6083;
				local71 = local57 + 1 << this.anInt6083;
				for (local73 = 0; local73 < this.anInt6074; local73++) {
					local80 = 0;
					local87 = local73 << this.anInt6083;
					local89 = local73 + 1 << this.anInt6083;
					@Pc(244) Class1_Sub3_Sub2 local244 = this.aClass106_Sub2_36.aClass1_Sub3_Sub2_2;
					local244.anInt1710 = 0;
					for (@Pc(249) int local249 = local64; local249 < local71; local249++) {
						if (-arg3 <= local249 - arg4 && local249 - arg4 <= arg3) {
							@Pc(280) int local280 = local87 + local249 * this.aClass96_Sub1_3.anInt5777;
							for (@Pc(282) int local282 = local87; local282 < local89; local282++) {
								if (local282 - arg0 >= -arg3 && local282 - arg0 <= arg3 && arg1[arg3 + local282 - arg0][arg3 + local249 - arg4]) {
									@Pc(326) short[] local326 = this.aClass96_Sub1_3.aShortArrayArray1[local280];
									if (local326 != null) {
										@Pc(334) int local334;
										if (this.aClass106_Sub2_36.aBoolean227) {
											for (local334 = 0; local334 < local326.length; local334++) {
												local80++;
												local244.method1227(local326[local334] & 0xFFFF);
											}
										} else {
											for (local334 = 0; local334 < local326.length; local334++) {
												local244.method1199(local326[local334] & 0xFFFF);
												local80++;
											}
										}
									}
								}
								local280++;
							}
						}
					}
					if (local80 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local53, local53, 1.0F);
						OpenGL.glTranslatef((float) -local73 / local53, (float) -local57 / local53, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass153ArrayArray1[local73][local57].method3479(local80, local244.aByteArray14);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}
}
