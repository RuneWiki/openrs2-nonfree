import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIJ)V")
	protected abstract void method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JIII)V")
	protected final void method1116(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = (int) ((double) arg1 * Math.pow(0.1D, (double) arg2 * 5.0E-4D) + 0.5D);
		if (Static56.anInt1732 == local27) {
			return;
		}
		Static56.anInt1732 = local27;
		for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
			@Pc(39) int local39 = Static74.method1117(local34);
			this.method1115(local34 + 176, 7, local39 >> 7, arg0);
			this.method1115(local34 + 176, 39, local39 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(JB)V")
	protected final void method1118(@OriginalArg(0) long arg0) {
		@Pc(9) int local9;
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			local9 = Static77.anIntArray241[local3];
			Static77.anIntArray241[local3] = 0;
			for (local15 = 0; local15 < 16; local15++) {
				if ((local9 & 0x1 << local15) != 0) {
					this.method1115(local15 + 144, local3, 0, arg0);
				}
			}
		}
		for (local9 = 0; local9 < 16; local9++) {
			this.method1115(local9 + 176, 123, 0, arg0);
		}
		for (local15 = 0; local15 < 16; local15++) {
			this.method1115(local15 + 176, 120, 0, arg0);
		}
		for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
			this.method1115(local85 + 176, 121, 0, arg0);
		}
		for (@Pc(101) int local101 = 0; local101 < 16; local101++) {
			this.method1115(local101 + 176, 0, 0, arg0);
		}
		for (@Pc(122) int local122 = 0; local122 < 16; local122++) {
			this.method1115(local122 + 176, 32, 0, arg0);
		}
		for (@Pc(139) int local139 = 0; local139 < 16; local139++) {
			this.method1115(local139 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIIJ)Z")
	protected final boolean method1119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static77.anIntArray241[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static77.anIntArray241[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static77.anIntArray241[arg1] = local14 | local10;
			} else {
				this.method1115(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method1115(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static27.anIntArray125[local10] = 12800;
				local14 = Static74.method1117(local10);
				this.method1115(arg0, 7, local14 >> 7, arg3);
				this.method1115(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static27.anIntArray125[local10] = (Static27.anIntArray125[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static27.anIntArray125[local10] = (Static27.anIntArray125[local10] & 0x3F80) + arg2;
				}
				local14 = Static74.method1117(local10);
				this.method1115(arg0, 7, local14 >> 7, arg3);
				this.method1115(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJI)V")
	protected final void method1121(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static56.anInt1732 = arg1;
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static27.anIntArray125[local5] = 12800;
		}
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			@Pc(22) int local22 = Static74.method1117(local17);
			this.method1115(local17 + 176, 7, local22 >> 7, arg0);
			this.method1115(local17 + 176, 39, local22 & 0x7F, arg0);
		}
	}
}
