import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZJ)V")
	protected final void method1832(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static53.anInt1458 = arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static84.anIntArray247[local9] = 12800;
		}
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			@Pc(33) int local33 = Static51.method1841(local28);
			this.method1836(local28 + 176, 7, local33 >> 7, arg1);
			this.method1836(local28 + 176, 39, local33 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIJI)V")
	protected final void method1835(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) ((double) arg0 * Math.pow(0.1D, (double) arg2 * 5.0E-4D) + 0.5D);
		if (Static53.anInt1458 == local14) {
			return;
		}
		Static53.anInt1458 = local14;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			@Pc(30) int local30 = Static51.method1841(local25);
			this.method1836(local25 + 176, 7, local30 >> 7, arg1);
			this.method1836(local25 + 176, 39, local30 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIJ)V")
	protected abstract void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIJ)Z")
	protected final boolean method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static92.anIntArray292[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static92.anIntArray292[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static92.anIntArray292[arg1] = local14 | local10;
			} else {
				this.method1836(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method1836(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static84.anIntArray247[local10] = 12800;
				local14 = Static51.method1841(local10);
				this.method1836(arg0, 7, local14 >> 7, arg3);
				this.method1836(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static84.anIntArray247[local10] = (Static84.anIntArray247[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static84.anIntArray247[local10] = (Static84.anIntArray247[local10] & 0x3F80) + arg2;
				}
				local14 = Static51.method1841(local10);
				this.method1836(arg0, 7, local14 >> 7, arg3);
				this.method1836(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(JB)V")
	protected final void method1844(@OriginalArg(0) long arg0) {
		@Pc(9) int local9;
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			local9 = Static92.anIntArray292[local3];
			Static92.anIntArray292[local3] = 0;
			for (local15 = 0; local15 < 16; local15++) {
				if ((0x1 << local15 & local9) != 0) {
					this.method1836(local15 + 144, local3, 0, arg0);
				}
			}
		}
		for (local9 = 0; local9 < 16; local9++) {
			this.method1836(local9 + 176, 123, 0, arg0);
		}
		for (local15 = 0; local15 < 16; local15++) {
			this.method1836(local15 + 176, 120, 0, arg0);
		}
		for (@Pc(84) int local84 = 0; local84 < 16; local84++) {
			this.method1836(local84 + 176, 121, 0, arg0);
		}
		for (@Pc(101) int local101 = 0; local101 < 16; local101++) {
			this.method1836(local101 + 176, 0, 0, arg0);
		}
		for (@Pc(119) int local119 = 0; local119 < 16; local119++) {
			this.method1836(local119 + 176, 32, 0, arg0);
		}
		for (@Pc(137) int local137 = 0; local137 < 16; local137++) {
			this.method1836(local137 + 192, 0, 0, arg0);
		}
	}
}
