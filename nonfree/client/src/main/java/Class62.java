import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class62 {

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "[[Lclient!vi;")
	private Class205[][] aClass205ArrayArray1;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_15;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Lclient!wh;")
	private final Class106_Sub2 aClass106_Sub2_1;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	public final int anInt1359;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	private final int anInt1357;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
	private final int anInt1360;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
	private final int anInt1361;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	private final int anInt1358;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!ge;Lclient!wh;)V")
	public Class62(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Class106_Sub2 arg1) {
		this.aClass81_Sub1_15 = arg0;
		this.aClass106_Sub2_1 = arg1;
		this.anInt1359 = (this.aClass106_Sub2_1.anInt6281 * this.aClass106_Sub2_1.anInt6271 >> this.aClass81_Sub1_15.anInt1808) + 2;
		this.anInt1357 = (this.aClass106_Sub2_1.anInt6281 * this.aClass106_Sub2_1.anInt6277 >> this.aClass81_Sub1_15.anInt1808) + 2;
		this.aByteArray32 = new byte[this.anInt1357 * this.anInt1359];
		this.anInt1360 = this.aClass81_Sub1_15.anInt1808 + 7 - this.aClass106_Sub2_1.anInt6282;
		this.anInt1361 = this.aClass106_Sub2_1.anInt6271 >> this.anInt1360;
		this.anInt1358 = this.aClass106_Sub2_1.anInt6277 >> this.anInt1360;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([[ZZIIIB)V")
	public void method1275(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_15.anOpengl1;
		this.aClass81_Sub1_15.method2005();
		this.aClass81_Sub1_15.method2004(false);
		this.aClass81_Sub1_15.method1959(false);
		this.aClass81_Sub1_15.method1993();
		this.aClass81_Sub1_15.method1979(0);
		this.aClass81_Sub1_15.method1963(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass81_Sub1_15.anInt1801 * 128);
		@Pc(39) int local39;
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(57) int local57;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(101) int local101;
		if (arg1) {
			for (local39 = 0; local39 < this.anInt1358; local39++) {
				local48 = local39 << this.anInt1360;
				local55 = local39 + 1 << this.anInt1360;
				label132: for (local57 = 0; local57 < this.anInt1361; local57++) {
					local70 = local57 << this.anInt1360;
					local77 = local57 + 1 << this.anInt1360;
					for (local79 = local70; local79 < local77; local79++) {
						if (-arg4 <= local79 - arg2 && local79 - arg2 <= arg4) {
							for (local101 = local48; local101 < local55; local101++) {
								if (local101 - arg3 >= -arg4 && arg4 >= local101 - arg3 && arg0[local79 + arg4 - arg2][arg4 + local101 - arg3]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local57 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass205ArrayArray1[local57][local39].method5505();
									continue label132;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt1358; local39++) {
				local48 = local39 << this.anInt1360;
				local55 = local39 + 1 << this.anInt1360;
				for (local57 = 0; local57 < this.anInt1361; local57++) {
					local70 = 0;
					local77 = local57 << this.anInt1360;
					Static347.aClass6_Sub10_8.anInt4188 = 0;
					local79 = local57 + 1 << this.anInt1360;
					for (local101 = local48; local101 < local55; local101++) {
						if (local101 - arg3 >= -arg4 && local101 - arg3 <= arg4) {
							@Pc(254) int local254 = local77 + local101 * this.aClass106_Sub2_1.anInt6271;
							for (@Pc(256) int local256 = local77; local256 < local79; local256++) {
								if (local256 - arg2 >= -arg4 && local256 - arg2 <= arg4 && arg0[arg4 + local256 - arg2][local101 + arg4 - arg3]) {
									@Pc(301) short[] local301 = this.aClass106_Sub2_1.aShortArrayArray61[local254];
									if (local301 != null) {
										@Pc(310) int local310;
										if (this.aClass81_Sub1_15.aBoolean156) {
											for (local310 = 0; local310 < local301.length; local310++) {
												Static347.aClass6_Sub10_8.method4025(local301[local310]);
												local70++;
											}
										} else {
											for (local310 = 0; local310 < local301.length; local310++) {
												local70++;
												Static347.aClass6_Sub10_8.method4002(local301[local310]);
											}
										}
									}
								}
								local254++;
							}
						}
					}
					if (local70 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local57 / local35, (float) -local39 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass81_Sub1_15.anInterface4_2.method5115(Static347.aClass6_Sub10_8.aByteArray67, local70 * 2);
						this.aClass205ArrayArray1[local57][local39].method5506(this.aClass81_Sub1_15.anInterface4_2, local70);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!sr;II)V")
	public void method1277(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub17 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class6_Sub2_Sub17_Sub1 local2 = (Class6_Sub2_Sub17_Sub1) arg1;
		arg0 += local2.anInt5973 + 1;
		arg2 += local2.anInt5974 + 1;
		@Pc(23) int local23 = arg0 * this.anInt1359 + arg2;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt5976;
		@Pc(31) int local31 = local2.anInt5975;
		@Pc(37) int local37 = this.anInt1359 - local31;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local23 += this.anInt1359 * local53;
			local25 = local31 * local53;
			arg0 = 1;
			local28 -= local53;
		}
		@Pc(74) int local74 = 0;
		if (this.anInt1357 <= arg0 + local28) {
			local53 = arg0 + local28 + 1 - this.anInt1357;
			local28 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			arg2 = 1;
			local37 += local53;
			local25 += local53;
			local31 -= local53;
			local23 += local53;
			local74 = local53;
		}
		if (this.anInt1359 <= arg2 + local31) {
			local53 = local31 + arg2 + 1 - this.anInt1359;
			local37 += local53;
			local74 += local53;
			local31 -= local53;
		}
		if (local31 > 0 && local28 > 0) {
			Static360.method1279(local2.aByteArray92, local37, this.aByteArray32, local28, local25, local74, local31, local23);
			this.method1282(arg2, local31, arg0, local28);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public void method1278() {
		this.aClass205ArrayArray1 = new Class205[this.anInt1361][this.anInt1358];
		for (@Pc(18) int local18 = 0; local18 < this.anInt1358; local18++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt1361; local28++) {
				this.aClass205ArrayArray1[local28][local18] = new Class205(this.aClass81_Sub1_15, this, this.aClass106_Sub2_1, local28, local18, this.anInt1360, local28 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!sr;II)V")
	public void method1280(@OriginalArg(1) Class6_Sub2_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class6_Sub2_Sub17_Sub1 local2 = (Class6_Sub2_Sub17_Sub1) arg0;
		arg1 += local2.anInt5973 + 1;
		arg2 += local2.anInt5974 + 1;
		@Pc(23) int local23 = arg1 * this.anInt1359 + arg2;
		@Pc(25) int local25 = 0;
		@Pc(38) int local38 = local2.anInt5976;
		@Pc(41) int local41 = local2.anInt5975;
		@Pc(47) int local47 = this.anInt1359 - local41;
		@Pc(49) int local49 = 0;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			arg1 = 1;
			local25 = local41 * local56;
			local23 += this.anInt1359 * local56;
			local38 -= local56;
		}
		if (arg1 + local38 >= this.anInt1357) {
			local56 = arg1 + local38 + 1 - this.anInt1357;
			local38 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local41 -= local56;
			local49 = local56;
			local25 += local56;
			local47 += local56;
			local23 += local56;
			arg2 = 1;
		}
		if (this.anInt1359 <= arg2 + local41) {
			local56 = local41 + arg2 + 1 - this.anInt1359;
			local47 += local56;
			local49 += local56;
			local41 -= local56;
		}
		if (local41 > 0 && local38 > 0) {
			Static360.method1276(local25, local47, local23, local41, this.aByteArray32, local2.aByteArray92, local49, local38);
			this.method1282(arg2, local41, arg1, local38);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!sr;III)Z")
	public boolean method1281(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class6_Sub2_Sub17_Sub1 local2 = (Class6_Sub2_Sub17_Sub1) arg0;
		arg2 += local2.anInt5974 + 1;
		arg1 += local2.anInt5973 + 1;
		@Pc(23) int local23 = arg1 * this.anInt1359 + arg2;
		@Pc(31) int local31 = local2.anInt5976;
		@Pc(34) int local34 = local2.anInt5975;
		@Pc(39) int local39 = this.anInt1359 - local34;
		@Pc(46) int local46;
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			local31 -= local46;
			local23 += this.anInt1359 * local46;
			arg1 = 1;
		}
		if (this.anInt1357 <= local31 + arg1) {
			local46 = local31 + arg1 + 1 - this.anInt1357;
			local31 -= local46;
		}
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			arg2 = 1;
			local23 += local46;
			local34 -= local46;
			local39 += local46;
		}
		if (arg2 + local34 >= this.anInt1359) {
			local46 = local34 + arg2 + 1 - this.anInt1359;
			local34 -= local46;
			local39 += local46;
		}
		if (local34 > 0 && local31 > 0) {
			local39 += this.anInt1359 * 7;
			return Static360.method1274(local34, local23, local39, this.aByteArray32, local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
	private void method1282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass205ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(20) int local20 = arg0 + arg1 - 1 - 1 >> 7;
		@Pc(33) int local33 = arg2 - 1 >> 7;
		@Pc(43) int local43 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local9; local45 <= local20; local45++) {
			@Pc(53) Class205[] local53 = this.aClass205ArrayArray1[local45];
			for (@Pc(55) int local55 = local33; local55 <= local43; local55++) {
				local53[local55].aBoolean405 = true;
			}
		}
	}
}
