import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ap", name = "w", descriptor = "Lclient!kba;")
	public final Class163 aClass163_9 = new Class163();

	@OriginalMember(owner = "client!ap", name = "y", descriptor = "Lclient!la;")
	public final Class6_Sub4_Sub3 aClass6_Sub4_Sub3_1 = new Class6_Sub4_Sub3();

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "Lclient!jga;")
	private final Class6_Sub4_Sub2 aClass6_Sub4_Sub2_1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!jga;)V")
	public Class6_Sub4_Sub1(@OriginalArg(0) Class6_Sub4_Sub2 arg0) {
		this.aClass6_Sub4_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "()I")
	@Override
	public int method8636() {
		return 0;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "([III)V")
	@Override
	public void method8635(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub4_Sub3_1.method8635(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub24 local17 = (Class6_Sub24) this.aClass163_9.method4966(); local17 != null; local17 = (Class6_Sub24) this.aClass163_9.method4965()) {
			if (!this.aClass6_Sub4_Sub2_1.method4786(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt4551 >= local29) {
						this.method638(local29 + local27, local29, local27, arg0, local17);
						local17.anInt4551 -= local29;
						break;
					}
					this.method638(local29 + local27, local17.anInt4551, local27, arg0, local17);
					local27 += local17.anInt4551;
					local29 -= local17.anInt4551;
				} while (!this.aClass6_Sub4_Sub2_1.method4781(local29, arg0, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII[ILclient!hea;)V")
	private void method638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class6_Sub24 arg4) {
		if ((this.aClass6_Sub4_Sub2_1.anIntArray250[arg4.anInt4565] & 0x4) != 0 && arg4.anInt4558 < 0) {
			@Pc(25) int local25 = this.aClass6_Sub4_Sub2_1.anIntArray253[arg4.anInt4565] / Static322.anInt6392;
			while (true) {
				@Pc(36) int local36 = (local25 + 1048575 - arg4.anInt4546) / local25;
				if (arg1 < local36) {
					arg4.anInt4546 += local25 * arg1;
					break;
				}
				arg4.aClass6_Sub4_Sub5_1.method8635(arg3, arg2, local36);
				arg2 += local36;
				arg4.anInt4546 += local36 * local25 - 1048576;
				arg1 -= local36;
				@Pc(67) int local67 = Static322.anInt6392 / 100;
				@Pc(71) int local71 = 262144 / local25;
				if (local71 < local67) {
					local67 = local71;
				}
				@Pc(79) Class6_Sub4_Sub5 local79 = arg4.aClass6_Sub4_Sub5_1;
				if (this.aClass6_Sub4_Sub2_1.anIntArray252[arg4.anInt4565] == 0) {
					arg4.aClass6_Sub4_Sub5_1 = Static656.method8647(arg4.aClass6_Sub27_Sub1_1, local79.method8675(), local79.method8645(), local79.method8671());
				} else {
					arg4.aClass6_Sub4_Sub5_1 = Static656.method8647(arg4.aClass6_Sub27_Sub1_1, local79.method8675(), 0, local79.method8671());
					this.aClass6_Sub4_Sub2_1.method4802(arg4.aClass6_Sub46_1.aShortArray161[arg4.anInt4562] < 0, arg4);
					arg4.aClass6_Sub4_Sub5_1.method8642(local67, local79.method8645());
				}
				if (arg4.aClass6_Sub46_1.aShortArray161[arg4.anInt4562] < 0) {
					arg4.aClass6_Sub4_Sub5_1.method8667(-1);
				}
				local79.method8668(local67);
				local79.method8635(arg3, arg2, arg0 - arg2);
				if (local79.method8670()) {
					this.aClass6_Sub4_Sub3_1.method5194(local79);
				}
			}
		}
		arg4.aClass6_Sub4_Sub5_1.method8635(arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "()Lclient!mha;")
	@Override
	public Class6_Sub4 method8637() {
		@Pc(9) Class6_Sub24 local9;
		do {
			local9 = (Class6_Sub24) this.aClass163_9.method4965();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub4_Sub5_1 == null);
		return local9.aClass6_Sub4_Sub5_1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()Lclient!mha;")
	@Override
	public Class6_Sub4 method8632() {
		@Pc(9) Class6_Sub24 local9 = (Class6_Sub24) this.aClass163_9.method4966();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub4_Sub5_1 == null) {
			return this.method8637();
		} else {
			return local9.aClass6_Sub4_Sub5_1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0) {
		this.aClass6_Sub4_Sub3_1.method8631(arg0);
		for (@Pc(15) Class6_Sub24 local15 = (Class6_Sub24) this.aClass163_9.method4966(); local15 != null; local15 = (Class6_Sub24) this.aClass163_9.method4965()) {
			if (!this.aClass6_Sub4_Sub2_1.method4786(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt4551) {
						this.method640(local25, local15);
						local15.anInt4551 -= local25;
						break;
					}
					this.method640(local15.anInt4551, local15);
					local25 -= local15.anInt4551;
				} while (!this.aClass6_Sub4_Sub2_1.method4781(local25, (int[]) null, 0, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!hea;I)V")
	private void method640(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub24 arg1) {
		if ((this.aClass6_Sub4_Sub2_1.anIntArray250[arg1.anInt4565] & 0x4) != 0 && arg1.anInt4558 < 0) {
			@Pc(27) int local27 = this.aClass6_Sub4_Sub2_1.anIntArray253[arg1.anInt4565] / Static322.anInt6392;
			@Pc(38) int local38 = (local27 + 1048575 - arg1.anInt4546) / local27;
			arg1.anInt4546 = arg0 * local27 + arg1.anInt4546 & 0xFFFFF;
			if (local38 <= arg0) {
				if (this.aClass6_Sub4_Sub2_1.anIntArray252[arg1.anInt4565] == 0) {
					arg1.aClass6_Sub4_Sub5_1 = Static656.method8647(arg1.aClass6_Sub27_Sub1_1, arg1.aClass6_Sub4_Sub5_1.method8675(), arg1.aClass6_Sub4_Sub5_1.method8645(), arg1.aClass6_Sub4_Sub5_1.method8671());
				} else {
					arg1.aClass6_Sub4_Sub5_1 = Static656.method8647(arg1.aClass6_Sub27_Sub1_1, arg1.aClass6_Sub4_Sub5_1.method8675(), 0, arg1.aClass6_Sub4_Sub5_1.method8671());
					this.aClass6_Sub4_Sub2_1.method4802(arg1.aClass6_Sub46_1.aShortArray161[arg1.anInt4562] < 0, arg1);
				}
				if (arg1.aClass6_Sub46_1.aShortArray161[arg1.anInt4562] < 0) {
					arg1.aClass6_Sub4_Sub5_1.method8667(-1);
				}
				arg0 = arg1.anInt4546 / local27;
			}
		}
		arg1.aClass6_Sub4_Sub5_1.method8631(arg0);
	}
}
