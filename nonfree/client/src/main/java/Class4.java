import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "[I")
	public static final int[] anIntArray6 = new int[16384];

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "[I")
	public static final int[] anIntArray7 = new int[16384];

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "[[Lclient!sh;")
	private Class214[][] aClass214ArrayArray1;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!jt;")
	private final Class136_Sub1 aClass136_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public final int anInt185;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private final int anInt183;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	private final int anInt177;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	private final int anInt179;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private final int anInt180;

	static {
		@Pc(18) double local18 = 3.834951969714103E-4D;
		for (@Pc(20) int local20 = 0; local20 < 16384; local20++) {
			anIntArray7[local20] = (int) (Math.sin((double) local20 * local18) * 32768.0D);
			anIntArray6[local20] = (int) (Math.cos(local18 * (double) local20) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ht;Lclient!jt;)V")
	public Class4(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class136_Sub1 arg1) {
		this.aClass136_Sub1_1 = arg1;
		this.aClass109_Sub1_1 = arg0;
		this.anInt185 = (this.aClass136_Sub1_1.anInt7661 * this.aClass136_Sub1_1.anInt7662 >> this.aClass109_Sub1_1.anInt2976) + 2;
		this.anInt183 = (this.aClass136_Sub1_1.anInt7664 * this.aClass136_Sub1_1.anInt7661 >> this.aClass109_Sub1_1.anInt2976) + 2;
		this.anInt177 = this.aClass109_Sub1_1.anInt2976 + 7 - this.aClass136_Sub1_1.anInt7660;
		this.aByteArray3 = new byte[this.anInt185 * this.anInt183];
		this.anInt179 = this.aClass136_Sub1_1.anInt7662 >> this.anInt177;
		this.anInt180 = this.aClass136_Sub1_1.anInt7664 >> this.anInt177;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!j;II)V")
	public void method157(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub11 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub2_Sub11_Sub1 local6 = (Class1_Sub2_Sub11_Sub1) arg1;
		arg2 += local6.anInt4914 + 1;
		arg0 += local6.anInt4916 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt185;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4921;
		@Pc(35) int local35 = local6.anInt4918;
		@Pc(40) int local40 = this.anInt185 - local35;
		@Pc(42) int local42 = 0;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local32 -= local54;
			local29 = local54 * local35;
			arg2 = 1;
			local27 += this.anInt185 * local54;
		}
		if (this.anInt183 <= local32 + arg2) {
			local54 = arg2 + local32 + 1 - this.anInt183;
			local32 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local27 += local54;
			local40 += local54;
			arg0 = 1;
			local42 = local54;
			local29 += local54;
			local35 -= local54;
		}
		if (this.anInt185 <= local35 + arg0) {
			local54 = local35 + arg0 + 1 - this.anInt185;
			local35 -= local54;
			local40 += local54;
			local42 += local54;
		}
		if (local35 > 0 && local32 > 0) {
			Static362.method4962(local40, local35, local27, local42, local29, local32, this.aByteArray3, local6.aByteArray61);
			this.method160(local32, arg2, local35, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!j;III)Z")
	public boolean method158(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub2_Sub11_Sub1 local6 = (Class1_Sub2_Sub11_Sub1) arg0;
		arg1 += local6.anInt4916 + 1;
		arg2 += local6.anInt4914 + 1;
		@Pc(27) int local27 = this.anInt185 * arg2 + arg1;
		@Pc(30) int local30 = local6.anInt4921;
		@Pc(33) int local33 = local6.anInt4918;
		@Pc(43) int local43;
		if (arg2 <= 0) {
			local43 = 1 - arg2;
			local30 -= local43;
			arg2 = 1;
			local27 += local43 * this.anInt185;
		}
		@Pc(62) int local62 = this.anInt185 - local33;
		if (this.anInt183 <= arg2 + local30) {
			local43 = arg2 + local30 + 1 - this.anInt183;
			local30 -= local43;
		}
		if (arg1 <= 0) {
			local43 = 1 - arg1;
			arg1 = 1;
			local33 -= local43;
			local62 += local43;
			local27 += local43;
		}
		if (this.anInt185 <= local33 + arg1) {
			local43 = arg1 + local33 + 1 - this.anInt185;
			local33 -= local43;
			local62 += local43;
		}
		if (local33 > 0 && local30 > 0) {
			local62 += this.anInt185 * 7;
			return Static90.method1477(this.aByteArray3, local62, local33, local30, local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public void method159() {
		this.aClass214ArrayArray1 = new Class214[this.anInt179][this.anInt180];
		for (@Pc(19) int local19 = 0; local19 < this.anInt180; local19++) {
			for (@Pc(23) int local23 = 0; local23 < this.anInt179; local23++) {
				this.aClass214ArrayArray1[local23][local19] = new Class214(this.aClass109_Sub1_1, this, this.aClass136_Sub1_1, local23, local19, this.anInt177, local23 * 128 + 1, local19 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIB)V")
	private void method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass214ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(41) int local41 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local25; local48++) {
			@Pc(55) Class214[] local55 = this.aClass214ArrayArray1[local48];
			for (@Pc(57) int local57 = local31; local57 <= local41; local57++) {
				local55[local57].aBoolean403 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[[ZZI)V")
	public void method163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass109_Sub1_1.method2599(false);
		this.aClass109_Sub1_1.method2597(false);
		this.aClass109_Sub1_1.method2532(-2);
		this.aClass109_Sub1_1.method2531(1);
		this.aClass109_Sub1_1.method2522(1);
		@Pc(44) float local44 = 1.0F / (float) (this.aClass109_Sub1_1.anInt2975 * 128);
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(73) int local73;
		@Pc(80) int local80;
		if (arg3) {
			for (local48 = 0; local48 < this.anInt180; local48++) {
				local55 = local48 << this.anInt177;
				local62 = local48 + 1 << this.anInt177;
				label81: for (local64 = 0; local64 < this.anInt179; local64++) {
					local68 = local64 << this.anInt177;
					local73 = local64 + 1 << this.anInt177;
					for (local80 = local68; local80 < local73; local80++) {
						if (-arg0 <= local80 - arg1 && local80 - arg1 <= arg0) {
							for (@Pc(319) int local319 = local55; local319 < local62; local319++) {
								if (-arg0 <= local319 - arg4 && local319 - arg4 <= arg0 && arg2[arg0 + local80 - arg1][arg0 + local319 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local44, local44, 1.0F);
									OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass214ArrayArray1[local64][local48].method5026();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < this.anInt180; local48++) {
				local55 = local48 << this.anInt177;
				local62 = local48 + 1 << this.anInt177;
				for (local64 = 0; local64 < this.anInt179; local64++) {
					local68 = 0;
					local73 = local64 << this.anInt177;
					local80 = local64 + 1 << this.anInt177;
					@Pc(82) Class1_Sub1 local82 = Static406.aClass1_Sub1_7;
					local82.anInt5056 = 0;
					for (@Pc(87) int local87 = local55; local87 < local62; local87++) {
						if (local87 - arg4 >= -arg0 && local87 - arg4 <= arg0) {
							@Pc(110) int local110 = this.aClass136_Sub1_1.anInt7662 * local87 + local73;
							for (@Pc(112) int local112 = local73; local112 < local80; local112++) {
								if (local112 - arg1 >= -arg0 && local112 - arg1 <= arg0 && arg2[arg0 + local112 - arg1][local87 + arg0 - arg4]) {
									@Pc(153) short[] local153 = this.aClass136_Sub1_1.aShortArrayArray5[local110];
									if (local153 != null) {
										@Pc(161) int local161;
										if (this.aClass109_Sub1_1.aBoolean163) {
											for (local161 = 0; local161 < local153.length; local161++) {
												local82.method4101(local153[local161] & 0xFFFF);
												local68++;
											}
										} else {
											for (local161 = 0; local161 < local153.length; local161++) {
												local68++;
												local82.method4146(local153[local161] & 0xFFFF);
											}
										}
									}
								}
								local110++;
							}
						}
					}
					if (local68 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local44, local44, 1.0F);
						OpenGL.glTranslatef((float) -local64 / local44, (float) -local48 / local44, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass214ArrayArray1[local64][local48].method5028(local82.aByteArray66, local68);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!j;IIZ)V")
	public void method165(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub2_Sub11_Sub1 local6 = (Class1_Sub2_Sub11_Sub1) arg0;
		arg1 += local6.anInt4916 + 1;
		arg2 += local6.anInt4914 + 1;
		@Pc(27) int local27 = arg2 * this.anInt185 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4921;
		@Pc(35) int local35 = local6.anInt4918;
		@Pc(40) int local40 = this.anInt185 - local35;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			arg2 = 1;
			local32 -= local47;
			local29 = local35 * local47;
			local27 += local47 * this.anInt185;
		}
		@Pc(68) int local68 = 0;
		if (local32 + arg2 >= this.anInt183) {
			local47 = local32 + arg2 + 1 - this.anInt183;
			local32 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local27 += local47;
			local29 += local47;
			local35 -= local47;
			local40 += local47;
			arg1 = 1;
			local68 = local47;
		}
		if (local35 + arg1 >= this.anInt185) {
			local47 = arg1 + local35 + 1 - this.anInt185;
			local40 += local47;
			local68 += local47;
			local35 -= local47;
		}
		if (local35 > 0 && local32 > 0) {
			Static362.method4957(local68, local32, local27, this.aByteArray3, local29, local35, local6.aByteArray61, local40);
			this.method160(local32, arg2, local35, arg1);
		}
	}
}
