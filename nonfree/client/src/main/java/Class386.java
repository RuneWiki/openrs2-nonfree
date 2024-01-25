import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class386 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "[[Lclient!pe;")
	private Class277[][] aClass277ArrayArray1;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_42;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Lclient!bja;")
	private final Class35_Sub1 aClass35_Sub1_2;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public final int anInt10728;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	private final int anInt10738;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "[B")
	public final byte[] aByteArray102;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	private final int anInt10739;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	private final int anInt10737;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	private final int anInt10734;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!lf;Lclient!bja;)V")
	public Class386(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class35_Sub1 arg1) {
		this.aClass95_Sub3_42 = arg0;
		this.aClass35_Sub1_2 = arg1;
		this.anInt10728 = (this.aClass35_Sub1_2.anInt9149 * this.aClass35_Sub1_2.anInt9152 >> this.aClass95_Sub3_42.anInt5750) + 2;
		this.anInt10738 = (this.aClass35_Sub1_2.anInt9148 * this.aClass35_Sub1_2.anInt9152 >> this.aClass95_Sub3_42.anInt5750) + 2;
		this.aByteArray102 = new byte[this.anInt10728 * this.anInt10738];
		this.anInt10739 = this.aClass95_Sub3_42.anInt5750 + 7 - this.aClass35_Sub1_2.anInt9154;
		this.anInt10737 = this.aClass35_Sub1_2.anInt9149 >> this.anInt10739;
		this.anInt10734 = this.aClass35_Sub1_2.anInt9148 >> this.anInt10739;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!r;B)Z")
	public boolean method8812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub5_Sub11 arg2) {
		@Pc(11) Class3_Sub5_Sub11_Sub1 local11 = (Class3_Sub5_Sub11_Sub1) arg2;
		arg0 += local11.anInt5112 + 1;
		arg1 += local11.anInt5116 + 1;
		@Pc(33) int local33 = arg1 + arg0 * this.anInt10728;
		@Pc(36) int local36 = local11.anInt5114;
		@Pc(39) int local39 = local11.anInt5109;
		@Pc(45) int local45 = this.anInt10728 - local39;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local36 -= local55;
			local33 += this.anInt10728 * local55;
			arg0 = 1;
		}
		if (arg0 + local36 >= this.anInt10738) {
			local55 = arg0 + local36 + 1 - this.anInt10738;
			local36 -= local55;
		}
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local33 += local55;
			local45 += local55;
			arg1 = 1;
			local39 -= local55;
		}
		if (this.anInt10728 <= arg1 + local39) {
			local55 = local39 + arg1 + 1 - this.anInt10728;
			local39 -= local55;
			local45 += local55;
		}
		if (local39 > 0 && local36 > 0) {
			local45 += this.anInt10728 * 7;
			return Static494.method6487(this.aByteArray102, local33, local45, local36, local39);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!r;IB)V")
	public void method8813(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5_Sub11 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub5_Sub11_Sub1 local6 = (Class3_Sub5_Sub11_Sub1) arg1;
		arg2 += local6.anInt5116 + 1;
		arg0 += local6.anInt5112 + 1;
		@Pc(27) int local27 = arg0 * this.anInt10728 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(38) int local38 = local6.anInt5114;
		@Pc(41) int local41 = local6.anInt5109;
		@Pc(47) int local47 = this.anInt10728 - local41;
		@Pc(54) int local54;
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local29 = local54 * local41;
			local27 += this.anInt10728 * local54;
			local38 -= local54;
			arg0 = 1;
		}
		@Pc(75) int local75 = 0;
		if (arg0 + local38 >= this.anInt10738) {
			local54 = local38 + arg0 + 1 - this.anInt10738;
			local38 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local41 -= local54;
			local75 = local54;
			local29 += local54;
			local27 += local54;
			arg2 = 1;
			local47 += local54;
		}
		if (arg2 + local41 >= this.anInt10728) {
			local54 = local41 + arg2 + 1 - this.anInt10728;
			local75 += local54;
			local47 += local54;
			local41 -= local54;
		}
		if (local41 > 0 && local38 > 0) {
			Static276.method4050(local27, local41, local29, local38, local75, local47, this.aByteArray102, local6.aByteArray45);
			this.method8818(arg0, local38, local41, arg2);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!r;I)V")
	public void method8814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub5_Sub11 arg2) {
		@Pc(6) Class3_Sub5_Sub11_Sub1 local6 = (Class3_Sub5_Sub11_Sub1) arg2;
		arg0 += local6.anInt5116 + 1;
		arg1 += local6.anInt5112 + 1;
		@Pc(36) int local36 = arg0 + arg1 * this.anInt10728;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = local6.anInt5114;
		@Pc(44) int local44 = local6.anInt5109;
		@Pc(50) int local50 = this.anInt10728 - local44;
		@Pc(60) int local60;
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			local36 += this.anInt10728 * local60;
			local38 = local44 * local60;
			local41 -= local60;
			arg1 = 1;
		}
		@Pc(81) int local81 = 0;
		if (this.anInt10738 <= arg1 + local41) {
			local60 = arg1 + local41 + 1 - this.anInt10738;
			local41 -= local60;
		}
		if (arg0 <= 0) {
			local60 = 1 - arg0;
			local36 += local60;
			local81 = local60;
			local50 += local60;
			local38 += local60;
			arg0 = 1;
			local44 -= local60;
		}
		if (local44 + arg0 >= this.anInt10728) {
			local60 = local44 + arg0 + 1 - this.anInt10728;
			local50 += local60;
			local44 -= local60;
			local81 += local60;
		}
		if (local44 > 0 && local41 > 0) {
			Static46.method807(local44, local41, local38, this.aByteArray102, local81, local6.aByteArray45, local36, local50);
			this.method8818(arg1, local41, local44, arg0);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBIIZ[[Z)V")
	public void method8815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass95_Sub3_42.method4908(false);
		this.aClass95_Sub3_42.method4841(false);
		this.aClass95_Sub3_42.method4849(-2);
		this.aClass95_Sub3_42.method4870(1);
		this.aClass95_Sub3_42.method4833(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass95_Sub3_42.anInt5749 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg3) {
			for (local43 = 0; local43 < this.anInt10734; local43++) {
				local50 = local43 << this.anInt10739;
				local57 = local43 + 1 << this.anInt10739;
				label81: for (local59 = 0; local59 < this.anInt10737; local59++) {
					local63 = local59 << this.anInt10739;
					local68 = local59 + 1 << this.anInt10739;
					for (local75 = local63; local75 < local68; local75++) {
						if (local75 - arg1 >= -arg2 && local75 - arg1 <= arg2) {
							for (@Pc(303) int local303 = local50; local303 < local57; local303++) {
								if (-arg2 <= local303 - arg0 && arg2 >= local303 - arg0 && arg4[arg2 + local75 - arg1][local303 + arg2 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass277ArrayArray1[local59][local43].method6127();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt10734; local43++) {
				local50 = local43 << this.anInt10739;
				local57 = local43 + 1 << this.anInt10739;
				for (local59 = 0; local59 < this.anInt10737; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt10739;
					local75 = local59 + 1 << this.anInt10739;
					@Pc(79) Class3_Sub4_Sub2 local79 = this.aClass95_Sub3_42.aClass3_Sub4_Sub2_1;
					local79.anInt9739 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (local84 - arg0 >= -arg2 && local84 - arg0 <= arg2) {
							@Pc(106) int local106 = local68 + local84 * this.aClass35_Sub1_2.anInt9149;
							for (@Pc(108) int local108 = local68; local108 < local75; local108++) {
								if (local108 - arg1 >= -arg2 && arg2 >= local108 - arg1 && arg4[arg2 + local108 - arg1][arg2 + local84 - arg0]) {
									@Pc(144) short[] local144 = this.aClass35_Sub1_2.aShortArrayArray5[local106];
									if (local144 != null) {
										@Pc(152) int local152;
										if (this.aClass95_Sub3_42.aBoolean369) {
											for (local152 = 0; local152 < local144.length; local152++) {
												local63++;
												local79.method7956(local144[local152] & 0xFFFF);
											}
										} else {
											for (local152 = 0; local152 < local144.length; local152++) {
												local63++;
												local79.method7942(local144[local152] & 0xFFFF);
											}
										}
									}
								}
								local106++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass277ArrayArray1[local59][local43].method6128(local79.aByteArray90, local63);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public void method8817() {
		this.aClass277ArrayArray1 = new Class277[this.anInt10737][this.anInt10734];
		for (@Pc(14) int local14 = 0; local14 < this.anInt10734; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt10737; local18++) {
				this.aClass277ArrayArray1[local18][local14] = new Class277(this.aClass95_Sub3_42, this, this.aClass35_Sub1_2, local18, local14, this.anInt10739, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIII)V")
	private void method8818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass277ArrayArray1 == null) {
			return;
		}
		@Pc(25) int local25 = arg3 - 1 >> 7;
		@Pc(35) int local35 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(41) int local41 = arg0 - 1 >> 7;
		@Pc(49) int local49 = arg0 + arg1 - 2 >> 7;
		for (@Pc(51) int local51 = local25; local51 <= local35; local51++) {
			@Pc(58) Class277[] local58 = this.aClass277ArrayArray1[local51];
			for (@Pc(60) int local60 = local41; local60 <= local49; local60++) {
				local58[local60].aBoolean524 = true;
			}
		}
	}
}
