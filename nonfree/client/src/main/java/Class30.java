import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class30 {

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "[[Lclient!fr;")
	private Class86[][] aClass86ArrayArray1;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "Lclient!us;")
	private final Class139_Sub2 aClass139_Sub2_2;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_5;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
	public final int anInt502;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	private final int anInt504;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	private final int anInt505;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "[B")
	public final byte[] aByteArray6;

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
	private final int anInt511;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
	private final int anInt513;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!ih;Lclient!us;)V")
	public Class30(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class139_Sub2 arg1) {
		this.aClass139_Sub2_2 = arg1;
		this.aClass117_Sub1_5 = arg0;
		this.anInt502 = (this.aClass139_Sub2_2.anInt6760 * this.aClass139_Sub2_2.anInt6757 >> this.aClass117_Sub1_5.anInt3091) + 2;
		this.anInt504 = (this.aClass139_Sub2_2.anInt6760 * this.aClass139_Sub2_2.anInt6758 >> this.aClass117_Sub1_5.anInt3091) + 2;
		this.anInt505 = this.aClass117_Sub1_5.anInt3091 + 7 - this.aClass139_Sub2_2.anInt6759;
		this.aByteArray6 = new byte[this.anInt502 * this.anInt504];
		this.anInt511 = this.aClass139_Sub2_2.anInt6757 >> this.anInt505;
		this.anInt513 = this.aClass139_Sub2_2.anInt6758 >> this.anInt505;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIII)V")
	private void method465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass86ArrayArray1 == null) {
			return;
		}
		@Pc(19) int local19 = arg3 - 1 >> 7;
		@Pc(29) int local29 = arg2 + arg3 - 1 - 1 >> 7;
		@Pc(35) int local35 = arg0 - 1 >> 7;
		@Pc(46) int local46 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local19; local48 <= local29; local48++) {
			@Pc(55) Class86[] local55 = this.aClass86ArrayArray1[local48];
			for (@Pc(57) int local57 = local35; local57 <= local46; local57++) {
				local55[local57].aBoolean196 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!i;IBI)V")
	public void method466(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub3_Sub11_Sub1 local10 = (Class1_Sub3_Sub11_Sub1) arg0;
		arg1 += local10.anInt4083 + 1;
		arg2 += local10.anInt4085 + 1;
		@Pc(31) int local31 = arg1 + this.anInt502 * arg2;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local10.anInt4090;
		@Pc(39) int local39 = local10.anInt4092;
		@Pc(45) int local45 = this.anInt502 - local39;
		@Pc(52) int local52;
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			local31 += this.anInt502 * local52;
			local33 = local52 * local39;
			arg2 = 1;
			local36 -= local52;
		}
		@Pc(73) int local73 = 0;
		if (arg2 + local36 >= this.anInt504) {
			local52 = local36 + arg2 + 1 - this.anInt504;
			local36 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local33 += local52;
			arg1 = 1;
			local31 += local52;
			local45 += local52;
			local73 = local52;
			local39 -= local52;
		}
		if (this.anInt502 <= arg1 + local39) {
			local52 = arg1 + local39 + 1 - this.anInt502;
			local39 -= local52;
			local73 += local52;
			local45 += local52;
		}
		if (local39 > 0 && local36 > 0) {
			Static117.method1469(local39, local45, local73, local10.aByteArray41, local33, local31, this.aByteArray6, local36);
			this.method465(arg2, local36, local39, arg1);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public void method467() {
		this.aClass86ArrayArray1 = new Class86[this.anInt511][this.anInt513];
		for (@Pc(18) int local18 = 0; local18 < this.anInt513; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt511; local22++) {
				this.aClass86ArrayArray1[local22][local18] = new Class86(this.aClass117_Sub1_5, this, this.aClass139_Sub2_2, local22, local18, this.anInt505, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBLclient!i;)Z")
	public boolean method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub3_Sub11 arg2) {
		@Pc(6) Class1_Sub3_Sub11_Sub1 local6 = (Class1_Sub3_Sub11_Sub1) arg2;
		arg1 += local6.anInt4083 + 1;
		arg0 += local6.anInt4085 + 1;
		@Pc(33) int local33 = arg1 + this.anInt502 * arg0;
		@Pc(36) int local36 = local6.anInt4090;
		@Pc(39) int local39 = local6.anInt4092;
		@Pc(44) int local44 = this.anInt502 - local39;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			arg0 = 1;
			local33 += local51 * this.anInt502;
			local36 -= local51;
		}
		if (arg0 + local36 >= this.anInt504) {
			local51 = local36 + arg0 + 1 - this.anInt504;
			local36 -= local51;
		}
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local33 += local51;
			arg1 = 1;
			local44 += local51;
			local39 -= local51;
		}
		if (arg1 + local39 >= this.anInt502) {
			local51 = arg1 + local39 + 1 - this.anInt502;
			local39 -= local51;
			local44 += local51;
		}
		if (local39 > 0 && local36 > 0) {
			local44 += this.anInt502 * 7;
			return Static203.method2956(local36, local39, local33, local44, this.aByteArray6);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([[ZBIIIZ)V")
	public void method469(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass117_Sub1_5.method2498(false);
		this.aClass117_Sub1_5.method2469(false);
		this.aClass117_Sub1_5.method2531(-2);
		this.aClass117_Sub1_5.method2535(1);
		this.aClass117_Sub1_5.method2503(1);
		@Pc(46) float local46 = 1.0F / (float) (this.aClass117_Sub1_5.anInt3093 * 128);
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(64) int local64;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(75) int local75;
		@Pc(82) int local82;
		if (arg4) {
			for (local50 = 0; local50 < this.anInt513; local50++) {
				local57 = local50 << this.anInt505;
				local64 = local50 + 1 << this.anInt505;
				label81: for (local66 = 0; local66 < this.anInt511; local66++) {
					local70 = local66 << this.anInt505;
					local75 = local66 + 1 << this.anInt505;
					for (local82 = local70; local82 < local75; local82++) {
						if (-arg3 <= local82 - arg2 && arg3 >= local82 - arg2) {
							for (@Pc(337) int local337 = local57; local337 < local64; local337++) {
								if (local337 - arg1 >= -arg3 && arg3 >= local337 - arg1 && arg0[arg3 + local82 - arg2][arg3 + local337 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local46, local46, 1.0F);
									OpenGL.glTranslatef((float) -local66 / local46, (float) -local50 / local46, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass86ArrayArray1[local66][local50].method1523();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local50 = 0; local50 < this.anInt513; local50++) {
				local57 = local50 << this.anInt505;
				local64 = local50 + 1 << this.anInt505;
				for (local66 = 0; local66 < this.anInt511; local66++) {
					local70 = 0;
					local75 = local66 << this.anInt505;
					local82 = local66 + 1 << this.anInt505;
					@Pc(86) Class1_Sub19_Sub1 local86 = this.aClass117_Sub1_5.aClass1_Sub19_Sub1_2;
					local86.anInt3698 = 0;
					for (@Pc(91) int local91 = local57; local91 < local64; local91++) {
						if (local91 - arg1 >= -arg3 && arg3 >= local91 - arg1) {
							@Pc(118) int local118 = local91 * this.aClass139_Sub2_2.anInt6757 + local75;
							for (@Pc(120) int local120 = local75; local120 < local82; local120++) {
								if (local120 - arg2 >= -arg3 && local120 - arg2 <= arg3 && arg0[local120 + arg3 - arg2][arg3 + local91 - arg1]) {
									@Pc(160) short[] local160 = this.aClass139_Sub2_2.aShortArrayArray8[local118];
									if (local160 != null) {
										@Pc(168) int local168;
										if (this.aClass117_Sub1_5.aBoolean291) {
											for (local168 = 0; local168 < local160.length; local168++) {
												local86.method2930(local160[local168] & 0xFFFF);
												local70++;
											}
										} else {
											for (local168 = 0; local168 < local160.length; local168++) {
												local70++;
												local86.method2936(local160[local168] & 0xFFFF);
											}
										}
									}
								}
								local118++;
							}
						}
					}
					if (local70 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local46, local46, 1.0F);
						OpenGL.glTranslatef((float) -local66 / local46, (float) -local50 / local46, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass86ArrayArray1[local66][local50].method1520(local86.aByteArray38, local70);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!i;III)V")
	public void method470(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class1_Sub3_Sub11_Sub1 local6 = (Class1_Sub3_Sub11_Sub1) arg0;
		arg2 += local6.anInt4083 + 1;
		arg1 += local6.anInt4085 + 1;
		@Pc(27) int local27 = arg1 * this.anInt502 + arg2;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local6.anInt4090;
		@Pc(39) int local39 = local6.anInt4092;
		@Pc(44) int local44 = this.anInt502 - local39;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53;
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			arg1 = 1;
			local33 = local39 * local53;
			local36 -= local53;
			local27 += this.anInt502 * local53;
		}
		if (arg1 + local36 >= this.anInt504) {
			local53 = local36 + arg1 + 1 - this.anInt504;
			local36 -= local53;
		}
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local44 += local53;
			local39 -= local53;
			local27 += local53;
			local33 += local53;
			local46 = local53;
			arg2 = 1;
		}
		if (this.anInt502 <= arg2 + local39) {
			local53 = local39 + arg2 + 1 - this.anInt502;
			local46 += local53;
			local44 += local53;
			local39 -= local53;
		}
		if (local39 > 0 && local36 > 0) {
			Static381.method4908(local33, local36, local39, this.aByteArray6, local44, local27, local46, local6.aByteArray41);
			this.method465(arg1, local36, local39, arg2);
		}
	}
}
