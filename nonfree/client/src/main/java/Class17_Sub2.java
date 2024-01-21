import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public abstract class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIJ)V")
	protected abstract void method2012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IJZ)V")
	protected final void method2014(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static101.anInt2260 = arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static60.anIntArray208[local9] = 12800;
		}
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			@Pc(32) int local32 = Static85.method2011(local27);
			this.method2012(local27 + 176, 7, local32 >> 7, arg1);
			this.method2012(local27 + 176, 39, local32 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IIIJ)Z")
	protected final boolean method2015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static105.anIntArray362[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static105.anIntArray362[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static105.anIntArray362[arg1] = local14 | local10;
			} else {
				this.method2012(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method2012(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static60.anIntArray208[local10] = 12800;
				local14 = Static85.method2011(local10);
				this.method2012(arg0, 7, local14 >> 7, arg3);
				this.method2012(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static60.anIntArray208[local10] = (Static60.anIntArray208[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static60.anIntArray208[local10] = (Static60.anIntArray208[local10] & 0x3F80) + arg2;
				}
				local14 = Static85.method2011(local10);
				this.method2012(arg0, 7, local14 >> 7, arg3);
				this.method2012(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)V")
	protected final void method2017(@OriginalArg(1) long arg0) {
		@Pc(13) int local13;
		@Pc(19) int local19;
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			local13 = Static105.anIntArray362[local7];
			Static105.anIntArray362[local7] = 0;
			for (local19 = 0; local19 < 16; local19++) {
				if ((0x1 << local19 & local13) != 0) {
					this.method2012(local19 + 144, local7, 0, arg0);
				}
			}
		}
		for (local13 = 0; local13 < 16; local13++) {
			this.method2012(local13 + 176, 123, 0, arg0);
		}
		for (local19 = 0; local19 < 16; local19++) {
			this.method2012(local19 + 176, 120, 0, arg0);
		}
		for (@Pc(85) int local85 = 0; local85 < 16; local85++) {
			this.method2012(local85 + 176, 121, 0, arg0);
		}
		for (@Pc(103) int local103 = 0; local103 < 16; local103++) {
			this.method2012(local103 + 176, 0, 0, arg0);
		}
		for (@Pc(121) int local121 = 0; local121 < 16; local121++) {
			this.method2012(local121 + 176, 32, 0, arg0);
		}
		for (@Pc(139) int local139 = 0; local139 < 16; local139++) {
			this.method2012(local139 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JBII)V")
	protected final void method2019(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) (Math.pow(0.1D, (double) arg2 * 5.0E-4D) * (double) arg1 + 0.5D);
		if (local14 == Static101.anInt2260) {
			return;
		}
		Static101.anInt2260 = local14;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			@Pc(30) int local30 = Static85.method2011(local25);
			this.method2012(local25 + 176, 7, local30 >> 7, arg0);
			this.method2012(local25 + 176, 39, local30 & 0x7F, arg0);
		}
	}
}
