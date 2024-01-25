import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class156 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "[[Lclient!wn;")
	private Class214[][] aClass214ArrayArray1;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_30;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!je;")
	private final Class73_Sub1 aClass73_Sub1_2;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
	public final int anInt4867;

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
	private final int anInt4868;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "[B")
	public final byte[] aByteArray58;

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
	private final int anInt4871;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
	private final int anInt4870;

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
	private final int anInt4869;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!ao;Lclient!je;)V")
	public Class156(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class73_Sub1 arg1) {
		this.aClass4_Sub1_30 = arg0;
		this.aClass73_Sub1_2 = arg1;
		this.anInt4867 = (this.aClass73_Sub1_2.anInt5546 * this.aClass73_Sub1_2.anInt3085 >> this.aClass4_Sub1_30.anInt313) + 2;
		this.anInt4868 = (this.aClass73_Sub1_2.anInt3085 * this.aClass73_Sub1_2.anInt5550 >> this.aClass4_Sub1_30.anInt313) + 2;
		this.aByteArray58 = new byte[this.anInt4867 * this.anInt4868];
		this.anInt4871 = this.aClass4_Sub1_30.anInt313 + 7 - this.aClass73_Sub1_2.anInt3081;
		this.anInt4870 = this.aClass73_Sub1_2.anInt5546 >> this.anInt4871;
		this.anInt4869 = this.aClass73_Sub1_2.anInt5550 >> this.anInt4871;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IZIII)V")
	private void method4488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass214ArrayArray1 == null) {
			return;
		}
		@Pc(10) int local10 = arg2 - 1 >> 7;
		@Pc(20) int local20 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(26) int local26 = arg0 - 1 >> 7;
		@Pc(37) int local37 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local10; local49 <= local20; local49++) {
			@Pc(61) Class214[] local61 = this.aClass214ArrayArray1[local49];
			for (@Pc(63) int local63 = local26; local63 <= local37; local63++) {
				local61[local63].aBoolean617 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!mm;II)V")
	public void method4489(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11_Sub10 arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class2_Sub11_Sub10_Sub1 local2 = (Class2_Sub11_Sub10_Sub1) arg1;
		arg0 += local2.anInt3388 + 1;
		arg2 += local2.anInt3387 + 1;
		@Pc(23) int local23 = arg0 + this.anInt4867 * arg2;
		@Pc(25) int local25 = 0;
		@Pc(32) int local32 = local2.anInt3389;
		@Pc(35) int local35 = local2.anInt3386;
		@Pc(41) int local41 = this.anInt4867 - local35;
		@Pc(43) int local43 = 0;
		@Pc(51) int local51;
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local32 -= local51;
			local23 += local51 * this.anInt4867;
			arg2 = 1;
			local25 = local35 * local51;
		}
		if (local32 + arg2 >= this.anInt4868) {
			local51 = local32 + arg2 + 1 - this.anInt4868;
			local32 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local25 += local51;
			arg0 = 1;
			local23 += local51;
			local43 = local51;
			local41 += local51;
			local35 -= local51;
		}
		if (local35 + arg0 >= this.anInt4867) {
			local51 = arg0 + local35 + 1 - this.anInt4867;
			local43 += local51;
			local41 += local51;
			local35 -= local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static368.method4496(local23, local25, this.aByteArray58, local32, local43, local2.aByteArray50, local35, local41);
			this.method4488(arg2, local32, arg0, local35);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[[ZZII)V")
	public void method4491(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) opengl local18 = this.aClass4_Sub1_30.anOpengl1;
		this.aClass4_Sub1_30.method573();
		this.aClass4_Sub1_30.method568(false);
		this.aClass4_Sub1_30.method558(false);
		this.aClass4_Sub1_30.method578();
		this.aClass4_Sub1_30.method574(0);
		this.aClass4_Sub1_30.method572(1);
		@Pc(50) float local50 = 1.0F / (float) (this.aClass4_Sub1_30.anInt317 * 128);
		@Pc(54) int local54;
		@Pc(67) int local67;
		@Pc(74) int local74;
		@Pc(76) int local76;
		@Pc(86) int local86;
		@Pc(91) int local91;
		@Pc(98) int local98;
		if (arg2) {
			for (local54 = 0; local54 < this.anInt4869; local54++) {
				local67 = local54 << this.anInt4871;
				local74 = local54 + 1 << this.anInt4871;
				label86: for (local76 = 0; local76 < this.anInt4870; local76++) {
					local86 = local76 << this.anInt4871;
					local91 = local76 + 1 << this.anInt4871;
					for (local98 = local86; local98 < local91; local98++) {
						if (-arg0 <= local98 - arg3 && local98 - arg3 <= arg0) {
							for (@Pc(341) int local341 = local67; local341 < local74; local341++) {
								if (-arg0 <= local341 - arg4 && arg0 >= local341 - arg4 && arg1[arg0 + local98 - arg3][local341 + arg0 - arg4]) {
									local18.glMatrixMode(5890);
									local18.glLoadIdentity();
									local18.glScalef(local50, local50, 1.0F);
									local18.glTranslatef((float) -local76 / local50, (float) -local54 / local50, 1.0F);
									local18.glMatrixMode(5888);
									this.aClass214ArrayArray1[local76][local54].method5961();
									continue label86;
								}
							}
						}
					}
				}
			}
		} else {
			for (local54 = 0; local54 < this.anInt4869; local54++) {
				local67 = local54 << this.anInt4871;
				local74 = local54 + 1 << this.anInt4871;
				for (local76 = 0; local76 < this.anInt4870; local76++) {
					local86 = 0;
					local91 = local76 << this.anInt4871;
					local98 = local76 + 1 << this.anInt4871;
					@Pc(100) Class2_Sub10 local100 = Static150.aClass2_Sub10_3;
					local100.anInt4807 = 0;
					for (@Pc(105) int local105 = local67; local105 < local74; local105++) {
						if (-arg0 <= local105 - arg4 && arg0 >= local105 - arg4) {
							@Pc(138) int local138 = local91 + this.aClass73_Sub1_2.anInt5546 * local105;
							for (@Pc(140) int local140 = local91; local140 < local98; local140++) {
								if (local140 - arg3 >= -arg0 && arg0 >= local140 - arg3 && arg1[arg0 + local140 - arg3][arg0 + local105 - arg4]) {
									@Pc(182) short[] local182 = this.aClass73_Sub1_2.aShortArrayArray4[local138];
									if (local182 != null) {
										@Pc(191) int local191;
										if (this.aClass4_Sub1_30.aBoolean32) {
											for (local191 = 0; local191 < local182.length; local191++) {
												local86++;
												local100.method4452(local182[local191] & 0xFFFF);
											}
										} else {
											for (local191 = 0; local191 < local182.length; local191++) {
												local86++;
												local100.method4456(local182[local191] & 0xFFFF);
											}
										}
									}
								}
								local138++;
							}
						}
					}
					if (local86 > 0) {
						local18.glMatrixMode(5890);
						local18.glLoadIdentity();
						local18.glScalef(local50, local50, 1.0F);
						local18.glTranslatef((float) -local76 / local50, (float) -local54 / local50, 1.0F);
						local18.glMatrixMode(5888);
						this.aClass214ArrayArray1[local76][local54].method5960(local86, local100.aByteArray57);
					}
				}
			}
		}
		local18.glMatrixMode(5890);
		local18.glLoadIdentity();
		local18.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!mm;II)V")
	public void method4493(@OriginalArg(1) Class2_Sub11_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub11_Sub10_Sub1 local2 = (Class2_Sub11_Sub10_Sub1) arg0;
		arg1 += local2.anInt3387 + 1;
		arg2 += local2.anInt3388 + 1;
		@Pc(23) int local23 = arg2 + arg1 * this.anInt4867;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3389;
		@Pc(31) int local31 = local2.anInt3386;
		@Pc(36) int local36 = this.anInt4867 - local31;
		@Pc(38) int local38 = 0;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local28 -= local49;
			local23 += local49 * this.anInt4867;
			arg1 = 1;
			local25 = local31 * local49;
		}
		if (local28 + arg1 >= this.anInt4868) {
			local49 = arg1 + local28 + 1 - this.anInt4868;
			local28 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local31 -= local49;
			local38 = local49;
			local36 += local49;
			arg2 = 1;
			local25 += local49;
			local23 += local49;
		}
		if (this.anInt4867 <= local31 + arg2) {
			local49 = local31 + arg2 + 1 - this.anInt4867;
			local36 += local49;
			local31 -= local49;
			local38 += local49;
		}
		if (local31 > 0 && local28 > 0) {
			Static368.method4492(local28, local23, local2.aByteArray50, local36, local25, local31, this.aByteArray58, local38);
			this.method4488(arg1, local28, arg2, local31);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public void method4494() {
		this.aClass214ArrayArray1 = new Class214[this.anInt4870][this.anInt4869];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4869; local14++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt4870; local20++) {
				this.aClass214ArrayArray1[local20][local14] = new Class214(this.aClass4_Sub1_30, this, this.aClass73_Sub1_2, local20, local14, this.anInt4871, local20 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(ILclient!mm;II)Z")
	public boolean method4495(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub11_Sub10_Sub1 local2 = (Class2_Sub11_Sub10_Sub1) arg1;
		arg0 += local2.anInt3387 + 1;
		arg2 += local2.anInt3388 + 1;
		@Pc(23) int local23 = arg0 * this.anInt4867 + arg2;
		@Pc(26) int local26 = local2.anInt3389;
		@Pc(29) int local29 = local2.anInt3386;
		@Pc(35) int local35 = this.anInt4867 - local29;
		@Pc(44) int local44;
		if (arg0 <= 0) {
			local44 = 1 - arg0;
			local23 += this.anInt4867 * local44;
			arg0 = 1;
			local26 -= local44;
		}
		if (arg0 + local26 >= this.anInt4868) {
			local44 = arg0 + local26 + 1 - this.anInt4868;
			local26 -= local44;
		}
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local35 += local44;
			local23 += local44;
			arg2 = 1;
			local29 -= local44;
		}
		if (this.anInt4867 <= local29 + arg2) {
			local44 = arg2 + local29 + 1 - this.anInt4867;
			local35 += local44;
			local29 -= local44;
		}
		if (local29 > 0 && local26 > 0) {
			local35 += this.anInt4867 * 7;
			return Static368.method4490(this.aByteArray58, local26, local23, local35, local29);
		} else {
			return false;
		}
	}
}
