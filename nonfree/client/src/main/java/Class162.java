import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class162 {

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
	public int anInt4613;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
	public int anInt4617;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
	public int anInt4619;

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
	public int anInt4620;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "Z")
	public boolean aBoolean311 = true;

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
	public int anInt4615 = 512;

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	private int anInt4610 = 0;

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
	public int anInt4621 = -1;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "Z")
	public boolean aBoolean312 = true;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLclient!sl;)V")
	public void method4087(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4225();
			if (local17 == 0) {
				return;
			}
			this.method4090(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BILclient!sl;)V")
	private void method4090(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt4610 = arg1.method4204();
			this.method4094(this.anInt4610);
		} else if (arg0 == 2) {
			this.anInt4621 = arg1.method4221();
			if (this.anInt4621 == 65535) {
				this.anInt4621 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4615 = arg1.method4221() << 2;
		} else if (arg0 == 4) {
			this.aBoolean312 = false;
		} else if (arg0 == 5) {
			this.aBoolean311 = false;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BI)V")
	private void method4094(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local74 < 0.5D) {
				local68 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local66 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local66 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local66 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local66 /= 6.0D;
		this.anInt4619 = (int) (local68 * 256.0D);
		this.anInt4617 = (int) (local74 * 256.0D);
		if (local74 > 0.5D) {
			this.anInt4613 = (int) (local68 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt4613 = (int) (local74 * 512.0D * local68);
		}
		if (this.anInt4619 < 0) {
			this.anInt4619 = 0;
		} else if (this.anInt4619 > 255) {
			this.anInt4619 = 255;
		}
		if (this.anInt4617 < 0) {
			this.anInt4617 = 0;
		} else if (this.anInt4617 > 255) {
			this.anInt4617 = 255;
		}
		if (this.anInt4613 < 1) {
			this.anInt4613 = 1;
		}
		this.anInt4620 = (int) ((double) this.anInt4613 * local66);
	}
}
