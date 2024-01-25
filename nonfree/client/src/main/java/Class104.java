import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class104 {

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "[[Lclient!tb;")
	private Class216[][] aClass216ArrayArray1;

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "Lclient!eh;")
	private final Class64_Sub1 aClass64_Sub1_1;

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_20;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
	public final int anInt3520;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
	private final int anInt3517;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
	private final int anInt3514;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
	private final int anInt3526;

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
	private final int anInt3524;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!gk;Lclient!eh;)V")
	public Class104(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class64_Sub1 arg1) {
		this.aClass64_Sub1_1 = arg1;
		this.aClass75_Sub2_20 = arg0;
		this.anInt3520 = (this.aClass64_Sub1_1.anInt7006 * this.aClass64_Sub1_1.anInt7007 >> this.aClass75_Sub2_20.anInt3078) + 2;
		this.anInt3517 = (this.aClass64_Sub1_1.anInt7005 * this.aClass64_Sub1_1.anInt7007 >> this.aClass75_Sub2_20.anInt3078) + 2;
		this.anInt3514 = this.aClass75_Sub2_20.anInt3078 + 7 - this.aClass64_Sub1_1.anInt7004;
		this.aByteArray40 = new byte[this.anInt3520 * this.anInt3517];
		this.anInt3526 = this.aClass64_Sub1_1.anInt7006 >> this.anInt3514;
		this.anInt3524 = this.aClass64_Sub1_1.anInt7005 >> this.anInt3514;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIZ[[Z)V")
	public void method2888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass75_Sub2_20.method2482(false);
		this.aClass75_Sub2_20.method2467(false);
		this.aClass75_Sub2_20.method2440(-2);
		this.aClass75_Sub2_20.method2424(1);
		this.aClass75_Sub2_20.method2445(1);
		@Pc(44) float local44 = 1.0F / (float) (this.aClass75_Sub2_20.anInt3080 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(71) int local71;
		@Pc(78) int local78;
		@Pc(80) int local80;
		if (arg3) {
			for (local48 = 0; local48 < this.anInt3524; local48++) {
				local55 = local48 << this.anInt3514;
				local62 = local48 + 1 << this.anInt3514;
				label128: for (local64 = 0; local64 < this.anInt3526; local64++) {
					local71 = local64 << this.anInt3514;
					local78 = local64 + 1 << this.anInt3514;
					for (local80 = local71; local80 < local78; local80++) {
						if (local80 - arg1 >= -arg0 && local80 - arg1 <= arg0) {
							for (@Pc(100) int local100 = local55; local100 < local62; local100++) {
								if (local100 - arg2 >= -arg0 && arg0 >= local100 - arg2 && arg4[arg0 + local80 - arg1][arg0 + local100 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local44, local44, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass216ArrayArray1[local64][local48].method5212();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt3524; local48++) {
				local55 = local48 << this.anInt3514;
				local62 = local48 + 1 << this.anInt3514;
				for (local64 = 0; local64 < this.anInt3526; local64++) {
					local71 = 0;
					local78 = local64 << this.anInt3514;
					local80 = local64 + 1 << this.anInt3514;
					@Pc(230) Class3_Sub2 local230 = Static82.aClass3_Sub2_5;
					local230.anInt7620 = 0;
					for (@Pc(235) int local235 = local55; local235 < local62; local235++) {
						if (-arg0 <= local235 - arg2 && local235 - arg2 <= arg0) {
							@Pc(266) int local266 = this.aClass64_Sub1_1.anInt7006 * local235 + local78;
							for (@Pc(268) int local268 = local78; local268 < local80; local268++) {
								if (local268 - arg1 >= -arg0 && arg0 >= local268 - arg1 && arg4[arg0 + local268 - arg1][local235 + arg0 - arg2]) {
									@Pc(314) short[] local314 = this.aClass64_Sub1_1.aShortArrayArray2[local266];
									if (local314 != null) {
										@Pc(322) int local322;
										if (this.aClass75_Sub2_20.aBoolean228) {
											for (local322 = 0; local322 < local314.length; local322++) {
												local230.method6045(local314[local322] & 0xFFFF);
												local71++;
											}
										} else {
											for (local322 = 0; local322 < local314.length; local322++) {
												local230.method6000(local314[local322] & 0xFFFF);
												local71++;
											}
										}
									}
								}
								local266++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local44, local44, 1.0F);
						OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass216ArrayArray1[local64][local48].method5209(local230.aByteArray95, local71);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
	private void method2889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass216ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class216[] local50 = this.aClass216ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				local50[local52].aBoolean458 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILclient!j;)V")
	public void method2891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub3_Sub4 arg2) {
		@Pc(6) Class3_Sub3_Sub4_Sub1 local6 = (Class3_Sub3_Sub4_Sub1) arg2;
		arg0 += local6.anInt1135 + 1;
		arg1 += local6.anInt1144 + 1;
		@Pc(27) int local27 = this.anInt3520 * arg0 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt1138;
		@Pc(35) int local35 = local6.anInt1136;
		@Pc(40) int local40 = this.anInt3520 - local35;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local29 = local52 * local35;
			local27 += local52 * this.anInt3520;
			local32 -= local52;
			arg0 = 1;
		}
		if (arg0 + local32 >= this.anInt3517) {
			local52 = local32 + arg0 + 1 - this.anInt3517;
			local32 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local27 += local52;
			local42 = local52;
			arg1 = 1;
			local35 -= local52;
			local29 += local52;
			local40 += local52;
		}
		if (this.anInt3520 <= local35 + arg1) {
			local52 = local35 + arg1 + 1 - this.anInt3520;
			local35 -= local52;
			local42 += local52;
			local40 += local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static65.method5202(local27, local35, this.aByteArray40, local29, local6.aByteArray10, local32, local40, local42);
			this.method2889(local32, arg1, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(IIILclient!j;)Z")
	public boolean method2893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub3_Sub4 arg2) {
		@Pc(6) Class3_Sub3_Sub4_Sub1 local6 = (Class3_Sub3_Sub4_Sub1) arg2;
		arg1 += local6.anInt1135 + 1;
		arg0 += local6.anInt1144 + 1;
		@Pc(27) int local27 = arg0 + arg1 * this.anInt3520;
		@Pc(30) int local30 = local6.anInt1138;
		@Pc(33) int local33 = local6.anInt1136;
		@Pc(39) int local39;
		if (arg1 <= 0) {
			local39 = 1 - arg1;
			local30 -= local39;
			arg1 = 1;
			local27 += this.anInt3520 * local39;
		}
		@Pc(58) int local58 = this.anInt3520 - local33;
		if (arg1 + local30 >= this.anInt3517) {
			local39 = arg1 + local30 + 1 - this.anInt3517;
			local30 -= local39;
		}
		if (arg0 <= 0) {
			local39 = 1 - arg0;
			local27 += local39;
			arg0 = 1;
			local58 += local39;
			local33 -= local39;
		}
		if (arg0 + local33 >= this.anInt3520) {
			local39 = arg0 + local33 + 1 - this.anInt3520;
			local58 += local39;
			local33 -= local39;
		}
		if (local33 > 0 && local30 > 0) {
			local58 += this.anInt3520 * 7;
			return Static386.method5264(local27, local58, this.aByteArray40, local30, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IILclient!j;I)V")
	public void method2894(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub3_Sub4_Sub1 local6 = (Class3_Sub3_Sub4_Sub1) arg1;
		arg2 += local6.anInt1144 + 1;
		arg0 += local6.anInt1135 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt3520;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt1138;
		@Pc(36) int local36 = local6.anInt1136;
		@Pc(41) int local41 = this.anInt3520 - local36;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local30 = local36 * local53;
			local28 += local53 * this.anInt3520;
			arg0 = 1;
			local33 -= local53;
		}
		if (this.anInt3517 <= local33 + arg0) {
			local53 = local33 + arg0 + 1 - this.anInt3517;
			local33 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local43 = local53;
			local36 -= local53;
			arg2 = 1;
			local30 += local53;
			local41 += local53;
			local28 += local53;
		}
		if (local36 + arg2 >= this.anInt3520) {
			local53 = local36 + arg2 + 1 - this.anInt3520;
			local41 += local53;
			local36 -= local53;
			local43 += local53;
		}
		if (local36 > 0 && local33 > 0) {
			Static373.method5168(local33, local36, this.aByteArray40, local43, local30, local41, local6.aByteArray10, local28);
			this.method2889(local33, arg2, arg0, local36);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	public void method2895() {
		this.aClass216ArrayArray1 = new Class216[this.anInt3526][this.anInt3524];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3524; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt3526; local26++) {
				this.aClass216ArrayArray1[local26][local22] = new Class216(this.aClass75_Sub2_20, this, this.aClass64_Sub1_1, local26, local22, this.anInt3514, local26 * 128 + 1, local22 * 128 - -1);
			}
		}
	}
}
