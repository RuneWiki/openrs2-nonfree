import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "Lclient!mba;")
	public final Class216 aClass216_33 = new Class216();

	@OriginalMember(owner = "client!hda", name = "z", descriptor = "Lclient!gh;")
	public final Class3_Sub3_Sub3 aClass3_Sub3_Sub3_1 = new Class3_Sub3_Sub3();

	@OriginalMember(owner = "client!hda", name = "p", descriptor = "Lclient!aea;")
	private final Class3_Sub3_Sub1 aClass3_Sub3_Sub1_1;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!aea;)V")
	public Class3_Sub3_Sub4(@OriginalArg(0) Class3_Sub3_Sub1 arg0) {
		this.aClass3_Sub3_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0) {
		this.aClass3_Sub3_Sub3_1.method4678(arg0);
		for (@Pc(15) Class3_Sub4 local15 = (Class3_Sub4) this.aClass216_33.method5457(); local15 != null; local15 = (Class3_Sub4) this.aClass216_33.method5458()) {
			if (!this.aClass3_Sub3_Sub1_1.method169(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt193) {
						this.method3218(local15, local25);
						local15.anInt193 -= local25;
						break;
					}
					this.method3218(local15, local15.anInt193);
					local25 -= local15.anInt193;
				} while (!this.aClass3_Sub3_Sub1_1.method145(local25, 0, local15, (int[]) null));
			}
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([III)V")
	@Override
	public void method4677(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub3_Sub3_1.method4677(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub4 local17 = (Class3_Sub4) this.aClass216_33.method5457(); local17 != null; local17 = (Class3_Sub4) this.aClass216_33.method5458()) {
			if (!this.aClass3_Sub3_Sub1_1.method169(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt193) {
						this.method3221(local17, arg0, local29, local29 + local27, local27);
						local17.anInt193 -= local27;
						break;
					}
					this.method3221(local17, arg0, local29, local27 + local29, local17.anInt193);
					local27 -= local17.anInt193;
					local29 += local17.anInt193;
				} while (!this.aClass3_Sub3_Sub1_1.method145(local27, local29, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILclient!afa;I)V")
	private void method3218(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass3_Sub3_Sub1_1.anIntArray21[arg0.anInt190] & 0x4) != 0 && arg0.anInt186 < 0) {
			@Pc(23) int local23 = this.aClass3_Sub3_Sub1_1.anIntArray16[arg0.anInt190] / Static168.anInt3272;
			@Pc(32) int local32 = (local23 + 1048575 - arg0.anInt182) / local23;
			arg0.anInt182 = arg1 * local23 + arg0.anInt182 & 0xFFFFF;
			if (local32 <= arg1) {
				if (this.aClass3_Sub3_Sub1_1.anIntArray18[arg0.anInt190] == 0) {
					arg0.aClass3_Sub3_Sub5_1 = Static655.method4686(arg0.aClass3_Sub18_Sub1_1, arg0.aClass3_Sub3_Sub5_1.method4704(), arg0.aClass3_Sub3_Sub5_1.method4687(), arg0.aClass3_Sub3_Sub5_1.method4711());
				} else {
					arg0.aClass3_Sub3_Sub5_1 = Static655.method4686(arg0.aClass3_Sub18_Sub1_1, arg0.aClass3_Sub3_Sub5_1.method4704(), 0, arg0.aClass3_Sub3_Sub5_1.method4711());
					this.aClass3_Sub3_Sub1_1.method158(arg0, arg0.aClass3_Sub10_1.aShortArray6[arg0.anInt178] < 0);
				}
				if (arg0.aClass3_Sub10_1.aShortArray6[arg0.anInt178] < 0) {
					arg0.aClass3_Sub3_Sub5_1.method4716(-1);
				}
				arg1 = arg0.anInt182 / local23;
			}
		}
		arg0.aClass3_Sub3_Sub5_1.method4678(arg1);
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "()Lclient!co;")
	@Override
	public Class3_Sub3 method4680() {
		@Pc(9) Class3_Sub4 local9 = (Class3_Sub4) this.aClass216_33.method5457();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub3_Sub5_1 == null) {
			return this.method4679();
		} else {
			return local9.aClass3_Sub3_Sub5_1;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "()Lclient!co;")
	@Override
	public Class3_Sub3 method4679() {
		@Pc(9) Class3_Sub4 local9;
		do {
			local9 = (Class3_Sub4) this.aClass216_33.method5458();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub3_Sub5_1 == null);
		return local9.aClass3_Sub3_Sub5_1;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!afa;B[IIII)V")
	private void method3221(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub3_Sub1_1.anIntArray21[arg0.anInt190] & 0x4) != 0 && arg0.anInt186 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub3_Sub1_1.anIntArray16[arg0.anInt190] / Static168.anInt3272;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg0.anInt182) / local29;
				if (local39 > arg4) {
					arg0.anInt182 += arg4 * local29;
					break;
				}
				arg0.aClass3_Sub3_Sub5_1.method4677(arg1, arg2, local39);
				arg4 -= local39;
				arg2 += local39;
				arg0.anInt182 += local39 * local29 - 1048576;
				@Pc(70) int local70 = Static168.anInt3272 / 100;
				@Pc(74) int local74 = 262144 / local29;
				if (local74 < local70) {
					local70 = local74;
				}
				@Pc(86) Class3_Sub3_Sub5 local86 = arg0.aClass3_Sub3_Sub5_1;
				if (this.aClass3_Sub3_Sub1_1.anIntArray18[arg0.anInt190] == 0) {
					arg0.aClass3_Sub3_Sub5_1 = Static655.method4686(arg0.aClass3_Sub18_Sub1_1, local86.method4704(), local86.method4687(), local86.method4711());
				} else {
					arg0.aClass3_Sub3_Sub5_1 = Static655.method4686(arg0.aClass3_Sub18_Sub1_1, local86.method4704(), 0, local86.method4711());
					this.aClass3_Sub3_Sub1_1.method158(arg0, arg0.aClass3_Sub10_1.aShortArray6[arg0.anInt178] < 0);
					arg0.aClass3_Sub3_Sub5_1.method4698(local70, local86.method4687());
				}
				if (arg0.aClass3_Sub10_1.aShortArray6[arg0.anInt178] < 0) {
					arg0.aClass3_Sub3_Sub5_1.method4716(-1);
				}
				local86.method4693(local70);
				local86.method4677(arg1, arg2, arg3 - arg2);
				if (local86.method4706()) {
					this.aClass3_Sub3_Sub3_1.method2975(local86);
				}
			}
		}
		arg0.aClass3_Sub3_Sub5_1.method4677(arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "()I")
	@Override
	public int method4681() {
		return 0;
	}
}
