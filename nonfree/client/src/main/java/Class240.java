import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class240 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
	public int anInt7325;

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
	public int anInt7326;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
	public int anInt7328;

	@OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
	public int anInt7335;

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
	private int anInt7327 = 0;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "Z")
	public boolean aBoolean545 = true;

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
	public int anInt7333 = -1;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Z")
	public boolean aBoolean546 = true;

	@OriginalMember(owner = "client!naa", name = "m", descriptor = "I")
	public int anInt7334 = 512;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILclient!ol;)V")
	private void method6530(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt7327 = arg1.method5161();
			this.method6532(this.anInt7327);
		} else if (arg0 == 2) {
			this.anInt7333 = arg1.method5211();
			if (this.anInt7333 == 65535) {
				this.anInt7333 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt7334 = arg1.method5211() << 2;
		} else if (arg0 == 4) {
			this.aBoolean546 = false;
		} else if (arg0 == 5) {
			this.aBoolean545 = false;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLclient!ol;)V")
	public void method6531(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5203();
			if (local9 == 0) {
				return;
			}
			this.method6530(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)V")
	private void method6532(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(37) double local37 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(39) double local39 = local14;
		if (local14 > local23) {
			local39 = local23;
		}
		if (local39 > local37) {
			local39 = local37;
		}
		@Pc(53) double local53 = local14;
		if (local14 < local23) {
			local53 = local23;
		}
		if (local37 > local53) {
			local53 = local37;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local53 + local39) / 2.0D;
		if (local53 != local39) {
			if (local75 < 0.5D) {
				local69 = (local53 - local39) / (local53 + local39);
			}
			if (local53 == local14) {
				local67 = (local23 - local37) / (local53 - local39);
			} else if (local23 == local53) {
				local67 = (local37 - local14) / (local53 - local39) + 2.0D;
			} else if (local53 == local37) {
				local67 = (local14 - local23) / (-local39 + local53) + 4.0D;
			}
			if (local75 >= 0.5D) {
				local69 = (local53 - local39) / ((2.0D - local53) - local39);
			}
		}
		local67 /= 6.0D;
		this.anInt7328 = (int) (local75 * 256.0D);
		this.anInt7325 = (int) (local69 * 256.0D);
		if (this.anInt7328 < 0) {
			this.anInt7328 = 0;
		} else if (this.anInt7328 > 255) {
			this.anInt7328 = 255;
		}
		if (this.anInt7325 < 0) {
			this.anInt7325 = 0;
		} else if (this.anInt7325 > 255) {
			this.anInt7325 = 255;
		}
		if (local75 > 0.5D) {
			this.anInt7326 = (int) ((1.0D - local75) * local69 * 512.0D);
		} else {
			this.anInt7326 = (int) (local69 * local75 * 512.0D);
		}
		if (this.anInt7326 < 1) {
			this.anInt7326 = 1;
		}
		this.anInt7335 = (int) ((double) this.anInt7326 * local67);
	}
}
