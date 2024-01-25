import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class146 {

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
	public int anInt4196;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	public int anInt4199;

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
	public int anInt4201;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
	public int anInt4204;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
	private int anInt4197 = 0;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public int anInt4198 = -1;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	public int anInt4195 = 512;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "Z")
	public boolean aBoolean301 = true;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILclient!ge;)V")
	private void method3730(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt4197 = arg1.method3920();
			this.method3732(this.anInt4197);
		} else if (arg0 == 2) {
			this.anInt4198 = arg1.method3967();
			if (this.anInt4198 == 65535) {
				this.anInt4198 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4195 = arg1.method3967() << 2;
		} else if (arg0 == 4) {
			this.aBoolean301 = false;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method3731(@OriginalArg(0) Class1_Sub6 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3922();
			if (local16 == 0) {
				return;
			}
			this.method3730(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V")
	private void method3732(@OriginalArg(0) int arg0) {
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(39) double local39 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(41) double local41 = local23;
		if (local32 < local23) {
			local41 = local32;
		}
		if (local39 < local41) {
			local41 = local39;
		}
		@Pc(55) double local55 = local23;
		if (local23 < local32) {
			local55 = local32;
		}
		if (local39 > local55) {
			local55 = local39;
		}
		@Pc(69) double local69 = 0.0D;
		@Pc(71) double local71 = 0.0D;
		@Pc(77) double local77 = (local41 + local55) / 2.0D;
		if (local55 != local41) {
			if (local77 < 0.5D) {
				local71 = (local55 - local41) / (local41 + local55);
			}
			if (local55 == local23) {
				local69 = (local32 - local39) / (local55 - local41);
			} else if (local55 == local32) {
				local69 = (local39 - local23) / (local55 - local41) + 2.0D;
			} else if (local39 == local55) {
				local69 = (local23 - local32) / (-local41 + local55) + 4.0D;
			}
			if (local77 >= 0.5D) {
				local71 = (local55 - local41) / (2.0D - local55 - local41);
			}
		}
		this.anInt4204 = (int) (local77 * 256.0D);
		local69 /= 6.0D;
		this.anInt4201 = (int) (local71 * 256.0D);
		if (this.anInt4204 < 0) {
			this.anInt4204 = 0;
		} else if (this.anInt4204 > 255) {
			this.anInt4204 = 255;
		}
		if (this.anInt4201 < 0) {
			this.anInt4201 = 0;
		} else if (this.anInt4201 > 255) {
			this.anInt4201 = 255;
		}
		if (local77 > 0.5D) {
			this.anInt4199 = (int) ((1.0D - local77) * local71 * 512.0D);
		} else {
			this.anInt4199 = (int) (local77 * 512.0D * local71);
		}
		if (this.anInt4199 < 1) {
			this.anInt4199 = 1;
		}
		this.anInt4196 = (int) ((double) this.anInt4199 * local69);
	}
}
