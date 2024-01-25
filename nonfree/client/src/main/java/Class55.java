import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class55 {

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "[[Lclient!ki;")
	private Class190[][] aClass190ArrayArray1;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Lclient!sm;")
	private final Class83_Sub3 aClass83_Sub3_1;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_6;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	public final int anInt1279;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
	private final int anInt1281;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "[B")
	public final byte[] aByteArray12;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
	private final int anInt1273;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	private final int anInt1275;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
	private final int anInt1282;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!kga;Lclient!sm;)V")
	public Class55(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class83_Sub3 arg1) {
		this.aClass83_Sub3_1 = arg1;
		this.aClass44_Sub3_6 = arg0;
		this.anInt1279 = (this.aClass83_Sub3_1.anInt8829 * this.aClass83_Sub3_1.anInt8824 >> this.aClass44_Sub3_6.anInt5470) + 2;
		this.anInt1281 = (this.aClass83_Sub3_1.anInt8824 * this.aClass83_Sub3_1.anInt8830 >> this.aClass44_Sub3_6.anInt5470) + 2;
		this.aByteArray12 = new byte[this.anInt1281 * this.anInt1279];
		this.anInt1273 = this.aClass44_Sub3_6.anInt5470 + 7 - this.aClass83_Sub3_1.anInt8825;
		this.anInt1275 = this.aClass83_Sub3_1.anInt8829 >> this.anInt1273;
		this.anInt1282 = this.aClass83_Sub3_1.anInt8830 >> this.anInt1273;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	public void method1239() {
		this.aClass190ArrayArray1 = new Class190[this.anInt1275][this.anInt1282];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1282; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt1275; local20++) {
				this.aClass190ArrayArray1[local20][local14] = new Class190(this.aClass44_Sub3_6, this, this.aClass83_Sub3_1, local20, local14, this.anInt1273, local20 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILclient!ha;II)V")
	public void method1240(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub5_Sub6 arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class4_Sub5_Sub6_Sub2 local11 = (Class4_Sub5_Sub6_Sub2) arg1;
		arg0 += local11.anInt9187 + 1;
		arg2 += local11.anInt9191 + 1;
		@Pc(32) int local32 = this.anInt1279 * arg2 + arg0;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local11.anInt9193;
		@Pc(40) int local40 = local11.anInt9194;
		@Pc(46) int local46 = this.anInt1279 - local40;
		@Pc(48) int local48 = 0;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local34 = local54 * local40;
			arg2 = 1;
			local37 -= local54;
			local32 += this.anInt1279 * local54;
		}
		if (arg2 + local37 >= this.anInt1281) {
			local54 = local37 + arg2 + 1 - this.anInt1281;
			local37 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local46 += local54;
			arg0 = 1;
			local48 = local54;
			local34 += local54;
			local40 -= local54;
			local32 += local54;
		}
		if (local40 + arg0 >= this.anInt1279) {
			local54 = arg0 + local40 + 1 - this.anInt1279;
			local46 += local54;
			local48 += local54;
			local40 -= local54;
		}
		if (local40 > 0 && local37 > 0) {
			Static183.method6498(local46, local40, local48, local11.aByteArray101, local32, local34, this.aByteArray12, local37);
			this.method1241(local40, arg2, arg0, local37);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIII)V")
	private void method1241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass190ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(31) int local31 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg1 - 1 >> 7;
		@Pc(47) int local47 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local31; local49++) {
			@Pc(56) Class190[] local56 = this.aClass190ArrayArray1[local49];
			for (@Pc(58) int local58 = local37; local58 <= local47; local58++) {
				local56[local58].aBoolean422 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZIILclient!ha;)Z")
	public boolean method1243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub5_Sub6 arg2) {
		@Pc(6) Class4_Sub5_Sub6_Sub2 local6 = (Class4_Sub5_Sub6_Sub2) arg2;
		arg1 += local6.anInt9187 + 1;
		arg0 += local6.anInt9191 + 1;
		@Pc(28) int local28 = arg1 + this.anInt1279 * arg0;
		@Pc(31) int local31 = local6.anInt9193;
		@Pc(39) int local39 = local6.anInt9194;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			arg0 = 1;
			local28 += local49 * this.anInt1279;
			local31 -= local49;
		}
		@Pc(68) int local68 = this.anInt1279 - local39;
		if (arg0 + local31 >= this.anInt1281) {
			local49 = local31 + arg0 + 1 - this.anInt1281;
			local31 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			arg1 = 1;
			local28 += local49;
			local68 += local49;
			local39 -= local49;
		}
		if (this.anInt1279 <= arg1 + local39) {
			local49 = arg1 + local39 + 1 - this.anInt1279;
			local68 += local49;
			local39 -= local49;
		}
		if (local39 > 0 && local31 > 0) {
			local68 += this.anInt1279 * 7;
			return Static501.method5639(local39, local68, local28, this.aByteArray12, local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(ILclient!ha;II)V")
	public void method1244(@OriginalArg(1) Class4_Sub5_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub5_Sub6_Sub2 local6 = (Class4_Sub5_Sub6_Sub2) arg0;
		arg1 += local6.anInt9187 + 1;
		arg2 += local6.anInt9191 + 1;
		@Pc(27) int local27 = arg2 * this.anInt1279 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9193;
		@Pc(35) int local35 = local6.anInt9194;
		@Pc(40) int local40 = this.anInt1279 - local35;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local27 += local47 * this.anInt1279;
			local32 -= local47;
			arg2 = 1;
			local29 = local35 * local47;
		}
		@Pc(68) int local68 = 0;
		if (local32 + arg2 >= this.anInt1281) {
			local47 = local32 + arg2 + 1 - this.anInt1281;
			local32 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local68 = local47;
			arg1 = 1;
			local27 += local47;
			local40 += local47;
			local35 -= local47;
			local29 += local47;
		}
		if (this.anInt1279 <= arg1 + local35) {
			local47 = local35 + arg1 + 1 - this.anInt1279;
			local35 -= local47;
			local40 += local47;
			local68 += local47;
		}
		if (local35 > 0 && local32 > 0) {
			Static552.method8002(this.aByteArray12, local27, local32, local40, local35, local68, local29, local6.aByteArray101);
			this.method1241(local35, arg2, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ[[ZZII)V")
	public void method1245(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass44_Sub3_6.method4642(false);
		this.aClass44_Sub3_6.method4604(false);
		this.aClass44_Sub3_6.method4661(-2);
		this.aClass44_Sub3_6.method4658(1);
		this.aClass44_Sub3_6.method4669(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass44_Sub3_6.anInt5472 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg1) {
			for (local43 = 0; local43 < this.anInt1282; local43++) {
				local50 = local43 << this.anInt1273;
				local57 = local43 + 1 << this.anInt1273;
				label128: for (local59 = 0; local59 < this.anInt1275; local59++) {
					local66 = local59 << this.anInt1273;
					local73 = local59 + 1 << this.anInt1273;
					for (local75 = local66; local75 < local73; local75++) {
						if (local75 - arg3 >= -arg4 && arg4 >= local75 - arg3) {
							for (@Pc(91) int local91 = local50; local91 < local57; local91++) {
								if (local91 - arg0 >= -arg4 && arg4 >= local91 - arg0 && arg2[arg4 + local75 - arg3][local91 + arg4 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass190ArrayArray1[local59][local43].method4721();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt1282; local43++) {
				local50 = local43 << this.anInt1273;
				local57 = local43 + 1 << this.anInt1273;
				for (local59 = 0; local59 < this.anInt1275; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt1273;
					local75 = local59 + 1 << this.anInt1273;
					@Pc(225) Class4_Sub11_Sub2 local225 = this.aClass44_Sub3_6.aClass4_Sub11_Sub2_2;
					local225.anInt5831 = 0;
					for (@Pc(230) int local230 = local50; local230 < local57; local230++) {
						if (-arg4 <= local230 - arg0 && arg4 >= local230 - arg0) {
							@Pc(256) int local256 = local73 + local230 * this.aClass83_Sub3_1.anInt8829;
							for (@Pc(258) int local258 = local73; local258 < local75; local258++) {
								if (local258 - arg3 >= -arg4 && local258 - arg3 <= arg4 && arg2[local258 + arg4 - arg3][arg4 + local230 - arg0]) {
									@Pc(299) short[] local299 = this.aClass83_Sub3_1.aShortArrayArray10[local256];
									if (local299 != null) {
										@Pc(307) int local307;
										if (this.aClass44_Sub3_6.aBoolean399) {
											for (local307 = 0; local307 < local299.length; local307++) {
												local225.method4937(local299[local307] & 0xFFFF);
												local66++;
											}
										} else {
											for (local307 = 0; local307 < local299.length; local307++) {
												local66++;
												local225.method4912(local299[local307] & 0xFFFF);
											}
										}
									}
								}
								local256++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass190ArrayArray1[local59][local43].method4724(local225.aByteArray68, local66);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}
}
