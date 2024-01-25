import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class90 {

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "[[Lclient!go;")
	private Class98[][] aClass98ArrayArray1;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_13;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Lclient!tn;")
	private final Class84_Sub2 aClass84_Sub2_2;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
	public final int anInt2060;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
	private final int anInt2055;

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "[B")
	public final byte[] aByteArray26;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	private final int anInt2052;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
	private final int anInt2058;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
	private final int anInt2056;

	static {
		new Class231("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!bl;Lclient!tn;)V")
	public Class90(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class84_Sub2 arg1) {
		this.aClass28_Sub1_13 = arg0;
		this.aClass84_Sub2_2 = arg1;
		this.anInt2060 = (this.aClass84_Sub2_2.anInt6362 * this.aClass84_Sub2_2.anInt6363 >> this.aClass28_Sub1_13.anInt736) + 2;
		this.anInt2055 = (this.aClass84_Sub2_2.anInt6360 * this.aClass84_Sub2_2.anInt6362 >> this.aClass28_Sub1_13.anInt736) + 2;
		this.aByteArray26 = new byte[this.anInt2055 * this.anInt2060];
		this.anInt2052 = this.aClass28_Sub1_13.anInt736 + 7 - this.aClass84_Sub2_2.anInt6366;
		this.anInt2058 = this.aClass84_Sub2_2.anInt6363 >> this.anInt2052;
		this.anInt2056 = this.aClass84_Sub2_2.anInt6360 >> this.anInt2052;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIII)V")
	private void method1897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass98ArrayArray1 == null) {
			return;
		}
		@Pc(21) int local21 = arg2 - 1 >> 7;
		@Pc(31) int local31 = arg2 + arg1 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg3 - 1 >> 7;
		@Pc(47) int local47 = arg3 + arg0 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local21; local49 <= local31; local49++) {
			@Pc(56) Class98[] local56 = this.aClass98ArrayArray1[local49];
			for (@Pc(58) int local58 = local37; local58 <= local47; local58++) {
				local56[local58].aBoolean177 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	public void method1898() {
		this.aClass98ArrayArray1 = new Class98[this.anInt2058][this.anInt2056];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2056; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2058; local18++) {
				this.aClass98ArrayArray1[local18][local14] = new Class98(this.aClass28_Sub1_13, this, this.aClass84_Sub2_2, local18, local14, this.anInt2052, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIILclient!h;)V")
	public void method1899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub1_Sub8 arg2) {
		@Pc(14) Class6_Sub1_Sub8_Sub1 local14 = (Class6_Sub1_Sub8_Sub1) arg2;
		arg1 += local14.anInt6832 + 1;
		arg0 += local14.anInt6840 + 1;
		@Pc(36) int local36 = arg0 + arg1 * this.anInt2060;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = local14.anInt6839;
		@Pc(44) int local44 = local14.anInt6836;
		@Pc(50) int local50 = this.anInt2060 - local44;
		@Pc(52) int local52 = 0;
		@Pc(58) int local58;
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local41 -= local58;
			arg1 = 1;
			local36 += this.anInt2060 * local58;
			local38 = local44 * local58;
		}
		if (this.anInt2055 <= local41 + arg1) {
			local58 = local41 + arg1 + 1 - this.anInt2055;
			local41 -= local58;
		}
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local44 -= local58;
			local36 += local58;
			arg0 = 1;
			local50 += local58;
			local52 = local58;
			local38 += local58;
		}
		if (this.anInt2060 <= arg0 + local44) {
			local58 = local44 + arg0 + 1 - this.anInt2060;
			local44 -= local58;
			local50 += local58;
			local52 += local58;
		}
		if (local44 > 0 && local41 > 0) {
			Static380.method5246(local36, local38, local41, local14.aByteArray87, local52, local44, local50, this.aByteArray26);
			this.method1897(local41, local44, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!h;II)Z")
	public boolean method1901(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1_Sub8 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class6_Sub1_Sub8_Sub1 local14 = (Class6_Sub1_Sub8_Sub1) arg1;
		arg0 += local14.anInt6840 + 1;
		arg2 += local14.anInt6832 + 1;
		@Pc(35) int local35 = this.anInt2060 * arg2 + arg0;
		@Pc(38) int local38 = local14.anInt6839;
		@Pc(41) int local41 = local14.anInt6836;
		@Pc(47) int local47 = this.anInt2060 - local41;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local35 += local54 * this.anInt2060;
			local38 -= local54;
			arg2 = 1;
		}
		if (this.anInt2055 <= arg2 + local38) {
			local54 = local38 + arg2 + 1 - this.anInt2055;
			local38 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local47 += local54;
			local35 += local54;
			local41 -= local54;
			arg0 = 1;
		}
		if (this.anInt2060 <= arg0 + local41) {
			local54 = local41 + arg0 + 1 - this.anInt2060;
			local41 -= local54;
			local47 += local54;
		}
		if (local41 > 0 && local38 > 0) {
			local47 += this.anInt2060 * 7;
			return Static344.method4848(local38, local41, local47, local35, this.aByteArray26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBLclient!h;I)V")
	public void method1902(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1_Sub8 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub1_Sub8_Sub1 local6 = (Class6_Sub1_Sub8_Sub1) arg1;
		arg2 += local6.anInt6840 + 1;
		arg0 += local6.anInt6832 + 1;
		@Pc(31) int local31 = arg0 * this.anInt2060 + arg2;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local6.anInt6839;
		@Pc(39) int local39 = local6.anInt6836;
		@Pc(44) int local44 = this.anInt2060 - local39;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			arg0 = 1;
			local36 -= local51;
			local31 += local51 * this.anInt2060;
			local33 = local51 * local39;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt2055 <= arg0 + local36) {
			local51 = local36 + arg0 + 1 - this.anInt2055;
			local36 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local72 = local51;
			local44 += local51;
			arg2 = 1;
			local33 += local51;
			local39 -= local51;
			local31 += local51;
		}
		if (this.anInt2060 <= local39 + arg2) {
			local51 = local39 + arg2 + 1 - this.anInt2060;
			local72 += local51;
			local39 -= local51;
			local44 += local51;
		}
		if (local39 > 0 && local36 > 0) {
			Static162.method2660(local36, this.aByteArray26, local44, local72, local33, local39, local31, local6.aByteArray87);
			this.method1897(local36, local39, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[[ZIZI)V")
	public void method1907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass28_Sub1_13.method668(false);
		this.aClass28_Sub1_13.method666(false);
		this.aClass28_Sub1_13.method718(-2);
		this.aClass28_Sub1_13.method678(1);
		this.aClass28_Sub1_13.method708(1);
		@Pc(50) float local50 = 1.0F / (float) (this.aClass28_Sub1_13.anInt735 * 128);
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(86) int local86;
		if (arg3) {
			for (local54 = 0; local54 < this.anInt2056; local54++) {
				local61 = local54 << this.anInt2052;
				local68 = local54 + 1 << this.anInt2052;
				label81: for (local70 = 0; local70 < this.anInt2058; local70++) {
					local74 = local70 << this.anInt2052;
					local79 = local70 + 1 << this.anInt2052;
					for (local86 = local74; local86 < local79; local86++) {
						if (local86 - arg4 >= -arg1 && arg1 >= local86 - arg4) {
							for (@Pc(320) int local320 = local61; local320 < local68; local320++) {
								if (-arg1 <= local320 - arg0 && local320 - arg0 <= arg1 && arg2[local86 + arg1 - arg4][local320 + arg1 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local50, local50, 1.0F);
									OpenGL.glTranslatef((float) -local70 / local50, (float) -local54 / local50, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass98ArrayArray1[local70][local54].method2148();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local54 = 0; local54 < this.anInt2056; local54++) {
				local61 = local54 << this.anInt2052;
				local68 = local54 + 1 << this.anInt2052;
				for (local70 = 0; local70 < this.anInt2058; local70++) {
					local74 = 0;
					local79 = local70 << this.anInt2052;
					local86 = local70 + 1 << this.anInt2052;
					@Pc(88) Class6_Sub15 local88 = Static303.aClass6_Sub15_6;
					local88.anInt3487 = 0;
					for (@Pc(93) int local93 = local61; local93 < local68; local93++) {
						if (local93 - arg0 >= -arg1 && local93 - arg0 <= arg1) {
							@Pc(120) int local120 = local79 + local93 * this.aClass84_Sub2_2.anInt6363;
							for (@Pc(122) int local122 = local79; local122 < local86; local122++) {
								if (-arg1 <= local122 - arg4 && arg1 >= local122 - arg4 && arg2[arg1 + local122 - arg4][local93 + arg1 - arg0]) {
									@Pc(159) short[] local159 = this.aClass84_Sub2_2.aShortArrayArray7[local120];
									if (local159 != null) {
										@Pc(167) int local167;
										if (this.aClass28_Sub1_13.aBoolean52) {
											for (local167 = 0; local167 < local159.length; local167++) {
												local74++;
												local88.method3100(local159[local167] & 0xFFFF);
											}
										} else {
											for (local167 = 0; local167 < local159.length; local167++) {
												local74++;
												local88.method3114(local159[local167] & 0xFFFF);
											}
										}
									}
								}
								local120++;
							}
						}
					}
					if (local74 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local50, local50, 1.0F);
						OpenGL.glTranslatef((float) -local70 / local50, (float) -local54 / local50, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass98ArrayArray1[local70][local54].method2147(local74, local88.aByteArray51);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}
}
