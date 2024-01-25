import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Lclient!kn;")
	public final Class116 aClass116_12 = new Class116();

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Lclient!lk;")
	public final Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1 = new Class4_Sub1_Sub3();

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!mn;")
	private final Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!mn;)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class4_Sub1_Sub4 arg0) {
		this.aClass4_Sub1_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()I")
	@Override
	public int method3786() {
		return 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!oa;[IIII)V")
	private void method2254(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub30 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass4_Sub1_Sub4_1.anIntArray358[arg1.anInt4530] & 0x4) != 0 && arg1.anInt4516 < 0) {
			@Pc(25) int local25 = this.aClass4_Sub1_Sub4_1.anIntArray352[arg1.anInt4530] / Static251.anInt5134;
			while (true) {
				@Pc(34) int local34 = (local25 + 1048575 - arg1.anInt4531) / local25;
				if (arg3 < local34) {
					arg1.anInt4531 += arg3 * local25;
					break;
				}
				arg1.aClass4_Sub1_Sub1_3.method3781(arg2, arg4, local34);
				arg3 -= local34;
				arg1.anInt4531 += local34 * local25 - 1048576;
				arg4 += local34;
				@Pc(69) int local69 = Static251.anInt5134 / 100;
				@Pc(73) int local73 = 262144 / local25;
				if (local69 > local73) {
					local69 = local73;
				}
				@Pc(81) Class4_Sub1_Sub1 local81 = arg1.aClass4_Sub1_Sub1_3;
				if (this.aClass4_Sub1_Sub4_1.anIntArray347[arg1.anInt4530] == 0) {
					arg1.aClass4_Sub1_Sub1_3 = Static358.method96(arg1.aClass4_Sub7_Sub1_1, local81.method107(), local81.method88(), local81.method114());
				} else {
					arg1.aClass4_Sub1_Sub1_3 = Static358.method96(arg1.aClass4_Sub7_Sub1_1, local81.method107(), 0, local81.method114());
					this.aClass4_Sub1_Sub4_1.method3811(arg1, arg1.aClass4_Sub16_1.aShortArray44[arg1.anInt4520] < 0);
					arg1.aClass4_Sub1_Sub1_3.method113(local69, local81.method88());
				}
				if (arg1.aClass4_Sub16_1.aShortArray44[arg1.anInt4520] < 0) {
					arg1.aClass4_Sub1_Sub1_3.method108(-1);
				}
				local81.method77(local69);
				local81.method3781(arg2, arg4, arg0 - arg4);
				if (local81.method106()) {
					this.aClass4_Sub1_Sub3_1.method3505(local81);
				}
			}
		}
		arg1.aClass4_Sub1_Sub1_3.method3781(arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public void method3783(@OriginalArg(0) int arg0) {
		this.aClass4_Sub1_Sub3_1.method3783(arg0);
		for (@Pc(15) Class4_Sub30 local15 = (Class4_Sub30) this.aClass116_12.method3270(); local15 != null; local15 = (Class4_Sub30) this.aClass116_12.method3272()) {
			if (!this.aClass4_Sub1_Sub4_1.method3809(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt4511) {
						this.method2255(local25, local15);
						local15.anInt4511 -= local25;
						break;
					}
					this.method2255(local15.anInt4511, local15);
					local25 -= local15.anInt4511;
				} while (!this.aClass4_Sub1_Sub4_1.method3795(local25, 0, null, local15));
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!oa;)V")
	private void method2255(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if ((this.aClass4_Sub1_Sub4_1.anIntArray358[arg1.anInt4530] & 0x4) != 0 && arg1.anInt4516 < 0) {
			@Pc(23) int local23 = this.aClass4_Sub1_Sub4_1.anIntArray352[arg1.anInt4530] / Static251.anInt5134;
			@Pc(33) int local33 = (local23 + 1048575 - arg1.anInt4531) / local23;
			arg1.anInt4531 = arg1.anInt4531 + local23 * arg0 & 0xFFFFF;
			if (local33 <= arg0) {
				if (this.aClass4_Sub1_Sub4_1.anIntArray347[arg1.anInt4530] == 0) {
					arg1.aClass4_Sub1_Sub1_3 = Static358.method96(arg1.aClass4_Sub7_Sub1_1, arg1.aClass4_Sub1_Sub1_3.method107(), arg1.aClass4_Sub1_Sub1_3.method88(), arg1.aClass4_Sub1_Sub1_3.method114());
				} else {
					arg1.aClass4_Sub1_Sub1_3 = Static358.method96(arg1.aClass4_Sub7_Sub1_1, arg1.aClass4_Sub1_Sub1_3.method107(), 0, arg1.aClass4_Sub1_Sub1_3.method114());
					this.aClass4_Sub1_Sub4_1.method3811(arg1, arg1.aClass4_Sub16_1.aShortArray44[arg1.anInt4520] < 0);
				}
				if (arg1.aClass4_Sub16_1.aShortArray44[arg1.anInt4520] < 0) {
					arg1.aClass4_Sub1_Sub1_3.method108(-1);
				}
				arg0 = arg1.anInt4531 / local23;
			}
		}
		arg1.aClass4_Sub1_Sub1_3.method3783(arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([III)V")
	@Override
	public void method3781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub1_Sub3_1.method3781(arg0, arg1, arg2);
		for (@Pc(17) Class4_Sub30 local17 = (Class4_Sub30) this.aClass116_12.method3270(); local17 != null; local17 = (Class4_Sub30) this.aClass116_12.method3272()) {
			if (!this.aClass4_Sub1_Sub4_1.method3809(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local17.anInt4511 >= local29) {
						this.method2254(local27 + local29, local17, arg0, local29, local27);
						local17.anInt4511 -= local29;
						break;
					}
					this.method2254(local27 + local29, local17, arg0, local17.anInt4511, local27);
					local29 -= local17.anInt4511;
					local27 += local17.anInt4511;
				} while (!this.aClass4_Sub1_Sub4_1.method3795(local29, local27, arg0, local17));
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()Lclient!kb;")
	@Override
	public Class4_Sub1 method3784() {
		@Pc(9) Class4_Sub30 local9 = (Class4_Sub30) this.aClass116_12.method3270();
		if (local9 == null) {
			return null;
		} else if (local9.aClass4_Sub1_Sub1_3 == null) {
			return this.method3787();
		} else {
			return local9.aClass4_Sub1_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "()Lclient!kb;")
	@Override
	public Class4_Sub1 method3787() {
		@Pc(9) Class4_Sub30 local9;
		do {
			local9 = (Class4_Sub30) this.aClass116_12.method3272();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass4_Sub1_Sub1_3 == null);
		return local9.aClass4_Sub1_Sub1_3;
	}
}
