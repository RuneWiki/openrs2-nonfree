import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public abstract class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method1253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		if ((arg0 & 0xF0) == 176) {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (arg1 == 121) {
				this.method1262(arg0, arg1, arg2, arg3);
				local17 = arg0 & 0xF;
				Static52.anIntArray257[local17] = 12800;
				local24 = Static15.method1258(local17);
				this.method1262(arg0, 7, local24 >> 7, arg3);
				this.method1262(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local17 = arg0 & 0xF;
				if (arg1 == 7) {
					Static52.anIntArray257[local17] = (Static52.anIntArray257[local17] & 0x7F) + (arg2 << 7);
				} else {
					Static52.anIntArray257[local17] = (Static52.anIntArray257[local17] & 0x3F80) + arg2;
				}
				local24 = Static15.method1258(local17);
				this.method1262(arg0, 7, local24 >> 7, arg3);
				this.method1262(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIJI)V")
	protected final void method1256(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) (Math.pow(0.1D, (double) arg2 * 5.0E-4D) * (double) arg0 + 0.5D);
		if (local14 == Static93.anInt2179) {
			return;
		}
		Static93.anInt2179 = local14;
		for (@Pc(30) int local30 = 0; local30 < 16; local30++) {
			@Pc(35) int local35 = Static15.method1258(local30);
			this.method1262(local30 + 176, 7, local35 >> 7, arg1);
			this.method1262(local30 + 176, 39, local35 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JB)V")
	protected final void method1257(@OriginalArg(0) long arg0) {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.method1262(local12 + 176, 123, 0, arg0);
		}
		for (@Pc(30) int local30 = 0; local30 < 16; local30++) {
			this.method1262(local30 + 176, 120, 0, arg0);
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.method1262(local47 + 176, 121, 0, arg0);
		}
		for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
			this.method1262(local63 + 176, 0, 0, arg0);
		}
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			this.method1262(local79 + 176, 32, 0, arg0);
		}
		for (@Pc(95) int local95 = 0; local95 < 16; local95++) {
			this.method1262(local95 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(BJ)V")
	protected final void method1259(@OriginalArg(1) long arg0) {
		Static93.anInt2179 = 256;
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			Static52.anIntArray257[local17] = 12800;
		}
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.method1262(local29 + 176, 7, 100, arg0);
			this.method1262(local29 + 176, 39, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIIJ)V")
	protected abstract void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);
}
