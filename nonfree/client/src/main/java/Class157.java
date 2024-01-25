import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class157 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	public int anInt4100;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	public int anInt4104;

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	public int anInt4105;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
	public int anInt4111;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Z")
	public boolean aBoolean289 = true;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "Z")
	public boolean aBoolean290 = true;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	public int anInt4109 = -1;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	public int anInt4103 = 512;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
	private int anInt4108 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BILclient!ac;)V")
	private void method3325(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt4108 = arg1.method7919();
			this.method3327(this.anInt4108);
		} else if (arg0 == 2) {
			this.anInt4109 = arg1.method7945();
			if (this.anInt4109 == 65535) {
				this.anInt4109 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4103 = arg1.method7945() << 2;
		} else if (arg0 == 4) {
			this.aBoolean289 = false;
		} else if (arg0 == 5) {
			this.aBoolean290 = false;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	private void method3327(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		this.anInt4100 = (int) (local62 * 256.0D);
		this.anInt4104 = (int) (local68 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt4105 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt4105 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt4100 < 0) {
			this.anInt4100 = 0;
		} else if (this.anInt4100 > 255) {
			this.anInt4100 = 255;
		}
		if (this.anInt4104 < 0) {
			this.anInt4104 = 0;
		} else if (this.anInt4104 > 255) {
			this.anInt4104 = 255;
		}
		if (this.anInt4105 < 1) {
			this.anInt4105 = 1;
		}
		this.anInt4111 = (int) ((double) this.anInt4105 * local60);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!ac;)V")
	public void method3328(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7974();
			if (local5 == 0) {
				return;
			}
			this.method3325(local5, arg0);
		}
	}
}
