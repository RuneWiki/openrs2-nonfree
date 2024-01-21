import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "[I")
	public static int[] anIntArray143 = new int[32];

	static {
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			anIntArray143[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIJI)V")
	protected final void method800(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(23) int local23 = (int) ((double) arg0 * Math.pow(0.1D, (double) arg2 * 5.0E-4D) + 0.5D);
		if (Static57.anInt2683 == local23) {
			return;
		}
		Static57.anInt2683 = local23;
		for (@Pc(30) int local30 = 0; local30 < 16; local30++) {
			@Pc(35) int local35 = Static98.method806(local30);
			this.method804(local30 + 176, 7, local35 >> 7, arg1);
			this.method804(local30 + 176, 39, local35 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IJ)V")
	protected final void method802(@OriginalArg(1) long arg0) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			this.method804(local7 + 176, 123, 0, arg0);
		}
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			this.method804(local25 + 176, 120, 0, arg0);
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.method804(local43 + 176, 121, 0, arg0);
		}
		for (@Pc(61) int local61 = 0; local61 < 16; local61++) {
			this.method804(local61 + 176, 0, 0, arg0);
		}
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			this.method804(local79 + 176, 32, 0, arg0);
		}
		for (@Pc(104) int local104 = 0; local104 < 16; local104++) {
			this.method804(local104 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		if ((arg0 & 0xF0) == 176) {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (arg1 == 121) {
				this.method804(arg0, arg1, arg2, arg3);
				local17 = arg0 & 0xF;
				Static37.anIntArray226[local17] = 12800;
				local24 = Static98.method806(local17);
				this.method804(arg0, 7, local24 >> 7, arg3);
				this.method804(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local17 = arg0 & 0xF;
				if (arg1 == 7) {
					Static37.anIntArray226[local17] = (Static37.anIntArray226[local17] & 0x7F) + (arg2 << 7);
				} else {
					Static37.anIntArray226[local17] = (Static37.anIntArray226[local17] & 0x3F80) + arg2;
				}
				local24 = Static98.method806(local17);
				this.method804(arg0, 7, local24 >> 7, arg3);
				this.method804(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIIJ)V")
	protected abstract void method804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IJ)V")
	protected final void method805(@OriginalArg(1) long arg0) {
		Static57.anInt2683 = 256;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static37.anIntArray226[local9] = 12800;
		}
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			this.method804(local25 + 176, 7, 100, arg0);
			this.method804(local25 + 176, 39, 0, arg0);
		}
	}
}
