import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class98 {

	@OriginalMember(owner = "client!f", name = "k", descriptor = "[[Lclient!jfa;")
	private Class174[][] aClass174ArrayArray1;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Lclient!bda;")
	private final Class12_Sub2 aClass12_Sub2_1;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_11;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	public final int anInt2458;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	private final int anInt2447;

	@OriginalMember(owner = "client!f", name = "j", descriptor = "I")
	private final int anInt2450;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[B")
	public final byte[] aByteArray26;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private final int anInt2445;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	private final int anInt2453;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!pq;Lclient!bda;)V")
	public Class98(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) Class12_Sub2 arg1) {
		this.aClass12_Sub2_1 = arg1;
		this.aClass132_Sub3_11 = arg0;
		this.anInt2458 = (this.aClass12_Sub2_1.anInt9306 * this.aClass12_Sub2_1.anInt9314 >> this.aClass132_Sub3_11.anInt7879) + 2;
		this.anInt2447 = (this.aClass12_Sub2_1.anInt9313 * this.aClass12_Sub2_1.anInt9306 >> this.aClass132_Sub3_11.anInt7879) + 2;
		this.anInt2450 = this.aClass132_Sub3_11.anInt7879 + 7 - this.aClass12_Sub2_1.anInt9312;
		this.aByteArray26 = new byte[this.anInt2447 * this.anInt2458];
		this.anInt2445 = this.aClass12_Sub2_1.anInt9314 >> this.anInt2450;
		this.anInt2453 = this.aClass12_Sub2_1.anInt9313 >> this.anInt2450;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILclient!r;)V")
	public void method2097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub4_Sub5 arg2) {
		@Pc(6) Class6_Sub4_Sub5_Sub1 local6 = (Class6_Sub4_Sub5_Sub1) arg2;
		arg0 += local6.anInt2996 + 1;
		arg1 += local6.anInt2989 + 1;
		@Pc(27) int local27 = arg0 * this.anInt2458 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2990;
		@Pc(35) int local35 = local6.anInt2995;
		@Pc(40) int local40 = this.anInt2458 - local35;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local29 = local35 * local49;
			local27 += this.anInt2458 * local49;
			local32 -= local49;
			arg0 = 1;
		}
		if (arg0 + local32 >= this.anInt2447) {
			local49 = arg0 + local32 + 1 - this.anInt2447;
			local32 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local35 -= local49;
			local42 = local49;
			local40 += local49;
			local29 += local49;
			local27 += local49;
			arg1 = 1;
		}
		if (arg1 + local35 >= this.anInt2458) {
			@Pc(154) int local154 = arg1 + local35 + 1 - this.anInt2458;
			local40 += local154;
			local42 += local154;
			local35 -= local154;
		}
		if (local35 > 0 && local32 > 0) {
			Static79.method1383(local32, local40, local29, this.aByteArray26, local27, local35, local6.aByteArray33, local42);
			this.method2102(local35, arg0, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!r;III)V")
	public void method2100(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub4_Sub5_Sub1 local6 = (Class6_Sub4_Sub5_Sub1) arg0;
		arg1 += local6.anInt2989 + 1;
		arg2 += local6.anInt2996 + 1;
		@Pc(27) int local27 = arg2 * this.anInt2458 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2990;
		@Pc(43) int local43 = local6.anInt2995;
		@Pc(49) int local49 = this.anInt2458 - local43;
		@Pc(51) int local51 = 0;
		@Pc(61) int local61;
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local29 = local43 * local61;
			arg2 = 1;
			local32 -= local61;
			local27 += this.anInt2458 * local61;
		}
		if (arg2 + local32 >= this.anInt2447) {
			local61 = arg2 + local32 + 1 - this.anInt2447;
			local32 -= local61;
		}
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			local49 += local61;
			local29 += local61;
			local51 = local61;
			local43 -= local61;
			local27 += local61;
			arg1 = 1;
		}
		if (this.anInt2458 <= arg1 + local43) {
			local61 = arg1 + local43 + 1 - this.anInt2458;
			local51 += local61;
			local49 += local61;
			local43 -= local61;
		}
		if (local43 > 0 && local32 > 0) {
			Static188.method2682(local51, local43, local29, local6.aByteArray33, local32, this.aByteArray26, local49, local27);
			this.method2102(local43, arg2, arg1, local32);
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public void method2101() {
		this.aClass174ArrayArray1 = new Class174[this.anInt2445][this.anInt2453];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2453; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2445; local18++) {
				this.aClass174ArrayArray1[local18][local14] = new Class174(this.aClass132_Sub3_11, this, this.aClass12_Sub2_1, local18, local14, this.anInt2450, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BIIII)V")
	private void method2102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass174ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(39) int local39 = arg1 + arg3 - 2 >> 7;
		for (@Pc(41) int local41 = local15; local41 <= local25; local41++) {
			@Pc(56) Class174[] local56 = this.aClass174ArrayArray1[local41];
			for (@Pc(58) int local58 = local31; local58 <= local39; local58++) {
				local56[local58].aBoolean294 = true;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIZ[[Z)V")
	public void method2103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass132_Sub3_11.method6742(false);
		this.aClass132_Sub3_11.method6787(false);
		this.aClass132_Sub3_11.method6772(-2);
		this.aClass132_Sub3_11.method6803(1);
		this.aClass132_Sub3_11.method6781(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass132_Sub3_11.anInt7880 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg3) {
			for (local43 = 0; local43 < this.anInt2453; local43++) {
				local50 = local43 << this.anInt2450;
				local57 = local43 + 1 << this.anInt2450;
				label81: for (local59 = 0; local59 < this.anInt2445; local59++) {
					local63 = local59 << this.anInt2450;
					local68 = local59 + 1 << this.anInt2450;
					for (local75 = local63; local75 < local68; local75++) {
						if (-arg2 <= local75 - arg1 && arg2 >= local75 - arg1) {
							for (@Pc(319) int local319 = local50; local319 < local57; local319++) {
								if (-arg2 <= local319 - arg0 && local319 - arg0 <= arg2 && arg4[arg2 + local75 - arg1][local319 + arg2 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass174ArrayArray1[local59][local43].method3992();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt2453; local43++) {
				local50 = local43 << this.anInt2450;
				local57 = local43 + 1 << this.anInt2450;
				for (local59 = 0; local59 < this.anInt2445; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt2450;
					local75 = local59 + 1 << this.anInt2450;
					@Pc(79) Class6_Sub23_Sub2 local79 = this.aClass132_Sub3_11.aClass6_Sub23_Sub2_2;
					local79.anInt9901 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (-arg2 <= local84 - arg0 && arg2 >= local84 - arg0) {
							@Pc(112) int local112 = local84 * this.aClass12_Sub2_1.anInt9314 + local68;
							for (@Pc(114) int local114 = local68; local114 < local75; local114++) {
								if (-arg2 <= local114 - arg1 && local114 - arg1 <= arg2 && arg4[arg2 + local114 - arg1][arg2 + local84 - arg0]) {
									@Pc(149) short[] local149 = this.aClass12_Sub2_1.aShortArrayArray2[local112];
									if (local149 != null) {
										@Pc(157) int local157;
										if (this.aClass132_Sub3_11.aBoolean544) {
											for (local157 = 0; local157 < local149.length; local157++) {
												local63++;
												local79.method8347(local149[local157] & 0xFFFF);
											}
										} else {
											for (local157 = 0; local157 < local149.length; local157++) {
												local63++;
												local79.method8335(local149[local157] & 0xFFFF);
											}
										}
									}
								}
								local112++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass174ArrayArray1[local59][local43].method4000(local79.aByteArray101, local63);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!r;III)Z")
	public boolean method2105(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub4_Sub5_Sub1 local6 = (Class6_Sub4_Sub5_Sub1) arg0;
		arg1 += local6.anInt2989 + 1;
		arg2 += local6.anInt2996 + 1;
		@Pc(28) int local28 = arg1 + arg2 * this.anInt2458;
		@Pc(31) int local31 = local6.anInt2990;
		@Pc(34) int local34 = local6.anInt2995;
		@Pc(41) int local41;
		if (arg2 <= 0) {
			local41 = 1 - arg2;
			arg2 = 1;
			local28 += local41 * this.anInt2458;
			local31 -= local41;
		}
		@Pc(60) int local60 = this.anInt2458 - local34;
		if (this.anInt2447 <= local31 + arg2) {
			local41 = local31 + arg2 + 1 - this.anInt2447;
			local31 -= local41;
		}
		if (arg1 <= 0) {
			local41 = 1 - arg1;
			arg1 = 1;
			local34 -= local41;
			local60 += local41;
			local28 += local41;
		}
		if (arg1 + local34 >= this.anInt2458) {
			local41 = local34 + arg1 + 1 - this.anInt2458;
			local34 -= local41;
			local60 += local41;
		}
		if (local34 > 0 && local31 > 0) {
			local60 += this.anInt2458 * 7;
			return Static138.method2066(local28, local60, local34, local31, this.aByteArray26);
		} else {
			return false;
		}
	}
}
