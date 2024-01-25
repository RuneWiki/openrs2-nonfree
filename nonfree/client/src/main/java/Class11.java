import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "d", descriptor = "[[Lclient!or;")
	private Class153[][] aClass153ArrayArray1;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!sb;")
	private final Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public final int anInt328;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	private final int anInt332;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	private final int anInt329;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "[B")
	public final byte[] aByteArray2;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	private final int anInt331;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	private final int anInt330;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!se;Lclient!sb;)V")
	public Class11(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class22_Sub2 arg1) {
		this.aClass22_Sub2_1 = arg1;
		this.aClass122_Sub2_1 = arg0;
		this.anInt328 = (this.aClass22_Sub2_1.anInt5574 * this.aClass22_Sub2_1.anInt5581 >> this.aClass122_Sub2_1.anInt5611) + 2;
		this.anInt332 = (this.aClass22_Sub2_1.anInt5581 * this.aClass22_Sub2_1.anInt5577 >> this.aClass122_Sub2_1.anInt5611) + 2;
		this.anInt329 = this.aClass122_Sub2_1.anInt5611 + 7 - this.aClass22_Sub2_1.anInt5580;
		this.aByteArray2 = new byte[this.anInt332 * this.anInt328];
		this.anInt331 = this.aClass22_Sub2_1.anInt5574 >> this.anInt329;
		this.anInt330 = this.aClass22_Sub2_1.anInt5577 >> this.anInt329;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ[[ZIII)V")
	public void method222(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_1.anOpengl2;
		this.aClass122_Sub2_1.method4854();
		this.aClass122_Sub2_1.method4880(false);
		this.aClass122_Sub2_1.method4841(false);
		this.aClass122_Sub2_1.method4810();
		this.aClass122_Sub2_1.method4859(0);
		this.aClass122_Sub2_1.method4882(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass122_Sub2_1.anInt5612 * 128);
		@Pc(43) int local43;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(79) int local79;
		@Pc(105) int local105;
		if (arg1) {
			for (local43 = 0; local43 < this.anInt330; local43++) {
				local52 = local43 << this.anInt329;
				local59 = local43 + 1 << this.anInt329;
				label129: for (local61 = 0; local61 < this.anInt331; local61++) {
					local70 = local61 << this.anInt329;
					local77 = local61 + 1 << this.anInt329;
					for (local79 = local70; local79 < local77; local79++) {
						if (-arg0 <= local79 - arg3 && arg0 >= local79 - arg3) {
							for (local105 = local52; local105 < local59; local105++) {
								if (-arg0 <= local105 - arg4 && local105 - arg4 <= arg0 && arg2[local79 + arg0 - arg3][local105 + arg0 - arg4]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local39, local39, 1.0F);
									local3.glTranslatef((float) -local61 / local39, (float) -local43 / local39, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass153ArrayArray1[local61][local43].method3982();
									continue label129;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt330; local43++) {
				local52 = local43 << this.anInt329;
				local59 = local43 + 1 << this.anInt329;
				for (local61 = 0; local61 < this.anInt331; local61++) {
					local70 = 0;
					local77 = local61 << this.anInt329;
					local79 = local61 + 1 << this.anInt329;
					Static280.aClass3_Sub4_8.anInt4268 = 0;
					for (local105 = local52; local105 < local59; local105++) {
						if (local105 - arg4 >= -arg0 && local105 - arg4 <= arg0) {
							@Pc(270) int local270 = this.aClass22_Sub2_1.anInt5574 * local105 + local77;
							for (@Pc(272) int local272 = local77; local272 < local79; local272++) {
								if (local272 - arg3 >= -arg0 && local272 - arg3 <= arg0 && arg2[arg0 + local272 - arg3][arg0 + local105 - arg4]) {
									@Pc(322) short[] local322 = this.aClass22_Sub2_1.aShortArrayArray6[local270];
									if (local322 != null) {
										@Pc(330) int local330;
										if (this.aClass122_Sub2_1.aBoolean363) {
											for (local330 = 0; local330 < local322.length; local330++) {
												local70++;
												Static280.aClass3_Sub4_8.method3660(local322[local330]);
											}
										} else {
											for (local330 = 0; local330 < local322.length; local330++) {
												local70++;
												Static280.aClass3_Sub4_8.method3616(local322[local330]);
											}
										}
									}
								}
								local270++;
							}
						}
					}
					if (local70 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local39, local39, 1.0F);
						local3.glTranslatef((float) -local61 / local39, (float) -local43 / local39, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass122_Sub2_1.anInterface8_5.method5257(Static280.aClass3_Sub4_8.aByteArray70, local70 * 2);
						this.aClass153ArrayArray1[local61][local43].method3981(local70, this.aClass122_Sub2_1.anInterface8_5);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public void method224() {
		this.aClass153ArrayArray1 = new Class153[this.anInt331][this.anInt330];
		for (@Pc(16) int local16 = 0; local16 < this.anInt330; local16++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt331; local26++) {
				this.aClass153ArrayArray1[local26][local16] = new Class153(this.aClass122_Sub2_1, this, this.aClass22_Sub2_1, local26, local16, this.anInt329, local26 * 128 + 1, local16 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIII)V")
	private void method226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass153ArrayArray1 == null) {
			return;
		}
		@Pc(10) int local10 = arg0 - 1 >> 7;
		@Pc(20) int local20 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(26) int local26 = arg1 - 1 >> 7;
		@Pc(34) int local34 = arg3 + arg1 - 2 >> 7;
		for (@Pc(36) int local36 = local10; local36 <= local20; local36++) {
			@Pc(48) Class153[] local48 = this.aClass153ArrayArray1[local36];
			for (@Pc(50) int local50 = local26; local50 <= local34; local50++) {
				local48[local50].aBoolean267 = true;
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!c;III)Z")
	public boolean method227(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class3_Sub7_Sub3_Sub1 local2 = (Class3_Sub7_Sub3_Sub1) arg0;
		arg1 += local2.anInt2864 + 1;
		arg2 += local2.anInt2866 + 1;
		@Pc(23) int local23 = arg2 + arg1 * this.anInt328;
		@Pc(37) int local37 = local2.anInt2867;
		@Pc(40) int local40 = local2.anInt2865;
		@Pc(46) int local46 = this.anInt328 - local40;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local23 += local56 * this.anInt328;
			arg1 = 1;
			local37 -= local56;
		}
		if (this.anInt332 <= local37 + arg1) {
			local56 = local37 + arg1 + 1 - this.anInt332;
			local37 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local23 += local56;
			arg2 = 1;
			local40 -= local56;
			local46 += local56;
		}
		if (this.anInt328 <= local40 + arg2) {
			local56 = arg2 + local40 + 1 - this.anInt328;
			local46 += local56;
			local40 -= local56;
		}
		if (local40 > 0 && local37 > 0) {
			local46 += this.anInt328 * 7;
			return Static356.method225(local23, local46, this.aByteArray2, local37, local40);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Lclient!c;III)V")
	public void method229(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class3_Sub7_Sub3_Sub1 local2 = (Class3_Sub7_Sub3_Sub1) arg0;
		arg1 += local2.anInt2864 + 1;
		arg2 += local2.anInt2866 + 1;
		@Pc(23) int local23 = arg2 + this.anInt328 * arg1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2867;
		@Pc(31) int local31 = local2.anInt2865;
		@Pc(37) int local37 = this.anInt328 - local31;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			arg1 = 1;
			local28 -= local47;
			local25 = local31 * local47;
			local23 += this.anInt328 * local47;
		}
		@Pc(68) int local68 = 0;
		if (this.anInt332 <= local28 + arg1) {
			local47 = local28 + arg1 + 1 - this.anInt332;
			local28 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local37 += local47;
			local23 += local47;
			local25 += local47;
			local68 = local47;
			arg2 = 1;
			local31 -= local47;
		}
		if (this.anInt328 <= arg2 + local31) {
			local47 = arg2 + local31 + 1 - this.anInt328;
			local68 += local47;
			local31 -= local47;
			local37 += local47;
		}
		if (local31 > 0 && local28 > 0) {
			Static356.method228(this.aByteArray2, local28, local37, local68, local23, local2.aByteArray55, local31, local25);
			this.method226(arg2, arg1, local31, local28);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!c;B)V")
	public void method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub3 arg2) {
		@Pc(2) Class3_Sub7_Sub3_Sub1 local2 = (Class3_Sub7_Sub3_Sub1) arg2;
		arg1 += local2.anInt2864 + 1;
		arg0 += local2.anInt2866 + 1;
		@Pc(23) int local23 = arg0 + this.anInt328 * arg1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2867;
		@Pc(31) int local31 = local2.anInt2865;
		@Pc(52) int local52 = this.anInt328 - local31;
		@Pc(62) int local62;
		if (arg1 <= 0) {
			local62 = 1 - arg1;
			local23 += this.anInt328 * local62;
			arg1 = 1;
			local25 = local62 * local31;
			local28 -= local62;
		}
		@Pc(83) int local83 = 0;
		if (this.anInt332 <= arg1 + local28) {
			local62 = arg1 + local28 + 1 - this.anInt332;
			local28 -= local62;
		}
		if (arg0 <= 0) {
			local62 = 1 - arg0;
			local25 += local62;
			local31 -= local62;
			local52 += local62;
			local83 = local62;
			local23 += local62;
			arg0 = 1;
		}
		if (this.anInt328 <= local31 + arg0) {
			local62 = local31 + arg0 + 1 - this.anInt328;
			local83 += local62;
			local31 -= local62;
			local52 += local62;
		}
		if (local31 > 0 && local28 > 0) {
			Static356.method223(local2.aByteArray55, local28, local25, local52, local83, local23, this.aByteArray2, local31);
			this.method226(arg0, arg1, local31, local28);
		}
	}
}
