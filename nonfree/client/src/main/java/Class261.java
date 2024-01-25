import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class261 {

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[[Lclient!uu;")
	private Class340[][] aClass340ArrayArray1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!oj;")
	private final Class139_Sub2 aClass139_Sub2_2;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_31;

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
	public final int anInt6903;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	private final int anInt6906;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	private final int anInt6908;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[B")
	public final byte[] aByteArray86;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	private final int anInt6911;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	private final int anInt6910;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!us;Lclient!oj;)V")
	public Class261(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class139_Sub2 arg1) {
		this.aClass139_Sub2_2 = arg1;
		this.aClass43_Sub3_31 = arg0;
		this.anInt6903 = (this.aClass139_Sub2_2.anInt8178 * this.aClass139_Sub2_2.anInt8179 >> this.aClass43_Sub3_31.anInt8734) + 2;
		this.anInt6906 = (this.aClass139_Sub2_2.anInt8180 * this.aClass139_Sub2_2.anInt8178 >> this.aClass43_Sub3_31.anInt8734) + 2;
		this.anInt6908 = this.aClass43_Sub3_31.anInt8734 + 7 - this.aClass139_Sub2_2.anInt8176;
		this.aByteArray86 = new byte[this.anInt6906 * this.anInt6903];
		this.anInt6911 = this.aClass139_Sub2_2.anInt8179 >> this.anInt6908;
		this.anInt6910 = this.aClass139_Sub2_2.anInt8180 >> this.anInt6908;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!ha;II)V")
	public void method5893(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub3_Sub10_Sub1 local6 = (Class3_Sub3_Sub10_Sub1) arg1;
		arg2 += local6.anInt3009 + 1;
		arg0 += local6.anInt3006 + 1;
		@Pc(27) int local27 = this.anInt6903 * arg2 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3011;
		@Pc(35) int local35 = local6.anInt3015;
		@Pc(41) int local41 = this.anInt6903 - local35;
		@Pc(51) int local51;
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local32 -= local51;
			arg2 = 1;
			local29 = local35 * local51;
			local27 += local51 * this.anInt6903;
		}
		@Pc(72) int local72 = 0;
		if (local32 + arg2 >= this.anInt6906) {
			local51 = arg2 + local32 + 1 - this.anInt6906;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local41 += local51;
			local72 = local51;
			local29 += local51;
			local27 += local51;
			arg0 = 1;
			local35 -= local51;
		}
		if (arg0 + local35 >= this.anInt6903) {
			local51 = arg0 + local35 + 1 - this.anInt6903;
			local41 += local51;
			local35 -= local51;
			local72 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static269.method4381(local72, local35, local6.aByteArray33, local29, local32, local41, this.aByteArray86, local27);
			this.method5900(arg0, local32, arg2, local35);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!ha;B)Z")
	public boolean method5895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub10 arg2) {
		@Pc(6) Class3_Sub3_Sub10_Sub1 local6 = (Class3_Sub3_Sub10_Sub1) arg2;
		arg0 += local6.anInt3006 + 1;
		arg1 += local6.anInt3009 + 1;
		@Pc(27) int local27 = arg0 + this.anInt6903 * arg1;
		@Pc(30) int local30 = local6.anInt3011;
		@Pc(41) int local41 = local6.anInt3015;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local30 -= local51;
			arg1 = 1;
			local27 += this.anInt6903 * local51;
		}
		@Pc(70) int local70 = this.anInt6903 - local41;
		if (local30 + arg1 >= this.anInt6906) {
			local51 = arg1 + local30 + 1 - this.anInt6906;
			local30 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local27 += local51;
			local70 += local51;
			arg0 = 1;
			local41 -= local51;
		}
		if (arg0 + local41 >= this.anInt6903) {
			local51 = local41 + arg0 + 1 - this.anInt6903;
			local70 += local51;
			local41 -= local51;
		}
		if (local41 > 0 && local30 > 0) {
			local70 += this.anInt6903 * 7;
			return Static26.method7425(local41, local70, this.aByteArray86, local30, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZBIII[[Z)V")
	public void method5897(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass43_Sub3_31.method7298(false);
		this.aClass43_Sub3_31.method7239(false);
		this.aClass43_Sub3_31.method7294(-2);
		this.aClass43_Sub3_31.method7281(1);
		this.aClass43_Sub3_31.method7222(1);
		@Pc(48) float local48 = 1.0F / (float) (this.aClass43_Sub3_31.anInt8733 * 128);
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(68) int local68;
		@Pc(75) int local75;
		@Pc(82) int local82;
		@Pc(84) int local84;
		if (arg0) {
			for (local52 = 0; local52 < this.anInt6910; local52++) {
				local59 = local52 << this.anInt6908;
				local66 = local52 + 1 << this.anInt6908;
				label128: for (local68 = 0; local68 < this.anInt6911; local68++) {
					local75 = local68 << this.anInt6908;
					local82 = local68 + 1 << this.anInt6908;
					for (local84 = local75; local84 < local82; local84++) {
						if (local84 - arg1 >= -arg2 && arg2 >= local84 - arg1) {
							for (@Pc(104) int local104 = local59; local104 < local66; local104++) {
								if (-arg2 <= local104 - arg3 && arg2 >= local104 - arg3 && arg4[arg2 + local84 - arg1][local104 + arg2 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local48, local48, 1.0F);
									OpenGL.glTranslatef((float) -local68 / local48, (float) -local52 / local48, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass340ArrayArray1[local68][local52].method7327();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local52 = 0; local52 < this.anInt6910; local52++) {
				local59 = local52 << this.anInt6908;
				local66 = local52 + 1 << this.anInt6908;
				for (local68 = 0; local68 < this.anInt6911; local68++) {
					local75 = 0;
					local82 = local68 << this.anInt6908;
					local84 = local68 + 1 << this.anInt6908;
					@Pc(236) Class3_Sub11_Sub2 local236 = this.aClass43_Sub3_31.aClass3_Sub11_Sub2_3;
					local236.anInt3520 = 0;
					for (@Pc(241) int local241 = local59; local241 < local66; local241++) {
						if (local241 - arg3 >= -arg2 && arg2 >= local241 - arg3) {
							@Pc(271) int local271 = this.aClass139_Sub2_2.anInt8179 * local241 + local82;
							for (@Pc(273) int local273 = local82; local273 < local84; local273++) {
								if (local273 - arg1 >= -arg2 && arg2 >= local273 - arg1 && arg4[local273 + arg2 - arg1][local241 + arg2 - arg3]) {
									@Pc(311) short[] local311 = this.aClass139_Sub2_2.aShortArrayArray66[local271];
									if (local311 != null) {
										@Pc(319) int local319;
										if (this.aClass43_Sub3_31.aBoolean671) {
											for (local319 = 0; local319 < local311.length; local319++) {
												local75++;
												local236.method3131(local311[local319] & 0xFFFF);
											}
										} else {
											for (local319 = 0; local319 < local311.length; local319++) {
												local75++;
												local236.method3075(local311[local319] & 0xFFFF);
											}
										}
									}
								}
								local271++;
							}
						}
					}
					if (local75 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local48, local48, 1.0F);
						OpenGL.glTranslatef((float) -local68 / local48, (float) -local52 / local48, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass340ArrayArray1[local68][local52].method7331(local236.aByteArray36, local75);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIILclient!ha;)V")
	public void method5898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub3_Sub10 arg2) {
		@Pc(6) Class3_Sub3_Sub10_Sub1 local6 = (Class3_Sub3_Sub10_Sub1) arg2;
		arg0 += local6.anInt3006 + 1;
		arg1 += local6.anInt3009 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt6903;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = local6.anInt3011;
		@Pc(42) int local42 = local6.anInt3015;
		@Pc(48) int local48 = this.anInt6903 - local42;
		@Pc(58) int local58;
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local39 -= local58;
			arg1 = 1;
			local28 += this.anInt6903 * local58;
			local36 = local58 * local42;
		}
		@Pc(79) int local79 = 0;
		if (arg1 + local39 >= this.anInt6906) {
			local58 = arg1 + local39 + 1 - this.anInt6906;
			local39 -= local58;
		}
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local79 = local58;
			arg0 = 1;
			local42 -= local58;
			local28 += local58;
			local48 += local58;
			local36 += local58;
		}
		if (this.anInt6903 <= local42 + arg0) {
			local58 = arg0 + local42 + 1 - this.anInt6903;
			local42 -= local58;
			local48 += local58;
			local79 += local58;
		}
		if (local42 > 0 && local39 > 0) {
			Static257.method4309(local48, local28, local6.aByteArray33, local36, local79, local42, local39, this.aByteArray86);
			this.method5900(arg0, local39, arg1, local42);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public void method5899() {
		this.aClass340ArrayArray1 = new Class340[this.anInt6911][this.anInt6910];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6910; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6911; local18++) {
				this.aClass340ArrayArray1[local18][local14] = new Class340(this.aClass43_Sub3_31, this, this.aClass139_Sub2_2, local18, local14, this.anInt6908, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIIII)V")
	private void method5900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass340ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(39) int local39 = arg2 + arg1 - 2 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local25; local49++) {
			@Pc(56) Class340[] local56 = this.aClass340ArrayArray1[local49];
			for (@Pc(58) int local58 = local31; local58 <= local39; local58++) {
				local56[local58].aBoolean694 = true;
			}
		}
	}
}
