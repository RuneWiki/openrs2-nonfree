import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public abstract class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static38.anIntArray124[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static38.anIntArray124[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static38.anIntArray124[arg1] = local14 | local10;
			} else {
				this.method779(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method779(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static82.anIntArray227[local10] = 12800;
				local14 = Static31.method780(local10);
				this.method779(arg0, 7, local14 >> 7, arg3);
				this.method779(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static82.anIntArray227[local10] = (Static82.anIntArray227[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static82.anIntArray227[local10] = (Static82.anIntArray227[local10] & 0x3F80) + arg2;
				}
				local14 = Static31.method780(local10);
				this.method779(arg0, 7, local14 >> 7, arg3);
				this.method779(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JZI)V")
	protected final void method775(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static50.anInt1355 = arg1;
		for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
			Static82.anIntArray227[local14] = 12800;
		}
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			@Pc(33) int local33 = Static31.method780(local28);
			this.method779(local28 + 176, 7, local33 >> 7, arg0);
			this.method779(local28 + 176, 39, local33 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V")
	protected final void method776(@OriginalArg(0) long arg0) {
		@Pc(9) int local9;
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			local9 = Static38.anIntArray124[local3];
			Static38.anIntArray124[local3] = 0;
			for (local15 = 0; local15 < 16; local15++) {
				if ((0x1 << local15 & local9) != 0) {
					this.method779(local15 + 144, local3, 0, arg0);
				}
			}
		}
		for (local9 = 0; local9 < 16; local9++) {
			this.method779(local9 + 176, 123, 0, arg0);
		}
		for (local15 = 0; local15 < 16; local15++) {
			this.method779(local15 + 176, 120, 0, arg0);
		}
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			this.method779(local79 + 176, 121, 0, arg0);
		}
		for (@Pc(97) int local97 = 0; local97 < 16; local97++) {
			this.method779(local97 + 176, 0, 0, arg0);
		}
		for (@Pc(116) int local116 = 0; local116 < 16; local116++) {
			this.method779(local116 + 176, 32, 0, arg0);
		}
		for (@Pc(132) int local132 = 0; local132 < 16; local132++) {
			this.method779(local132 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIIJ)V")
	protected abstract void method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BIJI)V")
	protected final void method782(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) (Math.pow(0.1D, (double) arg0 * 5.0E-4D) * (double) arg2 + 0.5D);
		if (Static50.anInt1355 == local14) {
			return;
		}
		Static50.anInt1355 = local14;
		for (@Pc(30) int local30 = 0; local30 < 16; local30++) {
			@Pc(35) int local35 = Static31.method780(local30);
			this.method779(local30 + 176, 7, local35 >> 7, arg1);
			this.method779(local30 + 176, 39, local35 & 0x7F, arg1);
		}
	}
}
