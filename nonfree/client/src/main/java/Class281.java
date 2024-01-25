import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class281 {

	@OriginalMember(owner = "client!pga", name = "q", descriptor = "[[Lclient!tf;")
	private Class346[][] aClass346ArrayArray1;

	@OriginalMember(owner = "client!pga", name = "t", descriptor = "Lclient!al;")
	private final Class18_Sub1 aClass18_Sub1_3;

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_28;

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "I")
	public final int anInt8225;

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
	private final int anInt8221;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
	private final int anInt8229;

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
	private final int anInt8230;

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "I")
	private final int anInt8231;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!lea;Lclient!al;)V")
	public Class281(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class18_Sub1 arg1) {
		this.aClass18_Sub1_3 = arg1;
		this.aClass101_Sub2_28 = arg0;
		this.anInt8225 = (this.aClass18_Sub1_3.anInt9739 * this.aClass18_Sub1_3.anInt9741 >> this.aClass101_Sub2_28.anInt6315) + 2;
		this.anInt8221 = (this.aClass18_Sub1_3.anInt9739 * this.aClass18_Sub1_3.anInt9742 >> this.aClass101_Sub2_28.anInt6315) + 2;
		this.aByteArray71 = new byte[this.anInt8221 * this.anInt8225];
		this.anInt8229 = this.aClass101_Sub2_28.anInt6315 + 7 - this.aClass18_Sub1_3.anInt9740;
		this.anInt8230 = this.aClass18_Sub1_3.anInt9741 >> this.anInt8229;
		this.anInt8231 = this.aClass18_Sub1_3.anInt9742 >> this.anInt8229;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIII)V")
	private void method7350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass346ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg1 + arg2 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class346[] local50 = this.aClass346ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				local50[local52].aBoolean730 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
	public void method7352() {
		this.aClass346ArrayArray1 = new Class346[this.anInt8230][this.anInt8231];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8231; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt8230; local18++) {
				this.aClass346ArrayArray1[local18][local14] = new Class346(this.aClass101_Sub2_28, this, this.aClass18_Sub1_3, local18, local14, this.anInt8229, local18 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIBLclient!r;)V")
	public void method7354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub11 arg2) {
		@Pc(6) Class2_Sub1_Sub11_Sub1 local6 = (Class2_Sub1_Sub11_Sub1) arg2;
		arg1 += local6.anInt5983 + 1;
		arg0 += local6.anInt5982 + 1;
		@Pc(27) int local27 = arg1 + arg0 * this.anInt8225;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5986;
		@Pc(35) int local35 = local6.anInt5980;
		@Pc(41) int local41 = this.anInt8225 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local32 -= local50;
			local27 += this.anInt8225 * local50;
			arg0 = 1;
			local29 = local35 * local50;
		}
		if (local32 + arg0 >= this.anInt8221) {
			local50 = local32 + arg0 + 1 - this.anInt8221;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local27 += local50;
			local41 += local50;
			arg1 = 1;
			local43 = local50;
			local29 += local50;
			local35 -= local50;
		}
		if (arg1 + local35 >= this.anInt8225) {
			local50 = arg1 + local35 + 1 - this.anInt8225;
			local35 -= local50;
			local41 += local50;
			local43 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static245.method4356(this.aByteArray71, local27, local32, local35, local41, local29, local43, local6.aByteArray56);
			this.method7350(arg1, local32, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIB[[ZZI)V")
	public void method7355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass101_Sub2_28.method5691(false);
		this.aClass101_Sub2_28.method5683(false);
		this.aClass101_Sub2_28.method5670(-2);
		this.aClass101_Sub2_28.method5681(1);
		this.aClass101_Sub2_28.method5614(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass101_Sub2_28.anInt6316 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg3) {
			for (local43 = 0; local43 < this.anInt8231; local43++) {
				local50 = local43 << this.anInt8229;
				local57 = local43 + 1 << this.anInt8229;
				label81: for (local59 = 0; local59 < this.anInt8230; local59++) {
					local63 = local59 << this.anInt8229;
					local68 = local59 + 1 << this.anInt8229;
					for (local75 = local63; local75 < local68; local75++) {
						if (local75 - arg0 >= -arg4 && local75 - arg0 <= arg4) {
							for (@Pc(317) int local317 = local50; local317 < local57; local317++) {
								if (-arg4 <= local317 - arg1 && arg4 >= local317 - arg1 && arg2[local75 + arg4 - arg0][local317 + arg4 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass346ArrayArray1[local59][local43].method8689();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt8231; local43++) {
				local50 = local43 << this.anInt8229;
				local57 = local43 + 1 << this.anInt8229;
				for (local59 = 0; local59 < this.anInt8230; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt8229;
					local75 = local59 + 1 << this.anInt8229;
					@Pc(79) Class2_Sub8_Sub1 local79 = this.aClass101_Sub2_28.aClass2_Sub8_Sub1_2;
					local79.anInt5725 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (-arg4 <= local84 - arg1 && local84 - arg1 <= arg4) {
							@Pc(112) int local112 = local84 * this.aClass18_Sub1_3.anInt9741 + local68;
							for (@Pc(114) int local114 = local68; local114 < local75; local114++) {
								if (local114 - arg0 >= -arg4 && arg4 >= local114 - arg0 && arg2[arg4 + local114 - arg0][arg4 + local84 - arg1]) {
									@Pc(154) short[] local154 = this.aClass18_Sub1_3.aShortArrayArray1[local112];
									if (local154 != null) {
										@Pc(162) int local162;
										if (this.aClass101_Sub2_28.aBoolean470) {
											for (local162 = 0; local162 < local154.length; local162++) {
												local79.method5192(local154[local162] & 0xFFFF);
												local63++;
											}
										} else {
											for (local162 = 0; local162 < local154.length; local162++) {
												local63++;
												local79.method5228(local154[local162] & 0xFFFF);
											}
										}
									}
								}
								local112++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass346ArrayArray1[local59][local43].method8690(local63, local79.lb);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIILclient!r;)V")
	public void method7356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub11 arg2) {
		@Pc(6) Class2_Sub1_Sub11_Sub1 local6 = (Class2_Sub1_Sub11_Sub1) arg2;
		arg0 += local6.anInt5983 + 1;
		arg1 += local6.anInt5982 + 1;
		@Pc(36) int local36 = arg0 + arg1 * this.anInt8225;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = local6.anInt5986;
		@Pc(44) int local44 = local6.anInt5980;
		@Pc(50) int local50 = this.anInt8225 - local44;
		@Pc(52) int local52 = 0;
		@Pc(59) int local59;
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			local38 = local59 * local44;
			arg1 = 1;
			local36 += local59 * this.anInt8225;
			local41 -= local59;
		}
		if (arg1 + local41 >= this.anInt8221) {
			local59 = local41 + arg1 + 1 - this.anInt8221;
			local41 -= local59;
		}
		if (arg0 <= 0) {
			local59 = 1 - arg0;
			local36 += local59;
			local52 = local59;
			local50 += local59;
			local44 -= local59;
			local38 += local59;
			arg0 = 1;
		}
		if (this.anInt8225 <= local44 + arg0) {
			local59 = local44 + arg0 + 1 - this.anInt8225;
			local44 -= local59;
			local50 += local59;
			local52 += local59;
		}
		if (local44 > 0 && local41 > 0) {
			Static340.method5711(local41, this.aByteArray71, local50, local38, local52, local36, local44, local6.aByteArray56);
			this.method7350(arg0, local41, arg1, local44);
		}
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(IIILclient!r;)Z")
	public boolean method7357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub11 arg2) {
		@Pc(6) Class2_Sub1_Sub11_Sub1 local6 = (Class2_Sub1_Sub11_Sub1) arg2;
		arg1 += local6.anInt5982 + 1;
		arg0 += local6.anInt5983 + 1;
		@Pc(27) int local27 = this.anInt8225 * arg1 + arg0;
		@Pc(35) int local35 = local6.anInt5986;
		@Pc(38) int local38 = local6.anInt5980;
		@Pc(44) int local44 = this.anInt8225 - local38;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local35 -= local54;
			arg1 = 1;
			local27 += this.anInt8225 * local54;
		}
		if (this.anInt8221 <= local35 + arg1) {
			local54 = local35 + arg1 + 1 - this.anInt8221;
			local35 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local38 -= local54;
			local27 += local54;
			local44 += local54;
			arg0 = 1;
		}
		if (this.anInt8225 <= local38 + arg0) {
			local54 = arg0 + local38 + 1 - this.anInt8225;
			local44 += local54;
			local38 -= local54;
		}
		if (local38 > 0 && local35 > 0) {
			local44 += this.anInt8225 * 7;
			return Static385.method6484(local44, local38, local27, local35, this.aByteArray71);
		} else {
			return false;
		}
	}
}
