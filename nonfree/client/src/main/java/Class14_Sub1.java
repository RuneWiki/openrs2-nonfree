import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public abstract class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIJ)V")
	protected abstract void method1086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIJI)V")
	protected final void method1089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		@Pc(14) int local14 = (int) ((double) arg0 * Math.pow(0.1D, (double) arg1 * 5.0E-4D) + 0.5D);
		if (Static73.anInt1984 == local14) {
			return;
		}
		Static73.anInt1984 = local14;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			@Pc(30) int local30 = Static104.method1095(local25);
			this.method1086(local25 + 176, 7, local30 >> 7, arg2);
			this.method1086(local25 + 176, 39, local30 & 0x7F, arg2);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJI)V")
	protected final void method1090(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static73.anInt1984 = arg1;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static59.anIntArray195[local9] = 12800;
		}
		for (@Pc(26) int local26 = 0; local26 < 16; local26++) {
			@Pc(31) int local31 = Static104.method1095(local26);
			this.method1086(local26 + 176, 7, local31 >> 7, arg0);
			this.method1086(local26 + 176, 39, local31 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BJ)V")
	protected final void method1093(@OriginalArg(1) long arg0) {
		@Pc(9) int local9;
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			local9 = Static66.anIntArray291[local3];
			Static66.anIntArray291[local3] = 0;
			for (local15 = 0; local15 < 16; local15++) {
				if ((local9 & 0x1 << local15) != 0) {
					this.method1086(local15 + 144, local3, 0, arg0);
				}
			}
		}
		for (local9 = 0; local9 < 16; local9++) {
			this.method1086(local9 + 176, 123, 0, arg0);
		}
		for (local15 = 0; local15 < 16; local15++) {
			this.method1086(local15 + 176, 120, 0, arg0);
		}
		for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
			this.method1086(local85 + 176, 121, 0, arg0);
		}
		for (@Pc(103) int local103 = 0; local103 < 16; local103++) {
			this.method1086(local103 + 176, 0, 0, arg0);
		}
		for (@Pc(125) int local125 = 0; local125 < 16; local125++) {
			this.method1086(local125 + 176, 32, 0, arg0);
		}
		for (@Pc(141) int local141 = 0; local141 < 16; local141++) {
			this.method1086(local141 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIJ)Z")
	protected final boolean method1094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static66.anIntArray291[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static66.anIntArray291[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static66.anIntArray291[arg1] = local14 | local10;
			} else {
				this.method1086(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method1086(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static59.anIntArray195[local10] = 12800;
				local14 = Static104.method1095(local10);
				this.method1086(arg0, 7, local14 >> 7, arg3);
				this.method1086(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static59.anIntArray195[local10] = (Static59.anIntArray195[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static59.anIntArray195[local10] = (Static59.anIntArray195[local10] & 0x3F80) + arg2;
				}
				local14 = Static104.method1095(local10);
				this.method1086(arg0, 7, local14 >> 7, arg3);
				this.method1086(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}
}
