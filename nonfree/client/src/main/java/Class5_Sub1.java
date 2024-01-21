import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZJI)V")
	protected final void method1609(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = (int) ((double) arg2 * Math.pow(0.1D, (double) arg0 * 5.0E-4D) + 0.5D);
		if (Static56.anInt1711 == local18) {
			return;
		}
		Static56.anInt1711 = local18;
		for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
			@Pc(37) int local37 = Static4.method1610(local32);
			this.method1616(local32 + 176, 7, local37 >> 7, arg1);
			this.method1616(local32 + 176, 39, local37 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IJ)V")
	protected final void method1611(@OriginalArg(1) long arg0) {
		@Pc(13) int local13;
		@Pc(19) int local19;
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			local13 = Static57.anIntArray166[local7];
			Static57.anIntArray166[local7] = 0;
			for (local19 = 0; local19 < 16; local19++) {
				if ((0x1 << local19 & local13) != 0) {
					this.method1616(local19 + 144, local7, 0, arg0);
				}
			}
		}
		for (local13 = 0; local13 < 16; local13++) {
			this.method1616(local13 + 176, 123, 0, arg0);
		}
		for (local19 = 0; local19 < 16; local19++) {
			this.method1616(local19 + 176, 120, 0, arg0);
		}
		for (@Pc(84) int local84 = 0; local84 < 16; local84++) {
			this.method1616(local84 + 176, 121, 0, arg0);
		}
		for (@Pc(100) int local100 = 0; local100 < 16; local100++) {
			this.method1616(local100 + 176, 0, 0, arg0);
		}
		for (@Pc(125) int local125 = 0; local125 < 16; local125++) {
			this.method1616(local125 + 176, 32, 0, arg0);
		}
		for (@Pc(141) int local141 = 0; local141 < 16; local141++) {
			this.method1616(local141 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static57.anIntArray166[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static57.anIntArray166[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static57.anIntArray166[arg1] = local14 | local10;
			} else {
				this.method1616(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method1616(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static96.anIntArray263[local10] = 12800;
				local14 = Static4.method1610(local10);
				this.method1616(arg0, 7, local14 >> 7, arg3);
				this.method1616(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static96.anIntArray263[local10] = (Static96.anIntArray263[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static96.anIntArray263[local10] = (Static96.anIntArray263[local10] & 0x3F80) + arg2;
				}
				local14 = Static4.method1610(local10);
				this.method1616(arg0, 7, local14 >> 7, arg3);
				this.method1616(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIJ)V")
	protected abstract void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBJ)V")
	protected final void method1617(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static56.anInt1711 = arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static96.anIntArray263[local9] = 12800;
		}
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			@Pc(34) int local34 = Static4.method1610(local29);
			this.method1616(local29 + 176, 7, local34 >> 7, arg1);
			this.method1616(local29 + 176, 39, local34 & 0x7F, arg1);
		}
	}
}
