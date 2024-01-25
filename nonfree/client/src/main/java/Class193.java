import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class193 {

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "[[Lclient!al;")
	private Class10[][] aClass10ArrayArray1;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_32;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "Lclient!mr;")
	private final Class162_Sub2 aClass162_Sub2_2;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
	public final int anInt5359;

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
	private final int anInt5361;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "[B")
	public final byte[] aByteArray68;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
	private final int anInt5373;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
	private final int anInt5374;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	private final int anInt5367;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!pg;Lclient!mr;)V")
	public Class193(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class162_Sub2 arg1) {
		this.aClass163_Sub2_32 = arg0;
		this.aClass162_Sub2_2 = arg1;
		this.anInt5359 = (this.aClass162_Sub2_2.anInt4138 * this.aClass162_Sub2_2.anInt4134 >> this.aClass163_Sub2_32.anInt5220) + 2;
		this.anInt5361 = (this.aClass162_Sub2_2.anInt4137 * this.aClass162_Sub2_2.anInt4134 >> this.aClass163_Sub2_32.anInt5220) + 2;
		this.aByteArray68 = new byte[this.anInt5359 * this.anInt5361];
		this.anInt5373 = this.aClass163_Sub2_32.anInt5220 + 7 - this.aClass162_Sub2_2.anInt4139;
		this.anInt5374 = this.aClass162_Sub2_2.anInt4138 >> this.anInt5373;
		this.anInt5367 = this.aClass162_Sub2_2.anInt4137 >> this.anInt5373;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([[ZIIIIZ)V")
	public void method4244(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass163_Sub2_32.method4177(false);
		this.aClass163_Sub2_32.method4166(false);
		this.aClass163_Sub2_32.method4139(-2);
		this.aClass163_Sub2_32.method4107(1);
		this.aClass163_Sub2_32.method4174(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass163_Sub2_32.anInt5221 * 128);
		@Pc(47) int local47;
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		if (arg4) {
			for (local47 = 0; local47 < this.anInt5367; local47++) {
				local54 = local47 << this.anInt5373;
				local61 = local47 + 1 << this.anInt5373;
				label128: for (local63 = 0; local63 < this.anInt5374; local63++) {
					local70 = local63 << this.anInt5373;
					local77 = local63 + 1 << this.anInt5373;
					for (local79 = local70; local79 < local77; local79++) {
						if (local79 - arg2 >= -arg3 && local79 - arg2 <= arg3) {
							for (@Pc(99) int local99 = local54; local99 < local61; local99++) {
								if (local99 - arg1 >= -arg3 && local99 - arg1 <= arg3 && arg0[local79 + arg3 - arg2][local99 + arg3 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local43, local43, 1.0F);
									OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass10ArrayArray1[local63][local47].method167();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt5367; local47++) {
				local54 = local47 << this.anInt5373;
				local61 = local47 + 1 << this.anInt5373;
				for (local63 = 0; local63 < this.anInt5374; local63++) {
					local70 = 0;
					local77 = local63 << this.anInt5373;
					local79 = local63 + 1 << this.anInt5373;
					@Pc(227) Class2_Sub13_Sub1 local227 = this.aClass163_Sub2_32.aClass2_Sub13_Sub1_3;
					local227.anInt4347 = 0;
					for (@Pc(232) int local232 = local54; local232 < local61; local232++) {
						if (local232 - arg1 >= -arg3 && local232 - arg1 <= arg3) {
							@Pc(259) int local259 = local77 + local232 * this.aClass162_Sub2_2.anInt4138;
							for (@Pc(261) int local261 = local77; local261 < local79; local261++) {
								if (-arg3 <= local261 - arg2 && local261 - arg2 <= arg3 && arg0[arg3 + local261 - arg2][arg3 + local232 - arg1]) {
									@Pc(297) short[] local297 = this.aClass162_Sub2_2.aShortArrayArray5[local259];
									if (local297 != null) {
										@Pc(305) int local305;
										if (this.aClass163_Sub2_32.aBoolean374) {
											for (local305 = 0; local305 < local297.length; local305++) {
												local70++;
												local227.method3568(local297[local305] & 0xFFFF);
											}
										} else {
											for (local305 = 0; local305 < local297.length; local305++) {
												local70++;
												local227.method3540(local297[local305] & 0xFFFF);
											}
										}
									}
								}
								local259++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local43, local43, 1.0F);
						OpenGL.glTranslatef((float) -local63 / local43, (float) -local47 / local43, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass10ArrayArray1[local63][local47].method169(local227.aByteArray52, local70);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!i;ZI)V")
	public void method4245(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub5_Sub7_Sub1 local6 = (Class2_Sub5_Sub7_Sub1) arg1;
		arg0 += local6.anInt4726 + 1;
		arg2 += local6.anInt4719 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt5359;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt4717;
		@Pc(42) int local42 = local6.anInt4725;
		@Pc(47) int local47 = this.anInt5359 - local42;
		@Pc(49) int local49 = 0;
		@Pc(56) int local56;
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local33 -= local56;
			local28 += this.anInt5359 * local56;
			arg0 = 1;
			local30 = local56 * local42;
		}
		if (local33 + arg0 >= this.anInt5361) {
			local56 = arg0 + local33 + 1 - this.anInt5361;
			local33 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local49 = local56;
			local30 += local56;
			arg2 = 1;
			local47 += local56;
			local42 -= local56;
			local28 += local56;
		}
		if (this.anInt5359 <= arg2 + local42) {
			local56 = local42 + arg2 + 1 - this.anInt5359;
			local42 -= local56;
			local47 += local56;
			local49 += local56;
		}
		if (local42 > 0 && local33 > 0) {
			Static399.method5071(local28, local6.aByteArray56, local30, local33, local47, local49, local42, this.aByteArray68);
			this.method4249(arg2, local33, arg0, local42);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public void method4246() {
		this.aClass10ArrayArray1 = new Class10[this.anInt5374][this.anInt5367];
		for (@Pc(19) int local19 = 0; local19 < this.anInt5367; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt5374; local23++) {
				this.aClass10ArrayArray1[local23][local19] = new Class10(this.aClass163_Sub2_32, this, this.aClass162_Sub2_2, local23, local19, this.anInt5373, local23 * 128 + 1, local19 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILclient!i;B)V")
	public void method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub7 arg2) {
		@Pc(6) Class2_Sub5_Sub7_Sub1 local6 = (Class2_Sub5_Sub7_Sub1) arg2;
		arg0 += local6.anInt4726 + 1;
		arg1 += local6.anInt4719 + 1;
		@Pc(28) int local28 = arg1 + this.anInt5359 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt4717;
		@Pc(36) int local36 = local6.anInt4725;
		@Pc(42) int local42 = this.anInt5359 - local36;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local33 -= local51;
			local28 += this.anInt5359 * local51;
			local30 = local51 * local36;
			arg0 = 1;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt5361 <= arg0 + local33) {
			local51 = local33 + arg0 + 1 - this.anInt5361;
			local33 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local28 += local51;
			local36 -= local51;
			local42 += local51;
			local30 += local51;
			arg1 = 1;
			local72 = local51;
		}
		if (this.anInt5359 <= arg1 + local36) {
			local51 = local36 + arg1 + 1 - this.anInt5359;
			local72 += local51;
			local42 += local51;
			local36 -= local51;
		}
		if (local36 > 0 && local33 > 0) {
			Static147.method2146(local42, local72, local28, local30, local36, local6.aByteArray56, this.aByteArray68, local33);
			this.method4249(arg1, local33, arg0, local36);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V")
	private void method4249(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass10ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(26) int local26 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(38) int local38 = arg2 - 1 >> 7;
		@Pc(49) int local49 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(51) int local51 = local15; local51 <= local26; local51++) {
			@Pc(58) Class10[] local58 = this.aClass10ArrayArray1[local51];
			for (@Pc(60) int local60 = local38; local60 <= local49; local60++) {
				local58[local60].aBoolean17 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IILclient!i;B)Z")
	public boolean method4250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub7 arg2) {
		@Pc(6) Class2_Sub5_Sub7_Sub1 local6 = (Class2_Sub5_Sub7_Sub1) arg2;
		arg1 += local6.anInt4719 + 1;
		arg0 += local6.anInt4726 + 1;
		@Pc(27) int local27 = this.anInt5359 * arg0 + arg1;
		@Pc(30) int local30 = local6.anInt4717;
		@Pc(41) int local41 = local6.anInt4725;
		@Pc(47) int local47 = this.anInt5359 - local41;
		@Pc(54) int local54;
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			arg0 = 1;
			local30 -= local54;
			local27 += this.anInt5359 * local54;
		}
		if (this.anInt5361 <= local30 + arg0) {
			local54 = local30 + arg0 + 1 - this.anInt5361;
			local30 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local41 -= local54;
			local27 += local54;
			arg1 = 1;
			local47 += local54;
		}
		if (this.anInt5359 <= local41 + arg1) {
			local54 = arg1 + local41 + 1 - this.anInt5359;
			local47 += local54;
			local41 -= local54;
		}
		if (local41 > 0 && local30 > 0) {
			local47 += this.anInt5359 * 7;
			return Static455.method5705(local27, local41, local30, local47, this.aByteArray68);
		} else {
			return false;
		}
	}
}
