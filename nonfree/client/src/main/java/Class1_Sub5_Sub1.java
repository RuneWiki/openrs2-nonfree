import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!e", name = "w", descriptor = "Lclient!pg;")
	public final Class59 aClass59_14 = new Class59();

	@OriginalMember(owner = "client!e", name = "L", descriptor = "Lclient!ha;")
	public final Class1_Sub5_Sub2 aClass1_Sub5_Sub2_2 = new Class1_Sub5_Sub2();

	@OriginalMember(owner = "client!e", name = "x", descriptor = "Lclient!hd;")
	private final Class1_Sub5_Sub3 aClass1_Sub5_Sub3_4;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) Class1_Sub5_Sub3 arg0) {
		this.aClass1_Sub5_Sub3_4 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()Lclient!bc;")
	@Override
	public Class1_Sub5 method1314() {
		@Pc(9) Class1_Sub12 local9;
		do {
			local9 = (Class1_Sub12) this.aClass59_14.method2424();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub5_Sub4_3 == null);
		return local9.aClass1_Sub5_Sub4_3;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB[IIILclient!ib;)V")
	private void method712(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub12 arg4) {
		if ((this.aClass1_Sub5_Sub3_4.anIntArray152[arg4.anInt1965] & 0x4) != 0 && arg4.anInt1974 < 0) {
			@Pc(36) int local36 = this.aClass1_Sub5_Sub3_4.anIntArray142[arg4.anInt1965] / Static74.anInt2248;
			while (true) {
				@Pc(46) int local46 = (local36 + 1048575 - arg4.anInt1983) / local36;
				if (local46 > arg0) {
					arg4.anInt1983 += local36 * arg0;
					break;
				}
				arg0 -= local46;
				arg4.aClass1_Sub5_Sub4_3.method1313(arg1, arg2, local46);
				@Pc(67) int local67 = Static74.anInt2248 / 100;
				arg4.anInt1983 += local46 * local36 - 1048576;
				@Pc(80) Class1_Sub5_Sub4 local80 = arg4.aClass1_Sub5_Sub4_3;
				arg2 += local46;
				@Pc(88) int local88 = 262144 / local36;
				if (local88 < local67) {
					local67 = local88;
				}
				if (this.aClass1_Sub5_Sub3_4.anIntArray153[arg4.anInt1965] == 0) {
					arg4.aClass1_Sub5_Sub4_3 = Static183.method1319(arg4.aClass1_Sub13_Sub1_1, local80.method1348(), local80.method1345(), local80.method1353());
				} else {
					arg4.aClass1_Sub5_Sub4_3 = Static183.method1319(arg4.aClass1_Sub13_Sub1_1, local80.method1348(), 0, local80.method1353());
					this.aClass1_Sub5_Sub3_4.method1221(arg4.aClass1_Sub16_1.aShortArray27[arg4.anInt1980] < 0, arg4);
					arg4.aClass1_Sub5_Sub4_3.method1329(local67, local80.method1345());
				}
				if (arg4.aClass1_Sub16_1.aShortArray27[arg4.anInt1980] < 0) {
					arg4.aClass1_Sub5_Sub4_3.method1357(-1);
				}
				local80.method1328(local67);
				local80.method1313(arg1, arg2, arg3 - arg2);
				if (local80.method1334()) {
					this.aClass1_Sub5_Sub2_2.method1188(local80);
				}
			}
		}
		arg4.aClass1_Sub5_Sub4_3.method1313(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	@Override
	public void method1316(@OriginalArg(0) int arg0) {
		this.aClass1_Sub5_Sub2_2.method1316(arg0);
		for (@Pc(11) Class1_Sub12 local11 = (Class1_Sub12) this.aClass59_14.method2417(); local11 != null; local11 = (Class1_Sub12) this.aClass59_14.method2424()) {
			if (!this.aClass1_Sub5_Sub3_4.method1223(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local21 <= local11.anInt1969) {
						this.method714(local11, local21);
						local11.anInt1969 -= local21;
						break;
					}
					this.method714(local11, local11.anInt1969);
					local21 -= local11.anInt1969;
				} while (!this.aClass1_Sub5_Sub3_4.method1230(null, 0, local11, local21));
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([III)V")
	@Override
	public void method1313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub5_Sub2_2.method1313(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub12 local17 = (Class1_Sub12) this.aClass59_14.method2417(); local17 != null; local17 = (Class1_Sub12) this.aClass59_14.method2424()) {
			if (!this.aClass1_Sub5_Sub3_4.method1223(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt1969) {
						this.method712(local29, arg0, local27, local27 + local29, local17);
						local17.anInt1969 -= local29;
						break;
					}
					this.method712(local17.anInt1969, arg0, local27, local27 + local29, local17);
					local27 += local17.anInt1969;
					local29 -= local17.anInt1969;
				} while (!this.aClass1_Sub5_Sub3_4.method1230(arg0, local27, local17, local29));
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!ib;I)V")
	private void method714(@OriginalArg(1) Class1_Sub12 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub5_Sub3_4.anIntArray152[arg0.anInt1965] & 0x4) != 0 && arg0.anInt1974 < 0) {
			@Pc(26) int local26 = this.aClass1_Sub5_Sub3_4.anIntArray142[arg0.anInt1965] / Static74.anInt2248;
			@Pc(35) int local35 = (local26 + 1048575 - arg0.anInt1983) / local26;
			arg0.anInt1983 = local26 * arg1 + arg0.anInt1983 & 0xFFFFF;
			if (local35 <= arg1) {
				if (this.aClass1_Sub5_Sub3_4.anIntArray153[arg0.anInt1965] == 0) {
					arg0.aClass1_Sub5_Sub4_3 = Static183.method1319(arg0.aClass1_Sub13_Sub1_1, arg0.aClass1_Sub5_Sub4_3.method1348(), arg0.aClass1_Sub5_Sub4_3.method1345(), arg0.aClass1_Sub5_Sub4_3.method1353());
				} else {
					arg0.aClass1_Sub5_Sub4_3 = Static183.method1319(arg0.aClass1_Sub13_Sub1_1, arg0.aClass1_Sub5_Sub4_3.method1348(), 0, arg0.aClass1_Sub5_Sub4_3.method1353());
					this.aClass1_Sub5_Sub3_4.method1221(arg0.aClass1_Sub16_1.aShortArray27[arg0.anInt1980] < 0, arg0);
				}
				if (arg0.aClass1_Sub16_1.aShortArray27[arg0.anInt1980] < 0) {
					arg0.aClass1_Sub5_Sub4_3.method1357(-1);
				}
				arg1 = arg0.anInt1983 / local26;
			}
		}
		arg0.aClass1_Sub5_Sub4_3.method1316(arg1);
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()Lclient!bc;")
	@Override
	public Class1_Sub5 method1318() {
		@Pc(9) Class1_Sub12 local9 = (Class1_Sub12) this.aClass59_14.method2417();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub5_Sub4_3 == null) {
			return this.method1314();
		} else {
			return local9.aClass1_Sub5_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
	@Override
	public int method1312() {
		return 0;
	}
}
