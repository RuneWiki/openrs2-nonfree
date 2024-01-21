import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class8_Sub11_Sub3 extends Class8_Sub11 {

	@OriginalMember(owner = "client!td", name = "y", descriptor = "Lclient!m;")
	public final Class49 aClass49_11 = new Class49();

	@OriginalMember(owner = "client!td", name = "X", descriptor = "Lclient!ue;")
	public final Class8_Sub11_Sub4 aClass8_Sub11_Sub4_2 = new Class8_Sub11_Sub4();

	@OriginalMember(owner = "client!td", name = "I", descriptor = "Lclient!id;")
	private final Class8_Sub11_Sub1 aClass8_Sub11_Sub1_2;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!id;)V")
	public Class8_Sub11_Sub3(@OriginalArg(0) Class8_Sub11_Sub1 arg0) {
		this.aClass8_Sub11_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()Lclient!rf;")
	@Override
	public Class8_Sub11 method1918() {
		@Pc(9) Class8_Sub23 local9;
		do {
			local9 = (Class8_Sub23) this.aClass49_11.method1109();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass8_Sub11_Sub2_3 == null);
		return local9.aClass8_Sub11_Sub2_3;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!we;II)V")
	private void method1633(@OriginalArg(0) Class8_Sub23 arg0, @OriginalArg(1) int arg1) {
		if ((this.aClass8_Sub11_Sub1_2.anIntArray188[arg0.anInt3077] & 0x4) != 0 && arg0.anInt3062 < 0) {
			@Pc(23) int local23 = this.aClass8_Sub11_Sub1_2.anIntArray179[arg0.anInt3077] / Static23.anInt713;
			@Pc(33) int local33 = (local23 + 1048575 - arg0.anInt3083) / local23;
			arg0.anInt3083 = arg1 * local23 + arg0.anInt3083 & 0xFFFFF;
			if (local33 <= arg1) {
				if (this.aClass8_Sub11_Sub1_2.anIntArray181[arg0.anInt3077] == 0) {
					arg0.aClass8_Sub11_Sub2_3 = Static136.method988(arg0.aClass8_Sub9_Sub1_1, arg0.aClass8_Sub11_Sub2_3.method1000(), arg0.aClass8_Sub11_Sub2_3.method967(), arg0.aClass8_Sub11_Sub2_3.method980());
				} else {
					arg0.aClass8_Sub11_Sub2_3 = Static136.method988(arg0.aClass8_Sub9_Sub1_1, arg0.aClass8_Sub11_Sub2_3.method1000(), 0, arg0.aClass8_Sub11_Sub2_3.method980());
					this.aClass8_Sub11_Sub1_2.method897(arg0.aClass8_Sub8_1.aShortArray26[arg0.anInt3078] < 0, arg0);
				}
				if (arg0.aClass8_Sub8_1.aShortArray26[arg0.anInt3078] < 0) {
					arg0.aClass8_Sub11_Sub2_3.method984(-1);
				}
				arg1 = arg0.anInt3083 / local23;
			}
		}
		arg0.aClass8_Sub11_Sub2_3.method1917(arg1);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
	@Override
	public int method1919() {
		return 0;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()Lclient!rf;")
	@Override
	public Class8_Sub11 method1920() {
		@Pc(9) Class8_Sub23 local9 = (Class8_Sub23) this.aClass49_11.method1107();
		if (local9 == null) {
			return null;
		} else if (local9.aClass8_Sub11_Sub2_3 == null) {
			return this.method1918();
		} else {
			return local9.aClass8_Sub11_Sub2_3;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	@Override
	public void method1917(@OriginalArg(0) int arg0) {
		this.aClass8_Sub11_Sub4_2.method1917(arg0);
		for (@Pc(15) Class8_Sub23 local15 = (Class8_Sub23) this.aClass49_11.method1107(); local15 != null; local15 = (Class8_Sub23) this.aClass49_11.method1109()) {
			if (!this.aClass8_Sub11_Sub1_2.method868(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt3073) {
						this.method1633(local15, local25);
						local15.anInt3073 -= local25;
						break;
					}
					this.method1633(local15, local15.anInt3073);
					local25 -= local15.anInt3073;
				} while (!this.aClass8_Sub11_Sub1_2.method872(0, local25, local15, null));
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "([III)V")
	@Override
	public void method1921(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass8_Sub11_Sub4_2.method1921(arg0, arg1, arg2);
		for (@Pc(17) Class8_Sub23 local17 = (Class8_Sub23) this.aClass49_11.method1107(); local17 != null; local17 = (Class8_Sub23) this.aClass49_11.method1109()) {
			if (!this.aClass8_Sub11_Sub1_2.method868(local17)) {
				@Pc(27) int local27 = arg1;
				@Pc(29) int local29 = arg2;
				do {
					if (local29 <= local17.anInt3073) {
						this.method1636(local29, local17, local27, local29 + local27, arg0);
						local17.anInt3073 -= local29;
						break;
					}
					this.method1636(local17.anInt3073, local17, local27, local27 + local29, arg0);
					local29 -= local17.anInt3073;
					local27 += local17.anInt3073;
				} while (!this.aClass8_Sub11_Sub1_2.method872(local27, local29, local17, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!we;III[I)V")
	private void method1636(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub23 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass8_Sub11_Sub1_2.anIntArray188[arg1.anInt3077] & 0x4) != 0 && arg1.anInt3062 < 0) {
			@Pc(34) int local34 = this.aClass8_Sub11_Sub1_2.anIntArray179[arg1.anInt3077] / Static23.anInt713;
			while (true) {
				@Pc(45) int local45 = (local34 + 1048575 - arg1.anInt3083) / local34;
				if (local45 > arg0) {
					arg1.anInt3083 += arg0 * local34;
					break;
				}
				arg0 -= local45;
				arg1.aClass8_Sub11_Sub2_3.method1921(arg4, arg2, local45);
				arg2 += local45;
				arg1.anInt3083 += local34 * local45 - 1048576;
				@Pc(76) int local76 = Static23.anInt713 / 100;
				@Pc(80) int local80 = 262144 / local34;
				if (local76 > local80) {
					local76 = local80;
				}
				@Pc(92) Class8_Sub11_Sub2 local92 = arg1.aClass8_Sub11_Sub2_3;
				if (this.aClass8_Sub11_Sub1_2.anIntArray181[arg1.anInt3077] == 0) {
					arg1.aClass8_Sub11_Sub2_3 = Static136.method988(arg1.aClass8_Sub9_Sub1_1, local92.method1000(), local92.method967(), local92.method980());
				} else {
					arg1.aClass8_Sub11_Sub2_3 = Static136.method988(arg1.aClass8_Sub9_Sub1_1, local92.method1000(), 0, local92.method980());
					this.aClass8_Sub11_Sub1_2.method897(arg1.aClass8_Sub8_1.aShortArray26[arg1.anInt3078] < 0, arg1);
					arg1.aClass8_Sub11_Sub2_3.method975(local76, local92.method967());
				}
				if (arg1.aClass8_Sub8_1.aShortArray26[arg1.anInt3078] < 0) {
					arg1.aClass8_Sub11_Sub2_3.method984(-1);
				}
				local92.method998(local76);
				local92.method1921(arg4, arg2, arg3 - arg2);
				if (local92.method972()) {
					this.aClass8_Sub11_Sub4_2.method1922(local92);
				}
			}
		}
		arg1.aClass8_Sub11_Sub2_3.method1921(arg4, arg2, arg0);
	}
}
