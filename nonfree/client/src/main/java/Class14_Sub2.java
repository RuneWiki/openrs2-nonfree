import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public abstract class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIJ)V")
	protected final void method1559(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static3.anInt158 = arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static60.anIntArray246[local9] = 12800;
		}
		for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
			@Pc(37) int local37 = Static99.method1565(local32);
			this.method1564(local32 + 176, 7, local37 >> 7, arg1);
			this.method1564(local32 + 176, 39, local37 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(JBII)V")
	protected final void method1560(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = (int) ((double) arg2 * Math.pow(0.1D, (double) arg1 * 5.0E-4D) + 0.5D);
		if (local18 == Static3.anInt158) {
			return;
		}
		Static3.anInt158 = local18;
		for (@Pc(30) int local30 = 0; local30 < 16; local30++) {
			@Pc(35) int local35 = Static99.method1565(local30);
			this.method1564(local30 + 176, 7, local35 >> 7, arg0);
			this.method1564(local30 + 176, 39, local35 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(JZ)V")
	protected final void method1561(@OriginalArg(0) long arg0) {
		@Pc(9) int local9;
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			local9 = Static97.anIntArray399[local3];
			Static97.anIntArray399[local3] = 0;
			for (local15 = 0; local15 < 16; local15++) {
				if ((0x1 << local15 & local9) != 0) {
					this.method1564(local15 + 144, local3, 0, arg0);
				}
			}
		}
		for (local9 = 0; local9 < 16; local9++) {
			this.method1564(local9 + 176, 123, 0, arg0);
		}
		for (local15 = 0; local15 < 16; local15++) {
			this.method1564(local15 + 176, 120, 0, arg0);
		}
		for (@Pc(84) int local84 = 0; local84 < 16; local84++) {
			this.method1564(local84 + 176, 121, 0, arg0);
		}
		for (@Pc(100) int local100 = 0; local100 < 16; local100++) {
			this.method1564(local100 + 176, 0, 0, arg0);
		}
		for (@Pc(118) int local118 = 0; local118 < 16; local118++) {
			this.method1564(local118 + 176, 32, 0, arg0);
		}
		for (@Pc(137) int local137 = 0; local137 < 16; local137++) {
			this.method1564(local137 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method1563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static97.anIntArray399[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static97.anIntArray399[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static97.anIntArray399[arg1] = local14 | local10;
			} else {
				this.method1564(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method1564(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static60.anIntArray246[local10] = 12800;
				local14 = Static99.method1565(local10);
				this.method1564(arg0, 7, local14 >> 7, arg3);
				this.method1564(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static60.anIntArray246[local10] = (Static60.anIntArray246[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static60.anIntArray246[local10] = (Static60.anIntArray246[local10] & 0x3F80) + arg2;
				}
				local14 = Static99.method1565(local10);
				this.method1564(arg0, 7, local14 >> 7, arg3);
				this.method1564(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIIJ)V")
	protected abstract void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);
}
