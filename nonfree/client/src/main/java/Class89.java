import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class89 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "[[Lclient!ku;")
	private Class149[][] aClass149ArrayArray1;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_13;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!eg;")
	private final Class64_Sub1 aClass64_Sub1_1;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public final int anInt2693;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private final int anInt2692;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	private final int anInt2689;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "[B")
	public final byte[] aByteArray53;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	private final int anInt2688;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	private final int anInt2690;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!ef;Lclient!eg;)V")
	public Class89(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class64_Sub1 arg1) {
		this.aClass49_Sub2_13 = arg0;
		this.aClass64_Sub1_1 = arg1;
		this.anInt2693 = (this.aClass64_Sub1_1.anInt2934 * this.aClass64_Sub1_1.anInt2927 >> this.aClass49_Sub2_13.anInt2003) + 2;
		this.anInt2692 = (this.aClass64_Sub1_1.anInt2928 * this.aClass64_Sub1_1.anInt2927 >> this.aClass49_Sub2_13.anInt2003) + 2;
		this.anInt2689 = this.aClass49_Sub2_13.anInt2003 + 7 - this.aClass64_Sub1_1.anInt2932;
		this.aByteArray53 = new byte[this.anInt2693 * this.anInt2692];
		this.anInt2688 = this.aClass64_Sub1_1.anInt2934 >> this.anInt2689;
		this.anInt2690 = this.aClass64_Sub1_1.anInt2928 >> this.anInt2689;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILclient!ba;)V")
	public void method2109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub5_Sub1 arg2) {
		@Pc(6) Class2_Sub5_Sub1_Sub1 local6 = (Class2_Sub5_Sub1_Sub1) arg2;
		arg0 += local6.anInt2554 + 1;
		arg1 += local6.anInt2551 + 1;
		@Pc(27) int local27 = arg1 + arg0 * this.anInt2693;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2550;
		@Pc(35) int local35 = local6.anInt2547;
		@Pc(40) int local40 = this.anInt2693 - local35;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local27 += local49 * this.anInt2693;
			local32 -= local49;
			local29 = local49 * local35;
			arg0 = 1;
		}
		if (this.anInt2692 <= arg0 + local32) {
			local49 = local32 + arg0 + 1 - this.anInt2692;
			local32 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local29 += local49;
			local40 += local49;
			local27 += local49;
			arg1 = 1;
			local42 = local49;
			local35 -= local49;
		}
		if (arg1 + local35 >= this.anInt2693) {
			local49 = arg1 + local35 + 1 - this.anInt2693;
			local42 += local49;
			local40 += local49;
			local35 -= local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static335.method760(local6.aByteArray50, local40, this.aByteArray53, local42, local27, local32, local29, local35);
			this.method2115(arg0, arg1, local32, local35);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!ba;I)V")
	public void method2110(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub5_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub5_Sub1_Sub1 local6 = (Class2_Sub5_Sub1_Sub1) arg1;
		arg2 += local6.anInt2551 + 1;
		arg0 += local6.anInt2554 + 1;
		@Pc(27) int local27 = arg2 + arg0 * this.anInt2693;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2550;
		@Pc(35) int local35 = local6.anInt2547;
		@Pc(41) int local41 = this.anInt2693 - local35;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local29 = local51 * local35;
			arg0 = 1;
			local27 += this.anInt2693 * local51;
			local32 -= local51;
		}
		@Pc(72) int local72 = 0;
		if (this.anInt2692 <= local32 + arg0) {
			local51 = arg0 + local32 + 1 - this.anInt2692;
			local32 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local41 += local51;
			local35 -= local51;
			local72 = local51;
			local27 += local51;
			local29 += local51;
			arg2 = 1;
		}
		if (this.anInt2693 <= local35 + arg2) {
			local51 = local35 + arg2 + 1 - this.anInt2693;
			local41 += local51;
			local72 += local51;
			local35 -= local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static37.method608(local29, local35, local6.aByteArray50, this.aByteArray53, local27, local32, local41, local72);
			this.method2115(arg0, arg2, local32, local35);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public void method2112() {
		this.aClass149ArrayArray1 = new Class149[this.anInt2688][this.anInt2690];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2690; local14++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt2688; local23++) {
				this.aClass149ArrayArray1[local23][local14] = new Class149(this.aClass49_Sub2_13, this, this.aClass64_Sub1_1, local23, local14, this.anInt2689, local23 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ba;IIB)Z")
	public boolean method2113(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub5_Sub1_Sub1 local6 = (Class2_Sub5_Sub1_Sub1) arg0;
		arg2 += local6.anInt2554 + 1;
		arg1 += local6.anInt2551 + 1;
		@Pc(27) int local27 = arg2 * this.anInt2693 + arg1;
		@Pc(30) int local30 = local6.anInt2550;
		@Pc(33) int local33 = local6.anInt2547;
		@Pc(39) int local39 = this.anInt2693 - local33;
		@Pc(46) int local46;
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			arg2 = 1;
			local27 += local46 * this.anInt2693;
			local30 -= local46;
		}
		if (this.anInt2692 <= arg2 + local30) {
			local46 = arg2 + local30 + 1 - this.anInt2692;
			local30 -= local46;
		}
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			arg1 = 1;
			local33 -= local46;
			local39 += local46;
			local27 += local46;
		}
		if (arg1 + local33 >= this.anInt2693) {
			local46 = arg1 + local33 + 1 - this.anInt2693;
			local33 -= local46;
			local39 += local46;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt2693 * 7;
			return Static227.method3555(local33, local30, local39, local27, this.aByteArray53);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[[ZZB)V")
	public void method2114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.aClass49_Sub2_13.method1587(false);
		this.aClass49_Sub2_13.method1635(false);
		this.aClass49_Sub2_13.method1594(-2);
		this.aClass49_Sub2_13.method1624(1);
		this.aClass49_Sub2_13.method1626(1);
		@Pc(44) float local44 = 1.0F / (float) (this.aClass49_Sub2_13.anInt2004 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(73) int local73;
		@Pc(80) int local80;
		if (arg4) {
			for (local48 = 0; local48 < this.anInt2690; local48++) {
				local55 = local48 << this.anInt2689;
				local62 = local48 + 1 << this.anInt2689;
				label81: for (local64 = 0; local64 < this.anInt2688; local64++) {
					local68 = local64 << this.anInt2689;
					local73 = local64 + 1 << this.anInt2689;
					for (local80 = local68; local80 < local73; local80++) {
						if (-arg1 <= local80 - arg2 && local80 - arg2 <= arg1) {
							for (@Pc(335) int local335 = local55; local335 < local62; local335++) {
								if (-arg1 <= local335 - arg0 && arg1 >= local335 - arg0 && arg3[arg1 + local80 - arg2][local335 + arg1 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local44, local44, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass149ArrayArray1[local64][local48].method3373();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt2690; local48++) {
				local55 = local48 << this.anInt2689;
				local62 = local48 + 1 << this.anInt2689;
				for (local64 = 0; local64 < this.anInt2688; local64++) {
					local68 = 0;
					local73 = local64 << this.anInt2689;
					local80 = local64 + 1 << this.anInt2689;
					@Pc(82) Class2_Sub23 local82 = Static92.aClass2_Sub23_5;
					local82.anInt6952 = 0;
					for (@Pc(87) int local87 = local55; local87 < local62; local87++) {
						if (-arg1 <= local87 - arg0 && arg1 >= local87 - arg0) {
							@Pc(119) int local119 = this.aClass64_Sub1_1.anInt2934 * local87 + local73;
							for (@Pc(121) int local121 = local73; local121 < local80; local121++) {
								if (local121 - arg2 >= -arg1 && arg1 >= local121 - arg2 && arg3[arg1 + local121 - arg2][arg1 + local87 - arg0]) {
									@Pc(162) short[] local162 = this.aClass64_Sub1_1.aShortArrayArray3[local119];
									if (local162 != null) {
										@Pc(170) int local170;
										if (this.aClass49_Sub2_13.aBoolean111) {
											for (local170 = 0; local170 < local162.length; local170++) {
												local82.method5502(local162[local170] & 0xFFFF);
												local68++;
											}
										} else {
											for (local170 = 0; local170 < local162.length; local170++) {
												local82.method5457(local162[local170] & 0xFFFF);
												local68++;
											}
										}
									}
								}
								local119++;
							}
						}
					}
					if (local68 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local44, local44, 1.0F);
						OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass149ArrayArray1[local64][local48].method3370(local82.aByteArray130, local68);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIB)V")
	private void method2115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass149ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg0 - 1 >> 7;
		@Pc(46) int local46 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local25; local48++) {
			@Pc(55) Class149[] local55 = this.aClass149ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				local55[local57].aBoolean304 = true;
			}
		}
	}
}
