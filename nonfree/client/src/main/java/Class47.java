import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class47 {

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "[[Lclient!tv;")
	private Class328[][] aClass328ArrayArray1;

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_6;

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "Lclient!mt;")
	private final Class51_Sub3 aClass51_Sub3_1;

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "I")
	public final int anInt1678;

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "I")
	private final int anInt1676;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "I")
	private final int anInt1674;

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "[B")
	public final byte[] aByteArray7;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
	private final int anInt1669;

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "I")
	private final int anInt1675;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!kw;Lclient!mt;)V")
	public Class47(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class51_Sub3 arg1) {
		this.aClass5_Sub2_6 = arg0;
		this.aClass51_Sub3_1 = arg1;
		this.anInt1678 = (this.aClass51_Sub3_1.anInt9121 * this.aClass51_Sub3_1.anInt9118 >> this.aClass5_Sub2_6.anInt5644) + 2;
		this.anInt1676 = (this.aClass51_Sub3_1.anInt9115 * this.aClass51_Sub3_1.anInt9118 >> this.aClass5_Sub2_6.anInt5644) + 2;
		this.anInt1674 = this.aClass5_Sub2_6.anInt5644 + 7 - this.aClass51_Sub3_1.anInt9117;
		this.aByteArray7 = new byte[this.anInt1678 * this.anInt1676];
		this.anInt1669 = this.aClass51_Sub3_1.anInt9121 >> this.anInt1674;
		this.anInt1675 = this.aClass51_Sub3_1.anInt9115 >> this.anInt1674;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
	public void method1669() {
		this.aClass328ArrayArray1 = new Class328[this.anInt1669][this.anInt1675];
		for (@Pc(22) int local22 = 0; local22 < this.anInt1675; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt1669; local26++) {
				this.aClass328ArrayArray1[local26][local22] = new Class328(this.aClass5_Sub2_6, this, this.aClass51_Sub3_1, local26, local22, this.anInt1674, local26 * 128 + 1, local22 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method1670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub5 arg2) {
		@Pc(6) Class3_Sub4_Sub5_Sub1 local6 = (Class3_Sub4_Sub5_Sub1) arg2;
		arg1 += local6.anInt2672 + 1;
		arg0 += local6.anInt2673 + 1;
		@Pc(27) int local27 = arg0 * this.anInt1678 + arg1;
		@Pc(38) int local38 = local6.anInt2668;
		@Pc(41) int local41 = local6.anInt2675;
		@Pc(47) int local47 = this.anInt1678 - local41;
		@Pc(56) int local56;
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local38 -= local56;
			arg0 = 1;
			local27 += local56 * this.anInt1678;
		}
		if (this.anInt1676 <= local38 + arg0) {
			local56 = arg0 + local38 + 1 - this.anInt1676;
			local38 -= local56;
		}
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			arg1 = 1;
			local41 -= local56;
			local27 += local56;
			local47 += local56;
		}
		if (this.anInt1678 <= local41 + arg1) {
			local56 = arg1 + local41 + 1 - this.anInt1678;
			local47 += local56;
			local41 -= local56;
		}
		if (local41 > 0 && local38 > 0) {
			local47 += this.anInt1678 * 7;
			return Static589.method8293(this.aByteArray7, local41, local47, local27, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIII)V")
	private void method1671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass328ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(42) int local42 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(55) int local55 = local15; local55 <= local25; local55++) {
			@Pc(62) Class328[] local62 = this.aClass328ArrayArray1[local55];
			for (@Pc(64) int local64 = local31; local64 <= local42; local64++) {
				local62[local64].aBoolean674 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!r;IBI)V")
	public void method1673(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub5_Sub1 local6 = (Class3_Sub4_Sub5_Sub1) arg0;
		arg2 += local6.anInt2672 + 1;
		arg1 += local6.anInt2673 + 1;
		@Pc(28) int local28 = arg2 + this.anInt1678 * arg1;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = local6.anInt2668;
		@Pc(47) int local47 = local6.anInt2675;
		@Pc(52) int local52 = this.anInt1678 - local47;
		@Pc(54) int local54 = 0;
		@Pc(60) int local60;
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			local41 = local60 * local47;
			local44 -= local60;
			arg1 = 1;
			local28 += local60 * this.anInt1678;
		}
		if (this.anInt1676 <= arg1 + local44) {
			local60 = local44 + arg1 + 1 - this.anInt1676;
			local44 -= local60;
		}
		if (arg2 <= 0) {
			local60 = 1 - arg2;
			local41 += local60;
			local28 += local60;
			local54 = local60;
			arg2 = 1;
			local47 -= local60;
			local52 += local60;
		}
		if (local47 + arg2 >= this.anInt1678) {
			local60 = local47 + arg2 + 1 - this.anInt1678;
			local54 += local60;
			local52 += local60;
			local47 -= local60;
		}
		if (local47 > 0 && local44 > 0) {
			Static335.method5466(local6.aByteArray24, local44, local52, local54, local41, local47, this.aByteArray7, local28);
			this.method1671(local44, local47, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ[[ZIII)V")
	public void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aClass5_Sub2_6.method4975(false);
		this.aClass5_Sub2_6.method4993(false);
		this.aClass5_Sub2_6.method5009(-2);
		this.aClass5_Sub2_6.method4953(1);
		this.aClass5_Sub2_6.method4971(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass5_Sub2_6.anInt5645 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(74) int local74;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (arg1) {
			for (local51 = 0; local51 < this.anInt1675; local51++) {
				local58 = local51 << this.anInt1674;
				local65 = local51 + 1 << this.anInt1674;
				label128: for (local67 = 0; local67 < this.anInt1669; local67++) {
					local74 = local67 << this.anInt1674;
					local81 = local67 + 1 << this.anInt1674;
					for (local83 = local74; local83 < local81; local83++) {
						if (-arg3 <= local83 - arg0 && arg3 >= local83 - arg0) {
							for (@Pc(104) int local104 = local58; local104 < local65; local104++) {
								if (-arg3 <= local104 - arg4 && local104 - arg4 <= arg3 && arg2[local83 + arg3 - arg0][arg3 + local104 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local39, (float) -local51 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass328ArrayArray1[local67][local51].method8091();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt1675; local51++) {
				local58 = local51 << this.anInt1674;
				local65 = local51 + 1 << this.anInt1674;
				for (local67 = 0; local67 < this.anInt1669; local67++) {
					local74 = 0;
					local81 = local67 << this.anInt1674;
					local83 = local67 + 1 << this.anInt1674;
					@Pc(236) Class3_Sub3_Sub1 local236 = this.aClass5_Sub2_6.aClass3_Sub3_Sub1_3;
					local236.anInt4736 = 0;
					for (@Pc(241) int local241 = local58; local241 < local65; local241++) {
						if (-arg3 <= local241 - arg4 && arg3 >= local241 - arg4) {
							@Pc(269) int local269 = this.aClass51_Sub3_1.anInt9121 * local241 + local81;
							for (@Pc(271) int local271 = local81; local271 < local83; local271++) {
								if (local271 - arg0 >= -arg3 && arg3 >= local271 - arg0 && arg2[local271 + arg3 - arg0][local241 + arg3 - arg4]) {
									@Pc(317) short[] local317 = this.aClass51_Sub3_1.aShortArrayArray12[local269];
									if (local317 != null) {
										@Pc(325) int local325;
										if (this.aClass5_Sub2_6.aBoolean387) {
											for (local325 = 0; local325 < local317.length; local325++) {
												local74++;
												local236.method4201(local317[local325] & 0xFFFF);
											}
										} else {
											for (local325 = 0; local325 < local317.length; local325++) {
												local236.method4257(local317[local325] & 0xFFFF);
												local74++;
											}
										}
									}
								}
								local269++;
							}
						}
					}
					if (local74 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local67 / local39, (float) -local51 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass328ArrayArray1[local67][local51].method8087(local74, local236.aByteArray54);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!r;II)V")
	public void method1676(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub5 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub5_Sub1 local6 = (Class3_Sub4_Sub5_Sub1) arg1;
		arg2 += local6.anInt2673 + 1;
		arg0 += local6.anInt2672 + 1;
		@Pc(27) int local27 = arg0 + this.anInt1678 * arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2668;
		@Pc(35) int local35 = local6.anInt2675;
		@Pc(40) int local40 = this.anInt1678 - local35;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local29 = local35 * local49;
			local32 -= local49;
			arg2 = 1;
			local27 += local49 * this.anInt1678;
		}
		if (local32 + arg2 >= this.anInt1676) {
			local49 = arg2 + local32 + 1 - this.anInt1676;
			local32 -= local49;
		}
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local27 += local49;
			local40 += local49;
			arg0 = 1;
			local42 = local49;
			local35 -= local49;
			local29 += local49;
		}
		if (this.anInt1678 <= local35 + arg0) {
			local49 = arg0 + local35 + 1 - this.anInt1678;
			local35 -= local49;
			local42 += local49;
			local40 += local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static120.method2419(this.aByteArray7, local27, local40, local6.aByteArray24, local32, local35, local42, local29);
			this.method1671(local32, local35, arg2, arg0);
		}
	}
}
