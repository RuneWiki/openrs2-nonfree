import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class53 {

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "[[Lclient!ul;")
	private Class199[][] aClass199ArrayArray1;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_12;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "Lclient!ag;")
	private final Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
	public final int anInt1602;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
	private final int anInt1598;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
	private final int anInt1599;

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
	private final int anInt1601;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
	private final int anInt1600;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!hd;Lclient!ag;)V")
	public Class53(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Class8_Sub1 arg1) {
		this.aClass89_Sub1_12 = arg0;
		this.aClass8_Sub1_1 = arg1;
		this.anInt1602 = (this.aClass8_Sub1_1.anInt4755 * this.aClass8_Sub1_1.anInt151 >> this.aClass89_Sub1_12.anInt2607) + 2;
		this.anInt1598 = (this.aClass8_Sub1_1.anInt151 * this.aClass8_Sub1_1.anInt4760 >> this.aClass89_Sub1_12.anInt2607) + 2;
		this.aByteArray19 = new byte[this.anInt1598 * this.anInt1602];
		this.anInt1599 = this.aClass89_Sub1_12.anInt2607 + 7 - this.aClass8_Sub1_1.anInt147;
		this.anInt1601 = this.aClass8_Sub1_1.anInt4755 >> this.anInt1599;
		this.anInt1600 = this.aClass8_Sub1_1.anInt4760 >> this.anInt1599;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIBI)V")
	private void method1284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass199ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg0 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg0 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg1 - 1 >> 7;
		@Pc(43) int local43 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local16; local45 <= local26; local45++) {
			@Pc(57) Class199[] local57 = this.aClass199ArrayArray1[local45];
			for (@Pc(59) int local59 = local32; local59 <= local43; local59++) {
				local57[local59].aBoolean448 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZLclient!ug;I)V")
	public void method1286(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub1_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class7_Sub1_Sub4_Sub1 local2 = (Class7_Sub1_Sub4_Sub1) arg1;
		arg2 += local2.anInt616 + 1;
		arg0 += local2.anInt619 + 1;
		@Pc(23) int local23 = arg2 * this.anInt1602 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt617;
		@Pc(31) int local31 = local2.anInt618;
		@Pc(37) int local37 = this.anInt1602 - local31;
		@Pc(39) int local39 = 0;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local23 += local48 * this.anInt1602;
			local28 -= local48;
			local25 = local31 * local48;
			arg2 = 1;
		}
		if (this.anInt1598 <= local28 + arg2) {
			local48 = local28 + arg2 + 1 - this.anInt1598;
			local28 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			arg0 = 1;
			local39 = local48;
			local31 -= local48;
			local23 += local48;
			local25 += local48;
			local37 += local48;
		}
		if (arg0 + local31 >= this.anInt1602) {
			local48 = local31 + arg0 + 1 - this.anInt1602;
			local39 += local48;
			local37 += local48;
			local31 -= local48;
		}
		if (local31 > 0 && local28 > 0) {
			Static357.method1292(local25, local2.aByteArray9, this.aByteArray19, local39, local28, local31, local37, local23);
			this.method1284(arg0, arg2, local31, local28);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZI[[ZI)V")
	public void method1287(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_12.anOpengl2;
		this.aClass89_Sub1_12.method2459();
		this.aClass89_Sub1_12.method2407(false);
		this.aClass89_Sub1_12.method2424(false);
		this.aClass89_Sub1_12.method2438();
		this.aClass89_Sub1_12.method2425(0);
		this.aClass89_Sub1_12.method2403(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass89_Sub1_12.anInt2601 * 128);
		@Pc(47) int local47;
		@Pc(56) int local56;
		@Pc(63) int local63;
		@Pc(65) int local65;
		@Pc(75) int local75;
		@Pc(80) int local80;
		@Pc(87) int local87;
		@Pc(92) int local92;
		if (arg1) {
			for (local47 = 0; local47 < this.anInt1600; local47++) {
				local56 = local47 << this.anInt1599;
				local63 = local47 + 1 << this.anInt1599;
				label86: for (local65 = 0; local65 < this.anInt1601; local65++) {
					local75 = local65 << this.anInt1599;
					local80 = local65 + 1 << this.anInt1599;
					for (local87 = local75; local87 < local80; local87++) {
						if (local87 - arg4 >= -arg2 && local87 - arg4 <= arg2) {
							for (local92 = local56; local92 < local63; local92++) {
								if (local92 - arg0 >= -arg2 && arg2 >= local92 - arg0 && arg3[arg2 + local87 - arg4][local92 + arg2 - arg0]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local43, local43, 1.0F);
									local3.glTranslatef((float) -local65 / local43, (float) -local47 / local43, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass199ArrayArray1[local65][local47].method5191();
									continue label86;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt1600; local47++) {
				local56 = local47 << this.anInt1599;
				local63 = local47 + 1 << this.anInt1599;
				for (local65 = 0; local65 < this.anInt1601; local65++) {
					local75 = 0;
					local80 = local65 << this.anInt1599;
					local87 = local65 + 1 << this.anInt1599;
					Static7.aClass7_Sub3_1.anInt3005 = 0;
					for (local92 = local56; local92 < local63; local92++) {
						if (-arg2 <= local92 - arg0 && arg2 >= local92 - arg0) {
							@Pc(125) int local125 = local80 + local92 * this.aClass8_Sub1_1.anInt4755;
							for (@Pc(127) int local127 = local80; local127 < local87; local127++) {
								if (local127 - arg4 >= -arg2 && arg2 >= local127 - arg4 && arg3[arg2 + local127 - arg4][local92 + arg2 - arg0]) {
									@Pc(169) short[] local169 = this.aClass8_Sub1_1.aShortArrayArray1[local125];
									if (local169 != null) {
										@Pc(178) int local178;
										if (this.aClass89_Sub1_12.aBoolean195) {
											for (local178 = 0; local178 < local169.length; local178++) {
												local75++;
												Static7.aClass7_Sub3_1.method2788(local169[local178]);
											}
										} else {
											for (local178 = 0; local178 < local169.length; local178++) {
												Static7.aClass7_Sub3_1.method2753(local169[local178]);
												local75++;
											}
										}
									}
								}
								local125++;
							}
						}
					}
					if (local75 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local43, local43, 1.0F);
						local3.glTranslatef((float) -local65 / local43, (float) -local47 / local43, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass89_Sub1_12.anInterface9_3.method5712(Static7.aClass7_Sub3_1.aByteArray33, local75 * 2);
						this.aClass199ArrayArray1[local65][local47].method5189(this.aClass89_Sub1_12.anInterface9_3, local75);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!ug;II)V")
	public void method1288(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class7_Sub1_Sub4_Sub1 local2 = (Class7_Sub1_Sub4_Sub1) arg1;
		arg2 += local2.anInt619 + 1;
		arg0 += local2.anInt616 + 1;
		@Pc(23) int local23 = this.anInt1602 * arg0 + arg2;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt617;
		@Pc(31) int local31 = local2.anInt618;
		@Pc(36) int local36 = this.anInt1602 - local31;
		@Pc(47) int local47;
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local25 = local31 * local47;
			arg0 = 1;
			local23 += local47 * this.anInt1602;
			local28 -= local47;
		}
		@Pc(68) int local68 = 0;
		if (arg0 + local28 >= this.anInt1598) {
			local47 = local28 + arg0 + 1 - this.anInt1598;
			local28 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			arg2 = 1;
			local36 += local47;
			local68 = local47;
			local31 -= local47;
			local25 += local47;
			local23 += local47;
		}
		if (local31 + arg2 >= this.anInt1602) {
			local47 = arg2 + local31 + 1 - this.anInt1602;
			local36 += local47;
			local31 -= local47;
			local68 += local47;
		}
		if (local31 > 0 && local28 > 0) {
			Static357.method1285(local2.aByteArray9, local25, local36, local68, this.aByteArray19, local23, local28, local31);
			this.method1284(arg2, arg0, local31, local28);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public void method1290() {
		this.aClass199ArrayArray1 = new Class199[this.anInt1601][this.anInt1600];
		for (@Pc(8) int local8 = 0; local8 < this.anInt1600; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt1601; local14++) {
				this.aClass199ArrayArray1[local14][local8] = new Class199(this.aClass89_Sub1_12, this, this.aClass8_Sub1_1, local14, local8, this.anInt1599, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(ILclient!ug;II)Z")
	public boolean method1291(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub1_Sub4 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class7_Sub1_Sub4_Sub1 local2 = (Class7_Sub1_Sub4_Sub1) arg1;
		arg0 += local2.anInt619 + 1;
		arg2 += local2.anInt616 + 1;
		@Pc(23) int local23 = arg0 + arg2 * this.anInt1602;
		@Pc(26) int local26 = local2.anInt617;
		@Pc(29) int local29 = local2.anInt618;
		@Pc(34) int local34 = this.anInt1602 - local29;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local23 += this.anInt1602 * local50;
			local26 -= local50;
			arg2 = 1;
		}
		if (this.anInt1598 <= local26 + arg2) {
			local50 = arg2 + local26 + 1 - this.anInt1598;
			local26 -= local50;
		}
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local23 += local50;
			arg0 = 1;
			local29 -= local50;
			local34 += local50;
		}
		if (this.anInt1602 <= local29 + arg0) {
			local50 = local29 + arg0 + 1 - this.anInt1602;
			local29 -= local50;
			local34 += local50;
		}
		if (local29 > 0 && local26 > 0) {
			local34 += this.anInt1602 * 7;
			return Static357.method1289(local23, this.aByteArray19, local29, local34, local26);
		} else {
			return false;
		}
	}
}
