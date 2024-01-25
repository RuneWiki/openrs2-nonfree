import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class161 {

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "[[Lclient!nfa;")
	private Class227[][] aClass227ArrayArray1;

	@OriginalMember(owner = "client!jia", name = "l", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_23;

	@OriginalMember(owner = "client!jia", name = "d", descriptor = "Lclient!qh;")
	private final Class274_Sub1 aClass274_Sub1_1;

	@OriginalMember(owner = "client!jia", name = "m", descriptor = "I")
	public final int anInt5767;

	@OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
	private final int anInt5764;

	@OriginalMember(owner = "client!jia", name = "i", descriptor = "[B")
	public final byte[] aByteArray63;

	@OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
	private final int anInt5762;

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
	private final int anInt5761;

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
	private final int anInt5760;

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lclient!eq;Lclient!qh;)V")
	public Class161(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class274_Sub1 arg1) {
		this.aClass33_Sub3_23 = arg0;
		this.aClass274_Sub1_1 = arg1;
		this.anInt5767 = (this.aClass274_Sub1_1.anInt9726 * this.aClass274_Sub1_1.anInt9722 >> this.aClass33_Sub3_23.anInt3416) + 2;
		this.anInt5764 = (this.aClass274_Sub1_1.anInt9723 * this.aClass274_Sub1_1.anInt9722 >> this.aClass33_Sub3_23.anInt3416) + 2;
		this.aByteArray63 = new byte[this.anInt5764 * this.anInt5767];
		this.anInt5762 = this.aClass33_Sub3_23.anInt3416 + 7 - this.aClass274_Sub1_1.anInt9727;
		this.anInt5761 = this.aClass274_Sub1_1.anInt9726 >> this.anInt5762;
		this.anInt5760 = this.aClass274_Sub1_1.anInt9723 >> this.anInt5762;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
	public void method4885() {
		this.aClass227ArrayArray1 = new Class227[this.anInt5761][this.anInt5760];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5760; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt5761; local18++) {
				this.aClass227ArrayArray1[local18][local14] = new Class227(this.aClass33_Sub3_23, this, this.aClass274_Sub1_1, local18, local14, this.anInt5762, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method4886(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class3_Sub1_Sub6_Sub2 local11 = (Class3_Sub1_Sub6_Sub2) arg1;
		arg0 += local11.anInt6107 + 1;
		arg2 += local11.anInt6108 + 1;
		@Pc(33) int local33 = arg0 + this.anInt5767 * arg2;
		@Pc(36) int local36 = local11.anInt6112;
		@Pc(39) int local39 = local11.anInt6114;
		@Pc(45) int local45 = this.anInt5767 - local39;
		@Pc(55) int local55;
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local33 += this.anInt5767 * local55;
			arg2 = 1;
			local36 -= local55;
		}
		if (arg2 + local36 >= this.anInt5764) {
			local55 = local36 + arg2 + 1 - this.anInt5764;
			local36 -= local55;
		}
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local39 -= local55;
			arg0 = 1;
			local33 += local55;
			local45 += local55;
		}
		if (this.anInt5767 <= arg0 + local39) {
			local55 = local39 + arg0 + 1 - this.anInt5767;
			local39 -= local55;
			local45 += local55;
		}
		if (local39 > 0 && local36 > 0) {
			local45 += this.anInt5767 * 7;
			return Static288.method4997(local45, local36, local33, this.aByteArray63, local39);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIIBI)V")
	private void method4887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass227ArrayArray1 == null) {
			return;
		}
		@Pc(21) int local21 = arg0 - 1 >> 7;
		@Pc(32) int local32 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(38) int local38 = arg3 - 1 >> 7;
		@Pc(48) int local48 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(50) int local50 = local21; local50 <= local32; local50++) {
			@Pc(57) Class227[] local57 = this.aClass227ArrayArray1[local50];
			for (@Pc(59) int local59 = local38; local59 <= local48; local59++) {
				local57[local59].aBoolean610 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lclient!r;III)V")
	public void method4888(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub1_Sub6_Sub2 local6 = (Class3_Sub1_Sub6_Sub2) arg0;
		arg1 += local6.anInt6108 + 1;
		arg2 += local6.anInt6107 + 1;
		@Pc(28) int local28 = arg2 + arg1 * this.anInt5767;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt6112;
		@Pc(36) int local36 = local6.anInt6114;
		@Pc(42) int local42 = this.anInt5767 - local36;
		@Pc(44) int local44 = 0;
		@Pc(54) int local54;
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local33 -= local54;
			local30 = local54 * local36;
			local28 += this.anInt5767 * local54;
			arg1 = 1;
		}
		if (arg1 + local33 >= this.anInt5764) {
			local54 = local33 + arg1 + 1 - this.anInt5764;
			local33 -= local54;
		}
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			arg2 = 1;
			local44 = local54;
			local28 += local54;
			local36 -= local54;
			local42 += local54;
			local30 += local54;
		}
		if (this.anInt5767 <= arg2 + local36) {
			local54 = arg2 + local36 + 1 - this.anInt5767;
			local42 += local54;
			local36 -= local54;
			local44 += local54;
		}
		if (local36 > 0 && local33 > 0) {
			Static619.method8393(local33, local6.aByteArray65, local30, local36, local42, local44, local28, this.aByteArray63);
			this.method4887(arg2, local33, local36, arg1);
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIILclient!r;)V")
	public void method4889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub6 arg2) {
		@Pc(6) Class3_Sub1_Sub6_Sub2 local6 = (Class3_Sub1_Sub6_Sub2) arg2;
		arg0 += local6.anInt6107 + 1;
		arg1 += local6.anInt6108 + 1;
		@Pc(27) int local27 = this.anInt5767 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6112;
		@Pc(35) int local35 = local6.anInt6114;
		@Pc(46) int local46 = this.anInt5767 - local35;
		@Pc(48) int local48 = 0;
		@Pc(55) int local55;
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local32 -= local55;
			local29 = local55 * local35;
			arg1 = 1;
			local27 += local55 * this.anInt5767;
		}
		if (this.anInt5764 <= local32 + arg1) {
			local55 = arg1 + local32 + 1 - this.anInt5764;
			local32 -= local55;
		}
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local46 += local55;
			local35 -= local55;
			local27 += local55;
			local29 += local55;
			arg0 = 1;
			local48 = local55;
		}
		if (this.anInt5767 <= arg0 + local35) {
			local55 = arg0 + local35 + 1 - this.anInt5767;
			local46 += local55;
			local35 -= local55;
			local48 += local55;
		}
		if (local35 > 0 && local32 > 0) {
			Static226.method4344(local46, local35, local27, local29, local32, local48, this.aByteArray63, local6.aByteArray65);
			this.method4887(arg0, local32, local35, arg1);
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(I[[ZIZZI)V")
	public void method4891(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass33_Sub3_23.method3080(false);
		this.aClass33_Sub3_23.method3017(false);
		this.aClass33_Sub3_23.method3032(-2);
		this.aClass33_Sub3_23.method3045(1);
		this.aClass33_Sub3_23.method3087(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass33_Sub3_23.anInt3417 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg3) {
			for (local43 = 0; local43 < this.anInt5760; local43++) {
				local50 = local43 << this.anInt5762;
				local57 = local43 + 1 << this.anInt5762;
				label81: for (local59 = 0; local59 < this.anInt5761; local59++) {
					local63 = local59 << this.anInt5762;
					local68 = local59 + 1 << this.anInt5762;
					for (local75 = local63; local75 < local68; local75++) {
						if (local75 - arg4 >= -arg2 && arg2 >= local75 - arg4) {
							for (@Pc(316) int local316 = local50; local316 < local57; local316++) {
								if (-arg2 <= local316 - arg0 && arg2 >= local316 - arg0 && arg1[local75 + arg2 - arg4][local316 + arg2 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass227ArrayArray1[local59][local43].method5903();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt5760; local43++) {
				local50 = local43 << this.anInt5762;
				local57 = local43 + 1 << this.anInt5762;
				for (local59 = 0; local59 < this.anInt5761; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt5762;
					local75 = local59 + 1 << this.anInt5762;
					@Pc(79) Class3_Sub15_Sub2 local79 = this.aClass33_Sub3_23.aClass3_Sub15_Sub2_2;
					local79.anInt10282 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (local84 - arg0 >= -arg2 && arg2 >= local84 - arg0) {
							@Pc(111) int local111 = this.aClass274_Sub1_1.anInt9726 * local84 + local68;
							for (@Pc(113) int local113 = local68; local113 < local75; local113++) {
								if (-arg2 <= local113 - arg4 && arg2 >= local113 - arg4 && arg1[local113 + arg2 - arg4][arg2 + local84 - arg0]) {
									@Pc(153) short[] local153 = this.aClass274_Sub1_1.aShortArrayArray19[local111];
									if (local153 != null) {
										@Pc(161) int local161;
										if (this.aClass33_Sub3_23.aBoolean264) {
											for (local161 = 0; local161 < local153.length; local161++) {
												local79.method8464(local153[local161] & 0xFFFF);
												local63++;
											}
										} else {
											for (local161 = 0; local161 < local153.length; local161++) {
												local79.method8405(local153[local161] & 0xFFFF);
												local63++;
											}
										}
									}
								}
								local111++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass227ArrayArray1[local59][local43].method5909(local63, local79.aByteArray106);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}
}
