import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class6_Sub18_Sub3 extends Class6_Sub18 {

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "Lclient!ws;")
	public final Class361 aClass361_50 = new Class361();

	@OriginalMember(owner = "client!nga", name = "C", descriptor = "Lclient!rh;")
	public final Class6_Sub18_Sub4 aClass6_Sub18_Sub4_1 = new Class6_Sub18_Sub4();

	@OriginalMember(owner = "client!nga", name = "s", descriptor = "Lclient!he;")
	private final Class6_Sub18_Sub2 aClass6_Sub18_Sub2_2;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class6_Sub18_Sub3(@OriginalArg(0) Class6_Sub18_Sub2 arg0) {
		this.aClass6_Sub18_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([III)V")
	@Override
	public void method6372(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub18_Sub4_1.method6372(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub27 local17 = (Class6_Sub27) this.aClass361_50.method7838(); local17 != null; local17 = (Class6_Sub27) this.aClass361_50.method7845()) {
			if (!this.aClass6_Sub18_Sub2_2.method3301(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt4719 >= local27) {
						this.method5266(arg0, local27, local17, local29, local27 + local29);
						local17.anInt4719 -= local27;
						break;
					}
					this.method5266(arg0, local17.anInt4719, local17, local29, local29 + local27);
					local29 += local17.anInt4719;
					local27 -= local17.anInt4719;
				} while (!this.aClass6_Sub18_Sub2_2.method3292(local29, local17, local27, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "()I")
	@Override
	public int method6376() {
		return 0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "()Lclient!mi;")
	@Override
	public Class6_Sub18 method6371() {
		@Pc(9) Class6_Sub27 local9;
		do {
			local9 = (Class6_Sub27) this.aClass361_50.method7845();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub18_Sub1_4 == null);
		return local9.aClass6_Sub18_Sub1_4;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B[IILclient!jh;II)V")
	private void method5266(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub27 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass6_Sub18_Sub2_2.anIntArray236[arg2.anInt4732] & 0x4) != 0 && arg2.anInt4717 < 0) {
			@Pc(26) int local26 = this.aClass6_Sub18_Sub2_2.anIntArray231[arg2.anInt4732] / Static330.anInt6003;
			while (true) {
				@Pc(37) int local37 = (local26 + 1048575 - arg2.anInt4724) / local26;
				if (arg1 < local37) {
					arg2.anInt4724 += local26 * arg1;
					break;
				}
				arg2.aClass6_Sub18_Sub1_4.method6372(arg0, arg3, local37);
				arg1 -= local37;
				arg3 += local37;
				arg2.anInt4724 += local37 * local26 - 1048576;
				@Pc(68) int local68 = Static330.anInt6003 / 100;
				@Pc(72) int local72 = 262144 / local26;
				if (local68 > local72) {
					local68 = local72;
				}
				@Pc(80) Class6_Sub18_Sub1 local80 = arg2.aClass6_Sub18_Sub1_4;
				if (this.aClass6_Sub18_Sub2_2.anIntArray222[arg2.anInt4732] == 0) {
					arg2.aClass6_Sub18_Sub1_4 = Static600.method2677(arg2.aClass6_Sub19_Sub1_4, local80.method2706(), local80.method2689(), local80.method2679());
				} else {
					arg2.aClass6_Sub18_Sub1_4 = Static600.method2677(arg2.aClass6_Sub19_Sub1_4, local80.method2706(), 0, local80.method2679());
					this.aClass6_Sub18_Sub2_2.method3314(arg2.aClass6_Sub28_1.aShortArray54[arg2.anInt4731] < 0, arg2);
					arg2.aClass6_Sub18_Sub1_4.method2692(local68, local80.method2689());
				}
				if (arg2.aClass6_Sub28_1.aShortArray54[arg2.anInt4731] < 0) {
					arg2.aClass6_Sub18_Sub1_4.method2685(-1);
				}
				local80.method2699(local68);
				local80.method6372(arg0, arg3, arg4 - arg3);
				if (local80.method2688()) {
					this.aClass6_Sub18_Sub4_1.method6378(local80);
				}
			}
		}
		arg2.aClass6_Sub18_Sub1_4.method6372(arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
	@Override
	public void method6377(@OriginalArg(0) int arg0) {
		this.aClass6_Sub18_Sub4_1.method6377(arg0);
		for (@Pc(15) Class6_Sub27 local15 = (Class6_Sub27) this.aClass361_50.method7838(); local15 != null; local15 = (Class6_Sub27) this.aClass361_50.method7845()) {
			if (!this.aClass6_Sub18_Sub2_2.method3301(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt4719 >= local25) {
						this.method5267(local25, local15);
						local15.anInt4719 -= local25;
						break;
					}
					this.method5267(local15.anInt4719, local15);
					local25 -= local15.anInt4719;
				} while (!this.aClass6_Sub18_Sub2_2.method3292(0, local15, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BILclient!jh;)V")
	private void method5267(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub27 arg1) {
		if ((this.aClass6_Sub18_Sub2_2.anIntArray236[arg1.anInt4732] & 0x4) != 0 && arg1.anInt4717 < 0) {
			@Pc(26) int local26 = this.aClass6_Sub18_Sub2_2.anIntArray231[arg1.anInt4732] / Static330.anInt6003;
			@Pc(35) int local35 = (local26 + 1048575 - arg1.anInt4724) / local26;
			arg1.anInt4724 = arg0 * local26 + arg1.anInt4724 & 0xFFFFF;
			if (local35 <= arg0) {
				if (this.aClass6_Sub18_Sub2_2.anIntArray222[arg1.anInt4732] == 0) {
					arg1.aClass6_Sub18_Sub1_4 = Static600.method2677(arg1.aClass6_Sub19_Sub1_4, arg1.aClass6_Sub18_Sub1_4.method2706(), arg1.aClass6_Sub18_Sub1_4.method2689(), arg1.aClass6_Sub18_Sub1_4.method2679());
				} else {
					arg1.aClass6_Sub18_Sub1_4 = Static600.method2677(arg1.aClass6_Sub19_Sub1_4, arg1.aClass6_Sub18_Sub1_4.method2706(), 0, arg1.aClass6_Sub18_Sub1_4.method2679());
					this.aClass6_Sub18_Sub2_2.method3314(arg1.aClass6_Sub28_1.aShortArray54[arg1.anInt4731] < 0, arg1);
				}
				if (arg1.aClass6_Sub28_1.aShortArray54[arg1.anInt4731] < 0) {
					arg1.aClass6_Sub18_Sub1_4.method2685(-1);
				}
				arg0 = arg1.anInt4724 / local26;
			}
		}
		arg1.aClass6_Sub18_Sub1_4.method6377(arg0);
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public Class6_Sub18 method6374() {
		@Pc(9) Class6_Sub27 local9 = (Class6_Sub27) this.aClass361_50.method7838();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub18_Sub1_4 == null) {
			return this.method6371();
		} else {
			return local9.aClass6_Sub18_Sub1_4;
		}
	}
}
