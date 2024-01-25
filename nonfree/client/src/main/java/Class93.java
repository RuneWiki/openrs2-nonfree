import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class93 {

	@OriginalMember(owner = "client!em", name = "o", descriptor = "[[Lclient!qo;")
	private Class290[][] aClass290ArrayArray1;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_13;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "Lclient!dn;")
	private final Class76_Sub1 aClass76_Sub1_1;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public final int anInt2266;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	private final int anInt2265;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	private final int anInt2262;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "I")
	private final int anInt2272;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	private final int anInt2269;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!ep;Lclient!dn;)V")
	public Class93(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class76_Sub1 arg1) {
		this.aClass95_Sub1_13 = arg0;
		this.aClass76_Sub1_1 = arg1;
		this.anInt2266 = (this.aClass76_Sub1_1.anInt8791 * this.aClass76_Sub1_1.anInt8792 >> this.aClass95_Sub1_13.anInt2515) + 2;
		this.anInt2265 = (this.aClass76_Sub1_1.anInt8794 * this.aClass76_Sub1_1.anInt8792 >> this.aClass95_Sub1_13.anInt2515) + 2;
		this.aByteArray32 = new byte[this.anInt2265 * this.anInt2266];
		this.anInt2262 = this.aClass95_Sub1_13.anInt2515 + 7 - this.aClass76_Sub1_1.anInt8795;
		this.anInt2272 = this.aClass76_Sub1_1.anInt8791 >> this.anInt2262;
		this.anInt2269 = this.aClass76_Sub1_1.anInt8794 >> this.anInt2262;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!r;IBI)V")
	public void method1849(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub2_Sub19_Sub1 local6 = (Class2_Sub2_Sub19_Sub1) arg0;
		arg1 += local6.anInt6551 + 1;
		arg2 += local6.anInt6550 + 1;
		@Pc(31) int local31 = this.anInt2266 * arg1 + arg2;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local6.anInt6555;
		@Pc(39) int local39 = local6.anInt6554;
		@Pc(45) int local45 = this.anInt2266 - local39;
		@Pc(47) int local47 = 0;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local33 = local39 * local54;
			local36 -= local54;
			arg1 = 1;
			local31 += local54 * this.anInt2266;
		}
		if (arg1 + local36 >= this.anInt2265) {
			local54 = arg1 + local36 + 1 - this.anInt2265;
			local36 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local33 += local54;
			local45 += local54;
			local39 -= local54;
			local31 += local54;
			arg2 = 1;
			local47 = local54;
		}
		if (arg2 + local39 >= this.anInt2266) {
			local54 = arg2 + local39 + 1 - this.anInt2266;
			local45 += local54;
			local47 += local54;
			local39 -= local54;
		}
		if (local39 > 0 && local36 > 0) {
			Static410.method5505(this.aByteArray32, local36, local6.aByteArray82, local45, local33, local47, local39, local31);
			this.method1854(local39, arg1, local36, arg2);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZI[[ZII)V")
	public void method1850(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) int arg4) {
		this.aClass95_Sub1_13.method2099(false);
		this.aClass95_Sub1_13.method2096(false);
		this.aClass95_Sub1_13.method2053(-2);
		this.aClass95_Sub1_13.method2106(1);
		this.aClass95_Sub1_13.method2062(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass95_Sub1_13.anInt2514 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg1) {
			for (local43 = 0; local43 < this.anInt2269; local43++) {
				local50 = local43 << this.anInt2262;
				local57 = local43 + 1 << this.anInt2262;
				label128: for (local59 = 0; local59 < this.anInt2272; local59++) {
					local66 = local59 << this.anInt2262;
					local73 = local59 + 1 << this.anInt2262;
					for (local75 = local66; local75 < local73; local75++) {
						if (local75 - arg4 >= -arg2 && arg2 >= local75 - arg4) {
							for (@Pc(100) int local100 = local50; local100 < local57; local100++) {
								if (-arg2 <= local100 - arg0 && local100 - arg0 <= arg2 && arg3[local75 + arg2 - arg4][local100 + arg2 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass290ArrayArray1[local59][local43].method6346();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt2269; local43++) {
				local50 = local43 << this.anInt2262;
				local57 = local43 + 1 << this.anInt2262;
				for (local59 = 0; local59 < this.anInt2272; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt2262;
					local75 = local59 + 1 << this.anInt2262;
					@Pc(227) Class2_Sub22_Sub1 local227 = this.aClass95_Sub1_13.aClass2_Sub22_Sub1_1;
					local227.anInt10247 = 0;
					for (@Pc(232) int local232 = local50; local232 < local57; local232++) {
						if (local232 - arg0 >= -arg2 && arg2 >= local232 - arg0) {
							@Pc(263) int local263 = this.aClass76_Sub1_1.anInt8791 * local232 + local73;
							for (@Pc(265) int local265 = local73; local265 < local75; local265++) {
								if (-arg2 <= local265 - arg4 && local265 - arg4 <= arg2 && arg3[local265 + arg2 - arg4][local232 + arg2 - arg0]) {
									@Pc(303) short[] local303 = this.aClass76_Sub1_1.aShortArrayArray13[local263];
									if (local303 != null) {
										@Pc(311) int local311;
										if (this.aClass95_Sub1_13.aBoolean174) {
											for (local311 = 0; local311 < local303.length; local311++) {
												local66++;
												local227.method8500(local303[local311] & 0xFFFF);
											}
										} else {
											for (local311 = 0; local311 < local303.length; local311++) {
												local227.method8492(local303[local311] & 0xFFFF);
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
						this.aClass290ArrayArray1[local59][local43].method6347(local227.aByteArray115, local66);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIILclient!r;)V")
	public void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub19 arg2) {
		@Pc(6) Class2_Sub2_Sub19_Sub1 local6 = (Class2_Sub2_Sub19_Sub1) arg2;
		arg1 += local6.anInt6551 + 1;
		arg0 += local6.anInt6550 + 1;
		@Pc(27) int local27 = this.anInt2266 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6555;
		@Pc(35) int local35 = local6.anInt6554;
		@Pc(41) int local41 = this.anInt2266 - local35;
		@Pc(50) int local50;
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local29 = local50 * local35;
			local27 += local50 * this.anInt2266;
			arg1 = 1;
			local32 -= local50;
		}
		@Pc(71) int local71 = 0;
		if (this.anInt2265 <= local32 + arg1) {
			local50 = arg1 + local32 + 1 - this.anInt2265;
			local32 -= local50;
		}
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local71 = local50;
			local41 += local50;
			local35 -= local50;
			local29 += local50;
			arg0 = 1;
			local27 += local50;
		}
		if (this.anInt2266 <= local35 + arg0) {
			@Pc(149) int local149 = arg0 + local35 + 1 - this.anInt2266;
			local35 -= local149;
			local41 += local149;
			local71 += local149;
		}
		if (local35 > 0 && local32 > 0) {
			Static291.method1826(local6.aByteArray82, this.aByteArray32, local29, local35, local27, local41, local32, local71);
			this.method1854(local35, arg1, local32, arg0);
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(IIIII)V")
	private void method1854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass290ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(23) int local23 = arg3 + arg0 - 2 >> 7;
		@Pc(29) int local29 = arg1 - 1 >> 7;
		@Pc(37) int local37 = arg1 + arg2 - 2 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local23; local43++) {
			@Pc(50) Class290[] local50 = this.aClass290ArrayArray1[local43];
			for (@Pc(52) int local52 = local29; local52 <= local37; local52++) {
				local50[local52].aBoolean556 = true;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	public void method1855() {
		this.aClass290ArrayArray1 = new Class290[this.anInt2272][this.anInt2269];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2269; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2272; local22++) {
				this.aClass290ArrayArray1[local22][local18] = new Class290(this.aClass95_Sub1_13, this, this.aClass76_Sub1_1, local22, local18, this.anInt2262, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!r;III)Z")
	public boolean method1856(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub2_Sub19_Sub1 local6 = (Class2_Sub2_Sub19_Sub1) arg0;
		arg1 += local6.anInt6550 + 1;
		arg2 += local6.anInt6551 + 1;
		@Pc(27) int local27 = arg1 + this.anInt2266 * arg2;
		@Pc(30) int local30 = local6.anInt6555;
		@Pc(39) int local39 = local6.anInt6554;
		@Pc(44) int local44 = this.anInt2266 - local39;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local30 -= local54;
			local27 += local54 * this.anInt2266;
			arg2 = 1;
		}
		if (arg2 + local30 >= this.anInt2265) {
			local54 = local30 + arg2 + 1 - this.anInt2265;
			local30 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local27 += local54;
			local44 += local54;
			local39 -= local54;
			arg1 = 1;
		}
		if (this.anInt2266 <= arg1 + local39) {
			local54 = local39 + arg1 + 1 - this.anInt2266;
			local39 -= local54;
			local44 += local54;
		}
		if (local39 > 0 && local30 > 0) {
			local44 += this.anInt2266 * 7;
			return Static525.method5094(this.aByteArray32, local27, local39, local30, local44);
		} else {
			return false;
		}
	}
}
