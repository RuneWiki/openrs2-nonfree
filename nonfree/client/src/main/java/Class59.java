import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class59 {

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "[[Lclient!rg;")
	private Class206[][] aClass206ArrayArray1;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Lclient!wv;")
	private final Class154_Sub2 aClass154_Sub2_1;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_14;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	public final int anInt1669;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
	private final int anInt1665;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "[B")
	public final byte[] aByteArray12;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
	private final int anInt1674;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	private final int anInt1666;

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
	private final int anInt1670;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!da;Lclient!wv;)V")
	public Class59(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class154_Sub2 arg1) {
		this.aClass154_Sub2_1 = arg1;
		this.aClass50_Sub1_14 = arg0;
		this.anInt1669 = (this.aClass154_Sub2_1.anInt7615 * this.aClass154_Sub2_1.anInt7614 >> this.aClass50_Sub1_14.anInt1404) + 2;
		this.anInt1665 = (this.aClass154_Sub2_1.anInt7616 * this.aClass154_Sub2_1.anInt7615 >> this.aClass50_Sub1_14.anInt1404) + 2;
		this.aByteArray12 = new byte[this.anInt1665 * this.anInt1669];
		this.anInt1674 = this.aClass50_Sub1_14.anInt1404 + 7 - this.aClass154_Sub2_1.anInt7617;
		this.anInt1666 = this.aClass154_Sub2_1.anInt7614 >> this.anInt1674;
		this.anInt1670 = this.aClass154_Sub2_1.anInt7616 >> this.anInt1674;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZ[[ZBII)V")
	public void method1514(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass50_Sub1_14.method1298(false);
		this.aClass50_Sub1_14.method1331(false);
		this.aClass50_Sub1_14.method1318(-2);
		this.aClass50_Sub1_14.method1256(1);
		this.aClass50_Sub1_14.method1279(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass50_Sub1_14.anInt1402 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(73) int local73;
		@Pc(80) int local80;
		if (arg1) {
			for (local48 = 0; local48 < this.anInt1670; local48++) {
				local55 = local48 << this.anInt1674;
				local62 = local48 + 1 << this.anInt1674;
				label81: for (local64 = 0; local64 < this.anInt1666; local64++) {
					local68 = local64 << this.anInt1674;
					local73 = local64 + 1 << this.anInt1674;
					for (local80 = local68; local80 < local73; local80++) {
						if (local80 - arg0 >= -arg3 && arg3 >= local80 - arg0) {
							for (@Pc(322) int local322 = local55; local322 < local62; local322++) {
								if (local322 - arg4 >= -arg3 && local322 - arg4 <= arg3 && arg2[arg3 + local80 - arg0][local322 + arg3 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local39, (float) -local48 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass206ArrayArray1[local64][local48].method4714();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt1670; local48++) {
				local55 = local48 << this.anInt1674;
				local62 = local48 + 1 << this.anInt1674;
				for (local64 = 0; local64 < this.anInt1666; local64++) {
					local68 = 0;
					local73 = local64 << this.anInt1674;
					local80 = local64 + 1 << this.anInt1674;
					@Pc(84) Class10_Sub8_Sub1 local84 = this.aClass50_Sub1_14.aClass10_Sub8_Sub1_2;
					local84.anInt2989 = 0;
					for (@Pc(89) int local89 = local55; local89 < local62; local89++) {
						if (-arg3 <= local89 - arg4 && local89 - arg4 <= arg3) {
							@Pc(117) int local117 = this.aClass154_Sub2_1.anInt7614 * local89 + local73;
							for (@Pc(119) int local119 = local73; local119 < local80; local119++) {
								if (-arg3 <= local119 - arg0 && local119 - arg0 <= arg3 && arg2[local119 + arg3 - arg0][arg3 + local89 - arg4]) {
									@Pc(163) short[] local163 = this.aClass154_Sub2_1.aShortArrayArray10[local117];
									if (local163 != null) {
										@Pc(171) int local171;
										if (this.aClass50_Sub1_14.aBoolean99) {
											for (local171 = 0; local171 < local163.length; local171++) {
												local84.method2509(local163[local171] & 0xFFFF);
												local68++;
											}
										} else {
											for (local171 = 0; local171 < local163.length; local171++) {
												local84.method2496(local163[local171] & 0xFFFF);
												local68++;
											}
										}
									}
								}
								local117++;
							}
						}
					}
					if (local68 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local64 / local39, (float) -local48 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass206ArrayArray1[local64][local48].method4716(local68, local84.aByteArray44);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
	public void method1517() {
		this.aClass206ArrayArray1 = new Class206[this.anInt1666][this.anInt1670];
		for (@Pc(20) int local20 = 0; local20 < this.anInt1670; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt1666; local24++) {
				this.aClass206ArrayArray1[local24][local20] = new Class206(this.aClass50_Sub1_14, this, this.aClass154_Sub2_1, local24, local20, this.anInt1674, local24 * 128 + 1, local20 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!i;B)Z")
	public boolean method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub1_Sub7 arg2) {
		@Pc(6) Class10_Sub1_Sub7_Sub1 local6 = (Class10_Sub1_Sub7_Sub1) arg2;
		arg0 += local6.anInt6635 + 1;
		arg1 += local6.anInt6636 + 1;
		@Pc(27) int local27 = this.anInt1669 * arg1 + arg0;
		@Pc(30) int local30 = local6.anInt6643;
		@Pc(33) int local33 = local6.anInt6642;
		@Pc(38) int local38 = this.anInt1669 - local33;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local30 -= local48;
			arg1 = 1;
			local27 += local48 * this.anInt1669;
		}
		if (arg1 + local30 >= this.anInt1665) {
			local48 = local30 + arg1 + 1 - this.anInt1665;
			local30 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local33 -= local48;
			local27 += local48;
			arg0 = 1;
			local38 += local48;
		}
		if (this.anInt1669 <= local33 + arg0) {
			local48 = local33 + arg0 + 1 - this.anInt1669;
			local38 += local48;
			local33 -= local48;
		}
		if (local33 > 0 && local30 > 0) {
			local38 += this.anInt1669 * 7;
			return Static273.method3839(local30, local38, local27, local33, this.aByteArray12);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!i;III)V")
	public void method1519(@OriginalArg(0) Class10_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class10_Sub1_Sub7_Sub1 local6 = (Class10_Sub1_Sub7_Sub1) arg0;
		arg1 += local6.anInt6636 + 1;
		arg2 += local6.anInt6635 + 1;
		@Pc(27) int local27 = arg2 + arg1 * this.anInt1669;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6643;
		@Pc(39) int local39 = local6.anInt6642;
		@Pc(45) int local45 = this.anInt1669 - local39;
		@Pc(55) int local55;
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local32 -= local55;
			local29 = local39 * local55;
			local27 += this.anInt1669 * local55;
			arg1 = 1;
		}
		@Pc(76) int local76 = 0;
		if (arg1 + local32 >= this.anInt1665) {
			local55 = arg1 + local32 + 1 - this.anInt1665;
			local32 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local39 -= local55;
			local29 += local55;
			local76 = local55;
			local27 += local55;
			arg2 = 1;
			local45 += local55;
		}
		if (arg2 + local39 >= this.anInt1669) {
			local55 = local39 + arg2 + 1 - this.anInt1669;
			local76 += local55;
			local45 += local55;
			local39 -= local55;
		}
		if (local39 > 0 && local32 > 0) {
			Static383.method5150(local32, local39, local6.aByteArray86, this.aByteArray12, local76, local29, local27, local45);
			this.method1523(local39, arg1, arg2, local32);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!i;II)V")
	public void method1522(@OriginalArg(1) Class10_Sub1_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class10_Sub1_Sub7_Sub1 local6 = (Class10_Sub1_Sub7_Sub1) arg0;
		arg2 += local6.anInt6636 + 1;
		arg1 += local6.anInt6635 + 1;
		@Pc(27) int local27 = this.anInt1669 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6643;
		@Pc(35) int local35 = local6.anInt6642;
		@Pc(41) int local41 = this.anInt1669 - local35;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local32 -= local50;
			arg2 = 1;
			local29 = local50 * local35;
			local27 += local50 * this.anInt1669;
		}
		@Pc(71) int local71 = 0;
		if (local32 + arg2 >= this.anInt1665) {
			local50 = local32 + arg2 + 1 - this.anInt1665;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			arg1 = 1;
			local71 = local50;
			local29 += local50;
			local35 -= local50;
			local27 += local50;
			local41 += local50;
		}
		if (local35 + arg1 >= this.anInt1669) {
			local50 = local35 + arg1 + 1 - this.anInt1669;
			local41 += local50;
			local71 += local50;
			local35 -= local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static342.method4608(local41, local29, local32, local71, local35, local27, this.aByteArray12, local6.aByteArray86);
			this.method1523(local35, arg2, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V")
	private void method1523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass206ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(30) int local30 = arg0 + arg2 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg1 - 1 >> 7;
		@Pc(46) int local46 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local30; local48++) {
			@Pc(55) Class206[] local55 = this.aClass206ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				local55[local57].aBoolean384 = true;
			}
		}
	}
}
