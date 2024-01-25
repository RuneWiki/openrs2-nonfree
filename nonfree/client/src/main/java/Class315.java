import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class315 {

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "[[Lclient!li;")
	private Class189[][] aClass189ArrayArray1;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_42;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!ql;")
	private final Class215_Sub2 aClass215_Sub2_3;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
	public final int anInt9529;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	private final int anInt9523;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "[B")
	public final byte[] aByteArray115;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	private final int anInt9530;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	private final int anInt9525;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	private final int anInt9534;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!gi;Lclient!ql;)V")
	public Class315(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class215_Sub2 arg1) {
		this.aClass42_Sub3_42 = arg0;
		this.aClass215_Sub2_3 = arg1;
		this.anInt9529 = (this.aClass215_Sub2_3.anInt9452 * this.aClass215_Sub2_3.anInt9451 >> this.aClass42_Sub3_42.anInt3672) + 2;
		this.anInt9523 = (this.aClass215_Sub2_3.anInt9451 * this.aClass215_Sub2_3.anInt9450 >> this.aClass42_Sub3_42.anInt3672) + 2;
		this.aByteArray115 = new byte[this.anInt9529 * this.anInt9523];
		this.anInt9530 = this.aClass42_Sub3_42.anInt3672 + 7 - this.aClass215_Sub2_3.anInt9453;
		this.anInt9525 = this.aClass215_Sub2_3.anInt9452 >> this.anInt9530;
		this.anInt9534 = this.aClass215_Sub2_3.anInt9450 >> this.anInt9530;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIBI)V")
	private void method7888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass189ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(42) int local42 = arg0 + arg3 - 1 - 1 >> 7;
		for (@Pc(50) int local50 = local15; local50 <= local25; local50++) {
			@Pc(57) Class189[] local57 = this.aClass189ArrayArray1[local50];
			for (@Pc(59) int local59 = local31; local59 <= local42; local59++) {
				local57[local59].aBoolean421 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!k;III)Z")
	public boolean method7889(@OriginalArg(0) Class12_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class12_Sub4_Sub10_Sub2 local6 = (Class12_Sub4_Sub10_Sub2) arg0;
		arg1 += local6.anInt9237 + 1;
		arg2 += local6.anInt9236 + 1;
		@Pc(34) int local34 = arg2 + arg1 * this.anInt9529;
		@Pc(37) int local37 = local6.anInt9234;
		@Pc(40) int local40 = local6.anInt9241;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local37 -= local47;
			local34 += local47 * this.anInt9529;
			arg1 = 1;
		}
		@Pc(65) int local65 = this.anInt9529 - local40;
		if (local37 + arg1 >= this.anInt9523) {
			local47 = local37 + arg1 + 1 - this.anInt9523;
			local37 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			arg2 = 1;
			local34 += local47;
			local65 += local47;
			local40 -= local47;
		}
		if (this.anInt9529 <= local40 + arg2) {
			local47 = local40 + arg2 + 1 - this.anInt9529;
			local65 += local47;
			local40 -= local47;
		}
		if (local40 > 0 && local37 > 0) {
			local65 += this.anInt9529 * 7;
			return Static117.method2449(this.aByteArray115, local34, local40, local65, local37);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZILclient!k;I)V")
	public void method7890(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub4_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class12_Sub4_Sub10_Sub2 local6 = (Class12_Sub4_Sub10_Sub2) arg1;
		arg0 += local6.anInt9236 + 1;
		arg2 += local6.anInt9237 + 1;
		@Pc(27) int local27 = arg0 + this.anInt9529 * arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9234;
		@Pc(35) int local35 = local6.anInt9241;
		@Pc(41) int local41 = this.anInt9529 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			arg2 = 1;
			local32 -= local50;
			local27 += this.anInt9529 * local50;
			local29 = local35 * local50;
		}
		if (this.anInt9523 <= local32 + arg2) {
			local50 = local32 + arg2 + 1 - this.anInt9523;
			local32 -= local50;
		}
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local41 += local50;
			local29 += local50;
			local27 += local50;
			arg0 = 1;
			local43 = local50;
			local35 -= local50;
		}
		if (arg0 + local35 >= this.anInt9529) {
			local50 = arg0 + local35 + 1 - this.anInt9529;
			local35 -= local50;
			local41 += local50;
			local43 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static41.method824(local29, local6.aByteArray113, this.aByteArray115, local43, local27, local35, local41, local32);
			this.method7888(arg2, local35, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[[ZIZII)V")
	public void method7891(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass42_Sub3_42.method3191(false);
		this.aClass42_Sub3_42.method3192(false);
		this.aClass42_Sub3_42.method3269(-2);
		this.aClass42_Sub3_42.method3257(1);
		this.aClass42_Sub3_42.method3209(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass42_Sub3_42.anInt3673 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg3) {
			for (local43 = 0; local43 < this.anInt9534; local43++) {
				local50 = local43 << this.anInt9530;
				local57 = local43 + 1 << this.anInt9530;
				label81: for (local59 = 0; local59 < this.anInt9525; local59++) {
					local63 = local59 << this.anInt9530;
					local68 = local59 + 1 << this.anInt9530;
					for (local75 = local63; local75 < local68; local75++) {
						if (local75 - arg2 >= -arg0 && local75 - arg2 <= arg0) {
							for (@Pc(321) int local321 = local50; local321 < local57; local321++) {
								if (-arg0 <= local321 - arg4 && local321 - arg4 <= arg0 && arg1[local75 + arg0 - arg2][local321 + arg0 - arg4]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass189ArrayArray1[local59][local43].method4640();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt9534; local43++) {
				local50 = local43 << this.anInt9530;
				local57 = local43 + 1 << this.anInt9530;
				for (local59 = 0; local59 < this.anInt9525; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt9530;
					local75 = local59 + 1 << this.anInt9530;
					@Pc(79) Class12_Sub8_Sub1 local79 = this.aClass42_Sub3_42.aClass12_Sub8_Sub1_1;
					local79.anInt6217 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (local84 - arg4 >= -arg0 && local84 - arg4 <= arg0) {
							@Pc(111) int local111 = local68 + local84 * this.aClass215_Sub2_3.anInt9452;
							for (@Pc(113) int local113 = local68; local113 < local75; local113++) {
								if (local113 - arg2 >= -arg0 && arg0 >= local113 - arg2 && arg1[local113 + arg0 - arg2][local84 + arg0 - arg4]) {
									@Pc(155) short[] local155 = this.aClass215_Sub2_3.aShortArrayArray7[local111];
									if (local155 != null) {
										@Pc(163) int local163;
										if (this.aClass42_Sub3_42.aBoolean292) {
											for (local163 = 0; local163 < local155.length; local163++) {
												local79.method5190(local155[local163] & 0xFFFF);
												local63++;
											}
										} else {
											for (local163 = 0; local163 < local155.length; local163++) {
												local79.method5201(local155[local163] & 0xFFFF);
												local63++;
											}
										}
									}
								}
								local111++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass189ArrayArray1[local59][local43].method4636(local79.aByteArray82, local63);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!k;II)V")
	public void method7892(@OriginalArg(1) Class12_Sub4_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class12_Sub4_Sub10_Sub2 local6 = (Class12_Sub4_Sub10_Sub2) arg0;
		arg1 += local6.anInt9236 + 1;
		arg2 += local6.anInt9237 + 1;
		@Pc(27) int local27 = arg1 + this.anInt9529 * arg2;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36 = local6.anInt9234;
		@Pc(39) int local39 = local6.anInt9241;
		@Pc(44) int local44 = this.anInt9529 - local39;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local36 -= local53;
			local27 += local53 * this.anInt9529;
			arg2 = 1;
			local29 = local39 * local53;
		}
		if (local36 + arg2 >= this.anInt9523) {
			local53 = local36 + arg2 + 1 - this.anInt9523;
			local36 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			arg1 = 1;
			local46 = local53;
			local29 += local53;
			local39 -= local53;
			local44 += local53;
			local27 += local53;
		}
		if (this.anInt9529 <= local39 + arg1) {
			local53 = arg1 + local39 + 1 - this.anInt9529;
			local44 += local53;
			local39 -= local53;
			local46 += local53;
		}
		if (local39 > 0 && local36 > 0) {
			Static516.method7625(local27, local39, this.aByteArray115, local36, local29, local6.aByteArray113, local46, local44);
			this.method7888(arg2, local39, arg1, local36);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public void method7893() {
		this.aClass189ArrayArray1 = new Class189[this.anInt9525][this.anInt9534];
		for (@Pc(18) int local18 = 0; local18 < this.anInt9534; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt9525; local22++) {
				this.aClass189ArrayArray1[local22][local18] = new Class189(this.aClass42_Sub3_42, this, this.aClass215_Sub2_3, local22, local18, this.anInt9530, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}
}
