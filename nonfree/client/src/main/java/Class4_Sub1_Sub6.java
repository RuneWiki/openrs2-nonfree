import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	public int anInt1326;

	@OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
	public int anInt1331;

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
	public int anInt1337;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
	public int anInt1339;

	@OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
	public int anInt1340;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
	public int anInt1327 = 0;

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
	public int anInt1324 = -1;

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
	public int anInt1343 = -1;

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "Z")
	public boolean aBoolean127 = true;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!jd;III)V")
	private void method917(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt1327 = arg0.method704();
		} else if (arg1 == 2) {
			this.anInt1343 = arg0.method719();
		} else if (arg1 == 5) {
			this.aBoolean127 = false;
		} else if (arg1 == 7) {
			this.anInt1324 = arg0.method704();
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
	public void method918() {
		if (this.anInt1324 != -1) {
			this.method922(this.anInt1324);
			this.anInt1331 = this.anInt1337;
			this.anInt1342 = this.anInt1339;
			this.anInt1326 = this.anInt1340;
		}
		this.method922(this.anInt1327);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!jd;I)V")
	public void method919(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method719();
			if (local5 == 0) {
				return;
			}
			this.method917(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V")
	private void method922(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(23) double local23 = 0.0D;
		@Pc(32) double local32 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(34) double local34 = local32;
		@Pc(36) double local36 = local32;
		if (local14 > local32) {
			local36 = local14;
		}
		if (local36 < local21) {
			local36 = local21;
		}
		@Pc(50) double local50 = 0.0D;
		if (local14 < local32) {
			local34 = local14;
		}
		if (local34 > local21) {
			local34 = local21;
		}
		@Pc(68) double local68 = (local34 + local36) / 2.0D;
		if (local36 != local34) {
			if (local68 < 0.5D) {
				local50 = (local36 - local34) / (local36 + local34);
			}
			if (local68 >= 0.5D) {
				local50 = (local36 - local34) / (2.0D - local36 - local34);
			}
			if (local32 == local36) {
				local23 = (local14 - local21) / (local36 - local34);
			} else if (local36 == local14) {
				local23 = (local21 - local32) / (local36 - local34) + 2.0D;
			} else if (local36 == local21) {
				local23 = (local32 - local14) / (-local34 + local36) + 4.0D;
			}
		}
		local23 /= 6.0D;
		this.anInt1339 = (int) (local23 * 256.0D);
		this.anInt1340 = (int) (local50 * 256.0D);
		this.anInt1337 = (int) (local68 * 256.0D);
		if (this.anInt1340 < 0) {
			this.anInt1340 = 0;
		} else if (this.anInt1340 > 255) {
			this.anInt1340 = 255;
		}
		if (this.anInt1337 < 0) {
			this.anInt1337 = 0;
		} else if (this.anInt1337 > 255) {
			this.anInt1337 = 255;
		}
	}
}
