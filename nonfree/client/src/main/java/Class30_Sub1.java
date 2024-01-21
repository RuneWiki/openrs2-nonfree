import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public abstract class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method1514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static87.anIntArray205[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static87.anIntArray205[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static87.anIntArray205[arg1] = local14 | local10;
			} else {
				this.method1523(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method1523(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static28.anIntArray81[local10] = 12800;
				local14 = Static69.method1524(local10);
				this.method1523(arg0, 7, local14 >> 7, arg3);
				this.method1523(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static28.anIntArray81[local10] = (Static28.anIntArray81[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static28.anIntArray81[local10] = (Static28.anIntArray81[local10] & 0x3F80) + arg2;
				}
				local14 = Static69.method1524(local10);
				this.method1523(arg0, 7, local14 >> 7, arg3);
				this.method1523(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JI)V")
	protected final void method1515(@OriginalArg(0) long arg0) {
		@Pc(9) int local9;
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			local9 = Static87.anIntArray205[local3];
			Static87.anIntArray205[local3] = 0;
			for (local15 = 0; local15 < 16; local15++) {
				if ((local9 & 0x1 << local15) != 0) {
					this.method1523(local15 + 144, local3, 0, arg0);
				}
			}
		}
		for (local9 = 0; local9 < 16; local9++) {
			this.method1523(local9 + 176, 123, 0, arg0);
		}
		for (local15 = 0; local15 < 16; local15++) {
			this.method1523(local15 + 176, 120, 0, arg0);
		}
		for (@Pc(82) int local82 = 0; local82 < 16; local82++) {
			this.method1523(local82 + 176, 121, 0, arg0);
		}
		for (@Pc(101) int local101 = 0; local101 < 16; local101++) {
			this.method1523(local101 + 176, 0, 0, arg0);
		}
		for (@Pc(117) int local117 = 0; local117 < 16; local117++) {
			this.method1523(local117 + 176, 32, 0, arg0);
		}
		for (@Pc(139) int local139 = 0; local139 < 16; local139++) {
			this.method1523(local139 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JIZ)V")
	protected final void method1516(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static7.anInt281 = arg1;
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static28.anIntArray81[local5] = 12800;
		}
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			@Pc(29) int local29 = Static69.method1524(local17);
			this.method1523(local17 + 176, 7, local29 >> 7, arg0);
			this.method1523(local17 + 176, 39, local29 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIIJ)V")
	protected final void method1522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(14) int local14 = (int) (Math.pow(0.1D, (double) arg1 * 5.0E-4D) * (double) arg0 + 0.5D);
		if (Static7.anInt281 == local14) {
			return;
		}
		Static7.anInt281 = local14;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			@Pc(30) int local30 = Static69.method1524(local25);
			this.method1523(local25 + 176, 7, local30 >> 7, arg2);
			this.method1523(local25 + 176, 39, local30 & 0x7F, arg2);
		}
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(IIIJ)V")
	protected abstract void method1523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);
}
