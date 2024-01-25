import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class268 {

	@OriginalMember(owner = "client!pga", name = "e", descriptor = "[[Lclient!tm;")
	private Class328[][] aClass328ArrayArray1;

	@OriginalMember(owner = "client!pga", name = "j", descriptor = "Lclient!vfa;")
	private final Class151_Sub2 aClass151_Sub2_3;

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_32;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
	public final int anInt6684;

	@OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
	private final int anInt6691;

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "[B")
	public final byte[] aByteArray64;

	@OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
	private final int anInt6690;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
	private final int anInt6688;

	@OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
	private final int anInt6692;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!uca;Lclient!vfa;)V")
	public Class268(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) Class151_Sub2 arg1) {
		this.aClass151_Sub2_3 = arg1;
		this.aClass162_Sub3_32 = arg0;
		this.anInt6684 = (this.aClass151_Sub2_3.anInt9572 * this.aClass151_Sub2_3.anInt9573 >> this.aClass162_Sub3_32.anInt8685) + 2;
		this.anInt6691 = (this.aClass151_Sub2_3.anInt9574 * this.aClass151_Sub2_3.anInt9573 >> this.aClass162_Sub3_32.anInt8685) + 2;
		this.aByteArray64 = new byte[this.anInt6684 * this.anInt6691];
		this.anInt6690 = this.aClass162_Sub3_32.anInt8685 + 7 - this.aClass151_Sub2_3.anInt9568;
		this.anInt6688 = this.aClass151_Sub2_3.anInt9572 >> this.anInt6690;
		this.anInt6692 = this.aClass151_Sub2_3.anInt9574 >> this.anInt6690;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
	public void method5542() {
		this.aClass328ArrayArray1 = new Class328[this.anInt6688][this.anInt6692];
		for (@Pc(20) int local20 = 0; local20 < this.anInt6692; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt6688; local24++) {
				this.aClass328ArrayArray1[local24][local20] = new Class328(this.aClass162_Sub3_32, this, this.aClass151_Sub2_3, local24, local20, this.anInt6690, local24 * 128 + 1, local20 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZBII[[Z)V")
	public void method5543(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass162_Sub3_32.method6907(false);
		this.aClass162_Sub3_32.method6896(false);
		this.aClass162_Sub3_32.method6963(-2);
		this.aClass162_Sub3_32.method6953(1);
		this.aClass162_Sub3_32.method6923(1);
		@Pc(50) float local50 = 1.0F / (float) (this.aClass162_Sub3_32.anInt8687 * 128);
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(86) int local86;
		if (arg1) {
			for (local54 = 0; local54 < this.anInt6692; local54++) {
				local61 = local54 << this.anInt6690;
				local68 = local54 + 1 << this.anInt6690;
				label128: for (local70 = 0; local70 < this.anInt6688; local70++) {
					local77 = local70 << this.anInt6690;
					local84 = local70 + 1 << this.anInt6690;
					for (local86 = local77; local86 < local84; local86++) {
						if (local86 - arg3 >= -arg0 && arg0 >= local86 - arg3) {
							for (@Pc(111) int local111 = local61; local111 < local68; local111++) {
								if (-arg0 <= local111 - arg2 && arg0 >= local111 - arg2 && arg4[arg0 + local86 - arg3][arg0 + local111 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local50, local50, 1.0F);
									OpenGL.glTranslatef((float) -local70 / local50, (float) -local54 / local50, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass328ArrayArray1[local70][local54].method6675();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local54 = 0; local54 < this.anInt6692; local54++) {
				local61 = local54 << this.anInt6690;
				local68 = local54 + 1 << this.anInt6690;
				for (local70 = 0; local70 < this.anInt6688; local70++) {
					local77 = 0;
					local84 = local70 << this.anInt6690;
					local86 = local70 + 1 << this.anInt6690;
					@Pc(241) Class2_Sub7_Sub1 local241 = this.aClass162_Sub3_32.aClass2_Sub7_Sub1_3;
					local241.anInt5186 = 0;
					for (@Pc(246) int local246 = local61; local246 < local68; local246++) {
						if (local246 - arg2 >= -arg0 && arg0 >= local246 - arg2) {
							@Pc(273) int local273 = this.aClass151_Sub2_3.anInt9572 * local246 + local84;
							for (@Pc(275) int local275 = local84; local275 < local86; local275++) {
								if (local275 - arg3 >= -arg0 && local275 - arg3 <= arg0 && arg4[arg0 + local275 - arg3][arg0 + local246 - arg2]) {
									@Pc(319) short[] local319 = this.aClass151_Sub2_3.aShortArrayArray14[local273];
									if (local319 != null) {
										@Pc(327) int local327;
										if (this.aClass162_Sub3_32.aBoolean720) {
											for (local327 = 0; local327 < local319.length; local327++) {
												local77++;
												local241.method4511(local319[local327] & 0xFFFF);
											}
										} else {
											for (local327 = 0; local327 < local319.length; local327++) {
												local77++;
												local241.method4469(local319[local327] & 0xFFFF);
											}
										}
									}
								}
								local273++;
							}
						}
					}
					if (local77 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local50, local50, 1.0F);
						OpenGL.glTranslatef((float) -local70 / local50, (float) -local54 / local50, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass328ArrayArray1[local70][local54].method6672(local77, local241.aByteArray52);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!ha;II)V")
	public void method5544(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub8 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub2_Sub8_Sub2 local6 = (Class2_Sub2_Sub8_Sub2) arg1;
		arg0 += local6.anInt8966 + 1;
		arg2 += local6.anInt8965 + 1;
		@Pc(27) int local27 = this.anInt6684 * arg2 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8968;
		@Pc(35) int local35 = local6.anInt8964;
		@Pc(41) int local41 = this.anInt6684 - local35;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			arg2 = 1;
			local27 += this.anInt6684 * local48;
			local29 = local35 * local48;
			local32 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (local32 + arg2 >= this.anInt6691) {
			local48 = local32 + arg2 + 1 - this.anInt6691;
			local32 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local69 = local48;
			local29 += local48;
			arg0 = 1;
			local27 += local48;
			local35 -= local48;
			local41 += local48;
		}
		if (arg0 + local35 >= this.anInt6684) {
			local48 = arg0 + local35 + 1 - this.anInt6684;
			local69 += local48;
			local35 -= local48;
			local41 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static537.method7040(local27, this.aByteArray64, local41, local69, local6.aByteArray96, local29, local32, local35);
			this.method5547(local32, arg0, arg2, local35);
		}
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(ILclient!ha;II)Z")
	public boolean method5546(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub8 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub2_Sub8_Sub2 local6 = (Class2_Sub2_Sub8_Sub2) arg1;
		arg2 += local6.anInt8965 + 1;
		arg0 += local6.anInt8966 + 1;
		@Pc(35) int local35 = arg2 * this.anInt6684 + arg0;
		@Pc(38) int local38 = local6.anInt8968;
		@Pc(41) int local41 = local6.anInt8964;
		@Pc(47) int local47 = this.anInt6684 - local41;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			arg2 = 1;
			local35 += this.anInt6684 * local57;
			local38 -= local57;
		}
		if (arg2 + local38 >= this.anInt6691) {
			local57 = arg2 + local38 + 1 - this.anInt6691;
			local38 -= local57;
		}
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			local35 += local57;
			local47 += local57;
			arg0 = 1;
			local41 -= local57;
		}
		if (this.anInt6684 <= arg0 + local41) {
			local57 = local41 + arg0 + 1 - this.anInt6684;
			local47 += local57;
			local41 -= local57;
		}
		if (local41 > 0 && local38 > 0) {
			local47 += this.anInt6684 * 7;
			return Static426.method5671(local41, this.aByteArray64, local47, local35, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIII)V")
	private void method5547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass328ArrayArray1 == null) {
			return;
		}
		@Pc(21) int local21 = arg1 - 1 >> 7;
		@Pc(31) int local31 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg2 - 1 >> 7;
		@Pc(47) int local47 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local21; local49 <= local31; local49++) {
			@Pc(56) Class328[] local56 = this.aClass328ArrayArray1[local49];
			for (@Pc(58) int local58 = local37; local58 <= local47; local58++) {
				local56[local58].aBoolean698 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IILclient!ha;B)V")
	public void method5549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub8 arg2) {
		@Pc(6) Class2_Sub2_Sub8_Sub2 local6 = (Class2_Sub2_Sub8_Sub2) arg2;
		arg0 += local6.anInt8966 + 1;
		arg1 += local6.anInt8965 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt6684;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt8968;
		@Pc(36) int local36 = local6.anInt8964;
		@Pc(42) int local42 = this.anInt6684 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local28 += local54 * this.anInt6684;
			arg1 = 1;
			local30 = local54 * local36;
			local33 -= local54;
		}
		if (arg1 + local33 >= this.anInt6691) {
			local54 = arg1 + local33 + 1 - this.anInt6691;
			local33 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			arg0 = 1;
			local44 = local54;
			local28 += local54;
			local42 += local54;
			local36 -= local54;
			local30 += local54;
		}
		if (arg0 + local36 >= this.anInt6684) {
			local54 = local36 + arg0 + 1 - this.anInt6684;
			local36 -= local54;
			local44 += local54;
			local42 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static384.method5330(local44, local6.aByteArray96, this.aByteArray64, local42, local36, local30, local28, local33);
			this.method5547(local33, arg0, arg1, local36);
		}
	}
}
