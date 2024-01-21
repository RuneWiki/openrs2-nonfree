import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub9_Sub1 extends Class2_Sub9 {

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Lclient!dc;")
	public final Class19 aClass19_3 = new Class19();

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "Lclient!r;")
	public final Class2_Sub9_Sub4 aClass2_Sub9_Sub4_2 = new Class2_Sub9_Sub4();

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!jd;")
	private final Class2_Sub9_Sub3 aClass2_Sub9_Sub3_1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!jd;)V")
	public Class2_Sub9_Sub1(@OriginalArg(0) Class2_Sub9_Sub3 arg0) {
		this.aClass2_Sub9_Sub3_1 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	@Override
	public void method2473(@OriginalArg(0) int arg0) {
		this.aClass2_Sub9_Sub4_2.method2473(arg0);
		for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) this.aClass19_3.method691(); local15 != null; local15 = (Class2_Sub20) this.aClass19_3.method686()) {
			if (!this.aClass2_Sub9_Sub3_1.method1562(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2928) {
						this.method1140(local15, local25);
						local15.anInt2928 -= local25;
						break;
					}
					this.method1140(local15, local15.anInt2928);
					local25 -= local15.anInt2928;
				} while (!this.aClass2_Sub9_Sub3_1.method1558(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([III)V")
	@Override
	public void method2471(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub9_Sub4_2.method2471(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub20 local17 = (Class2_Sub20) this.aClass19_3.method691(); local17 != null; local17 = (Class2_Sub20) this.aClass19_3.method686()) {
			if (!this.aClass2_Sub9_Sub3_1.method1562(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt2928 >= local27) {
						this.method1142(local29, arg0, local29 + local27, local27, local17);
						local17.anInt2928 -= local27;
						break;
					}
					this.method1142(local29, arg0, local27 + local29, local17.anInt2928, local17);
					local27 -= local17.anInt2928;
					local29 += local17.anInt2928;
				} while (!this.aClass2_Sub9_Sub3_1.method1558(local27, local29, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "()I")
	@Override
	public int method2472() {
		return 0;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()Lclient!dh;")
	@Override
	public Class2_Sub9 method2470() {
		@Pc(9) Class2_Sub20 local9;
		do {
			local9 = (Class2_Sub20) this.aClass19_3.method686();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub9_Sub2_1 == null);
		return local9.aClass2_Sub9_Sub2_1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()Lclient!dh;")
	@Override
	public Class2_Sub9 method2468() {
		@Pc(9) Class2_Sub20 local9 = (Class2_Sub20) this.aClass19_3.method691();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub9_Sub2_1 == null) {
			return this.method2470();
		} else {
			return local9.aClass2_Sub9_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!og;BI)V")
	private void method1140(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub9_Sub3_1.anIntArray184[arg0.anInt2923] & 0x4) != 0 && arg0.anInt2934 < 0) {
			@Pc(27) int local27 = this.aClass2_Sub9_Sub3_1.anIntArray188[arg0.anInt2923] / Static68.anInt1622;
			@Pc(36) int local36 = (local27 + 1048575 - arg0.anInt2940) / local27;
			arg0.anInt2940 = local27 * arg1 + arg0.anInt2940 & 0xFFFFF;
			if (local36 <= arg1) {
				if (this.aClass2_Sub9_Sub3_1.anIntArray197[arg0.anInt2923] == 0) {
					arg0.aClass2_Sub9_Sub2_1 = Static219.method1333(arg0.aClass2_Sub6_Sub1_1, arg0.aClass2_Sub9_Sub2_1.method1342(), arg0.aClass2_Sub9_Sub2_1.method1346(), arg0.aClass2_Sub9_Sub2_1.method1330());
				} else {
					arg0.aClass2_Sub9_Sub2_1 = Static219.method1333(arg0.aClass2_Sub6_Sub1_1, arg0.aClass2_Sub9_Sub2_1.method1342(), 0, arg0.aClass2_Sub9_Sub2_1.method1330());
					this.aClass2_Sub9_Sub3_1.method1547(arg0.aClass2_Sub18_1.aShortArray23[arg0.anInt2917] < 0, arg0);
				}
				if (arg0.aClass2_Sub18_1.aShortArray23[arg0.anInt2917] < 0) {
					arg0.aClass2_Sub9_Sub2_1.method1344(-1);
				}
				arg1 = arg0.anInt2940 / local27;
			}
		}
		arg0.aClass2_Sub9_Sub2_1.method2473(arg1);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[IIILclient!og;B)V")
	private void method1142(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub20 arg4) {
		if ((this.aClass2_Sub9_Sub3_1.anIntArray184[arg4.anInt2923] & 0x4) != 0 && arg4.anInt2934 < 0) {
			@Pc(22) int local22 = this.aClass2_Sub9_Sub3_1.anIntArray188[arg4.anInt2923] / Static68.anInt1622;
			while (true) {
				@Pc(33) int local33 = (local22 + 1048575 - arg4.anInt2940) / local22;
				if (arg3 < local33) {
					arg4.anInt2940 += local22 * arg3;
					break;
				}
				arg3 -= local33;
				arg4.aClass2_Sub9_Sub2_1.method2471(arg1, arg0, local33);
				@Pc(54) int local54 = Static68.anInt1622 / 100;
				@Pc(58) int local58 = 262144 / local22;
				if (local58 < local54) {
					local54 = local58;
				}
				arg0 += local33;
				arg4.anInt2940 += local22 * local33 - 1048576;
				@Pc(84) Class2_Sub9_Sub2 local84 = arg4.aClass2_Sub9_Sub2_1;
				if (this.aClass2_Sub9_Sub3_1.anIntArray197[arg4.anInt2923] == 0) {
					arg4.aClass2_Sub9_Sub2_1 = Static219.method1333(arg4.aClass2_Sub6_Sub1_1, local84.method1342(), local84.method1346(), local84.method1330());
				} else {
					arg4.aClass2_Sub9_Sub2_1 = Static219.method1333(arg4.aClass2_Sub6_Sub1_1, local84.method1342(), 0, local84.method1330());
					this.aClass2_Sub9_Sub3_1.method1547(arg4.aClass2_Sub18_1.aShortArray23[arg4.anInt2917] < 0, arg4);
					arg4.aClass2_Sub9_Sub2_1.method1325(local54, local84.method1346());
				}
				if (arg4.aClass2_Sub18_1.aShortArray23[arg4.anInt2917] < 0) {
					arg4.aClass2_Sub9_Sub2_1.method1344(-1);
				}
				local84.method1328(local54);
				local84.method2471(arg1, arg0, arg2 - arg0);
				if (local84.method1336()) {
					this.aClass2_Sub9_Sub4_2.method2476(local84);
				}
			}
		}
		arg4.aClass2_Sub9_Sub2_1.method2471(arg1, arg0, arg3);
	}
}
