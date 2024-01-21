import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
	public int anInt449;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
	public int anInt454;

	@OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
	public int anInt455 = 0;

	@OriginalMember(owner = "client!cb", name = "qb", descriptor = "Z")
	public boolean aBoolean34 = true;

	@OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
	public int anInt453 = -1;

	@OriginalMember(owner = "client!cb", name = "ob", descriptor = "I")
	public int anInt456 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLclient!fe;I)V")
	public void method281(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method1410();
			if (local13 == 0) {
				return;
			}
			this.method285(local13, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	private void method283(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local10;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(34) double local34 = 0.0D;
		@Pc(36) double local36 = local10;
		if (local23 > local10) {
			local36 = local23;
		}
		if (local23 < local10) {
			local25 = local23;
		}
		if (local25 > local32) {
			local25 = local32;
		}
		if (local36 < local32) {
			local36 = local32;
		}
		@Pc(66) double local66 = (local25 + local36) / 2.0D;
		@Pc(68) double local68 = 0.0D;
		this.anInt457 = (int) (local66 * 256.0D);
		if (this.anInt457 < 0) {
			this.anInt457 = 0;
		} else if (this.anInt457 > 255) {
			this.anInt457 = 255;
		}
		if (local36 != local25) {
			if (local36 == local10) {
				local34 = (local23 - local32) / (-local25 + local36);
			} else if (local36 == local23) {
				local34 = (local32 - local10) / (-local25 + local36) + 2.0D;
			} else if (local32 == local36) {
				local34 = (local10 - local23) / (-local25 + local36) + 4.0D;
			}
			if (local66 < 0.5D) {
				local68 = (local36 - local25) / (local36 + local25);
			}
			if (local66 >= 0.5D) {
				local68 = (local36 - local25) / (2.0D - local25 - local36);
			}
		}
		this.anInt449 = (int) (local68 * 256.0D);
		if (this.anInt449 < 0) {
			this.anInt449 = 0;
		} else if (this.anInt449 > 255) {
			this.anInt449 = 255;
		}
		local34 /= 6.0D;
		this.anInt442 = (int) (local34 * 256.0D);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILclient!fe;)V")
	private void method285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub8 arg2) {
		if (arg0 == 1) {
			this.anInt455 = arg2.method1388();
		} else if (arg0 == 2) {
			this.anInt456 = arg2.method1410();
		} else if (arg0 == 5) {
			this.aBoolean34 = false;
		} else if (arg0 == 7) {
			this.anInt453 = arg2.method1388();
		}
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V")
	public void method286() {
		if (this.anInt453 != -1) {
			this.method283(this.anInt453);
			this.anInt444 = this.anInt457;
			this.anInt451 = this.anInt449;
			this.anInt454 = this.anInt442;
		}
		this.method283(this.anInt455);
	}
}
