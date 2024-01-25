import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class236 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "[[Lclient!lq;")
	private Class152[][] aClass152ArrayArray1;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "Lclient!ui;")
	private final Class106_Sub2 aClass106_Sub2_2;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_34;

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
	public final int anInt6859;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
	private final int anInt6856;

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "[B")
	public final byte[] aByteArray189;

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	private final int anInt6852;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
	private final int anInt6858;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
	private final int anInt6854;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lclient!bo;Lclient!ui;)V")
	public Class236(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class106_Sub2 arg1) {
		this.aClass106_Sub2_2 = arg1;
		this.aClass26_Sub1_34 = arg0;
		this.anInt6859 = (this.aClass106_Sub2_2.anInt6997 * this.aClass106_Sub2_2.anInt6999 >> this.aClass26_Sub1_34.anInt924) + 2;
		this.anInt6856 = (this.aClass106_Sub2_2.anInt7001 * this.aClass106_Sub2_2.anInt6997 >> this.aClass26_Sub1_34.anInt924) + 2;
		this.aByteArray189 = new byte[this.anInt6859 * this.anInt6856];
		this.anInt6852 = this.aClass26_Sub1_34.anInt924 + 7 - this.aClass106_Sub2_2.anInt7000;
		this.anInt6858 = this.aClass106_Sub2_2.anInt6999 >> this.anInt6852;
		this.anInt6854 = this.aClass106_Sub2_2.anInt7001 >> this.anInt6852;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBILclient!j;)V")
	public void method5368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub9 arg2) {
		@Pc(6) Class2_Sub2_Sub9_Sub1 local6 = (Class2_Sub2_Sub9_Sub1) arg2;
		arg0 += local6.anInt7666 + 1;
		arg1 += local6.anInt7673 + 1;
		@Pc(28) int local28 = arg0 + this.anInt6859 * arg1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt7665;
		@Pc(36) int local36 = local6.anInt7670;
		@Pc(42) int local42 = this.anInt6859 - local36;
		if (arg1 <= 0) {
			@Pc(52) int local52 = 1 - arg1;
			local30 = local52 * local36;
			arg1 = 1;
			local33 -= local52;
			local28 += this.anInt6859 * local52;
		}
		@Pc(73) int local73 = 0;
		@Pc(100) int local100;
		if (this.anInt6856 <= local33 + arg1) {
			local100 = local33 + arg1 + 1 - this.anInt6856;
			local33 -= local100;
		}
		if (arg0 <= 0) {
			local100 = 1 - arg0;
			local73 = local100;
			local36 -= local100;
			local42 += local100;
			local28 += local100;
			local30 += local100;
			arg0 = 1;
		}
		if (this.anInt6859 <= local36 + arg0) {
			local100 = arg0 + local36 + 1 - this.anInt6859;
			local36 -= local100;
			local42 += local100;
			local73 += local100;
		}
		if (local36 > 0 && local33 > 0) {
			Static256.method3900(local33, this.aByteArray189, local6.aByteArray212, local30, local42, local73, local36, local28);
			this.method5372(local33, arg1, arg0, local36);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!j;IB)V")
	public void method5369(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub9 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub2_Sub9_Sub1 local6 = (Class2_Sub2_Sub9_Sub1) arg1;
		arg2 += local6.anInt7666 + 1;
		arg0 += local6.anInt7673 + 1;
		@Pc(27) int local27 = arg0 * this.anInt6859 + arg2;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local6.anInt7665;
		@Pc(43) int local43 = local6.anInt7670;
		@Pc(49) int local49 = this.anInt6859 - local43;
		@Pc(51) int local51 = 0;
		@Pc(61) int local61;
		if (arg0 <= 0) {
			local61 = 1 - arg0;
			local27 += local61 * this.anInt6859;
			arg0 = 1;
			local40 -= local61;
			local37 = local61 * local43;
		}
		if (this.anInt6856 <= local40 + arg0) {
			local61 = arg0 + local40 + 1 - this.anInt6856;
			local40 -= local61;
		}
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			arg2 = 1;
			local43 -= local61;
			local27 += local61;
			local51 = local61;
			local37 += local61;
			local49 += local61;
		}
		if (this.anInt6859 <= local43 + arg2) {
			local61 = arg2 + local43 + 1 - this.anInt6859;
			local51 += local61;
			local49 += local61;
			local43 -= local61;
		}
		if (local43 > 0 && local40 > 0) {
			Static373.method907(local37, local27, local43, local51, this.aByteArray189, local6.aByteArray212, local40, local49);
			this.method5372(local40, arg0, arg2, local43);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!j;III)Z")
	public boolean method5370(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub2_Sub9_Sub1 local6 = (Class2_Sub2_Sub9_Sub1) arg0;
		arg2 += local6.anInt7673 + 1;
		arg1 += local6.anInt7666 + 1;
		@Pc(27) int local27 = arg2 * this.anInt6859 + arg1;
		@Pc(35) int local35 = local6.anInt7665;
		@Pc(38) int local38 = local6.anInt7670;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local27 += this.anInt6859 * local47;
			arg2 = 1;
			local35 -= local47;
		}
		@Pc(66) int local66 = this.anInt6859 - local38;
		if (this.anInt6856 <= arg2 + local35) {
			local47 = arg2 + local35 + 1 - this.anInt6856;
			local35 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local66 += local47;
			arg1 = 1;
			local38 -= local47;
			local27 += local47;
		}
		if (this.anInt6859 <= local38 + arg1) {
			local47 = local38 + arg1 + 1 - this.anInt6859;
			local38 -= local47;
			local66 += local47;
		}
		if (local38 > 0 && local35 > 0) {
			local66 += this.anInt6859 * 7;
			return Static178.method2786(local35, local27, local66, this.aByteArray189, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIII)V")
	private void method5372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass152ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(42) int local42 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local25; local44++) {
			@Pc(51) Class152[] local51 = this.aClass152ArrayArray1[local44];
			for (@Pc(53) int local53 = local31; local53 <= local42; local53++) {
				local51[local53].aBoolean367 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBZI[[ZI)V")
	public void method5374(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass26_Sub1_34.method662(false);
		this.aClass26_Sub1_34.method644(false);
		this.aClass26_Sub1_34.method628(-2);
		this.aClass26_Sub1_34.method669(1);
		this.aClass26_Sub1_34.method671(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass26_Sub1_34.anInt923 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg1) {
			for (local43 = 0; local43 < this.anInt6854; local43++) {
				local50 = local43 << this.anInt6852;
				local57 = local43 + 1 << this.anInt6852;
				label128: for (local59 = 0; local59 < this.anInt6858; local59++) {
					local66 = local59 << this.anInt6852;
					local73 = local59 + 1 << this.anInt6852;
					for (local75 = local66; local75 < local73; local75++) {
						if (local75 - arg0 >= -arg4 && arg4 >= local75 - arg0) {
							for (@Pc(100) int local100 = local50; local100 < local57; local100++) {
								if (-arg4 <= local100 - arg2 && local100 - arg2 <= arg4 && arg3[arg4 + local75 - arg0][arg4 + local100 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass152ArrayArray1[local59][local43].method3533();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt6854; local43++) {
				local50 = local43 << this.anInt6852;
				local57 = local43 + 1 << this.anInt6852;
				for (local59 = 0; local59 < this.anInt6858; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt6852;
					local75 = local59 + 1 << this.anInt6852;
					@Pc(234) Class2_Sub20 local234 = Static188.aClass2_Sub20_3;
					local234.anInt4608 = 0;
					for (@Pc(239) int local239 = local50; local239 < local57; local239++) {
						if (local239 - arg2 >= -arg4 && arg4 >= local239 - arg2) {
							@Pc(265) int local265 = local73 + local239 * this.aClass106_Sub2_2.anInt6999;
							for (@Pc(267) int local267 = local73; local267 < local75; local267++) {
								if (local267 - arg0 >= -arg4 && local267 - arg0 <= arg4 && arg3[local267 + arg4 - arg0][local239 + arg4 - arg2]) {
									@Pc(307) short[] local307 = this.aClass106_Sub2_2.aShortArrayArray6[local265];
									if (local307 != null) {
										@Pc(315) int local315;
										if (this.aClass26_Sub1_34.aBoolean76) {
											for (local315 = 0; local315 < local307.length; local315++) {
												local66++;
												local234.method3745(local307[local315] & 0xFFFF);
											}
										} else {
											for (local315 = 0; local315 < local307.length; local315++) {
												local234.method3714(local307[local315] & 0xFFFF);
												local66++;
											}
										}
									}
								}
								local265++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass152ArrayArray1[local59][local43].method3532(local234.aByteArray136, local66);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	public void method5375() {
		this.aClass152ArrayArray1 = new Class152[this.anInt6858][this.anInt6854];
		for (@Pc(20) int local20 = 0; local20 < this.anInt6854; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt6858; local24++) {
				this.aClass152ArrayArray1[local24][local20] = new Class152(this.aClass26_Sub1_34, this, this.aClass106_Sub2_2, local24, local20, this.anInt6852, local24 * 128 + 1, local20 * 128 + 1);
			}
		}
	}
}
