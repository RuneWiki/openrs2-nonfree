import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "Lclient!cf;")
	public final Class20 aClass20_8 = new Class20();

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "Lclient!ki;")
	public final Class1_Sub12_Sub2 aClass1_Sub12_Sub2_3 = new Class1_Sub12_Sub2();

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "Lclient!pg;")
	private final Class1_Sub12_Sub3 aClass1_Sub12_Sub3_3;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class1_Sub12_Sub1(@OriginalArg(0) Class1_Sub12_Sub3 arg0) {
		this.aClass1_Sub12_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()I")
	@Override
	public int method2756() {
		return 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!da;III[II)V")
	private void method1237(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass1_Sub12_Sub3_3.anIntArray267[arg0.anInt738] & 0x4) != 0 && arg0.anInt753 < 0) {
			@Pc(22) int local22 = this.aClass1_Sub12_Sub3_3.anIntArray270[arg0.anInt738] / Static96.anInt2009;
			while (true) {
				@Pc(33) int local33 = (local22 + 1048575 - arg0.anInt745) / local22;
				if (arg4 < local33) {
					arg0.anInt745 += local22 * arg4;
					break;
				}
				@Pc(44) int local44 = 262144 / local22;
				arg0.aClass1_Sub12_Sub4_1.method2753(arg3, arg2, local33);
				arg0.anInt745 += local22 * local33 - 1048576;
				@Pc(63) Class1_Sub12_Sub4 local63 = arg0.aClass1_Sub12_Sub4_1;
				arg2 += local33;
				@Pc(71) int local71 = Static96.anInt2009 / 100;
				arg4 -= local33;
				if (local71 > local44) {
					local71 = local44;
				}
				if (this.aClass1_Sub12_Sub3_3.anIntArray262[arg0.anInt738] == 0) {
					arg0.aClass1_Sub12_Sub4_1 = Static217.method2777(arg0.aClass1_Sub22_Sub1_1, local63.method2767(), local63.method2770(), local63.method2793());
				} else {
					arg0.aClass1_Sub12_Sub4_1 = Static217.method2777(arg0.aClass1_Sub22_Sub1_1, local63.method2767(), 0, local63.method2793());
					this.aClass1_Sub12_Sub3_3.method2247(arg0.aClass1_Sub13_1.aShortArray14[arg0.anInt756] < 0, arg0);
					arg0.aClass1_Sub12_Sub4_1.method2783(local71, local63.method2770());
				}
				if (arg0.aClass1_Sub13_1.aShortArray14[arg0.anInt756] < 0) {
					arg0.aClass1_Sub12_Sub4_1.method2772(-1);
				}
				local63.method2782(local71);
				local63.method2753(arg3, arg2, arg1 - arg2);
				if (local63.method2779()) {
					this.aClass1_Sub12_Sub2_3.method1609(local63);
				}
			}
		}
		arg0.aClass1_Sub12_Sub4_1.method2753(arg3, arg2, arg4);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "([III)V")
	@Override
	public void method2753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub12_Sub2_3.method2753(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub5 local17 = (Class1_Sub5) this.aClass20_8.method467(); local17 != null; local17 = (Class1_Sub5) this.aClass20_8.method468()) {
			if (!this.aClass1_Sub12_Sub3_3.method2245(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt743) {
						this.method1237(local17, local27 + local29, local27, arg0, local29);
						local17.anInt743 -= local29;
						break;
					}
					this.method1237(local17, local29 + local27, local27, arg0, local17.anInt743);
					local27 += local17.anInt743;
					local29 -= local17.anInt743;
				} while (!this.aClass1_Sub12_Sub3_3.method2230(arg0, local27, local17, local29));
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub12 method2755() {
		@Pc(9) Class1_Sub5 local9;
		do {
			local9 = (Class1_Sub5) this.aClass20_8.method468();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub12_Sub4_1 == null);
		return local9.aClass1_Sub12_Sub4_1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILclient!da;)V")
	private void method1239(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if ((this.aClass1_Sub12_Sub3_3.anIntArray267[arg1.anInt738] & 0x4) != 0 && arg1.anInt753 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub12_Sub3_3.anIntArray270[arg1.anInt738] / Static96.anInt2009;
			@Pc(34) int local34 = (local23 + 1048575 - arg1.anInt745) / local23;
			arg1.anInt745 = local23 * arg0 + arg1.anInt745 & 0xFFFFF;
			if (arg0 >= local34) {
				if (this.aClass1_Sub12_Sub3_3.anIntArray262[arg1.anInt738] == 0) {
					arg1.aClass1_Sub12_Sub4_1 = Static217.method2777(arg1.aClass1_Sub22_Sub1_1, arg1.aClass1_Sub12_Sub4_1.method2767(), arg1.aClass1_Sub12_Sub4_1.method2770(), arg1.aClass1_Sub12_Sub4_1.method2793());
				} else {
					arg1.aClass1_Sub12_Sub4_1 = Static217.method2777(arg1.aClass1_Sub22_Sub1_1, arg1.aClass1_Sub12_Sub4_1.method2767(), 0, arg1.aClass1_Sub12_Sub4_1.method2793());
					this.aClass1_Sub12_Sub3_3.method2247(arg1.aClass1_Sub13_1.aShortArray14[arg1.anInt756] < 0, arg1);
				}
				if (arg1.aClass1_Sub13_1.aShortArray14[arg1.anInt756] < 0) {
					arg1.aClass1_Sub12_Sub4_1.method2772(-1);
				}
				arg0 = arg1.anInt745 / local23;
			}
		}
		arg1.aClass1_Sub12_Sub4_1.method2757(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	@Override
	public void method2757(@OriginalArg(0) int arg0) {
		this.aClass1_Sub12_Sub2_3.method2757(arg0);
		for (@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) this.aClass20_8.method467(); local15 != null; local15 = (Class1_Sub5) this.aClass20_8.method468()) {
			if (!this.aClass1_Sub12_Sub3_3.method2245(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt743 >= local25) {
						this.method1239(local25, local15);
						local15.anInt743 -= local25;
						break;
					}
					this.method1239(local15.anInt743, local15);
					local25 -= local15.anInt743;
				} while (!this.aClass1_Sub12_Sub3_3.method2230(null, 0, local15, local25));
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lclient!jc;")
	@Override
	public Class1_Sub12 method2754() {
		@Pc(5) Class1_Sub5 local5 = (Class1_Sub5) this.aClass20_8.method467();
		if (local5 == null) {
			return null;
		} else if (local5.aClass1_Sub12_Sub4_1 == null) {
			return this.method2755();
		} else {
			return local5.aClass1_Sub12_Sub4_1;
		}
	}
}
