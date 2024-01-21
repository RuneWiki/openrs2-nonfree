import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJII)V")
	protected final void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) (Math.pow(0.1D, (double) arg0 * 5.0E-4D) * (double) arg2 + 0.5D);
		if (local14 == Static91.anInt2432) {
			return;
		}
		Static91.anInt2432 = local14;
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			@Pc(34) int local34 = Static51.method1433(local29);
			this.method1443(local29 + 176, 7, local34 >> 7, arg1);
			this.method1443(local29 + 176, 39, local34 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIJ)V")
	protected final void method1437(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static91.anInt2432 = arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static24.anIntArray60[local9] = 12800;
		}
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			@Pc(28) int local28 = Static51.method1433(local23);
			this.method1443(local23 + 176, 7, local28 >> 7, arg1);
			this.method1443(local23 + 176, 39, local28 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V")
	protected final void method1438(@OriginalArg(0) long arg0) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			this.method1443(local7 + 176, 123, 0, arg0);
		}
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.method1443(local23 + 176, 120, 0, arg0);
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.method1443(local47 + 176, 121, 0, arg0);
		}
		for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
			this.method1443(local63 + 176, 0, 0, arg0);
		}
		for (@Pc(81) int local81 = 0; local81 < 16; local81++) {
			this.method1443(local81 + 176, 32, 0, arg0);
		}
		for (@Pc(97) int local97 = 0; local97 < 16; local97++) {
			this.method1443(local97 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method1439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		if ((arg0 & 0xF0) == 176) {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (arg1 == 121) {
				this.method1443(arg0, arg1, arg2, arg3);
				local17 = arg0 & 0xF;
				Static24.anIntArray60[local17] = 12800;
				local24 = Static51.method1433(local17);
				this.method1443(arg0, 7, local24 >> 7, arg3);
				this.method1443(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local17 = arg0 & 0xF;
				if (arg1 == 7) {
					Static24.anIntArray60[local17] = (Static24.anIntArray60[local17] & 0x7F) + (arg2 << 7);
				} else {
					Static24.anIntArray60[local17] = (Static24.anIntArray60[local17] & 0x3F80) + arg2;
				}
				local24 = Static51.method1433(local17);
				this.method1443(arg0, 7, local24 >> 7, arg3);
				this.method1443(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIJ)V")
	protected abstract void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);
}
