import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public abstract class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIJ)V")
	protected abstract void method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIJ)Z")
	protected final boolean method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		if ((arg0 & 0xE0) == 128) {
			local10 = 0x1 << (arg0 & 0xF);
			local14 = Static17.anIntArray46[arg1];
			if (arg0 < 144 || arg2 == 0) {
				Static17.anIntArray46[arg1] = local14 & ~local10;
			} else if ((local14 & local10) == 0) {
				Static17.anIntArray46[arg1] = local14 | local10;
			} else {
				this.method1430(arg0, arg1, 0, arg3);
			}
			return false;
		}
		if ((arg0 & 0xF0) == 176) {
			if (arg1 == 121) {
				this.method1430(arg0, arg1, arg2, arg3);
				local10 = arg0 & 0xF;
				Static20.anIntArray51[local10] = 12800;
				local14 = Static72.method1436(local10);
				this.method1430(arg0, 7, local14 >> 7, arg3);
				this.method1430(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local10 = arg0 & 0xF;
				if (arg1 == 7) {
					Static20.anIntArray51[local10] = (Static20.anIntArray51[local10] & 0x7F) + (arg2 << 7);
				} else {
					Static20.anIntArray51[local10] = (Static20.anIntArray51[local10] & 0x3F80) + arg2;
				}
				local14 = Static72.method1436(local10);
				this.method1430(arg0, 7, local14 >> 7, arg3);
				this.method1430(arg0, 39, local14 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(JIII)V")
	protected final void method1433(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) int local21 = (int) (Math.pow(0.1D, (double) arg2 * 5.0E-4D) * (double) arg1 + 0.5D);
		if (Static49.anInt1251 == local21) {
			return;
		}
		Static49.anInt1251 = local21;
		for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
			@Pc(37) int local37 = Static72.method1436(local32);
			this.method1430(local32 + 176, 7, local37 >> 7, arg0);
			this.method1430(local32 + 176, 39, local37 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(JI)V")
	protected final void method1434(@OriginalArg(0) long arg0) {
		@Pc(10) int local10;
		@Pc(16) int local16;
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			local10 = Static17.anIntArray46[local5];
			Static17.anIntArray46[local5] = 0;
			for (local16 = 0; local16 < 16; local16++) {
				if ((local10 & 0x1 << local16) != 0) {
					this.method1430(local16 + 144, local5, 0, arg0);
				}
			}
		}
		for (local10 = 0; local10 < 16; local10++) {
			this.method1430(local10 + 176, 123, 0, arg0);
		}
		for (local16 = 0; local16 < 16; local16++) {
			this.method1430(local16 + 176, 120, 0, arg0);
		}
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			this.method1430(local77 + 176, 121, 0, arg0);
		}
		for (@Pc(93) int local93 = 0; local93 < 16; local93++) {
			this.method1430(local93 + 176, 0, 0, arg0);
		}
		for (@Pc(108) int local108 = 0; local108 < 16; local108++) {
			this.method1430(local108 + 176, 32, 0, arg0);
		}
		for (@Pc(123) int local123 = 0; local123 < 16; local123++) {
			this.method1430(local123 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBJ)V")
	protected final void method1439(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static49.anInt1251 = arg0;
		for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
			Static20.anIntArray51[local14] = 12800;
		}
		for (@Pc(26) int local26 = 0; local26 < 16; local26++) {
			@Pc(31) int local31 = Static72.method1436(local26);
			this.method1430(local26 + 176, 7, local31 >> 7, arg1);
			this.method1430(local26 + 176, 39, local31 & 0x7F, arg1);
		}
	}
}
