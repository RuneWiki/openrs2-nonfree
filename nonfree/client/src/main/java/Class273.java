import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class273 {

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "[[Lclient!qs;")
	private Class251[][] aClass251ArrayArray1;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_36;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "Lclient!nk;")
	private final Class205_Sub1 aClass205_Sub1_3;

	@OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
	public final int anInt7711;

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
	private final int anInt7714;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "[B")
	public final byte[] aByteArray108;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
	private final int anInt7705;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
	private final int anInt7710;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	private final int anInt7713;

	static {
		new Class306("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!uq;Lclient!nk;)V")
	public Class273(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class205_Sub1 arg1) {
		this.aClass122_Sub3_36 = arg0;
		this.aClass205_Sub1_3 = arg1;
		this.anInt7711 = (this.aClass205_Sub1_3.anInt8175 * this.aClass205_Sub1_3.anInt8174 >> this.aClass122_Sub3_36.anInt8421) + 2;
		this.anInt7714 = (this.aClass205_Sub1_3.anInt8175 * this.aClass205_Sub1_3.anInt8177 >> this.aClass122_Sub3_36.anInt8421) + 2;
		this.aByteArray108 = new byte[this.anInt7714 * this.anInt7711];
		this.anInt7705 = this.aClass122_Sub3_36.anInt8421 + 7 - this.aClass205_Sub1_3.anInt8176;
		this.anInt7710 = this.aClass205_Sub1_3.anInt8174 >> this.anInt7705;
		this.anInt7713 = this.aClass205_Sub1_3.anInt8177 >> this.anInt7705;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ[[ZIII)V")
	public void method6408(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass122_Sub3_36.method6896(false);
		this.aClass122_Sub3_36.method6915(false);
		this.aClass122_Sub3_36.method6926(-2);
		this.aClass122_Sub3_36.method6875(1);
		this.aClass122_Sub3_36.method6871(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass122_Sub3_36.anInt8420 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(78) int local78;
		@Pc(85) int local85;
		if (arg1) {
			for (local53 = 0; local53 < this.anInt7713; local53++) {
				local60 = local53 << this.anInt7705;
				local67 = local53 + 1 << this.anInt7705;
				label81: for (local69 = 0; local69 < this.anInt7710; local69++) {
					local73 = local69 << this.anInt7705;
					local78 = local69 + 1 << this.anInt7705;
					for (local85 = local73; local85 < local78; local85++) {
						if (-arg0 <= local85 - arg3 && local85 - arg3 <= arg0) {
							for (@Pc(325) int local325 = local60; local325 < local67; local325++) {
								if (-arg0 <= local325 - arg4 && local325 - arg4 <= arg0 && arg2[arg0 + local85 - arg3][arg0 + local325 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local69 / local43, (float) -local53 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass251ArrayArray1[local69][local53].method6039();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt7713; local53++) {
				local60 = local53 << this.anInt7705;
				local67 = local53 + 1 << this.anInt7705;
				for (local69 = 0; local69 < this.anInt7710; local69++) {
					local73 = 0;
					local78 = local69 << this.anInt7705;
					local85 = local69 + 1 << this.anInt7705;
					@Pc(89) Class1_Sub6_Sub1 local89 = this.aClass122_Sub3_36.aClass1_Sub6_Sub1_3;
					local89.anInt4555 = 0;
					for (@Pc(94) int local94 = local60; local94 < local67; local94++) {
						if (local94 - arg4 >= -arg0 && local94 - arg4 <= arg0) {
							@Pc(117) int local117 = local78 + this.aClass205_Sub1_3.anInt8174 * local94;
							for (@Pc(119) int local119 = local78; local119 < local85; local119++) {
								if (-arg0 <= local119 - arg3 && local119 - arg3 <= arg0 && arg2[local119 + arg0 - arg3][local94 + arg0 - arg4]) {
									@Pc(160) short[] local160 = this.aClass205_Sub1_3.aShortArrayArray5[local117];
									if (local160 != null) {
										@Pc(168) int local168;
										if (this.aClass122_Sub3_36.aBoolean594) {
											for (local168 = 0; local168 < local160.length; local168++) {
												local73++;
												local89.method3919(local160[local168] & 0xFFFF);
											}
										} else {
											for (local168 = 0; local168 < local160.length; local168++) {
												local73++;
												local89.method3971(local160[local168] & 0xFFFF);
											}
										}
									}
								}
								local117++;
							}
						}
					}
					if (local73 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local69 / local43, (float) -local53 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass251ArrayArray1[local69][local53].method6037(local89.aByteArray66, local73);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)V")
	public void method6413() {
		this.aClass251ArrayArray1 = new Class251[this.anInt7710][this.anInt7713];
		for (@Pc(19) int local19 = 0; local19 < this.anInt7713; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt7710; local23++) {
				this.aClass251ArrayArray1[local23][local19] = new Class251(this.aClass122_Sub3_36, this, this.aClass205_Sub1_3, local23, local19, this.anInt7705, local23 * 128 + 1, local19 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIZLclient!k;)Z")
	public boolean method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub9 arg2) {
		@Pc(6) Class1_Sub1_Sub9_Sub1 local6 = (Class1_Sub1_Sub9_Sub1) arg2;
		arg0 += local6.anInt5506 + 1;
		arg1 += local6.anInt5504 + 1;
		@Pc(27) int local27 = this.anInt7711 * arg0 + arg1;
		@Pc(35) int local35 = local6.anInt5505;
		@Pc(38) int local38 = local6.anInt5508;
		@Pc(44) int local44 = this.anInt7711 - local38;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local35 -= local51;
			arg0 = 1;
			local27 += this.anInt7711 * local51;
		}
		if (arg0 + local35 >= this.anInt7714) {
			local51 = local35 + arg0 + 1 - this.anInt7714;
			local35 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local27 += local51;
			arg1 = 1;
			local44 += local51;
			local38 -= local51;
		}
		if (arg1 + local38 >= this.anInt7711) {
			local51 = local38 + arg1 + 1 - this.anInt7711;
			local44 += local51;
			local38 -= local51;
		}
		if (local38 > 0 && local35 > 0) {
			local44 += this.anInt7711 * 7;
			return Static396.method5969(this.aByteArray108, local35, local44, local27, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BIIII)V")
	private void method6415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass251ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg3 - 1 >> 7;
		@Pc(48) int local48 = arg0 + arg3 - 2 >> 7;
		for (@Pc(50) int local50 = local15; local50 <= local25; local50++) {
			@Pc(57) Class251[] local57 = this.aClass251ArrayArray1[local50];
			for (@Pc(59) int local59 = local31; local59 <= local48; local59++) {
				local57[local59].aBoolean518 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!k;II)V")
	public void method6416(@OriginalArg(1) Class1_Sub1_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub1_Sub9_Sub1 local6 = (Class1_Sub1_Sub9_Sub1) arg0;
		arg1 += local6.anInt5504 + 1;
		arg2 += local6.anInt5506 + 1;
		@Pc(27) int local27 = arg1 + arg2 * this.anInt7711;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5505;
		@Pc(35) int local35 = local6.anInt5508;
		@Pc(40) int local40 = this.anInt7711 - local35;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local27 += local49 * this.anInt7711;
			local29 = local49 * local35;
			local32 -= local49;
			arg2 = 1;
		}
		if (local32 + arg2 >= this.anInt7714) {
			local49 = local32 + arg2 + 1 - this.anInt7714;
			local32 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local29 += local49;
			arg1 = 1;
			local27 += local49;
			local40 += local49;
			local42 = local49;
			local35 -= local49;
		}
		if (this.anInt7711 <= arg1 + local35) {
			local49 = arg1 + local35 + 1 - this.anInt7711;
			local42 += local49;
			local40 += local49;
			local35 -= local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static468.method6555(local40, local6.aByteArray86, local42, this.aByteArray108, local32, local27, local29, local35);
			this.method6415(local32, local35, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!k;B)V")
	public void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub9 arg2) {
		@Pc(6) Class1_Sub1_Sub9_Sub1 local6 = (Class1_Sub1_Sub9_Sub1) arg2;
		arg0 += local6.anInt5504 + 1;
		arg1 += local6.anInt5506 + 1;
		@Pc(27) int local27 = arg1 * this.anInt7711 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt5505;
		@Pc(35) int local35 = local6.anInt5508;
		@Pc(44) int local44 = this.anInt7711 - local35;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			arg1 = 1;
			local29 = local35 * local51;
			local27 += local51 * this.anInt7711;
			local32 -= local51;
		}
		@Pc(72) int local72 = 0;
		if (arg1 + local32 >= this.anInt7714) {
			local51 = local32 + arg1 + 1 - this.anInt7714;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local72 = local51;
			local35 -= local51;
			arg0 = 1;
			local27 += local51;
			local44 += local51;
			local29 += local51;
		}
		if (this.anInt7711 <= local35 + arg0) {
			local51 = local35 + arg0 + 1 - this.anInt7711;
			local44 += local51;
			local35 -= local51;
			local72 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static130.method2169(this.aByteArray108, local32, local72, local27, local29, local6.aByteArray86, local44, local35);
			this.method6415(local32, local35, arg0, arg1);
		}
	}
}
