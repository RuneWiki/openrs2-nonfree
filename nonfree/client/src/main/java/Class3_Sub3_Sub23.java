import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class3_Sub3_Sub23 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
	public int anInt3905;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
	public int anInt3906;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
	public int anInt3913;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
	public int anInt3917;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
	private int anInt3910 = 0;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
	private int anInt3918 = -1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!ce;II)V")
	public void method3015(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1278();
			if (local9 == 0) {
				return;
			}
			this.method3017(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)V")
	private void method3016(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local19;
		if (local10 < local19) {
			local32 = local10;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local19;
		if (local19 < local10) {
			local46 = local10;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local32 + local46) / 2.0D;
		@Pc(69) double local69 = (double) 0;
		if (local32 != local46) {
			if (local46 == local19) {
				local60 = (local10 - local30) / (local46 - local32);
			} else if (local46 == local10) {
				local60 = (local30 - local19) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local19 - local10) / (-local32 + local46) + 4.0D;
			}
			if (local66 < 0.5D) {
				local69 = (local46 - local32) / (local46 + local32);
			}
			if (local66 >= 0.5D) {
				local69 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt3917 = (int) (local69 * 256.0D);
		if (local66 > 0.5D) {
			this.anInt3913 = (int) (local69 * (1.0D - local66) * 512.0D);
		} else {
			this.anInt3913 = (int) (local66 * 512.0D * local69);
		}
		this.anInt3906 = (int) (local66 * 256.0D);
		if (this.anInt3917 < 0) {
			this.anInt3917 = 0;
		} else if (this.anInt3917 > 255) {
			this.anInt3917 = 255;
		}
		if (this.anInt3913 < 1) {
			this.anInt3913 = 1;
		}
		if (this.anInt3906 < 0) {
			this.anInt3906 = 0;
		} else if (this.anInt3906 > 255) {
			this.anInt3906 = 255;
		}
		local60 /= 6.0D;
		this.anInt3905 = (int) ((double) this.anInt3913 * local60);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ce;II)V")
	private void method3017(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt3910 = arg0.method1271();
			this.method3016(this.anInt3910);
		} else if (arg1 == 2) {
			this.anInt3918 = arg0.method1270();
			if (this.anInt3918 == 65535) {
				this.anInt3918 = -1;
				return;
			}
			return;
		} else if (arg1 == 3) {
			arg0.method1270();
			return;
		}
	}
}
