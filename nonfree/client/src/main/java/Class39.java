import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class39 {

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "[[Lclient!ni;")
	private Class169[][] aClass169ArrayArray1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Lclient!ka;")
	private final Class107_Sub1 aClass107_Sub1_2;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_9;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	public final int anInt1002;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	private final int anInt1000;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
	private final int anInt1003;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "[B")
	public final byte[] aByteArray11;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	private final int anInt1001;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	private final int anInt1004;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!fu;Lclient!ka;)V")
	public Class39(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Class107_Sub1 arg1) {
		this.aClass107_Sub1_2 = arg1;
		this.aClass63_Sub2_9 = arg0;
		this.anInt1002 = (this.aClass107_Sub1_2.anInt5379 * this.aClass107_Sub1_2.anInt3323 >> this.aClass63_Sub2_9.anInt2089) + 2;
		this.anInt1000 = (this.aClass107_Sub1_2.anInt5378 * this.aClass107_Sub1_2.anInt3323 >> this.aClass63_Sub2_9.anInt2089) + 2;
		this.anInt1003 = this.aClass63_Sub2_9.anInt2089 + 7 - this.aClass107_Sub1_2.anInt3325;
		this.aByteArray11 = new byte[this.anInt1000 * this.anInt1002];
		this.anInt1001 = this.aClass107_Sub1_2.anInt5379 >> this.anInt1003;
		this.anInt1004 = this.aClass107_Sub1_2.anInt5378 >> this.anInt1003;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
	private void method836(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass169ArrayArray1 == null) {
			return;
		}
		@Pc(11) int local11 = arg2 - 1 >> 7;
		@Pc(21) int local21 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(27) int local27 = arg1 - 1 >> 7;
		@Pc(37) int local37 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(42) int local42 = local11; local42 <= local21; local42++) {
			@Pc(50) Class169[] local50 = this.aClass169ArrayArray1[local42];
			for (@Pc(52) int local52 = local27; local52 <= local37; local52++) {
				local50[local52].aBoolean307 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public void method837() {
		this.aClass169ArrayArray1 = new Class169[this.anInt1001][this.anInt1004];
		for (@Pc(23) int local23 = 0; local23 < this.anInt1004; local23++) {
			for (@Pc(29) int local29 = 0; local29 < this.anInt1001; local29++) {
				this.aClass169ArrayArray1[local29][local23] = new Class169(this.aClass63_Sub2_9, this, this.aClass107_Sub1_2, local29, local23, this.anInt1003, local29 * 128 + 1, local23 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!dh;I)Z")
	public boolean method838(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub10_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub10_Sub3_Sub1 local2 = (Class2_Sub10_Sub3_Sub1) arg1;
		arg2 += local2.anInt3585 + 1;
		arg0 += local2.anInt3582 + 1;
		@Pc(23) int local23 = arg2 + arg0 * this.anInt1002;
		@Pc(36) int local36 = local2.anInt3583;
		@Pc(39) int local39 = local2.anInt3584;
		@Pc(45) int local45 = this.anInt1002 - local39;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local23 += this.anInt1002 * local52;
			local36 -= local52;
			arg0 = 1;
		}
		if (this.anInt1000 <= arg0 + local36) {
			local52 = arg0 + local36 + 1 - this.anInt1000;
			local36 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local39 -= local52;
			arg2 = 1;
			local45 += local52;
			local23 += local52;
		}
		if (this.anInt1002 <= arg2 + local39) {
			local52 = local39 + arg2 + 1 - this.anInt1002;
			local45 += local52;
			local39 -= local52;
		}
		if (local39 > 0 && local36 > 0) {
			local45 += this.anInt1002 * 7;
			return Static394.method840(local23, this.aByteArray11, local36, local39, local45);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[[ZIIZI)V")
	public void method839(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(13) opengl local13 = this.aClass63_Sub2_9.anOpengl2;
		this.aClass63_Sub2_9.method2087();
		this.aClass63_Sub2_9.method2085(false);
		this.aClass63_Sub2_9.method2103(false);
		this.aClass63_Sub2_9.method2089();
		this.aClass63_Sub2_9.method2122(0);
		this.aClass63_Sub2_9.method2090(1);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass63_Sub2_9.anInt2095 * 128);
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(80) int local80;
		@Pc(87) int local87;
		@Pc(89) int local89;
		if (arg3) {
			for (local49 = 0; local49 < this.anInt1004; local49++) {
				local58 = local49 << this.anInt1003;
				local65 = local49 + 1 << this.anInt1003;
				label131: for (local67 = 0; local67 < this.anInt1001; local67++) {
					local80 = local67 << this.anInt1003;
					local87 = local67 + 1 << this.anInt1003;
					for (local89 = local80; local89 < local87; local89++) {
						if (local89 - arg0 >= -arg2 && arg2 >= local89 - arg0) {
							for (@Pc(115) int local115 = local58; local115 < local65; local115++) {
								if (local115 - arg4 >= -arg2 && local115 - arg4 <= arg2 && arg1[local89 + arg2 - arg0][local115 + arg2 - arg4]) {
									local13.glMatrixMode(5890);
									local13.glLoadIdentity();
									local13.glScalef(local45, local45, 1.0F);
									local13.glTranslatef((float) -local67 / local45, (float) -local49 / local45, 1.0F);
									local13.glMatrixMode(5888);
									this.aClass169ArrayArray1[local67][local49].method3722();
									continue label131;
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt1004; local49++) {
				local58 = local49 << this.anInt1003;
				local65 = local49 + 1 << this.anInt1003;
				for (local67 = 0; local67 < this.anInt1001; local67++) {
					local80 = 0;
					local87 = local67 << this.anInt1003;
					local89 = local67 + 1 << this.anInt1003;
					@Pc(235) Class2_Sub16 local235 = Static172.aClass2_Sub16_7;
					local235.anInt6145 = 0;
					for (@Pc(240) int local240 = local58; local240 < local65; local240++) {
						if (-arg2 <= local240 - arg4 && arg2 >= local240 - arg4) {
							@Pc(268) int local268 = local87 + local240 * this.aClass107_Sub1_2.anInt5379;
							for (@Pc(270) int local270 = local87; local270 < local89; local270++) {
								if (local270 - arg0 >= -arg2 && arg2 >= local270 - arg0 && arg1[local270 + arg2 - arg0][local240 + arg2 - arg4]) {
									@Pc(323) short[] local323 = this.aClass107_Sub1_2.aShortArrayArray4[local268];
									if (local323 != null) {
										@Pc(332) int local332;
										if (this.aClass63_Sub2_9.aBoolean153) {
											for (local332 = 0; local332 < local323.length; local332++) {
												local80++;
												local235.method5351(local323[local332] & 0xFFFF);
											}
										} else {
											for (local332 = 0; local332 < local323.length; local332++) {
												local235.method5374(local323[local332] & 0xFFFF);
												local80++;
											}
										}
									}
								}
								local268++;
							}
						}
					}
					if (local80 > 0) {
						local13.glMatrixMode(5890);
						local13.glLoadIdentity();
						local13.glScalef(local45, local45, 1.0F);
						local13.glTranslatef((float) -local67 / local45, (float) -local49 / local45, 1.0F);
						local13.glMatrixMode(5888);
						this.aClass169ArrayArray1[local67][local49].method3725(local80, local235.aByteArray112);
					}
				}
			}
		}
		local13.glMatrixMode(5890);
		local13.glLoadIdentity();
		local13.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLclient!dh;II)V")
	public void method841(@OriginalArg(1) Class2_Sub10_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub10_Sub3_Sub1 local2 = (Class2_Sub10_Sub3_Sub1) arg0;
		arg2 += local2.anInt3582 + 1;
		arg1 += local2.anInt3585 + 1;
		@Pc(23) int local23 = arg2 * this.anInt1002 + arg1;
		@Pc(25) int local25 = 0;
		@Pc(36) int local36 = local2.anInt3583;
		@Pc(39) int local39 = local2.anInt3584;
		@Pc(44) int local44 = this.anInt1002 - local39;
		@Pc(46) int local46 = 0;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			arg2 = 1;
			local36 -= local56;
			local25 = local56 * local39;
			local23 += local56 * this.anInt1002;
		}
		if (arg2 + local36 >= this.anInt1000) {
			local56 = arg2 + local36 + 1 - this.anInt1000;
			local36 -= local56;
		}
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local39 -= local56;
			local46 = local56;
			arg1 = 1;
			local25 += local56;
			local23 += local56;
			local44 += local56;
		}
		if (this.anInt1002 <= local39 + arg1) {
			local56 = local39 + arg1 + 1 - this.anInt1002;
			local46 += local56;
			local39 -= local56;
			local44 += local56;
		}
		if (local39 > 0 && local36 > 0) {
			Static394.method842(local39, local44, local23, local46, local36, this.aByteArray11, local25, local2.aByteArray67);
			this.method836(local36, arg2, arg1, local39);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!dh;BI)V")
	public void method843(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub10_Sub3_Sub1 local2 = (Class2_Sub10_Sub3_Sub1) arg1;
		arg2 += local2.anInt3585 + 1;
		arg0 += local2.anInt3582 + 1;
		@Pc(27) int local27 = this.anInt1002 * arg0 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local2.anInt3583;
		@Pc(35) int local35 = local2.anInt3584;
		@Pc(40) int local40 = this.anInt1002 - local35;
		@Pc(42) int local42 = 0;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local27 += local52 * this.anInt1002;
			local29 = local52 * local35;
			local32 -= local52;
			arg0 = 1;
		}
		if (local32 + arg0 >= this.anInt1000) {
			local52 = local32 + arg0 + 1 - this.anInt1000;
			local32 -= local52;
		}
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local35 -= local52;
			local42 = local52;
			local40 += local52;
			local27 += local52;
			arg2 = 1;
			local29 += local52;
		}
		if (this.anInt1002 <= arg2 + local35) {
			local52 = arg2 + local35 + 1 - this.anInt1002;
			local42 += local52;
			local40 += local52;
			local35 -= local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static394.method835(local2.aByteArray67, local27, local40, local32, local35, local29, this.aByteArray11, local42);
			this.method836(local32, arg0, arg2, local35);
		}
	}
}
