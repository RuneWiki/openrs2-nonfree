import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class130 {

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "[[Lclient!vp;")
	private Class216[][] aClass216ArrayArray1;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!dl;")
	private final Class36_Sub1 aClass36_Sub1_3;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_26;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public final int anInt3877;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	private final int anInt3876;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[B")
	public final byte[] aByteArray71;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	private final int anInt3874;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	private final int anInt3875;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	private final int anInt3873;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!ks;Lclient!dl;)V")
	public Class130(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class36_Sub1 arg1) {
		this.aClass36_Sub1_3 = arg1;
		this.aClass63_Sub1_26 = arg0;
		this.anInt3877 = (this.aClass36_Sub1_3.anInt4858 * this.aClass36_Sub1_3.anInt1467 >> this.aClass63_Sub1_26.anInt3601) + 2;
		this.anInt3876 = (this.aClass36_Sub1_3.anInt1467 * this.aClass36_Sub1_3.anInt4859 >> this.aClass63_Sub1_26.anInt3601) + 2;
		this.aByteArray71 = new byte[this.anInt3876 * this.anInt3877];
		this.anInt3874 = this.aClass63_Sub1_26.anInt3601 + 7 - this.aClass36_Sub1_3.anInt1463;
		this.anInt3875 = this.aClass36_Sub1_3.anInt4858 >> this.anInt3874;
		this.anInt3873 = this.aClass36_Sub1_3.anInt4859 >> this.anInt3874;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!qh;II)V")
	public void method3615(@OriginalArg(1) Class1_Sub4_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class1_Sub4_Sub4_Sub1 local2 = (Class1_Sub4_Sub4_Sub1) arg0;
		arg1 += local2.anInt1063 + 1;
		arg2 += local2.anInt1066 + 1;
		@Pc(38) int local38 = arg1 + arg2 * this.anInt3877;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = local2.anInt1064;
		@Pc(46) int local46 = local2.anInt1065;
		@Pc(52) int local52 = this.anInt3877 - local46;
		@Pc(59) int local59;
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			arg2 = 1;
			local38 += local59 * this.anInt3877;
			local43 -= local59;
			local40 = local59 * local46;
		}
		@Pc(80) int local80 = 0;
		if (this.anInt3876 <= local43 + arg2) {
			local59 = local43 + arg2 + 1 - this.anInt3876;
			local43 -= local59;
		}
		if (arg1 <= 0) {
			local59 = 1 - arg1;
			local80 = local59;
			local38 += local59;
			local46 -= local59;
			local52 += local59;
			local40 += local59;
			arg1 = 1;
		}
		if (arg1 + local46 >= this.anInt3877) {
			local59 = local46 + arg1 + 1 - this.anInt3877;
			local46 -= local59;
			local52 += local59;
			local80 += local59;
		}
		if (local46 > 0 && local43 > 0) {
			Static375.method3614(local38, local2.aByteArray19, local46, local52, this.aByteArray71, local40, local43, local80);
			this.method3621(arg2, arg1, local46, local43);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method3617() {
		this.aClass216ArrayArray1 = new Class216[this.anInt3875][this.anInt3873];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3873; local8++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt3875; local18++) {
				this.aClass216ArrayArray1[local18][local8] = new Class216(this.aClass63_Sub1_26, this, this.aClass36_Sub1_3, local18, local8, this.anInt3874, local18 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!qh;Z)Z")
	public boolean method3618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub4_Sub4 arg2) {
		@Pc(2) Class1_Sub4_Sub4_Sub1 local2 = (Class1_Sub4_Sub4_Sub1) arg2;
		arg0 += local2.anInt1063 + 1;
		arg1 += local2.anInt1066 + 1;
		@Pc(23) int local23 = arg1 * this.anInt3877 + arg0;
		@Pc(26) int local26 = local2.anInt1064;
		@Pc(29) int local29 = local2.anInt1065;
		@Pc(40) int local40 = this.anInt3877 - local29;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			arg1 = 1;
			local26 -= local48;
			local23 += local48 * this.anInt3877;
		}
		if (arg1 + local26 >= this.anInt3876) {
			local48 = arg1 + local26 + 1 - this.anInt3876;
			local26 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local23 += local48;
			local40 += local48;
			arg0 = 1;
			local29 -= local48;
		}
		if (arg0 + local29 >= this.anInt3877) {
			local48 = local29 + arg0 + 1 - this.anInt3877;
			local40 += local48;
			local29 -= local48;
		}
		if (local29 > 0 && local26 > 0) {
			local40 += this.anInt3877 * 7;
			return Static375.method3619(local26, local23, local40, this.aByteArray71, local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBLclient!qh;)V")
	public void method3620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub4_Sub4 arg2) {
		@Pc(2) Class1_Sub4_Sub4_Sub1 local2 = (Class1_Sub4_Sub4_Sub1) arg2;
		arg0 += local2.anInt1063 + 1;
		arg1 += local2.anInt1066 + 1;
		@Pc(31) int local31 = arg0 + this.anInt3877 * arg1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local2.anInt1064;
		@Pc(39) int local39 = local2.anInt1065;
		@Pc(45) int local45 = this.anInt3877 - local39;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			arg1 = 1;
			local31 += local56 * this.anInt3877;
			local33 = local39 * local56;
			local36 -= local56;
		}
		@Pc(77) int local77 = 0;
		if (this.anInt3876 <= arg1 + local36) {
			local56 = local36 + arg1 + 1 - this.anInt3876;
			local36 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local45 += local56;
			local31 += local56;
			local33 += local56;
			arg0 = 1;
			local39 -= local56;
			local77 = local56;
		}
		if (arg0 + local39 >= this.anInt3877) {
			local56 = arg0 + local39 + 1 - this.anInt3877;
			local77 += local56;
			local39 -= local56;
			local45 += local56;
		}
		if (local39 > 0 && local36 > 0) {
			Static375.method3616(local45, local39, this.aByteArray71, local77, local2.aByteArray19, local33, local31, local36);
			this.method3621(arg1, arg0, local39, local36);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBII)V")
	private void method3621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass216ArrayArray1 == null) {
			return;
		}
		@Pc(11) int local11 = arg1 - 1 >> 7;
		@Pc(21) int local21 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(27) int local27 = arg0 - 1 >> 7;
		@Pc(37) int local37 = arg3 + arg0 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local11; local43 <= local21; local43++) {
			@Pc(55) Class216[] local55 = this.aClass216ArrayArray1[local43];
			for (@Pc(57) int local57 = local27; local57 <= local37; local57++) {
				local55[local57].aBoolean487 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZIII[[Z)V")
	public void method3622(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		@Pc(3) opengl local3 = this.aClass63_Sub1_26.anOpengl1;
		this.aClass63_Sub1_26.method3391();
		this.aClass63_Sub1_26.method3330(false);
		this.aClass63_Sub1_26.method3384(false);
		this.aClass63_Sub1_26.method3331();
		this.aClass63_Sub1_26.method3340(0);
		this.aClass63_Sub1_26.method3374(1);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass63_Sub1_26.anInt3599 * 128);
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(89) int local89;
		if (arg1) {
			for (local49 = 0; local49 < this.anInt3873; local49++) {
				local58 = local49 << this.anInt3874;
				local65 = local49 + 1 << this.anInt3874;
				label85: for (local67 = 0; local67 < this.anInt3875; local67++) {
					local77 = local67 << this.anInt3874;
					local82 = local67 + 1 << this.anInt3874;
					for (local89 = local77; local89 < local82; local89++) {
						if (-arg3 <= local89 - arg2 && local89 - arg2 <= arg3) {
							for (@Pc(332) int local332 = local58; local332 < local65; local332++) {
								if (-arg3 <= local332 - arg0 && arg3 >= local332 - arg0 && arg4[local89 + arg3 - arg2][arg3 + local332 - arg0]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local45, local45, 1.0F);
									local3.glTranslatef((float) -local67 / local45, (float) -local49 / local45, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass216ArrayArray1[local67][local49].method5765();
									continue label85;
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt3873; local49++) {
				local58 = local49 << this.anInt3874;
				local65 = local49 + 1 << this.anInt3874;
				for (local67 = 0; local67 < this.anInt3875; local67++) {
					local77 = 0;
					local82 = local67 << this.anInt3874;
					local89 = local67 + 1 << this.anInt3874;
					@Pc(91) Class1_Sub7 local91 = Static58.aClass1_Sub7_2;
					local91.anInt2219 = 0;
					for (@Pc(96) int local96 = local58; local96 < local65; local96++) {
						if (-arg3 <= local96 - arg0 && local96 - arg0 <= arg3) {
							@Pc(126) int local126 = this.aClass36_Sub1_3.anInt4858 * local96 + local82;
							for (@Pc(128) int local128 = local82; local128 < local89; local128++) {
								if (local128 - arg2 >= -arg3 && local128 - arg2 <= arg3 && arg4[arg3 + local128 - arg2][local96 + arg3 - arg0]) {
									@Pc(170) short[] local170 = this.aClass36_Sub1_3.aShortArrayArray3[local126];
									if (local170 != null) {
										@Pc(180) int local180;
										if (this.aClass63_Sub1_26.lb) {
											for (local180 = 0; local180 < local170.length; local180++) {
												local91.method2144(local170[local180] & 0xFFFF);
												local77++;
											}
										} else {
											for (local180 = 0; local180 < local170.length; local180++) {
												local91.method2125(local170[local180] & 0xFFFF);
												local77++;
											}
										}
									}
								}
								local126++;
							}
						}
					}
					if (local77 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local45, local45, 1.0F);
						local3.glTranslatef((float) -local67 / local45, (float) -local49 / local45, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass216ArrayArray1[local67][local49].method5767(local77, local91.aByteArray41);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}
}
