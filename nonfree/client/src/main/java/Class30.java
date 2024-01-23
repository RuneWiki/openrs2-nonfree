import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class30 {

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
	public int anInt920;

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
	public int anInt924;

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
	public int anInt926;

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
	public int anInt927;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	public int anInt918 = -1;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	private int anInt923 = 0;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Z")
	public boolean aBoolean66 = true;

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public int anInt925 = 128;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!qm;I)V")
	public void method772(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2199();
			if (local9 == 0) {
				return;
			}
			this.method776(arg0, arg1, local9);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	private void method774(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(40) double local40 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(42) double local42 = local14;
		@Pc(44) double local44 = 0.0D;
		@Pc(46) double local46 = local14;
		@Pc(48) double local48 = 0.0D;
		if (local14 < local23) {
			local42 = local23;
		}
		if (local42 < local40) {
			local42 = local40;
		}
		if (local23 < local14) {
			local46 = local23;
		}
		if (local40 < local46) {
			local46 = local40;
		}
		@Pc(80) double local80 = (local42 + local46) / 2.0D;
		if (local42 != local46) {
			if (local80 < 0.5D) {
				local44 = (local42 - local46) / (local46 + local42);
			}
			if (local80 >= 0.5D) {
				local44 = (local42 - local46) / (2.0D - local46 - local42);
			}
			if (local14 == local42) {
				local48 = (local23 - local40) / (local42 - local46);
			} else if (local42 == local23) {
				local48 = (local40 - local14) / (local42 - local46) + 2.0D;
			} else if (local42 == local40) {
				local48 = (local14 - local23) / (-local46 + local42) + 4.0D;
			}
		}
		this.anInt924 = (int) (local80 * 256.0D);
		local48 /= 6.0D;
		this.anInt927 = (int) (local44 * 256.0D);
		if (local80 > 0.5D) {
			this.anInt920 = (int) (local44 * (1.0D - local80) * 512.0D);
		} else {
			this.anInt920 = (int) (local80 * local44 * 512.0D);
		}
		if (this.anInt927 < 0) {
			this.anInt927 = 0;
		} else if (this.anInt927 > 255) {
			this.anInt927 = 255;
		}
		if (this.anInt924 < 0) {
			this.anInt924 = 0;
		} else if (this.anInt924 > 255) {
			this.anInt924 = 255;
		}
		if (this.anInt920 < 1) {
			this.anInt920 = 1;
		}
		this.anInt926 = (int) (local48 * (double) this.anInt920);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BILclient!qm;I)V")
	private void method776(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt923 = arg1.method2215();
			this.method774(this.anInt923);
		} else if (arg2 == 2) {
			this.anInt918 = arg1.method2244();
			if (this.anInt918 == 65535) {
				this.anInt918 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt925 = arg1.method2244();
		} else if (arg2 == 4) {
			this.aBoolean66 = false;
		}
	}
}
