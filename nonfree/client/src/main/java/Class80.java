import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class80 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "[[Lclient!jl;")
	private Class191[][] aClass191ArrayArray1;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "Lclient!dl;")
	private final Class84_Sub1 aClass84_Sub1_1;

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_8;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public final int anInt1577;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
	private final int anInt1579;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "[B")
	public final byte[] aByteArray21;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	private final int anInt1581;

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	private final int anInt1574;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
	private final int anInt1576;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!vf;Lclient!dl;)V")
	public Class80(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class84_Sub1 arg1) {
		this.aClass84_Sub1_1 = arg1;
		this.aClass100_Sub3_8 = arg0;
		this.anInt1577 = (this.aClass84_Sub1_1.anInt8881 * this.aClass84_Sub1_1.anInt8883 >> this.aClass100_Sub3_8.anInt10256) + 2;
		this.anInt1579 = (this.aClass84_Sub1_1.anInt8878 * this.aClass84_Sub1_1.anInt8881 >> this.aClass100_Sub3_8.anInt10256) + 2;
		this.aByteArray21 = new byte[this.anInt1577 * this.anInt1579];
		this.anInt1581 = this.aClass100_Sub3_8.anInt10256 + 7 - this.aClass84_Sub1_1.anInt8885;
		this.anInt1574 = this.aClass84_Sub1_1.anInt8883 >> this.anInt1581;
		this.anInt1576 = this.aClass84_Sub1_1.anInt8878 >> this.anInt1581;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method1481(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1_Sub15 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub1_Sub15_Sub1 local6 = (Class5_Sub1_Sub15_Sub1) arg1;
		arg2 += local6.anInt7193 + 1;
		arg0 += local6.anInt7199 + 1;
		@Pc(28) int local28 = arg0 + this.anInt1577 * arg2;
		@Pc(31) int local31 = local6.anInt7196;
		@Pc(34) int local34 = local6.anInt7194;
		@Pc(40) int local40 = this.anInt1577 - local34;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local28 += this.anInt1577 * local50;
			local31 -= local50;
			arg2 = 1;
		}
		if (arg2 + local31 >= this.anInt1579) {
			local50 = arg2 + local31 + 1 - this.anInt1579;
			local31 -= local50;
		}
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			arg0 = 1;
			local28 += local50;
			local40 += local50;
			local34 -= local50;
		}
		if (this.anInt1577 <= arg0 + local34) {
			local50 = local34 + arg0 + 1 - this.anInt1577;
			local34 -= local50;
			local40 += local50;
		}
		if (local34 > 0 && local31 > 0) {
			local40 += this.anInt1577 * 7;
			return Static192.method6457(local40, local28, local34, this.aByteArray21, local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public void method1482() {
		this.aClass191ArrayArray1 = new Class191[this.anInt1574][this.anInt1576];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1576; local14++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt1574; local21++) {
				this.aClass191ArrayArray1[local21][local14] = new Class191(this.aClass100_Sub3_8, this, this.aClass84_Sub1_1, local21, local14, this.anInt1581, local21 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIB)V")
	private void method1483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass191ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg1 - 1 >> 7;
		@Pc(39) int local39 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(45) int local45 = arg0 - 1 >> 7;
		@Pc(55) int local55 = arg0 + arg3 - 1 - 1 >> 7;
		for (@Pc(57) int local57 = local16; local57 <= local39; local57++) {
			@Pc(64) Class191[] local64 = this.aClass191ArrayArray1[local57];
			for (@Pc(66) int local66 = local45; local66 <= local55; local66++) {
				local64[local66].aBoolean323 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!r;III)V")
	public void method1484(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class5_Sub1_Sub15_Sub1 local6 = (Class5_Sub1_Sub15_Sub1) arg0;
		arg1 += local6.anInt7199 + 1;
		arg2 += local6.anInt7193 + 1;
		@Pc(27) int local27 = this.anInt1577 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7196;
		@Pc(35) int local35 = local6.anInt7194;
		@Pc(41) int local41 = this.anInt1577 - local35;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			arg2 = 1;
			local29 = local35 * local53;
			local27 += local53 * this.anInt1577;
			local32 -= local53;
		}
		if (this.anInt1579 <= local32 + arg2) {
			local53 = arg2 + local32 + 1 - this.anInt1579;
			local32 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local27 += local53;
			local41 += local53;
			local29 += local53;
			arg1 = 1;
			local43 = local53;
			local35 -= local53;
		}
		if (this.anInt1577 <= local35 + arg1) {
			local53 = arg1 + local35 + 1 - this.anInt1577;
			local41 += local53;
			local43 += local53;
			local35 -= local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static532.method7341(local32, this.aByteArray21, local43, local27, local35, local6.aByteArray80, local29, local41);
			this.method1483(arg2, arg1, local35, local32);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZB[[ZIII)V")
	public void method1485(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass100_Sub3_8.method8720(false);
		this.aClass100_Sub3_8.method8735(false);
		this.aClass100_Sub3_8.method8693(-2);
		this.aClass100_Sub3_8.method8671(1);
		this.aClass100_Sub3_8.method8728(1);
		@Pc(44) float local44 = 1.0F / (float) (this.aClass100_Sub3_8.anInt10255 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(80) int local80;
		if (arg0) {
			for (local48 = 0; local48 < this.anInt1576; local48++) {
				local55 = local48 << this.anInt1581;
				local62 = local48 + 1 << this.anInt1581;
				label128: for (local64 = 0; local64 < this.anInt1574; local64++) {
					local71 = local64 << this.anInt1581;
					local78 = local64 + 1 << this.anInt1581;
					for (local80 = local71; local80 < local78; local80++) {
						if (-arg4 <= local80 - arg3 && arg4 >= local80 - arg3) {
							for (@Pc(105) int local105 = local55; local105 < local62; local105++) {
								if (local105 - arg2 >= -arg4 && local105 - arg2 <= arg4 && arg1[arg4 + local80 - arg3][arg4 + local105 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local44, local44, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass191ArrayArray1[local64][local48].method4467();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt1576; local48++) {
				local55 = local48 << this.anInt1581;
				local62 = local48 + 1 << this.anInt1581;
				for (local64 = 0; local64 < this.anInt1574; local64++) {
					local71 = 0;
					local78 = local64 << this.anInt1581;
					local80 = local64 + 1 << this.anInt1581;
					@Pc(260) Class5_Sub36_Sub1 local260 = this.aClass100_Sub3_8.aClass5_Sub36_Sub1_3;
					local260.anInt8456 = 0;
					for (@Pc(265) int local265 = local55; local265 < local62; local265++) {
						if (-arg4 <= local265 - arg2 && arg4 >= local265 - arg2) {
							@Pc(300) int local300 = local78 + this.aClass84_Sub1_1.anInt8883 * local265;
							for (@Pc(302) int local302 = local78; local302 < local80; local302++) {
								if (local302 - arg3 >= -arg4 && arg4 >= local302 - arg3 && arg1[local302 + arg4 - arg3][local265 + arg4 - arg2]) {
									@Pc(349) short[] local349 = this.aClass84_Sub1_1.aShortArrayArray8[local300];
									if (local349 != null) {
										@Pc(359) int local359;
										if (this.aClass100_Sub3_8.aBoolean735) {
											for (local359 = 0; local359 < local349.length; local359++) {
												local260.method7296(local349[local359] & 0xFFFF);
												local71++;
											}
										} else {
											for (local359 = 0; local359 < local349.length; local359++) {
												local260.method7279(local349[local359] & 0xFFFF);
												local71++;
											}
										}
									}
								}
								local300++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local44, local44, 1.0F);
						OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass191ArrayArray1[local64][local48].method4465(local71, local260.aByteArray89);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILclient!r;)V")
	public void method1486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1_Sub15 arg2) {
		@Pc(6) Class5_Sub1_Sub15_Sub1 local6 = (Class5_Sub1_Sub15_Sub1) arg2;
		arg0 += local6.anInt7193 + 1;
		arg1 += local6.anInt7199 + 1;
		@Pc(27) int local27 = arg1 + this.anInt1577 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7196;
		@Pc(35) int local35 = local6.anInt7194;
		@Pc(41) int local41 = this.anInt1577 - local35;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local27 += local48 * this.anInt1577;
			local32 -= local48;
			arg0 = 1;
			local29 = local48 * local35;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt1579 <= arg0 + local32) {
			local48 = arg0 + local32 + 1 - this.anInt1579;
			local32 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			arg1 = 1;
			local35 -= local48;
			local29 += local48;
			local27 += local48;
			local41 += local48;
			local69 = local48;
		}
		if (this.anInt1577 <= arg1 + local35) {
			local48 = local35 + arg1 + 1 - this.anInt1577;
			local69 += local48;
			local41 += local48;
			local35 -= local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static479.method6762(local6.aByteArray80, local29, local27, local41, local69, local32, this.aByteArray21, local35);
			this.method1483(arg0, arg1, local35, local32);
		}
	}
}
