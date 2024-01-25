import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class42 {

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "[[Lclient!ao;")
	private Class14[][] aClass14ArrayArray1;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_10;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "Lclient!ne;")
	private final Class165_Sub2 aClass165_Sub2_2;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	public final int anInt933;

	@OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
	private final int anInt937;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "[B")
	public final byte[] aByteArray10;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
	private final int anInt928;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	private final int anInt926;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	private final int anInt929;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!vd;Lclient!ne;)V")
	public Class42(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class165_Sub2 arg1) {
		this.aClass51_Sub2_10 = arg0;
		this.aClass165_Sub2_2 = arg1;
		this.anInt933 = (this.aClass165_Sub2_2.anInt4485 * this.aClass165_Sub2_2.anInt4489 >> this.aClass51_Sub2_10.anInt6909) + 2;
		this.anInt937 = (this.aClass165_Sub2_2.anInt4485 * this.aClass165_Sub2_2.anInt4490 >> this.aClass51_Sub2_10.anInt6909) + 2;
		this.aByteArray10 = new byte[this.anInt937 * this.anInt933];
		this.anInt928 = this.aClass51_Sub2_10.anInt6909 + 7 - this.aClass165_Sub2_2.anInt4488;
		this.anInt926 = this.aClass165_Sub2_2.anInt4489 >> this.anInt928;
		this.anInt929 = this.aClass165_Sub2_2.anInt4490 >> this.anInt928;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ba;IZ)Z")
	public boolean method747(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub4_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class7_Sub4_Sub2_Sub1 local6 = (Class7_Sub4_Sub2_Sub1) arg1;
		arg0 += local6.anInt1588 + 1;
		arg2 += local6.anInt1585 + 1;
		@Pc(28) int local28 = arg2 + this.anInt933 * arg0;
		@Pc(31) int local31 = local6.anInt1583;
		@Pc(34) int local34 = local6.anInt1584;
		@Pc(40) int local40 = this.anInt933 - local34;
		@Pc(47) int local47;
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			arg0 = 1;
			local31 -= local47;
			local28 += this.anInt933 * local47;
		}
		if (this.anInt937 <= arg0 + local31) {
			local47 = local31 + arg0 + 1 - this.anInt937;
			local31 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			arg2 = 1;
			local28 += local47;
			local40 += local47;
			local34 -= local47;
		}
		if (this.anInt933 <= local34 + arg2) {
			local47 = arg2 + local34 + 1 - this.anInt933;
			local34 -= local47;
			local40 += local47;
		}
		if (local34 > 0 && local31 > 0) {
			local40 += this.anInt933 * 7;
			return Static347.method4485(local31, local40, local34, this.aByteArray10, local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V")
	private void method748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass14ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(24) int local24 = arg1 + arg3 - 2 >> 7;
		@Pc(39) int local39 = arg2 - 1 >> 7;
		@Pc(49) int local49 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(51) int local51 = local15; local51 <= local24; local51++) {
			@Pc(58) Class14[] local58 = this.aClass14ArrayArray1[local51];
			for (@Pc(60) int local60 = local39; local60 <= local49; local60++) {
				local58[local60].aBoolean1 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	public void method749() {
		this.aClass14ArrayArray1 = new Class14[this.anInt926][this.anInt929];
		for (@Pc(18) int local18 = 0; local18 < this.anInt929; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt926; local22++) {
				this.aClass14ArrayArray1[local22][local18] = new Class14(this.aClass51_Sub2_10, this, this.aClass165_Sub2_2, local22, local18, this.anInt928, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!ba;II)V")
	public void method751(@OriginalArg(1) Class7_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class7_Sub4_Sub2_Sub1 local6 = (Class7_Sub4_Sub2_Sub1) arg0;
		arg2 += local6.anInt1588 + 1;
		arg1 += local6.anInt1585 + 1;
		@Pc(28) int local28 = arg1 + this.anInt933 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt1583;
		@Pc(36) int local36 = local6.anInt1584;
		@Pc(42) int local42 = this.anInt933 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			arg2 = 1;
			local28 += local54 * this.anInt933;
			local33 -= local54;
			local30 = local54 * local36;
		}
		if (this.anInt937 <= local33 + arg2) {
			local54 = arg2 + local33 + 1 - this.anInt937;
			local33 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local42 += local54;
			local28 += local54;
			local30 += local54;
			arg1 = 1;
			local36 -= local54;
			local44 = local54;
		}
		if (this.anInt933 <= arg1 + local36) {
			local54 = local36 + arg1 + 1 - this.anInt933;
			local44 += local54;
			local36 -= local54;
			local42 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static33.method458(local30, local36, local42, local6.aByteArray15, local44, this.aByteArray10, local33, local28);
			this.method748(local33, arg1, arg2, local36);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BZ[[ZIII)V")
	public void method752(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass51_Sub2_10.method5392(false);
		this.aClass51_Sub2_10.method5375(false);
		this.aClass51_Sub2_10.method5431(-2);
		this.aClass51_Sub2_10.method5400(1);
		this.aClass51_Sub2_10.method5412(1);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass51_Sub2_10.anInt6910 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(73) int local73;
		@Pc(78) int local78;
		@Pc(85) int local85;
		if (arg0) {
			for (local53 = 0; local53 < this.anInt929; local53++) {
				local60 = local53 << this.anInt928;
				local67 = local53 + 1 << this.anInt928;
				label81: for (local69 = 0; local69 < this.anInt926; local69++) {
					local73 = local69 << this.anInt928;
					local78 = local69 + 1 << this.anInt928;
					for (local85 = local73; local85 < local78; local85++) {
						if (local85 - arg2 >= -arg4 && arg4 >= local85 - arg2) {
							for (@Pc(340) int local340 = local60; local340 < local67; local340++) {
								if (-arg4 <= local340 - arg3 && local340 - arg3 <= arg4 && arg1[local85 + arg4 - arg2][local340 + arg4 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local49, local49, 1.0F);
									OpenGL.glTranslatef((float) -local69 / local49, (float) -local53 / local49, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass14ArrayArray1[local69][local53].method108();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt929; local53++) {
				local60 = local53 << this.anInt928;
				local67 = local53 + 1 << this.anInt928;
				for (local69 = 0; local69 < this.anInt926; local69++) {
					local73 = 0;
					local78 = local69 << this.anInt928;
					local85 = local69 + 1 << this.anInt928;
					@Pc(89) Class7_Sub14_Sub2 local89 = this.aClass51_Sub2_10.aClass7_Sub14_Sub2_2;
					local89.anInt4989 = 0;
					for (@Pc(94) int local94 = local60; local94 < local67; local94++) {
						if (local94 - arg3 >= -arg4 && local94 - arg3 <= arg4) {
							@Pc(125) int local125 = local94 * this.aClass165_Sub2_2.anInt4489 + local78;
							for (@Pc(127) int local127 = local78; local127 < local85; local127++) {
								if (local127 - arg2 >= -arg4 && local127 - arg2 <= arg4 && arg1[arg4 + local127 - arg2][arg4 + local94 - arg3]) {
									@Pc(167) short[] local167 = this.aClass165_Sub2_2.aShortArrayArray2[local125];
									if (local167 != null) {
										@Pc(175) int local175;
										if (this.aClass51_Sub2_10.aBoolean461) {
											for (local175 = 0; local175 < local167.length; local175++) {
												local89.method3993(local167[local175] & 0xFFFF);
												local73++;
											}
										} else {
											for (local175 = 0; local175 < local167.length; local175++) {
												local89.method3976(local167[local175] & 0xFFFF);
												local73++;
											}
										}
									}
								}
								local125++;
							}
						}
					}
					if (local73 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local49, local49, 1.0F);
						OpenGL.glTranslatef((float) -local69 / local49, (float) -local53 / local49, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass14ArrayArray1[local69][local53].method104(local89.aByteArray75, local73);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILclient!ba;I)V")
	public void method755(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class7_Sub4_Sub2_Sub1 local6 = (Class7_Sub4_Sub2_Sub1) arg1;
		arg0 += local6.anInt1585 + 1;
		arg2 += local6.anInt1588 + 1;
		@Pc(28) int local28 = arg0 + this.anInt933 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt1583;
		@Pc(36) int local36 = local6.anInt1584;
		@Pc(41) int local41 = this.anInt933 - local36;
		@Pc(51) int local51;
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local30 = local51 * local36;
			local28 += local51 * this.anInt933;
			arg2 = 1;
			local33 -= local51;
		}
		@Pc(72) int local72 = 0;
		if (arg2 + local33 >= this.anInt937) {
			local51 = local33 + arg2 + 1 - this.anInt937;
			local33 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local72 = local51;
			local30 += local51;
			arg0 = 1;
			local36 -= local51;
			local28 += local51;
			local41 += local51;
		}
		if (arg0 + local36 >= this.anInt933) {
			local51 = arg0 + local36 + 1 - this.anInt933;
			local41 += local51;
			local72 += local51;
			local36 -= local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static373.method4783(local33, local36, local6.aByteArray15, this.aByteArray10, local72, local30, local41, local28);
			this.method748(local33, arg0, arg2, local36);
		}
	}
}
