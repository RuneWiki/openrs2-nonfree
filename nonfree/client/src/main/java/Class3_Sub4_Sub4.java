import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "Lclient!gk;")
	public final Class112 aClass112_59 = new Class112();

	@OriginalMember(owner = "client!sn", name = "G", descriptor = "Lclient!bea;")
	public final Class3_Sub4_Sub2 aClass3_Sub4_Sub2_2 = new Class3_Sub4_Sub2();

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Lclient!rda;")
	private final Class3_Sub4_Sub3 aClass3_Sub4_Sub3_3;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class3_Sub4_Sub4(@OriginalArg(0) Class3_Sub4_Sub3 arg0) {
		this.aClass3_Sub4_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!bk;II)V")
	private void method6661(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass3_Sub4_Sub3_3.anIntArray481[arg0.anInt861] & 0x4) != 0 && arg0.anInt866 < 0) {
			@Pc(28) int local28 = this.aClass3_Sub4_Sub3_3.anIntArray478[arg0.anInt861] / Static404.anInt6999;
			@Pc(38) int local38 = (local28 + 1048575 - arg0.anInt857) / local28;
			arg0.anInt857 = arg0.anInt857 + arg1 * local28 & 0xFFFFF;
			if (arg1 >= local38) {
				if (this.aClass3_Sub4_Sub3_3.anIntArray487[arg0.anInt861] == 0) {
					arg0.aClass3_Sub4_Sub1_1 = Static597.method277(arg0.aClass3_Sub48_Sub1_1, arg0.aClass3_Sub4_Sub1_1.method282(), arg0.aClass3_Sub4_Sub1_1.method291(), arg0.aClass3_Sub4_Sub1_1.method287());
				} else {
					arg0.aClass3_Sub4_Sub1_1 = Static597.method277(arg0.aClass3_Sub48_Sub1_1, arg0.aClass3_Sub4_Sub1_1.method282(), 0, arg0.aClass3_Sub4_Sub1_1.method287());
					this.aClass3_Sub4_Sub3_3.method6346(arg0.aClass3_Sub9_1.aShortArray11[arg0.anInt858] < 0, arg0);
				}
				if (arg0.aClass3_Sub9_1.aShortArray11[arg0.anInt858] < 0) {
					arg0.aClass3_Sub4_Sub1_1.method289(-1);
				}
				arg1 = arg0.anInt857 / local28;
			}
		}
		arg0.aClass3_Sub4_Sub1_1.method6658(arg1);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "([III)V")
	@Override
	public void method6654(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub4_Sub2_2.method6654(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub8 local17 = (Class3_Sub8) this.aClass112_59.method3088(); local17 != null; local17 = (Class3_Sub8) this.aClass112_59.method3084()) {
			if (!this.aClass3_Sub4_Sub3_3.method6347(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt853) {
						this.method6664(local27 + local29, local29, local17, arg0, local27);
						local17.anInt853 -= local27;
						break;
					}
					this.method6664(local29 + local27, local29, local17, arg0, local17.anInt853);
					local27 -= local17.anInt853;
					local29 += local17.anInt853;
				} while (!this.aClass3_Sub4_Sub3_3.method6345(arg0, local17, local27, local29));
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "()Lclient!nj;")
	@Override
	public Class3_Sub4 method6660() {
		@Pc(9) Class3_Sub8 local9;
		do {
			local9 = (Class3_Sub8) this.aClass112_59.method3084();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub4_Sub1_1 == null);
		return local9.aClass3_Sub4_Sub1_1;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "()Lclient!nj;")
	@Override
	public Class3_Sub4 method6656() {
		@Pc(9) Class3_Sub8 local9 = (Class3_Sub8) this.aClass112_59.method3088();
		if (local9 == null) {
			return null;
		} else if (local9.aClass3_Sub4_Sub1_1 == null) {
			return this.method6660();
		} else {
			return local9.aClass3_Sub4_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	@Override
	public void method6658(@OriginalArg(0) int arg0) {
		this.aClass3_Sub4_Sub2_2.method6658(arg0);
		for (@Pc(15) Class3_Sub8 local15 = (Class3_Sub8) this.aClass112_59.method3088(); local15 != null; local15 = (Class3_Sub8) this.aClass112_59.method3084()) {
			if (!this.aClass3_Sub4_Sub3_3.method6347(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt853 >= local25) {
						this.method6661(local15, local25);
						local15.anInt853 -= local25;
						break;
					}
					this.method6661(local15, local15.anInt853);
					local25 -= local15.anInt853;
				} while (!this.aClass3_Sub4_Sub3_3.method6345(null, local15, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILclient!bk;I[II)V")
	private void method6664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub8 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub4_Sub3_3.anIntArray481[arg2.anInt861] & 0x4) != 0 && arg2.anInt866 < 0) {
			@Pc(36) int local36 = this.aClass3_Sub4_Sub3_3.anIntArray478[arg2.anInt861] / Static404.anInt6999;
			while (true) {
				@Pc(46) int local46 = (local36 + 1048575 - arg2.anInt857) / local36;
				if (local46 > arg4) {
					arg2.anInt857 += arg4 * local36;
					break;
				}
				arg2.aClass3_Sub4_Sub1_1.method6654(arg3, arg1, local46);
				arg2.anInt857 += local36 * local46 - 1048576;
				arg4 -= local46;
				arg1 += local46;
				@Pc(77) int local77 = Static404.anInt6999 / 100;
				@Pc(81) int local81 = 262144 / local36;
				if (local81 < local77) {
					local77 = local81;
				}
				@Pc(89) Class3_Sub4_Sub1 local89 = arg2.aClass3_Sub4_Sub1_1;
				if (this.aClass3_Sub4_Sub3_3.anIntArray487[arg2.anInt861] == 0) {
					arg2.aClass3_Sub4_Sub1_1 = Static597.method277(arg2.aClass3_Sub48_Sub1_1, local89.method282(), local89.method291(), local89.method287());
				} else {
					arg2.aClass3_Sub4_Sub1_1 = Static597.method277(arg2.aClass3_Sub48_Sub1_1, local89.method282(), 0, local89.method287());
					this.aClass3_Sub4_Sub3_3.method6346(arg2.aClass3_Sub9_1.aShortArray11[arg2.anInt858] < 0, arg2);
					arg2.aClass3_Sub4_Sub1_1.method280(local77, local89.method291());
				}
				if (arg2.aClass3_Sub9_1.aShortArray11[arg2.anInt858] < 0) {
					arg2.aClass3_Sub4_Sub1_1.method289(-1);
				}
				local89.method288(local77);
				local89.method6654(arg3, arg1, arg0 - arg1);
				if (local89.method274()) {
					this.aClass3_Sub4_Sub2_2.method645(local89);
				}
			}
		}
		arg2.aClass3_Sub4_Sub1_1.method6654(arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "()I")
	@Override
	public int method6655() {
		return 0;
	}
}
