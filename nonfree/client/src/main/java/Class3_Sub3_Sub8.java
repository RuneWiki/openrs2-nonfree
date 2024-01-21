import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class3_Sub3_Sub8 extends Class3_Sub3 {

	@OriginalMember(owner = "client!me", name = "W", descriptor = "I")
	public int anInt1701;

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
	public int anInt1707;

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
	public int anInt1711;

	@OriginalMember(owner = "client!me", name = "ub", descriptor = "I")
	public int anInt1715;

	@OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
	private int anInt1709 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!wd;IBI)V")
	private void method1221(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1709 = arg0.method1424();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLclient!wd;I)V")
	public void method1222(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method1421();
			if (local17 == 0) {
				return;
			}
			this.method1221(arg0, local17, arg1);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	private void method1224(@OriginalArg(1) int arg0) {
		@Pc(8) double local8 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local17;
		@Pc(32) double local32 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local32 < local17) {
			local23 = local32;
		}
		@Pc(40) double local40 = local17;
		if (local17 < local32) {
			local40 = local32;
		}
		if (local8 < local23) {
			local23 = local8;
		}
		@Pc(54) double local54 = 0.0D;
		if (local8 > local40) {
			local40 = local8;
		}
		@Pc(66) double local66 = (local40 + local23) / 2.0D;
		this.anInt1711 = (int) (local66 * 256.0D);
		@Pc(80) double local80 = 0.0D;
		if (this.anInt1711 < 0) {
			this.anInt1711 = 0;
		} else if (this.anInt1711 > 255) {
			this.anInt1711 = 255;
		}
		if (local40 != local23) {
			if (local17 == local40) {
				local54 = (local32 - local8) / (local40 - local23);
			} else if (local40 == local32) {
				local54 = (local8 - local17) / (local40 - local23) + 2.0D;
			} else if (local8 == local40) {
				local54 = (local17 - local32) / (local40 - local23) + 4.0D;
			}
			if (local66 < 0.5D) {
				local80 = (local40 - local23) / (local23 + local40);
			}
			if (local66 >= 0.5D) {
				local80 = (local40 - local23) / ((2.0D - local40) - local23);
			}
		}
		local54 /= 6.0D;
		if (local66 > 0.5D) {
			this.anInt1715 = (int) (local80 * (1.0D - local66) * 512.0D);
		} else {
			this.anInt1715 = (int) (local66 * local80 * 512.0D);
		}
		this.anInt1707 = (int) (local80 * 256.0D);
		if (this.anInt1715 < 1) {
			this.anInt1715 = 1;
		}
		this.anInt1701 = (int) ((double) this.anInt1715 * local54);
		if (this.anInt1707 < 0) {
			this.anInt1707 = 0;
		} else if (this.anInt1707 > 255) {
			this.anInt1707 = 255;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
	public void method1225() {
		this.method1224(this.anInt1709);
	}
}
