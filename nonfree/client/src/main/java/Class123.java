import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class123 {

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "[[Lclient!ic;")
	private Class88[][] aClass88ArrayArray1;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "Lclient!wa;")
	private final Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_28;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public final int anInt3594;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	private final int anInt3595;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	private final int anInt3596;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "[B")
	public final byte[] aByteArray43;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
	private final int anInt3598;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	private final int anInt3597;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!po;Lclient!wa;)V")
	public Class123(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		this.aClass3_Sub2_2 = arg1;
		this.aClass59_Sub1_28 = arg0;
		this.anInt3594 = (this.aClass3_Sub2_2.anInt6360 * this.aClass3_Sub2_2.anInt6364 >> this.aClass59_Sub1_28.anInt4761) + 2;
		this.anInt3595 = (this.aClass3_Sub2_2.anInt6364 * this.aClass3_Sub2_2.anInt6361 >> this.aClass59_Sub1_28.anInt4761) + 2;
		this.anInt3596 = this.aClass59_Sub1_28.anInt4761 + 7 - this.aClass3_Sub2_2.anInt6363;
		this.aByteArray43 = new byte[this.anInt3595 * this.anInt3594];
		this.anInt3598 = this.aClass3_Sub2_2.anInt6360 >> this.anInt3596;
		this.anInt3597 = this.aClass3_Sub2_2.anInt6361 >> this.anInt3596;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!lg;I)V")
	public void method3314(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub9_Sub14 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class5_Sub9_Sub14_Sub1 local2 = (Class5_Sub9_Sub14_Sub1) arg1;
		arg0 += local2.anInt4480 + 1;
		arg2 += local2.anInt4481 + 1;
		@Pc(23) int local23 = arg2 * this.anInt3594 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt4482;
		@Pc(31) int local31 = local2.anInt4479;
		@Pc(37) int local37 = this.anInt3594 - local31;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			arg2 = 1;
			local25 = local31 * local48;
			local23 += this.anInt3594 * local48;
			local28 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt3595 <= arg2 + local28) {
			local48 = arg2 + local28 + 1 - this.anInt3595;
			local28 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local23 += local48;
			local25 += local48;
			local69 = local48;
			local31 -= local48;
			local37 += local48;
			arg0 = 1;
		}
		if (local31 + arg0 >= this.anInt3594) {
			local48 = local31 + arg0 + 1 - this.anInt3594;
			local69 += local48;
			local31 -= local48;
			local37 += local48;
		}
		if (local31 > 0 && local28 > 0) {
			Static364.method3319(local25, local69, local37, local2.aByteArray55, local23, local31, this.aByteArray43, local28);
			this.method3316(local31, arg0, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
	public void method3315() {
		this.aClass88ArrayArray1 = new Class88[this.anInt3598][this.anInt3597];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3597; local8++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt3598; local28++) {
				this.aClass88ArrayArray1[local28][local8] = new Class88(this.aClass59_Sub1_28, this, this.aClass3_Sub2_2, local28, local8, this.anInt3596, local28 * 128 + 1, local8 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
	private void method3316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass88ArrayArray1 == null) {
			return;
		}
		@Pc(10) int local10 = arg1 - 1 >> 7;
		@Pc(20) int local20 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(30) int local30 = arg3 - 1 >> 7;
		@Pc(41) int local41 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local10; local43 <= local20; local43++) {
			@Pc(51) Class88[] local51 = this.aClass88ArrayArray1[local43];
			for (@Pc(53) int local53 = local30; local53 <= local41; local53++) {
				local51[local53].aBoolean179 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!lg;III)V")
	public void method3318(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class5_Sub9_Sub14_Sub1 local2 = (Class5_Sub9_Sub14_Sub1) arg0;
		arg1 += local2.anInt4480 + 1;
		arg2 += local2.anInt4481 + 1;
		@Pc(23) int local23 = arg2 * this.anInt3594 + arg1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt4482;
		@Pc(31) int local31 = local2.anInt4479;
		@Pc(37) int local37 = this.anInt3594 - local31;
		@Pc(39) int local39 = 0;
		@Pc(46) int local46;
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			local25 = local46 * local31;
			local23 += this.anInt3594 * local46;
			local28 -= local46;
			arg2 = 1;
		}
		if (local28 + arg2 >= this.anInt3595) {
			local46 = local28 + arg2 + 1 - this.anInt3595;
			local28 -= local46;
		}
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			local25 += local46;
			local37 += local46;
			local39 = local46;
			arg1 = 1;
			local23 += local46;
			local31 -= local46;
		}
		if (this.anInt3594 <= local31 + arg1) {
			local46 = local31 + arg1 + 1 - this.anInt3594;
			local37 += local46;
			local31 -= local46;
			local39 += local46;
		}
		if (local31 > 0 && local28 > 0) {
			Static364.method3317(local25, local31, local39, local2.aByteArray55, local37, this.aByteArray43, local23, local28);
			this.method3316(local31, arg1, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(Lclient!lg;III)Z")
	public boolean method3320(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class5_Sub9_Sub14_Sub1 local2 = (Class5_Sub9_Sub14_Sub1) arg0;
		arg2 += local2.anInt4481 + 1;
		arg1 += local2.anInt4480 + 1;
		@Pc(32) int local32 = arg1 + this.anInt3594 * arg2;
		@Pc(35) int local35 = local2.anInt4482;
		@Pc(38) int local38 = local2.anInt4479;
		@Pc(44) int local44 = this.anInt3594 - local38;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			arg2 = 1;
			local32 += local54 * this.anInt3594;
			local35 -= local54;
		}
		if (local35 + arg2 >= this.anInt3595) {
			local54 = local35 + arg2 + 1 - this.anInt3595;
			local35 -= local54;
		}
		if (arg1 <= 0) {
			local54 = 1 - arg1;
			local38 -= local54;
			local44 += local54;
			local32 += local54;
			arg1 = 1;
		}
		if (local38 + arg1 >= this.anInt3594) {
			local54 = arg1 + local38 + 1 - this.anInt3594;
			local38 -= local54;
			local44 += local54;
		}
		if (local38 > 0 && local35 > 0) {
			local44 += this.anInt3594 * 7;
			return Static364.method3322(this.aByteArray43, local38, local35, local44, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIZ[[ZI)V")
	public void method3321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_28.anOpengl2;
		this.aClass59_Sub1_28.method4294();
		this.aClass59_Sub1_28.method4321(false);
		this.aClass59_Sub1_28.method4274(false);
		this.aClass59_Sub1_28.method4320();
		this.aClass59_Sub1_28.method4327(0);
		this.aClass59_Sub1_28.method4342(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass59_Sub1_28.anInt4756 * 128);
		@Pc(39) int local39;
		@Pc(48) int local48;
		@Pc(55) int local55;
		@Pc(57) int local57;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(84) int local84;
		if (arg2) {
			for (local39 = 0; local39 < this.anInt3597; local39++) {
				local48 = local39 << this.anInt3596;
				local55 = local39 + 1 << this.anInt3596;
				label85: for (local57 = 0; local57 < this.anInt3598; local57++) {
					local67 = local57 << this.anInt3596;
					local72 = local57 + 1 << this.anInt3596;
					for (local79 = local67; local79 < local72; local79++) {
						if (local79 - arg4 >= -arg1 && arg1 >= local79 - arg4) {
							for (local84 = local48; local84 < local55; local84++) {
								if (local84 - arg0 >= -arg1 && arg1 >= local84 - arg0 && arg3[arg1 + local79 - arg4][local84 + arg1 - arg0]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local57 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass88ArrayArray1[local57][local39].method2465();
									continue label85;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt3597; local39++) {
				local48 = local39 << this.anInt3596;
				local55 = local39 + 1 << this.anInt3596;
				for (local57 = 0; local57 < this.anInt3598; local57++) {
					local67 = 0;
					local72 = local57 << this.anInt3596;
					local79 = local57 + 1 << this.anInt3596;
					Static340.aClass5_Sub1_9.anInt2029 = 0;
					for (local84 = local48; local84 < local55; local84++) {
						if (-arg1 <= local84 - arg0 && local84 - arg0 <= arg1) {
							@Pc(115) int local115 = local72 + this.aClass3_Sub2_2.anInt6360 * local84;
							for (@Pc(117) int local117 = local72; local117 < local79; local117++) {
								if (local117 - arg4 >= -arg1 && arg1 >= local117 - arg4 && arg3[arg1 + local117 - arg4][arg1 + local84 - arg0]) {
									@Pc(158) short[] local158 = this.aClass3_Sub2_2.aShortArrayArray16[local115];
									if (local158 != null) {
										@Pc(168) int local168;
										if (this.aClass59_Sub1_28.aBoolean350) {
											for (local168 = 0; local168 < local158.length; local168++) {
												local67++;
												Static340.aClass5_Sub1_9.method1870(local158[local168]);
											}
										} else {
											for (local168 = 0; local168 < local158.length; local168++) {
												Static340.aClass5_Sub1_9.method1829(local158[local168]);
												local67++;
											}
										}
									}
								}
								local115++;
							}
						}
					}
					if (local67 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local57 / local35, (float) -local39 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass59_Sub1_28.anInterface2_4.method2597(Static340.aClass5_Sub1_9.aByteArray18, local67 * 2);
						this.aClass88ArrayArray1[local57][local39].method2466(local67, this.aClass59_Sub1_28.anInterface2_4);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}
}
