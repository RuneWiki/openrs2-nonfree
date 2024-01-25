import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class62 {

	@OriginalMember(owner = "client!en", name = "n", descriptor = "[[Lclient!fs;")
	private Class78[][] aClass78ArrayArray1;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "Lclient!e;")
	private final Class55_Sub1 aClass55_Sub1_1;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_8;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public final int anInt1713;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "I")
	private final int anInt1710;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "I")
	private final int anInt1720;

	@OriginalMember(owner = "client!en", name = "o", descriptor = "[B")
	public final byte[] aByteArray31;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "I")
	private final int anInt1717;

	@OriginalMember(owner = "client!en", name = "f", descriptor = "I")
	private final int anInt1714;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!nq;Lclient!e;)V")
	public Class62(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) Class55_Sub1 arg1) {
		this.aClass55_Sub1_1 = arg1;
		this.aClass167_Sub1_8 = arg0;
		this.anInt1713 = (this.aClass55_Sub1_1.anInt4610 * this.aClass55_Sub1_1.anInt4614 >> this.aClass167_Sub1_8.anInt4888) + 2;
		this.anInt1710 = (this.aClass55_Sub1_1.anInt4610 * this.aClass55_Sub1_1.anInt4611 >> this.aClass167_Sub1_8.anInt4888) + 2;
		this.anInt1720 = this.aClass167_Sub1_8.anInt4888 + 7 - this.aClass55_Sub1_1.anInt4615;
		this.aByteArray31 = new byte[this.anInt1710 * this.anInt1713];
		this.anInt1717 = this.aClass55_Sub1_1.anInt4614 >> this.anInt1720;
		this.anInt1714 = this.aClass55_Sub1_1.anInt4611 >> this.anInt1720;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIILclient!ia;)V")
	public void method1602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub3_Sub9 arg2) {
		@Pc(6) Class3_Sub3_Sub9_Sub1 local6 = (Class3_Sub3_Sub9_Sub1) arg2;
		arg1 += local6.anInt2335 + 1;
		arg0 += local6.anInt2336 + 1;
		@Pc(27) int local27 = arg1 * this.anInt1713 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2331;
		@Pc(35) int local35 = local6.anInt2329;
		@Pc(41) int local41 = this.anInt1713 - local35;
		@Pc(43) int local43 = 0;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local29 = local35 * local49;
			local27 += local49 * this.anInt1713;
			arg1 = 1;
			local32 -= local49;
		}
		if (arg1 + local32 >= this.anInt1710) {
			local49 = local32 + arg1 + 1 - this.anInt1710;
			local32 -= local49;
		}
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local43 = local49;
			arg0 = 1;
			local35 -= local49;
			local29 += local49;
			local41 += local49;
			local27 += local49;
		}
		if (this.anInt1713 <= local35 + arg0) {
			local49 = local35 + arg0 + 1 - this.anInt1713;
			local35 -= local49;
			local41 += local49;
			local43 += local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static444.method5199(local35, local29, local32, this.aByteArray31, local6.aByteArray43, local27, local41, local43);
			this.method1608(local35, local32, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZ[[ZIB)V")
	public void method1603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) int arg4) {
		this.aClass167_Sub1_8.method3971(false);
		this.aClass167_Sub1_8.method4036(false);
		this.aClass167_Sub1_8.method3968(-2);
		this.aClass167_Sub1_8.method3998(1);
		this.aClass167_Sub1_8.method4040(1);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass167_Sub1_8.anInt4889 * 128);
		@Pc(49) int local49;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		if (arg2) {
			for (local49 = 0; local49 < this.anInt1714; local49++) {
				local56 = local49 << this.anInt1720;
				local63 = local49 + 1 << this.anInt1720;
				label128: for (local65 = 0; local65 < this.anInt1717; local65++) {
					local72 = local65 << this.anInt1720;
					local79 = local65 + 1 << this.anInt1720;
					for (local81 = local72; local81 < local79; local81++) {
						if (-arg0 <= local81 - arg4 && local81 - arg4 <= arg0) {
							for (@Pc(98) int local98 = local56; local98 < local63; local98++) {
								if (-arg0 <= local98 - arg1 && arg0 >= local98 - arg1 && arg3[local81 + arg0 - arg4][arg0 + local98 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local45, local45, 1.0F);
									OpenGL.glTranslatef((float) -local65 / local45, (float) -local49 / local45, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass78ArrayArray1[local65][local49].method1929();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt1714; local49++) {
				local56 = local49 << this.anInt1720;
				local63 = local49 + 1 << this.anInt1720;
				for (local65 = 0; local65 < this.anInt1717; local65++) {
					local72 = 0;
					local79 = local65 << this.anInt1720;
					local81 = local65 + 1 << this.anInt1720;
					@Pc(238) Class3_Sub25_Sub2 local238 = this.aClass167_Sub1_8.aClass3_Sub25_Sub2_3;
					local238.anInt4974 = 0;
					for (@Pc(243) int local243 = local56; local243 < local63; local243++) {
						if (local243 - arg1 >= -arg0 && arg0 >= local243 - arg1) {
							@Pc(270) int local270 = local243 * this.aClass55_Sub1_1.anInt4614 + local79;
							for (@Pc(272) int local272 = local79; local272 < local81; local272++) {
								if (local272 - arg4 >= -arg0 && local272 - arg4 <= arg0 && arg3[arg0 + local272 - arg4][local243 + arg0 - arg1]) {
									@Pc(313) short[] local313 = this.aClass55_Sub1_1.aShortArrayArray1[local270];
									if (local313 != null) {
										@Pc(321) int local321;
										if (this.aClass167_Sub1_8.aBoolean349) {
											for (local321 = 0; local321 < local313.length; local321++) {
												local238.method4123(local313[local321] & 0xFFFF);
												local72++;
											}
										} else {
											for (local321 = 0; local321 < local313.length; local321++) {
												local238.method4120(local313[local321] & 0xFFFF);
												local72++;
											}
										}
									}
								}
								local270++;
							}
						}
					}
					if (local72 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local45, local45, 1.0F);
						OpenGL.glTranslatef((float) -local65 / local45, (float) -local49 / local45, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass78ArrayArray1[local65][local49].method1924(local72, local238.aByteArray88);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public void method1604() {
		this.aClass78ArrayArray1 = new Class78[this.anInt1717][this.anInt1714];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1714; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1717; local24++) {
				this.aClass78ArrayArray1[local24][local20] = new Class78(this.aClass167_Sub1_8, this, this.aClass55_Sub1_1, local24, local20, this.anInt1720, local24 * 128 + 1, local20 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBILclient!ia;)Z")
	public boolean method1606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub3_Sub9 arg2) {
		@Pc(6) Class3_Sub3_Sub9_Sub1 local6 = (Class3_Sub3_Sub9_Sub1) arg2;
		arg0 += local6.anInt2336 + 1;
		arg1 += local6.anInt2335 + 1;
		@Pc(27) int local27 = arg1 * this.anInt1713 + arg0;
		@Pc(30) int local30 = local6.anInt2331;
		@Pc(33) int local33 = local6.anInt2329;
		@Pc(42) int local42;
		if (arg1 <= 0) {
			local42 = 1 - arg1;
			arg1 = 1;
			local30 -= local42;
			local27 += this.anInt1713 * local42;
		}
		@Pc(61) int local61 = this.anInt1713 - local33;
		if (arg1 + local30 >= this.anInt1710) {
			local42 = local30 + arg1 + 1 - this.anInt1710;
			local30 -= local42;
		}
		if (arg0 <= 0) {
			local42 = 1 - arg0;
			local27 += local42;
			local61 += local42;
			arg0 = 1;
			local33 -= local42;
		}
		if (arg0 + local33 >= this.anInt1713) {
			local42 = local33 + arg0 + 1 - this.anInt1713;
			local33 -= local42;
			local61 += local42;
		}
		if (local33 > 0 && local30 > 0) {
			local61 += this.anInt1713 * 7;
			return Static79.method1435(local27, local30, local61, local33, this.aByteArray31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(IIILclient!ia;)V")
	public void method1607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub3_Sub9 arg2) {
		@Pc(6) Class3_Sub3_Sub9_Sub1 local6 = (Class3_Sub3_Sub9_Sub1) arg2;
		arg0 += local6.anInt2336 + 1;
		arg1 += local6.anInt2335 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt1713;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt2331;
		@Pc(36) int local36 = local6.anInt2329;
		@Pc(42) int local42 = this.anInt1713 - local36;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local30 = local36 * local51;
			arg1 = 1;
			local33 -= local51;
			local28 += local51 * this.anInt1713;
		}
		if (this.anInt1710 <= local33 + arg1) {
			local51 = arg1 + local33 + 1 - this.anInt1710;
			local33 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local42 += local51;
			local44 = local51;
			local30 += local51;
			local28 += local51;
			local36 -= local51;
			arg0 = 1;
		}
		if (local36 + arg0 >= this.anInt1713) {
			local51 = arg0 + local36 + 1 - this.anInt1713;
			local36 -= local51;
			local42 += local51;
			local44 += local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static35.method600(this.aByteArray31, local44, local30, local6.aByteArray43, local42, local33, local28, local36);
			this.method1608(local36, local33, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
	private void method1608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass78ArrayArray1 == null) {
			return;
		}
		@Pc(19) int local19 = arg3 - 1 >> 7;
		@Pc(27) int local27 = arg0 + arg3 - 2 >> 7;
		@Pc(33) int local33 = arg2 - 1 >> 7;
		@Pc(43) int local43 = arg1 + arg2 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local19; local45 <= local27; local45++) {
			@Pc(52) Class78[] local52 = this.aClass78ArrayArray1[local45];
			for (@Pc(54) int local54 = local33; local54 <= local43; local54++) {
				local52[local54].aBoolean126 = true;
			}
		}
	}
}
