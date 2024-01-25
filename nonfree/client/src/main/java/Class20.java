import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class20 {

	@OriginalMember(owner = "client!at", name = "h", descriptor = "[[Lclient!ad;")
	private Class5[][] aClass5ArrayArray1;

	@OriginalMember(owner = "client!at", name = "f", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_3;

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Lclient!le;")
	private final Class60_Sub2 aClass60_Sub2_1;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "I")
	public final int anInt371;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "I")
	private final int anInt369;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "[B")
	public final byte[] aByteArray13;

	@OriginalMember(owner = "client!at", name = "p", descriptor = "I")
	private final int anInt380;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "I")
	private final int anInt373;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "I")
	private final int anInt379;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!pea;Lclient!le;)V")
	public Class20(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class60_Sub2 arg1) {
		this.aClass121_Sub3_3 = arg0;
		this.aClass60_Sub2_1 = arg1;
		this.anInt371 = (this.aClass60_Sub2_1.anInt9652 * this.aClass60_Sub2_1.anInt9656 >> this.aClass121_Sub3_3.anInt6798) + 2;
		this.anInt369 = (this.aClass60_Sub2_1.anInt9652 * this.aClass60_Sub2_1.anInt9657 >> this.aClass121_Sub3_3.anInt6798) + 2;
		this.aByteArray13 = new byte[this.anInt369 * this.anInt371];
		this.anInt380 = this.aClass121_Sub3_3.anInt6798 + 7 - this.aClass60_Sub2_1.anInt9654;
		this.anInt373 = this.aClass60_Sub2_1.anInt9656 >> this.anInt380;
		this.anInt379 = this.aClass60_Sub2_1.anInt9657 >> this.anInt380;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public void method294() {
		this.aClass5ArrayArray1 = new Class5[this.anInt373][this.anInt379];
		for (@Pc(22) int local22 = 0; local22 < this.anInt379; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt373; local26++) {
				this.aClass5ArrayArray1[local26][local22] = new Class5(this.aClass121_Sub3_3, this, this.aClass60_Sub2_1, local26, local22, this.anInt380, local26 * 128 + 1, local22 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIII)V")
	private void method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass5ArrayArray1 == null) {
			return;
		}
		@Pc(23) int local23 = arg2 - 1 >> 7;
		@Pc(33) int local33 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(39) int local39 = arg1 - 1 >> 7;
		@Pc(50) int local50 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local23; local52 <= local33; local52++) {
			@Pc(59) Class5[] local59 = this.aClass5ArrayArray1[local52];
			for (@Pc(61) int local61 = local39; local61 <= local50; local61++) {
				local59[local61].aBoolean5 = true;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!w;BI)V")
	public void method296(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub12 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub1_Sub12_Sub2 local6 = (Class6_Sub1_Sub12_Sub2) arg1;
		arg0 += local6.anInt8702 + 1;
		arg2 += local6.anInt8696 + 1;
		@Pc(27) int local27 = arg0 + this.anInt371 * arg2;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local6.anInt8697;
		@Pc(43) int local43 = local6.anInt8699;
		@Pc(49) int local49 = this.anInt371 - local43;
		@Pc(51) int local51 = 0;
		@Pc(61) int local61;
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local27 += this.anInt371 * local61;
			local40 -= local61;
			local37 = local43 * local61;
			arg2 = 1;
		}
		if (this.anInt369 <= local40 + arg2) {
			local61 = arg2 + local40 + 1 - this.anInt369;
			local40 -= local61;
		}
		if (arg0 <= 0) {
			local61 = 1 - arg0;
			local37 += local61;
			local49 += local61;
			local43 -= local61;
			local27 += local61;
			local51 = local61;
			arg0 = 1;
		}
		if (this.anInt371 <= local43 + arg0) {
			local61 = local43 + arg0 + 1 - this.anInt371;
			local51 += local61;
			local43 -= local61;
			local49 += local61;
		}
		if (local43 > 0 && local40 > 0) {
			Static509.method7039(local40, local51, local6.aByteArray112, local49, this.aByteArray13, local37, local43, local27);
			this.method295(local43, arg2, arg0, local40);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I[[ZIZIB)V")
	public void method297(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass121_Sub3_3.method5680(false);
		this.aClass121_Sub3_3.method5665(false);
		this.aClass121_Sub3_3.method5690(-2);
		this.aClass121_Sub3_3.method5684(1);
		this.aClass121_Sub3_3.method5707(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass121_Sub3_3.anInt6799 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (arg3) {
			for (local47 = 0; local47 < this.anInt379; local47++) {
				local54 = local47 << this.anInt380;
				local61 = local47 + 1 << this.anInt380;
				label128: for (local63 = 0; local63 < this.anInt373; local63++) {
					local70 = local63 << this.anInt380;
					local77 = local63 + 1 << this.anInt380;
					for (local79 = local70; local79 < local77; local79++) {
						if (local79 - arg2 >= -arg0 && arg0 >= local79 - arg2) {
							for (@Pc(100) int local100 = local54; local100 < local61; local100++) {
								if (-arg0 <= local100 - arg4 && local100 - arg4 <= arg0 && arg1[local79 + arg0 - arg2][local100 + arg0 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass5ArrayArray1[local63][local47].method75();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt379; local47++) {
				local54 = local47 << this.anInt380;
				local61 = local47 + 1 << this.anInt380;
				for (local63 = 0; local63 < this.anInt373; local63++) {
					local70 = 0;
					local77 = local63 << this.anInt380;
					local79 = local63 + 1 << this.anInt380;
					@Pc(234) Class6_Sub14_Sub1 local234 = this.aClass121_Sub3_3.aClass6_Sub14_Sub1_3;
					local234.anInt7244 = 0;
					for (@Pc(239) int local239 = local54; local239 < local61; local239++) {
						if (-arg0 <= local239 - arg4 && arg0 >= local239 - arg4) {
							@Pc(270) int local270 = local239 * this.aClass60_Sub2_1.anInt9656 + local77;
							for (@Pc(272) int local272 = local77; local272 < local79; local272++) {
								if (-arg0 <= local272 - arg2 && arg0 >= local272 - arg2 && arg1[local272 + arg0 - arg2][local239 + arg0 - arg4]) {
									@Pc(311) short[] local311 = this.aClass60_Sub2_1.aShortArrayArray10[local270];
									if (local311 != null) {
										@Pc(319) int local319;
										if (this.aClass121_Sub3_3.aBoolean458) {
											for (local319 = 0; local319 < local311.length; local319++) {
												local70++;
												local234.method5999(local311[local319] & 0xFFFF);
											}
										} else {
											for (local319 = 0; local319 < local311.length; local319++) {
												local70++;
												local234.method6038(local311[local319] & 0xFFFF);
											}
										}
									}
								}
								local270++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass5ArrayArray1[local63][local47].method74(local70, local234.aByteArray88);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!w;III)V")
	public void method298(@OriginalArg(0) Class6_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class6_Sub1_Sub12_Sub2 local6 = (Class6_Sub1_Sub12_Sub2) arg0;
		arg1 += local6.anInt8696 + 1;
		arg2 += local6.anInt8702 + 1;
		@Pc(27) int local27 = arg2 + arg1 * this.anInt371;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8697;
		@Pc(35) int local35 = local6.anInt8699;
		@Pc(41) int local41 = this.anInt371 - local35;
		@Pc(43) int local43 = 0;
		@Pc(58) int local58;
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local29 = local35 * local58;
			local27 += local58 * this.anInt371;
			local32 -= local58;
			arg1 = 1;
		}
		if (this.anInt369 <= local32 + arg1) {
			local58 = local32 + arg1 + 1 - this.anInt369;
			local32 -= local58;
		}
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local35 -= local58;
			local29 += local58;
			local43 = local58;
			arg2 = 1;
			local27 += local58;
			local41 += local58;
		}
		if (this.anInt371 <= local35 + arg2) {
			local58 = arg2 + local35 + 1 - this.anInt371;
			local35 -= local58;
			local43 += local58;
			local41 += local58;
		}
		if (local35 > 0 && local32 > 0) {
			Static506.method6959(local6.aByteArray112, local43, local29, local27, local35, local32, this.aByteArray13, local41);
			this.method295(local35, arg1, arg2, local32);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLclient!w;II)Z")
	public boolean method299(@OriginalArg(1) Class6_Sub1_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub1_Sub12_Sub2 local6 = (Class6_Sub1_Sub12_Sub2) arg0;
		arg1 += local6.anInt8696 + 1;
		arg2 += local6.anInt8702 + 1;
		@Pc(27) int local27 = this.anInt371 * arg1 + arg2;
		@Pc(30) int local30 = local6.anInt8697;
		@Pc(33) int local33 = local6.anInt8699;
		@Pc(38) int local38 = this.anInt371 - local33;
		@Pc(52) int local52;
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local27 += this.anInt371 * local52;
			arg1 = 1;
			local30 -= local52;
		}
		if (this.anInt369 <= local30 + arg1) {
			local52 = arg1 + local30 + 1 - this.anInt369;
			local30 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local33 -= local52;
			local27 += local52;
			arg2 = 1;
			local38 += local52;
		}
		if (this.anInt371 <= local33 + arg2) {
			local52 = arg2 + local33 + 1 - this.anInt371;
			local33 -= local52;
			local38 += local52;
		}
		if (local33 > 0 && local30 > 0) {
			local38 += this.anInt371 * 7;
			return Static292.method4099(local33, local38, local27, local30, this.aByteArray13);
		} else {
			return false;
		}
	}
}
