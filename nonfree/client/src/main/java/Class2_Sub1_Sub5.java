import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
	public int anInt1248;

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
	public int anInt1250;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "I")
	public int anInt1251;

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "I")
	public int anInt1253;

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "I")
	public int anInt1254;

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "I")
	public int anInt1255;

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "Z")
	public boolean aBoolean71 = true;

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
	public int anInt1256 = -1;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
	public int anInt1249 = 0;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
	public int anInt1241 = -1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLclient!pd;I)V")
	private void method837(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub6 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt1249 = arg1.method639();
		} else if (arg0 == 2) {
			this.anInt1256 = arg1.method665();
		} else if (arg0 == 5) {
			this.aBoolean71 = false;
		} else if (arg0 == 7) {
			this.anInt1241 = arg1.method639();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!pd;II)V")
	public void method839(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method665();
			if (local14 == 0) {
				return;
			}
			this.method837(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	private void method841(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = 0.0D;
		@Pc(34) double local34 = local14;
		@Pc(36) double local36 = local14;
		if (local23 > local14) {
			local36 = local23;
		}
		if (local36 < local30) {
			local36 = local30;
		}
		if (local23 < local14) {
			local34 = local23;
		}
		@Pc(56) double local56 = 0.0D;
		if (local34 > local30) {
			local34 = local30;
		}
		@Pc(68) double local68 = (local36 + local34) / 2.0D;
		this.anInt1251 = (int) (local68 * 256.0D);
		if (local36 != local34) {
			if (local36 == local14) {
				local32 = (local23 - local30) / (local36 - local34);
			} else if (local23 == local36) {
				local32 = (local30 - local14) / (-local34 + local36) + 2.0D;
			} else if (local36 == local30) {
				local32 = (local14 - local23) / (local36 - local34) + 4.0D;
			}
			if (local68 < 0.5D) {
				local56 = (local36 - local34) / (local36 + local34);
			}
			if (local68 >= 0.5D) {
				local56 = (local36 - local34) / ((2.0D - local36) - local34);
			}
		}
		this.anInt1254 = (int) (local56 * 256.0D);
		local32 /= 6.0D;
		if (this.anInt1251 < 0) {
			this.anInt1251 = 0;
		} else if (this.anInt1251 > 255) {
			this.anInt1251 = 255;
		}
		this.anInt1255 = (int) (local32 * 256.0D);
		if (this.anInt1254 < 0) {
			this.anInt1254 = 0;
		} else if (this.anInt1254 > 255) {
			this.anInt1254 = 255;
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V")
	public void method842() {
		if (this.anInt1241 != -1) {
			this.method841(this.anInt1241);
			this.anInt1250 = this.anInt1254;
			this.anInt1248 = this.anInt1251;
			this.anInt1253 = this.anInt1255;
		}
		this.method841(this.anInt1249);
	}
}
