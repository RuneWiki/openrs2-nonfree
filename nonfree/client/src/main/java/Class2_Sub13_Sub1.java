import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!fia", name = "r", descriptor = "Lclient!fha;")
	public final Class109 aClass109_25 = new Class109();

	@OriginalMember(owner = "client!fia", name = "B", descriptor = "Lclient!sga;")
	public final Class2_Sub13_Sub4 aClass2_Sub13_Sub4_1 = new Class2_Sub13_Sub4();

	@OriginalMember(owner = "client!fia", name = "q", descriptor = "Lclient!qc;")
	private final Class2_Sub13_Sub3 aClass2_Sub13_Sub3_2;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lclient!qc;)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) Class2_Sub13_Sub3 arg0) {
		this.aClass2_Sub13_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "()Lclient!ua;")
	@Override
	public Class2_Sub13 method8178() {
		@Pc(9) Class2_Sub51 local9 = (Class2_Sub51) this.aClass109_25.method2325();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub13_Sub2_4 == null) {
			return this.method8174();
		} else {
			return local9.aClass2_Sub13_Sub2_4;
		}
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "()I")
	@Override
	public int method8175() {
		return 0;
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "([III)V")
	@Override
	public void method8180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub13_Sub4_1.method8180(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub51 local17 = (Class2_Sub51) this.aClass109_25.method2325(); local17 != null; local17 = (Class2_Sub51) this.aClass109_25.method2318()) {
			if (!this.aClass2_Sub13_Sub3_2.method6149(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt9668 >= local29) {
						this.method2365(local27, local29 + local27, local29, arg0, local17);
						local17.anInt9668 -= local29;
						break;
					}
					this.method2365(local27, local29 + local27, local17.anInt9668, arg0, local17);
					local29 -= local17.anInt9668;
					local27 += local17.anInt9668;
				} while (!this.aClass2_Sub13_Sub3_2.method6147(local27, arg0, local29, local17));
			}
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(III[IILclient!ve;)V")
	private void method2365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Class2_Sub51 arg4) {
		if ((this.aClass2_Sub13_Sub3_2.anIntArray516[arg4.anInt9672] & 0x4) != 0 && arg4.anInt9665 < 0) {
			@Pc(23) int local23 = this.aClass2_Sub13_Sub3_2.anIntArray528[arg4.anInt9672] / Static283.anInt7446;
			while (true) {
				@Pc(33) int local33 = (local23 + 1048575 - arg4.anInt9669) / local23;
				if (arg2 < local33) {
					arg4.anInt9669 += arg2 * local23;
					break;
				}
				arg4.aClass2_Sub13_Sub2_4.method8180(arg3, arg0, local33);
				arg2 -= local33;
				arg0 += local33;
				arg4.anInt9669 += local23 * local33 - 1048576;
				@Pc(68) int local68 = Static283.anInt7446 / 100;
				@Pc(72) int local72 = 262144 / local23;
				if (local68 > local72) {
					local68 = local72;
				}
				@Pc(80) Class2_Sub13_Sub2 local80 = arg4.aClass2_Sub13_Sub2_4;
				if (this.aClass2_Sub13_Sub3_2.anIntArray513[arg4.anInt9672] == 0) {
					arg4.aClass2_Sub13_Sub2_4 = Static652.method4446(arg4.aClass2_Sub1_Sub1_4, local80.method4458(), local80.method4440(), local80.method4452());
				} else {
					arg4.aClass2_Sub13_Sub2_4 = Static652.method4446(arg4.aClass2_Sub1_Sub1_4, local80.method4458(), 0, local80.method4452());
					this.aClass2_Sub13_Sub3_2.method6125(arg4, arg4.aClass2_Sub47_1.aShortArray137[arg4.anInt9667] < 0);
					arg4.aClass2_Sub13_Sub2_4.method4461(local68, local80.method4440());
				}
				if (arg4.aClass2_Sub47_1.aShortArray137[arg4.anInt9667] < 0) {
					arg4.aClass2_Sub13_Sub2_4.method4453(-1);
				}
				local80.method4468(local68);
				local80.method8180(arg3, arg0, arg1 - arg0);
				if (local80.method4441()) {
					this.aClass2_Sub13_Sub4_1.method7225(local80);
				}
			}
		}
		arg4.aClass2_Sub13_Sub2_4.method8180(arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IILclient!ve;)V")
	private void method2368(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub51 arg1) {
		if ((this.aClass2_Sub13_Sub3_2.anIntArray516[arg1.anInt9672] & 0x4) != 0 && arg1.anInt9665 < 0) {
			@Pc(26) int local26 = this.aClass2_Sub13_Sub3_2.anIntArray528[arg1.anInt9672] / Static283.anInt7446;
			@Pc(36) int local36 = (local26 + 1048575 - arg1.anInt9669) / local26;
			arg1.anInt9669 = arg1.anInt9669 + local26 * arg0 & 0xFFFFF;
			if (local36 <= arg0) {
				if (this.aClass2_Sub13_Sub3_2.anIntArray513[arg1.anInt9672] == 0) {
					arg1.aClass2_Sub13_Sub2_4 = Static652.method4446(arg1.aClass2_Sub1_Sub1_4, arg1.aClass2_Sub13_Sub2_4.method4458(), arg1.aClass2_Sub13_Sub2_4.method4440(), arg1.aClass2_Sub13_Sub2_4.method4452());
				} else {
					arg1.aClass2_Sub13_Sub2_4 = Static652.method4446(arg1.aClass2_Sub1_Sub1_4, arg1.aClass2_Sub13_Sub2_4.method4458(), 0, arg1.aClass2_Sub13_Sub2_4.method4452());
					this.aClass2_Sub13_Sub3_2.method6125(arg1, arg1.aClass2_Sub47_1.aShortArray137[arg1.anInt9667] < 0);
				}
				if (arg1.aClass2_Sub47_1.aShortArray137[arg1.anInt9667] < 0) {
					arg1.aClass2_Sub13_Sub2_4.method4453(-1);
				}
				arg0 = arg1.anInt9669 / local26;
			}
		}
		arg1.aClass2_Sub13_Sub2_4.method8176(arg0);
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V")
	@Override
	public void method8176(@OriginalArg(0) int arg0) {
		this.aClass2_Sub13_Sub4_1.method8176(arg0);
		for (@Pc(15) Class2_Sub51 local15 = (Class2_Sub51) this.aClass109_25.method2325(); local15 != null; local15 = (Class2_Sub51) this.aClass109_25.method2318()) {
			if (!this.aClass2_Sub13_Sub3_2.method6149(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt9668) {
						this.method2368(local25, local15);
						local15.anInt9668 -= local25;
						break;
					}
					this.method2368(local15.anInt9668, local15);
					local25 -= local15.anInt9668;
				} while (!this.aClass2_Sub13_Sub3_2.method6147(0, null, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "()Lclient!ua;")
	@Override
	public Class2_Sub13 method8174() {
		@Pc(9) Class2_Sub51 local9;
		do {
			local9 = (Class2_Sub51) this.aClass109_25.method2318();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub13_Sub2_4 == null);
		return local9.aClass2_Sub13_Sub2_4;
	}
}
