import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Lclient!ps;")
	public final Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Lclient!ru;")
	public final Class3_Sub1_Sub2 aClass3_Sub1_Sub2_1 = new Class3_Sub1_Sub2();

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!wt;")
	private final Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!wt;)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		this.aClass3_Sub1_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)V")
	@Override
	public void method6290(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub1_Sub2_1.method6290(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub31 local17 = (Class3_Sub31) this.aClass193_1.method4519(); local17 != null; local17 = (Class3_Sub31) this.aClass193_1.method4525()) {
			if (!this.aClass3_Sub1_Sub4_1.method6309(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt4045 >= local27) {
						this.method54(local17, local29, local27, arg0, local29 + local27);
						local17.anInt4045 -= local27;
						break;
					}
					this.method54(local17, local29, local17.anInt4045, arg0, local29 + local27);
					local29 += local17.anInt4045;
					local27 -= local17.anInt4045;
				} while (!this.aClass3_Sub1_Sub4_1.method6333(arg0, local17, local29, local27));
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	@Override
	public void method6294(@OriginalArg(0) int arg0) {
		this.aClass3_Sub1_Sub2_1.method6294(arg0);
		for (@Pc(15) Class3_Sub31 local15 = (Class3_Sub31) this.aClass193_1.method4519(); local15 != null; local15 = (Class3_Sub31) this.aClass193_1.method4525()) {
			if (!this.aClass3_Sub1_Sub4_1.method6309(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt4045) {
						this.method55(local15, local25);
						local15.anInt4045 -= local25;
						break;
					}
					this.method55(local15, local15.anInt4045);
					local25 -= local15.anInt4045;
				} while (!this.aClass3_Sub1_Sub4_1.method6333(null, local15, 0, local25));
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!lk;II[III)V")
	private void method54(@OriginalArg(0) Class3_Sub31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass3_Sub1_Sub4_1.anIntArray517[arg0.anInt4041] & 0x4) != 0 && arg0.anInt4049 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub1_Sub4_1.anIntArray514[arg0.anInt4041] / Static203.anInt3626;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg0.anInt4054) / local29;
				if (local39 > arg2) {
					arg0.anInt4054 += local29 * arg2;
					break;
				}
				arg0.aClass3_Sub1_Sub3_3.method6290(arg3, arg1, local39);
				arg0.anInt4054 += local29 * local39 - 1048576;
				arg2 -= local39;
				arg1 += local39;
				@Pc(74) int local74 = Static203.anInt3626 / 100;
				@Pc(78) int local78 = 262144 / local29;
				if (local74 > local78) {
					local74 = local78;
				}
				@Pc(90) Class3_Sub1_Sub3 local90 = arg0.aClass3_Sub1_Sub3_3;
				if (this.aClass3_Sub1_Sub4_1.anIntArray527[arg0.anInt4041] == 0) {
					arg0.aClass3_Sub1_Sub3_3 = Static474.method5343(arg0.aClass3_Sub28_Sub1_1, local90.method5365(), local90.method5351(), local90.method5379());
				} else {
					arg0.aClass3_Sub1_Sub3_3 = Static474.method5343(arg0.aClass3_Sub28_Sub1_1, local90.method5365(), 0, local90.method5379());
					this.aClass3_Sub1_Sub4_1.method6327(arg0.aClass3_Sub21_1.aShortArray36[arg0.anInt4055] < 0, arg0);
					arg0.aClass3_Sub1_Sub3_3.method5363(local74, local90.method5351());
				}
				if (arg0.aClass3_Sub21_1.aShortArray36[arg0.anInt4055] < 0) {
					arg0.aClass3_Sub1_Sub3_3.method5358(-1);
				}
				local90.method5366(local74);
				local90.method6290(arg3, arg1, arg4 - arg1);
				if (local90.method5357()) {
					this.aClass3_Sub1_Sub2_1.method5094(local90);
				}
			}
		}
		arg0.aClass3_Sub1_Sub3_3.method6290(arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()Lclient!wq;")
	@Override
	public Class3_Sub1 method6292() {
		@Pc(9) Class3_Sub31 local9;
		do {
			local9 = (Class3_Sub31) this.aClass193_1.method4525();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub1_Sub3_3 == null);
		return local9.aClass3_Sub1_Sub3_3;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()Lclient!wq;")
	@Override
	public Class3_Sub1 method6296() {
		@Pc(9) Class3_Sub31 local9 = (Class3_Sub31) this.aClass193_1.method4519();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub1_Sub3_3 == null) {
			return this.method6292();
		} else {
			return local9.aClass3_Sub1_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!lk;IB)V")
	private void method55(@OriginalArg(0) Class3_Sub31 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass3_Sub1_Sub4_1.anIntArray517[arg0.anInt4041] & 0x4) != 0 && arg0.anInt4049 < 0) {
			@Pc(27) int local27 = this.aClass3_Sub1_Sub4_1.anIntArray514[arg0.anInt4041] / Static203.anInt3626;
			@Pc(37) int local37 = (local27 + 1048575 - arg0.anInt4054) / local27;
			arg0.anInt4054 = arg0.anInt4054 + arg1 * local27 & 0xFFFFF;
			if (local37 <= arg1) {
				if (this.aClass3_Sub1_Sub4_1.anIntArray527[arg0.anInt4041] == 0) {
					arg0.aClass3_Sub1_Sub3_3 = Static474.method5343(arg0.aClass3_Sub28_Sub1_1, arg0.aClass3_Sub1_Sub3_3.method5365(), arg0.aClass3_Sub1_Sub3_3.method5351(), arg0.aClass3_Sub1_Sub3_3.method5379());
				} else {
					arg0.aClass3_Sub1_Sub3_3 = Static474.method5343(arg0.aClass3_Sub28_Sub1_1, arg0.aClass3_Sub1_Sub3_3.method5365(), 0, arg0.aClass3_Sub1_Sub3_3.method5379());
					this.aClass3_Sub1_Sub4_1.method6327(arg0.aClass3_Sub21_1.aShortArray36[arg0.anInt4055] < 0, arg0);
				}
				if (arg0.aClass3_Sub21_1.aShortArray36[arg0.anInt4055] < 0) {
					arg0.aClass3_Sub1_Sub3_3.method5358(-1);
				}
				arg1 = arg0.anInt4054 / local27;
			}
		}
		arg0.aClass3_Sub1_Sub3_3.method6294(arg1);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()I")
	@Override
	public int method6291() {
		return 0;
	}
}
