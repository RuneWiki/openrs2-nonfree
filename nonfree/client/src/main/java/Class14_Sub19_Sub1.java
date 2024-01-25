import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class14_Sub19_Sub1 extends Class14_Sub19 {

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!bd;")
	public final Class18 aClass18_13 = new Class18();

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "Lclient!pb;")
	public final Class14_Sub19_Sub2 aClass14_Sub19_Sub2_2 = new Class14_Sub19_Sub2();

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "Lclient!uj;")
	private final Class14_Sub19_Sub4 aClass14_Sub19_Sub4_1;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!uj;)V")
	public Class14_Sub19_Sub1(@OriginalArg(0) Class14_Sub19_Sub4 arg0) {
		this.aClass14_Sub19_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lclient!kp;")
	@Override
	public Class14_Sub19 method5508() {
		@Pc(9) Class14_Sub35 local9;
		do {
			local9 = (Class14_Sub35) this.aClass18_13.method453();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass14_Sub19_Sub3_3 == null);
		return local9.aClass14_Sub19_Sub3_3;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
	@Override
	public void method5507(@OriginalArg(0) int arg0) {
		this.aClass14_Sub19_Sub2_2.method5507(arg0);
		for (@Pc(15) Class14_Sub35 local15 = (Class14_Sub35) this.aClass18_13.method459(); local15 != null; local15 = (Class14_Sub35) this.aClass18_13.method453()) {
			if (!this.aClass14_Sub19_Sub4_1.method5527(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6288) {
						this.method2857(local15, local25);
						local15.anInt6288 -= local25;
						break;
					}
					this.method2857(local15, local15.anInt6288);
					local25 -= local15.anInt6288;
				} while (!this.aClass14_Sub19_Sub4_1.method5541(null, local15, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lclient!kp;")
	@Override
	public Class14_Sub19 method5506() {
		@Pc(9) Class14_Sub35 local9 = (Class14_Sub35) this.aClass18_13.method459();
		if (local9 == null) {
			return null;
		} else if (local9.aClass14_Sub19_Sub3_3 == null) {
			return this.method5508();
		} else {
			return local9.aClass14_Sub19_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "()I")
	@Override
	public int method5509() {
		return 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!v;II)V")
	private void method2857(@OriginalArg(0) Class14_Sub35 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass14_Sub19_Sub4_1.anIntArray550[arg0.anInt6302] & 0x4) != 0 && arg0.anInt6291 < 0) {
			@Pc(30) int local30 = this.aClass14_Sub19_Sub4_1.anIntArray551[arg0.anInt6302] / Static223.anInt5818;
			@Pc(40) int local40 = (local30 + 1048575 - arg0.anInt6285) / local30;
			arg0.anInt6285 = arg0.anInt6285 + arg1 * local30 & 0xFFFFF;
			if (local40 <= arg1) {
				if (this.aClass14_Sub19_Sub4_1.anIntArray558[arg0.anInt6302] == 0) {
					arg0.aClass14_Sub19_Sub3_3 = Static365.method4835(arg0.aClass14_Sub11_Sub1_1, arg0.aClass14_Sub19_Sub3_3.method4821(), arg0.aClass14_Sub19_Sub3_3.method4839(), arg0.aClass14_Sub19_Sub3_3.method4853());
				} else {
					arg0.aClass14_Sub19_Sub3_3 = Static365.method4835(arg0.aClass14_Sub11_Sub1_1, arg0.aClass14_Sub19_Sub3_3.method4821(), 0, arg0.aClass14_Sub19_Sub3_3.method4853());
					this.aClass14_Sub19_Sub4_1.method5529(arg0, arg0.aClass14_Sub24_1.aShortArray99[arg0.anInt6289] < 0);
				}
				if (arg0.aClass14_Sub24_1.aShortArray99[arg0.anInt6289] < 0) {
					arg0.aClass14_Sub19_Sub3_3.method4840(-1);
				}
				arg1 = arg0.anInt6285 / local30;
			}
		}
		arg0.aClass14_Sub19_Sub3_3.method5507(arg1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!v;III[I)V")
	private void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub35 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass14_Sub19_Sub4_1.anIntArray550[arg1.anInt6302] & 0x4) != 0 && arg1.anInt6291 < 0) {
			@Pc(29) int local29 = this.aClass14_Sub19_Sub4_1.anIntArray551[arg1.anInt6302] / Static223.anInt5818;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg1.anInt6285) / local29;
				if (arg3 < local39) {
					arg1.anInt6285 += local29 * arg3;
					break;
				}
				arg1.aClass14_Sub19_Sub3_3.method5504(arg4, arg0, local39);
				arg0 += local39;
				arg1.anInt6285 += local39 * local29 - 1048576;
				arg3 -= local39;
				@Pc(70) int local70 = Static223.anInt5818 / 100;
				@Pc(74) int local74 = 262144 / local29;
				if (local70 > local74) {
					local70 = local74;
				}
				@Pc(86) Class14_Sub19_Sub3 local86 = arg1.aClass14_Sub19_Sub3_3;
				if (this.aClass14_Sub19_Sub4_1.anIntArray558[arg1.anInt6302] == 0) {
					arg1.aClass14_Sub19_Sub3_3 = Static365.method4835(arg1.aClass14_Sub11_Sub1_1, local86.method4821(), local86.method4839(), local86.method4853());
				} else {
					arg1.aClass14_Sub19_Sub3_3 = Static365.method4835(arg1.aClass14_Sub11_Sub1_1, local86.method4821(), 0, local86.method4853());
					this.aClass14_Sub19_Sub4_1.method5529(arg1, arg1.aClass14_Sub24_1.aShortArray99[arg1.anInt6289] < 0);
					arg1.aClass14_Sub19_Sub3_3.method4833(local70, local86.method4839());
				}
				if (arg1.aClass14_Sub24_1.aShortArray99[arg1.anInt6289] < 0) {
					arg1.aClass14_Sub19_Sub3_3.method4840(-1);
				}
				local86.method4828(local70);
				local86.method5504(arg4, arg0, arg2 - arg0);
				if (local86.method4845()) {
					this.aClass14_Sub19_Sub2_2.method4248(local86);
				}
			}
		}
		arg1.aClass14_Sub19_Sub3_3.method5504(arg4, arg0, arg3);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([III)V")
	@Override
	public void method5504(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass14_Sub19_Sub2_2.method5504(arg0, arg1, arg2);
		for (@Pc(17) Class14_Sub35 local17 = (Class14_Sub35) this.aClass18_13.method459(); local17 != null; local17 = (Class14_Sub35) this.aClass18_13.method453()) {
			if (!this.aClass14_Sub19_Sub4_1.method5527(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt6288 >= local29) {
						this.method2858(local27, local17, local27 + local29, local29, arg0);
						local17.anInt6288 -= local29;
						break;
					}
					this.method2858(local27, local17, local29 + local27, local17.anInt6288, arg0);
					local29 -= local17.anInt6288;
					local27 += local17.anInt6288;
				} while (!this.aClass14_Sub19_Sub4_1.method5541(arg0, local17, local29, local27));
			}
		}
	}
}
