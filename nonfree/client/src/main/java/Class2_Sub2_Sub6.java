import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!df", name = "W", descriptor = "I")
	public int anInt966;

	@OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
	public int anInt967;

	@OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
	public int anInt969;

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
	public int anInt971;

	@OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
	private int anInt972 = 0;

	@OriginalMember(owner = "client!df", name = "jb", descriptor = "I")
	private int anInt974 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!oa;B)V")
	private void method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub18 arg2) {
		if (arg1 == 1) {
			this.anInt972 = arg2.method2341();
		} else if (arg1 == 2) {
			this.anInt974 = arg2.method2353();
			if (this.anInt974 == 65535) {
				this.anInt974 = -1;
			}
		} else if (arg1 == 3) {
			arg2.method2353();
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(II)V")
	private void method670(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = local19;
		if (local19 > local10) {
			local21 = local10;
		}
		@Pc(33) double local33 = local19;
		@Pc(40) double local40 = (double) (arg0 & 0xFF) / 256.0D;
		if (local40 < local21) {
			local21 = local40;
		}
		@Pc(48) double local48 = 0.0D;
		@Pc(50) double local50 = 0.0D;
		if (local19 < local10) {
			local33 = local10;
		}
		if (local33 < local40) {
			local33 = local40;
		}
		@Pc(68) double local68 = (local21 + local33) / 2.0D;
		if (local21 != local33) {
			if (local68 < 0.5D) {
				local50 = (local33 - local21) / (local21 + local33);
			}
			if (local68 >= 0.5D) {
				local50 = (local33 - local21) / (2.0D - local33 - local21);
			}
			if (local19 == local33) {
				local48 = (local10 - local40) / (-local21 + local33);
			} else if (local10 == local33) {
				local48 = (local40 - local19) / (local33 - local21) + 2.0D;
			} else if (local33 == local40) {
				local48 = (local19 - local10) / (-local21 + local33) + 4.0D;
			}
		}
		if (local68 > 0.5D) {
			this.anInt969 = (int) ((1.0D - local68) * local50 * 512.0D);
		} else {
			this.anInt969 = (int) (local68 * local50 * 512.0D);
		}
		this.anInt967 = (int) (local68 * 256.0D);
		if (this.anInt967 < 0) {
			this.anInt967 = 0;
		} else if (this.anInt967 > 255) {
			this.anInt967 = 255;
		}
		if (this.anInt969 < 1) {
			this.anInt969 = 1;
		}
		this.anInt966 = (int) (local50 * 256.0D);
		local48 /= 6.0D;
		this.anInt971 = (int) ((double) this.anInt969 * local48);
		if (this.anInt966 < 0) {
			this.anInt966 = 0;
		} else if (this.anInt966 > 255) {
			this.anInt966 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZLclient!oa;I)V")
	public void method672(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2387();
			if (local9 == 0) {
				return;
			}
			this.method669(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public void method673() {
		this.method670(this.anInt972);
		Static83.method1517(this.anInt971 * 256 / this.anInt969, this.anInt967, this.anInt966);
	}
}
