import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!le", name = "y", descriptor = "Lclient!nt;")
	public final Class238 aClass238_34 = new Class238();

	@OriginalMember(owner = "client!le", name = "A", descriptor = "Lclient!cc;")
	public final Class2_Sub2_Sub2 aClass2_Sub2_Sub2_3 = new Class2_Sub2_Sub2();

	@OriginalMember(owner = "client!le", name = "v", descriptor = "Lclient!ae;")
	private final Class2_Sub2_Sub1 aClass2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class2_Sub2_Sub3(@OriginalArg(0) Class2_Sub2_Sub1 arg0) {
		this.aClass2_Sub2_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!em;[IZII)V")
	private void method4790(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub2_Sub1_2.anIntArray11[arg1.anInt2974] & 0x4) != 0 && arg1.anInt2964 < 0) {
			@Pc(33) int local33 = this.aClass2_Sub2_Sub1_2.anIntArray15[arg1.anInt2974] / Static66.anInt1396;
			while (true) {
				@Pc(44) int local44 = (local33 + 1048575 - arg1.anInt2976) / local33;
				if (arg0 < local44) {
					arg1.anInt2976 += arg0 * local33;
					break;
				}
				arg1.aClass2_Sub2_Sub5_1.method7538(arg2, arg3, local44);
				arg0 -= local44;
				arg3 += local44;
				arg1.anInt2976 += local44 * local33 - 1048576;
				@Pc(75) int local75 = Static66.anInt1396 / 100;
				@Pc(79) int local79 = 262144 / local33;
				if (local79 < local75) {
					local75 = local79;
				}
				@Pc(91) Class2_Sub2_Sub5 local91 = arg1.aClass2_Sub2_Sub5_1;
				if (this.aClass2_Sub2_Sub1_2.anIntArray8[arg1.anInt2974] == 0) {
					arg1.aClass2_Sub2_Sub5_1 = Static652.method7560(arg1.aClass2_Sub12_Sub1_1, local91.method7577(), local91.method7559(), local91.method7558());
				} else {
					arg1.aClass2_Sub2_Sub5_1 = Static652.method7560(arg1.aClass2_Sub12_Sub1_1, local91.method7577(), 0, local91.method7558());
					this.aClass2_Sub2_Sub1_2.method155(arg1.aClass2_Sub25_1.aShortArray56[arg1.anInt2963] < 0, arg1);
					arg1.aClass2_Sub2_Sub5_1.method7574(local75, local91.method7559());
				}
				if (arg1.aClass2_Sub25_1.aShortArray56[arg1.anInt2963] < 0) {
					arg1.aClass2_Sub2_Sub5_1.method7552(-1);
				}
				local91.method7582(local75);
				local91.method7538(arg2, arg3, arg4 - arg3);
				if (local91.method7580()) {
					this.aClass2_Sub2_Sub2_3.method1044(local91);
				}
			}
		}
		arg1.aClass2_Sub2_Sub5_1.method7538(arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	@Override
	public void method7544(@OriginalArg(0) int arg0) {
		this.aClass2_Sub2_Sub2_3.method7544(arg0);
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) this.aClass238_34.method5833(); local15 != null; local15 = (Class2_Sub21) this.aClass238_34.method5838()) {
			if (!this.aClass2_Sub2_Sub1_2.method175(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2971) {
						this.method4795(local15, local25);
						local15.anInt2971 -= local25;
						break;
					}
					this.method4795(local15, local15.anInt2971);
					local25 -= local15.anInt2971;
				} while (!this.aClass2_Sub2_Sub1_2.method184(local15, null, 0, local25));
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
	@Override
	public int method7541() {
		return 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([III)V")
	@Override
	public void method7538(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub2_Sub2_3.method7538(arg0, arg1, arg2);
		for (@Pc(15) Class2_Sub21 local15 = (Class2_Sub21) this.aClass238_34.method5833(); local15 != null; local15 = (Class2_Sub21) this.aClass238_34.method5838()) {
			if (!this.aClass2_Sub2_Sub1_2.method175(local15)) {
				@Pc(24) int local24 = arg1;
				@Pc(26) int local26 = arg2;
				do {
					if (local15.anInt2971 >= local26) {
						this.method4790(local26, local15, arg0, local24, local24 + local26);
						local15.anInt2971 -= local26;
						break;
					}
					this.method4790(local15.anInt2971, local15, arg0, local24, local26 + local24);
					local26 -= local15.anInt2971;
					local24 += local15.anInt2971;
				} while (!this.aClass2_Sub2_Sub1_2.method184(local15, arg0, local24, local26));
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()Lclient!ep;")
	@Override
	public Class2_Sub2 method7539() {
		@Pc(9) Class2_Sub21 local9 = (Class2_Sub21) this.aClass238_34.method5833();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub2_Sub5_1 == null) {
			return this.method7542();
		} else {
			return local9.aClass2_Sub2_Sub5_1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!em;II)V")
	private void method4795(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass2_Sub2_Sub1_2.anIntArray11[arg0.anInt2974] & 0x4) != 0 && arg0.anInt2964 < 0) {
			@Pc(24) int local24 = this.aClass2_Sub2_Sub1_2.anIntArray15[arg0.anInt2974] / Static66.anInt1396;
			@Pc(34) int local34 = (local24 + 1048575 - arg0.anInt2976) / local24;
			arg0.anInt2976 = arg1 * local24 + arg0.anInt2976 & 0xFFFFF;
			if (local34 <= arg1) {
				if (this.aClass2_Sub2_Sub1_2.anIntArray8[arg0.anInt2974] == 0) {
					arg0.aClass2_Sub2_Sub5_1 = Static652.method7560(arg0.aClass2_Sub12_Sub1_1, arg0.aClass2_Sub2_Sub5_1.method7577(), arg0.aClass2_Sub2_Sub5_1.method7559(), arg0.aClass2_Sub2_Sub5_1.method7558());
				} else {
					arg0.aClass2_Sub2_Sub5_1 = Static652.method7560(arg0.aClass2_Sub12_Sub1_1, arg0.aClass2_Sub2_Sub5_1.method7577(), 0, arg0.aClass2_Sub2_Sub5_1.method7558());
					this.aClass2_Sub2_Sub1_2.method155(arg0.aClass2_Sub25_1.aShortArray56[arg0.anInt2963] < 0, arg0);
				}
				if (arg0.aClass2_Sub25_1.aShortArray56[arg0.anInt2963] < 0) {
					arg0.aClass2_Sub2_Sub5_1.method7552(-1);
				}
				arg1 = arg0.anInt2976 / local24;
			}
		}
		arg0.aClass2_Sub2_Sub5_1.method7544(arg1);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()Lclient!ep;")
	@Override
	public Class2_Sub2 method7542() {
		@Pc(9) Class2_Sub21 local9;
		do {
			local9 = (Class2_Sub21) this.aClass238_34.method5838();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub2_Sub5_1 == null);
		return local9.aClass2_Sub2_Sub5_1;
	}
}
