import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JBI)V")
	protected final void method534(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static8.anInt285 = arg1;
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static3.anIntArray4[local5] = 12800;
		}
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			@Pc(28) int local28 = Static40.method535(local23);
			this.method541(local23 + 176, 7, local28 >> 7, arg0);
			this.method541(local23 + 176, 39, local28 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZJ)V")
	protected final void method536(@OriginalArg(1) long arg0) {
		@Pc(9) int local9;
		@Pc(15) int local15;
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			local9 = Static76.anIntArray231[local3];
			Static76.anIntArray231[local3] = 0;
			for (local15 = 0; local15 < 16; local15++) {
				if ((0x1 << local15 & local9) != 0) {
					this.method541(local15 + 144, local3, 0, arg0);
				}
			}
		}
		for (local9 = 0; local9 < 16; local9++) {
			this.method541(local9 + 176, 123, 0, arg0);
		}
		for (local15 = 0; local15 < 16; local15++) {
			this.method541(local15 + 176, 120, 0, arg0);
		}
		for (@Pc(88) int local88 = 0; local88 < 16; local88++) {
			this.method541(local88 + 176, 121, 0, arg0);
		}
		for (@Pc(106) int local106 = 0; local106 < 16; local106++) {
			this.method541(local106 + 176, 0, 0, arg0);
		}
		for (@Pc(124) int local124 = 0; local124 < 16; local124++) {
			this.method541(local124 + 176, 32, 0, arg0);
		}
		for (@Pc(141) int local141 = 0; local141 < 16; local141++) {
			this.method541(local141 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIJI)V")
	protected final void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		@Pc(20) int local20 = (int) (Math.pow(0.1D, (double) arg1 * 5.0E-4D) * (double) arg0 + 0.5D);
		if (Static8.anInt285 == local20) {
			return;
		}
		Static8.anInt285 = local20;
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			@Pc(40) int local40 = Static40.method535(local35);
			this.method541(local35 + 176, 7, local40 >> 7, arg2);
			this.method541(local35 + 176, 39, local40 & 0x7F, arg2);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static76.anIntArray231[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static76.anIntArray231[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static76.anIntArray231[arg1] = local14 | local10;
			} else {
				this.method541(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method541(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static3.anIntArray4[local10] = 12800;
				local14 = Static40.method535(local10);
				this.method541(arg0, 7, local14 >> 7, arg3);
				this.method541(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static3.anIntArray4[local10] = (Static3.anIntArray4[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static3.anIntArray4[local10] = (Static3.anIntArray4[local10] & 0x3F80) + arg2;
				}
				local14 = Static40.method535(local10);
				this.method541(arg0, 7, local14 >> 7, arg3);
				this.method541(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIIJ)V")
	protected abstract void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);
}
