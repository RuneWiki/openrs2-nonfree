import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "[[Lclient!eq;")
	private Class103[][] aClass103ArrayArray1;

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "Lclient!wba;")
	private final Class259_Sub3 aClass259_Sub3_1;

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_1;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
	public final int anInt6;

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
	private final int anInt8;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
	private final int anInt14;

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "[B")
	public final byte[] aByteArray1;

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "I")
	private final int anInt10;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
	private final int anInt15;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!aq;Lclient!wba;)V")
	public Class2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) Class259_Sub3 arg1) {
		this.aClass259_Sub3_1 = arg1;
		this.aClass22_Sub1_1 = arg0;
		this.anInt6 = (this.aClass259_Sub3_1.anInt10949 * this.aClass259_Sub3_1.anInt10947 >> this.aClass22_Sub1_1.anInt994) + 2;
		this.anInt8 = (this.aClass259_Sub3_1.anInt10947 * this.aClass259_Sub3_1.anInt10946 >> this.aClass22_Sub1_1.anInt994) + 2;
		this.anInt14 = this.aClass22_Sub1_1.anInt994 + 7 - this.aClass259_Sub3_1.anInt10943;
		this.aByteArray1 = new byte[this.anInt6 * this.anInt8];
		this.anInt10 = this.aClass259_Sub3_1.anInt10949 >> this.anInt14;
		this.anInt15 = this.aClass259_Sub3_1.anInt10946 >> this.anInt14;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!r;BI)V")
	public void method18(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub17 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub2 local6 = (Class3_Sub7_Sub17_Sub2) arg1;
		arg0 += local6.anInt9951 + 1;
		arg2 += local6.anInt9949 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt6;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt9952;
		@Pc(36) int local36 = local6.anInt9953;
		@Pc(42) int local42 = this.anInt6 - local36;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			arg0 = 1;
			local28 += this.anInt6 * local49;
			local30 = local36 * local49;
			local33 -= local49;
		}
		@Pc(70) int local70 = 0;
		if (this.anInt8 <= local33 + arg0) {
			local49 = local33 + arg0 + 1 - this.anInt8;
			local33 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			arg2 = 1;
			local36 -= local49;
			local28 += local49;
			local30 += local49;
			local70 = local49;
			local42 += local49;
		}
		if (arg2 + local36 >= this.anInt6) {
			local49 = arg2 + local36 + 1 - this.anInt6;
			local70 += local49;
			local36 -= local49;
			local42 += local49;
		}
		if (local36 > 0 && local33 > 0) {
			Static460.method6242(local33, local6.aByteArray97, local30, local70, local28, local42, this.aByteArray1, local36);
			this.method23(local36, arg0, local33, arg2);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIZB[[Z)V")
	public void method19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass22_Sub1_1.method949(false);
		this.aClass22_Sub1_1.method902(false);
		this.aClass22_Sub1_1.method939(-2);
		this.aClass22_Sub1_1.method894(1);
		this.aClass22_Sub1_1.method964(1);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass22_Sub1_1.anInt993 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(74) int local74;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (arg3) {
			for (local51 = 0; local51 < this.anInt15; local51++) {
				local58 = local51 << this.anInt14;
				local65 = local51 + 1 << this.anInt14;
				label128: for (local67 = 0; local67 < this.anInt10; local67++) {
					local74 = local67 << this.anInt14;
					local81 = local67 + 1 << this.anInt14;
					for (local83 = local74; local83 < local81; local83++) {
						if (-arg0 <= local83 - arg2 && arg0 >= local83 - arg2) {
							for (@Pc(108) int local108 = local58; local108 < local65; local108++) {
								if (-arg0 <= local108 - arg1 && local108 - arg1 <= arg0 && arg4[local83 + arg0 - arg2][local108 + arg0 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local47, local47, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass103ArrayArray1[local67][local51].method2527();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt15; local51++) {
				local58 = local51 << this.anInt14;
				local65 = local51 + 1 << this.anInt14;
				for (local67 = 0; local67 < this.anInt10; local67++) {
					local74 = 0;
					local81 = local67 << this.anInt14;
					local83 = local67 + 1 << this.anInt14;
					@Pc(261) Class3_Sub2_Sub2 local261 = this.aClass22_Sub1_1.aClass3_Sub2_Sub2_1;
					local261.anInt2178 = 0;
					for (@Pc(266) int local266 = local58; local266 < local65; local266++) {
						if (-arg0 <= local266 - arg1 && arg0 >= local266 - arg1) {
							@Pc(297) int local297 = local81 + local266 * this.aClass259_Sub3_1.anInt10949;
							for (@Pc(299) int local299 = local81; local299 < local83; local299++) {
								if (local299 - arg2 >= -arg0 && arg0 >= local299 - arg2 && arg4[local299 + arg0 - arg2][arg0 + local266 - arg1]) {
									@Pc(342) short[] local342 = this.aClass259_Sub3_1.aShortArrayArray6[local297];
									if (local342 != null) {
										@Pc(352) int local352;
										if (this.aClass22_Sub1_1.aBoolean60) {
											for (local352 = 0; local352 < local342.length; local352++) {
												local74++;
												local261.method2032(local342[local352] & 0xFFFF);
											}
										} else {
											for (local352 = 0; local352 < local342.length; local352++) {
												local261.method2070(local342[local352] & 0xFFFF);
												local74++;
											}
										}
									}
								}
								local297++;
							}
						}
					}
					if (local74 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local47, local47, 1.0F);
						OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass103ArrayArray1[local67][local51].method2525(local261.aByteArray20, local74);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IILclient!r;I)V")
	public void method21(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7_Sub17 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub2 local6 = (Class3_Sub7_Sub17_Sub2) arg1;
		arg0 += local6.anInt9951 + 1;
		arg2 += local6.anInt9949 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt6;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt9952;
		@Pc(36) int local36 = local6.anInt9953;
		@Pc(42) int local42 = this.anInt6 - local36;
		@Pc(44) int local44 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local30 = local53 * local36;
			local33 -= local53;
			local28 += local53 * this.anInt6;
		}
		if (this.anInt8 <= arg0 + local33) {
			local53 = local33 + arg0 + 1 - this.anInt8;
			local33 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local30 += local53;
			local42 += local53;
			local28 += local53;
			arg2 = 1;
			local44 = local53;
			local36 -= local53;
		}
		if (this.anInt6 <= local36 + arg2) {
			local53 = arg2 + local36 + 1 - this.anInt6;
			local44 += local53;
			local36 -= local53;
			local42 += local53;
		}
		if (local36 > 0 && local33 > 0) {
			Static484.method6535(this.aByteArray1, local33, local44, local36, local6.aByteArray97, local30, local28, local42);
			this.method23(local36, arg0, local33, arg2);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIII)V")
	private void method23(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass103ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg3 - 1 >> 7;
		@Pc(34) int local34 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(40) int local40 = arg1 - 1 >> 7;
		@Pc(50) int local50 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local16; local52 <= local34; local52++) {
			@Pc(59) Class103[] local59 = this.aClass103ArrayArray1[local52];
			for (@Pc(61) int local61 = local40; local61 <= local50; local61++) {
				local59[local61].aBoolean178 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method24(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7_Sub17 arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub2 local6 = (Class3_Sub7_Sub17_Sub2) arg2;
		arg0 += local6.anInt9951 + 1;
		arg1 += local6.anInt9949 + 1;
		@Pc(33) int local33 = this.anInt6 * arg0 + arg1;
		@Pc(36) int local36 = local6.anInt9952;
		@Pc(39) int local39 = local6.anInt9953;
		@Pc(45) int local45 = this.anInt6 - local39;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local33 += this.anInt6 * local51;
			local36 -= local51;
			arg0 = 1;
		}
		if (this.anInt8 <= arg0 + local36) {
			local51 = local36 + arg0 + 1 - this.anInt8;
			local36 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local45 += local51;
			local33 += local51;
			arg1 = 1;
			local39 -= local51;
		}
		if (local39 + arg1 >= this.anInt6) {
			local51 = arg1 + local39 + 1 - this.anInt6;
			local45 += local51;
			local39 -= local51;
		}
		if (local39 > 0 && local36 > 0) {
			local45 += this.anInt6 * 7;
			return Static524.method7016(local39, local33, local45, this.aByteArray1, local36);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	public void method25() {
		this.aClass103ArrayArray1 = new Class103[this.anInt10][this.anInt15];
		for (@Pc(14) int local14 = 0; local14 < this.anInt15; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt10; local18++) {
				this.aClass103ArrayArray1[local18][local14] = new Class103(this.aClass22_Sub1_1, this, this.aClass259_Sub3_1, local18, local14, this.anInt14, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}
}
