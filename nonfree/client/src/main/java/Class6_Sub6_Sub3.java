import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class6_Sub6_Sub3 extends Class6_Sub6 {

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "Lclient!a;")
	public final Class1 aClass1_8 = new Class1();

	@OriginalMember(owner = "client!qc", name = "jb", descriptor = "Lclient!pe;")
	public final Class6_Sub6_Sub2 aClass6_Sub6_Sub2_2 = new Class6_Sub6_Sub2();

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "Lclient!tc;")
	private final Class6_Sub6_Sub4 aClass6_Sub6_Sub4_2;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!tc;)V")
	public Class6_Sub6_Sub3(@OriginalArg(0) Class6_Sub6_Sub4 arg0) {
		this.aClass6_Sub6_Sub4_2 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()Lclient!kf;")
	@Override
	public Class6_Sub6 method1918() {
		@Pc(9) Class6_Sub13 local9;
		do {
			local9 = (Class6_Sub13) this.aClass1_8.method14();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub6_Sub1_1 == null);
		return local9.aClass6_Sub6_Sub1_1;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "([III)V")
	@Override
	public void method1915(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub6_Sub2_2.method1915(arg0, arg1, arg2);
		@Pc(16) int local16 = arg1 + arg2;
		for (@Pc(22) Class6_Sub13 local22 = (Class6_Sub13) this.aClass1_8.method3(); local22 != null; local22 = (Class6_Sub13) this.aClass1_8.method14()) {
			if (!this.aClass6_Sub6_Sub4_2.method1940(local22)) {
				@Pc(32) int local32 = arg1;
				@Pc(34) int local34 = arg2;
				do {
					if (local34 <= local22.anInt2408) {
						this.method1699(local16, arg0, local22, local32, local34);
						local22.anInt2408 -= local34;
						break;
					}
					this.method1699(local16, arg0, local22, local32, local22.anInt2408);
					local34 -= local22.anInt2408;
					local32 += local22.anInt2408;
				} while (!this.aClass6_Sub6_Sub4_2.method1931(local22));
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()Lclient!kf;")
	@Override
	public Class6_Sub6 method1913() {
		@Pc(9) Class6_Sub13 local9 = (Class6_Sub13) this.aClass1_8.method3();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub6_Sub1_1 == null) {
			return this.method1918();
		} else {
			return local9.aClass6_Sub6_Sub1_1;
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
	@Override
	public void method1917(@OriginalArg(0) int arg0) {
		for (@Pc(7) Class6_Sub13 local7 = (Class6_Sub13) this.aClass1_8.method3(); local7 != null; local7 = (Class6_Sub13) this.aClass1_8.method14()) {
			if (!this.aClass6_Sub6_Sub4_2.method1940(local7)) {
				@Pc(17) int local17 = arg0;
				do {
					if (local17 <= local7.anInt2408) {
						this.method1700(local7, local17);
						local7.anInt2408 -= local17;
						break;
					}
					this.method1700(local7, local7.anInt2408);
					local17 -= local7.anInt2408;
				} while (!this.aClass6_Sub6_Sub4_2.method1931(local7));
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[ILclient!pa;IBI)V")
	private void method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class6_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass6_Sub6_Sub4_2.anIntArray329[arg2.anInt2392] & 0x4) != 0 && arg2.anInt2399 < 0) {
			@Pc(26) int local26 = this.aClass6_Sub6_Sub4_2.anIntArray326[arg2.anInt2392] / Static73.anInt2059;
			while (true) {
				@Pc(36) int local36 = (local26 + 1048575 - arg2.anInt2407) / local26;
				if (local36 > arg4) {
					arg2.anInt2407 += local26 * arg4;
					break;
				}
				arg2.aClass6_Sub6_Sub1_1.method1915(arg1, arg3, local36);
				arg3 += local36;
				@Pc(57) int local57 = 262144 / local26;
				arg2.anInt2407 += local26 * local36 - 1048576;
				@Pc(71) int local71 = Static73.anInt2059 / 100;
				arg4 -= local36;
				@Pc(78) Class6_Sub6_Sub1 local78 = arg2.aClass6_Sub6_Sub1_1;
				if (local57 < local71) {
					local71 = local57;
				}
				if (this.aClass6_Sub6_Sub4_2.anIntArray332[arg2.anInt2392] == 0) {
					arg2.aClass6_Sub6_Sub1_1 = Static126.method793(arg2.aClass6_Sub11_Sub1_1, local78.method789(), local78.method780(), local78.method776());
				} else {
					arg2.aClass6_Sub6_Sub1_1 = Static126.method793(arg2.aClass6_Sub11_Sub1_1, local78.method789(), 0, local78.method776());
					this.aClass6_Sub6_Sub4_2.method1942(arg2, arg2.aClass6_Sub10_1.aShortArray10[arg2.anInt2389] < 0);
					arg2.aClass6_Sub6_Sub1_1.method758(local71, local78.method780());
				}
				if (arg2.aClass6_Sub10_1.aShortArray10[arg2.anInt2389] < 0) {
					arg2.aClass6_Sub6_Sub1_1.method784(-1);
				}
				local78.method791(local71);
				local78.method1915(arg1, arg3, arg0 - arg3);
				if (local78.method785()) {
					this.aClass6_Sub6_Sub2_2.method1625(local78);
				}
			}
		}
		arg2.aClass6_Sub6_Sub1_1.method1915(arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()I")
	@Override
	public int method1919() {
		return 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!pa;I)V")
	private void method1700(@OriginalArg(1) Class6_Sub13 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass6_Sub6_Sub4_2.anIntArray329[arg0.anInt2392] & 0x4) != 0 && arg0.anInt2399 < 0) {
			@Pc(24) int local24 = this.aClass6_Sub6_Sub4_2.anIntArray326[arg0.anInt2392] / Static73.anInt2059;
			@Pc(35) int local35 = (local24 + 1048575 - arg0.anInt2407) / local24;
			arg0.anInt2407 = arg1 * local24 + arg0.anInt2407 & 0xFFFFF;
			if (local35 <= arg1) {
				if (this.aClass6_Sub6_Sub4_2.anIntArray332[arg0.anInt2392] == 0) {
					arg0.aClass6_Sub6_Sub1_1 = Static126.method793(arg0.aClass6_Sub11_Sub1_1, arg0.aClass6_Sub6_Sub1_1.method789(), arg0.aClass6_Sub6_Sub1_1.method780(), arg0.aClass6_Sub6_Sub1_1.method776());
				} else {
					arg0.aClass6_Sub6_Sub1_1 = Static126.method793(arg0.aClass6_Sub11_Sub1_1, arg0.aClass6_Sub6_Sub1_1.method789(), 0, arg0.aClass6_Sub6_Sub1_1.method776());
					this.aClass6_Sub6_Sub4_2.method1942(arg0, arg0.aClass6_Sub10_1.aShortArray10[arg0.anInt2389] < 0);
				}
				if (arg0.aClass6_Sub10_1.aShortArray10[arg0.anInt2389] < 0) {
					arg0.aClass6_Sub6_Sub1_1.method784(-1);
				}
				arg1 = arg0.anInt2407 / local24;
			}
		}
		arg0.aClass6_Sub6_Sub1_1.method1917(arg1);
	}
}
