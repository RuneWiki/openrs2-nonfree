import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class236 {

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "[[Lclient!kh;")
	private Class125[][] aClass125ArrayArray1;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_38;

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Lclient!oq;")
	private final Class65_Sub2 aClass65_Sub2_3;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
	public final int anInt6634;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	private final int anInt6630;

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	private final int anInt6636;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "[B")
	public final byte[] aByteArray94;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	private final int anInt6637;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private final int anInt6633;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!fd;Lclient!oq;)V")
	public Class236(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class65_Sub2 arg1) {
		this.aClass19_Sub2_38 = arg0;
		this.aClass65_Sub2_3 = arg1;
		this.anInt6634 = (this.aClass65_Sub2_3.anInt5262 * this.aClass65_Sub2_3.anInt5261 >> this.aClass19_Sub2_38.anInt2275) + 2;
		this.anInt6630 = (this.aClass65_Sub2_3.anInt5261 * this.aClass65_Sub2_3.anInt5258 >> this.aClass19_Sub2_38.anInt2275) + 2;
		this.anInt6636 = this.aClass19_Sub2_38.anInt2275 + 7 - this.aClass65_Sub2_3.anInt5256;
		this.aByteArray94 = new byte[this.anInt6634 * this.anInt6630];
		this.anInt6637 = this.aClass65_Sub2_3.anInt5262 >> this.anInt6636;
		this.anInt6633 = this.aClass65_Sub2_3.anInt5258 >> this.anInt6636;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLclient!ba;II)Z")
	public boolean method5190(@OriginalArg(1) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub1_Sub4_Sub1 local6 = (Class4_Sub1_Sub4_Sub1) arg0;
		arg2 += local6.anInt2727 + 1;
		arg1 += local6.anInt2725 + 1;
		@Pc(32) int local32 = this.anInt6634 * arg1 + arg2;
		@Pc(35) int local35 = local6.anInt2722;
		@Pc(38) int local38 = local6.anInt2728;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			arg1 = 1;
			local35 -= local48;
			local32 += local48 * this.anInt6634;
		}
		@Pc(67) int local67 = this.anInt6634 - local38;
		if (local35 + arg1 >= this.anInt6630) {
			local48 = local35 + arg1 + 1 - this.anInt6630;
			local35 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local67 += local48;
			local32 += local48;
			local38 -= local48;
			arg2 = 1;
		}
		if (arg2 + local38 >= this.anInt6634) {
			local48 = local38 + arg2 + 1 - this.anInt6634;
			local67 += local48;
			local38 -= local48;
		}
		if (local38 > 0 && local35 > 0) {
			local67 += this.anInt6634 * 7;
			return Static18.method184(local32, local38, this.aByteArray94, local67, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZII[[ZIZ)V")
	public void method5191(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) int arg4) {
		this.aClass19_Sub2_38.method1906(false);
		this.aClass19_Sub2_38.method1911(false);
		this.aClass19_Sub2_38.method1957(-2);
		this.aClass19_Sub2_38.method1900(1);
		this.aClass19_Sub2_38.method1958(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass19_Sub2_38.anInt2273 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg0) {
			for (local43 = 0; local43 < this.anInt6633; local43++) {
				local50 = local43 << this.anInt6636;
				local57 = local43 + 1 << this.anInt6636;
				label128: for (local59 = 0; local59 < this.anInt6637; local59++) {
					local66 = local59 << this.anInt6636;
					local73 = local59 + 1 << this.anInt6636;
					for (local75 = local66; local75 < local73; local75++) {
						if (local75 - arg2 >= -arg4 && arg4 >= local75 - arg2) {
							for (@Pc(99) int local99 = local50; local99 < local57; local99++) {
								if (-arg4 <= local99 - arg1 && arg4 >= local99 - arg1 && arg3[arg4 + local75 - arg2][arg4 + local99 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass125ArrayArray1[local59][local43].method3189();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt6633; local43++) {
				local50 = local43 << this.anInt6636;
				local57 = local43 + 1 << this.anInt6636;
				for (local59 = 0; local59 < this.anInt6637; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt6636;
					local75 = local59 + 1 << this.anInt6636;
					@Pc(219) Class4_Sub12 local219 = Static383.aClass4_Sub12_7;
					local219.anInt2997 = 0;
					for (@Pc(224) int local224 = local50; local224 < local57; local224++) {
						if (local224 - arg1 >= -arg4 && arg4 >= local224 - arg1) {
							@Pc(251) int local251 = local73 + this.aClass65_Sub2_3.anInt5262 * local224;
							for (@Pc(253) int local253 = local73; local253 < local75; local253++) {
								if (-arg4 <= local253 - arg2 && arg4 >= local253 - arg2 && arg3[arg4 + local253 - arg2][arg4 + local224 - arg1]) {
									@Pc(297) short[] local297 = this.aClass65_Sub2_3.aShortArrayArray9[local251];
									if (local297 != null) {
										@Pc(305) int local305;
										if (this.aClass19_Sub2_38.aBoolean215) {
											for (local305 = 0; local305 < local297.length; local305++) {
												local66++;
												local219.method2524(local297[local305] & 0xFFFF);
											}
										} else {
											for (local305 = 0; local305 < local297.length; local305++) {
												local66++;
												local219.method2541(local297[local305] & 0xFFFF);
											}
										}
									}
								}
								local251++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass125ArrayArray1[local59][local43].method3190(local219.aByteArray36, local66);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
	private void method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass125ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class125[] local50 = this.aClass125ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				local50[local52].aBoolean364 = true;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method5193() {
		this.aClass125ArrayArray1 = new Class125[this.anInt6637][this.anInt6633];
		for (@Pc(24) int local24 = 0; local24 < this.anInt6633; local24++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt6637; local28++) {
				this.aClass125ArrayArray1[local28][local24] = new Class125(this.aClass19_Sub2_38, this, this.aClass65_Sub2_3, local28, local24, this.anInt6636, local28 * 128 + 1, local24 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!ba;B)V")
	public void method5194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub4 arg2) {
		@Pc(6) Class4_Sub1_Sub4_Sub1 local6 = (Class4_Sub1_Sub4_Sub1) arg2;
		arg0 += local6.anInt2725 + 1;
		arg1 += local6.anInt2727 + 1;
		@Pc(27) int local27 = arg0 * this.anInt6634 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2722;
		@Pc(35) int local35 = local6.anInt2728;
		@Pc(41) int local41 = this.anInt6634 - local35;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local29 = local48 * local35;
			local27 += local48 * this.anInt6634;
			arg0 = 1;
			local32 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (arg0 + local32 >= this.anInt6630) {
			local48 = local32 + arg0 + 1 - this.anInt6630;
			local32 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local69 = local48;
			local35 -= local48;
			local27 += local48;
			local41 += local48;
			arg1 = 1;
			local29 += local48;
		}
		if (arg1 + local35 >= this.anInt6634) {
			local48 = arg1 + local35 + 1 - this.anInt6634;
			local69 += local48;
			local41 += local48;
			local35 -= local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static378.method3231(local27, local6.aByteArray26, local41, this.aByteArray94, local29, local35, local69, local32);
			this.method5192(local35, arg1, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILclient!ba;)V")
	public void method5195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub1_Sub4 arg2) {
		@Pc(6) Class4_Sub1_Sub4_Sub1 local6 = (Class4_Sub1_Sub4_Sub1) arg2;
		arg1 += local6.anInt2727 + 1;
		arg0 += local6.anInt2725 + 1;
		@Pc(28) int local28 = arg1 + this.anInt6634 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt2722;
		@Pc(36) int local36 = local6.anInt2728;
		@Pc(42) int local42 = this.anInt6634 - local36;
		@Pc(63) int local63;
		if (arg0 <= 0) {
			local63 = 1 - arg0;
			local33 -= local63;
			arg0 = 1;
			local30 = local36 * local63;
			local28 += local63 * this.anInt6634;
		}
		@Pc(84) int local84 = 0;
		if (this.anInt6630 <= arg0 + local33) {
			local63 = arg0 + local33 + 1 - this.anInt6630;
			local33 -= local63;
		}
		if (arg1 <= 0) {
			local63 = 1 - arg1;
			local36 -= local63;
			arg1 = 1;
			local42 += local63;
			local84 = local63;
			local30 += local63;
			local28 += local63;
		}
		if (this.anInt6634 <= arg1 + local36) {
			local63 = arg1 + local36 + 1 - this.anInt6634;
			local36 -= local63;
			local42 += local63;
			local84 += local63;
		}
		if (local36 > 0 && local33 > 0) {
			Static402.method5213(local33, local28, this.aByteArray94, local36, local30, local84, local42, local6.aByteArray26);
			this.method5192(local36, arg1, arg0, local33);
		}
	}
}
