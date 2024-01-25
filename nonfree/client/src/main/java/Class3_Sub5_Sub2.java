import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "Lclient!tu;")
	public final Class229 aClass229_34 = new Class229();

	@OriginalMember(owner = "client!ol", name = "F", descriptor = "Lclient!sv;")
	public final Class3_Sub5_Sub4 aClass3_Sub5_Sub4_2 = new Class3_Sub5_Sub4();

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "Lclient!li;")
	private final Class3_Sub5_Sub1 aClass3_Sub5_Sub1_90;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!li;)V")
	public Class3_Sub5_Sub2(@OriginalArg(0) Class3_Sub5_Sub1 arg0) {
		this.aClass3_Sub5_Sub1_90 = arg0;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "()Lclient!ar;")
	@Override
	public Class3_Sub5 method5187() {
		@Pc(9) Class3_Sub28 local9 = (Class3_Sub28) this.aClass229_34.method5328();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub5_Sub3_2 == null) {
			return this.method5188();
		} else {
			return local9.aClass3_Sub5_Sub3_2;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()I")
	@Override
	public int method5185() {
		return 0;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
	@Override
	public void method5190(@OriginalArg(0) int arg0) {
		this.aClass3_Sub5_Sub4_2.method5190(arg0);
		for (@Pc(15) Class3_Sub28 local15 = (Class3_Sub28) this.aClass229_34.method5328(); local15 != null; local15 = (Class3_Sub28) this.aClass229_34.method5325()) {
			if (!this.aClass3_Sub5_Sub1_90.method3630(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt4384) {
						this.method4242(local25, local15);
						local15.anInt4384 -= local25;
						break;
					}
					this.method4242(local15.anInt4384, local15);
					local25 -= local15.anInt4384;
				} while (!this.aClass3_Sub5_Sub1_90.method3609(0, null, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIZ[IILclient!ld;)V")
	private void method4241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub28 arg4) {
		if ((this.aClass3_Sub5_Sub1_90.anIntArray334[arg4.anInt4374] & 0x4) != 0 && arg4.anInt4364 < 0) {
			@Pc(22) int local22 = this.aClass3_Sub5_Sub1_90.anIntArray340[arg4.anInt4374] / Static94.anInt2028;
			while (true) {
				@Pc(32) int local32 = (local22 + 1048575 - arg4.anInt4366) / local22;
				if (local32 > arg3) {
					arg4.anInt4366 += local22 * arg3;
					break;
				}
				arg4.aClass3_Sub5_Sub3_2.method5189(arg2, arg0, local32);
				arg4.anInt4366 += local22 * local32 - 1048576;
				arg0 += local32;
				arg3 -= local32;
				@Pc(63) int local63 = Static94.anInt2028 / 100;
				@Pc(67) int local67 = 262144 / local22;
				if (local67 < local63) {
					local63 = local67;
				}
				@Pc(79) Class3_Sub5_Sub3 local79 = arg4.aClass3_Sub5_Sub3_2;
				if (this.aClass3_Sub5_Sub1_90.anIntArray347[arg4.anInt4374] == 0) {
					arg4.aClass3_Sub5_Sub3_2 = Static461.method4339(arg4.aClass3_Sub13_Sub1_2, local79.method4358(), local79.method4348(), local79.method4340());
				} else {
					arg4.aClass3_Sub5_Sub3_2 = Static461.method4339(arg4.aClass3_Sub13_Sub1_2, local79.method4358(), 0, local79.method4340());
					this.aClass3_Sub5_Sub1_90.method3631(arg4, arg4.aClass3_Sub18_1.aShortArray40[arg4.anInt4369] < 0);
					arg4.aClass3_Sub5_Sub3_2.method4331(local63, local79.method4348());
				}
				if (arg4.aClass3_Sub18_1.aShortArray40[arg4.anInt4369] < 0) {
					arg4.aClass3_Sub5_Sub3_2.method4360(-1);
				}
				local79.method4346(local63);
				local79.method5189(arg2, arg0, arg1 - arg0);
				if (local79.method4332()) {
					this.aClass3_Sub5_Sub4_2.method5197(local79);
				}
			}
		}
		arg4.aClass3_Sub5_Sub3_2.method5189(arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILclient!ld;)V")
	private void method4242(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub28 arg1) {
		if ((this.aClass3_Sub5_Sub1_90.anIntArray334[arg1.anInt4374] & 0x4) != 0 && arg1.anInt4364 < 0) {
			@Pc(30) int local30 = this.aClass3_Sub5_Sub1_90.anIntArray340[arg1.anInt4374] / Static94.anInt2028;
			@Pc(40) int local40 = (local30 + 1048575 - arg1.anInt4366) / local30;
			arg1.anInt4366 = arg1.anInt4366 + local30 * arg0 & 0xFFFFF;
			if (arg0 >= local40) {
				if (this.aClass3_Sub5_Sub1_90.anIntArray347[arg1.anInt4374] == 0) {
					arg1.aClass3_Sub5_Sub3_2 = Static461.method4339(arg1.aClass3_Sub13_Sub1_2, arg1.aClass3_Sub5_Sub3_2.method4358(), arg1.aClass3_Sub5_Sub3_2.method4348(), arg1.aClass3_Sub5_Sub3_2.method4340());
				} else {
					arg1.aClass3_Sub5_Sub3_2 = Static461.method4339(arg1.aClass3_Sub13_Sub1_2, arg1.aClass3_Sub5_Sub3_2.method4358(), 0, arg1.aClass3_Sub5_Sub3_2.method4340());
					this.aClass3_Sub5_Sub1_90.method3631(arg1, arg1.aClass3_Sub18_1.aShortArray40[arg1.anInt4369] < 0);
				}
				if (arg1.aClass3_Sub18_1.aShortArray40[arg1.anInt4369] < 0) {
					arg1.aClass3_Sub5_Sub3_2.method4360(-1);
				}
				arg0 = arg1.anInt4366 / local30;
			}
		}
		arg1.aClass3_Sub5_Sub3_2.method5190(arg0);
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "()Lclient!ar;")
	@Override
	public Class3_Sub5 method5188() {
		@Pc(9) Class3_Sub28 local9;
		do {
			local9 = (Class3_Sub28) this.aClass229_34.method5325();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub5_Sub3_2 == null);
		return local9.aClass3_Sub5_Sub3_2;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([III)V")
	@Override
	public void method5189(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub5_Sub4_2.method5189(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub28 local17 = (Class3_Sub28) this.aClass229_34.method5328(); local17 != null; local17 = (Class3_Sub28) this.aClass229_34.method5325()) {
			if (!this.aClass3_Sub5_Sub1_90.method3630(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt4384) {
						this.method4241(local29, local29 + local27, arg0, local27, local17);
						local17.anInt4384 -= local27;
						break;
					}
					this.method4241(local29, local27 + local29, arg0, local17.anInt4384, local17);
					local27 -= local17.anInt4384;
					local29 += local17.anInt4384;
				} while (!this.aClass3_Sub5_Sub1_90.method3609(local29, arg0, local27, local17));
			}
		}
	}
}
