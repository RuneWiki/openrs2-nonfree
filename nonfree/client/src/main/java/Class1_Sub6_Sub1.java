import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "Lclient!sr;")
	public final Class227 aClass227_4 = new Class227();

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!tr;")
	public final Class1_Sub6_Sub4 aClass1_Sub6_Sub4_1 = new Class1_Sub6_Sub4();

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "Lclient!qm;")
	private final Class1_Sub6_Sub2 aClass1_Sub6_Sub2_1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!qm;)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) Class1_Sub6_Sub2 arg0) {
		this.aClass1_Sub6_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()Lclient!vb;")
	@Override
	public Class1_Sub6 method5167() {
		@Pc(9) Class1_Sub23 local9 = (Class1_Sub23) this.aClass227_4.method4967();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub6_Sub3_3 == null) {
			return this.method5168();
		} else {
			return local9.aClass1_Sub6_Sub3_3;
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lclient!vb;")
	@Override
	public Class1_Sub6 method5168() {
		@Pc(9) Class1_Sub23 local9;
		do {
			local9 = (Class1_Sub23) this.aClass227_4.method4973();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub6_Sub3_3 == null);
		return local9.aClass1_Sub6_Sub3_3;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	@Override
	public int method5165() {
		return 0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "([III)V")
	@Override
	public void method5171(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub6_Sub4_1.method5171(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub23 local17 = (Class1_Sub23) this.aClass227_4.method4967(); local17 != null; local17 = (Class1_Sub23) this.aClass227_4.method4973()) {
			if (!this.aClass1_Sub6_Sub2_1.method4463(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt2763) {
						this.method387(local27, local17, arg0, local29, local29 + local27);
						local17.anInt2763 -= local27;
						break;
					}
					this.method387(local17.anInt2763, local17, arg0, local29, local29 + local27);
					local27 -= local17.anInt2763;
					local29 += local17.anInt2763;
				} while (!this.aClass1_Sub6_Sub2_1.method4448(local29, local17, arg0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	@Override
	public void method5166(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_Sub4_1.method5166(arg0);
		for (@Pc(15) Class1_Sub23 local15 = (Class1_Sub23) this.aClass227_4.method4967(); local15 != null; local15 = (Class1_Sub23) this.aClass227_4.method4973()) {
			if (!this.aClass1_Sub6_Sub2_1.method4463(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2763) {
						this.method388(local15, local25);
						local15.anInt2763 -= local25;
						break;
					}
					this.method388(local15, local15.anInt2763);
					local25 -= local15.anInt2763;
				} while (!this.aClass1_Sub6_Sub2_1.method4448(0, local15, null, local25));
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ig;[IIII)V")
	private void method387(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub23 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass1_Sub6_Sub2_1.anIntArray376[arg1.anInt2778] & 0x4) != 0 && arg1.anInt2777 < 0) {
			@Pc(26) int local26 = this.aClass1_Sub6_Sub2_1.anIntArray378[arg1.anInt2778] / Static228.anInt4846;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt2772) / local26;
				if (local36 > arg0) {
					arg1.anInt2772 += arg0 * local26;
					break;
				}
				arg1.aClass1_Sub6_Sub3_3.method5171(arg2, arg3, local36);
				arg0 -= local36;
				arg1.anInt2772 += local26 * local36 - 1048576;
				arg3 += local36;
				@Pc(71) int local71 = Static228.anInt4846 / 100;
				@Pc(75) int local75 = 262144 / local26;
				if (local75 < local71) {
					local71 = local75;
				}
				@Pc(87) Class1_Sub6_Sub3 local87 = arg1.aClass1_Sub6_Sub3_3;
				if (this.aClass1_Sub6_Sub2_1.anIntArray379[arg1.anInt2778] == 0) {
					arg1.aClass1_Sub6_Sub3_3 = Static466.method4640(arg1.aClass1_Sub25_Sub1_1, local87.method4654(), local87.method4669(), local87.method4673());
				} else {
					arg1.aClass1_Sub6_Sub3_3 = Static466.method4640(arg1.aClass1_Sub25_Sub1_1, local87.method4654(), 0, local87.method4673());
					this.aClass1_Sub6_Sub2_1.method4449(arg1.aClass1_Sub41_1.aShortArray113[arg1.anInt2761] < 0, arg1);
					arg1.aClass1_Sub6_Sub3_3.method4645(local71, local87.method4669());
				}
				if (arg1.aClass1_Sub41_1.aShortArray113[arg1.anInt2761] < 0) {
					arg1.aClass1_Sub6_Sub3_3.method4638(-1);
				}
				local87.method4653(local71);
				local87.method5171(arg2, arg3, arg4 - arg3);
				if (local87.method4675()) {
					this.aClass1_Sub6_Sub4_1.method5175(local87);
				}
			}
		}
		arg1.aClass1_Sub6_Sub3_3.method5171(arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!ig;II)V")
	private void method388(@OriginalArg(0) Class1_Sub23 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass1_Sub6_Sub2_1.anIntArray376[arg0.anInt2778] & 0x4) != 0 && arg0.anInt2777 < 0) {
			@Pc(24) int local24 = this.aClass1_Sub6_Sub2_1.anIntArray378[arg0.anInt2778] / Static228.anInt4846;
			@Pc(34) int local34 = (local24 + 1048575 - arg0.anInt2772) / local24;
			arg0.anInt2772 = arg0.anInt2772 + local24 * arg1 & 0xFFFFF;
			if (arg1 >= local34) {
				if (this.aClass1_Sub6_Sub2_1.anIntArray379[arg0.anInt2778] == 0) {
					arg0.aClass1_Sub6_Sub3_3 = Static466.method4640(arg0.aClass1_Sub25_Sub1_1, arg0.aClass1_Sub6_Sub3_3.method4654(), arg0.aClass1_Sub6_Sub3_3.method4669(), arg0.aClass1_Sub6_Sub3_3.method4673());
				} else {
					arg0.aClass1_Sub6_Sub3_3 = Static466.method4640(arg0.aClass1_Sub25_Sub1_1, arg0.aClass1_Sub6_Sub3_3.method4654(), 0, arg0.aClass1_Sub6_Sub3_3.method4673());
					this.aClass1_Sub6_Sub2_1.method4449(arg0.aClass1_Sub41_1.aShortArray113[arg0.anInt2761] < 0, arg0);
				}
				if (arg0.aClass1_Sub41_1.aShortArray113[arg0.anInt2761] < 0) {
					arg0.aClass1_Sub6_Sub3_3.method4638(-1);
				}
				arg1 = arg0.anInt2772 / local24;
			}
		}
		arg0.aClass1_Sub6_Sub3_3.method5166(arg1);
	}
}
