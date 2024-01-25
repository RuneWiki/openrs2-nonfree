import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class249 {

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "[[Lclient!pi;")
	private Class229[][] aClass229ArrayArray1;

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "Lclient!pf;")
	private final Class52_Sub3 aClass52_Sub3_2;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_32;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	public final int anInt7430;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	private final int anInt7429;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "[B")
	public final byte[] aByteArray87;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
	private final int anInt7436;

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
	private final int anInt7442;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
	private final int anInt7437;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!ad;Lclient!pf;)V")
	public Class249(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class52_Sub3 arg1) {
		this.aClass52_Sub3_2 = arg1;
		this.aClass5_Sub1_32 = arg0;
		this.anInt7430 = (this.aClass52_Sub3_2.anInt9491 * this.aClass52_Sub3_2.anInt9493 >> this.aClass5_Sub1_32.anInt375) + 2;
		this.anInt7429 = (this.aClass52_Sub3_2.anInt9493 * this.aClass52_Sub3_2.anInt9492 >> this.aClass5_Sub1_32.anInt375) + 2;
		this.aByteArray87 = new byte[this.anInt7429 * this.anInt7430];
		this.anInt7436 = this.aClass5_Sub1_32.anInt375 + 7 - this.aClass52_Sub3_2.anInt9494;
		this.anInt7442 = this.aClass52_Sub3_2.anInt9491 >> this.anInt7436;
		this.anInt7437 = this.aClass52_Sub3_2.anInt9492 >> this.anInt7436;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
	private void method6127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass229ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(42) int local42 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local25; local44++) {
			@Pc(60) Class229[] local60 = this.aClass229ArrayArray1[local44];
			for (@Pc(62) int local62 = local31; local62 <= local42; local62++) {
				local60[local62].aBoolean444 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!w;III)Z")
	public boolean method6130(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub10_Sub18_Sub2 local6 = (Class3_Sub10_Sub18_Sub2) arg0;
		arg1 += local6.anInt9252 + 1;
		arg2 += local6.anInt9249 + 1;
		@Pc(27) int local27 = arg1 + arg2 * this.anInt7430;
		@Pc(30) int local30 = local6.anInt9246;
		@Pc(33) int local33 = local6.anInt9247;
		@Pc(38) int local38 = this.anInt7430 - local33;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local27 += local48 * this.anInt7430;
			local30 -= local48;
			arg2 = 1;
		}
		if (local30 + arg2 >= this.anInt7429) {
			local48 = local30 + arg2 + 1 - this.anInt7429;
			local30 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local38 += local48;
			local27 += local48;
			arg1 = 1;
			local33 -= local48;
		}
		if (this.anInt7430 <= arg1 + local33) {
			local48 = arg1 + local33 + 1 - this.anInt7430;
			local33 -= local48;
			local38 += local48;
		}
		if (local33 > 0 && local30 > 0) {
			local38 += this.anInt7430 * 7;
			return Static528.method7622(local33, this.aByteArray87, local30, local38, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII[[ZZ)V")
	public void method6131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) boolean arg4) {
		this.aClass5_Sub1_32.method454(false);
		this.aClass5_Sub1_32.method413(false);
		this.aClass5_Sub1_32.method414(-2);
		this.aClass5_Sub1_32.method416(1);
		this.aClass5_Sub1_32.method455(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass5_Sub1_32.anInt376 * 128);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		if (arg4) {
			for (local49 = 0; local49 < this.anInt7437; local49++) {
				local56 = local49 << this.anInt7436;
				local63 = local49 + 1 << this.anInt7436;
				label128: for (local65 = 0; local65 < this.anInt7442; local65++) {
					local72 = local65 << this.anInt7436;
					local79 = local65 + 1 << this.anInt7436;
					for (local81 = local72; local81 < local79; local81++) {
						if (-arg1 <= local81 - arg2 && local81 - arg2 <= arg1) {
							for (@Pc(98) int local98 = local56; local98 < local63; local98++) {
								if (local98 - arg0 >= -arg1 && arg1 >= local98 - arg0 && arg3[arg1 + local81 - arg2][local98 + arg1 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local65 / local39, (float) -local49 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass229ArrayArray1[local65][local49].method5862();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt7437; local49++) {
				local56 = local49 << this.anInt7436;
				local63 = local49 + 1 << this.anInt7436;
				for (local65 = 0; local65 < this.anInt7442; local65++) {
					local72 = 0;
					local79 = local65 << this.anInt7436;
					local81 = local65 + 1 << this.anInt7436;
					@Pc(230) Class3_Sub27_Sub2 local230 = this.aClass5_Sub1_32.aClass3_Sub27_Sub2_1;
					local230.anInt9191 = 0;
					for (@Pc(235) int local235 = local56; local235 < local63; local235++) {
						if (-arg1 <= local235 - arg0 && arg1 >= local235 - arg0) {
							@Pc(266) int local266 = this.aClass52_Sub3_2.anInt9491 * local235 + local79;
							for (@Pc(268) int local268 = local79; local268 < local81; local268++) {
								if (local268 - arg2 >= -arg1 && arg1 >= local268 - arg2 && arg3[arg1 + local268 - arg2][local235 + arg1 - arg0]) {
									@Pc(307) short[] local307 = this.aClass52_Sub3_2.aShortArrayArray6[local266];
									if (local307 != null) {
										@Pc(315) int local315;
										if (this.aClass5_Sub1_32.aBoolean39) {
											for (local315 = 0; local315 < local307.length; local315++) {
												local230.method7600(local307[local315] & 0xFFFF, 30364);
												local72++;
											}
										} else {
											for (local315 = 0; local315 < local307.length; local315++) {
												local230.method7556(local307[local315] & 0xFFFF);
												local72++;
											}
										}
									}
								}
								local266++;
							}
						}
					}
					if (local72 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local65 / local39, (float) -local49 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass229ArrayArray1[local65][local49].method5857(local230.aByteArray114, local72);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	public void method6132() {
		this.aClass229ArrayArray1 = new Class229[this.anInt7442][this.anInt7437];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7437; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt7442; local18++) {
				this.aClass229ArrayArray1[local18][local14] = new Class229(this.aClass5_Sub1_32, this, this.aClass52_Sub3_2, local18, local14, this.anInt7436, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!w;II)V")
	public void method6135(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub10_Sub18 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub10_Sub18_Sub2 local6 = (Class3_Sub10_Sub18_Sub2) arg1;
		arg0 += local6.anInt9252 + 1;
		arg2 += local6.anInt9249 + 1;
		@Pc(27) int local27 = arg2 * this.anInt7430 + arg0;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt9246;
		@Pc(41) int local41 = local6.anInt9247;
		@Pc(47) int local47 = this.anInt7430 - local41;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			arg2 = 1;
			local38 -= local53;
			local27 += local53 * this.anInt7430;
			local35 = local41 * local53;
		}
		@Pc(74) int local74 = 0;
		if (this.anInt7429 <= local38 + arg2) {
			local53 = local38 + arg2 + 1 - this.anInt7429;
			local38 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local41 -= local53;
			local47 += local53;
			local35 += local53;
			local74 = local53;
			local27 += local53;
			arg0 = 1;
		}
		if (this.anInt7430 <= local41 + arg0) {
			local53 = local41 + arg0 + 1 - this.anInt7430;
			local47 += local53;
			local41 -= local53;
			local74 += local53;
		}
		if (local41 > 0 && local38 > 0) {
			Static285.method4857(local35, local38, local41, this.aByteArray87, local6.aByteArray115, local47, local27, local74);
			this.method6127(local38, local41, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lclient!w;III)V")
	public void method6136(@OriginalArg(0) Class3_Sub10_Sub18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub10_Sub18_Sub2 local6 = (Class3_Sub10_Sub18_Sub2) arg0;
		arg2 += local6.anInt9249 + 1;
		arg1 += local6.anInt9252 + 1;
		@Pc(28) int local28 = arg1 + this.anInt7430 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt9246;
		@Pc(36) int local36 = local6.anInt9247;
		@Pc(42) int local42 = this.anInt7430 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			arg2 = 1;
			local28 += local54 * this.anInt7430;
			local33 -= local54;
			local30 = local54 * local36;
		}
		if (arg2 + local33 >= this.anInt7429) {
			local54 = local33 + arg2 + 1 - this.anInt7429;
			local33 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local30 += local54;
			local44 = local54;
			local28 += local54;
			local36 -= local54;
			local42 += local54;
			arg1 = 1;
		}
		if (local36 + arg1 >= this.anInt7430) {
			local54 = local36 + arg1 + 1 - this.anInt7430;
			local36 -= local54;
			local44 += local54;
			local42 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static508.method7283(local42, local30, local36, local6.aByteArray115, local33, local44, this.aByteArray87, local28);
			this.method6127(local33, local36, arg2, arg1);
		}
	}
}
