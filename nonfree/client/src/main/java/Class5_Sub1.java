import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "[I")
	public static int[] anIntArray148 = new int[99];

	static {
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < 99; local26++) {
			@Pc(31) int local31 = local26 + 1;
			@Pc(44) int local44 = (int) (Math.pow(2.0D, (double) local31 / 7.0D) * 300.0D + (double) local31);
			local24 += local44;
			anIntArray148[local26] = local24 / 4;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JIBI)V")
	protected final void method633(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) ((double) arg1 * Math.pow(0.1D, (double) arg2 * 5.0E-4D) + 0.5D);
		if (Static107.anInt2765 == local14) {
			return;
		}
		Static107.anInt2765 = local14;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			@Pc(30) int local30 = Static13.method640(local25);
			this.method634(local25 + 176, 7, local30 >> 7, arg0);
			this.method634(local25 + 176, 39, local30 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIJ)V")
	protected abstract void method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIIJ)Z")
	protected final boolean method635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static8.anIntArray45[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static8.anIntArray45[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static8.anIntArray45[arg1] = local14 | local10;
			} else {
				this.method634(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method634(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static34.anIntArray156[local10] = 12800;
				local14 = Static13.method640(local10);
				this.method634(arg0, 7, local14 >> 7, arg3);
				this.method634(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static34.anIntArray156[local10] = (Static34.anIntArray156[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static34.anIntArray156[local10] = (Static34.anIntArray156[local10] & 0x3F80) + arg2;
				}
				local14 = Static13.method640(local10);
				this.method634(arg0, 7, local14 >> 7, arg3);
				this.method634(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JIB)V")
	protected final void method636(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static107.anInt2765 = arg1;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static34.anIntArray156[local9] = 12800;
		}
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			@Pc(36) int local36 = Static13.method640(local31);
			this.method634(local31 + 176, 7, local36 >> 7, arg0);
			this.method634(local31 + 176, 39, local36 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)V")
	protected final void method638(@OriginalArg(0) long arg0) {
		@Pc(9) int local9;
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			local9 = Static8.anIntArray45[local3];
			Static8.anIntArray45[local3] = 0;
			for (local15 = 0; local15 < 16; local15++) {
				if ((local9 & 0x1 << local15) != 0) {
					this.method634(local15 + 144, local3, 0, arg0);
				}
			}
		}
		for (local9 = 0; local9 < 16; local9++) {
			this.method634(local9 + 176, 123, 0, arg0);
		}
		for (local15 = 0; local15 < 16; local15++) {
			this.method634(local15 + 176, 120, 0, arg0);
		}
		for (@Pc(84) int local84 = 0; local84 < 16; local84++) {
			this.method634(local84 + 176, 121, 0, arg0);
		}
		for (@Pc(101) int local101 = 0; local101 < 16; local101++) {
			this.method634(local101 + 176, 0, 0, arg0);
		}
		for (@Pc(123) int local123 = 0; local123 < 16; local123++) {
			this.method634(local123 + 176, 32, 0, arg0);
		}
		for (@Pc(139) int local139 = 0; local139 < 16; local139++) {
			this.method634(local139 + 192, 0, 0, arg0);
		}
	}
}
