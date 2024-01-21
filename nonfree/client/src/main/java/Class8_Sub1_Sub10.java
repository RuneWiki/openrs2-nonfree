import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class8_Sub1_Sub10 extends Class8_Sub1 {

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
	public int anInt1057;

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
	public int anInt1062;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
	public int anInt1063;

	@OriginalMember(owner = "client!gd", name = "sb", descriptor = "I")
	public int anInt1074;

	@OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
	public int anInt1075;

	@OriginalMember(owner = "client!gd", name = "vb", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
	public int anInt1067 = -1;

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
	public int anInt1068 = -1;

	@OriginalMember(owner = "client!gd", name = "lb", descriptor = "Z")
	public boolean aBoolean48 = true;

	@OriginalMember(owner = "client!gd", name = "nb", descriptor = "I")
	public int anInt1070 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	private void method666(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local8;
		@Pc(25) double local25 = local8;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		if (local8 > local21) {
			local25 = local21;
		}
		if (local21 > local8) {
			local23 = local21;
		}
		@Pc(46) double local46 = 0.0D;
		if (local25 > local32) {
			local25 = local32;
		}
		if (local23 < local32) {
			local23 = local32;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local23 + local25) / 2.0D;
		if (local23 != local25) {
			if (local8 == local23) {
				local60 = (local21 - local32) / (-local25 + local23);
			} else if (local23 == local21) {
				local60 = (local32 - local8) / (local23 - local25) + 2.0D;
			} else if (local23 == local32) {
				local60 = (local8 - local21) / (-local25 + local23) + 4.0D;
			}
			if (local66 < 0.5D) {
				local46 = (local23 - local25) / (local23 + local25);
			}
			if (local66 >= 0.5D) {
				local46 = (local23 - local25) / (2.0D - local23 - local25);
			}
		}
		this.anInt1077 = (int) (local46 * 256.0D);
		local60 /= 6.0D;
		this.anInt1074 = (int) (local66 * 256.0D);
		if (this.anInt1074 < 0) {
			this.anInt1074 = 0;
		} else if (this.anInt1074 > 255) {
			this.anInt1074 = 255;
		}
		this.anInt1063 = (int) (local60 * 256.0D);
		if (this.anInt1077 < 0) {
			this.anInt1077 = 0;
		} else if (this.anInt1077 > 255) {
			this.anInt1077 = 255;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!wd;II)V")
	public void method673(@OriginalArg(0) Class8_Sub20 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(12) int local12 = arg0.method1872();
			if (local12 == 0) {
				return;
			}
			this.method676(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
	public void method675() {
		if (this.anInt1067 != -1) {
			this.method666(this.anInt1067);
			this.anInt1057 = this.anInt1063;
			this.anInt1062 = this.anInt1077;
			this.anInt1075 = this.anInt1074;
		}
		this.method666(this.anInt1070);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!wd;II)V")
	private void method676(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub20 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt1070 = arg1.method1885();
		} else if (arg0 == 2) {
			this.anInt1068 = arg1.method1872();
		} else if (arg0 == 3) {
			this.anInt1068 = arg1.method1839();
			if (this.anInt1068 == 65535) {
				this.anInt1068 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean48 = false;
		} else if (arg0 == 7) {
			this.anInt1067 = arg1.method1885();
		}
	}
}
