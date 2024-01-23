import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Lclient!bo;")
	public Class24 aClass24_29 = new Class24();

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "Lclient!de;")
	public Class1_Sub4_Sub2 aClass1_Sub4_Sub2_1 = new Class1_Sub4_Sub2();

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!hf;")
	private Class1_Sub4_Sub3 aClass1_Sub4_Sub3_4;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!hf;)V")
	public Class1_Sub4_Sub4(@OriginalArg(0) Class1_Sub4_Sub3 arg0) {
		this.aClass1_Sub4_Sub3_4 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!lk;II)V")
	private void method4194(@OriginalArg(0) Class1_Sub15 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub4_Sub3_4.anIntArray159[arg0.anInt3354] & 0x4) != 0 && arg0.anInt3343 < 0) {
			@Pc(27) int local27 = this.aClass1_Sub4_Sub3_4.anIntArray163[arg0.anInt3354] / Static152.anInt3130;
			@Pc(38) int local38 = (local27 + 1048575 - arg0.anInt3350) / local27;
			arg0.anInt3350 = arg0.anInt3350 + arg1 * local27 & 0xFFFFF;
			if (local38 <= arg1) {
				if (this.aClass1_Sub4_Sub3_4.anIntArray153[arg0.anInt3354] == 0) {
					arg0.aClass1_Sub4_Sub1_3 = Static317.method263(arg0.aClass1_Sub7_Sub1_1, arg0.aClass1_Sub4_Sub1_3.method244(), arg0.aClass1_Sub4_Sub1_3.method251(), arg0.aClass1_Sub4_Sub1_3.method262());
				} else {
					arg0.aClass1_Sub4_Sub1_3 = Static317.method263(arg0.aClass1_Sub7_Sub1_1, arg0.aClass1_Sub4_Sub1_3.method244(), 0, arg0.aClass1_Sub4_Sub1_3.method262());
					this.aClass1_Sub4_Sub3_4.method1496(arg0, arg0.aClass1_Sub23_1.aShortArray60[arg0.anInt3362] < 0);
				}
				if (arg0.aClass1_Sub23_1.aShortArray60[arg0.anInt3362] < 0) {
					arg0.aClass1_Sub4_Sub1_3.method241(-1);
				}
				arg1 = arg0.anInt3350 / local27;
			}
		}
		arg0.aClass1_Sub4_Sub1_3.method4192(arg1);
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()Lclient!vc;")
	@Override
	public Class1_Sub4 method4189() {
		@Pc(9) Class1_Sub15 local9 = (Class1_Sub15) this.aClass24_29.method460();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub4_Sub1_3 == null) {
			return this.method4186();
		} else {
			return local9.aClass1_Sub4_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "([III)V")
	@Override
	public void method4190(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub4_Sub2_1.method4190(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub15 local17 = (Class1_Sub15) this.aClass24_29.method460(); local17 != null; local17 = (Class1_Sub15) this.aClass24_29.method464()) {
			if (!this.aClass1_Sub4_Sub3_4.method1474(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt3352) {
						this.method4196(local29, local27 + local29, local27, local17, arg0);
						local17.anInt3352 -= local29;
						break;
					}
					this.method4196(local17.anInt3352, local27 + local29, local27, local17, arg0);
					local29 -= local17.anInt3352;
					local27 += local17.anInt3352;
				} while (!this.aClass1_Sub4_Sub3_4.method1484(local27, arg0, local17, local29));
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIILclient!lk;[I)V")
	private void method4196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub15 arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub4_Sub3_4.anIntArray159[arg3.anInt3354] & 0x4) != 0 && arg3.anInt3343 < 0) {
			@Pc(30) int local30 = this.aClass1_Sub4_Sub3_4.anIntArray163[arg3.anInt3354] / Static152.anInt3130;
			while (true) {
				@Pc(40) int local40 = (local30 + 1048575 - arg3.anInt3350) / local30;
				if (local40 > arg0) {
					arg3.anInt3350 += local30 * arg0;
					break;
				}
				arg3.aClass1_Sub4_Sub1_3.method4190(arg4, arg2, local40);
				arg0 -= local40;
				arg3.anInt3350 += local30 * local40 - 1048576;
				arg2 += local40;
				@Pc(75) int local75 = Static152.anInt3130 / 100;
				@Pc(79) int local79 = 262144 / local30;
				@Pc(82) Class1_Sub4_Sub1 local82 = arg3.aClass1_Sub4_Sub1_3;
				if (local79 < local75) {
					local75 = local79;
				}
				if (this.aClass1_Sub4_Sub3_4.anIntArray153[arg3.anInt3354] == 0) {
					arg3.aClass1_Sub4_Sub1_3 = Static317.method263(arg3.aClass1_Sub7_Sub1_1, local82.method244(), local82.method251(), local82.method262());
				} else {
					arg3.aClass1_Sub4_Sub1_3 = Static317.method263(arg3.aClass1_Sub7_Sub1_1, local82.method244(), 0, local82.method262());
					this.aClass1_Sub4_Sub3_4.method1496(arg3, arg3.aClass1_Sub23_1.aShortArray60[arg3.anInt3362] < 0);
					arg3.aClass1_Sub4_Sub1_3.method254(local75, local82.method251());
				}
				if (arg3.aClass1_Sub23_1.aShortArray60[arg3.anInt3362] < 0) {
					arg3.aClass1_Sub4_Sub1_3.method241(-1);
				}
				local82.method259(local75);
				local82.method4190(arg4, arg2, arg1 - arg2);
				if (local82.method250()) {
					this.aClass1_Sub4_Sub2_1.method775(local82);
				}
			}
		}
		arg3.aClass1_Sub4_Sub1_3.method4190(arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()Lclient!vc;")
	@Override
	public Class1_Sub4 method4186() {
		@Pc(9) Class1_Sub15 local9;
		do {
			local9 = (Class1_Sub15) this.aClass24_29.method464();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub4_Sub1_3 == null);
		return local9.aClass1_Sub4_Sub1_3;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	@Override
	public void method4192(@OriginalArg(0) int arg0) {
		this.aClass1_Sub4_Sub2_1.method4192(arg0);
		for (@Pc(15) Class1_Sub15 local15 = (Class1_Sub15) this.aClass24_29.method460(); local15 != null; local15 = (Class1_Sub15) this.aClass24_29.method464()) {
			if (!this.aClass1_Sub4_Sub3_4.method1474(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local15.anInt3352 >= local27) {
						this.method4194(local15, local27);
						local15.anInt3352 -= local27;
						break;
					}
					this.method4194(local15, local15.anInt3352);
					local27 -= local15.anInt3352;
				} while (!this.aClass1_Sub4_Sub3_4.method1484(0, null, local15, local27));
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()I")
	@Override
	public int method4188() {
		return 0;
	}
}
