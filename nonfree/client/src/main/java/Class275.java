import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class275 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[[Lclient!cq;")
	private Class74[][] aClass74ArrayArray1;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_2;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_27;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public final int anInt7530;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	private final int anInt7532;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	private final int anInt7529;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "[B")
	public final byte[] aByteArray73;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private final int anInt7527;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	private final int anInt7536;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!ffa;Lclient!aq;)V")
	public Class275(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class22_Sub1 arg1) {
		this.aClass22_Sub1_2 = arg1;
		this.aClass57_Sub2_27 = arg0;
		this.anInt7530 = (this.aClass22_Sub1_2.anInt9376 * this.aClass22_Sub1_2.anInt9377 >> this.aClass57_Sub2_27.anInt2749) + 2;
		this.anInt7532 = (this.aClass22_Sub1_2.anInt9377 * this.aClass22_Sub1_2.anInt9375 >> this.aClass57_Sub2_27.anInt2749) + 2;
		this.anInt7529 = this.aClass57_Sub2_27.anInt2749 + 7 - this.aClass22_Sub1_2.anInt9378;
		this.aByteArray73 = new byte[this.anInt7532 * this.anInt7530];
		this.anInt7527 = this.aClass22_Sub1_2.anInt9376 >> this.anInt7529;
		this.anInt7536 = this.aClass22_Sub1_2.anInt9375 >> this.anInt7529;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!r;I)V")
	public void method6505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub5_Sub4 arg2) {
		@Pc(6) Class5_Sub5_Sub4_Sub1 local6 = (Class5_Sub5_Sub4_Sub1) arg2;
		arg1 += local6.anInt2908 + 1;
		arg0 += local6.anInt2903 + 1;
		@Pc(28) int local28 = arg0 + this.anInt7530 * arg1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt2902;
		@Pc(36) int local36 = local6.anInt2905;
		@Pc(42) int local42 = this.anInt7530 - local36;
		@Pc(52) int local52;
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local33 -= local52;
			arg1 = 1;
			local30 = local36 * local52;
			local28 += local52 * this.anInt7530;
		}
		@Pc(78) int local78 = 0;
		if (this.anInt7532 <= arg1 + local33) {
			local52 = arg1 + local33 + 1 - this.anInt7532;
			local33 -= local52;
		}
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local78 = local52;
			local36 -= local52;
			local30 += local52;
			local42 += local52;
			local28 += local52;
			arg0 = 1;
		}
		if (this.anInt7530 <= arg0 + local36) {
			local52 = arg0 + local36 + 1 - this.anInt7530;
			local42 += local52;
			local78 += local52;
			local36 -= local52;
		}
		if (local36 > 0 && local33 > 0) {
			Static137.method1949(local42, local30, this.aByteArray73, local6.aByteArray14, local33, local36, local78, local28);
			this.method6508(arg0, local36, arg1, local33);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!r;II)V")
	public void method6506(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub5_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub5_Sub4_Sub1 local6 = (Class5_Sub5_Sub4_Sub1) arg1;
		arg0 += local6.anInt2903 + 1;
		arg2 += local6.anInt2908 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt7530;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2902;
		@Pc(35) int local35 = local6.anInt2905;
		@Pc(40) int local40 = this.anInt7530 - local35;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local27 += local47 * this.anInt7530;
			local29 = local35 * local47;
			local32 -= local47;
			arg2 = 1;
		}
		@Pc(68) int local68 = 0;
		if (local32 + arg2 >= this.anInt7532) {
			local47 = local32 + arg2 + 1 - this.anInt7532;
			local32 -= local47;
		}
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local68 = local47;
			local35 -= local47;
			arg0 = 1;
			local40 += local47;
			local29 += local47;
			local27 += local47;
		}
		if (this.anInt7530 <= arg0 + local35) {
			local47 = local35 + arg0 + 1 - this.anInt7530;
			local68 += local47;
			local40 += local47;
			local35 -= local47;
		}
		if (local35 > 0 && local32 > 0) {
			Static263.method3859(this.aByteArray73, local40, local27, local35, local68, local6.aByteArray14, local32, local29);
			this.method6508(arg0, local35, arg2, local32);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([[ZBZIII)V")
	public void method6507(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass57_Sub2_27.method2335(false);
		this.aClass57_Sub2_27.method2309(false);
		this.aClass57_Sub2_27.method2358(-2);
		this.aClass57_Sub2_27.method2382(1);
		this.aClass57_Sub2_27.method2372(1);
		@Pc(54) float local54 = 1.0F / (float) (this.aClass57_Sub2_27.anInt2748 * 128);
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(72) int local72;
		@Pc(74) int local74;
		@Pc(81) int local81;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (arg1) {
			for (local58 = 0; local58 < this.anInt7536; local58++) {
				local65 = local58 << this.anInt7529;
				local72 = local58 + 1 << this.anInt7529;
				label128: for (local74 = 0; local74 < this.anInt7527; local74++) {
					local81 = local74 << this.anInt7529;
					local88 = local74 + 1 << this.anInt7529;
					for (local90 = local81; local90 < local88; local90++) {
						if (local90 - arg2 >= -arg3 && arg3 >= local90 - arg2) {
							for (@Pc(118) int local118 = local65; local118 < local72; local118++) {
								if (local118 - arg4 >= -arg3 && arg3 >= local118 - arg4 && arg0[local90 + arg3 - arg2][local118 + arg3 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local54, local54, 1.0F);
									OpenGL.glTranslatef((float) -local74 / local54, (float) -local58 / local54, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass74ArrayArray1[local74][local58].method1314();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local58 = 0; local58 < this.anInt7536; local58++) {
				local65 = local58 << this.anInt7529;
				local72 = local58 + 1 << this.anInt7529;
				for (local74 = 0; local74 < this.anInt7527; local74++) {
					local81 = 0;
					local88 = local74 << this.anInt7529;
					local90 = local74 + 1 << this.anInt7529;
					@Pc(270) Class5_Sub23_Sub1 local270 = this.aClass57_Sub2_27.aClass5_Sub23_Sub1_1;
					local270.anInt9869 = 0;
					for (@Pc(275) int local275 = local65; local275 < local72; local275++) {
						if (local275 - arg4 >= -arg3 && arg3 >= local275 - arg4) {
							@Pc(305) int local305 = this.aClass22_Sub1_2.anInt9376 * local275 + local88;
							for (@Pc(307) int local307 = local88; local307 < local90; local307++) {
								if (local307 - arg2 >= -arg3 && local307 - arg2 <= arg3 && arg0[arg3 + local307 - arg2][local275 + arg3 - arg4]) {
									@Pc(354) short[] local354 = this.aClass22_Sub1_2.aShortArrayArray1[local305];
									if (local354 != null) {
										@Pc(364) int local364;
										if (this.aClass57_Sub2_27.aBoolean216) {
											for (local364 = 0; local364 < local354.length; local364++) {
												local270.method8480(local354[local364] & 0xFFFF);
												local81++;
											}
										} else {
											for (local364 = 0; local364 < local354.length; local364++) {
												local81++;
												local270.method8539(local354[local364] & 0xFFFF);
											}
										}
									}
								}
								local305++;
							}
						}
					}
					if (local81 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local54, local54, 1.0F);
						OpenGL.glTranslatef((float) -local74 / local54, (float) -local58 / local54, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass74ArrayArray1[local74][local58].method1312(local270.aByteArray102, local81);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	private void method6508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass74ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg0 - 1 >> 7;
		@Pc(26) int local26 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg2 - 1 >> 7;
		@Pc(42) int local42 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local16; local49 <= local26; local49++) {
			@Pc(56) Class74[] local56 = this.aClass74ArrayArray1[local49];
			for (@Pc(58) int local58 = local32; local58 <= local42; local58++) {
				local56[local58].aBoolean146 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLclient!r;I)Z")
	public boolean method6510(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub5_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub5_Sub4_Sub1 local6 = (Class5_Sub5_Sub4_Sub1) arg1;
		arg2 += local6.anInt2903 + 1;
		arg0 += local6.anInt2908 + 1;
		@Pc(27) int local27 = arg0 * this.anInt7530 + arg2;
		@Pc(30) int local30 = local6.anInt2902;
		@Pc(33) int local33 = local6.anInt2905;
		@Pc(43) int local43;
		if (arg0 <= 0) {
			local43 = 1 - arg0;
			local30 -= local43;
			arg0 = 1;
			local27 += local43 * this.anInt7530;
		}
		@Pc(62) int local62 = this.anInt7530 - local33;
		if (local30 + arg0 >= this.anInt7532) {
			local43 = arg0 + local30 + 1 - this.anInt7532;
			local30 -= local43;
		}
		if (arg2 <= 0) {
			local43 = 1 - arg2;
			local62 += local43;
			arg2 = 1;
			local27 += local43;
			local33 -= local43;
		}
		if (this.anInt7530 <= arg2 + local33) {
			local43 = local33 + arg2 + 1 - this.anInt7530;
			local33 -= local43;
			local62 += local43;
		}
		if (local33 > 0 && local30 > 0) {
			local62 += this.anInt7530 * 7;
			return Static525.method8036(local62, this.aByteArray73, local33, local27, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public void method6511() {
		this.aClass74ArrayArray1 = new Class74[this.anInt7527][this.anInt7536];
		for (@Pc(21) int local21 = 0; local21 < this.anInt7536; local21++) {
			for (@Pc(25) int local25 = 0; local25 < this.anInt7527; local25++) {
				this.aClass74ArrayArray1[local25][local21] = new Class74(this.aClass57_Sub2_27, this, this.aClass22_Sub1_2, local25, local21, this.anInt7529, local25 * 128 + 1, local21 * 128 + 1);
			}
		}
	}
}
