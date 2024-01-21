import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!g", name = "V", descriptor = "Lclient!pb;")
	public final Class61 aClass61_6 = new Class61();

	@OriginalMember(owner = "client!g", name = "W", descriptor = "Lclient!d;")
	public final Class4_Sub1_Sub2 aClass4_Sub1_Sub2_1 = new Class4_Sub1_Sub2();

	@OriginalMember(owner = "client!g", name = "L", descriptor = "Lclient!ad;")
	private final Class4_Sub1_Sub1 aClass4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class4_Sub1_Sub3(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		this.aClass4_Sub1_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "()Lclient!md;")
	@Override
	public Class4_Sub1 method1536() {
		@Pc(9) Class4_Sub21 local9;
		do {
			local9 = (Class4_Sub21) this.aClass61_6.method1629();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub1_Sub4_3 == null);
		return local9.aClass4_Sub1_Sub4_3;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!tc;I[II)V")
	private void method644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub21 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if ((this.aClass4_Sub1_Sub1_1.anIntArray18[arg2.anInt2820] & 0x4) != 0 && arg2.anInt2833 < 0) {
			@Pc(32) int local32 = this.aClass4_Sub1_Sub1_1.anIntArray9[arg2.anInt2820] / Static123.anInt3048;
			while (true) {
				@Pc(43) int local43 = (local32 + 1048575 - arg2.anInt2838) / local32;
				if (arg1 < local43) {
					arg2.anInt2838 += local32 * arg1;
					break;
				}
				arg1 -= local43;
				arg2.aClass4_Sub1_Sub4_3.method1533(arg4, arg0, local43);
				arg2.anInt2838 += local32 * local43 - 1048576;
				arg0 += local43;
				@Pc(74) int local74 = Static123.anInt3048 / 100;
				@Pc(78) int local78 = 262144 / local32;
				if (local78 < local74) {
					local74 = local78;
				}
				@Pc(90) Class4_Sub1_Sub4 local90 = arg2.aClass4_Sub1_Sub4_3;
				if (this.aClass4_Sub1_Sub1_1.anIntArray6[arg2.anInt2820] == 0) {
					arg2.aClass4_Sub1_Sub4_3 = Static135.method1546(arg2.aClass4_Sub6_Sub1_1, local90.method1551(), local90.method1569(), local90.method1543());
				} else {
					arg2.aClass4_Sub1_Sub4_3 = Static135.method1546(arg2.aClass4_Sub6_Sub1_1, local90.method1551(), 0, local90.method1543());
					this.aClass4_Sub1_Sub1_1.method67(arg2, arg2.aClass4_Sub15_1.aShortArray6[arg2.anInt2826] < 0);
					arg2.aClass4_Sub1_Sub4_3.method1549(local74, local90.method1569());
				}
				if (arg2.aClass4_Sub15_1.aShortArray6[arg2.anInt2826] < 0) {
					arg2.aClass4_Sub1_Sub4_3.method1558(-1);
				}
				local90.method1539(local74);
				local90.method1533(arg4, arg0, arg3 - arg0);
				if (local90.method1578()) {
					this.aClass4_Sub1_Sub2_1.method360(local90);
				}
			}
		}
		arg2.aClass4_Sub1_Sub4_3.method1533(arg4, arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([III)V")
	@Override
	public void method1533(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub1_Sub2_1.method1533(arg0, arg1, arg2);
		for (@Pc(13) Class4_Sub21 local13 = (Class4_Sub21) this.aClass61_6.method1628(); local13 != null; local13 = (Class4_Sub21) this.aClass61_6.method1629()) {
			if (!this.aClass4_Sub1_Sub1_1.method71(local13)) {
				@Pc(23) int local23 = arg1;
				@Pc(25) int local25 = arg2;
				do {
					if (local25 <= local13.anInt2836) {
						this.method644(local23, local25, local13, local25 + local23, arg0);
						local13.anInt2836 -= local25;
						break;
					}
					this.method644(local23, local13.anInt2836, local13, local23 + local25, arg0);
					local25 -= local13.anInt2836;
					local23 += local13.anInt2836;
				} while (!this.aClass4_Sub1_Sub1_1.method59(local25, local23, arg0, local13));
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "()I")
	@Override
	public int method1535() {
		return 0;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	@Override
	public void method1534(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1_Sub2_1.method1534(arg0);
		for (@Pc(15) Class4_Sub21 local15 = (Class4_Sub21) this.aClass61_6.method1628(); local15 != null; local15 = (Class4_Sub21) this.aClass61_6.method1629()) {
			if (!this.aClass4_Sub1_Sub1_1.method71(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt2836) {
						this.method646(local25, local15);
						local15.anInt2836 -= local25;
						break;
					}
					this.method646(local15.anInt2836, local15);
					local25 -= local15.anInt2836;
				} while (!this.aClass4_Sub1_Sub1_1.method59(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()Lclient!md;")
	@Override
	public Class4_Sub1 method1532() {
		@Pc(5) Class4_Sub21 local5 = (Class4_Sub21) this.aClass61_6.method1628();
		if (local5 == null) {
			return null;
		} else if (local5.aClass4_Sub1_Sub4_3 == null) {
			return this.method1536();
		} else {
			return local5.aClass4_Sub1_Sub4_3;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!tc;I)V")
	private void method646(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub21 arg1) {
		if ((this.aClass4_Sub1_Sub1_1.anIntArray18[arg1.anInt2820] & 0x4) != 0 && arg1.anInt2833 < 0) {
			@Pc(23) int local23 = this.aClass4_Sub1_Sub1_1.anIntArray9[arg1.anInt2820] / Static123.anInt3048;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt2838) / local23;
			arg1.anInt2838 = arg0 * local23 + arg1.anInt2838 & 0xFFFFF;
			if (local33 <= arg0) {
				if (this.aClass4_Sub1_Sub1_1.anIntArray6[arg1.anInt2820] == 0) {
					arg1.aClass4_Sub1_Sub4_3 = Static135.method1546(arg1.aClass4_Sub6_Sub1_1, arg1.aClass4_Sub1_Sub4_3.method1551(), arg1.aClass4_Sub1_Sub4_3.method1569(), arg1.aClass4_Sub1_Sub4_3.method1543());
				} else {
					arg1.aClass4_Sub1_Sub4_3 = Static135.method1546(arg1.aClass4_Sub6_Sub1_1, arg1.aClass4_Sub1_Sub4_3.method1551(), 0, arg1.aClass4_Sub1_Sub4_3.method1543());
					this.aClass4_Sub1_Sub1_1.method67(arg1, arg1.aClass4_Sub15_1.aShortArray6[arg1.anInt2826] < 0);
				}
				if (arg1.aClass4_Sub15_1.aShortArray6[arg1.anInt2826] < 0) {
					arg1.aClass4_Sub1_Sub4_3.method1558(-1);
				}
				arg0 = arg1.anInt2838 / local23;
			}
		}
		arg1.aClass4_Sub1_Sub4_3.method1534(arg0);
	}
}
