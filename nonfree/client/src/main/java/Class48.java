import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class48 {

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "[[Lclient!km;")
	private Class134[][] aClass134ArrayArray1;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!gu;")
	private final Class14_Sub2 aClass14_Sub2_1;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_6;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public final int anInt1615;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
	private final int anInt1625;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	private final int anInt1621;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "[B")
	public final byte[] aByteArray19;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	private final int anInt1623;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	private final int anInt1618;

	static {
		new Class21("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!bt;Lclient!gu;)V")
	public Class48(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class14_Sub2 arg1) {
		this.aClass14_Sub2_1 = arg1;
		this.aClass30_Sub1_6 = arg0;
		this.anInt1615 = (this.aClass14_Sub2_1.anInt2831 * this.aClass14_Sub2_1.anInt2832 >> this.aClass30_Sub1_6.anInt839) + 2;
		this.anInt1625 = (this.aClass14_Sub2_1.anInt2831 * this.aClass14_Sub2_1.anInt2835 >> this.aClass30_Sub1_6.anInt839) + 2;
		this.anInt1621 = this.aClass30_Sub1_6.anInt839 + 7 - this.aClass14_Sub2_1.anInt2830;
		this.aByteArray19 = new byte[this.anInt1615 * this.anInt1625];
		this.anInt1623 = this.aClass14_Sub2_1.anInt2832 >> this.anInt1621;
		this.anInt1618 = this.aClass14_Sub2_1.anInt2835 >> this.anInt1621;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIZI)V")
	private void method1475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass134ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(41) int local41 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local15; local47 <= local25; local47++) {
			@Pc(54) Class134[] local54 = this.aClass134ArrayArray1[local47];
			for (@Pc(56) int local56 = local31; local56 <= local41; local56++) {
				local54[local56].aBoolean266 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZI[[ZII)V")
	public void method1476(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass30_Sub1_6.method704(false);
		this.aClass30_Sub1_6.method731(false);
		this.aClass30_Sub1_6.method693(-2);
		this.aClass30_Sub1_6.method713(1);
		this.aClass30_Sub1_6.method703(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass30_Sub1_6.anInt840 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg0) {
			for (local43 = 0; local43 < this.anInt1618; local43++) {
				local50 = local43 << this.anInt1621;
				local57 = local43 + 1 << this.anInt1621;
				label128: for (local59 = 0; local59 < this.anInt1623; local59++) {
					local66 = local59 << this.anInt1621;
					local73 = local59 + 1 << this.anInt1621;
					for (local75 = local66; local75 < local73; local75++) {
						if (local75 - arg4 >= -arg3 && arg3 >= local75 - arg4) {
							for (@Pc(99) int local99 = local50; local99 < local57; local99++) {
								if (local99 - arg1 >= -arg3 && local99 - arg1 <= arg3 && arg2[arg3 + local75 - arg4][arg3 + local99 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass134ArrayArray1[local59][local43].method3654();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt1618; local43++) {
				local50 = local43 << this.anInt1621;
				local57 = local43 + 1 << this.anInt1621;
				for (local59 = 0; local59 < this.anInt1623; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt1621;
					local75 = local59 + 1 << this.anInt1621;
					@Pc(239) Class4_Sub20_Sub2 local239 = this.aClass30_Sub1_6.aClass4_Sub20_Sub2_1;
					local239.anInt5526 = 0;
					for (@Pc(244) int local244 = local50; local244 < local57; local244++) {
						if (-arg3 <= local244 - arg1 && arg3 >= local244 - arg1) {
							@Pc(267) int local267 = local73 + local244 * this.aClass14_Sub2_1.anInt2832;
							for (@Pc(269) int local269 = local73; local269 < local75; local269++) {
								if (local269 - arg4 >= -arg3 && local269 - arg4 <= arg3 && arg2[arg3 + local269 - arg4][local244 + arg3 - arg1]) {
									@Pc(306) short[] local306 = this.aClass14_Sub2_1.aShortArrayArray2[local267];
									if (local306 != null) {
										@Pc(314) int local314;
										if (this.aClass30_Sub1_6.aBoolean51) {
											for (local314 = 0; local314 < local306.length; local314++) {
												local66++;
												local239.method4558(local306[local314] & 0xFFFF);
											}
										} else {
											for (local314 = 0; local314 < local306.length; local314++) {
												local239.method4604(local306[local314] & 0xFFFF);
												local66++;
											}
										}
									}
								}
								local267++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass134ArrayArray1[local59][local43].method3652(local66, local239.aByteArray77);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!ia;B)V")
	public void method1477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub6 arg2) {
		@Pc(10) Class4_Sub1_Sub6_Sub1 local10 = (Class4_Sub1_Sub6_Sub1) arg2;
		arg1 += local10.anInt1717 + 1;
		arg0 += local10.anInt1723 + 1;
		@Pc(31) int local31 = this.anInt1615 * arg0 + arg1;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = local10.anInt1727;
		@Pc(39) int local39 = local10.anInt1719;
		@Pc(44) int local44 = this.anInt1615 - local39;
		@Pc(46) int local46 = 0;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			arg0 = 1;
			local33 = local39 * local55;
			local36 -= local55;
			local31 += local55 * this.anInt1615;
		}
		if (local36 + arg0 >= this.anInt1625) {
			local55 = arg0 + local36 + 1 - this.anInt1625;
			local36 -= local55;
		}
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			arg1 = 1;
			local44 += local55;
			local31 += local55;
			local39 -= local55;
			local46 = local55;
			local33 += local55;
		}
		if (arg1 + local39 >= this.anInt1615) {
			local55 = local39 + arg1 + 1 - this.anInt1615;
			local39 -= local55;
			local46 += local55;
			local44 += local55;
		}
		if (local39 > 0 && local36 > 0) {
			Static434.method5970(local44, local31, this.aByteArray19, local10.aByteArray20, local33, local46, local39, local36);
			this.method1475(local36, arg0, arg1, local39);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!ia;I)Z")
	public boolean method1479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub6 arg2) {
		@Pc(6) Class4_Sub1_Sub6_Sub1 local6 = (Class4_Sub1_Sub6_Sub1) arg2;
		arg0 += local6.anInt1717 + 1;
		arg1 += local6.anInt1723 + 1;
		@Pc(28) int local28 = arg0 + this.anInt1615 * arg1;
		@Pc(31) int local31 = local6.anInt1727;
		@Pc(34) int local34 = local6.anInt1719;
		@Pc(40) int local40 = this.anInt1615 - local34;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local28 += this.anInt1615 * local47;
			arg1 = 1;
			local31 -= local47;
		}
		if (this.anInt1625 <= arg1 + local31) {
			local47 = arg1 + local31 + 1 - this.anInt1625;
			local31 -= local47;
		}
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local40 += local47;
			local34 -= local47;
			local28 += local47;
			arg0 = 1;
		}
		if (arg0 + local34 >= this.anInt1615) {
			local47 = arg0 + local34 + 1 - this.anInt1615;
			local40 += local47;
			local34 -= local47;
		}
		if (local34 > 0 && local31 > 0) {
			local40 += this.anInt1615 * 7;
			return Static18.method303(local31, local28, local34, this.aByteArray19, local40);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IILclient!ia;I)V")
	public void method1481(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1_Sub6 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub1_Sub6_Sub1 local6 = (Class4_Sub1_Sub6_Sub1) arg1;
		arg0 += local6.anInt1723 + 1;
		arg2 += local6.anInt1717 + 1;
		@Pc(27) int local27 = arg2 + arg0 * this.anInt1615;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt1727;
		@Pc(35) int local35 = local6.anInt1719;
		@Pc(41) int local41 = this.anInt1615 - local35;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local27 += local51 * this.anInt1615;
			local32 -= local51;
			local29 = local35 * local51;
			arg0 = 1;
		}
		@Pc(72) int local72 = 0;
		if (local32 + arg0 >= this.anInt1625) {
			local51 = local32 + arg0 + 1 - this.anInt1625;
			local32 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local29 += local51;
			local35 -= local51;
			local27 += local51;
			local72 = local51;
			arg2 = 1;
			local41 += local51;
		}
		if (arg2 + local35 >= this.anInt1615) {
			local51 = arg2 + local35 + 1 - this.anInt1615;
			local41 += local51;
			local35 -= local51;
			local72 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static284.method4428(local72, local35, local32, this.aByteArray19, local6.aByteArray20, local41, local27, local29);
			this.method1475(local32, arg0, arg2, local35);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public void method1482() {
		this.aClass134ArrayArray1 = new Class134[this.anInt1623][this.anInt1618];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1618; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt1623; local18++) {
				this.aClass134ArrayArray1[local18][local14] = new Class134(this.aClass30_Sub1_6, this, this.aClass14_Sub2_1, local18, local14, this.anInt1621, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}
}
