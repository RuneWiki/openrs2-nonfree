import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
	public int anInt452;

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
	public int anInt454;

	@OriginalMember(owner = "client!d", name = "qb", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!d", name = "xb", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!d", name = "Bb", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!d", name = "Gb", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
	public int anInt453 = -1;

	@OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
	public int anInt456 = 0;

	@OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
	public int anInt455 = -1;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Z")
	public boolean aBoolean29 = true;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLclient!rc;I)V")
	public void method250(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method716();
			if (local11 == 0) {
				return;
			}
			this.method255(local11, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)V")
	public void method252() {
		if (this.anInt453 != -1) {
			this.method256(this.anInt453);
			this.anInt466 = this.anInt464;
			this.anInt457 = this.anInt454;
			this.anInt452 = this.anInt462;
		}
		this.method256(this.anInt456);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIILclient!rc;)V")
	private void method255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub5 arg2) {
		if (arg0 == 1) {
			this.anInt456 = arg2.method688();
		} else if (arg0 == 2) {
			this.anInt455 = arg2.method716();
		} else if (arg0 == 5) {
			this.aBoolean29 = false;
		} else if (arg0 == 7) {
			this.anInt453 = arg2.method688();
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(BI)V")
	private void method256(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(33) double local33 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = local12;
		if (local12 > local33) {
			local35 = local33;
		}
		if (local24 < local35) {
			local35 = local24;
		}
		@Pc(49) double local49 = local12;
		@Pc(51) double local51 = 0.0D;
		@Pc(53) double local53 = 0.0D;
		if (local33 > local12) {
			local49 = local33;
		}
		if (local49 < local24) {
			local49 = local24;
		}
		@Pc(71) double local71 = (local35 + local49) / 2.0D;
		this.anInt464 = (int) (local71 * 256.0D);
		if (this.anInt464 < 0) {
			this.anInt464 = 0;
		} else if (this.anInt464 > 255) {
			this.anInt464 = 255;
		}
		if (local35 != local49) {
			if (local71 < 0.5D) {
				local51 = (local49 - local35) / (local35 + local49);
			}
			if (local71 >= 0.5D) {
				local51 = (local49 - local35) / (2.0D - local49 - local35);
			}
			if (local12 == local49) {
				local53 = (local33 - local24) / (local49 - local35);
			} else if (local33 == local49) {
				local53 = (local24 - local12) / (local49 - local35) + 2.0D;
			} else if (local49 == local24) {
				local53 = (local12 - local33) / (-local35 + local49) + 4.0D;
			}
		}
		this.anInt454 = (int) (local51 * 256.0D);
		local53 /= 6.0D;
		if (this.anInt454 < 0) {
			this.anInt454 = 0;
		} else if (this.anInt454 > 255) {
			this.anInt454 = 255;
		}
		this.anInt462 = (int) (local53 * 256.0D);
	}
}
