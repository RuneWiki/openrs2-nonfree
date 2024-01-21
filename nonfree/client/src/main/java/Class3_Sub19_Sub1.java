import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class3_Sub19_Sub1 extends Class3_Sub19 {

	@OriginalMember(owner = "client!l", name = "x", descriptor = "Lclient!bd;")
	public final Class10 aClass10_66 = new Class10();

	@OriginalMember(owner = "client!l", name = "R", descriptor = "Lclient!tg;")
	public final Class3_Sub19_Sub3 aClass3_Sub19_Sub3_1 = new Class3_Sub19_Sub3();

	@OriginalMember(owner = "client!l", name = "G", descriptor = "Lclient!tc;")
	private final Class3_Sub19_Sub2 aClass3_Sub19_Sub2_1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!tc;)V")
	public Class3_Sub19_Sub1(@OriginalArg(0) Class3_Sub19_Sub2 arg0) {
		this.aClass3_Sub19_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	@Override
	public void method3248(@OriginalArg(0) int arg0) {
		this.aClass3_Sub19_Sub3_1.method3248(arg0);
		for (@Pc(15) Class3_Sub8 local15 = (Class3_Sub8) this.aClass10_66.method267(); local15 != null; local15 = (Class3_Sub8) this.aClass10_66.method268()) {
			if (!this.aClass3_Sub19_Sub2_1.method2845(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt1170 >= local25) {
						this.method1642(local15, local25);
						local15.anInt1170 -= local25;
						break;
					}
					this.method1642(local15, local15.anInt1170);
					local25 -= local15.anInt1170;
				} while (!this.aClass3_Sub19_Sub2_1.method2844(local25, null, local15, 0));
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB[ILclient!fd;II)V")
	private void method1640(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class3_Sub8 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass3_Sub19_Sub2_1.anIntArray318[arg2.anInt1179] & 0x4) != 0 && arg2.anInt1188 < 0) {
			@Pc(25) int local25 = this.aClass3_Sub19_Sub2_1.anIntArray311[arg2.anInt1179] / Static91.anInt1796;
			while (true) {
				@Pc(36) int local36 = (local25 + 1048575 - arg2.anInt1194) / local25;
				if (arg0 < local36) {
					arg2.anInt1194 += local25 * arg0;
					break;
				}
				arg0 -= local36;
				arg2.aClass3_Sub19_Sub4_1.method3249(arg1, arg4, local36);
				@Pc(57) int local57 = 262144 / local25;
				@Pc(61) int local61 = Static91.anInt1796 / 100;
				arg4 += local36;
				arg2.anInt1194 += local36 * local25 - 1048576;
				@Pc(78) Class3_Sub19_Sub4 local78 = arg2.aClass3_Sub19_Sub4_1;
				if (local57 < local61) {
					local61 = local57;
				}
				if (this.aClass3_Sub19_Sub2_1.anIntArray317[arg2.anInt1179] == 0) {
					arg2.aClass3_Sub19_Sub4_1 = Static220.method3255(arg2.aClass3_Sub24_Sub1_1, local78.method3278(), local78.method3259(), local78.method3256());
				} else {
					arg2.aClass3_Sub19_Sub4_1 = Static220.method3255(arg2.aClass3_Sub24_Sub1_1, local78.method3278(), 0, local78.method3256());
					this.aClass3_Sub19_Sub2_1.method2869(arg2, arg2.aClass3_Sub21_1.aShortArray44[arg2.anInt1180] < 0);
					arg2.aClass3_Sub19_Sub4_1.method3282(local61, local78.method3259());
				}
				if (arg2.aClass3_Sub21_1.aShortArray44[arg2.anInt1180] < 0) {
					arg2.aClass3_Sub19_Sub4_1.method3285(-1);
				}
				local78.method3268(local61);
				local78.method3249(arg1, arg4, arg3 - arg4);
				if (local78.method3254()) {
					this.aClass3_Sub19_Sub3_1.method2922(local78);
				}
			}
		}
		arg2.aClass3_Sub19_Sub4_1.method3249(arg1, arg4, arg0);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()Lclient!pb;")
	@Override
	public Class3_Sub19 method3246() {
		@Pc(9) Class3_Sub8 local9;
		do {
			local9 = (Class3_Sub8) this.aClass10_66.method268();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub19_Sub4_1 == null);
		return local9.aClass3_Sub19_Sub4_1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()I")
	@Override
	public int method3244() {
		return 0;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "([III)V")
	@Override
	public void method3249(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub19_Sub3_1.method3249(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub8 local17 = (Class3_Sub8) this.aClass10_66.method267(); local17 != null; local17 = (Class3_Sub8) this.aClass10_66.method268()) {
			if (!this.aClass3_Sub19_Sub2_1.method2845(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt1170 >= local27) {
						this.method1640(local27, arg0, local17, local29 + local27, local29);
						local17.anInt1170 -= local27;
						break;
					}
					this.method1640(local17.anInt1170, arg0, local17, local29 + local27, local29);
					local29 += local17.anInt1170;
					local27 -= local17.anInt1170;
				} while (!this.aClass3_Sub19_Sub2_1.method2844(local27, arg0, local17, local29));
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()Lclient!pb;")
	@Override
	public Class3_Sub19 method3247() {
		@Pc(5) Class3_Sub8 local5 = (Class3_Sub8) this.aClass10_66.method267();
		if (local5 == null) {
			return null;
		} else if (local5.aClass3_Sub19_Sub4_1 == null) {
			return this.method3246();
		} else {
			return local5.aClass3_Sub19_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method1642(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass3_Sub19_Sub2_1.anIntArray318[arg0.anInt1179] & 0x4) != 0 && arg0.anInt1188 < 0) {
			@Pc(28) int local28 = this.aClass3_Sub19_Sub2_1.anIntArray311[arg0.anInt1179] / Static91.anInt1796;
			@Pc(38) int local38 = (local28 + 1048575 - arg0.anInt1194) / local28;
			arg0.anInt1194 = local28 * arg1 + arg0.anInt1194 & 0xFFFFF;
			if (local38 <= arg1) {
				if (this.aClass3_Sub19_Sub2_1.anIntArray317[arg0.anInt1179] == 0) {
					arg0.aClass3_Sub19_Sub4_1 = Static220.method3255(arg0.aClass3_Sub24_Sub1_1, arg0.aClass3_Sub19_Sub4_1.method3278(), arg0.aClass3_Sub19_Sub4_1.method3259(), arg0.aClass3_Sub19_Sub4_1.method3256());
				} else {
					arg0.aClass3_Sub19_Sub4_1 = Static220.method3255(arg0.aClass3_Sub24_Sub1_1, arg0.aClass3_Sub19_Sub4_1.method3278(), 0, arg0.aClass3_Sub19_Sub4_1.method3256());
					this.aClass3_Sub19_Sub2_1.method2869(arg0, arg0.aClass3_Sub21_1.aShortArray44[arg0.anInt1180] < 0);
				}
				if (arg0.aClass3_Sub21_1.aShortArray44[arg0.anInt1180] < 0) {
					arg0.aClass3_Sub19_Sub4_1.method3285(-1);
				}
				arg1 = arg0.anInt1194 / local28;
			}
		}
		arg0.aClass3_Sub19_Sub4_1.method3248(arg1);
	}
}
