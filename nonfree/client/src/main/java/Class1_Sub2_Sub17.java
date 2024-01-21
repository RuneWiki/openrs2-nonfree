import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class1_Sub2_Sub17 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
	public int anInt3613;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
	public int anInt3616;

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
	public int anInt3617;

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
	public int anInt3622;

	@OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
	private int anInt3618 = -1;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	private int anInt3615 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	private void method2612(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		if (local23 < local14) {
			local25 = local23;
		}
		@Pc(40) double local40 = local14;
		if (local14 < local23) {
			local40 = local23;
		}
		if (local32 < local25) {
			local25 = local32;
		}
		if (local32 > local40) {
			local40 = local32;
		}
		@Pc(61) double local61 = (double) 0;
		@Pc(63) double local63 = 0.0D;
		@Pc(69) double local69 = (local40 + local25) / 2.0D;
		this.anInt3617 = (int) (local69 * 256.0D);
		if (this.anInt3617 < 0) {
			this.anInt3617 = 0;
		} else if (this.anInt3617 > 255) {
			this.anInt3617 = 255;
		}
		if (local25 != local40) {
			if (local40 == local14) {
				local61 = (local23 - local32) / (local40 - local25);
			} else if (local23 == local40) {
				local61 = (local32 - local14) / (-local25 + local40) + 2.0D;
			} else if (local40 == local32) {
				local61 = (local14 - local23) / (local40 - local25) + 4.0D;
			}
			if (local69 < 0.5D) {
				local63 = (local40 - local25) / (local25 + local40);
			}
			if (local69 >= 0.5D) {
				local63 = (local40 - local25) / (2.0D - local25 - local40);
			}
		}
		this.anInt3613 = (int) (local63 * 256.0D);
		local61 /= 6.0D;
		if (local69 > 0.5D) {
			this.anInt3616 = (int) ((1.0D - local69) * 512.0D * local63);
		} else {
			this.anInt3616 = (int) (local69 * local63 * 512.0D);
		}
		if (this.anInt3616 < 1) {
			this.anInt3616 = 1;
		}
		this.anInt3622 = (int) (local61 * (double) this.anInt3616);
		if (this.anInt3613 < 0) {
			this.anInt3613 = 0;
		} else if (this.anInt3613 > 255) {
			this.anInt3613 = 255;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILclient!ce;B)V")
	private void method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub8 arg2) {
		if (arg0 == 1) {
			this.anInt3615 = arg2.method1618();
			this.method2612(this.anInt3615);
		} else if (arg0 == 2) {
			this.anInt3618 = arg2.method1642();
			if (this.anInt3618 != 65535) {
				return;
			}
			this.anInt3618 = -1;
		} else if (arg0 == 3) {
			arg2.method1642();
			return;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ce;II)V")
	public void method2615(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1607();
			if (local5 == 0) {
				return;
			}
			this.method2614(local5, arg1, arg0);
		}
	}
}
