import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class184 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "[[Lclient!wq;")
	private Class219[][] aClass219ArrayArray1;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_33;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!dl;")
	private final Class41_Sub1 aClass41_Sub1_3;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public final int anInt5449;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	private final int anInt5447;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "[B")
	public final byte[] aByteArray88;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	private final int anInt5450;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private final int anInt5451;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	private final int anInt5448;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!hj;Lclient!dl;)V")
	public Class184(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class41_Sub1 arg1) {
		this.aClass2_Sub1_33 = arg0;
		this.aClass41_Sub1_3 = arg1;
		this.anInt5449 = (this.aClass41_Sub1_3.anInt1387 * this.aClass41_Sub1_3.anInt6179 >> this.aClass2_Sub1_33.anInt2416) + 2;
		this.anInt5447 = (this.aClass41_Sub1_3.anInt6185 * this.aClass41_Sub1_3.anInt1387 >> this.aClass2_Sub1_33.anInt2416) + 2;
		this.aByteArray88 = new byte[this.anInt5447 * this.anInt5449];
		this.anInt5450 = this.aClass2_Sub1_33.anInt2416 + 7 - this.aClass41_Sub1_3.anInt1388;
		this.anInt5451 = this.aClass41_Sub1_3.anInt6179 >> this.anInt5450;
		this.anInt5448 = this.aClass41_Sub1_3.anInt6185 >> this.anInt5450;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ek;BII)V")
	public void method4830(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class1_Sub1_Sub8_Sub1 local2 = (Class1_Sub1_Sub8_Sub1) arg0;
		arg1 += local2.anInt3613 + 1;
		arg2 += local2.anInt3612 + 1;
		@Pc(23) int local23 = arg2 + this.anInt5449 * arg1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3614;
		@Pc(31) int local31 = local2.anInt3611;
		@Pc(36) int local36 = this.anInt5449 - local31;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local28 -= local47;
			local25 = local31 * local47;
			local23 += this.anInt5449 * local47;
			arg1 = 1;
		}
		@Pc(68) int local68 = 0;
		if (local28 + arg1 >= this.anInt5447) {
			local47 = local28 + arg1 + 1 - this.anInt5447;
			local28 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local25 += local47;
			local36 += local47;
			local23 += local47;
			arg2 = 1;
			local68 = local47;
			local31 -= local47;
		}
		if (local31 + arg2 >= this.anInt5449) {
			local47 = arg2 + local31 + 1 - this.anInt5449;
			local68 += local47;
			local36 += local47;
			local31 -= local47;
		}
		if (local31 > 0 && local28 > 0) {
			Static364.method4837(local25, this.aByteArray88, local68, local31, local23, local28, local36, local2.aByteArray59);
			this.method4831(local31, arg1, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
	private void method4831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass219ArrayArray1 == null) {
			return;
		}
		@Pc(10) int local10 = arg3 - 1 >> 7;
		@Pc(20) int local20 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(26) int local26 = arg1 - 1 >> 7;
		@Pc(42) int local42 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local10; local44 <= local20; local44++) {
			@Pc(56) Class219[] local56 = this.aClass219ArrayArray1[local44];
			for (@Pc(58) int local58 = local26; local58 <= local42; local58++) {
				local56[local58].aBoolean590 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!ek;IB)V")
	public void method4832(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub8 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class1_Sub1_Sub8_Sub1 local2 = (Class1_Sub1_Sub8_Sub1) arg1;
		arg2 += local2.anInt3612 + 1;
		arg0 += local2.anInt3613 + 1;
		@Pc(23) int local23 = arg2 + arg0 * this.anInt5449;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local2.anInt3614;
		@Pc(39) int local39 = local2.anInt3611;
		@Pc(44) int local44 = this.anInt5449 - local39;
		@Pc(46) int local46 = 0;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local33 = local39 * local55;
			local36 -= local55;
			arg0 = 1;
			local23 += this.anInt5449 * local55;
		}
		if (local36 + arg0 >= this.anInt5447) {
			local55 = local36 + arg0 + 1 - this.anInt5447;
			local36 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			arg2 = 1;
			local33 += local55;
			local39 -= local55;
			local23 += local55;
			local46 = local55;
			local44 += local55;
		}
		if (arg2 + local39 >= this.anInt5449) {
			local55 = local39 + arg2 + 1 - this.anInt5449;
			local44 += local55;
			local39 -= local55;
			local46 += local55;
		}
		if (local39 > 0 && local36 > 0) {
			Static364.method4833(local46, local33, local23, local39, this.aByteArray88, local44, local2.aByteArray59, local36);
			this.method4831(local39, arg0, local36, arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public void method4835() {
		this.aClass219ArrayArray1 = new Class219[this.anInt5451][this.anInt5448];
		for (@Pc(8) int local8 = 0; local8 < this.anInt5448; local8++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt5451; local18++) {
				this.aClass219ArrayArray1[local18][local8] = new Class219(this.aClass2_Sub1_33, this, this.aClass41_Sub1_3, local18, local8, this.anInt5450, local18 * 128 + 1, local8 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[[ZIZI)V")
	public void method4836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass2_Sub1_33.anOpengl1;
		this.aClass2_Sub1_33.method2361();
		this.aClass2_Sub1_33.method2358(false);
		this.aClass2_Sub1_33.method2344(false);
		this.aClass2_Sub1_33.method2357();
		this.aClass2_Sub1_33.method2340(0);
		this.aClass2_Sub1_33.method2336(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass2_Sub1_33.anInt2413 * 128);
		@Pc(47) int local47;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (arg4) {
			for (local47 = 0; local47 < this.anInt5448; local47++) {
				local56 = local47 << this.anInt5450;
				local63 = local47 + 1 << this.anInt5450;
				label131: for (local65 = 0; local65 < this.anInt5451; local65++) {
					local74 = local65 << this.anInt5450;
					local81 = local65 + 1 << this.anInt5450;
					for (local83 = local74; local83 < local81; local83++) {
						if (-arg0 <= local83 - arg3 && local83 - arg3 <= arg0) {
							for (@Pc(105) int local105 = local56; local105 < local63; local105++) {
								if (local105 - arg1 >= -arg0 && arg0 >= local105 - arg1 && arg2[local83 + arg0 - arg3][local105 + arg0 - arg1]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local43, local43, 1.0F);
									local3.glTranslatef((float) -local65 / local43, (float) -local47 / local43, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass219ArrayArray1[local65][local47].method5722();
									continue label131;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt5448; local47++) {
				local56 = local47 << this.anInt5450;
				local63 = local47 + 1 << this.anInt5450;
				for (local65 = 0; local65 < this.anInt5451; local65++) {
					local74 = 0;
					local81 = local65 << this.anInt5450;
					local83 = local65 + 1 << this.anInt5450;
					@Pc(236) Class1_Sub7 local236 = Static65.aClass1_Sub7_3;
					local236.anInt3368 = 0;
					for (@Pc(241) int local241 = local56; local241 < local63; local241++) {
						if (-arg0 <= local241 - arg1 && local241 - arg1 <= arg0) {
							@Pc(274) int local274 = local241 * this.aClass41_Sub1_3.anInt6179 + local81;
							for (@Pc(276) int local276 = local81; local276 < local83; local276++) {
								if (-arg0 <= local276 - arg3 && arg0 >= local276 - arg3 && arg2[arg0 + local276 - arg3][arg0 + local241 - arg1]) {
									@Pc(318) short[] local318 = this.aClass41_Sub1_3.aShortArrayArray1[local274];
									if (local318 != null) {
										@Pc(327) int local327;
										if (this.aClass2_Sub1_33.aBoolean204) {
											for (local327 = 0; local327 < local318.length; local327++) {
												local236.method3128(local318[local327] & 0xFFFF);
												local74++;
											}
										} else {
											for (local327 = 0; local327 < local318.length; local327++) {
												local236.method3138(local318[local327] & 0xFFFF);
												local74++;
											}
										}
									}
								}
								local274++;
							}
						}
					}
					if (local74 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local43, local43, 1.0F);
						local3.glTranslatef((float) -local65 / local43, (float) -local47 / local43, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass219ArrayArray1[local65][local47].method5721(local74, local236.aByteArray58);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!ek;II)Z")
	public boolean method4838(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub8 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class1_Sub1_Sub8_Sub1 local2 = (Class1_Sub1_Sub8_Sub1) arg1;
		arg2 += local2.anInt3612 + 1;
		arg0 += local2.anInt3613 + 1;
		@Pc(23) int local23 = arg0 * this.anInt5449 + arg2;
		@Pc(37) int local37 = local2.anInt3614;
		@Pc(40) int local40 = local2.anInt3611;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local23 += local51 * this.anInt5449;
			arg0 = 1;
			local37 -= local51;
		}
		@Pc(70) int local70 = this.anInt5449 - local40;
		if (this.anInt5447 <= local37 + arg0) {
			local51 = arg0 + local37 + 1 - this.anInt5447;
			local37 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			arg2 = 1;
			local70 += local51;
			local40 -= local51;
			local23 += local51;
		}
		if (this.anInt5449 <= arg2 + local40) {
			local51 = local40 + arg2 + 1 - this.anInt5449;
			local40 -= local51;
			local70 += local51;
		}
		if (local40 > 0 && local37 > 0) {
			local70 += this.anInt5449 * 7;
			return Static364.method4834(this.aByteArray88, local37, local23, local40, local70);
		} else {
			return false;
		}
	}
}
