import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class231 {

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[[Lclient!i;")
	private Class115[][] aClass115ArrayArray1;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_41;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "Lclient!lh;")
	private final Class146_Sub1 aClass146_Sub1_3;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public final int anInt6711;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	private final int anInt6710;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	private final int anInt6712;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "[B")
	public final byte[] aByteArray87;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	private final int anInt6706;

	@OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
	private final int anInt6717;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!bv;Lclient!lh;)V")
	public Class231(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class146_Sub1 arg1) {
		this.aClass30_Sub1_41 = arg0;
		this.aClass146_Sub1_3 = arg1;
		this.anInt6711 = (this.aClass146_Sub1_3.anInt4730 * this.aClass146_Sub1_3.anInt4733 >> this.aClass30_Sub1_41.anInt1242) + 2;
		this.anInt6710 = (this.aClass146_Sub1_3.anInt4732 * this.aClass146_Sub1_3.anInt4733 >> this.aClass30_Sub1_41.anInt1242) + 2;
		this.anInt6712 = this.aClass30_Sub1_41.anInt1242 + 7 - this.aClass146_Sub1_3.anInt4734;
		this.aByteArray87 = new byte[this.anInt6711 * this.anInt6710];
		this.anInt6706 = this.aClass146_Sub1_3.anInt4730 >> this.anInt6712;
		this.anInt6717 = this.aClass146_Sub1_3.anInt4732 >> this.anInt6712;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!j;II)V")
	public void method5217(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub7 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class4_Sub1_Sub7_Sub1 local6 = (Class4_Sub1_Sub7_Sub1) arg1;
		arg2 += local6.anInt2409 + 1;
		arg0 += local6.anInt2408 + 1;
		@Pc(27) int local27 = this.anInt6711 * arg2 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2411;
		@Pc(41) int local41 = local6.anInt2414;
		@Pc(47) int local47 = this.anInt6711 - local41;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			local29 = local41 * local57;
			local32 -= local57;
			local27 += this.anInt6711 * local57;
			arg2 = 1;
		}
		@Pc(78) int local78 = 0;
		if (this.anInt6710 <= arg2 + local32) {
			local57 = local32 + arg2 + 1 - this.anInt6710;
			local32 -= local57;
		}
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			local29 += local57;
			arg0 = 1;
			local41 -= local57;
			local78 = local57;
			local47 += local57;
			local27 += local57;
		}
		if (local41 + arg0 >= this.anInt6711) {
			local57 = arg0 + local41 + 1 - this.anInt6711;
			local78 += local57;
			local41 -= local57;
			local47 += local57;
		}
		if (local41 > 0 && local32 > 0) {
			Static355.method4960(local27, local32, local29, local47, local78, local6.aByteArray17, local41, this.aByteArray87);
			this.method5218(arg2, local32, arg0, local41);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIBII)V")
	private void method5218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass115ArrayArray1 == null) {
			return;
		}
		@Pc(20) int local20 = arg2 - 1 >> 7;
		@Pc(30) int local30 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg0 - 1 >> 7;
		@Pc(44) int local44 = arg1 + arg0 - 2 >> 7;
		for (@Pc(46) int local46 = local20; local46 <= local30; local46++) {
			@Pc(53) Class115[] local53 = this.aClass115ArrayArray1[local46];
			for (@Pc(55) int local55 = local36; local55 <= local44; local55++) {
				local53[local55].aBoolean216 = true;
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(ILclient!j;II)V")
	public void method5219(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub7 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class4_Sub1_Sub7_Sub1 local6 = (Class4_Sub1_Sub7_Sub1) arg1;
		arg0 += local6.anInt2409 + 1;
		arg2 += local6.anInt2408 + 1;
		@Pc(27) int local27 = arg0 * this.anInt6711 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2411;
		@Pc(44) int local44 = local6.anInt2414;
		@Pc(50) int local50 = this.anInt6711 - local44;
		@Pc(52) int local52 = 0;
		@Pc(58) int local58;
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local27 += this.anInt6711 * local58;
			arg0 = 1;
			local29 = local58 * local44;
			local32 -= local58;
		}
		if (this.anInt6710 <= local32 + arg0) {
			local58 = arg0 + local32 + 1 - this.anInt6710;
			local32 -= local58;
		}
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local44 -= local58;
			local50 += local58;
			local27 += local58;
			local29 += local58;
			arg2 = 1;
			local52 = local58;
		}
		if (this.anInt6711 <= arg2 + local44) {
			local58 = arg2 + local44 + 1 - this.anInt6711;
			local44 -= local58;
			local50 += local58;
			local52 += local58;
		}
		if (local44 > 0 && local32 > 0) {
			Static343.method4798(local27, local50, this.aByteArray87, local44, local29, local32, local6.aByteArray17, local52);
			this.method5218(arg0, local32, arg2, local44);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IILclient!j;I)Z")
	public boolean method5220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub7 arg2) {
		@Pc(6) Class4_Sub1_Sub7_Sub1 local6 = (Class4_Sub1_Sub7_Sub1) arg2;
		arg0 += local6.anInt2408 + 1;
		arg1 += local6.anInt2409 + 1;
		@Pc(27) int local27 = this.anInt6711 * arg1 + arg0;
		@Pc(30) int local30 = local6.anInt2411;
		@Pc(33) int local33 = local6.anInt2414;
		@Pc(40) int local40;
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local30 -= local40;
			local27 += local40 * this.anInt6711;
			arg1 = 1;
		}
		@Pc(70) int local70 = this.anInt6711 - local33;
		if (local30 + arg1 >= this.anInt6710) {
			local40 = arg1 + local30 + 1 - this.anInt6710;
			local30 -= local40;
		}
		if (arg0 <= 0) {
			local40 = 1 - arg0;
			local33 -= local40;
			arg0 = 1;
			local70 += local40;
			local27 += local40;
		}
		if (this.anInt6711 <= local33 + arg0) {
			local40 = local33 + arg0 + 1 - this.anInt6711;
			local70 += local40;
			local33 -= local40;
		}
		if (local33 > 0 && local30 > 0) {
			local70 += this.anInt6711 * 7;
			return Static259.method3550(this.aByteArray87, local33, local27, local70, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public void method5222() {
		this.aClass115ArrayArray1 = new Class115[this.anInt6706][this.anInt6717];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6717; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6706; local18++) {
				this.aClass115ArrayArray1[local18][local14] = new Class115(this.aClass30_Sub1_41, this, this.aClass146_Sub1_3, local18, local14, this.anInt6712, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZI[[ZIBI)V")
	public void method5223(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aClass30_Sub1_41.method952(false);
		this.aClass30_Sub1_41.method956(false);
		this.aClass30_Sub1_41.method940(-2);
		this.aClass30_Sub1_41.method923(1);
		this.aClass30_Sub1_41.method931(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass30_Sub1_41.anInt1243 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg0) {
			for (local43 = 0; local43 < this.anInt6717; local43++) {
				local50 = local43 << this.anInt6712;
				local57 = local43 + 1 << this.anInt6712;
				label128: for (local59 = 0; local59 < this.anInt6706; local59++) {
					local66 = local59 << this.anInt6712;
					local73 = local59 + 1 << this.anInt6712;
					for (local75 = local66; local75 < local73; local75++) {
						if (-arg3 <= local75 - arg4 && arg3 >= local75 - arg4) {
							for (@Pc(96) int local96 = local50; local96 < local57; local96++) {
								if (-arg3 <= local96 - arg1 && arg3 >= local96 - arg1 && arg2[local75 + arg3 - arg4][arg3 + local96 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass115ArrayArray1[local59][local43].method2374();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt6717; local43++) {
				local50 = local43 << this.anInt6712;
				local57 = local43 + 1 << this.anInt6712;
				for (local59 = 0; local59 < this.anInt6706; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt6712;
					local75 = local59 + 1 << this.anInt6712;
					@Pc(232) Class4_Sub30 local232 = Static311.aClass4_Sub30_8;
					local232.anInt6244 = 0;
					for (@Pc(237) int local237 = local50; local237 < local57; local237++) {
						if (local237 - arg1 >= -arg3 && local237 - arg1 <= arg3) {
							@Pc(268) int local268 = local237 * this.aClass146_Sub1_3.anInt4730 + local73;
							for (@Pc(270) int local270 = local73; local270 < local75; local270++) {
								if (-arg3 <= local270 - arg4 && local270 - arg4 <= arg3 && arg2[local270 + arg3 - arg4][arg3 + local237 - arg1]) {
									@Pc(307) short[] local307 = this.aClass146_Sub1_3.aShortArrayArray6[local268];
									if (local307 != null) {
										@Pc(315) int local315;
										if (this.aClass30_Sub1_41.aBoolean76) {
											for (local315 = 0; local315 < local307.length; local315++) {
												local66++;
												local232.method4846(local307[local315] & 0xFFFF);
											}
										} else {
											for (local315 = 0; local315 < local307.length; local315++) {
												local232.method4874(local307[local315] & 0xFFFF);
												local66++;
											}
										}
									}
								}
								local268++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass115ArrayArray1[local59][local43].method2376(local232.aByteArray79, local66);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}
}
