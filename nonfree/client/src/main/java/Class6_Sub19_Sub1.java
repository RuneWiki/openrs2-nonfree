import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class6_Sub19_Sub1 extends Class6_Sub19 {

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Lclient!rh;")
	public final Class275 aClass275_45 = new Class275();

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "Lclient!ro;")
	public final Class6_Sub19_Sub3 aClass6_Sub19_Sub3_1 = new Class6_Sub19_Sub3();

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "Lclient!wfa;")
	private final Class6_Sub19_Sub4 aClass6_Sub19_Sub4_3;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!wfa;)V")
	public Class6_Sub19_Sub1(@OriginalArg(0) Class6_Sub19_Sub4 arg0) {
		this.aClass6_Sub19_Sub4_3 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	@Override
	public void method7697(@OriginalArg(0) int arg0) {
		this.aClass6_Sub19_Sub3_1.method7697(arg0);
		for (@Pc(15) Class6_Sub39 local15 = (Class6_Sub39) this.aClass275_45.method6366(); local15 != null; local15 = (Class6_Sub39) this.aClass275_45.method6364()) {
			if (!this.aClass6_Sub19_Sub4_3.method7722(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt6024 >= local25) {
						this.method1851(local15, local25);
						local15.anInt6024 -= local25;
						break;
					}
					this.method1851(local15, local15.anInt6024);
					local25 -= local15.anInt6024;
				} while (!this.aClass6_Sub19_Sub4_3.method7727(local25, local15, null, 0));
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!no;I)V")
	private void method1851(@OriginalArg(1) Class6_Sub39 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass6_Sub19_Sub4_3.anIntArray704[arg0.anInt6016] & 0x4) != 0 && arg0.anInt6003 < 0) {
			@Pc(23) int local23 = this.aClass6_Sub19_Sub4_3.anIntArray709[arg0.anInt6016] / Static508.anInt8600;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt6006) / local23;
			arg0.anInt6006 = arg1 * local23 + arg0.anInt6006 & 0xFFFFF;
			if (arg1 >= local33) {
				if (this.aClass6_Sub19_Sub4_3.anIntArray707[arg0.anInt6016] == 0) {
					arg0.aClass6_Sub19_Sub2_4 = Static583.method2849(arg0.aClass6_Sub12_Sub1_4, arg0.aClass6_Sub19_Sub2_4.method2846(), arg0.aClass6_Sub19_Sub2_4.method2834(), arg0.aClass6_Sub19_Sub2_4.method2843());
				} else {
					arg0.aClass6_Sub19_Sub2_4 = Static583.method2849(arg0.aClass6_Sub12_Sub1_4, arg0.aClass6_Sub19_Sub2_4.method2846(), 0, arg0.aClass6_Sub19_Sub2_4.method2843());
					this.aClass6_Sub19_Sub4_3.method7724(arg0, arg0.aClass6_Sub23_1.aShortArray60[arg0.anInt6002] < 0);
				}
				if (arg0.aClass6_Sub23_1.aShortArray60[arg0.anInt6002] < 0) {
					arg0.aClass6_Sub19_Sub2_4.method2845(-1);
				}
				arg1 = arg0.anInt6006 / local23;
			}
		}
		arg0.aClass6_Sub19_Sub2_4.method7697(arg1);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "()Lclient!wi;")
	@Override
	public Class6_Sub19 method7694() {
		@Pc(9) Class6_Sub39 local9;
		do {
			local9 = (Class6_Sub39) this.aClass275_45.method6364();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass6_Sub19_Sub2_4 == null);
		return local9.aClass6_Sub19_Sub2_4;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "([III)V")
	@Override
	public void method7698(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass6_Sub19_Sub3_1.method7698(arg0, arg1, arg2);
		for (@Pc(17) Class6_Sub39 local17 = (Class6_Sub39) this.aClass275_45.method6366(); local17 != null; local17 = (Class6_Sub39) this.aClass275_45.method6364()) {
			if (!this.aClass6_Sub19_Sub4_3.method7722(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt6024) {
						this.method1855(local27, local27 + local29, local29, local17, arg0);
						local17.anInt6024 -= local27;
						break;
					}
					this.method1855(local17.anInt6024, local27 + local29, local29, local17, arg0);
					local29 += local17.anInt6024;
					local27 -= local17.anInt6024;
				} while (!this.aClass6_Sub19_Sub4_3.method7727(local27, local17, arg0, local29));
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "()I")
	@Override
	public int method7695() {
		return 0;
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "()Lclient!wi;")
	@Override
	public Class6_Sub19 method7700() {
		@Pc(9) Class6_Sub39 local9 = (Class6_Sub39) this.aClass275_45.method6366();
		if (local9 == null) {
			return null;
		} else if (local9.aClass6_Sub19_Sub2_4 == null) {
			return this.method7694();
		} else {
			return local9.aClass6_Sub19_Sub2_4;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIILclient!no;[I)V")
	private void method1855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class6_Sub39 arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass6_Sub19_Sub4_3.anIntArray704[arg3.anInt6016] & 0x4) != 0 && arg3.anInt6003 < 0) {
			@Pc(25) int local25 = this.aClass6_Sub19_Sub4_3.anIntArray709[arg3.anInt6016] / Static508.anInt8600;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg3.anInt6006) / local25;
				if (local35 > arg0) {
					arg3.anInt6006 += arg0 * local25;
					break;
				}
				arg3.aClass6_Sub19_Sub2_4.method7698(arg4, arg2, local35);
				arg0 -= local35;
				arg3.anInt6006 += local35 * local25 - 1048576;
				arg2 += local35;
				@Pc(66) int local66 = Static508.anInt8600 / 100;
				@Pc(70) int local70 = 262144 / local25;
				if (local70 < local66) {
					local66 = local70;
				}
				@Pc(82) Class6_Sub19_Sub2 local82 = arg3.aClass6_Sub19_Sub2_4;
				if (this.aClass6_Sub19_Sub4_3.anIntArray707[arg3.anInt6016] == 0) {
					arg3.aClass6_Sub19_Sub2_4 = Static583.method2849(arg3.aClass6_Sub12_Sub1_4, local82.method2846(), local82.method2834(), local82.method2843());
				} else {
					arg3.aClass6_Sub19_Sub2_4 = Static583.method2849(arg3.aClass6_Sub12_Sub1_4, local82.method2846(), 0, local82.method2843());
					this.aClass6_Sub19_Sub4_3.method7724(arg3, arg3.aClass6_Sub23_1.aShortArray60[arg3.anInt6002] < 0);
					arg3.aClass6_Sub19_Sub2_4.method2817(local66, local82.method2834());
				}
				if (arg3.aClass6_Sub23_1.aShortArray60[arg3.anInt6002] < 0) {
					arg3.aClass6_Sub19_Sub2_4.method2845(-1);
				}
				local82.method2826(local66);
				local82.method7698(arg4, arg2, arg1 - arg2);
				if (local82.method2825()) {
					this.aClass6_Sub19_Sub3_1.method6425(local82);
				}
			}
		}
		arg3.aClass6_Sub19_Sub2_4.method7698(arg4, arg2, arg0);
	}
}
