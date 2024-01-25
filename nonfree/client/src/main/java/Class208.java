import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class208 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "[[Lclient!pd;")
	private Class180[][] aClass180ArrayArray1;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Lclient!ag;")
	private final Class7_Sub1 aClass7_Sub1_2;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_36;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
	public final int anInt5278;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
	private final int anInt5276;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
	private final int anInt5277;

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "[B")
	public final byte[] aByteArray72;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
	private final int anInt5275;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	private final int anInt5279;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!mi;Lclient!ag;)V")
	public Class208(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Class7_Sub1 arg1) {
		this.aClass7_Sub1_2 = arg1;
		this.aClass155_Sub1_36 = arg0;
		this.anInt5278 = (this.aClass7_Sub1_2.anInt6380 * this.aClass7_Sub1_2.anInt134 >> this.aClass155_Sub1_36.anInt3848) + 2;
		this.anInt5276 = (this.aClass7_Sub1_2.anInt6381 * this.aClass7_Sub1_2.anInt134 >> this.aClass155_Sub1_36.anInt3848) + 2;
		this.anInt5277 = this.aClass155_Sub1_36.anInt3848 + 7 - this.aClass7_Sub1_2.anInt133;
		this.aByteArray72 = new byte[this.anInt5276 * this.anInt5278];
		this.anInt5275 = this.aClass7_Sub1_2.anInt6380 >> this.anInt5277;
		this.anInt5279 = this.aClass7_Sub1_2.anInt6381 >> this.anInt5277;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLclient!tm;II)Z")
	public boolean method4704(@OriginalArg(1) Class3_Sub7_Sub6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class3_Sub7_Sub6_Sub1 local2 = (Class3_Sub7_Sub6_Sub1) arg0;
		arg1 += local2.anInt2340 + 1;
		arg2 += local2.anInt2337 + 1;
		@Pc(30) int local30 = arg2 + this.anInt5278 * arg1;
		@Pc(33) int local33 = local2.anInt2338;
		@Pc(36) int local36 = local2.anInt2339;
		@Pc(46) int local46;
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			local33 -= local46;
			local30 += this.anInt5278 * local46;
			arg1 = 1;
		}
		@Pc(65) int local65 = this.anInt5278 - local36;
		if (arg1 + local33 >= this.anInt5276) {
			local46 = arg1 + local33 + 1 - this.anInt5276;
			local33 -= local46;
		}
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local30 += local46;
			local65 += local46;
			arg2 = 1;
			local36 -= local46;
		}
		if (arg2 + local36 >= this.anInt5278) {
			local46 = arg2 + local36 + 1 - this.anInt5278;
			local65 += local46;
			local36 -= local46;
		}
		if (local36 > 0 && local33 > 0) {
			local65 += this.anInt5278 * 7;
			return Static407.method4706(local30, local36, local65, this.aByteArray72, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!tm;II)V")
	public void method4705(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class3_Sub7_Sub6_Sub1 local2 = (Class3_Sub7_Sub6_Sub1) arg1;
		arg0 += local2.anInt2340 + 1;
		arg2 += local2.anInt2337 + 1;
		@Pc(24) int local24 = arg2 + this.anInt5278 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local2.anInt2338;
		@Pc(36) int local36 = local2.anInt2339;
		@Pc(42) int local42 = this.anInt5278 - local36;
		@Pc(44) int local44 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			arg0 = 1;
			local33 -= local53;
			local24 += local53 * this.anInt5278;
			local30 = local53 * local36;
		}
		if (local33 + arg0 >= this.anInt5276) {
			local53 = local33 + arg0 + 1 - this.anInt5276;
			local33 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local30 += local53;
			local42 += local53;
			local36 -= local53;
			local24 += local53;
			local44 = local53;
			arg2 = 1;
		}
		if (arg2 + local36 >= this.anInt5278) {
			local53 = local36 + arg2 + 1 - this.anInt5278;
			local36 -= local53;
			local44 += local53;
			local42 += local53;
		}
		if (local36 > 0 && local33 > 0) {
			Static407.method4711(local42, local44, local33, local36, local24, local2.aByteArray35, this.aByteArray72, local30);
			this.method4709(arg2, arg0, local33, local36);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public void method4708() {
		this.aClass180ArrayArray1 = new Class180[this.anInt5275][this.anInt5279];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5279; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt5275; local18++) {
				this.aClass180ArrayArray1[local18][local12] = new Class180(this.aClass155_Sub1_36, this, this.aClass7_Sub1_2, local18, local12, this.anInt5277, local18 * 128 + 1, local12 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)V")
	private void method4709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass180ArrayArray1 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 - 1 >> 7;
		@Pc(19) int local19 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(25) int local25 = arg1 - 1 >> 7;
		@Pc(43) int local43 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local9; local45 <= local19; local45++) {
			@Pc(57) Class180[] local57 = this.aClass180ArrayArray1[local45];
			for (@Pc(59) int local59 = local25; local59 <= local43; local59++) {
				local57[local59].aBoolean364 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([[ZZIIIB)V")
	public void method4710(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) opengl local3 = this.aClass155_Sub1_36.anOpengl1;
		this.aClass155_Sub1_36.method3586();
		this.aClass155_Sub1_36.method3568(false);
		this.aClass155_Sub1_36.method3584(false);
		this.aClass155_Sub1_36.method3620();
		this.aClass155_Sub1_36.method3580(0);
		this.aClass155_Sub1_36.method3613(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass155_Sub1_36.anInt3845 * 128);
		@Pc(39) int local39;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg1) {
			for (local39 = 0; local39 < this.anInt5279; local39++) {
				local52 = local39 << this.anInt5277;
				local59 = local39 + 1 << this.anInt5277;
				label85: for (local61 = 0; local61 < this.anInt5275; local61++) {
					local71 = local61 << this.anInt5277;
					local76 = local61 + 1 << this.anInt5277;
					for (local83 = local71; local83 < local76; local83++) {
						if (-arg3 <= local83 - arg4 && local83 - arg4 <= arg3) {
							for (@Pc(326) int local326 = local52; local326 < local59; local326++) {
								if (local326 - arg2 >= -arg3 && arg3 >= local326 - arg2 && arg0[arg3 + local83 - arg4][local326 + arg3 - arg2]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass180ArrayArray1[local61][local39].method4209();
									continue label85;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt5279; local39++) {
				local52 = local39 << this.anInt5277;
				local59 = local39 + 1 << this.anInt5277;
				for (local61 = 0; local61 < this.anInt5275; local61++) {
					local71 = 0;
					local76 = local61 << this.anInt5277;
					local83 = local61 + 1 << this.anInt5277;
					@Pc(85) Class3_Sub5 local85 = Static7.aClass3_Sub5_1;
					local85.anInt3121 = 0;
					for (@Pc(90) int local90 = local52; local90 < local59; local90++) {
						if (local90 - arg2 >= -arg3 && local90 - arg2 <= arg3) {
							@Pc(122) int local122 = this.aClass7_Sub1_2.anInt6380 * local90 + local76;
							for (@Pc(124) int local124 = local76; local124 < local83; local124++) {
								if (local124 - arg4 >= -arg3 && local124 - arg4 <= arg3 && arg0[local124 + arg3 - arg4][arg3 + local90 - arg2]) {
									@Pc(174) short[] local174 = this.aClass7_Sub1_2.aShortArrayArray1[local122];
									if (local174 != null) {
										@Pc(182) int local182;
										if (this.aClass155_Sub1_36.aBoolean298) {
											for (local182 = 0; local182 < local174.length; local182++) {
												local71++;
												local85.method2749(local174[local182] & 0xFFFF);
											}
										} else {
											for (local182 = 0; local182 < local174.length; local182++) {
												local71++;
												local85.method2729(local174[local182] & 0xFFFF);
											}
										}
									}
								}
								local122++;
							}
						}
					}
					if (local71 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass180ArrayArray1[local61][local39].method4212(local71, local85.aByteArray42);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIILclient!tm;)V")
	public void method4712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7_Sub6 arg2) {
		@Pc(2) Class3_Sub7_Sub6_Sub1 local2 = (Class3_Sub7_Sub6_Sub1) arg2;
		arg1 += local2.anInt2337 + 1;
		arg0 += local2.anInt2340 + 1;
		@Pc(23) int local23 = this.anInt5278 * arg0 + arg1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2338;
		@Pc(31) int local31 = local2.anInt2339;
		@Pc(37) int local37 = this.anInt5278 - local31;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local25 = local31 * local48;
			local23 += local48 * this.anInt5278;
			arg0 = 1;
			local28 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt5276 <= local28 + arg0) {
			local48 = local28 + arg0 + 1 - this.anInt5276;
			local28 -= local48;
		}
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local23 += local48;
			local31 -= local48;
			local69 = local48;
			local25 += local48;
			local37 += local48;
			arg1 = 1;
		}
		if (local31 + arg1 >= this.anInt5278) {
			local48 = arg1 + local31 + 1 - this.anInt5278;
			local69 += local48;
			local31 -= local48;
			local37 += local48;
		}
		if (local31 > 0 && local28 > 0) {
			Static407.method4707(local2.aByteArray35, local31, local69, this.aByteArray72, local25, local23, local28, local37);
			this.method4709(arg1, arg0, local28, local31);
		}
	}
}
