import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "Lclient!tc;")
	public final Class195 aClass195_3 = new Class195();

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "Lclient!fa;")
	public final Class1_Sub6_Sub4 aClass1_Sub6_Sub4_1 = new Class1_Sub6_Sub4();

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "Lclient!be;")
	private final Class1_Sub6_Sub1 aClass1_Sub6_Sub1_1;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!be;)V")
	public Class1_Sub6_Sub2(@OriginalArg(0) Class1_Sub6_Sub1 arg0) {
		this.aClass1_Sub6_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "()I")
	@Override
	public int method1659() {
		return 0;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
	@Override
	public void method1661(@OriginalArg(0) int arg0) {
		this.aClass1_Sub6_Sub4_1.method1661(arg0);
		for (@Pc(15) Class1_Sub42 local15 = (Class1_Sub42) this.aClass195_3.method5029(); local15 != null; local15 = (Class1_Sub42) this.aClass195_3.method5021()) {
			if (!this.aClass1_Sub6_Sub1_1.method551(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6397) {
						this.method1030(local25, local15);
						local15.anInt6397 -= local25;
						break;
					}
					this.method1030(local15.anInt6397, local15);
					local25 -= local15.anInt6397;
				} while (!this.aClass1_Sub6_Sub1_1.method552(0, local25, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!vq;IIBI[I)V")
	private void method1029(@OriginalArg(0) Class1_Sub42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub6_Sub1_1.anIntArray65[arg0.anInt6417] & 0x4) != 0 && arg0.anInt6404 < 0) {
			@Pc(34) int local34 = this.aClass1_Sub6_Sub1_1.lb[arg0.anInt6417] / Static184.anInt3834;
			while (true) {
				@Pc(43) int local43 = (local34 + 1048575 - arg0.anInt6400) / local34;
				if (local43 > arg3) {
					arg0.anInt6400 += arg3 * local34;
					break;
				}
				arg0.aClass1_Sub6_Sub3_3.method1658(arg4, arg1, local43);
				arg1 += local43;
				arg3 -= local43;
				arg0.anInt6400 += local43 * local34 - 1048576;
				@Pc(74) int local74 = Static184.anInt3834 / 100;
				@Pc(78) int local78 = 262144 / local34;
				if (local74 > local78) {
					local74 = local78;
				}
				@Pc(86) Class1_Sub6_Sub3 local86 = arg0.aClass1_Sub6_Sub3_3;
				if (this.aClass1_Sub6_Sub1_1.anIntArray76[arg0.anInt6417] == 0) {
					arg0.aClass1_Sub6_Sub3_3 = Static357.method1530(arg0.aClass1_Sub12_Sub1_1, local86.method1500(), local86.method1520(), local86.method1504());
				} else {
					arg0.aClass1_Sub6_Sub3_3 = Static357.method1530(arg0.aClass1_Sub12_Sub1_1, local86.method1500(), 0, local86.method1504());
					this.aClass1_Sub6_Sub1_1.method557(arg0.aClass1_Sub20_1.aShortArray45[arg0.anInt6415] < 0, arg0);
					arg0.aClass1_Sub6_Sub3_3.method1521(local74, local86.method1520());
				}
				if (arg0.aClass1_Sub20_1.aShortArray45[arg0.anInt6415] < 0) {
					arg0.aClass1_Sub6_Sub3_3.method1526(-1);
				}
				local86.method1503(local74);
				local86.method1658(arg4, arg1, arg2 - arg1);
				if (local86.method1512()) {
					this.aClass1_Sub6_Sub4_1.method1670(local86);
				}
			}
		}
		arg0.aClass1_Sub6_Sub3_3.method1658(arg4, arg1, arg3);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([III)V")
	@Override
	public void method1658(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub6_Sub4_1.method1658(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub42 local17 = (Class1_Sub42) this.aClass195_3.method5029(); local17 != null; local17 = (Class1_Sub42) this.aClass195_3.method5021()) {
			if (!this.aClass1_Sub6_Sub1_1.method551(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt6397 >= local27) {
						this.method1029(local17, local29, local27 + local29, local27, arg0);
						local17.anInt6397 -= local27;
						break;
					}
					this.method1029(local17, local29, local29 + local27, local17.anInt6397, arg0);
					local29 += local17.anInt6397;
					local27 -= local17.anInt6397;
				} while (!this.aClass1_Sub6_Sub1_1.method552(local29, local27, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "()Lclient!pn;")
	@Override
	public Class1_Sub6 method1660() {
		@Pc(9) Class1_Sub42 local9;
		do {
			local9 = (Class1_Sub42) this.aClass195_3.method5021();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub6_Sub3_3 == null);
		return local9.aClass1_Sub6_Sub3_3;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!vq;I)V")
	private void method1030(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub42 arg1) {
		if ((this.aClass1_Sub6_Sub1_1.anIntArray65[arg1.anInt6417] & 0x4) != 0 && arg1.anInt6404 < 0) {
			@Pc(30) int local30 = this.aClass1_Sub6_Sub1_1.lb[arg1.anInt6417] / Static184.anInt3834;
			@Pc(40) int local40 = (local30 + 1048575 - arg1.anInt6400) / local30;
			arg1.anInt6400 = local30 * arg0 + arg1.anInt6400 & 0xFFFFF;
			if (local40 <= arg0) {
				if (this.aClass1_Sub6_Sub1_1.anIntArray76[arg1.anInt6417] == 0) {
					arg1.aClass1_Sub6_Sub3_3 = Static357.method1530(arg1.aClass1_Sub12_Sub1_1, arg1.aClass1_Sub6_Sub3_3.method1500(), arg1.aClass1_Sub6_Sub3_3.method1520(), arg1.aClass1_Sub6_Sub3_3.method1504());
				} else {
					arg1.aClass1_Sub6_Sub3_3 = Static357.method1530(arg1.aClass1_Sub12_Sub1_1, arg1.aClass1_Sub6_Sub3_3.method1500(), 0, arg1.aClass1_Sub6_Sub3_3.method1504());
					this.aClass1_Sub6_Sub1_1.method557(arg1.aClass1_Sub20_1.aShortArray45[arg1.anInt6415] < 0, arg1);
				}
				if (arg1.aClass1_Sub20_1.aShortArray45[arg1.anInt6415] < 0) {
					arg1.aClass1_Sub6_Sub3_3.method1526(-1);
				}
				arg0 = arg1.anInt6400 / local30;
			}
		}
		arg1.aClass1_Sub6_Sub3_3.method1661(arg0);
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "()Lclient!pn;")
	@Override
	public Class1_Sub6 method1664() {
		@Pc(9) Class1_Sub42 local9 = (Class1_Sub42) this.aClass195_3.method5029();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub6_Sub3_3 == null) {
			return this.method1660();
		} else {
			return local9.aClass1_Sub6_Sub3_3;
		}
	}
}
