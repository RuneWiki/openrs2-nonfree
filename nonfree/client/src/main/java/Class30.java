import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class30 {

	@OriginalMember(owner = "client!k", name = "g", descriptor = "[I")
	private final int[] anIntArray185;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "([I)V")
	public Class30(@OriginalArg(0) int[] arg0) {
		@Pc(3) int local3;
		for (local3 = 1; local3 <= (arg0.length >> 1) + arg0.length; local3 <<= 0x1) {
		}
		this.anIntArray185 = new int[local3 + local3];
		for (@Pc(26) int local26 = 0; local26 < local3 + local3; local26++) {
			this.anIntArray185[local26] = -1;
		}
		@Pc(40) int local40 = 0;
		while (local40 < arg0.length) {
			@Pc(49) int local49;
			for (local49 = local3 - 1 & arg0[local40]; this.anIntArray185[local49 + local49 + 1] != -1; local49 = local49 + 1 & local3 + -1) {
			}
			this.anIntArray185[local49 + local49] = arg0[local40];
			this.anIntArray185[local49 + local49 + 1] = local40++;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I")
	public int method989(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = this.anIntArray185.length - 2;
		@Pc(15) int local15 = local9 & arg0 << 1;
		while (true) {
			@Pc(20) int local20 = this.anIntArray185[local15];
			if (local20 == arg0) {
				return this.anIntArray185[local15 + 1];
			}
			if (local20 == -1) {
				return -1;
			}
			local15 = local9 & local15 + 2;
		}
	}
}
