import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
	public int anInt1814;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
	public int anInt1815;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
	public int anInt1816;

	@OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
	public int anInt1825;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
	private int anInt1817 = 0;

	@OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
	private int anInt1822 = -1;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILclient!va;I)V")
	private void method1281(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1817 = arg1.method1436();
		} else if (arg2 == 2) {
			this.anInt1822 = arg1.method1456();
			if (this.anInt1822 == 65535) {
				this.anInt1822 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
	public void method1284() {
		this.method1285(this.anInt1817);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	private void method1285(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local14 > local23) {
			local34 = local23;
		}
		if (local14 < local23) {
			local32 = local23;
		}
		if (local30 > local32) {
			local32 = local30;
		}
		if (local34 > local30) {
			local34 = local30;
		}
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local32 + local34) / 2.0D;
		if (local32 != local34) {
			if (local72 < 0.5D) {
				local66 = (local32 - local34) / (local34 + local32);
			}
			if (local72 >= 0.5D) {
				local66 = (local32 - local34) / ((2.0D - local32) - local34);
			}
			if (local32 == local14) {
				local64 = (local23 - local30) / (local32 - local34);
			} else if (local32 == local23) {
				local64 = (local30 - local14) / (local32 - local34) + 2.0D;
			} else if (local30 == local32) {
				local64 = (local14 - local23) / (local32 - local34) + 4.0D;
			}
		}
		this.anInt1814 = (int) (local72 * 256.0D);
		if (this.anInt1814 < 0) {
			this.anInt1814 = 0;
		} else if (this.anInt1814 > 255) {
			this.anInt1814 = 255;
		}
		this.anInt1815 = (int) (local66 * 256.0D);
		local64 /= 6.0D;
		if (this.anInt1815 < 0) {
			this.anInt1815 = 0;
		} else if (this.anInt1815 > 255) {
			this.anInt1815 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt1816 = (int) (local66 * 512.0D * (1.0D - local72));
		} else {
			this.anInt1816 = (int) (local72 * local66 * 512.0D);
		}
		if (this.anInt1816 < 1) {
			this.anInt1816 = 1;
		}
		this.anInt1825 = (int) (local64 * (double) this.anInt1816);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!va;I)V")
	public void method1286(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.method1461();
			if (local18 == 0) {
				return;
			}
			this.method1281(arg1, arg0, local18);
		}
	}
}
