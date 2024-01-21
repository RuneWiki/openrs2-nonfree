import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIJ)Z")
	protected final boolean method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		if ((arg0 & 0xF0) == 176) {
			@Pc(17) int local17;
			@Pc(24) int local24;
			if (arg1 == 121) {
				this.method1879(arg0, arg1, arg2, arg3);
				local17 = arg0 & 0xF;
				Static105.anIntArray352[local17] = 12800;
				local24 = Static21.method1874(local17);
				this.method1879(arg0, 7, local24 >> 7, arg3);
				this.method1879(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
			if (arg1 == 7 || arg1 == 39) {
				local17 = arg0 & 0xF;
				if (arg1 == 7) {
					Static105.anIntArray352[local17] = (Static105.anIntArray352[local17] & 0x7F) + (arg2 << 7);
				} else {
					Static105.anIntArray352[local17] = (Static105.anIntArray352[local17] & 0x3F80) + arg2;
				}
				local24 = Static21.method1874(local17);
				this.method1879(arg0, 7, local24 >> 7, arg3);
				this.method1879(arg0, 39, local24 & 0x7F, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIJ)V")
	protected final void method1872(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static105.anInt2810 = arg0;
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			Static105.anIntArray352[local9] = 12800;
		}
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			@Pc(33) int local33 = Static21.method1874(local23);
			this.method1879(local23 + 176, 7, local33 >> 7, arg1);
			this.method1879(local23 + 176, 39, local33 & 0x7F, arg1);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJ)V")
	protected final void method1877(@OriginalArg(1) long arg0) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			this.method1879(local3 + 176, 123, 0, arg0);
		}
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.method1879(local19 + 176, 120, 0, arg0);
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.method1879(local37 + 176, 121, 0, arg0);
		}
		for (@Pc(57) int local57 = 0; local57 < 16; local57++) {
			this.method1879(local57 + 176, 0, 0, arg0);
		}
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			this.method1879(local79 + 176, 32, 0, arg0);
		}
		for (@Pc(97) int local97 = 0; local97 < 16; local97++) {
			this.method1879(local97 + 192, 0, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZJII)V")
	protected final void method1878(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) ((double) arg2 * Math.pow(0.1D, (double) arg1 * 5.0E-4D) + 0.5D);
		if (Static105.anInt2810 == local14) {
			return;
		}
		Static105.anInt2810 = local14;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			@Pc(30) int local30 = Static21.method1874(local25);
			this.method1879(local25 + 176, 7, local30 >> 7, arg0);
			this.method1879(local25 + 176, 39, local30 & 0x7F, arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIJ)V")
	protected abstract void method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3);
}
