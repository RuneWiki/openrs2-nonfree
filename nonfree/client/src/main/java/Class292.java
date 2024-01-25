import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class292 {

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public int anInt8523;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	public int anInt8525;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
	public int anInt8527;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
	public int anInt8528;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
	public int anInt8521 = 512;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	private int anInt8522 = 0;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "Z")
	public boolean aBoolean603 = true;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Z")
	public boolean aBoolean604 = true;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	public int anInt8524 = -1;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	private void method6977(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(54) double local54 = local14;
		if (local14 < local23) {
			local54 = local23;
		}
		if (local30 > local54) {
			local54 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local32) / 2.0D;
		if (local54 != local32) {
			if (local76 < 0.5D) {
				local70 = (local54 - local32) / (local54 + local32);
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local32) / (2.0D - local54 - local32);
			}
			if (local54 == local14) {
				local68 = (local23 - local30) / (local54 - local32);
			} else if (local54 == local23) {
				local68 = (local30 - local14) / (local54 - local32) + 2.0D;
			} else if (local54 == local30) {
				local68 = (local14 - local23) / (local54 - local32) + 4.0D;
			}
		}
		local68 /= 6.0D;
		this.anInt8525 = (int) (local76 * 256.0D);
		this.anInt8527 = (int) (local70 * 256.0D);
		if (this.anInt8527 < 0) {
			this.anInt8527 = 0;
		} else if (this.anInt8527 > 255) {
			this.anInt8527 = 255;
		}
		if (this.anInt8525 < 0) {
			this.anInt8525 = 0;
		} else if (this.anInt8525 > 255) {
			this.anInt8525 = 255;
		}
		if (local76 > 0.5D) {
			this.anInt8528 = (int) (local70 * (1.0D - local76) * 512.0D);
		} else {
			this.anInt8528 = (int) (local70 * local76 * 512.0D);
		}
		if (this.anInt8528 < 1) {
			this.anInt8528 = 1;
		}
		this.anInt8523 = (int) (local68 * (double) this.anInt8528);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLclient!un;)V")
	public void method6979(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4905();
			if (local7 == 0) {
				return;
			}
			this.method6980(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!un;I)V")
	private void method6980(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8522 = arg0.method4934();
			this.method6977(this.anInt8522);
		} else if (arg1 == 2) {
			this.anInt8524 = arg0.method4936();
			if (this.anInt8524 == 65535) {
				this.anInt8524 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt8521 = arg0.method4936() << 2;
		} else if (arg1 == 4) {
			this.aBoolean604 = false;
			return;
		} else if (arg1 == 5) {
			this.aBoolean603 = false;
			return;
		}
	}
}
