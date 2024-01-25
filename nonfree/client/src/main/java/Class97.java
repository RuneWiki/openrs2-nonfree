import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class97 {

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[[Lclient!hga;")
	private Class143[][] aClass143ArrayArray1;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Lclient!rq;")
	private final Class91_Sub3 aClass91_Sub3_2;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_17;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
	public final int anInt2839;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
	private final int anInt2845;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	private final int anInt2838;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "[B")
	public final byte[] aByteArray27;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
	private final int anInt2846;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
	private final int anInt2836;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!dw;Lclient!rq;)V")
	public Class97(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) Class91_Sub3 arg1) {
		this.aClass91_Sub3_2 = arg1;
		this.aClass82_Sub1_17 = arg0;
		this.anInt2839 = (this.aClass91_Sub3_2.anInt8986 * this.aClass91_Sub3_2.anInt8983 >> this.aClass82_Sub1_17.anInt2464) + 2;
		this.anInt2845 = (this.aClass91_Sub3_2.anInt8985 * this.aClass91_Sub3_2.anInt8986 >> this.aClass82_Sub1_17.anInt2464) + 2;
		this.anInt2838 = this.aClass82_Sub1_17.anInt2464 + 7 - this.aClass91_Sub3_2.anInt8988;
		this.aByteArray27 = new byte[this.anInt2845 * this.anInt2839];
		this.anInt2846 = this.aClass91_Sub3_2.anInt8983 >> this.anInt2838;
		this.anInt2836 = this.aClass91_Sub3_2.anInt8985 >> this.anInt2838;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZZI[[ZI)V")
	public void method2365(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass82_Sub1_17.method2028(false);
		this.aClass82_Sub1_17.method2032(false);
		this.aClass82_Sub1_17.method2057(-2);
		this.aClass82_Sub1_17.method2068(1);
		this.aClass82_Sub1_17.method2085(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass82_Sub1_17.anInt2465 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg1) {
			for (local43 = 0; local43 < this.anInt2836; local43++) {
				local50 = local43 << this.anInt2838;
				local57 = local43 + 1 << this.anInt2838;
				label128: for (local59 = 0; local59 < this.anInt2846; local59++) {
					local66 = local59 << this.anInt2838;
					local73 = local59 + 1 << this.anInt2838;
					for (local75 = local66; local75 < local73; local75++) {
						if (-arg2 <= local75 - arg0 && arg2 >= local75 - arg0) {
							for (@Pc(100) int local100 = local50; local100 < local57; local100++) {
								if (local100 - arg4 >= -arg2 && arg2 >= local100 - arg4 && arg3[local75 + arg2 - arg0][arg2 + local100 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass143ArrayArray1[local59][local43].method3265();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt2836; local43++) {
				local50 = local43 << this.anInt2838;
				local57 = local43 + 1 << this.anInt2838;
				for (local59 = 0; local59 < this.anInt2846; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt2838;
					local75 = local59 + 1 << this.anInt2838;
					@Pc(238) Class3_Sub9_Sub1 local238 = this.aClass82_Sub1_17.aClass3_Sub9_Sub1_2;
					local238.anInt6453 = 0;
					for (@Pc(243) int local243 = local50; local243 < local57; local243++) {
						if (-arg2 <= local243 - arg4 && local243 - arg4 <= arg2) {
							@Pc(270) int local270 = local243 * this.aClass91_Sub3_2.anInt8983 + local73;
							for (@Pc(272) int local272 = local73; local272 < local75; local272++) {
								if (local272 - arg0 >= -arg2 && local272 - arg0 <= arg2 && arg3[arg2 + local272 - arg0][arg2 + local243 - arg4]) {
									@Pc(309) short[] local309 = this.aClass91_Sub3_2.aShortArrayArray17[local270];
									if (local309 != null) {
										@Pc(317) int local317;
										if (this.aClass82_Sub1_17.aBoolean174) {
											for (local317 = 0; local317 < local309.length; local317++) {
												local66++;
												local238.method5620(local309[local317] & 0xFFFF);
											}
										} else {
											for (local317 = 0; local317 < local309.length; local317++) {
												local66++;
												local238.method5627(local309[local317] & 0xFFFF);
											}
										}
									}
								}
								local270++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass143ArrayArray1[local59][local43].method3266(local66, local238.aByteArray51);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!r;BII)V")
	public void method2366(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub2 local6 = (Class3_Sub7_Sub17_Sub2) arg0;
		arg2 += local6.anInt7498 + 1;
		arg1 += local6.anInt7497 + 1;
		@Pc(33) int local33 = arg2 + arg1 * this.anInt2839;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt7500;
		@Pc(41) int local41 = local6.anInt7506;
		@Pc(46) int local46 = this.anInt2839 - local41;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local38 -= local56;
			arg1 = 1;
			local35 = local41 * local56;
			local33 += local56 * this.anInt2839;
		}
		@Pc(77) int local77 = 0;
		if (this.anInt2845 <= arg1 + local38) {
			local56 = local38 + arg1 + 1 - this.anInt2845;
			local38 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local77 = local56;
			local35 += local56;
			arg2 = 1;
			local46 += local56;
			local41 -= local56;
			local33 += local56;
		}
		if (arg2 + local41 >= this.anInt2839) {
			local56 = local41 + arg2 + 1 - this.anInt2839;
			local41 -= local56;
			local46 += local56;
			local77 += local56;
		}
		if (local41 > 0 && local38 > 0) {
			Static206.method3229(local35, local46, this.aByteArray27, local38, local77, local33, local6.aByteArray74, local41);
			this.method2367(local41, arg1, local38, arg2);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V")
	private void method2367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass143ArrayArray1 == null) {
			return;
		}
		@Pc(21) int local21 = arg3 - 1 >> 7;
		@Pc(31) int local31 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg1 - 1 >> 7;
		@Pc(47) int local47 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local21; local49 <= local31; local49++) {
			@Pc(56) Class143[] local56 = this.aClass143ArrayArray1[local49];
			for (@Pc(58) int local58 = local37; local58 <= local47; local58++) {
				local56[local58].aBoolean271 = true;
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!r;BI)V")
	public void method2368(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub17 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub2 local6 = (Class3_Sub7_Sub17_Sub2) arg1;
		arg0 += local6.anInt7497 + 1;
		arg2 += local6.anInt7498 + 1;
		@Pc(27) int local27 = arg0 * this.anInt2839 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7500;
		@Pc(35) int local35 = local6.anInt7506;
		@Pc(51) int local51 = this.anInt2839 - local35;
		@Pc(58) int local58;
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local27 += local58 * this.anInt2839;
			local32 -= local58;
			arg0 = 1;
			local29 = local58 * local35;
		}
		@Pc(79) int local79 = 0;
		if (arg0 + local32 >= this.anInt2845) {
			local58 = arg0 + local32 + 1 - this.anInt2845;
			local32 -= local58;
		}
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local51 += local58;
			arg2 = 1;
			local35 -= local58;
			local29 += local58;
			local27 += local58;
			local79 = local58;
		}
		if (arg2 + local35 >= this.anInt2839) {
			local58 = arg2 + local35 + 1 - this.anInt2839;
			local51 += local58;
			local35 -= local58;
			local79 += local58;
		}
		if (local35 > 0 && local32 > 0) {
			Static305.method5147(this.aByteArray27, local27, local51, local79, local29, local32, local35, local6.aByteArray74);
			this.method2367(local35, arg0, local32, arg2);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
	public void method2370() {
		this.aClass143ArrayArray1 = new Class143[this.anInt2846][this.anInt2836];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2836; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2846; local22++) {
				this.aClass143ArrayArray1[local22][local18] = new Class143(this.aClass82_Sub1_17, this, this.aClass91_Sub3_2, local22, local18, this.anInt2838, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method2372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub17 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub7_Sub17_Sub2 local6 = (Class3_Sub7_Sub17_Sub2) arg1;
		arg0 += local6.anInt7497 + 1;
		arg2 += local6.anInt7498 + 1;
		@Pc(27) int local27 = this.anInt2839 * arg0 + arg2;
		@Pc(30) int local30 = local6.anInt7500;
		@Pc(33) int local33 = local6.anInt7506;
		@Pc(39) int local39 = this.anInt2839 - local33;
		@Pc(46) int local46;
		if (arg0 <= 0) {
			local46 = 1 - arg0;
			arg0 = 1;
			local27 += this.anInt2839 * local46;
			local30 -= local46;
		}
		if (local30 + arg0 >= this.anInt2845) {
			local46 = local30 + arg0 + 1 - this.anInt2845;
			local30 -= local46;
		}
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local33 -= local46;
			local39 += local46;
			arg2 = 1;
			local27 += local46;
		}
		if (arg2 + local33 >= this.anInt2839) {
			local46 = arg2 + local33 + 1 - this.anInt2839;
			local39 += local46;
			local33 -= local46;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt2839 * 7;
			return Static16.method247(local39, local27, this.aByteArray27, local30, local33);
		} else {
			return false;
		}
	}
}
