import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Lclient!aa;")
	public final Class2 aClass2_12 = new Class2();

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "Lclient!ge;")
	public final Class1_Sub3_Sub2 aClass1_Sub3_Sub2_2 = new Class1_Sub3_Sub2();

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lclient!c;")
	private final Class1_Sub3_Sub1 aClass1_Sub3_Sub1_3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!c;)V")
	public Class1_Sub3_Sub4(@OriginalArg(0) Class1_Sub3_Sub1 arg0) {
		this.aClass1_Sub3_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([III)V")
	@Override
	public void method2030(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub3_Sub2_2.method2030(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub9 local17 = (Class1_Sub9) this.aClass2_12.method22(); local17 != null; local17 = (Class1_Sub9) this.aClass2_12.method23()) {
			if (!this.aClass1_Sub3_Sub1_3.method323(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1173) {
						this.method2033(local17, local27 + local29, local29, local27, arg0);
						local17.anInt1173 -= local27;
						break;
					}
					this.method2033(local17, local29 + local27, local29, local17.anInt1173, arg0);
					local29 += local17.anInt1173;
					local27 -= local17.anInt1173;
				} while (!this.aClass1_Sub3_Sub1_3.method348(local17, arg0, local27, local29));
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()I")
	@Override
	public int method2029() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!hd;IBII[I)V")
	private void method2033(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub3_Sub1_3.anIntArray64[arg0.anInt1176] & 0x4) != 0 && arg0.anInt1184 < 0) {
			@Pc(29) int local29 = this.aClass1_Sub3_Sub1_3.anIntArray63[arg0.anInt1176] / Static81.anInt1802;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg0.anInt1167) / local29;
				if (arg3 < local39) {
					arg0.anInt1167 += local29 * arg3;
					break;
				}
				arg3 -= local39;
				arg0.aClass1_Sub3_Sub3_3.method2030(arg4, arg2, local39);
				arg2 += local39;
				arg0.anInt1167 += local29 * local39 - 1048576;
				@Pc(74) int local74 = Static81.anInt1802 / 100;
				@Pc(77) Class1_Sub3_Sub3 local77 = arg0.aClass1_Sub3_Sub3_3;
				@Pc(81) int local81 = 262144 / local29;
				if (local74 > local81) {
					local74 = local81;
				}
				if (this.aClass1_Sub3_Sub1_3.anIntArray60[arg0.anInt1176] == 0) {
					arg0.aClass1_Sub3_Sub3_3 = Static135.method1482(arg0.aClass1_Sub14_Sub1_1, local77.method1478(), local77.method1491(), local77.method1480());
				} else {
					arg0.aClass1_Sub3_Sub3_3 = Static135.method1482(arg0.aClass1_Sub14_Sub1_1, local77.method1478(), 0, local77.method1480());
					this.aClass1_Sub3_Sub1_3.method324(arg0, arg0.aClass1_Sub17_1.aShortArray13[arg0.anInt1182] < 0);
					arg0.aClass1_Sub3_Sub3_3.method1485(local74, local77.method1491());
				}
				if (arg0.aClass1_Sub17_1.aShortArray13[arg0.anInt1182] < 0) {
					arg0.aClass1_Sub3_Sub3_3.method1474(-1);
				}
				local77.method1483(local74);
				local77.method2030(arg4, arg2, arg1 - arg2);
				if (local77.method1498()) {
					this.aClass1_Sub3_Sub2_2.method925(local77);
				}
			}
		}
		arg0.aClass1_Sub3_Sub3_3.method2030(arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()Lclient!h;")
	@Override
	public Class1_Sub3 method2032() {
		@Pc(9) Class1_Sub9 local9;
		do {
			local9 = (Class1_Sub9) this.aClass2_12.method23();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub3_Sub3_3 == null);
		return local9.aClass1_Sub3_Sub3_3;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!hd;)V")
	private void method2036(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if ((this.aClass1_Sub3_Sub1_3.anIntArray64[arg1.anInt1176] & 0x4) != 0 && arg1.anInt1184 < 0) {
			@Pc(27) int local27 = this.aClass1_Sub3_Sub1_3.anIntArray63[arg1.anInt1176] / Static81.anInt1802;
			@Pc(37) int local37 = (local27 + 1048575 - arg1.anInt1167) / local27;
			arg1.anInt1167 = local27 * arg0 + arg1.anInt1167 & 0xFFFFF;
			if (local37 <= arg0) {
				if (this.aClass1_Sub3_Sub1_3.anIntArray60[arg1.anInt1176] == 0) {
					arg1.aClass1_Sub3_Sub3_3 = Static135.method1482(arg1.aClass1_Sub14_Sub1_1, arg1.aClass1_Sub3_Sub3_3.method1478(), arg1.aClass1_Sub3_Sub3_3.method1491(), arg1.aClass1_Sub3_Sub3_3.method1480());
				} else {
					arg1.aClass1_Sub3_Sub3_3 = Static135.method1482(arg1.aClass1_Sub14_Sub1_1, arg1.aClass1_Sub3_Sub3_3.method1478(), 0, arg1.aClass1_Sub3_Sub3_3.method1480());
					this.aClass1_Sub3_Sub1_3.method324(arg1, arg1.aClass1_Sub17_1.aShortArray13[arg1.anInt1182] < 0);
				}
				if (arg1.aClass1_Sub17_1.aShortArray13[arg1.anInt1182] < 0) {
					arg1.aClass1_Sub3_Sub3_3.method1474(-1);
				}
				arg0 = arg1.anInt1167 / local27;
			}
		}
		arg1.aClass1_Sub3_Sub3_3.method2028(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	@Override
	public void method2028(@OriginalArg(0) int arg0) {
		this.aClass1_Sub3_Sub2_2.method2028(arg0);
		for (@Pc(15) Class1_Sub9 local15 = (Class1_Sub9) this.aClass2_12.method22(); local15 != null; local15 = (Class1_Sub9) this.aClass2_12.method23()) {
			if (!this.aClass1_Sub3_Sub1_3.method323(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt1173) {
						this.method2036(local25, local15);
						local15.anInt1173 -= local25;
						break;
					}
					this.method2036(local15.anInt1173, local15);
					local25 -= local15.anInt1173;
				} while (!this.aClass1_Sub3_Sub1_3.method348(local15, null, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lclient!h;")
	@Override
	public Class1_Sub3 method2026() {
		@Pc(9) Class1_Sub9 local9 = (Class1_Sub9) this.aClass2_12.method22();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub3_Sub3_3 == null) {
			return this.method2032();
		} else {
			return local9.aClass1_Sub3_Sub3_3;
		}
	}
}
