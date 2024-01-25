import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class2_Sub12_Sub4 extends Class2_Sub12 {

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "Lclient!rk;")
	public final Class249 aClass249_66 = new Class249();

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "Lclient!ei;")
	public final Class2_Sub12_Sub2 aClass2_Sub12_Sub2_6 = new Class2_Sub12_Sub2();

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!cc;")
	private final Class2_Sub12_Sub1 aClass2_Sub12_Sub1_2;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!cc;)V")
	public Class2_Sub12_Sub4(@OriginalArg(0) Class2_Sub12_Sub1 arg0) {
		this.aClass2_Sub12_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[ILclient!gt;II)V")
	private void method7200(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class2_Sub25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub12_Sub1_2.anIntArray87[arg2.anInt3052] & 0x4) != 0 && arg2.anInt3054 < 0) {
			@Pc(29) int local29 = this.aClass2_Sub12_Sub1_2.anIntArray94[arg2.anInt3052] / Static302.anInt5530;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg2.anInt3060) / local29;
				if (local39 > arg3) {
					arg2.anInt3060 += local29 * arg3;
					break;
				}
				arg2.aClass2_Sub12_Sub3_1.method7192(arg1, arg0, local39);
				arg0 += local39;
				arg2.anInt3060 += local29 * local39 - 1048576;
				arg3 -= local39;
				@Pc(70) int local70 = Static302.anInt5530 / 100;
				@Pc(74) int local74 = 262144 / local29;
				if (local74 < local70) {
					local70 = local74;
				}
				@Pc(82) Class2_Sub12_Sub3 local82 = arg2.aClass2_Sub12_Sub3_1;
				if (this.aClass2_Sub12_Sub1_2.anIntArray82[arg2.anInt3052] == 0) {
					arg2.aClass2_Sub12_Sub3_1 = Static555.method5580(arg2.aClass2_Sub31_Sub1_1, local82.method5567(), local82.method5587(), local82.method5563());
				} else {
					arg2.aClass2_Sub12_Sub3_1 = Static555.method5580(arg2.aClass2_Sub31_Sub1_1, local82.method5567(), 0, local82.method5563());
					this.aClass2_Sub12_Sub1_2.method1011(arg2.aClass2_Sub10_1.aShortArray36[arg2.anInt3062] < 0, arg2);
					arg2.aClass2_Sub12_Sub3_1.method5573(local70, local82.method5587());
				}
				if (arg2.aClass2_Sub10_1.aShortArray36[arg2.anInt3062] < 0) {
					arg2.aClass2_Sub12_Sub3_1.method5579(-1);
				}
				local82.method5595(local70);
				local82.method7192(arg1, arg0, arg4 - arg0);
				if (local82.method5575()) {
					this.aClass2_Sub12_Sub2_6.method2086(local82);
				}
			}
		}
		arg2.aClass2_Sub12_Sub3_1.method7192(arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "()I")
	@Override
	public int method7191() {
		return 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	@Override
	public void method7193(@OriginalArg(0) int arg0) {
		this.aClass2_Sub12_Sub2_6.method7193(arg0);
		for (@Pc(15) Class2_Sub25 local15 = (Class2_Sub25) this.aClass249_66.method6527(); local15 != null; local15 = (Class2_Sub25) this.aClass249_66.method6525()) {
			if (!this.aClass2_Sub12_Sub1_2.method1022(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt3064 >= local25) {
						this.method7201(local15, local25);
						local15.anInt3064 -= local25;
						break;
					}
					this.method7201(local15, local15.anInt3064);
					local25 -= local15.anInt3064;
				} while (!this.aClass2_Sub12_Sub1_2.method1001(local25, local15, 0, null));
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "()Lclient!ft;")
	@Override
	public Class2_Sub12 method7196() {
		@Pc(9) Class2_Sub25 local9;
		do {
			local9 = (Class2_Sub25) this.aClass249_66.method6525();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub12_Sub3_1 == null);
		return local9.aClass2_Sub12_Sub3_1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!gt;BI)V")
	private void method7201(@OriginalArg(0) Class2_Sub25 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub12_Sub1_2.anIntArray87[arg0.anInt3052] & 0x4) != 0 && arg0.anInt3054 < 0) {
			@Pc(33) int local33 = this.aClass2_Sub12_Sub1_2.anIntArray94[arg0.anInt3052] / Static302.anInt5530;
			@Pc(42) int local42 = (local33 + 1048575 - arg0.anInt3060) / local33;
			arg0.anInt3060 = arg1 * local33 + arg0.anInt3060 & 0xFFFFF;
			if (local42 <= arg1) {
				if (this.aClass2_Sub12_Sub1_2.anIntArray82[arg0.anInt3052] == 0) {
					arg0.aClass2_Sub12_Sub3_1 = Static555.method5580(arg0.aClass2_Sub31_Sub1_1, arg0.aClass2_Sub12_Sub3_1.method5567(), arg0.aClass2_Sub12_Sub3_1.method5587(), arg0.aClass2_Sub12_Sub3_1.method5563());
				} else {
					arg0.aClass2_Sub12_Sub3_1 = Static555.method5580(arg0.aClass2_Sub31_Sub1_1, arg0.aClass2_Sub12_Sub3_1.method5567(), 0, arg0.aClass2_Sub12_Sub3_1.method5563());
					this.aClass2_Sub12_Sub1_2.method1011(arg0.aClass2_Sub10_1.aShortArray36[arg0.anInt3062] < 0, arg0);
				}
				if (arg0.aClass2_Sub10_1.aShortArray36[arg0.anInt3062] < 0) {
					arg0.aClass2_Sub12_Sub3_1.method5579(-1);
				}
				arg1 = arg0.anInt3060 / local33;
			}
		}
		arg0.aClass2_Sub12_Sub3_1.method7193(arg1);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "()Lclient!ft;")
	@Override
	public Class2_Sub12 method7195() {
		@Pc(9) Class2_Sub25 local9 = (Class2_Sub25) this.aClass249_66.method6527();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub12_Sub3_1 == null) {
			return this.method7196();
		} else {
			return local9.aClass2_Sub12_Sub3_1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([III)V")
	@Override
	public void method7192(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub12_Sub2_6.method7192(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub25 local17 = (Class2_Sub25) this.aClass249_66.method6527(); local17 != null; local17 = (Class2_Sub25) this.aClass249_66.method6525()) {
			if (!this.aClass2_Sub12_Sub1_2.method1022(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt3064 >= local29) {
						this.method7200(local27, arg0, local17, local29, local29 + local27);
						local17.anInt3064 -= local29;
						break;
					}
					this.method7200(local27, arg0, local17, local17.anInt3064, local27 + local29);
					local27 += local17.anInt3064;
					local29 -= local17.anInt3064;
				} while (!this.aClass2_Sub12_Sub1_2.method1001(local29, local17, local27, arg0));
			}
		}
	}
}
